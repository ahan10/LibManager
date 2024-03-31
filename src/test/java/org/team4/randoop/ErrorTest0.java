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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
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
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
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
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
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
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook8 = courseTextBookBuilder6.build();
        java.lang.String str9 = courseTextBook8.getISBN();
        courseTextBook8.setRentable(true);
        org.team4.model.user.Student student16 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str17 = student16.getType();
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        student16.setCourses(strList20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        courseTextBook8.makeCopies(student16);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook8 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder6.build();
        courseTextBook9.setPrice(0.0d);
        org.team4.model.user.Student student17 = new org.team4.model.user.Student("hi!", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:31:55 EDT 2024, dateDue=Tue Apr 30 20:31:55 EDT 2024}", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        courseTextBook9.removeCopies(student17);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook8 = courseTextBookBuilder6.build();
        java.util.List<org.team4.model.user.Student> studentList9 = courseTextBook8.getStudentsWithCopies();
        int int10 = courseTextBook8.getNoOfPages();
        org.team4.model.user.Student student16 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str17 = student16.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase18 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student16);
        student16.setType("User [email=, password=, name=hi!, type=, validated=false]");
        java.util.ArrayList<java.lang.String> strList21 = student16.getCourses();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        courseTextBook8.removeCopies(student16);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
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
        boolean boolean13 = courseTextBook8.hasSoftCopy();
        java.lang.String str14 = courseTextBook8.toString();
        java.lang.String str15 = courseTextBook8.getGenre();
        org.team4.model.user.Student student21 = new org.team4.model.user.Student("Credit Card", "Credit Card", "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemPurchased{title='', email='', datePurchased=null}", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        courseTextBook8.makeCopies(student21);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
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
        boolean boolean13 = courseTextBook8.hasSoftCopy();
        java.lang.String str14 = courseTextBook8.toString();
        java.lang.String str15 = courseTextBook8.getGenre();
        org.team4.model.user.Student student21 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str22 = student21.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase23 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student21);
        java.lang.String str24 = student21.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        courseTextBook8.removeCopies(student21);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook8 = courseTextBookBuilder6.build();
        java.util.List<org.team4.model.user.Student> studentList9 = courseTextBook8.getStudentsWithCopies();
        org.team4.model.user.Student student14 = new org.team4.model.user.Student("SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}', email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', dateSubscribed=Sat Mar 30 20:32:00 EDT 2024, dateDue=Tue Apr 30 20:32:00 EDT 2024}", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:04 EDT 2024, dateDue=Tue Apr 30 20:32:04 EDT 2024}", "Mobile Wallet", "ProcessPayment{modes=null, itemToPurchase=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}}");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        courseTextBook8.removeCopies(student14);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook8 = courseTextBookBuilder6.build();
        java.lang.String str9 = courseTextBook8.getISBN();
        org.team4.model.user.Student student15 = new org.team4.model.user.Student("", "", "hi!", "");
        student15.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase18 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student15);
        java.lang.String str19 = student15.getEmail();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase20 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) courseTextBook8, (org.team4.model.user.User) student15);
        java.lang.String str21 = courseTextBook8.getISBN();
        org.team4.model.course.Course course22 = courseTextBook8.getCourse();
        org.team4.model.user.Student student27 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean28 = student27.isValidated();
        java.lang.String str29 = student27.getPassword();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        courseTextBook8.removeCopies(student27);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook8 = courseTextBookBuilder6.build();
        java.util.List<org.team4.model.user.Student> studentList9 = courseTextBook8.getStudentsWithCopies();
        int int10 = courseTextBook8.getNoOfPages();
        java.util.List<org.team4.model.user.Student> studentList11 = courseTextBook8.getStudentsWithCopies();
        org.team4.model.course.Course course12 = courseTextBook8.getCourse();
        int int13 = courseTextBook8.getYearPublished();
        java.lang.String str14 = courseTextBook8.getAuthor();
        java.util.List<org.team4.model.user.Student> studentList15 = courseTextBook8.getStudentsWithCopies();
        org.team4.model.user.Student student21 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str22 = student21.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase23 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student21);
        java.lang.String str24 = student21.toString();
        student21.setPassword("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        courseTextBook8.removeCopies(student21);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook8 = courseTextBookBuilder6.build();
        java.lang.String str9 = courseTextBook8.getISBN();
        org.team4.model.user.Student student15 = new org.team4.model.user.Student("", "", "hi!", "");
        student15.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase18 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student15);
        java.lang.String str19 = student15.getEmail();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase20 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) courseTextBook8, (org.team4.model.user.User) student15);
        java.lang.String str21 = courseTextBook8.getISBN();
        courseTextBook8.setPrice(0.0d);
        java.lang.String str24 = courseTextBook8.getGenre();
        courseTextBook8.setQuantity(52);
        org.team4.model.user.Student student31 = new org.team4.model.user.Student("hi!", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "ProcessPayment{modes=null, itemToPurchase=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}}", "User [email=, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=PayPal, validated=false]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        courseTextBook8.makeCopies(student31);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook8 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder6.build();
        courseTextBook9.setPrice(0.0d);
        java.util.List<org.team4.model.user.Student> studentList12 = courseTextBook9.getStudentsWithCopies();
        org.team4.model.items.Item item13 = new org.team4.model.items.Item((org.team4.model.items.Item) courseTextBook9);
        int int14 = courseTextBook9.getEdition();
        org.team4.model.user.Student student19 = new org.team4.model.user.Student("", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "User [email=, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=PayPal, validated=false]", "Mobile Wallet");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        courseTextBook9.makeCopies(student19);
    }
}

