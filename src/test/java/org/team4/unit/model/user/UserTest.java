package org.team4.unit.model.user;

import  org.junit.*;
import org.team4.model.user.User;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void test_toString(){
        String actual = "User [email=emailID@example.com, password=password1, name=Jane Doe, type=STUDENT, validated=true]";
        assertEquals(actual, u2.toString());
    }

}