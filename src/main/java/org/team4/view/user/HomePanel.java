package org.team4.view.user;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

import org.team4.funtionality.rent.RentalService;
import org.team4.maintaindb.MaintainRent;
import org.team4.model.items.RentedItem;
import org.team4.model.user.User;
import org.team4.view.user.search.models.RentedItemTableModel;

public class HomePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private User currentUser;
	private JTable rentedItemsTable;
	private JScrollPane scrollPane;
	private JButton refreshButton, returnButton;

	private RentalService rentalService;

	public HomePanel(User user) {
		this.currentUser = user;
		this.rentalService= new RentalService();
		initializeUI();
	}

	private void initializeUI() {
		setBounds(100, 100, 1175, 740);

		JLabel label = new JLabel("Rented Items");
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		setLayout(null);

		JLabel titleLabel = new JLabel("Welcome to LibManager");
		titleLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		titleLabel.setBounds(452, 5, 255, 26);
		add(titleLabel);

		JLabel rentedLabel = new JLabel("Rented Items:");
		rentedLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		rentedLabel.setBounds(23, 57, 127, 26);
		add(rentedLabel);

		refreshButton = new JButton("Refresh");
		refreshButton.setBounds(1035, 58, 117, 29);
		add(refreshButton);
		
		returnButton = new JButton("Return");
		returnButton.setBounds(1035, 458, 117, 29);
		add(returnButton);

		addRentedItemsTable();
	}

	private void addRentedItemsTable() {
		Map<String, ArrayList<RentedItem>> allRenters = MaintainRent.getInstance().getAllRenters();
		
		if (allRenters == null) {
			allRenters = new HashMap<>();
		}
		
		ArrayList<RentedItem> rentedItems = allRenters.getOrDefault(currentUser.getEmail(), new ArrayList<>());
		rentedItemsTable = new JTable(new RentedItemTableModel(rentedItems));
        rentedItemsTable.setDefaultEditor(Object.class, null);

		scrollPane = new JScrollPane(rentedItemsTable);
		scrollPane.setBounds(23, 95, 1129, 351);
		add(scrollPane);
		
	}

	public void refreshRentedItemsTable() {
		Map<String, ArrayList<RentedItem>> allRenters = MaintainRent.getInstance().getAllRenters();
		if (allRenters == null) {
			allRenters = new HashMap<>();
		}

		ArrayList<RentedItem> rentedItems = allRenters.getOrDefault(currentUser.getEmail(), new ArrayList<>());

		rentedItemsTable.setModel(new RentedItemTableModel(rentedItems));
		rentedItemsTable.revalidate();
		rentedItemsTable.repaint();
	}

	public User getCurrentUser() {
		return currentUser;
	}

	public JButton getRefreshButton() {
		return refreshButton;
	}

	public JButton getReturnButton() {
		return returnButton;
	}
    public JTable getRentedItemsTable() {
        return rentedItemsTable;
    }
	@Override
	public void addNotify() {
		super.addNotify();
		checkForApproachingOrOverdueItems();
	}


	private void checkForApproachingOrOverdueItems() {
		EventQueue.invokeLater(() -> {
			List<RentedItem> approachingOrOverdueItems = rentalService.getApproachingOrOverdueItems(currentUser.getEmail());
			if (!approachingOrOverdueItems.isEmpty()) {
				StringBuilder warnings = new StringBuilder();
				for (RentedItem rentedItem : approachingOrOverdueItems) {
					long timeDiff = rentedItem.getDueDate().getTime() - new Date().getTime();
					if (timeDiff < 0) {
						warnings.append(rentedItem.getTitle()).append(" is overdue!\n");
					} else if (timeDiff < 24 * 60 * 60 * 1000) {
						warnings.append(rentedItem.getTitle()).append(" is due in less than 24 hours!\n");
					}
				}
				if (!warnings.isEmpty()) {
					JOptionPane.showMessageDialog(this, warnings.toString(), "Due Book Warnings", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
	}


}
