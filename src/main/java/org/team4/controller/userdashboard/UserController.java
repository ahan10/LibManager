package org.team4.controller.userdashboard;

import org.team4.controller.login.LoginController;
import org.team4.funtionality.rent.RentalService;
import org.team4.funtionality.rent.ReturnService;
import org.team4.maintaindb.MaintainBooks;
import org.team4.maintaindb.MaintainRequests;
import org.team4.model.items.BookRequest;
import org.team4.model.items.Item;
import org.team4.model.user.User;
import org.team4.view.login.LoginPage;
import org.team4.view.user.*;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserController implements ActionListener {

	private final UserDashboard userDashboard;
	private final User user;
	private final RentalService rent= new RentalService();
	private final ReturnService returnService = new ReturnService();

	public UserController(UserDashboard u){
		this.userDashboard = u;
		this.user = u.getUser();
		addListeners();
	}

	private void addListeners(){
		userDashboard.getRequestButton().addActionListener(this);
		userDashboard.getHomeButton().addActionListener(this);
		userDashboard.getLogoutButton().addActionListener(this);
		userDashboard.getStudentButton().addActionListener(this);
		userDashboard.getReturnButton().addActionListener(this);

		userDashboard.getSearchTextField().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				userDashboard.displayResults(userDashboard.getSearchTextField().getText());
			}
		});

		userDashboard.getRequestPanel().getSubmitButton().addActionListener(this);

		userDashboard.getHomePanel().getRefreshButton().addActionListener(this);
		userDashboard.getHomePanel().getReturnButton().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == userDashboard.getHomePanel().getReturnButton()){
			returnRentedItem();
		}else if (e.getSource() == userDashboard.getRequestButton()) {
			userDashboard.changeToRequestPanel();
		}else if (e.getSource() == userDashboard.getRequestPanel().getSubmitButton()) {
			manageRequest(userDashboard.getRequestPanel());
		}else if(e.getSource() == userDashboard.getHomeButton()) {
			userDashboard.changeToHomePanel();
		}else if (e.getSource() == userDashboard.getStudentButton()) {
			userDashboard.changeToStudentPanel(userDashboard.getCurrentUser());
		}else if(e.getSource() == userDashboard.getLogoutButton()) {
			userDashboard.dispose();
			LoginPage frame = new LoginPage();
			@SuppressWarnings("unused") LoginController controller = new LoginController(frame);
			frame.setVisible(true);
		} else if (e.getSource() == userDashboard.getHomePanel().getRefreshButton()) {
			this.userDashboard.getHomePanel().refreshRentedItemsTable();
		}
	}


	public void returnRentedItem() {
		Item itemToReturn = null;
		JTable rentedItemsTable = userDashboard.getHomePanel().getRentedItemsTable();
		int selectedRow = rentedItemsTable.getSelectedRow();

		if (selectedRow >= 0) {
			String isbn = rentedItemsTable.getValueAt(selectedRow, 1).toString();
			 itemToReturn = returnService.findItemByISBN(isbn);

			if (itemToReturn != null) {
				try {
					boolean returned = returnService.returnItem(userDashboard.getCurrentUser(), itemToReturn);
					if (returned) {
						JOptionPane.showMessageDialog(null, "Item returned successfully!");
						userDashboard.getHomePanel().refreshRentedItemsTable();
					} else {
						JOptionPane.showMessageDialog(null, "Failed to return item. Please try again.");
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Error during item return: " + ex.getMessage());
				}
			} else {
				JOptionPane.showMessageDialog(null, "Failed to find the selected item.");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Please select an item to return.");
		}
	}




	private void manageRequest(RequestPanel panel) {

		String title =  panel.getTextFieldTitle().getText().trim();
		String author = panel.getTextFieldAuthor().getText().trim();
		String ISBN = panel.getTextFieldISBN().getText().trim();
		String booktype = (String)panel.getComboBoxBookType().getSelectedItem();

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
				int edition = Integer.parseInt(panel.getTextFieldEdition().getText());
				BookRequest newRequest = new BookRequest(user.getEmail(), title, author, ISBN, edition, booktype);
				MaintainRequests.getInstance().addRequest(newRequest);

			}
		}



	}
}
