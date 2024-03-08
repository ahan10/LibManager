package org.team4.controller.userdashboard;

import org.team4.model.user.User;
import org.team4.view.user.RequestPanel;
import org.team4.maintaindb.MaintainBooks;
import org.team4.model.items.Book;
import org.team4.view.user.SearchResultsPanel;
import org.team4.view.user.UserDashboard;
import org.team4.funtionality.rent.RentalService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UserController implements ActionListener {

	private UserDashboard userDashboard;
	private User user;
	private RentalService rent= new RentalService();

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
		userDashboard.getHomeButton().addActionListener(this);

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
		}else if (e.getSource() == userDashboard.getRequestPanel().getSubmitButton()) {
			manageRequest(userDashboard.getRequestPanel());
		}else if(e.getSource() == userDashboard.getHomeButton()) {
			userDashboard.changeToHomePanel();
		}
	}

	private void manageRequest(RequestPanel panel) {
		System.out.println("Request Submitted");
		System.out.println("Book Title: " + panel.getTextFieldTitle().getText().trim());
		System.out.println("Book Author: " + panel.getTextFieldAuthor().getText().trim());
		System.out.println("Book ISBN: " + panel.getTextFieldISBN().getText().trim());
		System.out.println("Book Edition: " + panel.getTextFieldEdition().getText().trim());
		System.out.println("Type of Book is: " + panel.getComboBoxBookType().getSelectedItem());
		
		if(panel.getTextFieldTitle().getText().trim().equals("")) {
			JOptionPane.showMessageDialog(new JFrame(), "Please enter a valid title!",
					"Error Invalid Title", JOptionPane.ERROR_MESSAGE);
		}else if(panel.getTextFieldAuthor().getText().trim().equals("")) {
			JOptionPane.showMessageDialog(new JFrame(), "Please enter a valid author!",
					"Error Invalid Author Name", JOptionPane.ERROR_MESSAGE);
		}else if(panel.getTextFieldISBN().getText().trim().length() < 10) {
			JOptionPane.showMessageDialog(new JFrame(), "Please enter a valid ISBN!",
					"Error Invalid ISBN", JOptionPane.ERROR_MESSAGE);
		}
		else if(panel.getTextFieldEdition().getText().trim().equals("")) {
			JOptionPane.showMessageDialog(new JFrame(), "Please enter a valid edition!",
					"Error Invalid Edition", JOptionPane.ERROR_MESSAGE);
		}
		else {
			if(MaintainBooks.getInstance().searchExactBook(panel.getTextFieldISBN().getText())) {
				JOptionPane.showMessageDialog(new JFrame(), "Book already exists in library!",
						"Error Invalid Request", JOptionPane.ERROR_MESSAGE);
			}
			else {
				JOptionPane.showMessageDialog(new JFrame(), "Successful Request!",
						"Request Complete", JOptionPane.INFORMATION_MESSAGE);
				
			}
		}
		
		
		
	}
}
