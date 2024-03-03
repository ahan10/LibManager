package org.team4.view.authentication;

import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.team4.controller.authentication.AuthController;

public class AuthFrame extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private CardLayout cardLayout;
	private LoginPanel loginPanel = new LoginPanel();
	private RegisterPanel registerationPanel = new RegisterPanel();
	private AuthController authController;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AuthFrame frame = new AuthFrame();
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
	public AuthFrame() {
		contentPane = new JPanel();
		cardLayout = new CardLayout();
		contentPane.setLayout(cardLayout);
		setTitle("LibManager");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 500);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		authController = new AuthController(this);
		
		setContentPane(contentPane);
		
		setLocationRelativeTo(null);
	
		contentPane.add(loginPanel, "login");
		contentPane.add(registerationPanel,"register");
		
		cardLayout.show(contentPane, "login");
		
		loginPanel.getLoginButton().addActionListener(authController);
		loginPanel.getRegisterationButton().addActionListener(authController);
		
		registerationPanel.getLoginButton().addActionListener(authController);
		registerationPanel.getLoginButton().addActionListener(authController);
	}

	public LoginPanel getLoginPanel() {
		return loginPanel;
	}

	public RegisterPanel getRegisterationPanel() {
		return registerationPanel;
	}

	public void showRegisterPanel() {
		cardLayout.show(contentPane, "register");
	}

	public void showLoginPanel() {
		cardLayout.show(contentPane, "login");
	}
	
	

}
