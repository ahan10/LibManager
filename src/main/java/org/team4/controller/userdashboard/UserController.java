package org.team4.controller.userdashboard;

import org.team4.controller.login.LoginController;
import org.team4.funtionality.rent.RentalService;
import org.team4.funtionality.rent.ReturnService;
import org.team4.maintaindb.MaintainBooks;
import org.team4.maintaindb.MaintainDatabase;
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
		userDashboard.getPurchaseButton().addActionListener(this);
		userDashboard.getRentItemButton().addActionListener(this);
		userDashboard.getSubscribeButton().addActionListener(this);
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

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == userDashboard.getRentItemButton()) {
			rentSelectedItem();
		}
		else if (e.getSource()== userDashboard.getReturnButton()){
			returnSelectedItem();

		}

	 else if (e.getSource() == userDashboard.getSubscribeButton()) {
			userDashboard.changeToSubscribePanel();
		} else if (e.getSource() == userDashboard.getPurchaseButton()) {
			userDashboard.changeToPurchasePanel();
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
		}
	}
	private void rentSelectedItem() {
		Item itemToRent = null;
		String itemTitle = "";
		String itemType = userDashboard.getItemType();

		if ("Book".equals(itemType)) {
			int selectedRow = BookResultsPanel.getTable().getSelectedRow();
			if (selectedRow >= 0) {
				String isbn = BookResultsPanel.getTable().getValueAt(selectedRow, 5).toString();
				itemToRent = MaintainDatabase.getInstance().getBookDatabase().searchExactBookByISBN(isbn);
				itemTitle = "book";
			}
		} else if ("DVD".equals(itemType)) {
			int selectedRow = DVDResultsPanel.getTable().getSelectedRow();
			if (selectedRow >= 0) {
				String isbn = DVDResultsPanel.getTable().getValueAt(selectedRow, 4).toString();
				itemToRent = MaintainDatabase.getInstance().getDVDDatabase().searchExactDVDByISBN(isbn);
				itemTitle = "DVD";
			}
		} else if ("Magazine".equals(itemType)) {
			int selectedRow = MagazineResultsPanel.getTable().getSelectedRow();
			if (selectedRow >= 0) {
				String isbn = MagazineResultsPanel.getTable().getValueAt(selectedRow, 4).toString();
				itemToRent = MaintainDatabase.getInstance().getMagazineDatabase().searchExactMagazineByISBN(isbn);
				itemTitle = "magazine";
			}
		}

		// to rent the selected item by the user
		if (itemToRent != null) {
			try {
				if (rent.canRentItem(user, itemToRent)) {
					if (rent.rentItem(user, itemToRent)) {
						JOptionPane.showMessageDialog(null, itemToRent.getTitle() + " rented successfully!");
					} else {
						JOptionPane.showMessageDialog(null, "Failed to rent " + itemTitle + ". Please try again.");
					}
				}
			} catch (Exception ex) {

				JOptionPane.showMessageDialog(null, ex.getMessage());
			}
		} else {
			JOptionPane.showMessageDialog(null, "Please select a " + itemTitle + " to rent.");
		}
	}

	private void returnSelectedItem() {
		Item itemToReturn = null;
		int selectedRow = -1;
		String itemType = userDashboard.getItemType();


		if ("Book".equals(itemType)) {
			selectedRow = BookResultsPanel.getTable().getSelectedRow();
			if (selectedRow >= 0) {
				String isbn = BookResultsPanel.getTable().getValueAt(selectedRow, 5).toString();
				itemToReturn = MaintainDatabase.getInstance().getBookDatabase().searchExactBookByISBN(isbn);
			}
		} else if ("DVD".equals(itemType)) {
			selectedRow = DVDResultsPanel.getTable().getSelectedRow();
			if (selectedRow >= 0) {
				String isbn = DVDResultsPanel.getTable().getValueAt(selectedRow, 4).toString();
				itemToReturn = MaintainDatabase.getInstance().getDVDDatabase().searchExactDVDByISBN(isbn);
			}
		} else if ("Magazine".equals(itemType)) {
			selectedRow = MagazineResultsPanel.getTable().getSelectedRow();
			if (selectedRow >= 0) {
				String isbn = MagazineResultsPanel.getTable().getValueAt(selectedRow, 4).toString();
				itemToReturn = MaintainDatabase.getInstance().getMagazineDatabase().searchExactMagazineByISBN(isbn);
			}
		}


		if (itemToReturn != null) {
			try {
				boolean returned = returnService.returnItem(user, itemToReturn);
				if (returned) {
					JOptionPane.showMessageDialog(null, "Item returned successfully!");
				} else {
					JOptionPane.showMessageDialog(null, "Failed to return item. Please try again.");
				}
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "Error during item return: " + ex.getMessage());
			}
		} else {
			JOptionPane.showMessageDialog(null, "Please select an item to return.");
		}
	}


	private void manageRequest(RequestPanel panel) {
		
		String title =  panel.getTextFieldTitle().getText().trim();
		String author = panel.getTextFieldAuthor().getText().trim();
		String ISBN = panel.getTextFieldISBN().getText().trim();
		int edition = Integer.parseInt(panel.getTextFieldEdition().getText());
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
				BookRequest newRequest = new BookRequest(user.getEmail(), title, author, ISBN, edition, booktype);
				MaintainRequests.getInstance().addRequest(newRequest);
				
			}
		}
		
		
		
	}
}
