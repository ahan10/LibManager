package org.team4.unit.model.course;

import org.junit.Before;
import org.junit.Test;
import org.team4.model.course.Course;
import org.team4.model.course.CourseTextBook;
import org.team4.model.items.Item;
import org.team4.model.user.Student;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

public class CourseTextBookTest {
    private CourseTextBook courseTextBook, textBook1;
    private Course course, course1;
    private Student enrolledStudent;
    private Student notEnrolledStudent;
    private Item item;
    private Date startDate;
    private Date endDate;

    @Before
    public void setUp() {

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, -1);
        startDate = cal.getTime();

        cal.add(Calendar.YEAR, 1);
        endDate = cal.getTime();

        course = new Course("Software Engineering", startDate, endDate, "523423131", "prof@example.com");
        course1= new Course("New Course", startDate, endDate, "983123231", "prof@example.com");

        enrolledStudent = new Student(
                "enrolled@example.com",
                "password",
                "Enrolled Student",
                "STUDENT",
                true
        );
        notEnrolledStudent = new Student(
                "notenrolled@example.com",
                "password",
                "Not Enrolled Student",
                "STUDENT",
                true
        );

        course.enrollStudent(enrolledStudent);

        item = new Item("Intro to Computing", 2021, 10, 59.99, "52313231", true, true);
        courseTextBook = new CourseTextBook(item, "Education", 1000, "Thomas H. Cormen", "MIT Press", 3, course, true);
        textBook1 = new CourseTextBook(item, "Education", 1000, "Thomas H. Cormen", "MIT Press", 3, course1, true);

    }

    @Test
    public void testMakeCopiesForEnrolledStudent() {
        courseTextBook.makeCopies(enrolledStudent);
        assertTrue(courseTextBook.getStudentsWithCopies().contains(enrolledStudent));
    }

    @Test
    public void testMakeCopiesForNotEnrolledStudent() {
        courseTextBook.makeCopies(notEnrolledStudent);
        assertFalse(courseTextBook.getStudentsWithCopies().contains(notEnrolledStudent));
    }

    @Test
    public void testMakeCopiesEnrolledStudent() {

        courseTextBook.makeCopies(enrolledStudent);
        assertTrue(courseTextBook.getStudentsWithCopies().contains(enrolledStudent));

    }


    @Test
    public void removeCopiesAfterCourseEndNotEnrolled() {
        courseTextBook.removeCopies(notEnrolledStudent);
        assertFalse(courseTextBook.getStudentsWithCopies().contains(enrolledStudent));

    }

    @Test
    public void testStudentSingleCopy() {
        courseTextBook.makeCopies(enrolledStudent);
        courseTextBook.makeCopies(enrolledStudent);
        assertEquals(1, courseTextBook.getStudentsWithCopies().size());
    }

    @Test
    public void testRemoveCopiesFromStudentWithoutCopy() {
        courseTextBook.makeCopies(enrolledStudent);
        courseTextBook.removeCopies(notEnrolledStudent);
        assertTrue(courseTextBook.getStudentsWithCopies().contains(enrolledStudent));
    }

    @Test
    public void testRemoveCopiesBeforeCourseEnd() {
        courseTextBook.makeCopies(enrolledStudent);
        courseTextBook.removeCopies(enrolledStudent);
        assertTrue(courseTextBook.getStudentsWithCopies().contains(enrolledStudent));
    }
    @Test
    public void testNoActionForNullStudent() {
        courseTextBook.makeCopies(null);
        courseTextBook.removeCopies(null);
        assertTrue(courseTextBook.getStudentsWithCopies().isEmpty());
    }
    @Test
    public void testCopiesNotRemovedIfCourseOngoing() {

        courseTextBook.makeCopies(enrolledStudent);
        courseTextBook.removeCopies(enrolledStudent);
        assertTrue("Copies should not be removed if course is ongoing", courseTextBook.getStudentsWithCopies().contains(enrolledStudent));
    }

    @Test
    public void testMakeCopiesOnCourseStartDate() {
        course1.enrollStudent(enrolledStudent);
        textBook1.makeCopies(enrolledStudent);
        assertTrue("Student should receive copies on the start date of the course", textBook1.getStudentsWithCopies().contains(enrolledStudent));
    }





}





