package org.team4.unit.model.paymentmodes;

import org.junit.Before;
import org.junit.Test;
import org.team4.model.paymentmodes.MobileWallet;

import static org.junit.Assert.*;

public class MobileWalletTest {
    MobileWallet mobileWalletValid, mobileWalletInvalidLong, mobileWalletInvalidShort, mobileWalletTooLong, mobileWalletTooShort;

    @Before
    public void setup(){
        mobileWalletValid = new MobileWallet("1234567890");
        mobileWalletInvalidLong = new MobileWallet("12345678900");
        mobileWalletInvalidShort = new MobileWallet("123");
        mobileWalletTooLong = new MobileWallet("1111111222222233333343454545454");
        mobileWalletTooShort = new MobileWallet("");
    }

    @Test
    public void test_isValid_true_1(){
        assertTrue(mobileWalletValid.isValid());
    }

    @Test
    public void test_isValid_false_1(){
        assertFalse(mobileWalletInvalidLong.isValid());
    }

    @Test
    public void test_isValid_false_2(){
        assertFalse(mobileWalletInvalidShort.isValid());
    }

    @Test
    public void test_isValid_false_3(){
        assertFalse(mobileWalletTooShort.isValid());
    }

    @Test
    public void test_isValid_false_4(){
        assertFalse(mobileWalletTooLong.isValid());
    }

    @Test
    public void test_getMode_1(){
        assertEquals("Mobile Wallet", mobileWalletValid.getMode());
    }

    @Test
    public void test_getMode_2(){
        assertEquals("Mobile Wallet", mobileWalletInvalidLong.getMode());
    }

    @Test
    public void test_getMode_3(){
        assertEquals("Mobile Wallet", mobileWalletInvalidShort.getMode());
    }

    @Test
    public void test_getMode_4(){
        assertEquals("Mobile Wallet", mobileWalletTooLong.getMode());
    }

    @Test
    public void test_getMode_5(){
        assertEquals("Mobile Wallet", mobileWalletTooShort.getMode());
    }

}