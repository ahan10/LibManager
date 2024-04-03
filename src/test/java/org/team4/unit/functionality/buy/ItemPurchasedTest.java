package org.team4.unit.functionality.buy;

import org.junit.Before;
import org.junit.Test;
import org.team4.functionality.buy.ItemPurchased;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

public class ItemPurchasedTest {
    ItemPurchased item1, item2;
    Date date1, date2;
    String title1, title2, email1, email2;

    @Before
    public void setup(){
        date1 = new Date();
        date2 = new Date(2024, Calendar.DECEMBER, 30);

        title1 = "Python Crash Course";
        title2 = "To Kill a Mocking Bird";

        email1 = "john.doe@example.com";
        email2 = "jane.doe@example.com";

        item1 = new ItemPurchased(title1,
                email1);

        item2 = new ItemPurchased(title2,
                email2,
                date2);
    }

    @Test
    public void test_getTitle(){
        assertEquals(title1, item1.getTitle());
        assertEquals(title2, item2.getTitle());
    }

    @Test
    public void test_getEmail(){
        assertEquals(email1, item1.getEmail());
        assertEquals(email2, item2.getEmail());
    }

    @Test
    public void test_getDatePurchased(){
        assertEquals(date1, item1.getDatePurchased());
        assertEquals(date2, item2.getDatePurchased());
    }

    @Test
    public void test_toString_1(){
        assertEquals("ItemPurchased{title='Python Crash Course', email='john.doe@example.com', datePurchased=" + date1.toString() + "}", item1.toString());
    }

    @Test
    public void test_toString_2(){
        assertEquals("ItemPurchased{title='To Kill a Mocking Bird', email='jane.doe@example.com', datePurchased=Tue Dec 30 00:00:00 EST 3924}", item2.toString());
    }

    @Test
    public void test_constructor_1_1(){
        assertNotNull(item1);
    }

    @Test
    public void test_constructor_1_2(){
        assertNotNull(item1.getDatePurchased());
    }

    @Test
    public void test_constructor_2_1(){
        assertNotNull(item2);
    }

    @Test
    public void test_constructor_2_2(){
        assertNotNull(item2.getDatePurchased());
    }

    @Test
    public void test_NotEquals(){
        assertNotEquals(item1, item2);
    }

}