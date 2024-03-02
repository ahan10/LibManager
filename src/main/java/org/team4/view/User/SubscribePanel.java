package org.team4.view.User;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class SubscribePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	 public SubscribePanel() {
		 	setBounds(100, 100, 788, 520);
	     
	        JLabel label = new JLabel("Subscribe ");
	        label.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
	        label.setBounds(328, 28, 132, 16);
			add(label);
	       
	    }

}
