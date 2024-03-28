package org.team4.controller.results;

import org.team4.funtionality.rent.RentalService;
import org.team4.maintaindb.MaintainDatabase;
import org.team4.model.items.Item;
import org.team4.model.user.User;
import org.team4.view.purchase.Payment;
import org.team4.view.user.search.info.DVDItemPanel;

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
        Item itemToRent = MaintainDatabase.getInstance().getDVDDatabase().searchExactDVDByISBN(this.dvdItemPanel.getDvd().getISBN());

        // to rent the selected item by the user
        try {
            if (rent.canRentItem(user, itemToRent)) {
                if (rent.rentItem(user, itemToRent)) {
                    JOptionPane.showMessageDialog(null, itemToRent.getTitle() + " rented successfully!");
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to rent DVD. Please try again.");
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    private void purchaseOption(){
        int dialogResult = JOptionPane.showConfirmDialog(null, this.getMessage(), "Confirm Purchase", JOptionPane.YES_NO_OPTION);

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

    private String getMessage() {
        double price;
        String message = "";
        if(dvdItemPanel.getDvd().getPrice() > 8.5 && !dvdItemPanel.getDvd().isRentable()){
            price = dvdItemPanel.getDvd().getPrice() - (0.2 * dvdItemPanel.getDvd().getPrice());
            message = "After discount the DVD costs $" + price + "\n" + "Do you want to continue your purchase?";
        }else {
            price = dvdItemPanel.getDvd().getPrice();
            message = "This DVD costs $" + price + "\n" + "Do you want to continue your purchase?";
        }
        return message;
    }

}
