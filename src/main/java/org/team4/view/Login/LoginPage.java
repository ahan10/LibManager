package org.team4.view.Login;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import org.team4.controller.Login.LoginController;
import org.team4.maintaindb.MaintainUser;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Arrays;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class LoginPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEmail;
	private JPasswordField pwdPassword;
	private JButton btnShowPassword;
	private JButton btnRegister;
	private JButton btnLogin;

	
	
	
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
	 * Create Fancy Gradient Buttons
	 */
	@SuppressWarnings("serial")
	private static final class JGradientButton extends JButton{
	    private JGradientButton(String text){
	        super(text);
	        setContentAreaFilled(false);
	    }

	    @Override
	    protected void paintComponent(Graphics g){
	        Graphics2D g2 = (Graphics2D)g.create();
	        g2.setPaint(new GradientPaint(
                    new Point(0, 0), 
                    Color.CYAN.brighter(), 
                    new Point(getWidth(), 0), 
                    Color.MAGENTA.brighter()));
	        g2.fillRect(0, 0, getWidth(), getHeight());
	        g2.dispose();

	        super.paintComponent(g);
	    }
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
					
					MaintainUser maintainUser = new MaintainUser();
					maintainUser.load();
					LoginController controller = new LoginController(frame, maintainUser);
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
		
	}
	
	/**
	 * Create frame components
	 */
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
		
		JTextPane txtpnWelcome = new JTextPane();
		StyledDocument doc = txtpnWelcome.getStyledDocument();
		SimpleAttributeSet center = new SimpleAttributeSet();
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		doc.setParagraphAttributes(0, doc.getLength(), center, false);
		txtpnWelcome.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpnWelcome.setBackground(new Color(240, 240, 240));
		txtpnWelcome.setText("Welcome");
		txtpnWelcome.setBounds(0, 20, 284, 20);
		contentPane.add(txtpnWelcome);
		txtEmail.setText("Email");
		txtEmail.setToolTipText("Email");
		txtEmail.setBounds(57, 70, 170, 30);
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
		pwdPassword.setBounds(57, 130, 170, 30);
		pwdPassword.setEchoChar((char) 0);
		contentPane.add(pwdPassword);
		
		btnShowPassword = new JButton();
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
		btnShowPassword.setBounds(226, 135, 21, 20);
		contentPane.add(btnShowPassword);
		
		btnLogin = new JGradientButton("Log In");
		btnLogin.setBounds(42, 200, 200, 43);
		btnLogin.setForeground(Color.WHITE);
		contentPane.add(btnLogin);
		
		btnRegister = new JButton("Don't have an account? Sign Up");
		btnRegister.setBounds(10, 311, 264, 23);
		contentPane.add(btnRegister);
	}
	
	/**
	 * Getters and Setters
	 */
	public JButton getLoginButton() {
		return btnLogin;
	}
	
	public JButton getRegisterButton() {
		return btnRegister;
	}
	
	public String getEmailInput() {
		return txtEmail.getText();
	}
	
	public String getPasswordInput() {
		return new String(pwdPassword.getPassword());
	}
}
