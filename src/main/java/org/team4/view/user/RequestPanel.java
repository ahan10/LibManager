package org.team4.view.user;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class RequestPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
    public RequestPanel() {
        setLayout(null);
        setBounds(100, 100, 788, 520);
       
        JLabel label = new JLabel("Request Book");
        label.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        label.setBounds(348, 11, 140, 26);
		add(label);
    }
}
