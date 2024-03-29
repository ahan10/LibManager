package org.team4.randoop;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.team4.model.user.UserFactory userFactory0 = new org.team4.model.user.UserFactory();
        org.team4.model.user.User user6 = userFactory0.getUser("", "ProcessPayment{modes=null, itemToPurchase=null}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", false);
        org.team4.model.user.User user12 = userFactory0.getUser("ProcessPayment{modes=null, itemToPurchase=null}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:58 EDT 2024}", "Course [course name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:42:00 EDT 2024, end date=Fri Mar 29 00:42:00 EDT 2024, ISBN=, email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}]", "Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]", true);
        org.team4.model.user.User user18 = userFactory0.getUser("User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, name=hi!, type=, validated=false]", "", "Book{genre='null', noOfPages=0, author='null', ISBN=null, publisher='null', edition='0'}", "PayPal", false);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user18);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:02 EDT 2024, dateDue=Mon Apr 29 00:42:02 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "", "SubscribeNewsletter{title='', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}', dateSubscribed=Fri Mar 29 00:42:00 EDT 2024, dateDue=Mon Apr 29 00:42:00 EDT 2024}");
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder3 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder5 = courseTextBookBuilder0.isVirtual(false);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder6.hasHardCopy(true);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        org.team4.model.course.Course course14 = new org.team4.model.course.Course("", date10, date11, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder15 = courseTextBookBuilder6.course(course14);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder16 = courseTextBookBuilder5.course(course14);
        org.team4.model.items.builder.BookBuilder bookBuilder18 = courseTextBookBuilder16.hasHardCopy(false);
        org.team4.model.items.builder.BookBuilder bookBuilder20 = courseTextBookBuilder16.genre("PayPal");
        org.team4.model.course.CourseTextBook courseTextBook21 = courseTextBookBuilder16.build();
        org.team4.model.items.decorator.ItemDecorator itemDecorator22 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook21);
        org.team4.model.items.Newsletter newsletter26 = new org.team4.model.items.Newsletter("PayPal{email='hi!'}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) '4');
        org.team4.model.user.Faculty faculty32 = new org.team4.model.user.Faculty("hi!", "hi!", "hi!", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", false);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase33 = new org.team4.functionality.buy.ItemToPurchase(newsletter26, (org.team4.model.user.User) faculty32);
        org.team4.model.user.Faculty faculty43 = new org.team4.model.user.Faculty("", "", "hi!", "hi!", true);
        java.util.ArrayList<java.lang.String> strList44 = faculty43.getCourses();
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        faculty43.setCourses(strList47);
        org.team4.model.user.Student student50 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "", strList47);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase51 = new org.team4.functionality.buy.ItemToPurchase(newsletter26, (org.team4.model.user.User) student50);
        // The following exception was thrown during execution in test generation
        try {
            courseTextBook21.removeCopies(student50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(bookBuilder3);
        org.junit.Assert.assertNotNull(courseTextBookBuilder5);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(courseTextBookBuilder15);
        org.junit.Assert.assertNotNull(courseTextBookBuilder16);
        org.junit.Assert.assertNotNull(bookBuilder18);
        org.junit.Assert.assertNotNull(bookBuilder20);
        org.junit.Assert.assertNotNull(courseTextBook21);
        org.junit.Assert.assertNull(strList44);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        java.util.Date date8 = null;
        java.util.Date date9 = null;
        org.team4.model.course.Course course12 = new org.team4.model.course.Course("", date8, date9, "", "hi!");
        org.team4.model.course.CourseTextBook courseTextBook14 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", 10, "hi!", "", (int) (byte) -1, course12, false);
        java.lang.String str15 = courseTextBook14.getAuthor();
        org.team4.model.user.Student student21 = new org.team4.model.user.Student("hi!", "hi!", "", "", true);
        student21.setName("PayPal{email='hi!'}");
        courseTextBook14.makeCopies(student21);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.Course course1 = null;
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder2 = courseTextBookBuilder0.course(course1);
        org.team4.model.items.builder.BookBuilder bookBuilder4 = courseTextBookBuilder0.hasHardCopy(false);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder6 = courseTextBookBuilder0.price((double) (short) 0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = bookItemBuilder6.ISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}");
        org.junit.Assert.assertNotNull(courseTextBookBuilder2);
        org.junit.Assert.assertNotNull(bookBuilder4);
        org.junit.Assert.assertNotNull(bookItemBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.DVD dVD11 = new org.team4.model.items.DVD((org.team4.model.items.Item) courseTextBook1, "PayPal{email='hi!'}", (double) 100.0f);
        java.lang.String str12 = courseTextBook1.getPublisher();
        int int13 = courseTextBook1.getQuantity();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.Course course1 = null;
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder2 = courseTextBookBuilder0.course(course1);
        org.team4.model.items.builder.BookBuilder bookBuilder4 = courseTextBookBuilder0.hasHardCopy(false);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder6 = bookBuilder4.price((double) 9261356L);
        org.junit.Assert.assertNotNull(courseTextBookBuilder2);
        org.junit.Assert.assertNotNull(bookBuilder4);
        org.junit.Assert.assertNotNull(bookItemBuilder6);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        boolean boolean3 = courseTextBook1.equals((java.lang.Object) (byte) 1);
        java.lang.String str4 = courseTextBook1.getTitle();
        org.team4.model.course.Course course5 = courseTextBook1.getCourse();
        boolean boolean7 = courseTextBook1.equals((java.lang.Object) 100);
        java.util.List<org.team4.model.user.Student> studentList8 = courseTextBook1.getStudentsWithCopies();
        courseTextBook1.setRentable(false);
        org.team4.model.items.Book book18 = new org.team4.model.items.Book((org.team4.model.items.Item) courseTextBook1, "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", (int) (short) 100, "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "PayPal{email='hi!'}", (-1), true, true);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator19 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        org.team4.model.items.decorator.ItemDecorator itemDecorator20 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook1);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(course5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(studentList8);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.team4.model.user.Student student13 = new org.team4.model.user.Student("hi!", "", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase14 = new org.team4.functionality.buy.ItemToPurchase((double) (-1L), (org.team4.model.user.User) student13);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        org.team4.model.user.Faculty faculty24 = new org.team4.model.user.Faculty("hi!", "hi!", "", "", (long) 1, strList22);
        java.util.ArrayList<java.lang.String> strList25 = faculty24.getCourses();
        java.util.ArrayList<java.lang.String> strList26 = faculty24.getCourses();
        student13.setCourses(strList26);
        org.team4.model.user.Student student28 = new org.team4.model.user.Student("ProcessPayment{modes=null, itemToPurchase=null}", "PayPal", "hi!", "hi!", strList26);
        org.team4.model.user.Student student29 = new org.team4.model.user.Student("PayPal{email='PayPal{email='hi!'}'}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}", "PayPal{email='hi!'}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:59 EDT 2024}", strList26);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.booktype("Mobile Wallet");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder4.edition(10);
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder10 = bookRequestBuilder4.edition((int) 'a');
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
        org.junit.Assert.assertNotNull(bookRequestBuilder10);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.items.RentedItem rentedItem4 = new org.team4.model.items.RentedItem("", "hi!", date2, date3);
        java.lang.String str5 = rentedItem4.getISBN();
        java.util.Date date6 = null;
        rentedItem4.setDueDate(date6);
        rentedItem4.setISBN("PayPal");
        java.util.Date date10 = rentedItem4.getRentDate();
        org.team4.functionality.buy.ItemPurchased itemPurchased17 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date18 = itemPurchased17.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased19 = new org.team4.functionality.buy.ItemPurchased("Mobile Wallet", "", date18);
        org.team4.functionality.buy.ItemPurchased itemPurchased23 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date24 = itemPurchased23.getDatePurchased();
        java.util.Date date25 = itemPurchased23.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased29 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date30 = itemPurchased29.getDatePurchased();
        java.util.Date date31 = itemPurchased29.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased34 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date35 = itemPurchased34.getDatePurchased();
        org.team4.model.course.Course course38 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date31, date35, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.course.Course course41 = new org.team4.model.course.Course("PayPal{email='hi!'}", date25, date31, "Mobile Wallet", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
        org.team4.model.items.RentedItem rentedItem42 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "PayPal", date18, date25);
        rentedItem4.setDueDate(date25);
        java.util.Date date48 = null;
        java.util.Date date49 = null;
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter50 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!", date48, date49);
        org.team4.functionality.buy.ItemPurchased itemPurchased57 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date58 = itemPurchased57.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased59 = new org.team4.functionality.buy.ItemPurchased("Mobile Wallet", "", date58);
        org.team4.functionality.buy.ItemPurchased itemPurchased63 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date64 = itemPurchased63.getDatePurchased();
        java.util.Date date65 = itemPurchased63.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased69 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date70 = itemPurchased69.getDatePurchased();
        java.util.Date date71 = itemPurchased69.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased74 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date75 = itemPurchased74.getDatePurchased();
        org.team4.model.course.Course course78 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date71, date75, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.course.Course course81 = new org.team4.model.course.Course("PayPal{email='hi!'}", date65, date71, "Mobile Wallet", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
        org.team4.model.items.RentedItem rentedItem82 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "PayPal", date58, date65);
        subscribeNewsletter50.setDateDue(date58);
        org.team4.functionality.buy.ItemPurchased itemPurchased86 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date87 = itemPurchased86.getDatePurchased();
        java.util.Date date88 = itemPurchased86.getDatePurchased();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter89 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}", date58, date88);
        rentedItem4.setDueDate(date88);
        rentedItem4.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
        java.util.Date date93 = rentedItem4.getRentDate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date24);
// flaky:         org.junit.Assert.assertEquals(date24.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date30);
// flaky:         org.junit.Assert.assertEquals(date30.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date35);
// flaky:         org.junit.Assert.assertEquals(date35.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date58);
// flaky:         org.junit.Assert.assertEquals(date58.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date64);
// flaky:         org.junit.Assert.assertEquals(date64.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date65);
// flaky:         org.junit.Assert.assertEquals(date65.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date70);
// flaky:         org.junit.Assert.assertEquals(date70.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date71);
// flaky:         org.junit.Assert.assertEquals(date71.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date75);
// flaky:         org.junit.Assert.assertEquals(date75.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date87);
// flaky:         org.junit.Assert.assertEquals(date87.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date88);
// flaky:         org.junit.Assert.assertEquals(date88.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNull(date93);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.booktype("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.ISBN("User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, type=, validated=false]");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.Newsletter newsletter12 = new org.team4.model.items.Newsletter("hi!", "PayPal", (double) 0L);
        org.team4.functionality.buy.ItemPurchased itemPurchased16 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date17 = itemPurchased16.getDatePurchased();
        java.util.Date date18 = itemPurchased16.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased21 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date22 = itemPurchased21.getDatePurchased();
        org.team4.model.course.Course course25 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date18, date22, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.user.Faculty faculty35 = new org.team4.model.user.Faculty("", "", "hi!", "hi!", true);
        java.util.ArrayList<java.lang.String> strList36 = faculty35.getCourses();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        faculty35.setCourses(strList39);
        org.team4.model.user.Student student42 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "", strList39);
        course25.enrollStudent(student42);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase44 = new org.team4.functionality.buy.ItemToPurchase(newsletter12, (org.team4.model.user.User) student42);
        boolean boolean45 = courseTextBook1.equals((java.lang.Object) itemToPurchase44);
        double double46 = itemToPurchase44.getAmount();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNull(strList36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.items.RentedItem rentedItem4 = new org.team4.model.items.RentedItem("", "hi!", date2, date3);
        rentedItem4.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem4.setTitle("hi!");
        rentedItem4.setISBN("Mobile Wallet");
        rentedItem4.setTitle("");
        rentedItem4.setISBN("");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ProcessPayment{modes=PayPal{email='hi!'}, itemToPurchase=ItemToPurchase{item=null, user=User [email=hi!, password=hi!, name=hi!, type=hi!, validated=false], newsletter=null}}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:59 EDT 2024, dateDue=Mon Apr 29 00:41:59 EDT 2024}");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("hi!");
        boolean boolean2 = payPal1.isValid();
        java.lang.String str3 = payPal1.toString();
        java.lang.String str4 = payPal1.getMode();
        java.lang.String str5 = payPal1.getMode();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PayPal{email='hi!'}" + "'", str3, "PayPal{email='hi!'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Mobile Wallet" + "'", str4, "Mobile Wallet");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Mobile Wallet" + "'", str5, "Mobile Wallet");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("hi!", 100, 100, (double) 10L, "PayPal", false, true);
        int int8 = item7.getYearPublished();
        org.team4.model.items.DVD dVD11 = new org.team4.model.items.DVD(item7, "", (double) 10);
        java.lang.String str12 = dVD11.getGenre();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator9 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        boolean boolean10 = courseTextBook1.hasSoftCopy();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator11 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator12 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        boolean boolean13 = rentableItemDecorator12.isRentable();
        boolean boolean14 = rentableItemDecorator12.isRentable();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("PayPal{email='hi!'}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:02 EDT 2024, dateDue=Mon Apr 29 00:42:02 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}", "ProcessPayment{modes=PayPal{email='hi!'}, itemToPurchase=ItemToPurchase{item=null, user=User [email=hi!, password=hi!, name=hi!, type=hi!, validated=false], newsletter=null}}", (long) (short) 1);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.team4.model.user.Manager manager4 = new org.team4.model.user.Manager("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}", "SubscribeNewsletter{title='hi!', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}', dateSubscribed=null, dateDue=null}", "SubscribeNewsletter{title='', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}', dateSubscribed=Fri Mar 29 00:42:00 EDT 2024, dateDue=Mon Apr 29 00:42:00 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}");
        java.lang.String str5 = manager4.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}" + "'", str5, "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder3 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder5 = courseTextBookBuilder0.isVirtual(false);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder6.hasHardCopy(true);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        org.team4.model.course.Course course14 = new org.team4.model.course.Course("", date10, date11, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder15 = courseTextBookBuilder6.course(course14);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder16 = courseTextBookBuilder5.course(course14);
        org.team4.model.items.builder.BookBuilder bookBuilder18 = courseTextBookBuilder16.hasHardCopy(false);
        org.team4.model.items.builder.BookBuilder bookBuilder20 = courseTextBookBuilder16.genre("PayPal{email='hi!'}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder22 = bookBuilder20.ISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}");
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(bookBuilder3);
        org.junit.Assert.assertNotNull(courseTextBookBuilder5);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(courseTextBookBuilder15);
        org.junit.Assert.assertNotNull(courseTextBookBuilder16);
        org.junit.Assert.assertNotNull(bookBuilder18);
        org.junit.Assert.assertNotNull(bookBuilder20);
        org.junit.Assert.assertNotNull(bookItemBuilder22);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder3 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder5 = courseTextBookBuilder0.genre("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder7 = bookBuilder5.hasHardCopy(false);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder9 = bookBuilder5.quantity((int) '4');
        org.team4.model.items.builder.BookBuilder bookBuilder11 = bookBuilder5.edition((int) 'a');
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(bookBuilder3);
        org.junit.Assert.assertNotNull(bookBuilder5);
        org.junit.Assert.assertNotNull(bookBuilder7);
        org.junit.Assert.assertNotNull(bookItemBuilder9);
        org.junit.Assert.assertNotNull(bookBuilder11);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator9 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) purchasableItemDecorator9);
        boolean boolean11 = rentableItemDecorator10.isRentable();
        org.team4.model.items.Item item12 = rentableItemDecorator10.getItem();
        boolean boolean13 = rentableItemDecorator10.isRentable();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(item12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder2 = courseTextBookBuilder0.price(1.0d);
        org.team4.functionality.buy.ItemPurchased itemPurchased6 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date7 = itemPurchased6.getDatePurchased();
        java.util.Date date8 = itemPurchased6.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased11 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date12 = itemPurchased11.getDatePurchased();
        org.team4.model.course.Course course15 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date8, date12, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        java.lang.String str16 = course15.getCourseName();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder17 = courseTextBookBuilder0.course(course15);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder19 = courseTextBookBuilder17.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder21 = courseTextBookBuilder17.publisher("Debit Card");
        org.team4.model.items.builder.BookBuilder bookBuilder23 = courseTextBookBuilder17.genre("Debit Card");
        org.junit.Assert.assertNotNull(bookItemBuilder2);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}" + "'", str16, "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.junit.Assert.assertNotNull(courseTextBookBuilder17);
        org.junit.Assert.assertNotNull(courseTextBookBuilder19);
        org.junit.Assert.assertNotNull(bookBuilder21);
        org.junit.Assert.assertNotNull(bookBuilder23);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getStartDate();
        java.lang.String str7 = course5.getProfessorEmail();
        org.team4.model.user.Student student13 = new org.team4.model.user.Student("hi!", "hi!", "", "", true);
        course5.enrollStudent(student13);
        org.team4.functionality.buy.ItemPurchased itemPurchased18 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date19 = itemPurchased18.getDatePurchased();
        java.util.Date date20 = itemPurchased18.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased23 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date24 = itemPurchased23.getDatePurchased();
        org.team4.model.course.Course course27 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date20, date24, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = course5.isEnded(date24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date24);
// flaky:         org.junit.Assert.assertEquals(date24.toString(), "Fri Mar 29 00:42:02 EDT 2024");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder3 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder5 = courseTextBookBuilder0.isVirtual(false);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder6.hasHardCopy(true);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        org.team4.model.course.Course course14 = new org.team4.model.course.Course("", date10, date11, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder15 = courseTextBookBuilder6.course(course14);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder16 = courseTextBookBuilder5.course(course14);
        org.team4.model.items.builder.BookBuilder bookBuilder18 = courseTextBookBuilder5.hasSoftCopy(false);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder20 = bookBuilder18.ISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}");
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(bookBuilder3);
        org.junit.Assert.assertNotNull(courseTextBookBuilder5);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(courseTextBookBuilder15);
        org.junit.Assert.assertNotNull(courseTextBookBuilder16);
        org.junit.Assert.assertNotNull(bookBuilder18);
        org.junit.Assert.assertNotNull(bookItemBuilder20);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date4 = itemPurchased3.getDatePurchased();
        java.util.Date date5 = itemPurchased3.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased8 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date9 = itemPurchased8.getDatePurchased();
        org.team4.model.course.Course course12 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date5, date9, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.user.Faculty faculty22 = new org.team4.model.user.Faculty("", "", "hi!", "hi!", true);
        java.util.ArrayList<java.lang.String> strList23 = faculty22.getCourses();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        faculty22.setCourses(strList26);
        org.team4.model.user.Student student29 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "", strList26);
        course12.enrollStudent(student29);
        java.lang.String str31 = course12.getCourseTextBookISBN();
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNull(strList23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}", "User [email=hi!, password=hi!, name=hi!, type=, validated=false]", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:59 EDT 2024, dateDue=Mon Apr 29 00:41:59 EDT 2024}", false);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.DVD dVD11 = new org.team4.model.items.DVD((org.team4.model.items.Item) courseTextBook1, "PayPal{email='hi!'}", (double) 100.0f);
        org.team4.model.items.Magazine magazine14 = new org.team4.model.items.Magazine((org.team4.model.items.Item) courseTextBook1, "Debit Card", (int) (byte) 10);
        courseTextBook1.setRentable(true);
        int int17 = courseTextBook1.getEdition();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.email("PayPal{email='hi!'}");
        org.team4.model.items.BookRequest bookRequest7 = bookRequestBuilder6.build();
        java.lang.String str8 = bookRequest7.getTitle();
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequest7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str8, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.team4.model.user.UserFactory userFactory0 = new org.team4.model.user.UserFactory();
        org.team4.model.user.User user6 = userFactory0.getUser("", "ProcessPayment{modes=null, itemToPurchase=null}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", false);
        java.lang.Class<?> wildcardClass7 = userFactory0.getClass();
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        java.lang.String str9 = courseTextBook1.getISBN();
        org.team4.model.items.decorator.ItemDecorator itemDecorator10 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setQuantity((int) (short) 1);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator9 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        boolean boolean10 = courseTextBook1.isRentable();
        java.util.List<org.team4.model.user.Student> studentList11 = courseTextBook1.getStudentsWithCopies();
        org.team4.model.items.DVD dVD14 = new org.team4.model.items.DVD((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) 9261356L);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(studentList11);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("PayPal{email='hi!'}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) '4');
        org.team4.model.user.Faculty faculty9 = new org.team4.model.user.Faculty("hi!", "hi!", "hi!", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", false);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase10 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) faculty9);
        java.util.Date date12 = null;
        java.util.Date date13 = null;
        org.team4.model.course.Course course16 = new org.team4.model.course.Course("", date12, date13, "", "hi!");
        org.team4.model.user.Student student22 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "Mobile Wallet", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "", false);
        course16.enrollStudent(student22);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase24 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) student22);
        java.lang.String str25 = newsletter3.getLink();
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str25, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder3 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder5 = courseTextBookBuilder0.isVirtual(false);
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        org.team4.model.course.Course course11 = new org.team4.model.course.Course("", date7, date8, "", "hi!");
        java.util.Date date12 = course11.getStartDate();
        java.lang.String str13 = course11.getCourseTextBookISBN();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder14 = courseTextBookBuilder5.course(course11);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder16 = courseTextBookBuilder14.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder18 = courseTextBookBuilder16.noOfPages(10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder20 = courseTextBookBuilder16.yearPublished(100);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(bookBuilder3);
        org.junit.Assert.assertNotNull(courseTextBookBuilder5);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(courseTextBookBuilder14);
        org.junit.Assert.assertNotNull(courseTextBookBuilder16);
        org.junit.Assert.assertNotNull(bookBuilder18);
        org.junit.Assert.assertNotNull(bookItemBuilder20);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.Item item9 = new org.team4.model.items.Item((org.team4.model.items.Item) courseTextBook1);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder15 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder17 = courseTextBookBuilder15.hasHardCopy(true);
        java.util.Date date19 = null;
        java.util.Date date20 = null;
        org.team4.model.course.Course course23 = new org.team4.model.course.Course("", date19, date20, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder24 = courseTextBookBuilder15.course(course23);
        org.team4.model.course.CourseTextBook courseTextBook26 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}", (int) '#', "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "", (int) (byte) 0, course23, false);
        java.util.Date date28 = null;
        java.util.Date date29 = null;
        org.team4.model.course.Course course32 = new org.team4.model.course.Course("", date28, date29, "", "hi!");
        java.util.Date date33 = course32.getStartDate();
        org.team4.model.user.Student student39 = new org.team4.model.user.Student("hi!", "hi!", "", "", true);
        boolean boolean40 = course32.isEnrolled(student39);
        boolean boolean41 = course23.isEnrolled(student39);
        java.util.Date date42 = course23.getStartDate();
        java.util.Date date43 = course23.getEndDate();
        java.lang.String str44 = course23.getCourseName();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookBuilder17);
        org.junit.Assert.assertNotNull(courseTextBookBuilder24);
        org.junit.Assert.assertNull(date33);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(date42);
        org.junit.Assert.assertNull(date43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder2 = dVDBuilder0.price((double) 'a');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDItemBuilder2.ISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDItemBuilder2.price((double) (short) -1);
        org.junit.Assert.assertNotNull(dVDItemBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder2 = magazineBuilder0.issueNumber((int) '#');
        org.team4.model.items.Magazine magazine3 = magazineBuilder2.build();
        org.junit.Assert.assertNotNull(magazineBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.Item item9 = new org.team4.model.items.Item((org.team4.model.items.Item) courseTextBook1);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder15 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder17 = courseTextBookBuilder15.hasHardCopy(true);
        java.util.Date date19 = null;
        java.util.Date date20 = null;
        org.team4.model.course.Course course23 = new org.team4.model.course.Course("", date19, date20, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder24 = courseTextBookBuilder15.course(course23);
        org.team4.model.course.CourseTextBook courseTextBook26 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}", (int) '#', "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "", (int) (byte) 0, course23, false);
        boolean boolean27 = courseTextBook1.hasSoftCopy();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookBuilder17);
        org.junit.Assert.assertNotNull(courseTextBookBuilder24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished((int) (short) -1);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.publisher("");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder6 = magazineBuilder0.publisher("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineBuilder0.quantity((int) (byte) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder10 = magazineBuilder0.ISBN("PayPal");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder12 = magazineItemBuilder10.ISBN("ProcessPayment{modes=PayPal{email='hi!'}, itemToPurchase=ItemToPurchase{item=null, user=User [email=hi!, password=hi!, name=hi!, type=hi!, validated=false], newsletter=null}}");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
        org.junit.Assert.assertNotNull(magazineItemBuilder10);
        org.junit.Assert.assertNotNull(magazineItemBuilder12);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        java.util.ArrayList<java.lang.String> strList5 = null;
        org.team4.model.user.Faculty faculty6 = new org.team4.model.user.Faculty("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:59 EDT 2024}", "User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, name=hi!, type=, validated=false]", "User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, name=hi!, type=, validated=false]", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:58 EDT 2024}", (long) (byte) 0, strList5);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.email("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.title("PayPal");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder6.title("User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, type=, validated=false]");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = visitor5.getName();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.items.Newsletter newsletter9 = itemToPurchase7.getNewsletter();
        org.team4.model.items.Item item10 = itemToPurchase7.getItem();
        org.team4.model.paymentmodes.PayPal payPal12 = new org.team4.model.paymentmodes.PayPal("hi!");
        org.team4.model.user.Visitor visitor18 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str19 = visitor18.getName();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase20 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor18);
        org.team4.functionality.buy.ProcessPayment processPayment21 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) payPal12, itemToPurchase20);
        java.lang.String str22 = payPal12.getMode();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete23 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) payPal12);
        double double24 = itemToPurchase7.getAmount();
        org.team4.model.paymentmodes.PayPal payPal26 = new org.team4.model.paymentmodes.PayPal("hi!");
        java.lang.String str27 = payPal26.toString();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete28 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) payPal26);
        long long29 = purchaseComplete28.getPurchaseID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Mobile Wallet" + "'", str22, "Mobile Wallet");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PayPal{email='hi!'}" + "'", str27, "PayPal{email='hi!'}");
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 5765543L + "'", long29 == 5765543L);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.items.RentedItem rentedItem4 = new org.team4.model.items.RentedItem("", "hi!", date2, date3);
        rentedItem4.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem4.setTitle("hi!");
        java.util.Date date9 = rentedItem4.getRentDate();
        java.lang.String str10 = rentedItem4.getISBN();
        java.lang.String str11 = rentedItem4.getTitle();
        java.util.Date date12 = rentedItem4.getDueDate();
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str10, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:02 EDT 2024, dateDue=Mon Apr 29 00:42:02 EDT 2024}", (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("PayPal{email='hi!'}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "ProcessPayment{modes=PayPal{email='hi!'}, itemToPurchase=ItemToPurchase{item=null, user=User [email=hi!, password=hi!, name=hi!, type=hi!, validated=false], newsletter=null}}", "Book{genre='null', noOfPages=0, author='null', ISBN=null, publisher='null', edition='0'}", (int) (short) 1, "User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, name=hi!, type=, validated=false]");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder2 = dVDBuilder0.price((double) (-1.0f));
        org.team4.model.items.builder.DVDBuilder dVDBuilder4 = dVDBuilder0.genre("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder4.duration((double) 10L);
        org.team4.model.items.builder.DVDBuilder dVDBuilder8 = dVDBuilder6.genre("hi!");
        org.team4.model.items.DVD dVD9 = dVDBuilder6.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder11 = dVDBuilder6.genre("ItemToPurchase{item=null, user=User [email=hi!, password=, name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, type=ProcessPayment{modes=null, itemToPurchase=null}, validated=false], newsletter=null}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder13 = dVDBuilder11.genre("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}");
        org.team4.model.items.DVD dVD14 = dVDBuilder11.build();
        org.junit.Assert.assertNotNull(dVDItemBuilder2);
        org.junit.Assert.assertNotNull(dVDBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDBuilder8);
        org.junit.Assert.assertNotNull(dVD9);
        org.junit.Assert.assertNotNull(dVDBuilder11);
        org.junit.Assert.assertNotNull(dVDBuilder13);
        org.junit.Assert.assertNotNull(dVD14);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.user.Visitor visitor7 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str8 = visitor7.getName();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase9 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor7);
        org.team4.model.items.Newsletter newsletter10 = itemToPurchase9.getNewsletter();
        org.team4.model.items.Newsletter newsletter11 = itemToPurchase9.getNewsletter();
        org.team4.functionality.buy.ProcessPayment processPayment12 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet1, itemToPurchase9);
        java.lang.String str13 = mobileWallet1.getMode();
        org.team4.model.items.Newsletter newsletter17 = new org.team4.model.items.Newsletter("PayPal{email='hi!'}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) '4');
        org.team4.model.user.Faculty faculty23 = new org.team4.model.user.Faculty("hi!", "hi!", "hi!", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", false);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase24 = new org.team4.functionality.buy.ItemToPurchase(newsletter17, (org.team4.model.user.User) faculty23);
        org.team4.functionality.buy.ProcessPayment processPayment25 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet1, itemToPurchase24);
        java.lang.String str26 = itemToPurchase24.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PayPal" + "'", str13, "PayPal");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.Magazine magazine1 = magazineBuilder0.build();
        java.lang.String str2 = magazine1.getPublisher();
        java.lang.String str3 = magazine1.getPublisher();
        int int4 = magazine1.getIssueNumber();
        int int5 = magazine1.getIssueNumber();
        magazine1.setQuantity((int) (short) -1);
        org.junit.Assert.assertNotNull(magazine1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        java.util.Date date2 = null;
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("", "hi!", date2);
        java.lang.String str4 = itemPurchased3.getEmail();
        java.lang.String str5 = itemPurchased3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder2 = dVDBuilder0.price((double) (-1.0f));
        org.team4.model.items.builder.DVDBuilder dVDBuilder4 = dVDBuilder0.genre("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder4.duration((double) 10L);
        org.team4.model.items.builder.DVDBuilder dVDBuilder8 = dVDBuilder6.genre("hi!");
        org.team4.model.items.DVD dVD9 = dVDBuilder6.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder11 = dVDBuilder6.genre("User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, type=, validated=false]");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder13 = dVDBuilder11.yearPublished((int) (byte) -1);
        org.junit.Assert.assertNotNull(dVDItemBuilder2);
        org.junit.Assert.assertNotNull(dVDBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDBuilder8);
        org.junit.Assert.assertNotNull(dVD9);
        org.junit.Assert.assertNotNull(dVDBuilder11);
        org.junit.Assert.assertNotNull(dVDItemBuilder13);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:56 EDT 2024, dateDue=Mon Apr 29 00:41:56 EDT 2024}", (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.team4.model.paymentmodes.PaymentValidator paymentValidator0 = null;
        org.team4.model.user.Student student6 = new org.team4.model.user.Student("hi!", "", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (-1L), (org.team4.model.user.User) student6);
        org.team4.functionality.buy.ProcessPayment processPayment8 = new org.team4.functionality.buy.ProcessPayment(paymentValidator0, itemToPurchase7);
        java.lang.String str9 = itemToPurchase7.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ItemToPurchase{item=null, user=User [email=hi!, password=, name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, type=ProcessPayment{modes=null, itemToPurchase=null}, validated=false], newsletter=null}" + "'", str9, "ItemToPurchase{item=null, user=User [email=hi!, password=, name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, type=ProcessPayment{modes=null, itemToPurchase=null}, validated=false], newsletter=null}");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        int int7 = courseTextBook1.getEdition();
        org.team4.model.items.decorator.ItemDecorator itemDecorator8 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook1);
        org.team4.model.items.Item item9 = itemDecorator8.getItem();
        org.team4.model.items.Item item10 = itemDecorator8.getItem();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(item9);
        org.junit.Assert.assertNotNull(item10);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        java.util.Date date8 = null;
        java.util.Date date9 = null;
        org.team4.model.course.Course course12 = new org.team4.model.course.Course("", date8, date9, "", "hi!");
        org.team4.model.course.CourseTextBook courseTextBook14 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", 10, "hi!", "", (int) (byte) -1, course12, false);
        java.lang.String str15 = courseTextBook1.getTitle();
        org.team4.model.course.Course course16 = courseTextBook1.getCourse();
        boolean boolean17 = courseTextBook1.hasHardCopy();
        org.team4.model.course.Course course18 = courseTextBook1.getCourse();
        boolean boolean19 = courseTextBook1.isRentable();
        courseTextBook1.setPrice((double) 10L);
        java.lang.String str22 = courseTextBook1.getGenre();
        courseTextBook1.setPurchaseable(false);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(course16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(course18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.team4.functionality.buy.ItemPurchased itemPurchased6 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date7 = itemPurchased6.getDatePurchased();
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter12 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!", date10, date11);
        subscribeNewsletter12.setTitle("PayPal");
        java.util.Date date17 = null;
        java.util.Date date18 = null;
        org.team4.model.items.RentedItem rentedItem19 = new org.team4.model.items.RentedItem("", "hi!", date17, date18);
        rentedItem19.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem19.setTitle("hi!");
        java.util.Date date24 = rentedItem19.getRentDate();
        rentedItem19.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.functionality.buy.ItemPurchased itemPurchased30 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date31 = itemPurchased30.getDatePurchased();
        java.util.Date date32 = itemPurchased30.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased35 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date36 = itemPurchased35.getDatePurchased();
        org.team4.model.course.Course course39 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date32, date36, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem19.setDueDate(date36);
        subscribeNewsletter12.setDateDue(date36);
        org.team4.model.items.RentedItem rentedItem42 = new org.team4.model.items.RentedItem("PayPal", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", date7, date36);
        org.team4.functionality.buy.ItemPurchased itemPurchased45 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date46 = itemPurchased45.getDatePurchased();
        java.lang.String str47 = itemPurchased45.getEmail();
        java.util.Date date48 = itemPurchased45.getDatePurchased();
        org.team4.model.items.RentedItem rentedItem49 = new org.team4.model.items.RentedItem("", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:56 EDT 2024, dateDue=Mon Apr 29 00:41:56 EDT 2024}", date7, date48);
        java.lang.Class<?> wildcardClass50 = rentedItem49.getClass();
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertNull(date24);
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertNotNull(date36);
// flaky:         org.junit.Assert.assertEquals(date36.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertNotNull(date46);
// flaky:         org.junit.Assert.assertEquals(date46.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(date48);
// flaky:         org.junit.Assert.assertEquals(date48.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("Mobile Wallet", "", "Mobile Wallet", "", 0, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        java.lang.String str7 = bookRequest6.getTitle();
        java.lang.String str8 = bookRequest6.getBookType();
        java.lang.String str9 = bookRequest6.getAuthor();
        java.lang.String str10 = bookRequest6.getBookType();
        java.lang.String str11 = bookRequest6.getAuthor();
        java.lang.String str12 = bookRequest6.getISBN();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str8, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Mobile Wallet" + "'", str9, "Mobile Wallet");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str10, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Mobile Wallet" + "'", str11, "Mobile Wallet");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("", date1, date2, "hi!", "hi!");
        java.util.Date date6 = course5.getEndDate();
        org.team4.model.user.Student student12 = new org.team4.model.user.Student("User [email=hi!, password=hi!, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}', dateSubscribed=Fri Mar 29 00:42:00 EDT 2024, dateDue=Mon Apr 29 00:42:00 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}", "", true);
        boolean boolean13 = course5.isEnrolled(student12);
        org.team4.model.user.Student student19 = new org.team4.model.user.Student("hi!", "", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase20 = new org.team4.functionality.buy.ItemToPurchase((double) (-1L), (org.team4.model.user.User) student19);
        java.lang.String str21 = student19.getName();
        boolean boolean22 = course5.isEnrolled(student19);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}" + "'", str21, "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.team4.model.paymentmodes.PaymentValidator paymentValidator0 = null;
        org.team4.model.items.Newsletter newsletter4 = new org.team4.model.items.Newsletter("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) (short) -1);
        double double5 = newsletter4.getPrice();
        org.team4.model.user.Manager manager10 = new org.team4.model.user.Manager("hi!", "hi!", "hi!", "");
        manager10.setType("");
        long long13 = manager10.getManagerID();
        manager10.setManagerID((long) (-1));
        org.team4.functionality.buy.ItemToPurchase itemToPurchase16 = new org.team4.functionality.buy.ItemToPurchase(newsletter4, (org.team4.model.user.User) manager10);
        org.team4.model.user.Faculty faculty22 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "", false);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase23 = new org.team4.functionality.buy.ItemToPurchase(newsletter4, (org.team4.model.user.User) faculty22);
        org.team4.functionality.buy.ProcessPayment processPayment24 = new org.team4.functionality.buy.ProcessPayment(paymentValidator0, itemToPurchase23);
        org.team4.model.items.Item item25 = itemToPurchase23.getItem();
        org.team4.model.items.Item item26 = itemToPurchase23.getItem();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item26);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", 0, 100);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]", (int) (byte) 1, 10);
        boolean boolean4 = creditCard3.correctLength();
        boolean boolean5 = creditCard3.correctLength();
        java.lang.String str6 = creditCard3.getMode();
        boolean boolean7 = creditCard3.correctLength();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credit Card" + "'", str6, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        org.team4.model.course.Course course14 = new org.team4.model.course.Course("", date10, date11, "", "hi!");
        java.util.Date date15 = course14.getStartDate();
        java.lang.String str16 = course14.getProfessorEmail();
        org.team4.model.user.Student student22 = new org.team4.model.user.Student("hi!", "hi!", "", "", true);
        course14.enrollStudent(student22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        org.team4.model.user.Faculty faculty38 = new org.team4.model.user.Faculty("hi!", "hi!", "", "", (long) 1, strList36);
        org.team4.model.user.Faculty faculty39 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "Mobile Wallet", "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (long) (byte) 100, strList36);
        student22.setCourses(strList36);
        org.team4.model.user.Faculty faculty41 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}', dateSubscribed=Fri Mar 29 00:42:00 EDT 2024, dateDue=Mon Apr 29 00:42:00 EDT 2024}", "", "PayPal", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", (long) 10, strList36);
        org.team4.model.user.Student student42 = new org.team4.model.user.Student("ProcessPayment{modes=PayPal{email='hi!'}, itemToPurchase=ItemToPurchase{item=null, user=User [email=hi!, password=hi!, name=hi!, type=hi!, validated=false], newsletter=null}}", "hi!", "PayPal{email='PayPal{email='hi!'}'}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}", strList36);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.team4.model.user.User user4 = new org.team4.model.user.User("Course [course name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:42:00 EDT 2024, end date=Fri Mar 29 00:42:00 EDT 2024, ISBN=, email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}]", "PayPal{email='hi!'}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:58 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        int int7 = courseTextBook1.getEdition();
        org.team4.model.items.decorator.ItemDecorator itemDecorator8 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPurchaseable(false);
        org.team4.model.items.Book book18 = new org.team4.model.items.Book((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}", (int) (short) 100, "", "", (int) (byte) 1, false, false);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.Course course1 = null;
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder2 = courseTextBookBuilder0.course(course1);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder4 = courseTextBookBuilder2.isVirtual(false);
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder4.noOfPages((int) (byte) 10);
        org.junit.Assert.assertNotNull(courseTextBookBuilder2);
        org.junit.Assert.assertNotNull(courseTextBookBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "ItemToPurchase{item=null, user=User [email=hi!, password=hi!, name=hi!, type=hi!, validated=false], newsletter=null}", "User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, name=hi!, type=, validated=false]", false);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.items.RentedItem rentedItem4 = new org.team4.model.items.RentedItem("", "hi!", date2, date3);
        rentedItem4.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem4.setTitle("hi!");
        java.util.Date date9 = rentedItem4.getRentDate();
        rentedItem4.setISBN("PayPal{email='hi!'}");
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.team4.functionality.buy.ItemPurchased itemPurchased2 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date3 = itemPurchased2.getDatePurchased();
        java.util.Date date4 = itemPurchased2.getDatePurchased();
        java.lang.String str5 = itemPurchased2.getEmail();
        java.lang.String str6 = itemPurchased2.getEmail();
        java.lang.String str7 = itemPurchased2.getTitle();
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder0.ISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:02 EDT 2024, dateDue=Mon Apr 29 00:42:02 EDT 2024}");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.hasHardCopy(true);
        java.util.Date date4 = null;
        java.util.Date date5 = null;
        org.team4.model.course.Course course8 = new org.team4.model.course.Course("", date4, date5, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder9 = courseTextBookBuilder0.course(course8);
        org.team4.model.items.builder.BookBuilder bookBuilder11 = courseTextBookBuilder0.noOfPages((int) 'a');
        org.team4.model.course.CourseTextBook courseTextBook12 = courseTextBookBuilder0.build();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(courseTextBookBuilder9);
        org.junit.Assert.assertNotNull(bookBuilder11);
        org.junit.Assert.assertNotNull(courseTextBook12);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "");
        java.lang.String str3 = subscribeNewsletter2.toString();
        java.util.Date date4 = null;
        subscribeNewsletter2.setDateDue(date4);
        java.lang.String str6 = subscribeNewsletter2.getTitle();
        java.lang.String str7 = subscribeNewsletter2.getEmail();
        subscribeNewsletter2.setTitle("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}");
        java.util.Date date14 = null;
        java.util.Date date15 = null;
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter16 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!", date14, date15);
        org.team4.functionality.buy.ItemPurchased itemPurchased23 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date24 = itemPurchased23.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased25 = new org.team4.functionality.buy.ItemPurchased("Mobile Wallet", "", date24);
        org.team4.functionality.buy.ItemPurchased itemPurchased29 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date30 = itemPurchased29.getDatePurchased();
        java.util.Date date31 = itemPurchased29.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased35 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date36 = itemPurchased35.getDatePurchased();
        java.util.Date date37 = itemPurchased35.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased40 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date41 = itemPurchased40.getDatePurchased();
        org.team4.model.course.Course course44 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date37, date41, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.course.Course course47 = new org.team4.model.course.Course("PayPal{email='hi!'}", date31, date37, "Mobile Wallet", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
        org.team4.model.items.RentedItem rentedItem48 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "PayPal", date24, date31);
        subscribeNewsletter16.setDateDue(date24);
        org.team4.functionality.buy.ItemPurchased itemPurchased52 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date53 = itemPurchased52.getDatePurchased();
        java.util.Date date54 = itemPurchased52.getDatePurchased();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter55 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}", date24, date54);
        subscribeNewsletter2.setDateSubscribed(date24);
        java.lang.String str57 = subscribeNewsletter2.getEmail();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:03 EDT 2024, dateDue=Mon Apr 29 00:42:03 EDT 2024}" + "'", str3, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:03 EDT 2024, dateDue=Mon Apr 29 00:42:03 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(date24);
// flaky:         org.junit.Assert.assertEquals(date24.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertNotNull(date30);
// flaky:         org.junit.Assert.assertEquals(date30.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertNotNull(date36);
// flaky:         org.junit.Assert.assertEquals(date36.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertNotNull(date41);
// flaky:         org.junit.Assert.assertEquals(date41.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertNotNull(date53);
// flaky:         org.junit.Assert.assertEquals(date53.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertNotNull(date54);
// flaky:         org.junit.Assert.assertEquals(date54.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.team4.model.user.Faculty faculty15 = new org.team4.model.user.Faculty("", "", "hi!", "hi!", true);
        java.util.ArrayList<java.lang.String> strList16 = faculty15.getCourses();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        faculty15.setCourses(strList19);
        org.team4.model.user.Faculty faculty22 = new org.team4.model.user.Faculty("", "Debit Card", "Debit Card", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (long) (byte) 100, strList19);
        org.team4.model.user.Faculty faculty23 = new org.team4.model.user.Faculty("Book{genre='null', noOfPages=0, author='null', ISBN=null, publisher='null', edition='0'}", "Course [course name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:42:00 EDT 2024, end date=Fri Mar 29 00:42:00 EDT 2024, ISBN=, email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}]", "ProcessPayment{modes=null, itemToPurchase=null}", "SubscribeNewsletter{title='hi!', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}', dateSubscribed=null, dateDue=null}", (long) (byte) 100, strList19);
        org.junit.Assert.assertNull(strList16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.email("PayPal{email='hi!'}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder4.booktype("Mobile Wallet");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder10 = bookRequestBuilder4.email("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder12 = bookRequestBuilder10.ISBN("PayPal{email='hi!'}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder14 = bookRequestBuilder12.author("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:56 EDT 2024, dateDue=Mon Apr 29 00:41:56 EDT 2024}");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
        org.junit.Assert.assertNotNull(bookRequestBuilder10);
        org.junit.Assert.assertNotNull(bookRequestBuilder12);
        org.junit.Assert.assertNotNull(bookRequestBuilder14);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:58 EDT 2024}", "Course [course name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:42:00 EDT 2024, end date=Fri Mar 29 00:42:00 EDT 2024, ISBN=, email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}]", (double) 1.0f);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        java.util.Date date8 = null;
        java.util.Date date9 = null;
        org.team4.model.course.Course course12 = new org.team4.model.course.Course("", date8, date9, "", "hi!");
        org.team4.model.course.CourseTextBook courseTextBook14 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", 10, "hi!", "", (int) (byte) -1, course12, false);
        java.lang.String str15 = courseTextBook1.getTitle();
        org.team4.model.course.Course course16 = courseTextBook1.getCourse();
        boolean boolean17 = courseTextBook1.hasHardCopy();
        org.team4.model.course.Course course18 = courseTextBook1.getCourse();
        boolean boolean19 = courseTextBook1.isRentable();
        courseTextBook1.setPrice((double) 10L);
        java.lang.String str22 = courseTextBook1.getGenre();
        org.team4.model.items.decorator.ItemDecorator itemDecorator23 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook1);
        org.team4.functionality.recommendation.CompareYearRecommendationStrategy compareYearRecommendationStrategy24 = new org.team4.functionality.recommendation.CompareYearRecommendationStrategy();
        boolean boolean25 = courseTextBook1.equals((java.lang.Object) compareYearRecommendationStrategy24);
        java.lang.String str26 = courseTextBook1.getAuthor();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(course16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(course18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder4 = bookBuilder2.genre("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = bookBuilder4.genre("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = bookBuilder4.price((double) (byte) -1);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder3 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder5 = courseTextBookBuilder0.genre("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder7 = bookBuilder5.title("Debit Card");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder9 = bookItemBuilder7.quantity((int) (short) 0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder11 = bookItemBuilder7.quantity(0);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(bookBuilder3);
        org.junit.Assert.assertNotNull(bookBuilder5);
        org.junit.Assert.assertNotNull(bookItemBuilder7);
        org.junit.Assert.assertNotNull(bookItemBuilder9);
        org.junit.Assert.assertNotNull(bookItemBuilder11);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("Mobile Wallet", "", "Mobile Wallet", "", 0, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        java.lang.String str7 = bookRequest6.getTitle();
        java.lang.String str8 = bookRequest6.getAuthor();
        java.lang.String str9 = bookRequest6.getBookType();
        java.lang.String str10 = bookRequest6.getBookType();
        java.lang.String str11 = bookRequest6.getAuthor();
        int int12 = bookRequest6.getEdition();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Mobile Wallet" + "'", str8, "Mobile Wallet");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str9, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str10, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Mobile Wallet" + "'", str11, "Mobile Wallet");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("Mobile Wallet", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "", "User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, name=hi!, type=, validated=false]", false);
        long long6 = nonFaculty5.getUniversityID();
        java.lang.String str7 = nonFaculty5.toString();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [email=Mobile Wallet, password=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, name=, type=User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, name=hi!, type=, validated=false], validated=false]" + "'", str7, "User [email=Mobile Wallet, password=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, name=, type=User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, name=hi!, type=, validated=false], validated=false]");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.user.Visitor visitor7 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str8 = visitor7.getName();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase9 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor7);
        org.team4.model.items.Newsletter newsletter10 = itemToPurchase9.getNewsletter();
        org.team4.model.items.Newsletter newsletter11 = itemToPurchase9.getNewsletter();
        org.team4.functionality.buy.ProcessPayment processPayment12 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet1, itemToPurchase9);
        java.lang.String str13 = mobileWallet1.getMode();
        java.lang.String str14 = mobileWallet1.getMode();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PayPal" + "'", str13, "PayPal");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PayPal" + "'", str14, "PayPal");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("", "", "hi!", "hi!", true);
        java.util.ArrayList<java.lang.String> strList6 = faculty5.getCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        faculty5.setCourses(strList9);
        faculty5.setFacultyID((long) (short) -1);
        faculty5.setType("PayPal{email='hi!'}");
        org.junit.Assert.assertNull(strList6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.hasHardCopy(true);
        java.util.Date date4 = null;
        java.util.Date date5 = null;
        org.team4.model.course.Course course8 = new org.team4.model.course.Course("", date4, date5, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder9 = courseTextBookBuilder0.course(course8);
        java.util.Date date11 = null;
        java.util.Date date12 = null;
        org.team4.model.course.Course course15 = new org.team4.model.course.Course("", date11, date12, "", "hi!");
        java.util.Date date16 = course15.getStartDate();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder17 = courseTextBookBuilder9.course(course15);
        org.team4.model.items.Book book18 = courseTextBookBuilder9.build();
        java.lang.String str19 = book18.getPublisher();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(courseTextBookBuilder9);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNotNull(courseTextBookBuilder17);
        org.junit.Assert.assertNotNull(book18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("", "", "", "", true);
        manager5.setManagerID(2097897L);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("PayPal{email='hi!'}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) '4');
        org.team4.model.user.Faculty faculty8 = new org.team4.model.user.Faculty("hi!", "hi!", "hi!", "hi!");
        faculty8.setFacultyID((long) 0);
        java.lang.String[] strArray15 = new java.lang.String[] { "ProcessPayment{modes=null, itemToPurchase=null}", "ProcessPayment{modes=null, itemToPurchase=null}", "hi!", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        faculty8.setCourses(strList16);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase19 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) faculty8);
        faculty8.setValidated(true);
        java.lang.String str22 = faculty8.getName();
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = visitor5.getName();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        visitor5.setType("hi!");
        visitor5.setValidated(true);
        java.lang.String str12 = visitor5.getName();
        visitor5.setValidated(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator7 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        boolean boolean8 = rentableItemDecorator7.isRentable();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.Magazine magazine1 = magazineBuilder0.build();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder3 = magazineBuilder0.issueNumber((int) (short) 1);
        org.team4.model.items.Magazine magazine4 = magazineBuilder0.build();
        org.junit.Assert.assertNotNull(magazine1);
        org.junit.Assert.assertNotNull(magazineBuilder3);
        org.junit.Assert.assertNotNull(magazine4);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) 'a');
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("hi!", "PayPal", (double) 0L);
        org.team4.functionality.buy.ItemPurchased itemPurchased7 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date8 = itemPurchased7.getDatePurchased();
        java.util.Date date9 = itemPurchased7.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased12 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date13 = itemPurchased12.getDatePurchased();
        org.team4.model.course.Course course16 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date9, date13, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.user.Faculty faculty26 = new org.team4.model.user.Faculty("", "", "hi!", "hi!", true);
        java.util.ArrayList<java.lang.String> strList27 = faculty26.getCourses();
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        faculty26.setCourses(strList30);
        org.team4.model.user.Student student33 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "", strList30);
        course16.enrollStudent(student33);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase35 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) student33);
        student33.setType("PayPal{email='PayPal{email='hi!'}'}");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertNull(strList27);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder2 = dVDBuilder0.price((double) (-1.0f));
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDItemBuilder2.ISBN("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDItemBuilder4.price((double) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDItemBuilder6.price((double) (-1L));
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder10 = dVDItemBuilder6.yearPublished((int) '4');
        org.junit.Assert.assertNotNull(dVDItemBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
        org.junit.Assert.assertNotNull(dVDItemBuilder10);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        int int2 = courseTextBook1.getQuantity();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = visitor5.getName();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.items.Newsletter newsletter9 = itemToPurchase7.getNewsletter();
        org.team4.model.items.Item item10 = itemToPurchase7.getItem();
        org.team4.model.paymentmodes.PayPal payPal12 = new org.team4.model.paymentmodes.PayPal("hi!");
        org.team4.model.user.Visitor visitor18 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str19 = visitor18.getName();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase20 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor18);
        org.team4.functionality.buy.ProcessPayment processPayment21 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) payPal12, itemToPurchase20);
        java.lang.String str22 = payPal12.getMode();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete23 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) payPal12);
        double double24 = itemToPurchase7.getAmount();
        org.team4.model.paymentmodes.PayPal payPal26 = new org.team4.model.paymentmodes.PayPal("hi!");
        java.lang.String str27 = payPal26.toString();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete28 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) payPal26);
        org.team4.model.items.Newsletter newsletter29 = purchaseComplete28.getNewsletter();
        org.team4.model.items.Item item30 = purchaseComplete28.getItem();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Mobile Wallet" + "'", str22, "Mobile Wallet");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PayPal{email='hi!'}" + "'", str27, "PayPal{email='hi!'}");
        org.junit.Assert.assertNull(newsletter29);
        org.junit.Assert.assertNull(item30);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.ISBN("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder5 = magazineBuilder0.yearPublished((int) 'a');
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertNotNull(magazineItemBuilder5);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) (short) -1);
        java.lang.String str4 = newsletter3.getTitle();
        double double5 = newsletter3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}" + "'", str4, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", 100, (int) (short) 1);
        boolean boolean4 = debitCard3.correctLength();
        boolean boolean5 = debitCard3.notExpired();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:59 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:59 EDT 2024, dateDue=Mon Apr 29 00:41:59 EDT 2024}", "", 3763455L);
        java.lang.String str6 = manager5.getPassword();
        manager5.setManagerID(3090830L);
        long long9 = manager5.getManagerID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}" + "'", str6, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3090830L + "'", long9 == 3090830L);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.hasHardCopy(true);
        java.util.Date date4 = null;
        java.util.Date date5 = null;
        org.team4.model.course.Course course8 = new org.team4.model.course.Course("", date4, date5, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder9 = courseTextBookBuilder0.course(course8);
        java.util.Date date10 = course8.getStartDate();
        java.util.Date date11 = course8.getEndDate();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(courseTextBookBuilder9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.Item item9 = new org.team4.model.items.Item((org.team4.model.items.Item) courseTextBook1);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder15 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder17 = courseTextBookBuilder15.hasHardCopy(true);
        java.util.Date date19 = null;
        java.util.Date date20 = null;
        org.team4.model.course.Course course23 = new org.team4.model.course.Course("", date19, date20, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder24 = courseTextBookBuilder15.course(course23);
        org.team4.model.course.CourseTextBook courseTextBook26 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}", (int) '#', "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "", (int) (byte) 0, course23, false);
        double double27 = courseTextBook1.getPrice();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookBuilder17);
        org.junit.Assert.assertNotNull(courseTextBookBuilder24);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date4 = itemPurchased3.getDatePurchased();
        java.util.Date date5 = itemPurchased3.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased9 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date10 = itemPurchased9.getDatePurchased();
        java.util.Date date11 = itemPurchased9.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased14 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date15 = itemPurchased14.getDatePurchased();
        org.team4.model.course.Course course18 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date11, date15, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.course.Course course21 = new org.team4.model.course.Course("PayPal{email='hi!'}", date5, date11, "Mobile Wallet", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
        org.team4.model.user.Student student27 = new org.team4.model.user.Student("User [email=hi!, password=hi!, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}', dateSubscribed=Fri Mar 29 00:42:00 EDT 2024, dateDue=Mon Apr 29 00:42:00 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}", "", true);
        boolean boolean28 = course21.isEnrolled(student27);
        org.team4.model.user.Faculty faculty38 = new org.team4.model.user.Faculty("hi!", "hi!", "hi!", "hi!");
        org.team4.model.user.Student student44 = new org.team4.model.user.Student("hi!", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", false);
        java.lang.String[] strArray50 = new java.lang.String[] { "SubscribeNewsletter{title='hi!', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}', dateSubscribed=null, dateDue=null}", "ProcessPayment{modes=null, itemToPurchase=null}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "Book{genre='null', noOfPages=0, author='null', ISBN=null, publisher='null', edition='0'}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:58 EDT 2024}" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        student44.setCourses(strList51);
        faculty38.setCourses(strList51);
        org.team4.model.user.Faculty faculty55 = new org.team4.model.user.Faculty("PayPal{email='PayPal{email='hi!'}'}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "", (long) '4', strList51);
        student27.setCourses(strList51);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.course.Course course2 = courseTextBook1.getCourse();
        org.team4.model.items.Magazine magazine5 = new org.team4.model.items.Magazine((org.team4.model.items.Item) courseTextBook1, "Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]", (int) (byte) -1);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(course2);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter3 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "");
        java.lang.String str4 = subscribeNewsletter3.toString();
        java.util.Date date5 = null;
        subscribeNewsletter3.setDateDue(date5);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        org.team4.model.items.RentedItem rentedItem11 = new org.team4.model.items.RentedItem("", "hi!", date9, date10);
        rentedItem11.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem11.setTitle("hi!");
        java.util.Date date16 = rentedItem11.getRentDate();
        org.team4.functionality.buy.ItemPurchased itemPurchased20 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date21 = itemPurchased20.getDatePurchased();
        java.util.Date date22 = itemPurchased20.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased25 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date26 = itemPurchased25.getDatePurchased();
        org.team4.model.course.Course course29 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date22, date26, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem11.setRentDate(date22);
        subscribeNewsletter3.setDateSubscribed(date22);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter34 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "");
        java.lang.String str35 = subscribeNewsletter34.toString();
        java.util.Date date36 = null;
        subscribeNewsletter34.setDateDue(date36);
        java.util.Date date40 = null;
        java.util.Date date41 = null;
        org.team4.model.items.RentedItem rentedItem42 = new org.team4.model.items.RentedItem("", "hi!", date40, date41);
        rentedItem42.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem42.setTitle("hi!");
        java.util.Date date47 = rentedItem42.getRentDate();
        org.team4.functionality.buy.ItemPurchased itemPurchased51 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date52 = itemPurchased51.getDatePurchased();
        java.util.Date date53 = itemPurchased51.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased56 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date57 = itemPurchased56.getDatePurchased();
        org.team4.model.course.Course course60 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date53, date57, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem42.setRentDate(date53);
        subscribeNewsletter34.setDateSubscribed(date53);
        subscribeNewsletter3.setDateSubscribed(date53);
        java.util.Date date68 = null;
        java.util.Date date69 = null;
        org.team4.model.items.RentedItem rentedItem70 = new org.team4.model.items.RentedItem("", "hi!", date68, date69);
        java.lang.String str71 = rentedItem70.getISBN();
        java.util.Date date72 = null;
        rentedItem70.setDueDate(date72);
        rentedItem70.setISBN("PayPal");
        org.team4.functionality.buy.ItemPurchased itemPurchased79 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date80 = itemPurchased79.getDatePurchased();
        java.util.Date date81 = itemPurchased79.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased84 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date85 = itemPurchased84.getDatePurchased();
        org.team4.model.course.Course course88 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date81, date85, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem70.setDueDate(date81);
        org.team4.functionality.buy.ItemPurchased itemPurchased90 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date81);
        org.team4.model.course.Course course93 = new org.team4.model.course.Course("Mobile Wallet", date53, date81, "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}");
        java.util.Date date94 = course93.getEndDate();
        java.lang.String str95 = course93.getCourseName();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:03 EDT 2024, dateDue=Mon Apr 29 00:42:03 EDT 2024}" + "'", str4, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:03 EDT 2024, dateDue=Mon Apr 29 00:42:03 EDT 2024}");
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertNotNull(date26);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Fri Mar 29 00:42:03 EDT 2024");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:03 EDT 2024, dateDue=Mon Apr 29 00:42:03 EDT 2024}" + "'", str35, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:03 EDT 2024, dateDue=Mon Apr 29 00:42:03 EDT 2024}");
        org.junit.Assert.assertNull(date47);
        org.junit.Assert.assertNotNull(date52);
// flaky:         org.junit.Assert.assertEquals(date52.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertNotNull(date53);
// flaky:         org.junit.Assert.assertEquals(date53.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertNotNull(date57);
// flaky:         org.junit.Assert.assertEquals(date57.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertNotNull(date80);
// flaky:         org.junit.Assert.assertEquals(date80.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertNotNull(date81);
// flaky:         org.junit.Assert.assertEquals(date81.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertNotNull(date85);
// flaky:         org.junit.Assert.assertEquals(date85.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertNotNull(date94);
// flaky:         org.junit.Assert.assertEquals(date94.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "Mobile Wallet" + "'", str95, "Mobile Wallet");
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        java.util.Date date3 = null;
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        org.team4.model.items.RentedItem rentedItem8 = new org.team4.model.items.RentedItem("", "hi!", date6, date7);
        java.lang.String str9 = rentedItem8.getISBN();
        java.util.Date date10 = null;
        rentedItem8.setDueDate(date10);
        rentedItem8.setISBN("PayPal");
        org.team4.functionality.buy.ItemPurchased itemPurchased17 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date18 = itemPurchased17.getDatePurchased();
        java.util.Date date19 = itemPurchased17.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased22 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date23 = itemPurchased22.getDatePurchased();
        org.team4.model.course.Course course26 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date19, date23, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem8.setDueDate(date19);
        java.util.Date date28 = rentedItem8.getDueDate();
        org.team4.model.course.Course course31 = new org.team4.model.course.Course("hi!", date3, date28, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "");
        org.team4.functionality.buy.ItemPurchased itemPurchased32 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}", date3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Fri Mar 29 00:42:03 EDT 2024");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}", (int) (byte) -1, (int) 'a', (double) 100.0f, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:03 EDT 2024, dateDue=Mon Apr 29 00:42:03 EDT 2024}", true, false);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.items.RentedItem rentedItem4 = new org.team4.model.items.RentedItem("", "hi!", date2, date3);
        rentedItem4.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem4.setTitle("hi!");
        java.util.Date date9 = rentedItem4.getRentDate();
        org.team4.functionality.buy.ItemPurchased itemPurchased13 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date14 = itemPurchased13.getDatePurchased();
        java.util.Date date15 = itemPurchased13.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased18 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date19 = itemPurchased18.getDatePurchased();
        org.team4.model.course.Course course22 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date15, date19, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem4.setRentDate(date15);
        java.lang.String str24 = rentedItem4.getISBN();
        java.util.Date date25 = rentedItem4.getRentDate();
        java.util.Date date26 = rentedItem4.getDueDate();
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str24, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Fri Mar 29 00:42:03 EDT 2024");
        org.junit.Assert.assertNull(date26);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.Magazine magazine1 = magazineBuilder0.build();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder3 = magazineBuilder0.publisher("PayPal");
        org.team4.model.items.Magazine magazine4 = magazineBuilder0.build();
        java.lang.String str5 = magazine4.getTitle();
        org.junit.Assert.assertNotNull(magazine1);
        org.junit.Assert.assertNotNull(magazineBuilder3);
        org.junit.Assert.assertNotNull(magazine4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.email("PayPal{email='hi!'}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder4.booktype("Mobile Wallet");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder10 = bookRequestBuilder8.title("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.model.items.BookRequest bookRequest11 = bookRequestBuilder8.build();
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
        org.junit.Assert.assertNotNull(bookRequestBuilder10);
        org.junit.Assert.assertNotNull(bookRequest11);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("Credit Card");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("Mobile Wallet", "User [email=hi!, password=hi!, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:01 EDT 2024, dateDue=Mon Apr 29 00:42:01 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}", false);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("ItemToPurchase{item=null, user=User [email=hi!, password=, name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, type=ProcessPayment{modes=null, itemToPurchase=null}, validated=false], newsletter=null}", (int) (short) 100, (int) (byte) 1, (double) 6227221L, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:03 EDT 2024, dateDue=Mon Apr 29 00:42:03 EDT 2024}", false, true);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("Book{genre='null', noOfPages=0, author='null', ISBN=null, publisher='null', edition='0'}");
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        java.util.Date date8 = null;
        java.util.Date date9 = null;
        org.team4.model.course.Course course12 = new org.team4.model.course.Course("", date8, date9, "", "hi!");
        org.team4.model.course.CourseTextBook courseTextBook14 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", 10, "hi!", "", (int) (byte) -1, course12, false);
        java.lang.String str15 = courseTextBook1.getTitle();
        org.team4.model.course.Course course16 = courseTextBook1.getCourse();
        boolean boolean17 = courseTextBook1.hasHardCopy();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator18 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        int int19 = courseTextBook1.getEdition();
        int int20 = courseTextBook1.getNoOfPages();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(course16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("hi!", 100, 100, (double) 10L, "PayPal", false, true);
        int int8 = item7.getYearPublished();
        org.team4.model.items.DVD dVD11 = new org.team4.model.items.DVD(item7, "", (double) 10);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator12 = new org.team4.model.items.decorator.RentableItemDecorator(item7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}", "Credit Card", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:01 EDT 2024, dateDue=Mon Apr 29 00:42:01 EDT 2024}", "User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, type=, validated=false]", (long) (-1));
        boolean boolean6 = nonFaculty5.isValidated();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
        boolean boolean2 = payPal1.isValid();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.team4.model.user.Manager manager4 = new org.team4.model.user.Manager("hi!", "hi!", "hi!", "");
        manager4.setType("");
        java.lang.String str7 = manager4.toString();
        long long8 = manager4.getManagerID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [email=hi!, password=hi!, name=hi!, type=, validated=false]" + "'", str7, "User [email=hi!, password=hi!, name=hi!, type=, validated=false]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        boolean boolean3 = courseTextBook1.equals((java.lang.Object) (byte) 1);
        java.lang.String str4 = courseTextBook1.getTitle();
        java.lang.String str5 = courseTextBook1.getTitle();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder11 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder13 = courseTextBookBuilder11.hasHardCopy(true);
        java.util.Date date15 = null;
        java.util.Date date16 = null;
        org.team4.model.course.Course course19 = new org.team4.model.course.Course("", date15, date16, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder20 = courseTextBookBuilder11.course(course19);
        org.team4.model.course.CourseTextBook courseTextBook22 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook1, "User [email=hi!, password=hi!, name=hi!, type=, validated=false]", (int) (short) -1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}", (int) (byte) 10, course19, true);
        java.lang.String str23 = course19.getProfessorEmail();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(bookBuilder13);
        org.junit.Assert.assertNotNull(courseTextBookBuilder20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("ProcessPayment{modes=PayPal{email='hi!'}, itemToPurchase=ItemToPurchase{item=null, user=User [email=hi!, password=hi!, name=hi!, type=hi!, validated=false], newsletter=null}}");
        boolean boolean2 = payPal1.isValid();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        boolean boolean3 = courseTextBook1.equals((java.lang.Object) (byte) 1);
        java.util.List<org.team4.model.user.Student> studentList4 = courseTextBook1.getStudentsWithCopies();
        courseTextBook1.setRentable(false);
        java.lang.String str7 = courseTextBook1.getISBN();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(studentList4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder3 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder5 = courseTextBookBuilder0.isVirtual(false);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder6.hasHardCopy(true);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        org.team4.model.course.Course course14 = new org.team4.model.course.Course("", date10, date11, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder15 = courseTextBookBuilder6.course(course14);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder16 = courseTextBookBuilder5.course(course14);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder18 = courseTextBookBuilder5.isVirtual(true);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(bookBuilder3);
        org.junit.Assert.assertNotNull(courseTextBookBuilder5);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(courseTextBookBuilder15);
        org.junit.Assert.assertNotNull(courseTextBookBuilder16);
        org.junit.Assert.assertNotNull(courseTextBookBuilder18);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:58 EDT 2024}", (long) (-1));
        manager5.setEmail("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:00 EDT 2024, dateDue=Mon Apr 29 00:42:00 EDT 2024}");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "PayPal{email='hi!'}", "PayPal{email='hi!'}", "PayPal{email='hi!'}", true);
        java.lang.String str6 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str6, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("Mobile Wallet", "", "Mobile Wallet", "", 0, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        java.lang.String str7 = bookRequest6.getTitle();
        java.lang.String str8 = bookRequest6.getBookType();
        java.lang.String str9 = bookRequest6.getTitle();
        java.lang.String str10 = bookRequest6.getBookType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str8, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str10, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.team4.functionality.buy.ItemPurchased itemPurchased2 = new org.team4.functionality.buy.ItemPurchased("ProcessPayment{modes=null, itemToPurchase=null}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:00 EDT 2024, dateDue=Mon Apr 29 00:42:00 EDT 2024}");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:02 EDT 2024, dateDue=Mon Apr 29 00:42:02 EDT 2024}");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        boolean boolean1 = org.team4.utils.EmailValidator.validEmail("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder3 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder5 = courseTextBookBuilder0.isVirtual(false);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder6.hasHardCopy(true);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        org.team4.model.course.Course course14 = new org.team4.model.course.Course("", date10, date11, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder15 = courseTextBookBuilder6.course(course14);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder16 = courseTextBookBuilder5.course(course14);
        org.team4.model.items.builder.BookBuilder bookBuilder18 = courseTextBookBuilder16.author("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder20 = bookBuilder18.quantity(100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder22 = bookBuilder18.yearPublished((int) '#');
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(bookBuilder3);
        org.junit.Assert.assertNotNull(courseTextBookBuilder5);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(courseTextBookBuilder15);
        org.junit.Assert.assertNotNull(courseTextBookBuilder16);
        org.junit.Assert.assertNotNull(bookBuilder18);
        org.junit.Assert.assertNotNull(bookItemBuilder20);
        org.junit.Assert.assertNotNull(bookItemBuilder22);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.email("PayPal{email='hi!'}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder4.booktype("Mobile Wallet");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder10 = bookRequestBuilder4.author("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder12 = bookRequestBuilder10.edition((int) 'a');
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
        org.junit.Assert.assertNotNull(bookRequestBuilder10);
        org.junit.Assert.assertNotNull(bookRequestBuilder12);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.Magazine magazine1 = magazineBuilder0.build();
        java.lang.String str2 = magazine1.getPublisher();
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        org.team4.model.items.RentedItem rentedItem7 = new org.team4.model.items.RentedItem("", "hi!", date5, date6);
        java.lang.String str8 = rentedItem7.getISBN();
        java.util.Date date9 = null;
        rentedItem7.setDueDate(date9);
        rentedItem7.setISBN("PayPal");
        java.util.Date date13 = rentedItem7.getRentDate();
        boolean boolean14 = magazine1.equals((java.lang.Object) date13);
        org.team4.model.items.Item item15 = new org.team4.model.items.Item((org.team4.model.items.Item) magazine1);
        item15.setRentable(true);
        item15.setPrice((-1.0d));
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator20 = new org.team4.model.items.decorator.RentableItemDecorator(item15);
        org.junit.Assert.assertNotNull(magazine1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = visitor5.getName();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.items.Newsletter newsletter9 = itemToPurchase7.getNewsletter();
        org.team4.model.items.Item item10 = itemToPurchase7.getItem();
        org.team4.model.items.Newsletter newsletter11 = itemToPurchase7.getNewsletter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(newsletter11);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.email("PayPal{email='hi!'}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder4.booktype("Mobile Wallet");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder10 = bookRequestBuilder8.title("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder12 = bookRequestBuilder10.email("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder14 = bookRequestBuilder12.author("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:59 EDT 2024, dateDue=Mon Apr 29 00:41:59 EDT 2024}");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
        org.junit.Assert.assertNotNull(bookRequestBuilder10);
        org.junit.Assert.assertNotNull(bookRequestBuilder12);
        org.junit.Assert.assertNotNull(bookRequestBuilder14);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.Item item9 = new org.team4.model.items.Item((org.team4.model.items.Item) courseTextBook1);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder15 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder17 = courseTextBookBuilder15.hasHardCopy(true);
        java.util.Date date19 = null;
        java.util.Date date20 = null;
        org.team4.model.course.Course course23 = new org.team4.model.course.Course("", date19, date20, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder24 = courseTextBookBuilder15.course(course23);
        org.team4.model.course.CourseTextBook courseTextBook26 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}", (int) '#', "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "", (int) (byte) 0, course23, false);
        courseTextBook1.setRentable(false);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookBuilder17);
        org.junit.Assert.assertNotNull(courseTextBookBuilder24);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder2 = courseTextBookBuilder0.price(1.0d);
        org.team4.functionality.buy.ItemPurchased itemPurchased6 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date7 = itemPurchased6.getDatePurchased();
        java.util.Date date8 = itemPurchased6.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased11 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date12 = itemPurchased11.getDatePurchased();
        org.team4.model.course.Course course15 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date8, date12, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        java.lang.String str16 = course15.getCourseName();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder17 = courseTextBookBuilder0.course(course15);
        java.lang.String str18 = course15.getProfessorEmail();
        org.junit.Assert.assertNotNull(bookItemBuilder2);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Fri Mar 29 00:42:04 EDT 2024");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Fri Mar 29 00:42:04 EDT 2024");
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Fri Mar 29 00:42:04 EDT 2024");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}" + "'", str16, "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.junit.Assert.assertNotNull(courseTextBookBuilder17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str18, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("PayPal{email='hi!'}", (int) (byte) 10, (int) (short) 1);
        boolean boolean4 = debitCard3.isValid();
        boolean boolean5 = debitCard3.notExpired();
        boolean boolean6 = debitCard3.correctLength();
        boolean boolean7 = debitCard3.isValid();
        java.lang.String str8 = debitCard3.getMode();
        boolean boolean9 = debitCard3.notExpired();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder2 = dVDBuilder0.price((double) 'a');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDItemBuilder2.ISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDItemBuilder2.quantity(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDItemBuilder2.ISBN("User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, name=hi!, type=, validated=false]");
        org.junit.Assert.assertNotNull(dVDItemBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = visitor5.getName();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.items.Newsletter newsletter9 = itemToPurchase7.getNewsletter();
        org.team4.model.items.Item item10 = itemToPurchase7.getItem();
        java.lang.String str11 = itemToPurchase7.toString();
        java.lang.String str12 = itemToPurchase7.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ItemToPurchase{item=null, user=User [email=hi!, password=hi!, name=hi!, type=hi!, validated=false], newsletter=null}" + "'", str11, "ItemToPurchase{item=null, user=User [email=hi!, password=hi!, name=hi!, type=hi!, validated=false], newsletter=null}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ItemToPurchase{item=null, user=User [email=hi!, password=hi!, name=hi!, type=hi!, validated=false], newsletter=null}" + "'", str12, "ItemToPurchase{item=null, user=User [email=hi!, password=hi!, name=hi!, type=hi!, validated=false], newsletter=null}");
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("hi!");
        boolean boolean2 = payPal1.isValid();
        java.lang.String str3 = payPal1.getMode();
        java.lang.String str4 = payPal1.toString();
        boolean boolean5 = payPal1.isValid();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Mobile Wallet" + "'", str3, "Mobile Wallet");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PayPal{email='hi!'}" + "'", str4, "PayPal{email='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("PayPal{email='hi!'}", (int) (byte) 10, (int) (short) 1);
        boolean boolean4 = debitCard3.isValid();
        boolean boolean5 = debitCard3.isValid();
        boolean boolean6 = debitCard3.notExpired();
        org.team4.model.user.Visitor visitor12 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str13 = visitor12.getName();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase14 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor12);
        org.team4.model.items.Newsletter newsletter15 = itemToPurchase14.getNewsletter();
        double double16 = itemToPurchase14.getAmount();
        double double17 = itemToPurchase14.getAmount();
        org.team4.functionality.buy.ProcessPayment processPayment18 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) debitCard3, itemToPurchase14);
        org.team4.model.user.Visitor visitor24 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str25 = visitor24.getName();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase26 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor24);
        org.team4.model.items.Newsletter newsletter27 = itemToPurchase26.getNewsletter();
        org.team4.model.items.Newsletter newsletter28 = itemToPurchase26.getNewsletter();
        org.team4.model.items.Item item29 = itemToPurchase26.getItem();
        org.team4.model.paymentmodes.PayPal payPal31 = new org.team4.model.paymentmodes.PayPal("hi!");
        org.team4.model.user.Visitor visitor37 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str38 = visitor37.getName();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase39 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor37);
        org.team4.functionality.buy.ProcessPayment processPayment40 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) payPal31, itemToPurchase39);
        java.lang.String str41 = payPal31.getMode();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete42 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase26, (org.team4.model.paymentmodes.PaymentValidator) payPal31);
        double double43 = itemToPurchase26.getAmount();
        org.team4.model.paymentmodes.PayPal payPal45 = new org.team4.model.paymentmodes.PayPal("hi!");
        java.lang.String str46 = payPal45.toString();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete47 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase26, (org.team4.model.paymentmodes.PaymentValidator) payPal45);
        org.team4.functionality.buy.ProcessPayment processPayment48 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) debitCard3, itemToPurchase26);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(newsletter27);
        org.junit.Assert.assertNull(newsletter28);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Mobile Wallet" + "'", str41, "Mobile Wallet");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "PayPal{email='hi!'}" + "'", str46, "PayPal{email='hi!'}");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "");
        java.lang.String str3 = subscribeNewsletter2.toString();
        java.util.Date date4 = subscribeNewsletter2.getDateSubscribed();
        subscribeNewsletter2.setEmail("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:04 EDT 2024, dateDue=Mon Apr 29 00:42:04 EDT 2024}" + "'", str3, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:04 EDT 2024, dateDue=Mon Apr 29 00:42:04 EDT 2024}");
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Fri Mar 29 00:42:04 EDT 2024");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.team4.functionality.buy.ItemPurchased itemPurchased2 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date3 = itemPurchased2.getDatePurchased();
        java.util.Date date4 = itemPurchased2.getDatePurchased();
        java.util.Date date5 = itemPurchased2.getDatePurchased();
        java.lang.String str6 = itemPurchased2.toString();
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Fri Mar 29 00:42:04 EDT 2024");
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Fri Mar 29 00:42:04 EDT 2024");
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 29 00:42:04 EDT 2024");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:42:04 EDT 2024}" + "'", str6, "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:42:04 EDT 2024}");
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("", "Mobile Wallet", "PayPal", "PayPal");
        java.lang.String str5 = visitor4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [email=, password=Mobile Wallet, name=PayPal, type=PayPal, validated=false]" + "'", str5, "User [email=, password=Mobile Wallet, name=PayPal, type=PayPal, validated=false]");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = visitor5.getName();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.items.Newsletter newsletter9 = itemToPurchase7.getNewsletter();
        org.team4.model.items.Item item10 = itemToPurchase7.getItem();
        org.team4.model.paymentmodes.PayPal payPal12 = new org.team4.model.paymentmodes.PayPal("hi!");
        org.team4.model.user.Visitor visitor18 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str19 = visitor18.getName();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase20 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor18);
        org.team4.functionality.buy.ProcessPayment processPayment21 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) payPal12, itemToPurchase20);
        java.lang.String str22 = payPal12.getMode();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete23 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) payPal12);
        org.team4.model.items.Item item24 = purchaseComplete23.getItem();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Mobile Wallet" + "'", str22, "Mobile Wallet");
        org.junit.Assert.assertNull(item24);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("Debit Card", "", "PayPal{email='PayPal{email='hi!'}'}", "Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.items.RentedItem rentedItem4 = new org.team4.model.items.RentedItem("", "hi!", date2, date3);
        java.lang.String str5 = rentedItem4.getISBN();
        java.util.Date date6 = null;
        rentedItem4.setDueDate(date6);
        rentedItem4.setISBN("PayPal");
        org.team4.functionality.buy.ItemPurchased itemPurchased13 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date14 = itemPurchased13.getDatePurchased();
        java.util.Date date15 = itemPurchased13.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased18 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date19 = itemPurchased18.getDatePurchased();
        org.team4.model.course.Course course22 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date15, date19, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem4.setDueDate(date15);
        rentedItem4.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}");
        java.util.Date date26 = rentedItem4.getDueDate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Fri Mar 29 00:42:04 EDT 2024");
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Fri Mar 29 00:42:04 EDT 2024");
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Fri Mar 29 00:42:04 EDT 2024");
        org.junit.Assert.assertNotNull(date26);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Fri Mar 29 00:42:04 EDT 2024");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.team4.model.user.User user4 = new org.team4.model.user.User("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:59 EDT 2024}", "User [email=hi!, password=hi!, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:04 EDT 2024, dateDue=Mon Apr 29 00:42:04 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("Mobile Wallet", "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}");
        nonFaculty4.setUniversityID((long) 10);
        long long7 = nonFaculty4.getUniversityID();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        purchasableItemDecorator6.setPurchaseable(true);
        int int9 = purchasableItemDecorator6.getQuantity();
        org.team4.model.items.Item item10 = purchasableItemDecorator6.getItem();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator11 = new org.team4.model.items.decorator.PurchasableItemDecorator(item10);
        item10.setPurchaseable(true);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(item10);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.team4.model.paymentmodes.PaymentValidator paymentValidator0 = null;
        org.team4.model.items.Newsletter newsletter4 = new org.team4.model.items.Newsletter("PayPal{email='hi!'}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) '4');
        org.team4.model.user.Faculty faculty10 = new org.team4.model.user.Faculty("hi!", "hi!", "hi!", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", false);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase11 = new org.team4.functionality.buy.ItemToPurchase(newsletter4, (org.team4.model.user.User) faculty10);
        org.team4.model.user.Faculty faculty21 = new org.team4.model.user.Faculty("", "", "hi!", "hi!", true);
        java.util.ArrayList<java.lang.String> strList22 = faculty21.getCourses();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        faculty21.setCourses(strList25);
        org.team4.model.user.Student student28 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "", strList25);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase29 = new org.team4.functionality.buy.ItemToPurchase(newsletter4, (org.team4.model.user.User) student28);
        org.team4.functionality.buy.ProcessPayment processPayment30 = new org.team4.functionality.buy.ProcessPayment(paymentValidator0, itemToPurchase29);
        org.team4.model.user.User user31 = itemToPurchase29.getUser();
        org.junit.Assert.assertNull(strList22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(user31);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("PayPal{email='hi!'}", 0, (int) (short) 1);
        boolean boolean4 = debitCard3.isValid();
        java.lang.String str5 = debitCard3.getMode();
        boolean boolean6 = debitCard3.correctLength();
        boolean boolean7 = debitCard3.notExpired();
        boolean boolean8 = debitCard3.isValid();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:02 EDT 2024, dateDue=Mon Apr 29 00:42:02 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:56 EDT 2024, dateDue=Mon Apr 29 00:41:56 EDT 2024}", "ItemToPurchase{item=null, user=User [email=hi!, password=hi!, name=hi!, type=hi!, validated=false], newsletter=null}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:58 EDT 2024}");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:56 EDT 2024, dateDue=Mon Apr 29 00:41:56 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:04 EDT 2024, dateDue=Mon Apr 29 00:42:04 EDT 2024}");
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("PayPal{email='hi!'}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) '4');
        org.team4.model.user.Faculty faculty9 = new org.team4.model.user.Faculty("hi!", "hi!", "hi!", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", false);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase10 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) faculty9);
        java.util.Date date12 = null;
        java.util.Date date13 = null;
        org.team4.model.course.Course course16 = new org.team4.model.course.Course("", date12, date13, "", "hi!");
        org.team4.model.user.Student student22 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "Mobile Wallet", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "", false);
        course16.enrollStudent(student22);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase24 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) student22);
        org.team4.model.paymentmodes.PayPal payPal26 = new org.team4.model.paymentmodes.PayPal("ProcessPayment{modes=PayPal{email='hi!'}, itemToPurchase=ItemToPurchase{item=null, user=User [email=hi!, password=hi!, name=hi!, type=hi!, validated=false], newsletter=null}}");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete27 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase24, (org.team4.model.paymentmodes.PaymentValidator) payPal26);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        java.util.Date date8 = null;
        java.util.Date date9 = null;
        org.team4.model.course.Course course12 = new org.team4.model.course.Course("", date8, date9, "", "hi!");
        org.team4.model.course.CourseTextBook courseTextBook14 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", 10, "hi!", "", (int) (byte) -1, course12, false);
        java.lang.String str15 = courseTextBook1.getTitle();
        org.team4.model.course.Course course16 = courseTextBook1.getCourse();
        boolean boolean17 = courseTextBook1.hasHardCopy();
        org.team4.model.course.Course course18 = courseTextBook1.getCourse();
        boolean boolean19 = courseTextBook1.isRentable();
        boolean boolean20 = courseTextBook1.hasHardCopy();
        java.lang.String str21 = courseTextBook1.getAuthor();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(course16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(course18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        java.util.Date date3 = null;
        java.util.Date date4 = null;
        org.team4.model.items.RentedItem rentedItem5 = new org.team4.model.items.RentedItem("", "hi!", date3, date4);
        rentedItem5.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem5.setTitle("hi!");
        java.util.Date date10 = rentedItem5.getRentDate();
        rentedItem5.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.functionality.buy.ItemPurchased itemPurchased16 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date17 = itemPurchased16.getDatePurchased();
        java.util.Date date18 = itemPurchased16.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased21 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date22 = itemPurchased21.getDatePurchased();
        org.team4.model.course.Course course25 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date18, date22, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem5.setDueDate(date22);
        java.util.Date date29 = null;
        java.util.Date date30 = null;
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter31 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!", date29, date30);
        subscribeNewsletter31.setTitle("PayPal");
        java.util.Date date36 = null;
        java.util.Date date37 = null;
        org.team4.model.items.RentedItem rentedItem38 = new org.team4.model.items.RentedItem("", "hi!", date36, date37);
        rentedItem38.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem38.setTitle("hi!");
        java.util.Date date43 = rentedItem38.getRentDate();
        rentedItem38.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.functionality.buy.ItemPurchased itemPurchased49 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date50 = itemPurchased49.getDatePurchased();
        java.util.Date date51 = itemPurchased49.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased54 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date55 = itemPurchased54.getDatePurchased();
        org.team4.model.course.Course course58 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date51, date55, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem38.setDueDate(date55);
        subscribeNewsletter31.setDateDue(date55);
        org.team4.model.course.Course course63 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date22, date55, "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "hi!");
        java.lang.String str64 = course63.getProfessorEmail();
        org.team4.model.user.Student student70 = new org.team4.model.user.Student("Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "SubscribeNewsletter{title='hi!', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}', dateSubscribed=null, dateDue=null}", false);
        course63.enrollStudent(student70);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Fri Mar 29 00:42:04 EDT 2024");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Fri Mar 29 00:42:04 EDT 2024");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Fri Mar 29 00:42:04 EDT 2024");
        org.junit.Assert.assertNull(date43);
        org.junit.Assert.assertNotNull(date50);
// flaky:         org.junit.Assert.assertEquals(date50.toString(), "Fri Mar 29 00:42:04 EDT 2024");
        org.junit.Assert.assertNotNull(date51);
// flaky:         org.junit.Assert.assertEquals(date51.toString(), "Fri Mar 29 00:42:04 EDT 2024");
        org.junit.Assert.assertNotNull(date55);
// flaky:         org.junit.Assert.assertEquals(date55.toString(), "Fri Mar 29 00:42:04 EDT 2024");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("hi!", "", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase((double) (-1L), (org.team4.model.user.User) student5);
        org.team4.model.paymentmodes.MobileWallet mobileWallet8 = new org.team4.model.paymentmodes.MobileWallet("");
        java.lang.String str9 = mobileWallet8.getMode();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete10 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PayPal" + "'", str9, "PayPal");
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("PayPal{email='hi!'}", (int) (byte) 10, (int) (short) 1);
        boolean boolean4 = debitCard3.isValid();
        boolean boolean5 = debitCard3.isValid();
        boolean boolean6 = debitCard3.notExpired();
        org.team4.model.user.Visitor visitor12 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str13 = visitor12.getName();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase14 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor12);
        org.team4.model.items.Newsletter newsletter15 = itemToPurchase14.getNewsletter();
        double double16 = itemToPurchase14.getAmount();
        double double17 = itemToPurchase14.getAmount();
        org.team4.functionality.buy.ProcessPayment processPayment18 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) debitCard3, itemToPurchase14);
        boolean boolean19 = debitCard3.isValid();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.booktype("Mobile Wallet");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder4.author("PayPal");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder10 = bookRequestBuilder8.email("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
        org.junit.Assert.assertNotNull(bookRequestBuilder10);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        boolean boolean3 = courseTextBook1.equals((java.lang.Object) (byte) 1);
        java.lang.String str4 = courseTextBook1.getTitle();
        org.team4.model.course.Course course5 = courseTextBook1.getCourse();
        boolean boolean7 = courseTextBook1.equals((java.lang.Object) 100);
        java.util.List<org.team4.model.user.Student> studentList8 = courseTextBook1.getStudentsWithCopies();
        courseTextBook1.setRentable(false);
        org.team4.model.items.Book book18 = new org.team4.model.items.Book((org.team4.model.items.Item) courseTextBook1, "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", (int) (short) 100, "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "PayPal{email='hi!'}", (-1), true, true);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator19 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        int int20 = courseTextBook1.getEdition();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(course5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(studentList8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "hi!");
        java.lang.String str3 = subscribeNewsletter2.getTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("PayPal{email='hi!'}", 0, (int) (short) 1);
        boolean boolean4 = debitCard3.isValid();
        org.team4.model.user.Visitor visitor11 = new org.team4.model.user.Visitor("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "hi!", false);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase12 = new org.team4.functionality.buy.ItemToPurchase((double) 8678132L, (org.team4.model.user.User) visitor11);
        org.team4.functionality.buy.ProcessPayment processPayment13 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) debitCard3, itemToPurchase12);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        org.team4.model.user.Faculty faculty9 = new org.team4.model.user.Faculty("hi!", "hi!", "", "", (long) 1, strList7);
        java.util.ArrayList<java.lang.String> strList10 = faculty9.getCourses();
        java.util.ArrayList<java.lang.String> strList11 = faculty9.getCourses();
        faculty9.setEmail("");
        boolean boolean14 = faculty9.isValidated();
        faculty9.setPassword("PayPal{email='hi!'}");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.Course course1 = null;
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder2 = courseTextBookBuilder0.course(course1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.quantity((int) (byte) -1);
        org.junit.Assert.assertNotNull(courseTextBookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:58 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]", "ItemPurchased{title='', email='ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}', datePurchased=Fri Mar 29 00:42:01 EDT 2024}", 8678132L);
        java.lang.String str6 = manager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str6, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.junit.Assert.assertNotNull(dVDBuilder2);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder2 = dVDBuilder0.price((double) 'a');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.yearPublished((int) '4');
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder0.genre("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDBuilder0.price((double) (byte) -1);
        org.junit.Assert.assertNotNull(dVDItemBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        java.util.Date date8 = null;
        java.util.Date date9 = null;
        org.team4.model.course.Course course12 = new org.team4.model.course.Course("", date8, date9, "", "hi!");
        org.team4.model.course.CourseTextBook courseTextBook14 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", 10, "hi!", "", (int) (byte) -1, course12, false);
        java.lang.String str15 = courseTextBook1.getTitle();
        org.team4.model.course.Course course16 = courseTextBook1.getCourse();
        boolean boolean17 = courseTextBook1.hasHardCopy();
        org.team4.model.course.Course course18 = courseTextBook1.getCourse();
        org.team4.model.user.Student student32 = new org.team4.model.user.Student("hi!", "", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase33 = new org.team4.functionality.buy.ItemToPurchase((double) (-1L), (org.team4.model.user.User) student32);
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.team4.model.user.Faculty faculty43 = new org.team4.model.user.Faculty("hi!", "hi!", "", "", (long) 1, strList41);
        java.util.ArrayList<java.lang.String> strList44 = faculty43.getCourses();
        java.util.ArrayList<java.lang.String> strList45 = faculty43.getCourses();
        student32.setCourses(strList45);
        org.team4.model.user.Student student47 = new org.team4.model.user.Student("ProcessPayment{modes=null, itemToPurchase=null}", "PayPal", "hi!", "hi!", strList45);
        org.team4.model.user.Student student48 = new org.team4.model.user.Student("ProcessPayment{modes=PayPal{email='hi!'}, itemToPurchase=ItemToPurchase{item=null, user=User [email=hi!, password=hi!, name=hi!, type=hi!, validated=false], newsletter=null}}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:56 EDT 2024, dateDue=Mon Apr 29 00:41:56 EDT 2024}", "Course [course name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:42:00 EDT 2024, end date=Fri Mar 29 00:42:00 EDT 2024, ISBN=, email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}]", strList45);
        // The following exception was thrown during execution in test generation
        try {
            courseTextBook1.removeCopies(student48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.team4.model.course.Course.isEnded(java.util.Date)\" because \"this.course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(course16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(course18);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(strList45);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        org.team4.model.user.Faculty faculty18 = new org.team4.model.user.Faculty("hi!", "hi!", "", "", (long) 1, strList16);
        java.util.ArrayList<java.lang.String> strList19 = faculty18.getCourses();
        java.util.ArrayList<java.lang.String> strList20 = faculty18.getCourses();
        org.team4.model.user.Faculty faculty21 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "PayPal", "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (long) ' ', strList20);
        org.team4.model.user.Student student22 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:03 EDT 2024, dateDue=Mon Apr 29 00:42:03 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:03 EDT 2024, dateDue=Mon Apr 29 00:42:03 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:01 EDT 2024, dateDue=Mon Apr 29 00:42:01 EDT 2024}", strList20);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        boolean boolean3 = courseTextBook1.equals((java.lang.Object) (byte) 1);
        java.lang.String str4 = courseTextBook1.getTitle();
        java.lang.String str5 = courseTextBook1.getTitle();
        int int6 = courseTextBook1.getEdition();
        courseTextBook1.setQuantity((int) (byte) 10);
        courseTextBook1.setQuantity((int) (short) -1);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) (short) -1);
        java.lang.String str4 = newsletter3.getTitle();
        java.lang.String str5 = newsletter3.getLink();
        double double6 = newsletter3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}" + "'", str4, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str5, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        nonFaculty4.setValidated(true);
        nonFaculty4.setValidated(true);
        java.lang.String str9 = nonFaculty4.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, password=, name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}, type=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, validated=true]" + "'", str9, "User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, password=, name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}, type=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, validated=true]");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.hasHardCopy(true);
        java.util.Date date4 = null;
        java.util.Date date5 = null;
        org.team4.model.course.Course course8 = new org.team4.model.course.Course("", date4, date5, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder9 = courseTextBookBuilder0.course(course8);
        java.util.Date date11 = null;
        java.util.Date date12 = null;
        org.team4.model.course.Course course15 = new org.team4.model.course.Course("", date11, date12, "", "hi!");
        java.util.Date date16 = course15.getStartDate();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder17 = courseTextBookBuilder9.course(course15);
        org.team4.model.items.builder.BookBuilder bookBuilder19 = courseTextBookBuilder9.edition((-1));
        org.team4.model.course.CourseTextBook courseTextBook20 = courseTextBookBuilder9.build();
        org.team4.model.course.CourseTextBook courseTextBook21 = courseTextBookBuilder9.build();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(courseTextBookBuilder9);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNotNull(courseTextBookBuilder17);
        org.junit.Assert.assertNotNull(bookBuilder19);
        org.junit.Assert.assertNotNull(courseTextBook20);
        org.junit.Assert.assertNotNull(courseTextBook21);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=Mobile Wallet, name=PayPal, type=PayPal, validated=false]");
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("User [email=Mobile Wallet, password=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, name=, type=User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, name=hi!, type=, validated=false], validated=false]");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        boolean boolean2 = courseTextBook1.isPurchasable();
        courseTextBook1.setPrice((double) (-1.0f));
        java.lang.String str5 = courseTextBook1.getISBN();
        boolean boolean6 = courseTextBook1.hasSoftCopy();
        org.team4.model.items.Magazine magazine9 = new org.team4.model.items.Magazine((org.team4.model.items.Item) courseTextBook1, "ItemPurchased{title='', email='hi!', datePurchased=null}", 1);
        org.team4.model.items.Item item10 = new org.team4.model.items.Item((org.team4.model.items.Item) magazine9);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "");
        java.lang.String str3 = subscribeNewsletter2.toString();
        java.util.Date date4 = null;
        subscribeNewsletter2.setDateDue(date4);
        subscribeNewsletter2.setTitle("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:01 EDT 2024, dateDue=Mon Apr 29 00:42:01 EDT 2024}");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:04 EDT 2024, dateDue=Mon Apr 29 00:42:04 EDT 2024}" + "'", str3, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:04 EDT 2024, dateDue=Mon Apr 29 00:42:04 EDT 2024}");
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.email("PayPal{email='hi!'}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder4.booktype("Mobile Wallet");
        org.team4.model.items.BookRequest bookRequest9 = bookRequestBuilder8.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder11 = bookRequestBuilder8.edition(0);
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
        org.junit.Assert.assertNotNull(bookRequest9);
        org.junit.Assert.assertNotNull(bookRequestBuilder11);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("hi!");
        org.team4.model.user.Visitor visitor7 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str8 = visitor7.getName();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase9 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor7);
        org.team4.functionality.buy.ProcessPayment processPayment10 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) payPal1, itemToPurchase9);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = processPayment10.getPurchaseCompleted();
        java.lang.String str12 = processPayment10.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(purchaseComplete11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ProcessPayment{modes=PayPal{email='hi!'}, itemToPurchase=ItemToPurchase{item=null, user=User [email=hi!, password=hi!, name=hi!, type=hi!, validated=false], newsletter=null}}" + "'", str12, "ProcessPayment{modes=PayPal{email='hi!'}, itemToPurchase=ItemToPurchase{item=null, user=User [email=hi!, password=hi!, name=hi!, type=hi!, validated=false], newsletter=null}}");
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator9 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        boolean boolean10 = courseTextBook1.isRentable();
        courseTextBook1.setQuantity(0);
        java.lang.String str13 = courseTextBook1.getTitle();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "", "hi!", "", true);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder0.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:56 EDT 2024, dateDue=Mon Apr 29 00:41:56 EDT 2024}");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.Course course1 = null;
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder2 = courseTextBookBuilder0.course(course1);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder4 = courseTextBookBuilder2.isVirtual(false);
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder2.hasHardCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder2.edition(0);
        org.team4.model.items.builder.BookBuilder bookBuilder10 = bookBuilder8.author("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.junit.Assert.assertNotNull(courseTextBookBuilder2);
        org.junit.Assert.assertNotNull(courseTextBookBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        org.team4.model.user.Faculty faculty9 = new org.team4.model.user.Faculty("hi!", "hi!", "", "", (long) 1, strList7);
        java.util.ArrayList<java.lang.String> strList10 = faculty9.getCourses();
        faculty9.setFacultyID((long) 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.booktype("Mobile Wallet");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder4.author("PayPal");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder10 = bookRequestBuilder8.edition((int) (short) 100);
        org.team4.model.items.BookRequest bookRequest11 = bookRequestBuilder10.build();
        java.lang.String str12 = bookRequest11.getAuthor();
        java.lang.String str13 = bookRequest11.getTitle();
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
        org.junit.Assert.assertNotNull(bookRequestBuilder10);
        org.junit.Assert.assertNotNull(bookRequest11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PayPal" + "'", str12, "PayPal");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str13, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "");
        subscribeNewsletter2.setTitle("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        java.lang.String str5 = subscribeNewsletter2.getEmail();
        java.lang.String str6 = subscribeNewsletter2.getTitle();
        java.util.Date date7 = subscribeNewsletter2.getDateSubscribed();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}" + "'", str6, "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Fri Mar 29 00:42:04 EDT 2024");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator9 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        boolean boolean10 = courseTextBook1.hasSoftCopy();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator11 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        boolean boolean12 = rentableItemDecorator11.isRentable();
        rentableItemDecorator11.setQuantity(1);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.booktype("Mobile Wallet");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder4.author("PayPal");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder10 = bookRequestBuilder8.edition((int) (short) 100);
        org.team4.model.items.BookRequest bookRequest11 = bookRequestBuilder10.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder13 = bookRequestBuilder10.booktype("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:01 EDT 2024, dateDue=Mon Apr 29 00:42:01 EDT 2024}");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
        org.junit.Assert.assertNotNull(bookRequestBuilder10);
        org.junit.Assert.assertNotNull(bookRequest11);
        org.junit.Assert.assertNotNull(bookRequestBuilder13);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder2 = dVDBuilder0.price((double) (-1.0f));
        org.team4.model.items.builder.DVDBuilder dVDBuilder4 = dVDBuilder0.genre("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder4.genre("User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, name=hi!, type=, validated=false]");
        org.junit.Assert.assertNotNull(dVDItemBuilder2);
        org.junit.Assert.assertNotNull(dVDBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter4 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!", date2, date3);
        subscribeNewsletter4.setTitle("PayPal");
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        org.team4.model.items.RentedItem rentedItem11 = new org.team4.model.items.RentedItem("", "hi!", date9, date10);
        rentedItem11.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem11.setTitle("hi!");
        java.util.Date date16 = rentedItem11.getRentDate();
        rentedItem11.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.functionality.buy.ItemPurchased itemPurchased22 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date23 = itemPurchased22.getDatePurchased();
        java.util.Date date24 = itemPurchased22.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased27 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date28 = itemPurchased27.getDatePurchased();
        org.team4.model.course.Course course31 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date24, date28, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem11.setDueDate(date28);
        subscribeNewsletter4.setDateDue(date28);
        java.util.Date date34 = subscribeNewsletter4.getDateDue();
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Fri Mar 29 00:42:04 EDT 2024");
        org.junit.Assert.assertNotNull(date24);
// flaky:         org.junit.Assert.assertEquals(date24.toString(), "Fri Mar 29 00:42:04 EDT 2024");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Fri Mar 29 00:42:04 EDT 2024");
        org.junit.Assert.assertNotNull(date34);
// flaky:         org.junit.Assert.assertEquals(date34.toString(), "Fri Mar 29 00:42:04 EDT 2024");
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("PayPal{email='hi!'}", 0, (int) (short) 1);
        org.team4.model.paymentmodes.MobileWallet mobileWallet5 = new org.team4.model.paymentmodes.MobileWallet("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.user.Visitor visitor11 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str12 = visitor11.getName();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase13 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor11);
        org.team4.model.items.Newsletter newsletter14 = itemToPurchase13.getNewsletter();
        org.team4.model.items.Newsletter newsletter15 = itemToPurchase13.getNewsletter();
        org.team4.functionality.buy.ProcessPayment processPayment16 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet5, itemToPurchase13);
        org.team4.functionality.buy.ProcessPayment processPayment17 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) debitCard3, itemToPurchase13);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete18 = processPayment17.getPurchaseCompleted();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(newsletter14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(purchaseComplete18);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        org.team4.model.course.Course course9 = new org.team4.model.course.Course("", date5, date6, "", "hi!");
        java.util.Date date10 = course9.getStartDate();
        java.lang.String str11 = course9.getProfessorEmail();
        org.team4.model.user.Student student17 = new org.team4.model.user.Student("hi!", "hi!", "", "", true);
        course9.enrollStudent(student17);
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        org.team4.model.user.Faculty faculty33 = new org.team4.model.user.Faculty("hi!", "hi!", "", "", (long) 1, strList31);
        org.team4.model.user.Faculty faculty34 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "Mobile Wallet", "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (long) (byte) 100, strList31);
        student17.setCourses(strList31);
        org.team4.model.user.Student student36 = new org.team4.model.user.Student("Debit Card", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", strList31);
        java.util.ArrayList<java.lang.String> strList37 = null;
        student36.setCourses(strList37);
        student36.setName("User [email=hi!, password=hi!, name=hi!, type=, validated=false]");
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = visitor5.getName();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        double double9 = itemToPurchase7.getAmount();
        org.team4.model.user.User user10 = itemToPurchase7.getUser();
        java.lang.String str11 = user10.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]", (int) (byte) 1, 10);
        boolean boolean4 = creditCard3.correctLength();
        java.lang.String str5 = creditCard3.getMode();
        boolean boolean6 = creditCard3.notExpired();
        boolean boolean7 = creditCard3.correctLength();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("PayPal{email='hi!'}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) '4');
        org.team4.model.user.Faculty faculty8 = new org.team4.model.user.Faculty("hi!", "hi!", "hi!", "hi!");
        faculty8.setFacultyID((long) 0);
        java.lang.String[] strArray15 = new java.lang.String[] { "ProcessPayment{modes=null, itemToPurchase=null}", "ProcessPayment{modes=null, itemToPurchase=null}", "hi!", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        faculty8.setCourses(strList16);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase19 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) faculty8);
        faculty8.setFacultyID(3090830L);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.team4.model.user.Faculty faculty6 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "PayPal{email='hi!'}", "PayPal{email='hi!'}", "PayPal{email='hi!'}", true);
        long long7 = faculty6.getFacultyID();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase8 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 1, (org.team4.model.user.User) faculty6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.team4.model.items.Item item0 = null;
        org.team4.model.user.Visitor visitor6 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str7 = visitor6.getName();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase8 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor6);
        visitor6.setType("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.functionality.buy.ItemToPurchase itemToPurchase11 = new org.team4.functionality.buy.ItemToPurchase(item0, (org.team4.model.user.User) visitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.team4.model.items.Item.getPrice()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.Item item9 = new org.team4.model.items.Item((org.team4.model.items.Item) courseTextBook1);
        java.lang.String str10 = courseTextBook1.getISBN();
        org.team4.model.items.Book book18 = new org.team4.model.items.Book((org.team4.model.items.Item) courseTextBook1, "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:58 EDT 2024}", (int) (byte) -1, "ItemPurchased{title='', email='hi!', datePurchased=null}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", (int) (short) 0, false, false);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.email("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.title("PayPal");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.author("Debit Card");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder6.title("PayPal");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder10 = bookRequestBuilder6.email("PayPal");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder12 = bookRequestBuilder10.author("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder14 = bookRequestBuilder10.author("Book{genre='null', noOfPages=0, author='null', ISBN=null, publisher='null', edition='0'}");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
        org.junit.Assert.assertNotNull(bookRequestBuilder10);
        org.junit.Assert.assertNotNull(bookRequestBuilder12);
        org.junit.Assert.assertNotNull(bookRequestBuilder14);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.team4.model.user.Student student14 = new org.team4.model.user.Student("hi!", "", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase15 = new org.team4.functionality.buy.ItemToPurchase((double) (-1L), (org.team4.model.user.User) student14);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        org.team4.model.user.Faculty faculty25 = new org.team4.model.user.Faculty("hi!", "hi!", "", "", (long) 1, strList23);
        java.util.ArrayList<java.lang.String> strList26 = faculty25.getCourses();
        java.util.ArrayList<java.lang.String> strList27 = faculty25.getCourses();
        student14.setCourses(strList27);
        org.team4.model.user.Student student29 = new org.team4.model.user.Student("ProcessPayment{modes=null, itemToPurchase=null}", "PayPal", "hi!", "hi!", strList27);
        org.team4.model.user.Faculty faculty30 = new org.team4.model.user.Faculty("User [email=Mobile Wallet, password=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, name=, type=User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, name=hi!, type=, validated=false], validated=false]", "PayPal{email='hi!'}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}", (long) 1, strList27);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList27);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("hi!", 100, 100, (double) 10L, "PayPal", false, true);
        int int8 = item7.getYearPublished();
        org.team4.model.items.DVD dVD11 = new org.team4.model.items.DVD(item7, "", (double) 10);
        org.team4.model.items.Item item12 = new org.team4.model.items.Item(item7);
        int int13 = item7.getQuantity();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder2 = courseTextBookBuilder0.price(1.0d);
        org.team4.functionality.buy.ItemPurchased itemPurchased6 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date7 = itemPurchased6.getDatePurchased();
        java.util.Date date8 = itemPurchased6.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased11 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date12 = itemPurchased11.getDatePurchased();
        org.team4.model.course.Course course15 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date8, date12, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        java.lang.String str16 = course15.getCourseName();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder17 = courseTextBookBuilder0.course(course15);
        java.lang.String str18 = course15.toString();
        org.junit.Assert.assertNotNull(bookItemBuilder2);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Fri Mar 29 00:42:04 EDT 2024");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Fri Mar 29 00:42:04 EDT 2024");
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Fri Mar 29 00:42:04 EDT 2024");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}" + "'", str16, "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.junit.Assert.assertNotNull(courseTextBookBuilder17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Course [course name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:42:04 EDT 2024, end date=Fri Mar 29 00:42:04 EDT 2024, ISBN=, email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}]" + "'", str18, "Course [course name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:42:04 EDT 2024, end date=Fri Mar 29 00:42:04 EDT 2024, ISBN=, email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}]");
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.Magazine magazine1 = magazineBuilder0.build();
        java.lang.String str2 = magazine1.getPublisher();
        magazine1.setRentable(false);
        org.team4.model.items.Item item5 = new org.team4.model.items.Item((org.team4.model.items.Item) magazine1);
        boolean boolean6 = magazine1.isRentable();
        org.junit.Assert.assertNotNull(magazine1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.team4.functionality.buy.ItemPurchased itemPurchased2 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date3 = itemPurchased2.getDatePurchased();
        java.util.Date date4 = itemPurchased2.getDatePurchased();
        java.util.Date date5 = itemPurchased2.getDatePurchased();
        java.lang.Class<?> wildcardClass6 = date5.getClass();
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Fri Mar 29 00:42:04 EDT 2024");
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Fri Mar 29 00:42:04 EDT 2024");
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 29 00:42:04 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("User [email=hi!, password=hi!, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:42:04 EDT 2024, dateDue=Mon Apr 29 00:42:04 EDT 2024}", "Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]", "ItemPurchased{title='', email='hi!', datePurchased=null}", 4531993L);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.team4.functionality.buy.ItemPurchased itemPurchased2 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date3 = itemPurchased2.getDatePurchased();
        java.lang.String str4 = itemPurchased2.getEmail();
        java.util.Date date5 = itemPurchased2.getDatePurchased();
        java.lang.String str6 = itemPurchased2.toString();
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Fri Mar 29 00:42:04 EDT 2024");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 29 00:42:04 EDT 2024");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:42:04 EDT 2024}" + "'", str6, "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:42:04 EDT 2024}");
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator9 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) purchasableItemDecorator9);
        boolean boolean11 = purchasableItemDecorator9.isPurchasable();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        java.util.Date date8 = null;
        java.util.Date date9 = null;
        org.team4.model.course.Course course12 = new org.team4.model.course.Course("", date8, date9, "", "hi!");
        org.team4.model.course.CourseTextBook courseTextBook14 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", 10, "hi!", "", (int) (byte) -1, course12, false);
        java.lang.String str15 = courseTextBook1.getTitle();
        org.team4.model.items.builder.DVDBuilder dVDBuilder16 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder18 = dVDBuilder16.price((double) 'a');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder20 = dVDItemBuilder18.ISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        boolean boolean21 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder20);
        org.team4.model.user.Manager manager27 = new org.team4.model.user.Manager("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:58 EDT 2024}", (long) (-1));
        org.team4.functionality.buy.ItemToPurchase itemToPurchase28 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) courseTextBook1, (org.team4.model.user.User) manager27);
        int int29 = courseTextBook1.getEdition();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(dVDItemBuilder18);
        org.junit.Assert.assertNotNull(dVDItemBuilder20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("", date1, date2, "hi!", "hi!");
        java.lang.String str6 = course5.getCourseTextBookISBN();
        java.lang.String str7 = course5.getProfessorEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder3 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder5 = courseTextBookBuilder0.isVirtual(false);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder6.hasHardCopy(true);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        org.team4.model.course.Course course14 = new org.team4.model.course.Course("", date10, date11, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder15 = courseTextBookBuilder6.course(course14);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder16 = courseTextBookBuilder5.course(course14);
        org.team4.model.items.builder.BookBuilder bookBuilder18 = courseTextBookBuilder16.hasHardCopy(false);
        org.team4.model.items.builder.BookBuilder bookBuilder20 = courseTextBookBuilder16.genre("PayPal");
        org.team4.functionality.buy.ItemPurchased itemPurchased24 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date25 = itemPurchased24.getDatePurchased();
        java.util.Date date26 = itemPurchased24.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased29 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date30 = itemPurchased29.getDatePurchased();
        org.team4.model.course.Course course33 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date26, date30, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder34 = courseTextBookBuilder16.course(course33);
        java.lang.String str35 = course33.getCourseName();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(bookBuilder3);
        org.junit.Assert.assertNotNull(courseTextBookBuilder5);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(courseTextBookBuilder15);
        org.junit.Assert.assertNotNull(courseTextBookBuilder16);
        org.junit.Assert.assertNotNull(bookBuilder18);
        org.junit.Assert.assertNotNull(bookBuilder20);
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Fri Mar 29 00:42:04 EDT 2024");
        org.junit.Assert.assertNotNull(date26);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Fri Mar 29 00:42:04 EDT 2024");
        org.junit.Assert.assertNotNull(date30);
// flaky:         org.junit.Assert.assertEquals(date30.toString(), "Fri Mar 29 00:42:04 EDT 2024");
        org.junit.Assert.assertNotNull(courseTextBookBuilder34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}" + "'", str35, "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.team4.model.user.Manager manager4 = new org.team4.model.user.Manager("User [email=, password=Mobile Wallet, name=PayPal, type=PayPal, validated=false]", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}", "", "SubscribeNewsletter{title='hi!', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}', dateSubscribed=null, dateDue=null}");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        java.lang.String str9 = courseTextBook1.getISBN();
        org.team4.model.items.decorator.ItemDecorator itemDecorator10 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook1);
        java.lang.String str11 = courseTextBook1.getGenre();
        int int12 = courseTextBook1.getEdition();
        boolean boolean13 = courseTextBook1.hasSoftCopy();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.team4.model.user.User user5 = new org.team4.model.user.User("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:59 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}", false);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("Mobile Wallet", "", "Mobile Wallet", "", 0, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        java.lang.String str7 = bookRequest6.getTitle();
        java.lang.String str8 = bookRequest6.getBookType();
        java.lang.String str9 = bookRequest6.getTitle();
        java.lang.String str10 = bookRequest6.getAuthor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str8, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Mobile Wallet" + "'", str10, "Mobile Wallet");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder5 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook6 = courseTextBookBuilder5.build();
        boolean boolean8 = courseTextBook6.equals((java.lang.Object) (byte) 1);
        java.lang.String str9 = courseTextBook6.getTitle();
        org.team4.model.course.Course course10 = courseTextBook6.getCourse();
        boolean boolean12 = courseTextBook6.equals((java.lang.Object) 100);
        org.team4.model.user.Student student18 = new org.team4.model.user.Student("Mobile Wallet", "", "hi!", "Mobile Wallet", true);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase19 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) courseTextBook6, (org.team4.model.user.User) student18);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        org.team4.model.user.Faculty faculty34 = new org.team4.model.user.Faculty("hi!", "hi!", "", "", (long) 1, strList32);
        java.util.ArrayList<java.lang.String> strList35 = faculty34.getCourses();
        java.util.ArrayList<java.lang.String> strList36 = faculty34.getCourses();
        org.team4.model.user.Faculty faculty37 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "PayPal", "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (long) ' ', strList36);
        student18.setCourses(strList36);
        org.team4.model.user.Faculty faculty39 = new org.team4.model.user.Faculty("PayPal", "Mobile Wallet", "hi!", "PayPal", 8678132L, strList36);
        long long40 = faculty39.getFacultyID();
        org.junit.Assert.assertNotNull(courseTextBook6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(course10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 8678132L + "'", long40 == 8678132L);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        java.util.Date date8 = null;
        java.util.Date date9 = null;
        org.team4.model.course.Course course12 = new org.team4.model.course.Course("", date8, date9, "", "hi!");
        org.team4.model.course.CourseTextBook courseTextBook14 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", 10, "hi!", "", (int) (byte) -1, course12, false);
        java.lang.String str15 = courseTextBook1.getTitle();
        org.team4.model.course.Course course16 = courseTextBook1.getCourse();
        org.team4.model.user.Student student22 = new org.team4.model.user.Student("User [email=hi!, password=hi!, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}', dateSubscribed=Fri Mar 29 00:42:00 EDT 2024, dateDue=Mon Apr 29 00:42:00 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}", "", true);
        // The following exception was thrown during execution in test generation
        try {
            courseTextBook1.removeCopies(student22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.team4.model.course.Course.isEnded(java.util.Date)\" because \"this.course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(course16);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.team4.model.items.Newsletter newsletter4 = new org.team4.model.items.Newsletter("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) (short) -1);
        org.team4.model.user.NonFaculty nonFaculty10 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "PayPal{email='hi!'}", "Mobile Wallet", "PayPal{email='hi!'}", (long) (byte) 1);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase11 = new org.team4.functionality.buy.ItemToPurchase(newsletter4, (org.team4.model.user.User) nonFaculty10);
        java.lang.String str12 = nonFaculty10.getType();
        long long13 = nonFaculty10.getUniversityID();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase14 = new org.team4.functionality.buy.ItemToPurchase((double) (byte) 0, (org.team4.model.user.User) nonFaculty10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PayPal{email='hi!'}" + "'", str12, "PayPal{email='hi!'}");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "");
        subscribeNewsletter2.setEmail("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        java.lang.String str5 = subscribeNewsletter2.toString();
        java.util.Date date6 = subscribeNewsletter2.getDateSubscribed();
        java.util.Date date7 = subscribeNewsletter2.getDateSubscribed();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SubscribeNewsletter{title='', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}', dateSubscribed=Fri Mar 29 00:42:04 EDT 2024, dateDue=Mon Apr 29 00:42:04 EDT 2024}" + "'", str5, "SubscribeNewsletter{title='', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}', dateSubscribed=Fri Mar 29 00:42:04 EDT 2024, dateDue=Mon Apr 29 00:42:04 EDT 2024}");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Fri Mar 29 00:42:04 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Fri Mar 29 00:42:04 EDT 2024");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}", "Book{genre='null', noOfPages=0, author='null', ISBN=null, publisher='null', edition='0'}", "", "ItemToPurchase{item=null, user=User [email=hi!, password=, name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, type=ProcessPayment{modes=null, itemToPurchase=null}, validated=false], newsletter=null}", (long) 0);
        long long6 = manager5.getManagerID();
        boolean boolean7 = manager5.isValidated();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        java.util.Date date8 = null;
        java.util.Date date9 = null;
        org.team4.model.course.Course course12 = new org.team4.model.course.Course("", date8, date9, "", "hi!");
        org.team4.model.course.CourseTextBook courseTextBook14 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", 10, "hi!", "", (int) (byte) -1, course12, false);
        java.lang.String str15 = courseTextBook1.getTitle();
        org.team4.model.course.Course course16 = courseTextBook1.getCourse();
        boolean boolean17 = courseTextBook1.hasHardCopy();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator18 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        int int19 = courseTextBook1.getEdition();
        double double20 = courseTextBook1.getPrice();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator21 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(course16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:58 EDT 2024}", "");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.booktype("");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter4 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!", date2, date3);
        subscribeNewsletter4.setTitle("PayPal");
        java.util.Date date7 = subscribeNewsletter4.getDateSubscribed();
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.team4.model.items.builder.BookBuilder bookBuilder0 = new org.team4.model.items.builder.BookBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder2 = bookBuilder0.quantity((int) (byte) 0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = bookItemBuilder2.yearPublished((int) (byte) 10);
        org.junit.Assert.assertNotNull(bookItemBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator9 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        boolean boolean10 = courseTextBook1.isRentable();
        courseTextBook1.setQuantity(0);
        boolean boolean13 = courseTextBook1.hasSoftCopy();
        org.team4.model.items.Magazine magazine16 = new org.team4.model.items.Magazine((org.team4.model.items.Item) courseTextBook1, "PayPal", (int) (short) -1);
        org.team4.model.user.Visitor visitor21 = new org.team4.model.user.Visitor("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}", "SubscribeNewsletter{title='hi!', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}', dateSubscribed=null, dateDue=null}", "hi!", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase22 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) courseTextBook1, (org.team4.model.user.User) visitor21);
        org.team4.model.items.Item item23 = itemToPurchase22.getItem();
        java.lang.String str24 = item23.getISBN();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}", "PayPal", "PayPal{email='hi!'}");
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator9 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) purchasableItemDecorator9);
        org.team4.model.items.Item item11 = rentableItemDecorator10.getItem();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(item11);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        boolean boolean3 = courseTextBook1.equals((java.lang.Object) (byte) 1);
        java.lang.String str4 = courseTextBook1.getTitle();
        org.team4.model.course.Course course5 = courseTextBook1.getCourse();
        boolean boolean7 = courseTextBook1.equals((java.lang.Object) 100);
        org.team4.model.user.Student student13 = new org.team4.model.user.Student("Mobile Wallet", "", "hi!", "Mobile Wallet", true);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase14 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) courseTextBook1, (org.team4.model.user.User) student13);
        java.util.List<org.team4.model.user.Student> studentList15 = courseTextBook1.getStudentsWithCopies();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(course5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(studentList15);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder0.email("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder0.ISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}");
        org.team4.model.items.BookRequest bookRequest7 = bookRequestBuilder6.build();
        java.lang.String str8 = bookRequest7.getAuthor();
        int int9 = bookRequest7.getEdition();
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequest7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str8, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        boolean boolean3 = courseTextBook1.equals((java.lang.Object) (byte) 1);
        java.util.List<org.team4.model.user.Student> studentList4 = courseTextBook1.getStudentsWithCopies();
        org.team4.model.course.Course course5 = courseTextBook1.getCourse();
        java.lang.String str6 = courseTextBook1.getGenre();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(studentList4);
        org.junit.Assert.assertNull(course5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "hi!", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", (long) 1);
        nonFaculty5.setUniversityID((long) '4');
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.team4.model.user.Faculty faculty15 = new org.team4.model.user.Faculty("", "", "hi!", "hi!", true);
        java.util.ArrayList<java.lang.String> strList16 = faculty15.getCourses();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        faculty15.setCourses(strList19);
        org.team4.model.user.Faculty faculty22 = new org.team4.model.user.Faculty("ItemPurchased{title='', email='hi!', datePurchased=null}", "", "Mobile Wallet", "ItemToPurchase{item=null, user=User [email=hi!, password=, name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, type=ProcessPayment{modes=null, itemToPurchase=null}, validated=false], newsletter=null}", (-1L), strList19);
        org.team4.model.user.Faculty faculty23 = new org.team4.model.user.Faculty("User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:02 EDT 2024, dateDue=Mon Apr 29 00:42:02 EDT 2024}", "SubscribeNewsletter{title='', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}', dateSubscribed=Fri Mar 29 00:42:00 EDT 2024, dateDue=Mon Apr 29 00:42:00 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=null}", (long) '#', strList19);
        org.junit.Assert.assertNull(strList16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) (short) -1);
        double double4 = newsletter3.getPrice();
        org.team4.model.user.Manager manager9 = new org.team4.model.user.Manager("hi!", "hi!", "hi!", "");
        manager9.setType("");
        long long12 = manager9.getManagerID();
        manager9.setManagerID((long) (-1));
        org.team4.functionality.buy.ItemToPurchase itemToPurchase15 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) manager9);
        org.team4.model.user.Faculty faculty21 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "", false);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase22 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) faculty21);
        org.team4.model.user.NonFaculty nonFaculty27 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:56 EDT 2024, dateDue=Mon Apr 29 00:41:56 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
        nonFaculty27.setName("User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase30 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) nonFaculty27);
        org.team4.model.items.Newsletter newsletter31 = itemToPurchase30.getNewsletter();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(newsletter31);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.Magazine magazine1 = magazineBuilder0.build();
        java.lang.String str2 = magazine1.getPublisher();
        int int3 = magazine1.getIssueNumber();
        int int4 = magazine1.getIssueNumber();
        int int5 = magazine1.getIssueNumber();
        int int6 = magazine1.getYearPublished();
        org.junit.Assert.assertNotNull(magazine1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "");
        java.lang.String str3 = subscribeNewsletter2.toString();
        java.util.Date date4 = null;
        subscribeNewsletter2.setDateDue(date4);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter9 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "");
        java.lang.String str10 = subscribeNewsletter9.toString();
        java.util.Date date11 = null;
        subscribeNewsletter9.setDateDue(date11);
        java.util.Date date15 = null;
        java.util.Date date16 = null;
        org.team4.model.items.RentedItem rentedItem17 = new org.team4.model.items.RentedItem("", "hi!", date15, date16);
        rentedItem17.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem17.setTitle("hi!");
        java.util.Date date22 = rentedItem17.getRentDate();
        org.team4.functionality.buy.ItemPurchased itemPurchased26 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date27 = itemPurchased26.getDatePurchased();
        java.util.Date date28 = itemPurchased26.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased31 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date32 = itemPurchased31.getDatePurchased();
        org.team4.model.course.Course course35 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date28, date32, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem17.setRentDate(date28);
        subscribeNewsletter9.setDateSubscribed(date28);
        java.util.Date date40 = null;
        java.util.Date date41 = null;
        org.team4.model.items.RentedItem rentedItem42 = new org.team4.model.items.RentedItem("", "hi!", date40, date41);
        java.lang.String str43 = rentedItem42.getISBN();
        java.util.Date date44 = null;
        rentedItem42.setDueDate(date44);
        rentedItem42.setISBN("PayPal");
        org.team4.functionality.buy.ItemPurchased itemPurchased51 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date52 = itemPurchased51.getDatePurchased();
        java.util.Date date53 = itemPurchased51.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased56 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date57 = itemPurchased56.getDatePurchased();
        org.team4.model.course.Course course60 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date53, date57, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem42.setDueDate(date53);
        org.team4.model.course.Course course64 = new org.team4.model.course.Course("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", date28, date53, "Mobile Wallet", "hi!");
        subscribeNewsletter2.setDateSubscribed(date53);
        java.lang.String str66 = subscribeNewsletter2.getTitle();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:05 EDT 2024, dateDue=Mon Apr 29 00:42:05 EDT 2024}" + "'", str3, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:05 EDT 2024, dateDue=Mon Apr 29 00:42:05 EDT 2024}");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:05 EDT 2024, dateDue=Mon Apr 29 00:42:05 EDT 2024}" + "'", str10, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:05 EDT 2024, dateDue=Mon Apr 29 00:42:05 EDT 2024}");
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNotNull(date27);
// flaky:         org.junit.Assert.assertEquals(date27.toString(), "Fri Mar 29 00:42:05 EDT 2024");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Fri Mar 29 00:42:05 EDT 2024");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Fri Mar 29 00:42:05 EDT 2024");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(date52);
// flaky:         org.junit.Assert.assertEquals(date52.toString(), "Fri Mar 29 00:42:05 EDT 2024");
        org.junit.Assert.assertNotNull(date53);
// flaky:         org.junit.Assert.assertEquals(date53.toString(), "Fri Mar 29 00:42:05 EDT 2024");
        org.junit.Assert.assertNotNull(date57);
// flaky:         org.junit.Assert.assertEquals(date57.toString(), "Fri Mar 29 00:42:05 EDT 2024");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("PayPal");
        java.lang.String str2 = payPal1.getMode();
        org.team4.model.items.Newsletter newsletter6 = new org.team4.model.items.Newsletter("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) (short) -1);
        org.team4.model.user.NonFaculty nonFaculty12 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "PayPal{email='hi!'}", "Mobile Wallet", "PayPal{email='hi!'}", (long) (byte) 1);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase13 = new org.team4.functionality.buy.ItemToPurchase(newsletter6, (org.team4.model.user.User) nonFaculty12);
        org.team4.model.user.NonFaculty nonFaculty18 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "hi!", "hi!");
        long long19 = nonFaculty18.getUniversityID();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase20 = new org.team4.functionality.buy.ItemToPurchase(newsletter6, (org.team4.model.user.User) nonFaculty18);
        org.team4.functionality.buy.ProcessPayment processPayment21 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) payPal1, itemToPurchase20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Mobile Wallet" + "'", str2, "Mobile Wallet");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("PayPal{email='PayPal{email='hi!'}'}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:04 EDT 2024, dateDue=Mon Apr 29 00:42:04 EDT 2024}", "Debit Card", "ProcessPayment{modes=PayPal{email='hi!'}, itemToPurchase=ItemToPurchase{item=null, user=User [email=hi!, password=hi!, name=hi!, type=hi!, validated=false], newsletter=null}}");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("hi!", "hi!", "hi!", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", false);
        java.lang.String str6 = faculty5.getEmail();
        long long7 = faculty5.getFacultyID();
        faculty5.setFacultyID(100L);
        java.util.ArrayList<java.lang.String> strList10 = faculty5.getCourses();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(strList10);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.team4.model.user.Manager manager4 = new org.team4.model.user.Manager("PayPal", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        java.lang.String str5 = manager4.getEmail();
        long long6 = manager4.getManagerID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PayPal" + "'", str5, "PayPal");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("", "", "PayPal{email='PayPal{email='hi!'}'}", "hi!");
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getName();
        java.lang.String str6 = visitor4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.email("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.title("PayPal");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.author("Debit Card");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder6.email("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.Magazine magazine1 = magazineBuilder0.build();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder3 = magazineBuilder0.publisher("PayPal{email='hi!'}");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder5 = magazineBuilder0.publisher("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:00 EDT 2024, dateDue=Mon Apr 29 00:42:00 EDT 2024}");
        org.junit.Assert.assertNotNull(magazine1);
        org.junit.Assert.assertNotNull(magazineBuilder3);
        org.junit.Assert.assertNotNull(magazineBuilder5);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        java.lang.String str9 = courseTextBook1.getISBN();
        org.team4.model.items.decorator.ItemDecorator itemDecorator10 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook1);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder11 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook12 = courseTextBookBuilder11.build();
        java.util.Date date19 = null;
        java.util.Date date20 = null;
        org.team4.model.course.Course course23 = new org.team4.model.course.Course("", date19, date20, "", "hi!");
        org.team4.model.course.CourseTextBook courseTextBook25 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook12, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", 10, "hi!", "", (int) (byte) -1, course23, false);
        java.lang.String str26 = courseTextBook12.getTitle();
        org.team4.model.course.Course course27 = courseTextBook12.getCourse();
        boolean boolean28 = courseTextBook12.hasHardCopy();
        org.team4.model.course.Course course29 = courseTextBook12.getCourse();
        boolean boolean30 = courseTextBook12.isRentable();
        boolean boolean31 = courseTextBook12.hasHardCopy();
        boolean boolean32 = itemDecorator10.equals((java.lang.Object) courseTextBook12);
        org.team4.model.items.Book book40 = new org.team4.model.items.Book((org.team4.model.items.Item) courseTextBook12, "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:59 EDT 2024}", (int) (short) 10, "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}", "SubscribeNewsletter{title='hi!', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}', dateSubscribed=null, dateDue=null}", (int) (short) 100, true, true);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator41 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book40);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseTextBook12);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(course27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(course29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.items.RentedItem rentedItem4 = new org.team4.model.items.RentedItem("", "hi!", date2, date3);
        rentedItem4.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem4.setTitle("hi!");
        java.util.Date date9 = rentedItem4.getRentDate();
        org.team4.functionality.buy.ItemPurchased itemPurchased13 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date14 = itemPurchased13.getDatePurchased();
        java.util.Date date15 = itemPurchased13.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased18 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date19 = itemPurchased18.getDatePurchased();
        org.team4.model.course.Course course22 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date15, date19, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem4.setRentDate(date15);
        rentedItem4.setISBN("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}");
        java.lang.String str26 = rentedItem4.getTitle();
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Fri Mar 29 00:42:05 EDT 2024");
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Fri Mar 29 00:42:05 EDT 2024");
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Fri Mar 29 00:42:05 EDT 2024");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        boolean boolean3 = courseTextBook1.equals((java.lang.Object) (byte) 1);
        java.lang.String str4 = courseTextBook1.getTitle();
        java.lang.String str5 = courseTextBook1.getTitle();
        courseTextBook1.setPrice((double) 100);
        org.team4.model.items.Magazine magazine10 = new org.team4.model.items.Magazine((org.team4.model.items.Item) courseTextBook1, "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}", (int) (byte) -1);
        java.lang.String str11 = courseTextBook1.getAuthor();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder3 = courseTextBookBuilder0.isVirtual(false);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder5 = courseTextBookBuilder0.title("PayPal");
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(courseTextBookBuilder3);
        org.junit.Assert.assertNotNull(bookItemBuilder5);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getStartDate();
        java.lang.String str7 = course5.getCourseTextBookISBN();
        java.util.Date date8 = course5.getStartDate();
        java.util.Date date9 = course5.getEndDate();
        org.team4.model.user.Faculty faculty19 = new org.team4.model.user.Faculty("", "", "hi!", "hi!", true);
        java.util.ArrayList<java.lang.String> strList20 = faculty19.getCourses();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        faculty19.setCourses(strList23);
        org.team4.model.user.Student student26 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "", strList23);
        java.util.ArrayList<java.lang.String> strList27 = student26.getCourses();
        course5.enrollStudent(student26);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(strList20);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strList27);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.Magazine magazine1 = magazineBuilder0.build();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder3 = magazineBuilder0.publisher("PayPal");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder5 = magazineBuilder0.ISBN("User [email=, password=Mobile Wallet, name=PayPal, type=PayPal, validated=false]");
        org.junit.Assert.assertNotNull(magazine1);
        org.junit.Assert.assertNotNull(magazineBuilder3);
        org.junit.Assert.assertNotNull(magazineItemBuilder5);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.team4.model.user.Manager manager4 = new org.team4.model.user.Manager("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "hi!", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        java.lang.String str5 = manager4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.team4.model.paymentmodes.PaymentValidator paymentValidator0 = null;
        org.team4.functionality.buy.ItemToPurchase itemToPurchase1 = null;
        org.team4.functionality.buy.ProcessPayment processPayment2 = new org.team4.functionality.buy.ProcessPayment(paymentValidator0, itemToPurchase1);
        java.lang.String str3 = processPayment2.toString();
        java.lang.String str4 = processPayment2.toString();
        java.lang.String str5 = processPayment2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ProcessPayment{modes=null, itemToPurchase=null}" + "'", str3, "ProcessPayment{modes=null, itemToPurchase=null}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ProcessPayment{modes=null, itemToPurchase=null}" + "'", str4, "ProcessPayment{modes=null, itemToPurchase=null}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ProcessPayment{modes=null, itemToPurchase=null}" + "'", str5, "ProcessPayment{modes=null, itemToPurchase=null}");
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]", (int) (byte) 1, 10);
        boolean boolean4 = creditCard3.correctLength();
        boolean boolean5 = creditCard3.correctLength();
        boolean boolean6 = creditCard3.notExpired();
        org.team4.model.user.Student student12 = new org.team4.model.user.Student("hi!", "", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase13 = new org.team4.functionality.buy.ItemToPurchase((double) (-1L), (org.team4.model.user.User) student12);
        org.team4.functionality.buy.ProcessPayment processPayment14 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) creditCard3, itemToPurchase13);
        boolean boolean15 = creditCard3.isValid();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder2.title("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder6.booktype("Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:42:04 EDT 2024, dateDue=Mon Apr 29 00:42:04 EDT 2024}", "PayPal{email='PayPal{email='hi!'}'}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:58 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:02 EDT 2024, dateDue=Mon Apr 29 00:42:02 EDT 2024}", 6227221L);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        java.util.Date date8 = null;
        java.util.Date date9 = null;
        org.team4.model.course.Course course12 = new org.team4.model.course.Course("", date8, date9, "", "hi!");
        org.team4.model.course.CourseTextBook courseTextBook14 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", 10, "hi!", "", (int) (byte) -1, course12, false);
        java.lang.String str15 = courseTextBook1.getTitle();
        org.team4.model.course.Course course16 = courseTextBook1.getCourse();
        boolean boolean17 = courseTextBook1.hasHardCopy();
        java.lang.Class<?> wildcardClass18 = courseTextBook1.getClass();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(course16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder2 = courseTextBookBuilder0.price(1.0d);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.price((double) 0.0f);
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        org.team4.model.course.Course course10 = new org.team4.model.course.Course("", date6, date7, "hi!", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder11 = courseTextBookBuilder0.course(course10);
        java.util.Date date13 = null;
        java.util.Date date14 = null;
        org.team4.model.course.Course course17 = new org.team4.model.course.Course("", date13, date14, "", "hi!");
        java.util.Date date18 = course17.getStartDate();
        java.util.Date date19 = course17.getEndDate();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder20 = courseTextBookBuilder11.course(course17);
        org.team4.model.items.builder.BookBuilder bookBuilder22 = courseTextBookBuilder20.hasHardCopy(true);
        org.junit.Assert.assertNotNull(bookItemBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder11);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNotNull(courseTextBookBuilder20);
        org.junit.Assert.assertNotNull(bookBuilder22);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.team4.model.user.Manager manager4 = new org.team4.model.user.Manager("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:56 EDT 2024, dateDue=Mon Apr 29 00:41:56 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:42:04 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}", "Credit Card");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.booktype("Mobile Wallet");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder4.author("PayPal");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder10 = bookRequestBuilder8.edition((int) (short) 100);
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder12 = bookRequestBuilder10.edition((int) (byte) 10);
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
        org.junit.Assert.assertNotNull(bookRequestBuilder10);
        org.junit.Assert.assertNotNull(bookRequestBuilder12);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("ProcessPayment{modes=PayPal{email='hi!'}, itemToPurchase=ItemToPurchase{item=null, user=User [email=hi!, password=hi!, name=hi!, type=hi!, validated=false], newsletter=null}}", "User [email=hi!, password=hi!, name=hi!, type=, validated=false]", "ItemPurchased{title='', email='hi!', datePurchased=null}", "PayPal{email='PayPal{email='hi!'}'}", (long) '#');
        nonFaculty5.setEmail("User [email=hi!, password=hi!, name=hi!, type=, validated=false]");
        long long8 = nonFaculty5.getUniversityID();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) (short) -1);
        java.lang.String str4 = newsletter3.getTitle();
        java.lang.String str5 = newsletter3.getLink();
        java.lang.String str6 = newsletter3.getTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}" + "'", str4, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str5, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}" + "'", str6, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        java.lang.String str9 = courseTextBook1.getISBN();
        org.team4.model.course.Course course10 = courseTextBook1.getCourse();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(course10);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("PayPal{email='hi!'}", (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.BookRequest bookRequest5 = bookRequestBuilder4.build();
        java.lang.String str6 = bookRequest5.getAuthor();
        int int7 = bookRequest5.getEdition();
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.Course course1 = null;
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder2 = courseTextBookBuilder0.course(course1);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder4 = courseTextBookBuilder2.isVirtual(false);
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder2.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = bookBuilder6.ISBN("PayPal");
        org.junit.Assert.assertNotNull(courseTextBookBuilder2);
        org.junit.Assert.assertNotNull(courseTextBookBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        java.util.Date date3 = null;
        java.util.Date date4 = null;
        org.team4.model.items.RentedItem rentedItem5 = new org.team4.model.items.RentedItem("", "hi!", date3, date4);
        rentedItem5.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem5.setTitle("hi!");
        java.util.Date date10 = rentedItem5.getRentDate();
        rentedItem5.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.functionality.buy.ItemPurchased itemPurchased16 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date17 = itemPurchased16.getDatePurchased();
        java.util.Date date18 = itemPurchased16.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased21 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date22 = itemPurchased21.getDatePurchased();
        org.team4.model.course.Course course25 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date18, date22, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem5.setDueDate(date22);
        java.util.Date date29 = null;
        java.util.Date date30 = null;
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter31 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!", date29, date30);
        subscribeNewsletter31.setTitle("PayPal");
        java.util.Date date36 = null;
        java.util.Date date37 = null;
        org.team4.model.items.RentedItem rentedItem38 = new org.team4.model.items.RentedItem("", "hi!", date36, date37);
        rentedItem38.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem38.setTitle("hi!");
        java.util.Date date43 = rentedItem38.getRentDate();
        rentedItem38.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.functionality.buy.ItemPurchased itemPurchased49 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date50 = itemPurchased49.getDatePurchased();
        java.util.Date date51 = itemPurchased49.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased54 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date55 = itemPurchased54.getDatePurchased();
        org.team4.model.course.Course course58 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date51, date55, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem38.setDueDate(date55);
        subscribeNewsletter31.setDateDue(date55);
        org.team4.model.course.Course course63 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date22, date55, "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "hi!");
        java.lang.String str64 = course63.toString();
        java.lang.String str65 = course63.getCourseName();
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Fri Mar 29 00:42:05 EDT 2024");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Fri Mar 29 00:42:05 EDT 2024");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Fri Mar 29 00:42:05 EDT 2024");
        org.junit.Assert.assertNull(date43);
        org.junit.Assert.assertNotNull(date50);
// flaky:         org.junit.Assert.assertEquals(date50.toString(), "Fri Mar 29 00:42:05 EDT 2024");
        org.junit.Assert.assertNotNull(date51);
// flaky:         org.junit.Assert.assertEquals(date51.toString(), "Fri Mar 29 00:42:05 EDT 2024");
        org.junit.Assert.assertNotNull(date55);
// flaky:         org.junit.Assert.assertEquals(date55.toString(), "Fri Mar 29 00:42:05 EDT 2024");
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:42:05 EDT 2024, end date=Fri Mar 29 00:42:05 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]" + "'", str64, "Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:42:05 EDT 2024, end date=Fri Mar 29 00:42:05 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}" + "'", str65, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("PayPal{email='PayPal{email='hi!'}'}", 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        java.util.Date date8 = null;
        java.util.Date date9 = null;
        org.team4.model.course.Course course12 = new org.team4.model.course.Course("", date8, date9, "", "hi!");
        org.team4.model.course.CourseTextBook courseTextBook14 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", 10, "hi!", "", (int) (byte) -1, course12, false);
        java.util.List<org.team4.model.user.Student> studentList15 = courseTextBook14.getStudentsWithCopies();
        org.team4.model.user.NonFaculty nonFaculty20 = new org.team4.model.user.NonFaculty("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:02 EDT 2024, dateDue=Mon Apr 29 00:42:02 EDT 2024}", "ItemToPurchase{item=null, user=User [email=hi!, password=hi!, name=hi!, type=hi!, validated=false], newsletter=null}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}");
        boolean boolean21 = courseTextBook14.equals((java.lang.Object) "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}");
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(studentList15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.items.RentedItem rentedItem4 = new org.team4.model.items.RentedItem("", "hi!", date2, date3);
        rentedItem4.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem4.setTitle("hi!");
        rentedItem4.setISBN("Mobile Wallet");
        rentedItem4.setISBN("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:58 EDT 2024}");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder3 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder5 = courseTextBookBuilder0.isVirtual(false);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder6.hasHardCopy(true);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        org.team4.model.course.Course course14 = new org.team4.model.course.Course("", date10, date11, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder15 = courseTextBookBuilder6.course(course14);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder16 = courseTextBookBuilder5.course(course14);
        org.team4.model.items.builder.BookBuilder bookBuilder18 = courseTextBookBuilder16.hasHardCopy(false);
        org.team4.model.items.builder.BookBuilder bookBuilder20 = courseTextBookBuilder16.genre("PayPal");
        org.team4.functionality.buy.ItemPurchased itemPurchased24 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date25 = itemPurchased24.getDatePurchased();
        java.util.Date date26 = itemPurchased24.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased29 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date30 = itemPurchased29.getDatePurchased();
        org.team4.model.course.Course course33 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date26, date30, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder34 = courseTextBookBuilder16.course(course33);
        java.lang.String str35 = course33.toString();
        java.lang.String str36 = course33.toString();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(bookBuilder3);
        org.junit.Assert.assertNotNull(courseTextBookBuilder5);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(courseTextBookBuilder15);
        org.junit.Assert.assertNotNull(courseTextBookBuilder16);
        org.junit.Assert.assertNotNull(bookBuilder18);
        org.junit.Assert.assertNotNull(bookBuilder20);
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Fri Mar 29 00:42:05 EDT 2024");
        org.junit.Assert.assertNotNull(date26);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Fri Mar 29 00:42:05 EDT 2024");
        org.junit.Assert.assertNotNull(date30);
// flaky:         org.junit.Assert.assertEquals(date30.toString(), "Fri Mar 29 00:42:05 EDT 2024");
        org.junit.Assert.assertNotNull(courseTextBookBuilder34);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Course [course name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:42:05 EDT 2024, end date=Fri Mar 29 00:42:05 EDT 2024, ISBN=, email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}]" + "'", str35, "Course [course name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:42:05 EDT 2024, end date=Fri Mar 29 00:42:05 EDT 2024, ISBN=, email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}]");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Course [course name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:42:05 EDT 2024, end date=Fri Mar 29 00:42:05 EDT 2024, ISBN=, email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}]" + "'", str36, "Course [course name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:42:05 EDT 2024, end date=Fri Mar 29 00:42:05 EDT 2024, ISBN=, email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}]");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) (short) -1);
        double double4 = newsletter3.getPrice();
        org.team4.model.user.Manager manager9 = new org.team4.model.user.Manager("hi!", "hi!", "hi!", "");
        manager9.setType("");
        long long12 = manager9.getManagerID();
        manager9.setManagerID((long) (-1));
        org.team4.functionality.buy.ItemToPurchase itemToPurchase15 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) manager9);
        double double16 = newsletter3.getPrice();
        org.team4.model.user.Student student23 = new org.team4.model.user.Student("Mobile Wallet", "", "hi!", "Mobile Wallet", true);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase24 = new org.team4.functionality.buy.ItemToPurchase((double) (short) -1, (org.team4.model.user.User) student23);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase25 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) student23);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.items.RentedItem rentedItem4 = new org.team4.model.items.RentedItem("", "hi!", date2, date3);
        java.lang.String str5 = rentedItem4.getISBN();
        java.util.Date date6 = null;
        rentedItem4.setRentDate(date6);
        java.lang.String str8 = rentedItem4.getISBN();
        rentedItem4.setISBN("PayPal");
        java.util.Date date11 = rentedItem4.getRentDate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "PayPal", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", (int) (byte) 10, "");
        java.lang.String str7 = bookRequest6.getEmail();
        java.lang.String str8 = bookRequest6.getBookType();
        java.lang.String str9 = bookRequest6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}" + "'", str7, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PayPal" + "'", str9, "PayPal");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date4 = itemPurchased3.getDatePurchased();
        java.util.Date date5 = itemPurchased3.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased8 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date9 = itemPurchased8.getDatePurchased();
        org.team4.model.course.Course course12 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date5, date9, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.user.Faculty faculty22 = new org.team4.model.user.Faculty("", "", "hi!", "hi!", true);
        java.util.ArrayList<java.lang.String> strList23 = faculty22.getCourses();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        faculty22.setCourses(strList26);
        org.team4.model.user.Student student29 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "", strList26);
        course12.enrollStudent(student29);
        java.util.Date date31 = course12.getStartDate();
        org.team4.functionality.buy.ItemPurchased itemPurchased35 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date36 = itemPurchased35.getDatePurchased();
        java.util.Date date37 = itemPurchased35.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased40 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date41 = itemPurchased40.getDatePurchased();
        org.team4.model.course.Course course44 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date37, date41, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        boolean boolean45 = course12.isEnded(date41);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Fri Mar 29 00:42:05 EDT 2024");
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 29 00:42:05 EDT 2024");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Fri Mar 29 00:42:05 EDT 2024");
        org.junit.Assert.assertNull(strList23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Fri Mar 29 00:42:05 EDT 2024");
        org.junit.Assert.assertNotNull(date36);
// flaky:         org.junit.Assert.assertEquals(date36.toString(), "Fri Mar 29 00:42:05 EDT 2024");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Fri Mar 29 00:42:05 EDT 2024");
        org.junit.Assert.assertNotNull(date41);
// flaky:         org.junit.Assert.assertEquals(date41.toString(), "Fri Mar 29 00:42:05 EDT 2024");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.items.RentedItem rentedItem4 = new org.team4.model.items.RentedItem("", "hi!", date2, date3);
        java.lang.String str5 = rentedItem4.getISBN();
        org.team4.functionality.buy.ItemPurchased itemPurchased9 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date10 = itemPurchased9.getDatePurchased();
        java.util.Date date11 = itemPurchased9.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased14 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date15 = itemPurchased14.getDatePurchased();
        org.team4.model.course.Course course18 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date11, date15, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem4.setDueDate(date11);
        java.util.Date date20 = rentedItem4.getRentDate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Fri Mar 29 00:42:05 EDT 2024");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Fri Mar 29 00:42:05 EDT 2024");
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Fri Mar 29 00:42:05 EDT 2024");
        org.junit.Assert.assertNull(date20);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter4 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!", date2, date3);
        subscribeNewsletter4.setEmail("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        subscribeNewsletter4.setEmail("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}");
        java.lang.String str9 = subscribeNewsletter4.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SubscribeNewsletter{title='hi!', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}', dateSubscribed=null, dateDue=null}" + "'", str9, "SubscribeNewsletter{title='hi!', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}', dateSubscribed=null, dateDue=null}");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = visitor5.getName();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        double double9 = itemToPurchase7.getAmount();
        org.team4.model.paymentmodes.MobileWallet mobileWallet11 = new org.team4.model.paymentmodes.MobileWallet("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        java.lang.String str12 = mobileWallet11.getMode();
        java.lang.String str13 = mobileWallet11.getMode();
        boolean boolean14 = mobileWallet11.isValid();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete15 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet11);
        org.team4.model.items.Item item16 = purchaseComplete15.getItem();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PayPal" + "'", str12, "PayPal");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PayPal" + "'", str13, "PayPal");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder3 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder5 = courseTextBookBuilder0.isVirtual(false);
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        org.team4.model.course.Course course11 = new org.team4.model.course.Course("", date7, date8, "", "hi!");
        java.util.Date date12 = course11.getStartDate();
        java.lang.String str13 = course11.getCourseTextBookISBN();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder14 = courseTextBookBuilder5.course(course11);
        org.team4.model.items.builder.BookBuilder bookBuilder16 = courseTextBookBuilder5.hasSoftCopy(true);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(bookBuilder3);
        org.junit.Assert.assertNotNull(courseTextBookBuilder5);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(courseTextBookBuilder14);
        org.junit.Assert.assertNotNull(bookBuilder16);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.team4.model.user.UserFactory userFactory0 = new org.team4.model.user.UserFactory();
        org.team4.model.user.User user6 = userFactory0.getUser("", "ProcessPayment{modes=null, itemToPurchase=null}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", false);
        org.team4.model.user.User user12 = userFactory0.getUser("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}", "Mobile Wallet", "SubscribeNewsletter{title='', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}', dateSubscribed=Fri Mar 29 00:42:04 EDT 2024, dateDue=Mon Apr 29 00:42:04 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:42:04 EDT 2024}", false);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("hi!", "hi!", "hi!", "hi!");
        java.lang.String str5 = faculty4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.team4.model.user.User user5 = new org.team4.model.user.User("ProcessPayment{modes=null, itemToPurchase=null}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:42:04 EDT 2024, dateDue=Mon Apr 29 00:42:04 EDT 2024}", "ItemPurchased{title='', email='ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}', datePurchased=Fri Mar 29 00:42:01 EDT 2024}", "SubscribeNewsletter{title='', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}', dateSubscribed=Fri Mar 29 00:42:00 EDT 2024, dateDue=Mon Apr 29 00:42:00 EDT 2024}", true);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.team4.model.user.Student student6 = new org.team4.model.user.Student("Mobile Wallet", "", "hi!", "Mobile Wallet", true);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) -1, (org.team4.model.user.User) student6);
        org.team4.model.user.User user8 = itemToPurchase7.getUser();
        org.team4.model.items.Item item9 = itemToPurchase7.getItem();
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.team4.model.user.Faculty faculty9 = new org.team4.model.user.Faculty("hi!", "hi!", "hi!", "hi!");
        faculty9.setFacultyID((long) 0);
        java.lang.String[] strArray16 = new java.lang.String[] { "ProcessPayment{modes=null, itemToPurchase=null}", "ProcessPayment{modes=null, itemToPurchase=null}", "hi!", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        faculty9.setCourses(strList17);
        org.team4.model.user.Faculty faculty20 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "", "ProcessPayment{modes=null, itemToPurchase=null}", "", (long) 'a', strList17);
        faculty20.setFacultyID((long) (short) 10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.team4.model.user.Visitor visitor6 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str7 = visitor6.getName();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase8 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor6);
        org.team4.model.items.Newsletter newsletter9 = itemToPurchase8.getNewsletter();
        double double10 = itemToPurchase8.getAmount();
        org.team4.model.user.User user11 = itemToPurchase8.getUser();
        boolean boolean12 = user11.isValidated();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase13 = new org.team4.functionality.buy.ItemToPurchase((double) 0, user11);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.team4.model.user.User user6 = new org.team4.model.user.User("hi!", "", "hi!", "", true);
        user6.setName("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase9 = new org.team4.functionality.buy.ItemToPurchase((double) (short) -1, user6);
        org.team4.model.paymentmodes.PayPal payPal11 = new org.team4.model.paymentmodes.PayPal("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase12 = null;
        org.team4.functionality.buy.ProcessPayment processPayment13 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) payPal11, itemToPurchase12);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete14 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase9, (org.team4.model.paymentmodes.PaymentValidator) payPal11);
        long long15 = purchaseComplete14.getPurchaseID();
        org.team4.model.items.Newsletter newsletter16 = purchaseComplete14.getNewsletter();
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 7511406L + "'", long15 == 7511406L);
        org.junit.Assert.assertNull(newsletter16);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]", (int) (byte) 1, 10);
        java.lang.String str4 = creditCard3.getMode();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credit Card" + "'", str4, "Credit Card");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "Course [course name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:42:00 EDT 2024, end date=Fri Mar 29 00:42:00 EDT 2024, ISBN=, email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}]", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}", "Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]");
        java.util.ArrayList<java.lang.String> strList5 = null;
        faculty4.setCourses(strList5);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:02 EDT 2024, dateDue=Mon Apr 29 00:42:02 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:56 EDT 2024, dateDue=Mon Apr 29 00:41:56 EDT 2024}", "PayPal{email='hi!'}", "User [email=hi!, password=hi!, name=hi!, type=, validated=false]", 3090830L);
        java.lang.String str6 = manager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PayPal{email='hi!'}" + "'", str6, "PayPal{email='hi!'}");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("hi!", "PayPal", (double) 0L);
        org.team4.functionality.buy.ItemPurchased itemPurchased7 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date8 = itemPurchased7.getDatePurchased();
        java.util.Date date9 = itemPurchased7.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased12 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date13 = itemPurchased12.getDatePurchased();
        org.team4.model.course.Course course16 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date9, date13, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.user.Faculty faculty26 = new org.team4.model.user.Faculty("", "", "hi!", "hi!", true);
        java.util.ArrayList<java.lang.String> strList27 = faculty26.getCourses();
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        faculty26.setCourses(strList30);
        org.team4.model.user.Student student33 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "", strList30);
        course16.enrollStudent(student33);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase35 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) student33);
        double double36 = newsletter3.getPrice();
        org.team4.model.user.Faculty faculty41 = new org.team4.model.user.Faculty("User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, type=, validated=false]", "User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, type=, validated=false]", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase42 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) faculty41);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Fri Mar 29 00:42:05 EDT 2024");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Fri Mar 29 00:42:05 EDT 2024");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Fri Mar 29 00:42:05 EDT 2024");
        org.junit.Assert.assertNull(strList27);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("hi!", "User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, name=hi!, type=, validated=false]", "User [email=, password=Mobile Wallet, name=PayPal, type=PayPal, validated=false]", "Course [course name=PayPal{email='hi!'}, start date=Fri Mar 29 00:42:04 EDT 2024, end date=Fri Mar 29 00:42:04 EDT 2024, ISBN=Mobile Wallet, email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}]", false);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator9 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        boolean boolean10 = courseTextBook1.isRentable();
        java.lang.String str11 = courseTextBook1.getGenre();
        org.team4.model.course.Course course12 = courseTextBook1.getCourse();
        org.team4.model.items.decorator.ItemDecorator itemDecorator13 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook1);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(course12);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished((int) (short) -1);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.publisher("");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder6 = magazineBuilder0.publisher("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineBuilder0.quantity((int) (byte) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder10 = magazineBuilder0.ISBN("PayPal");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder12 = magazineBuilder0.ISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder14 = magazineBuilder0.publisher("PayPal{email='PayPal{email='hi!'}'}");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
        org.junit.Assert.assertNotNull(magazineItemBuilder10);
        org.junit.Assert.assertNotNull(magazineItemBuilder12);
        org.junit.Assert.assertNotNull(magazineBuilder14);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.team4.model.user.Manager manager4 = new org.team4.model.user.Manager("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:00 EDT 2024, dateDue=Mon Apr 29 00:42:00 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:58 EDT 2024}", "ProcessPayment{modes=PayPal{email='hi!'}, itemToPurchase=ItemToPurchase{item=null, user=User [email=hi!, password=hi!, name=hi!, type=hi!, validated=false], newsletter=null}}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getStartDate();
        java.lang.String str7 = course5.getCourseTextBookISBN();
        java.util.Date date8 = course5.getStartDate();
        java.util.Date date9 = course5.getEndDate();
        java.lang.String str10 = course5.getCourseTextBookISBN();
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.email("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.title("PayPal");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.author("Debit Card");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder6.title("PayPal");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder10 = bookRequestBuilder8.edition((int) (short) 10);
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder12 = bookRequestBuilder8.title("PayPal{email='hi!'}");
        org.team4.model.items.BookRequest bookRequest13 = bookRequestBuilder8.build();
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
        org.junit.Assert.assertNotNull(bookRequestBuilder10);
        org.junit.Assert.assertNotNull(bookRequestBuilder12);
        org.junit.Assert.assertNotNull(bookRequest13);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder3 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder5 = courseTextBookBuilder0.genre("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder7 = bookBuilder5.hasHardCopy(false);
        org.team4.model.items.builder.BookBuilder bookBuilder9 = bookBuilder7.edition(10);
        org.team4.model.items.builder.BookBuilder bookBuilder11 = bookBuilder7.edition((int) '#');
        org.team4.model.items.builder.BookBuilder bookBuilder13 = bookBuilder11.genre("SubscribeNewsletter{title='hi!', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}', dateSubscribed=null, dateDue=null}");
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(bookBuilder3);
        org.junit.Assert.assertNotNull(bookBuilder5);
        org.junit.Assert.assertNotNull(bookBuilder7);
        org.junit.Assert.assertNotNull(bookBuilder9);
        org.junit.Assert.assertNotNull(bookBuilder11);
        org.junit.Assert.assertNotNull(bookBuilder13);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "ItemToPurchase{item=null, user=User [email=hi!, password=, name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, type=ProcessPayment{modes=null, itemToPurchase=null}, validated=false], newsletter=null}", "User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, password=, name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}, type=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, validated=true]", "PayPal{email='hi!'}");
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.Magazine magazine1 = magazineBuilder0.build();
        java.lang.String str2 = magazine1.getPublisher();
        magazine1.setPrice(100.0d);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator5 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) magazine1);
        org.team4.model.user.Manager manager10 = new org.team4.model.user.Manager("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}", "SubscribeNewsletter{title='hi!', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}', dateSubscribed=null, dateDue=null}", "PayPal{email='PayPal{email='hi!'}'}", "PayPal");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase11 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) purchasableItemDecorator5, (org.team4.model.user.User) manager10);
        org.junit.Assert.assertNotNull(magazine1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, password=, name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}, type=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, validated=true]", (int) ' ', (int) (byte) 1, (double) 10, "ProcessPayment{modes=PayPal{email='hi!'}, itemToPurchase=ItemToPurchase{item=null, user=User [email=hi!, password=hi!, name=hi!, type=hi!, validated=false], newsletter=null}}", true, false);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder3 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder5 = courseTextBookBuilder0.isVirtual(false);
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        org.team4.model.course.Course course11 = new org.team4.model.course.Course("", date7, date8, "", "hi!");
        java.util.Date date12 = course11.getStartDate();
        java.lang.String str13 = course11.getCourseTextBookISBN();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder14 = courseTextBookBuilder5.course(course11);
        org.team4.model.items.Book book15 = courseTextBookBuilder14.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder17 = courseTextBookBuilder14.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:02 EDT 2024, dateDue=Mon Apr 29 00:42:02 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder19 = bookItemBuilder17.price((double) 5765543L);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(bookBuilder3);
        org.junit.Assert.assertNotNull(courseTextBookBuilder5);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(courseTextBookBuilder14);
        org.junit.Assert.assertNotNull(book15);
        org.junit.Assert.assertNotNull(bookItemBuilder17);
        org.junit.Assert.assertNotNull(bookItemBuilder19);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("PayPal");
        boolean boolean2 = payPal1.isValid();
        java.lang.String str3 = payPal1.getMode();
        boolean boolean4 = payPal1.isValid();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Mobile Wallet" + "'", str3, "Mobile Wallet");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        java.util.Date date8 = null;
        java.util.Date date9 = null;
        org.team4.model.course.Course course12 = new org.team4.model.course.Course("", date8, date9, "", "hi!");
        org.team4.model.course.CourseTextBook courseTextBook14 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", 10, "hi!", "", (int) (byte) -1, course12, false);
        java.lang.String str15 = courseTextBook1.getGenre();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder2 = dVDBuilder0.price((double) (-1.0f));
        org.team4.model.items.builder.DVDBuilder dVDBuilder4 = dVDBuilder0.genre("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder4.duration((double) 10L);
        org.team4.model.items.builder.DVDBuilder dVDBuilder8 = dVDBuilder6.genre("hi!");
        org.team4.model.items.DVD dVD9 = dVDBuilder6.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder11 = dVDBuilder6.genre("ItemToPurchase{item=null, user=User [email=hi!, password=, name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, type=ProcessPayment{modes=null, itemToPurchase=null}, validated=false], newsletter=null}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder13 = dVDBuilder11.genre("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder15 = dVDBuilder13.ISBN("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}");
        org.junit.Assert.assertNotNull(dVDItemBuilder2);
        org.junit.Assert.assertNotNull(dVDBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDBuilder8);
        org.junit.Assert.assertNotNull(dVD9);
        org.junit.Assert.assertNotNull(dVDBuilder11);
        org.junit.Assert.assertNotNull(dVDBuilder13);
        org.junit.Assert.assertNotNull(dVDItemBuilder15);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("User [email=hi!, password=hi!, name=hi!, type=, validated=false]", (int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder2 = dVDBuilder0.price((double) (-1.0f));
        org.team4.model.items.builder.DVDBuilder dVDBuilder4 = dVDBuilder0.genre("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder4.duration((double) 10L);
        org.team4.model.items.builder.DVDBuilder dVDBuilder8 = dVDBuilder6.genre("hi!");
        org.team4.model.items.DVD dVD9 = dVDBuilder6.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder11 = dVDBuilder6.genre("ItemToPurchase{item=null, user=User [email=hi!, password=, name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, type=ProcessPayment{modes=null, itemToPurchase=null}, validated=false], newsletter=null}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder13 = dVDBuilder11.quantity((int) '4');
        org.junit.Assert.assertNotNull(dVDItemBuilder2);
        org.junit.Assert.assertNotNull(dVDBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDBuilder8);
        org.junit.Assert.assertNotNull(dVD9);
        org.junit.Assert.assertNotNull(dVDBuilder11);
        org.junit.Assert.assertNotNull(dVDItemBuilder13);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        java.util.ArrayList<java.lang.String> strList5 = null;
        org.team4.model.user.Faculty faculty6 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}", "hi!", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:42:04 EDT 2024}", "ItemToPurchase{item=null, user=User [email=hi!, password=, name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, type=ProcessPayment{modes=null, itemToPurchase=null}, validated=false], newsletter=null}", (long) (short) 100, strList5);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("PayPal{email='hi!'}", (int) (byte) 10, (int) (short) 1);
        java.lang.String str4 = debitCard3.getMode();
        java.lang.String str5 = debitCard3.getMode();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getStartDate();
        java.lang.String str7 = course5.getProfessorEmail();
        org.team4.model.user.Student student13 = new org.team4.model.user.Student("hi!", "hi!", "", "", true);
        course5.enrollStudent(student13);
        org.team4.model.user.Student student20 = new org.team4.model.user.Student("hi!", "hi!", "", "", true);
        boolean boolean21 = course5.isEnrolled(student20);
        java.util.Date date22 = course5.getStartDate();
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(date22);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder2 = dVDBuilder0.price((double) 'a');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.ISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:59 EDT 2024, dateDue=Mon Apr 29 00:41:59 EDT 2024}");
        org.junit.Assert.assertNotNull(dVDItemBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.edition(1);
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.edition((int) '4');
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.Newsletter newsletter12 = new org.team4.model.items.Newsletter("hi!", "PayPal", (double) 0L);
        org.team4.functionality.buy.ItemPurchased itemPurchased16 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date17 = itemPurchased16.getDatePurchased();
        java.util.Date date18 = itemPurchased16.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased21 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date22 = itemPurchased21.getDatePurchased();
        org.team4.model.course.Course course25 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date18, date22, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.user.Faculty faculty35 = new org.team4.model.user.Faculty("", "", "hi!", "hi!", true);
        java.util.ArrayList<java.lang.String> strList36 = faculty35.getCourses();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        faculty35.setCourses(strList39);
        org.team4.model.user.Student student42 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "", strList39);
        course25.enrollStudent(student42);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase44 = new org.team4.functionality.buy.ItemToPurchase(newsletter12, (org.team4.model.user.User) student42);
        boolean boolean45 = courseTextBook1.equals((java.lang.Object) itemToPurchase44);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder46 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook47 = courseTextBookBuilder46.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder48 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder50 = dVDBuilder48.price((double) 'a');
        boolean boolean51 = courseTextBook47.equals((java.lang.Object) dVDItemBuilder50);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator52 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook47);
        courseTextBook47.setPrice((double) (byte) 100);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator55 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook47);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator56 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) purchasableItemDecorator55);
        boolean boolean57 = rentableItemDecorator56.isRentable();
        boolean boolean58 = rentableItemDecorator56.isRentable();
        boolean boolean59 = courseTextBook1.equals((java.lang.Object) boolean58);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Fri Mar 29 00:42:05 EDT 2024");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Fri Mar 29 00:42:05 EDT 2024");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Fri Mar 29 00:42:05 EDT 2024");
        org.junit.Assert.assertNull(strList36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(courseTextBook47);
        org.junit.Assert.assertNotNull(dVDItemBuilder50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.team4.model.user.User user6 = new org.team4.model.user.User("hi!", "", "hi!", "", true);
        user6.setName("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase9 = new org.team4.functionality.buy.ItemToPurchase((double) (short) -1, user6);
        org.team4.model.paymentmodes.PayPal payPal11 = new org.team4.model.paymentmodes.PayPal("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase12 = null;
        org.team4.functionality.buy.ProcessPayment processPayment13 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) payPal11, itemToPurchase12);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete14 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase9, (org.team4.model.paymentmodes.PaymentValidator) payPal11);
        long long15 = purchaseComplete14.getPurchaseID();
        org.team4.model.items.Item item16 = purchaseComplete14.getItem();
        double double17 = purchaseComplete14.getAmount();
        org.team4.model.user.User user18 = purchaseComplete14.getUser();
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2696693L + "'", long15 == 2696693L);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(user18);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished((int) (short) -1);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber((int) (short) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder6 = magazineBuilder4.issueNumber((int) (byte) -1);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder8 = magazineBuilder4.issueNumber((int) (short) -1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder10 = magazineBuilder8.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineBuilder6);
        org.junit.Assert.assertNotNull(magazineBuilder8);
        org.junit.Assert.assertNotNull(magazineItemBuilder10);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        java.util.Date date8 = null;
        java.util.Date date9 = null;
        org.team4.model.course.Course course12 = new org.team4.model.course.Course("", date8, date9, "", "hi!");
        org.team4.model.course.CourseTextBook courseTextBook14 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", 10, "hi!", "", (int) (byte) -1, course12, false);
        java.lang.String str15 = courseTextBook1.getTitle();
        org.team4.model.course.Course course16 = courseTextBook1.getCourse();
        boolean boolean17 = courseTextBook1.hasHardCopy();
        boolean boolean18 = courseTextBook1.hasHardCopy();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder19 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook20 = courseTextBookBuilder19.build();
        boolean boolean22 = courseTextBook20.equals((java.lang.Object) (byte) 1);
        java.lang.String str23 = courseTextBook20.getTitle();
        org.team4.model.course.Course course24 = courseTextBook20.getCourse();
        boolean boolean26 = courseTextBook20.equals((java.lang.Object) 100);
        org.team4.model.user.Student student32 = new org.team4.model.user.Student("Mobile Wallet", "", "hi!", "Mobile Wallet", true);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase33 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) courseTextBook20, (org.team4.model.user.User) student32);
        org.team4.model.user.Faculty faculty38 = new org.team4.model.user.Faculty("", "", "hi!", "hi!");
        org.team4.model.user.Faculty faculty49 = new org.team4.model.user.Faculty("", "", "hi!", "hi!", true);
        java.util.ArrayList<java.lang.String> strList50 = faculty49.getCourses();
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        faculty49.setCourses(strList53);
        org.team4.model.user.Faculty faculty56 = new org.team4.model.user.Faculty("", "Debit Card", "Debit Card", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (long) (byte) 100, strList53);
        faculty38.setCourses(strList53);
        student32.setCourses(strList53);
        // The following exception was thrown during execution in test generation
        try {
            courseTextBook1.makeCopies(student32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.team4.model.course.Course.isEnrolled(org.team4.model.user.Student)\" because \"this.course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(course16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(courseTextBook20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(course24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(strList50);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        boolean boolean3 = courseTextBook1.equals((java.lang.Object) (byte) 1);
        java.lang.String str4 = courseTextBook1.getTitle();
        org.team4.model.course.Course course5 = courseTextBook1.getCourse();
        boolean boolean7 = courseTextBook1.equals((java.lang.Object) 100);
        org.team4.model.user.Student student13 = new org.team4.model.user.Student("Mobile Wallet", "", "hi!", "Mobile Wallet", true);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase14 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) courseTextBook1, (org.team4.model.user.User) student13);
        org.team4.model.user.User user15 = itemToPurchase14.getUser();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(course5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(user15);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.ISBN("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber((int) '4');
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("hi!", 100, 100, (double) 10L, "PayPal", false, true);
        int int8 = item7.getYearPublished();
        org.team4.model.items.DVD dVD11 = new org.team4.model.items.DVD(item7, "", (double) 10);
        double double12 = dVD11.getDuration();
        boolean boolean13 = dVD11.isRentable();
        boolean boolean14 = dVD11.isRentable();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder3 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder5 = courseTextBookBuilder0.isVirtual(false);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder6.hasHardCopy(true);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        org.team4.model.course.Course course14 = new org.team4.model.course.Course("", date10, date11, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder15 = courseTextBookBuilder6.course(course14);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder16 = courseTextBookBuilder5.course(course14);
        org.team4.model.items.builder.BookBuilder bookBuilder18 = courseTextBookBuilder5.hasSoftCopy(false);
        org.team4.model.course.CourseTextBook courseTextBook19 = courseTextBookBuilder5.build();
        java.util.Date date21 = null;
        java.util.Date date22 = null;
        org.team4.model.course.Course course25 = new org.team4.model.course.Course("", date21, date22, "", "hi!");
        org.team4.model.user.Student student31 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "Mobile Wallet", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "", false);
        course25.enrollStudent(student31);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder33 = courseTextBookBuilder5.course(course25);
        org.team4.model.items.builder.BookBuilder bookBuilder35 = courseTextBookBuilder5.publisher("Course [course name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:42:00 EDT 2024, end date=Fri Mar 29 00:42:00 EDT 2024, ISBN=, email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}]");
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(bookBuilder3);
        org.junit.Assert.assertNotNull(courseTextBookBuilder5);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(courseTextBookBuilder15);
        org.junit.Assert.assertNotNull(courseTextBookBuilder16);
        org.junit.Assert.assertNotNull(bookBuilder18);
        org.junit.Assert.assertNotNull(courseTextBook19);
        org.junit.Assert.assertNotNull(courseTextBookBuilder33);
        org.junit.Assert.assertNotNull(bookBuilder35);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        java.lang.String str2 = courseTextBook1.getGenre();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.Item item9 = new org.team4.model.items.Item((org.team4.model.items.Item) courseTextBook1);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder15 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder17 = courseTextBookBuilder15.hasHardCopy(true);
        java.util.Date date19 = null;
        java.util.Date date20 = null;
        org.team4.model.course.Course course23 = new org.team4.model.course.Course("", date19, date20, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder24 = courseTextBookBuilder15.course(course23);
        org.team4.model.course.CourseTextBook courseTextBook26 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}", (int) '#', "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "", (int) (byte) 0, course23, false);
        java.lang.String str27 = course23.getCourseName();
        org.team4.model.user.Student student33 = new org.team4.model.user.Student("hi!", "hi!", "", "", true);
        student33.setName("PayPal{email='hi!'}");
        boolean boolean36 = course23.isEnrolled(student33);
        org.team4.functionality.buy.ItemPurchased itemPurchased40 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date41 = itemPurchased40.getDatePurchased();
        java.util.Date date42 = itemPurchased40.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased45 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date46 = itemPurchased45.getDatePurchased();
        org.team4.model.course.Course course49 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date42, date46, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.user.Faculty faculty59 = new org.team4.model.user.Faculty("", "", "hi!", "hi!", true);
        java.util.ArrayList<java.lang.String> strList60 = faculty59.getCourses();
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        faculty59.setCourses(strList63);
        org.team4.model.user.Student student66 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "", strList63);
        course49.enrollStudent(student66);
        java.lang.String str68 = student66.getEmail();
        boolean boolean69 = course23.isEnrolled(student66);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookBuilder17);
        org.junit.Assert.assertNotNull(courseTextBookBuilder24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(date41);
// flaky:         org.junit.Assert.assertEquals(date41.toString(), "Fri Mar 29 00:42:05 EDT 2024");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Fri Mar 29 00:42:05 EDT 2024");
        org.junit.Assert.assertNotNull(date46);
// flaky:         org.junit.Assert.assertEquals(date46.toString(), "Fri Mar 29 00:42:05 EDT 2024");
        org.junit.Assert.assertNull(strList60);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str68, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.items.RentedItem rentedItem4 = new org.team4.model.items.RentedItem("", "hi!", date2, date3);
        java.lang.String str5 = rentedItem4.getISBN();
        java.util.Date date6 = null;
        rentedItem4.setDueDate(date6);
        rentedItem4.setISBN("PayPal");
        java.lang.String str10 = rentedItem4.getISBN();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter15 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "");
        java.lang.String str16 = subscribeNewsletter15.toString();
        java.util.Date date17 = null;
        subscribeNewsletter15.setDateDue(date17);
        java.util.Date date19 = subscribeNewsletter15.getDateSubscribed();
        java.util.Date date24 = null;
        java.util.Date date25 = null;
        org.team4.model.items.RentedItem rentedItem26 = new org.team4.model.items.RentedItem("", "hi!", date24, date25);
        rentedItem26.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem26.setTitle("hi!");
        java.util.Date date31 = rentedItem26.getRentDate();
        rentedItem26.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.functionality.buy.ItemPurchased itemPurchased37 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date38 = itemPurchased37.getDatePurchased();
        java.util.Date date39 = itemPurchased37.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased42 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date43 = itemPurchased42.getDatePurchased();
        org.team4.model.course.Course course46 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date39, date43, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem26.setDueDate(date43);
        org.team4.functionality.buy.ItemPurchased itemPurchased48 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=null}", date43);
        org.team4.model.items.RentedItem rentedItem49 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}', datePurchased=Fri Mar 29 00:42:01 EDT 2024}", "User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, type=, validated=false]", date19, date43);
        rentedItem4.setRentDate(date43);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PayPal" + "'", str10, "PayPal");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:05 EDT 2024, dateDue=Mon Apr 29 00:42:05 EDT 2024}" + "'", str16, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:05 EDT 2024, dateDue=Mon Apr 29 00:42:05 EDT 2024}");
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Fri Mar 29 00:42:05 EDT 2024");
        org.junit.Assert.assertNull(date31);
        org.junit.Assert.assertNotNull(date38);
// flaky:         org.junit.Assert.assertEquals(date38.toString(), "Fri Mar 29 00:42:05 EDT 2024");
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Fri Mar 29 00:42:05 EDT 2024");
        org.junit.Assert.assertNotNull(date43);
// flaky:         org.junit.Assert.assertEquals(date43.toString(), "Fri Mar 29 00:42:05 EDT 2024");
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.quantity((int) (byte) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder4 = magazineBuilder0.title("Mobile Wallet");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.title("ProcessPayment{modes=null, itemToPurchase=null}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineItemBuilder6.quantity((-1));
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder10 = magazineItemBuilder8.price((double) 3281441L);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineItemBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
        org.junit.Assert.assertNotNull(magazineItemBuilder10);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        java.lang.String str9 = courseTextBook1.getISBN();
        org.team4.model.items.decorator.ItemDecorator itemDecorator10 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook1);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder11 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook12 = courseTextBookBuilder11.build();
        java.util.Date date19 = null;
        java.util.Date date20 = null;
        org.team4.model.course.Course course23 = new org.team4.model.course.Course("", date19, date20, "", "hi!");
        org.team4.model.course.CourseTextBook courseTextBook25 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook12, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", 10, "hi!", "", (int) (byte) -1, course23, false);
        java.lang.String str26 = courseTextBook12.getTitle();
        org.team4.model.course.Course course27 = courseTextBook12.getCourse();
        boolean boolean28 = courseTextBook12.hasHardCopy();
        org.team4.model.course.Course course29 = courseTextBook12.getCourse();
        boolean boolean30 = courseTextBook12.isRentable();
        boolean boolean31 = courseTextBook12.hasHardCopy();
        boolean boolean32 = itemDecorator10.equals((java.lang.Object) courseTextBook12);
        java.lang.String str33 = courseTextBook12.getAuthor();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator34 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook12);
        org.team4.model.items.DVD dVD37 = new org.team4.model.items.DVD((org.team4.model.items.Item) courseTextBook12, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:04 EDT 2024, dateDue=Mon Apr 29 00:42:04 EDT 2024}", (double) 100.0f);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseTextBook12);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(course27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(course29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter4 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!", date2, date3);
        java.lang.String str5 = subscribeNewsletter4.getEmail();
        java.lang.String str6 = subscribeNewsletter4.getTitle();
        java.lang.String str7 = subscribeNewsletter4.getTitle();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder2 = magazineBuilder0.issueNumber((int) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder2.issueNumber((int) ' ');
        org.team4.model.items.Magazine magazine5 = magazineBuilder2.build();
        org.team4.model.items.Magazine magazine6 = magazineBuilder2.build();
        org.junit.Assert.assertNotNull(magazineBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazine5);
        org.junit.Assert.assertNotNull(magazine6);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.email("PayPal{email='hi!'}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder4.booktype("Mobile Wallet");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder10 = bookRequestBuilder4.author("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder12 = bookRequestBuilder10.booktype("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
        org.junit.Assert.assertNotNull(bookRequestBuilder10);
        org.junit.Assert.assertNotNull(bookRequestBuilder12);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        java.lang.String str9 = courseTextBook1.getISBN();
        org.team4.model.items.decorator.ItemDecorator itemDecorator10 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook1);
        int int11 = itemDecorator10.getYearPublished();
        double double12 = itemDecorator10.getPrice();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        java.lang.String str9 = courseTextBook1.getISBN();
        org.team4.model.items.decorator.ItemDecorator itemDecorator10 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook1);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder11 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook12 = courseTextBookBuilder11.build();
        java.util.Date date19 = null;
        java.util.Date date20 = null;
        org.team4.model.course.Course course23 = new org.team4.model.course.Course("", date19, date20, "", "hi!");
        org.team4.model.course.CourseTextBook courseTextBook25 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook12, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", 10, "hi!", "", (int) (byte) -1, course23, false);
        java.lang.String str26 = courseTextBook12.getTitle();
        org.team4.model.course.Course course27 = courseTextBook12.getCourse();
        boolean boolean28 = courseTextBook12.hasHardCopy();
        org.team4.model.course.Course course29 = courseTextBook12.getCourse();
        boolean boolean30 = courseTextBook12.isRentable();
        boolean boolean31 = courseTextBook12.hasHardCopy();
        boolean boolean32 = itemDecorator10.equals((java.lang.Object) courseTextBook12);
        courseTextBook12.setPurchaseable(false);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseTextBook12);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(course27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(course29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.team4.model.items.Newsletter newsletter4 = new org.team4.model.items.Newsletter("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) (short) -1);
        java.lang.String str5 = newsletter4.getTitle();
        java.lang.String str6 = newsletter4.getLink();
        org.team4.model.user.Faculty faculty12 = new org.team4.model.user.Faculty("hi!", "hi!", "hi!", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", false);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase13 = new org.team4.functionality.buy.ItemToPurchase(newsletter4, (org.team4.model.user.User) faculty12);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase14 = new org.team4.functionality.buy.ItemToPurchase((double) 3763455L, (org.team4.model.user.User) faculty12);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}" + "'", str5, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str6, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        java.lang.String str9 = courseTextBook1.getISBN();
        org.team4.model.items.decorator.ItemDecorator itemDecorator10 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook1);
        java.lang.String str11 = courseTextBook1.getGenre();
        java.lang.String str12 = courseTextBook1.getPublisher();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder2 = courseTextBookBuilder0.price(1.0d);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.price((double) 0.0f);
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        org.team4.model.course.Course course10 = new org.team4.model.course.Course("", date6, date7, "hi!", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder11 = courseTextBookBuilder0.course(course10);
        org.team4.model.items.builder.BookBuilder bookBuilder13 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.Book book14 = courseTextBookBuilder0.build();
        org.junit.Assert.assertNotNull(bookItemBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder11);
        org.junit.Assert.assertNotNull(bookBuilder13);
        org.junit.Assert.assertNotNull(book14);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.Item item9 = new org.team4.model.items.Item((org.team4.model.items.Item) courseTextBook1);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder15 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder17 = courseTextBookBuilder15.hasHardCopy(true);
        java.util.Date date19 = null;
        java.util.Date date20 = null;
        org.team4.model.course.Course course23 = new org.team4.model.course.Course("", date19, date20, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder24 = courseTextBookBuilder15.course(course23);
        org.team4.model.course.CourseTextBook courseTextBook26 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}", (int) '#', "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "", (int) (byte) 0, course23, false);
        java.util.Date date28 = null;
        java.util.Date date29 = null;
        org.team4.model.course.Course course32 = new org.team4.model.course.Course("", date28, date29, "", "hi!");
        java.util.Date date33 = course32.getStartDate();
        org.team4.model.user.Student student39 = new org.team4.model.user.Student("hi!", "hi!", "", "", true);
        boolean boolean40 = course32.isEnrolled(student39);
        boolean boolean41 = course23.isEnrolled(student39);
        java.util.Date date42 = course23.getStartDate();
        java.util.Date date43 = course23.getEndDate();
        java.lang.String str44 = course23.getProfessorEmail();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookBuilder17);
        org.junit.Assert.assertNotNull(courseTextBookBuilder24);
        org.junit.Assert.assertNull(date33);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(date42);
        org.junit.Assert.assertNull(date43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("hi!", "hi!", "", "hi!", false);
        long long6 = nonFaculty5.getUniversityID();
        nonFaculty5.setUniversityID(100L);
        nonFaculty5.setValidated(false);
        long long11 = nonFaculty5.getUniversityID();
        nonFaculty5.setUniversityID((long) (short) 100);
        boolean boolean14 = nonFaculty5.isValidated();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        java.lang.String str9 = courseTextBook1.getISBN();
        org.team4.model.items.decorator.ItemDecorator itemDecorator10 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook1);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder11 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook12 = courseTextBookBuilder11.build();
        java.util.Date date19 = null;
        java.util.Date date20 = null;
        org.team4.model.course.Course course23 = new org.team4.model.course.Course("", date19, date20, "", "hi!");
        org.team4.model.course.CourseTextBook courseTextBook25 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook12, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", 10, "hi!", "", (int) (byte) -1, course23, false);
        java.lang.String str26 = courseTextBook12.getTitle();
        org.team4.model.course.Course course27 = courseTextBook12.getCourse();
        boolean boolean28 = courseTextBook12.hasHardCopy();
        org.team4.model.course.Course course29 = courseTextBook12.getCourse();
        boolean boolean30 = courseTextBook12.isRentable();
        boolean boolean31 = courseTextBook12.hasHardCopy();
        boolean boolean32 = itemDecorator10.equals((java.lang.Object) courseTextBook12);
        java.lang.String str33 = courseTextBook12.getAuthor();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator34 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook12);
        org.team4.model.items.decorator.ItemDecorator itemDecorator35 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook12);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseTextBook12);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(course27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(course29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 35");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.Magazine magazine1 = magazineBuilder0.build();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder3 = magazineBuilder0.issueNumber((int) (short) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder5 = magazineBuilder0.ISBN("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:42:04 EDT 2024, dateDue=Mon Apr 29 00:42:04 EDT 2024}");
        org.junit.Assert.assertNotNull(magazine1);
        org.junit.Assert.assertNotNull(magazineBuilder3);
        org.junit.Assert.assertNotNull(magazineItemBuilder5);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.team4.model.user.Student student9 = new org.team4.model.user.Student("hi!", "", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase10 = new org.team4.functionality.buy.ItemToPurchase((double) (-1L), (org.team4.model.user.User) student9);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        org.team4.model.user.Faculty faculty20 = new org.team4.model.user.Faculty("hi!", "hi!", "", "", (long) 1, strList18);
        java.util.ArrayList<java.lang.String> strList21 = faculty20.getCourses();
        java.util.ArrayList<java.lang.String> strList22 = faculty20.getCourses();
        student9.setCourses(strList22);
        org.team4.model.user.Student student24 = new org.team4.model.user.Student("ProcessPayment{modes=null, itemToPurchase=null}", "PayPal", "hi!", "hi!", strList22);
        student24.setPassword("PayPal{email='hi!'}");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("Mobile Wallet", "PayPal");
        java.lang.String str3 = subscribeNewsletter2.getEmail();
        org.team4.functionality.buy.ItemPurchased itemPurchased7 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date8 = itemPurchased7.getDatePurchased();
        java.util.Date date9 = itemPurchased7.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased12 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date13 = itemPurchased12.getDatePurchased();
        org.team4.model.course.Course course16 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date9, date13, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        subscribeNewsletter2.setDateDue(date9);
        org.team4.functionality.buy.ItemPurchased itemPurchased24 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date25 = itemPurchased24.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased26 = new org.team4.functionality.buy.ItemPurchased("Mobile Wallet", "", date25);
        org.team4.functionality.buy.ItemPurchased itemPurchased30 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date31 = itemPurchased30.getDatePurchased();
        java.util.Date date32 = itemPurchased30.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased36 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date37 = itemPurchased36.getDatePurchased();
        java.util.Date date38 = itemPurchased36.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased41 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date42 = itemPurchased41.getDatePurchased();
        org.team4.model.course.Course course45 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date38, date42, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.course.Course course48 = new org.team4.model.course.Course("PayPal{email='hi!'}", date32, date38, "Mobile Wallet", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
        org.team4.model.items.RentedItem rentedItem49 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "PayPal", date25, date32);
        subscribeNewsletter2.setDateSubscribed(date25);
        java.util.Date date51 = subscribeNewsletter2.getDateDue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PayPal" + "'", str3, "PayPal");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date38);
// flaky:         org.junit.Assert.assertEquals(date38.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date51);
// flaky:         org.junit.Assert.assertEquals(date51.toString(), "Fri Mar 29 00:42:06 EDT 2024");
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.Course course1 = null;
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder2 = courseTextBookBuilder0.course(course1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder2.title("hi!");
        org.team4.model.course.CourseTextBook courseTextBook5 = courseTextBookBuilder2.build();
        courseTextBook5.setRentable(true);
        org.junit.Assert.assertNotNull(courseTextBookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBook5);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        org.team4.model.course.Course course13 = new org.team4.model.course.Course("", date9, date10, "", "hi!");
        java.util.Date date14 = course13.getStartDate();
        java.lang.String str15 = course13.getProfessorEmail();
        org.team4.model.user.Student student21 = new org.team4.model.user.Student("hi!", "hi!", "", "", true);
        course13.enrollStudent(student21);
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        org.team4.model.user.Faculty faculty37 = new org.team4.model.user.Faculty("hi!", "hi!", "", "", (long) 1, strList35);
        org.team4.model.user.Faculty faculty38 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "Mobile Wallet", "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (long) (byte) 100, strList35);
        student21.setCourses(strList35);
        org.team4.model.user.Student student40 = new org.team4.model.user.Student("Debit Card", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", strList35);
        org.team4.model.user.Student student41 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:03 EDT 2024, dateDue=Mon Apr 29 00:42:03 EDT 2024}", "", "Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:42:05 EDT 2024, end date=Fri Mar 29 00:42:05 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]", "", strList35);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder7 = dVDItemBuilder4.quantity((int) (byte) -1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder9 = dVDItemBuilder7.title("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dVDItemBuilder7);
        org.junit.Assert.assertNotNull(dVDItemBuilder9);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        java.util.Date date8 = null;
        java.util.Date date9 = null;
        org.team4.model.course.Course course12 = new org.team4.model.course.Course("", date8, date9, "", "hi!");
        org.team4.model.course.CourseTextBook courseTextBook14 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", 10, "hi!", "", (int) (byte) -1, course12, false);
        java.lang.String str15 = courseTextBook1.getTitle();
        org.team4.model.course.Course course16 = courseTextBook1.getCourse();
        boolean boolean17 = courseTextBook1.hasHardCopy();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator18 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        boolean boolean19 = purchasableItemDecorator18.isPurchasable();
        purchasableItemDecorator18.setRentable(true);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(course16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.items.RentedItem rentedItem4 = new org.team4.model.items.RentedItem("", "hi!", date2, date3);
        java.util.Date date5 = null;
        rentedItem4.setRentDate(date5);
        java.lang.String str7 = rentedItem4.getISBN();
        java.util.Date date8 = rentedItem4.getDueDate();
        java.util.Date date9 = rentedItem4.getDueDate();
        java.util.Date date10 = null;
        rentedItem4.setDueDate(date10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.Course course1 = null;
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder2 = courseTextBookBuilder0.course(course1);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder4 = courseTextBookBuilder2.isVirtual(false);
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder2.hasHardCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = bookBuilder6.hasHardCopy(false);
        org.junit.Assert.assertNotNull(courseTextBookBuilder2);
        org.junit.Assert.assertNotNull(courseTextBookBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        java.lang.String str6 = courseTextBook1.getGenre();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished((int) (short) -1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder4 = magazineBuilder0.price((double) 0.0f);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineItemBuilder4);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "");
        subscribeNewsletter2.setTitle("Course [course name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:42:04 EDT 2024, end date=Fri Mar 29 00:42:04 EDT 2024, ISBN=, email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}]");
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]", (int) (byte) 1, 10);
        boolean boolean4 = creditCard3.correctLength();
        boolean boolean5 = creditCard3.correctLength();
        boolean boolean6 = creditCard3.notExpired();
        org.team4.model.user.Student student12 = new org.team4.model.user.Student("hi!", "", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase13 = new org.team4.functionality.buy.ItemToPurchase((double) (-1L), (org.team4.model.user.User) student12);
        org.team4.functionality.buy.ProcessPayment processPayment14 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) creditCard3, itemToPurchase13);
        org.team4.model.user.User user15 = itemToPurchase13.getUser();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(user15);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("ItemToPurchase{item=null, user=User [email=hi!, password=, name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, type=ProcessPayment{modes=null, itemToPurchase=null}, validated=false], newsletter=null}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:56 EDT 2024, dateDue=Mon Apr 29 00:41:56 EDT 2024}", "PayPal{email='PayPal{email='hi!'}'}", "Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:42:05 EDT 2024, end date=Fri Mar 29 00:42:05 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]", 7490577L);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.email("PayPal{email='hi!'}");
        org.team4.model.items.BookRequest bookRequest7 = bookRequestBuilder6.build();
        java.lang.String str8 = bookRequest7.getBookType();
        java.lang.String str9 = bookRequest7.getBookType();
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequest7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.Item item9 = new org.team4.model.items.Item((org.team4.model.items.Item) courseTextBook1);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder15 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder17 = courseTextBookBuilder15.hasHardCopy(true);
        java.util.Date date19 = null;
        java.util.Date date20 = null;
        org.team4.model.course.Course course23 = new org.team4.model.course.Course("", date19, date20, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder24 = courseTextBookBuilder15.course(course23);
        org.team4.model.course.CourseTextBook courseTextBook26 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}", (int) '#', "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "", (int) (byte) 0, course23, false);
        java.lang.String str27 = courseTextBook26.getAuthor();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookBuilder17);
        org.junit.Assert.assertNotNull(courseTextBookBuilder24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str27, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) (short) -1);
        double double4 = newsletter3.getPrice();
        org.team4.model.user.Manager manager9 = new org.team4.model.user.Manager("hi!", "hi!", "hi!", "");
        manager9.setType("");
        long long12 = manager9.getManagerID();
        manager9.setManagerID((long) (-1));
        org.team4.functionality.buy.ItemToPurchase itemToPurchase15 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) manager9);
        org.team4.model.user.User user16 = itemToPurchase15.getUser();
        org.team4.model.user.User user17 = itemToPurchase15.getUser();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user17);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        java.lang.String str2 = courseTextBook1.getPublisher();
        org.team4.model.items.DVD dVD5 = new org.team4.model.items.DVD((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) 1L);
        boolean boolean6 = dVD5.isRentable();
        double double7 = dVD5.getDuration();
        int int8 = dVD5.getQuantity();
        java.lang.String str9 = dVD5.getGenre();
        double double10 = dVD5.getDuration();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str9, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder2 = magazineBuilder0.issueNumber((int) (byte) 0);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        org.junit.Assert.assertNotNull(magazineBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:01 EDT 2024, dateDue=Mon Apr 29 00:42:01 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:59 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:02 EDT 2024, dateDue=Mon Apr 29 00:42:02 EDT 2024}", (int) '#', "Credit Card");
        java.lang.String str7 = bookRequest6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}" + "'", str7, "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        org.team4.model.user.Faculty faculty10 = new org.team4.model.user.Faculty("hi!", "hi!", "", "", (long) 1, strList8);
        long long11 = faculty10.getFacultyID();
        faculty10.setFacultyID((long) (byte) 1);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase14 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) faculty10);
        long long15 = faculty10.getFacultyID();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("", "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
        faculty4.setType("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator9 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        boolean boolean10 = courseTextBook1.isRentable();
        java.lang.String str11 = courseTextBook1.getGenre();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder12 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook13 = courseTextBookBuilder12.build();
        java.util.Date date20 = null;
        java.util.Date date21 = null;
        org.team4.model.course.Course course24 = new org.team4.model.course.Course("", date20, date21, "", "hi!");
        org.team4.model.course.CourseTextBook courseTextBook26 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook13, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", 10, "hi!", "", (int) (byte) -1, course24, false);
        java.lang.String str27 = courseTextBook13.getTitle();
        org.team4.model.course.Course course28 = courseTextBook13.getCourse();
        boolean boolean29 = courseTextBook13.hasHardCopy();
        java.lang.String str30 = courseTextBook13.getAuthor();
        boolean boolean31 = courseTextBook13.hasHardCopy();
        boolean boolean32 = courseTextBook1.equals((java.lang.Object) courseTextBook13);
        org.team4.model.user.Student student38 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "Mobile Wallet", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "", false);
        java.lang.String str39 = student38.getEmail();
        // The following exception was thrown during execution in test generation
        try {
            courseTextBook13.makeCopies(student38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.team4.model.course.Course.isEnrolled(org.team4.model.user.Student)\" because \"this.course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(courseTextBook13);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(course28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str39, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.items.RentedItem rentedItem4 = new org.team4.model.items.RentedItem("", "hi!", date2, date3);
        rentedItem4.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem4.setTitle("hi!");
        java.util.Date date9 = rentedItem4.getRentDate();
        rentedItem4.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        rentedItem4.setISBN("PayPal");
        java.lang.String str14 = rentedItem4.getTitle();
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.items.RentedItem rentedItem4 = new org.team4.model.items.RentedItem("", "hi!", date2, date3);
        rentedItem4.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem4.setTitle("hi!");
        java.util.Date date9 = rentedItem4.getDueDate();
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("ItemToPurchase{item=null, user=User [email=hi!, password=, name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, type=ProcessPayment{modes=null, itemToPurchase=null}, validated=false], newsletter=null}", "User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, type=, validated=false]", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:56 EDT 2024, dateDue=Mon Apr 29 00:41:56 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}", 10, "SubscribeNewsletter{title='hi!', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}', dateSubscribed=null, dateDue=null}");
        java.lang.String str7 = bookRequest6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ItemToPurchase{item=null, user=User [email=hi!, password=, name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, type=ProcessPayment{modes=null, itemToPurchase=null}, validated=false], newsletter=null}" + "'", str7, "ItemToPurchase{item=null, user=User [email=hi!, password=, name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, type=ProcessPayment{modes=null, itemToPurchase=null}, validated=false], newsletter=null}");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("PayPal{email='hi!'}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) '4');
        org.team4.model.user.Faculty faculty8 = new org.team4.model.user.Faculty("hi!", "hi!", "hi!", "hi!");
        faculty8.setFacultyID((long) 0);
        java.lang.String[] strArray15 = new java.lang.String[] { "ProcessPayment{modes=null, itemToPurchase=null}", "ProcessPayment{modes=null, itemToPurchase=null}", "hi!", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        faculty8.setCourses(strList16);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase19 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) faculty8);
        java.lang.String str20 = newsletter3.getLink();
        java.lang.String str21 = newsletter3.getTitle();
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str20, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PayPal{email='hi!'}" + "'", str21, "PayPal{email='hi!'}");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.hasHardCopy(true);
        java.util.Date date4 = null;
        java.util.Date date5 = null;
        org.team4.model.course.Course course8 = new org.team4.model.course.Course("", date4, date5, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder9 = courseTextBookBuilder0.course(course8);
        java.util.Date date11 = null;
        java.util.Date date12 = null;
        org.team4.model.course.Course course15 = new org.team4.model.course.Course("", date11, date12, "", "hi!");
        java.util.Date date16 = course15.getStartDate();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder17 = courseTextBookBuilder9.course(course15);
        org.team4.model.course.CourseTextBook courseTextBook18 = courseTextBookBuilder17.build();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(courseTextBookBuilder9);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNotNull(courseTextBookBuilder17);
        org.junit.Assert.assertNotNull(courseTextBook18);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("PayPal{email='hi!'}", (int) (byte) 10, (int) (short) 1);
        boolean boolean4 = debitCard3.isValid();
        boolean boolean5 = debitCard3.isValid();
        boolean boolean6 = debitCard3.notExpired();
        boolean boolean7 = debitCard3.notExpired();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("", date1, date2, "hi!", "hi!");
        java.util.Date date6 = course5.getEndDate();
        org.team4.model.user.Student student12 = new org.team4.model.user.Student("User [email=hi!, password=hi!, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}', dateSubscribed=Fri Mar 29 00:42:00 EDT 2024, dateDue=Mon Apr 29 00:42:00 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}", "", true);
        boolean boolean13 = course5.isEnrolled(student12);
        java.util.ArrayList<java.lang.String> strList14 = student12.getCourses();
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strList14);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.Magazine magazine1 = magazineBuilder0.build();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder3 = magazineBuilder0.publisher("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.model.items.Magazine magazine4 = magazineBuilder3.build();
        org.junit.Assert.assertNotNull(magazine1);
        org.junit.Assert.assertNotNull(magazineBuilder3);
        org.junit.Assert.assertNotNull(magazine4);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        boolean boolean2 = courseTextBook1.isPurchasable();
        courseTextBook1.setPrice((double) (-1.0f));
        java.lang.String str5 = courseTextBook1.getISBN();
        boolean boolean6 = courseTextBook1.hasSoftCopy();
        org.team4.model.items.Magazine magazine9 = new org.team4.model.items.Magazine((org.team4.model.items.Item) courseTextBook1, "ItemPurchased{title='', email='hi!', datePurchased=null}", 1);
        magazine9.setPurchaseable(false);
        int int12 = magazine9.getIssueNumber();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("PayPal{email='hi!'}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) '4');
        org.team4.model.user.Faculty faculty9 = new org.team4.model.user.Faculty("hi!", "hi!", "hi!", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", false);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase10 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) faculty9);
        java.util.Date date12 = null;
        java.util.Date date13 = null;
        org.team4.model.course.Course course16 = new org.team4.model.course.Course("", date12, date13, "", "hi!");
        org.team4.model.user.Student student22 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "Mobile Wallet", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "", false);
        course16.enrollStudent(student22);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase24 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) student22);
        student22.setEmail("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:59 EDT 2024}");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished((int) (short) -1);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.publisher("");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder6 = magazineBuilder0.publisher("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder8 = magazineBuilder6.publisher("ProcessPayment{modes=null, itemToPurchase=null}");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineBuilder6);
        org.junit.Assert.assertNotNull(magazineBuilder8);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        org.team4.model.items.RentedItem rentedItem8 = new org.team4.model.items.RentedItem("", "hi!", date6, date7);
        rentedItem8.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem8.setTitle("hi!");
        java.util.Date date13 = rentedItem8.getRentDate();
        org.team4.functionality.buy.ItemPurchased itemPurchased17 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date18 = itemPurchased17.getDatePurchased();
        java.util.Date date19 = itemPurchased17.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased22 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date23 = itemPurchased22.getDatePurchased();
        org.team4.model.course.Course course26 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date19, date23, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem8.setRentDate(date19);
        rentedItem8.setISBN("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}");
        java.util.Date date30 = rentedItem8.getRentDate();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter34 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "");
        java.lang.String str35 = subscribeNewsletter34.toString();
        java.util.Date date36 = null;
        subscribeNewsletter34.setDateDue(date36);
        java.util.Date date40 = null;
        java.util.Date date41 = null;
        org.team4.model.items.RentedItem rentedItem42 = new org.team4.model.items.RentedItem("", "hi!", date40, date41);
        rentedItem42.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem42.setTitle("hi!");
        java.util.Date date47 = rentedItem42.getRentDate();
        org.team4.functionality.buy.ItemPurchased itemPurchased51 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date52 = itemPurchased51.getDatePurchased();
        java.util.Date date53 = itemPurchased51.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased56 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date57 = itemPurchased56.getDatePurchased();
        org.team4.model.course.Course course60 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date53, date57, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem42.setRentDate(date53);
        subscribeNewsletter34.setDateSubscribed(date53);
        java.util.Date date65 = null;
        java.util.Date date66 = null;
        org.team4.model.items.RentedItem rentedItem67 = new org.team4.model.items.RentedItem("", "hi!", date65, date66);
        java.lang.String str68 = rentedItem67.getISBN();
        java.util.Date date69 = null;
        rentedItem67.setDueDate(date69);
        rentedItem67.setISBN("PayPal");
        org.team4.functionality.buy.ItemPurchased itemPurchased76 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date77 = itemPurchased76.getDatePurchased();
        java.util.Date date78 = itemPurchased76.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased81 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date82 = itemPurchased81.getDatePurchased();
        org.team4.model.course.Course course85 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date78, date82, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem67.setDueDate(date78);
        org.team4.model.course.Course course89 = new org.team4.model.course.Course("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", date53, date78, "Mobile Wallet", "hi!");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter90 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}", date30, date53);
        org.team4.functionality.buy.ItemPurchased itemPurchased91 = new org.team4.functionality.buy.ItemPurchased("Credit Card", "PayPal{email='hi!'}", date30);
        java.lang.String str92 = itemPurchased91.getTitle();
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date30);
// flaky:         org.junit.Assert.assertEquals(date30.toString(), "Fri Mar 29 00:42:06 EDT 2024");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:06 EDT 2024, dateDue=Mon Apr 29 00:42:06 EDT 2024}" + "'", str35, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:06 EDT 2024, dateDue=Mon Apr 29 00:42:06 EDT 2024}");
        org.junit.Assert.assertNull(date47);
        org.junit.Assert.assertNotNull(date52);
// flaky:         org.junit.Assert.assertEquals(date52.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date53);
// flaky:         org.junit.Assert.assertEquals(date53.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date57);
// flaky:         org.junit.Assert.assertEquals(date57.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertNotNull(date77);
// flaky:         org.junit.Assert.assertEquals(date77.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date78);
// flaky:         org.junit.Assert.assertEquals(date78.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date82);
// flaky:         org.junit.Assert.assertEquals(date82.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "Credit Card" + "'", str92, "Credit Card");
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        boolean boolean1 = org.team4.utils.EmailValidator.validEmail("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("hi!", "hi!", "hi!", "hi!");
        faculty4.setFacultyID((long) (byte) -1);
        faculty4.setFacultyID((long) '4');
        faculty4.setPassword("");
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        org.team4.model.user.Faculty faculty24 = new org.team4.model.user.Faculty("hi!", "hi!", "", "", (long) 1, strList22);
        faculty24.setFacultyID(10L);
        java.util.ArrayList<java.lang.String> strList27 = faculty24.getCourses();
        org.team4.model.user.Student student28 = new org.team4.model.user.Student("PayPal", "hi!", "User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, type=, validated=false]", "ProcessPayment{modes=PayPal{email='hi!'}, itemToPurchase=ItemToPurchase{item=null, user=User [email=hi!, password=hi!, name=hi!, type=hi!, validated=false], newsletter=null}}", strList27);
        faculty4.setCourses(strList27);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strList27);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.team4.functionality.buy.ItemPurchased itemPurchased2 = new org.team4.functionality.buy.ItemPurchased("", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}");
        java.lang.String str3 = itemPurchased2.getTitle();
        java.util.Date date4 = itemPurchased2.getDatePurchased();
        java.lang.String str5 = itemPurchased2.getTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter4 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!", date2, date3);
        subscribeNewsletter4.setTitle("PayPal");
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        org.team4.model.items.RentedItem rentedItem11 = new org.team4.model.items.RentedItem("", "hi!", date9, date10);
        rentedItem11.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem11.setTitle("hi!");
        java.util.Date date16 = rentedItem11.getRentDate();
        rentedItem11.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.functionality.buy.ItemPurchased itemPurchased22 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date23 = itemPurchased22.getDatePurchased();
        java.util.Date date24 = itemPurchased22.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased27 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date28 = itemPurchased27.getDatePurchased();
        org.team4.model.course.Course course31 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date24, date28, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem11.setDueDate(date28);
        subscribeNewsletter4.setDateDue(date28);
        org.team4.functionality.buy.ItemPurchased itemPurchased37 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date38 = itemPurchased37.getDatePurchased();
        java.util.Date date39 = itemPurchased37.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased42 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date43 = itemPurchased42.getDatePurchased();
        org.team4.model.course.Course course46 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date39, date43, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        subscribeNewsletter4.setDateSubscribed(date43);
        subscribeNewsletter4.setTitle("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}");
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date24);
// flaky:         org.junit.Assert.assertEquals(date24.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date38);
// flaky:         org.junit.Assert.assertEquals(date38.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date43);
// flaky:         org.junit.Assert.assertEquals(date43.toString(), "Fri Mar 29 00:42:06 EDT 2024");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.Item item9 = new org.team4.model.items.Item((org.team4.model.items.Item) courseTextBook1);
        org.team4.model.items.DVD dVD12 = new org.team4.model.items.DVD(item9, "User [email=, password=Mobile Wallet, name=PayPal, type=PayPal, validated=false]", (double) 5765543L);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:01 EDT 2024, dateDue=Mon Apr 29 00:42:01 EDT 2024}", (int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        java.util.Date date4 = null;
        java.util.Date date5 = null;
        org.team4.model.items.RentedItem rentedItem6 = new org.team4.model.items.RentedItem("", "hi!", date4, date5);
        java.lang.String str7 = rentedItem6.getISBN();
        org.team4.functionality.buy.ItemPurchased itemPurchased11 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date12 = itemPurchased11.getDatePurchased();
        java.util.Date date13 = itemPurchased11.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased16 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date17 = itemPurchased16.getDatePurchased();
        org.team4.model.course.Course course20 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date13, date17, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem6.setDueDate(date13);
        org.team4.functionality.buy.ItemPurchased itemPurchased22 = new org.team4.functionality.buy.ItemPurchased("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:02 EDT 2024, dateDue=Mon Apr 29 00:42:02 EDT 2024}", date13);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Fri Mar 29 00:42:06 EDT 2024");
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "PayPal", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", (int) (byte) 10, "");
        java.lang.String str7 = bookRequest6.getISBN();
        java.lang.String str8 = bookRequest6.getISBN();
        java.lang.String str9 = bookRequest6.getBookType();
        int int10 = bookRequest6.getEdition();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}" + "'", str7, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}" + "'", str8, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.Course course1 = null;
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder2 = courseTextBookBuilder0.course(course1);
        org.team4.model.items.builder.BookBuilder bookBuilder4 = courseTextBookBuilder0.hasHardCopy(false);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder6 = courseTextBookBuilder0.price((double) (short) 0);
        org.team4.model.course.CourseTextBook courseTextBook7 = courseTextBookBuilder0.build();
        int int8 = courseTextBook7.getNoOfPages();
        org.junit.Assert.assertNotNull(courseTextBookBuilder2);
        org.junit.Assert.assertNotNull(bookBuilder4);
        org.junit.Assert.assertNotNull(bookItemBuilder6);
        org.junit.Assert.assertNotNull(courseTextBook7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.team4.functionality.buy.ItemPurchased itemPurchased2 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.lang.String str3 = itemPurchased2.toString();
        java.lang.String str4 = itemPurchased2.getEmail();
        java.lang.String str5 = itemPurchased2.getEmail();
        java.lang.String str6 = itemPurchased2.toString();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:42:06 EDT 2024}" + "'", str3, "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:42:06 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:42:06 EDT 2024}" + "'", str6, "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:42:06 EDT 2024}");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.Course course1 = null;
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder2 = courseTextBookBuilder0.course(course1);
        org.team4.model.items.builder.BookBuilder bookBuilder4 = courseTextBookBuilder0.hasHardCopy(false);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder6 = courseTextBookBuilder0.price((double) (short) 0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = bookItemBuilder6.quantity(10);
        org.junit.Assert.assertNotNull(courseTextBookBuilder2);
        org.junit.Assert.assertNotNull(bookBuilder4);
        org.junit.Assert.assertNotNull(bookItemBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.team4.model.user.User user6 = new org.team4.model.user.User("hi!", "", "hi!", "", true);
        user6.setName("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase9 = new org.team4.functionality.buy.ItemToPurchase((double) (short) -1, user6);
        org.team4.model.paymentmodes.PayPal payPal11 = new org.team4.model.paymentmodes.PayPal("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase12 = null;
        org.team4.functionality.buy.ProcessPayment processPayment13 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) payPal11, itemToPurchase12);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete14 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase9, (org.team4.model.paymentmodes.PaymentValidator) payPal11);
        org.team4.model.items.Newsletter newsletter15 = itemToPurchase9.getNewsletter();
        org.junit.Assert.assertNull(newsletter15);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        boolean boolean3 = courseTextBook1.equals((java.lang.Object) (byte) 1);
        java.lang.String str4 = courseTextBook1.getTitle();
        org.team4.model.course.Course course5 = courseTextBook1.getCourse();
        boolean boolean7 = courseTextBook1.equals((java.lang.Object) 100);
        java.util.List<org.team4.model.user.Student> studentList8 = courseTextBook1.getStudentsWithCopies();
        java.lang.String str9 = courseTextBook1.getAuthor();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(course5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(studentList8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder2 = magazineBuilder0.issueNumber((int) (byte) 0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder4 = magazineBuilder2.yearPublished((int) (short) 100);
        org.junit.Assert.assertNotNull(magazineBuilder2);
        org.junit.Assert.assertNotNull(magazineItemBuilder4);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.items.RentedItem rentedItem4 = new org.team4.model.items.RentedItem("", "hi!", date2, date3);
        rentedItem4.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem4.setTitle("hi!");
        java.util.Date date9 = rentedItem4.getRentDate();
        org.team4.functionality.buy.ItemPurchased itemPurchased13 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date14 = itemPurchased13.getDatePurchased();
        java.util.Date date15 = itemPurchased13.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased18 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date19 = itemPurchased18.getDatePurchased();
        org.team4.model.course.Course course22 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date15, date19, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem4.setRentDate(date15);
        java.util.Date date24 = rentedItem4.getRentDate();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter27 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "");
        java.lang.String str28 = subscribeNewsletter27.toString();
        java.util.Date date29 = subscribeNewsletter27.getDateSubscribed();
        rentedItem4.setDueDate(date29);
        java.lang.String str31 = rentedItem4.getTitle();
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date24);
// flaky:         org.junit.Assert.assertEquals(date24.toString(), "Fri Mar 29 00:42:06 EDT 2024");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:06 EDT 2024, dateDue=Mon Apr 29 00:42:06 EDT 2024}" + "'", str28, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:06 EDT 2024, dateDue=Mon Apr 29 00:42:06 EDT 2024}");
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.Course course1 = null;
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder2 = courseTextBookBuilder0.course(course1);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder4 = courseTextBookBuilder2.isVirtual(false);
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder4.noOfPages((int) '4');
        org.team4.model.items.builder.BookBuilder bookBuilder8 = bookBuilder6.genre("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}");
        org.junit.Assert.assertNotNull(courseTextBookBuilder2);
        org.junit.Assert.assertNotNull(courseTextBookBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:42:04 EDT 2024}", "PayPal{email='hi!'}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:03 EDT 2024, dateDue=Mon Apr 29 00:42:03 EDT 2024}", true);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("User [email=Mobile Wallet, password=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, name=, type=User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, name=hi!, type=, validated=false], validated=false]", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:03 EDT 2024, dateDue=Mon Apr 29 00:42:03 EDT 2024}", "ItemPurchased{title='', email='ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}', datePurchased=Fri Mar 29 00:42:01 EDT 2024}", "Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]", false);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder3 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder5 = courseTextBookBuilder0.isVirtual(false);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder6.hasHardCopy(true);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        org.team4.model.course.Course course14 = new org.team4.model.course.Course("", date10, date11, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder15 = courseTextBookBuilder6.course(course14);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder16 = courseTextBookBuilder5.course(course14);
        java.lang.String str17 = course14.getProfessorEmail();
        java.lang.String str18 = course14.getProfessorEmail();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(bookBuilder3);
        org.junit.Assert.assertNotNull(courseTextBookBuilder5);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(courseTextBookBuilder15);
        org.junit.Assert.assertNotNull(courseTextBookBuilder16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        java.lang.String str9 = courseTextBook1.getISBN();
        org.team4.model.items.decorator.ItemDecorator itemDecorator10 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook1);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder11 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook12 = courseTextBookBuilder11.build();
        java.util.Date date19 = null;
        java.util.Date date20 = null;
        org.team4.model.course.Course course23 = new org.team4.model.course.Course("", date19, date20, "", "hi!");
        org.team4.model.course.CourseTextBook courseTextBook25 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook12, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", 10, "hi!", "", (int) (byte) -1, course23, false);
        java.lang.String str26 = courseTextBook12.getTitle();
        org.team4.model.course.Course course27 = courseTextBook12.getCourse();
        boolean boolean28 = courseTextBook12.hasHardCopy();
        org.team4.model.course.Course course29 = courseTextBook12.getCourse();
        boolean boolean30 = courseTextBook12.isRentable();
        boolean boolean31 = courseTextBook12.hasHardCopy();
        boolean boolean32 = itemDecorator10.equals((java.lang.Object) courseTextBook12);
        org.team4.model.items.Book book40 = new org.team4.model.items.Book((org.team4.model.items.Item) courseTextBook12, "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:59 EDT 2024}", (int) (short) 10, "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}", "SubscribeNewsletter{title='hi!', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}', dateSubscribed=null, dateDue=null}", (int) (short) 100, true, true);
        boolean boolean41 = book40.hasSoftCopy();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseTextBook12);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(course27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(course29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = visitor5.getName();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        visitor5.setType("hi!");
        visitor5.setValidated(true);
        visitor5.setEmail("Mobile Wallet");
        visitor5.setType("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:59 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.hasHardCopy(true);
        java.util.Date date4 = null;
        java.util.Date date5 = null;
        org.team4.model.course.Course course8 = new org.team4.model.course.Course("", date4, date5, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder9 = courseTextBookBuilder0.course(course8);
        java.util.Date date10 = course8.getStartDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = course8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.toString()\" because \"this.startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(courseTextBookBuilder9);
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:01 EDT 2024, dateDue=Mon Apr 29 00:42:01 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", (long) 1);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.team4.model.user.User user6 = new org.team4.model.user.User("hi!", "", "hi!", "", true);
        user6.setName("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase9 = new org.team4.functionality.buy.ItemToPurchase((double) (short) -1, user6);
        org.team4.model.paymentmodes.PayPal payPal11 = new org.team4.model.paymentmodes.PayPal("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase12 = null;
        org.team4.functionality.buy.ProcessPayment processPayment13 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) payPal11, itemToPurchase12);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete14 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase9, (org.team4.model.paymentmodes.PaymentValidator) payPal11);
        org.team4.model.items.Item item15 = purchaseComplete14.getItem();
        double double16 = purchaseComplete14.getAmount();
        double double17 = purchaseComplete14.getAmount();
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='hi!', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}', dateSubscribed=null, dateDue=null}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        org.team4.model.items.RentedItem rentedItem9 = new org.team4.model.items.RentedItem("", "hi!", date7, date8);
        rentedItem9.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem9.setTitle("hi!");
        java.util.Date date14 = rentedItem9.getRentDate();
        rentedItem9.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.functionality.buy.ItemPurchased itemPurchased20 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date21 = itemPurchased20.getDatePurchased();
        java.util.Date date22 = itemPurchased20.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased25 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date26 = itemPurchased25.getDatePurchased();
        org.team4.model.course.Course course29 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date22, date26, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem9.setDueDate(date26);
        org.team4.functionality.buy.ItemPurchased itemPurchased31 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=null}", date26);
        subscribeNewsletter2.setDateSubscribed(date26);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date26);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Fri Mar 29 00:42:06 EDT 2024");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        org.team4.model.user.Faculty faculty9 = new org.team4.model.user.Faculty("hi!", "hi!", "", "", (long) 1, strList7);
        java.util.ArrayList<java.lang.String> strList10 = faculty9.getCourses();
        java.util.ArrayList<java.lang.String> strList11 = faculty9.getCourses();
        faculty9.setName("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}");
        faculty9.setName("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:59 EDT 2024, dateDue=Mon Apr 29 00:41:59 EDT 2024}");
        faculty9.setFacultyID(10L);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("Credit Card", "Book{genre='null', noOfPages=0, author='null', ISBN=null, publisher='null', edition='0'}", "ProcessPayment{modes=PayPal{email='hi!'}, itemToPurchase=ItemToPurchase{item=null, user=User [email=hi!, password=hi!, name=hi!, type=hi!, validated=false], newsletter=null}}", "PayPal{email='PayPal{email='hi!'}'}");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder3 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder5 = courseTextBookBuilder0.isVirtual(false);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder6.hasHardCopy(true);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        org.team4.model.course.Course course14 = new org.team4.model.course.Course("", date10, date11, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder15 = courseTextBookBuilder6.course(course14);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder16 = courseTextBookBuilder5.course(course14);
        org.team4.model.items.builder.BookBuilder bookBuilder18 = courseTextBookBuilder16.hasHardCopy(false);
        org.team4.model.items.builder.BookBuilder bookBuilder20 = courseTextBookBuilder16.genre("PayPal");
        org.team4.functionality.buy.ItemPurchased itemPurchased24 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date25 = itemPurchased24.getDatePurchased();
        java.util.Date date26 = itemPurchased24.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased29 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date30 = itemPurchased29.getDatePurchased();
        org.team4.model.course.Course course33 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date26, date30, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder34 = courseTextBookBuilder16.course(course33);
        java.util.Date date35 = course33.getStartDate();
        java.lang.String str36 = course33.getCourseName();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(bookBuilder3);
        org.junit.Assert.assertNotNull(courseTextBookBuilder5);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(courseTextBookBuilder15);
        org.junit.Assert.assertNotNull(courseTextBookBuilder16);
        org.junit.Assert.assertNotNull(bookBuilder18);
        org.junit.Assert.assertNotNull(bookBuilder20);
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date26);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date30);
// flaky:         org.junit.Assert.assertEquals(date30.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(courseTextBookBuilder34);
        org.junit.Assert.assertNotNull(date35);
// flaky:         org.junit.Assert.assertEquals(date35.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}" + "'", str36, "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.team4.model.user.User user4 = new org.team4.model.user.User("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:59 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "hi!", "ItemPurchased{title='', email='hi!', datePurchased=null}");
        java.lang.String str5 = user4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [email=ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:59 EDT 2024}, password=ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}, name=hi!, type=ItemPurchased{title='', email='hi!', datePurchased=null}, validated=false]" + "'", str5, "User [email=ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:59 EDT 2024}, password=ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}, name=hi!, type=ItemPurchased{title='', email='hi!', datePurchased=null}, validated=false]");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        java.lang.String str9 = courseTextBook1.getISBN();
        org.team4.model.items.decorator.ItemDecorator itemDecorator10 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook1);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder11 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook12 = courseTextBookBuilder11.build();
        java.util.Date date19 = null;
        java.util.Date date20 = null;
        org.team4.model.course.Course course23 = new org.team4.model.course.Course("", date19, date20, "", "hi!");
        org.team4.model.course.CourseTextBook courseTextBook25 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook12, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", 10, "hi!", "", (int) (byte) -1, course23, false);
        java.lang.String str26 = courseTextBook12.getTitle();
        org.team4.model.course.Course course27 = courseTextBook12.getCourse();
        boolean boolean28 = courseTextBook12.hasHardCopy();
        org.team4.model.course.Course course29 = courseTextBook12.getCourse();
        boolean boolean30 = courseTextBook12.isRentable();
        boolean boolean31 = courseTextBook12.hasHardCopy();
        boolean boolean32 = itemDecorator10.equals((java.lang.Object) courseTextBook12);
        org.team4.model.course.Course course33 = courseTextBook12.getCourse();
        boolean boolean34 = courseTextBook12.isRentable();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseTextBook12);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(course27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(course29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(course33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]", (int) (byte) 1, 10);
        boolean boolean4 = creditCard3.correctLength();
        java.lang.String str5 = creditCard3.getMode();
        boolean boolean6 = creditCard3.notExpired();
        java.lang.String str7 = creditCard3.getMode();
        boolean boolean8 = creditCard3.correctLength();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credit Card" + "'", str7, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        java.lang.String str9 = courseTextBook1.getISBN();
        org.team4.model.items.decorator.ItemDecorator itemDecorator10 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook1);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder11 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook12 = courseTextBookBuilder11.build();
        java.util.Date date19 = null;
        java.util.Date date20 = null;
        org.team4.model.course.Course course23 = new org.team4.model.course.Course("", date19, date20, "", "hi!");
        org.team4.model.course.CourseTextBook courseTextBook25 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook12, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", 10, "hi!", "", (int) (byte) -1, course23, false);
        java.lang.String str26 = courseTextBook12.getTitle();
        org.team4.model.course.Course course27 = courseTextBook12.getCourse();
        boolean boolean28 = courseTextBook12.hasHardCopy();
        org.team4.model.course.Course course29 = courseTextBook12.getCourse();
        boolean boolean30 = courseTextBook12.isRentable();
        boolean boolean31 = courseTextBook12.hasHardCopy();
        boolean boolean32 = itemDecorator10.equals((java.lang.Object) courseTextBook12);
        int int33 = courseTextBook12.getEdition();
        org.team4.model.course.Course course34 = courseTextBook12.getCourse();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseTextBook12);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(course27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(course29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(course34);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.BookRequest bookRequest5 = bookRequestBuilder4.build();
        java.lang.String str6 = bookRequest5.getAuthor();
        java.lang.String str7 = bookRequest5.getAuthor();
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.team4.functionality.buy.ItemPurchased itemPurchased6 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date7 = itemPurchased6.getDatePurchased();
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter12 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!", date10, date11);
        subscribeNewsletter12.setTitle("PayPal");
        java.util.Date date17 = null;
        java.util.Date date18 = null;
        org.team4.model.items.RentedItem rentedItem19 = new org.team4.model.items.RentedItem("", "hi!", date17, date18);
        rentedItem19.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem19.setTitle("hi!");
        java.util.Date date24 = rentedItem19.getRentDate();
        rentedItem19.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.functionality.buy.ItemPurchased itemPurchased30 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date31 = itemPurchased30.getDatePurchased();
        java.util.Date date32 = itemPurchased30.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased35 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date36 = itemPurchased35.getDatePurchased();
        org.team4.model.course.Course course39 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date32, date36, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem19.setDueDate(date36);
        subscribeNewsletter12.setDateDue(date36);
        org.team4.model.items.RentedItem rentedItem42 = new org.team4.model.items.RentedItem("PayPal", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", date7, date36);
        org.team4.functionality.buy.ItemPurchased itemPurchased45 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date46 = itemPurchased45.getDatePurchased();
        java.lang.String str47 = itemPurchased45.getEmail();
        java.util.Date date48 = itemPurchased45.getDatePurchased();
        org.team4.model.items.RentedItem rentedItem49 = new org.team4.model.items.RentedItem("", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:56 EDT 2024, dateDue=Mon Apr 29 00:41:56 EDT 2024}", date7, date48);
        java.lang.String str50 = rentedItem49.getTitle();
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNull(date24);
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date36);
// flaky:         org.junit.Assert.assertEquals(date36.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date46);
// flaky:         org.junit.Assert.assertEquals(date46.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(date48);
// flaky:         org.junit.Assert.assertEquals(date48.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:00 EDT 2024, dateDue=Mon Apr 29 00:42:00 EDT 2024}", "Book{genre='null', noOfPages=0, author='null', ISBN=null, publisher='null', edition='0'}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:42:06 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        boolean boolean3 = courseTextBook1.equals((java.lang.Object) (byte) 1);
        java.lang.String str4 = courseTextBook1.getTitle();
        java.lang.String str5 = courseTextBook1.getTitle();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder11 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder13 = courseTextBookBuilder11.hasHardCopy(true);
        java.util.Date date15 = null;
        java.util.Date date16 = null;
        org.team4.model.course.Course course19 = new org.team4.model.course.Course("", date15, date16, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder20 = courseTextBookBuilder11.course(course19);
        org.team4.model.course.CourseTextBook courseTextBook22 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook1, "User [email=hi!, password=hi!, name=hi!, type=, validated=false]", (int) (short) -1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}", (int) (byte) 10, course19, true);
        int int23 = courseTextBook22.getEdition();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(bookBuilder13);
        org.junit.Assert.assertNotNull(courseTextBookBuilder20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished((int) (short) -1);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.publisher("");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder6 = magazineBuilder0.publisher("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineBuilder0.quantity((int) (byte) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder10 = magazineBuilder0.ISBN("PayPal");
        org.team4.model.items.Magazine magazine11 = magazineBuilder0.build();
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
        org.junit.Assert.assertNotNull(magazineItemBuilder10);
        org.junit.Assert.assertNotNull(magazine11);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "ItemToPurchase{item=null, user=User [email=hi!, password=, name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, type=ProcessPayment{modes=null, itemToPurchase=null}, validated=false], newsletter=null}");
        java.util.Date date3 = subscribeNewsletter2.getDateSubscribed();
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Fri Mar 29 00:42:06 EDT 2024");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        purchasableItemDecorator6.setPurchaseable(true);
        int int9 = purchasableItemDecorator6.getQuantity();
        org.team4.model.items.Item item10 = purchasableItemDecorator6.getItem();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator11 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) purchasableItemDecorator6);
        org.team4.model.items.Item item12 = purchasableItemDecorator11.getItem();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertNotNull(item12);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        boolean boolean3 = courseTextBook1.equals((java.lang.Object) (byte) 1);
        java.lang.String str4 = courseTextBook1.getTitle();
        boolean boolean5 = courseTextBook1.hasHardCopy();
        double double6 = courseTextBook1.getPrice();
        int int7 = courseTextBook1.getQuantity();
        org.team4.model.items.Item item8 = new org.team4.model.items.Item((org.team4.model.items.Item) courseTextBook1);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.items.RentedItem rentedItem4 = new org.team4.model.items.RentedItem("", "hi!", date2, date3);
        rentedItem4.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem4.setTitle("hi!");
        java.util.Date date9 = rentedItem4.getRentDate();
        rentedItem4.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.functionality.buy.ItemPurchased itemPurchased15 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date16 = itemPurchased15.getDatePurchased();
        java.util.Date date17 = itemPurchased15.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased20 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date21 = itemPurchased20.getDatePurchased();
        org.team4.model.course.Course course24 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date17, date21, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem4.setDueDate(date21);
        java.util.Date date26 = rentedItem4.getRentDate();
        java.lang.String str27 = rentedItem4.getTitle();
        java.lang.String str28 = rentedItem4.getTitle();
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNull(date26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator9 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) purchasableItemDecorator9);
        boolean boolean11 = rentableItemDecorator10.isPurchasable();
        org.team4.model.items.Item item12 = rentableItemDecorator10.getItem();
        java.lang.String str13 = item12.getTitle();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(item12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]", (int) (byte) 1, 10);
        boolean boolean4 = creditCard3.correctLength();
        boolean boolean5 = creditCard3.correctLength();
        boolean boolean6 = creditCard3.notExpired();
        org.team4.model.user.Student student12 = new org.team4.model.user.Student("hi!", "", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase13 = new org.team4.functionality.buy.ItemToPurchase((double) (-1L), (org.team4.model.user.User) student12);
        org.team4.functionality.buy.ProcessPayment processPayment14 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) creditCard3, itemToPurchase13);
        boolean boolean15 = creditCard3.correctLength();
        boolean boolean16 = creditCard3.correctLength();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("hi!", 100, 100, (double) 10L, "PayPal", false, true);
        org.team4.model.items.Magazine magazine10 = new org.team4.model.items.Magazine(item7, "PayPal{email='PayPal{email='hi!'}'}", (int) 'a');
        int int11 = magazine10.getIssueNumber();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished((int) (short) -1);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber((int) (short) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder6 = magazineBuilder4.issueNumber((int) (byte) -1);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder8 = magazineBuilder6.publisher("User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, password=, name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}, type=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, validated=true]");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineBuilder6);
        org.junit.Assert.assertNotNull(magazineBuilder8);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.team4.model.user.Student student6 = new org.team4.model.user.Student("Mobile Wallet", "", "hi!", "Mobile Wallet", true);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) -1, (org.team4.model.user.User) student6);
        org.team4.model.user.User user8 = itemToPurchase7.getUser();
        org.team4.model.paymentmodes.DebitCard debitCard12 = new org.team4.model.paymentmodes.DebitCard("PayPal{email='hi!'}", 0, (int) (short) 1);
        boolean boolean13 = debitCard12.correctLength();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete14 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) debitCard12);
        java.lang.String str15 = debitCard12.getMode();
        boolean boolean16 = debitCard12.notExpired();
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Debit Card" + "'", str15, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter4 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!", date2, date3);
        subscribeNewsletter4.setTitle("PayPal");
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        org.team4.model.items.RentedItem rentedItem11 = new org.team4.model.items.RentedItem("", "hi!", date9, date10);
        rentedItem11.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem11.setTitle("hi!");
        java.util.Date date16 = rentedItem11.getRentDate();
        rentedItem11.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.functionality.buy.ItemPurchased itemPurchased22 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date23 = itemPurchased22.getDatePurchased();
        java.util.Date date24 = itemPurchased22.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased27 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date28 = itemPurchased27.getDatePurchased();
        org.team4.model.course.Course course31 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date24, date28, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem11.setDueDate(date28);
        subscribeNewsletter4.setDateDue(date28);
        org.team4.functionality.buy.ItemPurchased itemPurchased37 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date38 = itemPurchased37.getDatePurchased();
        java.util.Date date39 = itemPurchased37.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased42 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date43 = itemPurchased42.getDatePurchased();
        org.team4.model.course.Course course46 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date39, date43, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        subscribeNewsletter4.setDateSubscribed(date43);
        java.util.Date date48 = null;
        subscribeNewsletter4.setDateSubscribed(date48);
        java.lang.String str50 = subscribeNewsletter4.getEmail();
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date24);
// flaky:         org.junit.Assert.assertEquals(date24.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date38);
// flaky:         org.junit.Assert.assertEquals(date38.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date43);
// flaky:         org.junit.Assert.assertEquals(date43.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.Course course1 = null;
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder2 = courseTextBookBuilder0.course(course1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder2.title("hi!");
        org.team4.model.course.CourseTextBook courseTextBook5 = courseTextBookBuilder2.build();
        double double6 = courseTextBook5.getPrice();
        courseTextBook5.setRentable(false);
        org.junit.Assert.assertNotNull(courseTextBookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBook5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("Course [course name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:42:05 EDT 2024, end date=Fri Mar 29 00:42:05 EDT 2024, ISBN=, email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}]", (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        java.lang.String str9 = courseTextBook1.getISBN();
        org.team4.model.items.decorator.ItemDecorator itemDecorator10 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook1);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder11 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook12 = courseTextBookBuilder11.build();
        java.util.Date date19 = null;
        java.util.Date date20 = null;
        org.team4.model.course.Course course23 = new org.team4.model.course.Course("", date19, date20, "", "hi!");
        org.team4.model.course.CourseTextBook courseTextBook25 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook12, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", 10, "hi!", "", (int) (byte) -1, course23, false);
        java.lang.String str26 = courseTextBook12.getTitle();
        org.team4.model.course.Course course27 = courseTextBook12.getCourse();
        boolean boolean28 = courseTextBook12.hasHardCopy();
        org.team4.model.course.Course course29 = courseTextBook12.getCourse();
        boolean boolean30 = courseTextBook12.isRentable();
        boolean boolean31 = courseTextBook12.hasHardCopy();
        boolean boolean32 = itemDecorator10.equals((java.lang.Object) courseTextBook12);
        org.team4.model.items.Book book40 = new org.team4.model.items.Book((org.team4.model.items.Item) courseTextBook12, "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:59 EDT 2024}", (int) (short) 10, "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}", "SubscribeNewsletter{title='hi!', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}', dateSubscribed=null, dateDue=null}", (int) (short) 100, true, true);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder41 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook42 = courseTextBookBuilder41.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder43 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder45 = dVDBuilder43.price((double) 'a');
        boolean boolean46 = courseTextBook42.equals((java.lang.Object) dVDItemBuilder45);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator47 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook42);
        courseTextBook42.setPrice((double) (byte) 100);
        org.team4.model.items.Item item50 = new org.team4.model.items.Item((org.team4.model.items.Item) courseTextBook42);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder56 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder58 = courseTextBookBuilder56.hasHardCopy(true);
        java.util.Date date60 = null;
        java.util.Date date61 = null;
        org.team4.model.course.Course course64 = new org.team4.model.course.Course("", date60, date61, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder65 = courseTextBookBuilder56.course(course64);
        org.team4.model.course.CourseTextBook courseTextBook67 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook42, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}", (int) '#', "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "", (int) (byte) 0, course64, false);
        java.util.Date date69 = null;
        java.util.Date date70 = null;
        org.team4.model.course.Course course73 = new org.team4.model.course.Course("", date69, date70, "", "hi!");
        java.util.Date date74 = course73.getStartDate();
        org.team4.model.user.Student student80 = new org.team4.model.user.Student("hi!", "hi!", "", "", true);
        boolean boolean81 = course73.isEnrolled(student80);
        boolean boolean82 = course64.isEnrolled(student80);
        // The following exception was thrown during execution in test generation
        try {
            courseTextBook12.makeCopies(student80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.team4.model.course.Course.isEnrolled(org.team4.model.user.Student)\" because \"this.course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseTextBook12);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(course27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(course29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(courseTextBook42);
        org.junit.Assert.assertNotNull(dVDItemBuilder45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(bookBuilder58);
        org.junit.Assert.assertNotNull(courseTextBookBuilder65);
        org.junit.Assert.assertNull(date74);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator9 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        boolean boolean10 = courseTextBook1.isRentable();
        courseTextBook1.setQuantity(0);
        boolean boolean13 = courseTextBook1.hasSoftCopy();
        org.team4.model.items.Magazine magazine16 = new org.team4.model.items.Magazine((org.team4.model.items.Item) courseTextBook1, "PayPal", (int) (short) -1);
        org.team4.model.user.Visitor visitor21 = new org.team4.model.user.Visitor("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}", "SubscribeNewsletter{title='hi!', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}', dateSubscribed=null, dateDue=null}", "hi!", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase22 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) courseTextBook1, (org.team4.model.user.User) visitor21);
        org.team4.model.items.Item item23 = itemToPurchase22.getItem();
        org.team4.model.items.Book book31 = new org.team4.model.items.Book(item23, "Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]", (int) '4', "User [email=hi!, password=hi!, name=hi!, type=, validated=false]", "", 0, true, false);
        org.team4.model.items.decorator.ItemDecorator itemDecorator32 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) book31);
        int int33 = itemDecorator32.getQuantity();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date4 = itemPurchased3.getDatePurchased();
        java.util.Date date5 = itemPurchased3.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased9 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date10 = itemPurchased9.getDatePurchased();
        java.util.Date date11 = itemPurchased9.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased14 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date15 = itemPurchased14.getDatePurchased();
        org.team4.model.course.Course course18 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date11, date15, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.course.Course course21 = new org.team4.model.course.Course("PayPal{email='hi!'}", date5, date11, "Mobile Wallet", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
        java.lang.String str22 = course21.getCourseName();
        java.util.Date date23 = course21.getEndDate();
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PayPal{email='hi!'}" + "'", str22, "PayPal{email='hi!'}");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Fri Mar 29 00:42:06 EDT 2024");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.email("PayPal{email='hi!'}");
        org.team4.model.items.BookRequest bookRequest7 = bookRequestBuilder6.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder9 = bookRequestBuilder6.email("SubscribeNewsletter{title='', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}', dateSubscribed=Fri Mar 29 00:42:00 EDT 2024, dateDue=Mon Apr 29 00:42:00 EDT 2024}");
        org.team4.model.items.BookRequest bookRequest10 = bookRequestBuilder6.build();
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequest7);
        org.junit.Assert.assertNotNull(bookRequestBuilder9);
        org.junit.Assert.assertNotNull(bookRequest10);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) (short) -1);
        org.team4.model.user.NonFaculty nonFaculty9 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "PayPal{email='hi!'}", "Mobile Wallet", "PayPal{email='hi!'}", (long) (byte) 1);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase10 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) nonFaculty9);
        java.lang.String str11 = nonFaculty9.getPassword();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PayPal{email='hi!'}" + "'", str11, "PayPal{email='hi!'}");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.team4.model.user.Manager manager4 = new org.team4.model.user.Manager("hi!", "hi!", "hi!", "");
        manager4.setType("");
        manager4.setManagerID((long) (short) 10);
        manager4.setType("Course [course name=PayPal{email='hi!'}, start date=Fri Mar 29 00:42:04 EDT 2024, end date=Fri Mar 29 00:42:04 EDT 2024, ISBN=Mobile Wallet, email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}]");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("hi!", "hi!", "hi!", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", false);
        boolean boolean6 = faculty5.isValidated();
        faculty5.setType("Mobile Wallet");
        java.util.ArrayList<java.lang.String> strList9 = faculty5.getCourses();
        java.util.ArrayList<java.lang.String> strList10 = faculty5.getCourses();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertNull(strList10);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("hi!", 100, 100, (double) 10L, "PayPal", false, true);
        int int8 = item7.getYearPublished();
        org.team4.model.items.DVD dVD11 = new org.team4.model.items.DVD(item7, "", (double) 10);
        int int12 = dVD11.getQuantity();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder7 = dVDItemBuilder4.price((double) (byte) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder9 = dVDItemBuilder4.price((double) 2097897L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder11 = dVDItemBuilder4.ISBN("User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, password=, name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}, type=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, validated=true]");
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dVDItemBuilder7);
        org.junit.Assert.assertNotNull(dVDItemBuilder9);
        org.junit.Assert.assertNotNull(dVDItemBuilder11);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("Course [course name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:42:05 EDT 2024, end date=Fri Mar 29 00:42:05 EDT 2024, ISBN=, email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}]", 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        java.util.Date date8 = null;
        java.util.Date date9 = null;
        org.team4.model.course.Course course12 = new org.team4.model.course.Course("", date8, date9, "", "hi!");
        org.team4.model.course.CourseTextBook courseTextBook14 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", 10, "hi!", "", (int) (byte) -1, course12, false);
        java.lang.String str15 = courseTextBook1.getTitle();
        org.team4.model.course.Course course16 = courseTextBook1.getCourse();
        boolean boolean17 = courseTextBook1.hasHardCopy();
        org.team4.model.course.Course course18 = courseTextBook1.getCourse();
        boolean boolean19 = courseTextBook1.isRentable();
        courseTextBook1.setPrice((double) 10L);
        java.lang.String str22 = courseTextBook1.getGenre();
        org.team4.model.items.decorator.ItemDecorator itemDecorator23 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook1);
        java.lang.String str24 = itemDecorator23.getTitle();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(course16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(course18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:56 EDT 2024, dateDue=Mon Apr 29 00:41:56 EDT 2024}", "Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]", true);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        boolean boolean3 = courseTextBook1.equals((java.lang.Object) (byte) 1);
        java.util.List<org.team4.model.user.Student> studentList4 = courseTextBook1.getStudentsWithCopies();
        courseTextBook1.setPurchaseable(true);
        java.lang.String str7 = courseTextBook1.toString();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(studentList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book{genre='null', noOfPages=0, author='null', ISBN=null, publisher='null', edition='0'}" + "'", str7, "Book{genre='null', noOfPages=0, author='null', ISBN=null, publisher='null', edition='0'}");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        java.lang.String str2 = courseTextBook1.getPublisher();
        courseTextBook1.setPurchaseable(true);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter4 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!", date2, date3);
        subscribeNewsletter4.setEmail("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        subscribeNewsletter4.setEmail("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}");
        java.util.Date date11 = null;
        java.util.Date date12 = null;
        org.team4.model.items.RentedItem rentedItem13 = new org.team4.model.items.RentedItem("", "hi!", date11, date12);
        java.lang.String str14 = rentedItem13.getISBN();
        java.util.Date date15 = null;
        rentedItem13.setDueDate(date15);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter19 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "");
        java.lang.String str20 = subscribeNewsletter19.toString();
        java.util.Date date21 = null;
        subscribeNewsletter19.setDateDue(date21);
        java.util.Date date23 = subscribeNewsletter19.getDateDue();
        java.util.Date date25 = null;
        java.util.Date date28 = null;
        java.util.Date date29 = null;
        org.team4.model.items.RentedItem rentedItem30 = new org.team4.model.items.RentedItem("", "hi!", date28, date29);
        java.lang.String str31 = rentedItem30.getISBN();
        java.util.Date date32 = null;
        rentedItem30.setDueDate(date32);
        rentedItem30.setISBN("PayPal");
        org.team4.functionality.buy.ItemPurchased itemPurchased39 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date40 = itemPurchased39.getDatePurchased();
        java.util.Date date41 = itemPurchased39.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased44 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date45 = itemPurchased44.getDatePurchased();
        org.team4.model.course.Course course48 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date41, date45, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem30.setDueDate(date41);
        java.util.Date date50 = rentedItem30.getDueDate();
        org.team4.model.course.Course course53 = new org.team4.model.course.Course("hi!", date25, date50, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "");
        subscribeNewsletter19.setDateSubscribed(date50);
        rentedItem13.setRentDate(date50);
        subscribeNewsletter4.setDateDue(date50);
        java.lang.String str57 = subscribeNewsletter4.toString();
        java.lang.String str58 = subscribeNewsletter4.toString();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:06 EDT 2024, dateDue=Mon Apr 29 00:42:06 EDT 2024}" + "'", str20, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:06 EDT 2024, dateDue=Mon Apr 29 00:42:06 EDT 2024}");
        org.junit.Assert.assertNull(date23);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(date40);
// flaky:         org.junit.Assert.assertEquals(date40.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date41);
// flaky:         org.junit.Assert.assertEquals(date41.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date45);
// flaky:         org.junit.Assert.assertEquals(date45.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date50);
// flaky:         org.junit.Assert.assertEquals(date50.toString(), "Fri Mar 29 00:42:06 EDT 2024");
// flaky:         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "SubscribeNewsletter{title='hi!', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}', dateSubscribed=null, dateDue=Fri Mar 29 00:42:06 EDT 2024}" + "'", str57, "SubscribeNewsletter{title='hi!', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}', dateSubscribed=null, dateDue=Fri Mar 29 00:42:06 EDT 2024}");
// flaky:         org.junit.Assert.assertEquals("'" + str58 + "' != '" + "SubscribeNewsletter{title='hi!', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}', dateSubscribed=null, dateDue=Fri Mar 29 00:42:06 EDT 2024}" + "'", str58, "SubscribeNewsletter{title='hi!', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}', dateSubscribed=null, dateDue=Fri Mar 29 00:42:06 EDT 2024}");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder2 = dVDBuilder0.price((double) 'a');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.yearPublished((int) '4');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDBuilder0.price(52.0d);
        org.team4.model.items.builder.DVDBuilder dVDBuilder8 = dVDBuilder0.genre("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder10 = dVDBuilder8.title("Debit Card");
        org.junit.Assert.assertNotNull(dVDItemBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDBuilder8);
        org.junit.Assert.assertNotNull(dVDItemBuilder10);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.team4.model.user.User user4 = new org.team4.model.user.User("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:06 EDT 2024, dateDue=Mon Apr 29 00:42:06 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:56 EDT 2024, dateDue=Mon Apr 29 00:41:56 EDT 2024}", "PayPal");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator9 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        boolean boolean10 = courseTextBook1.isRentable();
        java.util.List<org.team4.model.user.Student> studentList11 = courseTextBook1.getStudentsWithCopies();
        java.lang.String str12 = courseTextBook1.toString();
        courseTextBook1.setRentable(false);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(studentList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Book{genre='null', noOfPages=0, author='null', ISBN=null, publisher='null', edition='0'}" + "'", str12, "Book{genre='null', noOfPages=0, author='null', ISBN=null, publisher='null', edition='0'}");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("", date1, date2, "", "hi!");
        java.lang.String str6 = course5.getCourseTextBookISBN();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase2 = null;
        org.team4.functionality.buy.ProcessPayment processPayment3 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) payPal1, itemToPurchase2);
        java.lang.String str4 = processPayment3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ProcessPayment{modes=PayPal{email='hi!'}, itemToPurchase=null}" + "'", str4, "ProcessPayment{modes=PayPal{email='hi!'}, itemToPurchase=null}");
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.email("PayPal{email='hi!'}");
        org.team4.model.items.BookRequest bookRequest7 = bookRequestBuilder6.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder9 = bookRequestBuilder6.email("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:02 EDT 2024, dateDue=Mon Apr 29 00:42:02 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder11 = bookRequestBuilder9.ISBN("PayPal{email='PayPal{email='hi!'}'}");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequest7);
        org.junit.Assert.assertNotNull(bookRequestBuilder9);
        org.junit.Assert.assertNotNull(bookRequestBuilder11);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder2 = courseTextBookBuilder0.price(1.0d);
        org.team4.functionality.buy.ItemPurchased itemPurchased6 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date7 = itemPurchased6.getDatePurchased();
        java.util.Date date8 = itemPurchased6.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased11 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date12 = itemPurchased11.getDatePurchased();
        org.team4.model.course.Course course15 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date8, date12, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        java.lang.String str16 = course15.getCourseName();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder17 = courseTextBookBuilder0.course(course15);
        org.team4.model.course.Course course18 = null;
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder19 = courseTextBookBuilder0.course(course18);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder21 = courseTextBookBuilder19.title("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.model.items.builder.BookBuilder bookBuilder23 = courseTextBookBuilder19.hasSoftCopy(true);
        org.junit.Assert.assertNotNull(bookItemBuilder2);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Fri Mar 29 00:42:06 EDT 2024");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}" + "'", str16, "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.junit.Assert.assertNotNull(courseTextBookBuilder17);
        org.junit.Assert.assertNotNull(courseTextBookBuilder19);
        org.junit.Assert.assertNotNull(bookItemBuilder21);
        org.junit.Assert.assertNotNull(bookBuilder23);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.Magazine magazine1 = magazineBuilder0.build();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder3 = magazineBuilder0.issueNumber((int) (short) 1);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder5 = magazineBuilder3.publisher("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder7 = magazineBuilder3.price((double) 4531993L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder9 = magazineBuilder3.yearPublished((int) (byte) -1);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder11 = magazineBuilder3.issueNumber((int) (short) 10);
        org.junit.Assert.assertNotNull(magazine1);
        org.junit.Assert.assertNotNull(magazineBuilder3);
        org.junit.Assert.assertNotNull(magazineBuilder5);
        org.junit.Assert.assertNotNull(magazineItemBuilder7);
        org.junit.Assert.assertNotNull(magazineItemBuilder9);
        org.junit.Assert.assertNotNull(magazineBuilder11);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.Item item9 = new org.team4.model.items.Item((org.team4.model.items.Item) courseTextBook1);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder15 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder17 = courseTextBookBuilder15.hasHardCopy(true);
        java.util.Date date19 = null;
        java.util.Date date20 = null;
        org.team4.model.course.Course course23 = new org.team4.model.course.Course("", date19, date20, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder24 = courseTextBookBuilder15.course(course23);
        org.team4.model.course.CourseTextBook courseTextBook26 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}", (int) '#', "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "", (int) (byte) 0, course23, false);
        org.team4.model.user.Faculty faculty36 = new org.team4.model.user.Faculty("", "", "hi!", "hi!", true);
        java.util.ArrayList<java.lang.String> strList37 = faculty36.getCourses();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        faculty36.setCourses(strList40);
        org.team4.model.user.Student student43 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "", strList40);
        java.util.ArrayList<java.lang.String> strList44 = student43.getCourses();
        course23.enrollStudent(student43);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookBuilder17);
        org.junit.Assert.assertNotNull(courseTextBookBuilder24);
        org.junit.Assert.assertNull(strList37);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strList44);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("Mobile Wallet", "PayPal");
        java.lang.String str3 = subscribeNewsletter2.getEmail();
        org.team4.functionality.buy.ItemPurchased itemPurchased7 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date8 = itemPurchased7.getDatePurchased();
        java.util.Date date9 = itemPurchased7.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased12 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date13 = itemPurchased12.getDatePurchased();
        org.team4.model.course.Course course16 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date9, date13, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        subscribeNewsletter2.setDateDue(date9);
        org.team4.functionality.buy.ItemPurchased itemPurchased24 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date25 = itemPurchased24.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased26 = new org.team4.functionality.buy.ItemPurchased("Mobile Wallet", "", date25);
        org.team4.functionality.buy.ItemPurchased itemPurchased30 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date31 = itemPurchased30.getDatePurchased();
        java.util.Date date32 = itemPurchased30.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased36 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date37 = itemPurchased36.getDatePurchased();
        java.util.Date date38 = itemPurchased36.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased41 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date42 = itemPurchased41.getDatePurchased();
        org.team4.model.course.Course course45 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date38, date42, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.course.Course course48 = new org.team4.model.course.Course("PayPal{email='hi!'}", date32, date38, "Mobile Wallet", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
        org.team4.model.items.RentedItem rentedItem49 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "PayPal", date25, date32);
        subscribeNewsletter2.setDateSubscribed(date25);
        java.lang.String str51 = subscribeNewsletter2.getEmail();
        subscribeNewsletter2.setEmail("User [email=hi!, password=hi!, name=hi!, type=, validated=false]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PayPal" + "'", str3, "PayPal");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date38);
// flaky:         org.junit.Assert.assertEquals(date38.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "PayPal" + "'", str51, "PayPal");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]", "Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:03 EDT 2024, dateDue=Mon Apr 29 00:42:03 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:06 EDT 2024, dateDue=Mon Apr 29 00:42:06 EDT 2024}");
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished((int) (short) -1);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.publisher("");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder6 = magazineBuilder4.issueNumber(97);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineBuilder6);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("hi!", "", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase((double) (-1L), (org.team4.model.user.User) student5);
        org.team4.model.paymentmodes.PayPal payPal8 = new org.team4.model.paymentmodes.PayPal("hi!");
        boolean boolean9 = payPal8.isValid();
        java.lang.String str10 = payPal8.getMode();
        java.lang.String str11 = payPal8.toString();
        java.lang.String str12 = payPal8.getMode();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete13 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) payPal8);
        org.team4.model.user.User user14 = purchaseComplete13.getUser();
        org.team4.model.user.User user15 = purchaseComplete13.getUser();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Mobile Wallet" + "'", str10, "Mobile Wallet");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PayPal{email='hi!'}" + "'", str11, "PayPal{email='hi!'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Mobile Wallet" + "'", str12, "Mobile Wallet");
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertNotNull(user15);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("hi!", 100, 100, (double) 10L, "PayPal", false, true);
        int int8 = item7.getYearPublished();
        org.team4.model.items.DVD dVD11 = new org.team4.model.items.DVD(item7, "", (double) 10);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator12 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) dVD11);
        org.team4.model.items.Book book20 = new org.team4.model.items.Book((org.team4.model.items.Item) dVD11, "Mobile Wallet", 10, "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "Mobile Wallet", (int) (byte) 100, false, true);
        boolean boolean21 = dVD11.isPurchasable();
        org.team4.model.items.DVD dVD24 = new org.team4.model.items.DVD((org.team4.model.items.Item) dVD11, "User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, name=hi!, type=, validated=false]", (double) 10L);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder25 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook26 = courseTextBookBuilder25.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder27 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder29 = dVDBuilder27.price((double) 'a');
        boolean boolean30 = courseTextBook26.equals((java.lang.Object) dVDItemBuilder29);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator31 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook26);
        courseTextBook26.setPrice((double) (byte) 100);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator34 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook26);
        boolean boolean35 = courseTextBook26.isRentable();
        courseTextBook26.setQuantity(0);
        boolean boolean38 = courseTextBook26.hasSoftCopy();
        org.team4.model.items.Magazine magazine41 = new org.team4.model.items.Magazine((org.team4.model.items.Item) courseTextBook26, "PayPal", (int) (short) -1);
        org.team4.model.user.Visitor visitor46 = new org.team4.model.user.Visitor("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}", "SubscribeNewsletter{title='hi!', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}', dateSubscribed=null, dateDue=null}", "hi!", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase47 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) courseTextBook26, (org.team4.model.user.User) visitor46);
        org.team4.model.items.Item item48 = itemToPurchase47.getItem();
        org.team4.model.items.Book book56 = new org.team4.model.items.Book(item48, "Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]", (int) '4', "User [email=hi!, password=hi!, name=hi!, type=, validated=false]", "", 0, true, false);
        org.team4.model.items.decorator.ItemDecorator itemDecorator57 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) book56);
        boolean boolean58 = dVD24.equals((java.lang.Object) itemDecorator57);
        java.lang.String str59 = dVD24.getGenre();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(courseTextBook26);
        org.junit.Assert.assertNotNull(dVDItemBuilder29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(item48);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, name=hi!, type=, validated=false]" + "'", str59, "User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, name=hi!, type=, validated=false]");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        boolean boolean3 = courseTextBook1.equals((java.lang.Object) (byte) 1);
        java.lang.String str4 = courseTextBook1.getTitle();
        java.lang.String str5 = courseTextBook1.getTitle();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder11 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder13 = courseTextBookBuilder11.hasHardCopy(true);
        java.util.Date date15 = null;
        java.util.Date date16 = null;
        org.team4.model.course.Course course19 = new org.team4.model.course.Course("", date15, date16, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder20 = courseTextBookBuilder11.course(course19);
        org.team4.model.course.CourseTextBook courseTextBook22 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook1, "User [email=hi!, password=hi!, name=hi!, type=, validated=false]", (int) (short) -1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}", (int) (byte) 10, course19, true);
        java.util.List<org.team4.model.user.Student> studentList23 = courseTextBook22.getStudentsWithCopies();
        org.team4.model.course.Course course24 = courseTextBook22.getCourse();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(bookBuilder13);
        org.junit.Assert.assertNotNull(courseTextBookBuilder20);
        org.junit.Assert.assertNotNull(studentList23);
        org.junit.Assert.assertNotNull(course24);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder2 = courseTextBookBuilder0.price(1.0d);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.price((double) 0.0f);
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        org.team4.model.course.Course course10 = new org.team4.model.course.Course("", date6, date7, "hi!", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder11 = courseTextBookBuilder0.course(course10);
        java.lang.String str12 = course10.getCourseName();
        org.junit.Assert.assertNotNull(bookItemBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]", (int) (byte) 1, 10);
        boolean boolean4 = creditCard3.correctLength();
        boolean boolean5 = creditCard3.correctLength();
        boolean boolean6 = creditCard3.notExpired();
        boolean boolean7 = creditCard3.correctLength();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator9 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        boolean boolean10 = courseTextBook1.hasSoftCopy();
        courseTextBook1.setQuantity((int) (short) 0);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter7 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!", date5, date6);
        org.team4.functionality.buy.ItemPurchased itemPurchased14 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date15 = itemPurchased14.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased16 = new org.team4.functionality.buy.ItemPurchased("Mobile Wallet", "", date15);
        org.team4.functionality.buy.ItemPurchased itemPurchased20 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date21 = itemPurchased20.getDatePurchased();
        java.util.Date date22 = itemPurchased20.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased26 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date27 = itemPurchased26.getDatePurchased();
        java.util.Date date28 = itemPurchased26.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased31 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date32 = itemPurchased31.getDatePurchased();
        org.team4.model.course.Course course35 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date28, date32, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.course.Course course38 = new org.team4.model.course.Course("PayPal{email='hi!'}", date22, date28, "Mobile Wallet", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
        org.team4.model.items.RentedItem rentedItem39 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "PayPal", date15, date22);
        subscribeNewsletter7.setDateDue(date15);
        org.team4.functionality.buy.ItemPurchased itemPurchased43 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date44 = itemPurchased43.getDatePurchased();
        java.util.Date date45 = itemPurchased43.getDatePurchased();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter46 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}", date15, date45);
        java.util.Date date47 = subscribeNewsletter46.getDateSubscribed();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter50 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "");
        java.lang.String str51 = subscribeNewsletter50.getTitle();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder52 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook53 = courseTextBookBuilder52.build();
        org.team4.model.items.builder.BookBuilder bookBuilder55 = courseTextBookBuilder52.hasSoftCopy(true);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder57 = courseTextBookBuilder52.isVirtual(false);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder58 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder60 = courseTextBookBuilder58.hasHardCopy(true);
        java.util.Date date62 = null;
        java.util.Date date63 = null;
        org.team4.model.course.Course course66 = new org.team4.model.course.Course("", date62, date63, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder67 = courseTextBookBuilder58.course(course66);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder68 = courseTextBookBuilder57.course(course66);
        org.team4.model.items.builder.BookBuilder bookBuilder70 = courseTextBookBuilder68.hasHardCopy(false);
        org.team4.model.items.builder.BookBuilder bookBuilder72 = courseTextBookBuilder68.genre("PayPal");
        org.team4.functionality.buy.ItemPurchased itemPurchased76 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date77 = itemPurchased76.getDatePurchased();
        java.util.Date date78 = itemPurchased76.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased81 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date82 = itemPurchased81.getDatePurchased();
        org.team4.model.course.Course course85 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date78, date82, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder86 = courseTextBookBuilder68.course(course85);
        java.util.Date date87 = course85.getStartDate();
        subscribeNewsletter50.setDateSubscribed(date87);
        org.team4.model.course.Course course91 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date47, date87, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:02 EDT 2024, dateDue=Mon Apr 29 00:42:02 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:42:04 EDT 2024}");
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date27);
// flaky:         org.junit.Assert.assertEquals(date27.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date45);
// flaky:         org.junit.Assert.assertEquals(date45.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date47);
// flaky:         org.junit.Assert.assertEquals(date47.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(courseTextBook53);
        org.junit.Assert.assertNotNull(bookBuilder55);
        org.junit.Assert.assertNotNull(courseTextBookBuilder57);
        org.junit.Assert.assertNotNull(bookBuilder60);
        org.junit.Assert.assertNotNull(courseTextBookBuilder67);
        org.junit.Assert.assertNotNull(courseTextBookBuilder68);
        org.junit.Assert.assertNotNull(bookBuilder70);
        org.junit.Assert.assertNotNull(bookBuilder72);
        org.junit.Assert.assertNotNull(date77);
// flaky:         org.junit.Assert.assertEquals(date77.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date78);
// flaky:         org.junit.Assert.assertEquals(date78.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date82);
// flaky:         org.junit.Assert.assertEquals(date82.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(courseTextBookBuilder86);
        org.junit.Assert.assertNotNull(date87);
// flaky:         org.junit.Assert.assertEquals(date87.toString(), "Fri Mar 29 00:42:07 EDT 2024");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.Course course1 = null;
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder2 = courseTextBookBuilder0.course(course1);
        org.team4.model.items.builder.BookBuilder bookBuilder4 = courseTextBookBuilder0.hasHardCopy(false);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder6 = courseTextBookBuilder0.price((double) (short) 0);
        org.team4.model.course.CourseTextBook courseTextBook7 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder9 = courseTextBookBuilder0.author("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.junit.Assert.assertNotNull(courseTextBookBuilder2);
        org.junit.Assert.assertNotNull(bookBuilder4);
        org.junit.Assert.assertNotNull(bookItemBuilder6);
        org.junit.Assert.assertNotNull(courseTextBook7);
        org.junit.Assert.assertNotNull(bookBuilder9);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = visitor5.getName();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.items.Newsletter newsletter9 = itemToPurchase7.getNewsletter();
        org.team4.model.items.Item item10 = itemToPurchase7.getItem();
        org.team4.model.paymentmodes.PayPal payPal12 = new org.team4.model.paymentmodes.PayPal("hi!");
        org.team4.model.user.Visitor visitor18 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str19 = visitor18.getName();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase20 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor18);
        org.team4.functionality.buy.ProcessPayment processPayment21 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) payPal12, itemToPurchase20);
        java.lang.String str22 = payPal12.getMode();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete23 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) payPal12);
        double double24 = itemToPurchase7.getAmount();
        double double25 = itemToPurchase7.getAmount();
        org.team4.model.items.Newsletter newsletter26 = itemToPurchase7.getNewsletter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Mobile Wallet" + "'", str22, "Mobile Wallet");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertNull(newsletter26);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder3 = courseTextBookBuilder0.isVirtual(false);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder5 = courseTextBookBuilder3.isVirtual(true);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(courseTextBookBuilder3);
        org.junit.Assert.assertNotNull(courseTextBookBuilder5);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.team4.functionality.buy.ItemPurchased itemPurchased6 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date7 = itemPurchased6.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased8 = new org.team4.functionality.buy.ItemPurchased("Mobile Wallet", "", date7);
        org.team4.functionality.buy.ItemPurchased itemPurchased12 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date13 = itemPurchased12.getDatePurchased();
        java.util.Date date14 = itemPurchased12.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased18 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date19 = itemPurchased18.getDatePurchased();
        java.util.Date date20 = itemPurchased18.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased23 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date24 = itemPurchased23.getDatePurchased();
        org.team4.model.course.Course course27 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date20, date24, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.course.Course course30 = new org.team4.model.course.Course("PayPal{email='hi!'}", date14, date20, "Mobile Wallet", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
        org.team4.model.items.RentedItem rentedItem31 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "PayPal", date7, date14);
        org.team4.functionality.buy.ItemPurchased itemPurchased35 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date36 = itemPurchased35.getDatePurchased();
        java.util.Date date37 = itemPurchased35.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased41 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date42 = itemPurchased41.getDatePurchased();
        java.util.Date date43 = itemPurchased41.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased46 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date47 = itemPurchased46.getDatePurchased();
        org.team4.model.course.Course course50 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date43, date47, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.course.Course course53 = new org.team4.model.course.Course("PayPal{email='hi!'}", date37, date43, "Mobile Wallet", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
        rentedItem31.setRentDate(date37);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter57 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}", "");
        java.util.Date date58 = subscribeNewsletter57.getDateSubscribed();
        rentedItem31.setDueDate(date58);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date24);
// flaky:         org.junit.Assert.assertEquals(date24.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date36);
// flaky:         org.junit.Assert.assertEquals(date36.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date43);
// flaky:         org.junit.Assert.assertEquals(date43.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date47);
// flaky:         org.junit.Assert.assertEquals(date47.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date58);
// flaky:         org.junit.Assert.assertEquals(date58.toString(), "Fri Mar 29 00:42:07 EDT 2024");
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getStartDate();
        java.util.Date date7 = course5.getEndDate();
        java.util.Date date8 = course5.getStartDate();
        java.lang.String str9 = course5.getCourseName();
        org.team4.functionality.buy.ItemPurchased itemPurchased12 = new org.team4.functionality.buy.ItemPurchased("hi!", "");
        java.lang.String str13 = itemPurchased12.getEmail();
        java.util.Date date14 = itemPurchased12.getDatePurchased();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = course5.isEnded(date14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Fri Mar 29 00:42:07 EDT 2024");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.items.RentedItem rentedItem4 = new org.team4.model.items.RentedItem("", "hi!", date2, date3);
        java.lang.String str5 = rentedItem4.getISBN();
        java.util.Date date6 = null;
        rentedItem4.setDueDate(date6);
        rentedItem4.setISBN("PayPal");
        org.team4.functionality.buy.ItemPurchased itemPurchased13 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date14 = itemPurchased13.getDatePurchased();
        java.util.Date date15 = itemPurchased13.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased18 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date19 = itemPurchased18.getDatePurchased();
        org.team4.model.course.Course course22 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date15, date19, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem4.setDueDate(date15);
        java.util.Date date24 = rentedItem4.getDueDate();
        rentedItem4.setTitle("User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, type=, validated=false]");
        org.team4.functionality.buy.ItemPurchased itemPurchased30 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date31 = itemPurchased30.getDatePurchased();
        java.util.Date date32 = itemPurchased30.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased35 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date36 = itemPurchased35.getDatePurchased();
        org.team4.model.course.Course course39 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date32, date36, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem4.setDueDate(date32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date24);
// flaky:         org.junit.Assert.assertEquals(date24.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date36);
// flaky:         org.junit.Assert.assertEquals(date36.toString(), "Fri Mar 29 00:42:07 EDT 2024");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder2 = magazineBuilder0.issueNumber((int) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder2.issueNumber((int) ' ');
        org.team4.model.items.Magazine magazine5 = magazineBuilder2.build();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder7 = magazineBuilder2.publisher("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:42:04 EDT 2024, dateDue=Mon Apr 29 00:42:04 EDT 2024}");
        org.junit.Assert.assertNotNull(magazineBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazine5);
        org.junit.Assert.assertNotNull(magazineBuilder7);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished((int) (short) -1);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.publisher("");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder6 = magazineBuilder0.publisher("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineBuilder0.quantity((int) (byte) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder10 = magazineBuilder0.ISBN("PayPal");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder12 = magazineBuilder0.price(52.0d);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
        org.junit.Assert.assertNotNull(magazineItemBuilder10);
        org.junit.Assert.assertNotNull(magazineItemBuilder12);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.Course course1 = null;
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder2 = courseTextBookBuilder0.course(course1);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder4 = courseTextBookBuilder2.isVirtual(false);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder6 = courseTextBookBuilder2.quantity((int) '4');
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder2.author("ItemToPurchase{item=null, user=User [email=hi!, password=, name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, type=ProcessPayment{modes=null, itemToPurchase=null}, validated=false], newsletter=null}");
        org.team4.model.items.Book book9 = courseTextBookBuilder2.build();
        org.junit.Assert.assertNotNull(courseTextBookBuilder2);
        org.junit.Assert.assertNotNull(courseTextBookBuilder4);
        org.junit.Assert.assertNotNull(bookItemBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(book9);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder2 = dVDBuilder0.price((double) 'a');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.yearPublished((int) '4');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDBuilder0.price(52.0d);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDBuilder0.quantity((int) (byte) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder10 = dVDItemBuilder8.price((double) 1015016L);
        org.junit.Assert.assertNotNull(dVDItemBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
        org.junit.Assert.assertNotNull(dVDItemBuilder10);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder3 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder5 = courseTextBookBuilder0.isVirtual(false);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder6.hasHardCopy(true);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        org.team4.model.course.Course course14 = new org.team4.model.course.Course("", date10, date11, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder15 = courseTextBookBuilder6.course(course14);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder16 = courseTextBookBuilder5.course(course14);
        org.team4.model.items.builder.BookBuilder bookBuilder18 = courseTextBookBuilder5.hasSoftCopy(false);
        org.team4.model.course.CourseTextBook courseTextBook19 = courseTextBookBuilder5.build();
        java.util.Date date21 = null;
        java.util.Date date22 = null;
        org.team4.model.course.Course course25 = new org.team4.model.course.Course("", date21, date22, "", "hi!");
        org.team4.model.user.Student student31 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "Mobile Wallet", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "", false);
        course25.enrollStudent(student31);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder33 = courseTextBookBuilder5.course(course25);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter36 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "");
        java.lang.String str37 = subscribeNewsletter36.toString();
        java.util.Date date38 = null;
        subscribeNewsletter36.setDateDue(date38);
        java.lang.String str40 = subscribeNewsletter36.getTitle();
        java.lang.String str41 = subscribeNewsletter36.getEmail();
        subscribeNewsletter36.setTitle("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}");
        java.util.Date date48 = null;
        java.util.Date date49 = null;
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter50 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!", date48, date49);
        org.team4.functionality.buy.ItemPurchased itemPurchased57 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date58 = itemPurchased57.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased59 = new org.team4.functionality.buy.ItemPurchased("Mobile Wallet", "", date58);
        org.team4.functionality.buy.ItemPurchased itemPurchased63 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date64 = itemPurchased63.getDatePurchased();
        java.util.Date date65 = itemPurchased63.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased69 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date70 = itemPurchased69.getDatePurchased();
        java.util.Date date71 = itemPurchased69.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased74 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date75 = itemPurchased74.getDatePurchased();
        org.team4.model.course.Course course78 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date71, date75, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.course.Course course81 = new org.team4.model.course.Course("PayPal{email='hi!'}", date65, date71, "Mobile Wallet", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
        org.team4.model.items.RentedItem rentedItem82 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "PayPal", date58, date65);
        subscribeNewsletter50.setDateDue(date58);
        org.team4.functionality.buy.ItemPurchased itemPurchased86 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date87 = itemPurchased86.getDatePurchased();
        java.util.Date date88 = itemPurchased86.getDatePurchased();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter89 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}", date58, date88);
        subscribeNewsletter36.setDateSubscribed(date58);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter93 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "");
        java.lang.String str94 = subscribeNewsletter93.toString();
        java.util.Date date95 = null;
        subscribeNewsletter93.setDateDue(date95);
        java.util.Date date97 = subscribeNewsletter93.getDateSubscribed();
        subscribeNewsletter36.setDateSubscribed(date97);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean99 = course25.isEnded(date97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(bookBuilder3);
        org.junit.Assert.assertNotNull(courseTextBookBuilder5);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(courseTextBookBuilder15);
        org.junit.Assert.assertNotNull(courseTextBookBuilder16);
        org.junit.Assert.assertNotNull(bookBuilder18);
        org.junit.Assert.assertNotNull(courseTextBook19);
        org.junit.Assert.assertNotNull(courseTextBookBuilder33);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:07 EDT 2024, dateDue=Mon Apr 29 00:42:07 EDT 2024}" + "'", str37, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:07 EDT 2024, dateDue=Mon Apr 29 00:42:07 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(date58);
// flaky:         org.junit.Assert.assertEquals(date58.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date64);
// flaky:         org.junit.Assert.assertEquals(date64.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date65);
// flaky:         org.junit.Assert.assertEquals(date65.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date70);
// flaky:         org.junit.Assert.assertEquals(date70.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date71);
// flaky:         org.junit.Assert.assertEquals(date71.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date75);
// flaky:         org.junit.Assert.assertEquals(date75.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date87);
// flaky:         org.junit.Assert.assertEquals(date87.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date88);
// flaky:         org.junit.Assert.assertEquals(date88.toString(), "Fri Mar 29 00:42:07 EDT 2024");
// flaky:         org.junit.Assert.assertEquals("'" + str94 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:07 EDT 2024, dateDue=Mon Apr 29 00:42:07 EDT 2024}" + "'", str94, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:07 EDT 2024, dateDue=Mon Apr 29 00:42:07 EDT 2024}");
        org.junit.Assert.assertNotNull(date97);
// flaky:         org.junit.Assert.assertEquals(date97.toString(), "Fri Mar 29 00:42:07 EDT 2024");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder2 = dVDBuilder0.price((double) (-1.0f));
        org.team4.model.items.builder.DVDBuilder dVDBuilder4 = dVDBuilder0.genre("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder4.duration((double) 10L);
        org.team4.model.items.builder.DVDBuilder dVDBuilder8 = dVDBuilder6.duration((double) 0.0f);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder10 = dVDBuilder6.yearPublished(10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder12 = dVDBuilder6.title("");
        org.junit.Assert.assertNotNull(dVDItemBuilder2);
        org.junit.Assert.assertNotNull(dVDBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDBuilder8);
        org.junit.Assert.assertNotNull(dVDItemBuilder10);
        org.junit.Assert.assertNotNull(dVDItemBuilder12);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.booktype("Mobile Wallet");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder4.edition(10);
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder10 = bookRequestBuilder4.ISBN("Course [course name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:42:05 EDT 2024, end date=Fri Mar 29 00:42:05 EDT 2024, ISBN=, email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}]");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
        org.junit.Assert.assertNotNull(bookRequestBuilder10);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        java.util.Date date4 = null;
        java.util.Date date5 = null;
        org.team4.model.items.RentedItem rentedItem6 = new org.team4.model.items.RentedItem("", "hi!", date4, date5);
        rentedItem6.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem6.setTitle("hi!");
        java.util.Date date11 = rentedItem6.getRentDate();
        org.team4.functionality.buy.ItemPurchased itemPurchased15 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date16 = itemPurchased15.getDatePurchased();
        java.util.Date date17 = itemPurchased15.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased20 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date21 = itemPurchased20.getDatePurchased();
        org.team4.model.course.Course course24 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date17, date21, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem6.setRentDate(date17);
        rentedItem6.setISBN("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}");
        java.util.Date date28 = rentedItem6.getRentDate();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter32 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "");
        java.lang.String str33 = subscribeNewsletter32.toString();
        java.util.Date date34 = null;
        subscribeNewsletter32.setDateDue(date34);
        java.util.Date date38 = null;
        java.util.Date date39 = null;
        org.team4.model.items.RentedItem rentedItem40 = new org.team4.model.items.RentedItem("", "hi!", date38, date39);
        rentedItem40.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem40.setTitle("hi!");
        java.util.Date date45 = rentedItem40.getRentDate();
        org.team4.functionality.buy.ItemPurchased itemPurchased49 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date50 = itemPurchased49.getDatePurchased();
        java.util.Date date51 = itemPurchased49.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased54 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date55 = itemPurchased54.getDatePurchased();
        org.team4.model.course.Course course58 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date51, date55, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem40.setRentDate(date51);
        subscribeNewsletter32.setDateSubscribed(date51);
        java.util.Date date63 = null;
        java.util.Date date64 = null;
        org.team4.model.items.RentedItem rentedItem65 = new org.team4.model.items.RentedItem("", "hi!", date63, date64);
        java.lang.String str66 = rentedItem65.getISBN();
        java.util.Date date67 = null;
        rentedItem65.setDueDate(date67);
        rentedItem65.setISBN("PayPal");
        org.team4.functionality.buy.ItemPurchased itemPurchased74 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date75 = itemPurchased74.getDatePurchased();
        java.util.Date date76 = itemPurchased74.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased79 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date80 = itemPurchased79.getDatePurchased();
        org.team4.model.course.Course course83 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date76, date80, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem65.setDueDate(date76);
        org.team4.model.course.Course course87 = new org.team4.model.course.Course("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", date51, date76, "Mobile Wallet", "hi!");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter88 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}", date28, date51);
        java.lang.String str89 = subscribeNewsletter88.toString();
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Fri Mar 29 00:42:07 EDT 2024");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:07 EDT 2024, dateDue=Mon Apr 29 00:42:07 EDT 2024}" + "'", str33, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:07 EDT 2024, dateDue=Mon Apr 29 00:42:07 EDT 2024}");
        org.junit.Assert.assertNull(date45);
        org.junit.Assert.assertNotNull(date50);
// flaky:         org.junit.Assert.assertEquals(date50.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date51);
// flaky:         org.junit.Assert.assertEquals(date51.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date55);
// flaky:         org.junit.Assert.assertEquals(date55.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertNotNull(date75);
// flaky:         org.junit.Assert.assertEquals(date75.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date76);
// flaky:         org.junit.Assert.assertEquals(date76.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date80);
// flaky:         org.junit.Assert.assertEquals(date80.toString(), "Fri Mar 29 00:42:07 EDT 2024");
// flaky:         org.junit.Assert.assertEquals("'" + str89 + "' != '" + "SubscribeNewsletter{title='', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}', dateSubscribed=Fri Mar 29 00:42:07 EDT 2024, dateDue=Fri Mar 29 00:42:07 EDT 2024}" + "'", str89, "SubscribeNewsletter{title='', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}', dateSubscribed=Fri Mar 29 00:42:07 EDT 2024, dateDue=Fri Mar 29 00:42:07 EDT 2024}");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        int int7 = courseTextBook1.getEdition();
        org.team4.model.items.decorator.ItemDecorator itemDecorator8 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPurchaseable(false);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder11 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder13 = magazineBuilder11.issueNumber((int) '#');
        boolean boolean14 = courseTextBook1.equals((java.lang.Object) '#');
        boolean boolean15 = courseTextBook1.hasHardCopy();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(magazineBuilder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator9 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) purchasableItemDecorator9);
        boolean boolean11 = rentableItemDecorator10.isPurchasable();
        rentableItemDecorator10.setRentable(false);
        java.lang.String str14 = rentableItemDecorator10.getISBN();
        boolean boolean15 = rentableItemDecorator10.isRentable();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.team4.model.user.Student student6 = new org.team4.model.user.Student("Mobile Wallet", "", "hi!", "Mobile Wallet", true);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) 100.0f, (org.team4.model.user.User) student6);
        org.team4.model.items.Item item8 = itemToPurchase7.getItem();
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.Item item9 = new org.team4.model.items.Item((org.team4.model.items.Item) courseTextBook1);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder15 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder17 = courseTextBookBuilder15.hasHardCopy(true);
        java.util.Date date19 = null;
        java.util.Date date20 = null;
        org.team4.model.course.Course course23 = new org.team4.model.course.Course("", date19, date20, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder24 = courseTextBookBuilder15.course(course23);
        org.team4.model.course.CourseTextBook courseTextBook26 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}", (int) '#', "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "", (int) (byte) 0, course23, false);
        java.util.Date date28 = null;
        java.util.Date date29 = null;
        org.team4.model.course.Course course32 = new org.team4.model.course.Course("", date28, date29, "", "hi!");
        java.util.Date date33 = course32.getStartDate();
        org.team4.model.user.Student student39 = new org.team4.model.user.Student("hi!", "hi!", "", "", true);
        boolean boolean40 = course32.isEnrolled(student39);
        boolean boolean41 = course23.isEnrolled(student39);
        org.team4.model.user.Student student47 = new org.team4.model.user.Student("Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "SubscribeNewsletter{title='hi!', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}', dateSubscribed=null, dateDue=null}", false);
        boolean boolean48 = course23.isEnrolled(student47);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookBuilder17);
        org.junit.Assert.assertNotNull(courseTextBookBuilder24);
        org.junit.Assert.assertNull(date33);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.Item item2 = new org.team4.model.items.Item((org.team4.model.items.Item) courseTextBook1);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        org.team4.model.course.Course course13 = new org.team4.model.course.Course("", date9, date10, "", "hi!");
        java.util.Date date14 = course13.getStartDate();
        org.team4.model.user.Student student20 = new org.team4.model.user.Student("hi!", "hi!", "", "", true);
        boolean boolean21 = course13.isEnrolled(student20);
        java.lang.String str22 = course13.getCourseTextBookISBN();
        java.lang.String str23 = course13.getCourseTextBookISBN();
        org.team4.model.course.CourseTextBook courseTextBook25 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook1, "", (int) (byte) 10, "ItemToPurchase{item=null, user=User [email=hi!, password=hi!, name=hi!, type=hi!, validated=false], newsletter=null}", "SubscribeNewsletter{title='', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}', dateSubscribed=Fri Mar 29 00:42:07 EDT 2024, dateDue=Fri Mar 29 00:42:07 EDT 2024}", 100, course13, false);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:58 EDT 2024}", "ItemPurchased{title='', email='ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}', datePurchased=Fri Mar 29 00:42:01 EDT 2024}");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.Item item2 = new org.team4.model.items.Item((org.team4.model.items.Item) courseTextBook1);
        java.util.Date date4 = null;
        java.util.Date date5 = null;
        org.team4.model.course.Course course8 = new org.team4.model.course.Course("", date4, date5, "", "hi!");
        java.util.Date date9 = course8.getStartDate();
        org.team4.model.user.Student student15 = new org.team4.model.user.Student("hi!", "hi!", "", "", true);
        boolean boolean16 = course8.isEnrolled(student15);
        // The following exception was thrown during execution in test generation
        try {
            courseTextBook1.makeCopies(student15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.team4.model.course.Course.isEnrolled(org.team4.model.user.Student)\" because \"this.course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        boolean boolean3 = courseTextBook1.equals((java.lang.Object) (byte) 1);
        java.lang.String str4 = courseTextBook1.getTitle();
        org.team4.model.course.Course course5 = courseTextBook1.getCourse();
        boolean boolean7 = courseTextBook1.equals((java.lang.Object) 100);
        org.team4.model.user.Student student13 = new org.team4.model.user.Student("Mobile Wallet", "", "hi!", "Mobile Wallet", true);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase14 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) courseTextBook1, (org.team4.model.user.User) student13);
        org.team4.model.user.Faculty faculty19 = new org.team4.model.user.Faculty("", "", "hi!", "hi!");
        org.team4.model.user.Faculty faculty30 = new org.team4.model.user.Faculty("", "", "hi!", "hi!", true);
        java.util.ArrayList<java.lang.String> strList31 = faculty30.getCourses();
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        faculty30.setCourses(strList34);
        org.team4.model.user.Faculty faculty37 = new org.team4.model.user.Faculty("", "Debit Card", "Debit Card", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (long) (byte) 100, strList34);
        faculty19.setCourses(strList34);
        student13.setCourses(strList34);
        java.lang.String str40 = student13.toString();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(course5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strList31);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "User [email=Mobile Wallet, password=, name=hi!, type=Mobile Wallet, validated=true]" + "'", str40, "User [email=Mobile Wallet, password=, name=hi!, type=Mobile Wallet, validated=true]");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date4 = itemPurchased3.getDatePurchased();
        java.lang.String str5 = itemPurchased3.getEmail();
        java.util.Date date6 = itemPurchased3.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased11 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date12 = itemPurchased11.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased13 = new org.team4.functionality.buy.ItemPurchased("Mobile Wallet", "", date12);
        java.util.Date date14 = itemPurchased13.getDatePurchased();
        org.team4.model.course.Course course17 = new org.team4.model.course.Course("SubscribeNewsletter{title='hi!', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}', dateSubscribed=null, dateDue=Fri Mar 29 00:42:06 EDT 2024}", date6, date14, "ItemToPurchase{item=null, user=User [email=hi!, password=, name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, type=ProcessPayment{modes=null, itemToPurchase=null}, validated=false], newsletter=null}", "Course [course name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:42:05 EDT 2024, end date=Fri Mar 29 00:42:05 EDT 2024, ISBN=, email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}]");
        org.team4.model.items.Newsletter newsletter21 = new org.team4.model.items.Newsletter("hi!", "PayPal", (double) 0L);
        org.team4.functionality.buy.ItemPurchased itemPurchased25 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date26 = itemPurchased25.getDatePurchased();
        java.util.Date date27 = itemPurchased25.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased30 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date31 = itemPurchased30.getDatePurchased();
        org.team4.model.course.Course course34 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date27, date31, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.user.Faculty faculty44 = new org.team4.model.user.Faculty("", "", "hi!", "hi!", true);
        java.util.ArrayList<java.lang.String> strList45 = faculty44.getCourses();
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        faculty44.setCourses(strList48);
        org.team4.model.user.Student student51 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "", strList48);
        course34.enrollStudent(student51);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase53 = new org.team4.functionality.buy.ItemToPurchase(newsletter21, (org.team4.model.user.User) student51);
        student51.setType("Book{genre='null', noOfPages=0, author='null', ISBN=null, publisher='null', edition='0'}");
        course17.enrollStudent(student51);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date26);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date27);
// flaky:         org.junit.Assert.assertEquals(date27.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNull(strList45);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.Item item9 = new org.team4.model.items.Item((org.team4.model.items.Item) courseTextBook1);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder15 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder17 = courseTextBookBuilder15.hasHardCopy(true);
        java.util.Date date19 = null;
        java.util.Date date20 = null;
        org.team4.model.course.Course course23 = new org.team4.model.course.Course("", date19, date20, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder24 = courseTextBookBuilder15.course(course23);
        org.team4.model.course.CourseTextBook courseTextBook26 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}", (int) '#', "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "", (int) (byte) 0, course23, false);
        java.lang.String str27 = course23.getCourseName();
        java.util.Date date28 = course23.getEndDate();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookBuilder17);
        org.junit.Assert.assertNotNull(courseTextBookBuilder24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(date28);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder3 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder5 = courseTextBookBuilder0.isVirtual(false);
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        org.team4.model.course.Course course11 = new org.team4.model.course.Course("", date7, date8, "", "hi!");
        java.util.Date date12 = course11.getStartDate();
        java.lang.String str13 = course11.getCourseTextBookISBN();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder14 = courseTextBookBuilder5.course(course11);
        org.team4.model.course.CourseTextBook courseTextBook15 = courseTextBookBuilder5.build();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(bookBuilder3);
        org.junit.Assert.assertNotNull(courseTextBookBuilder5);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(courseTextBookBuilder14);
        org.junit.Assert.assertNotNull(courseTextBook15);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.Magazine magazine1 = magazineBuilder0.build();
        java.lang.String str2 = magazine1.getPublisher();
        org.team4.model.items.Newsletter newsletter6 = new org.team4.model.items.Newsletter("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) (short) -1);
        org.team4.model.user.NonFaculty nonFaculty12 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "PayPal{email='hi!'}", "Mobile Wallet", "PayPal{email='hi!'}", (long) (byte) 1);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase13 = new org.team4.functionality.buy.ItemToPurchase(newsletter6, (org.team4.model.user.User) nonFaculty12);
        boolean boolean14 = magazine1.equals((java.lang.Object) newsletter6);
        java.lang.String str15 = magazine1.getTitle();
        org.junit.Assert.assertNotNull(magazine1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("SubscribeNewsletter{title='hi!', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}', dateSubscribed=null, dateDue=null}");
        java.lang.String str2 = mobileWallet1.getMode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PayPal" + "'", str2, "PayPal");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        int int7 = courseTextBook1.getEdition();
        boolean boolean8 = courseTextBook1.isPurchasable();
        double double9 = courseTextBook1.getPrice();
        boolean boolean10 = courseTextBook1.hasSoftCopy();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.email("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.title("PayPal");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.author("Debit Card");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder6.title("PayPal");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder10 = bookRequestBuilder8.title("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:42:04 EDT 2024}");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
        org.junit.Assert.assertNotNull(bookRequestBuilder10);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("hi!", "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "ProcessPayment{modes=PayPal{email='hi!'}, itemToPurchase=ItemToPurchase{item=null, user=User [email=hi!, password=hi!, name=hi!, type=hi!, validated=false], newsletter=null}}", false);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.team4.model.items.Item item0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.items.Item item1 = new org.team4.model.items.Item(item0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"title\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) (short) -1);
        java.lang.String str4 = newsletter3.getTitle();
        java.lang.String str5 = newsletter3.getLink();
        org.team4.model.user.NonFaculty nonFaculty11 = new org.team4.model.user.NonFaculty("hi!", "hi!", "", "hi!", false);
        long long12 = nonFaculty11.getUniversityID();
        nonFaculty11.setUniversityID(100L);
        nonFaculty11.setValidated(false);
        long long17 = nonFaculty11.getUniversityID();
        nonFaculty11.setUniversityID((long) (short) 100);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase20 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) nonFaculty11);
        long long21 = nonFaculty11.getUniversityID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}" + "'", str4, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str5, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.team4.model.user.Faculty faculty9 = new org.team4.model.user.Faculty("hi!", "hi!", "hi!", "hi!");
        faculty9.setFacultyID((long) 0);
        java.lang.String[] strArray16 = new java.lang.String[] { "ProcessPayment{modes=null, itemToPurchase=null}", "ProcessPayment{modes=null, itemToPurchase=null}", "hi!", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        faculty9.setCourses(strList17);
        org.team4.model.user.Faculty faculty20 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:02 EDT 2024, dateDue=Mon Apr 29 00:42:02 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:05 EDT 2024, dateDue=Mon Apr 29 00:42:05 EDT 2024}", "hi!", "SubscribeNewsletter{title='hi!', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}', dateSubscribed=null, dateDue=null}", (long) (short) 100, strList17);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator9 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) purchasableItemDecorator9);
        boolean boolean11 = rentableItemDecorator10.isPurchasable();
        boolean boolean12 = rentableItemDecorator10.isRentable();
        boolean boolean13 = rentableItemDecorator10.isRentable();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("hi!", 100, 100, (double) 10L, "PayPal", false, true);
        int int8 = item7.getYearPublished();
        org.team4.model.items.DVD dVD11 = new org.team4.model.items.DVD(item7, "", (double) 10);
        org.team4.model.items.Item item12 = new org.team4.model.items.Item(item7);
        item12.setQuantity((int) '4');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        org.team4.model.items.Item item7 = purchasableItemDecorator6.getItem();
        boolean boolean8 = purchasableItemDecorator6.isPurchasable();
        int int9 = purchasableItemDecorator6.getQuantity();
        org.team4.model.items.Item item10 = purchasableItemDecorator6.getItem();
        boolean boolean11 = purchasableItemDecorator6.isPurchasable();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(item7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) (short) -1);
        double double4 = newsletter3.getPrice();
        org.team4.model.user.Manager manager9 = new org.team4.model.user.Manager("hi!", "hi!", "hi!", "");
        manager9.setType("");
        long long12 = manager9.getManagerID();
        manager9.setManagerID((long) (-1));
        org.team4.functionality.buy.ItemToPurchase itemToPurchase15 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) manager9);
        org.team4.model.user.Faculty faculty21 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "", false);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase22 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) faculty21);
        java.lang.String str23 = itemToPurchase22.toString();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("hi!", "hi!", "hi!", "hi!");
        faculty4.setType("ProcessPayment{modes=null, itemToPurchase=null}");
        faculty4.setFacultyID((long) (byte) 1);
        java.lang.String str9 = faculty4.getType();
        faculty4.setFacultyID(7511406L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ProcessPayment{modes=null, itemToPurchase=null}" + "'", str9, "ProcessPayment{modes=null, itemToPurchase=null}");
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) (short) -1);
        double double4 = newsletter3.getPrice();
        org.team4.model.user.Manager manager9 = new org.team4.model.user.Manager("hi!", "hi!", "hi!", "");
        manager9.setType("");
        long long12 = manager9.getManagerID();
        manager9.setManagerID((long) (-1));
        org.team4.functionality.buy.ItemToPurchase itemToPurchase15 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) manager9);
        org.team4.model.items.Item item16 = itemToPurchase15.getItem();
        java.lang.String str17 = itemToPurchase15.toString();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator9 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) purchasableItemDecorator9);
        boolean boolean11 = rentableItemDecorator10.isRentable();
        int int12 = rentableItemDecorator10.getQuantity();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("hi!", "hi!", "", "hi!", false);
        long long6 = nonFaculty5.getUniversityID();
        nonFaculty5.setUniversityID(100L);
        nonFaculty5.setValidated(false);
        java.lang.String str11 = nonFaculty5.toString();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [email=hi!, password=hi!, name=, type=hi!, validated=false]" + "'", str11, "User [email=hi!, password=hi!, name=, type=hi!, validated=false]");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.hasHardCopy(true);
        java.util.Date date4 = null;
        java.util.Date date5 = null;
        org.team4.model.course.Course course8 = new org.team4.model.course.Course("", date4, date5, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder9 = courseTextBookBuilder0.course(course8);
        java.util.Date date11 = null;
        java.util.Date date12 = null;
        org.team4.model.course.Course course15 = new org.team4.model.course.Course("", date11, date12, "", "hi!");
        java.util.Date date16 = course15.getStartDate();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder17 = courseTextBookBuilder9.course(course15);
        org.team4.model.items.builder.BookBuilder bookBuilder19 = courseTextBookBuilder17.genre("hi!");
        org.team4.model.items.Book book20 = courseTextBookBuilder17.build();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(courseTextBookBuilder9);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNotNull(courseTextBookBuilder17);
        org.junit.Assert.assertNotNull(bookBuilder19);
        org.junit.Assert.assertNotNull(book20);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:58 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]", "ItemPurchased{title='', email='ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}', datePurchased=Fri Mar 29 00:42:01 EDT 2024}", 8678132L);
        manager5.setManagerID((long) 97);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("Mobile Wallet", "", "Mobile Wallet", "", 0, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        java.lang.String str7 = bookRequest6.getTitle();
        java.lang.String str8 = bookRequest6.getAuthor();
        java.lang.String str9 = bookRequest6.getBookType();
        java.lang.String str10 = bookRequest6.getAuthor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Mobile Wallet" + "'", str8, "Mobile Wallet");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str9, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Mobile Wallet" + "'", str10, "Mobile Wallet");
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        java.lang.String str9 = courseTextBook1.getISBN();
        org.team4.model.items.decorator.ItemDecorator itemDecorator10 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook1);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder11 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook12 = courseTextBookBuilder11.build();
        java.util.Date date19 = null;
        java.util.Date date20 = null;
        org.team4.model.course.Course course23 = new org.team4.model.course.Course("", date19, date20, "", "hi!");
        org.team4.model.course.CourseTextBook courseTextBook25 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook12, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", 10, "hi!", "", (int) (byte) -1, course23, false);
        java.lang.String str26 = courseTextBook12.getTitle();
        org.team4.model.course.Course course27 = courseTextBook12.getCourse();
        boolean boolean28 = courseTextBook12.hasHardCopy();
        org.team4.model.course.Course course29 = courseTextBook12.getCourse();
        boolean boolean30 = courseTextBook12.isRentable();
        boolean boolean31 = courseTextBook12.hasHardCopy();
        boolean boolean32 = itemDecorator10.equals((java.lang.Object) courseTextBook12);
        int int33 = courseTextBook12.getEdition();
        int int34 = courseTextBook12.getQuantity();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseTextBook12);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(course27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(course29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.items.RentedItem rentedItem4 = new org.team4.model.items.RentedItem("", "hi!", date2, date3);
        java.util.Date date5 = rentedItem4.getRentDate();
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        java.util.Date date8 = null;
        java.util.Date date9 = null;
        org.team4.model.course.Course course12 = new org.team4.model.course.Course("", date8, date9, "", "hi!");
        org.team4.model.course.CourseTextBook courseTextBook14 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", 10, "hi!", "", (int) (byte) -1, course12, false);
        java.lang.String str15 = courseTextBook1.getTitle();
        org.team4.model.course.Course course16 = courseTextBook1.getCourse();
        boolean boolean17 = courseTextBook1.hasHardCopy();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator18 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        boolean boolean19 = purchasableItemDecorator18.isPurchasable();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator20 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) purchasableItemDecorator18);
        org.team4.model.items.Item item21 = new org.team4.model.items.Item((org.team4.model.items.Item) purchasableItemDecorator18);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(course16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }
}
