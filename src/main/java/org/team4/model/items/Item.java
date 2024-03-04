package org.team4.model.items;

import java.util.Date;
import java.util.Objects;

public class Item {

	private String title;
    private Date yearPublished;
    protected boolean isBorrowable;
    protected boolean isRentable;
    
    public Item(String title, Date yearPublished) {
    	this.title = title;
        this.yearPublished = yearPublished;
    }
    
   
    public Item(String title, Date yearPublished, boolean isBorrowable, boolean isRentable) {
		super();
		this.title = title;
		this.yearPublished = yearPublished;
		this.isBorrowable = isBorrowable;
		this.isRentable = isRentable;
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
    
    @Override
	public int hashCode() {
		return Objects.hash(isBorrowable, isRentable, title, yearPublished);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return isBorrowable == other.isBorrowable && isRentable == other.isRentable
				&& Objects.equals(title, other.title) && Objects.equals(yearPublished, other.yearPublished);
	}
}
