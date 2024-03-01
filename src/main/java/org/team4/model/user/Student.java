package org.team4.model.user;

import java.util.ArrayList;

public class Student extends User{
    private long studentID;
    private ArrayList<String> courses;

    public Student(String email, String password, String name, String type, long studentID, ArrayList<String> courses) {
        super(email, password, name, type);
        this.studentID = studentID;
        this.courses = courses;
    }

    public Student(String email, String password, String name, String type) {
        super(email, password, name, type);
    }
}
