package org.team4.unit.model.user;

import org.junit.Test;
import org.team4.model.user.Visitor;

import static org.junit.Assert.*;

public class VisitorTest {
    @Test
    public void test_constructor_1(){
        Visitor v1 = new Visitor(
                "emailID@example.com",
                "password1",
                "Jane Doe",
                "VISITOR"
        );
        assertEquals("emailID@example.com", v1.getEmail());
        assertEquals("password1", v1.getPassword());
        assertEquals("Jane Doe", v1.getName());
        assertEquals("VISITOR", v1.getType());
        assertTrue(v1.isValidated());
    }

    @Test
    public void test_constructor_2(){
        Visitor v1 = new Visitor(
                "emailID@example.com",
                "password1",
                "Jane Doe",
                "VISITOR",
                false
        );
        assertEquals("emailID@example.com", v1.getEmail());
        assertEquals("password1", v1.getPassword());
        assertEquals("Jane Doe", v1.getName());
        assertEquals("VISITOR", v1.getType());
        assertFalse(v1.isValidated());
    }

}