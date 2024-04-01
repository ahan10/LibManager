package org.team4.unit.utils;

import org.junit.Test;
import org.team4.utils.EmailValidator;

import static org.junit.Assert.*;

public class EmailValidatorTest {
    @Test
    public void test_valid_1(){
        assertTrue(EmailValidator.validEmail("john.doe@example.com"));
    }

    @Test
    public void test_valid_2(){
        assertTrue(EmailValidator.validEmail("alice_smith1234@gmail.com"));
    }

    @Test
    public void test_valid_3(){
        assertTrue(EmailValidator.validEmail("info@company.com"));
    }

    @Test
    public void test_valid_4(){
        assertTrue(EmailValidator.validEmail("jennifer-123@yahoo.co.uk"));
    }

    @Test
    public void test_valid_5(){
        assertTrue(EmailValidator.validEmail("bob@email.co.jp"));
    }

    @Test
    public void test_invalid_1(){
        assertFalse(EmailValidator.validEmail("john.doe@example"));
    }

    @Test
    public void test_invalid_2(){
        assertFalse(EmailValidator.validEmail("alice.smith@gmail "));
    }

    @Test
    public void test_invalid_3(){
        assertFalse(EmailValidator.validEmail("@company.com"));
    }

    @Test
    public void test_invalid_4(){
        assertFalse(EmailValidator.validEmail("jennifer@123@yahoo.com"));
    }

    @Test
    public void test_invalid_5(){
        assertFalse(EmailValidator.validEmail("bob@email..com"));
    }

}