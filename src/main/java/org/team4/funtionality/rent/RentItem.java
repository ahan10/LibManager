package org.team4.funtionality.rent;


import java.util.Date;
import java.util.List;

public class RentItem {
    private String userEmail;
    private String bookTitle;
    private Date rentalDate;
    private static final int MAX_RENTALS_PER_USER = 10;

    public RentItem(String userEmail, String bookTitle, Date rentalDate) {
        this.userEmail = userEmail;
        this.bookTitle = bookTitle;
        this.rentalDate = new Date();
    }


    public String getUserEmail() {
        return userEmail;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public Date getRentalDate() {
        return rentalDate;
    }




}
