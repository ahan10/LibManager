package org.team4.model.items;

public class ItemDecorator extends Item {
    protected final Item item;

    public ItemDecorator(Item item) {
        super(item);
    	this.item = item;
    }

}
