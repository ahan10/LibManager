package org.team4.view.purchase;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JYearChooser;
import javax.swing.JButton;

public class CreditCardPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField ccNumberField;
	private JButton processButton;
	private JMonthChooser monthChooser;
	private JYearChooser yearChooser;

	public CreditCardPanel() {
		initCC();
	}
	
	private void initCC() {
		setBounds(100, 100, 342, 508);
		setLayout(null);
		
		JLabel titleLabel = new JLabel("Credit Card");
		titleLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		titleLabel.setBounds(122, 37, 98, 16);
		add(titleLabel);
		
		JLabel numberLabel = new JLabel("Enter Credit Card Number (max. 16 digits):");
		numberLabel.setBounds(26, 137, 292, 16);
		add(numberLabel);
		
		ccNumberField = new JTextField();
		ccNumberField.setBounds(26, 176, 292, 26);
		add(ccNumberField);
		ccNumberField.setColumns(10);
		
		JLabel expiryLabel = new JLabel("Enter Expiry Date:");
		expiryLabel.setBounds(26, 237, 125, 16);
		add(expiryLabel);
		
		JLabel monthLabel = new JLabel("Month:");
		monthLabel.setBounds(26, 283, 44, 16);
		add(monthLabel);
		
		JLabel yearLabel = new JLabel("Year:");
		yearLabel.setBounds(26, 320, 44, 16);
		add(yearLabel);
		
		monthChooser = new JMonthChooser();
		monthChooser.setBounds(82, 273, 137, 26);
		add(monthChooser);
		
		yearChooser = new JYearChooser();
		yearChooser.setBounds(82, 311, 48, 26);
		add(yearChooser);
		
		processButton = new JButton("Process");
		processButton.setBounds(112, 402, 117, 29);
		add(processButton);
	}
}
