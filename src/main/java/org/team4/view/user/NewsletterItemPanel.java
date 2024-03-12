package org.team4.view.user;

import javax.swing.JFrame;
import javax.swing.JPanel;
import org.team4.model.items.Newsletter;


public class NewsletterItemPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	private JFrame window;
	private Newsletter newsletter;
	
	public NewsletterItemPanel(JFrame window, Newsletter newsletter) {
		this.window = window;
		this.newsletter = newsletter;
		setLayout(null);
	}
	
	
	public void showItemInfo() {
		
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
