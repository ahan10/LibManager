package org.team4.view.purchase;

import org.team4.controller.purchase.PurchaseController;
import org.team4.model.items.Item;
import org.team4.model.items.Newsletter;
import org.team4.model.user.User;

import javax.swing.*;
import java.awt.*;

public class Payment {

    boolean success;
    private PurchaseFrame purchaseFrame;
    public Payment(double penalty, User user){
        purchaseFrame = new PurchaseFrame(penalty, user);
        init();
    }

    public Payment(Item item, User user){
        purchaseFrame = new PurchaseFrame(item, user);
        init();
    }

    public Payment(Newsletter newsletter, User user){
        purchaseFrame = new PurchaseFrame(newsletter, user);
        init();
    }

   private void init(){
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

       dialog.setLocationRelativeTo(null);
       dialog.setVisible(true);

       success = purchaseController.isSuccess();
    }

    public boolean isSuccess() {
        return success;
    }
}
