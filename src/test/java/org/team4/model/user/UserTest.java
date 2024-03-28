package org.team4.model.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User u1, u2;
    @BeforeEach
    void setUp() {
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
    void getEmail() {
        assertEquals("email@example.com", u1.getEmail());
    }

    @Test
    void setEmail() {
        u1.setEmail("other@email.com");
        assertEquals("other@email.com", u1.getEmail());
    }

    @Test
    void getPassword() {
        assertEquals("password1", u2.getPassword());
    }

    @Test
    void setPassword() {
        u2.setPassword("newpassword");
        assertEquals("newpassword", u2.getPassword());
    }

    @Test
    void getName() {
        assertEquals("Jane Doe", u2.getName());
    }

    @Test
    void setName() {
        u2.setName("Jack Doe");
        assertEquals("Jack Doe", u2.getName());
    }

    @Test
    void getType() {
        assertEquals("VISITOR", u1.getType());
        assertEquals("STUDENT", u2.getType());
    }

    @Test
    void setType() {
        u2.setType("FACULTY");
        assertEquals("FACULTY", u2.getType());
    }

    @Test
    void isValidated() {
        assertTrue(u1.isValidated());
        assertTrue(u2.isValidated());
    }

    @Test
    void setValidated() {
        u1.setValidated(true);
        assertTrue(u1.isValidated());
    }

}