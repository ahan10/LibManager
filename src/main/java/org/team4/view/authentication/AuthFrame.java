package org.team4.view.authentication;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class AuthFrame extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private CardLayout cardLayout;
	private LoginPanel loginPanel = new LoginPanel();
	private RegisterPanel registerationPanel = new RegisterPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AuthFrame frame = new AuthFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AuthFrame() {
		contentPane = new JPanel();
		cardLayout = new CardLayout();
		contentPane.setLayout(cardLayout);
		setTitle("LibManager");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 500);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		
		setLocationRelativeTo(null);
	
		contentPane.add(loginPanel, "login");
		contentPane.add(registerationPanel,"register");
		
		cardLayout.show(contentPane, "login");
		
		loginPanel.getLoginButton().addActionListener(this);
		loginPanel.getRegisterationButton().addActionListener(this);
		
		registerationPanel.getLoginButton().addActionListener(this);
		registerationPanel.getLoginButton().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == loginPanel.getLoginButton()) {
			// add iumplementation
		}else if(e.getSource() == loginPanel.getRegisterationButton()) {
			cardLayout.show(contentPane, "register");
		}else if(e.getSource() == registerationPanel.getLoginButton()) {
			cardLayout.show(contentPane, "login");
		}else if(e.getSource() == registerationPanel.getRegisterButton()) {
			//add implementation
		}
	}

}
