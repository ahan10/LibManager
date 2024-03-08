package org.team4.view.manager.add;

import java.awt.*;

import javax.swing.*;

public class AddItemPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private static final String BOOK_VIEW = "Book";
	private static final String DVD_VIEW = "DVD";
	private static final String MAGAZINE_VIEW = "Magazine";
	
	private AddBookPanel addBookPanel = new AddBookPanel();
	private AddDVDPanel addDVDPanel = new AddDVDPanel();

	private CardLayout cardLayout;
	private JPanel viewPanel;
	private JPanel panel;

	private JButton bookButton;
	private JButton dvdButton;
	private JButton magazineButton;

	/**
	 * Create the panel.
	 */
	public AddItemPanel() {
		initAdd();
	}
	
	public void initAdd() {
		setBounds(100, 100, 988, 720);
		setLayout(new BorderLayout());
		
		panel = new JPanel();
		
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel TitleLabel = new JLabel("Add Item");
		TitleLabel.setBounds(428, 25, 89, 25);
		panel.add(TitleLabel);
		TitleLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));

		viewPanel = new JPanel();
		viewPanel.setBounds(6, 87, 976, 627);

		cardLayout = new CardLayout();
		viewPanel.setLayout(cardLayout);
		panel.add(viewPanel);

		addButtons();
		addPanels();
	}

	private void addButtons(){
		bookButton = new JButton("Books");
		bookButton.setBounds(34, 55, 117, 29);
		panel.add(bookButton);

		dvdButton = new JButton("DVD");
		dvdButton.setBounds(163, 55, 117, 29);
		panel.add(dvdButton);

		magazineButton = new JButton("Magazine");
		magazineButton.setBounds(292, 55, 117, 29);
		panel.add(magazineButton);
	}
	
	private void addPanels() {
		viewPanel.add(addBookPanel, BOOK_VIEW);
		viewPanel.add(addDVDPanel, DVD_VIEW);
		
		cardLayout.show(viewPanel, BOOK_VIEW);
	}
	

	public AddBookPanel getAddBookPanel() {
		return addBookPanel;
	}
	
	public AddDVDPanel getAddDVDPanel() {
		return addDVDPanel;
	}

	public JButton getBookButton() {
		return bookButton;
	}

	public JButton getDvdButton() {
		return dvdButton;
	}

	public JButton getMagazineButton() {
		return magazineButton;
	}
	
	public void changeToBook() {
		cardLayout.show(viewPanel, BOOK_VIEW);
	}
	
	public void changeToDVD() {
		cardLayout.show(viewPanel, DVD_VIEW);
	}
	
}
