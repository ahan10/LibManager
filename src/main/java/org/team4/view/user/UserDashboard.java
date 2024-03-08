package org.team4.view.user;
import org.team4.controller.userdashboard.UserController;
import org.team4.maintaindb.MaintainBooks;
import org.team4.maintaindb.MaintainDatabase;
import org.team4.model.items.Book;
import org.team4.model.user.User;

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
import javax.swing.JOptionPane;

public class UserDashboard extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JPanel activityPanel;
	private CardLayout cardLayout;

	private JButton RentItemButton;
	private JButton SubscribeButton;
	private JButton PurchaseButton;
	private JButton RequestButton; 
	private JTextField SearchTextField;

	private final String RENT_PANEL = "Rent Item Panel";
	private final String SUBSCRIBE_PANEL = "Subscribe Panel";
	private final String PURCHASE_PANEL = "Purchase Panel";
	private final String SEARCH_RESULTS_PANEL = "Search Panel";
	private final String REQUEST_PANEL = "Request Panel";


	private JPanel rentItemPanel = new RentItemPanel(); 
	private JPanel subscribePanel = new SubscribePanel(); 
	private JPanel purchasePanel = new PurchasePanel(); 
	private SearchResultsPanel searchResultsPanel = new SearchResultsPanel();
	private JPanel requestPanel;

	private User user;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserDashboard frame = new UserDashboard();
					frame.setVisible(true);
					@SuppressWarnings("unused")
					UserController userController = new UserController(frame);
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
	
	public UserDashboard(User u) {
		this.user = u;
		initPanel();
		addSearchBar();
		addButtons();
		addPanels();
	}
	public User getCurrentUser() {
		return this.user;
	}
	public void setCurrentUser(User currentUser) {
		this.user = currentUser;
	}


	public void initPanel() {
		contentPane = new JPanel();

		this.setTitle("User Dashboard");
		this.setLocationRelativeTo(null);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		activityPanel = new JPanel();
		activityPanel.setBounds(0, 33, 788, 490);

		cardLayout = new CardLayout();
		activityPanel.setLayout(cardLayout);
		
		requestPanel = new RequestPanel();
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

	}
	public void performSearch(String query) {
	    ArrayList<Book> searchResults = null;

		searchResults = MaintainDatabase.getInstance().getBookDatabase().searchBooks(query);
		updateSearchResultsPanel(searchResults);
		cardLayout.show(activityPanel, SEARCH_RESULTS_PANEL);

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
		SubscribeButton.setBounds(230, 521, 117, 29);
		contentPane.add(SubscribeButton);

		PurchaseButton = new JButton("Purchase");
		
		
		RequestButton = new JButton("Request Book");
		
		RequestButton.setBounds(426, 521, 117, 29);
		contentPane.add(RequestButton);
		
		PurchaseButton.setBounds(637, 521, 117, 29);
		contentPane.add(PurchaseButton);

		subscribePanel.setBounds(0, 33, 788, 490);

		purchasePanel.setBounds(0, 33, 788, 490);
	}
	

	public void addPanels() {

		contentPane.add(activityPanel);

		activityPanel.add(rentItemPanel, RENT_PANEL);
		activityPanel.add(purchasePanel, PURCHASE_PANEL);
		activityPanel.add(subscribePanel, SUBSCRIBE_PANEL);
		activityPanel.add(requestPanel, REQUEST_PANEL);

		cardLayout.show(activityPanel, RENT_PANEL);// default panel have a user/home page
		
	}
	

	public JButton getRequestButton() {
		return RequestButton;
	}

	public JButton getRentItemButton() {
		return RentItemButton;
	}

	public JButton getSubscribeButton() {
		return SubscribeButton;
	}

	public JButton getPurchaseButton() {
		return PurchaseButton;
	}

	public JTextField getSearchTextField(){
		return this.SearchTextField;
	}

	public void changeToRentPanel(){
		cardLayout.show(activityPanel, RENT_PANEL);
	}

	public void changeToPurchasePanel(){
		cardLayout.show(activityPanel, PURCHASE_PANEL);
	}

	public void changeToSubscribePanel(){
		cardLayout.show(activityPanel, SUBSCRIBE_PANEL);
	}
	
	public void changeToRequestPanel(){
		cardLayout.show(activityPanel, REQUEST_PANEL);
	}
}


