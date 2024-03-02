package org.team4.view.Manager;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class ManagerDashboard extends JFrame implements ActionListener{

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

	private JPanel validateUserPanel = new ValidateUserPanel();
	private JPanel addItemPanel = new AddItemPanel();
	private JPanel manageItemPanel = new ManageItemPanel();
	
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
	
	public void initPanel() {
		contentPane = new JPanel();
        contentPane.setLayout(null);
        
        this.setTitle("Manager Dashboard");
        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		activityPanel = new JPanel();
		activityPanel.setBounds(6, 46, 788, 520);
		
		cardLayout = new CardLayout();
		activityPanel.setLayout(cardLayout);
	}
	
	public void addButtons() {
		LogOutButton = new JButton("Log Out");
		LogOutButton.setBounds(700, 6, 94, 29);
		LogOutButton.addActionListener(this);
		contentPane.add(LogOutButton);
		
		AddItemButton = new JButton("Add Item");
		AddItemButton.setBounds(264, 6, 117, 29);
		AddItemButton.addActionListener(this);
		contentPane.add(AddItemButton);
		
		ManageItemButton = new JButton("Manage Item");
		ManageItemButton.setBounds(135, 6, 117, 29);
		ManageItemButton.addActionListener(this);
		contentPane.add(ManageItemButton);
		
		ValidateUserButton = new JButton("Validate User");
		ValidateUserButton.setBounds(6, 6, 117, 29);
		ValidateUserButton.addActionListener(this);
		contentPane.add(ValidateUserButton);
	}
	
	public void addPanels() {
		contentPane.add(activityPanel);
		
		activityPanel.add(validateUserPanel, VALIDATE_PANEL);
		activityPanel.add(addItemPanel, ADD_PANEL);
		activityPanel.add(manageItemPanel, MANAGE_PANEL);
		
		cardLayout.show(activityPanel, VALIDATE_PANEL);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == ValidateUserButton) {
			cardLayout.show(activityPanel, VALIDATE_PANEL);
		}else if(e.getSource() == AddItemButton) {
			cardLayout.show(activityPanel, ADD_PANEL);
		}else if(e.getSource() == ManageItemButton) {
			cardLayout.show(activityPanel, MANAGE_PANEL);
		}
	}
	
}
