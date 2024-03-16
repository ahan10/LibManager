package org.team4.view.user.search.info;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import org.team4.maintaindb.MaintainDatabase;
import org.team4.maintaindb.MaintainSubscriptions;
import org.team4.model.items.Newsletter;
import org.team4.model.user.User;

import javax.swing.JButton;


public class NewsletterItemPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	private JFrame window;
	private Newsletter newsletter;
	private JLabel newsletterTitleValue = new JLabel("");
	private ArrayList<String> newslettersSubscribed;
	private JButton readButton, subscribeButton, unsubscribeButton;
	private User user;
	private MaintainSubscriptions subscriptions = MaintainDatabase.getInstance().getSubscriptionDatabase();
	
	public NewsletterItemPanel(JFrame window, Newsletter newsletter, User user) {
		this.window = window;
		this.newsletter = newsletter;
		this.user = user;

		loadSubscriptions();

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
		
		readButton = new JButton("Read");
		readButton.setBounds(66, 296, 117, 29);
		add(readButton);
		
		subscribeButton = new JButton("Subscribe");
		subscribeButton.setBounds(316, 296, 117, 29);
		add(subscribeButton);

		unsubscribeButton = new JButton("Unsubscribe");
		unsubscribeButton.setBounds(580, 296, 117, 29);
		add(unsubscribeButton);

		updateButtons();

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

	public JButton getReadButton() {
		return readButton;
	}

	public JButton getSubscribeButton() {
		return subscribeButton;
	}

	public JButton getUnsubscribeButton() {
		return unsubscribeButton;
	}

	public User getUser() {
		return user;
	}

	public void updateButtons(){
		if(!newslettersSubscribed.contains(newsletter.getTitle())){
			readButton.setEnabled(false);
			unsubscribeButton.setEnabled(false);
			subscribeButton.setEnabled(true);
		}else{
			readButton.setEnabled(true);
			unsubscribeButton.setEnabled(true);
			subscribeButton.setEnabled(false);
		}
	}

	public void loadSubscriptions(){
		newslettersSubscribed = new ArrayList<>();
		newslettersSubscribed = subscriptions.getAllSubscribedNewslettersTitlesByEmail(user.getEmail());
	}
}
