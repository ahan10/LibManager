package org.team4.controller.results;

import org.team4.funtionality.rent.RentalService;
import org.team4.maintaindb.MaintainDatabase;
import org.team4.model.items.Item;
import org.team4.model.user.User;
import org.team4.view.purchase.Payment;
import org.team4.view.user.search.info.BookItemPanel;

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
        Item itemToRent = MaintainDatabase.getInstance().getBookDatabase().searchExactBookByISBN(this.bookItem.getBook().getISBN());

        try {
            if (rent.canRentItem(user, itemToRent)) {
                if (rent.rentItem(user, itemToRent)) {
                    JOptionPane.showMessageDialog(null, itemToRent.getTitle() + " rented successfully!");
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to rent book. Please try again.");
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    private void purchaseOption(){

        int dialogResult = JOptionPane.showConfirmDialog(null, this.getMessage(), "Confirm Purchase", JOptionPane.YES_NO_OPTION);

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

    private String getMessage() {
        double price;
        String message = "";
        if(bookItem.getBook().getPrice() > 60 && !this.bookItem.getBook().isRentable()){
            price = bookItem.getBook().getPrice() - (0.2 * bookItem.getBook().getPrice());
            message = "After discount the book costs $" + price + "\n" + "Do you want to continue your purchase?";
        }else {
            price = bookItem.getBook().getPrice();
            message = "This book costs $" + price + "\n" + "Do you want to continue your purchase?";
        }
        return message;
    }

}
