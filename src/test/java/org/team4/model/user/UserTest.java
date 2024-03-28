package org.team4.model.user;

import  org.junit.*;
import static org.junit.Assert.*;

public class UserTest {
    User u1, u2;
    @Before
    public void setUp() {
        u1 = new User(
                "email@example.com",
                "password",
                "John DOe",
                "VISITOR"
        );

        u2 = new User(
                "emailID@example.com",
                "password1",
                "Jane Doe",
                "STUDENT",
                true
        );
    }

    @Test
    public void getEmail() {
        assertEquals("email@example.com", u1.getEmail());
    }

    @Test
    public void setEmail() {
        u1.setEmail("other@email.com");
        assertEquals("other@email.com", u1.getEmail());
    }

    @Test
    public void getPassword() {
        assertEquals("password1", u2.getPassword());
    }

    @Test
    public void setPassword() {
        u2.setPassword("newpassword");
        assertEquals("newpassword", u2.getPassword());
    }

    @Test
    public void getName() {
        assertEquals("Jane Doe", u2.getName());
    }

    @Test
    public void setName() {
        u2.setName("Jack Doe");
        assertEquals("Jack Doe", u2.getName());
    }

    @Test
    public void getType() {
        assertEquals("VISITOR", u1.getType());
        assertEquals("STUDENT", u2.getType());
    }

    @Test
    public void setType() {
        u2.setType("FACULTY");
        assertEquals("FACULTY", u2.getType());
    }

    @Test
    public void isValidated() {
        assertTrue(u1.isValidated());
        assertTrue(u2.isValidated());
    }

    @Test
    public void setValidated() {
        u1.setValidated(true);
        assertTrue(u1.isValidated());
    }

}