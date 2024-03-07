package org.team4.view.manager.manage;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

import org.team4.maintaindb.MaintainDatabase;
import org.team4.model.items.Book;
import org.team4.model.items.Item;
import org.team4.model.user.User;


import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class ManageBookPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private BookViewTableModel bookViewTableModel;
	private ArrayList<Item> allBooks = new ArrayList<>();
	private JPanel panel;
	private JButton updateButton;

	/**
	 * Create the panel.
	 */
	public ManageBookPanel() {
		allBooks = MaintainDatabase.getInstance().getBookDatabase().getAllBooks();
		initComponents();
	}

	private void initComponents() {
		setBounds(100, 100, 976, 627);
		setLayout(new BorderLayout());

		panel = new JPanel();
		panel.setLayout(null);

		add(panel, BorderLayout.CENTER);
		
		JLabel titleLabel = new JLabel("Manage Books");
		titleLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		titleLabel.setBounds(422, 23, 132, 22);
		panel.add(titleLabel);
		
		addScrollPane();
	}
	
	private void addScrollPane() {
		bookViewTableModel = new BookViewTableModel(this.allBooks);
        JTable bookTable = new JTable(bookViewTableModel);
		
		TableColumn rentColumn = bookTable.getColumnModel().getColumn(6);
        JComboBox<Boolean> comboBox = new JComboBox<>(new Boolean[]{true, false});
        rentColumn.setCellEditor(new DefaultCellEditor(comboBox));
        
        JScrollPane scrollPane = new JScrollPane(bookTable);
		scrollPane.setBounds(30, 58, 917, 527);
		panel.add(scrollPane);
		
		updateButton = new JButton("Update");
		updateButton.setBounds(823, 592, 117, 29);
		panel.add(updateButton);
	}
	
	public JButton getUpdateButton() {
		return this.updateButton;
	}

	public void updateSelectedBooks() {
		int rowCount = bookViewTableModel.getRowCount();
		for (int i = 0; i < rowCount; i++) {
			Boolean rentableStatus = (Boolean) bookViewTableModel.getValueAt(i, 6);
			Item book = allBooks.get(i);
			book.setRentable(rentableStatus);
		}

		// Now, update the CSV with changed fields
		try {
			MaintainDatabase.getInstance().getBookDatabase().update();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
