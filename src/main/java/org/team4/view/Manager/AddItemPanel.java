package org.team4.view.Manager;

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
		setBounds(100, 100, 788, 520);
		setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
	    panel.setLayout(null);
		
		JLabel TitleLabel = new JLabel("Add Item");
		TitleLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		TitleLabel.setBounds(328, 28, 132, 16);
		add(TitleLabel);
		
		add(panel, BorderLayout.CENTER);
		
	}

}
