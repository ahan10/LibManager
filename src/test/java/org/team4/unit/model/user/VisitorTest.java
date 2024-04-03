package org.team4.unit.model.user;

import org.junit.Before;
import org.junit.Test;
import org.team4.model.user.Visitor;

import static org.junit.Assert.*;

public class VisitorTest {
    Visitor v1, v2;

    @Before
    public void setUp(){
        v1 = new Visitor(
                "emailID@example.com",
                "password1",
                "Jane Doe",
                "VISITOR");

        v2 = new Visitor(
                "email@example.com",
                "password2",
                "John Doe",
                "VISITOR",
                false
        );
    }

    @Test
    public void test_getEmail_1(){
        assertEquals("emailID@example.com", v1.getEmail());
    }

    @Test
    public void test_getEmail_2(){
        assertEquals("email@example.com", v2.getEmail());
    }

    @Test
    public void test_getPassword_1(){
        assertEquals("password1", v1.getPassword());
    }

    @Test
    public void test_getPassword_2(){
        assertEquals("password2", v2.getPassword());
    }

    @Test
    public void test_getName_1(){
        assertEquals("Jane Doe", v1.getName());
    }

    @Test
    public void test_getName_2(){
        assertEquals("John Doe", v2.getName());
    }

    @Test
    public void test_getType_1(){
        assertEquals("VISITOR", v1.getType());
    }

    @Test
    public void test_getType_2(){
        assertEquals("VISITOR", v2.getType());
    }

    @Test
    public void test_isValidated_1(){
        assertTrue(v1.isValidated());
    }

    @Test
    public void test_isValidated_2(){
        assertFalse(v2.isValidated());
    }
}