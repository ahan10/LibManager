package org.team4.model.items;

import java.util.Date;

public class RentedItem {

	private String title;
	private String ISBN;
	private Date rentDate;
	private Date dueDate;

	
	public RentedItem(String title, String ISBN, Date rentDate, Date dueDate) {
		this.setTitle(title);
		this.setISBN(ISBN);
		this.setRentDate(rentDate);
		this.setDueDate(dueDate);

	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public Date getRentDate() {
		return rentDate;
	}

	public void setRentDate(Date rentDate) {
		this.rentDate = rentDate;
	}

}
