package org.team4.model.items;

import java.util.Date;

public class Item {
    private String title;
    private Date yearPublished;
    protected boolean isBorrowable;
    protected boolean isRentable;
    

    public Item(String title, Date yearPublished) {
    	this.title = title;
        this.yearPublished = yearPublished;
        
    }

    public Item(Item item){
        this(item.title, item.yearPublished);
    }
    
    public boolean isBorrowable() {
    	return false;
    }

    public boolean isRentable() {
        return false;
    }
}
