package org.team4.view.manager.add;

import javax.swing.*;

import org.team4.model.items.Book;
import org.team4.model.items.Item;
import org.team4.model.items.builder.BookBuilder;
import org.team4.model.items.decorator.PurchasableItemDecorator;
import org.team4.model.items.decorator.RentableItemDecorator;

import java.awt.*;

public class AddBookPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private static final String EMPTY = "";

	private JPanel panel;

	private JButton addButton;
	private JTextField title;
	private JTextField author;
	private JTextField publisher;
	private JTextField genre;
	private JTextField edition;
	private JTextField yearPublished;
	private JTextField isbn;
	private JTextField noOfPages;
	private JTextField quantity;
	private JTextField price;
	private JComboBox canRent;
	private JComboBox canBuy;
	private JComboBox hardCopy;
	private JComboBox softCopy;

	public AddBookPanel(){
		initComponents();
	}

	private void initComponents(){
		setBounds(100, 100, 976, 627);
		setLayout(new BorderLayout());

		panel = new JPanel();
		panel.setLayout(null);

		add(panel, BorderLayout.CENTER);

		addButton();
		addLabel();
		addFields();
	}

	private void addLabel(){
		JLabel titleLabel = new JLabel("Add Book");
		titleLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		titleLabel.setBounds(444, 53, 88, 22);
		panel.add(titleLabel);

		JLabel nameLabel = new JLabel("Title:");
		nameLabel.setBounds(90, 159, 42, 16);
		panel.add(nameLabel);

		JLabel yearLabel = new JLabel("Year Published:");
		yearLabel.setBounds(517, 209, 96, 16);
		panel.add(yearLabel);

		JLabel pageLabel = new JLabel("Number of Pages:");
		pageLabel.setBounds(90, 430, 112, 16);
		panel.add(pageLabel);

		JLabel authorLabel = new JLabel("Author:");
		authorLabel.setBounds(89, 204, 61, 16);
		panel.add(authorLabel);

		JLabel isbnLabel = new JLabel("ISBN:");
		isbnLabel.setBounds(517, 248, 61, 16);
		panel.add(isbnLabel);

		JLabel publisherLabel = new JLabel("Publisher:");
		publisherLabel.setBounds(90, 248, 86, 16);
		panel.add(publisherLabel);

		JLabel rentLabel = new JLabel("Can rent:");
		rentLabel.setBounds(89, 335, 61, 16);
		panel.add(rentLabel);

		JLabel buyLabel = new JLabel("Can buy:");
		buyLabel.setBounds(89, 385, 61, 16);
		panel.add(buyLabel);

		JLabel quantityLabel = new JLabel("Quantity:");
		quantityLabel.setBounds(517, 287, 61, 16);
		panel.add(quantityLabel);

		JLabel hardcopyLabel = new JLabel("Hardcopy:");
		hardcopyLabel.setBounds(517, 335, 79, 16);
		panel.add(hardcopyLabel);

		JLabel softcopyLabel = new JLabel("Softcopy:");
		softcopyLabel.setBounds(517, 385, 61, 16);
		panel.add(softcopyLabel);

		JLabel priceLabel = new JLabel("Price");
		priceLabel.setBounds(517, 430, 61, 16);
		panel.add(priceLabel);

		JLabel genreLabel = new JLabel("Genre:");
		genreLabel.setBounds(90, 287, 61, 16);
		panel.add(genreLabel);

		JLabel editionLabel = new JLabel("Edition:");
		editionLabel.setBounds(517, 159, 61, 16);
		panel.add(editionLabel);

		JLabel WARN_LABEL = new JLabel("PLEASE FILL ALL FIELDS WITH APPROPRIATE DATA");
		WARN_LABEL.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		WARN_LABEL.setHorizontalAlignment(SwingConstants.CENTER);
		WARN_LABEL.setBounds(323, 87, 330, 16);
		panel.add(WARN_LABEL);
	}

	private void addFields() {
		title = new JTextField();
		title.setBounds(161, 154, 318, 26);
		panel.add(title);
		title.setColumns(10);

		author = new JTextField();
		author.setBounds(162, 199, 318, 26);
		panel.add(author);
		author.setColumns(10);

		publisher = new JTextField();
		publisher.setBounds(161, 243, 317, 26);
		panel.add(publisher);
		publisher.setColumns(10);

		genre = new JTextField();
		genre.setBounds(162, 282, 317, 26);
		panel.add(genre);
		genre.setColumns(10);

		edition = new JTextField();
		edition.setBounds(625, 154, 130, 26);
		panel.add(edition);
		edition.setColumns(10);

		yearPublished = new JTextField();
		yearPublished.setBounds(625, 204, 127, 26);
		panel.add(yearPublished);
		yearPublished.setColumns(10);

		isbn = new JTextField();
		isbn.setBounds(622, 243, 130, 26);
		panel.add(isbn);
		isbn.setColumns(10);

		noOfPages = new JTextField();
		noOfPages.setBounds(214, 425, 130, 26);
		panel.add(noOfPages);
		noOfPages.setColumns(10);

		quantity = new JTextField();
		quantity.setBounds(622, 282, 130, 26);
		panel.add(quantity);
		quantity.setColumns(10);

		price = new JTextField();
		price.setBounds(622, 425, 130, 26);
		panel.add(price);
		price.setColumns(10);

		canRent = new JComboBox();
		canRent.setModel(new DefaultComboBoxModel(new String[] {"false", "true"}));
		canRent.setBounds(162, 331, 112, 27);
		panel.add(canRent);

		canBuy = new JComboBox();
		canBuy.setModel(new DefaultComboBoxModel(new String[] {"false", "true"}));
		canBuy.setBounds(162, 381, 112, 27);
		panel.add(canBuy);

		hardCopy = new JComboBox();
		hardCopy.setModel(new DefaultComboBoxModel(new String[] {"false", "true"}));
		hardCopy.setBounds(622, 331, 130, 27);
		panel.add(hardCopy);

		softCopy = new JComboBox();
		softCopy.setModel(new DefaultComboBoxModel(new String[] {"false", "true"}));
		softCopy.setBounds(622, 381, 130, 27);
		panel.add(softCopy);
	}

	private void addButton() {
		addButton = new JButton("Add");
		addButton.setBounds(431, 502, 117, 29);
		panel.add(addButton);
	}



	public Book getBook() {

		String bookTitle = title.getText();
		String bookAuthor = author.getText();
		String bookPublisher = publisher.getText();
		String bookGenre = genre.getText();
		String ISBN = isbn.getText();

		boolean rent = Boolean.parseBoolean(canRent.getSelectedItem().toString());
		boolean buy = Boolean.parseBoolean(canBuy.getSelectedItem().toString());
		boolean softcopy = Boolean.parseBoolean(softCopy.getSelectedItem().toString());
		boolean hardcopy = Boolean.parseBoolean(hardCopy.getSelectedItem().toString());

		int bookEdition = Integer.parseInt(edition.getText());
		int bookNoOfPages = Integer.parseInt(noOfPages.getText());
		int bookYearPublished = Integer.parseInt(yearPublished.getText());
		int bookQuantity = Integer.parseInt(quantity.getText());

		double bookPrice = Double.parseDouble(price.getText());

		Item newBook = ((BookBuilder) new BookBuilder()
				.title(bookTitle)
				.yearPublished(bookYearPublished)
				.price(bookPrice)
				.quantity(bookQuantity)
				.ISBN(ISBN))
				.noOfPages(bookNoOfPages)
				.author(bookAuthor)
				.publisher(bookPublisher)
				.edition(bookEdition)
				.genre(bookGenre)
				.hasHardCopy(hardcopy)
				.hasSoftCopy(softcopy)
				.build();

		if(buy) {
			PurchasableItemDecorator purchasableDecorator = new PurchasableItemDecorator(newBook);
			newBook = purchasableDecorator.getItem();
		}
		if(rent) {
			RentableItemDecorator rentableDecorator = new RentableItemDecorator(newBook);
			newBook = rentableDecorator.getItem();
		}

		clearFields();

		return (Book) newBook;
	}

	private void clearFields() {
		title.setText(EMPTY);
		author.setText(EMPTY);
		publisher.setText(EMPTY);
		genre.setText(EMPTY);
		noOfPages.setText(EMPTY);
		edition.setText(EMPTY);
		yearPublished.setText(EMPTY);
		isbn.setText(EMPTY);
		quantity.setText(EMPTY);
		price.setText(EMPTY);
	}

	public JButton getAddButton() {
		return addButton;
	}

}
