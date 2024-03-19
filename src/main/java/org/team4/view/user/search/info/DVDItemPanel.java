package org.team4.view.user.search.info;

import javax.swing.JFrame;
import javax.swing.JPanel;
import org.team4.model.items.DVD;
import org.team4.model.user.User;

import javax.swing.JLabel;
import java.awt.Font;
import java.util.Random;
import javax.swing.JButton;

public class DVDItemPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private JFrame window;
	private DVD dvd;
	private JLabel lblTitleValue = new JLabel();
	private JLabel lblGenreValue = new JLabel();
	private JLabel lblISBNValue = new JLabel();
	private JLabel lblDurationValue = new JLabel();
	private JLabel lblYearPublishedValue = new JLabel();
	private JLabel lblQuantityValue = new JLabel();
	private JLabel lblPriceValue = new JLabel();
	private JLabel lblLocationValue = new JLabel();
	private JButton btnBuy, btnRent;


	public DVDItemPanel(JFrame window, DVD dvd, User user) {
		this.window = window;
		this.dvd = dvd;

		setLayout(null);

		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblTitle.setBounds(20, 20, 45, 13);
		
		JLabel lblGenre = new JLabel("Genre:");
		lblGenre.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblGenre.setBounds(20, 40, 45, 13);
		
		JLabel lblISBN = new JLabel("ISBN:");
		lblISBN.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblISBN.setBounds(20, 60, 45, 13);
		
		JLabel lblYearPublished = new JLabel("Published:");
		lblYearPublished.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblYearPublished.setBounds(20, 80, 100, 13);
		
		JLabel lblDuration = new JLabel("Duration: ");
		lblDuration.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblDuration.setBounds(20, 100, 100, 13);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblPrice.setBounds(20, 120, 70, 13);
		
		JLabel lblQuantity = new JLabel("Quantity:");
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblQuantity.setBounds(20, 140, 70, 13);

		JLabel lblLocation = new JLabel("Location:");
		lblLocation.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblLocation.setBounds(20, 160, 70, 13);
		
		add(lblTitle);
		add(lblGenre);
		add(lblISBN);
		add(lblYearPublished);
		add(lblDuration);
		add(lblPrice);
		add(lblQuantity);
		add(lblLocation);

		lblTitleValue.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblTitleValue.setBounds(100, 20, 200, 13);
		
		lblGenreValue.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblGenreValue.setBounds(100, 40, 200, 13);
		
		lblISBNValue.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblISBNValue.setBounds(100, 60, 200, 13);

		lblYearPublishedValue.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblYearPublishedValue.setBounds(100, 80, 180, 13);
		
		lblDurationValue.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblDurationValue.setBounds(100, 100, 200, 13);
		
		lblPriceValue.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblPriceValue.setBounds(100, 120, 200, 13);
		
		lblQuantityValue.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblQuantityValue.setBounds(100, 140, 200, 13);

		lblLocationValue.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblLocationValue.setBounds(100, 160, 200, 13);
		
		add(lblTitleValue);
		add(lblGenreValue);
		add(lblISBNValue);

		add(lblYearPublishedValue);
		add(lblDurationValue);
		add(lblPriceValue);
		add(lblQuantityValue);
		add(lblLocationValue);
		
		btnBuy = new JButton("Buy");
		btnBuy.setBounds(20, 200, 85, 21);
		add(btnBuy);

		btnRent = new JButton("Rent");
		btnRent.setBounds(160, 200, 85, 21);
		add(btnRent);

		btnRent.setEnabled(this.dvd.isRentable());
		btnBuy.setEnabled(this.dvd.isPurchasable());

	}
	
	
	public void showItemInfo() {
		lblTitleValue.setText(dvd.getTitle());
		lblGenreValue.setText(dvd.getGenre());
		lblISBNValue.setText(dvd.getISBN());

		lblYearPublishedValue.setText(dvd.getYearPublished() + "");
		lblDurationValue.setText(dvd.getDuration() + " mins");
		lblPriceValue.setText("$" + dvd.getPrice() + "");
		lblQuantityValue.setText(dvd.getQuantity() + "");

		int randomNumber = new Random().nextInt(5) + 1;

		String locationString = dvd.getGenre() + " Section " + randomNumber;

		lblLocationValue.setText(locationString);
	}


	public void setWindow(JFrame window) {
		this.window = window;
	}

	public void setDVD(DVD dvd) {
		this.dvd = dvd;
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

	public DVD getDvd() {
		return dvd;
	}
}
