package org.team4.model.items;

public class Newsletter extends Item{
    private String publisher;

    public Newsletter(Item item, String publisher) {
        super(item);
        this.publisher = publisher;
    }
}
