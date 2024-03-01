package org.team4.model.course;

import org.team4.model.items.*;
import org.team4.model.user.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseTextBook extends Book {
    private Course course;
    private boolean isVirtual;
    private List<Student> studentsWithCopies;
    private Date currentDay;

    public CourseTextBook(Item item, String genre, int noOfPages, String author, long ISBN, String publisherName, String edition, Course course, boolean isVirtual) {
        super(item, genre, noOfPages, author, ISBN, publisherName, edition);
        this.course = course;
        this.isVirtual = isVirtual;
        this.studentsWithCopies = new ArrayList<>();
        this.currentDay = new Date();
    }

    public void makeCopies(Student student) {
        if (course.isEnrolled(student) && course.isStarted(currentDay) && !studentsWithCopies.contains(student)) {
            studentsWithCopies.add(student);
        }
    }

    public void removeCopies(Student student) {
        if (course.isEnded(currentDay)) {
            studentsWithCopies.remove(student);
        }
    }

    public List<Student> getStudentsWithCopies() {
        return studentsWithCopies;
    }


}