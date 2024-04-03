package org.team4.unit.model.paymentmodes;

import org.junit.Before;
import org.junit.Test;
import org.team4.model.paymentmodes.PayPal;

import static org.junit.Assert.*;

public class PayPalTest {
    PayPal payPalValid, payPalInvalid, payPalEmpty, payPalInvalid1;

    @Before
    public void setup(){
        payPalValid = new PayPal("john.doe@example.com");
        payPalInvalid = new PayPal("john.doe@example");
        payPalEmpty = new PayPal("");
        payPalInvalid1 = new PayPal("bob@email..com");
    }

    @Test
    public void test_isValid_true(){
        assertTrue(payPalValid.isValid());
    }

    @Test
    public void test_isValid_false_1(){
        assertFalse(payPalInvalid.isValid());
    }

    @Test
    public void test_isValid_false_2(){
        assertFalse(payPalEmpty.isValid());
    }

    @Test
    public void test_isValid_false_3(){
        assertFalse(payPalInvalid1.isValid());
    }

    @Test
    public void test_getMode_1(){
        assertEquals("PayPal", payPalValid.getMode());
    }

    @Test
    public void test_getMode_2(){
        assertEquals("PayPal", payPalInvalid.getMode());
    }

    @Test
    public void test_getMode_3(){
        assertEquals("PayPal", payPalEmpty.getMode());
    }

    @Test
    public void test_toString_1(){
        assertEquals("PayPal{email='john.doe@example.com'}", payPalValid.toString());
    }

    @Test
    public void test_toString_2(){
        assertEquals("PayPal{email='john.doe@example'}", payPalInvalid.toString());
    }

    @Test
    public void test_toString_3(){
        assertEquals("PayPal{email=''}", payPalEmpty.toString());
    }

}