package org.team4.model.course;

import org.team4.model.user.*;

import java.util.ArrayList;
import java.util.Date;

public class Course {
	private String courseName;
    private Date startDate;
    private Date endDate;
    private String courseTextBookISBN;
    private String professorEmail;
    private ArrayList<Student> enrolledStudents;

    public Course(String courseName, Date startDate, Date endDate, String courseTextBookISBN, String professorEmail) {
    	this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.courseTextBookISBN = courseTextBookISBN;
        this.professorEmail = professorEmail;
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
    
    public String getProfessorEmail() {
    	return this.professorEmail;
    }
    
    public Date getStartDate() {
    	return this.startDate;
    }
    
    public Date getEndDate() {
    	return this.endDate;
    }
    
    public String getCourseTextBookISBN() {
    	return this.courseTextBookISBN;
    }
    
    public String getCourseName() {
    	return this.courseName;
    }
    
    public String toString() {
    	return "Course [course name=" + courseName + ", start date=" + startDate.toString() + ", end date=" + endDate.toString() + ", ISBN=" + courseTextBookISBN + ", email=" + professorEmail + "]";
    }


}
