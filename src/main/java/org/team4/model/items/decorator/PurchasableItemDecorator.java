package org.team4.model.items.decorator;

import org.team4.model.items.Item;

public class PurchasableItemDecorator extends ItemDecorator {

    public PurchasableItemDecorator(Item item) {
        super(item);
        item.setPurchaseable(true);
    }
    
    @Override
    public boolean isPurchasable() {
        return item.isPurchasable();
    }

}