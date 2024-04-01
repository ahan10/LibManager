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
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.quantity((int) (short) 100);
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder0.build();
        java.util.List<org.team4.model.user.Student> studentList10 = courseTextBook9.getStudentsWithCopies();
        org.team4.model.user.Student student15 = new org.team4.model.user.Student("", "", "hi!", "");
        java.util.ArrayList<java.lang.String> strList16 = student15.getCourses();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        courseTextBook9.makeCopies(student15);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.quantity((int) (short) 100);
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder0.build();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator10 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook9);
        org.team4.model.course.Course course11 = courseTextBook9.getCourse();
        org.team4.model.user.Student student16 = new org.team4.model.user.Student("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}", "SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}", "Mobile Wallet", "User [email=, password=, name=hi!, type=, validated=true]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        courseTextBook9.removeCopies(student16);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.course.CourseTextBook courseTextBook7 = courseTextBookBuilder6.build();
        java.lang.String str8 = courseTextBook7.getGenre();
        org.team4.model.user.Student student13 = new org.team4.model.user.Student("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]");
        student13.setEmail("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        courseTextBook7.removeCopies(student13);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.quantity((int) (short) 100);
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder0.build();
        org.team4.model.user.Student student15 = new org.team4.model.user.Student("SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:48 EDT 2024, dateDue=null}', email='hi!', dateSubscribed=Mon Apr 01 18:27:51 EDT 2024, dateDue=Wed May 01 18:27:51 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}", "User [email=, password=, name=hi!, type=, validated=true]", "ItemPurchased{title='', email='hi!', datePurchased=null}", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        courseTextBook9.makeCopies(student15);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.course.CourseTextBook courseTextBook7 = courseTextBookBuilder6.build();
        java.lang.String str8 = courseTextBook7.getGenre();
        int int9 = courseTextBook7.getYearPublished();
        org.team4.model.user.Student student14 = new org.team4.model.user.Student("", "", "hi!", "");
        student14.setEmail("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        courseTextBook7.removeCopies(student14);
    }
}

