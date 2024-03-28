package org.team4.model.user;

import java.util.ArrayList;

import org.junit.*;
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
                "John DOe",
                "STUDENT",
                courses
        );
    }

//    @Test
//    public void getCourses() {
//        assertIterableEquals(courses, s1.getCourses());
//    }

//    @Test
//    public void setCourses() {
//        courses.add("course5");
//        s1.setCourses(courses);
//
//        assertIterableEquals(courses, s1.getCourses());
//    }

    @Test
    public void constructor_2(){
        s2 = new Student(
                "emailID@example.com",
                "password1",
                "Jane Doe",
                "STUDENT",
                true
        );
    }

    @Test
    public void constructor_3(){
        s3 = new Student(
                "emailID@example.com",
                "password1",
                "Jane Doe",
                "STUDENT"
        );
    }
}