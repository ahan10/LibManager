package org.team4.unit.functionality.buy;

import org.junit.Before;
import org.junit.Test;
import org.team4.functionality.buy.ItemToPurchase;
import org.team4.functionality.buy.ProcessPayment;
import org.team4.model.items.Book;
import org.team4.model.items.Item;
import org.team4.model.paymentmodes.CreditCard;
import org.team4.model.paymentmodes.MobileWallet;
import org.team4.model.paymentmodes.PayPal;
import org.team4.model.paymentmodes.PaymentValidator;
import org.team4.model.user.Student;
import org.team4.model.user.User;

import static org.junit.Assert.*;

public class ProcessPaymentTest {
    PaymentValidator valid1, valid2, valid3, valid4, invalid1, invalid2, invalid3_1, invalid3_2, invalid4_1, invalid4_2;
    Item item, i1;
    User user1;
    ItemToPurchase itemToPurchase1;
    ProcessPayment processPayment1, processPayment2, processPayment3, processPayment4,
                    processPayment5, processPayment6, processPayment7, processPayment8, processPayment9, processPayment10;

    @Before
    public void setup(){
        valid1 = new CreditCard("1234567890123456", 2026, 5);
        invalid1 = new CreditCard("1234567890123456", 2021, 5);

        valid2 = new CreditCard("1234567890123456", 2026, 5);
        invalid2 = new CreditCard("1234567890123456", 2021, 5);

        valid3 = new MobileWallet("1234567890");
        invalid3_1 = new MobileWallet("123456789009876");
        invalid3_2 = new MobileWallet("123");

        valid4 = new PayPal("john.doe@example.com");
        invalid4_1 = new PayPal("john.doe@example");
        invalid4_2 = new PayPal("");

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

        user1 = new Student("jane.doe@gmail.com",
                "password1",
                "Jane Doe",
                "STUDENT",
                true);

        itemToPurchase1 = new ItemToPurchase(item, user1);

        processPayment1 = new ProcessPayment(valid1, itemToPurchase1);
        processPayment2 = new ProcessPayment(valid2, itemToPurchase1);
        processPayment3 = new ProcessPayment(valid3, itemToPurchase1);
        processPayment4 = new ProcessPayment(valid4, itemToPurchase1);

        processPayment5 = new ProcessPayment(invalid1, itemToPurchase1);
        processPayment6 = new ProcessPayment(invalid2, itemToPurchase1);
        processPayment7 = new ProcessPayment(invalid3_1, itemToPurchase1);
        processPayment8 = new ProcessPayment(invalid4_1, itemToPurchase1);

        processPayment9 = new ProcessPayment(invalid3_2, itemToPurchase1);
        processPayment10 = new ProcessPayment(invalid4_2, itemToPurchase1);

    }

    @Test
    public void test_valid_1(){
        assertNotNull(processPayment1.getPurchaseCompleted());
    }

    @Test
    public void test_valid_2(){
        assertNotNull(processPayment2.getPurchaseCompleted());
    }

    @Test
    public void test_valid_3(){
        assertNotNull(processPayment3.getPurchaseCompleted());
    }

    @Test
    public void test_valid_4(){
        assertNotNull(processPayment4.getPurchaseCompleted());
    }

    @Test
    public void test_notValid_1(){
        assertNull(processPayment5.getPurchaseCompleted());
    }

    @Test
    public void test_notValid_2(){
        assertNull(processPayment6.getPurchaseCompleted());
    }

    @Test
    public void test_notValid_3(){
        assertNull(processPayment7.getPurchaseCompleted());
    }

    @Test
    public void test_notValid_4(){
        assertNull(processPayment8.getPurchaseCompleted());
    }

    @Test
    public void test_notValid_5(){
        assertNull(processPayment9.getPurchaseCompleted());
    }

    @Test
    public void test_notValid_6(){
        assertNull(processPayment10.getPurchaseCompleted());
    }

}