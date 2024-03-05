package org.team4.model.items;

public class RentableItemDecorator extends ItemDecorator {
    public RentableItemDecorator(Item item) {
        super(item);
        item.isRentable = true;
    }

    public boolean isRentable() {
        return item.isRentable;
    }
}