package org.team4.controller.managerdashboard;

import org.team4.controller.login.LoginController;
import org.team4.maintaindb.MaintainDatabase;
import org.team4.maintaindb.MaintainUser;
import org.team4.view.login.LoginPage;
import org.team4.view.manager.*;

import javax.swing.*;
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
        managerDashboard.getValidateUserPanel().getUpdateButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                managerDashboard.getValidateUserPanel().updateSelectedUsers();
                JOptionPane.showMessageDialog(null, "Data Updated.");
            }
        });
        
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
            LoginPage frame = new LoginPage();
            MaintainUser maintainUser = MaintainDatabase.getInstance().getUserDatabase();
        	@SuppressWarnings("unused") LoginController controller = new LoginController(frame, maintainUser);
            frame.setVisible(true);
        }
    }
}
