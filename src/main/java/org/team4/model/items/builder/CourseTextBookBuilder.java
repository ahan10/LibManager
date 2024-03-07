package org.team4.model.items.builder;
import org.team4.model.course.Course;
import org.team4.model.course.CourseTextBook;
import org.team4.model.items.Item;

public class CourseTextBookBuilder extends BookBuilder {
    private Course course;
    private boolean isVirtual;

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
        return new CourseTextBook(new Item(title, yearPublished), genre, noOfPages, author, ISBN, publisher, edition, course, isVirtual, price);
    }
}
