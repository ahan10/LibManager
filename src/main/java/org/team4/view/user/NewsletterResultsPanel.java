package org.team4.view.user;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import org.team4.maintaindb.MaintainDatabase;
import org.team4.maintaindb.MaintainNewsletter;
import org.team4.model.items.Newsletter;
import org.team4.view.user.search.NewsletterTableModel;

public class NewsletterResultsPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private static JTable table;
	private String query;
	private JFrame window;

	public NewsletterResultsPanel() {
		setBounds(100, 100, 788, 520);
		setLayout(null);
	}

	public NewsletterResultsPanel(String query, JFrame window) {

		this.window = window;
		this.query = query;

		setBounds(100, 100, 788, 520);
		setLayout(new BorderLayout());
		JLabel label = new JLabel("Newsletter Search Results for Title: " + query);
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		label.setBounds(324, 5, 239, 26);
		add(label, BorderLayout.PAGE_START);

	}


	public void addSearchResults() {
		ArrayList<Newsletter> results = MaintainDatabase.getInstance().getNewsletterDatabase().searchNewsletters(query);
		NewsletterTableModel model = new NewsletterTableModel(results);

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
					int row = table.rowAtPoint(e.getPoint());
					int col = table.columnAtPoint(e.getPoint());
					if (col == 0) {
						Newsletter newsLetter = MaintainNewsletter.getInstance().searchNewslettersbyTitle(table.getValueAt(row, 0).toString());
						JFrame itemInfoFrame = new JFrame(newsLetter.getTitle());

						NewsletterItemPanel newsletterPanel = new NewsletterItemPanel(itemInfoFrame, newsLetter);
						newsletterPanel.showItemInfo();
						itemInfoFrame.setContentPane(new JScrollPane(newsletterPanel));
						itemInfoFrame.setSize(900, 900);
						itemInfoFrame.setVisible(true);
					}
				}
			});


			window.setContentPane(new JScrollPane(this));
			window.setSize(1200, 900);
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
