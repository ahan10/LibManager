package org.team4.view.Login;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Arrays;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class LoginPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEmail;
	private JPasswordField pwdPassword;
	private JButton btnShowPassword;

	
	
	
	public void addPlaceholderStyle(JTextField textField) {
		Font font = textField.getFont();
		font = font.deriveFont(Font.ITALIC);
		textField.setFont(font);
		textField.setForeground(Color.gray);
	}
	
	public void removePlaceholderStyle(JTextField textField) {
		Font font = textField.getFont();
		font = font.deriveFont(Font.PLAIN);
		textField.setFont(font);
		textField.setForeground(Color.black);
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
					frame.setVisible(true);
					frame.requestFocus();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginPage() {
		initComponents();
		addPlaceholderStyle(txtEmail);
		addPlaceholderStyle(pwdPassword);
		
		btnShowPassword = new JButton("");
		btnShowPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pwdPassword.getForeground() != Color.gray) {
					if (pwdPassword.getEchoChar() == '\u2022') {
						pwdPassword.setEchoChar((char) 0);
					}
					else {
						pwdPassword.setEchoChar('\u2022');
					}
				}
			}
		});
		btnShowPassword.setIcon(new ImageIcon("C:\\Users\\swix\\Pictures\\showPasswordIconReScaled.png"));
		btnShowPassword.setBounds(193, 105, 21, 20);
		contentPane.add(btnShowPassword);
	}

	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtEmail = new JTextField();
		txtEmail.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtEmail.getText().equals("Email")) {
					txtEmail.setText(null);
					txtEmail.requestFocus();
					removePlaceholderStyle(txtEmail);
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtEmail.getText().length() == 0) {
					addPlaceholderStyle(txtEmail);
					txtEmail.setText("Email");
				}
			}
		});
		txtEmail.setText("Email");
		txtEmail.setToolTipText("Email");
		txtEmail.setBounds(92, 34, 100, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		pwdPassword = new JPasswordField();
		pwdPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(Arrays.equals(pwdPassword.getPassword(),new char[] {'P','a','s','s','w','o','r','d'})) {
					pwdPassword.setText(null);
					pwdPassword.requestFocus();
					pwdPassword.setEchoChar('\u2022');
					removePlaceholderStyle(pwdPassword);
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(pwdPassword.getPassword().length == 0) {
					addPlaceholderStyle(pwdPassword);
					pwdPassword.setText("Password");
					pwdPassword.setEchoChar((char) 0);
				}
			}
		});
		pwdPassword.setText("Password");
		pwdPassword.setToolTipText("Password");
		pwdPassword.setBounds(92, 105, 100, 20);
		pwdPassword.setEchoChar((char) 0);
		contentPane.add(pwdPassword);
		
		JButton btnNewButton = new JButton("Log In");
		btnNewButton.setBounds(109, 194, 73, 23);
		contentPane.add(btnNewButton);
		
	}
}
