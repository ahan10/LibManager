package org.team4.view.user.search.results;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;

import org.team4.controller.results.BookController;
import org.team4.functionality.recommendation.*;
import org.team4.maintaindb.MaintainBooks;
import org.team4.model.items.Book;
import org.team4.model.user.User;
import org.team4.view.user.search.info.BookItemPanel;
import org.team4.view.user.search.models.BookTableModel;


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
		Strategy resultStrategy = new TitleRecommendationStrategy();
		ArrayList<Book> results = resultStrategy.getRecommendation(query);
		BookTableModel model = new BookTableModel(results);

		if(results.isEmpty()) {
			JOptionPane.showMessageDialog(this, "No results found.", "Search Error", JOptionPane.ERROR_MESSAGE);
			window.dispose();
			return;

		}
		else {

			Panel resultsPanel = new Panel();
			resultsPanel.setLayout(new BorderLayout());

			//Search Results
			table = new JTable(model);
			table.setDefaultEditor(Object.class, null);
			resultsPanel.add(new JScrollPane(table), BorderLayout.NORTH);

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
							new BookController(bookPanel, user);
							bookPanel.showItemInfo();
							itemInfoFrame.setContentPane(new JScrollPane(bookPanel));
							itemInfoFrame.setSize(300, 300);
							itemInfoFrame.setVisible(true);
						}
					}
				}
			});

			JLabel label = new JLabel("Recommendations:");
			label.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			label.setBounds(324, 5, 239, 26);
			resultsPanel.add(label, BorderLayout.CENTER);


			model = new BookTableModel(new ArrayList<Book>());
			//Recommendation Results
			JTable recomTable = new JTable(model);
			recomTable.setDefaultEditor(Object.class, null);
			resultsPanel.add(new JScrollPane(recomTable), BorderLayout.SOUTH);


			table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					int row = table.rowAtPoint(e.getPoint());

					Book book = MaintainBooks.getInstance().searchExactBookByISBN(table.getValueAt(row, 5).toString());
					label.setText("Recommendations based on: " + book.getTitle());
					ArrayList<Book> recomResults = new AuthorRecommendationStrategy().getRecommendation(book.getAuthor());
					
					if(recomResults.size() < 10) {
						recomResults.addAll(new GenreRecommendationStrategy().getRecommendation(book.getGenre()));

						if(recomResults.size() < 10) {
							recomResults.addAll(new PublisherRecommendationStrategy().getRecommendation(book.getPublisher()));
						}
						
						if(recomResults.size() < 10) {
							recomResults.addAll(new CompareYearRecommendationStrategy().getRecommendation(book.getYearPublished()+""));
							
						}
					}


					recomResults = recomResults.stream()
							.filter(element -> element != book)
							.collect(Collectors.toCollection(ArrayList::new));
					
					 HashSet<Book> setWithoutDuplicates = new HashSet<>(recomResults);

				     // Clear the original list
					 recomResults.clear();

				     // Add elements from the HashSet back to the ArrayList
					 recomResults.addAll(setWithoutDuplicates);
					BookTableModel model = new BookTableModel(recomResults);
					recomTable.setModel(model);
					recomTable.updateUI();
				}
			});

			recomTable.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(e.getClickCount() == 2) {
						int row = recomTable.rowAtPoint(e.getPoint());
						int col = recomTable.columnAtPoint(e.getPoint());
						if (col == 0) {
							Book book = MaintainBooks.getInstance().searchExactBookByISBN(recomTable.getValueAt(row, 5).toString());
							JFrame itemInfoFrame = new JFrame(book.getTitle());
							BookItemPanel bookPanel = new BookItemPanel(itemInfoFrame, book);
							new BookController(bookPanel, user);
							bookPanel.showItemInfo();
							itemInfoFrame.setContentPane(new JScrollPane(bookPanel));
							itemInfoFrame.setSize(300, 300);
							itemInfoFrame.setVisible(true);
						}
					}
				}
			});



			add(resultsPanel);

			window.setContentPane(new JScrollPane(this));
			window.setSize(1200, 900);
			window.setVisible(true);
		}

	}

}
