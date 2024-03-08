package org.team4.model.items;

import java.util.Objects;

public class Item {

	private String title;
    private int yearPublished;
    private int quantity;
    private double price;
    protected String ISBN;
    protected boolean isRentable;
    protected boolean isPurchaseable;
       
    public Item(String title, int yearPublished, int quantity, double price, String ISBN, boolean isPurchaseable, boolean isRentable) {
		super();
		this.title = title;
		this.yearPublished = yearPublished;
		this.quantity = quantity;
		this.price = price;
		this.ISBN = ISBN;
		this.isPurchaseable = isPurchaseable;
		this.isRentable = isRentable;
	}

	public Item(Item item){
        this(item.title, item.yearPublished, item.quantity, item.price, item.ISBN, item.isPurchaseable, item.isRentable);
    }
	
	public String getTitle() {
		return title;
	}

	public int getYearPublished() {
		return yearPublished;
	}
    
    public boolean isPurchasable() {
    	return isPurchaseable;
    }

    public boolean isRentable() {
        return isRentable;
    }
    
	public int getQuantity(){
		return quantity;
	}

	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getISBN() {
		return ISBN;
	}

    @Override
	public int hashCode() {
		return Objects.hash(isPurchaseable, isRentable, title, yearPublished);
	}

	public void setRentable(boolean rentable) {
		isRentable = rentable;
	}

	public void setPurchaseable(boolean purchaseable) {
		isPurchaseable = purchaseable;
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
