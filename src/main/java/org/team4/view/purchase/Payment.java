package org.team4.view.purchase;

import org.team4.controller.purchase.PurchaseController;
import org.team4.model.user.User;

import javax.swing.*;
import java.awt.*;

public class Payment {
    private double penalty;
    private User user;
    boolean success;
    public Payment(double penalty, User user){
         this.penalty = penalty;
         this.user = user;
         init();
    }

   private void init(){
       PurchaseFrame purchaseFrame= new PurchaseFrame(penalty, user);
       PurchaseController purchaseController = new PurchaseController(purchaseFrame);

       JDialog dialog = new JDialog();
       dialog.setTitle("Payment Gateway");
       dialog.setModal(true);

       JPanel dialogContentPanel = new JPanel();
       dialogContentPanel.setLayout(new BorderLayout());
       dialogContentPanel.add(purchaseFrame, BorderLayout.CENTER);

       dialog.setSize(360, 610);
       dialog.setContentPane(dialogContentPanel);
       dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

       dialog.setVisible(true);

       success = purchaseController.isSuccess();
    }

    public boolean isSuccess() {
        return success;
    }
}
