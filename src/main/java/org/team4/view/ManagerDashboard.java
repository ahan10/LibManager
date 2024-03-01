package org.team4.view;

import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class ManagerDashboard extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private CardLayout cardLayout;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerDashboard frame = new ManagerDashboard();
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
		
		contentPane = new JPanel();
        cardLayout = new CardLayout();
        contentPane.setLayout(cardLayout);
        
        this.setTitle("Manager Dashboard");
        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton LogOutButton = new JButton("Log Out");
		LogOutButton.setBounds(700, 6, 94, 29);
		contentPane.add(LogOutButton);
		
		JButton AddItemButton = new JButton("Add Item");
		AddItemButton.setBounds(264, 6, 117, 29);
		contentPane.add(AddItemButton);
		
		JButton ManageItemButton = new JButton("Manage Item");
		ManageItemButton.setBounds(135, 6, 117, 29);
		contentPane.add(ManageItemButton);
		
		JButton ValidateUserButton = new JButton("Validate User");
		ValidateUserButton.setBounds(6, 6, 117, 29);
		contentPane.add(ValidateUserButton);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 46, 788, 520);
		contentPane.add(panel);
	}
}
