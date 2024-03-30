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

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook8 = courseTextBookBuilder6.build();
        org.team4.model.course.Course course9 = courseTextBook8.getCourse();
        org.team4.model.user.Student student15 = new org.team4.model.user.Student("", "", "hi!", "");
        student15.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase18 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        courseTextBook8.makeCopies(student15);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook8 = courseTextBookBuilder6.build();
        org.team4.model.user.Student student14 = new org.team4.model.user.Student("Credit Card", "Credit Card", "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemPurchased{title='', email='', datePurchased=null}", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        courseTextBook8.removeCopies(student14);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder6.quantity((-1));
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = courseTextBookBuilder6.price((double) 100L);
        org.team4.model.course.CourseTextBook courseTextBook13 = courseTextBookBuilder6.build();
        org.team4.model.user.Student student19 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str20 = student19.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase21 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student19);
        student19.setType("User [email=, password=, name=hi!, type=, validated=false]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        courseTextBook13.removeCopies(student19);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook8 = courseTextBookBuilder6.build();
        java.util.List<org.team4.model.user.Student> studentList9 = courseTextBook8.getStudentsWithCopies();
        int int10 = courseTextBook8.getNoOfPages();
        java.util.List<org.team4.model.user.Student> studentList11 = courseTextBook8.getStudentsWithCopies();
        int int12 = courseTextBook8.getNoOfPages();
        org.team4.model.user.Student student18 = new org.team4.model.user.Student("hi!", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "User [email=, password=, name=hi!, type=, validated=false]", true);
        java.lang.String str19 = student18.getEmail();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        courseTextBook8.removeCopies(student18);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook8 = courseTextBookBuilder6.build();
        java.util.List<org.team4.model.user.Student> studentList9 = courseTextBook8.getStudentsWithCopies();
        org.team4.model.user.Student student15 = new org.team4.model.user.Student("hi!", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "User [email=, password=, name=hi!, type=, validated=false]", true);
        java.lang.String str16 = student15.getEmail();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        courseTextBook8.makeCopies(student15);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook8 = courseTextBookBuilder6.build();
        java.util.List<org.team4.model.user.Student> studentList9 = courseTextBook8.getStudentsWithCopies();
        int int10 = courseTextBook8.getNoOfPages();
        java.util.List<org.team4.model.user.Student> studentList11 = courseTextBook8.getStudentsWithCopies();
        int int12 = courseTextBook8.getNoOfPages();
        org.team4.model.items.Item item13 = new org.team4.model.items.Item((org.team4.model.items.Item) courseTextBook8);
        org.team4.model.user.Student student19 = new org.team4.model.user.Student("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "Credit Card", "hi!", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        courseTextBook8.makeCopies(student19);
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test8");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder0.build();
        double double10 = courseTextBook9.getPrice();
        org.team4.model.user.Student student17 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str18 = student17.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase19 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student17);
        java.lang.String str20 = student17.toString();
        java.lang.String str21 = student17.getEmail();
        java.lang.String str22 = student17.toString();
        java.util.ArrayList<java.lang.String> strList23 = student17.getCourses();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase24 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) student17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        courseTextBook9.removeCopies(student17);
    }
}

