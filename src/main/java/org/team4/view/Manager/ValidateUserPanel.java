package org.team4.view.Manager;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class ValidateUserPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public ValidateUserPanel() {
		initValidate();
	}
	
	public void initValidate() {
		setBounds(100, 100, 788, 520);
		setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
	    panel.setLayout(null);
		
		JLabel TitleLabel = new JLabel("Validate User");
		TitleLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		TitleLabel.setBounds(328, 28, 132, 16);
		add(TitleLabel);
		
		add(panel, BorderLayout.CENTER);
		
	}

}
