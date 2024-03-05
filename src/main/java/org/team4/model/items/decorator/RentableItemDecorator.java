package org.team4.model.items.decorator;

import org.team4.model.items.Item;

public class RentableItemDecorator extends ItemDecorator {
    public RentableItemDecorator(Item item) {
        super(item);
        item.setRentable(true);
    }

    public boolean isRentable() {
        return item.isRentable();
    }
}