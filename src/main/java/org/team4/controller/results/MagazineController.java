package org.team4.controller.results;

import org.team4.funtionality.rent.RentalService;
import org.team4.maintaindb.MaintainDatabase;
import org.team4.model.items.Item;
import org.team4.model.user.User;
import org.team4.view.user.search.info.MagazineItemPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MagazineController implements ActionListener {
    MagazineItemPanel magazineItemPanel;
    private final RentalService rent;
    private User user;

    public MagazineController(MagazineItemPanel magazineItemPanel, User user) {
        this.magazineItemPanel = magazineItemPanel;
        this.user = user;
        rent = new RentalService();
        addListeners();
    }

    private void addListeners(){
        this.magazineItemPanel.getBtnRent().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.magazineItemPanel.getBtnRent()){
            rentSelectedItem();
        }
    }

    private void rentSelectedItem() {
        Item itemToRent = MaintainDatabase.getInstance().getMagazineDatabase().searchExactMagazineByISBN(this.magazineItemPanel.getMagazine().getISBN());

        // to rent the selected item by the user
        try {
            if (rent.canRentItem(user, itemToRent)) {
                if (rent.rentItem(user, itemToRent)) {
                    JOptionPane.showMessageDialog(null, itemToRent.getTitle() + " rented successfully!");
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to rent magazine. Please try again.");
                }
            }
        } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
