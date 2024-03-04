package org.team4.controller.managerdashboard;

import org.team4.view.Login.LoginPage;
import org.team4.view.manager.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManagerController implements ActionListener {
    private ManagerDashboard managerDashboard;

    public ManagerController(ManagerDashboard managerDashboard) {
        this.managerDashboard = managerDashboard;
        addListeners();
    }

    private void addListeners() {
        managerDashboard.getLogOutButton().addActionListener(this);
        managerDashboard.getAddItemButton().addActionListener(this);
        managerDashboard.getManageItemButton().addActionListener(this);
        managerDashboard.getValidateUserButton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == managerDashboard.getValidateUserButton()) {
            managerDashboard.showValidateUserPanel();
        } else if (e.getSource() == managerDashboard.getAddItemButton()) {
            managerDashboard.showAddItemPanel();
        } else if (e.getSource() == managerDashboard.getManageItemButton()) {
            managerDashboard.showManageItemPanel();
        } else if (e.getSource() == managerDashboard.getLogOutButton()) {
            managerDashboard.dispose();
            LoginPage loginPage = new LoginPage();
            loginPage.setVisible(true);
        }
    }
}
