package org.team4.model.items;

import java.util.Date;

public class Item {
    private String title;
    private Date yearPublished;
    private boolean isBorrowable;
    private boolean isRentable;

    public Item(String title, Date yearPublished, boolean isBorrowable, boolean isRentable) {
        this.title = title;
        this.yearPublished = yearPublished;
        this.isBorrowable = isBorrowable;
        this.isRentable = isRentable;
    }

    public Item(Item item){
        this(item.title, item.yearPublished, item.isBorrowable, item.isRentable);
    }
}
