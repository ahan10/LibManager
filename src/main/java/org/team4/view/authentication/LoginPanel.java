package org.team4.view.authentication;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class LoginPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField emailField;
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	public LoginPanel() {
		initLoginPanel();
	}
	
	private void initLoginPanel() {
		
		setBounds(100, 100, 750, 500);
		setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
	    panel.setLayout(null);
	    
	    add(panel, BorderLayout.CENTER);
		
		JLabel titleLabel = new JLabel("Login");
		titleLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		titleLabel.setBounds(346, 33, 58, 32);
		panel.add(titleLabel);
		
		emailField = new JTextField();
		emailField.setBounds(157, 122, 435, 26);
		panel.add(emailField);
		emailField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(157, 188, 435, 26);
		panel.add(passwordField);
		
		JLabel emailLabel = new JLabel("Enter Email");
		emailLabel.setBounds(157, 94, 76, 16);
		panel.add(emailLabel);
		
		JLabel passwordLabel = new JLabel("Enter Passowrd");
		passwordLabel.setBounds(157, 160, 106, 16);
		panel.add(passwordLabel);
		
		JButton loginButton = new JButton("Login");
		loginButton.setBounds(157, 240, 435, 29);
		panel.add(loginButton);
		
		JButton registerationButton = new JButton("Register");
		registerationButton.setBounds(157, 281, 435, 29);
		panel.add(registerationButton);
	    
	}
}
