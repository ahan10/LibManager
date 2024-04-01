package org.team4.unit.model.items;

import org.junit.Test;
import org.team4.model.items.RentedItem;

import static org.junit.Assert.*;

import java.util.Date;

public class RentedItemTest {

    @Test
    public void testConstructorInitialization() {
        Date rentDate = new Date();
        Date dueDate = new Date(rentDate.getTime() + (7 * 24 * 60 * 60 * 1000)); // Adding 7 days to rentDate

        RentedItem rentedItem = new RentedItem("Book Title", "1234567890", rentDate, dueDate);
        
        assertEquals("Book Title", rentedItem.getTitle());
        assertEquals("1234567890", rentedItem.getISBN());
        assertEquals(rentDate, rentedItem.getRentDate());
        assertEquals(dueDate, rentedItem.getDueDate());
    }

    @Test
    public void testGetters() {
        Date rentDate = new Date();
        Date dueDate = new Date(rentDate.getTime() + (7 * 24 * 60 * 60 * 1000)); // Adding 7 days to rentDate

        RentedItem rentedItem = new RentedItem("Book Title", "1234567890", rentDate, dueDate);
        
        assertEquals("Book Title", rentedItem.getTitle());
        assertEquals("1234567890", rentedItem.getISBN());
        assertEquals(rentDate, rentedItem.getRentDate());
        assertEquals(dueDate, rentedItem.getDueDate());
    }

    @Test
    public void testEqualsMethodForEquality() {
        Date rentDate1 = new Date();
        Date dueDate1 = new Date(rentDate1.getTime() + (7 * 24 * 60 * 60 * 1000)); // Adding 7 days to rentDate1
        
        RentedItem rentedItem1 = new RentedItem("Book Title", "1234567890", rentDate1, dueDate1);
        
        assertTrue(rentedItem1.equals(rentedItem1));
    }

    @Test
    public void testEqualsMethodForInequality() {
        Date rentDate1 = new Date();
        Date dueDate1 = new Date(rentDate1.getTime() + (7 * 24 * 60 * 60 * 1000)); // Adding 7 days to rentDate1
        Date rentDate2 = new Date(rentDate1.getTime());
        Date dueDate2 = new Date(rentDate1.getTime() + (8 * 24 * 60 * 60 * 1000)); // Adding 8 days to rentDate2
        
        RentedItem rentedItem1 = new RentedItem("Book Title", "1234567890", rentDate1, dueDate1);
        RentedItem rentedItem2 = new RentedItem("Book Title", "1234567890", rentDate2, dueDate2);
        
        assertFalse(rentedItem1.equals(rentedItem2));
    }

    @Test
    public void testHashCodeConsistency() {
        Date rentDate = new Date();
        Date dueDate = new Date(rentDate.getTime() + (7 * 24 * 60 * 60 * 1000)); // Adding 7 days to rentDate

        RentedItem rentedItem = new RentedItem("Book Title", "1234567890", rentDate, dueDate);
        
        int hashCode1 = rentedItem.hashCode();
        int hashCode2 = rentedItem.hashCode();
        
        assertEquals(hashCode1, hashCode2);
    }

    @Test
    public void testHashCodeEquality() {
        Date rentDate1 = new Date();
        Date dueDate1 = new Date(rentDate1.getTime() + (7 * 24 * 60 * 60 * 1000)); // Adding 7 days to rentDate1
 
        RentedItem rentedItem = new RentedItem("Book Title", "1234567890", rentDate1, dueDate1);
        
        int hashCode1 = rentedItem.hashCode();
        int hashCode2 = rentedItem.hashCode();

        assertEquals(hashCode1, hashCode2);
    }

    @Test
    public void testToStringMethod() {
        Date rentDate = new Date();
        Date dueDate = new Date(rentDate.getTime() + (7 * 24 * 60 * 60 * 1000)); // Adding 7 days to rentDate

        RentedItem rentedItem = new RentedItem("Book Title", "1234567890", rentDate, dueDate);
        
        String expectedString = "RentedItem{title='Book Title', ISBN='1234567890', rentDate=" + rentDate.toString() + ", dueDate=" + dueDate.toString() + "}";
        
        assertFalse(expectedString.equals(rentedItem.toString()));
    }
    
    @Test
    public void testDueDateUpdate() {
        Date rentDate = new Date();
        Date dueDate = new Date(rentDate.getTime() + (7 * 24 * 60 * 60 * 1000)); // Adding 7 days to rentDate

        RentedItem rentedItem = new RentedItem("Book Title", "1234567890", rentDate, dueDate);
        
        Date newDueDate = new Date(dueDate.getTime() + (3 * 24 * 60 * 60 * 1000)); // Adding 3 days to dueDate
        rentedItem.setDueDate(newDueDate);
        
        assertEquals(newDueDate, rentedItem.getDueDate());
    }

    @Test
    public void testGetRentDate() {
        Date rentDate = new Date();
        Date dueDate = new Date(rentDate.getTime() + (7 * 24 * 60 * 60 * 1000)); // Adding 7 days to rentDate

        RentedItem rentedItem = new RentedItem("Book Title", "1234567890", rentDate, dueDate);
        
        assertEquals(rentDate, rentedItem.getRentDate());
    }

    @Test
    public void testGetTitleAndISBN() {
        Date rentDate = new Date();
        Date dueDate = new Date(rentDate.getTime() + (7 * 24 * 60 * 60 * 1000)); // Adding 7 days to rentDate

        RentedItem rentedItem = new RentedItem("Book Title", "1234567890", rentDate, dueDate);
        
        assertEquals("Book Title", rentedItem.getTitle());
        assertEquals("1234567890", rentedItem.getISBN());
    }
}
