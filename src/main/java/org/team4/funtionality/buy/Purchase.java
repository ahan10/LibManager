package org.team4.funtionality.buy;

import org.team4.model.items.Item;
import org.team4.model.user.User;

import java.util.Date;
import java.util.Random;

public class Purchase implements Payment{
    private long purchaseID;
    private Date purchaseDate;
    private double amount;
    private User user;
    private Item item;
    private String mode;

    public Purchase(double amount, User user, Item item, String mode) {
        this.purchaseID = new Random().nextLong();
        this.purchaseDate = new Date();
        this.amount = amount;
        this.user = user;
        this.item = item;
        this.mode = mode;
    }

    public boolean processPayment(String mode){
        return MODE.contains(mode);
    }

    public Purchase getPayment(){
        if(this.processPayment(this.mode)){
            return this;
        }
        return null;
    }
}
