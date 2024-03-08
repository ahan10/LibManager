package org.team4.view.manager.manage;

import org.team4.view.manager.manage.book.ManageBookPanel;

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
	private ManageBookPanel manageBookPanel= new ManageBookPanel();
	
	private static final String BOOK_VIEW = "Book";
	/**
	 * Create the panel.
	 */
	public ManageItemPanel() {
		initManage();
	}
	
	public void initManage() {
		setBounds(100, 100, 988, 720);
		setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
	    panel.setLayout(null);
		
		add(panel, BorderLayout.CENTER);
		
		JLabel TitleLabel = new JLabel("Manage Item");
		panel.add(TitleLabel);
		TitleLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		TitleLabel.setBounds(428, 25, 123, 25);
		
		JButton bookButton = new JButton("Books");
		bookButton.setBounds(34, 55, 117, 29);
		panel.add(bookButton);
		
		JButton dvdButton = new JButton("DVD");
		dvdButton.setBounds(163, 55, 117, 29);
		panel.add(dvdButton);
		
		viewPanel = new JPanel();
		viewPanel.setBounds(6, 87, 976, 627);
		
		cardLayout = new CardLayout();
		viewPanel.setLayout(cardLayout);
		panel.add(viewPanel);
		
		addPanels();
	}

	public ManageBookPanel getManageBookPanel() {
		return manageBookPanel;
	}

	private void addPanels() {
		viewPanel.add(manageBookPanel, BOOK_VIEW);
		cardLayout.show(viewPanel, BOOK_VIEW);
	}
}
