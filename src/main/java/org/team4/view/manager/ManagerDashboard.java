package org.team4.view.manager;

import org.team4.controller.managerdashboard.AddItemController;
import org.team4.controller.managerdashboard.ManageItemController;
import org.team4.controller.managerdashboard.ManagerController;
import org.team4.model.user.User;
import org.team4.view.manager.add.AddItemPanel;
import org.team4.view.manager.manage.ManageItemPanel;
import org.team4.view.manager.validate.ValidateUserPanel;

import java.awt.CardLayout;
import java.awt.EventQueue;

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
	
	private ValidateUserPanel validateUserPanel = new ValidateUserPanel();

	private ManageItemPanel manageItemPanel = new ManageItemPanel();
	private ManageItemController manageItemController = new ManageItemController(manageItemPanel);
	
	private AddItemPanel addItemPanel = new AddItemPanel();
	private AddItemController addItemController = new AddItemController(addItemPanel);
	
	private User manager;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerDashboard frame = new ManagerDashboard();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);

					@SuppressWarnings("unused")
					ManagerController controller = new ManagerController(frame);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

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
		
		JLabel nameLabel = new JLabel(this.manager.getName());
		nameLabel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		nameLabel.setBounds(677, 11, 211, 16);
		contentPane.add(nameLabel);
		
//		JLabel nameLabel = new JLabel("TEST_NAME");
//		nameLabel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
//		nameLabel.setBounds(677, 11, 211, 16);
//		contentPane.add(nameLabel);
	}
	
	public void addPanels() {
		contentPane.add(activityPanel);
		
		activityPanel.add(validateUserPanel, VALIDATE_PANEL);
		activityPanel.add(addItemPanel, ADD_PANEL);
		activityPanel.add(manageItemPanel, MANAGE_PANEL);
		
		cardLayout.show(activityPanel, VALIDATE_PANEL);
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
	public ValidateUserPanel getValidateUserPanel() { return validateUserPanel; }

	public ManageItemPanel getManageItemPanel() { return manageItemPanel; }

	public void showValidateUserPanel() {
		cardLayout.show(activityPanel, VALIDATE_PANEL);
	}

	public void showAddItemPanel() {
		cardLayout.show(activityPanel, ADD_PANEL);
	}

	public void showManageItemPanel() {
		cardLayout.show(activityPanel, MANAGE_PANEL);
	}
}
