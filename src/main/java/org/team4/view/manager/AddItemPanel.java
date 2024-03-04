package org.team4.view.manager;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class AddItemPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public AddItemPanel() {
		initAdd();
	}
	
	public void initAdd() {
		setBounds(100, 100, 988, 720);
		setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel TitleLabel = new JLabel("Add Item");
		TitleLabel.setBounds(428, 25, 89, 25);
		panel.add(TitleLabel);
		TitleLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		
	}

}
