package org.team4.view.user;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class NewsletterSubscribePanel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewsletterSubscribePanel frame = new NewsletterSubscribePanel();
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
	public NewsletterSubscribePanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titleLabel = new JLabel("Subscribe a Newsletter");
		titleLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		titleLabel.setBounds(266, 19, 218, 25);
		contentPane.add(titleLabel);
		
		JLabel newsletterTitleLabel = new JLabel("Newsletter Title:");
		newsletterTitleLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		newsletterTitleLabel.setBounds(297, 95, 155, 25);
		contentPane.add(newsletterTitleLabel);
		
		JLabel newsletterTitleValue = new JLabel("");
		newsletterTitleValue.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		newsletterTitleValue.setHorizontalAlignment(SwingConstants.CENTER);
		newsletterTitleValue.setBounds(66, 151, 631, 33);
		contentPane.add(newsletterTitleValue);
		
		JButton readButton = new JButton("Read");
		readButton.setBounds(66, 296, 117, 29);
		contentPane.add(readButton);
		
		JButton subscribeButton = new JButton("Subscribe");
		subscribeButton.setBounds(316, 296, 117, 29);
		contentPane.add(subscribeButton);
		
		JButton unsubscribeButton = new JButton("Unsubscribe");
		unsubscribeButton.setBounds(580, 296, 117, 29);
		contentPane.add(unsubscribeButton);
	}
}
