package org.team4.model.items;

import java.util.Date;
import java.util.Objects;

public class Item {

	private String title;
    private Date yearPublished;
    protected boolean isRentable;
    protected boolean isPurchaseable;
    
    public Item(String title, Date yearPublished) {
    	this.title = title;
        this.yearPublished = yearPublished;
    }
    
   
    public Item(String title, Date yearPublished, boolean isPurchaseable, boolean isRentable) {
		super();
		this.title = title;
		this.yearPublished = yearPublished;
		this.isPurchaseable = isPurchaseable;
		this.isRentable = isRentable;
	}

	public Item(Item item){
        this(item.title, item.yearPublished);
    }
	
	public String getTitle() {
		return title;
	}

	public Date getYearPublished() {
		return yearPublished;
	}
    
    public boolean isPurchaseable() {
    	return isPurchaseable;
    }

    public boolean isRentable() {
        return isRentable;
    }
    
    @Override
	public int hashCode() {
		return Objects.hash(isPurchaseable, isRentable, title, yearPublished);
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
		return isPurchaseable == other.isPurchaseable && isRentable == other.isRentable
				&& Objects.equals(title, other.title) && Objects.equals(yearPublished, other.yearPublished);
	}
	
}
