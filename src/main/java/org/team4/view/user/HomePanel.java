package org.team4.view.user;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.team4.maintaindb.MaintainRent;
import org.team4.model.items.RentedItem;
import org.team4.model.user.User;
import org.team4.view.user.search.models.RentedItemTableModel;

class HomePanel extends JPanel {
    private User currentUser;
    private JTable rentedItemsTable;
    private JScrollPane scrollPane;
    private JButton refreshButton;

    public HomePanel(User user) {
        this.currentUser = user;
        initializeUI();
    }




    private void initializeUI() {
        setLayout(new BorderLayout());
        JLabel label = new JLabel("Rented Items");
        label.setFont(new Font("Tahoma", Font.BOLD, 14));

        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(label, BorderLayout.WEST);

        refreshButton = new JButton("Refresh");
        refreshButton.addActionListener(e -> refreshRentedItemsTable());

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(refreshButton);
        topPanel.add(buttonPanel, BorderLayout.EAST);

        add(topPanel, BorderLayout.PAGE_START);

        addRentedItemsTable();
    }
    public JButton getRefreshButton() {
        return refreshButton;
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
        add(scrollPane, BorderLayout.CENTER);
    }

    private void refreshRentedItemsTable() {
        Map<String, ArrayList<RentedItem>> allRenters = MaintainRent.getInstance().getAllRenters();
        if (allRenters == null) {
            allRenters = new HashMap<>();
        }
        ArrayList<RentedItem> rentedItems = allRenters.getOrDefault(currentUser.getEmail(), new ArrayList<>());

        rentedItemsTable.setModel(new RentedItemTableModel(rentedItems));
        rentedItemsTable.revalidate();
        rentedItemsTable.repaint();
    }


}
