package org.team4.randoop;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@Ignore
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook8 = courseTextBookBuilder6.build();
        java.util.List<org.team4.model.user.Student> studentList9 = courseTextBook8.getStudentsWithCopies();
        int int10 = courseTextBook8.getNoOfPages();
        org.team4.model.user.Student student15 = new org.team4.model.user.Student("", "", "hi!", "");
        java.util.ArrayList<java.lang.String> strList16 = student15.getCourses();
        java.lang.String str17 = student15.getEmail();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        courseTextBook8.removeCopies(student15);
    }
}

