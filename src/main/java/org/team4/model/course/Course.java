package org.team4.model.course;

import org.team4.model.items.Item;
import org.team4.model.user.*;

import java.util.ArrayList;
import java.util.Date;

public class Course {
    private Date startDate;
    private Date endDate;
    private Item courseTextBook;
    private Faculty professor;
    private ArrayList<Student> enrolledStudents;

    public Course(Date startDate, Date endDate, Item courseTextBook, Faculty professor) {
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


}
