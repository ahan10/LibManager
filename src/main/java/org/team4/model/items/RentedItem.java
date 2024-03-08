package org.team4.model.items;

import java.util.Date;

public class RentedItem {
	
	private String ISBN;
	private Date rentDate;
	
	public RentedItem(String ISBN, Date rentDate) {
		this.setISBN(ISBN);
		this.setRentDate(rentDate);
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
