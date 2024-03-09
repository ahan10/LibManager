package org.team4.model.user;

import java.util.ArrayList;

import org.team4.model.course.Course;

public class Student extends User{
    private ArrayList<String> courses;

    public Student(String email, String password, String name, String type, ArrayList<String> courses) {
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

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }
    
    @Override
	public String toString() {
		return "Student [email=" + getEmail() + ", password=" + getPassword() + ", name=" + getName() + ", type=" + getType() + "]";
	}
}
