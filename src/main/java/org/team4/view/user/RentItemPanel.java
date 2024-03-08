package org.team4.view.user;

import javax.swing.JPanel;

import java.awt.Font;

import javax.swing.JLabel;

class RentItemPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
    public RentItemPanel() {
        setBounds(100, 100, 1160, 740);
        setLayout(null);
       
        JLabel label = new JLabel("Rent Item ");
        label.setBounds(528, 11, 104, 26);
        label.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		add(label);
    }
}



