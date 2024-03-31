package org.team4.unit.model.user;

import org.junit.Before;
import org.junit.Test;
import org.team4.model.user.Manager;

import static org.junit.Assert.*;

public class ManagerTest {
    Manager m;

    @Before
    public void setup(){
        m = new Manager(
                "emailID@example.com",
                "password1",
                "Jane Doe",
                "MANAGER",
                1234567890L
        );
    }

    @Test
    public void test_constructor_1(){
        Manager m1 = new Manager(
                "emailID@example.com",
                "password1",
                "Jane Doe",
                "MANAGER"
        );
        assertEquals("emailID@example.com", m1.getEmail());
        assertEquals("password1", m1.getPassword());
        assertEquals("Jane Doe", m1.getName());
        assertEquals("MANAGER", m1.getType());
        assertFalse(m1.isValidated());
    }

    @Test
    public void test_constructor_2(){
        Manager m1 = new Manager(
                "emailID@example.com",
                "password1",
                "Jane Doe",
                "MANAGER",
                true
        );
        assertEquals("emailID@example.com", m1.getEmail());
        assertEquals("password1", m1.getPassword());
        assertEquals("Jane Doe", m1.getName());
        assertEquals("MANAGER", m1.getType());
        assertTrue(m1.isValidated());
    }

    @Test
    public void test_constructor_3(){
        Manager m1 = new Manager(
                "emailID@example.com",
                "password1",
                "Jane Doe",
                "MANAGER",
                1234567890L
        );
        assertEquals("emailID@example.com", m1.getEmail());
        assertEquals("password1", m1.getPassword());
        assertEquals("Jane Doe", m1.getName());
        assertEquals("MANAGER", m1.getType());
        assertFalse(m1.isValidated());
    }

    @Test
    public void test_getID(){
        assertEquals(1234567890L, m.getManagerID());
    }

    @Test
    public void test_setID(){
        m.setManagerID(123409876L);
        assertEquals(123409876L, m.getManagerID());
    }

    @Test
    public void test_getType(){
        assertEquals("MANAGER", m.getType());
    }

    @Test
    public void test_getName(){
        assertEquals("Jane Doe", m.getName());
    }

    @Test
    public void test_getEmail(){
        assertEquals("emailID@example.com", m.getEmail());
    }

    @Test
    public void test_getPassword(){
        assertEquals("password1", m.getPassword());
    }

    @Test
    public void test_NotEquals(){
        assertNotEquals("password1123", m.getPassword());
    }

}