package org.team4.funtionality.buy;

import java.util.Date;

public class ItemPurchased {
    private String title;
    private String email;
    private Date datePurchased;

    public ItemPurchased(String title, String email) {
        this.title = title;
        this.email = email;
        this.datePurchased = new Date();
    }

    public ItemPurchased(String title, String email, Date datePurchased) {
        this.title = title;
        this.email = email;
        this.datePurchased = datePurchased;
    }

    public String getTitle() {
        return title;
    }

    public String getEmail() {
        return email;
    }

    public Date getDatePurchased() {
        return datePurchased;
    }

    @Override
    public String toString() {
        return "ItemPurchased{" +
                "title='" + title + '\'' +
                ", email='" + email + '\'' +
                ", datePurchased=" + datePurchased +
                '}';
    }
}
