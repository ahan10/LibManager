package org.team4.view.manager;

import org.team4.model.user.User;
import org.team4.view.manager.add.AddItemPanel;
import org.team4.view.manager.manage.ManageItemPanel;
import org.team4.view.manager.notifications.NotificationPanel;
import org.team4.view.manager.requests.ViewRequestsPanel;
import org.team4.view.manager.validate.ValidateUserPanel;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.ComponentOrientation;

public class ManagerDashboard extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel activityPanel;
	private CardLayout cardLayout;
	private JButton LogOutButton;
	private JButton AddItemButton;
	private JButton ManageItemButton;
	private JButton ValidateUserButton;
	
	private final String VALIDATE_PANEL = "Validate User Panel";
	private final String ADD_PANEL = "Add Item Panel";
	private final String MANAGE_PANEL = "Manage ItemPanel";
	private final String NOTIFICATION_PANEL = "Notification Panel";
	private final String REQUESTS_PANEL = "Requests Panel";
	
	private ValidateUserPanel validateUserPanel = new ValidateUserPanel();
	private ManageItemPanel manageItemPanel = new ManageItemPanel();
	private AddItemPanel addItemPanel = new AddItemPanel();
	private NotificationPanel notificationPanel = new NotificationPanel();
	private ViewRequestsPanel requestsPanel = new ViewRequestsPanel();
	private User manager;
	private JButton NotificationButton, requestsButton;
	
	/**
	 * Create the frame.
	 */
	public ManagerDashboard() {
		initPanel();
		addButtons();
		addPanels();
	}
	
	public ManagerDashboard(User user) {
		this.manager = user;
		initPanel();
		addButtons();
		addPanels();
	}
	
	public void initPanel() {
		contentPane = new JPanel();
        contentPane.setLayout(null);
        
        this.setTitle("Manager Dashboard");
        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		activityPanel = new JPanel();
		activityPanel.setBounds(6, 46, 988, 720);
		
		cardLayout = new CardLayout();
		activityPanel.setLayout(cardLayout);
	}
	
	public void addButtons() {
		LogOutButton = new JButton("Log Out");
		LogOutButton.setBounds(900, 6, 94, 29);
		contentPane.add(LogOutButton);
		
		AddItemButton = new JButton("Add Item");
		AddItemButton.setBounds(264, 6, 117, 29);
		contentPane.add(AddItemButton);
		
		ManageItemButton = new JButton("Manage Item");
		ManageItemButton.setBounds(135, 6, 117, 29);
		contentPane.add(ManageItemButton);
		
		ValidateUserButton = new JButton("Validate User");
		ValidateUserButton.setBounds(6, 6, 117, 29);
		contentPane.add(ValidateUserButton);
		
		NotificationButton = new JButton("Notifications");
		NotificationButton.setBounds(393, 6, 117, 29);
		contentPane.add(NotificationButton);
		
		JLabel nameLabel = new JLabel(this.manager.getName());
		nameLabel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		nameLabel.setBounds(677, 11, 211, 16);
		contentPane.add(nameLabel);
		
	}
	
	public void addPanels() {
		contentPane.add(activityPanel);
		
		activityPanel.add(validateUserPanel, VALIDATE_PANEL);
		activityPanel.add(addItemPanel, ADD_PANEL);
		activityPanel.add(manageItemPanel, MANAGE_PANEL);
		activityPanel.add(notificationPanel, NOTIFICATION_PANEL);
		activityPanel.add(requestsPanel, REQUESTS_PANEL);
		
		cardLayout.show(activityPanel, VALIDATE_PANEL);
		
		requestsButton = new JButton("Requests");
		requestsButton.setBounds(522, 6, 117, 29);
		contentPane.add(requestsButton);
	}
	public JButton getLogOutButton() {
		return LogOutButton;
	}

	public JButton getAddItemButton() {
		return AddItemButton;
	}

	public JButton getManageItemButton() {
		return ManageItemButton;
	}

	public JButton getValidateUserButton() {
		return ValidateUserButton;
	}
	
	public JButton getNotificationButton() {
		return NotificationButton;
	}
	
	public JButton getRequestsButton() {
		return requestsButton;
	}
	
	public ValidateUserPanel getValidateUserPanel() { return validateUserPanel; }

	public ManageItemPanel getManageItemPanel() { return manageItemPanel; }
	
	public NotificationPanel getNotificationPanel() { return notificationPanel; }

	public void showValidateUserPanel() {
		cardLayout.show(activityPanel, VALIDATE_PANEL);
	}

	public void showAddItemPanel() {
		cardLayout.show(activityPanel, ADD_PANEL);
	}

	public void showManageItemPanel() {
		cardLayout.show(activityPanel, MANAGE_PANEL);
	}
	
	public void showNotificationPanel() {
		cardLayout.show(activityPanel, NOTIFICATION_PANEL);
	}
	
	public void showRequestsPanel() {
		cardLayout.show(activityPanel, REQUESTS_PANEL);
	}
}
