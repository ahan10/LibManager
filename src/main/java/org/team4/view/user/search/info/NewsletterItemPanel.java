package org.team4.view.user.search.info;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import org.team4.model.items.Newsletter;
import javax.swing.JButton;


public class NewsletterItemPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	private JFrame window;
	private Newsletter newsletter;
	private JLabel newsletterTitleValue = new JLabel("");


	
	public NewsletterItemPanel(JFrame window, Newsletter newsletter) {
		this.window = window;
		this.newsletter = newsletter;
		setLayout(null);
		
		JLabel titleLabel = new JLabel("Subscribe a Newsletter");
		titleLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		titleLabel.setBounds(266, 19, 218, 25);
		add(titleLabel);
		
		JLabel newsletterTitleLabel = new JLabel("Newsletter Title:");
		newsletterTitleLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		newsletterTitleLabel.setBounds(297, 95, 155, 25);
		add(newsletterTitleLabel);
		
		newsletterTitleValue.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		newsletterTitleValue.setHorizontalAlignment(SwingConstants.CENTER);
		newsletterTitleValue.setBounds(66, 151, 631, 33);
		add(newsletterTitleValue);
		
		JButton readButton = new JButton("Read");
		readButton.setBounds(66, 296, 117, 29);
		add(readButton);
		
		JButton subscribeButton = new JButton("Subscribe");
		subscribeButton.setBounds(316, 296, 117, 29);
		add(subscribeButton);
		
		JButton unsubscribeButton = new JButton("Unsubscribe");
		unsubscribeButton.setBounds(580, 296, 117, 29);
		add(unsubscribeButton);
		
	}
	
	
	public void showItemInfo() {
		newsletterTitleValue.setText(newsletter.getTitle());
	}


	public void setWindow(JFrame window) {
		this.window = window;
	}

	public void setNewsletter(Newsletter newsletter) {
		this.newsletter = newsletter;
	}
	
	public Newsletter getNewsletter() {
		return this.newsletter;
	}
	
	public JFrame getWindow() {
		return this.window;
	}
}	
