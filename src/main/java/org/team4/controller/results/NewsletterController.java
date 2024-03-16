package org.team4.controller.results;

import org.team4.maintaindb.MaintainDatabase;
import org.team4.maintaindb.MaintainSubscriptions;
import org.team4.model.user.User;
import org.team4.view.browser.BrowserWindow;
import org.team4.view.purchase.Payment;
import org.team4.view.user.search.info.NewsletterItemPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewsletterController implements ActionListener {
    private NewsletterItemPanel newsletterItemPanel;
    private User user;
    private MaintainSubscriptions maintainSubscriptions = MaintainDatabase.getInstance().getSubscriptionDatabase();

    public NewsletterController(NewsletterItemPanel newsletterItemPanel, User user){
        this.newsletterItemPanel = newsletterItemPanel;
        this.user = user;

        addListeners();
    }

    private void addListeners(){
        this.newsletterItemPanel.getReadButton().addActionListener(this);
        this.newsletterItemPanel.getSubscribeButton().addActionListener(this);
        this.newsletterItemPanel.getUnsubscribeButton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.newsletterItemPanel.getReadButton()){
            new BrowserWindow(this.newsletterItemPanel.getNewsletter().getLink()).setVisible(true);
        }else if (e.getSource() == this.newsletterItemPanel.getSubscribeButton()){
            subscribe();
            this.newsletterItemPanel.loadSubscriptions();
            this.newsletterItemPanel.updateButtons();
        }else if (e.getSource() == this.newsletterItemPanel.getUnsubscribeButton()){
            unsubscribe();
            this.newsletterItemPanel.loadSubscriptions();
            this.newsletterItemPanel.updateButtons();
        }
    }

    private void subscribe(){
        String message = "Do you want subscribe to " + this.newsletterItemPanel.getNewsletter().getTitle() + "? \n" +
                "Its monthly subscription is $" + this.newsletterItemPanel.getNewsletter().getPrice();

        int dialogResult = JOptionPane.showConfirmDialog(null, message, "Confirm Purchase", JOptionPane.YES_NO_OPTION);

        if(dialogResult == JOptionPane.YES_OPTION){
            Payment payment = new Payment(this.newsletterItemPanel.getNewsletter(), this.user);
            if(!payment.isSuccess()){
                JOptionPane.showMessageDialog(null, "Payment Failed/ Cancelled");
            }else {
                JOptionPane.showMessageDialog(null, "Payment Successful");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Purchase Cancelled!");
        }
    }

    private void unsubscribe(){
        String message = "Do you want unsubscribe from " + this.newsletterItemPanel.getNewsletter().getTitle() + "?";

        int dialogResult = JOptionPane.showConfirmDialog(null, message, "Confirm Purchase", JOptionPane.YES_NO_OPTION);

        if(dialogResult == JOptionPane.YES_OPTION){
            maintainSubscriptions.removeNewsletter(maintainSubscriptions.getSubscribedNewsletterIfExists(user.getEmail(), this.newsletterItemPanel.getNewsletter().getTitle()));
            JOptionPane.showMessageDialog(null, "Unsubscribed!");
        }else{
            JOptionPane.showMessageDialog(null, "Operation Cancelled!");
        }
    }

}
