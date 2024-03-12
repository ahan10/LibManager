package org.team4.view.purchase;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import org.team4.funtionality.buy.ItemToPurchase;
import org.team4.model.items.Newsletter;
import org.team4.model.paymentmodes.PaymentModes;
import org.team4.model.items.Item;
import org.team4.model.user.User;
import org.team4.view.purchase.modes.CreditCardPanel;
import org.team4.view.purchase.modes.DebitCardPanel;
import org.team4.view.purchase.modes.MobileWalletPanel;
import org.team4.view.purchase.modes.PayPalPanel;

public class PurchaseFrame extends JPanel implements PaymentModes {

	private static final long serialVersionUID = 1L;
	private static final String CREDIT_CARD = "Credit Card";
	private static final String DEBIT_CARD = "Debit Card";
	private static final String PAY_PAL = "Pay Pal";
	private static final String MOBILE_WALLET = "Mobile Wallet";

	private JPanel panel;
	private JPanel activityPanel;
	private CardLayout cardLayout;

	private CreditCardPanel creditCardPanel = new CreditCardPanel();
	private DebitCardPanel debitCardPanel = new DebitCardPanel();
	private PayPalPanel payPalPanel = new PayPalPanel();
	private MobileWalletPanel mobileWalletPanel = new MobileWalletPanel();
	
	private JComboBox modeComboBox;
	private JButton selectButton;

	private Item item;
	private User user;
	private Newsletter newsletter;
	private double amount;

	public PurchaseFrame() {
		initPurchase();
	}

	public PurchaseFrame(Item item, User user) {
		this.item = item;
		this.user = user;
		initPurchase();
	}

	public PurchaseFrame(double amount, User user) {
		this.amount = amount;
		this.user = user;
		initPurchase();
	}

	public PurchaseFrame(Newsletter newsletter, User user) {
		this.newsletter = newsletter;
		this.user = user;
		initPurchase();
	}

	private void initPurchase() {
		setBounds(100, 100, 353, 609);
		setLayout(new BorderLayout());
		
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));

		add(panel, BorderLayout.CENTER);

		activityPanel = new JPanel();
		activityPanel.setBounds(6, 71, 330, 476);
		
		cardLayout = new CardLayout();
		activityPanel.setLayout(cardLayout);

		addComponents();
		addPanels();
	}
	
	private void addComponents() {
		panel.setLayout(null);
		JLabel titleLabel = new JLabel("Payment Gateway");
		titleLabel.setBounds(74, 10, 109, 16);
		panel.add(titleLabel);

		JLabel modeLabel = new JLabel("Select Mode:");
		modeLabel.setBounds(188, 10, 79, 16);
		panel.add(modeLabel);

		modeComboBox = new JComboBox(MODE.toArray(new String[0]));
		modeComboBox.setBounds(58, 32, 140, 27);
		panel.add(modeComboBox);

		selectButton = new JButton("✔︎");
		selectButton.setBounds(203, 31, 75, 29);
		panel.add(selectButton);
	}
	
	private void addPanels() {
		panel.add(activityPanel);
		activityPanel.add(debitCardPanel, DEBIT_CARD);
		activityPanel.add(creditCardPanel, CREDIT_CARD);
		activityPanel.add(payPalPanel, PAY_PAL);
		activityPanel.add(mobileWalletPanel, MOBILE_WALLET);
		
		//default method
		cardLayout.show(activityPanel, CREDIT_CARD);
	}
	
	public String getMode() {
		return this.modeComboBox.getSelectedItem().toString();
	}

	public CreditCardPanel getCreditCardPanel() {
		return creditCardPanel;
	}

	public DebitCardPanel getDebitCardPanel() {
		return debitCardPanel;
	}

	public PayPalPanel getPayPalPanel() {
		return payPalPanel;
	}

	public MobileWalletPanel getMobileWalletPanel() {
		return mobileWalletPanel;
	}

	public JButton getSelectButton() {
		return selectButton;
	}
	
	public void changeToCreditCard() {
		cardLayout.show(activityPanel, CREDIT_CARD);
	}
	
	public void changeToDebitCard() {
		cardLayout.show(activityPanel, DEBIT_CARD);
	}
	
	public void changeToPayPal() {
		cardLayout.show(activityPanel, PAY_PAL);
	}
	
	public void changeToMobileWallet() {
		cardLayout.show(activityPanel, MOBILE_WALLET);
	}

	public ItemToPurchase getItemToPurchase(){
		if(this.item != null){
			return new ItemToPurchase(this.item, this.user);
		}else if(this.newsletter != null){
			return new ItemToPurchase(this.newsletter, this.user);
		}else{
			return new ItemToPurchase(this.amount, this.user);
		}

	}

}
