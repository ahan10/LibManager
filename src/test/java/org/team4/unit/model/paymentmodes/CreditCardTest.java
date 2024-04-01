package org.team4.unit.model.paymentmodes;

import org.junit.Before;
import org.junit.Test;
import org.team4.model.paymentmodes.CreditCard;

import static org.junit.Assert.*;

public class CreditCardTest {
    CreditCard creditCardValid, ccInvalidExpired, ccInvalidLongNumber;
    String ccNumber;
    int year, month;

    @Before
    public void setup(){
        ccNumber = "1234567890123456";
        year = 2028;
        month = 5;

        creditCardValid = new CreditCard(ccNumber, year, month);
        ccInvalidExpired = new CreditCard(ccNumber, 2021, month);
        ccInvalidLongNumber = new CreditCard("11223344556677889900", year, month);
    }

    @Test
    public void test_isValidFalse_1(){
        assertFalse(ccInvalidLongNumber.isValid());
    }

    @Test
    public void test_isValidFalse_2(){
        assertFalse(ccInvalidExpired.isValid());
    }

    @Test
    public void test_correctLength_1(){
        assertTrue(creditCardValid.correctLength());
    }

    @Test
    public void test_getMode_1(){
        assertEquals("Credit Card", creditCardValid.getMode());
    }

    @Test
    public void test_notExpired_1(){
        assertTrue(creditCardValid.notExpired());
    }

    @Test
    public void test_isValid(){
        assertTrue(creditCardValid.isValid());
    }

    @Test
    public void test_correctLength_2(){
        assertTrue(ccInvalidExpired.correctLength());
    }

    @Test
    public void test_incorrectLength_1(){
        assertFalse(ccInvalidLongNumber.correctLength());
    }

    @Test
    public void test_getMode_2(){
        assertEquals("Credit Card", ccInvalidExpired.getMode());
    }

    @Test
    public void test_getMode_3(){
        assertEquals("Credit Card", ccInvalidLongNumber.getMode());
    }

    @Test
    public void test_notExpired_2(){
        assertTrue(ccInvalidLongNumber.notExpired());
    }

    @Test
    public void test_expired_1(){
        assertFalse(ccInvalidExpired.notExpired());
    }

}