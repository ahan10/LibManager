package org.team4.view.manager.add;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import org.team4.model.items.Item;
import org.team4.model.items.Magazine;
import org.team4.model.items.builder.MagazineBuilder;
import org.team4.model.items.decorator.PurchasableItemDecorator;
import org.team4.model.items.decorator.RentableItemDecorator;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class AddMagazinePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private static final String EMPTY = "";
	private static final double PRICE = 0.0;

	private JPanel panel;
	
	private JButton addButton;
	private JTextField titleField;
	private JTextField yearField;
	private JTextField publisherField;
	private JTextField issueField;
	private JTextField quantityField;
	private JComboBox canRentComboBox;
	private JTextField isbnField;

	/**
	 * Create the panel.
	 */
	public AddMagazinePanel() {
		initComponents();

	}
	
	private void initComponents() {
		setBounds(100, 100, 976, 627);
		setLayout(new BorderLayout());

		panel = new JPanel();
		panel.setLayout(null);

		add(panel, BorderLayout.CENTER);

		JLabel titleLabel = new JLabel("Add Magazine");
		titleLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		titleLabel.setBounds(424, 53, 128, 22);
		panel.add(titleLabel);

		addButton();
		addLabels();
		addFields();
	}
	
	private void addButton() {
		addButton = new JButton("Add");
		addButton.setBounds(432, 516, 117, 29);
		panel.add(addButton);
	}
	
	private void addLabels() {
		JLabel WARN_LABEL = new JLabel("PLEASE FILL ALL FIELDS WITH APPROPRIATE DATA");
		WARN_LABEL.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		WARN_LABEL.setHorizontalAlignment(SwingConstants.CENTER);
		WARN_LABEL.setBounds(323, 87, 330, 16);
		panel.add(WARN_LABEL);

		JLabel magazineTitleLabel = new JLabel("Title:");
		magazineTitleLabel.setBounds(182, 162, 61, 16);
		panel.add(magazineTitleLabel);

		JLabel yearLabel = new JLabel("Year Published:");
		yearLabel.setBounds(182, 210, 107, 16);
		panel.add(yearLabel);

		JLabel rentLabel = new JLabel("Can Rent:");
		rentLabel.setBounds(182, 402, 76, 16);
		panel.add(rentLabel);

		JLabel quantityLabel = new JLabel("Quantity");
		quantityLabel.setBounds(182, 354, 61, 16);
		panel.add(quantityLabel);
		
		JLabel publisherLabel = new JLabel("Publisher:");
		publisherLabel.setBounds(182, 258, 91, 16);
		panel.add(publisherLabel);
		
		JLabel issueLabel = new JLabel("Issue Number:");
		issueLabel.setBounds(182, 308, 91, 16);
		panel.add(issueLabel);
		
		JLabel isbnLabel = new JLabel("ISBN:");
		isbnLabel.setBounds(182, 444, 61, 16);
		panel.add(isbnLabel);
	}
	
	private void addFields() {
		
		titleField = new JTextField();
		titleField.setBounds(323, 157, 383, 26);
		panel.add(titleField);
		titleField.setColumns(10);
		
		yearField = new JTextField();
		yearField.setBounds(323, 205, 383, 26);
		panel.add(yearField);
		yearField.setColumns(10);
		
		publisherField = new JTextField();
		publisherField.setBounds(323, 253, 383, 26);
		panel.add(publisherField);
		publisherField.setColumns(10);
		
		issueField = new JTextField();
		issueField.setBounds(323, 303, 128, 26);
		panel.add(issueField);
		issueField.setColumns(10);
		
		quantityField = new JTextField();
		quantityField.setBounds(323, 349, 130, 26);
		panel.add(quantityField);
		quantityField.setColumns(10);
		
		canRentComboBox = new JComboBox();
		canRentComboBox.setModel(new DefaultComboBoxModel(new String[] {"false", "true"}));
		canRentComboBox.setBounds(323, 398, 128, 27);
		panel.add(canRentComboBox);
		
		isbnField = new JTextField();
		isbnField.setBounds(323, 439, 130, 26);
		panel.add(isbnField);
		isbnField.setColumns(10);
		
	}
	
	public Magazine getMagazine() {
		
		String title = titleField.getText();
		String publisher = publisherField.getText();
		String isbn = isbnField.getText();
		
		int year = Integer.parseInt(yearField.getText());
		int quantity = Integer.parseInt(quantityField.getText());
		int issue = Integer.parseInt(issueField.getText());
		
		boolean rent = Boolean.parseBoolean(canRentComboBox.getSelectedItem().toString());
		
		Item newMagazine = ((MagazineBuilder) new MagazineBuilder()
				.title(title)
				.yearPublished(year))
				.publisher(publisher)
				.issueNumber(issue)
				.price(PRICE)
				.quantity(quantity)
				.ISBN(isbn)
				.build();
		
		if(rent) {
            RentableItemDecorator rentableDecorator = new RentableItemDecorator(newMagazine);
            newMagazine = rentableDecorator.getItem();
        }
		
		clearFields();
		
		return (Magazine) newMagazine;
	}
	
	public JButton getAddButton() {
		return addButton;
	}
	
	private void clearFields() {
		titleField.setText(EMPTY);
		publisherField.setText(EMPTY);
		yearField.setText(EMPTY);
		quantityField.setText(EMPTY);
		issueField.setText(EMPTY);
		isbnField.setText(EMPTY);
	}

}
