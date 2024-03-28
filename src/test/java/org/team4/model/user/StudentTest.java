package org.team4.model.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student s1, s2, s3;
    ArrayList<String> courses;

    @BeforeEach
    void setup(){

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

    @Test
    void getCourses() {
        assertIterableEquals(courses, s1.getCourses());
    }

    @Test
    void setCourses() {
        courses.add("course5");
        s1.setCourses(courses);

        assertIterableEquals(courses, s1.getCourses());
    }

    @Test
    void constructor_2(){
        s2 = new Student(
                "emailID@example.com",
                "password1",
                "Jane Doe",
                "STUDENT",
                true
        );
    }

    @Test
    void constructor_3(){
        s3 = new Student(
                "emailID@example.com",
                "password1",
                "Jane Doe",
                "STUDENT"
        );
    }
}