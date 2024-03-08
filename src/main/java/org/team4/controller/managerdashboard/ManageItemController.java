package org.team4.controller.managerdashboard;

import org.team4.view.manager.manage.ManageItemPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManageItemController implements ActionListener {
    private ManageItemPanel manageItemPanel;

    public ManageItemController(ManageItemPanel manageItemPanel) {
        this.manageItemPanel = manageItemPanel;
        addListeners();
    }

    private void addListeners(){
        this.manageItemPanel.getBookButton().addActionListener(this);
        this.manageItemPanel.getDvdButton().addActionListener(this);
        this.manageItemPanel.getMagazineButton().addActionListener(this);

        this.manageItemPanel.getManageBookPanel().getUpdateButton().addActionListener(this);
        this.manageItemPanel.getManageDVDPanel().getUpdateButton().addActionListener(this);
        this.manageItemPanel.getManageMagazinePanel().getUpdateButton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.manageItemPanel.getBookButton()){
            this.manageItemPanel.changeToBookPanel();
        }else if(e.getSource() == this.manageItemPanel.getDvdButton()){
            this.manageItemPanel.changeToDvdPanel();
        }else if(e.getSource() == this.manageItemPanel.getMagazineButton()){
            this.manageItemPanel.changeToMagazinePanel();
        }else if(e.getSource() == this.manageItemPanel.getManageBookPanel().getUpdateButton()){
            this.manageItemPanel.getManageBookPanel().updateSelectedBooks();
            JOptionPane.showMessageDialog(null, "Data Updated.");
        }else if(e.getSource() == this.manageItemPanel.getManageDVDPanel().getUpdateButton()){
            this.manageItemPanel.getManageDVDPanel().updateSelectedDVD();
            JOptionPane.showMessageDialog(null, "Data Updated.");
        }else if(e.getSource() == this.manageItemPanel.getManageMagazinePanel().getUpdateButton()){
            this.manageItemPanel.getManageMagazinePanel().updateSelectedMagazine();
            JOptionPane.showMessageDialog(null, "Data Updated.");
        }
    }
}
