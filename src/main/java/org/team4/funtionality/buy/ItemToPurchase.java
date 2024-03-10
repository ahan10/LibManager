package org.team4.funtionality.buy;

import org.team4.model.items.Item;
import org.team4.model.items.Newsletter;
import org.team4.model.user.User;

public class ItemToPurchase {
    private Item item;
    private User user;
    private Newsletter newsletter;

    public ItemToPurchase(Item item, User user) {
        this.item = item;
        this.user = user;
    }

    public ItemToPurchase(Newsletter newsletter, User user) {
        this.newsletter = newsletter;
        this.user = user;
    }

    public Item getItem() {
        return item;
    }

    public User getUser() {
        return user;
    }

    public Newsletter getNewsletter() {
        return newsletter;
    }

    @Override
    public String toString() {
        return "ItemToPurchase{" +
                "item=" + item +
                ", user=" + user +
                ", newsletter=" + newsletter +
                '}';
    }
}
