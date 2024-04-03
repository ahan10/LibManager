package org.team4.unit.model.user;

import java.util.ArrayList;

import org.junit.*;
import org.team4.model.user.Student;

import static org.junit.Assert.*;

public class StudentTest {

    Student s1, s2, s3;
    ArrayList<String> courses;

    @Before
    public void setup(){

        courses =  new ArrayList<>();

        courses.add("course1");
        courses.add("course2");
        courses.add("course3");
        courses.add("course4");

        s1 = new Student(
                "email@example.com",
                "password",
                "John Doe",
                "STUDENT",
                courses
        );
    }

    @Test
    public void getCourses() {
        assertEquals(courses, s1.getCourses());
    }

    @Test
    public void setCourses() {
        courses.add("course5");
        s1.setCourses(courses);

        assertEquals(courses, s1.getCourses());
    }

    @Test
    public void constructor_2(){
        s2 = new Student(
                "emailID@example.com",
                "password1",
                "Jane Doe",
                "STUDENT",
                true
        );
        assertEquals("emailID@example.com", s2.getEmail());
        assertEquals("password1", s2.getPassword());
        assertEquals("Jane Doe", s2.getName());
        assertEquals("STUDENT", s2.getType());
        assertTrue(s2.isValidated());
    }

    @Test
    public void constructor_3(){
        s3 = new Student(
                "emailID@example.com",
                "password1",
                "Jane Doe",
                "STUDENT"
        );
        assertEquals("emailID@example.com", s3.getEmail());
        assertEquals("password1", s3.getPassword());
        assertEquals("Jane Doe", s3.getName());
        assertEquals("STUDENT", s3.getType());
        assertFalse(s3.isValidated());
    }

    @Test
    public void test_type(){
        assertEquals("STUDENT", s1.getType());
    }

    @Test
    public void test_validated(){
        assertFalse(s1.isValidated());
    }

    @Test
    public void getName() {
        assertEquals("John Doe", s1.getName());
    }

    @Test
    public void getEmail() {
        assertEquals("email@example.com", s1.getEmail());
    }

    @Test
    public void test_setName(){
        s1.setName("Jane Doe");
        assertEquals("Jane Doe", s1.getName());
    }

    @Test
    public void test_setEmail(){
        s1.setEmail("emailID1@example.com");
        assertEquals("emailID1@example.com", s1.getEmail());
    }

}