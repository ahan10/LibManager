package org.team4.unit.model.user;

import org.junit.Before;
import org.junit.Test;
import org.team4.model.user.NonFaculty;

import static org.junit.Assert.*;

public class NonFacultyTest {
    public static final String TYPE = "NONFACULTY";
    NonFaculty nonFaculty;

    @Before
    public void setup(){
        nonFaculty = new NonFaculty(
                "emailID@example.com",
                "password1",
                "Jane Doe",
                TYPE,
                1234567890L
        );
    }

    @Test
    public void test_constructor_1(){
        NonFaculty m1 = new NonFaculty(
                "emailID@example.com",
                "password1",
                "Jane Doe",
                TYPE
        );
        assertEquals("emailID@example.com", m1.getEmail());
        assertEquals("password1", m1.getPassword());
        assertEquals("Jane Doe", m1.getName());
        assertEquals(TYPE, m1.getType());
        assertFalse(m1.isValidated());
    }

    @Test
    public void test_constructor_2(){
        NonFaculty m1 = new NonFaculty(
                "emailID@example.com",
                "password1",
                "Jane Doe",
                TYPE,
                true
        );
        assertEquals("emailID@example.com", m1.getEmail());
        assertEquals("password1", m1.getPassword());
        assertEquals("Jane Doe", m1.getName());
        assertEquals(TYPE, m1.getType());
        assertTrue(m1.isValidated());
    }

    @Test
    public void test_constructor_3(){
        NonFaculty m1 = new NonFaculty(
                "emailID@example.com",
                "password1",
                "Jane Doe",
                TYPE,
                1234567890L
        );
        assertEquals("emailID@example.com", m1.getEmail());
        assertEquals("password1", m1.getPassword());
        assertEquals("Jane Doe", m1.getName());
        assertEquals(TYPE, m1.getType());
        assertFalse(m1.isValidated());
    }

    @Test
    public void test_getID(){
        assertEquals(1234567890L, nonFaculty.getUniversityID());
    }

    @Test
    public void test_setID(){
        nonFaculty.setUniversityID(123409876L);
        assertEquals(123409876L, nonFaculty.getUniversityID());
    }

    @Test
    public void test_getType(){
        assertEquals(TYPE, nonFaculty.getType());
    }

    @Test
    public void test_getName(){
        assertEquals("Jane Doe", nonFaculty.getName());
    }

    @Test
    public void test_getEmail(){
        assertEquals("emailID@example.com", nonFaculty.getEmail());
    }

    @Test
    public void test_getPassword(){
        assertEquals("password1", nonFaculty.getPassword());
    }

    @Test
    public void test_NotEquals(){
        assertNotEquals("password1123", nonFaculty.getPassword());
    }
}