package org.team4.model.items;

import java.util.Date;

public class Item {
    private String title;
    private Date yearPublished;


    public Item(String title, Date yearPublished) {
    	this.title = title;
        this.yearPublished = yearPublished;
        
    }

    public Item(Item item){
        this(item.title, item.yearPublished);
    }
}
