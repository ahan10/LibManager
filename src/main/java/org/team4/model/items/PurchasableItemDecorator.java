package org.team4.model.items;

public class PurchasableItemDecorator extends ItemDecorator {
    
	public PurchasableItemDecorator(Item item) {
        super(item);
        item.isPurchaseable = true;
    }
	
    public boolean isPurchasable() {
        return item.isPurchaseable;
    }

}
