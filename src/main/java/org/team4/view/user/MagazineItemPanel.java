package org.team4.view.user;

import javax.swing.JFrame;
import javax.swing.JPanel;
import org.team4.model.items.Magazine;
import org.team4.model.user.User;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class MagazineItemPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private JFrame window;
	private Magazine magazine;
	
	private JLabel lblTitleValue = new JLabel();
	private JLabel lblISBNValue = new JLabel();
	private JLabel lblYearPublishedValue = new JLabel();

	private JLabel lblPublisherValue = new JLabel();
	private JLabel lblIssueNumberValue = new JLabel();
	private JLabel lblQuantityValue = new JLabel();
	private JButton btnRent;
	private User user;


	public MagazineItemPanel(JFrame window, Magazine magazine, User user) {
		this.window = window;
		this.magazine = magazine;
		this.user = user;

		setLayout(null);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblTitle.setBounds(20, 20, 45, 13);
		
		JLabel lblISBN = new JLabel("ISBN:");
		lblISBN.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblISBN.setBounds(20, 40, 45, 13);
		
		JLabel lblYearPublished = new JLabel("Published:");
		lblYearPublished.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblYearPublished.setBounds(20, 60, 100, 13);
		

		JLabel lblPublisher = new JLabel("Publisher:");
		lblPublisher.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblPublisher.setBounds(20, 100, 100, 13);
		
		JLabel lblIssueNumber = new JLabel("Issue Number: ");
		lblIssueNumber.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblIssueNumber.setBounds(20, 120, 100, 13);
		
		JLabel lblQuantity = new JLabel("Quantity:");
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblQuantity.setBounds(20, 140, 70, 13);
		
		
		add(lblTitle);
		add(lblISBN);
		add(lblYearPublished);
		
		add(lblPublisher);
		add(lblIssueNumber);
		add(lblQuantity);
		

		lblTitleValue.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblTitleValue.setBounds(100, 20, 200, 13);
		
		lblISBNValue.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblISBNValue.setBounds(100, 40, 200, 13);
		
		lblYearPublishedValue.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblYearPublishedValue.setBounds(100, 60, 200, 13);
		
		lblPublisherValue.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblPublisherValue.setBounds(100, 100, 200, 13);
		
		lblIssueNumberValue.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblIssueNumberValue.setBounds(100, 120, 200, 13);
		
		lblQuantityValue.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblQuantityValue.setBounds(100, 140, 200, 13);

		
		add(lblTitleValue);
		add(lblISBNValue);
		add(lblYearPublishedValue);
		
		add(lblPublisherValue);
		add(lblIssueNumberValue);
		add(lblQuantityValue);
		
		btnRent = new JButton("Rent");
		btnRent.setBounds(90, 180, 85, 21);
		add(btnRent);
		

	}
	
	
	public void showItemInfo() {
		lblTitleValue.setText(magazine.getTitle());
		lblISBNValue.setText(magazine.getISBN());
		lblYearPublishedValue.setText(magazine.getYearPublished() + "");
		
		lblPublisherValue.setText(magazine.getPublisher());
		lblIssueNumberValue.setText(magazine.getIssueNumber() + "");
		lblQuantityValue.setText(magazine.getQuantity() + "");
	}


	public void setWindow(JFrame window) {
		this.window = window;
	}


	public void setMagazine(Magazine magazine) {
		this.magazine = magazine;
	}
	
	public JFrame getWindow() {
		return window;
	}

	public JButton getBtnRent() {
		return btnRent;
	}
}
