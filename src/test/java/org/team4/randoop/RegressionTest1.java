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
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook8 = courseTextBookBuilder6.build();
        java.util.List<org.team4.model.user.Student> studentList9 = courseTextBook8.getStudentsWithCopies();
        int int10 = courseTextBook8.getNoOfPages();
        java.util.List<org.team4.model.user.Student> studentList11 = courseTextBook8.getStudentsWithCopies();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder17 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder19 = courseTextBookBuilder17.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder21 = courseTextBookBuilder17.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder23 = courseTextBookBuilder17.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder25 = courseTextBookBuilder23.yearPublished((int) (short) 100);
        org.team4.model.items.Book book26 = courseTextBookBuilder23.build();
        boolean boolean27 = book26.hasHardCopy();
        book26.setQuantity((int) '4');
        org.team4.model.user.Visitor visitor35 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase36 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor35);
        org.team4.model.paymentmodes.CreditCard creditCard40 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete41 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase36, (org.team4.model.paymentmodes.PaymentValidator) creditCard40);
        long long42 = purchaseComplete41.getPurchaseID();
        org.team4.model.user.User user43 = purchaseComplete41.getUser();
        org.team4.model.items.Newsletter newsletter44 = purchaseComplete41.getNewsletter();
        boolean boolean45 = book26.equals((java.lang.Object) newsletter44);
        book26.setQuantity((int) ' ');
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder53 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder55 = courseTextBookBuilder53.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder57 = courseTextBookBuilder53.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder59 = courseTextBookBuilder53.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder61 = courseTextBookBuilder53.price((double) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder63 = courseTextBookBuilder53.price((double) 10);
        org.team4.model.course.CourseTextBook courseTextBook64 = courseTextBookBuilder53.build();
        java.util.Date date71 = null;
        java.util.Date date72 = null;
        org.team4.model.course.Course course75 = new org.team4.model.course.Course("hi!", date71, date72, "", "hi!");
        java.lang.String str76 = course75.getProfessorEmail();
        org.team4.model.user.Student student77 = null;
        boolean boolean78 = course75.isEnrolled(student77);
        org.team4.model.course.CourseTextBook courseTextBook80 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook64, "hi!", (int) (short) 1, "PayPal", "Credit Card", (int) (short) 10, course75, true);
        org.team4.model.course.CourseTextBook courseTextBook82 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) book26, "ItemPurchased{title='', email='hi!', datePurchased=null}", (int) ' ', "User [email=hi!, password=hi!, name=hi!, type=, validated=false]", "PayPal", (int) (byte) 10, course75, true);
        org.team4.model.course.CourseTextBook courseTextBook84 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook8, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", 100, "hi!", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", (int) (short) 100, course75, false);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertNotNull(studentList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(studentList11);
        org.junit.Assert.assertNotNull(bookBuilder19);
        org.junit.Assert.assertNotNull(bookItemBuilder21);
        org.junit.Assert.assertNotNull(courseTextBookBuilder23);
        org.junit.Assert.assertNotNull(bookItemBuilder25);
        org.junit.Assert.assertNotNull(book26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long42 + "' != '" + 7509200L + "'", long42 == 7509200L);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNull(newsletter44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(bookBuilder55);
        org.junit.Assert.assertNotNull(bookItemBuilder57);
        org.junit.Assert.assertNotNull(bookBuilder59);
        org.junit.Assert.assertNotNull(bookItemBuilder61);
        org.junit.Assert.assertNotNull(bookItemBuilder63);
        org.junit.Assert.assertNotNull(courseTextBook64);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder0.price((double) 10);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder11 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder13 = courseTextBookBuilder11.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder15 = courseTextBookBuilder11.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder17 = courseTextBookBuilder11.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder19 = courseTextBookBuilder11.hasSoftCopy(true);
        org.team4.model.course.CourseTextBook courseTextBook20 = courseTextBookBuilder11.build();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder26 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder28 = courseTextBookBuilder26.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder30 = courseTextBookBuilder26.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder32 = courseTextBookBuilder26.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder34 = courseTextBookBuilder26.quantity((int) (short) 100);
        java.util.Date date36 = null;
        java.util.Date date37 = null;
        org.team4.model.course.Course course40 = new org.team4.model.course.Course("hi!", date36, date37, "", "hi!");
        java.util.Date date41 = course40.getEndDate();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder42 = courseTextBookBuilder26.course(course40);
        org.team4.model.user.Student student48 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str49 = student48.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase50 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student48);
        java.lang.String str51 = student48.toString();
        java.lang.String str52 = student48.getEmail();
        java.lang.String str53 = student48.toString();
        course40.enrollStudent(student48);
        org.team4.model.course.CourseTextBook courseTextBook56 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook20, "hi!", 52, "User [email=, password=, name=hi!, type=, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", (int) 'a', course40, false);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder57 = courseTextBookBuilder0.course(course40);
        org.team4.model.items.builder.BookBuilder bookBuilder59 = courseTextBookBuilder57.noOfPages((int) (byte) 0);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(bookBuilder13);
        org.junit.Assert.assertNotNull(bookItemBuilder15);
        org.junit.Assert.assertNotNull(courseTextBookBuilder17);
        org.junit.Assert.assertNotNull(bookBuilder19);
        org.junit.Assert.assertNotNull(courseTextBook20);
        org.junit.Assert.assertNotNull(bookBuilder28);
        org.junit.Assert.assertNotNull(bookItemBuilder30);
        org.junit.Assert.assertNotNull(bookBuilder32);
        org.junit.Assert.assertNotNull(bookItemBuilder34);
        org.junit.Assert.assertNull(date41);
        org.junit.Assert.assertNotNull(courseTextBookBuilder42);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str51, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str53, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertNotNull(courseTextBookBuilder57);
        org.junit.Assert.assertNotNull(bookBuilder59);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.quantity((int) (short) 100);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        org.team4.model.course.Course course14 = new org.team4.model.course.Course("hi!", date10, date11, "", "hi!");
        java.util.Date date15 = course14.getEndDate();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder16 = courseTextBookBuilder0.course(course14);
        org.team4.model.items.builder.BookBuilder bookBuilder18 = courseTextBookBuilder0.author("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder20 = bookBuilder18.title("ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNotNull(courseTextBookBuilder16);
        org.junit.Assert.assertNotNull(bookBuilder18);
        org.junit.Assert.assertNotNull(bookItemBuilder20);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("", date1, date2, "", "hi!");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter13 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str14 = subscribeNewsletter13.getTitle();
        java.util.Date date15 = null;
        subscribeNewsletter13.setDateSubscribed(date15);
        java.util.Date date17 = subscribeNewsletter13.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter22 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str23 = subscribeNewsletter22.getEmail();
        java.util.Date date24 = subscribeNewsletter22.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter27 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str28 = subscribeNewsletter27.getEmail();
        java.util.Date date29 = subscribeNewsletter27.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter30 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date24, date29);
        org.team4.model.course.Course course33 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date17, date29, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.functionality.buy.ItemPurchased itemPurchased34 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", date29);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter41 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str42 = subscribeNewsletter41.getEmail();
        java.util.Date date43 = subscribeNewsletter41.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter46 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str47 = subscribeNewsletter46.getEmail();
        java.util.Date date48 = subscribeNewsletter46.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter49 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date43, date48);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter52 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter52.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter52.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter59 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date60 = null;
        subscribeNewsletter59.setDateSubscribed(date60);
        java.util.Date date62 = subscribeNewsletter59.getDateDue();
        subscribeNewsletter52.setDateDue(date62);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter64 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", date48, date62);
        org.team4.model.items.RentedItem rentedItem65 = new org.team4.model.items.RentedItem("User [email=, password=, name=hi!, type=, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date29, date62);
        java.lang.String str66 = rentedItem65.getISBN();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter69 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter69.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter69.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter76 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date77 = null;
        subscribeNewsletter76.setDateSubscribed(date77);
        java.util.Date date79 = subscribeNewsletter76.getDateDue();
        subscribeNewsletter69.setDateDue(date79);
        rentedItem65.setDueDate(date79);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter84 = new org.team4.functionality.subscriptions.SubscribeNewsletter("User [email=, password=, name=hi!, type=, validated=false]", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter87 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str88 = subscribeNewsletter87.getTitle();
        java.util.Date date89 = subscribeNewsletter87.getDateDue();
        subscribeNewsletter84.setDateSubscribed(date89);
        rentedItem65.setDueDate(date89);
        java.util.Date date92 = rentedItem65.getRentDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean93 = course5.isStarted(date92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Tue Apr 30 19:21:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(date24);
// flaky:         org.junit.Assert.assertEquals(date24.toString(), "Tue Apr 30 19:21:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Tue Apr 30 19:21:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(date43);
// flaky:         org.junit.Assert.assertEquals(date43.toString(), "Tue Apr 30 19:21:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(date48);
// flaky:         org.junit.Assert.assertEquals(date48.toString(), "Tue Apr 30 19:21:54 EDT 2024");
        org.junit.Assert.assertNotNull(date62);
// flaky:         org.junit.Assert.assertEquals(date62.toString(), "Tue Apr 30 19:21:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str66, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(date79);
// flaky:         org.junit.Assert.assertEquals(date79.toString(), "Tue Apr 30 19:21:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!" + "'", str88, "hi!");
        org.junit.Assert.assertNotNull(date89);
// flaky:         org.junit.Assert.assertEquals(date89.toString(), "Tue Apr 30 19:21:54 EDT 2024");
        org.junit.Assert.assertNotNull(date92);
// flaky:         org.junit.Assert.assertEquals(date92.toString(), "Tue Apr 30 19:21:54 EDT 2024");
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", 0.0d);
        org.team4.model.user.Manager manager9 = new org.team4.model.user.Manager("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", "Credit Card", false);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase10 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) manager9);
        org.team4.model.user.NonFaculty nonFaculty15 = new org.team4.model.user.NonFaculty("hi!", "hi!", "hi!", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase16 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) nonFaculty15);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("PayPal", "SubscribeNewsletter{title='Credit Card', email='hi!', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.team4.model.items.builder.BookBuilder bookBuilder0 = new org.team4.model.items.builder.BookBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder2 = bookBuilder0.yearPublished((int) (short) 1);
        org.team4.model.items.builder.BookBuilder bookBuilder4 = bookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder6 = bookBuilder0.hasHardCopy(false);
        org.junit.Assert.assertNotNull(bookItemBuilder2);
        org.junit.Assert.assertNotNull(bookBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "hi!", "", "");
        visitor5.setName("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        java.lang.String str8 = visitor5.toString();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase9 = new org.team4.functionality.buy.ItemToPurchase((double) 1.0f, (org.team4.model.user.User) visitor5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [email=, password=hi!, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=, validated=false]" + "'", str8, "User [email=, password=hi!, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=, validated=false]");
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", "User [email=, password=, name=hi!, type=hi!, validated=false]", true);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder10 = courseTextBookBuilder0.isVirtual(false);
        org.team4.model.items.Book book11 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder13 = courseTextBookBuilder0.isVirtual(false);
        org.team4.model.items.builder.BookBuilder bookBuilder15 = courseTextBookBuilder13.genre("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder17 = courseTextBookBuilder13.title("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder19 = bookItemBuilder17.quantity((-1));
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(courseTextBookBuilder10);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(courseTextBookBuilder13);
        org.junit.Assert.assertNotNull(bookBuilder15);
        org.junit.Assert.assertNotNull(bookItemBuilder17);
        org.junit.Assert.assertNotNull(bookItemBuilder19);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter4 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str5 = subscribeNewsletter4.getEmail();
        subscribeNewsletter4.setTitle("hi!");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter10 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        java.util.Date date11 = subscribeNewsletter10.getDateSubscribed();
        subscribeNewsletter4.setDateDue(date11);
        org.team4.functionality.buy.ItemPurchased itemPurchased13 = new org.team4.functionality.buy.ItemPurchased("User [email=hi!, password=hi!, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", date11);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Sat Mar 30 19:21:54 EDT 2024");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "User [email=, password=, name=hi!, type=, validated=false]", (int) (short) 10, "ItemPurchased{title='', email='', datePurchased=null}");
        java.lang.String str7 = bookRequest6.getBookType();
        int int8 = bookRequest6.getEdition();
        java.lang.String str9 = bookRequest6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str7, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}" + "'", str9, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.team4.model.user.Manager manager4 = new org.team4.model.user.Manager("hi!", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "ItemPurchased{title='', email='', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        manager4.setEmail("ItemPurchased{title='', email='', datePurchased=null}");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "Debit Card", false);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.DVD dVD10 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Credit Card", 0.0d);
        int int11 = book7.getNoOfPages();
        book7.setPrice((double) (-1L));
        org.team4.model.items.builder.DVDBuilder dVDBuilder14 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder16 = dVDBuilder14.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder18 = dVDBuilder16.price((double) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder20 = dVDBuilder16.quantity(10);
        boolean boolean21 = book7.equals((java.lang.Object) dVDBuilder16);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder23 = dVDBuilder16.quantity(0);
        org.team4.model.items.builder.DVDBuilder dVDBuilder25 = dVDBuilder16.genre("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=null}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dVDBuilder16);
        org.junit.Assert.assertNotNull(dVDItemBuilder18);
        org.junit.Assert.assertNotNull(dVDItemBuilder20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dVDItemBuilder23);
        org.junit.Assert.assertNotNull(dVDBuilder25);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        int int9 = book7.getQuantity();
        book7.setQuantity((int) (byte) 0);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase2 = null;
        org.team4.functionality.buy.ProcessPayment processPayment3 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet1, itemToPurchase2);
        boolean boolean4 = mobileWallet1.isValid();
        boolean boolean5 = mobileWallet1.isValid();
        boolean boolean6 = mobileWallet1.isValid();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("", "Debit Card", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        boolean boolean2 = payPal1.isValid();
        java.lang.String str3 = payPal1.toString();
        java.lang.String str4 = payPal1.getMode();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}" + "'", str3, "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Mobile Wallet" + "'", str4, "Mobile Wallet");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        dVD1.setQuantity((int) (short) 1);
        dVD1.setQuantity((int) ' ');
        boolean boolean9 = dVD1.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD1);
        org.team4.model.items.Item item11 = rentableItemDecorator10.getItem();
        org.team4.model.items.Item item12 = new org.team4.model.items.Item(item11);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter21 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str22 = subscribeNewsletter21.getTitle();
        java.util.Date date23 = null;
        subscribeNewsletter21.setDateSubscribed(date23);
        java.util.Date date25 = subscribeNewsletter21.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter30 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str31 = subscribeNewsletter30.getEmail();
        java.util.Date date32 = subscribeNewsletter30.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter35 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str36 = subscribeNewsletter35.getEmail();
        java.util.Date date37 = subscribeNewsletter35.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter38 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date32, date37);
        org.team4.model.course.Course course41 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date25, date37, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.model.course.CourseTextBook courseTextBook43 = new org.team4.model.course.CourseTextBook(item12, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", (int) (short) 1, "hi!", "PayPal", 52, course41, false);
        org.team4.model.course.Course course44 = courseTextBook43.getCourse();
        org.team4.model.course.Course course45 = courseTextBook43.getCourse();
        java.lang.String str46 = course45.toString();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Tue Apr 30 19:21:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 19:21:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 19:21:54 EDT 2024");
        org.junit.Assert.assertNotNull(course44);
        org.junit.Assert.assertNotNull(course45);
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Course [course name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, start date=Tue Apr 30 19:21:54 EDT 2024, end date=Tue Apr 30 19:21:54 EDT 2024, ISBN=ItemPurchased{title='', email='hi!', datePurchased=null}, email=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}]" + "'", str46, "Course [course name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, start date=Tue Apr 30 19:21:54 EDT 2024, end date=Tue Apr 30 19:21:54 EDT 2024, ISBN=ItemPurchased{title='', email='hi!', datePurchased=null}, email=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}]");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.booktype("Credit Card");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder5.booktype("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=null}");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("User [email=, password=, name=hi!, type=, validated=false]", (int) ' ', (int) (byte) 10);
        boolean boolean4 = debitCard3.notExpired();
        boolean boolean5 = debitCard3.notExpired();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.team4.model.items.builder.BookBuilder bookBuilder0 = new org.team4.model.items.builder.BookBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder2 = bookBuilder0.quantity((int) '4');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = bookBuilder0.title("Debit Card");
        org.team4.model.items.Book book5 = bookBuilder0.build();
        org.junit.Assert.assertNotNull(bookItemBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(book5);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        boolean boolean4 = debitCard3.notExpired();
        boolean boolean5 = debitCard3.notExpired();
        boolean boolean6 = debitCard3.correctLength();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        student5.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase8 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student5);
        java.lang.String str9 = student5.getEmail();
        java.lang.String str10 = student5.getName();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemPurchased{title='', email='', datePurchased=null}", "", "User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.user.Student student9 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str10 = student9.getType();
        org.team4.model.user.Student student15 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str16 = student15.getType();
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        student15.setCourses(strList19);
        student9.setCourses(strList19);
        faculty4.setCourses(strList19);
        org.team4.model.user.Student student33 = new org.team4.model.user.Student("", "Credit Card", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", false);
        org.team4.model.user.Student student43 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str44 = student43.getType();
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        student43.setCourses(strList47);
        org.team4.model.user.Faculty faculty50 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", (long) (byte) -1, strList47);
        java.lang.String str51 = faculty50.getName();
        faculty50.setFacultyID((long) (short) 1);
        java.util.Date date55 = null;
        java.util.Date date56 = null;
        org.team4.model.course.Course course59 = new org.team4.model.course.Course("hi!", date55, date56, "", "hi!");
        java.util.Date date60 = course59.getEndDate();
        java.lang.String str61 = course59.getProfessorEmail();
        java.lang.String str62 = course59.getProfessorEmail();
        org.team4.model.user.Student student68 = new org.team4.model.user.Student("", "", "hi!", "");
        student68.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase71 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student68);
        java.lang.String str72 = student68.getEmail();
        course59.enrollStudent(student68);
        org.team4.model.user.Faculty faculty79 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "hi!", "", "", false);
        faculty79.setFacultyID((long) (byte) 1);
        org.team4.model.user.Student student86 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str87 = student86.getType();
        java.lang.String[] strArray89 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList90 = new java.util.ArrayList<java.lang.String>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList90, strArray89);
        student86.setCourses(strList90);
        faculty79.setCourses(strList90);
        student68.setCourses(strList90);
        faculty50.setCourses(strList90);
        student33.setCourses(strList90);
        org.team4.model.user.Student student97 = new org.team4.model.user.Student("Credit Card", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", strList90);
        faculty4.setCourses(strList90);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str51, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertNull(date60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder0.build();
        double double10 = courseTextBook9.getPrice();
        int int11 = courseTextBook9.getEdition();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(courseTextBook9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder6 = courseTextBookBuilder0.quantity(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = bookItemBuilder6.title("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = bookItemBuilder8.title("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = bookItemBuilder10.quantity((int) '#');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder14 = bookItemBuilder12.yearPublished((int) '#');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder16 = bookItemBuilder12.price((double) 1403553L);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookItemBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(bookItemBuilder12);
        org.junit.Assert.assertNotNull(bookItemBuilder14);
        org.junit.Assert.assertNotNull(bookItemBuilder16);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
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
        java.lang.String str13 = courseTextBook8.getAuthor();
        java.lang.String str14 = courseTextBook8.getAuthor();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertNotNull(studentList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(studentList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.team4.model.user.User user5 = new org.team4.model.user.User("", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}", "User [email=, password=hi!, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=, validated=false]", "Debit Card", true);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.builder.DVDBuilder dVDBuilder4 = dVDBuilder0.genre("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder4.duration((double) (byte) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDBuilder6.title("");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.paymentmodes.DebitCard debitCard15 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete16 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) debitCard15);
        long long17 = purchaseComplete16.getPurchaseID();
        double double18 = purchaseComplete16.getAmount();
        long long19 = purchaseComplete16.getPurchaseID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 2135035L + "'", long17 == 2135035L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 2135035L + "'", long19 == 2135035L);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder15 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder17 = courseTextBookBuilder15.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder19 = courseTextBookBuilder15.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder21 = courseTextBookBuilder15.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder23 = courseTextBookBuilder15.quantity((int) (short) 100);
        java.util.Date date25 = null;
        java.util.Date date26 = null;
        org.team4.model.course.Course course29 = new org.team4.model.course.Course("hi!", date25, date26, "", "hi!");
        java.util.Date date30 = course29.getEndDate();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder31 = courseTextBookBuilder15.course(course29);
        org.team4.model.user.Student student37 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str38 = student37.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase39 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student37);
        java.lang.String str40 = student37.toString();
        java.lang.String str41 = student37.getEmail();
        java.lang.String str42 = student37.toString();
        course29.enrollStudent(student37);
        org.team4.model.course.CourseTextBook courseTextBook45 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook9, "hi!", 52, "User [email=, password=, name=hi!, type=, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", (int) 'a', course29, false);
        org.team4.model.user.Student student50 = new org.team4.model.user.Student("", "", "hi!", "");
        java.util.ArrayList<java.lang.String> strList51 = student50.getCourses();
        courseTextBook45.makeCopies(student50);
        java.util.List<org.team4.model.user.Student> studentList53 = courseTextBook45.getStudentsWithCopies();
        int int54 = courseTextBook45.getQuantity();
        org.team4.model.course.Course course55 = courseTextBook45.getCourse();
        java.util.Date date56 = course55.getEndDate();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(courseTextBook9);
        org.junit.Assert.assertNotNull(bookBuilder17);
        org.junit.Assert.assertNotNull(bookItemBuilder19);
        org.junit.Assert.assertNotNull(bookBuilder21);
        org.junit.Assert.assertNotNull(bookItemBuilder23);
        org.junit.Assert.assertNull(date30);
        org.junit.Assert.assertNotNull(courseTextBookBuilder31);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str40, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str42, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertNull(strList51);
        org.junit.Assert.assertNotNull(studentList53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(course55);
        org.junit.Assert.assertNull(date56);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.team4.model.user.Manager manager4 = new org.team4.model.user.Manager("hi!", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "ItemPurchased{title='', email='', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        long long5 = manager4.getManagerID();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.team4.model.user.Faculty faculty8 = new org.team4.model.user.Faculty("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemPurchased{title='', email='', datePurchased=null}", "", "User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.user.Student student13 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str14 = student13.getType();
        org.team4.model.user.Student student19 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str20 = student19.getType();
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        student19.setCourses(strList23);
        student13.setCourses(strList23);
        faculty8.setCourses(strList23);
        org.team4.model.user.Student student28 = new org.team4.model.user.Student("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "User [email=, password=, name=hi!, type=hi!, validated=false]", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}", strList23);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        boolean boolean10 = book9.hasHardCopy();
        book9.setQuantity((int) '4');
        org.team4.model.user.Visitor visitor18 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase19 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor18);
        org.team4.model.paymentmodes.CreditCard creditCard23 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete24 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase19, (org.team4.model.paymentmodes.PaymentValidator) creditCard23);
        long long25 = purchaseComplete24.getPurchaseID();
        org.team4.model.user.User user26 = purchaseComplete24.getUser();
        org.team4.model.items.Newsletter newsletter27 = purchaseComplete24.getNewsletter();
        boolean boolean28 = book9.equals((java.lang.Object) newsletter27);
        book9.setQuantity((int) ' ');
        org.team4.model.items.Magazine magazine33 = new org.team4.model.items.Magazine((org.team4.model.items.Item) book9, "", (int) (short) 100);
        int int34 = book9.getNoOfPages();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5204226L + "'", long25 == 5204226L);
        org.junit.Assert.assertNotNull(user26);
        org.junit.Assert.assertNull(newsletter27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("ItemPurchased{title='', email='hi!', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "", "ItemPurchased{title='', email='', datePurchased=null}", 0, "User [email=, password=, name=hi!, type=, validated=false]");
        java.lang.String str7 = bookRequest6.getBookType();
        int int8 = bookRequest6.getEdition();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str7, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator11 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        org.team4.model.user.Faculty faculty17 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "hi!", "", "", false);
        faculty17.setFacultyID((long) (byte) 1);
        org.team4.model.user.Student student24 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str25 = student24.getType();
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        student24.setCourses(strList28);
        faculty17.setCourses(strList28);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase32 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) rentableItemDecorator11, (org.team4.model.user.User) faculty17);
        org.team4.model.items.builder.DVDBuilder dVDBuilder33 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder35 = dVDBuilder33.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder37 = dVDBuilder33.title("hi!");
        org.team4.model.items.builder.DVDBuilder dVDBuilder39 = dVDBuilder33.duration((double) 10L);
        org.team4.model.items.builder.DVDBuilder dVDBuilder41 = dVDBuilder33.genre("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        boolean boolean42 = rentableItemDecorator11.equals((java.lang.Object) dVDBuilder33);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder44 = dVDBuilder33.price((double) 6041283L);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(dVDBuilder35);
        org.junit.Assert.assertNotNull(dVDItemBuilder37);
        org.junit.Assert.assertNotNull(dVDBuilder39);
        org.junit.Assert.assertNotNull(dVDBuilder41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(dVDItemBuilder44);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("Mobile Wallet", "ItemPurchased{title='', email='', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "User [email=, password=, name=hi!, type=hi!, validated=false]", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}", "hi!", 0L);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}", (long) (short) -1);
        java.lang.String str6 = nonFaculty5.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}" + "'", str6, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter6 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date7 = null;
        subscribeNewsletter6.setDateSubscribed(date7);
        java.util.Date date9 = subscribeNewsletter6.getDateDue();
        org.team4.functionality.buy.ItemPurchased itemPurchased10 = new org.team4.functionality.buy.ItemPurchased("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", date9);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter14 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str15 = subscribeNewsletter14.getTitle();
        java.util.Date date16 = null;
        subscribeNewsletter14.setDateSubscribed(date16);
        java.util.Date date18 = subscribeNewsletter14.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter23 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str24 = subscribeNewsletter23.getEmail();
        java.util.Date date25 = subscribeNewsletter23.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter28 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str29 = subscribeNewsletter28.getEmail();
        java.util.Date date30 = subscribeNewsletter28.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter31 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date25, date30);
        org.team4.model.course.Course course34 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date18, date30, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter35 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "User [email=, password=hi!, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=, validated=false]", date9, date18);
        java.lang.String str36 = subscribeNewsletter35.getEmail();
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Tue Apr 30 19:21:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Tue Apr 30 19:21:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Tue Apr 30 19:21:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(date30);
// flaky:         org.junit.Assert.assertEquals(date30.toString(), "Tue Apr 30 19:21:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "User [email=, password=hi!, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=, validated=false]" + "'", str36, "User [email=, password=hi!, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=, validated=false]");
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        dVD1.setQuantity((int) (short) 1);
        dVD1.setQuantity((int) ' ');
        boolean boolean9 = dVD1.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD1);
        org.team4.model.items.Item item11 = rentableItemDecorator10.getItem();
        org.team4.model.items.Item item12 = rentableItemDecorator10.getItem();
        org.team4.model.items.Item item13 = rentableItemDecorator10.getItem();
        boolean boolean14 = rentableItemDecorator10.isRentable();
        org.team4.model.items.decorator.ItemDecorator itemDecorator15 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) rentableItemDecorator10);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertNotNull(item12);
        org.junit.Assert.assertNotNull(item13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.team4.model.user.User user5 = new org.team4.model.user.User("hi!", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=Tue Apr 30 19:21:52 EDT 2024}", "Course [course name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, start date=Tue Apr 30 19:21:54 EDT 2024, end date=Tue Apr 30 19:21:54 EDT 2024, ISBN=ItemPurchased{title='', email='hi!', datePurchased=null}, email=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}]", "ItemPurchased{title='', email='hi!', datePurchased=null}", false);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        java.util.Date date2 = null;
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("", "hi!", date2);
        java.lang.String str4 = itemPurchased3.getTitle();
        java.lang.String str5 = itemPurchased3.toString();
        java.lang.String str6 = itemPurchased3.getTitle();
        java.util.Date date7 = itemPurchased3.getDatePurchased();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str5, "ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "User [email=, password=, name=hi!, type=, validated=false]", "ItemPurchased{title='', email='', datePurchased=null}", "");
        nonFaculty4.setUniversityID(2890906L);
        java.lang.String str7 = nonFaculty4.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}" + "'", str7, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("User [email=, password=, name=hi!, type=, validated=false]", (int) 'a', (int) (short) -1, (double) (short) -1, "PayPal", true, false);
        item7.setPrice((double) 'a');
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter8 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str9 = subscribeNewsletter8.getEmail();
        java.util.Date date10 = subscribeNewsletter8.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter13 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str14 = subscribeNewsletter13.getEmail();
        java.util.Date date15 = subscribeNewsletter13.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter16 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date10, date15);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter19 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter19.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter19.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter26 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date27 = null;
        subscribeNewsletter26.setDateSubscribed(date27);
        java.util.Date date29 = subscribeNewsletter26.getDateDue();
        subscribeNewsletter19.setDateDue(date29);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter31 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", date15, date29);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter35 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str36 = subscribeNewsletter35.getTitle();
        java.util.Date date37 = null;
        subscribeNewsletter35.setDateSubscribed(date37);
        java.util.Date date39 = subscribeNewsletter35.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter42 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter42.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter48 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str49 = subscribeNewsletter48.getTitle();
        java.util.Date date50 = null;
        subscribeNewsletter48.setDateSubscribed(date50);
        java.util.Date date52 = subscribeNewsletter48.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter57 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str58 = subscribeNewsletter57.getEmail();
        java.util.Date date59 = subscribeNewsletter57.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter62 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str63 = subscribeNewsletter62.getEmail();
        java.util.Date date64 = subscribeNewsletter62.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter65 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date59, date64);
        org.team4.model.course.Course course68 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date52, date64, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        subscribeNewsletter42.setDateSubscribed(date52);
        org.team4.model.course.Course course72 = new org.team4.model.course.Course("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", date39, date52, "Credit Card", "ItemPurchased{title='', email='', datePurchased=null}");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter73 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}", date15, date39);
        java.lang.String str74 = subscribeNewsletter73.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Tue Apr 30 19:21:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Tue Apr 30 19:21:55 EDT 2024");
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Tue Apr 30 19:21:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Tue Apr 30 19:21:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(date52);
// flaky:         org.junit.Assert.assertEquals(date52.toString(), "Tue Apr 30 19:21:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertNotNull(date59);
// flaky:         org.junit.Assert.assertEquals(date59.toString(), "Tue Apr 30 19:21:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertNotNull(date64);
// flaky:         org.junit.Assert.assertEquals(date64.toString(), "Tue Apr 30 19:21:55 EDT 2024");
// flaky:         org.junit.Assert.assertEquals("'" + str74 + "' != '" + "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}', email='SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}', dateSubscribed=Tue Apr 30 19:21:55 EDT 2024, dateDue=Tue Apr 30 19:21:55 EDT 2024}" + "'", str74, "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}', email='SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}', dateSubscribed=Tue Apr 30 19:21:55 EDT 2024, dateDue=Tue Apr 30 19:21:55 EDT 2024}");
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getEndDate();
        java.util.Date date7 = course5.getStartDate();
        java.util.Date date8 = course5.getStartDate();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter12 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str13 = subscribeNewsletter12.getTitle();
        java.util.Date date14 = null;
        subscribeNewsletter12.setDateSubscribed(date14);
        java.util.Date date16 = subscribeNewsletter12.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter21 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str22 = subscribeNewsletter21.getEmail();
        java.util.Date date23 = subscribeNewsletter21.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter26 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str27 = subscribeNewsletter26.getEmail();
        java.util.Date date28 = subscribeNewsletter26.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter29 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date23, date28);
        org.team4.model.course.Course course32 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date16, date28, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = course5.isStarted(date28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Tue Apr 30 19:21:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 19:21:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Tue Apr 30 19:21:55 EDT 2024");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
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
        int int22 = courseTextBook8.getNoOfPages();
        courseTextBook8.setQuantity(10);
        int int25 = courseTextBook8.getYearPublished();
        java.lang.String str26 = courseTextBook8.getAuthor();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        java.util.Date date3 = subscribeNewsletter2.getDateSubscribed();
        java.lang.String str4 = subscribeNewsletter2.toString();
        subscribeNewsletter2.setEmail("");
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Sat Mar 30 19:21:55 EDT 2024");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:55 EDT 2024, dateDue=Tue Apr 30 19:21:55 EDT 2024}" + "'", str4, "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:55 EDT 2024, dateDue=Tue Apr 30 19:21:55 EDT 2024}");
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.team4.model.user.UserFactory userFactory0 = new org.team4.model.user.UserFactory();
        org.team4.model.user.User user6 = userFactory0.getUser("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", false);
        org.team4.model.user.User user12 = userFactory0.getUser("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal", "Debit Card", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", false);
        org.team4.model.user.User user18 = userFactory0.getUser("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=Tue Apr 30 19:21:52 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", true);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user18);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("hi!", "ItemPurchased{title='', email='', datePurchased=null}", "Mobile Wallet", "Debit Card", (int) (byte) 0, "Debit Card");
        int int7 = bookRequest6.getEdition();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder5 = magazineBuilder0.ISBN("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder7 = magazineItemBuilder5.title("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder9 = magazineItemBuilder5.yearPublished((int) 'a');
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertNotNull(magazineItemBuilder5);
        org.junit.Assert.assertNotNull(magazineItemBuilder7);
        org.junit.Assert.assertNotNull(magazineItemBuilder9);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.paymentmodes.CreditCard creditCard10 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) creditCard10);
        java.lang.String str12 = creditCard10.getMode();
        org.team4.model.user.Student student18 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str19 = student18.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase20 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student18);
        org.team4.model.items.Newsletter newsletter21 = itemToPurchase20.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet23 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete24 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase20, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet23);
        org.team4.model.user.User user25 = itemToPurchase20.getUser();
        org.team4.functionality.buy.ProcessPayment processPayment26 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) creditCard10, itemToPurchase20);
        org.team4.model.paymentmodes.PayPal payPal28 = new org.team4.model.paymentmodes.PayPal("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        boolean boolean29 = payPal28.isValid();
        java.lang.String str30 = payPal28.toString();
        boolean boolean31 = payPal28.isValid();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete32 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase20, (org.team4.model.paymentmodes.PaymentValidator) payPal28);
        org.team4.model.items.Newsletter newsletter33 = purchaseComplete32.getNewsletter();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Credit Card" + "'", str12, "Credit Card");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(newsletter21);
        org.junit.Assert.assertNotNull(user25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}" + "'", str30, "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(newsletter33);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", 0.0d);
        org.team4.model.user.Manager manager9 = new org.team4.model.user.Manager("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", "Credit Card", false);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase10 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) manager9);
        org.team4.model.user.Manager manager15 = new org.team4.model.user.Manager("hi!", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "ItemPurchased{title='', email='', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase16 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) manager15);
        double double17 = newsletter3.getPrice();
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("ItemPurchased{title='', email='hi!', datePurchased=null}", "User [email=, password=hi!, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=, validated=false]", "User [email=, password=, name=hi!, type=, validated=false]", "PayPal");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "hi!", "", "", false);
        java.lang.String[] strArray31 = new java.lang.String[] { "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "PayPal", "ItemPurchased{title='', email='hi!', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemPurchased{title='', email='', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        org.team4.model.user.Faculty faculty34 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "", "ItemPurchased{title='', email='', datePurchased=null}", 0L, strList32);
        org.team4.model.user.Student student35 = new org.team4.model.user.Student("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "Debit Card", "hi!", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", strList32);
        org.team4.model.user.Student student36 = new org.team4.model.user.Student("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "User [email=, password=, name=hi!, type=, validated=false]", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemPurchased{title='', email='hi!', datePurchased=null}", strList32);
        faculty5.setCourses(strList32);
        faculty5.setFacultyID(4451361L);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("ItemPurchased{title='', email='hi!', datePurchased=null}");
        java.lang.String str2 = payPal1.getMode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Mobile Wallet" + "'", str2, "Mobile Wallet");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
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
        int int22 = courseTextBook8.getNoOfPages();
        courseTextBook8.setQuantity(10);
        java.lang.String str25 = courseTextBook8.getGenre();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
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
        org.team4.model.items.Magazine magazine23 = new org.team4.model.items.Magazine((org.team4.model.items.Item) courseTextBook8, "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}", (int) (short) 100);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("User [email=, password=, name=hi!, type=, validated=false]", (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.BookRequest bookRequest4 = bookRequestBuilder3.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder3.ISBN("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        boolean boolean8 = book7.hasHardCopy();
        java.lang.String str9 = book7.getGenre();
        org.team4.model.user.Manager manager15 = new org.team4.model.user.Manager("", "", "", "hi!", false);
        manager15.setValidated(false);
        manager15.setName("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase20 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) book7, (org.team4.model.user.User) manager15);
        org.team4.model.user.Manager manager26 = new org.team4.model.user.Manager("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "Credit Card", "PayPal", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", true);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase27 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) book7, (org.team4.model.user.User) manager26);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator28 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book7);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.team4.model.user.User user4 = new org.team4.model.user.User("", "hi!", "PayPal", "");
        user4.setType("ItemPurchased{title='', email='', datePurchased=null}");
        user4.setPassword("User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]");
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.util.Date date3 = subscribeNewsletter2.getDateSubscribed();
        java.lang.String str4 = subscribeNewsletter2.getEmail();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter7 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter7.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter7.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter14 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date15 = null;
        subscribeNewsletter14.setDateSubscribed(date15);
        java.util.Date date17 = subscribeNewsletter14.getDateDue();
        subscribeNewsletter7.setDateDue(date17);
        java.util.Date date19 = subscribeNewsletter7.getDateSubscribed();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter22 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str23 = subscribeNewsletter22.getEmail();
        java.util.Date date24 = subscribeNewsletter22.getDateDue();
        subscribeNewsletter7.setDateSubscribed(date24);
        subscribeNewsletter2.setDateSubscribed(date24);
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Sat Mar 30 19:21:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Tue Apr 30 19:21:55 EDT 2024");
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Sat Mar 30 19:21:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(date24);
// flaky:         org.junit.Assert.assertEquals(date24.toString(), "Tue Apr 30 19:21:55 EDT 2024");
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.paymentmodes.MobileWallet mobileWallet9 = new org.team4.model.paymentmodes.MobileWallet("");
        java.lang.String str10 = mobileWallet9.getMode();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet9);
        org.team4.model.items.Item item12 = purchaseComplete11.getItem();
        org.team4.model.items.Newsletter newsletter13 = purchaseComplete11.getNewsletter();
        org.team4.model.items.Newsletter newsletter14 = purchaseComplete11.getNewsletter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PayPal" + "'", str10, "PayPal");
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(newsletter14);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder6 = courseTextBookBuilder0.quantity(0);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder0.hasSoftCopy(true);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        org.team4.model.course.Course course14 = new org.team4.model.course.Course("hi!", date10, date11, "", "hi!");
        org.team4.model.user.Student student19 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str20 = student19.getType();
        course14.enrollStudent(student19);
        java.lang.String str22 = course14.getCourseName();
        org.team4.model.user.Student student23 = null;
        course14.enrollStudent(student23);
        java.lang.String str25 = course14.getCourseTextBookISBN();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder26 = courseTextBookBuilder0.course(course14);
        java.util.Date date27 = course14.getEndDate();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookItemBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(courseTextBookBuilder26);
        org.junit.Assert.assertNull(date27);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getEndDate();
        java.lang.String str7 = course5.getProfessorEmail();
        java.lang.String str8 = course5.getProfessorEmail();
        org.team4.model.user.Student student13 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean14 = course5.isEnrolled(student13);
        java.lang.String str15 = course5.getCourseTextBookISBN();
        java.lang.String str16 = course5.getProfessorEmail();
        java.lang.String str17 = course5.getProfessorEmail();
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder0.author("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = courseTextBookBuilder0.ISBN("User [email=hi!, password=hi!, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookBuilder bookBuilder14 = courseTextBookBuilder0.publisher("User [email=hi!, password=hi!, name=hi!, type=, validated=false]");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(bookItemBuilder12);
        org.junit.Assert.assertNotNull(bookBuilder14);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.team4.model.user.User user5 = new org.team4.model.user.User("hi!", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}', email='SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}', dateSubscribed=Tue Apr 30 19:21:55 EDT 2024, dateDue=Tue Apr 30 19:21:55 EDT 2024}", "User [email=, password=hi!, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=, validated=false]", "", false);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter7 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str8 = subscribeNewsletter7.getTitle();
        java.util.Date date9 = null;
        subscribeNewsletter7.setDateSubscribed(date9);
        java.util.Date date11 = subscribeNewsletter7.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter16 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str17 = subscribeNewsletter16.getEmail();
        java.util.Date date18 = subscribeNewsletter16.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter21 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str22 = subscribeNewsletter21.getEmail();
        java.util.Date date23 = subscribeNewsletter21.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter24 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date18, date23);
        org.team4.model.course.Course course27 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date11, date23, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.functionality.buy.ItemPurchased itemPurchased28 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", date23);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter35 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str36 = subscribeNewsletter35.getEmail();
        java.util.Date date37 = subscribeNewsletter35.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter40 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str41 = subscribeNewsletter40.getEmail();
        java.util.Date date42 = subscribeNewsletter40.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter43 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date37, date42);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter46 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter46.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter46.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter53 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date54 = null;
        subscribeNewsletter53.setDateSubscribed(date54);
        java.util.Date date56 = subscribeNewsletter53.getDateDue();
        subscribeNewsletter46.setDateDue(date56);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter58 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", date42, date56);
        org.team4.model.items.RentedItem rentedItem59 = new org.team4.model.items.RentedItem("User [email=, password=, name=hi!, type=, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date23, date56);
        java.util.Date date60 = rentedItem59.getDueDate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Apr 30 19:21:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Tue Apr 30 19:21:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 19:21:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 19:21:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 19:21:55 EDT 2024");
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Tue Apr 30 19:21:55 EDT 2024");
        org.junit.Assert.assertNotNull(date60);
// flaky:         org.junit.Assert.assertEquals(date60.toString(), "Tue Apr 30 19:21:55 EDT 2024");
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        java.lang.String str3 = dVD1.getGenre();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.course.Course course6 = new org.team4.model.course.Course("hi!", date2, date3, "", "hi!");
        java.util.Date date7 = course6.getEndDate();
        java.lang.String str8 = course6.getProfessorEmail();
        java.lang.String str9 = course6.getProfessorEmail();
        org.team4.model.user.Student student15 = new org.team4.model.user.Student("", "", "hi!", "");
        student15.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase18 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student15);
        java.lang.String str19 = student15.getEmail();
        course6.enrollStudent(student15);
        org.team4.model.user.Faculty faculty26 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "hi!", "", "", false);
        faculty26.setFacultyID((long) (byte) 1);
        org.team4.model.user.Student student33 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str34 = student33.getType();
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        student33.setCourses(strList37);
        faculty26.setCourses(strList37);
        student15.setCourses(strList37);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase42 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 100, (org.team4.model.user.User) student15);
        double double43 = itemToPurchase42.getAmount();
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 100.0d + "'", double43 == 100.0d);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}', email='SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}', dateSubscribed=Tue Apr 30 19:21:55 EDT 2024, dateDue=Tue Apr 30 19:21:55 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemPurchased{title='', email='', datePurchased=null}", "", 2046071L);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        java.lang.String str9 = book7.getGenre();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder10 = courseTextBookBuilder0.isVirtual(false);
        org.team4.model.items.builder.BookBuilder bookBuilder12 = courseTextBookBuilder10.edition(10);
        org.team4.model.items.Book book13 = courseTextBookBuilder10.build();
        java.lang.String str14 = book13.getGenre();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(courseTextBookBuilder10);
        org.junit.Assert.assertNotNull(bookBuilder12);
        org.junit.Assert.assertNotNull(book13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        boolean boolean4 = debitCard3.notExpired();
        boolean boolean5 = debitCard3.correctLength();
        boolean boolean6 = debitCard3.correctLength();
        boolean boolean7 = debitCard3.correctLength();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        boolean boolean2 = payPal1.isValid();
        boolean boolean3 = payPal1.isValid();
        java.lang.String str4 = payPal1.getMode();
        boolean boolean5 = payPal1.isValid();
        java.lang.String str6 = payPal1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Mobile Wallet" + "'", str4, "Mobile Wallet");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}" + "'", str6, "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("ItemToPurchase{item=null, user=User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemPurchased{title='', email='', datePurchased=null}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, validated=false], newsletter=null}", "Credit Card", "SubscribeNewsletter{title='Credit Card', email='hi!', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}", 6491102L);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", 0.0d);
        org.team4.model.user.Manager manager9 = new org.team4.model.user.Manager("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", "Credit Card", false);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase10 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) manager9);
        java.lang.String str11 = newsletter3.getLink();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str11, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        dVD1.setQuantity((int) (short) 1);
        dVD1.setQuantity((int) ' ');
        boolean boolean9 = dVD1.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD1);
        org.team4.model.items.Item item11 = rentableItemDecorator10.getItem();
        org.team4.model.items.Item item12 = new org.team4.model.items.Item(item11);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter21 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str22 = subscribeNewsletter21.getTitle();
        java.util.Date date23 = null;
        subscribeNewsletter21.setDateSubscribed(date23);
        java.util.Date date25 = subscribeNewsletter21.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter30 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str31 = subscribeNewsletter30.getEmail();
        java.util.Date date32 = subscribeNewsletter30.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter35 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str36 = subscribeNewsletter35.getEmail();
        java.util.Date date37 = subscribeNewsletter35.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter38 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date32, date37);
        org.team4.model.course.Course course41 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date25, date37, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.model.course.CourseTextBook courseTextBook43 = new org.team4.model.course.CourseTextBook(item12, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", (int) (short) 1, "hi!", "PayPal", 52, course41, false);
        org.team4.model.course.Course course44 = courseTextBook43.getCourse();
        double double45 = courseTextBook43.getPrice();
        java.lang.String str46 = courseTextBook43.getAuthor();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Tue Apr 30 19:21:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 19:21:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 19:21:56 EDT 2024");
        org.junit.Assert.assertNotNull(course44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("hi!", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "Debit Card", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "PayPal", (long) (short) -1);
        long long6 = manager5.getManagerID();
        manager5.setName("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}", (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 97");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("", date1, date2, "", "hi!");
        java.lang.String str6 = course5.getProfessorEmail();
        org.team4.model.user.Student student12 = new org.team4.model.user.Student("", "", "PayPal", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase13 = new org.team4.functionality.buy.ItemToPurchase((double) 0L, (org.team4.model.user.User) student12);
        boolean boolean14 = course5.isEnrolled(student12);
        org.team4.model.user.Student student20 = new org.team4.model.user.Student("", "", "hi!", "");
        student20.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase23 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student20);
        java.lang.String str24 = student20.getEmail();
        org.team4.model.user.Student student39 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str40 = student39.getType();
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        student39.setCourses(strList43);
        org.team4.model.user.Faculty faculty46 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", (long) (byte) -1, strList43);
        org.team4.model.user.Faculty faculty47 = new org.team4.model.user.Faculty("", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", "ItemPurchased{title='', email='hi!', datePurchased=null}", (long) (byte) 0, strList43);
        student20.setCourses(strList43);
        student12.setCourses(strList43);
        java.lang.String str50 = student12.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]" + "'", str50, "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        java.util.Date date2 = null;
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("", "", date2);
        java.lang.String str4 = itemPurchased3.getTitle();
        java.lang.String str5 = itemPurchased3.toString();
        java.util.Date date6 = itemPurchased3.getDatePurchased();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str5, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.team4.functionality.buy.ItemPurchased itemPurchased2 = new org.team4.functionality.buy.ItemPurchased("User [email=hi!, password=hi!, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=Tue Apr 30 19:21:52 EDT 2024}");
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("Course [course name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, start date=Tue Apr 30 19:21:54 EDT 2024, end date=Tue Apr 30 19:21:54 EDT 2024, ISBN=ItemPurchased{title='', email='hi!', datePurchased=null}, email=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}]", (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("hi!", "hi!", "hi!", "");
        nonFaculty4.setUniversityID((-1L));
        long long7 = nonFaculty4.getUniversityID();
        nonFaculty4.setEmail("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=Tue Apr 30 19:21:52 EDT 2024}");
        long long10 = nonFaculty4.getUniversityID();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder0.price((double) 10);
        org.team4.model.course.CourseTextBook courseTextBook11 = courseTextBookBuilder0.build();
        java.util.Date date18 = null;
        java.util.Date date19 = null;
        org.team4.model.course.Course course22 = new org.team4.model.course.Course("hi!", date18, date19, "", "hi!");
        java.lang.String str23 = course22.getProfessorEmail();
        org.team4.model.user.Student student24 = null;
        boolean boolean25 = course22.isEnrolled(student24);
        org.team4.model.course.CourseTextBook courseTextBook27 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook11, "hi!", (int) (short) 1, "PayPal", "Credit Card", (int) (short) 10, course22, true);
        boolean boolean28 = courseTextBook27.hasSoftCopy();
        org.team4.model.user.Student student33 = new org.team4.model.user.Student("", "", "hi!", "");
        student33.setEmail("");
        // The following exception was thrown during execution in test generation
        try {
            courseTextBook27.removeCopies(student33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(courseTextBook11);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter6 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        java.util.Date date7 = subscribeNewsletter6.getDateSubscribed();
        org.team4.functionality.buy.ItemPurchased itemPurchased10 = new org.team4.functionality.buy.ItemPurchased("ItemPurchased{title='', email='hi!', datePurchased=null}", "hi!");
        java.util.Date date11 = itemPurchased10.getDatePurchased();
        org.team4.model.items.RentedItem rentedItem12 = new org.team4.model.items.RentedItem("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", date7, date11);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter15 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str16 = subscribeNewsletter15.getEmail();
        subscribeNewsletter15.setTitle("hi!");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter21 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        java.util.Date date22 = subscribeNewsletter21.getDateSubscribed();
        subscribeNewsletter15.setDateDue(date22);
        rentedItem12.setRentDate(date22);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter27 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date28 = null;
        subscribeNewsletter27.setDateSubscribed(date28);
        java.util.Date date30 = subscribeNewsletter27.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter35 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str36 = subscribeNewsletter35.getEmail();
        java.util.Date date37 = subscribeNewsletter35.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter40 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str41 = subscribeNewsletter40.getTitle();
        java.util.Date date42 = null;
        subscribeNewsletter40.setDateSubscribed(date42);
        java.util.Date date44 = subscribeNewsletter40.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter45 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "", date37, date44);
        subscribeNewsletter27.setDateSubscribed(date44);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter47 = new org.team4.functionality.subscriptions.SubscribeNewsletter("Mobile Wallet", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}', email='SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}', dateSubscribed=Tue Apr 30 19:21:55 EDT 2024, dateDue=Tue Apr 30 19:21:55 EDT 2024}", date22, date44);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Sat Mar 30 19:21:56 EDT 2024");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Sat Mar 30 19:21:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Sat Mar 30 19:21:56 EDT 2024");
        org.junit.Assert.assertNotNull(date30);
// flaky:         org.junit.Assert.assertEquals(date30.toString(), "Tue Apr 30 19:21:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 19:21:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Tue Apr 30 19:21:56 EDT 2024");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        org.team4.model.paymentmodes.MobileWallet mobileWallet6 = new org.team4.model.paymentmodes.MobileWallet("");
        org.team4.model.user.Student student12 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str13 = student12.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase14 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student12);
        org.team4.model.items.Newsletter newsletter15 = itemToPurchase14.getNewsletter();
        org.team4.functionality.buy.ProcessPayment processPayment16 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet6, itemToPurchase14);
        boolean boolean17 = dVD1.equals((java.lang.Object) processPayment16);
        org.team4.model.items.DVD dVD20 = new org.team4.model.items.DVD((org.team4.model.items.Item) dVD1, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", (double) '#');
        dVD1.setPrice((double) (short) 0);
        java.lang.String str23 = dVD1.getGenre();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        book7.setPrice((double) 0L);
        java.lang.String str11 = book7.getPublisher();
        int int12 = book7.getQuantity();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:55 EDT 2024, dateDue=Tue Apr 30 19:21:55 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "User [email=, password=hi!, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=, validated=false]", true);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.team4.model.user.Manager manager4 = new org.team4.model.user.Manager("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:55 EDT 2024, dateDue=Tue Apr 30 19:21:55 EDT 2024}", "SubscribeNewsletter{title='Credit Card', email='hi!', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=Tue Apr 30 19:21:52 EDT 2024}", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=Tue Apr 30 19:21:52 EDT 2024}");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.team4.model.user.UserFactory userFactory0 = new org.team4.model.user.UserFactory();
        org.team4.model.user.User user6 = userFactory0.getUser("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", false);
        org.team4.model.user.User user12 = userFactory0.getUser("ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}", "Credit Card", "User [email=, password=, name=hi!, type=, validated=false]", "ItemPurchased{title='', email='', datePurchased=null}", true);
        org.team4.model.user.User user18 = userFactory0.getUser("User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}, type=hi!, validated=false]", "User [email=, password=hi!, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}", "SubscribeNewsletter{title='Credit Card', email='hi!', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}", false);
        org.team4.model.user.User user24 = userFactory0.getUser("User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "Credit Card", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=null}", true);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(user24);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        boolean boolean11 = rentableItemDecorator10.isPurchasable();
        double double12 = rentableItemDecorator10.getPrice();
        rentableItemDecorator10.setPrice((double) 2890906L);
        boolean boolean15 = rentableItemDecorator10.isRentable();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemPurchased{title='', email='', datePurchased=null}", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}", true);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("User [email=, password=, name=hi!, type=, validated=false]", (int) ' ', (int) (byte) 10);
        java.lang.String str4 = debitCard3.getMode();
        boolean boolean5 = debitCard3.notExpired();
        boolean boolean6 = debitCard3.isValid();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.BookRequest bookRequest4 = bookRequestBuilder3.build();
        java.lang.String str5 = bookRequest4.getISBN();
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequest4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder8 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder8.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = courseTextBookBuilder8.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder14 = courseTextBookBuilder8.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder16 = courseTextBookBuilder8.price((double) (-1L));
        org.team4.model.items.builder.BookBuilder bookBuilder18 = courseTextBookBuilder8.publisher("hi!");
        boolean boolean19 = book7.equals((java.lang.Object) bookBuilder18);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder25 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder27 = courseTextBookBuilder25.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder29 = courseTextBookBuilder25.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder31 = courseTextBookBuilder25.isVirtual(true);
        org.team4.model.items.Book book32 = courseTextBookBuilder31.build();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder33 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder35 = courseTextBookBuilder33.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder37 = courseTextBookBuilder33.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder39 = courseTextBookBuilder33.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder41 = courseTextBookBuilder33.price((double) (-1L));
        org.team4.model.items.builder.BookBuilder bookBuilder43 = courseTextBookBuilder33.publisher("hi!");
        boolean boolean44 = book32.equals((java.lang.Object) bookBuilder43);
        java.util.Date date51 = null;
        java.util.Date date52 = null;
        org.team4.model.course.Course course55 = new org.team4.model.course.Course("hi!", date51, date52, "", "hi!");
        org.team4.model.user.Student student60 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str61 = student60.getType();
        course55.enrollStudent(student60);
        java.lang.String str63 = course55.getCourseName();
        java.lang.String str64 = course55.getCourseTextBookISBN();
        org.team4.model.course.CourseTextBook courseTextBook66 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) book32, "PayPal", (int) ' ', "ItemPurchased{title='', email='', datePurchased=null}", "Credit Card", (int) (short) 100, course55, true);
        org.team4.model.course.CourseTextBook courseTextBook68 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) book7, "PayPal", (int) '#', "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "Mobile Wallet", (int) 'a', course55, true);
        book7.setPrice((double) 6290755L);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(bookItemBuilder12);
        org.junit.Assert.assertNotNull(bookBuilder14);
        org.junit.Assert.assertNotNull(bookItemBuilder16);
        org.junit.Assert.assertNotNull(bookBuilder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookBuilder27);
        org.junit.Assert.assertNotNull(bookItemBuilder29);
        org.junit.Assert.assertNotNull(courseTextBookBuilder31);
        org.junit.Assert.assertNotNull(book32);
        org.junit.Assert.assertNotNull(bookBuilder35);
        org.junit.Assert.assertNotNull(bookItemBuilder37);
        org.junit.Assert.assertNotNull(bookBuilder39);
        org.junit.Assert.assertNotNull(bookItemBuilder41);
        org.junit.Assert.assertNotNull(bookBuilder43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("ItemToPurchase{item=null, user=User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemPurchased{title='', email='', datePurchased=null}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, validated=false], newsletter=null}", 32, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", true);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "User [email=, password=, name=hi!, type=hi!, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", false);
        nonFaculty5.setUniversityID((long) 10);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        boolean boolean4 = debitCard3.notExpired();
        boolean boolean5 = debitCard3.correctLength();
        boolean boolean6 = debitCard3.notExpired();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.yearPublished((int) (byte) -1);
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder2.genre("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=Tue Apr 30 19:21:52 EDT 2024}");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("ItemPurchased{title='', email='hi!', datePurchased=null}", "", "User [email=, password=, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        nonFaculty4.setPassword("Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter7 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str8 = subscribeNewsletter7.getTitle();
        java.util.Date date9 = null;
        subscribeNewsletter7.setDateSubscribed(date9);
        java.util.Date date11 = subscribeNewsletter7.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter16 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str17 = subscribeNewsletter16.getEmail();
        java.util.Date date18 = subscribeNewsletter16.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter21 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str22 = subscribeNewsletter21.getEmail();
        java.util.Date date23 = subscribeNewsletter21.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter24 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date18, date23);
        org.team4.model.course.Course course27 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date11, date23, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.functionality.buy.ItemPurchased itemPurchased28 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", date23);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter35 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str36 = subscribeNewsletter35.getEmail();
        java.util.Date date37 = subscribeNewsletter35.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter40 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str41 = subscribeNewsletter40.getEmail();
        java.util.Date date42 = subscribeNewsletter40.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter43 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date37, date42);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter46 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter46.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter46.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter53 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date54 = null;
        subscribeNewsletter53.setDateSubscribed(date54);
        java.util.Date date56 = subscribeNewsletter53.getDateDue();
        subscribeNewsletter46.setDateDue(date56);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter58 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", date42, date56);
        org.team4.model.items.RentedItem rentedItem59 = new org.team4.model.items.RentedItem("User [email=, password=, name=hi!, type=, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date23, date56);
        java.lang.String str60 = rentedItem59.getISBN();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter63 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter63.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter63.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter70 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date71 = null;
        subscribeNewsletter70.setDateSubscribed(date71);
        java.util.Date date73 = subscribeNewsletter70.getDateDue();
        subscribeNewsletter63.setDateDue(date73);
        rentedItem59.setDueDate(date73);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter78 = new org.team4.functionality.subscriptions.SubscribeNewsletter("User [email=, password=, name=hi!, type=, validated=false]", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter81 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str82 = subscribeNewsletter81.getTitle();
        java.util.Date date83 = subscribeNewsletter81.getDateDue();
        subscribeNewsletter78.setDateSubscribed(date83);
        rentedItem59.setDueDate(date83);
        rentedItem59.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date88 = rentedItem59.getRentDate();
        java.lang.String str89 = rentedItem59.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Apr 30 19:21:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Tue Apr 30 19:21:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 19:21:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 19:21:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 19:21:56 EDT 2024");
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Tue Apr 30 19:21:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str60, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(date73);
// flaky:         org.junit.Assert.assertEquals(date73.toString(), "Tue Apr 30 19:21:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertNotNull(date83);
// flaky:         org.junit.Assert.assertEquals(date83.toString(), "Tue Apr 30 19:21:56 EDT 2024");
        org.junit.Assert.assertNotNull(date88);
// flaky:         org.junit.Assert.assertEquals(date88.toString(), "Tue Apr 30 19:21:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str89, "User [email=, password=, name=hi!, type=, validated=false]");
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.builder.DVDBuilder dVDBuilder4 = dVDBuilder0.duration(10.0d);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDBuilder4.yearPublished((int) (byte) 1);
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder8 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder8.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = courseTextBookBuilder8.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder14 = courseTextBookBuilder8.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder16 = courseTextBookBuilder8.price((double) (-1L));
        org.team4.model.items.builder.BookBuilder bookBuilder18 = courseTextBookBuilder8.publisher("hi!");
        boolean boolean19 = book7.equals((java.lang.Object) bookBuilder18);
        org.team4.model.user.User user20 = null;
        org.team4.functionality.buy.ItemToPurchase itemToPurchase21 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) book7, user20);
        org.team4.model.items.Book book29 = new org.team4.model.items.Book((org.team4.model.items.Item) book7, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", (int) (byte) 0, "", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", 32, true, false);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator30 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book29);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(bookItemBuilder12);
        org.junit.Assert.assertNotNull(bookBuilder14);
        org.junit.Assert.assertNotNull(bookItemBuilder16);
        org.junit.Assert.assertNotNull(bookBuilder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("", "", "hi!", "");
        student4.setEmail("");
        java.lang.String str7 = student4.getType();
        java.util.ArrayList<java.lang.String> strList8 = student4.getCourses();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(strList8);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.paymentmodes.DebitCard debitCard15 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete16 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) debitCard15);
        long long17 = purchaseComplete16.getPurchaseID();
        org.team4.model.items.Newsletter newsletter18 = purchaseComplete16.getNewsletter();
        long long19 = purchaseComplete16.getPurchaseID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3394451L + "'", long17 == 3394451L);
        org.junit.Assert.assertNull(newsletter18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3394451L + "'", long19 == 3394451L);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("hi!", "hi!", "hi!", "");
        nonFaculty5.setUniversityID((long) (short) 100);
        long long8 = nonFaculty5.getUniversityID();
        nonFaculty5.setUniversityID((long) (short) 100);
        nonFaculty5.setName("PayPal");
        long long13 = nonFaculty5.getUniversityID();
        java.lang.String str14 = nonFaculty5.getPassword();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase15 = new org.team4.functionality.buy.ItemToPurchase((double) 10L, (org.team4.model.user.User) nonFaculty5);
        org.team4.model.items.Item item16 = itemToPurchase15.getItem();
        org.team4.model.paymentmodes.MobileWallet mobileWallet18 = new org.team4.model.paymentmodes.MobileWallet("");
        org.team4.model.user.Student student24 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str25 = student24.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase26 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student24);
        org.team4.model.items.Newsletter newsletter27 = itemToPurchase26.getNewsletter();
        org.team4.functionality.buy.ProcessPayment processPayment28 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet18, itemToPurchase26);
        java.lang.String str29 = mobileWallet18.getMode();
        boolean boolean30 = mobileWallet18.isValid();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete31 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase15, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet18);
        long long32 = purchaseComplete31.getPurchaseID();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(newsletter27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PayPal" + "'", str29, "PayPal");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1667553L + "'", long32 == 1667553L);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("User [email=, password=, name=hi!, type=, validated=false]", "Credit Card", "Debit Card", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", true);
        org.team4.model.user.Student student15 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str16 = student15.getType();
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        student15.setCourses(strList19);
        org.team4.model.user.Faculty faculty22 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", (long) (byte) -1, strList19);
        java.lang.String str23 = faculty22.getName();
        faculty22.setFacultyID((long) (short) 1);
        java.util.Date date27 = null;
        java.util.Date date28 = null;
        org.team4.model.course.Course course31 = new org.team4.model.course.Course("hi!", date27, date28, "", "hi!");
        java.util.Date date32 = course31.getEndDate();
        java.lang.String str33 = course31.getProfessorEmail();
        java.lang.String str34 = course31.getProfessorEmail();
        org.team4.model.user.Student student40 = new org.team4.model.user.Student("", "", "hi!", "");
        student40.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase43 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student40);
        java.lang.String str44 = student40.getEmail();
        course31.enrollStudent(student40);
        org.team4.model.user.Faculty faculty51 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "hi!", "", "", false);
        faculty51.setFacultyID((long) (byte) 1);
        org.team4.model.user.Student student58 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str59 = student58.getType();
        java.lang.String[] strArray61 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        student58.setCourses(strList62);
        faculty51.setCourses(strList62);
        student40.setCourses(strList62);
        faculty22.setCourses(strList62);
        student5.setCourses(strList62);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str23, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertNull(date32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        dVD1.setQuantity((int) (short) 1);
        dVD1.setQuantity((int) ' ');
        boolean boolean9 = dVD1.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD1);
        org.team4.model.items.Item item11 = rentableItemDecorator10.getItem();
        org.team4.model.items.Item item12 = new org.team4.model.items.Item(item11);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter21 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str22 = subscribeNewsletter21.getTitle();
        java.util.Date date23 = null;
        subscribeNewsletter21.setDateSubscribed(date23);
        java.util.Date date25 = subscribeNewsletter21.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter30 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str31 = subscribeNewsletter30.getEmail();
        java.util.Date date32 = subscribeNewsletter30.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter35 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str36 = subscribeNewsletter35.getEmail();
        java.util.Date date37 = subscribeNewsletter35.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter38 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date32, date37);
        org.team4.model.course.Course course41 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date25, date37, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.model.course.CourseTextBook courseTextBook43 = new org.team4.model.course.CourseTextBook(item12, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", (int) (short) 1, "hi!", "PayPal", 52, course41, false);
        org.team4.model.course.Course course44 = courseTextBook43.getCourse();
        org.team4.model.course.Course course45 = courseTextBook43.getCourse();
        org.team4.model.user.Visitor visitor50 = new org.team4.model.user.Visitor("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "");
        boolean boolean51 = courseTextBook43.equals((java.lang.Object) "");
        org.team4.model.user.Student student56 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str57 = student56.getType();
        java.lang.String[] strArray59 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        student56.setCourses(strList60);
        courseTextBook43.makeCopies(student56);
        java.lang.String str64 = courseTextBook43.getTitle();
        double double65 = courseTextBook43.getPrice();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Tue Apr 30 19:21:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 19:21:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 19:21:56 EDT 2024");
        org.junit.Assert.assertNotNull(course44);
        org.junit.Assert.assertNotNull(course45);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.paymentmodes.DebitCard debitCard15 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete16 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) debitCard15);
        boolean boolean17 = debitCard15.notExpired();
        boolean boolean18 = debitCard15.isValid();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemPurchased{title='', email='', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase((-1.0d), (org.team4.model.user.User) visitor5);
        java.lang.String str7 = itemToPurchase6.toString();
        double double8 = itemToPurchase6.getAmount();
        org.team4.model.user.User user9 = itemToPurchase6.getUser();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ItemToPurchase{item=null, user=User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemPurchased{title='', email='', datePurchased=null}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, validated=false], newsletter=null}" + "'", str7, "ItemToPurchase{item=null, user=User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemPurchased{title='', email='', datePurchased=null}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, validated=false], newsletter=null}");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(user9);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.team4.model.user.User user5 = new org.team4.model.user.User("", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=Tue Apr 30 19:21:52 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "User [email=, password=, name=hi!, type=, validated=false]", true);
        user5.setName("Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder0.email("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.edition(0);
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder6.edition((int) '4');
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", (double) 10);
        double double4 = newsletter3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        dVD1.setQuantity((int) (short) 1);
        dVD1.setQuantity((int) ' ');
        boolean boolean9 = dVD1.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD1);
        org.team4.model.items.Item item11 = rentableItemDecorator10.getItem();
        org.team4.model.items.Magazine magazine14 = new org.team4.model.items.Magazine(item11, "", 52);
        int int15 = magazine14.getIssueNumber();
        java.lang.String str16 = magazine14.getPublisher();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("User [email=, password=, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "", (long) 0);
        java.lang.String str6 = manager5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [email=User [email=, password=, name=hi!, type=, validated=false], password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=, validated=false]" + "'", str6, "User [email=User [email=, password=, name=hi!, type=, validated=false], password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=, validated=false]");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=Tue Apr 30 19:21:52 EDT 2024}", "", (long) 0);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.team4.model.user.User user4 = new org.team4.model.user.User("hi!", "hi!", "", "");
        java.lang.String str5 = user4.getPassword();
        user4.setEmail("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=Tue Apr 30 19:21:52 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        dVD1.setQuantity((int) (short) 1);
        dVD1.setQuantity((int) ' ');
        boolean boolean9 = dVD1.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD1);
        org.team4.model.items.Item item11 = rentableItemDecorator10.getItem();
        org.team4.model.items.Item item12 = rentableItemDecorator10.getItem();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator13 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) rentableItemDecorator10);
        org.team4.model.items.Magazine magazine16 = new org.team4.model.items.Magazine((org.team4.model.items.Item) purchasableItemDecorator13, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", 1);
        int int17 = magazine16.getQuantity();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertNotNull(item12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:55 EDT 2024, dateDue=Tue Apr 30 19:21:55 EDT 2024}", (int) 'a', 52);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 52");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        boolean boolean8 = book7.hasHardCopy();
        java.lang.String str9 = book7.getGenre();
        org.team4.model.user.Manager manager15 = new org.team4.model.user.Manager("", "", "", "hi!", false);
        manager15.setValidated(false);
        manager15.setName("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase20 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) book7, (org.team4.model.user.User) manager15);
        double double21 = itemToPurchase20.getAmount();
        java.lang.String str22 = itemToPurchase20.toString();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ItemToPurchase{item=Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}, user=User [email=, password=, name=hi!, type=hi!, validated=false], newsletter=null}" + "'", str22, "ItemToPurchase{item=Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}, user=User [email=, password=, name=hi!, type=hi!, validated=false], newsletter=null}");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("Course [course name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, start date=Tue Apr 30 19:21:54 EDT 2024, end date=Tue Apr 30 19:21:54 EDT 2024, ISBN=ItemPurchased{title='', email='hi!', datePurchased=null}, email=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}]", (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 35");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "User [email=, password=, name=hi!, type=, validated=false]", "hi!", "PayPal", 2890906L);
        nonFaculty5.setValidated(true);
        java.lang.String str8 = nonFaculty5.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=User [email=, password=, name=hi!, type=, validated=false], name=hi!, type=PayPal, validated=true]" + "'", str8, "User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=User [email=, password=, name=hi!, type=, validated=false], name=hi!, type=PayPal, validated=true]");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.yearPublished((int) (short) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder8 = magazineBuilder0.issueNumber(100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder10 = magazineBuilder8.title("");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineBuilder8);
        org.junit.Assert.assertNotNull(magazineItemBuilder10);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        boolean boolean4 = creditCard3.notExpired();
        boolean boolean5 = creditCard3.isValid();
        boolean boolean6 = creditCard3.notExpired();
        boolean boolean7 = creditCard3.isValid();
        boolean boolean8 = creditCard3.correctLength();
        boolean boolean9 = creditCard3.isValid();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.title("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.edition(0);
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder3.title("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder9 = bookRequestBuilder3.ISBN("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.team4.model.items.BookRequest bookRequest10 = bookRequestBuilder3.build();
        java.lang.String str11 = bookRequest10.getEmail();
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
        org.junit.Assert.assertNotNull(bookRequestBuilder9);
        org.junit.Assert.assertNotNull(bookRequest10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        org.team4.model.paymentmodes.MobileWallet mobileWallet6 = new org.team4.model.paymentmodes.MobileWallet("");
        org.team4.model.user.Student student12 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str13 = student12.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase14 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student12);
        org.team4.model.items.Newsletter newsletter15 = itemToPurchase14.getNewsletter();
        org.team4.functionality.buy.ProcessPayment processPayment16 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet6, itemToPurchase14);
        boolean boolean17 = dVD1.equals((java.lang.Object) processPayment16);
        int int18 = dVD1.getYearPublished();
        java.lang.String str19 = dVD1.getTitle();
        int int20 = dVD1.getYearPublished();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.team4.model.user.User user5 = new org.team4.model.user.User("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}", "ItemToPurchase{item=null, user=User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemPurchased{title='', email='', datePurchased=null}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, validated=false], newsletter=null}", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=Tue Apr 30 19:21:52 EDT 2024}", "User [email=, password=, name=hi!, type=, validated=false]", false);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("", "Credit Card", "", "ItemPurchased{title='', email='hi!', datePurchased=null}", (int) (byte) -1, "User [email=, password=, name=hi!, type=, validated=false]");
        java.lang.String str7 = bookRequest6.getEmail();
        java.lang.String str8 = bookRequest6.getBookType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str8, "User [email=, password=, name=hi!, type=, validated=false]");
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        dVD1.setQuantity((int) (short) 1);
        dVD1.setQuantity((int) ' ');
        boolean boolean9 = dVD1.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD1);
        org.team4.model.items.Item item11 = rentableItemDecorator10.getItem();
        org.team4.model.items.Item item12 = rentableItemDecorator10.getItem();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator13 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) rentableItemDecorator10);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator14 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) rentableItemDecorator10);
        org.team4.model.items.Item item15 = purchasableItemDecorator14.getItem();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertNotNull(item12);
        org.junit.Assert.assertNotNull(item15);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.team4.functionality.buy.ItemPurchased itemPurchased2 = new org.team4.functionality.buy.ItemPurchased("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=null}");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        java.lang.String[] strArray22 = new java.lang.String[] { "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "PayPal", "ItemPurchased{title='', email='hi!', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemPurchased{title='', email='', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        org.team4.model.user.Faculty faculty25 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "", "ItemPurchased{title='', email='', datePurchased=null}", 0L, strList23);
        org.team4.model.user.Faculty faculty26 = new org.team4.model.user.Faculty("PayPal{email='ItemPurchased{title='', email='hi!', datePurchased=null}'}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "PayPal", 5033118L, strList23);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.team4.model.user.Visitor visitor7 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase8 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor7);
        java.lang.String str9 = itemToPurchase8.toString();
        org.team4.functionality.buy.ProcessPayment processPayment10 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) payPal1, itemToPurchase8);
        org.team4.model.items.Newsletter newsletter11 = itemToPurchase8.getNewsletter();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str9, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNull(newsletter11);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("Credit Card", "Credit Card", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}");
        java.util.ArrayList<java.lang.String> strList5 = faculty4.getCourses();
        faculty4.setFacultyID(7509200L);
        org.junit.Assert.assertNull(strList5);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        org.team4.model.paymentmodes.CreditCard creditCard14 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        boolean boolean15 = creditCard14.notExpired();
        boolean boolean16 = creditCard14.isValid();
        boolean boolean17 = creditCard14.isValid();
        boolean boolean18 = book9.equals((java.lang.Object) creditCard14);
        int int19 = book9.getQuantity();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("", date1, date2, "", "hi!");
        java.lang.String str6 = course5.getProfessorEmail();
        org.team4.model.user.Student student12 = new org.team4.model.user.Student("", "", "PayPal", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase13 = new org.team4.functionality.buy.ItemToPurchase((double) 0L, (org.team4.model.user.User) student12);
        boolean boolean14 = course5.isEnrolled(student12);
        java.lang.Class<?> wildcardClass15 = student12.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 10);
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder2.genre("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDBuilder6.price((double) 100L);
        org.team4.model.items.builder.DVDBuilder dVDBuilder10 = dVDBuilder6.genre("Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
        org.junit.Assert.assertNotNull(dVDBuilder10);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.team4.model.user.Student student9 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str10 = student9.getType();
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        student9.setCourses(strList13);
        org.team4.model.user.Faculty faculty16 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", (long) (byte) -1, strList13);
        java.lang.String str17 = faculty16.getName();
        faculty16.setFacultyID((long) (short) 1);
        java.util.Date date21 = null;
        java.util.Date date22 = null;
        org.team4.model.course.Course course25 = new org.team4.model.course.Course("hi!", date21, date22, "", "hi!");
        java.util.Date date26 = course25.getEndDate();
        java.lang.String str27 = course25.getProfessorEmail();
        java.lang.String str28 = course25.getProfessorEmail();
        org.team4.model.user.Student student34 = new org.team4.model.user.Student("", "", "hi!", "");
        student34.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase37 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student34);
        java.lang.String str38 = student34.getEmail();
        course25.enrollStudent(student34);
        org.team4.model.user.Faculty faculty45 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "hi!", "", "", false);
        faculty45.setFacultyID((long) (byte) 1);
        org.team4.model.user.Student student52 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str53 = student52.getType();
        java.lang.String[] strArray55 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        student52.setCourses(strList56);
        faculty45.setCourses(strList56);
        student34.setCourses(strList56);
        faculty16.setCourses(strList56);
        org.team4.model.user.Faculty faculty71 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "hi!", "", "", false);
        faculty71.setFacultyID((long) (byte) 1);
        org.team4.model.user.Student student78 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str79 = student78.getType();
        java.lang.String[] strArray81 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList82 = new java.util.ArrayList<java.lang.String>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList82, strArray81);
        student78.setCourses(strList82);
        faculty71.setCourses(strList82);
        long long86 = faculty71.getFacultyID();
        java.util.ArrayList<java.lang.String> strList87 = faculty71.getCourses();
        org.team4.model.user.Student student88 = new org.team4.model.user.Student("User [email=, password=, name=hi!, type=, validated=false]", "", "ItemPurchased{title='', email='', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", strList87);
        faculty16.setCourses(strList87);
        faculty16.setFacultyID(2166056L);
        java.lang.String str92 = faculty16.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str17, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertNull(date26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 1L + "'", long86 == 1L);
        org.junit.Assert.assertNotNull(strList87);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "PayPal" + "'", str92, "PayPal");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder6 = courseTextBookBuilder0.quantity(0);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder10 = bookBuilder8.hasSoftCopy(false);
        org.team4.model.items.builder.BookBuilder bookBuilder12 = bookBuilder8.hasHardCopy(false);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder14 = bookBuilder8.yearPublished((int) ' ');
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookItemBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(bookBuilder12);
        org.junit.Assert.assertNotNull(bookItemBuilder14);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "Credit Card", (int) '4', "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        int int7 = bookRequest6.getEdition();
        java.lang.String str8 = bookRequest6.getISBN();
        java.lang.String str9 = bookRequest6.getISBN();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Credit Card" + "'", str9, "Credit Card");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.team4.model.user.Faculty faculty14 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "hi!", "", "", false);
        faculty14.setFacultyID((long) (byte) 1);
        org.team4.model.user.Student student21 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str22 = student21.getType();
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        student21.setCourses(strList25);
        faculty14.setCourses(strList25);
        long long29 = faculty14.getFacultyID();
        java.util.ArrayList<java.lang.String> strList30 = faculty14.getCourses();
        org.team4.model.user.Student student31 = new org.team4.model.user.Student("User [email=, password=, name=hi!, type=, validated=false]", "", "ItemPurchased{title='', email='', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", strList30);
        org.team4.model.user.Faculty faculty32 = new org.team4.model.user.Faculty("hi!", "User [email=, password=, name=hi!, type=hi!, validated=false]", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", (long) (-1), strList30);
        java.lang.String str33 = faculty32.getName();
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}" + "'", str33, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.title("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.edition(32);
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder5.title("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter5 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str6 = subscribeNewsletter5.getTitle();
        java.util.Date date7 = null;
        subscribeNewsletter5.setDateSubscribed(date7);
        java.util.Date date9 = subscribeNewsletter5.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter12 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter12.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter18 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str19 = subscribeNewsletter18.getTitle();
        java.util.Date date20 = null;
        subscribeNewsletter18.setDateSubscribed(date20);
        java.util.Date date22 = subscribeNewsletter18.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter27 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str28 = subscribeNewsletter27.getEmail();
        java.util.Date date29 = subscribeNewsletter27.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter32 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str33 = subscribeNewsletter32.getEmail();
        java.util.Date date34 = subscribeNewsletter32.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter35 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date29, date34);
        org.team4.model.course.Course course38 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date22, date34, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        subscribeNewsletter12.setDateSubscribed(date22);
        org.team4.model.course.Course course42 = new org.team4.model.course.Course("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", date9, date22, "Credit Card", "ItemPurchased{title='', email='', datePurchased=null}");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter47 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str48 = subscribeNewsletter47.getEmail();
        java.util.Date date49 = subscribeNewsletter47.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter52 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str53 = subscribeNewsletter52.getTitle();
        java.util.Date date54 = null;
        subscribeNewsletter52.setDateSubscribed(date54);
        java.util.Date date56 = subscribeNewsletter52.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter57 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "", date49, date56);
        boolean boolean58 = course42.isEnded(date49);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter67 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str68 = subscribeNewsletter67.getEmail();
        java.util.Date date69 = subscribeNewsletter67.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter72 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str73 = subscribeNewsletter72.getEmail();
        java.util.Date date74 = subscribeNewsletter72.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter75 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date69, date74);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter78 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter78.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter78.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter85 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date86 = null;
        subscribeNewsletter85.setDateSubscribed(date86);
        java.util.Date date88 = subscribeNewsletter85.getDateDue();
        subscribeNewsletter78.setDateDue(date88);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter90 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", date74, date88);
        java.util.Date date91 = subscribeNewsletter90.getDateDue();
        org.team4.functionality.buy.ItemPurchased itemPurchased92 = new org.team4.functionality.buy.ItemPurchased("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "", date91);
        org.team4.model.items.RentedItem rentedItem93 = new org.team4.model.items.RentedItem("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:55 EDT 2024, dateDue=Tue Apr 30 19:21:55 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", date49, date91);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Tue Apr 30 19:21:57 EDT 2024");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Tue Apr 30 19:21:57 EDT 2024");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Tue Apr 30 19:21:57 EDT 2024");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(date34);
// flaky:         org.junit.Assert.assertEquals(date34.toString(), "Tue Apr 30 19:21:57 EDT 2024");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(date49);
// flaky:         org.junit.Assert.assertEquals(date49.toString(), "Tue Apr 30 19:21:57 EDT 2024");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Tue Apr 30 19:21:57 EDT 2024");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertNotNull(date69);
// flaky:         org.junit.Assert.assertEquals(date69.toString(), "Tue Apr 30 19:21:57 EDT 2024");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertNotNull(date74);
// flaky:         org.junit.Assert.assertEquals(date74.toString(), "Tue Apr 30 19:21:57 EDT 2024");
        org.junit.Assert.assertNotNull(date88);
// flaky:         org.junit.Assert.assertEquals(date88.toString(), "Tue Apr 30 19:21:57 EDT 2024");
        org.junit.Assert.assertNotNull(date91);
// flaky:         org.junit.Assert.assertEquals(date91.toString(), "Tue Apr 30 19:21:57 EDT 2024");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter3 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str4 = subscribeNewsletter3.getTitle();
        java.util.Date date5 = null;
        subscribeNewsletter3.setDateSubscribed(date5);
        java.util.Date date7 = subscribeNewsletter3.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter10 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter10.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter16 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str17 = subscribeNewsletter16.getTitle();
        java.util.Date date18 = null;
        subscribeNewsletter16.setDateSubscribed(date18);
        java.util.Date date20 = subscribeNewsletter16.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter25 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str26 = subscribeNewsletter25.getEmail();
        java.util.Date date27 = subscribeNewsletter25.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter30 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str31 = subscribeNewsletter30.getEmail();
        java.util.Date date32 = subscribeNewsletter30.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter33 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date27, date32);
        org.team4.model.course.Course course36 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date20, date32, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        subscribeNewsletter10.setDateSubscribed(date20);
        org.team4.model.course.Course course40 = new org.team4.model.course.Course("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", date7, date20, "Credit Card", "ItemPurchased{title='', email='', datePurchased=null}");
        java.lang.String str41 = course40.getCourseName();
        java.lang.String str42 = course40.getCourseName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Tue Apr 30 19:21:57 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Tue Apr 30 19:21:57 EDT 2024");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(date27);
// flaky:         org.junit.Assert.assertEquals(date27.toString(), "Tue Apr 30 19:21:57 EDT 2024");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 19:21:57 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}" + "'", str41, "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}" + "'", str42, "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.lang.String str6 = course5.getProfessorEmail();
        org.team4.model.user.Student student7 = null;
        boolean boolean8 = course5.isEnrolled(student7);
        java.util.Date date9 = course5.getStartDate();
        java.util.Date date10 = course5.getStartDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.team4.model.user.Student student14 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str15 = student14.getType();
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        student14.setCourses(strList18);
        org.team4.model.user.Faculty faculty21 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", (long) (byte) -1, strList18);
        java.util.ArrayList<java.lang.String> strList22 = faculty21.getCourses();
        org.team4.model.user.Student student23 = new org.team4.model.user.Student("", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "Mobile Wallet", strList22);
        java.util.ArrayList<java.lang.String> strList24 = student23.getCourses();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase25 = new org.team4.functionality.buy.ItemToPurchase((double) 7509200L, (org.team4.model.user.User) student23);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getEndDate();
        java.lang.String str7 = course5.getProfessorEmail();
        java.lang.String str8 = course5.getProfessorEmail();
        org.team4.model.user.Student student13 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean14 = course5.isEnrolled(student13);
        java.util.Date date15 = course5.getEndDate();
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}', email='SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}', dateSubscribed=Tue Apr 30 19:21:55 EDT 2024, dateDue=Tue Apr 30 19:21:55 EDT 2024}", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}', email='SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}', dateSubscribed=Tue Apr 30 19:21:55 EDT 2024, dateDue=Tue Apr 30 19:21:55 EDT 2024}", (double) 4151587L);
        org.team4.model.user.User user8 = new org.team4.model.user.User("", "hi!", "PayPal", "");
        java.lang.String str9 = user8.getPassword();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase10 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, user8);
        java.lang.String str11 = newsletter3.getLink();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}', email='SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}', dateSubscribed=Tue Apr 30 19:21:55 EDT 2024, dateDue=Tue Apr 30 19:21:55 EDT 2024}" + "'", str11, "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}', email='SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}', dateSubscribed=Tue Apr 30 19:21:55 EDT 2024, dateDue=Tue Apr 30 19:21:55 EDT 2024}");
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder6 = magazineBuilder4.issueNumber((int) (short) -1);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder8 = magazineBuilder4.issueNumber((int) ' ');
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineBuilder6);
        org.junit.Assert.assertNotNull(magazineBuilder8);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("hi!", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "", (long) (short) 100);
        long long6 = nonFaculty5.getUniversityID();
        long long7 = nonFaculty5.getUniversityID();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.team4.functionality.buy.ItemPurchased itemPurchased2 = new org.team4.functionality.buy.ItemPurchased("User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=User [email=, password=, name=hi!, type=, validated=false], name=hi!, type=PayPal, validated=true]", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.title("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDItemBuilder4.title("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDItemBuilder6.quantity((int) '4');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder10 = dVDItemBuilder6.quantity((int) ' ');
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
        org.junit.Assert.assertNotNull(dVDItemBuilder10);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        boolean boolean10 = book9.hasHardCopy();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator11 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) book9);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder0.price((double) 10);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder11 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder13 = courseTextBookBuilder11.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder15 = courseTextBookBuilder11.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder17 = courseTextBookBuilder11.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder19 = courseTextBookBuilder11.hasSoftCopy(true);
        org.team4.model.course.CourseTextBook courseTextBook20 = courseTextBookBuilder11.build();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder26 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder28 = courseTextBookBuilder26.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder30 = courseTextBookBuilder26.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder32 = courseTextBookBuilder26.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder34 = courseTextBookBuilder26.quantity((int) (short) 100);
        java.util.Date date36 = null;
        java.util.Date date37 = null;
        org.team4.model.course.Course course40 = new org.team4.model.course.Course("hi!", date36, date37, "", "hi!");
        java.util.Date date41 = course40.getEndDate();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder42 = courseTextBookBuilder26.course(course40);
        org.team4.model.user.Student student48 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str49 = student48.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase50 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student48);
        java.lang.String str51 = student48.toString();
        java.lang.String str52 = student48.getEmail();
        java.lang.String str53 = student48.toString();
        course40.enrollStudent(student48);
        org.team4.model.course.CourseTextBook courseTextBook56 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook20, "hi!", 52, "User [email=, password=, name=hi!, type=, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", (int) 'a', course40, false);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder57 = courseTextBookBuilder0.course(course40);
        java.util.Date date58 = course40.getEndDate();
        java.util.Date date60 = null;
        java.util.Date date61 = null;
        org.team4.model.course.Course course64 = new org.team4.model.course.Course("hi!", date60, date61, "", "hi!");
        java.util.Date date65 = course64.getEndDate();
        java.lang.String str66 = course64.getProfessorEmail();
        java.lang.String str67 = course64.getProfessorEmail();
        org.team4.model.user.Student student73 = new org.team4.model.user.Student("", "", "hi!", "");
        student73.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase76 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student73);
        java.lang.String str77 = student73.getEmail();
        course64.enrollStudent(student73);
        course40.enrollStudent(student73);
        java.util.Date date81 = null;
        java.util.Date date82 = null;
        org.team4.model.course.Course course85 = new org.team4.model.course.Course("hi!", date81, date82, "", "hi!");
        org.team4.model.user.Student student90 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str91 = student90.getType();
        course85.enrollStudent(student90);
        boolean boolean93 = course40.isEnrolled(student90);
        java.util.ArrayList<java.lang.String> strList94 = org.team4.model.paymentmodes.PaymentModes.MODE;
        student90.setCourses(strList94);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(bookBuilder13);
        org.junit.Assert.assertNotNull(bookItemBuilder15);
        org.junit.Assert.assertNotNull(courseTextBookBuilder17);
        org.junit.Assert.assertNotNull(bookBuilder19);
        org.junit.Assert.assertNotNull(courseTextBook20);
        org.junit.Assert.assertNotNull(bookBuilder28);
        org.junit.Assert.assertNotNull(bookItemBuilder30);
        org.junit.Assert.assertNotNull(bookBuilder32);
        org.junit.Assert.assertNotNull(bookItemBuilder34);
        org.junit.Assert.assertNull(date41);
        org.junit.Assert.assertNotNull(courseTextBookBuilder42);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str51, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str53, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertNotNull(courseTextBookBuilder57);
        org.junit.Assert.assertNull(date58);
        org.junit.Assert.assertNull(date65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(strList94);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        boolean boolean10 = book9.hasHardCopy();
        book9.setQuantity((int) '4');
        org.team4.model.user.Visitor visitor18 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase19 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor18);
        org.team4.model.paymentmodes.CreditCard creditCard23 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete24 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase19, (org.team4.model.paymentmodes.PaymentValidator) creditCard23);
        long long25 = purchaseComplete24.getPurchaseID();
        org.team4.model.user.User user26 = purchaseComplete24.getUser();
        org.team4.model.items.Newsletter newsletter27 = purchaseComplete24.getNewsletter();
        boolean boolean28 = book9.equals((java.lang.Object) newsletter27);
        book9.setQuantity((int) ' ');
        org.team4.model.items.Magazine magazine33 = new org.team4.model.items.Magazine((org.team4.model.items.Item) book9, "", (int) (short) 100);
        java.lang.Class<?> wildcardClass34 = book9.getClass();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 8434149L + "'", long25 == 8434149L);
        org.junit.Assert.assertNotNull(user26);
        org.junit.Assert.assertNull(newsletter27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("Credit Card", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "", "Mobile Wallet");
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder6 = courseTextBookBuilder0.quantity(0);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder10 = bookBuilder8.hasSoftCopy(false);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = bookBuilder10.yearPublished((int) (short) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder14 = bookItemBuilder12.price((double) (short) 0);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookItemBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(bookItemBuilder12);
        org.junit.Assert.assertNotNull(bookItemBuilder14);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", 0.0d);
        java.lang.String str4 = newsletter3.getLink();
        java.lang.String str5 = newsletter3.getTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str4, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        dVD1.setQuantity((int) (short) 1);
        dVD1.setQuantity((int) ' ');
        boolean boolean9 = dVD1.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD1);
        boolean boolean11 = rentableItemDecorator10.isRentable();
        org.team4.model.items.Item item12 = rentableItemDecorator10.getItem();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder18 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder20 = courseTextBookBuilder18.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder22 = courseTextBookBuilder18.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder24 = courseTextBookBuilder18.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder26 = courseTextBookBuilder18.quantity((int) (short) 100);
        java.util.Date date28 = null;
        java.util.Date date29 = null;
        org.team4.model.course.Course course32 = new org.team4.model.course.Course("hi!", date28, date29, "", "hi!");
        java.util.Date date33 = course32.getEndDate();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder34 = courseTextBookBuilder18.course(course32);
        java.util.Date date36 = null;
        java.util.Date date37 = null;
        org.team4.model.course.Course course40 = new org.team4.model.course.Course("hi!", date36, date37, "", "hi!");
        org.team4.model.user.Student student45 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str46 = student45.getType();
        course40.enrollStudent(student45);
        java.lang.String str48 = course40.getProfessorEmail();
        java.lang.String str49 = course40.getProfessorEmail();
        java.lang.String str50 = course40.getCourseTextBookISBN();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder51 = courseTextBookBuilder34.course(course40);
        org.team4.model.course.CourseTextBook courseTextBook53 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) rentableItemDecorator10, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}", 10, "hi!", "PayPal", (int) 'a', course40, false);
        java.util.Date date54 = course40.getStartDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str55 = course40.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.toString()\" because \"this.startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(item12);
        org.junit.Assert.assertNotNull(bookBuilder20);
        org.junit.Assert.assertNotNull(bookItemBuilder22);
        org.junit.Assert.assertNotNull(bookBuilder24);
        org.junit.Assert.assertNotNull(bookItemBuilder26);
        org.junit.Assert.assertNull(date33);
        org.junit.Assert.assertNotNull(courseTextBookBuilder34);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(courseTextBookBuilder51);
        org.junit.Assert.assertNull(date54);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.quantity(10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDBuilder0.title("ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder8 = dVDBuilder0.genre("User [email=, password=, name=hi!, type=hi!, validated=false]");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDBuilder8);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.yearPublished((int) (short) 0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineItemBuilder6.title("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=Tue Apr 30 19:21:52 EDT 2024}");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        java.lang.String str2 = payPal1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PayPal{email='Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}'}" + "'", str2, "PayPal{email='Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}'}");
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        boolean boolean8 = book7.hasHardCopy();
        boolean boolean9 = book7.isPurchasable();
        org.team4.model.items.DVD dVD12 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Mobile Wallet", 0.0d);
        org.team4.model.paymentmodes.DebitCard debitCard16 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        java.util.Date date19 = null;
        java.util.Date date20 = null;
        org.team4.model.course.Course course23 = new org.team4.model.course.Course("hi!", date19, date20, "", "hi!");
        java.util.Date date24 = course23.getEndDate();
        java.lang.String str25 = course23.getProfessorEmail();
        java.lang.String str26 = course23.getProfessorEmail();
        org.team4.model.user.Student student31 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean32 = course23.isEnrolled(student31);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase33 = new org.team4.functionality.buy.ItemToPurchase(100.0d, (org.team4.model.user.User) student31);
        org.team4.functionality.buy.ProcessPayment processPayment34 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) debitCard16, itemToPurchase33);
        boolean boolean35 = debitCard16.correctLength();
        boolean boolean36 = debitCard16.isValid();
        boolean boolean37 = debitCard16.correctLength();
        boolean boolean38 = book7.equals((java.lang.Object) boolean37);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(date24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("User [email=, password=, name=hi!, type=hi!, validated=false]", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "", "User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}, type=hi!, validated=false]", (long) ' ');
        java.lang.String str6 = manager5.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}, type=hi!, validated=false]" + "'", str6, "User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}, type=hi!, validated=false]");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator11 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        org.team4.model.user.Faculty faculty17 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "hi!", "", "", false);
        faculty17.setFacultyID((long) (byte) 1);
        org.team4.model.user.Student student24 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str25 = student24.getType();
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        student24.setCourses(strList28);
        faculty17.setCourses(strList28);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase32 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) rentableItemDecorator11, (org.team4.model.user.User) faculty17);
        org.team4.model.items.builder.DVDBuilder dVDBuilder33 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder35 = dVDBuilder33.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder37 = dVDBuilder33.title("hi!");
        org.team4.model.items.builder.DVDBuilder dVDBuilder39 = dVDBuilder33.duration((double) 10L);
        org.team4.model.items.builder.DVDBuilder dVDBuilder41 = dVDBuilder33.genre("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        boolean boolean42 = rentableItemDecorator11.equals((java.lang.Object) dVDBuilder33);
        java.lang.String str43 = rentableItemDecorator11.getTitle();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(dVDBuilder35);
        org.junit.Assert.assertNotNull(dVDItemBuilder37);
        org.junit.Assert.assertNotNull(dVDBuilder39);
        org.junit.Assert.assertNotNull(dVDBuilder41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter8 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str9 = subscribeNewsletter8.getEmail();
        java.util.Date date10 = subscribeNewsletter8.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter13 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str14 = subscribeNewsletter13.getEmail();
        java.util.Date date15 = subscribeNewsletter13.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter16 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date10, date15);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter19 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter19.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter19.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter26 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date27 = null;
        subscribeNewsletter26.setDateSubscribed(date27);
        java.util.Date date29 = subscribeNewsletter26.getDateDue();
        subscribeNewsletter19.setDateDue(date29);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter31 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", date15, date29);
        java.util.Date date32 = subscribeNewsletter31.getDateDue();
        org.team4.functionality.buy.ItemPurchased itemPurchased33 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=null}", "", date32);
        java.lang.String str34 = itemPurchased33.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Tue Apr 30 19:21:57 EDT 2024");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Tue Apr 30 19:21:57 EDT 2024");
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Tue Apr 30 19:21:57 EDT 2024");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 19:21:57 EDT 2024");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ItemPurchased{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=null}', email='', datePurchased=Tue Apr 30 19:21:57 EDT 2024}" + "'", str34, "ItemPurchased{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=null}', email='', datePurchased=Tue Apr 30 19:21:57 EDT 2024}");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("User [email=, password=hi!, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=, validated=false]", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "hi!");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.booktype("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder5.ISBN("PayPal");
        org.team4.model.items.BookRequest bookRequest8 = bookRequestBuilder7.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder10 = bookRequestBuilder7.title("Debit Card");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder12 = bookRequestBuilder10.title("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder14 = bookRequestBuilder10.edition((int) (short) -1);
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
        org.junit.Assert.assertNotNull(bookRequest8);
        org.junit.Assert.assertNotNull(bookRequestBuilder10);
        org.junit.Assert.assertNotNull(bookRequestBuilder12);
        org.junit.Assert.assertNotNull(bookRequestBuilder14);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:55 EDT 2024, dateDue=Tue Apr 30 19:21:55 EDT 2024}", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}", "User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=User [email=, password=, name=hi!, type=, validated=false], name=hi!, type=PayPal, validated=true]", "Course [course name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, start date=Tue Apr 30 19:21:54 EDT 2024, end date=Tue Apr 30 19:21:54 EDT 2024, ISBN=ItemPurchased{title='', email='hi!', datePurchased=null}, email=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}]", true);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.paymentmodes.MobileWallet mobileWallet9 = new org.team4.model.paymentmodes.MobileWallet("");
        java.lang.String str10 = mobileWallet9.getMode();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet9);
        double double12 = purchaseComplete11.getAmount();
        long long13 = purchaseComplete11.getPurchaseID();
        org.team4.model.items.Newsletter newsletter14 = purchaseComplete11.getNewsletter();
        org.team4.model.items.Item item15 = purchaseComplete11.getItem();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PayPal" + "'", str10, "PayPal");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9853617L + "'", long13 == 9853617L);
        org.junit.Assert.assertNull(newsletter14);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        int int2 = bookRequest1.getEdition();
        java.lang.String str3 = bookRequest1.getAuthor();
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        dVD1.setQuantity((int) (short) 1);
        dVD1.setQuantity((int) ' ');
        boolean boolean9 = dVD1.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD1);
        org.team4.model.items.Item item11 = rentableItemDecorator10.getItem();
        org.team4.model.items.Item item12 = new org.team4.model.items.Item(item11);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter21 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str22 = subscribeNewsletter21.getTitle();
        java.util.Date date23 = null;
        subscribeNewsletter21.setDateSubscribed(date23);
        java.util.Date date25 = subscribeNewsletter21.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter30 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str31 = subscribeNewsletter30.getEmail();
        java.util.Date date32 = subscribeNewsletter30.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter35 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str36 = subscribeNewsletter35.getEmail();
        java.util.Date date37 = subscribeNewsletter35.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter38 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date32, date37);
        org.team4.model.course.Course course41 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date25, date37, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.model.course.CourseTextBook courseTextBook43 = new org.team4.model.course.CourseTextBook(item12, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", (int) (short) 1, "hi!", "PayPal", 52, course41, false);
        org.team4.model.course.Course course44 = courseTextBook43.getCourse();
        org.team4.model.course.Course course45 = courseTextBook43.getCourse();
        org.team4.model.user.Visitor visitor50 = new org.team4.model.user.Visitor("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "");
        boolean boolean51 = courseTextBook43.equals((java.lang.Object) "");
        org.team4.model.user.Student student56 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str57 = student56.getType();
        org.team4.model.user.Student student62 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str63 = student62.getType();
        java.lang.String[] strArray65 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        student62.setCourses(strList66);
        student56.setCourses(strList66);
        java.lang.String str70 = student56.getEmail();
        courseTextBook43.removeCopies(student56);
        org.team4.model.user.Student student81 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str82 = student81.getType();
        java.lang.String[] strArray84 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList85 = new java.util.ArrayList<java.lang.String>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList85, strArray84);
        student81.setCourses(strList85);
        org.team4.model.user.Faculty faculty88 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", (long) (byte) -1, strList85);
        java.util.ArrayList<java.lang.String> strList89 = faculty88.getCourses();
        student56.setCourses(strList89);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Tue Apr 30 19:21:57 EDT 2024");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 19:21:57 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 19:21:57 EDT 2024");
        org.junit.Assert.assertNotNull(course44);
        org.junit.Assert.assertNotNull(course45);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(strList89);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.team4.model.user.User user5 = new org.team4.model.user.User("User [email=, password=, name=hi!, type=, validated=false]", "Mobile Wallet", "User [email=User [email=, password=, name=hi!, type=, validated=false], password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=, validated=false]", "", false);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.team4.model.items.Item item0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.items.Magazine magazine3 = new org.team4.model.items.Magazine(item0, "", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"title\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        dVD1.setQuantity((int) (short) 1);
        dVD1.setQuantity((int) ' ');
        boolean boolean9 = dVD1.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD1);
        org.team4.model.items.Item item11 = rentableItemDecorator10.getItem();
        org.team4.model.items.Item item12 = new org.team4.model.items.Item(item11);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter21 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str22 = subscribeNewsletter21.getTitle();
        java.util.Date date23 = null;
        subscribeNewsletter21.setDateSubscribed(date23);
        java.util.Date date25 = subscribeNewsletter21.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter30 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str31 = subscribeNewsletter30.getEmail();
        java.util.Date date32 = subscribeNewsletter30.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter35 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str36 = subscribeNewsletter35.getEmail();
        java.util.Date date37 = subscribeNewsletter35.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter38 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date32, date37);
        org.team4.model.course.Course course41 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date25, date37, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.model.course.CourseTextBook courseTextBook43 = new org.team4.model.course.CourseTextBook(item12, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", (int) (short) 1, "hi!", "PayPal", 52, course41, false);
        org.team4.model.course.Course course44 = courseTextBook43.getCourse();
        org.team4.model.course.Course course45 = courseTextBook43.getCourse();
        org.team4.model.user.Visitor visitor50 = new org.team4.model.user.Visitor("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "");
        boolean boolean51 = courseTextBook43.equals((java.lang.Object) "");
        org.team4.model.user.Student student56 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str57 = student56.getType();
        java.lang.String[] strArray59 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        student56.setCourses(strList60);
        courseTextBook43.makeCopies(student56);
        java.lang.String str64 = courseTextBook43.getTitle();
        org.team4.model.items.Item item65 = new org.team4.model.items.Item((org.team4.model.items.Item) courseTextBook43);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Tue Apr 30 19:21:57 EDT 2024");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 19:21:57 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 19:21:57 EDT 2024");
        org.junit.Assert.assertNotNull(course44);
        org.junit.Assert.assertNotNull(course45);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNull(str64);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("hi!", "hi!", "hi!", "");
        nonFaculty4.setUniversityID((long) (short) 100);
        long long7 = nonFaculty4.getUniversityID();
        nonFaculty4.setUniversityID((long) (short) 100);
        nonFaculty4.setUniversityID(7699521L);
        java.lang.String str12 = nonFaculty4.getEmail();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder3 = dVDBuilder0.genre("");
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNotNull(dVDBuilder3);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("ItemPurchased{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=null}', email='', datePurchased=Tue Apr 30 19:21:57 EDT 2024}", 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}", false);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("User [email=, password=, name=hi!, type=hi!, validated=false]", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}", "Debit Card");
        java.util.ArrayList<java.lang.String> strList5 = student4.getCourses();
        org.junit.Assert.assertNull(strList5);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook8 = courseTextBookBuilder6.build();
        java.util.List<org.team4.model.user.Student> studentList9 = courseTextBook8.getStudentsWithCopies();
        int int10 = courseTextBook8.getNoOfPages();
        java.util.List<org.team4.model.user.Student> studentList11 = courseTextBook8.getStudentsWithCopies();
        java.util.List<org.team4.model.user.Student> studentList12 = courseTextBook8.getStudentsWithCopies();
        org.team4.model.course.Course course13 = courseTextBook8.getCourse();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertNotNull(studentList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(studentList11);
        org.junit.Assert.assertNotNull(studentList12);
        org.junit.Assert.assertNull(course13);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter5 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date6 = null;
        subscribeNewsletter5.setDateSubscribed(date6);
        java.util.Date date8 = subscribeNewsletter5.getDateDue();
        subscribeNewsletter2.setDateDue(date8);
        java.lang.String str10 = subscribeNewsletter2.toString();
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Tue Apr 30 19:21:57 EDT 2024");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:57 EDT 2024, dateDue=Tue Apr 30 19:21:57 EDT 2024}" + "'", str10, "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:57 EDT 2024, dateDue=Tue Apr 30 19:21:57 EDT 2024}");
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.title("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.edition(0);
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder3.edition((int) (byte) 1);
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        boolean boolean10 = book9.hasHardCopy();
        book9.setQuantity((int) '4');
        org.team4.model.user.Visitor visitor18 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase19 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor18);
        org.team4.model.paymentmodes.CreditCard creditCard23 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete24 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase19, (org.team4.model.paymentmodes.PaymentValidator) creditCard23);
        long long25 = purchaseComplete24.getPurchaseID();
        org.team4.model.user.User user26 = purchaseComplete24.getUser();
        org.team4.model.items.Newsletter newsletter27 = purchaseComplete24.getNewsletter();
        boolean boolean28 = book9.equals((java.lang.Object) newsletter27);
        book9.setQuantity((int) ' ');
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder36 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder38 = courseTextBookBuilder36.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder40 = courseTextBookBuilder36.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder42 = courseTextBookBuilder36.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder44 = courseTextBookBuilder36.price((double) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder46 = courseTextBookBuilder36.price((double) 10);
        org.team4.model.course.CourseTextBook courseTextBook47 = courseTextBookBuilder36.build();
        java.util.Date date54 = null;
        java.util.Date date55 = null;
        org.team4.model.course.Course course58 = new org.team4.model.course.Course("hi!", date54, date55, "", "hi!");
        java.lang.String str59 = course58.getProfessorEmail();
        org.team4.model.user.Student student60 = null;
        boolean boolean61 = course58.isEnrolled(student60);
        org.team4.model.course.CourseTextBook courseTextBook63 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook47, "hi!", (int) (short) 1, "PayPal", "Credit Card", (int) (short) 10, course58, true);
        org.team4.model.course.CourseTextBook courseTextBook65 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) book9, "ItemPurchased{title='', email='hi!', datePurchased=null}", (int) ' ', "User [email=hi!, password=hi!, name=hi!, type=, validated=false]", "PayPal", (int) (byte) 10, course58, true);
        java.lang.String str66 = course58.getCourseName();
        java.lang.String str67 = course58.getCourseTextBookISBN();
        java.util.Date date68 = course58.getStartDate();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 6888510L + "'", long25 == 6888510L);
        org.junit.Assert.assertNotNull(user26);
        org.junit.Assert.assertNull(newsletter27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(bookBuilder38);
        org.junit.Assert.assertNotNull(bookItemBuilder40);
        org.junit.Assert.assertNotNull(bookBuilder42);
        org.junit.Assert.assertNotNull(bookItemBuilder44);
        org.junit.Assert.assertNotNull(bookItemBuilder46);
        org.junit.Assert.assertNotNull(courseTextBook47);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNull(date68);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        dVD1.setQuantity((int) (short) 1);
        dVD1.setQuantity((int) ' ');
        boolean boolean9 = dVD1.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD1);
        double double11 = dVD1.getDuration();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=null}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}", 7509200L);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder2 = dVDBuilder0.title("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.quantity((int) '4');
        org.junit.Assert.assertNotNull(dVDItemBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("Debit Card", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "User [email=, password=, name=hi!, type=hi!, validated=false]", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", 2681544L);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder0.author("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = courseTextBookBuilder0.price((double) '4');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder14 = bookItemBuilder12.ISBN("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(bookItemBuilder12);
        org.junit.Assert.assertNotNull(bookItemBuilder14);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.ISBN("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder0.genre("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDBuilder6.quantity((int) (byte) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder10 = dVDItemBuilder8.quantity(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder12 = dVDItemBuilder10.ISBN("ItemToPurchase{item=Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}, user=User [email=, password=, name=hi!, type=hi!, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
        org.junit.Assert.assertNotNull(dVDItemBuilder10);
        org.junit.Assert.assertNotNull(dVDItemBuilder12);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.paymentmodes.CreditCard creditCard10 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) creditCard10);
        boolean boolean12 = creditCard10.notExpired();
        boolean boolean13 = creditCard10.isValid();
        boolean boolean14 = creditCard10.isValid();
        boolean boolean15 = creditCard10.correctLength();
        java.lang.String str16 = creditCard10.getMode();
        boolean boolean17 = creditCard10.isValid();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Credit Card" + "'", str16, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("", "", "", "", 0L);
        java.lang.String str6 = manager5.getType();
        long long7 = manager5.getManagerID();
        manager5.setManagerID(6491102L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder8 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder8.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = courseTextBookBuilder8.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder14 = courseTextBookBuilder8.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder16 = courseTextBookBuilder8.price((double) (-1L));
        org.team4.model.items.builder.BookBuilder bookBuilder18 = courseTextBookBuilder8.publisher("hi!");
        boolean boolean19 = book7.equals((java.lang.Object) bookBuilder18);
        java.util.Date date26 = null;
        java.util.Date date27 = null;
        org.team4.model.course.Course course30 = new org.team4.model.course.Course("hi!", date26, date27, "", "hi!");
        org.team4.model.user.Student student35 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str36 = student35.getType();
        course30.enrollStudent(student35);
        java.lang.String str38 = course30.getCourseName();
        java.lang.String str39 = course30.getCourseTextBookISBN();
        org.team4.model.course.CourseTextBook courseTextBook41 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) book7, "PayPal", (int) ' ', "ItemPurchased{title='', email='', datePurchased=null}", "Credit Card", (int) (short) 100, course30, true);
        java.lang.String str42 = courseTextBook41.toString();
        boolean boolean43 = courseTextBook41.isPurchasable();
        org.team4.model.items.builder.DVDBuilder dVDBuilder44 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD45 = dVDBuilder44.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder47 = dVDBuilder44.genre("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder49 = dVDBuilder44.yearPublished((int) 'a');
        org.team4.model.items.builder.DVDBuilder dVDBuilder51 = dVDBuilder44.duration((double) 0.0f);
        boolean boolean52 = courseTextBook41.equals((java.lang.Object) dVDBuilder51);
        java.lang.String str53 = courseTextBook41.getGenre();
        java.lang.String str54 = courseTextBook41.getGenre();
        int int55 = courseTextBook41.getYearPublished();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(bookItemBuilder12);
        org.junit.Assert.assertNotNull(bookBuilder14);
        org.junit.Assert.assertNotNull(bookItemBuilder16);
        org.junit.Assert.assertNotNull(bookBuilder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}" + "'", str42, "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(dVD45);
        org.junit.Assert.assertNotNull(dVDBuilder47);
        org.junit.Assert.assertNotNull(dVDItemBuilder49);
        org.junit.Assert.assertNotNull(dVDBuilder51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "PayPal" + "'", str53, "PayPal");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "PayPal" + "'", str54, "PayPal");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}, type=hi!, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", true);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "Course [course name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, start date=Tue Apr 30 19:21:54 EDT 2024, end date=Tue Apr 30 19:21:54 EDT 2024, ISBN=ItemPurchased{title='', email='hi!', datePurchased=null}, email=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}]", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:55 EDT 2024, dateDue=Tue Apr 30 19:21:55 EDT 2024}", true);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        boolean boolean4 = debitCard3.notExpired();
        boolean boolean5 = debitCard3.correctLength();
        java.util.Date date8 = null;
        java.util.Date date9 = null;
        org.team4.model.course.Course course12 = new org.team4.model.course.Course("hi!", date8, date9, "", "hi!");
        java.util.Date date13 = course12.getEndDate();
        java.lang.String str14 = course12.getProfessorEmail();
        java.lang.String str15 = course12.getProfessorEmail();
        org.team4.model.user.Student student20 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean21 = course12.isEnrolled(student20);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase22 = new org.team4.functionality.buy.ItemToPurchase(100.0d, (org.team4.model.user.User) student20);
        double double23 = itemToPurchase22.getAmount();
        org.team4.functionality.buy.ProcessPayment processPayment24 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) debitCard3, itemToPurchase22);
        boolean boolean25 = debitCard3.correctLength();
        boolean boolean26 = debitCard3.notExpired();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder6.quantity((-1));
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = courseTextBookBuilder6.price((double) 100L);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder14 = courseTextBookBuilder6.isVirtual(false);
        org.team4.model.items.builder.BookBuilder bookBuilder16 = courseTextBookBuilder6.hasSoftCopy(false);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(bookItemBuilder12);
        org.junit.Assert.assertNotNull(courseTextBookBuilder14);
        org.junit.Assert.assertNotNull(bookBuilder16);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.title("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.edition(0);
        org.team4.model.items.BookRequest bookRequest6 = bookRequestBuilder5.build();
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequest6);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        java.util.ArrayList<java.lang.String> strList9 = org.team4.model.paymentmodes.PaymentModes.MODE;
        org.team4.model.user.Faculty faculty10 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "ItemPurchased{title='', email='', datePurchased=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", 2031860L, strList9);
        org.team4.model.user.Student student11 = new org.team4.model.user.Student("PayPal", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "User [email=, password=, name=hi!, type=, validated=false]", strList9);
        java.util.ArrayList<java.lang.String> strList12 = student11.getCourses();
        org.team4.model.user.Student student27 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str28 = student27.getType();
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        student27.setCourses(strList31);
        org.team4.model.user.Faculty faculty34 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", (long) (byte) -1, strList31);
        java.lang.String str35 = faculty34.getName();
        faculty34.setFacultyID((long) (short) 100);
        java.util.ArrayList<java.lang.String> strList38 = faculty34.getCourses();
        org.team4.model.user.Faculty faculty39 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", (long) (byte) 100, strList38);
        student11.setCourses(strList38);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str35, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertNotNull(strList38);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder8 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder8.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = courseTextBookBuilder8.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder14 = courseTextBookBuilder8.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder16 = courseTextBookBuilder8.price((double) (-1L));
        org.team4.model.items.builder.BookBuilder bookBuilder18 = courseTextBookBuilder8.publisher("hi!");
        boolean boolean19 = book7.equals((java.lang.Object) bookBuilder18);
        java.util.Date date26 = null;
        java.util.Date date27 = null;
        org.team4.model.course.Course course30 = new org.team4.model.course.Course("hi!", date26, date27, "", "hi!");
        org.team4.model.user.Student student35 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str36 = student35.getType();
        course30.enrollStudent(student35);
        java.lang.String str38 = course30.getCourseName();
        java.lang.String str39 = course30.getCourseTextBookISBN();
        org.team4.model.course.CourseTextBook courseTextBook41 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) book7, "PayPal", (int) ' ', "ItemPurchased{title='', email='', datePurchased=null}", "Credit Card", (int) (short) 100, course30, true);
        java.lang.String str42 = courseTextBook41.toString();
        org.team4.model.user.Student student47 = new org.team4.model.user.Student("", "", "hi!", "");
        student47.setEmail("");
        java.lang.String str50 = student47.getType();
        // The following exception was thrown during execution in test generation
        try {
            courseTextBook41.removeCopies(student47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(bookItemBuilder12);
        org.junit.Assert.assertNotNull(bookBuilder14);
        org.junit.Assert.assertNotNull(bookItemBuilder16);
        org.junit.Assert.assertNotNull(bookBuilder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}" + "'", str42, "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
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
        int int14 = courseTextBook8.getNoOfPages();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertNotNull(studentList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(studentList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.yearPublished((int) 'a');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDBuilder2.ISBN("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}");
        org.team4.model.items.DVD dVD7 = dVDBuilder2.build();
        double double8 = dVD7.getDuration();
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVD7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        boolean boolean11 = rentableItemDecorator10.isPurchasable();
        double double12 = rentableItemDecorator10.getPrice();
        boolean boolean13 = rentableItemDecorator10.isRentable();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("PayPal", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "", "Debit Card", false);
        nonFaculty5.setUniversityID((-1L));
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.yearPublished((int) (short) 0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineBuilder0.quantity((int) (short) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder10 = magazineBuilder0.price((double) (short) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder12 = magazineBuilder0.quantity((int) (short) 1);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder14 = magazineBuilder0.publisher("ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder16 = magazineBuilder14.publisher("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=null}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder18 = magazineBuilder14.price((double) (-1));
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
        org.junit.Assert.assertNotNull(magazineItemBuilder10);
        org.junit.Assert.assertNotNull(magazineItemBuilder12);
        org.junit.Assert.assertNotNull(magazineBuilder14);
        org.junit.Assert.assertNotNull(magazineBuilder16);
        org.junit.Assert.assertNotNull(magazineItemBuilder18);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        dVD1.setQuantity((int) (short) 1);
        dVD1.setQuantity((int) ' ');
        boolean boolean9 = dVD1.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD1);
        org.team4.model.items.Item item11 = rentableItemDecorator10.getItem();
        org.team4.model.items.Item item12 = new org.team4.model.items.Item(item11);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter21 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str22 = subscribeNewsletter21.getTitle();
        java.util.Date date23 = null;
        subscribeNewsletter21.setDateSubscribed(date23);
        java.util.Date date25 = subscribeNewsletter21.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter30 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str31 = subscribeNewsletter30.getEmail();
        java.util.Date date32 = subscribeNewsletter30.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter35 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str36 = subscribeNewsletter35.getEmail();
        java.util.Date date37 = subscribeNewsletter35.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter38 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date32, date37);
        org.team4.model.course.Course course41 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date25, date37, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.model.course.CourseTextBook courseTextBook43 = new org.team4.model.course.CourseTextBook(item12, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", (int) (short) 1, "hi!", "PayPal", 52, course41, false);
        org.team4.model.course.Course course44 = courseTextBook43.getCourse();
        double double45 = courseTextBook43.getPrice();
        int int46 = courseTextBook43.getEdition();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Tue Apr 30 19:21:58 EDT 2024");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 19:21:58 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 19:21:58 EDT 2024");
        org.junit.Assert.assertNotNull(course44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 52 + "'", int46 == 52);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "Credit Card", (int) '4', "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        int int7 = bookRequest6.getEdition();
        int int8 = bookRequest6.getEdition();
        java.lang.String str9 = bookRequest6.getBookType();
        java.lang.String str10 = bookRequest6.getISBN();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}" + "'", str9, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Credit Card" + "'", str10, "Credit Card");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "Credit Card", (int) '4', "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        int int7 = bookRequest6.getEdition();
        java.lang.String str8 = bookRequest6.getISBN();
        java.lang.String str9 = bookRequest6.getTitle();
        int int10 = bookRequest6.getEdition();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str9, "ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder3 = dVDBuilder0.genre("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder5 = dVDBuilder0.yearPublished((int) 'a');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder7 = dVDItemBuilder5.yearPublished(32);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder9 = dVDItemBuilder7.ISBN("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNotNull(dVDBuilder3);
        org.junit.Assert.assertNotNull(dVDItemBuilder5);
        org.junit.Assert.assertNotNull(dVDItemBuilder7);
        org.junit.Assert.assertNotNull(dVDItemBuilder9);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("hi!", 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='Credit Card', email='hi!', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}", "Credit Card");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("");
        java.lang.String str2 = mobileWallet1.getMode();
        java.lang.String str3 = mobileWallet1.getMode();
        boolean boolean4 = mobileWallet1.isValid();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PayPal" + "'", str2, "PayPal");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PayPal" + "'", str3, "PayPal");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.DVD dVD10 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Credit Card", 0.0d);
        int int11 = book7.getNoOfPages();
        book7.setPrice((double) (-1L));
        int int14 = book7.getEdition();
        double double15 = book7.getPrice();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.paymentmodes.CreditCard creditCard10 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) creditCard10);
        java.lang.String str12 = creditCard10.getMode();
        org.team4.model.user.Student student18 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str19 = student18.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase20 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student18);
        org.team4.model.items.Newsletter newsletter21 = itemToPurchase20.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet23 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete24 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase20, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet23);
        org.team4.model.user.User user25 = itemToPurchase20.getUser();
        org.team4.functionality.buy.ProcessPayment processPayment26 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) creditCard10, itemToPurchase20);
        org.team4.model.paymentmodes.PayPal payPal28 = new org.team4.model.paymentmodes.PayPal("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        boolean boolean29 = payPal28.isValid();
        java.lang.String str30 = payPal28.toString();
        boolean boolean31 = payPal28.isValid();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete32 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase20, (org.team4.model.paymentmodes.PaymentValidator) payPal28);
        org.team4.model.items.Newsletter newsletter33 = itemToPurchase20.getNewsletter();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Credit Card" + "'", str12, "Credit Card");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(newsletter21);
        org.junit.Assert.assertNotNull(user25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}" + "'", str30, "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(newsletter33);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder0.price((double) 10);
        org.team4.model.course.CourseTextBook courseTextBook11 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder13 = courseTextBookBuilder0.hasHardCopy(false);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder15 = courseTextBookBuilder0.isVirtual(false);
        org.team4.model.course.CourseTextBook courseTextBook16 = courseTextBookBuilder0.build();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(courseTextBook11);
        org.junit.Assert.assertNotNull(bookBuilder13);
        org.junit.Assert.assertNotNull(courseTextBookBuilder15);
        org.junit.Assert.assertNotNull(courseTextBook16);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        dVD1.setQuantity((int) (short) 1);
        dVD1.setQuantity((int) ' ');
        boolean boolean9 = dVD1.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD1);
        boolean boolean11 = rentableItemDecorator10.isRentable();
        org.team4.model.items.Item item12 = rentableItemDecorator10.getItem();
        org.team4.model.items.Item item13 = new org.team4.model.items.Item(item12);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(item12);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder3 = dVDBuilder0.genre("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder5 = dVDBuilder0.yearPublished((int) 'a');
        org.team4.model.items.builder.DVDBuilder dVDBuilder7 = dVDBuilder0.duration((double) 0.0f);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder9 = dVDBuilder0.yearPublished((-1));
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNotNull(dVDBuilder3);
        org.junit.Assert.assertNotNull(dVDItemBuilder5);
        org.junit.Assert.assertNotNull(dVDBuilder7);
        org.junit.Assert.assertNotNull(dVDItemBuilder9);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.title("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.title("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder5.author("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder9 = bookRequestBuilder5.author("hi!");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
        org.junit.Assert.assertNotNull(bookRequestBuilder9);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "User [email=, password=, name=hi!, type=hi!, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", false);
        nonFaculty5.setUniversityID(0L);
        long long8 = nonFaculty5.getUniversityID();
        nonFaculty5.setUniversityID((long) 'a');
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("", "", "", "", 0L);
        long long6 = manager5.getManagerID();
        java.lang.String str7 = manager5.toString();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [email=, password=, name=, type=, validated=false]" + "'", str7, "User [email=, password=, name=, type=, validated=false]");
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder8 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder8.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = courseTextBookBuilder8.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder14 = courseTextBookBuilder8.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder16 = courseTextBookBuilder8.price((double) (-1L));
        org.team4.model.items.builder.BookBuilder bookBuilder18 = courseTextBookBuilder8.publisher("hi!");
        boolean boolean19 = book7.equals((java.lang.Object) bookBuilder18);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder25 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder27 = courseTextBookBuilder25.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder29 = courseTextBookBuilder25.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder31 = courseTextBookBuilder25.isVirtual(true);
        org.team4.model.items.Book book32 = courseTextBookBuilder31.build();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder33 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder35 = courseTextBookBuilder33.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder37 = courseTextBookBuilder33.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder39 = courseTextBookBuilder33.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder41 = courseTextBookBuilder33.price((double) (-1L));
        org.team4.model.items.builder.BookBuilder bookBuilder43 = courseTextBookBuilder33.publisher("hi!");
        boolean boolean44 = book32.equals((java.lang.Object) bookBuilder43);
        java.util.Date date51 = null;
        java.util.Date date52 = null;
        org.team4.model.course.Course course55 = new org.team4.model.course.Course("hi!", date51, date52, "", "hi!");
        org.team4.model.user.Student student60 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str61 = student60.getType();
        course55.enrollStudent(student60);
        java.lang.String str63 = course55.getCourseName();
        java.lang.String str64 = course55.getCourseTextBookISBN();
        org.team4.model.course.CourseTextBook courseTextBook66 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) book32, "PayPal", (int) ' ', "ItemPurchased{title='', email='', datePurchased=null}", "Credit Card", (int) (short) 100, course55, true);
        org.team4.model.course.CourseTextBook courseTextBook68 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) book7, "PayPal", (int) '#', "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "Mobile Wallet", (int) 'a', course55, true);
        org.team4.model.user.Student student73 = new org.team4.model.user.Student("", "", "hi!", "");
        course55.enrollStudent(student73);
        org.team4.model.user.Student student80 = new org.team4.model.user.Student("ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}", "ItemPurchased{title='', email='', datePurchased=null}", "hi!", "Mobile Wallet", false);
        course55.enrollStudent(student80);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(bookItemBuilder12);
        org.junit.Assert.assertNotNull(bookBuilder14);
        org.junit.Assert.assertNotNull(bookItemBuilder16);
        org.junit.Assert.assertNotNull(bookBuilder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookBuilder27);
        org.junit.Assert.assertNotNull(bookItemBuilder29);
        org.junit.Assert.assertNotNull(courseTextBookBuilder31);
        org.junit.Assert.assertNotNull(book32);
        org.junit.Assert.assertNotNull(bookBuilder35);
        org.junit.Assert.assertNotNull(bookItemBuilder37);
        org.junit.Assert.assertNotNull(bookBuilder39);
        org.junit.Assert.assertNotNull(bookItemBuilder41);
        org.junit.Assert.assertNotNull(bookBuilder43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("");
        boolean boolean2 = mobileWallet1.isValid();
        java.lang.String str3 = mobileWallet1.getMode();
        boolean boolean4 = mobileWallet1.isValid();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PayPal" + "'", str3, "PayPal");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder0.ISBN("ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}");
        org.team4.model.items.BookRequest bookRequest5 = bookRequestBuilder4.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder4.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequest5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("ItemPurchased{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=null}', email='', datePurchased=Tue Apr 30 19:21:57 EDT 2024}", "User [email=, password=, name=hi!, type=hi!, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", true);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("Debit Card", "User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}, type=hi!, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}");
        java.lang.String str5 = faculty4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        org.team4.model.items.builder.BookBuilder bookBuilder11 = courseTextBookBuilder6.noOfPages((int) '4');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder13 = courseTextBookBuilder6.price((double) (byte) -1);
        org.team4.model.items.builder.BookBuilder bookBuilder15 = courseTextBookBuilder6.genre("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNotNull(bookBuilder11);
        org.junit.Assert.assertNotNull(bookItemBuilder13);
        org.junit.Assert.assertNotNull(bookBuilder15);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("Debit Card", "PayPal", "hi!", "hi!", false);
        long long6 = faculty5.getFacultyID();
        java.util.ArrayList<java.lang.String> strList7 = faculty5.getCourses();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(strList7);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "Credit Card", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", false);
        java.lang.String str6 = student5.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str6, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder6 = courseTextBookBuilder0.quantity(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = bookItemBuilder6.title("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = bookItemBuilder8.title("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = bookItemBuilder10.price((double) 1667553L);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookItemBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(bookItemBuilder12);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.team4.model.user.Manager manager4 = new org.team4.model.user.Manager("Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "User [email=, password=, name=hi!, type=, validated=false]", "ItemToPurchase{item=null, user=User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemPurchased{title='', email='', datePurchased=null}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}");
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("Credit Card", (int) '#', 32);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 32");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDItemBuilder4.price(10.0d);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDItemBuilder6.price((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder10 = dVDItemBuilder6.yearPublished((int) (byte) -1);
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
        org.junit.Assert.assertNotNull(dVDItemBuilder10);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("ItemPurchased{title='', email='hi!', datePurchased=null}", (int) (short) 0, (int) (short) 0, (double) '#', "PayPal{email='ItemPurchased{title='', email='hi!', datePurchased=null}'}", true, true);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.DVD dVD10 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Credit Card", 0.0d);
        boolean boolean11 = book7.hasSoftCopy();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator12 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book7);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        book7.setPrice((double) 0L);
        org.team4.model.items.Magazine magazine13 = new org.team4.model.items.Magazine((org.team4.model.items.Item) book7, "PayPal", (int) (short) 0);
        int int14 = magazine13.getIssueNumber();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder4 = magazineItemBuilder2.ISBN("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineItemBuilder2.ISBN("User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineItemBuilder2.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:57 EDT 2024, dateDue=Tue Apr 30 19:21:57 EDT 2024}");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineItemBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "PayPal", true);
        org.team4.model.user.Student student15 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str16 = student15.getType();
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        student15.setCourses(strList19);
        org.team4.model.user.Faculty faculty22 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", (long) (byte) -1, strList19);
        faculty5.setCourses(strList19);
        java.util.Date date25 = null;
        java.util.Date date26 = null;
        org.team4.model.course.Course course29 = new org.team4.model.course.Course("", date25, date26, "", "hi!");
        java.lang.String str30 = course29.getProfessorEmail();
        org.team4.model.user.Student student36 = new org.team4.model.user.Student("", "", "PayPal", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase37 = new org.team4.functionality.buy.ItemToPurchase((double) 0L, (org.team4.model.user.User) student36);
        boolean boolean38 = course29.isEnrolled(student36);
        org.team4.model.user.Student student44 = new org.team4.model.user.Student("", "", "hi!", "");
        student44.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase47 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student44);
        java.lang.String str48 = student44.getEmail();
        org.team4.model.user.Student student63 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str64 = student63.getType();
        java.lang.String[] strArray66 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList67 = new java.util.ArrayList<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList67, strArray66);
        student63.setCourses(strList67);
        org.team4.model.user.Faculty faculty70 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", (long) (byte) -1, strList67);
        org.team4.model.user.Faculty faculty71 = new org.team4.model.user.Faculty("", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", "ItemPurchased{title='', email='hi!', datePurchased=null}", (long) (byte) 0, strList67);
        student44.setCourses(strList67);
        student36.setCourses(strList67);
        faculty5.setCourses(strList67);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='Credit Card', email='hi!', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}");
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.booktype("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.BookRequest bookRequest6 = bookRequestBuilder5.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder5.booktype("Credit Card");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder10 = bookRequestBuilder5.author("Credit Card");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequest6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
        org.junit.Assert.assertNotNull(bookRequestBuilder10);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder0.ISBN("ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}");
        org.team4.model.items.BookRequest bookRequest5 = bookRequestBuilder4.build();
        java.lang.String str6 = bookRequest5.getAuthor();
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}" + "'", str6, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder0.email("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.edition(0);
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder4.booktype("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:55 EDT 2024, dateDue=Tue Apr 30 19:21:55 EDT 2024}");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook8 = courseTextBookBuilder6.build();
        int int9 = courseTextBook8.getEdition();
        org.team4.model.items.BookRequest bookRequest16 = new org.team4.model.items.BookRequest("", "Credit Card", "", "ItemPurchased{title='', email='hi!', datePurchased=null}", (int) (byte) -1, "User [email=, password=, name=hi!, type=, validated=false]");
        java.lang.String str17 = bookRequest16.getEmail();
        boolean boolean18 = courseTextBook8.equals((java.lang.Object) str17);
        org.team4.model.items.Item item19 = new org.team4.model.items.Item((org.team4.model.items.Item) courseTextBook8);
        java.lang.String str20 = courseTextBook8.toString();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}" + "'", str20, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "User [email=, password=, name=hi!, type=, validated=false]", (int) (short) 10, "ItemPurchased{title='', email='', datePurchased=null}");
        java.lang.String str7 = bookRequest6.getBookType();
        java.lang.String str8 = bookRequest6.getEmail();
        java.lang.String str9 = bookRequest6.getBookType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str7, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}" + "'", str8, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str9, "ItemPurchased{title='', email='', datePurchased=null}");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter5 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str6 = subscribeNewsletter5.getTitle();
        java.util.Date date7 = null;
        subscribeNewsletter5.setDateSubscribed(date7);
        java.util.Date date9 = subscribeNewsletter5.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter12 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter12.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter18 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str19 = subscribeNewsletter18.getTitle();
        java.util.Date date20 = null;
        subscribeNewsletter18.setDateSubscribed(date20);
        java.util.Date date22 = subscribeNewsletter18.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter27 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str28 = subscribeNewsletter27.getEmail();
        java.util.Date date29 = subscribeNewsletter27.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter32 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str33 = subscribeNewsletter32.getEmail();
        java.util.Date date34 = subscribeNewsletter32.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter35 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date29, date34);
        org.team4.model.course.Course course38 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date22, date34, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        subscribeNewsletter12.setDateSubscribed(date22);
        org.team4.model.course.Course course42 = new org.team4.model.course.Course("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", date9, date22, "Credit Card", "ItemPurchased{title='', email='', datePurchased=null}");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter46 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str47 = subscribeNewsletter46.getTitle();
        java.util.Date date48 = null;
        subscribeNewsletter46.setDateSubscribed(date48);
        java.util.Date date50 = subscribeNewsletter46.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter53 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter53.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter59 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str60 = subscribeNewsletter59.getTitle();
        java.util.Date date61 = null;
        subscribeNewsletter59.setDateSubscribed(date61);
        java.util.Date date63 = subscribeNewsletter59.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter68 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str69 = subscribeNewsletter68.getEmail();
        java.util.Date date70 = subscribeNewsletter68.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter73 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str74 = subscribeNewsletter73.getEmail();
        java.util.Date date75 = subscribeNewsletter73.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter76 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date70, date75);
        org.team4.model.course.Course course79 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date63, date75, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        subscribeNewsletter53.setDateSubscribed(date63);
        org.team4.model.course.Course course83 = new org.team4.model.course.Course("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", date50, date63, "Credit Card", "ItemPurchased{title='', email='', datePurchased=null}");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter84 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemPurchased{title='', email='', datePurchased=null}", "PayPal", date22, date63);
        subscribeNewsletter84.setEmail("");
        java.lang.String str87 = subscribeNewsletter84.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Tue Apr 30 19:21:58 EDT 2024");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Tue Apr 30 19:21:58 EDT 2024");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Tue Apr 30 19:21:58 EDT 2024");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(date34);
// flaky:         org.junit.Assert.assertEquals(date34.toString(), "Tue Apr 30 19:21:58 EDT 2024");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(date50);
// flaky:         org.junit.Assert.assertEquals(date50.toString(), "Tue Apr 30 19:21:58 EDT 2024");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(date63);
// flaky:         org.junit.Assert.assertEquals(date63.toString(), "Tue Apr 30 19:21:58 EDT 2024");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertNotNull(date70);
// flaky:         org.junit.Assert.assertEquals(date70.toString(), "Tue Apr 30 19:21:58 EDT 2024");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertNotNull(date75);
// flaky:         org.junit.Assert.assertEquals(date75.toString(), "Tue Apr 30 19:21:58 EDT 2024");
// flaky:         org.junit.Assert.assertEquals("'" + str87 + "' != '" + "SubscribeNewsletter{title='ItemPurchased{title='', email='', datePurchased=null}', email='', dateSubscribed=Tue Apr 30 19:21:58 EDT 2024, dateDue=Tue Apr 30 19:21:58 EDT 2024}" + "'", str87, "SubscribeNewsletter{title='ItemPurchased{title='', email='', datePurchased=null}', email='', dateSubscribed=Tue Apr 30 19:21:58 EDT 2024, dateDue=Tue Apr 30 19:21:58 EDT 2024}");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", (double) '#');
        java.lang.String str4 = newsletter3.getTitle();
        java.lang.String str5 = newsletter3.getTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}" + "'", str4, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}" + "'", str5, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder0.author("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = courseTextBookBuilder0.price((double) '4');
        org.team4.model.course.CourseTextBook courseTextBook13 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder15 = courseTextBookBuilder0.genre("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=null}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(bookItemBuilder12);
        org.junit.Assert.assertNotNull(courseTextBook13);
        org.junit.Assert.assertNotNull(bookBuilder15);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder6 = courseTextBookBuilder0.quantity(0);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.Book book9 = bookBuilder8.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder11 = bookBuilder8.yearPublished((-1));
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookItemBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNotNull(bookItemBuilder11);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=User [email=, password=, name=hi!, type=, validated=false], name=hi!, type=PayPal, validated=true]", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "Course [course name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, start date=Tue Apr 30 19:21:54 EDT 2024, end date=Tue Apr 30 19:21:54 EDT 2024, ISBN=ItemPurchased{title='', email='hi!', datePurchased=null}, email=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}]");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter8 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str9 = subscribeNewsletter8.getEmail();
        java.util.Date date10 = subscribeNewsletter8.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter13 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str14 = subscribeNewsletter13.getEmail();
        java.util.Date date15 = subscribeNewsletter13.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter16 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date10, date15);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter25 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str26 = subscribeNewsletter25.getEmail();
        java.util.Date date27 = subscribeNewsletter25.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter30 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str31 = subscribeNewsletter30.getEmail();
        java.util.Date date32 = subscribeNewsletter30.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter33 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date27, date32);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter36 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter36.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter36.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter43 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date44 = null;
        subscribeNewsletter43.setDateSubscribed(date44);
        java.util.Date date46 = subscribeNewsletter43.getDateDue();
        subscribeNewsletter36.setDateDue(date46);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter48 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", date32, date46);
        java.util.Date date49 = subscribeNewsletter48.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter56 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str57 = subscribeNewsletter56.getEmail();
        java.util.Date date58 = subscribeNewsletter56.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter61 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str62 = subscribeNewsletter61.getEmail();
        java.util.Date date63 = subscribeNewsletter61.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter64 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date58, date63);
        org.team4.functionality.buy.ItemPurchased itemPurchased65 = new org.team4.functionality.buy.ItemPurchased("User [email=, password=, name=hi!, type=, validated=false]", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", date63);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter66 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}", "Mobile Wallet", date49, date63);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter67 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date10, date49);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter72 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str73 = subscribeNewsletter72.getEmail();
        java.util.Date date74 = subscribeNewsletter72.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter77 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str78 = subscribeNewsletter77.getTitle();
        java.util.Date date79 = null;
        subscribeNewsletter77.setDateSubscribed(date79);
        java.util.Date date81 = subscribeNewsletter77.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter82 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "", date74, date81);
        org.team4.model.items.RentedItem rentedItem83 = new org.team4.model.items.RentedItem("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "", date10, date81);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Tue Apr 30 19:21:59 EDT 2024");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Tue Apr 30 19:21:59 EDT 2024");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(date27);
// flaky:         org.junit.Assert.assertEquals(date27.toString(), "Tue Apr 30 19:21:59 EDT 2024");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 19:21:59 EDT 2024");
        org.junit.Assert.assertNotNull(date46);
// flaky:         org.junit.Assert.assertEquals(date46.toString(), "Tue Apr 30 19:21:59 EDT 2024");
        org.junit.Assert.assertNotNull(date49);
// flaky:         org.junit.Assert.assertEquals(date49.toString(), "Tue Apr 30 19:21:59 EDT 2024");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(date58);
// flaky:         org.junit.Assert.assertEquals(date58.toString(), "Tue Apr 30 19:21:59 EDT 2024");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertNotNull(date63);
// flaky:         org.junit.Assert.assertEquals(date63.toString(), "Tue Apr 30 19:21:59 EDT 2024");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertNotNull(date74);
// flaky:         org.junit.Assert.assertEquals(date74.toString(), "Tue Apr 30 19:21:59 EDT 2024");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertNotNull(date81);
// flaky:         org.junit.Assert.assertEquals(date81.toString(), "Tue Apr 30 19:21:59 EDT 2024");
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder6.author("Credit Card");
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        org.team4.model.course.Course course14 = new org.team4.model.course.Course("hi!", date10, date11, "", "hi!");
        java.lang.String str15 = course14.getProfessorEmail();
        java.lang.String str16 = course14.getProfessorEmail();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder17 = courseTextBookBuilder6.course(course14);
        java.lang.String str18 = course14.getProfessorEmail();
        org.team4.model.user.Student student36 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str37 = student36.getType();
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        student36.setCourses(strList40);
        org.team4.model.user.Faculty faculty43 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", (long) (byte) -1, strList40);
        java.util.ArrayList<java.lang.String> strList44 = faculty43.getCourses();
        org.team4.model.user.Student student45 = new org.team4.model.user.Student("", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "Mobile Wallet", strList44);
        org.team4.model.user.Student student46 = new org.team4.model.user.Student("Credit Card", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", strList44);
        boolean boolean47 = course14.isEnrolled(student46);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(courseTextBookBuilder17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        boolean boolean10 = book9.hasHardCopy();
        book9.setQuantity((int) '4');
        org.team4.model.items.Item item13 = new org.team4.model.items.Item((org.team4.model.items.Item) book9);
        org.team4.model.items.builder.DVDBuilder dVDBuilder14 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder16 = dVDBuilder14.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder18 = dVDBuilder16.yearPublished((int) 'a');
        boolean boolean19 = item13.equals((java.lang.Object) 'a');
        org.team4.model.items.decorator.ItemDecorator itemDecorator20 = new org.team4.model.items.decorator.ItemDecorator(item13);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dVDBuilder16);
        org.junit.Assert.assertNotNull(dVDItemBuilder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", "PayPal{email='ItemPurchased{title='', email='hi!', datePurchased=null}'}", "Debit Card", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=Tue Apr 30 19:21:52 EDT 2024}", false);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:57 EDT 2024, dateDue=Tue Apr 30 19:21:57 EDT 2024}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "User [email=, password=, name=hi!, type=hi!, validated=false]", "Course [course name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, start date=Tue Apr 30 19:21:54 EDT 2024, end date=Tue Apr 30 19:21:54 EDT 2024, ISBN=ItemPurchased{title='', email='hi!', datePurchased=null}, email=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}]");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.team4.model.user.User user4 = new org.team4.model.user.User("User [email=, password=, name=hi!, type=, validated=false]", "User [email=, password=hi!, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=, validated=false]", "User [email=User [email=, password=, name=hi!, type=, validated=false], password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=, validated=false]", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        org.team4.model.items.Item item11 = rentableItemDecorator10.getItem();
        org.team4.model.items.Item item12 = rentableItemDecorator10.getItem();
        java.lang.Object obj13 = null;
        boolean boolean14 = item12.equals(obj13);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertNotNull(item12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.team4.model.paymentmodes.PaymentValidator paymentValidator0 = null;
        org.team4.model.items.Newsletter newsletter4 = new org.team4.model.items.Newsletter("", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", 0.0d);
        org.team4.model.items.builder.DVDBuilder dVDBuilder5 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD6 = dVDBuilder5.build();
        java.lang.String str7 = dVD6.getGenre();
        boolean boolean8 = dVD6.isPurchasable();
        double double9 = dVD6.getDuration();
        dVD6.setQuantity((int) (short) 1);
        dVD6.setQuantity((int) ' ');
        boolean boolean14 = dVD6.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator15 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD6);
        org.team4.model.items.Item item16 = rentableItemDecorator15.getItem();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator17 = new org.team4.model.items.decorator.PurchasableItemDecorator(item16);
        org.team4.model.user.Manager manager23 = new org.team4.model.user.Manager("", "", "", "hi!", false);
        manager23.setValidated(false);
        manager23.setName("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase28 = new org.team4.functionality.buy.ItemToPurchase(item16, (org.team4.model.user.User) manager23);
        java.lang.String str29 = manager23.getEmail();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase30 = new org.team4.functionality.buy.ItemToPurchase(newsletter4, (org.team4.model.user.User) manager23);
        org.team4.functionality.buy.ProcessPayment processPayment31 = new org.team4.functionality.buy.ProcessPayment(paymentValidator0, itemToPurchase30);
        java.lang.String str32 = processPayment31.toString();
        org.junit.Assert.assertNotNull(dVD6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}", "PayPal{email='PayPal'}", "Credit Card", "ItemPurchased{title='', email='', datePurchased=null}", 1403553L);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("", (int) '4', (int) '4', (double) 32, "", true, false);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        boolean boolean10 = book9.hasHardCopy();
        book9.setQuantity((int) '4');
        org.team4.model.user.Visitor visitor18 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase19 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor18);
        org.team4.model.paymentmodes.CreditCard creditCard23 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete24 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase19, (org.team4.model.paymentmodes.PaymentValidator) creditCard23);
        long long25 = purchaseComplete24.getPurchaseID();
        org.team4.model.user.User user26 = purchaseComplete24.getUser();
        org.team4.model.items.Newsletter newsletter27 = purchaseComplete24.getNewsletter();
        boolean boolean28 = book9.equals((java.lang.Object) newsletter27);
        book9.setQuantity((int) ' ');
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator31 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) book9);
        boolean boolean32 = purchasableItemDecorator31.isPurchasable();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5385446L + "'", long25 == 5385446L);
        org.junit.Assert.assertNotNull(user26);
        org.junit.Assert.assertNull(newsletter27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.title("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.title("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder5.author("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder9 = bookRequestBuilder5.title("ItemToPurchase{item=Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}, user=User [email=, password=, name=hi!, type=hi!, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
        org.junit.Assert.assertNotNull(bookRequestBuilder9);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        java.lang.String str8 = itemToPurchase7.toString();
        org.team4.model.user.User user9 = itemToPurchase7.getUser();
        java.lang.String str10 = itemToPurchase7.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}" + "'", str8, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}" + "'", str10, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.DVD dVD3 = dVDBuilder0.build();
        double double4 = dVD3.getDuration();
        org.team4.model.course.Course course10 = null;
        org.team4.model.course.CourseTextBook courseTextBook12 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) dVD3, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", (int) '#', "", "ItemPurchased{title='', email='', datePurchased=null}", (int) (short) -1, course10, true);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator13 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) dVD3);
        boolean boolean14 = purchasableItemDecorator13.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator15 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) purchasableItemDecorator13);
        boolean boolean16 = purchasableItemDecorator13.isPurchasable();
        org.team4.model.items.Item item17 = purchasableItemDecorator13.getItem();
        purchasableItemDecorator13.setPurchaseable(false);
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVD3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(item17);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.team4.model.user.User user4 = new org.team4.model.user.User("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
        user4.setEmail("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("SubscribeNewsletter{title='Credit Card', email='hi!', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}", (int) (byte) 10, (int) (byte) 10, (double) 10L, "Debit Card", true, true);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", 0.0d);
        java.lang.String str4 = newsletter3.getTitle();
        org.team4.model.items.builder.DVDBuilder dVDBuilder5 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD6 = dVDBuilder5.build();
        java.lang.String str7 = dVD6.getGenre();
        boolean boolean8 = dVD6.isPurchasable();
        double double9 = dVD6.getDuration();
        dVD6.setQuantity((int) (short) 1);
        dVD6.setQuantity((int) ' ');
        boolean boolean14 = dVD6.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator15 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD6);
        org.team4.model.items.Item item16 = rentableItemDecorator15.getItem();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator17 = new org.team4.model.items.decorator.PurchasableItemDecorator(item16);
        org.team4.model.user.Manager manager23 = new org.team4.model.user.Manager("", "", "", "hi!", false);
        manager23.setValidated(false);
        manager23.setName("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase28 = new org.team4.functionality.buy.ItemToPurchase(item16, (org.team4.model.user.User) manager23);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase29 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) manager23);
        org.team4.model.user.Manager manager35 = new org.team4.model.user.Manager("ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "hi!", "Credit Card", false);
        manager35.setPassword("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase38 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) manager35);
        double double39 = itemToPurchase38.getAmount();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(dVD6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        dVD1.setQuantity((int) (short) 1);
        dVD1.setQuantity((int) ' ');
        boolean boolean9 = dVD1.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD1);
        boolean boolean11 = rentableItemDecorator10.isRentable();
        org.team4.model.items.Item item12 = rentableItemDecorator10.getItem();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder18 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder20 = courseTextBookBuilder18.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder22 = courseTextBookBuilder18.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder24 = courseTextBookBuilder18.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder26 = courseTextBookBuilder18.quantity((int) (short) 100);
        java.util.Date date28 = null;
        java.util.Date date29 = null;
        org.team4.model.course.Course course32 = new org.team4.model.course.Course("hi!", date28, date29, "", "hi!");
        java.util.Date date33 = course32.getEndDate();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder34 = courseTextBookBuilder18.course(course32);
        java.util.Date date36 = null;
        java.util.Date date37 = null;
        org.team4.model.course.Course course40 = new org.team4.model.course.Course("hi!", date36, date37, "", "hi!");
        org.team4.model.user.Student student45 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str46 = student45.getType();
        course40.enrollStudent(student45);
        java.lang.String str48 = course40.getProfessorEmail();
        java.lang.String str49 = course40.getProfessorEmail();
        java.lang.String str50 = course40.getCourseTextBookISBN();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder51 = courseTextBookBuilder34.course(course40);
        org.team4.model.course.CourseTextBook courseTextBook53 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) rentableItemDecorator10, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}", 10, "hi!", "PayPal", (int) 'a', course40, false);
        java.util.Date date54 = course40.getStartDate();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter63 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str64 = subscribeNewsletter63.getEmail();
        java.util.Date date65 = subscribeNewsletter63.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter68 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str69 = subscribeNewsletter68.getEmail();
        java.util.Date date70 = subscribeNewsletter68.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter71 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date65, date70);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter74 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter74.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter74.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter81 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date82 = null;
        subscribeNewsletter81.setDateSubscribed(date82);
        java.util.Date date84 = subscribeNewsletter81.getDateDue();
        subscribeNewsletter74.setDateDue(date84);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter86 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", date70, date84);
        java.util.Date date87 = subscribeNewsletter86.getDateDue();
        org.team4.functionality.buy.ItemPurchased itemPurchased88 = new org.team4.functionality.buy.ItemPurchased("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "", date87);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean89 = course40.isEnded(date87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(item12);
        org.junit.Assert.assertNotNull(bookBuilder20);
        org.junit.Assert.assertNotNull(bookItemBuilder22);
        org.junit.Assert.assertNotNull(bookBuilder24);
        org.junit.Assert.assertNotNull(bookItemBuilder26);
        org.junit.Assert.assertNull(date33);
        org.junit.Assert.assertNotNull(courseTextBookBuilder34);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(courseTextBookBuilder51);
        org.junit.Assert.assertNull(date54);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertNotNull(date65);
// flaky:         org.junit.Assert.assertEquals(date65.toString(), "Tue Apr 30 19:21:59 EDT 2024");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertNotNull(date70);
// flaky:         org.junit.Assert.assertEquals(date70.toString(), "Tue Apr 30 19:21:59 EDT 2024");
        org.junit.Assert.assertNotNull(date84);
// flaky:         org.junit.Assert.assertEquals(date84.toString(), "Tue Apr 30 19:21:59 EDT 2024");
        org.junit.Assert.assertNotNull(date87);
// flaky:         org.junit.Assert.assertEquals(date87.toString(), "Tue Apr 30 19:21:59 EDT 2024");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", (int) (byte) 1, (int) (short) 100, (double) 2031860L, "SubscribeNewsletter{title='Credit Card', email='hi!', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}", true, false);
        boolean boolean8 = item7.isPurchasable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder6 = courseTextBookBuilder0.quantity(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (short) 0);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookItemBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        java.util.Date date11 = null;
        java.util.Date date12 = null;
        org.team4.model.course.Course course15 = new org.team4.model.course.Course("hi!", date11, date12, "", "hi!");
        java.util.Date date16 = course15.getEndDate();
        java.lang.String str17 = course15.getProfessorEmail();
        java.lang.String str18 = course15.getProfessorEmail();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder19 = courseTextBookBuilder6.course(course15);
        org.team4.model.items.builder.DVDBuilder dVDBuilder20 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD21 = dVDBuilder20.build();
        java.lang.String str22 = dVD21.getGenre();
        boolean boolean23 = dVD21.isPurchasable();
        double double24 = dVD21.getDuration();
        dVD21.setQuantity((int) (short) 1);
        dVD21.setQuantity((int) ' ');
        boolean boolean29 = dVD21.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator30 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD21);
        org.team4.model.items.Item item31 = rentableItemDecorator30.getItem();
        org.team4.model.items.Item item32 = new org.team4.model.items.Item(item31);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter41 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str42 = subscribeNewsletter41.getTitle();
        java.util.Date date43 = null;
        subscribeNewsletter41.setDateSubscribed(date43);
        java.util.Date date45 = subscribeNewsletter41.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter50 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str51 = subscribeNewsletter50.getEmail();
        java.util.Date date52 = subscribeNewsletter50.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter55 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str56 = subscribeNewsletter55.getEmail();
        java.util.Date date57 = subscribeNewsletter55.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter58 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date52, date57);
        org.team4.model.course.Course course61 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date45, date57, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.model.course.CourseTextBook courseTextBook63 = new org.team4.model.course.CourseTextBook(item32, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", (int) (short) 1, "hi!", "PayPal", 52, course61, false);
        org.team4.model.course.Course course64 = courseTextBook63.getCourse();
        org.team4.model.course.Course course65 = courseTextBook63.getCourse();
        org.team4.model.user.Visitor visitor70 = new org.team4.model.user.Visitor("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "");
        boolean boolean71 = courseTextBook63.equals((java.lang.Object) "");
        org.team4.model.user.Student student76 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str77 = student76.getType();
        java.lang.String[] strArray79 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList80 = new java.util.ArrayList<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList80, strArray79);
        student76.setCourses(strList80);
        courseTextBook63.makeCopies(student76);
        boolean boolean84 = course15.isEnrolled(student76);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(courseTextBookBuilder19);
        org.junit.Assert.assertNotNull(dVD21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(item31);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(date45);
// flaky:         org.junit.Assert.assertEquals(date45.toString(), "Tue Apr 30 19:21:59 EDT 2024");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(date52);
// flaky:         org.junit.Assert.assertEquals(date52.toString(), "Tue Apr 30 19:21:59 EDT 2024");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(date57);
// flaky:         org.junit.Assert.assertEquals(date57.toString(), "Tue Apr 30 19:21:59 EDT 2024");
        org.junit.Assert.assertNotNull(course64);
        org.junit.Assert.assertNotNull(course65);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.email("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder0.booktype("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.edition((int) (short) 1);
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder6.ISBN("Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        boolean boolean1 = org.team4.utils.EmailValidator.validEmail("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}', email='SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}', dateSubscribed=Tue Apr 30 19:21:55 EDT 2024, dateDue=Tue Apr 30 19:21:55 EDT 2024}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter4 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date5 = null;
        subscribeNewsletter4.setDateSubscribed(date5);
        java.util.Date date7 = subscribeNewsletter4.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter14 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str15 = subscribeNewsletter14.getEmail();
        java.util.Date date16 = subscribeNewsletter14.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter19 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str20 = subscribeNewsletter19.getEmail();
        java.util.Date date21 = subscribeNewsletter19.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter22 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date16, date21);
        org.team4.functionality.buy.ItemPurchased itemPurchased23 = new org.team4.functionality.buy.ItemPurchased("User [email=, password=, name=hi!, type=, validated=false]", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", date21);
        org.team4.model.items.RentedItem rentedItem24 = new org.team4.model.items.RentedItem("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}", "User [email=, password=, name=hi!, type=hi!, validated=false]", date7, date21);
        rentedItem24.setTitle("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Tue Apr 30 19:21:59 EDT 2024");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Tue Apr 30 19:21:59 EDT 2024");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Tue Apr 30 19:21:59 EDT 2024");
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.team4.model.user.User user5 = new org.team4.model.user.User("", "SubscribeNewsletter{title='ItemPurchased{title='', email='', datePurchased=null}', email='', dateSubscribed=Tue Apr 30 19:21:58 EDT 2024, dateDue=Tue Apr 30 19:21:58 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", false);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "User [email=, password=, name=hi!, type=, validated=false]", (int) (short) 10, "ItemPurchased{title='', email='', datePurchased=null}");
        java.lang.String str7 = bookRequest6.getBookType();
        java.lang.String str8 = bookRequest6.getISBN();
        java.lang.String str9 = bookRequest6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str7, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str8, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "hi!", "", "", false);
        faculty5.setFacultyID((long) (byte) 1);
        long long8 = faculty5.getFacultyID();
        faculty5.setFacultyID((long) (byte) -1);
        long long11 = faculty5.getFacultyID();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        student5.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase8 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student5);
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase8, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        long long12 = purchaseComplete11.getPurchaseID();
        long long13 = purchaseComplete11.getPurchaseID();
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 7527390L + "'", long12 == 7527390L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 7527390L + "'", long13 == 7527390L);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.team4.model.user.Manager manager4 = new org.team4.model.user.Manager("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}'}", "User [email=, password=, name=, type=, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}', email='SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}', dateSubscribed=Tue Apr 30 19:21:55 EDT 2024, dateDue=Tue Apr 30 19:21:55 EDT 2024}");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.team4.model.user.Student student9 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str10 = student9.getType();
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        student9.setCourses(strList13);
        org.team4.model.user.Faculty faculty16 = new org.team4.model.user.Faculty("User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}, type=hi!, validated=false]", "Debit Card", "User [email=, password=, name=hi!, type=, validated=false]", "PayPal", 100L, strList13);
        java.lang.String str17 = faculty16.getPassword();
        java.lang.String str18 = faculty16.getEmail();
        faculty16.setPassword("User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Debit Card" + "'", str17, "Debit Card");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}, type=hi!, validated=false]" + "'", str18, "User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}, type=hi!, validated=false]");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str3 = subscribeNewsletter2.getTitle();
        java.lang.String str4 = subscribeNewsletter2.getEmail();
        java.lang.String str5 = subscribeNewsletter2.toString();
        java.util.Date date6 = subscribeNewsletter2.getDateDue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:59 EDT 2024, dateDue=Tue Apr 30 19:21:59 EDT 2024}" + "'", str5, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:59 EDT 2024, dateDue=Tue Apr 30 19:21:59 EDT 2024}");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 30 19:21:59 EDT 2024");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.quantity(10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDBuilder0.title("ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDItemBuilder6.ISBN("User [email=, password=, name=hi!, type=hi!, validated=false]");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.team4.model.user.Student student14 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str15 = student14.getType();
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        student14.setCourses(strList18);
        org.team4.model.user.Faculty faculty21 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", (long) (byte) -1, strList18);
        org.team4.model.user.Faculty faculty22 = new org.team4.model.user.Faculty("", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", "ItemPurchased{title='', email='hi!', datePurchased=null}", (long) (byte) 0, strList18);
        org.team4.model.user.Student student32 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str33 = student32.getType();
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        student32.setCourses(strList36);
        org.team4.model.user.Faculty faculty39 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", (long) (byte) -1, strList36);
        java.util.ArrayList<java.lang.String> strList40 = faculty39.getCourses();
        java.util.ArrayList<java.lang.String> strList41 = faculty39.getCourses();
        faculty22.setCourses(strList41);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(strList41);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        org.team4.model.paymentmodes.MobileWallet mobileWallet6 = new org.team4.model.paymentmodes.MobileWallet("");
        org.team4.model.user.Student student12 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str13 = student12.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase14 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student12);
        org.team4.model.items.Newsletter newsletter15 = itemToPurchase14.getNewsletter();
        org.team4.functionality.buy.ProcessPayment processPayment16 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet6, itemToPurchase14);
        boolean boolean17 = dVD1.equals((java.lang.Object) processPayment16);
        org.team4.model.items.DVD dVD20 = new org.team4.model.items.DVD((org.team4.model.items.Item) dVD1, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", (double) '#');
        java.lang.String str21 = dVD1.getISBN();
        dVD1.setRentable(true);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.team4.functionality.buy.ItemPurchased itemPurchased2 = new org.team4.functionality.buy.ItemPurchased("User [email=hi!, password=hi!, name=hi!, type=, validated=false]", "User [email=hi!, password=hi!, name=hi!, type=, validated=false]");
        java.lang.String str3 = itemPurchased2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [email=hi!, password=hi!, name=hi!, type=, validated=false]" + "'", str3, "User [email=hi!, password=hi!, name=hi!, type=, validated=false]");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
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
        int int22 = courseTextBook8.getNoOfPages();
        courseTextBook8.setQuantity(10);
        double double25 = courseTextBook8.getPrice();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder26 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder28 = courseTextBookBuilder26.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder30 = courseTextBookBuilder26.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder32 = courseTextBookBuilder26.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder34 = courseTextBookBuilder26.quantity((int) (short) 100);
        org.team4.model.course.CourseTextBook courseTextBook35 = courseTextBookBuilder26.build();
        org.team4.model.items.builder.BookBuilder bookBuilder37 = courseTextBookBuilder26.author("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}");
        boolean boolean38 = courseTextBook8.equals((java.lang.Object) "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(bookBuilder28);
        org.junit.Assert.assertNotNull(bookItemBuilder30);
        org.junit.Assert.assertNotNull(bookBuilder32);
        org.junit.Assert.assertNotNull(bookItemBuilder34);
        org.junit.Assert.assertNotNull(courseTextBook35);
        org.junit.Assert.assertNotNull(bookBuilder37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("User [email=, password=, name=hi!, type=hi!, validated=false]", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "", "User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}, type=hi!, validated=false]", (long) ' ');
        java.lang.String str6 = manager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [email=, password=, name=hi!, type=hi!, validated=false]" + "'", str6, "User [email=, password=, name=hi!, type=hi!, validated=false]");
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.team4.model.user.User user4 = new org.team4.model.user.User("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=null}", "SubscribeNewsletter{title='Credit Card', email='hi!', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}'}");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("", "", "", "", 0L);
        java.lang.String str6 = manager5.getName();
        manager5.setValidated(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.paymentmodes.DebitCard debitCard15 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete16 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) debitCard15);
        org.team4.model.items.Item item17 = itemToPurchase7.getItem();
        org.team4.model.items.Item item18 = itemToPurchase7.getItem();
        org.team4.model.items.Item item19 = itemToPurchase7.getItem();
        double double20 = itemToPurchase7.getAmount();
        org.team4.model.user.User user21 = itemToPurchase7.getUser();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(user21);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.team4.model.paymentmodes.PaymentValidator paymentValidator0 = null;
        java.util.Date date3 = null;
        java.util.Date date4 = null;
        org.team4.model.course.Course course7 = new org.team4.model.course.Course("hi!", date3, date4, "", "hi!");
        java.util.Date date8 = course7.getEndDate();
        java.lang.String str9 = course7.getProfessorEmail();
        java.lang.String str10 = course7.getProfessorEmail();
        org.team4.model.user.Student student15 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean16 = course7.isEnrolled(student15);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase17 = new org.team4.functionality.buy.ItemToPurchase(100.0d, (org.team4.model.user.User) student15);
        org.team4.model.paymentmodes.PayPal payPal19 = new org.team4.model.paymentmodes.PayPal("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        boolean boolean20 = payPal19.isValid();
        java.lang.String str21 = payPal19.toString();
        boolean boolean22 = payPal19.isValid();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete23 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase17, (org.team4.model.paymentmodes.PaymentValidator) payPal19);
        org.team4.functionality.buy.ProcessPayment processPayment24 = new org.team4.functionality.buy.ProcessPayment(paymentValidator0, itemToPurchase17);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}" + "'", str21, "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}, type=hi!, validated=false]", 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.builder.DVDBuilder dVDBuilder4 = dVDBuilder0.genre("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder0.duration((double) 4262496L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDBuilder0.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:57 EDT 2024, dateDue=Tue Apr 30 19:21:57 EDT 2024}");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("");
        org.team4.model.user.Student student7 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str8 = student7.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase9 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student7);
        org.team4.model.items.Newsletter newsletter10 = itemToPurchase9.getNewsletter();
        org.team4.functionality.buy.ProcessPayment processPayment11 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet1, itemToPurchase9);
        java.lang.String str12 = mobileWallet1.getMode();
        java.lang.String str13 = mobileWallet1.getMode();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PayPal" + "'", str12, "PayPal");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PayPal" + "'", str13, "PayPal");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "Credit Card", (int) '4', "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        int int7 = bookRequest6.getEdition();
        java.lang.String str8 = bookRequest6.getAuthor();
        java.lang.String str9 = bookRequest6.getBookType();
        int int10 = bookRequest6.getEdition();
        int int11 = bookRequest6.getEdition();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str8, "ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}" + "'", str9, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        dVD1.setQuantity((int) (short) 1);
        dVD1.setQuantity((int) ' ');
        boolean boolean9 = dVD1.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD1);
        org.team4.model.items.Item item11 = rentableItemDecorator10.getItem();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator12 = new org.team4.model.items.decorator.PurchasableItemDecorator(item11);
        boolean boolean13 = purchasableItemDecorator12.isPurchasable();
        org.team4.model.items.Item item14 = new org.team4.model.items.Item((org.team4.model.items.Item) purchasableItemDecorator12);
        boolean boolean15 = purchasableItemDecorator12.isPurchasable();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        java.lang.String[] strArray25 = new java.lang.String[] { "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "PayPal", "ItemPurchased{title='', email='hi!', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemPurchased{title='', email='', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        org.team4.model.user.Faculty faculty28 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "", "ItemPurchased{title='', email='', datePurchased=null}", 0L, strList26);
        org.team4.model.user.Student student29 = new org.team4.model.user.Student("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "Debit Card", "hi!", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", strList26);
        org.team4.model.user.Student student30 = new org.team4.model.user.Student("Credit Card", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", strList26);
        java.lang.Class<?> wildcardClass31 = strList26.getClass();
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter6 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str7 = subscribeNewsletter6.getEmail();
        java.util.Date date8 = subscribeNewsletter6.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter11 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str12 = subscribeNewsletter11.getEmail();
        java.util.Date date13 = subscribeNewsletter11.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter14 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date8, date13);
        org.team4.functionality.buy.ItemPurchased itemPurchased15 = new org.team4.functionality.buy.ItemPurchased("User [email=, password=, name=hi!, type=, validated=false]", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", date13);
        java.lang.String str16 = itemPurchased15.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Tue Apr 30 19:21:59 EDT 2024");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Tue Apr 30 19:21:59 EDT 2024");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str16, "User [email=, password=, name=hi!, type=, validated=false]");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter8 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str9 = subscribeNewsletter8.getEmail();
        java.util.Date date10 = subscribeNewsletter8.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter13 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str14 = subscribeNewsletter13.getEmail();
        java.util.Date date15 = subscribeNewsletter13.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter16 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date10, date15);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter19 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter19.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter19.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter26 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date27 = null;
        subscribeNewsletter26.setDateSubscribed(date27);
        java.util.Date date29 = subscribeNewsletter26.getDateDue();
        subscribeNewsletter19.setDateDue(date29);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter31 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", date15, date29);
        java.util.Date date32 = subscribeNewsletter31.getDateDue();
        org.team4.functionality.buy.ItemPurchased itemPurchased33 = new org.team4.functionality.buy.ItemPurchased("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "", date32);
        java.lang.String str34 = itemPurchased33.getTitle();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Tue Apr 30 19:21:59 EDT 2024");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Tue Apr 30 19:21:59 EDT 2024");
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Tue Apr 30 19:21:59 EDT 2024");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 19:21:59 EDT 2024");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str34, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDBuilder2.quantity(10);
        org.team4.model.items.builder.DVDBuilder dVDBuilder8 = dVDBuilder2.genre("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.DVD dVD9 = dVDBuilder2.build();
        double double10 = dVD9.getDuration();
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDBuilder8);
        org.junit.Assert.assertNotNull(dVD9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        org.team4.model.user.Student student10 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str11 = student10.getType();
        course5.enrollStudent(student10);
        java.lang.String str13 = course5.getCourseName();
        java.lang.String str14 = course5.getCourseTextBookISBN();
        org.team4.model.user.Student student19 = new org.team4.model.user.Student("", "", "PayPal", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        boolean boolean20 = course5.isEnrolled(student19);
        java.util.Date date22 = null;
        java.util.Date date23 = null;
        org.team4.model.course.Course course26 = new org.team4.model.course.Course("hi!", date22, date23, "", "hi!");
        java.util.Date date27 = course26.getEndDate();
        java.lang.String str28 = course26.getProfessorEmail();
        java.lang.String str29 = course26.getProfessorEmail();
        org.team4.model.user.Student student34 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean35 = course26.isEnrolled(student34);
        course5.enrollStudent(student34);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder37 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder39 = courseTextBookBuilder37.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder41 = courseTextBookBuilder37.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder43 = courseTextBookBuilder37.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder45 = courseTextBookBuilder37.hasSoftCopy(true);
        org.team4.model.course.CourseTextBook courseTextBook46 = courseTextBookBuilder37.build();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder52 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder54 = courseTextBookBuilder52.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder56 = courseTextBookBuilder52.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder58 = courseTextBookBuilder52.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder60 = courseTextBookBuilder52.quantity((int) (short) 100);
        java.util.Date date62 = null;
        java.util.Date date63 = null;
        org.team4.model.course.Course course66 = new org.team4.model.course.Course("hi!", date62, date63, "", "hi!");
        java.util.Date date67 = course66.getEndDate();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder68 = courseTextBookBuilder52.course(course66);
        org.team4.model.user.Student student74 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str75 = student74.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase76 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student74);
        java.lang.String str77 = student74.toString();
        java.lang.String str78 = student74.getEmail();
        java.lang.String str79 = student74.toString();
        course66.enrollStudent(student74);
        org.team4.model.course.CourseTextBook courseTextBook82 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook46, "hi!", 52, "User [email=, password=, name=hi!, type=, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", (int) 'a', course66, false);
        org.team4.model.user.Student student87 = new org.team4.model.user.Student("", "", "hi!", "");
        java.util.ArrayList<java.lang.String> strList88 = student87.getCourses();
        courseTextBook82.makeCopies(student87);
        boolean boolean90 = course5.isEnrolled(student87);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(date27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(bookBuilder39);
        org.junit.Assert.assertNotNull(bookItemBuilder41);
        org.junit.Assert.assertNotNull(courseTextBookBuilder43);
        org.junit.Assert.assertNotNull(bookBuilder45);
        org.junit.Assert.assertNotNull(courseTextBook46);
        org.junit.Assert.assertNotNull(bookBuilder54);
        org.junit.Assert.assertNotNull(bookItemBuilder56);
        org.junit.Assert.assertNotNull(bookBuilder58);
        org.junit.Assert.assertNotNull(bookItemBuilder60);
        org.junit.Assert.assertNull(date67);
        org.junit.Assert.assertNotNull(courseTextBookBuilder68);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str77, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str79, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertNull(strList88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        boolean boolean1 = org.team4.utils.EmailValidator.validEmail("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}, type=hi!, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=Tue Apr 30 19:21:52 EDT 2024}", "User [email=hi!, password=hi!, name=hi!, type=, validated=false]", 9340338L);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("ItemPurchased{title='', email='hi!', datePurchased=null}", (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "User [email=, password=, name=hi!, type=, validated=false]", "");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal", "Credit Card", "");
        java.lang.String str5 = student4.getEmail();
        student4.setName("Credit Card");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str5, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator11 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        java.lang.String str12 = rentableItemDecorator11.getTitle();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.team4.functionality.buy.ItemPurchased itemPurchased2 = new org.team4.functionality.buy.ItemPurchased("Debit Card", "ItemToPurchase{item=null, user=User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemPurchased{title='', email='', datePurchased=null}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, validated=false], newsletter=null}");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.course.CourseTextBook courseTextBook7 = courseTextBookBuilder6.build();
        org.team4.model.items.Item item8 = new org.team4.model.items.Item((org.team4.model.items.Item) courseTextBook7);
        item8.setRentable(true);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(courseTextBook7);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter4 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str5 = subscribeNewsletter4.getEmail();
        subscribeNewsletter4.setTitle("hi!");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter10 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        java.util.Date date11 = subscribeNewsletter10.getDateSubscribed();
        subscribeNewsletter4.setDateDue(date11);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter15 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter15.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter15.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter22 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date23 = null;
        subscribeNewsletter22.setDateSubscribed(date23);
        java.util.Date date25 = subscribeNewsletter22.getDateDue();
        subscribeNewsletter15.setDateDue(date25);
        subscribeNewsletter4.setDateDue(date25);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter31 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str32 = subscribeNewsletter31.getEmail();
        subscribeNewsletter31.setTitle("hi!");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter37 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        java.util.Date date38 = subscribeNewsletter37.getDateSubscribed();
        subscribeNewsletter31.setDateDue(date38);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter42 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter42.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter42.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter49 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date50 = null;
        subscribeNewsletter49.setDateSubscribed(date50);
        java.util.Date date52 = subscribeNewsletter49.getDateDue();
        subscribeNewsletter42.setDateDue(date52);
        subscribeNewsletter31.setDateDue(date52);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter58 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str59 = subscribeNewsletter58.getTitle();
        java.util.Date date60 = null;
        subscribeNewsletter58.setDateSubscribed(date60);
        java.util.Date date62 = subscribeNewsletter58.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter67 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str68 = subscribeNewsletter67.getEmail();
        java.util.Date date69 = subscribeNewsletter67.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter72 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str73 = subscribeNewsletter72.getEmail();
        java.util.Date date74 = subscribeNewsletter72.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter75 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date69, date74);
        org.team4.model.course.Course course78 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date62, date74, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.model.course.Course course81 = new org.team4.model.course.Course("SubscribeNewsletter{title='Credit Card', email='hi!', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}", date52, date74, "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "PayPal");
        org.team4.model.items.RentedItem rentedItem82 = new org.team4.model.items.RentedItem("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "User [email=, password=, name=hi!, type=, validated=false]", date25, date74);
        java.util.Date date83 = rentedItem82.getRentDate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Sat Mar 30 19:21:59 EDT 2024");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Tue Apr 30 19:21:59 EDT 2024");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(date38);
// flaky:         org.junit.Assert.assertEquals(date38.toString(), "Sat Mar 30 19:21:59 EDT 2024");
        org.junit.Assert.assertNotNull(date52);
// flaky:         org.junit.Assert.assertEquals(date52.toString(), "Tue Apr 30 19:21:59 EDT 2024");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(date62);
// flaky:         org.junit.Assert.assertEquals(date62.toString(), "Tue Apr 30 19:21:59 EDT 2024");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertNotNull(date69);
// flaky:         org.junit.Assert.assertEquals(date69.toString(), "Tue Apr 30 19:21:59 EDT 2024");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertNotNull(date74);
// flaky:         org.junit.Assert.assertEquals(date74.toString(), "Tue Apr 30 19:21:59 EDT 2024");
        org.junit.Assert.assertNotNull(date83);
// flaky:         org.junit.Assert.assertEquals(date83.toString(), "Tue Apr 30 19:21:59 EDT 2024");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.team4.model.user.User user5 = new org.team4.model.user.User("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "Debit Card", "PayPal", true);
        user5.setPassword("ItemPurchased{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=null}', email='', datePurchased=Tue Apr 30 19:21:57 EDT 2024}");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = bookItemBuilder8.title("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = bookItemBuilder8.yearPublished((int) (byte) -1);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(bookItemBuilder12);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        org.team4.model.paymentmodes.MobileWallet mobileWallet6 = new org.team4.model.paymentmodes.MobileWallet("");
        org.team4.model.user.Student student12 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str13 = student12.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase14 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student12);
        org.team4.model.items.Newsletter newsletter15 = itemToPurchase14.getNewsletter();
        org.team4.functionality.buy.ProcessPayment processPayment16 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet6, itemToPurchase14);
        boolean boolean17 = dVD1.equals((java.lang.Object) processPayment16);
        org.team4.model.items.DVD dVD20 = new org.team4.model.items.DVD((org.team4.model.items.Item) dVD1, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", (double) '#');
        org.team4.model.items.decorator.ItemDecorator itemDecorator21 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) dVD1);
        java.lang.String str22 = dVD1.getGenre();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("Credit Card", "PayPal{email='Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}", "");
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.yearPublished((int) (short) -1);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder8 = magazineBuilder0.publisher("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder10 = magazineBuilder8.quantity((int) (byte) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder12 = magazineBuilder8.quantity((int) (byte) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder14 = magazineBuilder8.price((double) 1.0f);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder16 = magazineItemBuilder14.ISBN("User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder18 = magazineItemBuilder16.title("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder20 = magazineItemBuilder18.ISBN("PayPal");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineBuilder8);
        org.junit.Assert.assertNotNull(magazineItemBuilder10);
        org.junit.Assert.assertNotNull(magazineItemBuilder12);
        org.junit.Assert.assertNotNull(magazineItemBuilder14);
        org.junit.Assert.assertNotNull(magazineItemBuilder16);
        org.junit.Assert.assertNotNull(magazineItemBuilder18);
        org.junit.Assert.assertNotNull(magazineItemBuilder20);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        java.util.Date date3 = subscribeNewsletter2.getDateSubscribed();
        java.util.Date date4 = subscribeNewsletter2.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter7 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str8 = subscribeNewsletter7.getTitle();
        java.util.Date date9 = null;
        subscribeNewsletter7.setDateSubscribed(date9);
        java.util.Date date11 = subscribeNewsletter7.getDateDue();
        subscribeNewsletter2.setDateSubscribed(date11);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter21 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str22 = subscribeNewsletter21.getEmail();
        java.util.Date date23 = subscribeNewsletter21.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter26 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str27 = subscribeNewsletter26.getEmail();
        java.util.Date date28 = subscribeNewsletter26.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter29 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date23, date28);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter32 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter32.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter32.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter39 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date40 = null;
        subscribeNewsletter39.setDateSubscribed(date40);
        java.util.Date date42 = subscribeNewsletter39.getDateDue();
        subscribeNewsletter32.setDateDue(date42);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter44 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", date28, date42);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter47 = new org.team4.functionality.subscriptions.SubscribeNewsletter("User [email=, password=, name=hi!, type=, validated=false]", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter50 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str51 = subscribeNewsletter50.getTitle();
        java.util.Date date52 = subscribeNewsletter50.getDateDue();
        subscribeNewsletter47.setDateSubscribed(date52);
        org.team4.model.items.RentedItem rentedItem54 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='', datePurchased=null}", "", date42, date52);
        subscribeNewsletter2.setDateSubscribed(date52);
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Sat Mar 30 19:21:59 EDT 2024");
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Tue Apr 30 19:21:59 EDT 2024");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Apr 30 19:21:59 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 19:21:59 EDT 2024");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Tue Apr 30 19:21:59 EDT 2024");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 19:21:59 EDT 2024");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(date52);
// flaky:         org.junit.Assert.assertEquals(date52.toString(), "Tue Apr 30 19:21:59 EDT 2024");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemPurchased{title='', email='', datePurchased=null}", "", "User [email=, password=, name=hi!, type=, validated=false]");
        java.lang.String str5 = faculty4.getPassword();
        faculty4.setPassword("SubscribeNewsletter{title='Credit Card', email='hi!', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str5, "ItemPurchased{title='', email='', datePurchased=null}");
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str3 = subscribeNewsletter2.getTitle();
        java.lang.String str4 = subscribeNewsletter2.toString();
        java.lang.String str5 = subscribeNewsletter2.getTitle();
        java.lang.String str6 = subscribeNewsletter2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:59 EDT 2024, dateDue=Tue Apr 30 19:21:59 EDT 2024}" + "'", str4, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:59 EDT 2024, dateDue=Tue Apr 30 19:21:59 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook8 = courseTextBookBuilder6.build();
        org.team4.model.course.Course course9 = courseTextBook8.getCourse();
        java.util.List<org.team4.model.user.Student> studentList10 = courseTextBook8.getStudentsWithCopies();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertNull(course9);
        org.junit.Assert.assertNotNull(studentList10);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("", "Debit Card", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:55 EDT 2024, dateDue=Tue Apr 30 19:21:55 EDT 2024}", "ItemToPurchase{item=null, user=User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemPurchased{title='', email='', datePurchased=null}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, validated=false], newsletter=null}");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("User [email=, password=, name=hi!, type=hi!, validated=false]", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "", "User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}, type=hi!, validated=false]", (long) ' ');
        boolean boolean6 = manager5.isValidated();
        long long7 = manager5.getManagerID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder6 = magazineBuilder0.issueNumber((int) (byte) 0);
        org.team4.model.items.Magazine magazine7 = magazineBuilder0.build();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder9 = magazineBuilder0.issueNumber(32);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder11 = magazineBuilder0.publisher("ItemToPurchase{item=null, user=User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemPurchased{title='', email='', datePurchased=null}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineBuilder6);
        org.junit.Assert.assertNotNull(magazine7);
        org.junit.Assert.assertNotNull(magazineBuilder9);
        org.junit.Assert.assertNotNull(magazineBuilder11);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "PayPal{email='Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", (int) (byte) 1, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:59 EDT 2024, dateDue=Tue Apr 30 19:21:59 EDT 2024}");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "Mobile Wallet", "Course [course name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, start date=Tue Apr 30 19:21:54 EDT 2024, end date=Tue Apr 30 19:21:54 EDT 2024, ISBN=ItemPurchased{title='', email='hi!', datePurchased=null}, email=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDBuilder2.quantity(10);
        org.team4.model.items.builder.DVDBuilder dVDBuilder8 = dVDBuilder2.genre("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder10 = dVDBuilder8.duration((double) 0);
        org.team4.model.items.builder.DVDBuilder dVDBuilder12 = dVDBuilder10.genre("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:57 EDT 2024, dateDue=Tue Apr 30 19:21:57 EDT 2024}");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDBuilder8);
        org.junit.Assert.assertNotNull(dVDBuilder10);
        org.junit.Assert.assertNotNull(dVDBuilder12);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.price((double) (short) 10);
        org.team4.model.items.Book book5 = courseTextBookBuilder0.build();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) book5);
        book5.setPrice((-1.0d));
        boolean boolean9 = book5.hasHardCopy();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        dVD1.setQuantity((int) (short) 1);
        dVD1.setQuantity((int) ' ');
        boolean boolean9 = dVD1.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD1);
        org.team4.model.items.Item item11 = rentableItemDecorator10.getItem();
        org.team4.model.items.Item item12 = new org.team4.model.items.Item(item11);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter21 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str22 = subscribeNewsletter21.getTitle();
        java.util.Date date23 = null;
        subscribeNewsletter21.setDateSubscribed(date23);
        java.util.Date date25 = subscribeNewsletter21.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter30 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str31 = subscribeNewsletter30.getEmail();
        java.util.Date date32 = subscribeNewsletter30.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter35 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str36 = subscribeNewsletter35.getEmail();
        java.util.Date date37 = subscribeNewsletter35.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter38 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date32, date37);
        org.team4.model.course.Course course41 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date25, date37, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.model.course.CourseTextBook courseTextBook43 = new org.team4.model.course.CourseTextBook(item12, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", (int) (short) 1, "hi!", "PayPal", 52, course41, false);
        org.team4.model.course.Course course44 = courseTextBook43.getCourse();
        org.team4.model.course.Course course45 = courseTextBook43.getCourse();
        org.team4.model.user.Visitor visitor50 = new org.team4.model.user.Visitor("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "");
        boolean boolean51 = courseTextBook43.equals((java.lang.Object) "");
        org.team4.model.user.Student student56 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str57 = student56.getType();
        org.team4.model.user.Student student62 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str63 = student62.getType();
        java.lang.String[] strArray65 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        student62.setCourses(strList66);
        student56.setCourses(strList66);
        java.lang.String str70 = student56.getEmail();
        courseTextBook43.removeCopies(student56);
        student56.setPassword("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Tue Apr 30 19:21:59 EDT 2024");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 19:21:59 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 19:21:59 EDT 2024");
        org.junit.Assert.assertNotNull(course44);
        org.junit.Assert.assertNotNull(course45);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.lang.String str6 = course5.getProfessorEmail();
        java.util.Date date7 = course5.getStartDate();
        org.team4.model.user.Student student12 = new org.team4.model.user.Student("", "", "hi!", "");
        student12.setEmail("");
        boolean boolean15 = course5.isEnrolled(student12);
        java.util.Date date16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = course5.isEnded(date16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.after(java.util.Date)\" because \"currentDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.yearPublished((int) (short) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder8 = magazineBuilder0.issueNumber(100);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder10 = magazineBuilder8.publisher("Debit Card");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder12 = magazineBuilder8.price((double) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder14 = magazineItemBuilder12.ISBN("");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineBuilder8);
        org.junit.Assert.assertNotNull(magazineBuilder10);
        org.junit.Assert.assertNotNull(magazineItemBuilder12);
        org.junit.Assert.assertNotNull(magazineItemBuilder14);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.email("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.booktype("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder6.edition((int) '#');
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder10 = bookRequestBuilder8.edition((int) (short) 0);
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
        org.junit.Assert.assertNotNull(bookRequestBuilder10);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.paymentmodes.CreditCard creditCard10 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) creditCard10);
        org.team4.model.items.Item item12 = itemToPurchase6.getItem();
        double double13 = itemToPurchase6.getAmount();
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder6.quantity((-1));
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = courseTextBookBuilder6.price((double) 100L);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder14 = courseTextBookBuilder6.isVirtual(false);
        org.team4.model.course.CourseTextBook courseTextBook15 = courseTextBookBuilder6.build();
        java.lang.String str16 = courseTextBook15.getTitle();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(bookItemBuilder12);
        org.junit.Assert.assertNotNull(courseTextBookBuilder14);
        org.junit.Assert.assertNotNull(courseTextBook15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        java.util.ArrayList<java.lang.String> strList5 = null;
        org.team4.model.user.Faculty faculty6 = new org.team4.model.user.Faculty("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "", "ItemPurchased{title='', email='hi!', datePurchased=null}", (long) (short) -1, strList5);
        long long7 = faculty6.getFacultyID();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.DVD dVD3 = dVDBuilder0.build();
        double double4 = dVD3.getDuration();
        org.team4.model.course.Course course10 = null;
        org.team4.model.course.CourseTextBook courseTextBook12 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) dVD3, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", (int) '#', "", "ItemPurchased{title='', email='', datePurchased=null}", (int) (short) -1, course10, true);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator13 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) dVD3);
        boolean boolean14 = purchasableItemDecorator13.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator15 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) purchasableItemDecorator13);
        boolean boolean16 = purchasableItemDecorator13.isPurchasable();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator17 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) purchasableItemDecorator13);
        boolean boolean18 = purchasableItemDecorator13.isPurchasable();
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVD3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder0.ISBN("ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}");
        org.team4.model.items.BookRequest bookRequest5 = bookRequestBuilder4.build();
        org.team4.model.items.BookRequest bookRequest6 = bookRequestBuilder4.build();
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequest5);
        org.junit.Assert.assertNotNull(bookRequest6);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder6 = magazineBuilder0.issueNumber((int) (byte) 0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineBuilder0.price((double) 5930499L);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=User [email=, password=, name=hi!, type=, validated=false], name=hi!, type=PayPal, validated=true]", "SubscribeNewsletter{title='Credit Card', email='hi!', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}", "User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}, type=hi!, validated=false]");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.team4.model.user.UserFactory userFactory0 = new org.team4.model.user.UserFactory();
        org.team4.model.user.User user6 = userFactory0.getUser("User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "Credit Card", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", false);
        org.team4.model.user.User user12 = userFactory0.getUser("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}", "", "PayPal", "SubscribeNewsletter{title='ItemPurchased{title='', email='', datePurchased=null}', email='', dateSubscribed=Tue Apr 30 19:21:58 EDT 2024, dateDue=Tue Apr 30 19:21:58 EDT 2024}", true);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "ItemPurchased{title='', email='', datePurchased=null}", "SubscribeNewsletter{title='Credit Card', email='hi!', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}", true);
        boolean boolean6 = faculty5.isValidated();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.ISBN("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDBuilder0.quantity((int) ' ');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDItemBuilder6.ISBN("User [email=, password=hi!, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=, validated=false]");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDItemBuilder4.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDItemBuilder6.quantity((int) (short) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder10 = dVDItemBuilder8.price((double) 7527390L);
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
        org.junit.Assert.assertNotNull(dVDItemBuilder10);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.model.user.Student student11 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str12 = student11.getType();
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        student11.setCourses(strList15);
        student5.setCourses(strList15);
        java.lang.String str19 = student5.getEmail();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase20 = new org.team4.functionality.buy.ItemToPurchase((double) 100L, (org.team4.model.user.User) student5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter7 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str8 = subscribeNewsletter7.getTitle();
        java.util.Date date9 = null;
        subscribeNewsletter7.setDateSubscribed(date9);
        java.util.Date date11 = subscribeNewsletter7.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter16 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str17 = subscribeNewsletter16.getEmail();
        java.util.Date date18 = subscribeNewsletter16.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter21 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str22 = subscribeNewsletter21.getEmail();
        java.util.Date date23 = subscribeNewsletter21.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter24 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date18, date23);
        org.team4.model.course.Course course27 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date11, date23, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.functionality.buy.ItemPurchased itemPurchased28 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", date23);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter35 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str36 = subscribeNewsletter35.getEmail();
        java.util.Date date37 = subscribeNewsletter35.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter40 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str41 = subscribeNewsletter40.getEmail();
        java.util.Date date42 = subscribeNewsletter40.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter43 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date37, date42);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter46 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter46.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter46.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter53 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date54 = null;
        subscribeNewsletter53.setDateSubscribed(date54);
        java.util.Date date56 = subscribeNewsletter53.getDateDue();
        subscribeNewsletter46.setDateDue(date56);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter58 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", date42, date56);
        org.team4.model.items.RentedItem rentedItem59 = new org.team4.model.items.RentedItem("User [email=, password=, name=hi!, type=, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date23, date56);
        java.lang.String str60 = rentedItem59.getISBN();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter63 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter63.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter63.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter70 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date71 = null;
        subscribeNewsletter70.setDateSubscribed(date71);
        java.util.Date date73 = subscribeNewsletter70.getDateDue();
        subscribeNewsletter63.setDateDue(date73);
        rentedItem59.setDueDate(date73);
        java.lang.String str76 = rentedItem59.getISBN();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Apr 30 19:22:00 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Tue Apr 30 19:22:00 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 19:22:00 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 19:22:00 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 19:22:00 EDT 2024");
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Tue Apr 30 19:22:00 EDT 2024");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str60, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(date73);
// flaky:         org.junit.Assert.assertEquals(date73.toString(), "Tue Apr 30 19:22:00 EDT 2024");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str76, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.team4.model.user.UserFactory userFactory0 = new org.team4.model.user.UserFactory();
        org.team4.model.user.User user6 = userFactory0.getUser("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", false);
        org.team4.model.user.User user12 = userFactory0.getUser("ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}", "Credit Card", "User [email=, password=, name=hi!, type=, validated=false]", "ItemPurchased{title='', email='', datePurchased=null}", true);
        org.team4.model.user.User user18 = userFactory0.getUser("User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}, type=hi!, validated=false]", "User [email=, password=hi!, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}", "SubscribeNewsletter{title='Credit Card', email='hi!', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}", false);
        org.team4.model.user.User user24 = userFactory0.getUser("PayPal{email='Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}'}", "SubscribeNewsletter{title='ItemPurchased{title='', email='', datePurchased=null}', email='', dateSubscribed=Tue Apr 30 19:21:58 EDT 2024, dateDue=Tue Apr 30 19:21:58 EDT 2024}", "", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}", false);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(user24);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        dVD1.setQuantity((int) (short) 1);
        dVD1.setQuantity((int) ' ');
        boolean boolean9 = dVD1.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD1);
        org.team4.model.items.Item item11 = rentableItemDecorator10.getItem();
        org.team4.model.items.Item item12 = new org.team4.model.items.Item(item11);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter21 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str22 = subscribeNewsletter21.getTitle();
        java.util.Date date23 = null;
        subscribeNewsletter21.setDateSubscribed(date23);
        java.util.Date date25 = subscribeNewsletter21.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter30 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str31 = subscribeNewsletter30.getEmail();
        java.util.Date date32 = subscribeNewsletter30.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter35 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str36 = subscribeNewsletter35.getEmail();
        java.util.Date date37 = subscribeNewsletter35.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter38 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date32, date37);
        org.team4.model.course.Course course41 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date25, date37, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.model.course.CourseTextBook courseTextBook43 = new org.team4.model.course.CourseTextBook(item12, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", (int) (short) 1, "hi!", "PayPal", 52, course41, false);
        org.team4.model.course.Course course44 = courseTextBook43.getCourse();
        org.team4.model.course.Course course45 = courseTextBook43.getCourse();
        org.team4.model.items.Book book53 = new org.team4.model.items.Book((org.team4.model.items.Item) courseTextBook43, "User [email=User [email=, password=, name=hi!, type=, validated=false], password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=, validated=false]", 10, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=null}", (int) (short) -1, false, false);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Tue Apr 30 19:22:00 EDT 2024");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 19:22:00 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 19:22:00 EDT 2024");
        org.junit.Assert.assertNotNull(course44);
        org.junit.Assert.assertNotNull(course45);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        org.team4.model.paymentmodes.MobileWallet mobileWallet6 = new org.team4.model.paymentmodes.MobileWallet("");
        org.team4.model.user.Student student12 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str13 = student12.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase14 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student12);
        org.team4.model.items.Newsletter newsletter15 = itemToPurchase14.getNewsletter();
        org.team4.functionality.buy.ProcessPayment processPayment16 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet6, itemToPurchase14);
        boolean boolean17 = dVD1.equals((java.lang.Object) processPayment16);
        org.team4.model.items.DVD dVD20 = new org.team4.model.items.DVD((org.team4.model.items.Item) dVD1, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", (double) '#');
        java.lang.String str21 = dVD1.getISBN();
        java.lang.String str22 = dVD1.getGenre();
        double double23 = dVD1.getPrice();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}, type=hi!, validated=false]", (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}, type=hi!, validated=false]", "ItemToPurchase{item=Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}, user=User [email=, password=, name=hi!, type=hi!, validated=false], newsletter=null}", "");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.Magazine magazine5 = magazineBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder7 = magazineBuilder0.quantity((int) (byte) 1);
        org.team4.model.items.Magazine magazine8 = magazineBuilder0.build();
        java.lang.String str9 = magazine8.getPublisher();
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazine5);
        org.junit.Assert.assertNotNull(magazineItemBuilder7);
        org.junit.Assert.assertNotNull(magazine8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        boolean boolean8 = book7.hasHardCopy();
        boolean boolean9 = book7.hasSoftCopy();
        java.lang.String str10 = book7.getGenre();
        book7.setPurchaseable(true);
        boolean boolean13 = book7.isRentable();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getEndDate();
        java.lang.String str7 = course5.getProfessorEmail();
        java.lang.String str8 = course5.getProfessorEmail();
        org.team4.model.user.Student student13 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean14 = course5.isEnrolled(student13);
        java.util.ArrayList<java.lang.String> strList15 = student13.getCourses();
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strList15);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("PayPal", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "hi!", "ItemToPurchase{item=null, user=User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemPurchased{title='', email='', datePurchased=null}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, validated=false], newsletter=null}");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter2.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter2.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter9 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date10 = null;
        subscribeNewsletter9.setDateSubscribed(date10);
        java.util.Date date12 = subscribeNewsletter9.getDateDue();
        subscribeNewsletter2.setDateDue(date12);
        java.util.Date date14 = subscribeNewsletter2.getDateSubscribed();
        java.util.Date date15 = null;
        subscribeNewsletter2.setDateSubscribed(date15);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Tue Apr 30 19:22:00 EDT 2024");
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Sat Mar 30 19:22:00 EDT 2024");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        org.team4.model.paymentmodes.CreditCard creditCard14 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        boolean boolean15 = creditCard14.notExpired();
        boolean boolean16 = creditCard14.isValid();
        boolean boolean17 = creditCard14.isValid();
        boolean boolean18 = book9.equals((java.lang.Object) creditCard14);
        book9.setQuantity((-1));
        org.team4.model.items.builder.DVDBuilder dVDBuilder21 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder23 = dVDBuilder21.genre("PayPal");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder25 = dVDBuilder21.ISBN("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder27 = dVDBuilder21.genre("");
        boolean boolean28 = book9.equals((java.lang.Object) dVDBuilder27);
        org.team4.model.items.Item item29 = new org.team4.model.items.Item((org.team4.model.items.Item) book9);
        java.lang.String str30 = book9.getPublisher();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dVDBuilder23);
        org.junit.Assert.assertNotNull(dVDItemBuilder25);
        org.junit.Assert.assertNotNull(dVDBuilder27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.team4.model.items.Item item0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.items.DVD dVD3 = new org.team4.model.items.DVD(item0, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=null}", (double) 7669103L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"title\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=null}", "", true);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}", true);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.team4.model.user.User user4 = new org.team4.model.user.User("", "User [email=hi!, password=hi!, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='ItemPurchased{title='', email='', datePurchased=null}', email='', dateSubscribed=Tue Apr 30 19:21:58 EDT 2024, dateDue=Tue Apr 30 19:21:58 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}", (long) (short) -1);
        nonFaculty5.setUniversityID((-1L));
        nonFaculty5.setUniversityID((long) (short) -1);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.DVD dVD10 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Credit Card", 0.0d);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator11 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD10);
        rentableItemDecorator11.setPrice((double) (byte) 1);
        org.team4.model.items.Item item14 = rentableItemDecorator11.getItem();
        java.lang.String str15 = item14.getISBN();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(item14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.team4.model.user.Student student23 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str24 = student23.getType();
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        student23.setCourses(strList27);
        org.team4.model.user.Faculty faculty30 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", (long) (byte) -1, strList27);
        java.util.ArrayList<java.lang.String> strList31 = faculty30.getCourses();
        java.util.ArrayList<java.lang.String> strList32 = faculty30.getCourses();
        org.team4.model.user.Faculty faculty33 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", (long) '4', strList32);
        org.team4.model.user.Student student34 = new org.team4.model.user.Student("", "ItemToPurchase{item=Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}, user=User [email=, password=, name=hi!, type=hi!, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", strList32);
        org.team4.model.user.Faculty faculty35 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=Tue Apr 30 19:21:52 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemToPurchase{item=Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}, user=User [email=, password=, name=hi!, type=hi!, validated=false], newsletter=null}", (-1L), strList32);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(strList32);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        org.team4.model.user.Visitor visitor7 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase8 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor7);
        org.team4.model.paymentmodes.CreditCard creditCard12 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete13 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase8, (org.team4.model.paymentmodes.PaymentValidator) creditCard12);
        org.team4.functionality.buy.ProcessPayment processPayment14 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet1, itemToPurchase8);
        org.team4.model.user.User user15 = itemToPurchase8.getUser();
        java.util.Date date18 = null;
        java.util.Date date19 = null;
        org.team4.model.course.Course course22 = new org.team4.model.course.Course("hi!", date18, date19, "", "hi!");
        java.util.Date date23 = course22.getEndDate();
        java.lang.String str24 = course22.getProfessorEmail();
        java.lang.String str25 = course22.getProfessorEmail();
        org.team4.model.user.Student student30 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean31 = course22.isEnrolled(student30);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase32 = new org.team4.functionality.buy.ItemToPurchase(100.0d, (org.team4.model.user.User) student30);
        org.team4.model.paymentmodes.PayPal payPal34 = new org.team4.model.paymentmodes.PayPal("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        boolean boolean35 = payPal34.isValid();
        java.lang.String str36 = payPal34.toString();
        boolean boolean37 = payPal34.isValid();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete38 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase32, (org.team4.model.paymentmodes.PaymentValidator) payPal34);
        java.lang.String str39 = payPal34.getMode();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete40 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase8, (org.team4.model.paymentmodes.PaymentValidator) payPal34);
        java.lang.String str41 = payPal34.getMode();
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNull(date23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}" + "'", str36, "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Mobile Wallet" + "'", str39, "Mobile Wallet");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Mobile Wallet" + "'", str41, "Mobile Wallet");
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        nonFaculty4.setValidated(false);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder15 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder17 = courseTextBookBuilder15.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder19 = courseTextBookBuilder15.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder21 = courseTextBookBuilder15.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder23 = courseTextBookBuilder15.quantity((int) (short) 100);
        java.util.Date date25 = null;
        java.util.Date date26 = null;
        org.team4.model.course.Course course29 = new org.team4.model.course.Course("hi!", date25, date26, "", "hi!");
        java.util.Date date30 = course29.getEndDate();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder31 = courseTextBookBuilder15.course(course29);
        org.team4.model.user.Student student37 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str38 = student37.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase39 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student37);
        java.lang.String str40 = student37.toString();
        java.lang.String str41 = student37.getEmail();
        java.lang.String str42 = student37.toString();
        course29.enrollStudent(student37);
        org.team4.model.course.CourseTextBook courseTextBook45 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook9, "hi!", 52, "User [email=, password=, name=hi!, type=, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", (int) 'a', course29, false);
        org.team4.model.user.Student student50 = new org.team4.model.user.Student("", "", "hi!", "");
        java.util.ArrayList<java.lang.String> strList51 = student50.getCourses();
        courseTextBook45.makeCopies(student50);
        java.util.List<org.team4.model.user.Student> studentList53 = courseTextBook45.getStudentsWithCopies();
        courseTextBook45.setPurchaseable(true);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(courseTextBook9);
        org.junit.Assert.assertNotNull(bookBuilder17);
        org.junit.Assert.assertNotNull(bookItemBuilder19);
        org.junit.Assert.assertNotNull(bookBuilder21);
        org.junit.Assert.assertNotNull(bookItemBuilder23);
        org.junit.Assert.assertNull(date30);
        org.junit.Assert.assertNotNull(courseTextBookBuilder31);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str40, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str42, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertNull(strList51);
        org.junit.Assert.assertNotNull(studentList53);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='Credit Card', email='hi!', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}", "User [email=, password=hi!, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=, validated=false]", "User [email=, password=, name=hi!, type=, validated=false]", 576139L);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        boolean boolean8 = book7.hasHardCopy();
        boolean boolean9 = book7.isPurchasable();
        org.team4.model.items.DVD dVD12 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Mobile Wallet", 0.0d);
        java.lang.String str13 = dVD12.getGenre();
        double double14 = dVD12.getPrice();
        dVD12.setPurchaseable(false);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Mobile Wallet" + "'", str13, "Mobile Wallet");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}'}", "User [email=User [email=, password=, name=hi!, type=, validated=false], password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=, validated=false]", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", 9396435L);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        org.team4.model.items.Book book5 = courseTextBookBuilder0.build();
        book5.setQuantity((int) (short) 0);
        org.team4.model.items.DVD dVD10 = new org.team4.model.items.DVD((org.team4.model.items.Item) book5, "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", (double) (-1L));
        org.team4.model.user.User user15 = new org.team4.model.user.User("", "hi!", "PayPal", "");
        user15.setType("ItemPurchased{title='', email='', datePurchased=null}");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase18 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) dVD10, user15);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(book5);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("hi!", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "User [email=hi!, password=hi!, name=hi!, type=, validated=false]", "PayPal", 0, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        java.lang.String str7 = bookRequest6.getBookType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str7, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase2 = null;
        org.team4.functionality.buy.ProcessPayment processPayment3 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet1, itemToPurchase2);
        boolean boolean4 = mobileWallet1.isValid();
        boolean boolean5 = mobileWallet1.isValid();
        java.lang.String str6 = mobileWallet1.getMode();
        java.lang.String str7 = mobileWallet1.getMode();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PayPal" + "'", str6, "PayPal");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PayPal" + "'", str7, "PayPal");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.DVD dVD10 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Credit Card", 0.0d);
        java.lang.String str11 = book7.getGenre();
        java.lang.String str12 = book7.getTitle();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.Magazine magazine5 = magazineBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder7 = magazineBuilder0.quantity((int) (byte) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder9 = magazineItemBuilder7.title("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:59 EDT 2024, dateDue=Tue Apr 30 19:21:59 EDT 2024}");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazine5);
        org.junit.Assert.assertNotNull(magazineItemBuilder7);
        org.junit.Assert.assertNotNull(magazineItemBuilder9);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        java.lang.String str4 = magazine3.getPublisher();
        int int5 = magazine3.getIssueNumber();
        java.lang.String str6 = magazine3.getPublisher();
        magazine3.setPurchaseable(true);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.quantity((int) (byte) -1);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", 0.0d);
        java.lang.String str4 = newsletter3.getTitle();
        org.team4.model.items.builder.DVDBuilder dVDBuilder5 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD6 = dVDBuilder5.build();
        java.lang.String str7 = dVD6.getGenre();
        boolean boolean8 = dVD6.isPurchasable();
        double double9 = dVD6.getDuration();
        dVD6.setQuantity((int) (short) 1);
        dVD6.setQuantity((int) ' ');
        boolean boolean14 = dVD6.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator15 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD6);
        org.team4.model.items.Item item16 = rentableItemDecorator15.getItem();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator17 = new org.team4.model.items.decorator.PurchasableItemDecorator(item16);
        org.team4.model.user.Manager manager23 = new org.team4.model.user.Manager("", "", "", "hi!", false);
        manager23.setValidated(false);
        manager23.setName("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase28 = new org.team4.functionality.buy.ItemToPurchase(item16, (org.team4.model.user.User) manager23);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase29 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) manager23);
        org.team4.model.user.Manager manager35 = new org.team4.model.user.Manager("ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "hi!", "Credit Card", false);
        manager35.setPassword("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase38 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) manager35);
        manager35.setType("Course [course name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, start date=Tue Apr 30 19:21:54 EDT 2024, end date=Tue Apr 30 19:21:54 EDT 2024, ISBN=ItemPurchased{title='', email='hi!', datePurchased=null}, email=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}]");
        manager35.setValidated(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(dVD6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(item16);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder8 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder8.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = courseTextBookBuilder8.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder14 = courseTextBookBuilder8.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder16 = courseTextBookBuilder8.price((double) (-1L));
        org.team4.model.items.builder.BookBuilder bookBuilder18 = courseTextBookBuilder8.publisher("hi!");
        boolean boolean19 = book7.equals((java.lang.Object) bookBuilder18);
        java.util.Date date26 = null;
        java.util.Date date27 = null;
        org.team4.model.course.Course course30 = new org.team4.model.course.Course("hi!", date26, date27, "", "hi!");
        org.team4.model.user.Student student35 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str36 = student35.getType();
        course30.enrollStudent(student35);
        java.lang.String str38 = course30.getCourseName();
        java.lang.String str39 = course30.getCourseTextBookISBN();
        org.team4.model.course.CourseTextBook courseTextBook41 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) book7, "PayPal", (int) ' ', "ItemPurchased{title='', email='', datePurchased=null}", "Credit Card", (int) (short) 100, course30, true);
        java.util.Date date43 = null;
        java.util.Date date44 = null;
        org.team4.model.course.Course course47 = new org.team4.model.course.Course("hi!", date43, date44, "", "hi!");
        org.team4.model.user.Student student52 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str53 = student52.getType();
        course47.enrollStudent(student52);
        java.lang.String str55 = course47.getCourseName();
        java.lang.String str56 = course47.getCourseTextBookISBN();
        org.team4.model.user.Student student61 = new org.team4.model.user.Student("", "", "PayPal", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        boolean boolean62 = course47.isEnrolled(student61);
        course30.enrollStudent(student61);
        java.lang.String str64 = course30.getProfessorEmail();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str65 = course30.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.toString()\" because \"this.startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(bookItemBuilder12);
        org.junit.Assert.assertNotNull(bookBuilder14);
        org.junit.Assert.assertNotNull(bookItemBuilder16);
        org.junit.Assert.assertNotNull(bookBuilder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.course.Course course6 = new org.team4.model.course.Course("hi!", date2, date3, "", "hi!");
        java.util.Date date7 = course6.getEndDate();
        java.lang.String str8 = course6.getProfessorEmail();
        java.lang.String str9 = course6.getProfessorEmail();
        org.team4.model.user.Student student14 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean15 = course6.isEnrolled(student14);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase16 = new org.team4.functionality.buy.ItemToPurchase(100.0d, (org.team4.model.user.User) student14);
        org.team4.model.paymentmodes.PayPal payPal18 = new org.team4.model.paymentmodes.PayPal("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        boolean boolean19 = payPal18.isValid();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete20 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase16, (org.team4.model.paymentmodes.PaymentValidator) payPal18);
        java.lang.String str21 = itemToPurchase16.toString();
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}" + "'", str21, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}", (long) (short) -1);
        long long6 = nonFaculty5.getUniversityID();
        nonFaculty5.setPassword("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("User [email=, password=, name=hi!, type=, validated=false]", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        subscribeNewsletter2.setEmail("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.title("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder0.email("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder5.title("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder9 = bookRequestBuilder7.booktype("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder11 = bookRequestBuilder9.email("PayPal{email='ItemPurchased{title='', email='hi!', datePurchased=null}'}");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
        org.junit.Assert.assertNotNull(bookRequestBuilder9);
        org.junit.Assert.assertNotNull(bookRequestBuilder11);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter7 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str8 = subscribeNewsletter7.getTitle();
        java.util.Date date9 = null;
        subscribeNewsletter7.setDateSubscribed(date9);
        java.util.Date date11 = subscribeNewsletter7.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter16 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str17 = subscribeNewsletter16.getEmail();
        java.util.Date date18 = subscribeNewsletter16.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter21 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str22 = subscribeNewsletter21.getEmail();
        java.util.Date date23 = subscribeNewsletter21.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter24 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date18, date23);
        org.team4.model.course.Course course27 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date11, date23, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.functionality.buy.ItemPurchased itemPurchased28 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", date23);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter35 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str36 = subscribeNewsletter35.getEmail();
        java.util.Date date37 = subscribeNewsletter35.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter40 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str41 = subscribeNewsletter40.getEmail();
        java.util.Date date42 = subscribeNewsletter40.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter43 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date37, date42);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter46 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter46.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter46.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter53 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date54 = null;
        subscribeNewsletter53.setDateSubscribed(date54);
        java.util.Date date56 = subscribeNewsletter53.getDateDue();
        subscribeNewsletter46.setDateDue(date56);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter58 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", date42, date56);
        org.team4.model.items.RentedItem rentedItem59 = new org.team4.model.items.RentedItem("User [email=, password=, name=hi!, type=, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date23, date56);
        java.lang.String str60 = rentedItem59.getISBN();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter63 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter63.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter63.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter70 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date71 = null;
        subscribeNewsletter70.setDateSubscribed(date71);
        java.util.Date date73 = subscribeNewsletter70.getDateDue();
        subscribeNewsletter63.setDateDue(date73);
        rentedItem59.setDueDate(date73);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter78 = new org.team4.functionality.subscriptions.SubscribeNewsletter("User [email=, password=, name=hi!, type=, validated=false]", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter81 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str82 = subscribeNewsletter81.getTitle();
        java.util.Date date83 = subscribeNewsletter81.getDateDue();
        subscribeNewsletter78.setDateSubscribed(date83);
        rentedItem59.setDueDate(date83);
        rentedItem59.setTitle("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        java.lang.String str88 = rentedItem59.getISBN();
        rentedItem59.setTitle("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Apr 30 19:22:00 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Tue Apr 30 19:22:00 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 19:22:00 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 19:22:00 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 19:22:00 EDT 2024");
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Tue Apr 30 19:22:00 EDT 2024");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str60, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(date73);
// flaky:         org.junit.Assert.assertEquals(date73.toString(), "Tue Apr 30 19:22:00 EDT 2024");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertNotNull(date83);
// flaky:         org.junit.Assert.assertEquals(date83.toString(), "Tue Apr 30 19:22:00 EDT 2024");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str88, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.team4.model.user.Student student9 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str10 = student9.getType();
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        student9.setCourses(strList13);
        org.team4.model.user.Faculty faculty16 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", (long) (byte) -1, strList13);
        java.util.ArrayList<java.lang.String> strList17 = faculty16.getCourses();
        faculty16.setValidated(false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.quantity((int) (short) 100);
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder0.build();
        java.lang.String str10 = courseTextBook9.getTitle();
        org.team4.model.items.DVD dVD13 = new org.team4.model.items.DVD((org.team4.model.items.Item) courseTextBook9, "PayPal", (double) 2403102L);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(courseTextBook9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        org.team4.model.paymentmodes.MobileWallet mobileWallet6 = new org.team4.model.paymentmodes.MobileWallet("");
        org.team4.model.user.Student student12 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str13 = student12.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase14 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student12);
        org.team4.model.items.Newsletter newsletter15 = itemToPurchase14.getNewsletter();
        org.team4.functionality.buy.ProcessPayment processPayment16 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet6, itemToPurchase14);
        boolean boolean17 = dVD1.equals((java.lang.Object) processPayment16);
        dVD1.setQuantity((int) (short) -1);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator20 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD1);
        org.team4.model.user.Manager manager26 = new org.team4.model.user.Manager("User [email=, password=, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "", (long) 0);
        long long27 = manager26.getManagerID();
        long long28 = manager26.getManagerID();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase29 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) rentableItemDecorator20, (org.team4.model.user.User) manager26);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder35 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder37 = courseTextBookBuilder35.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder39 = courseTextBookBuilder35.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder41 = courseTextBookBuilder35.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder43 = courseTextBookBuilder35.price((double) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder45 = courseTextBookBuilder35.price((double) 10);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder46 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder48 = courseTextBookBuilder46.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder50 = courseTextBookBuilder46.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder52 = courseTextBookBuilder46.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder54 = courseTextBookBuilder46.hasSoftCopy(true);
        org.team4.model.course.CourseTextBook courseTextBook55 = courseTextBookBuilder46.build();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder61 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder63 = courseTextBookBuilder61.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder65 = courseTextBookBuilder61.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder67 = courseTextBookBuilder61.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder69 = courseTextBookBuilder61.quantity((int) (short) 100);
        java.util.Date date71 = null;
        java.util.Date date72 = null;
        org.team4.model.course.Course course75 = new org.team4.model.course.Course("hi!", date71, date72, "", "hi!");
        java.util.Date date76 = course75.getEndDate();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder77 = courseTextBookBuilder61.course(course75);
        org.team4.model.user.Student student83 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str84 = student83.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase85 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student83);
        java.lang.String str86 = student83.toString();
        java.lang.String str87 = student83.getEmail();
        java.lang.String str88 = student83.toString();
        course75.enrollStudent(student83);
        org.team4.model.course.CourseTextBook courseTextBook91 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook55, "hi!", 52, "User [email=, password=, name=hi!, type=, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", (int) 'a', course75, false);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder92 = courseTextBookBuilder35.course(course75);
        java.util.Date date93 = course75.getEndDate();
        org.team4.model.course.CourseTextBook courseTextBook95 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) rentableItemDecorator20, "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:55 EDT 2024, dateDue=Tue Apr 30 19:21:55 EDT 2024}", 100, "User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=User [email=, password=, name=hi!, type=, validated=false], name=hi!, type=PayPal, validated=true]", "User [email=, password=, name=hi!, type=hi!, validated=false]", (int) (short) 10, course75, true);
        double double96 = courseTextBook95.getPrice();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(bookBuilder37);
        org.junit.Assert.assertNotNull(bookItemBuilder39);
        org.junit.Assert.assertNotNull(bookBuilder41);
        org.junit.Assert.assertNotNull(bookItemBuilder43);
        org.junit.Assert.assertNotNull(bookItemBuilder45);
        org.junit.Assert.assertNotNull(bookBuilder48);
        org.junit.Assert.assertNotNull(bookItemBuilder50);
        org.junit.Assert.assertNotNull(courseTextBookBuilder52);
        org.junit.Assert.assertNotNull(bookBuilder54);
        org.junit.Assert.assertNotNull(courseTextBook55);
        org.junit.Assert.assertNotNull(bookBuilder63);
        org.junit.Assert.assertNotNull(bookItemBuilder65);
        org.junit.Assert.assertNotNull(bookBuilder67);
        org.junit.Assert.assertNotNull(bookItemBuilder69);
        org.junit.Assert.assertNull(date76);
        org.junit.Assert.assertNotNull(courseTextBookBuilder77);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str86, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str88, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertNotNull(courseTextBookBuilder92);
        org.junit.Assert.assertNull(date93);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 0.0d + "'", double96 == 0.0d);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        dVD1.setQuantity((int) (short) 1);
        dVD1.setQuantity((int) ' ');
        boolean boolean9 = dVD1.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD1);
        org.team4.model.items.Item item11 = rentableItemDecorator10.getItem();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator12 = new org.team4.model.items.decorator.PurchasableItemDecorator(item11);
        org.team4.model.user.Manager manager18 = new org.team4.model.user.Manager("", "", "", "hi!", false);
        manager18.setValidated(false);
        manager18.setName("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase23 = new org.team4.functionality.buy.ItemToPurchase(item11, (org.team4.model.user.User) manager18);
        boolean boolean24 = item11.isPurchasable();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("PayPal");
        java.lang.String str2 = payPal1.toString();
        java.lang.String str3 = payPal1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PayPal{email='PayPal'}" + "'", str2, "PayPal{email='PayPal'}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PayPal{email='PayPal'}" + "'", str3, "PayPal{email='PayPal'}");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.quantity(10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDBuilder0.title("ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDItemBuilder6.quantity(100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder10 = dVDItemBuilder8.title("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
        org.junit.Assert.assertNotNull(dVDItemBuilder10);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("");
        java.lang.String str2 = mobileWallet1.getMode();
        boolean boolean3 = mobileWallet1.isValid();
        java.lang.String str4 = mobileWallet1.getMode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PayPal" + "'", str2, "PayPal");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PayPal" + "'", str4, "PayPal");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "Credit Card", (int) '4', "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        int int7 = bookRequest6.getEdition();
        int int8 = bookRequest6.getEdition();
        java.lang.String str9 = bookRequest6.getBookType();
        java.lang.String str10 = bookRequest6.getEmail();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}" + "'", str9, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}" + "'", str10, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        java.util.Date date2 = null;
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("", "", date2);
        java.util.Date date4 = itemPurchased3.getDatePurchased();
        java.lang.String str5 = itemPurchased3.getTitle();
        java.lang.String str6 = itemPurchased3.getTitle();
        java.lang.String str7 = itemPurchased3.toString();
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str7, "ItemPurchased{title='', email='', datePurchased=null}");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        org.team4.model.user.Student student10 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str11 = student10.getType();
        course5.enrollStudent(student10);
        java.lang.String str13 = course5.getCourseName();
        java.lang.String str14 = course5.getCourseTextBookISBN();
        org.team4.model.user.Student student19 = new org.team4.model.user.Student("", "", "PayPal", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        boolean boolean20 = course5.isEnrolled(student19);
        java.util.Date date22 = null;
        java.util.Date date23 = null;
        org.team4.model.course.Course course26 = new org.team4.model.course.Course("hi!", date22, date23, "", "hi!");
        java.util.Date date27 = course26.getEndDate();
        java.lang.String str28 = course26.getProfessorEmail();
        java.lang.String str29 = course26.getProfessorEmail();
        org.team4.model.user.Student student34 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean35 = course26.isEnrolled(student34);
        course5.enrollStudent(student34);
        org.team4.model.user.Student student42 = new org.team4.model.user.Student("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "Credit Card", "hi!", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", false);
        course5.enrollStudent(student42);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(date27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder6 = bookItemBuilder4.ISBN("User [email=, password=hi!, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=, validated=false]");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = bookItemBuilder6.quantity((int) 'a');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = bookItemBuilder6.yearPublished((int) (short) 1);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookItemBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal", "Credit Card", "");
        java.lang.String str5 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.quantity((int) (short) 100);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        org.team4.model.course.Course course14 = new org.team4.model.course.Course("hi!", date10, date11, "", "hi!");
        java.util.Date date15 = course14.getEndDate();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder16 = courseTextBookBuilder0.course(course14);
        java.util.Date date18 = null;
        java.util.Date date19 = null;
        org.team4.model.course.Course course22 = new org.team4.model.course.Course("hi!", date18, date19, "", "hi!");
        java.util.Date date23 = course22.getEndDate();
        java.lang.String str24 = course22.getProfessorEmail();
        java.lang.String str25 = course22.getProfessorEmail();
        org.team4.model.user.Student student30 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean31 = course22.isEnrolled(student30);
        java.lang.String str32 = student30.getPassword();
        boolean boolean33 = course14.isEnrolled(student30);
        java.lang.String str34 = course14.getProfessorEmail();
        java.util.Date date35 = course14.getStartDate();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNotNull(courseTextBookBuilder16);
        org.junit.Assert.assertNull(date23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNull(date35);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.course.Course course6 = new org.team4.model.course.Course("hi!", date2, date3, "", "hi!");
        java.util.Date date7 = course6.getEndDate();
        java.lang.String str8 = course6.getProfessorEmail();
        java.lang.String str9 = course6.getProfessorEmail();
        org.team4.model.user.Student student14 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean15 = course6.isEnrolled(student14);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase16 = new org.team4.functionality.buy.ItemToPurchase(100.0d, (org.team4.model.user.User) student14);
        org.team4.model.paymentmodes.PayPal payPal18 = new org.team4.model.paymentmodes.PayPal("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        boolean boolean19 = payPal18.isValid();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete20 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase16, (org.team4.model.paymentmodes.PaymentValidator) payPal18);
        java.lang.String str21 = payPal18.toString();
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PayPal{email='Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}'}" + "'", str21, "PayPal{email='Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}'}");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "Credit Card", (int) '4', "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        int int7 = bookRequest6.getEdition();
        java.lang.String str8 = bookRequest6.getISBN();
        int int9 = bookRequest6.getEdition();
        java.lang.String str10 = bookRequest6.getTitle();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str10, "ItemPurchased{title='', email='hi!', datePurchased=null}");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        boolean boolean4 = creditCard3.notExpired();
        boolean boolean5 = creditCard3.isValid();
        boolean boolean6 = creditCard3.isValid();
        java.lang.String str7 = creditCard3.getMode();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credit Card" + "'", str7, "Credit Card");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        boolean boolean1 = org.team4.utils.EmailValidator.validEmail("User [email=, password=, name=hi!, type=hi!, validated=false]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.paymentmodes.CreditCard creditCard10 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) creditCard10);
        long long12 = purchaseComplete11.getPurchaseID();
        org.team4.model.items.Item item13 = purchaseComplete11.getItem();
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 8407714L + "'", long12 == 8407714L);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:57 EDT 2024, dateDue=Tue Apr 30 19:21:57 EDT 2024}", "PayPal{email='Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}'}", "PayPal{email='Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}'}", "User [email=hi!, password=hi!, name=hi!, type=, validated=false]");
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("Course [course name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, start date=Tue Apr 30 19:21:54 EDT 2024, end date=Tue Apr 30 19:21:54 EDT 2024, ISBN=ItemPurchased{title='', email='hi!', datePurchased=null}, email=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}]");
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("User [email=, password=, name=hi!, type=hi!, validated=false]", "ItemPurchased{title='', email='hi!', datePurchased=null}");
        java.lang.String str3 = subscribeNewsletter2.getTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [email=, password=, name=hi!, type=hi!, validated=false]" + "'", str3, "User [email=, password=, name=hi!, type=hi!, validated=false]");
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.quantity(10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDItemBuilder4.title("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDItemBuilder4.yearPublished((int) 'a');
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("User [email=, password=, name=hi!, type=, validated=false]");
        boolean boolean2 = payPal1.isValid();
        java.lang.String str3 = payPal1.toString();
        java.lang.String str4 = payPal1.getMode();
        java.lang.String str5 = payPal1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str3, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Mobile Wallet" + "'", str4, "Mobile Wallet");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str5, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.builder.DVDBuilder dVDBuilder4 = dVDBuilder0.genre("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDBuilder4);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        book7.setPrice((double) 0L);
        boolean boolean11 = book7.hasHardCopy();
        org.team4.model.user.Student student21 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str22 = student21.getType();
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        student21.setCourses(strList25);
        org.team4.model.user.Faculty faculty28 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", (long) (byte) -1, strList25);
        java.lang.String str29 = faculty28.getName();
        faculty28.setFacultyID((long) (short) 100);
        java.util.ArrayList<java.lang.String> strList32 = faculty28.getCourses();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase33 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) book7, (org.team4.model.user.User) faculty28);
        org.team4.model.items.Newsletter newsletter34 = itemToPurchase33.getNewsletter();
        org.team4.model.items.Newsletter newsletter35 = itemToPurchase33.getNewsletter();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str29, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNull(newsletter34);
        org.junit.Assert.assertNull(newsletter35);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder6.author("Credit Card");
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        org.team4.model.course.Course course14 = new org.team4.model.course.Course("hi!", date10, date11, "", "hi!");
        java.lang.String str15 = course14.getProfessorEmail();
        java.lang.String str16 = course14.getProfessorEmail();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder17 = courseTextBookBuilder6.course(course14);
        org.team4.model.items.builder.BookBuilder bookBuilder19 = courseTextBookBuilder6.genre("SubscribeNewsletter{title='ItemPurchased{title='', email='', datePurchased=null}', email='', dateSubscribed=Tue Apr 30 19:21:58 EDT 2024, dateDue=Tue Apr 30 19:21:58 EDT 2024}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(courseTextBookBuilder17);
        org.junit.Assert.assertNotNull(bookBuilder19);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter7 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str8 = subscribeNewsletter7.getTitle();
        java.util.Date date9 = null;
        subscribeNewsletter7.setDateSubscribed(date9);
        java.util.Date date11 = subscribeNewsletter7.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter16 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str17 = subscribeNewsletter16.getEmail();
        java.util.Date date18 = subscribeNewsletter16.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter21 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str22 = subscribeNewsletter21.getEmail();
        java.util.Date date23 = subscribeNewsletter21.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter24 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date18, date23);
        org.team4.model.course.Course course27 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date11, date23, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.functionality.buy.ItemPurchased itemPurchased28 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", date23);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter35 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str36 = subscribeNewsletter35.getEmail();
        java.util.Date date37 = subscribeNewsletter35.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter40 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str41 = subscribeNewsletter40.getEmail();
        java.util.Date date42 = subscribeNewsletter40.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter43 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date37, date42);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter46 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter46.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter46.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter53 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date54 = null;
        subscribeNewsletter53.setDateSubscribed(date54);
        java.util.Date date56 = subscribeNewsletter53.getDateDue();
        subscribeNewsletter46.setDateDue(date56);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter58 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", date42, date56);
        org.team4.model.items.RentedItem rentedItem59 = new org.team4.model.items.RentedItem("User [email=, password=, name=hi!, type=, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date23, date56);
        rentedItem59.setISBN("ItemPurchased{title='', email='hi!', datePurchased=null}");
        rentedItem59.setTitle("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}");
        java.lang.String str64 = rentedItem59.getTitle();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter68 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str69 = subscribeNewsletter68.getTitle();
        java.util.Date date70 = null;
        subscribeNewsletter68.setDateSubscribed(date70);
        java.util.Date date72 = subscribeNewsletter68.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter77 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str78 = subscribeNewsletter77.getEmail();
        java.util.Date date79 = subscribeNewsletter77.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter82 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str83 = subscribeNewsletter82.getEmail();
        java.util.Date date84 = subscribeNewsletter82.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter85 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date79, date84);
        org.team4.model.course.Course course88 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date72, date84, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        rentedItem59.setDueDate(date84);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Apr 30 19:22:00 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Tue Apr 30 19:22:00 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 19:22:00 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 19:22:00 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 19:22:00 EDT 2024");
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Tue Apr 30 19:22:00 EDT 2024");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}" + "'", str64, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertNotNull(date72);
// flaky:         org.junit.Assert.assertEquals(date72.toString(), "Tue Apr 30 19:22:00 EDT 2024");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertNotNull(date79);
// flaky:         org.junit.Assert.assertEquals(date79.toString(), "Tue Apr 30 19:22:00 EDT 2024");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertNotNull(date84);
// flaky:         org.junit.Assert.assertEquals(date84.toString(), "Tue Apr 30 19:22:00 EDT 2024");
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook8 = courseTextBookBuilder6.build();
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder6.edition((int) ' ');
        org.team4.model.items.builder.BookBuilder bookBuilder12 = bookBuilder10.publisher("User [email=, password=hi!, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=, validated=false]");
        org.team4.model.items.Book book13 = bookBuilder10.build();
        org.team4.model.items.builder.BookBuilder bookBuilder15 = bookBuilder10.author("ItemToPurchase{item=Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}, user=User [email=, password=, name=hi!, type=hi!, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(bookBuilder12);
        org.junit.Assert.assertNotNull(book13);
        org.junit.Assert.assertNotNull(bookBuilder15);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        dVD1.setQuantity((int) (short) 1);
        dVD1.setQuantity((int) ' ');
        boolean boolean9 = dVD1.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD1);
        org.team4.model.items.Item item11 = rentableItemDecorator10.getItem();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator12 = new org.team4.model.items.decorator.PurchasableItemDecorator(item11);
        org.team4.model.user.Manager manager18 = new org.team4.model.user.Manager("", "", "", "hi!", false);
        manager18.setValidated(false);
        manager18.setName("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase23 = new org.team4.functionality.buy.ItemToPurchase(item11, (org.team4.model.user.User) manager18);
        java.lang.String str24 = manager18.getEmail();
        java.lang.String str25 = manager18.getType();
        manager18.setManagerID(6290755L);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
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
        java.util.List<org.team4.model.user.Student> studentList21 = courseTextBook8.getStudentsWithCopies();
        java.util.Date date28 = null;
        java.util.Date date29 = null;
        org.team4.model.course.Course course32 = new org.team4.model.course.Course("hi!", date28, date29, "", "hi!");
        org.team4.model.user.Student student37 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str38 = student37.getType();
        course32.enrollStudent(student37);
        java.lang.String str40 = course32.getCourseName();
        java.lang.String str41 = course32.getCourseTextBookISBN();
        org.team4.model.course.CourseTextBook courseTextBook43 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook8, "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", 0, "ItemPurchased{title='', email='', datePurchased=null}", "SubscribeNewsletter{title='Credit Card', email='hi!', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}", (int) (byte) 10, course32, true);
        java.util.List<org.team4.model.user.Student> studentList44 = courseTextBook43.getStudentsWithCopies();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(studentList21);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(studentList44);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.team4.model.user.User user5 = new org.team4.model.user.User("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemPurchased{title='', email='', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", true);
        java.lang.String str6 = user5.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}" + "'", str6, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder0.build();
        double double10 = courseTextBook9.getPrice();
        java.lang.String str11 = courseTextBook9.getGenre();
        java.lang.String str12 = courseTextBook9.getGenre();
        boolean boolean13 = courseTextBook9.hasSoftCopy();
        courseTextBook9.setPrice((double) 1197917L);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(courseTextBook9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "hi!", "", "", false);
        faculty5.setFacultyID((long) (byte) 1);
        org.team4.model.user.Student student12 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str13 = student12.getType();
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        student12.setCourses(strList16);
        faculty5.setCourses(strList16);
        long long20 = faculty5.getFacultyID();
        java.util.ArrayList<java.lang.String> strList21 = faculty5.getCourses();
        java.lang.String str22 = faculty5.getName();
        faculty5.setName("User [email=, password=hi!, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=, validated=false]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        dVD1.setQuantity((int) (short) 1);
        dVD1.setQuantity((int) ' ');
        boolean boolean9 = dVD1.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD1);
        org.team4.model.items.Item item11 = rentableItemDecorator10.getItem();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator12 = new org.team4.model.items.decorator.PurchasableItemDecorator(item11);
        boolean boolean13 = purchasableItemDecorator12.isPurchasable();
        double double14 = purchasableItemDecorator12.getPrice();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        boolean boolean8 = book7.isRentable();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder9 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder11 = magazineBuilder9.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder13 = magazineBuilder9.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder15 = magazineBuilder9.yearPublished((int) (short) 0);
        boolean boolean16 = book7.equals((java.lang.Object) magazineBuilder9);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder18 = magazineBuilder9.quantity(0);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(magazineItemBuilder11);
        org.junit.Assert.assertNotNull(magazineBuilder13);
        org.junit.Assert.assertNotNull(magazineItemBuilder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(magazineItemBuilder18);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("Course [course name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, start date=Tue Apr 30 19:21:54 EDT 2024, end date=Tue Apr 30 19:21:54 EDT 2024, ISBN=ItemPurchased{title='', email='hi!', datePurchased=null}, email=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=null}", "ItemToPurchase{item=null, user=User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemPurchased{title='', email='', datePurchased=null}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=null}");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        int int2 = dVD1.getQuantity();
        org.team4.model.items.decorator.ItemDecorator itemDecorator3 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) dVD1);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", 1.0d);
        double double4 = newsletter3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.DVD dVD10 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Credit Card", 0.0d);
        int int11 = book7.getNoOfPages();
        org.team4.model.user.Visitor visitor17 = new org.team4.model.user.Visitor("PayPal", "ItemPurchased{title='', email='hi!', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", true);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase18 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) book7, (org.team4.model.user.User) visitor17);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder0.price((double) 10);
        org.team4.model.course.CourseTextBook courseTextBook11 = courseTextBookBuilder0.build();
        java.lang.String str12 = courseTextBook11.getAuthor();
        org.team4.model.course.Course course13 = courseTextBook11.getCourse();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(courseTextBook11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(course13);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        dVD1.setPurchaseable(false);
        boolean boolean7 = dVD1.isPurchasable();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("Credit Card", "hi!", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:57 EDT 2024, dateDue=Tue Apr 30 19:21:57 EDT 2024}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", false);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.user.User user12 = itemToPurchase7.getUser();
        boolean boolean13 = user12.isValidated();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}", "User [email=, password=, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}', email='SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}', dateSubscribed=Tue Apr 30 19:21:55 EDT 2024, dateDue=Tue Apr 30 19:21:55 EDT 2024}", "ItemToPurchase{item=Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}, user=User [email=, password=, name=hi!, type=hi!, validated=false], newsletter=null}");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.quantity((int) (short) 100);
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder11 = courseTextBookBuilder0.author("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder13 = bookBuilder11.price((double) (byte) 10);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(courseTextBook9);
        org.junit.Assert.assertNotNull(bookBuilder11);
        org.junit.Assert.assertNotNull(bookItemBuilder13);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.ISBN("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder0.genre("");
        org.team4.model.items.builder.DVDBuilder dVDBuilder8 = dVDBuilder0.duration((double) (-1.0f));
        org.team4.model.items.builder.DVDBuilder dVDBuilder10 = dVDBuilder8.genre("Debit Card");
        org.team4.model.items.builder.DVDBuilder dVDBuilder12 = dVDBuilder10.genre("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder14 = dVDBuilder10.title("ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDBuilder8);
        org.junit.Assert.assertNotNull(dVDBuilder10);
        org.junit.Assert.assertNotNull(dVDBuilder12);
        org.junit.Assert.assertNotNull(dVDItemBuilder14);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter4 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str5 = subscribeNewsletter4.getEmail();
        java.util.Date date6 = subscribeNewsletter4.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter9 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str10 = subscribeNewsletter9.getTitle();
        java.util.Date date11 = null;
        subscribeNewsletter9.setDateSubscribed(date11);
        java.util.Date date13 = subscribeNewsletter9.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter14 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "", date6, date13);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter21 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str22 = subscribeNewsletter21.getEmail();
        java.util.Date date23 = subscribeNewsletter21.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter26 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str27 = subscribeNewsletter26.getEmail();
        java.util.Date date28 = subscribeNewsletter26.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter29 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date23, date28);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter32 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter32.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter32.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter39 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date40 = null;
        subscribeNewsletter39.setDateSubscribed(date40);
        java.util.Date date42 = subscribeNewsletter39.getDateDue();
        subscribeNewsletter32.setDateDue(date42);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter44 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", date28, date42);
        subscribeNewsletter14.setDateSubscribed(date28);
        subscribeNewsletter14.setEmail("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}");
        java.lang.String str48 = subscribeNewsletter14.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 19:22:01 EDT 2024");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', email='SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}', dateSubscribed=Tue Apr 30 19:22:01 EDT 2024, dateDue=Tue Apr 30 19:22:01 EDT 2024}" + "'", str48, "SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', email='SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}', dateSubscribed=Tue Apr 30 19:22:01 EDT 2024, dateDue=Tue Apr 30 19:22:01 EDT 2024}");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.yearPublished((int) (short) -1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineBuilder0.quantity((int) (byte) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder10 = magazineBuilder0.quantity((int) (short) 0);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
        org.junit.Assert.assertNotNull(magazineItemBuilder10);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.DVD dVD10 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Credit Card", 0.0d);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator11 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD10);
        rentableItemDecorator11.setPrice((double) (byte) 1);
        org.team4.model.items.Item item14 = rentableItemDecorator11.getItem();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator15 = new org.team4.model.items.decorator.PurchasableItemDecorator(item14);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(item14);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.team4.model.user.User user4 = new org.team4.model.user.User("", "hi!", "PayPal", "");
        java.lang.String str5 = user4.getPassword();
        user4.setPassword("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.booktype("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder5.ISBN("PayPal");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder9 = bookRequestBuilder5.author("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=Tue Apr 30 19:21:52 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder11 = bookRequestBuilder9.author("");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
        org.junit.Assert.assertNotNull(bookRequestBuilder9);
        org.junit.Assert.assertNotNull(bookRequestBuilder11);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        org.team4.model.items.Book book5 = courseTextBookBuilder0.build();
        book5.setRentable(true);
        org.team4.model.user.Student student12 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str13 = student12.getType();
        org.team4.model.user.Student student18 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str19 = student18.getType();
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        student18.setCourses(strList22);
        student12.setCourses(strList22);
        boolean boolean26 = book5.equals((java.lang.Object) strList22);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.yearPublished((int) (short) 0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineBuilder0.quantity((int) (short) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder10 = magazineBuilder0.price((double) (short) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder12 = magazineBuilder0.quantity((int) (short) 1);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder14 = magazineBuilder0.publisher("ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder16 = magazineBuilder14.publisher("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=null}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder18 = magazineBuilder14.title("User [email=User [email=, password=, name=hi!, type=, validated=false], password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=, validated=false]");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
        org.junit.Assert.assertNotNull(magazineItemBuilder10);
        org.junit.Assert.assertNotNull(magazineItemBuilder12);
        org.junit.Assert.assertNotNull(magazineBuilder14);
        org.junit.Assert.assertNotNull(magazineBuilder16);
        org.junit.Assert.assertNotNull(magazineItemBuilder18);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        java.util.ArrayList<java.lang.String> strList13 = org.team4.model.paymentmodes.PaymentModes.MODE;
        org.team4.model.user.Faculty faculty14 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "ItemPurchased{title='', email='', datePurchased=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", 2031860L, strList13);
        org.team4.model.user.Student student15 = new org.team4.model.user.Student("PayPal", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "User [email=, password=, name=hi!, type=, validated=false]", strList13);
        org.team4.model.user.Student student16 = new org.team4.model.user.Student("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}", "hi!", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", strList13);
        student16.setEmail("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        java.lang.String str19 = student16.getPassword();
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        dVD1.setQuantity((int) (short) 1);
        dVD1.setQuantity((int) ' ');
        boolean boolean9 = dVD1.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD1);
        org.team4.model.items.Item item11 = rentableItemDecorator10.getItem();
        org.team4.model.items.Item item12 = new org.team4.model.items.Item(item11);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter21 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str22 = subscribeNewsletter21.getTitle();
        java.util.Date date23 = null;
        subscribeNewsletter21.setDateSubscribed(date23);
        java.util.Date date25 = subscribeNewsletter21.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter30 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str31 = subscribeNewsletter30.getEmail();
        java.util.Date date32 = subscribeNewsletter30.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter35 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str36 = subscribeNewsletter35.getEmail();
        java.util.Date date37 = subscribeNewsletter35.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter38 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date32, date37);
        org.team4.model.course.Course course41 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date25, date37, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.model.course.CourseTextBook courseTextBook43 = new org.team4.model.course.CourseTextBook(item12, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", (int) (short) 1, "hi!", "PayPal", 52, course41, false);
        java.lang.String str44 = course41.getCourseTextBookISBN();
        java.lang.String str45 = course41.toString();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str44, "ItemPurchased{title='', email='hi!', datePurchased=null}");
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Course [course name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, start date=Tue Apr 30 19:22:01 EDT 2024, end date=Tue Apr 30 19:22:01 EDT 2024, ISBN=ItemPurchased{title='', email='hi!', datePurchased=null}, email=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}]" + "'", str45, "Course [course name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, start date=Tue Apr 30 19:22:01 EDT 2024, end date=Tue Apr 30 19:22:01 EDT 2024, ISBN=ItemPurchased{title='', email='hi!', datePurchased=null}, email=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}]");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.genre("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder7 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder9 = courseTextBookBuilder7.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder11 = courseTextBookBuilder7.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder13 = courseTextBookBuilder7.isVirtual(true);
        org.team4.model.items.Book book14 = courseTextBookBuilder13.build();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder15 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder17 = courseTextBookBuilder15.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder19 = courseTextBookBuilder15.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder21 = courseTextBookBuilder15.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder23 = courseTextBookBuilder15.price((double) (-1L));
        org.team4.model.items.builder.BookBuilder bookBuilder25 = courseTextBookBuilder15.publisher("hi!");
        boolean boolean26 = book14.equals((java.lang.Object) bookBuilder25);
        java.util.Date date33 = null;
        java.util.Date date34 = null;
        org.team4.model.course.Course course37 = new org.team4.model.course.Course("hi!", date33, date34, "", "hi!");
        org.team4.model.user.Student student42 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str43 = student42.getType();
        course37.enrollStudent(student42);
        java.lang.String str45 = course37.getCourseName();
        java.lang.String str46 = course37.getCourseTextBookISBN();
        org.team4.model.course.CourseTextBook courseTextBook48 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) book14, "PayPal", (int) ' ', "ItemPurchased{title='', email='', datePurchased=null}", "Credit Card", (int) (short) 100, course37, true);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder49 = courseTextBookBuilder0.course(course37);
        org.team4.model.items.builder.BookBuilder bookBuilder51 = courseTextBookBuilder0.genre("");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder53 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder55 = courseTextBookBuilder53.edition((int) (byte) -1);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder9);
        org.junit.Assert.assertNotNull(bookItemBuilder11);
        org.junit.Assert.assertNotNull(courseTextBookBuilder13);
        org.junit.Assert.assertNotNull(book14);
        org.junit.Assert.assertNotNull(bookBuilder17);
        org.junit.Assert.assertNotNull(bookItemBuilder19);
        org.junit.Assert.assertNotNull(bookBuilder21);
        org.junit.Assert.assertNotNull(bookItemBuilder23);
        org.junit.Assert.assertNotNull(bookBuilder25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(courseTextBookBuilder49);
        org.junit.Assert.assertNotNull(bookBuilder51);
        org.junit.Assert.assertNotNull(courseTextBookBuilder53);
        org.junit.Assert.assertNotNull(bookBuilder55);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        java.lang.String[] strArray26 = new java.lang.String[] { "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "PayPal", "ItemPurchased{title='', email='hi!', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemPurchased{title='', email='', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        org.team4.model.user.Faculty faculty29 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "", "ItemPurchased{title='', email='', datePurchased=null}", 0L, strList27);
        org.team4.model.user.Student student30 = new org.team4.model.user.Student("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "Debit Card", "hi!", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", strList27);
        org.team4.model.user.Faculty faculty31 = new org.team4.model.user.Faculty("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", "Credit Card", (long) (short) 100, strList27);
        long long32 = faculty31.getFacultyID();
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 100L + "'", long32 == 100L);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.Book book8 = courseTextBookBuilder6.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder6.price((double) 4408745L);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(book8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "hi!", "", "");
        java.lang.String str6 = visitor5.getEmail();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) 4230228L, (org.team4.model.user.User) visitor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.team4.model.items.builder.BookBuilder bookBuilder0 = new org.team4.model.items.builder.BookBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder2 = bookBuilder0.yearPublished((int) (short) 1);
        org.team4.model.items.builder.BookBuilder bookBuilder4 = bookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder6 = bookBuilder4.author("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(bookItemBuilder2);
        org.junit.Assert.assertNotNull(bookBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder6 = courseTextBookBuilder0.quantity(0);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder8 = courseTextBookBuilder0.isVirtual(false);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookItemBuilder6);
        org.junit.Assert.assertNotNull(courseTextBookBuilder8);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.team4.functionality.buy.ItemPurchased itemPurchased2 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}", "hi!");
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter7 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str8 = subscribeNewsletter7.getTitle();
        java.util.Date date9 = null;
        subscribeNewsletter7.setDateSubscribed(date9);
        java.util.Date date11 = subscribeNewsletter7.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter16 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str17 = subscribeNewsletter16.getEmail();
        java.util.Date date18 = subscribeNewsletter16.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter21 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str22 = subscribeNewsletter21.getEmail();
        java.util.Date date23 = subscribeNewsletter21.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter24 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date18, date23);
        org.team4.model.course.Course course27 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date11, date23, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.functionality.buy.ItemPurchased itemPurchased28 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", date23);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter35 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str36 = subscribeNewsletter35.getEmail();
        java.util.Date date37 = subscribeNewsletter35.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter40 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str41 = subscribeNewsletter40.getEmail();
        java.util.Date date42 = subscribeNewsletter40.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter43 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date37, date42);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter46 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter46.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter46.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter53 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date54 = null;
        subscribeNewsletter53.setDateSubscribed(date54);
        java.util.Date date56 = subscribeNewsletter53.getDateDue();
        subscribeNewsletter46.setDateDue(date56);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter58 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", date42, date56);
        org.team4.model.items.RentedItem rentedItem59 = new org.team4.model.items.RentedItem("User [email=, password=, name=hi!, type=, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date23, date56);
        java.lang.String str60 = rentedItem59.getISBN();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter63 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter63.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter63.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter70 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date71 = null;
        subscribeNewsletter70.setDateSubscribed(date71);
        java.util.Date date73 = subscribeNewsletter70.getDateDue();
        subscribeNewsletter63.setDateDue(date73);
        rentedItem59.setDueDate(date73);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter80 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str81 = subscribeNewsletter80.getEmail();
        java.util.Date date82 = subscribeNewsletter80.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter85 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str86 = subscribeNewsletter85.getTitle();
        java.util.Date date87 = null;
        subscribeNewsletter85.setDateSubscribed(date87);
        java.util.Date date89 = subscribeNewsletter85.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter90 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "", date82, date89);
        rentedItem59.setDueDate(date82);
        java.lang.String str92 = rentedItem59.getISBN();
        rentedItem59.setISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}");
        java.lang.String str95 = rentedItem59.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str60, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(date73);
// flaky:         org.junit.Assert.assertEquals(date73.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertNotNull(date82);
// flaky:         org.junit.Assert.assertEquals(date82.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertNotNull(date89);
// flaky:         org.junit.Assert.assertEquals(date89.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str92, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str95, "User [email=, password=, name=hi!, type=, validated=false]");
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.title("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.edition(32);
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder3.author("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder9 = bookRequestBuilder7.edition((int) (byte) 100);
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
        org.junit.Assert.assertNotNull(bookRequestBuilder9);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        java.lang.String str3 = subscribeNewsletter2.getTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}" + "'", str3, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        boolean boolean10 = book9.hasHardCopy();
        book9.setQuantity((int) '4');
        org.team4.model.user.Visitor visitor18 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase19 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor18);
        org.team4.model.paymentmodes.CreditCard creditCard23 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete24 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase19, (org.team4.model.paymentmodes.PaymentValidator) creditCard23);
        long long25 = purchaseComplete24.getPurchaseID();
        org.team4.model.user.User user26 = purchaseComplete24.getUser();
        org.team4.model.items.Newsletter newsletter27 = purchaseComplete24.getNewsletter();
        boolean boolean28 = book9.equals((java.lang.Object) newsletter27);
        book9.setQuantity((int) ' ');
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder36 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder38 = courseTextBookBuilder36.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder40 = courseTextBookBuilder36.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder42 = courseTextBookBuilder36.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder44 = courseTextBookBuilder36.price((double) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder46 = courseTextBookBuilder36.price((double) 10);
        org.team4.model.course.CourseTextBook courseTextBook47 = courseTextBookBuilder36.build();
        java.util.Date date54 = null;
        java.util.Date date55 = null;
        org.team4.model.course.Course course58 = new org.team4.model.course.Course("hi!", date54, date55, "", "hi!");
        java.lang.String str59 = course58.getProfessorEmail();
        org.team4.model.user.Student student60 = null;
        boolean boolean61 = course58.isEnrolled(student60);
        org.team4.model.course.CourseTextBook courseTextBook63 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook47, "hi!", (int) (short) 1, "PayPal", "Credit Card", (int) (short) 10, course58, true);
        org.team4.model.course.CourseTextBook courseTextBook65 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) book9, "ItemPurchased{title='', email='hi!', datePurchased=null}", (int) ' ', "User [email=hi!, password=hi!, name=hi!, type=, validated=false]", "PayPal", (int) (byte) 10, course58, true);
        java.lang.String str66 = course58.getProfessorEmail();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 9763562L + "'", long25 == 9763562L);
        org.junit.Assert.assertNotNull(user26);
        org.junit.Assert.assertNull(newsletter27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(bookBuilder38);
        org.junit.Assert.assertNotNull(bookItemBuilder40);
        org.junit.Assert.assertNotNull(bookBuilder42);
        org.junit.Assert.assertNotNull(bookItemBuilder44);
        org.junit.Assert.assertNotNull(bookItemBuilder46);
        org.junit.Assert.assertNotNull(courseTextBook47);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.team4.model.user.Faculty faculty10 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "hi!", "", "", false);
        java.lang.String[] strArray36 = new java.lang.String[] { "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "PayPal", "ItemPurchased{title='', email='hi!', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemPurchased{title='', email='', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        org.team4.model.user.Faculty faculty39 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "", "ItemPurchased{title='', email='', datePurchased=null}", 0L, strList37);
        org.team4.model.user.Student student40 = new org.team4.model.user.Student("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "Debit Card", "hi!", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", strList37);
        org.team4.model.user.Student student41 = new org.team4.model.user.Student("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "User [email=, password=, name=hi!, type=, validated=false]", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemPurchased{title='', email='hi!', datePurchased=null}", strList37);
        faculty10.setCourses(strList37);
        org.team4.model.user.Faculty faculty43 = new org.team4.model.user.Faculty("ItemToPurchase{item=Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}, user=User [email=, password=, name=hi!, type=hi!, validated=false], newsletter=null}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "Mobile Wallet", "", (long) 10, strList37);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.Magazine magazine5 = magazineBuilder0.build();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder7 = magazineBuilder0.issueNumber((int) (short) 1);
        org.team4.model.items.Magazine magazine8 = magazineBuilder0.build();
        java.lang.String str9 = magazine8.getPublisher();
        int int10 = magazine8.getIssueNumber();
        magazine8.setQuantity((int) (byte) 100);
        java.lang.String str13 = magazine8.getISBN();
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazine5);
        org.junit.Assert.assertNotNull(magazineBuilder7);
        org.junit.Assert.assertNotNull(magazine8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        boolean boolean4 = debitCard3.notExpired();
        boolean boolean5 = debitCard3.notExpired();
        boolean boolean6 = debitCard3.isValid();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder7 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder9 = courseTextBookBuilder7.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder11 = courseTextBookBuilder7.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder13 = courseTextBookBuilder7.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder15 = courseTextBookBuilder13.yearPublished((int) (short) 100);
        org.team4.model.items.Book book16 = courseTextBookBuilder13.build();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator17 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book16);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator18 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book16);
        org.team4.model.user.Faculty faculty24 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "hi!", "", "", false);
        faculty24.setFacultyID((long) (byte) 1);
        org.team4.model.user.Student student31 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str32 = student31.getType();
        java.lang.String[] strArray34 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        student31.setCourses(strList35);
        faculty24.setCourses(strList35);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase39 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) rentableItemDecorator18, (org.team4.model.user.User) faculty24);
        org.team4.functionality.buy.ProcessPayment processPayment40 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) debitCard3, itemToPurchase39);
        double double41 = itemToPurchase39.getAmount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookBuilder9);
        org.junit.Assert.assertNotNull(bookItemBuilder11);
        org.junit.Assert.assertNotNull(courseTextBookBuilder13);
        org.junit.Assert.assertNotNull(bookItemBuilder15);
        org.junit.Assert.assertNotNull(book16);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        dVD1.setQuantity((int) (short) 1);
        dVD1.setQuantity((int) ' ');
        boolean boolean9 = dVD1.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD1);
        org.team4.model.items.Item item11 = rentableItemDecorator10.getItem();
        org.team4.model.items.Item item12 = new org.team4.model.items.Item(item11);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter21 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str22 = subscribeNewsletter21.getTitle();
        java.util.Date date23 = null;
        subscribeNewsletter21.setDateSubscribed(date23);
        java.util.Date date25 = subscribeNewsletter21.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter30 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str31 = subscribeNewsletter30.getEmail();
        java.util.Date date32 = subscribeNewsletter30.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter35 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str36 = subscribeNewsletter35.getEmail();
        java.util.Date date37 = subscribeNewsletter35.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter38 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date32, date37);
        org.team4.model.course.Course course41 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date25, date37, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.model.course.CourseTextBook courseTextBook43 = new org.team4.model.course.CourseTextBook(item12, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", (int) (short) 1, "hi!", "PayPal", 52, course41, false);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator44 = new org.team4.model.items.decorator.RentableItemDecorator(item12);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator45 = new org.team4.model.items.decorator.PurchasableItemDecorator(item12);
        org.team4.model.items.DVD dVD48 = new org.team4.model.items.DVD((org.team4.model.items.Item) purchasableItemDecorator45, "hi!", (double) 1731415L);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 19:22:01 EDT 2024");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("ItemToPurchase{item=Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}, user=User [email=, password=, name=hi!, type=hi!, validated=false], newsletter=null}", "SubscribeNewsletter{title='ItemPurchased{title='', email='', datePurchased=null}', email='', dateSubscribed=Tue Apr 30 19:21:58 EDT 2024, dateDue=Tue Apr 30 19:21:58 EDT 2024}", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:55 EDT 2024, dateDue=Tue Apr 30 19:21:55 EDT 2024}", "SubscribeNewsletter{title='ItemPurchased{title='', email='', datePurchased=null}', email='', dateSubscribed=Tue Apr 30 19:21:58 EDT 2024, dateDue=Tue Apr 30 19:21:58 EDT 2024}", true);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "Credit Card", (int) '4', "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        int int7 = bookRequest6.getEdition();
        java.lang.String str8 = bookRequest6.getISBN();
        java.lang.String str9 = bookRequest6.getAuthor();
        java.lang.String str10 = bookRequest6.getISBN();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str9, "ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Credit Card" + "'", str10, "Credit Card");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        java.util.ArrayList<java.lang.String> strList5 = null;
        org.team4.model.user.Faculty faculty6 = new org.team4.model.user.Faculty("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "", "ItemPurchased{title='', email='hi!', datePurchased=null}", (long) (short) -1, strList5);
        faculty6.setName("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder0.price((double) 10);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder11 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder13 = courseTextBookBuilder11.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder15 = courseTextBookBuilder11.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder17 = courseTextBookBuilder11.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder19 = courseTextBookBuilder11.hasSoftCopy(true);
        org.team4.model.course.CourseTextBook courseTextBook20 = courseTextBookBuilder11.build();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder26 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder28 = courseTextBookBuilder26.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder30 = courseTextBookBuilder26.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder32 = courseTextBookBuilder26.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder34 = courseTextBookBuilder26.quantity((int) (short) 100);
        java.util.Date date36 = null;
        java.util.Date date37 = null;
        org.team4.model.course.Course course40 = new org.team4.model.course.Course("hi!", date36, date37, "", "hi!");
        java.util.Date date41 = course40.getEndDate();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder42 = courseTextBookBuilder26.course(course40);
        org.team4.model.user.Student student48 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str49 = student48.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase50 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student48);
        java.lang.String str51 = student48.toString();
        java.lang.String str52 = student48.getEmail();
        java.lang.String str53 = student48.toString();
        course40.enrollStudent(student48);
        org.team4.model.course.CourseTextBook courseTextBook56 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook20, "hi!", 52, "User [email=, password=, name=hi!, type=, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", (int) 'a', course40, false);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder57 = courseTextBookBuilder0.course(course40);
        java.util.Date date58 = course40.getEndDate();
        java.util.Date date60 = null;
        java.util.Date date61 = null;
        org.team4.model.course.Course course64 = new org.team4.model.course.Course("hi!", date60, date61, "", "hi!");
        java.util.Date date65 = course64.getEndDate();
        java.lang.String str66 = course64.getProfessorEmail();
        java.lang.String str67 = course64.getProfessorEmail();
        org.team4.model.user.Student student73 = new org.team4.model.user.Student("", "", "hi!", "");
        student73.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase76 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student73);
        java.lang.String str77 = student73.getEmail();
        course64.enrollStudent(student73);
        course40.enrollStudent(student73);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str80 = course40.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.toString()\" because \"this.startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(bookBuilder13);
        org.junit.Assert.assertNotNull(bookItemBuilder15);
        org.junit.Assert.assertNotNull(courseTextBookBuilder17);
        org.junit.Assert.assertNotNull(bookBuilder19);
        org.junit.Assert.assertNotNull(courseTextBook20);
        org.junit.Assert.assertNotNull(bookBuilder28);
        org.junit.Assert.assertNotNull(bookItemBuilder30);
        org.junit.Assert.assertNotNull(bookBuilder32);
        org.junit.Assert.assertNotNull(bookItemBuilder34);
        org.junit.Assert.assertNull(date41);
        org.junit.Assert.assertNotNull(courseTextBookBuilder42);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str51, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str53, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertNotNull(courseTextBookBuilder57);
        org.junit.Assert.assertNull(date58);
        org.junit.Assert.assertNull(date65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}'}");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.paymentmodes.CreditCard creditCard10 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) creditCard10);
        java.lang.String str12 = creditCard10.getMode();
        java.lang.String str13 = creditCard10.getMode();
        java.lang.String str14 = creditCard10.getMode();
        boolean boolean15 = creditCard10.isValid();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder16 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder18 = courseTextBookBuilder16.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder20 = courseTextBookBuilder16.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder22 = courseTextBookBuilder16.isVirtual(true);
        org.team4.model.items.Book book23 = courseTextBookBuilder22.build();
        int int24 = book23.getNoOfPages();
        book23.setPrice((double) 0L);
        boolean boolean27 = book23.hasHardCopy();
        org.team4.model.user.Student student37 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str38 = student37.getType();
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        student37.setCourses(strList41);
        org.team4.model.user.Faculty faculty44 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", (long) (byte) -1, strList41);
        java.lang.String str45 = faculty44.getName();
        faculty44.setFacultyID((long) (short) 100);
        java.util.ArrayList<java.lang.String> strList48 = faculty44.getCourses();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase49 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) book23, (org.team4.model.user.User) faculty44);
        org.team4.model.items.Newsletter newsletter50 = itemToPurchase49.getNewsletter();
        org.team4.model.paymentmodes.DebitCard debitCard54 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        boolean boolean55 = debitCard54.correctLength();
        boolean boolean56 = debitCard54.correctLength();
        org.team4.model.user.Student student62 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str63 = student62.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase64 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student62);
        org.team4.functionality.buy.ProcessPayment processPayment65 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) debitCard54, itemToPurchase64);
        boolean boolean66 = debitCard54.notExpired();
        boolean boolean67 = debitCard54.isValid();
        boolean boolean68 = debitCard54.isValid();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete69 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase49, (org.team4.model.paymentmodes.PaymentValidator) debitCard54);
        org.team4.functionality.buy.ProcessPayment processPayment70 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) creditCard10, itemToPurchase49);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Credit Card" + "'", str12, "Credit Card");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Credit Card" + "'", str13, "Credit Card");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Credit Card" + "'", str14, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookBuilder18);
        org.junit.Assert.assertNotNull(bookItemBuilder20);
        org.junit.Assert.assertNotNull(courseTextBookBuilder22);
        org.junit.Assert.assertNotNull(book23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str45, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNull(newsletter50);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter3 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str4 = subscribeNewsletter3.getTitle();
        java.util.Date date5 = null;
        subscribeNewsletter3.setDateSubscribed(date5);
        java.util.Date date7 = subscribeNewsletter3.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter10 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter10.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter16 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str17 = subscribeNewsletter16.getTitle();
        java.util.Date date18 = null;
        subscribeNewsletter16.setDateSubscribed(date18);
        java.util.Date date20 = subscribeNewsletter16.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter25 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str26 = subscribeNewsletter25.getEmail();
        java.util.Date date27 = subscribeNewsletter25.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter30 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str31 = subscribeNewsletter30.getEmail();
        java.util.Date date32 = subscribeNewsletter30.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter33 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date27, date32);
        org.team4.model.course.Course course36 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date20, date32, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        subscribeNewsletter10.setDateSubscribed(date20);
        org.team4.model.course.Course course40 = new org.team4.model.course.Course("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", date7, date20, "Credit Card", "ItemPurchased{title='', email='', datePurchased=null}");
        java.lang.String str41 = course40.getCourseName();
        java.lang.String str42 = course40.getProfessorEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(date27);
// flaky:         org.junit.Assert.assertEquals(date27.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}" + "'", str41, "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str42, "ItemPurchased{title='', email='', datePurchased=null}");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}", "User [email=, password=, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}", (int) (byte) 1, "ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}");
        java.lang.String str7 = bookRequest6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}" + "'", str7, "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.yearPublished((int) (short) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder8 = magazineBuilder0.issueNumber(52);
        org.team4.model.items.Magazine magazine9 = magazineBuilder0.build();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder11 = magazineBuilder0.issueNumber((int) '#');
        org.team4.model.items.builder.MagazineBuilder magazineBuilder13 = magazineBuilder11.publisher("ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineBuilder8);
        org.junit.Assert.assertNotNull(magazine9);
        org.junit.Assert.assertNotNull(magazineBuilder11);
        org.junit.Assert.assertNotNull(magazineBuilder13);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", "", true);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder10 = courseTextBookBuilder0.isVirtual(false);
        org.team4.model.items.builder.BookBuilder bookBuilder12 = courseTextBookBuilder10.edition(10);
        org.team4.model.items.Book book13 = courseTextBookBuilder10.build();
        org.team4.model.items.decorator.ItemDecorator itemDecorator14 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) book13);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(courseTextBookBuilder10);
        org.junit.Assert.assertNotNull(bookBuilder12);
        org.junit.Assert.assertNotNull(book13);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        java.lang.String str4 = magazine3.getPublisher();
        int int5 = magazine3.getIssueNumber();
        java.lang.String str6 = magazine3.getPublisher();
        java.lang.String str7 = magazine3.getPublisher();
        java.lang.String str8 = magazine3.getPublisher();
        magazine3.setPrice(0.0d);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("hi!", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "", (long) (short) 100);
        long long6 = nonFaculty5.getUniversityID();
        boolean boolean7 = nonFaculty5.isValidated();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", (double) 10);
        double double4 = newsletter3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter7 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str8 = subscribeNewsletter7.getTitle();
        java.util.Date date9 = null;
        subscribeNewsletter7.setDateSubscribed(date9);
        java.util.Date date11 = subscribeNewsletter7.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter16 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str17 = subscribeNewsletter16.getEmail();
        java.util.Date date18 = subscribeNewsletter16.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter21 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str22 = subscribeNewsletter21.getEmail();
        java.util.Date date23 = subscribeNewsletter21.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter24 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date18, date23);
        org.team4.model.course.Course course27 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date11, date23, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.functionality.buy.ItemPurchased itemPurchased28 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", date23);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter35 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str36 = subscribeNewsletter35.getEmail();
        java.util.Date date37 = subscribeNewsletter35.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter40 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str41 = subscribeNewsletter40.getEmail();
        java.util.Date date42 = subscribeNewsletter40.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter43 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date37, date42);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter46 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter46.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter46.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter53 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date54 = null;
        subscribeNewsletter53.setDateSubscribed(date54);
        java.util.Date date56 = subscribeNewsletter53.getDateDue();
        subscribeNewsletter46.setDateDue(date56);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter58 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", date42, date56);
        org.team4.model.items.RentedItem rentedItem59 = new org.team4.model.items.RentedItem("User [email=, password=, name=hi!, type=, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date23, date56);
        java.lang.String str60 = rentedItem59.getISBN();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter63 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter63.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter63.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter70 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date71 = null;
        subscribeNewsletter70.setDateSubscribed(date71);
        java.util.Date date73 = subscribeNewsletter70.getDateDue();
        subscribeNewsletter63.setDateDue(date73);
        rentedItem59.setDueDate(date73);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter78 = new org.team4.functionality.subscriptions.SubscribeNewsletter("User [email=, password=, name=hi!, type=, validated=false]", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter81 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str82 = subscribeNewsletter81.getTitle();
        java.util.Date date83 = subscribeNewsletter81.getDateDue();
        subscribeNewsletter78.setDateSubscribed(date83);
        rentedItem59.setDueDate(date83);
        rentedItem59.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date88 = rentedItem59.getDueDate();
        java.util.Date date89 = rentedItem59.getRentDate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str60, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(date73);
// flaky:         org.junit.Assert.assertEquals(date73.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertNotNull(date83);
// flaky:         org.junit.Assert.assertEquals(date83.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertNotNull(date88);
// flaky:         org.junit.Assert.assertEquals(date88.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertNotNull(date89);
// flaky:         org.junit.Assert.assertEquals(date89.toString(), "Tue Apr 30 19:22:01 EDT 2024");
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter4 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        java.util.Date date5 = subscribeNewsletter4.getDateSubscribed();
        org.team4.functionality.buy.ItemPurchased itemPurchased8 = new org.team4.functionality.buy.ItemPurchased("ItemPurchased{title='', email='hi!', datePurchased=null}", "hi!");
        java.util.Date date9 = itemPurchased8.getDatePurchased();
        org.team4.model.items.RentedItem rentedItem10 = new org.team4.model.items.RentedItem("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", date5, date9);
        rentedItem10.setISBN("PayPal{email='ItemPurchased{title='', email='hi!', datePurchased=null}'}");
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Sat Mar 30 19:22:01 EDT 2024");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Sat Mar 30 19:22:01 EDT 2024");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        boolean boolean4 = debitCard3.correctLength();
        boolean boolean5 = debitCard3.correctLength();
        org.team4.model.user.Student student11 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str12 = student11.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase13 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student11);
        org.team4.functionality.buy.ProcessPayment processPayment14 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) debitCard3, itemToPurchase13);
        java.lang.String str15 = processPayment14.toString();
        java.lang.String str16 = processPayment14.toString();
        java.lang.String str17 = processPayment14.toString();
        java.lang.String str18 = processPayment14.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("");
        org.team4.model.user.Student student7 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str8 = student7.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase9 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student7);
        org.team4.model.items.Newsletter newsletter10 = itemToPurchase9.getNewsletter();
        org.team4.functionality.buy.ProcessPayment processPayment11 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet1, itemToPurchase9);
        org.team4.model.items.Item item12 = itemToPurchase9.getItem();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        org.team4.model.paymentmodes.CreditCard creditCard14 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        boolean boolean15 = creditCard14.notExpired();
        boolean boolean16 = creditCard14.isValid();
        boolean boolean17 = creditCard14.isValid();
        boolean boolean18 = book9.equals((java.lang.Object) creditCard14);
        int int19 = book9.getYearPublished();
        double double20 = book9.getPrice();
        java.lang.String str21 = book9.getAuthor();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder15 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder17 = courseTextBookBuilder15.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder19 = courseTextBookBuilder15.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder21 = courseTextBookBuilder15.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder23 = courseTextBookBuilder15.quantity((int) (short) 100);
        java.util.Date date25 = null;
        java.util.Date date26 = null;
        org.team4.model.course.Course course29 = new org.team4.model.course.Course("hi!", date25, date26, "", "hi!");
        java.util.Date date30 = course29.getEndDate();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder31 = courseTextBookBuilder15.course(course29);
        org.team4.model.user.Student student37 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str38 = student37.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase39 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student37);
        java.lang.String str40 = student37.toString();
        java.lang.String str41 = student37.getEmail();
        java.lang.String str42 = student37.toString();
        course29.enrollStudent(student37);
        org.team4.model.course.CourseTextBook courseTextBook45 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook9, "hi!", 52, "User [email=, password=, name=hi!, type=, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", (int) 'a', course29, false);
        org.team4.model.user.Student student50 = new org.team4.model.user.Student("", "", "hi!", "");
        java.util.ArrayList<java.lang.String> strList51 = student50.getCourses();
        courseTextBook45.makeCopies(student50);
        java.util.List<org.team4.model.user.Student> studentList53 = courseTextBook45.getStudentsWithCopies();
        int int54 = courseTextBook45.getQuantity();
        org.team4.model.course.Course course55 = courseTextBook45.getCourse();
        java.lang.String str56 = courseTextBook45.getTitle();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(courseTextBook9);
        org.junit.Assert.assertNotNull(bookBuilder17);
        org.junit.Assert.assertNotNull(bookItemBuilder19);
        org.junit.Assert.assertNotNull(bookBuilder21);
        org.junit.Assert.assertNotNull(bookItemBuilder23);
        org.junit.Assert.assertNull(date30);
        org.junit.Assert.assertNotNull(courseTextBookBuilder31);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str40, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str42, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertNull(strList51);
        org.junit.Assert.assertNotNull(studentList53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(course55);
        org.junit.Assert.assertNull(str56);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
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
        java.lang.String str13 = courseTextBook8.getAuthor();
        boolean boolean14 = courseTextBook8.isRentable();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertNotNull(studentList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(studentList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("ItemToPurchase{item=null, user=User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemPurchased{title='', email='', datePurchased=null}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, validated=false], newsletter=null}", "PayPal{email='PayPal'}", "PayPal{email='Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}'}", "ItemPurchased{title='', email='hi!', datePurchased=null}", (long) 'a');
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemToPurchase{item=null, user=User [email=, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=PayPal, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter11 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str12 = subscribeNewsletter11.getEmail();
        java.util.Date date13 = subscribeNewsletter11.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter16 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str17 = subscribeNewsletter16.getEmail();
        java.util.Date date18 = subscribeNewsletter16.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter19 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date13, date18);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter22 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter22.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter22.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter29 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date30 = null;
        subscribeNewsletter29.setDateSubscribed(date30);
        java.util.Date date32 = subscribeNewsletter29.getDateDue();
        subscribeNewsletter22.setDateDue(date32);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter34 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", date18, date32);
        java.util.Date date35 = subscribeNewsletter34.getDateDue();
        org.team4.functionality.buy.ItemPurchased itemPurchased36 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=null}", "", date35);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter40 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str41 = subscribeNewsletter40.getTitle();
        java.util.Date date42 = null;
        subscribeNewsletter40.setDateSubscribed(date42);
        java.util.Date date44 = subscribeNewsletter40.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter47 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter47.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter53 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str54 = subscribeNewsletter53.getTitle();
        java.util.Date date55 = null;
        subscribeNewsletter53.setDateSubscribed(date55);
        java.util.Date date57 = subscribeNewsletter53.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter62 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str63 = subscribeNewsletter62.getEmail();
        java.util.Date date64 = subscribeNewsletter62.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter67 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str68 = subscribeNewsletter67.getEmail();
        java.util.Date date69 = subscribeNewsletter67.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter70 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date64, date69);
        org.team4.model.course.Course course73 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date57, date69, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        subscribeNewsletter47.setDateSubscribed(date57);
        org.team4.model.course.Course course77 = new org.team4.model.course.Course("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", date44, date57, "Credit Card", "ItemPurchased{title='', email='', datePurchased=null}");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter78 = new org.team4.functionality.subscriptions.SubscribeNewsletter("Mobile Wallet", "SubscribeNewsletter{title='Credit Card', email='hi!', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}", date35, date57);
        java.util.Date date79 = subscribeNewsletter78.getDateDue();
        java.util.Date date80 = null;
        org.team4.model.course.Course course83 = new org.team4.model.course.Course("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}", date79, date80, "SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', email='SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}', dateSubscribed=Tue Apr 30 19:22:01 EDT 2024, dateDue=Tue Apr 30 19:22:01 EDT 2024}", "ItemPurchased{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=null}', email='', datePurchased=Tue Apr 30 19:21:57 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertNotNull(date35);
// flaky:         org.junit.Assert.assertEquals(date35.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertNotNull(date57);
// flaky:         org.junit.Assert.assertEquals(date57.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertNotNull(date64);
// flaky:         org.junit.Assert.assertEquals(date64.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertNotNull(date69);
// flaky:         org.junit.Assert.assertEquals(date69.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertNotNull(date79);
// flaky:         org.junit.Assert.assertEquals(date79.toString(), "Tue Apr 30 19:22:01 EDT 2024");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        dVD1.setQuantity((int) (short) 1);
        dVD1.setQuantity((int) ' ');
        boolean boolean9 = dVD1.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD1);
        org.team4.model.items.Item item11 = rentableItemDecorator10.getItem();
        org.team4.model.items.Item item12 = new org.team4.model.items.Item(item11);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter21 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str22 = subscribeNewsletter21.getTitle();
        java.util.Date date23 = null;
        subscribeNewsletter21.setDateSubscribed(date23);
        java.util.Date date25 = subscribeNewsletter21.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter30 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str31 = subscribeNewsletter30.getEmail();
        java.util.Date date32 = subscribeNewsletter30.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter35 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str36 = subscribeNewsletter35.getEmail();
        java.util.Date date37 = subscribeNewsletter35.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter38 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date32, date37);
        org.team4.model.course.Course course41 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date25, date37, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.model.course.CourseTextBook courseTextBook43 = new org.team4.model.course.CourseTextBook(item12, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", (int) (short) 1, "hi!", "PayPal", 52, course41, false);
        org.team4.model.course.Course course44 = courseTextBook43.getCourse();
        org.team4.model.course.Course course45 = courseTextBook43.getCourse();
        org.team4.model.user.Visitor visitor50 = new org.team4.model.user.Visitor("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "");
        boolean boolean51 = courseTextBook43.equals((java.lang.Object) "");
        org.team4.model.user.Student student56 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str57 = student56.getType();
        org.team4.model.user.Student student62 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str63 = student62.getType();
        java.lang.String[] strArray65 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        student62.setCourses(strList66);
        student56.setCourses(strList66);
        java.lang.String str70 = student56.getEmail();
        courseTextBook43.removeCopies(student56);
        java.util.List<org.team4.model.user.Student> studentList72 = courseTextBook43.getStudentsWithCopies();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator73 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook43);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 19:22:01 EDT 2024");
        org.junit.Assert.assertNotNull(course44);
        org.junit.Assert.assertNotNull(course45);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(studentList72);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        org.team4.model.items.Magazine magazine13 = new org.team4.model.items.Magazine((org.team4.model.items.Item) book9, "User [email=hi!, password=hi!, name=hi!, type=, validated=false]", 10);
        org.team4.model.items.Magazine magazine16 = new org.team4.model.items.Magazine((org.team4.model.items.Item) book9, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=null}", 32);
        java.lang.String str17 = book9.getAuthor();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.paymentmodes.MobileWallet mobileWallet9 = new org.team4.model.paymentmodes.MobileWallet("");
        java.lang.String str10 = mobileWallet9.getMode();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet9);
        boolean boolean12 = mobileWallet9.isValid();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PayPal" + "'", str10, "PayPal");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder3 = dVDBuilder0.title("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder5 = dVDBuilder0.duration((double) 1403553L);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNotNull(dVDItemBuilder3);
        org.junit.Assert.assertNotNull(dVDBuilder5);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=User [email=, password=, name=hi!, type=, validated=false], name=hi!, type=PayPal, validated=true]", (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        int int3 = dVD1.getQuantity();
        java.lang.String str4 = dVD1.getTitle();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.quantity((int) (short) 100);
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder11 = courseTextBookBuilder0.author("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder13 = courseTextBookBuilder0.title("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:57 EDT 2024, dateDue=Tue Apr 30 19:21:57 EDT 2024}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(courseTextBook9);
        org.junit.Assert.assertNotNull(bookBuilder11);
        org.junit.Assert.assertNotNull(bookItemBuilder13);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.genre("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder7 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder9 = courseTextBookBuilder7.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder11 = courseTextBookBuilder7.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder13 = courseTextBookBuilder7.isVirtual(true);
        org.team4.model.items.Book book14 = courseTextBookBuilder13.build();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder15 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder17 = courseTextBookBuilder15.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder19 = courseTextBookBuilder15.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder21 = courseTextBookBuilder15.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder23 = courseTextBookBuilder15.price((double) (-1L));
        org.team4.model.items.builder.BookBuilder bookBuilder25 = courseTextBookBuilder15.publisher("hi!");
        boolean boolean26 = book14.equals((java.lang.Object) bookBuilder25);
        java.util.Date date33 = null;
        java.util.Date date34 = null;
        org.team4.model.course.Course course37 = new org.team4.model.course.Course("hi!", date33, date34, "", "hi!");
        org.team4.model.user.Student student42 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str43 = student42.getType();
        course37.enrollStudent(student42);
        java.lang.String str45 = course37.getCourseName();
        java.lang.String str46 = course37.getCourseTextBookISBN();
        org.team4.model.course.CourseTextBook courseTextBook48 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) book14, "PayPal", (int) ' ', "ItemPurchased{title='', email='', datePurchased=null}", "Credit Card", (int) (short) 100, course37, true);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder49 = courseTextBookBuilder0.course(course37);
        org.team4.model.items.builder.BookBuilder bookBuilder51 = courseTextBookBuilder0.genre("");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder53 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder55 = courseTextBookBuilder0.price((double) 2166056L);
        org.team4.model.course.CourseTextBook courseTextBook56 = courseTextBookBuilder0.build();
        int int57 = courseTextBook56.getNoOfPages();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder9);
        org.junit.Assert.assertNotNull(bookItemBuilder11);
        org.junit.Assert.assertNotNull(courseTextBookBuilder13);
        org.junit.Assert.assertNotNull(book14);
        org.junit.Assert.assertNotNull(bookBuilder17);
        org.junit.Assert.assertNotNull(bookItemBuilder19);
        org.junit.Assert.assertNotNull(bookBuilder21);
        org.junit.Assert.assertNotNull(bookItemBuilder23);
        org.junit.Assert.assertNotNull(bookBuilder25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(courseTextBookBuilder49);
        org.junit.Assert.assertNotNull(bookBuilder51);
        org.junit.Assert.assertNotNull(courseTextBookBuilder53);
        org.junit.Assert.assertNotNull(bookItemBuilder55);
        org.junit.Assert.assertNotNull(courseTextBook56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal", "Credit Card", "");
        java.util.ArrayList<java.lang.String> strList5 = student4.getCourses();
        org.junit.Assert.assertNull(strList5);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.team4.model.user.User user4 = new org.team4.model.user.User("User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=User [email=, password=, name=hi!, type=, validated=false], name=hi!, type=PayPal, validated=true]", "ItemPurchased{title='', email='hi!', datePurchased=null}", "SubscribeNewsletter{title='ItemPurchased{title='', email='', datePurchased=null}', email='', dateSubscribed=Tue Apr 30 19:21:58 EDT 2024, dateDue=Tue Apr 30 19:21:58 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.title("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.title("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder3.title("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        java.lang.String str4 = magazine3.getPublisher();
        int int5 = magazine3.getIssueNumber();
        java.lang.String str6 = magazine3.getPublisher();
        java.lang.String str7 = magazine3.getPublisher();
        org.team4.model.user.Manager manager13 = new org.team4.model.user.Manager("User [email=, password=, name=hi!, type=hi!, validated=false]", "User [email=, password=hi!, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=, validated=false]", "PayPal", "User [email=, password=, name=hi!, type=, validated=false]", 5930499L);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase14 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) magazine3, (org.team4.model.user.User) manager13);
        java.lang.String str15 = magazine3.getPublisher();
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "User [email=User [email=, password=, name=hi!, type=, validated=false], password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=, validated=false]", false);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.quantity((int) (short) 100);
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        org.team4.model.course.Course course14 = new org.team4.model.course.Course("hi!", date10, date11, "", "hi!");
        java.util.Date date15 = course14.getEndDate();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder16 = courseTextBookBuilder0.course(course14);
        java.util.Date date18 = null;
        java.util.Date date19 = null;
        org.team4.model.course.Course course22 = new org.team4.model.course.Course("hi!", date18, date19, "", "hi!");
        org.team4.model.user.Student student27 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str28 = student27.getType();
        course22.enrollStudent(student27);
        java.lang.String str30 = course22.getProfessorEmail();
        java.lang.String str31 = course22.getProfessorEmail();
        java.lang.String str32 = course22.getCourseTextBookISBN();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder33 = courseTextBookBuilder16.course(course22);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder35 = courseTextBookBuilder16.price((double) 'a');
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNotNull(courseTextBookBuilder16);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(courseTextBookBuilder33);
        org.junit.Assert.assertNotNull(bookItemBuilder35);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder0.email("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.email("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder4.author("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:57 EDT 2024, dateDue=Tue Apr 30 19:21:57 EDT 2024}");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date3 = null;
        subscribeNewsletter2.setDateSubscribed(date3);
        subscribeNewsletter2.setEmail("Debit Card");
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("ItemToPurchase{item=null, user=User [email=, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=PayPal, validated=false], newsletter=null}", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "hi!", 180104L);
    }
}
