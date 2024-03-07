package org.team4.view.user;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class RequestPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private JTextField textFieldTitle;
	private JTextField textFieldAuthor;
	private JLabel lblAuthor;
	private JTextField textFieldISBN;
	private JTextField textFieldEdition;
	
    public RequestPanel() {
        setBounds(100, 100, 788, 520);
		 setLayout(null);
    

        // Continue with the rest of your code...

		
		 JLabel lblRequestBook = new JLabel("Request Book");
		 lblRequestBook.setBounds(314, 5, 160, 26);
		 lblRequestBook.setHorizontalAlignment(SwingConstants.CENTER);
		 lblRequestBook.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		 add(lblRequestBook);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setBounds(246, 140, 66, 13);
		add(lblTitle);
		
		textFieldTitle = new JTextField();
		textFieldTitle.setBounds(340, 136, 186, 19);
		add(textFieldTitle);
		textFieldTitle.setColumns(10);
		
		JLabel lblISBN = new JLabel("ISBN:");
		lblISBN.setBounds(246, 196, 50, 13);
		lblISBN.setHorizontalAlignment(SwingConstants.LEFT);
		add(lblISBN);
		
		textFieldAuthor = new JTextField();
		textFieldAuthor.setBounds(340, 164, 186, 19);
		textFieldAuthor.setColumns(10);
		add(textFieldAuthor);
		
		JLabel lblEdition = new JLabel("Edition:");
		lblEdition.setBounds(246, 221, 66, 13);
		add(lblEdition);
		
		lblAuthor = new JLabel("Author:");
		lblAuthor.setHorizontalAlignment(SwingConstants.LEFT);
		lblAuthor.setBounds(246, 165, 66, 19);
		add(lblAuthor);
		
		JComboBox comboBoxBookType = new JComboBox();
		comboBoxBookType.setModel(new DefaultComboBoxModel(new String[] {"TextBook", "General Book"}));
		comboBoxBookType.setBounds(340, 248, 186, 21);
		add(comboBoxBookType);
		
		textFieldISBN = new JTextField();
		textFieldISBN.setColumns(10);
		textFieldISBN.setBounds(340, 192, 186, 19);
		add(textFieldISBN);
		
		textFieldEdition = new JTextField();
		textFieldEdition.setColumns(10);
		textFieldEdition.setBounds(340, 217, 186, 19);
		add(textFieldEdition);
		
		JLabel lblBookType = new JLabel("Book Type:");
		lblBookType.setBounds(246, 251, 78, 13);
		add(lblBookType);
		
		JButton submitButton = new JButton("Submit");
		submitButton.setBounds(335, 375, 117, 29);
		add(submitButton);
    }
}
