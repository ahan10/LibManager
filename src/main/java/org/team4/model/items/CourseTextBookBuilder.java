package org.team4.model.items;
import org.team4.model.course.Course;
import org.team4.model.course.CourseTextBook;

public class CourseTextBookBuilder extends BookBuilder {
    private Course course;
    private boolean isVirtual;

    public CourseTextBookBuilder() {
        // Call the constructor of the superclass (BookBuilder)
        super();
    }

    public CourseTextBookBuilder course(Course course) {
        this.course = course;
        return this;
    }

    public CourseTextBookBuilder isVirtual(boolean isVirtual) {
        this.isVirtual = isVirtual;
        return this;
    }


    @Override
    public CourseTextBook build() {
        return new CourseTextBook(new Item(title, yearPublished), genre, noOfPages, author, ISBN, publisher, edition, course, isVirtual);
    }
}
