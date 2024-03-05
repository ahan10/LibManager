package org.team4.view.user;
import org.team4.*;
import org.team4.maintaindb.MaintainBooks;
import org.team4.model.items.Book;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class UserDashboard extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JPanel activityPanel;
	private CardLayout cardLayout;

	private JButton RentItemButton;
	private JButton SubscribeButton;
	private JButton PurchaseButton;
	private JTextField SearchTextField;

	private final String RENT_PANEL = "Rent Item Panel";
	private final String SUBSCRIBE_PANEL = "Subscribe Panel";
	private final String PURCHASE_PANEL = "Purchase Panel";
	private final String SEARCH_RESULTS_PANEL = "Search Panel";
	

	private JPanel rentItemPanel = new RentItemPanel(); 
	private JPanel subscribePanel = new SubscribePanel(); 
	private JPanel purchasePanel = new PurchasePanel(); 
	private SearchResultsPanel searchResultsPanel;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserDashboard frame = new UserDashboard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public UserDashboard() {
		initPanel();
		addSearchBar();
		addButtons();
		addPanels();
	}

	public void initPanel() {
		contentPane = new JPanel();

		this.setTitle("User Dashboard");
		setLocationRelativeTo(null);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		activityPanel = new JPanel();
		activityPanel.setBounds(0, 33, 788, 490);

		cardLayout = new CardLayout();
		activityPanel.setLayout(cardLayout);
	}

	public void addSearchBar() {
		contentPane.setLayout(null);
		JLabel SearchLabel = new JLabel("Search:");
		SearchLabel.setBounds(6, 6, 61, 16);
		contentPane.add(SearchLabel);

		SearchTextField = new JTextField();
		SearchTextField.setBounds(60, 1, 300, 26);
		SearchTextField.setColumns(10);
		contentPane.add(SearchTextField);
		 SearchTextField.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                performSearch(SearchTextField.getText());
	            }
	        });
	}
	private void performSearch(String query) {
	    ArrayList<Book> searchResults = null;
	    try {
	        searchResults = MaintainBooks.searchBooks(query);
	        updateSearchResultsPanel(searchResults);
	        cardLayout.show(activityPanel, SEARCH_RESULTS_PANEL);
	    } catch (Exception e) {
	        e.printStackTrace();
	       
	    }
	}
	 
	 private void updateSearchResultsPanel(ArrayList<Book> results) {
		    searchResultsPanel = new SearchResultsPanel(results);
		    activityPanel.add(searchResultsPanel, SEARCH_RESULTS_PANEL);
		    cardLayout.show(activityPanel, SEARCH_RESULTS_PANEL); 
		}

	public void addButtons() {
		RentItemButton = new JButton("Rent an Item");
		RentItemButton.setBounds(23, 521, 117, 29);
		contentPane.add(RentItemButton);
		SubscribeButton = new JButton("Subscribe");
		SubscribeButton.setBounds(354, 521, 117, 29);
		contentPane.add(SubscribeButton);

		PurchaseButton = new JButton("Purchase");
		PurchaseButton.setBounds(616, 521, 117, 29);
		contentPane.add(PurchaseButton);
		//		contentPane.add(purchasePanel);
		PurchaseButton.addActionListener(this);
		SubscribeButton.addActionListener(this);
		RentItemButton.addActionListener(this);

		subscribePanel.setBounds(0, 33, 788, 490);

		purchasePanel.setBounds(0, 33, 788, 490);


	}

	public void addPanels() {

		contentPane.add(activityPanel);

		activityPanel.add(rentItemPanel, RENT_PANEL);
		activityPanel.add(purchasePanel, PURCHASE_PANEL);
		activityPanel.add(subscribePanel, SUBSCRIBE_PANEL);

		cardLayout.show(activityPanel, RENT_PANEL);// default panel have a user/home page




	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == RentItemButton) {
			cardLayout.show(activityPanel, RENT_PANEL);
		} else if (e.getSource() == SubscribeButton) {
			cardLayout.show(activityPanel, SUBSCRIBE_PANEL);
		} else if (e.getSource() == PurchaseButton) {
			cardLayout.show(activityPanel, PURCHASE_PANEL);
		}
	}
}

