package org.team4.unit.model.course;

import org.junit.Before;
import org.junit.Test;
import org.team4.model.course.Course;
import org.team4.model.user.Student;
import java.util.Calendar;
import java.util.Date;


import static org.junit.Assert.*;

public class CourseTest {
    private Course course;
    private Student student1;
    private Student student2;
    private Date startDate;
    private Date endDate;
    private Date beforeStartDate;
    private Date afterEndDate;



    @Before
    public void setUp() throws Exception {
        Calendar cal = Calendar.getInstance();

        cal.set(2023, Calendar.JANUARY, 1);
        startDate = cal.getTime();

        cal.set(2023, Calendar.DECEMBER, 31);
        endDate = cal.getTime();

        cal.set(2022, Calendar.DECEMBER, 31);
        beforeStartDate = cal.getTime();

        cal.set(2024, Calendar.JANUARY, 1);
        afterEndDate = cal.getTime();

        course = new Course("Test Course", startDate, endDate, "41423121312", "professor@example.com");


        student1  = new Student(
                "emailID@example.com",
                "password1",
                "Jane Doe",
                "STUDENT",
                true
        );
        student2  = new Student(
                "email2@example.com",
                "password2",
                "Mane Doe",
                "STUDENT",
                true
        );
    }

    @Test
    public void testIsEnrolled() {
        course.enrollStudent(student1);
        assertTrue(course.isEnrolled(student1));
        assertFalse(course.isEnrolled(student2));
    }

    @Test
    public void testIsNotEnrolled() {
        assertFalse(course.isEnrolled(student2));
    }
    @Test
    public void testGetStartDate() {
        assertEquals(startDate, course.getStartDate());
    }

    @Test
    public void testGetEndDate() {
        assertEquals(endDate, course.getEndDate());
    }
    @Test
    public void testGetCourseTextBookISBN() {

        String textBookISBN= "41423121312";
        assertEquals(textBookISBN, course.getCourseTextBookISBN());
    }

    @Test
    public void testGetCourseName(){
        String courseName= "Test Course";
        assertEquals(courseName, course.getCourseName());

    }


    @Test
    public void testIsStarted() {
        assertFalse(course.isStarted(beforeStartDate));
        assertTrue(course.isStarted(startDate));
        assertTrue(course.isStarted(new Date()));
    }

    @Test
    public void testIsEnded() {
        assertTrue(course.isEnded(afterEndDate));
    }

    @Test
    public void testToStringCourseName() {
        String courseString = course.toString();
        assertTrue(courseString.contains(course.getCourseName()));
    }

    @Test
    public void testToStringProfessorEmail() {
        String courseString = course.toString();
        assertTrue(courseString.contains(course.getProfessorEmail()));

    }

    @Test
    public void testToStringTextBookISBN() {
        String courseString = course.toString();
        assertTrue(courseString.contains(course.getCourseTextBookISBN()));

    }



}




