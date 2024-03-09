package org.team4.model.course;

import org.team4.model.items.Item;
import org.team4.model.user.*;

import java.util.ArrayList;
import java.util.Date;

public class Course {
	private String courseName;
    private Date startDate;
    private Date endDate;
    private Item courseTextBook;
    private Faculty professor;
    private ArrayList<Student> enrolledStudents;

    public Course(String courseName, Date startDate, Date endDate, Item courseTextBook, Faculty professor) {
    	this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.courseTextBook = courseTextBook;
        this.professor = professor;
        this.enrolledStudents = new ArrayList<>();
    }

    public boolean isEnrolled(Student student) {
        return enrolledStudents.contains(student);
    }

    public boolean isStarted(Date currentDate) {
        return currentDate.after(startDate) || currentDate.equals(startDate);
    }

    public boolean isEnded(Date currentDate) {
        return currentDate.after(endDate);
    }

    public void enrollStudent(Student student) {
        if (!isEnrolled(student)) {
            enrolledStudents.add(student);
        }
    }
    
    public Faculty getProfessor() {
    	return this.professor;
    }
    
    public Date getStartDate() {
    	return this.startDate;
    }
    
    public Date getEndDate() {
    	return this.endDate;
    }
    
    public Item getCourseTextBook() {
    	return this.courseTextBook;
    }
    
    public String getCourseName() {
    	return this.courseName;
    }


}
