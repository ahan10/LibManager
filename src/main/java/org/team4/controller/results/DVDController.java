package org.team4.controller.results;

import org.team4.funtionality.rent.RentalService;
import org.team4.maintaindb.MaintainDatabase;
import org.team4.model.items.Item;
import org.team4.model.user.User;
import org.team4.view.purchase.Payment;
import org.team4.view.user.search.info.DVDItemPanel;
import org.team4.view.user.search.results.DVDResultsPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DVDController implements ActionListener {
    private DVDItemPanel dvdItemPanel;
    private final RentalService rent;
    private User user;

    public DVDController(DVDItemPanel dvdItemPanel, User user) {
        this.dvdItemPanel = dvdItemPanel;
        this.user = user;
        rent = new RentalService();
        addListeners();
    }

    private void addListeners(){
        this.dvdItemPanel.getBtnBuy().addActionListener(this);
        this.dvdItemPanel.getBtnRent().addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.dvdItemPanel.getBtnRent()){
            rentSelectedItem();
        }else if (e.getSource() == this.dvdItemPanel.getBtnBuy()){
            purchaseOption();
        }
    }

    private void rentSelectedItem() {
        Item itemToRent = null;
        String itemTitle = "";

        int selectedRow = DVDResultsPanel.getTable().getSelectedRow();
        if (selectedRow >= 0) {
            String isbn = DVDResultsPanel.getTable().getValueAt(selectedRow, 4).toString();
            itemToRent = MaintainDatabase.getInstance().getDVDDatabase().searchExactDVDByISBN(isbn);
            itemTitle = "DVD";
        }


        // to rent the selected item by the user
        if (itemToRent != null) {
            try {
                if (rent.canRentItem(user, itemToRent)) {
                    if (rent.rentItem(user, itemToRent)) {
                        JOptionPane.showMessageDialog(null, itemToRent.getTitle() + " rented successfully!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Failed to rent " + itemTitle + ". Please try again.");
                    }
                }
            } catch (Exception ex) {

                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a " + itemTitle + " to rent.");
        }
    }

    private void purchaseOption(){
        double dvdPrice = dvdItemPanel.getDvd().getPrice() - (0.2 * dvdItemPanel.getDvd().getPrice());
        String message = "After discount the dvd costs $" + dvdPrice + "\n" + "Do you want to continue your purchase?";

        int dialogResult = JOptionPane.showConfirmDialog(null, message, "Confirm Purchase", JOptionPane.YES_NO_OPTION);

        if(dialogResult == JOptionPane.YES_OPTION){
            Payment payment = new Payment(dvdItemPanel.getDvd(), user);
            if(!payment.isSuccess()){
                JOptionPane.showMessageDialog(null, "Payment Failed/ Cancelled");
            }else {
                JOptionPane.showMessageDialog(null, "Payment Successful");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Purchase Cancelled!");
        }
    }

}
