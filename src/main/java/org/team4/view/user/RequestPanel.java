package org.team4.view.user;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
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
		 lblRequestBook.setBounds(330, 5, 127, 26);
		 lblRequestBook.setHorizontalAlignment(SwingConstants.CENTER);
		 lblRequestBook.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		 add(lblRequestBook);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setBounds(31, 70, 24, 13);
		add(lblTitle);
		
		textFieldTitle = new JTextField();
		textFieldTitle.setBounds(75, 67, 96, 19);
		add(textFieldTitle);
		textFieldTitle.setColumns(10);
		
		JLabel lblISBN = new JLabel("ISBN:");
		lblISBN.setBounds(31, 132, 26, 13);
		lblISBN.setHorizontalAlignment(SwingConstants.TRAILING);
		add(lblISBN);
		
		textFieldAuthor = new JTextField();
		textFieldAuthor.setBounds(75, 96, 96, 19);
		textFieldAuthor.setColumns(10);
		add(textFieldAuthor);
		
		JLabel lblEdition = new JLabel("Edition:");
		lblEdition.setBounds(31, 164, 34, 13);
		add(lblEdition);
		
		lblAuthor = new JLabel("Author:");
		lblAuthor.setHorizontalAlignment(SwingConstants.TRAILING);
		lblAuthor.setBounds(31, 93, 34, 19);
		add(lblAuthor);
		
		JComboBox comboBoxBookType = new JComboBox();
		comboBoxBookType.setModel(new DefaultComboBoxModel(new String[] {"TextBook", "General Book"}));
		comboBoxBookType.setBounds(75, 202, 96, 21);
		add(comboBoxBookType);
		
		textFieldISBN = new JTextField();
		textFieldISBN.setColumns(10);
		textFieldISBN.setBounds(75, 129, 96, 19);
		add(textFieldISBN);
		
		textFieldEdition = new JTextField();
		textFieldEdition.setColumns(10);
		textFieldEdition.setBounds(75, 161, 96, 19);
		add(textFieldEdition);
		
		JLabel lblBookType = new JLabel("Book Type:");
		lblBookType.setBounds(10, 206, 62, 13);
		add(lblBookType);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(63, 258, 85, 21);
		add(btnSubmit);
    }
}
