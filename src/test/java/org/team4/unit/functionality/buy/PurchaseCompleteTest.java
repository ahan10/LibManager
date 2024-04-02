package org.team4.unit.functionality.buy;

import org.junit.Before;
import org.junit.Test;
import org.team4.functionality.buy.ItemToPurchase;
import org.team4.functionality.buy.PurchaseComplete;
import org.team4.model.items.Book;
import org.team4.model.items.Item;
import org.team4.model.items.Newsletter;
import org.team4.model.paymentmodes.CreditCard;
import org.team4.model.paymentmodes.MobileWallet;
import org.team4.model.paymentmodes.PayPal;
import org.team4.model.paymentmodes.PaymentValidator;
import org.team4.model.user.Faculty;
import org.team4.model.user.Student;
import org.team4.model.user.User;

import static org.junit.Assert.*;

public class PurchaseCompleteTest {
    Item item, i1;
    User user1, user2, user3;
    Newsletter newsletter;
    ItemToPurchase itemToPurchase1, itemToPurchase2, itemToPurchase3;

    PaymentValidator valid1, valid2, valid3, valid4, invalid1, invalid2, invalid3, invalid4;

    PurchaseComplete purchaseComplete1, purchaseComplete2, purchaseComplete3, purchaseComplete4,
            purchaseComplete5, purchaseComplete6, purchaseComplete7, purchaseComplete8;

    @Before
    public void setup(){
        i1 = new Item("Python Crash Course",
                2001,
                12,
                129.99,
                "1234512345",
                true,
                true);

        item = new Book(i1,
                "Textbook",
                300,
                "John Doe",
                "Pearson",
                12,
                true,
                false);

        newsletter = new Newsletter("New York Time",
                "www.somelink.com",
                7.99);

        user1 = new Student("jane.doe@gmail.com",
                "password1",
                "Jane Doe",
                "STUDENT",
                true);

        user2 = new Faculty("joe.doe@gmail.com",
                "password1",
                "Joe Doe",
                "FACULTY",
                true);

        user3 = new Student("may.doe@gmail.com",
                "password1",
                "May Doe",
                "STUDENT",
                true);

        itemToPurchase1 = new ItemToPurchase(item, user1);
        itemToPurchase2 = new ItemToPurchase(newsletter, user2);
        itemToPurchase3 = new ItemToPurchase(15.99, user3);

        valid1 = new CreditCard("1234567890123456", 2026, 5);
        invalid1 = new CreditCard("1234567890123456", 2021, 5);

        valid2 = new CreditCard("1234567890123456", 2026, 5);
        invalid2 = new CreditCard("1234567890123456", 2021, 5);

        valid3 = new MobileWallet("1234567890");
        invalid3 = new MobileWallet("123456789009876");

        valid4 = new PayPal("john.doe@example.com");
        invalid4 = new PayPal("john.doe@example");

        purchaseComplete1 = new PurchaseComplete(itemToPurchase1, valid1);
        purchaseComplete2 = new PurchaseComplete(itemToPurchase2, valid2);
        purchaseComplete3 = new PurchaseComplete(itemToPurchase3, valid3);
        purchaseComplete4 = new PurchaseComplete(itemToPurchase3, valid4);

        purchaseComplete5 = new PurchaseComplete(itemToPurchase1, invalid1);
        purchaseComplete6 = new PurchaseComplete(itemToPurchase2, invalid2);
        purchaseComplete7 = new PurchaseComplete(itemToPurchase3, invalid3);
        purchaseComplete8 = new PurchaseComplete(itemToPurchase3, invalid4);
    }

    @Test
    public void test_getAmount1(){
        assertEquals(purchaseComplete1.getAmount(), itemToPurchase1.getAmount(), 0.0001);
    }

    @Test
    public void test_getAmount2(){
        assertEquals(purchaseComplete2.getAmount(), itemToPurchase2.getAmount(), 0.0001);
    }

    @Test
    public void test_getAmount3(){
        assertEquals(purchaseComplete3.getAmount(), itemToPurchase3.getAmount(), 0.0001);
    }

    @Test
    public void test_getItem_NotNull(){
        assertNotNull(purchaseComplete1.getItem());
        assertEquals(purchaseComplete1.getItem(), item);
    }

    @Test
    public void test_getItem_Null(){
        assertNull(purchaseComplete2.getItem());
        assertNull(purchaseComplete3.getItem());
    }

    @Test
    public void test_getNewsletter_NotNull(){
        assertNotNull(purchaseComplete2.getNewsletter());
    }

    @Test
    public void test_getNewsletter_Null(){
        assertNull(purchaseComplete1.getNewsletter());
        assertNull(purchaseComplete3.getNewsletter());
    }

    @Test
    public void test_getUser_1(){
        assertEquals(purchaseComplete1.getUser(), user1);
    }

    @Test
    public void test_getUser_2(){
        assertEquals(purchaseComplete2.getUser(), user2);
    }

    @Test
    public void test_getUser_3(){
        assertEquals(purchaseComplete3.getUser(), user3);
    }

}