package org.team4.unit.model.paymentmodes;

import org.junit.Before;
import org.junit.Test;
import org.team4.model.paymentmodes.PayPal;

import static org.junit.Assert.*;

public class PayPalTest {
    PayPal payPalValid, payPalInvalid;

    @Before
    public void setup(){
        payPalValid = new PayPal("john.doe@example.com");
        payPalInvalid = new PayPal("john.doe@example");
    }

    @Test
    public void test_isValid_true(){
        assertTrue(payPalValid.isValid());
    }

    @Test
    public void test_isValid_false(){
        assertFalse(payPalInvalid.isValid());
    }

    @Test
    public void test_getMode_1(){
        assertEquals("PayPal", payPalValid.getMode());
    }

    @Test
    public void test_getMode_2(){
        assertEquals("PayPal", payPalInvalid.getMode());
    }

}