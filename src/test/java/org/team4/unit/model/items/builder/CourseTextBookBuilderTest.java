package org.team4.unit.model.items.builder;

import org.junit.Test;
import org.team4.model.course.Course;
import org.team4.model.course.CourseTextBook;
import org.team4.model.items.builder.BookBuilder;
import org.team4.model.items.builder.CourseTextBookBuilder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CourseTextBookBuilderTest {

    @Test
    public void testBuildWithAllFields() {
        Course course = new Course("CS101", null, null, "Introduction to Computer Science", null);
        CourseTextBook textbook = ((CourseTextBookBuilder) ((BookBuilder) new CourseTextBookBuilder()
                .title("Java Programming")
                .yearPublished(2022)
                .quantity(50)
                .price(49.99)
                .ISBN("9780134685991"))
                .genre("Programming")
                .noOfPages(600)
                .author("John Doe")
                .publisher("Pearson")
                .edition(2))
                .course(course)
                .isVirtual(true)
                .build();

        assertNotNull(textbook);
        assertEquals("Java Programming", textbook.getTitle());
        assertEquals(2022, textbook.getYearPublished());
        assertEquals(50, textbook.getQuantity());
        assertEquals(49.99, textbook.getPrice(), 0);
        assertEquals("9780134685991", textbook.getISBN());
        assertEquals("Programming", textbook.getGenre());
        assertEquals(600, textbook.getNoOfPages());
        assertEquals("John Doe", textbook.getAuthor());
        assertEquals("Pearson", textbook.getPublisher());
        assertEquals(2, textbook.getEdition());
        assertEquals(course, textbook.getCourse());
    }

    @Test
    public void testBuildWithNullCourse() {
        CourseTextBook textbook = ((CourseTextBookBuilder) ((BookBuilder) new CourseTextBookBuilder()
                .title("Java Programming")
                .yearPublished(2022)
                .quantity(50)
                .price(49.99)
                .ISBN("9780134685991"))
                .genre("Programming")
                .noOfPages(600)
                .author("John Doe")
                .publisher("Pearson")
                .edition(2))
                .isVirtual(true)
                .build();

        assertNotNull(textbook);
        assertEquals("Java Programming", textbook.getTitle());
        assertEquals(2022, textbook.getYearPublished());
        assertEquals(50, textbook.getQuantity());
        assertEquals(49.99, textbook.getPrice(), 0);
        assertEquals("9780134685991", textbook.getISBN());
        assertEquals("Programming", textbook.getGenre());
        assertEquals(600, textbook.getNoOfPages());
        assertEquals("John Doe", textbook.getAuthor());
        assertEquals("Pearson", textbook.getPublisher());
        assertEquals(2, textbook.getEdition());
        assertEquals(null, textbook.getCourse());
    }

    @Test
    public void testBuildWithEmptyValues() {
        Course course = new Course("", null, null, "", null);
        CourseTextBook textbook = ((CourseTextBookBuilder) ((BookBuilder) new CourseTextBookBuilder()
                .title("")
                .yearPublished(0)
                .quantity(0)
                .price(0)
                .ISBN(""))
                .genre("")
                .noOfPages(0)
                .author("")
                .publisher("")
                .edition(0))
                .course(course)
                .isVirtual(false)
                .build();

        assertNotNull(textbook);
        assertEquals("", textbook.getTitle());
        assertEquals(0, textbook.getYearPublished());
        assertEquals(0, textbook.getQuantity());
        assertEquals(0, textbook.getPrice(), 0);
        assertEquals("", textbook.getISBN());
        assertEquals("", textbook.getGenre());
        assertEquals(0, textbook.getNoOfPages());
        assertEquals("", textbook.getAuthor());
        assertEquals("", textbook.getPublisher());
        assertEquals(0, textbook.getEdition());
        assertEquals(course, textbook.getCourse());
    }

    @Test
    public void testBuildWithNegativeValues() {
        Course course = new Course("CS101", null, null, "Introduction to Computer Science", null);
        CourseTextBook textbook = ((CourseTextBookBuilder) ((BookBuilder) new CourseTextBookBuilder()
                .title("Java Programming")
                .yearPublished(-2022)
                .quantity(-50)
                .price(-49.99)
                .ISBN("9780134685991"))
                .genre("Programming")
                .noOfPages(-600)
                .author("John Doe")
                .publisher("Pearson")
                .edition(-2))
                .course(course)
                .isVirtual(true)
                .build();

        assertNotNull(textbook);
        assertEquals("Java Programming", textbook.getTitle());
        assertEquals(-2022, textbook.getYearPublished());
        assertEquals(-50, textbook.getQuantity());
        assertEquals(-49.99, textbook.getPrice(), 0);
        assertEquals("9780134685991", textbook.getISBN());
        assertEquals("Programming", textbook.getGenre());
        assertEquals(-600, textbook.getNoOfPages());
        assertEquals("John Doe", textbook.getAuthor());
        assertEquals("Pearson", textbook.getPublisher());
        assertEquals(-2, textbook.getEdition());
        assertEquals(course, textbook.getCourse());
    }

    @Test
    public void testBuildWithMaxValues() {
        Course course = new Course("CS101", null, null, "Introduction to Computer Science", null);
        CourseTextBook textbook = ((CourseTextBookBuilder) ((BookBuilder) new CourseTextBookBuilder()
                .title("Java Programming")
                .yearPublished(Integer.MAX_VALUE)
                .quantity(Integer.MAX_VALUE)
                .price(Double.MAX_VALUE)
                .ISBN("1234567890123"))
                .genre("Programming")
                .noOfPages(Integer.MAX_VALUE)
                .author("John Doe")
                .publisher("Pearson")
                .edition(Integer.MAX_VALUE))
                .course(course)
                .isVirtual(true)
                .build();

        assertNotNull(textbook);
        assertEquals("Java Programming", textbook.getTitle());
        assertEquals(Integer.MAX_VALUE, textbook.getYearPublished());
        assertEquals(Integer.MAX_VALUE, textbook.getQuantity());
        assertEquals(Double.MAX_VALUE, textbook.getPrice(), 0);
        assertEquals("1234567890123", textbook.getISBN());
        assertEquals("Programming", textbook.getGenre());
        assertEquals(Integer.MAX_VALUE, textbook.getNoOfPages());
        assertEquals("John Doe", textbook.getAuthor());
        assertEquals("Pearson", textbook.getPublisher());
        assertEquals(Integer.MAX_VALUE, textbook.getEdition());
        assertEquals(course, textbook.getCourse());
    }

    @Test
    public void testBuildWithNullCourseAndVirtualFlag() {
        CourseTextBook textbook = ((CourseTextBookBuilder) ((BookBuilder) new CourseTextBookBuilder()
                .title("Java Programming")
                .yearPublished(2022)
                .quantity(50)
                .price(49.99)
                .ISBN("9780134685991"))
                .genre("Programming")
                .noOfPages(600)
                .author("John Doe")
                .publisher("Pearson")
                .edition(2))
                .isVirtual(true)
                .build();

        assertNotNull(textbook);
        assertEquals("Java Programming", textbook.getTitle());
        assertEquals(2022, textbook.getYearPublished());
        assertEquals(50, textbook.getQuantity());
        assertEquals(49.99, textbook.getPrice(), 0);
        assertEquals("9780134685991", textbook.getISBN());
        assertEquals("Programming", textbook.getGenre());
        assertEquals(600, textbook.getNoOfPages());
        assertEquals("John Doe", textbook.getAuthor());
        assertEquals("Pearson", textbook.getPublisher());
        assertEquals(2, textbook.getEdition());
        assertEquals(null, textbook.getCourse());
    }

    @Test
    public void testBuildWithNoCourseAndNotVirtual() {
        CourseTextBook textbook = (CourseTextBook) ((BookBuilder) new CourseTextBookBuilder()
                .title("Java Programming")
                .yearPublished(2022)
                .quantity(50)
                .price(49.99)
                .ISBN("9780134685991"))
                .genre("Programming")
                .noOfPages(600)
                .author("John Doe")
                .publisher("Pearson")
                .edition(2)
                .build();

        assertNotNull(textbook);
        assertEquals("Java Programming", textbook.getTitle());
        assertEquals(2022, textbook.getYearPublished());
        assertEquals(50, textbook.getQuantity());
        assertEquals(49.99, textbook.getPrice(), 0);
        assertEquals("9780134685991", textbook.getISBN());
        assertEquals("Programming", textbook.getGenre());
        assertEquals(600, textbook.getNoOfPages());
        assertEquals("John Doe", textbook.getAuthor());
        assertEquals("Pearson", textbook.getPublisher());
        assertEquals(2, textbook.getEdition());
        assertEquals(null, textbook.getCourse());
    }

    @Test
    public void testBuildWithNullCourseAndNullVirtualFlag() {
        CourseTextBook textbook = ((CourseTextBookBuilder) ((BookBuilder) new CourseTextBookBuilder()
                .title("Java Programming")
                .yearPublished(2022)
                .quantity(50)
                .price(49.99)
                .ISBN("9780134685991"))
                .genre("Programming")
                .noOfPages(600)
                .author("John Doe")
                .publisher("Pearson")
                .edition(2))
                .isVirtual(false)
                .build();

        assertNotNull(textbook);
        assertEquals("Java Programming", textbook.getTitle());
        assertEquals(2022, textbook.getYearPublished());
        assertEquals(50, textbook.getQuantity());
        assertEquals(49.99, textbook.getPrice(), 0);
        assertEquals("9780134685991", textbook.getISBN());
        assertEquals("Programming", textbook.getGenre());
        assertEquals(600, textbook.getNoOfPages());
        assertEquals("John Doe", textbook.getAuthor());
        assertEquals("Pearson", textbook.getPublisher());
        assertEquals(2, textbook.getEdition());
        assertEquals(null, textbook.getCourse());
    }

    @Test
    public void testBuildWithCourseAndNullVirtualFlag() {
        Course course = new Course("CS101", null, null, "Introduction to Computer Science", null);
        CourseTextBook textbook = ((CourseTextBookBuilder) ((BookBuilder) new CourseTextBookBuilder()
                .title("Java Programming")
                .yearPublished(2022)
                .quantity(50)
                .price(49.99)
                .ISBN("9780134685991"))
                .genre("Programming")
                .noOfPages(600)
                .author("John Doe")
                .publisher("Pearson")
                .edition(2))
                .course(course)
                .isVirtual(false)
                .build();

        assertNotNull(textbook);
        assertEquals("Java Programming", textbook.getTitle());
        assertEquals(2022, textbook.getYearPublished());
        assertEquals(50, textbook.getQuantity());
        assertEquals(49.99, textbook.getPrice(), 0);
        assertEquals("9780134685991", textbook.getISBN());
        assertEquals("Programming", textbook.getGenre());
        assertEquals(600, textbook.getNoOfPages());
        assertEquals("John Doe", textbook.getAuthor());
        assertEquals("Pearson", textbook.getPublisher());
        assertEquals(2, textbook.getEdition());
        assertEquals(course, textbook.getCourse());
    }

    @Test
    public void testBuildWithNullCourseAndTrueVirtualFlag() {
        CourseTextBook textbook = ((CourseTextBookBuilder) ((BookBuilder) new CourseTextBookBuilder()
                .title("Java Programming")
                .yearPublished(2022)
                .quantity(50)
                .price(49.99)
                .ISBN("9780134685991"))
                .genre("Programming")
                .noOfPages(600)
                .author("John Doe")
                .publisher("Pearson")
                .edition(2))
                .course(null)
                .isVirtual(true)
                .build();

        assertNotNull(textbook);
        assertEquals("Java Programming", textbook.getTitle());
        assertEquals(2022, textbook.getYearPublished());
        assertEquals(50, textbook.getQuantity());
        assertEquals(49.99, textbook.getPrice(), 0);
        assertEquals("9780134685991", textbook.getISBN());
        assertEquals("Programming", textbook.getGenre());
        assertEquals(600, textbook.getNoOfPages());
        assertEquals("John Doe", textbook.getAuthor());
        assertEquals("Pearson", textbook.getPublisher());
        assertEquals(2, textbook.getEdition());
        assertEquals(null, textbook.getCourse());
    }

    @Test
    public void testBuildWithCourseAndFalseVirtualFlag() {
        Course course = new Course("CS101", null, null, "Introduction to Computer Science", null);
        CourseTextBook textbook = ((CourseTextBookBuilder) ((BookBuilder) new CourseTextBookBuilder()
                .title("Java Programming")
                .yearPublished(2022)
                .quantity(50)
                .price(49.99)
                .ISBN("9780134685991"))
                .genre("Programming")
                .noOfPages(600)
                .author("John Doe")
                .publisher("Pearson")
                .edition(2))
                .course(course)
                .isVirtual(false)
                .build();

        assertNotNull(textbook);
        assertEquals("Java Programming", textbook.getTitle());
        assertEquals(2022, textbook.getYearPublished());
        assertEquals(50, textbook.getQuantity());
        assertEquals(49.99, textbook.getPrice(), 0);
        assertEquals("9780134685991", textbook.getISBN());
        assertEquals("Programming", textbook.getGenre());
        assertEquals(600, textbook.getNoOfPages());
        assertEquals("John Doe", textbook.getAuthor());
        assertEquals("Pearson", textbook.getPublisher());
        assertEquals(2, textbook.getEdition());
        assertEquals(course, textbook.getCourse());
    }
}
