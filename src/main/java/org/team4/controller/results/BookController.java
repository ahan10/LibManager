package org.team4.controller.results;

import org.team4.funtionality.rent.RentalService;
import org.team4.maintaindb.MaintainDatabase;
import org.team4.model.items.Item;
import org.team4.model.user.User;
import org.team4.view.purchase.Payment;
import org.team4.view.user.search.info.BookItemPanel;
import org.team4.view.user.search.results.BookResultsPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookController implements ActionListener {
    private BookItemPanel bookItem;
    private final RentalService rent;
    private User user;

    public BookController(BookItemPanel bookItem, User user) {
        this.bookItem = bookItem;
        this.user = user;
        rent = new RentalService();
        addListeners();
    }

    private void addListeners(){
        this.bookItem.getBtnBuy().addActionListener(this);
        this.bookItem.getBtnRent().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.bookItem.getBtnRent()){
            rentSelectedItem();
        }else if (e.getSource() == this.bookItem.getBtnBuy()){
            purchaseOption();
        }
    }

    private void rentSelectedItem() {
        Item itemToRent = null;
        String itemTitle = "";

        int selectedRow = BookResultsPanel.getTable().getSelectedRow();
        if (selectedRow >= 0) {
            String isbn = BookResultsPanel.getTable().getValueAt(selectedRow, 5).toString();
            itemToRent = MaintainDatabase.getInstance().getBookDatabase().searchExactBookByISBN(isbn);
            itemTitle = "book";
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
        double bookPrice = bookItem.getBook().getPrice() - (0.2 * bookItem.getBook().getPrice());
        String message = "After discount the book costs $" + bookPrice + "\n" + "Do you want to continue your purchase?";

        int dialogResult = JOptionPane.showConfirmDialog(null, message, "Confirm Purchase", JOptionPane.YES_NO_OPTION);

        if(dialogResult == JOptionPane.YES_OPTION){
            Payment payment = new Payment(bookItem.getBook(), user);
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
