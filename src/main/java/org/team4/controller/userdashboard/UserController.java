package org.team4.controller.userdashboard;

import org.team4.model.user.User;
import org.team4.view.user.RequestPanel;
import org.team4.view.user.UserDashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UserController implements ActionListener {

    private UserDashboard userDashboard;
    private User user;

    public UserController(UserDashboard u){
        this.userDashboard = u;
        this.user = u.getUser();
        addListeners();
    }

    private void addListeners(){
        userDashboard.getPurchaseButton().addActionListener(this);
        userDashboard.getRentItemButton().addActionListener(this);
        userDashboard.getSubscribeButton().addActionListener(this);
        userDashboard.getRequestButton().addActionListener(this);

        userDashboard.getSearchTextField().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userDashboard.performSearch(userDashboard.getSearchTextField().getText());
            }
        });
        
        userDashboard.getRequestPanel().getSubmitButton().addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == userDashboard.getRentItemButton()) {
           userDashboard.changeToRentPanel();
        } else if (e.getSource() == userDashboard.getSubscribeButton()) {
            userDashboard.changeToSubscribePanel();
        } else if (e.getSource() == userDashboard.getPurchaseButton()) {
            userDashboard.changeToPurchasePanel();
        }else if (e.getSource() == userDashboard.getRequestButton()) {
            userDashboard.changeToRequestPanel();
        }else if (e.getSource() == userDashboard.getRequestPanel().getSubmitButton()) {
            manageRequest(userDashboard.getRequestPanel());
        }
    }
    
    private void manageRequest(RequestPanel panel) {
    	System.out.println("Request Submitted");
        System.out.println("Book Title: " + panel.getTextFieldTitle().getText());
        System.out.println("Book Author: " + panel.getTextFieldAuthor().getText());
        System.out.println("Book ISBN: " + panel.getTextFieldISBN().getText());
        System.out.println("Book Edition: " + panel.getTextFieldEdition().getText());
        System.out.println("Type of Book is: " + panel.getComboBoxBookType().getSelectedItem());
        
        JOptionPane.showMessageDialog(new JFrame(), "Please ensure compliance!",
                "Swing Tester", JOptionPane.ERROR_MESSAGE);
    }
}
