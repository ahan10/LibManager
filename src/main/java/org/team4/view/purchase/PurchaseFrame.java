package org.team4.view.purchase;

import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.team4.controller.purchase.PurchaseController;
import org.team4.funtionality.buy.ItemToPurchase;
import org.team4.model.paymentmodes.PaymentModes;
import org.team4.model.items.Item;
import org.team4.model.user.User;
import org.team4.view.purchase.modes.CreditCardPanel;
import org.team4.view.purchase.modes.DebitCardPanel;
import org.team4.view.purchase.modes.MobileWalletPanel;
import org.team4.view.purchase.modes.PayPalPanel;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class PurchaseFrame extends JFrame implements PaymentModes {

	private static final long serialVersionUID = 1L;
	private static final String CREDIT_CARD = "Credit Card";
	private static final String DEBIT_CARD = "Debit Card";
	private static final String PAY_PAL = "Pay Pal";
	private static final String MOBILE_WALLET = "Mobile Wallet";

	private JPanel contentPane;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PurchaseFrame frame = new PurchaseFrame();
					frame.setVisible(true);
					PurchaseController purchaseController = new PurchaseController(frame);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PurchaseFrame() {
		initPurchase();
	}

	public PurchaseFrame(Item item, User user) {
		this.item = item;
		this.user = user;
		initPurchase();
	}

	private void initPurchase() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 353, 609);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("Buy");
		setContentPane(contentPane);

		getContentPane().setLayout(null);
		
		
		
		activityPanel = new JPanel();
		activityPanel.setBounds(6, 69, 342, 508);
		
		cardLayout = new CardLayout();
		activityPanel.setLayout(cardLayout);

		addComponents();
		addPanels();
	}
	
	private void addComponents() {
		JLabel titleLabel = new JLabel("Payment Gateway");
		titleLabel.setBounds(116, 6, 109, 16);
		getContentPane().add(titleLabel);

		JLabel modeLabel = new JLabel("Select Mode:");
		modeLabel.setBounds(6, 34, 88, 16);
		getContentPane().add(modeLabel);

		modeComboBox = new JComboBox(MODE.toArray(new String[0]));
		modeComboBox.setBounds(94, 30, 193, 27);
		getContentPane().add(modeComboBox);

		selectButton = new JButton("✔︎");
		selectButton.setBounds(284, 29, 52, 29);
		getContentPane().add(selectButton);
	}
	
	private void addPanels() {
		contentPane.add(activityPanel);
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
		return new ItemToPurchase(this.item, this.user);
	}
	
}
