package org.team4.unit.model.paymentmodes;

import org.junit.Before;
import org.junit.Test;
import org.team4.model.paymentmodes.DebitCard;

import static org.junit.Assert.*;

public class DebitCardTest {
    DebitCard DebitCardValid, dcInvalidExpired, dcInvalidLongNumber;
    String dcNumber;
    int year, month;

    @Before
    public void setup(){
        dcNumber = "1234567890123456";
        year = 2028;
        month = 5;

        DebitCardValid = new DebitCard(dcNumber, year, month);
        dcInvalidExpired = new DebitCard(dcNumber, 2021, month);
        dcInvalidLongNumber = new DebitCard("11223344556677889900", year, month);
    }

    @Test
    public void test_isValidFalse_1(){
        assertFalse(dcInvalidLongNumber.isValid());
    }

    @Test
    public void test_isValidFalse_2(){
        assertFalse(dcInvalidExpired.isValid());
    }

    @Test
    public void test_correctLength_1(){
        assertTrue(DebitCardValid.correctLength());
    }

    @Test
    public void test_getMode_1(){
        assertEquals("Debit Card", DebitCardValid.getMode());
    }

    @Test
    public void test_notExpired_1(){
        assertTrue(DebitCardValid.notExpired());
    }

    @Test
    public void test_isValid(){
        assertTrue(DebitCardValid.isValid());
    }

    @Test
    public void test_correctLength_2(){
        assertTrue(dcInvalidExpired.correctLength());
    }

    @Test
    public void test_incorrectLength_1(){
        assertFalse(dcInvalidLongNumber.correctLength());
    }

    @Test
    public void test_getMode_2(){
        assertEquals("Debit Card", dcInvalidExpired.getMode());
    }

    @Test
    public void test_getMode_3(){
        assertEquals("Debit Card", dcInvalidLongNumber.getMode());
    }

    @Test
    public void test_notExpired_2(){
        assertTrue(dcInvalidLongNumber.notExpired());
    }

    @Test
    public void test_expired_1(){
        assertFalse(dcInvalidExpired.notExpired());
    }
}