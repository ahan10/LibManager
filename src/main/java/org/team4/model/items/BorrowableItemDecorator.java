package org.team4.model.items;

public class BorrowableItemDecorator extends ItemDecorator {
    
	public BorrowableItemDecorator(Item item) {
        super(item);
    }
	
	@Override
    public boolean isRentable() {
        return true;
    }

}
