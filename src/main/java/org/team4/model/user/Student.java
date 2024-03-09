package org.team4.model.user;

import java.util.ArrayList;

import org.team4.model.course.Course;

public class Student extends User{
    private ArrayList<Course> courses;

    public Student(String email, String password, String name, String type, ArrayList<Course> courses) {
        super(email, password, name, type);
        this.courses = courses;
    }

    public Student(String email, String password, String name, String type) {
        super(email, password, name, type);
    }

    //ONLY TO BE USED BY MAINTAIN USER
    public Student(String email, String password, String name, String type, boolean validated) {
        super(email, password, name, type, validated);
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
}
