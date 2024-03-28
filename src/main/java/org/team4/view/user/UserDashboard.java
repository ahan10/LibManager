package org.team4.view.user;
import org.team4.model.user.User;
import org.team4.view.user.faculty.FacultyPanel;
import org.team4.view.user.search.results.BookResultsPanel;
import org.team4.view.user.search.results.DVDResultsPanel;
import org.team4.view.user.search.results.MagazineResultsPanel;
import org.team4.view.user.search.results.NewsletterResultsPanel;
import org.team4.view.user.student.StudentPanel;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class UserDashboard extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JPanel activityPanel;
	private CardLayout cardLayout;
	private JButton RequestButton;
	private JButton logoutButton;
	private JButton homeButton;
	private JButton studentButton;
	private JButton facultyButton;


	private JTextField SearchTextField;

	private final String HOME_PANEL = "Home Panel";
	private final String REQUEST_PANEL = "Request Panel";
	private final String STUDENT_PANEL = "Student Panel";
	private final String FACULTY_PANEL = "Faculty Panel";

	private HomePanel homePanel;
	private StudentPanel studentPanel;
	private FacultyPanel facultyPanel;
	private RequestPanel requestPanel;
	private JPanel resultsPanel;

	private JComboBox<String> searchTypeDropdown;
	private final String[] searchTypes = {"Book", "DVD", "Newsletter", "Magazine"};

	private User user;

	public UserDashboard() {
		initPanel();
		addSearchBar();
		addButtons();
		addPanels();
	}

	public UserDashboard(User u) {
		this.user = u;
		initPanel();
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

		homePanel = new HomePanel(user);
		requestPanel = new RequestPanel(user);
		
		studentPanel = new StudentPanel();
		facultyPanel = new FacultyPanel();

		addSearchBar();
		addButtons();
		addPanels();
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

	public void displayResults(String query) {
		String type = (String) searchTypeDropdown.getSelectedItem();
		JFrame searchResultsFrame = new JFrame("Search Results");

		if ("Book".equals(type)) {

			resultsPanel = new BookResultsPanel(query, searchResultsFrame, this.user);
			((BookResultsPanel) resultsPanel).addSearchResults();

		} else if ("DVD".equals(type)) {

			resultsPanel = new DVDResultsPanel(query, searchResultsFrame, this.user);
			((DVDResultsPanel) resultsPanel).addSearchResults();

		} else if ("Newsletter".equals(type)) {

			resultsPanel= new NewsletterResultsPanel(query, searchResultsFrame, this.user);
			((NewsletterResultsPanel) resultsPanel).addSearchResults();

		}else if ("Magazine".equals(type)) {

			resultsPanel= new MagazineResultsPanel(query, searchResultsFrame, this.user);
			((MagazineResultsPanel) resultsPanel).addSearchResults();

		}

	}


	public String getItemType() {
		String selectedItemType = (String) searchTypeDropdown.getSelectedItem();
		return selectedItemType;
	}

	public void addButtons() {

		RequestButton = new JButton("Request Book");
		RequestButton.setBounds(792, 812, 117, 29);
		contentPane.add(RequestButton);

		logoutButton = new JButton("Logout");
		logoutButton.setBounds(1063, 19, 109, 27);
		contentPane.add(logoutButton);

		homeButton = new JButton("Home");
		homeButton.setBounds(49, 812, 117, 29);
		contentPane.add(homeButton);

		studentButton = new JButton("Student View");
		studentButton.setBounds(1020, 812, 117, 29);
		if (user.getType().equals("STUDENT")) {
			contentPane.add(studentButton);
		}
		
		facultyButton = new JButton("Faculty View");
		facultyButton.setBounds(1020, 812, 117, 29);
		if (user.getType().equals("FACULTY")) {
			contentPane.add(facultyButton);
		}
	}

	public void addPanels() {
		contentPane.add(activityPanel);

		activityPanel.add(homePanel, HOME_PANEL);
		activityPanel.add(requestPanel, REQUEST_PANEL);
		activityPanel.add(studentPanel, STUDENT_PANEL);
		activityPanel.add(facultyPanel, FACULTY_PANEL);

		cardLayout.show(activityPanel, HOME_PANEL);
	}

	public JButton getRequestButton() {
		return RequestButton;
	}

	public JButton getHomeButton() {
		return homeButton;
	}

	public JButton getStudentButton() {
		return studentButton;
	}
	
	public JButton getFacultyButton() {
		return facultyButton;
	}

	public JButton getLogoutButton() {
		return logoutButton;
	}

	public JTextField getSearchTextField(){
		return this.SearchTextField;
	}

	public void changeToHomePanel(){
		cardLayout.show(activityPanel, HOME_PANEL);
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
	
	public void changeToFacultyPanel(User faculty) {
		if (facultyPanel != null) {
			activityPanel.remove(facultyPanel);
		}
		activityPanel.add(new FacultyPanel(faculty), FACULTY_PANEL);
		cardLayout.show(activityPanel, FACULTY_PANEL);
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

	public HomePanel getHomePanel() {
		return this.homePanel;
	}
}