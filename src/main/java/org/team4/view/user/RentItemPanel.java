package org.team4.view.user;

import javax.swing.JPanel;

import java.awt.Font;

import javax.swing.JLabel;

class RentItemPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
    public RentItemPanel() {
        setLayout(null);
        setBounds(100, 100, 1160, 740);
       
        JLabel label = new JLabel("Rent Item ");
        label.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        label.setBounds(348, 11, 104, 26);
		add(label);
    }
}



