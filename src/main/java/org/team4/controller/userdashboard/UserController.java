package org.team4.controller.userdashboard;

import org.team4.view.user.UserDashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserController implements ActionListener {

    private UserDashboard userDashboard;

    public UserController(UserDashboard u){
        this.userDashboard = u;
        addListeners();
    }

    private void addListeners(){
        userDashboard.getPurchaseButton().addActionListener(this);
        userDashboard.getRentItemButton().addActionListener(this);
        userDashboard.getSubscribeButton().addActionListener(this);

        userDashboard.getSearchTextField().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userDashboard.performSearch(userDashboard.getSearchTextField().getText());
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == userDashboard.getRentItemButton()) {
           userDashboard.changeToRentPanel();
        } else if (e.getSource() == userDashboard.getSubscribeButton()) {
            userDashboard.changeToSubscribePanel();
        } else if (e.getSource() == userDashboard.getPurchaseButton()) {
            userDashboard.changeToPurchasePanel();
        }
    }
}
