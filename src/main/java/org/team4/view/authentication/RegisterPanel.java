package org.team4.view.authentication;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class RegisterPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField nameField;
	private JTextField emailField;
	private JPasswordField passwordField;
	private JTextField textField;
	private JComboBox comboBox;
	private JButton registerButton;
	private  JButton loginButton;

	/**
	 * Create the panel.
	 */
	public RegisterPanel() {
		initRegPage();
	}
	
	private void initRegPage() {
		setBounds(100, 100, 750, 500);
		setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
	    panel.setLayout(null);
	    
	    add(panel, BorderLayout.CENTER);
	    
	    JLabel titleLabel = new JLabel("Registeration");
	    titleLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
	    titleLabel.setBounds(312, 33, 126, 32);
	    panel.add(titleLabel);
	    
	    JLabel nameLabel = new JLabel("Full Name");
	    nameLabel.setBounds(149, 80, 68, 16);
	    panel.add(nameLabel);
	    
	    nameField = new JTextField();
	    nameField.setBounds(149, 108, 454, 26);
	    panel.add(nameField);
	    nameField.setColumns(10);
	    
	    JLabel emailLabel = new JLabel("Enter email");
	    emailLabel.setBounds(149, 146, 82, 16);
	    panel.add(emailLabel);
	    
	    emailField = new JTextField();
	    emailField.setBounds(149, 174, 454, 26);
	    panel.add(emailField);
	    emailField.setColumns(10);
	    
	    JLabel passwordLabel = new JLabel("Choose Password");
	    passwordLabel.setBounds(149, 212, 126, 16);
	    panel.add(passwordLabel);
	    
	    passwordField = new JPasswordField();
	    passwordField.setBounds(149, 240, 454, 26);
	    panel.add(passwordField);
	    
	    JLabel idLabel = new JLabel("Enter ID");
	    idLabel.setBounds(149, 278, 61, 16);
	    panel.add(idLabel);
	    
	    textField = new JTextField();
	    textField.setBounds(149, 306, 200, 26);
	    panel.add(textField);
	    textField.setColumns(10);
	    
	    comboBox = new JComboBox();
	    comboBox.setModel(new DefaultComboBoxModel(new String[] {"Student", "Faculty", "Non Faculty", "Visitor"}));
	    comboBox.setBounds(404, 307, 200, 27);
	    panel.add(comboBox);
	    
	    JLabel typeLabel = new JLabel("You are:");
	    typeLabel.setBounds(404, 278, 61, 16);
	    panel.add(typeLabel);
	    
	    registerButton = new JButton("Register");
	    registerButton.setBounds(149, 355, 454, 29);
	    panel.add(registerButton);
	    
	    loginButton = new JButton("Already a user? Sign In");
	    loginButton.setBounds(149, 396, 454, 29);
	    panel.add(loginButton);
	    
	}
	
	public JButton getRegisterButton() {
		return registerButton;
	}

	public JButton getLoginButton() {
		return loginButton;
	}
	
}
