package org.team4.view.purchase.modes;

import org.team4.model.paymentmodes.PayPal;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PayPalPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField emailField;
	private JButton processButton;

	/**
	 * Create the panel.
	 */
	public PayPalPanel() {
		initPayPalPanel();
	}
	
	private void initPayPalPanel() {
		setBounds(100, 100, 342, 508);
		setLayout(null);
		
		JLabel titleLabel = new JLabel("PayPal");
		titleLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		titleLabel.setBounds(146, 30, 49, 20);
		add(titleLabel);
		
		JLabel emailLabel = new JLabel("Enter a valid PayPal Address:");
		emailLabel.setBounds(37, 220, 192, 16);
		add(emailLabel);
		
		emailField = new JTextField();
		emailField.setBounds(30, 258, 269, 26);
		add(emailField);
		emailField.setColumns(10);
		
		processButton = new JButton("Process");
		processButton.setBounds(112, 402, 117, 29);
		add(processButton);
	}
	
	public JButton getProcessButton() {
		return processButton;
	}
	
	public String getEmail() {
		return this.emailField.getText();
	}

	public PayPal getPayPal(){
		return new PayPal(this.getEmail());
	}
	
	public void clearField() {
		this.emailField.setText("");
	}
	
	public void setEmail(String email) {
		this.emailField.setText(email);
	}
	
}
