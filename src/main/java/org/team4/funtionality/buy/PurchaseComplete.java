package org.team4.funtionality.buy;

import org.team4.model.paymentmodes.PaymentModes;
import org.team4.model.items.Item;
import org.team4.model.items.Newsletter;
import org.team4.model.user.User;

import java.util.Date;
import java.util.Random;

public class PurchaseComplete implements PaymentModes {
    private long purchaseID;
    private Date purchaseDate;
    private double amount;
    private User user;
    private Item item;
    private Newsletter newsletter;
    private String modeOfPayment;

    public PurchaseComplete(double amount, User user, Item item, String mode) {
        this.purchaseID = new Random().nextLong();
        this.purchaseDate = new Date();
        this.amount = amount;
        this.user = user;
        this.item = item;
    }

    public PurchaseComplete(double amount, User user, Newsletter newsletter){
        this.purchaseID = new Random().nextLong();
        this.purchaseDate = new Date();
        this.amount = amount;
        this.user = user;
        this.newsletter = newsletter;
    }

    public PurchaseComplete(ItemToPurchase itemToPurchase, PaymentValidator modes){
        this.purchaseID = new Random().nextLong();
        this.purchaseDate = new Date();
        this.user = itemToPurchase.getUser();
        this.modeOfPayment = modes.getMode();
        this.amount = itemToPurchase.getAmount();
        if(itemToPurchase.getItem() != null){
            this.item = itemToPurchase.getItem();
        }else if(itemToPurchase.getNewsletter() != null){
            this.newsletter = itemToPurchase.getNewsletter();
        }
    }

    public boolean processPayment(String mode){
        return MODE.contains(mode);
    }

    public PurchaseComplete getPayment(){
        return this;
    }

    public String getMode(){
        return this.modeOfPayment;
    }

    public long getPurchaseID() {
        return purchaseID;
    }

    public double getAmount() {
        return amount;
    }

    public String getModeOfPayment() {
        return modeOfPayment;
    }

    public Item getItem() {
        return item;
    }

    public Newsletter getNewsletter() {
        return newsletter;
    }
}
