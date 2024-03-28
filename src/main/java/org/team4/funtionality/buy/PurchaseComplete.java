package org.team4.funtionality.buy;

import org.team4.model.paymentmodes.PaymentModes;
import org.team4.model.items.Item;
import org.team4.model.items.Newsletter;
import org.team4.model.paymentmodes.PaymentValidator;
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

    public PurchaseComplete(ItemToPurchase itemToPurchase, PaymentValidator modes){
        this.purchaseID = new Random().nextLong(10000000) + 1;
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

    public long getPurchaseID() {
        return purchaseID;
    }

    public double getAmount() {
        return amount;
    }

    public Item getItem() {
        return item;
    }

    public Newsletter getNewsletter() {
        return newsletter;
    }

    public User getUser() {
        return user;
    }

}
