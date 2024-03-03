package org.team4.view.manager;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ManageItemPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public ManageItemPanel() {
		initManage();
	}
	
	public void initManage() {
		setBounds(100, 100, 788, 520);
		setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
	    panel.setLayout(null);
		
		add(panel, BorderLayout.CENTER);
		
		JLabel TitleLabel = new JLabel("Manage Item");
		panel.add(TitleLabel);
		TitleLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		TitleLabel.setBounds(328, 28, 132, 25);
		
	}

}
