package org.team4.controller.userdashboard;

import org.team4.maintaindb.MaintainBooks;
import org.team4.model.items.Book;
import org.team4.model.user.User;
import org.team4.view.user.SearchResultsPanel;
import org.team4.view.user.UserDashboard;
import org.team4.funtionality.rent.RentalService;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class UserController implements ActionListener {

    private UserDashboard userDashboard;
    private RentalService rent= new RentalService();

    public UserController(UserDashboard u){
        this.userDashboard = u;
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
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == userDashboard.getRentItemButton()) {
        	 int selectedRow = SearchResultsPanel.getTable().getSelectedRow();
            if (selectedRow >= 0) {
                String title = SearchResultsPanel.getTable().getValueAt(selectedRow, 0).toString();
                User currentUser = userDashboard.getCurrentUser();
                Book bookToRent = MaintainBooks.getInstance().searchExactBookByTitle(title);

                if (bookToRent != null && rent.canRentBook(currentUser, bookToRent)) {
                    try {
                        if (rent.rentBook(currentUser, bookToRent)) {
                            JOptionPane.showMessageDialog(null, "Book rented successfully!");
                            userDashboard.performSearch(userDashboard.getSearchTextField().getText());
                        } else {
                            JOptionPane.showMessageDialog(null, "Failed to rent book. Please try again.");
                        }
                    } catch (Exception ex) {
                        throw new RuntimeException(ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "This book cannot be rented.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please select a book to rent.");
            }

        } else if (e.getSource() == userDashboard.getSubscribeButton()) {
            userDashboard.changeToSubscribePanel();
        } else if (e.getSource() == userDashboard.getPurchaseButton()) {
            userDashboard.changeToPurchasePanel();
        }else if (e.getSource() == userDashboard.getRequestButton()) {
            userDashboard.changeToRequestPanel();
        }
    }
}
