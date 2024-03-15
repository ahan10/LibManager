package org.team4.controller.purchase;

import org.team4.funtionality.buy.ItemPurchased;
import org.team4.funtionality.buy.ProcessPayment;
import org.team4.funtionality.buy.PurchaseComplete;
import org.team4.maintaindb.MaintainBooks;
import org.team4.maintaindb.MaintainDVD;
import org.team4.maintaindb.MaintainDatabase;
import org.team4.maintaindb.MaintainPurchase;
import org.team4.model.items.Book;
import org.team4.model.items.Item;
import org.team4.model.items.Newsletter;
import org.team4.view.purchase.PurchaseFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PurchaseController implements ActionListener {

    private PurchaseFrame purchaseFrame;
    private ProcessPayment processPayment;
    private PurchaseComplete purchaseComplete;
    private MaintainBooks maintainBooks = MaintainDatabase.getInstance().getBookDatabase();
    private MaintainDVD maintainDVD = MaintainDatabase.getInstance().getDVDDatabase();
    private MaintainPurchase maintainPurchase = MaintainDatabase.getInstance().getPurchaseDatabase();
    private boolean success;

    public PurchaseController(PurchaseFrame purchaseFrame) {
        this.purchaseFrame = purchaseFrame;
        this.success = false;

        addListeners();
    }

    private void addListeners(){
        this.purchaseFrame.getSelectButton().addActionListener(this);

        this.purchaseFrame.getCreditCardPanel().getProcessButton().addActionListener(this);
        this.purchaseFrame.getDebitCardPanel().getProcessButton().addActionListener(this);
        this.purchaseFrame.getMobileWalletPanel().getProcessButton().addActionListener(this);
        this.purchaseFrame.getPayPalPanel().getProcessButton().addActionListener(this);
    }

    private void process(){
        purchaseComplete = processPayment.getPurchaseCompleted();

        if(purchaseComplete == null){

            this.success = false;
            JOptionPane.showMessageDialog(null, "Payment Failed");

        } else if (purchaseComplete.getItem() != null) {

            this.success = true;

            if(purchaseComplete.getItem().getISBN().charAt(0) == '9'){

                maintainBooks.decreaseNumberOfCopies((Book) purchaseComplete.getItem());

            }else if(purchaseComplete.getItem().getISBN().charAt(0) == '8'){

                maintainDVD.decreaseNumberOfCopies(purchaseComplete.getItem());

            }
            maintainPurchase.add(new ItemPurchased(purchaseComplete.getItem().getTitle(),purchaseComplete.getUser().getEmail()));

            double price = purchaseComplete.getAmount() - (0.2 * purchaseComplete.getAmount());
            String message = "Purchase ID: " + purchaseComplete.getPurchaseID() + "\n"
                    + "Item Name: " + purchaseComplete.getItem().getTitle() + "\n"
                    + "Price: $" + price;
            JOptionPane.showMessageDialog(null, message, "View Purchase", JOptionPane.INFORMATION_MESSAGE);

        } else if (purchaseComplete.getNewsletter() != null) {
            this.success = true;
            String message = "Purchase ID: " + purchaseComplete.getPurchaseID() + "\n"
                    + "Newsletter Name: " + purchaseComplete.getNewsletter().getTitle() + "\n"
                    + "Price: $" + purchaseComplete.getAmount();
            JOptionPane.showMessageDialog(null, message, "Newsletter Subscribed", JOptionPane.INFORMATION_MESSAGE);
        }else {
            this.success = true;
            String message = "Purchase ID: " + purchaseComplete.getPurchaseID() + "\n"
                    + "Fine Paid"  + "\n"
                    + "Price: $" + purchaseComplete.getAmount();
            JOptionPane.showMessageDialog(null, message, "Fine Paid", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public boolean isSuccess() {
        return success;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.purchaseFrame.getSelectButton()){
            if(this.purchaseFrame.getMode().equals("Credit Card")){

                this.purchaseFrame.changeToCreditCard();

            }else if(this.purchaseFrame.getMode().equals("Debit Card")){

                this.purchaseFrame.changeToDebitCard();

            }else if(this.purchaseFrame.getMode().equals("PayPal")){

                this.purchaseFrame.changeToPayPal();

            }else if(this.purchaseFrame.getMode().equals("Mobile Wallet")){

                this.purchaseFrame.changeToMobileWallet();

            }
        }else if(e.getSource() == this.purchaseFrame.getCreditCardPanel().getProcessButton()){

            processPayment = new ProcessPayment(this.purchaseFrame.getCreditCardPanel().getCreditCard(), this.purchaseFrame.getItemToPurchase());
            process();

            SwingUtilities.getWindowAncestor(this.purchaseFrame).dispose();
        }else if(e.getSource() == this.purchaseFrame.getDebitCardPanel().getProcessButton()){

            processPayment = new ProcessPayment(this.purchaseFrame.getDebitCardPanel().getDebitCard(), this.purchaseFrame.getItemToPurchase());
            process();

            SwingUtilities.getWindowAncestor(this.purchaseFrame).dispose();
        }else if(e.getSource() == this.purchaseFrame.getPayPalPanel().getProcessButton()){

            processPayment = new ProcessPayment(this.purchaseFrame.getPayPalPanel().getPayPal(), this.purchaseFrame.getItemToPurchase());
            process();

            SwingUtilities.getWindowAncestor(this.purchaseFrame).dispose();
        }else if(e.getSource() == this.purchaseFrame.getMobileWalletPanel().getProcessButton()){

            processPayment = new ProcessPayment(this.purchaseFrame.getMobileWalletPanel().getMobileWallet(), this.purchaseFrame.getItemToPurchase());
            process();

            SwingUtilities.getWindowAncestor(this.purchaseFrame).dispose();
        }
    }
}
