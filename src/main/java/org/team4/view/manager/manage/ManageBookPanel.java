package org.team4.view.manager.manage;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class ManageBookPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public ManageBookPanel() {
		initComponents();
	}

	private void initComponents() {
		setBounds(100, 100, 976, 627);
		setLayout(new BorderLayout());

		JPanel panel = new JPanel();
		panel.setLayout(null);

		add(panel, BorderLayout.CENTER);
		
		JLabel titleLabel = new JLabel("Manage Books");
		titleLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		titleLabel.setBounds(422, 23, 132, 22);
		panel.add(titleLabel);
	}
}
