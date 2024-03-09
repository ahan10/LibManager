package org.team4.view.user;

import javax.swing.JPanel;

import java.awt.Font;

import javax.swing.JLabel;

class HomePanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
    public HomePanel() {
        setLayout(null);
        setBounds(100, 100, 1160, 740);
       
        JLabel label = new JLabel("Welcome to LibManager");
        label.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        label.setBounds(444, 11, 237, 26);
		add(label);
    }
}



