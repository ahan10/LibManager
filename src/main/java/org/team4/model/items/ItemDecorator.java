package org.team4.model.items;

public class ItemDecorator extends Item {
    protected Item item;

    public Item getItem() {
		return item;
	}

	public ItemDecorator(Item item) {
        super(item);
    	this.item = item;
    }

}
