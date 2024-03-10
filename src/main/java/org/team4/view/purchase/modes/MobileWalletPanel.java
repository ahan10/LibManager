package org.team4.view.purchase.modes;

import org.team4.model.paymentmodes.MobileWallet;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MobileWalletPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField phoneNumberField;
	private JButton processButton;

	/**
	 * Create the panel.
	 */
	public MobileWalletPanel() {
		initMobilePanel();
	}
	
	private void initMobilePanel() {
		setBounds(100, 100, 342, 508);
		setLayout(null);
		
		JLabel titleLabel = new JLabel("Mobile Wallet");
		titleLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		titleLabel.setBounds(112, 30, 117, 20);
		add(titleLabel);
		
		JLabel emailLabel = new JLabel("Enter a valid Phone Number:");
		emailLabel.setBounds(37, 220, 192, 16);
		add(emailLabel);
		
		phoneNumberField = new JTextField();
		phoneNumberField.setBounds(30, 258, 269, 26);
		add(phoneNumberField);
		phoneNumberField.setColumns(10);
		
		processButton = new JButton("Process");
		processButton.setBounds(112, 402, 117, 29);
		add(processButton);
	}

	public JButton getProcessButton() {
		return processButton;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumberField.getText();
	}

	public MobileWallet getMobileWallet(){
		return new MobileWallet(this.getPhoneNumber());
	}
}
