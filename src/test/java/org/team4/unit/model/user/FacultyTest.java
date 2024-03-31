package org.team4.unit.model.user;

import org.junit.Before;
import org.junit.Test;
import org.team4.model.user.Faculty;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FacultyTest {
    public static final String TYPE = "FACULTY";
    Faculty faculty1;
    ArrayList<String> courses;

    @Before
    public void setup(){

        courses =  new ArrayList<>();

        courses.add("course1");
        courses.add("course2");
        courses.add("course3");
        courses.add("course4");


        faculty1 = new Faculty(
                "emailID@example.com",
                "password1",
                "Jane Doe",
                TYPE,
                1234567890L,
                courses
        );
    }

    @Test
    public void test_constructor_1(){
        Faculty faculty = new Faculty(
                "emailID@example.com",
                "password1",
                "Jane Doe",
                TYPE
        );
        assertEquals("emailID@example.com", faculty.getEmail());
        assertEquals("password1", faculty.getPassword());
        assertEquals("Jane Doe", faculty.getName());
        assertEquals(TYPE, faculty.getType());
        assertFalse(faculty.isValidated());
    }

    @Test
    public void test_constructor_2(){
        Faculty faculty = new Faculty(
                "emailID@example.com",
                "password1",
                "Jane Doe",
                TYPE,
                true
        );
        assertEquals("emailID@example.com", faculty.getEmail());
        assertEquals("password1", faculty.getPassword());
        assertEquals("Jane Doe", faculty.getName());
        assertEquals(TYPE, faculty.getType());
        assertTrue(faculty.isValidated());
    }

    @Test
    public void test_constructor_3(){
        Faculty m1 = new Faculty(
                "emailID@example.com",
                "password1",
                "Jane Doe",
                TYPE,
                1234567890L,
                courses
        );
        assertEquals("emailID@example.com", m1.getEmail());
        assertEquals("password1", m1.getPassword());
        assertEquals("Jane Doe", m1.getName());
        assertEquals(TYPE, m1.getType());
        assertFalse(m1.isValidated());
    }

    @Test
    public void test_getID(){
        assertEquals(1234567890L, faculty1.getFacultyID());
    }

    @Test
    public void test_setID(){
        faculty1.setFacultyID(123409876L);
        assertEquals(123409876L, faculty1.getFacultyID());
    }

    @Test
    public void test_getType(){
        assertEquals(TYPE, faculty1.getType());
    }

    @Test
    public void test_getName(){
        assertEquals("Jane Doe", faculty1.getName());
    }

    @Test
    public void test_getEmail(){
        assertEquals("emailID@example.com", faculty1.getEmail());
    }

    @Test
    public void test_getPassword(){
        assertEquals("password1", faculty1.getPassword());
    }

    @Test
    public void test_NotEquals(){
        assertNotEquals("password1123", faculty1.getPassword());
    }

    @Test
    public void getCourses() {
        assertEquals(courses, faculty1.getCourses());
    }

    @Test
    public void setCourses() {
        courses.add("course5");
        faculty1.setCourses(courses);

        assertEquals(courses, faculty1.getCourses());
    }

}