package org.team4.view.user;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import org.team4.controller.results.BookController;
import org.team4.maintaindb.MaintainBooks;
import org.team4.maintaindb.MaintainDatabase;
import org.team4.model.items.Book;
import org.team4.model.user.User;
import org.team4.view.user.search.BookTableModel;


public class BookResultsPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private static JTable table;
	private String query;
	private JFrame window;
	private User user;

	public BookResultsPanel() {
		setBounds(100, 100, 788, 520);
		setLayout(null);
	}

	public BookResultsPanel(String query, JFrame window, User user) {

		this.window = window;
		this.query = query;
		this.user = user;

		setBounds(100, 100, 788, 520);
		setLayout(new BorderLayout());
		JLabel label = new JLabel("Book Search Results for Title: " + query);
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		label.setBounds(324, 5, 239, 26);
		add(label, BorderLayout.PAGE_START);

	}


	public void addSearchResults() {
		ArrayList<Book> results = MaintainDatabase.getInstance().getBookDatabase().searchBooks(query);
		BookTableModel model = new BookTableModel(results);

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
							Book book = MaintainBooks.getInstance().searchExactBookByISBN(table.getValueAt(row, 5).toString());
							JFrame itemInfoFrame = new JFrame(book.getTitle());
							BookItemPanel bookPanel = new BookItemPanel(itemInfoFrame, book);
							BookController bookController = new BookController(bookPanel, user);
							bookPanel.showItemInfo();
							itemInfoFrame.setContentPane(new JScrollPane(bookPanel));
							itemInfoFrame.setSize(300, 300);
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




	public static JTable getTable() {
		return table;
	}
}
