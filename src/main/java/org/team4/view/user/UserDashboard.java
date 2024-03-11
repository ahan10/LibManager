package org.team4.view.user;
import org.team4.controller.userdashboard.UserController;
import org.team4.maintaindb.MaintainDatabase;
import org.team4.maintaindb.MaintainStudent;
import org.team4.model.items.Book;
import org.team4.model.items.DVD;
import org.team4.model.items.Magazine;
import org.team4.model.items.Newsletter;
import org.team4.model.user.Student;
import org.team4.model.user.User;
import org.team4.view.user.student.StudentPanel;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

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
	private JButton studentButton;
	private JTextField SearchTextField;

	private final String HOME_PANEL = "Home Panel";
	private final String SUBSCRIBE_PANEL = "Subscribe Panel";
	private final String PURCHASE_PANEL = "Purchase Panel";
	private final String SEARCH_RESULTS_PANEL = "Search Panel";
	private final String REQUEST_PANEL = "Request Panel";
	private final String STUDENT_PANEL = "Student Panel";



	private JPanel homePanel = new HomePanel();
	private JPanel subscribePanel = new SubscribePanel();
	private JPanel purchasePanel = new PurchasePanel();
	private BookResultsPanel bookResultsPanel = new BookResultsPanel();
	private StudentPanel studentPanel = new StudentPanel();

	private MagazineResultsPanel magazineResultsPanel = new MagazineResultsPanel();
	private DVDResultsPanel dvdResultsPanel = new DVDResultsPanel();
	private NewsletterResultsPanel newsletterResultsPanel = new NewsletterResultsPanel();

	private RequestPanel requestPanel;
	private JComboBox<String> searchTypeDropdown;
	private final String[] searchTypes = {"Book", "DVD", "Newsletter", "Magazine"};

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
		searchTypeDropdown = new JComboBox<>(searchTypes);
		searchTypeDropdown.setBounds(370, 20, 140, 26);
		contentPane.add(searchTypeDropdown);

	}
	public void performSearch(String query) {
		String selectedType = (String) searchTypeDropdown.getSelectedItem();
		ArrayList<?> searchResults = null;

		switch (selectedType) {
			case "Book":
				searchResults = MaintainDatabase.getInstance().getBookDatabase().searchBooks(query);
				break;
			case "DVD":
				searchResults = MaintainDatabase.getInstance().getDVDDatabase().searchDVDs(query);
				break;
			case "Newsletter":
				searchResults=MaintainDatabase.getInstance().getNewsletterDatabase().searchNewsletters(query);
				break;
			case "Magazine":
				searchResults= MaintainDatabase.getInstance().getMagazineDatabase().searchMagazines(query);

				break;
			default:
				break;
		}

		if (searchResults != null) {
			displaySearchResultsInNewWindow(searchResults, selectedType);
		}
	}


	private void updateSearchResultsPanel(ArrayList<?> results, String type) {

		if (bookResultsPanel != null) {
			activityPanel.remove(bookResultsPanel);
		}


		if ("Book".equals(type)) {

			bookResultsPanel = new BookResultsPanel((ArrayList<Book>) results);
			activityPanel.add(bookResultsPanel, SEARCH_RESULTS_PANEL);

		} else if ("DVD".equals(type)) {

			dvdResultsPanel = new DVDResultsPanel((ArrayList<DVD>) results);
			activityPanel.add(dvdResultsPanel, SEARCH_RESULTS_PANEL);

		} else if ("Newsletter".equals(type)) {

			newsletterResultsPanel= new NewsletterResultsPanel((ArrayList<Newsletter>) results);
			activityPanel.add(newsletterResultsPanel, SEARCH_RESULTS_PANEL);

		} else if ("Magazine".equals(type)) {

			magazineResultsPanel = new MagazineResultsPanel((ArrayList<Magazine>) results);
			activityPanel.add(magazineResultsPanel, SEARCH_RESULTS_PANEL);

		}



		cardLayout.show(activityPanel, SEARCH_RESULTS_PANEL);
		this.revalidate();
		this.repaint();
	}
	public DVDResultsPanel getDVDResultsPanel() {
		return this.dvdResultsPanel;
	}

	public BookResultsPanel getBookResultsPanel() {
		return this.bookResultsPanel;
	}

	public MagazineResultsPanel getMagazineResultsPanel() {
		return this.magazineResultsPanel;
	}

	public String getItemType() {

		String selectedItemType = (String) searchTypeDropdown.getSelectedItem();
		return selectedItemType;
	}
	public void displaySearchResultsInNewWindow(ArrayList<?> results, String type) {
		JFrame searchResultsFrame = new JFrame("Search Results");
		JPanel resultsPanel = null;
		searchResultsFrame.setContentPane(new JScrollPane(resultsPanel));

		searchResultsFrame.setSize(1200, 900);

		switch (type) {
			case "Book":
				resultsPanel = new BookResultsPanel((ArrayList<Book>) results);
				break;
			case "DVD":
				resultsPanel = new DVDResultsPanel((ArrayList<DVD>) results);
				break;
			case "Newsletter":
				resultsPanel = new NewsletterResultsPanel((ArrayList<Newsletter>) results);
				break;
			case "Magazine":
				resultsPanel = new MagazineResultsPanel((ArrayList<Magazine>) results);
				break;
			default:

				JOptionPane.showMessageDialog(this, "No results found.", "Search Error", JOptionPane.ERROR_MESSAGE);
				return;
		}

		searchResultsFrame.setContentPane(new JScrollPane(resultsPanel));

		searchResultsFrame.setLocationRelativeTo(null);
		searchResultsFrame.setVisible(true);
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
		
		studentButton = new JButton("StudentTemp");
		studentButton.setBounds(1020, 812, 117, 29);
		if (user.getType().equals("STUDENT")) {
			contentPane.add(studentButton);
		}
		

	}


	public void addPanels() {
		contentPane.add(activityPanel);

		activityPanel.add(homePanel, HOME_PANEL);
		activityPanel.add(purchasePanel, PURCHASE_PANEL);
		activityPanel.add(subscribePanel, SUBSCRIBE_PANEL);
		activityPanel.add(requestPanel, REQUEST_PANEL);
		activityPanel.add(studentPanel, STUDENT_PANEL);

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
	
	public JButton getStudentButton() {
		return studentButton;
	}

	public JButton getLogoutButton() {
		return logoutButton;
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
	
	public void changeToStudentPanel(User student) {
		if (studentPanel != null) {
			activityPanel.remove(studentPanel);
		}
		activityPanel.add(new StudentPanel(student), STUDENT_PANEL);
		cardLayout.show(activityPanel, STUDENT_PANEL);
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