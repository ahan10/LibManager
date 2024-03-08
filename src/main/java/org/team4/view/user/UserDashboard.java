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
	private JButton logoutButton;
	private JButton homeButton;
	private JTextField SearchTextField;

	private final String HOME_PANEL = "Home Panel";
	private final String SUBSCRIBE_PANEL = "Subscribe Panel";
	private final String PURCHASE_PANEL = "Purchase Panel";
	private final String SEARCH_RESULTS_PANEL = "Search Panel";
	private final String REQUEST_PANEL = "Request Panel";


	private JPanel homePanel = new HomePanel(); 
	private JPanel subscribePanel = new SubscribePanel(); 
	private JPanel purchasePanel = new PurchasePanel(); 
	private SearchResultsPanel searchResultsPanel = new SearchResultsPanel();
	private RequestPanel requestPanel;

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
		setBounds(100, 100, 1200, 900);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		activityPanel = new JPanel();
		activityPanel.setBounds(12, 59, 1160, 740);

		cardLayout = new CardLayout();
		activityPanel.setLayout(cardLayout);

		requestPanel = new RequestPanel(user);
	}

	public void addSearchBar() {
		contentPane.setLayout(null);
		JLabel SearchLabel = new JLabel("Search:");
		SearchLabel.setBounds(12, 25, 61, 16);
		contentPane.add(SearchLabel);

		SearchTextField = new JTextField();
		SearchTextField.setBounds(66, 20, 300, 26);
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
		RentItemButton.setBounds(253, 812, 117, 29);


		contentPane.add(RentItemButton);
		SubscribeButton = new JButton("Subscribe");
		SubscribeButton.setBounds(465, 812, 117, 29);
		contentPane.add(SubscribeButton);

		PurchaseButton = new JButton("Purchase");


		RequestButton = new JButton("Request Book");

		RequestButton.setBounds(673, 812, 117, 29);
		contentPane.add(RequestButton);

		PurchaseButton.setBounds(864, 812, 117, 29);
		contentPane.add(PurchaseButton);

		subscribePanel.setBounds(0, 33, 788, 490);

		purchasePanel.setBounds(0, 33, 788, 490);
		
		logoutButton = new JButton("Logout");
		logoutButton.setBounds(1063, 19, 109, 27);
		contentPane.add(logoutButton);
		
		homeButton = new JButton("Home");
		homeButton.setBounds(49, 812, 117, 29);
		contentPane.add(homeButton);

	}


	public void addPanels() {
		
		contentPane.add(activityPanel);

		activityPanel.add(homePanel, HOME_PANEL);
		activityPanel.add(purchasePanel, PURCHASE_PANEL);
		activityPanel.add(subscribePanel, SUBSCRIBE_PANEL);
		activityPanel.add(requestPanel, REQUEST_PANEL);

		cardLayout.show(activityPanel, HOME_PANEL);// default panel have a user/home page

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
	
	public JButton getHomeButton() {
		return homeButton;
	}

	public JPanel getHomePanel() {
		return homePanel;
	}

	public JTextField getSearchTextField(){
		return this.SearchTextField;
	}

	public void changeToHomePanel(){
		cardLayout.show(activityPanel, HOME_PANEL);
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public RequestPanel getRequestPanel() {
		return requestPanel;
	}
}


