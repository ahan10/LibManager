package org.team4.view.manager.manage;

import org.team4.view.manager.manage.book.ManageBookPanel;
import org.team4.view.manager.manage.dvd.ManageDVDPanel;
import org.team4.view.manager.manage.magazine.ManageMagazinePanel;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

public class ManageItemPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private CardLayout cardLayout;
	private JPanel viewPanel;
	private JPanel panel;
	
	private ManageBookPanel manageBookPanel= new ManageBookPanel();
	private ManageDVDPanel manageDVDPanel = new ManageDVDPanel();
	private ManageMagazinePanel manageMagazinePanel = new ManageMagazinePanel();
	
	private static final String BOOK_VIEW = "Book";
	private static final String DVD_VIEW = "DVD";
	private static final String MAGAZINE_VIEW = "Magazine";
	
	private JButton bookButton;
	private JButton dvdButton;
	private JButton magazineButton;
	/**
	 * Create the panel.
	 */
	public ManageItemPanel() {
		initManage();
	}
	
	public void initManage() {
		setBounds(100, 100, 988, 720);
		setLayout(new BorderLayout());
		
		panel = new JPanel();
	    panel.setLayout(null);
		
		add(panel, BorderLayout.CENTER);
		
		JLabel TitleLabel = new JLabel("Manage Item");
		panel.add(TitleLabel);
		TitleLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		TitleLabel.setBounds(428, 25, 123, 25);
		
		
		viewPanel = new JPanel();
		viewPanel.setBounds(6, 87, 976, 627);
		
		cardLayout = new CardLayout();
		viewPanel.setLayout(cardLayout);
		panel.add(viewPanel);
		
		addButtons();
		addPanels();
	}

	private void addPanels() {

		viewPanel.add(manageBookPanel, BOOK_VIEW);
		viewPanel.add(manageDVDPanel, DVD_VIEW);
		viewPanel.add(manageMagazinePanel, MAGAZINE_VIEW);

		cardLayout.show(viewPanel, BOOK_VIEW);
	}
	
	private void addButtons() {
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

	public ManageBookPanel getManageBookPanel() {
		return manageBookPanel;
	}

	public ManageDVDPanel getManageDVDPanel() {
		return manageDVDPanel;
	}

	public ManageMagazinePanel getManageMagazinePanel() {
		return manageMagazinePanel;
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

	public void changeToBookPanel(){
		cardLayout.show(viewPanel, BOOK_VIEW);
	}

	public void changeToDvdPanel(){
		cardLayout.show(viewPanel, DVD_VIEW);
	}

	public void changeToMagazinePanel(){
		cardLayout.show(viewPanel, MAGAZINE_VIEW);
	}

}
