package org.team4.controller.purchase;

import org.team4.view.purchase.PurchaseFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PurchaseController implements ActionListener {

    private PurchaseFrame purchaseFrame;

    public PurchaseController(PurchaseFrame purchaseFrame) {
        this.purchaseFrame = purchaseFrame;
        addListeners();
    }

    private void addListeners(){
        this.purchaseFrame.getSelectButton().addActionListener(this);
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
        }
    }
}
