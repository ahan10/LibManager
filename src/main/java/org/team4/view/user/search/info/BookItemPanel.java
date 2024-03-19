package org.team4.view.user.search.info;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.team4.model.items.Book;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Random;

import javax.swing.JButton;

public class BookItemPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private JFrame window;
	private Book book;
	private JLabel lblTitleValue = new JLabel();
	private JLabel lblAuthorValue = new JLabel();
	private JLabel lblGenreValue = new JLabel();
	private JLabel lblISBNValue = new JLabel();
	private JLabel lblPublisherValue = new JLabel();
	private JLabel lblYearPublishedValue = new JLabel();
	private JLabel lblPriceValue = new JLabel();
	private JLabel lblQuantityValue = new JLabel();
	private JLabel lblLocationValue = new JLabel();

	private JButton btnBuy, btnRent;


	public BookItemPanel(JFrame window, Book book) {
		this.window = window;
		this.book = book;

		setLayout(null);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblTitle.setBounds(20, 20, 45, 13);
		
		JLabel lblAuthor = new JLabel("Author:");
		lblAuthor.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAuthor.setBounds(20, 40, 45, 13);
		
		JLabel lblGenre = new JLabel("Genre:");
		lblGenre.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblGenre.setBounds(20, 60, 45, 13);
		
		JLabel lblISBN = new JLabel("ISBN:");
		lblISBN.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblISBN.setBounds(20, 80, 45, 13);
		

		JLabel lblPublisher = new JLabel("Publisher:");
		lblPublisher.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblPublisher.setBounds(20, 100, 57, 13);
		
		JLabel lblYearPublished = new JLabel("Published: ");
		lblYearPublished.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblYearPublished.setBounds(20, 120, 100, 13);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblPrice.setBounds(20, 140, 45, 13);
		
		JLabel lblQuantity = new JLabel("Quantity:");
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblQuantity.setBounds(20, 160, 70, 13);
		
		JLabel lblLocation = new JLabel("Location:");
		lblLocation.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblLocation.setBounds(20, 180, 70, 13);
		
		add(lblTitle);
		add(lblAuthor);
		add(lblGenre);
		add(lblISBN);
	
		add(lblPublisher);
		add(lblYearPublished);
		add(lblPrice);
		add(lblQuantity);
		add(lblLocation);
		
		lblTitleValue.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblTitleValue.setBounds(100, 20, 200, 13);
		
		lblAuthorValue.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblAuthorValue.setBounds(100, 40, 200, 13);
		
		lblGenreValue.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblGenreValue.setBounds(100, 60, 200, 13);
		
		lblISBNValue.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblISBNValue.setBounds(100, 80, 200, 13);
		
		lblPublisherValue.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblPublisherValue.setBounds(100, 100, 200, 13);
		
		lblYearPublishedValue.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblYearPublishedValue.setBounds(100, 120, 200, 13);
		
		lblPriceValue.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblPriceValue.setBounds(100, 140, 200, 13);
		
		lblQuantityValue.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblQuantityValue.setBounds(100, 160, 200, 13);

		lblLocationValue.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblLocationValue.setBounds(100, 180, 200, 13);

		
		add(lblTitleValue);
		add(lblAuthorValue);
		add(lblGenreValue);
		add(lblISBNValue);
		add(lblPublisherValue);
		add(lblYearPublishedValue);
		add(lblPriceValue);
		add(lblQuantityValue);
		add(lblLocationValue);
		
		btnBuy = new JButton("Buy");
		btnBuy.setBounds(20, 220, 85, 21);
		add(btnBuy);
		
		btnRent = new JButton("Rent");
		btnRent.setBounds(160, 220, 85, 21);
		add(btnRent);

		btnRent.setEnabled(this.book.isRentable());
		btnBuy.setEnabled(this.book.isPurchasable());
	}
	
	
	public void showItemInfo() {
		lblTitleValue.setText(book.getTitle());
		lblAuthorValue.setText(book.getAuthor());
		lblGenreValue.setText(book.getGenre());
		lblISBNValue.setText(book.getISBN());

		lblPublisherValue.setText(book.getPublisher());
		lblYearPublishedValue.setText(book.getYearPublished() + "");
		lblPriceValue.setText("$" + book.getPrice() + "");
		lblQuantityValue.setText(book.getQuantity() + "");
		
		Random rand = new Random();
		int randomNumber = rand.nextInt(5) + 1;
		
		String locationString = book.getGenre() + " " + randomNumber;
		
		lblLocationValue.setText(locationString);

	}


	public void setWindow(JFrame window) {
		this.window = window;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	public JFrame getWindow() {
		return window;
	}

	public JButton getBtnBuy() {
		return btnBuy;
	}

	public JButton getBtnRent() {
		return btnRent;
	}

	public Book getBook() {
		return book;
	}
}
