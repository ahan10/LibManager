package org.team4.unit.functionality.rent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.team4.functionality.rent.RentalService;
import org.team4.functionality.rent.ReturnService;

import org.team4.maintaindb.MaintainRent;
import org.team4.model.items.*;
import org.team4.model.user.User;

import java.util.Calendar;

import static org.junit.Assert.*;


public class ReturnServiceTest {
    private ReturnService returnService;
    private User user;
    private Book book;
    private DVD dvd;
    private Magazine magazine, overdueMagazine;
    Item overdueItem, item ;


    private RentalService rentalService;
    private MaintainRent rentMaintain;

    @Before
    public void setUp() {
        returnService = new ReturnService();
        rentalService= new RentalService();
        rentMaintain = MaintainRent.getInstance();
        user = new User("user@example.com", "password", "John Doe", "MEMBER");

        Item item = new Item("Effective Java", 2020, 1, 15.99, "123456789", true, true);


        book = new Book(item, "Programming", 384, "Joshua Bloch", "Addison-Wesley", 3, true, false);

        Item dvdItem = new Item("Inception", 2010, 2, 29.99, "987654321", true, true);
        dvd = new DVD(dvdItem, "Science Fiction", 2.5);

        Item magazineItem = new Item("National Geographic", 2020, 5, 9.99, "12341234", true, true);
        magazine = new Magazine(magazineItem, "National Geographic Society", 2020 );
        overdueItem  = new Item("National Historic", 2017, 5, 99.99, "414231221233", true, true);
        item = new Item("Effective Java", 2020, 1, 15.99, "123456789", true, true);

    }

    @After
    public void returnItem() throws Exception {

        rentMaintain.returnRentedItem(user.getEmail(), overdueItem.getISBN());

        rentMaintain.update();
    }
    @Test
    public void returnNotRentedItem() throws Exception {

        boolean value= rentMaintain.returnRentedItem(user.getEmail(), "4321313124");

        rentMaintain.update();

        assertFalse(value);
    }

    @Test
    public void returnNullItem() throws Exception {

        boolean value= rentMaintain.returnRentedItem(user.getEmail(),"null");

        rentMaintain.update();

        assertFalse(value);
    }



    @Test
    public void testReturnItemSuccess() throws Exception {

        rentalService.rentItem(user, book);

        boolean result = returnService.returnItem(user, book);


        assertTrue( result);

    }
    @Test
    public void testReturnDVDSuccess() throws Exception {
        rentalService.rentItem(user, dvd);
        boolean result = returnService.returnItem(user, dvd);
        assertTrue( result);
    }

    @Test
    public void testReturnMagazineSuccess() throws Exception {
        rentalService.rentItem(user, magazine);
        boolean result = returnService.returnItem(user, magazine);
        assertTrue( result);
    }

    @Test
    public void testFindBookByISBN() {
        Item item = returnService.findItemByISBN("9780061120084");
        assertTrue( item instanceof Book);
    }

    @Test
    public void testFindDVDByISBN() {
        Item item = returnService.findItemByISBN("8492012345682");
        assertTrue( item instanceof DVD);
    }

    @Test
    public void testFindMagazineByISBN() {
        Item item = returnService.findItemByISBN("7123456789041");
        assertTrue( item instanceof Magazine);
    }
    @Test
    public void testReturnItem_WithPenaltyPayment() throws Exception {


        Calendar pastDueDate = Calendar.getInstance();
        pastDueDate.add(Calendar.DAY_OF_MONTH, -10);
        rentMaintain.addNewRentedItem(user.getEmail(), "National Historic", "414231221233",
                new java.sql.Date(System.currentTimeMillis()),
                new java.sql.Date(pastDueDate.getTimeInMillis()));
        Item overdueItem = new Item("National Historic", 2017, 5, 99.99, "414231221233", true, true);
        overdueMagazine = new Magazine(overdueItem, "National Historic Society", 2021);



        boolean result = returnService.returnItem(user, overdueMagazine);


        assertTrue( result);
    }

    @Test
    public void testReturnItem_WithoutPenaltyPayment() throws Exception {
        Calendar pastDueDate = Calendar.getInstance();
        pastDueDate.add(Calendar.DAY_OF_MONTH, -10);
        rentMaintain.addNewRentedItem(user.getEmail(), "National Historic", "414231221233",
                new java.sql.Date(System.currentTimeMillis()),
                new java.sql.Date(pastDueDate.getTimeInMillis()));

        overdueMagazine = new Magazine(overdueItem, "National Historic Society", 2021);




        boolean result = returnService.returnItem(user, overdueMagazine);


        assertFalse( result);
    }

    @Test
    public void testReturnItem_WithLostPenalty() throws Exception {


        Calendar pastDueDate = Calendar.getInstance();
        pastDueDate.add(Calendar.DAY_OF_MONTH, -20);
        rentMaintain.addNewRentedItem(user.getEmail(), "National Historic", "414231221233",
                new java.sql.Date(System.currentTimeMillis()),
                new java.sql.Date(pastDueDate.getTimeInMillis()));
        Item overdueItem = new Item("National Historic", 2017, 5, 99.99, "414231221233", true, true);
        overdueMagazine = new Magazine(overdueItem, "National Historic Society", 2021);



        boolean result = returnService.returnItem(user, overdueMagazine);


        assertTrue( result);
    }










}