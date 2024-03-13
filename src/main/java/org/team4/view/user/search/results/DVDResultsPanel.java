package org.team4.view.user.search.results;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import org.team4.controller.results.DVDController;
import org.team4.maintaindb.MaintainDVD;
import org.team4.maintaindb.MaintainDatabase;
import org.team4.model.items.DVD;
import org.team4.model.user.User;
import org.team4.view.user.search.info.DVDItemPanel;
import org.team4.view.user.search.models.DVDTableModel;


public class DVDResultsPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private static JTable table;
	private String query;
	private JFrame window;
	private User user;

	public DVDResultsPanel() {
		setBounds(100, 100, 788, 520);
		setLayout(null);

	}

	public DVDResultsPanel(String query, JFrame window, User user) {

		this.window = window;
		this.query = query;
		this.user = user;

		setBounds(100, 100, 788, 520);
		setLayout(new BorderLayout());
		JLabel label = new JLabel("DVD Search Results for Title: " + query);
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		label.setBounds(324, 5, 239, 26);
		add(label, BorderLayout.PAGE_START);

	}


	public void addSearchResults() {
		ArrayList<DVD> results = MaintainDatabase.getInstance().getDVDDatabase().searchDVDs(query);
		DVDTableModel model = new DVDTableModel(results);

		if(results.isEmpty()) {
			JOptionPane.showMessageDialog(this, "No results found.", "Search Error", JOptionPane.ERROR_MESSAGE);
			window.dispose();
			return;

		}
		else {
			table = new JTable(model);
			table.setDefaultEditor(Object.class, null);
			add(new Panel().add(new JScrollPane(table)));

			table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(e.getClickCount() == 2) {
						int row = table.rowAtPoint(e.getPoint());
						int col = table.columnAtPoint(e.getPoint());
						if (col == 0) {
							DVD dvd = MaintainDVD.getInstance().searchExactDVDByISBN(table.getValueAt(row, 4).toString());
							JFrame itemInfoFrame = new JFrame(dvd.getTitle());

							DVDItemPanel dvdPanel = new DVDItemPanel(itemInfoFrame, dvd, user);
							DVDController dvdController = new DVDController(dvdPanel, user);

							dvdPanel.showItemInfo();
							itemInfoFrame.setContentPane(new JScrollPane(dvdPanel));
							itemInfoFrame.setSize(300, 280);
							itemInfoFrame.setVisible(true);
						}
					}
				}
			});


			window.setContentPane(new JScrollPane(this));
			window.setSize(1200, 500);
			window.setVisible(true);
		}

	}

	public JFrame getWindow() {
		return window;
	}

	public static JTable getTable() {
		return table;
	}
}
