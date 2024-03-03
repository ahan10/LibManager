package org.team4.model.items;

public class RentableItemDecorator extends ItemDecorator {
    public RentableItemDecorator(Item item) {
        super(item);
    }

    @Override
    public boolean isRentable() {
        return true;
    }
}