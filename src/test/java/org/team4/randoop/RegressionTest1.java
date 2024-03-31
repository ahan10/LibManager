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
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}", (double) 4091426L);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}', email='hi!', dateSubscribed=null, dateDue=Tue Apr 30 20:32:02 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}", "Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}", true);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDBuilder2.quantity(10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDItemBuilder6.quantity((int) ' ');
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
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
        java.lang.String str42 = courseTextBook41.getPublisher();
        org.team4.model.user.Student student43 = null;
        // The following exception was thrown during execution in test generation
        try {
            courseTextBook41.removeCopies(student43);
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
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Credit Card" + "'", str42, "Credit Card");
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date3 = null;
        subscribeNewsletter2.setDateSubscribed(date3);
        java.lang.String str5 = subscribeNewsletter2.getTitle();
        java.util.Date date6 = subscribeNewsletter2.getDateDue();
        java.util.Date date7 = null;
        subscribeNewsletter2.setDateDue(date7);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 30 20:32:03 EDT 2024");
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "User [email=, password=, name=hi!, type=, validated=false]", "User [email=, password=, name=hi!, type=, validated=false]", (long) (byte) 1);
        manager5.setEmail("PayPal");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("Credit Card", "", "PayPal", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        nonFaculty4.setEmail("Debit Card");
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}', email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', dateSubscribed=Sat Mar 30 20:32:00 EDT 2024, dateDue=Tue Apr 30 20:32:00 EDT 2024}", "PayPal", "Credit Card", "User [email=, password=, name=hi!, type=hi!, validated=false]", false);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.ISBN("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder0.genre("");
        org.team4.model.items.builder.DVDBuilder dVDBuilder8 = dVDBuilder0.genre("User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, type=PayPal, validated=true]");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDBuilder8);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
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
        org.team4.functionality.buy.ItemPurchased itemPurchased28 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", date23);
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
        rentedItem59.setTitle("ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter90 = new org.team4.functionality.subscriptions.SubscribeNewsletter("User [email=, password=, name=hi!, type=, validated=false]", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter93 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str94 = subscribeNewsletter93.getTitle();
        java.util.Date date95 = subscribeNewsletter93.getDateDue();
        subscribeNewsletter90.setDateSubscribed(date95);
        rentedItem59.setDueDate(date95);
        java.lang.String str98 = rentedItem59.getISBN();
        java.util.Date date99 = rentedItem59.getDueDate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Apr 30 20:32:03 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Tue Apr 30 20:32:03 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 20:32:03 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 20:32:03 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 20:32:03 EDT 2024");
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Tue Apr 30 20:32:03 EDT 2024");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str60, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(date73);
// flaky:         org.junit.Assert.assertEquals(date73.toString(), "Tue Apr 30 20:32:03 EDT 2024");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertNotNull(date83);
// flaky:         org.junit.Assert.assertEquals(date83.toString(), "Tue Apr 30 20:32:03 EDT 2024");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "hi!" + "'", str94, "hi!");
        org.junit.Assert.assertNotNull(date95);
// flaky:         org.junit.Assert.assertEquals(date95.toString(), "Tue Apr 30 20:32:03 EDT 2024");
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str98, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(date99);
// flaky:         org.junit.Assert.assertEquals(date99.toString(), "Tue Apr 30 20:32:03 EDT 2024");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("");
        org.team4.model.user.Student student7 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str8 = student7.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase9 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student7);
        org.team4.model.items.Newsletter newsletter10 = itemToPurchase9.getNewsletter();
        org.team4.functionality.buy.ProcessPayment processPayment11 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet1, itemToPurchase9);
        java.lang.String str12 = mobileWallet1.getMode();
        boolean boolean13 = mobileWallet1.isValid();
        java.lang.String str14 = mobileWallet1.getMode();
        boolean boolean15 = mobileWallet1.isValid();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PayPal" + "'", str12, "PayPal");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PayPal" + "'", str14, "PayPal");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.yearPublished((int) (short) 0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineBuilder0.quantity((int) (short) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder10 = magazineBuilder0.price((double) (short) 10);
        org.team4.model.items.Magazine magazine11 = magazineBuilder0.build();
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
        org.junit.Assert.assertNotNull(magazineItemBuilder10);
        org.junit.Assert.assertNotNull(magazine11);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.team4.model.user.Manager manager4 = new org.team4.model.user.Manager("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}", "Mobile Wallet");
        boolean boolean5 = manager4.isValidated();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.yearPublished((int) (short) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder8 = magazineBuilder0.issueNumber(52);
        org.team4.model.items.Magazine magazine9 = magazineBuilder0.build();
        int int10 = magazine9.getIssueNumber();
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineBuilder8);
        org.junit.Assert.assertNotNull(magazine9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("ItemPurchased{title='', email='hi!', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "", "ItemPurchased{title='', email='', datePurchased=null}", 0, "User [email=, password=, name=hi!, type=, validated=false]");
        java.lang.String str7 = bookRequest6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str7, "ItemPurchased{title='', email='hi!', datePurchased=null}");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
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
        long long33 = faculty17.getFacultyID();
        faculty17.setFacultyID(68034L);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
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
        java.lang.String str20 = course15.getProfessorEmail();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = course15.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.toString()\" because \"this.startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(courseTextBookBuilder19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
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
        org.team4.functionality.buy.ItemPurchased itemPurchased28 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", date23);
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
        rentedItem59.setISBN("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        rentedItem59.setTitle("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        java.lang.String str64 = rentedItem59.getISBN();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Apr 30 20:32:03 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Tue Apr 30 20:32:03 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 20:32:03 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 20:32:03 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 20:32:03 EDT 2024");
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Tue Apr 30 20:32:03 EDT 2024");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}" + "'", str64, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.booktype("Credit Card");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder3.ISBN("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder9 = bookRequestBuilder7.booktype("ProcessPayment{modes=null, itemToPurchase=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}}");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
        org.junit.Assert.assertNotNull(bookRequestBuilder9);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder0.price((double) 10);
        org.team4.model.course.CourseTextBook courseTextBook11 = courseTextBookBuilder0.build();
        java.util.List<org.team4.model.user.Student> studentList12 = courseTextBook11.getStudentsWithCopies();
        int int13 = courseTextBook11.getYearPublished();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(courseTextBook11);
        org.junit.Assert.assertNotNull(studentList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        boolean boolean4 = debitCard3.notExpired();
        boolean boolean5 = debitCard3.correctLength();
        boolean boolean6 = debitCard3.correctLength();
        java.lang.String str7 = debitCard3.getMode();
        boolean boolean8 = debitCard3.notExpired();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Debit Card" + "'", str7, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.DVDBuilder dVDBuilder7 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD8 = dVDBuilder7.build();
        java.lang.String str9 = dVD8.getGenre();
        boolean boolean10 = dVD8.isPurchasable();
        double double11 = dVD8.getDuration();
        dVD8.setQuantity((int) (short) 1);
        dVD8.setQuantity((int) ' ');
        boolean boolean16 = dVD8.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator17 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD8);
        org.team4.model.items.Item item18 = rentableItemDecorator17.getItem();
        org.team4.model.items.Item item19 = new org.team4.model.items.Item(item18);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter28 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str29 = subscribeNewsletter28.getTitle();
        java.util.Date date30 = null;
        subscribeNewsletter28.setDateSubscribed(date30);
        java.util.Date date32 = subscribeNewsletter28.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter37 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str38 = subscribeNewsletter37.getEmail();
        java.util.Date date39 = subscribeNewsletter37.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter42 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str43 = subscribeNewsletter42.getEmail();
        java.util.Date date44 = subscribeNewsletter42.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter45 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date39, date44);
        org.team4.model.course.Course course48 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date32, date44, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.model.course.CourseTextBook courseTextBook50 = new org.team4.model.course.CourseTextBook(item19, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", (int) (short) 1, "hi!", "PayPal", 52, course48, false);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder51 = courseTextBookBuilder0.course(course48);
        org.team4.model.items.Book book52 = courseTextBookBuilder51.build();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(dVD8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(item18);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 20:32:03 EDT 2024");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Tue Apr 30 20:32:03 EDT 2024");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Tue Apr 30 20:32:03 EDT 2024");
        org.junit.Assert.assertNotNull(courseTextBookBuilder51);
        org.junit.Assert.assertNotNull(book52);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder3 = dVDBuilder0.genre("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder5 = dVDBuilder0.yearPublished((int) 'a');
        org.team4.model.items.builder.DVDBuilder dVDBuilder7 = dVDBuilder0.duration((double) 0.0f);
        org.team4.model.items.builder.DVDBuilder dVDBuilder9 = dVDBuilder7.genre("Debit Card");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder11 = dVDBuilder7.quantity((int) '#');
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNotNull(dVDBuilder3);
        org.junit.Assert.assertNotNull(dVDItemBuilder5);
        org.junit.Assert.assertNotNull(dVDBuilder7);
        org.junit.Assert.assertNotNull(dVDBuilder9);
        org.junit.Assert.assertNotNull(dVDItemBuilder11);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", 0.0d);
        org.team4.model.items.builder.DVDBuilder dVDBuilder4 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD5 = dVDBuilder4.build();
        java.lang.String str6 = dVD5.getGenre();
        boolean boolean7 = dVD5.isPurchasable();
        double double8 = dVD5.getDuration();
        dVD5.setQuantity((int) (short) 1);
        dVD5.setQuantity((int) ' ');
        boolean boolean13 = dVD5.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator14 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD5);
        org.team4.model.items.Item item15 = rentableItemDecorator14.getItem();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator16 = new org.team4.model.items.decorator.PurchasableItemDecorator(item15);
        org.team4.model.user.Manager manager22 = new org.team4.model.user.Manager("", "", "", "hi!", false);
        manager22.setValidated(false);
        manager22.setName("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase27 = new org.team4.functionality.buy.ItemToPurchase(item15, (org.team4.model.user.User) manager22);
        java.lang.String str28 = manager22.getEmail();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase29 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) manager22);
        java.lang.String str30 = manager22.getName();
        org.junit.Assert.assertNotNull(dVD5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("Credit Card");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.paymentmodes.MobileWallet mobileWallet9 = new org.team4.model.paymentmodes.MobileWallet("");
        java.lang.String str10 = mobileWallet9.getMode();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet9);
        org.team4.model.items.Item item12 = purchaseComplete11.getItem();
        double double13 = purchaseComplete11.getAmount();
        org.team4.model.user.User user14 = purchaseComplete11.getUser();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PayPal" + "'", str10, "PayPal");
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(user14);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
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
        org.team4.model.course.CourseTextBook courseTextBook68 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) book7, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}", (int) '#', "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "Debit Card", (int) 'a', course55, true);
        int int69 = book7.getEdition();
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
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder4.yearPublished((int) (byte) -1);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder8 = magazineBuilder4.publisher("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder10 = magazineBuilder8.price((double) 4978267L);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder12 = magazineBuilder8.issueNumber((int) (byte) 10);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineBuilder8);
        org.junit.Assert.assertNotNull(magazineItemBuilder10);
        org.junit.Assert.assertNotNull(magazineBuilder12);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder6 = courseTextBookBuilder0.quantity(0);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = bookBuilder8.yearPublished(97);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookItemBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        book7.setPrice((double) 0L);
        int int11 = book7.getEdition();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder12 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder14 = courseTextBookBuilder12.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder16 = courseTextBookBuilder12.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder18 = courseTextBookBuilder12.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder20 = courseTextBookBuilder12.price((double) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder22 = courseTextBookBuilder12.price((double) 10);
        org.team4.model.course.CourseTextBook courseTextBook23 = courseTextBookBuilder12.build();
        org.team4.model.items.builder.BookBuilder bookBuilder25 = courseTextBookBuilder12.hasHardCopy(false);
        boolean boolean26 = book7.equals((java.lang.Object) bookBuilder25);
        int int27 = book7.getEdition();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(bookBuilder14);
        org.junit.Assert.assertNotNull(bookItemBuilder16);
        org.junit.Assert.assertNotNull(bookBuilder18);
        org.junit.Assert.assertNotNull(bookItemBuilder20);
        org.junit.Assert.assertNotNull(bookItemBuilder22);
        org.junit.Assert.assertNotNull(courseTextBook23);
        org.junit.Assert.assertNotNull(bookBuilder25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder0.email("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder0.edition(1);
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("hi!");
        java.lang.String str2 = mobileWallet1.getMode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PayPal" + "'", str2, "PayPal");
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.team4.model.user.User user5 = new org.team4.model.user.User("", "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:32:03 EDT 2024}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", true);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
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
        boolean boolean46 = purchasableItemDecorator45.isPurchasable();
        boolean boolean47 = purchasableItemDecorator45.isPurchasable();
        java.util.Date date54 = null;
        java.util.Date date55 = null;
        org.team4.model.course.Course course58 = new org.team4.model.course.Course("hi!", date54, date55, "", "hi!");
        java.lang.String str59 = course58.getProfessorEmail();
        java.util.Date date60 = course58.getStartDate();
        java.lang.String str61 = course58.getProfessorEmail();
        java.util.Date date62 = course58.getStartDate();
        org.team4.model.course.CourseTextBook courseTextBook64 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) purchasableItemDecorator45, "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}", (int) (short) 1, "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}", 32, course58, true);
        org.team4.model.user.Student student70 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str71 = student70.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase72 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student70);
        student70.setType("User [email=, password=, name=hi!, type=, validated=false]");
        // The following exception was thrown during execution in test generation
        try {
            courseTextBook64.removeCopies(student70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Tue Apr 30 20:32:03 EDT 2024");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 20:32:03 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 20:32:03 EDT 2024");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNull(date60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNull(date62);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("hi!", "hi!", "hi!", "");
        nonFaculty5.setUniversityID((long) (short) 100);
        long long8 = nonFaculty5.getUniversityID();
        nonFaculty5.setUniversityID((long) (short) 100);
        boolean boolean11 = nonFaculty5.isValidated();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase12 = new org.team4.functionality.buy.ItemToPurchase((double) '#', (org.team4.model.user.User) nonFaculty5);
        nonFaculty5.setUniversityID((long) 100);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        java.lang.String str8 = student5.toString();
        student5.setPassword("");
        java.lang.String str11 = student5.getType();
        org.team4.model.user.Faculty faculty16 = new org.team4.model.user.Faculty("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemPurchased{title='', email='', datePurchased=null}", "", "User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.user.Student student21 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str22 = student21.getType();
        org.team4.model.user.Student student27 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str28 = student27.getType();
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        student27.setCourses(strList31);
        student21.setCourses(strList31);
        faculty16.setCourses(strList31);
        org.team4.model.user.Student student45 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str46 = student45.getType();
        java.lang.String[] strArray48 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        student45.setCourses(strList49);
        org.team4.model.user.Faculty faculty52 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", (long) (byte) -1, strList49);
        java.lang.String str53 = faculty52.getName();
        faculty52.setFacultyID((long) (short) 1);
        java.util.Date date57 = null;
        java.util.Date date58 = null;
        org.team4.model.course.Course course61 = new org.team4.model.course.Course("hi!", date57, date58, "", "hi!");
        java.util.Date date62 = course61.getEndDate();
        java.lang.String str63 = course61.getProfessorEmail();
        java.lang.String str64 = course61.getProfessorEmail();
        org.team4.model.user.Student student70 = new org.team4.model.user.Student("", "", "hi!", "");
        student70.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase73 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student70);
        java.lang.String str74 = student70.getEmail();
        course61.enrollStudent(student70);
        org.team4.model.user.Faculty faculty81 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "hi!", "", "", false);
        faculty81.setFacultyID((long) (byte) 1);
        org.team4.model.user.Student student88 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str89 = student88.getType();
        java.lang.String[] strArray91 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList92 = new java.util.ArrayList<java.lang.String>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList92, strArray91);
        student88.setCourses(strList92);
        faculty81.setCourses(strList92);
        student70.setCourses(strList92);
        faculty52.setCourses(strList92);
        faculty16.setCourses(strList92);
        student5.setCourses(strList92);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str8, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str53, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertNull(date62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.DVD dVD10 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Credit Card", 0.0d);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator11 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD10);
        dVD10.setPurchaseable(true);
        dVD10.setPrice((double) 'a');
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
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
        int int13 = rentableItemDecorator10.getQuantity();
        boolean boolean14 = rentableItemDecorator10.isRentable();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator15 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) rentableItemDecorator10);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertNotNull(item12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
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
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertNotNull(studentList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(studentList11);
        org.junit.Assert.assertNull(course12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(studentList15);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
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
        org.team4.model.items.DVD dVD20 = new org.team4.model.items.DVD((org.team4.model.items.Item) dVD1, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", (double) '#');
        org.team4.model.items.decorator.ItemDecorator itemDecorator21 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) dVD1);
        org.team4.model.items.decorator.ItemDecorator itemDecorator22 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) itemDecorator21);
        org.team4.model.items.Item item23 = new org.team4.model.items.Item((org.team4.model.items.Item) itemDecorator22);
        org.team4.model.items.Magazine magazine26 = new org.team4.model.items.Magazine((org.team4.model.items.Item) itemDecorator22, "SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Sat Mar 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}", 52);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        boolean boolean8 = book7.hasHardCopy();
        boolean boolean9 = book7.hasSoftCopy();
        java.lang.String str10 = book7.getGenre();
        book7.setPurchaseable(true);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.DVD dVD10 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Credit Card", 0.0d);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator11 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD10);
        org.team4.model.items.Item item12 = rentableItemDecorator11.getItem();
        rentableItemDecorator11.setQuantity((int) (short) 1);
        java.lang.String str15 = rentableItemDecorator11.getTitle();
        org.team4.model.items.Item item16 = rentableItemDecorator11.getItem();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(item12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(item16);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "PayPal", "");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("hi!", "SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}', email='hi!', dateSubscribed=null, dateDue=Tue Apr 30 20:32:02 EDT 2024}", "SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}', email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', dateSubscribed=Sat Mar 30 20:32:00 EDT 2024, dateDue=Tue Apr 30 20:32:00 EDT 2024}", "Credit Card", (long) (-1));
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
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
        org.team4.model.items.DVD dVD20 = new org.team4.model.items.DVD((org.team4.model.items.Item) dVD1, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", (double) '#');
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator21 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD20);
        org.team4.model.items.Magazine magazine24 = new org.team4.model.items.Magazine((org.team4.model.items.Item) dVD20, "Debit Card", (int) (short) 100);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        java.lang.String str8 = student5.toString();
        student5.setPassword("");
        java.lang.String str11 = student5.getType();
        java.util.ArrayList<java.lang.String> strList12 = student5.getCourses();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str8, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strList12);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str3 = subscribeNewsletter2.getTitle();
        java.util.Date date4 = null;
        subscribeNewsletter2.setDateSubscribed(date4);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter8 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}");
        java.util.Date date9 = subscribeNewsletter8.getDateSubscribed();
        subscribeNewsletter2.setDateDue(date9);
        subscribeNewsletter2.setTitle("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        java.lang.String str13 = subscribeNewsletter2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Sat Mar 30 20:32:04 EDT 2024");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook8 = courseTextBookBuilder6.build();
        java.util.List<org.team4.model.user.Student> studentList9 = courseTextBook8.getStudentsWithCopies();
        org.team4.model.items.decorator.ItemDecorator itemDecorator10 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook8);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertNotNull(studentList9);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.team4.model.paymentmodes.PaymentValidator paymentValidator0 = null;
        org.team4.model.user.Visitor visitor6 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor6);
        java.lang.String str8 = itemToPurchase7.toString();
        java.lang.String str9 = itemToPurchase7.toString();
        org.team4.functionality.buy.ProcessPayment processPayment10 = new org.team4.functionality.buy.ProcessPayment(paymentValidator0, itemToPurchase7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str8, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str9, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.team4.model.user.User user5 = new org.team4.model.user.User("ItemPurchased{title='', email='hi!', datePurchased=null}", "SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Sat Mar 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}", false);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder10 = courseTextBookBuilder0.isVirtual(false);
        org.team4.model.items.Book book11 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder13 = courseTextBookBuilder0.isVirtual(false);
        org.team4.model.items.builder.BookBuilder bookBuilder15 = courseTextBookBuilder13.genre("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder17 = courseTextBookBuilder13.title("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder19 = bookItemBuilder17.title("User [email=, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=PayPal, validated=false]");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder21 = bookItemBuilder19.price((double) 4978267L);
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
        org.junit.Assert.assertNotNull(bookItemBuilder21);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter4 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date5 = null;
        subscribeNewsletter4.setDateSubscribed(date5);
        java.util.Date date7 = subscribeNewsletter4.getDateDue();
        org.team4.functionality.buy.ItemPurchased itemPurchased8 = new org.team4.functionality.buy.ItemPurchased("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", date7);
        java.util.Date date9 = itemPurchased8.getDatePurchased();
        java.util.Date date10 = itemPurchased8.getDatePurchased();
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Tue Apr 30 20:32:04 EDT 2024");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Tue Apr 30 20:32:04 EDT 2024");
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Tue Apr 30 20:32:04 EDT 2024");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.team4.model.user.User user5 = new org.team4.model.user.User("", "", "", "ProcessPayment{modes=null, itemToPurchase=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}}", true);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        java.util.ArrayList<java.lang.String> strList5 = null;
        org.team4.model.user.Faculty faculty6 = new org.team4.model.user.Faculty("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "", "ItemPurchased{title='', email='hi!', datePurchased=null}", (long) (short) -1, strList5);
        boolean boolean7 = faculty6.isValidated();
        java.lang.String str8 = faculty6.getEmail();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}" + "'", str8, "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}", "SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Sat Mar 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}", false);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.paymentmodes.MobileWallet mobileWallet9 = new org.team4.model.paymentmodes.MobileWallet("");
        java.lang.String str10 = mobileWallet9.getMode();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet9);
        org.team4.model.items.Item item12 = purchaseComplete11.getItem();
        org.team4.model.items.Newsletter newsletter13 = purchaseComplete11.getNewsletter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PayPal" + "'", str10, "PayPal");
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(newsletter13);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("PayPal{email='PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}'}", "PayPal", "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:32:03 EDT 2024}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.DVD dVD10 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Credit Card", 0.0d);
        int int11 = book7.getNoOfPages();
        book7.setPrice((double) (-1L));
        java.lang.String str14 = book7.getAuthor();
        double double15 = book7.getPrice();
        java.lang.String str16 = book7.getGenre();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook8 = courseTextBookBuilder6.build();
        java.util.List<org.team4.model.user.Student> studentList9 = courseTextBook8.getStudentsWithCopies();
        int int10 = courseTextBook8.getNoOfPages();
        java.util.List<org.team4.model.user.Student> studentList11 = courseTextBook8.getStudentsWithCopies();
        org.team4.model.items.DVD dVD14 = new org.team4.model.items.DVD((org.team4.model.items.Item) courseTextBook8, "PayPal", (double) 100L);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertNotNull(studentList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(studentList11);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("User [email=, password=, name=hi!, type=hi!, validated=false]", "hi!", (double) 1);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "User [email=, password=, name=hi!, type=hi!, validated=false]", "Debit Card", "PayPal{email='PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}'}", (long) (-1));
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.DVD dVD10 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Credit Card", 0.0d);
        int int11 = book7.getNoOfPages();
        book7.setPrice((double) (-1L));
        java.lang.String str14 = book7.getGenre();
        book7.setQuantity((int) (byte) -1);
        java.lang.String str17 = book7.getGenre();
        boolean boolean18 = book7.hasSoftCopy();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, type=PayPal, validated=true]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "User [email=, password=, name=hi!, type=hi!, validated=false]", "Debit Card");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("");
        java.lang.String str2 = mobileWallet1.getMode();
        java.lang.String str3 = mobileWallet1.getMode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PayPal" + "'", str2, "PayPal");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PayPal" + "'", str3, "PayPal");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "SubscribeNewsletter{title='Debit Card', email='hi!', dateSubscribed=Sat Mar 30 20:32:04 EDT 2024, dateDue=Tue Apr 30 20:32:04 EDT 2024}", "hi!");
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook8 = courseTextBookBuilder6.build();
        java.lang.String str9 = courseTextBook8.getISBN();
        java.util.Date date16 = null;
        java.util.Date date17 = null;
        org.team4.model.course.Course course20 = new org.team4.model.course.Course("hi!", date16, date17, "", "hi!");
        java.util.Date date21 = course20.getEndDate();
        java.lang.String str22 = course20.getProfessorEmail();
        java.lang.String str23 = course20.getProfessorEmail();
        org.team4.model.user.Student student28 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean29 = course20.isEnrolled(student28);
        org.team4.model.course.CourseTextBook courseTextBook31 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook8, "hi!", (int) (short) 1, "PayPal", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}", (int) (short) 10, course20, true);
        java.lang.String str32 = courseTextBook8.toString();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}" + "'", str32, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.items.Newsletter newsletter12 = purchaseComplete11.getNewsletter();
        org.team4.model.items.Newsletter newsletter13 = purchaseComplete11.getNewsletter();
        org.team4.model.items.Newsletter newsletter14 = purchaseComplete11.getNewsletter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(newsletter14);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
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
        java.lang.String str13 = courseTextBook8.getGenre();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertNotNull(studentList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(studentList11);
        org.junit.Assert.assertNull(course12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
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
        java.lang.String str45 = course41.getCourseName();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter48 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date49 = null;
        subscribeNewsletter48.setDateSubscribed(date49);
        java.lang.String str51 = subscribeNewsletter48.getTitle();
        java.util.Date date52 = subscribeNewsletter48.getDateDue();
        boolean boolean53 = course41.isStarted(date52);
        java.util.Date date54 = course41.getEndDate();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Tue Apr 30 20:32:04 EDT 2024");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 20:32:04 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 20:32:04 EDT 2024");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str44, "ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str45, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(date52);
// flaky:         org.junit.Assert.assertEquals(date52.toString(), "Tue Apr 30 20:32:04 EDT 2024");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(date54);
// flaky:         org.junit.Assert.assertEquals(date54.toString(), "Tue Apr 30 20:32:04 EDT 2024");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}");
        org.team4.model.items.Book book5 = courseTextBookBuilder0.build();
        org.team4.model.course.CourseTextBook courseTextBook6 = courseTextBookBuilder0.build();
        boolean boolean7 = courseTextBook6.hasSoftCopy();
        org.team4.model.course.Course course8 = courseTextBook6.getCourse();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(courseTextBook6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(course8);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date3 = null;
        subscribeNewsletter2.setDateSubscribed(date3);
        java.lang.String str5 = subscribeNewsletter2.getTitle();
        java.util.Date date6 = subscribeNewsletter2.getDateDue();
        java.util.Date date7 = subscribeNewsletter2.getDateDue();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 30 20:32:04 EDT 2024");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Tue Apr 30 20:32:04 EDT 2024");
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemPurchased{title='', email='', datePurchased=null}", "", "User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase((double) 1232147L, (org.team4.model.user.User) faculty5);
        org.team4.model.items.Newsletter newsletter10 = new org.team4.model.items.Newsletter("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", 0.0d);
        org.team4.model.items.builder.DVDBuilder dVDBuilder11 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD12 = dVDBuilder11.build();
        java.lang.String str13 = dVD12.getGenre();
        boolean boolean14 = dVD12.isPurchasable();
        double double15 = dVD12.getDuration();
        dVD12.setQuantity((int) (short) 1);
        dVD12.setQuantity((int) ' ');
        boolean boolean20 = dVD12.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator21 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD12);
        org.team4.model.items.Item item22 = rentableItemDecorator21.getItem();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator23 = new org.team4.model.items.decorator.PurchasableItemDecorator(item22);
        org.team4.model.user.Manager manager29 = new org.team4.model.user.Manager("", "", "", "hi!", false);
        manager29.setValidated(false);
        manager29.setName("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase34 = new org.team4.functionality.buy.ItemToPurchase(item22, (org.team4.model.user.User) manager29);
        java.lang.String str35 = manager29.getEmail();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase36 = new org.team4.functionality.buy.ItemToPurchase(newsletter10, (org.team4.model.user.User) manager29);
        org.team4.model.paymentmodes.DebitCard debitCard40 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        boolean boolean41 = debitCard40.correctLength();
        java.lang.String str42 = debitCard40.getMode();
        boolean boolean43 = debitCard40.notExpired();
        boolean boolean44 = debitCard40.correctLength();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete45 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase36, (org.team4.model.paymentmodes.PaymentValidator) debitCard40);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete46 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) debitCard40);
        org.junit.Assert.assertNotNull(dVD12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(item22);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Debit Card" + "'", str42, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.team4.model.user.User user5 = new org.team4.model.user.User("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "", false);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("Debit Card", "PayPal{email='PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}'}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", 5890207L);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
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
        org.team4.functionality.buy.ItemPurchased itemPurchased28 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", date23);
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
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter90 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "", date82, date89);
        rentedItem59.setDueDate(date82);
        java.lang.String str92 = rentedItem59.getISBN();
        rentedItem59.setISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:59 EDT 2024, dateDue=Tue Apr 30 20:31:59 EDT 2024}");
        java.lang.String str95 = rentedItem59.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Apr 30 20:32:04 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Tue Apr 30 20:32:04 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 20:32:04 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 20:32:04 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 20:32:04 EDT 2024");
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Tue Apr 30 20:32:04 EDT 2024");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str60, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(date73);
// flaky:         org.junit.Assert.assertEquals(date73.toString(), "Tue Apr 30 20:32:04 EDT 2024");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertNotNull(date82);
// flaky:         org.junit.Assert.assertEquals(date82.toString(), "Tue Apr 30 20:32:04 EDT 2024");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertNotNull(date89);
// flaky:         org.junit.Assert.assertEquals(date89.toString(), "Tue Apr 30 20:32:04 EDT 2024");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str92, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str95, "User [email=, password=, name=hi!, type=, validated=false]");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str3 = subscribeNewsletter2.getTitle();
        java.util.Date date4 = null;
        subscribeNewsletter2.setDateSubscribed(date4);
        java.lang.String str6 = subscribeNewsletter2.getTitle();
        java.lang.String str7 = subscribeNewsletter2.getTitle();
        java.util.Date date8 = subscribeNewsletter2.getDateDue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Tue Apr 30 20:32:04 EDT 2024");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.ISBN("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder0.genre("");
        org.team4.model.items.builder.DVDBuilder dVDBuilder8 = dVDBuilder0.duration((double) (-1.0f));
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder10 = dVDBuilder8.title("PayPal");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder12 = dVDBuilder8.ISBN("PayPal");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDBuilder8);
        org.junit.Assert.assertNotNull(dVDItemBuilder10);
        org.junit.Assert.assertNotNull(dVDItemBuilder12);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        book7.setPrice((double) 0L);
        int int11 = book7.getEdition();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder12 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder14 = courseTextBookBuilder12.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder16 = courseTextBookBuilder12.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder18 = courseTextBookBuilder12.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder20 = courseTextBookBuilder12.price((double) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder22 = courseTextBookBuilder12.price((double) 10);
        org.team4.model.course.CourseTextBook courseTextBook23 = courseTextBookBuilder12.build();
        org.team4.model.items.builder.BookBuilder bookBuilder25 = courseTextBookBuilder12.hasHardCopy(false);
        boolean boolean26 = book7.equals((java.lang.Object) bookBuilder25);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder27 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder29 = courseTextBookBuilder27.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder31 = courseTextBookBuilder27.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder33 = courseTextBookBuilder27.isVirtual(true);
        org.team4.model.items.builder.DVDBuilder dVDBuilder34 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD35 = dVDBuilder34.build();
        java.lang.String str36 = dVD35.getGenre();
        boolean boolean37 = dVD35.isPurchasable();
        double double38 = dVD35.getDuration();
        dVD35.setQuantity((int) (short) 1);
        dVD35.setQuantity((int) ' ');
        boolean boolean43 = dVD35.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator44 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD35);
        org.team4.model.items.Item item45 = rentableItemDecorator44.getItem();
        org.team4.model.items.Item item46 = new org.team4.model.items.Item(item45);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter55 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str56 = subscribeNewsletter55.getTitle();
        java.util.Date date57 = null;
        subscribeNewsletter55.setDateSubscribed(date57);
        java.util.Date date59 = subscribeNewsletter55.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter64 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str65 = subscribeNewsletter64.getEmail();
        java.util.Date date66 = subscribeNewsletter64.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter69 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str70 = subscribeNewsletter69.getEmail();
        java.util.Date date71 = subscribeNewsletter69.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter72 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date66, date71);
        org.team4.model.course.Course course75 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date59, date71, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.model.course.CourseTextBook courseTextBook77 = new org.team4.model.course.CourseTextBook(item46, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", (int) (short) 1, "hi!", "PayPal", 52, course75, false);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder78 = courseTextBookBuilder27.course(course75);
        boolean boolean79 = book7.equals((java.lang.Object) courseTextBookBuilder78);
        java.lang.String str80 = book7.getGenre();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(bookBuilder14);
        org.junit.Assert.assertNotNull(bookItemBuilder16);
        org.junit.Assert.assertNotNull(bookBuilder18);
        org.junit.Assert.assertNotNull(bookItemBuilder20);
        org.junit.Assert.assertNotNull(bookItemBuilder22);
        org.junit.Assert.assertNotNull(courseTextBook23);
        org.junit.Assert.assertNotNull(bookBuilder25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(bookBuilder29);
        org.junit.Assert.assertNotNull(bookItemBuilder31);
        org.junit.Assert.assertNotNull(courseTextBookBuilder33);
        org.junit.Assert.assertNotNull(dVD35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(item45);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(date59);
// flaky:         org.junit.Assert.assertEquals(date59.toString(), "Tue Apr 30 20:32:04 EDT 2024");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertNotNull(date66);
// flaky:         org.junit.Assert.assertEquals(date66.toString(), "Tue Apr 30 20:32:04 EDT 2024");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertNotNull(date71);
// flaky:         org.junit.Assert.assertEquals(date71.toString(), "Tue Apr 30 20:32:04 EDT 2024");
        org.junit.Assert.assertNotNull(courseTextBookBuilder78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(str80);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
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
        int int13 = courseTextBook8.getNoOfPages();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertNotNull(studentList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(studentList11);
        org.junit.Assert.assertNull(course12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        boolean boolean4 = debitCard3.correctLength();
        boolean boolean5 = debitCard3.correctLength();
        org.team4.model.user.Student student11 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str12 = student11.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase13 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student11);
        org.team4.functionality.buy.ProcessPayment processPayment14 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) debitCard3, itemToPurchase13);
        boolean boolean15 = debitCard3.isValid();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.paymentmodes.DebitCard debitCard15 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete16 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) debitCard15);
        boolean boolean17 = debitCard15.notExpired();
        boolean boolean18 = debitCard15.correctLength();
        boolean boolean19 = debitCard15.correctLength();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        java.lang.String str4 = magazine3.getPublisher();
        org.team4.model.user.Manager manager10 = new org.team4.model.user.Manager("", "", "", "hi!", false);
        manager10.setValidated(false);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase13 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) magazine3, (org.team4.model.user.User) manager10);
        org.team4.model.paymentmodes.PayPal payPal15 = new org.team4.model.paymentmodes.PayPal("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        boolean boolean16 = payPal15.isValid();
        boolean boolean17 = payPal15.isValid();
        java.lang.String str18 = payPal15.getMode();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete19 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase13, (org.team4.model.paymentmodes.PaymentValidator) payPal15);
        java.lang.String str20 = payPal15.toString();
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Mobile Wallet" + "'", str18, "Mobile Wallet");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}" + "'", str20, "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}", "Mobile Wallet", "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:59 EDT 2024, dateDue=Tue Apr 30 20:31:59 EDT 2024}", 2407500L);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str3 = subscribeNewsletter2.getTitle();
        java.util.Date date4 = null;
        subscribeNewsletter2.setDateSubscribed(date4);
        java.util.Date date6 = subscribeNewsletter2.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter11 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str12 = subscribeNewsletter11.getEmail();
        java.util.Date date13 = subscribeNewsletter11.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter16 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str17 = subscribeNewsletter16.getTitle();
        java.util.Date date18 = null;
        subscribeNewsletter16.setDateSubscribed(date18);
        java.util.Date date20 = subscribeNewsletter16.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter21 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "", date13, date20);
        subscribeNewsletter2.setDateDue(date20);
        java.util.Date date23 = subscribeNewsletter2.getDateSubscribed();
        java.util.Date date24 = subscribeNewsletter2.getDateDue();
        java.lang.String str25 = subscribeNewsletter2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 30 20:32:04 EDT 2024");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Tue Apr 30 20:32:04 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Tue Apr 30 20:32:04 EDT 2024");
        org.junit.Assert.assertNull(date23);
        org.junit.Assert.assertNotNull(date24);
// flaky:         org.junit.Assert.assertEquals(date24.toString(), "Tue Apr 30 20:32:04 EDT 2024");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}", 1.0d);
        java.lang.String str4 = newsletter3.getLink();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}" + "'", str4, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.user.User user12 = itemToPurchase7.getUser();
        user12.setName("User [email=, password=, name=hi!, type=hi!, validated=false]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNotNull(user12);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter10 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str11 = subscribeNewsletter10.getEmail();
        java.util.Date date12 = subscribeNewsletter10.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter15 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str16 = subscribeNewsletter15.getEmail();
        java.util.Date date17 = subscribeNewsletter15.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter18 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date12, date17);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter21 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter21.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter21.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter28 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date29 = null;
        subscribeNewsletter28.setDateSubscribed(date29);
        java.util.Date date31 = subscribeNewsletter28.getDateDue();
        subscribeNewsletter21.setDateDue(date31);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter33 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", date17, date31);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter37 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str38 = subscribeNewsletter37.getTitle();
        java.util.Date date39 = null;
        subscribeNewsletter37.setDateSubscribed(date39);
        java.util.Date date41 = subscribeNewsletter37.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter45 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str46 = subscribeNewsletter45.getTitle();
        java.util.Date date47 = null;
        subscribeNewsletter45.setDateSubscribed(date47);
        java.util.Date date49 = subscribeNewsletter45.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter54 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str55 = subscribeNewsletter54.getEmail();
        java.util.Date date56 = subscribeNewsletter54.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter59 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str60 = subscribeNewsletter59.getEmail();
        java.util.Date date61 = subscribeNewsletter59.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter62 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date56, date61);
        org.team4.model.course.Course course65 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date49, date61, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.model.course.Course course68 = new org.team4.model.course.Course("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", date41, date49, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter69 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:31:55 EDT 2024, dateDue=Tue Apr 30 20:31:55 EDT 2024}", "User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, type=PayPal, validated=true]", date17, date41);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter74 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str75 = subscribeNewsletter74.getEmail();
        java.util.Date date76 = subscribeNewsletter74.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter79 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str80 = subscribeNewsletter79.getEmail();
        java.util.Date date81 = subscribeNewsletter79.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter82 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date76, date81);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter83 = new org.team4.functionality.subscriptions.SubscribeNewsletter("Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", date17, date76);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Tue Apr 30 20:32:04 EDT 2024");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Tue Apr 30 20:32:04 EDT 2024");
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Tue Apr 30 20:32:04 EDT 2024");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(date41);
// flaky:         org.junit.Assert.assertEquals(date41.toString(), "Tue Apr 30 20:32:04 EDT 2024");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(date49);
// flaky:         org.junit.Assert.assertEquals(date49.toString(), "Tue Apr 30 20:32:04 EDT 2024");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Tue Apr 30 20:32:04 EDT 2024");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(date61);
// flaky:         org.junit.Assert.assertEquals(date61.toString(), "Tue Apr 30 20:32:04 EDT 2024");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertNotNull(date76);
// flaky:         org.junit.Assert.assertEquals(date76.toString(), "Tue Apr 30 20:32:04 EDT 2024");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertNotNull(date81);
// flaky:         org.junit.Assert.assertEquals(date81.toString(), "Tue Apr 30 20:32:04 EDT 2024");
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:04 EDT 2024, dateDue=Tue Apr 30 20:32:04 EDT 2024}", 97, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("Credit Card", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", false);
        java.util.ArrayList<java.lang.String> strList6 = faculty5.getCourses();
        java.util.ArrayList<java.lang.String> strList7 = faculty5.getCourses();
        org.junit.Assert.assertNull(strList6);
        org.junit.Assert.assertNull(strList7);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder0.build();
        courseTextBook9.setPurchaseable(true);
        java.lang.String str12 = courseTextBook9.toString();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(courseTextBook9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}" + "'", str12, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.yearPublished((int) (short) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder8 = magazineBuilder0.issueNumber(100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder10 = magazineBuilder0.quantity((int) (short) 0);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineBuilder8);
        org.junit.Assert.assertNotNull(magazineItemBuilder10);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("ItemPurchased{title='', email='', datePurchased=null}");
        java.lang.String str2 = mobileWallet1.getMode();
        java.lang.String str3 = mobileWallet1.getMode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PayPal" + "'", str2, "PayPal");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PayPal" + "'", str3, "PayPal");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.team4.model.user.Student student9 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str10 = student9.getType();
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        student9.setCourses(strList13);
        org.team4.model.user.Faculty faculty16 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", (long) (byte) -1, strList13);
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
        org.team4.model.user.Student student88 = new org.team4.model.user.Student("User [email=, password=, name=hi!, type=, validated=false]", "", "ItemPurchased{title='', email='', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", strList87);
        faculty16.setCourses(strList87);
        faculty16.setName("ItemPurchased{title='', email='', datePurchased=null}");
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
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.yearPublished((int) (short) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder8 = magazineBuilder0.issueNumber(100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder10 = magazineBuilder8.quantity((int) '#');
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineBuilder8);
        org.junit.Assert.assertNotNull(magazineItemBuilder10);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Sat Mar 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", 0.0d);
        org.team4.model.items.builder.DVDBuilder dVDBuilder4 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD5 = dVDBuilder4.build();
        java.lang.String str6 = dVD5.getGenre();
        boolean boolean7 = dVD5.isPurchasable();
        double double8 = dVD5.getDuration();
        dVD5.setQuantity((int) (short) 1);
        dVD5.setQuantity((int) ' ');
        boolean boolean13 = dVD5.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator14 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD5);
        org.team4.model.items.Item item15 = rentableItemDecorator14.getItem();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator16 = new org.team4.model.items.decorator.PurchasableItemDecorator(item15);
        org.team4.model.user.Manager manager22 = new org.team4.model.user.Manager("", "", "", "hi!", false);
        manager22.setValidated(false);
        manager22.setName("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase27 = new org.team4.functionality.buy.ItemToPurchase(item15, (org.team4.model.user.User) manager22);
        java.lang.String str28 = manager22.getEmail();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase29 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) manager22);
        double double30 = newsletter3.getPrice();
        java.lang.String str31 = newsletter3.getLink();
        org.junit.Assert.assertNotNull(dVD5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}" + "'", str31, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date3 = null;
        subscribeNewsletter2.setDateSubscribed(date3);
        java.util.Date date5 = subscribeNewsletter2.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter10 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str11 = subscribeNewsletter10.getEmail();
        java.util.Date date12 = subscribeNewsletter10.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter15 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str16 = subscribeNewsletter15.getTitle();
        java.util.Date date17 = null;
        subscribeNewsletter15.setDateSubscribed(date17);
        java.util.Date date19 = subscribeNewsletter15.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter20 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "", date12, date19);
        subscribeNewsletter2.setDateSubscribed(date19);
        subscribeNewsletter2.setEmail("");
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Tue Apr 30 20:32:04 EDT 2024");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Tue Apr 30 20:32:04 EDT 2024");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Tue Apr 30 20:32:04 EDT 2024");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("hi!", "hi!", "hi!", "");
        nonFaculty5.setUniversityID((long) (short) 100);
        long long8 = nonFaculty5.getUniversityID();
        nonFaculty5.setUniversityID((long) (short) 100);
        boolean boolean11 = nonFaculty5.isValidated();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase12 = new org.team4.functionality.buy.ItemToPurchase((double) '#', (org.team4.model.user.User) nonFaculty5);
        long long13 = nonFaculty5.getUniversityID();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDBuilder2.quantity(10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDItemBuilder6.quantity((int) '4');
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
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
        org.team4.functionality.buy.PurchaseComplete purchaseComplete41 = processPayment40.getPurchaseCompleted();
        java.lang.String str42 = processPayment40.toString();
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
        org.junit.Assert.assertNull(purchaseComplete41);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("Credit Card", "ProcessPayment{modes=null, itemToPurchase=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", false);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.team4.model.user.UserFactory userFactory0 = new org.team4.model.user.UserFactory();
        org.team4.model.user.User user6 = userFactory0.getUser("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", false);
        org.team4.model.user.User user12 = userFactory0.getUser("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal", "Debit Card", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", false);
        org.team4.model.user.User user18 = userFactory0.getUser("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "ProcessPayment{modes=null, itemToPurchase=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}}", "", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}", true);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user18);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
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
        org.team4.model.items.DVD dVD20 = new org.team4.model.items.DVD((org.team4.model.items.Item) dVD1, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", (double) '#');
        java.lang.String str21 = dVD1.getISBN();
        org.team4.model.items.Book book29 = new org.team4.model.items.Book((org.team4.model.items.Item) dVD1, "hi!", 32, "", "ItemPurchased{title='', email='', datePurchased=null}", (int) (byte) 1, true, true);
        java.lang.String str30 = book29.toString();
        org.team4.model.items.Item item31 = new org.team4.model.items.Item((org.team4.model.items.Item) book29);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator32 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) book29);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}" + "'", str30, "Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
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
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:04 EDT 2024, dateDue=Tue Apr 30 20:32:04 EDT 2024}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:04 EDT 2024, dateDue=Tue Apr 30 20:32:04 EDT 2024}", "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}", true);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("User [email=, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=PayPal, validated=false]", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:31:55 EDT 2024, dateDue=Tue Apr 30 20:31:55 EDT 2024}", (double) 100.0f);
        double double4 = newsletter3.getPrice();
        java.lang.String str5 = newsletter3.getTitle();
        double double6 = newsletter3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [email=, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=PayPal, validated=false]" + "'", str5, "User [email=, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=PayPal, validated=false]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}", 4091426L);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder0.author("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.BookRequest bookRequest5 = bookRequestBuilder4.build();
        java.lang.String str6 = bookRequest5.getAuthor();
        java.lang.String str7 = bookRequest5.getISBN();
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str6, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
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
        org.team4.model.items.DVD dVD20 = new org.team4.model.items.DVD((org.team4.model.items.Item) dVD1, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", (double) '#');
        org.team4.model.items.decorator.ItemDecorator itemDecorator21 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) dVD1);
        org.team4.model.items.decorator.ItemDecorator itemDecorator22 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) itemDecorator21);
        int int23 = itemDecorator22.getYearPublished();
        itemDecorator22.setPrice((double) 10);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        boolean boolean4 = creditCard3.notExpired();
        boolean boolean5 = creditCard3.isValid();
        boolean boolean6 = creditCard3.notExpired();
        boolean boolean7 = creditCard3.correctLength();
        boolean boolean8 = creditCard3.correctLength();
        boolean boolean9 = creditCard3.correctLength();
        java.lang.String str10 = creditCard3.getMode();
        boolean boolean11 = creditCard3.correctLength();
        org.team4.model.items.Newsletter newsletter15 = new org.team4.model.items.Newsletter("", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", 0.0d);
        java.lang.String str16 = newsletter15.getTitle();
        org.team4.model.items.builder.DVDBuilder dVDBuilder17 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD18 = dVDBuilder17.build();
        java.lang.String str19 = dVD18.getGenre();
        boolean boolean20 = dVD18.isPurchasable();
        double double21 = dVD18.getDuration();
        dVD18.setQuantity((int) (short) 1);
        dVD18.setQuantity((int) ' ');
        boolean boolean26 = dVD18.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator27 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD18);
        org.team4.model.items.Item item28 = rentableItemDecorator27.getItem();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator29 = new org.team4.model.items.decorator.PurchasableItemDecorator(item28);
        org.team4.model.user.Manager manager35 = new org.team4.model.user.Manager("", "", "", "hi!", false);
        manager35.setValidated(false);
        manager35.setName("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase40 = new org.team4.functionality.buy.ItemToPurchase(item28, (org.team4.model.user.User) manager35);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase41 = new org.team4.functionality.buy.ItemToPurchase(newsletter15, (org.team4.model.user.User) manager35);
        org.team4.model.user.User user42 = itemToPurchase41.getUser();
        org.team4.functionality.buy.ProcessPayment processPayment43 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) creditCard3, itemToPurchase41);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Credit Card" + "'", str10, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(dVD18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(item28);
        org.junit.Assert.assertNotNull(user42);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        boolean boolean4 = debitCard3.correctLength();
        java.lang.String str5 = debitCard3.getMode();
        boolean boolean6 = debitCard3.notExpired();
        boolean boolean7 = debitCard3.correctLength();
        boolean boolean8 = debitCard3.correctLength();
        boolean boolean9 = debitCard3.correctLength();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
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
        double double21 = courseTextBook8.getPrice();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("PayPal");
        java.lang.String str2 = payPal1.getMode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Mobile Wallet" + "'", str2, "Mobile Wallet");
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.title("hi!");
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder0.duration((double) 10L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDBuilder0.quantity((int) (byte) 10);
        org.team4.model.items.DVD dVD9 = dVDBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder11 = dVDBuilder0.genre("ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:32:03 EDT 2024}");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
        org.junit.Assert.assertNotNull(dVD9);
        org.junit.Assert.assertNotNull(dVDBuilder11);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder3 = dVDBuilder0.genre("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder5 = dVDBuilder0.yearPublished(0);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNotNull(dVDBuilder3);
        org.junit.Assert.assertNotNull(dVDItemBuilder5);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        int int2 = bookRequest1.getEdition();
        java.lang.String str3 = bookRequest1.getISBN();
        int int4 = bookRequest1.getEdition();
        java.lang.String str5 = bookRequest1.getEmail();
        java.lang.String str6 = bookRequest1.getEmail();
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.user.User user12 = purchaseComplete11.getUser();
        org.team4.model.items.Item item13 = purchaseComplete11.getItem();
        org.team4.model.user.User user14 = purchaseComplete11.getUser();
        org.team4.model.items.Newsletter newsletter15 = purchaseComplete11.getNewsletter();
        org.team4.model.items.Item item16 = purchaseComplete11.getItem();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter4 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date5 = null;
        subscribeNewsletter4.setDateSubscribed(date5);
        java.util.Date date7 = subscribeNewsletter4.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter12 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter12.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter12.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter19 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date20 = null;
        subscribeNewsletter19.setDateSubscribed(date20);
        java.util.Date date22 = subscribeNewsletter19.getDateDue();
        subscribeNewsletter12.setDateDue(date22);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter27 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str28 = subscribeNewsletter27.getTitle();
        java.util.Date date29 = null;
        subscribeNewsletter27.setDateSubscribed(date29);
        java.util.Date date31 = subscribeNewsletter27.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter35 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str36 = subscribeNewsletter35.getTitle();
        java.util.Date date37 = null;
        subscribeNewsletter35.setDateSubscribed(date37);
        java.util.Date date39 = subscribeNewsletter35.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter44 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str45 = subscribeNewsletter44.getEmail();
        java.util.Date date46 = subscribeNewsletter44.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter49 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str50 = subscribeNewsletter49.getEmail();
        java.util.Date date51 = subscribeNewsletter49.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter52 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date46, date51);
        org.team4.model.course.Course course55 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date39, date51, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.model.course.Course course58 = new org.team4.model.course.Course("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", date31, date39, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter59 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=null}", date22, date39);
        org.team4.model.items.RentedItem rentedItem60 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=null}", "Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}", date7, date39);
        java.lang.String str61 = rentedItem60.getTitle();
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Tue Apr 30 20:32:05 EDT 2024");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Tue Apr 30 20:32:05 EDT 2024");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Tue Apr 30 20:32:05 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Tue Apr 30 20:32:05 EDT 2024");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(date46);
// flaky:         org.junit.Assert.assertEquals(date46.toString(), "Tue Apr 30 20:32:05 EDT 2024");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(date51);
// flaky:         org.junit.Assert.assertEquals(date51.toString(), "Tue Apr 30 20:32:05 EDT 2024");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str61, "ItemPurchased{title='', email='hi!', datePurchased=null}");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        boolean boolean4 = debitCard3.correctLength();
        boolean boolean5 = debitCard3.correctLength();
        org.team4.model.user.Student student11 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str12 = student11.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase13 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student11);
        org.team4.functionality.buy.ProcessPayment processPayment14 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) debitCard3, itemToPurchase13);
        java.lang.String str15 = processPayment14.toString();
        java.lang.String str16 = processPayment14.toString();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete17 = processPayment14.getPurchaseCompleted();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(purchaseComplete17);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
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
        org.team4.model.user.Student student31 = new org.team4.model.user.Student("User [email=, password=, name=hi!, type=, validated=false]", "", "ItemPurchased{title='', email='', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", strList30);
        org.team4.model.user.Faculty faculty32 = new org.team4.model.user.Faculty("hi!", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "User [email=, password=, name=hi!, type=, validated=false]", "", (long) 32, strList30);
        java.lang.String str33 = faculty32.getName();
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str33, "User [email=, password=, name=hi!, type=, validated=false]");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("hi!", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "ProcessPayment{modes=null, itemToPurchase=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}}", "User [email=, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=PayPal, validated=false]");
        java.util.ArrayList<java.lang.String> strList5 = student4.getCourses();
        org.junit.Assert.assertNull(strList5);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
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
        org.team4.model.items.Book book28 = new org.team4.model.items.Book((org.team4.model.items.Item) book9, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", 97, "SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Sat Mar 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}", "SubscribeNewsletter{title='Debit Card', email='hi!', dateSubscribed=Sat Mar 30 20:32:04 EDT 2024, dateDue=Tue Apr 30 20:32:04 EDT 2024}", 100, true, true);
        org.team4.model.items.Book book36 = new org.team4.model.items.Book((org.team4.model.items.Item) book9, "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}", (int) (short) -1, "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}", 100, false, false);
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
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
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
        java.lang.String str20 = book9.getAuthor();
        boolean boolean21 = book9.hasHardCopy();
        book9.setPrice((double) 0);
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
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("Credit Card", "", "Mobile Wallet", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        java.util.ArrayList<java.lang.String> strList5 = faculty4.getCourses();
        org.junit.Assert.assertNull(strList5);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter2.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter2.setTitle("PayPal");
        subscribeNewsletter2.setTitle("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter15 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str16 = subscribeNewsletter15.getEmail();
        java.util.Date date17 = subscribeNewsletter15.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter20 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str21 = subscribeNewsletter20.getEmail();
        java.util.Date date22 = subscribeNewsletter20.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter23 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date17, date22);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter26 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter26.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter26.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter33 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date34 = null;
        subscribeNewsletter33.setDateSubscribed(date34);
        java.util.Date date36 = subscribeNewsletter33.getDateDue();
        subscribeNewsletter26.setDateDue(date36);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter38 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", date22, date36);
        subscribeNewsletter2.setDateSubscribed(date22);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter42 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str43 = subscribeNewsletter42.getTitle();
        java.util.Date date44 = null;
        subscribeNewsletter42.setDateSubscribed(date44);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter48 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}");
        java.util.Date date49 = subscribeNewsletter48.getDateSubscribed();
        subscribeNewsletter42.setDateDue(date49);
        subscribeNewsletter42.setTitle("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter56 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str57 = subscribeNewsletter56.getTitle();
        java.util.Date date58 = null;
        subscribeNewsletter56.setDateSubscribed(date58);
        java.util.Date date60 = subscribeNewsletter56.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter63 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter63.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter69 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str70 = subscribeNewsletter69.getTitle();
        java.util.Date date71 = null;
        subscribeNewsletter69.setDateSubscribed(date71);
        java.util.Date date73 = subscribeNewsletter69.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter78 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str79 = subscribeNewsletter78.getEmail();
        java.util.Date date80 = subscribeNewsletter78.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter83 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str84 = subscribeNewsletter83.getEmail();
        java.util.Date date85 = subscribeNewsletter83.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter86 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date80, date85);
        org.team4.model.course.Course course89 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date73, date85, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        subscribeNewsletter63.setDateSubscribed(date73);
        org.team4.model.course.Course course93 = new org.team4.model.course.Course("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", date60, date73, "Credit Card", "ItemPurchased{title='', email='', datePurchased=null}");
        subscribeNewsletter42.setDateSubscribed(date73);
        subscribeNewsletter2.setDateSubscribed(date73);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Tue Apr 30 20:32:05 EDT 2024");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Tue Apr 30 20:32:05 EDT 2024");
        org.junit.Assert.assertNotNull(date36);
// flaky:         org.junit.Assert.assertEquals(date36.toString(), "Tue Apr 30 20:32:05 EDT 2024");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(date49);
// flaky:         org.junit.Assert.assertEquals(date49.toString(), "Sat Mar 30 20:32:05 EDT 2024");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(date60);
// flaky:         org.junit.Assert.assertEquals(date60.toString(), "Tue Apr 30 20:32:05 EDT 2024");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertNotNull(date73);
// flaky:         org.junit.Assert.assertEquals(date73.toString(), "Tue Apr 30 20:32:05 EDT 2024");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertNotNull(date80);
// flaky:         org.junit.Assert.assertEquals(date80.toString(), "Tue Apr 30 20:32:05 EDT 2024");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
        org.junit.Assert.assertNotNull(date85);
// flaky:         org.junit.Assert.assertEquals(date85.toString(), "Tue Apr 30 20:32:05 EDT 2024");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}', email='hi!', dateSubscribed=null, dateDue=Tue Apr 30 20:32:02 EDT 2024}", "hi!", "ProcessPayment{modes=null, itemToPurchase=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}}", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:31:55 EDT 2024, dateDue=Tue Apr 30 20:31:55 EDT 2024}", true);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.lang.String str6 = course5.getProfessorEmail();
        java.util.Date date7 = course5.getStartDate();
        org.team4.model.user.Student student12 = new org.team4.model.user.Student("", "", "hi!", "");
        student12.setEmail("");
        boolean boolean15 = course5.isEnrolled(student12);
        java.lang.String str16 = student12.toString();
        java.util.ArrayList<java.lang.String> strList17 = student12.getCourses();
        student12.setType("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str16, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertNull(strList17);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        boolean boolean4 = debitCard3.correctLength();
        boolean boolean5 = debitCard3.correctLength();
        org.team4.model.user.Student student11 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str12 = student11.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase13 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student11);
        org.team4.functionality.buy.ProcessPayment processPayment14 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) debitCard3, itemToPurchase13);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete15 = processPayment14.getPurchaseCompleted();
        java.lang.String str16 = processPayment14.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(purchaseComplete15);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter2.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter2.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter9 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date10 = null;
        subscribeNewsletter9.setDateSubscribed(date10);
        java.util.Date date12 = subscribeNewsletter9.getDateDue();
        subscribeNewsletter2.setDateDue(date12);
        java.util.Date date14 = subscribeNewsletter2.getDateSubscribed();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter17 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str18 = subscribeNewsletter17.getEmail();
        java.util.Date date19 = subscribeNewsletter17.getDateDue();
        subscribeNewsletter2.setDateSubscribed(date19);
        java.util.Date date21 = subscribeNewsletter2.getDateDue();
        java.lang.String str22 = subscribeNewsletter2.getEmail();
        java.lang.String str23 = subscribeNewsletter2.toString();
        subscribeNewsletter2.setEmail("User [email=, password=, name=hi!, type=hi!, validated=false]");
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Tue Apr 30 20:32:05 EDT 2024");
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Sat Mar 30 20:32:05 EDT 2024");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Tue Apr 30 20:32:05 EDT 2024");
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Tue Apr 30 20:32:05 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str22, "User [email=, password=, name=hi!, type=, validated=false]");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:05 EDT 2024, dateDue=Tue Apr 30 20:32:05 EDT 2024}" + "'", str23, "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:05 EDT 2024, dateDue=Tue Apr 30 20:32:05 EDT 2024}");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:32:03 EDT 2024}", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:31:55 EDT 2024, dateDue=Tue Apr 30 20:31:55 EDT 2024}", "User [email=, password=, name=hi!, type=, validated=false]", "hi!");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        java.util.Date date2 = null;
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("", "", date2);
        java.lang.String str4 = itemPurchased3.toString();
        java.lang.String str5 = itemPurchased3.getTitle();
        java.lang.String str6 = itemPurchased3.getTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str4, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
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
        org.team4.model.user.Manager manager26 = new org.team4.model.user.Manager("User [email=, password=, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "", (long) 0);
        long long27 = manager26.getManagerID();
        long long28 = manager26.getManagerID();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase29 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) rentableItemDecorator20, (org.team4.model.user.User) manager26);
        org.team4.model.items.Item item30 = new org.team4.model.items.Item((org.team4.model.items.Item) rentableItemDecorator20);
        int int31 = rentableItemDecorator20.getQuantity();
        java.lang.String str32 = rentableItemDecorator20.getTitle();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("User [email=, password=, name=hi!, type=, validated=false]", (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("User [email=, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=PayPal, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:02 EDT 2024, dateDue=Tue Apr 30 20:32:02 EDT 2024}");
        long long5 = faculty4.getFacultyID();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:04 EDT 2024, dateDue=Tue Apr 30 20:32:04 EDT 2024}", (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 32");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        student5.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase8 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student5);
        java.lang.String str9 = itemToPurchase8.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}" + "'", str9, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("hi!", 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 97");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        boolean boolean8 = book7.isRentable();
        int int9 = book7.getNoOfPages();
        boolean boolean10 = book7.hasHardCopy();
        boolean boolean11 = book7.hasSoftCopy();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
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
        org.team4.model.items.builder.BookBuilder bookBuilder11 = courseTextBookBuilder6.noOfPages((int) '4');
        org.team4.model.course.CourseTextBook courseTextBook12 = courseTextBookBuilder6.build();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNotNull(bookBuilder11);
        org.junit.Assert.assertNotNull(courseTextBook12);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.booktype("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder5.ISBN("PayPal");
        org.team4.model.items.BookRequest bookRequest8 = bookRequestBuilder7.build();
        java.lang.String str9 = bookRequest8.getAuthor();
        java.lang.String str10 = bookRequest8.getAuthor();
        java.lang.String str11 = bookRequest8.getEmail();
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
        org.junit.Assert.assertNotNull(bookRequest8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter5 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str6 = subscribeNewsletter5.getTitle();
        java.util.Date date7 = null;
        subscribeNewsletter5.setDateSubscribed(date7);
        java.util.Date date9 = subscribeNewsletter5.getDateDue();
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
        org.team4.model.course.Course course36 = new org.team4.model.course.Course("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", date9, date17, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter39 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}");
        java.util.Date date40 = subscribeNewsletter39.getDateSubscribed();
        java.util.Date date41 = subscribeNewsletter39.getDateDue();
        org.team4.model.items.RentedItem rentedItem42 = new org.team4.model.items.RentedItem("Debit Card", "User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, type=PayPal, validated=true]", date17, date41);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Tue Apr 30 20:32:05 EDT 2024");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Tue Apr 30 20:32:05 EDT 2024");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(date24);
// flaky:         org.junit.Assert.assertEquals(date24.toString(), "Tue Apr 30 20:32:05 EDT 2024");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Tue Apr 30 20:32:05 EDT 2024");
        org.junit.Assert.assertNotNull(date40);
// flaky:         org.junit.Assert.assertEquals(date40.toString(), "Sat Mar 30 20:32:05 EDT 2024");
        org.junit.Assert.assertNotNull(date41);
// flaky:         org.junit.Assert.assertEquals(date41.toString(), "Tue Apr 30 20:32:05 EDT 2024");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("ItemPurchased{title='', email='', datePurchased=null}", "ItemPurchased{title='', email='', datePurchased=null}");
        java.lang.String str4 = itemPurchased3.toString();
        java.util.Date date5 = itemPurchased3.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased8 = new org.team4.functionality.buy.ItemPurchased("ItemPurchased{title='', email='hi!', datePurchased=null}", "hi!");
        java.util.Date date9 = itemPurchased8.getDatePurchased();
        org.team4.model.course.Course course12 = new org.team4.model.course.Course("User [email=, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=PayPal, validated=false]", date5, date9, "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}}");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:32:05 EDT 2024}" + "'", str4, "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:32:05 EDT 2024}");
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Sat Mar 30 20:32:05 EDT 2024");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Sat Mar 30 20:32:05 EDT 2024");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder5 = magazineBuilder0.ISBN("hi!");
        org.team4.model.items.Magazine magazine6 = magazineBuilder0.build();
        int int7 = magazine6.getYearPublished();
        magazine6.setQuantity((int) (byte) -1);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertNotNull(magazineItemBuilder5);
        org.junit.Assert.assertNotNull(magazine6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter5 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str6 = subscribeNewsletter5.getTitle();
        java.util.Date date7 = null;
        subscribeNewsletter5.setDateSubscribed(date7);
        java.util.Date date9 = subscribeNewsletter5.getDateDue();
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
        org.team4.model.course.Course course36 = new org.team4.model.course.Course("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", date9, date17, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal");
        org.team4.functionality.buy.ItemPurchased itemPurchased37 = new org.team4.functionality.buy.ItemPurchased("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "PayPal{email='PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}'}", date17);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Tue Apr 30 20:32:05 EDT 2024");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Tue Apr 30 20:32:05 EDT 2024");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(date24);
// flaky:         org.junit.Assert.assertEquals(date24.toString(), "Tue Apr 30 20:32:05 EDT 2024");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Tue Apr 30 20:32:05 EDT 2024");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.team4.functionality.buy.ItemPurchased itemPurchased2 = new org.team4.functionality.buy.ItemPurchased("ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:32:05 EDT 2024}", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:04 EDT 2024, dateDue=Tue Apr 30 20:32:04 EDT 2024}");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.team4.model.user.User user5 = new org.team4.model.user.User("Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}", "SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}', email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', dateSubscribed=Sat Mar 30 20:32:00 EDT 2024, dateDue=Tue Apr 30 20:32:00 EDT 2024}", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:05 EDT 2024, dateDue=Tue Apr 30 20:32:05 EDT 2024}", "User [email=, password=, name=hi!, type=, validated=false]", false);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        java.lang.String str2 = payPal1.getMode();
        java.lang.String str3 = payPal1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Mobile Wallet" + "'", str2, "Mobile Wallet");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}" + "'", str3, "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getEndDate();
        org.team4.model.user.Student student12 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str13 = student12.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase14 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student12);
        java.lang.String str15 = student12.toString();
        course5.enrollStudent(student12);
        java.lang.String str17 = course5.getCourseName();
        java.util.Date date18 = course5.getStartDate();
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str15, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(date18);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("", "User [email=, password=, name=hi!, type=, validated=false]", "", "Credit Card", 1, "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        java.lang.String str7 = bookRequest6.getAuthor();
        java.lang.String str8 = bookRequest6.getEmail();
        int int9 = bookRequest6.getEdition();
        java.lang.String str10 = bookRequest6.getBookType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}" + "'", str10, "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date3 = null;
        subscribeNewsletter2.setDateSubscribed(date3);
        java.util.Date date5 = subscribeNewsletter2.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter10 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str11 = subscribeNewsletter10.getEmail();
        java.util.Date date12 = subscribeNewsletter10.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter15 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str16 = subscribeNewsletter15.getTitle();
        java.util.Date date17 = null;
        subscribeNewsletter15.setDateSubscribed(date17);
        java.util.Date date19 = subscribeNewsletter15.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter20 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "", date12, date19);
        subscribeNewsletter2.setDateSubscribed(date19);
        java.lang.String str22 = subscribeNewsletter2.toString();
        java.lang.String str23 = subscribeNewsletter2.getTitle();
        subscribeNewsletter2.setEmail("ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:32:05 EDT 2024}");
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Tue Apr 30 20:32:05 EDT 2024");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Tue Apr 30 20:32:05 EDT 2024");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Tue Apr 30 20:32:05 EDT 2024");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:05 EDT 2024, dateDue=Tue Apr 30 20:32:05 EDT 2024}" + "'", str22, "SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:05 EDT 2024, dateDue=Tue Apr 30 20:32:05 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.team4.model.items.builder.DVDBuilder dVDBuilder1 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD2 = dVDBuilder1.build();
        java.lang.String str3 = dVD2.getGenre();
        boolean boolean4 = dVD2.isPurchasable();
        double double5 = dVD2.getDuration();
        dVD2.setQuantity((int) (short) 1);
        dVD2.setQuantity((int) ' ');
        boolean boolean10 = dVD2.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator11 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD2);
        org.team4.model.items.Item item12 = rentableItemDecorator11.getItem();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator13 = new org.team4.model.items.decorator.PurchasableItemDecorator(item12);
        org.team4.model.user.Manager manager19 = new org.team4.model.user.Manager("", "", "", "hi!", false);
        manager19.setValidated(false);
        manager19.setName("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase24 = new org.team4.functionality.buy.ItemToPurchase(item12, (org.team4.model.user.User) manager19);
        java.lang.String str25 = manager19.getEmail();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase26 = new org.team4.functionality.buy.ItemToPurchase((double) 32, (org.team4.model.user.User) manager19);
        long long27 = manager19.getManagerID();
        org.junit.Assert.assertNotNull(dVD2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(item12);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.team4.functionality.buy.ItemPurchased itemPurchased2 = new org.team4.functionality.buy.ItemPurchased("", "Mobile Wallet");
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.team4.model.user.Student student19 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str20 = student19.getType();
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        student19.setCourses(strList23);
        org.team4.model.user.Faculty faculty26 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", (long) (byte) -1, strList23);
        org.team4.model.user.Faculty faculty27 = new org.team4.model.user.Faculty("", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", "ItemPurchased{title='', email='hi!', datePurchased=null}", (long) (byte) 0, strList23);
        long long28 = faculty27.getFacultyID();
        java.util.ArrayList<java.lang.String> strList29 = faculty27.getCourses();
        org.team4.model.user.Faculty faculty30 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}", "", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", 2407500L, strList29);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
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
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder44 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder46 = courseTextBookBuilder44.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder48 = courseTextBookBuilder44.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder50 = courseTextBookBuilder44.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder52 = courseTextBookBuilder44.price((double) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder54 = courseTextBookBuilder44.price((double) 10);
        boolean boolean55 = item12.equals((java.lang.Object) courseTextBookBuilder44);
        org.team4.model.items.builder.BookBuilder bookBuilder57 = courseTextBookBuilder44.publisher("Credit Card");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder59 = courseTextBookBuilder44.quantity((int) '4');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder61 = bookItemBuilder59.ISBN("User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=hi!, name=User [email=, password=, name=hi!, type=, validated=false], type=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, validated=false]");
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Tue Apr 30 20:32:05 EDT 2024");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 20:32:05 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 20:32:05 EDT 2024");
        org.junit.Assert.assertNotNull(bookBuilder46);
        org.junit.Assert.assertNotNull(bookItemBuilder48);
        org.junit.Assert.assertNotNull(bookBuilder50);
        org.junit.Assert.assertNotNull(bookItemBuilder52);
        org.junit.Assert.assertNotNull(bookItemBuilder54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(bookBuilder57);
        org.junit.Assert.assertNotNull(bookItemBuilder59);
        org.junit.Assert.assertNotNull(bookItemBuilder61);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}', email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', dateSubscribed=Sat Mar 30 20:32:00 EDT 2024, dateDue=Tue Apr 30 20:32:00 EDT 2024}", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:04 EDT 2024, dateDue=Tue Apr 30 20:32:04 EDT 2024}", "Mobile Wallet", "ProcessPayment{modes=null, itemToPurchase=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}}");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("hi!", "hi!", "hi!", "");
        nonFaculty5.setUniversityID((long) (short) 100);
        long long8 = nonFaculty5.getUniversityID();
        nonFaculty5.setUniversityID((long) (short) 100);
        boolean boolean11 = nonFaculty5.isValidated();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase12 = new org.team4.functionality.buy.ItemToPurchase((double) '#', (org.team4.model.user.User) nonFaculty5);
        org.team4.model.items.Newsletter newsletter13 = itemToPurchase12.getNewsletter();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(newsletter13);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        boolean boolean4 = debitCard3.correctLength();
        boolean boolean5 = debitCard3.isValid();
        boolean boolean6 = debitCard3.notExpired();
        boolean boolean7 = debitCard3.notExpired();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.DVD dVD10 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Credit Card", 0.0d);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator11 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD10);
        org.team4.model.items.Item item12 = rentableItemDecorator11.getItem();
        rentableItemDecorator11.setQuantity((int) (short) 1);
        int int15 = rentableItemDecorator11.getYearPublished();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(item12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "PayPal", "Mobile Wallet");
        java.lang.String str5 = visitor4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PayPal" + "'", str5, "PayPal");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.booktype("Credit Card");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder3.ISBN("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder9 = bookRequestBuilder7.title("Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
        org.junit.Assert.assertNotNull(bookRequestBuilder9);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder3 = dVDBuilder0.price((double) (-1));
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder5 = dVDBuilder0.ISBN("Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNotNull(dVDItemBuilder3);
        org.junit.Assert.assertNotNull(dVDItemBuilder5);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.DVDBuilder dVDBuilder7 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD8 = dVDBuilder7.build();
        java.lang.String str9 = dVD8.getGenre();
        boolean boolean10 = dVD8.isPurchasable();
        double double11 = dVD8.getDuration();
        dVD8.setQuantity((int) (short) 1);
        dVD8.setQuantity((int) ' ');
        boolean boolean16 = dVD8.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator17 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD8);
        org.team4.model.items.Item item18 = rentableItemDecorator17.getItem();
        org.team4.model.items.Item item19 = new org.team4.model.items.Item(item18);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter28 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str29 = subscribeNewsletter28.getTitle();
        java.util.Date date30 = null;
        subscribeNewsletter28.setDateSubscribed(date30);
        java.util.Date date32 = subscribeNewsletter28.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter37 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str38 = subscribeNewsletter37.getEmail();
        java.util.Date date39 = subscribeNewsletter37.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter42 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str43 = subscribeNewsletter42.getEmail();
        java.util.Date date44 = subscribeNewsletter42.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter45 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date39, date44);
        org.team4.model.course.Course course48 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date32, date44, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.model.course.CourseTextBook courseTextBook50 = new org.team4.model.course.CourseTextBook(item19, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", (int) (short) 1, "hi!", "PayPal", 52, course48, false);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder51 = courseTextBookBuilder0.course(course48);
        java.lang.String str52 = course48.getCourseName();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(dVD8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(item18);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 20:32:06 EDT 2024");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Tue Apr 30 20:32:06 EDT 2024");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Tue Apr 30 20:32:06 EDT 2024");
        org.junit.Assert.assertNotNull(courseTextBookBuilder51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str52, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        org.team4.model.user.Student student10 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str11 = student10.getType();
        course5.enrollStudent(student10);
        java.lang.String str13 = course5.getProfessorEmail();
        org.team4.model.user.Student student19 = new org.team4.model.user.Student("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "Mobile Wallet", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}", false);
        boolean boolean20 = course5.isEnrolled(student19);
        java.util.Date date21 = course5.getStartDate();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(date21);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}", "User [email=, password=, name=hi!, type=hi!, validated=false]", "User [email=, password=, name=hi!, type=, validated=false]", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase((double) 97L, (org.team4.model.user.User) manager5);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", 0.0d);
        java.lang.String str4 = newsletter3.getLink();
        double double5 = newsletter3.getPrice();
        org.team4.model.user.Student student11 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str12 = student11.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase13 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student11);
        org.team4.model.items.Newsletter newsletter14 = itemToPurchase13.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet16 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete17 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase13, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet16);
        org.team4.model.user.User user18 = itemToPurchase13.getUser();
        org.team4.model.user.User user19 = itemToPurchase13.getUser();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase20 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, user19);
        java.lang.String str21 = newsletter3.getLink();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str4, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(newsletter14);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str21, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
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
        org.team4.model.items.builder.BookBuilder bookBuilder59 = courseTextBookBuilder57.noOfPages(32);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder61 = bookBuilder59.yearPublished(52);
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
        org.junit.Assert.assertNotNull(bookItemBuilder61);
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
        int int8 = book7.getNoOfPages();
        int int9 = book7.getQuantity();
        boolean boolean10 = book7.hasSoftCopy();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder3 = dVDBuilder0.price((double) (-1));
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder5 = dVDItemBuilder3.quantity((int) (short) 0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder7 = dVDItemBuilder5.price((double) 32);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNotNull(dVDItemBuilder3);
        org.junit.Assert.assertNotNull(dVDItemBuilder5);
        org.junit.Assert.assertNotNull(dVDItemBuilder7);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.yearPublished((int) (short) 0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineItemBuilder6.yearPublished((int) (short) -1);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
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
        org.team4.functionality.buy.PurchaseComplete purchaseComplete18 = processPayment16.getPurchaseCompleted();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete19 = processPayment16.getPurchaseCompleted();
        java.lang.String str20 = processPayment16.toString();
        java.lang.String str21 = processPayment16.toString();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(purchaseComplete18);
        org.junit.Assert.assertNull(purchaseComplete19);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder3 = dVDBuilder0.genre("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder5 = dVDBuilder0.yearPublished((int) 'a');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder7 = dVDBuilder0.quantity((-1));
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNotNull(dVDBuilder3);
        org.junit.Assert.assertNotNull(dVDItemBuilder5);
        org.junit.Assert.assertNotNull(dVDItemBuilder7);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.user.User user12 = purchaseComplete11.getUser();
        org.team4.model.items.Item item13 = purchaseComplete11.getItem();
        org.team4.model.user.User user14 = purchaseComplete11.getUser();
        org.team4.model.items.Newsletter newsletter15 = purchaseComplete11.getNewsletter();
        org.team4.model.user.User user16 = purchaseComplete11.getUser();
        org.team4.model.items.Newsletter newsletter17 = purchaseComplete11.getNewsletter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNull(newsletter17);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemPurchased{title='', email='', datePurchased=null}", "", "User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.user.Student student10 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str11 = student10.getType();
        org.team4.model.user.Student student16 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str17 = student16.getType();
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        student16.setCourses(strList20);
        student10.setCourses(strList20);
        faculty5.setCourses(strList20);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase25 = new org.team4.functionality.buy.ItemToPurchase((double) 423120L, (org.team4.model.user.User) faculty5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.DVD dVD10 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Credit Card", 0.0d);
        int int11 = book7.getNoOfPages();
        book7.setPrice((double) (-1L));
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator14 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) book7);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.team4.model.user.Student student8 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str9 = student8.getType();
        org.team4.model.user.Student student14 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str15 = student14.getType();
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        student14.setCourses(strList18);
        student8.setCourses(strList18);
        org.team4.model.user.Student student22 = new org.team4.model.user.Student("User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, type=PayPal, validated=true]", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}", strList18);
        java.lang.String[] strArray50 = new java.lang.String[] { "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "PayPal", "ItemPurchased{title='', email='hi!', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemPurchased{title='', email='', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        org.team4.model.user.Faculty faculty53 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "", "ItemPurchased{title='', email='', datePurchased=null}", 0L, strList51);
        org.team4.model.user.Faculty faculty54 = new org.team4.model.user.Faculty("hi!", "", "Credit Card", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", (long) '#', strList51);
        org.team4.model.user.Faculty faculty55 = new org.team4.model.user.Faculty("hi!", "ItemPurchased{title='', email='hi!', datePurchased=null}", "Credit Card", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", (long) 10, strList51);
        student22.setCourses(strList51);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("");
        org.team4.model.user.Student student7 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str8 = student7.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase9 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student7);
        org.team4.model.items.Newsletter newsletter10 = itemToPurchase9.getNewsletter();
        org.team4.functionality.buy.ProcessPayment processPayment11 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet1, itemToPurchase9);
        java.lang.Class<?> wildcardClass12 = itemToPurchase9.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:32:05 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:02 EDT 2024, dateDue=Tue Apr 30 20:32:02 EDT 2024}", "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:32:03 EDT 2024}", "PayPal{email='PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}'}");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.util.Date date3 = subscribeNewsletter2.getDateDue();
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Tue Apr 30 20:32:06 EDT 2024");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "Mobile Wallet");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder10 = courseTextBookBuilder0.isVirtual(false);
        org.team4.model.items.Book book11 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder13 = courseTextBookBuilder0.quantity((int) (short) 10);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(courseTextBookBuilder10);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(bookItemBuilder13);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.lang.String str6 = course5.getProfessorEmail();
        java.util.Date date7 = course5.getStartDate();
        java.lang.String str8 = course5.getProfessorEmail();
        java.util.Date date9 = course5.getStartDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = course5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.toString()\" because \"this.startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.paymentmodes.CreditCard creditCard10 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) creditCard10);
        long long12 = purchaseComplete11.getPurchaseID();
        org.team4.model.user.User user13 = purchaseComplete11.getUser();
        long long14 = purchaseComplete11.getPurchaseID();
        long long15 = purchaseComplete11.getPurchaseID();
        org.team4.model.user.User user16 = purchaseComplete11.getUser();
        org.team4.model.user.User user17 = purchaseComplete11.getUser();
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3186085L + "'", long12 == 3186085L);
        org.junit.Assert.assertNotNull(user13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3186085L + "'", long14 == 3186085L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3186085L + "'", long15 == 3186085L);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user17);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", 0.0d);
        java.lang.String str4 = newsletter3.getLink();
        double double5 = newsletter3.getPrice();
        double double6 = newsletter3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str4, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        boolean boolean4 = debitCard3.notExpired();
        boolean boolean5 = debitCard3.correctLength();
        boolean boolean6 = debitCard3.correctLength();
        java.lang.String str7 = debitCard3.getMode();
        boolean boolean8 = debitCard3.correctLength();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Debit Card" + "'", str7, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        boolean boolean10 = book9.hasHardCopy();
        boolean boolean11 = book9.hasSoftCopy();
        java.util.Date date13 = null;
        java.util.Date date14 = null;
        org.team4.model.course.Course course17 = new org.team4.model.course.Course("hi!", date13, date14, "", "hi!");
        java.util.Date date18 = course17.getEndDate();
        java.lang.String str19 = course17.getProfessorEmail();
        java.lang.String str20 = course17.getProfessorEmail();
        org.team4.model.user.Student student25 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean26 = course17.isEnrolled(student25);
        student25.setEmail("Credit Card");
        boolean boolean29 = book9.equals((java.lang.Object) student25);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.yearPublished((int) (short) 0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineBuilder0.quantity((int) (short) 1);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder10 = magazineBuilder0.publisher("User [email=, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=PayPal, validated=false]");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder12 = magazineBuilder10.publisher("User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=hi!, name=User [email=, password=, name=hi!, type=, validated=false], type=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, validated=false]");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
        org.junit.Assert.assertNotNull(magazineBuilder10);
        org.junit.Assert.assertNotNull(magazineBuilder12);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder6.quantity((-1));
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = courseTextBookBuilder6.price((double) 100L);
        org.team4.model.items.builder.BookBuilder bookBuilder14 = courseTextBookBuilder6.hasHardCopy(false);
        org.team4.model.items.builder.BookBuilder bookBuilder16 = courseTextBookBuilder6.author("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(bookItemBuilder12);
        org.junit.Assert.assertNotNull(bookBuilder14);
        org.junit.Assert.assertNotNull(bookBuilder16);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "hi!");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:02 EDT 2024, dateDue=Tue Apr 30 20:32:02 EDT 2024}", "User [email=, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=PayPal, validated=false]", "User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=hi!, name=User [email=, password=, name=hi!, type=, validated=false], type=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, validated=false]", "PayPal{email='PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}'}", true);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.paymentmodes.DebitCard debitCard15 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete16 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) debitCard15);
        org.team4.model.paymentmodes.CreditCard creditCard20 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        boolean boolean21 = creditCard20.notExpired();
        boolean boolean22 = creditCard20.isValid();
        boolean boolean23 = creditCard20.notExpired();
        boolean boolean24 = creditCard20.correctLength();
        boolean boolean25 = creditCard20.correctLength();
        boolean boolean26 = creditCard20.correctLength();
        java.lang.String str27 = creditCard20.getMode();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete28 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) creditCard20);
        org.team4.model.items.Item item29 = purchaseComplete28.getItem();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Credit Card" + "'", str27, "Credit Card");
        org.junit.Assert.assertNull(item29);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.title("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.title("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder5.title("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder9 = bookRequestBuilder5.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}");
        org.team4.model.items.BookRequest bookRequest10 = bookRequestBuilder5.build();
        int int11 = bookRequest10.getEdition();
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
        org.junit.Assert.assertNotNull(bookRequestBuilder9);
        org.junit.Assert.assertNotNull(bookRequest10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.team4.model.user.User user5 = new org.team4.model.user.User("User [email=, password=, name=hi!, type=, validated=false]", "Mobile Wallet", "SubscribeNewsletter{title='Debit Card', email='hi!', dateSubscribed=Sat Mar 30 20:32:04 EDT 2024, dateDue=Tue Apr 30 20:32:04 EDT 2024}", "", false);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.team4.model.items.Item item0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.items.Magazine magazine3 = new org.team4.model.items.Magazine(item0, "", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"title\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
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
        manager23.setName("User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, type=PayPal, validated=true]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(dVD6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(item16);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}", "User [email=, password=, name=hi!, type=, validated=false]", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", false);
        java.util.ArrayList<java.lang.String> strList6 = student5.getCourses();
        org.junit.Assert.assertNull(strList6);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        org.team4.model.user.Student student10 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str11 = student10.getType();
        course5.enrollStudent(student10);
        java.lang.String str13 = course5.getCourseName();
        java.lang.String str14 = course5.getCourseTextBookISBN();
        java.lang.String str15 = course5.getCourseName();
        java.util.Date date17 = null;
        java.util.Date date18 = null;
        org.team4.model.course.Course course21 = new org.team4.model.course.Course("hi!", date17, date18, "", "hi!");
        org.team4.model.user.Student student26 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str27 = student26.getType();
        course21.enrollStudent(student26);
        java.lang.String str29 = course21.getProfessorEmail();
        java.lang.String str30 = course21.getProfessorEmail();
        java.lang.String str31 = course21.getCourseTextBookISBN();
        org.team4.model.user.Student student37 = new org.team4.model.user.Student("Credit Card", "Credit Card", "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemPurchased{title='', email='', datePurchased=null}", true);
        course21.enrollStudent(student37);
        course5.enrollStudent(student37);
        java.util.Date date40 = course5.getStartDate();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(date40);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
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
        org.team4.model.items.Newsletter newsletter41 = itemToPurchase39.getNewsletter();
        double double42 = itemToPurchase39.getAmount();
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
        org.junit.Assert.assertNull(newsletter41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
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
        org.team4.model.items.DVD dVD14 = new org.team4.model.items.DVD((org.team4.model.items.Item) rentableItemDecorator10, "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}", (double) 3093246L);
        boolean boolean15 = dVD14.isRentable();
        double double16 = dVD14.getDuration();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3093246.0d + "'", double16 == 3093246.0d);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder3 = dVDBuilder0.genre("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder5 = dVDBuilder0.quantity(32);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNotNull(dVDBuilder3);
        org.junit.Assert.assertNotNull(dVDItemBuilder5);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}", 2135605L);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
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
        org.team4.model.items.builder.BookBuilder bookBuilder59 = courseTextBookBuilder57.author("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder61 = bookBuilder59.ISBN("ProcessPayment{modes=null, itemToPurchase=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}}");
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
        org.junit.Assert.assertNotNull(bookItemBuilder61);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 10);
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder2.genre("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDBuilder6.price((double) 100L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder10 = dVDItemBuilder8.ISBN("PayPal{email='PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}'}");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
        org.junit.Assert.assertNotNull(dVDItemBuilder10);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
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
        int int54 = courseTextBook45.getEdition();
        org.team4.model.items.decorator.ItemDecorator itemDecorator55 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook45);
        java.util.Date date57 = null;
        java.util.Date date58 = null;
        org.team4.model.course.Course course61 = new org.team4.model.course.Course("hi!", date57, date58, "", "hi!");
        org.team4.model.user.Student student66 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str67 = student66.getType();
        course61.enrollStudent(student66);
        java.lang.String str69 = course61.getCourseName();
        java.lang.String str70 = course61.getCourseTextBookISBN();
        org.team4.model.user.Student student75 = new org.team4.model.user.Student("", "", "PayPal", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        boolean boolean76 = course61.isEnrolled(student75);
        java.util.Date date78 = null;
        java.util.Date date79 = null;
        org.team4.model.course.Course course82 = new org.team4.model.course.Course("hi!", date78, date79, "", "hi!");
        java.util.Date date83 = course82.getEndDate();
        java.lang.String str84 = course82.getProfessorEmail();
        java.lang.String str85 = course82.getProfessorEmail();
        org.team4.model.user.Student student90 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean91 = course82.isEnrolled(student90);
        course61.enrollStudent(student90);
        courseTextBook45.makeCopies(student90);
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
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 97 + "'", int54 == 97);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(date83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "User [email=, password=, name=hi!, type=, validated=false]", "User [email=, password=, name=hi!, type=, validated=false]", (long) (byte) 1);
        manager5.setManagerID((long) (byte) 0);
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
        java.lang.String str9 = courseTextBook8.getISBN();
        org.team4.model.user.Student student15 = new org.team4.model.user.Student("", "", "hi!", "");
        student15.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase18 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student15);
        java.lang.String str19 = student15.getEmail();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase20 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) courseTextBook8, (org.team4.model.user.User) student15);
        org.team4.model.items.DVD dVD23 = new org.team4.model.items.DVD((org.team4.model.items.Item) courseTextBook8, "ItemPurchased{title='', email='', datePurchased=null}", 0.0d);
        java.lang.String str24 = courseTextBook8.getAuthor();
        int int25 = courseTextBook8.getYearPublished();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}", "User [email=, password=, name=hi!, type=, validated=false]", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", true);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        boolean boolean8 = book7.hasHardCopy();
        boolean boolean9 = book7.hasSoftCopy();
        java.util.Date date16 = null;
        java.util.Date date17 = null;
        org.team4.model.course.Course course20 = new org.team4.model.course.Course("hi!", date16, date17, "", "hi!");
        java.util.Date date21 = course20.getEndDate();
        org.team4.model.course.CourseTextBook courseTextBook23 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) book7, "User [email=, password=, name=hi!, type=, validated=false]", 1, "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "", (-1), course20, true);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator24 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) book7);
        boolean boolean25 = purchasableItemDecorator24.isPurchasable();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}', email='hi!', dateSubscribed=null, dateDue=Tue Apr 30 20:32:02 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}', email='hi!', dateSubscribed=null, dateDue=Tue Apr 30 20:32:02 EDT 2024}", "User [email=, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=PayPal, validated=false]", true);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        boolean boolean4 = debitCard3.correctLength();
        java.lang.String str5 = debitCard3.getMode();
        boolean boolean6 = debitCard3.notExpired();
        boolean boolean7 = debitCard3.notExpired();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        java.lang.String str12 = mobileWallet10.getMode();
        java.lang.String str13 = mobileWallet10.getMode();
        java.lang.String str14 = mobileWallet10.getMode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PayPal" + "'", str12, "PayPal");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PayPal" + "'", str13, "PayPal");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PayPal" + "'", str14, "PayPal");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.quantity(10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDItemBuilder4.title("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDItemBuilder6.yearPublished((int) ' ');
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook8 = courseTextBookBuilder6.build();
        java.util.List<org.team4.model.user.Student> studentList9 = courseTextBook8.getStudentsWithCopies();
        int int10 = courseTextBook8.getNoOfPages();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator11 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) courseTextBook8);
        boolean boolean12 = rentableItemDecorator11.isRentable();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertNotNull(studentList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder6 = magazineBuilder4.issueNumber((int) (byte) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineBuilder4.price((double) (short) 100);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDBuilder2.quantity(10);
        org.team4.model.items.builder.DVDBuilder dVDBuilder8 = dVDBuilder2.genre("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder10 = dVDBuilder8.duration((double) 0);
        org.team4.model.items.builder.DVDBuilder dVDBuilder12 = dVDBuilder8.duration((double) 2135605L);
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDBuilder8);
        org.junit.Assert.assertNotNull(dVDBuilder10);
        org.junit.Assert.assertNotNull(dVDBuilder12);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
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
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertNotNull(courseTextBook9);
        org.junit.Assert.assertNotNull(studentList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        java.lang.String str8 = itemToPurchase7.toString();
        double double9 = itemToPurchase7.getAmount();
        org.team4.model.items.Item item10 = itemToPurchase7.getItem();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}" + "'", str8, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("ItemPurchased{title='', email='hi!', datePurchased=null}", (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}");
        java.lang.String str5 = faculty4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [email=ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}, validated=false]" + "'", str5, "User [email=ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}, validated=false]");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, type=PayPal, validated=true]", "ItemPurchased{title='', email='', datePurchased=null}");
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.booktype("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder3.author("SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:31:55 EDT 2024, dateDue=Tue Apr 30 20:31:55 EDT 2024}");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
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
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder44 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder46 = courseTextBookBuilder44.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder48 = courseTextBookBuilder44.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder50 = courseTextBookBuilder44.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder52 = courseTextBookBuilder44.price((double) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder54 = courseTextBookBuilder44.price((double) 10);
        boolean boolean55 = item12.equals((java.lang.Object) courseTextBookBuilder44);
        org.team4.model.items.Item item56 = new org.team4.model.items.Item(item12);
        double double57 = item56.getPrice();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Tue Apr 30 20:32:07 EDT 2024");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 20:32:07 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 20:32:07 EDT 2024");
        org.junit.Assert.assertNotNull(bookBuilder46);
        org.junit.Assert.assertNotNull(bookItemBuilder48);
        org.junit.Assert.assertNotNull(bookBuilder50);
        org.junit.Assert.assertNotNull(bookItemBuilder52);
        org.junit.Assert.assertNotNull(bookItemBuilder54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        boolean boolean4 = debitCard3.correctLength();
        boolean boolean5 = debitCard3.isValid();
        boolean boolean6 = debitCard3.notExpired();
        boolean boolean7 = debitCard3.correctLength();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.ISBN("User [email=, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=PayPal, validated=false]");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        boolean boolean4 = debitCard3.correctLength();
        boolean boolean5 = debitCard3.correctLength();
        org.team4.model.user.Student student11 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str12 = student11.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase13 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student11);
        org.team4.functionality.buy.ProcessPayment processPayment14 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) debitCard3, itemToPurchase13);
        double double15 = itemToPurchase13.getAmount();
        org.team4.model.items.Newsletter newsletter16 = itemToPurchase13.getNewsletter();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNull(newsletter16);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder3 = dVDBuilder0.price((double) (-1));
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder5 = dVDBuilder0.yearPublished(10);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNotNull(dVDItemBuilder3);
        org.junit.Assert.assertNotNull(dVDItemBuilder5);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:31:55 EDT 2024, dateDue=Tue Apr 30 20:31:55 EDT 2024}", false);
        nonFaculty5.setUniversityID(423120L);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.price((double) (byte) 1);
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder6.edition(10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = courseTextBookBuilder6.price((double) 10L);
        org.team4.model.course.CourseTextBook courseTextBook13 = courseTextBookBuilder6.build();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(bookItemBuilder12);
        org.junit.Assert.assertNotNull(courseTextBook13);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        boolean boolean10 = book9.hasHardCopy();
        org.team4.model.items.builder.DVDBuilder dVDBuilder11 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder13 = dVDBuilder11.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder15 = dVDBuilder13.price((double) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder17 = dVDItemBuilder15.price(10.0d);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder19 = dVDItemBuilder17.price((double) 1L);
        boolean boolean20 = book9.equals((java.lang.Object) dVDItemBuilder17);
        org.team4.model.items.DVD dVD23 = new org.team4.model.items.DVD((org.team4.model.items.Item) book9, "ProcessPayment{modes=null, itemToPurchase=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}}", (double) 2135605L);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dVDBuilder13);
        org.junit.Assert.assertNotNull(dVDItemBuilder15);
        org.junit.Assert.assertNotNull(dVDItemBuilder17);
        org.junit.Assert.assertNotNull(dVDItemBuilder19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal", "Credit Card", "");
        boolean boolean5 = student4.isValidated();
        java.util.ArrayList<java.lang.String> strList6 = student4.getCourses();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strList6);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
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
        java.util.Date date60 = null;
        java.util.Date date61 = null;
        org.team4.model.course.Course course64 = new org.team4.model.course.Course("hi!", date60, date61, "", "hi!");
        java.util.Date date65 = course64.getEndDate();
        java.lang.String str66 = course64.getProfessorEmail();
        java.lang.String str67 = course64.getProfessorEmail();
        org.team4.model.user.Student student72 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean73 = course64.isEnrolled(student72);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase74 = new org.team4.functionality.buy.ItemToPurchase(100.0d, (org.team4.model.user.User) student72);
        course40.enrollStudent(student72);
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
        org.junit.Assert.assertNull(date65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("");
        org.team4.model.user.Student student7 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str8 = student7.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase9 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student7);
        org.team4.model.items.Newsletter newsletter10 = itemToPurchase9.getNewsletter();
        org.team4.functionality.buy.ProcessPayment processPayment11 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet1, itemToPurchase9);
        boolean boolean12 = mobileWallet1.isValid();
        boolean boolean13 = mobileWallet1.isValid();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "ItemPurchased{title='', email='', datePurchased=null}", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:31:55 EDT 2024, dateDue=Tue Apr 30 20:31:55 EDT 2024}", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", true);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.team4.model.items.builder.BookBuilder bookBuilder0 = new org.team4.model.items.builder.BookBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder2 = bookBuilder0.yearPublished((int) (short) 1);
        org.team4.model.items.builder.BookBuilder bookBuilder4 = bookBuilder0.author("Mobile Wallet");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = bookBuilder4.genre("Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
        org.junit.Assert.assertNotNull(bookItemBuilder2);
        org.junit.Assert.assertNotNull(bookBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.email("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.booktype("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder6.edition((int) '#');
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder10 = bookRequestBuilder8.ISBN("ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:32:05 EDT 2024}");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
        org.junit.Assert.assertNotNull(bookRequestBuilder10);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder6 = magazineBuilder4.issueNumber(32);
        org.team4.model.items.Magazine magazine7 = magazineBuilder4.build();
        java.util.Date date14 = null;
        java.util.Date date15 = null;
        org.team4.model.course.Course course18 = new org.team4.model.course.Course("hi!", date14, date15, "", "hi!");
        org.team4.model.user.Student student23 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str24 = student23.getType();
        course18.enrollStudent(student23);
        org.team4.model.course.CourseTextBook courseTextBook27 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) magazine7, "User [email=, password=, name=hi!, type=hi!, validated=false]", 0, "SubscribeNewsletter{title='Debit Card', email='hi!', dateSubscribed=Sat Mar 30 20:32:04 EDT 2024, dateDue=Tue Apr 30 20:32:04 EDT 2024}", "Mobile Wallet", (int) (byte) 0, course18, true);
        org.team4.model.items.DVD dVD30 = new org.team4.model.items.DVD((org.team4.model.items.Item) magazine7, "ProcessPayment{modes=null, itemToPurchase=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}}", (double) 97);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineBuilder6);
        org.junit.Assert.assertNotNull(magazine7);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.team4.functionality.buy.ItemPurchased itemPurchased2 = new org.team4.functionality.buy.ItemPurchased("ItemPurchased{title='', email='', datePurchased=null}", "");
        java.util.Date date3 = itemPurchased2.getDatePurchased();
        java.lang.String str4 = itemPurchased2.toString();
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Sat Mar 30 20:32:07 EDT 2024");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='', datePurchased=Sat Mar 30 20:32:07 EDT 2024}" + "'", str4, "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='', datePurchased=Sat Mar 30 20:32:07 EDT 2024}");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", 0, (int) (byte) 100, 0.0d, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:02 EDT 2024, dateDue=Tue Apr 30 20:32:02 EDT 2024}", false, true);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.team4.model.paymentmodes.PaymentValidator paymentValidator0 = null;
        org.team4.model.user.Student student6 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str7 = student6.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase8 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student6);
        org.team4.model.items.Newsletter newsletter9 = itemToPurchase8.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet11 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete12 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase8, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet11);
        org.team4.model.paymentmodes.DebitCard debitCard16 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete17 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase8, (org.team4.model.paymentmodes.PaymentValidator) debitCard16);
        org.team4.functionality.buy.ProcessPayment processPayment18 = new org.team4.functionality.buy.ProcessPayment(paymentValidator0, itemToPurchase8);
        org.team4.model.items.Newsletter newsletter19 = itemToPurchase8.getNewsletter();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(newsletter19);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.team4.functionality.buy.ItemPurchased itemPurchased2 = new org.team4.functionality.buy.ItemPurchased("ItemPurchased{title='', email='', datePurchased=null}", "ItemPurchased{title='', email='', datePurchased=null}");
        java.lang.String str3 = itemPurchased2.toString();
        java.util.Date date4 = itemPurchased2.getDatePurchased();
        java.lang.String str5 = itemPurchased2.getTitle();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:32:07 EDT 2024}" + "'", str3, "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:32:07 EDT 2024}");
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Sat Mar 30 20:32:07 EDT 2024");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str5, "ItemPurchased{title='', email='', datePurchased=null}");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder0.price((double) 10);
        org.team4.model.course.CourseTextBook courseTextBook11 = courseTextBookBuilder0.build();
        org.team4.model.items.Item item12 = new org.team4.model.items.Item((org.team4.model.items.Item) courseTextBook11);
        java.lang.String str13 = courseTextBook11.getPublisher();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(courseTextBook11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.team4.model.user.Manager manager4 = new org.team4.model.user.Manager("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "User [email=, password=, name=hi!, type=, validated=false]");
        manager4.setValidated(true);
        java.lang.String str7 = manager4.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str7, "User [email=, password=, name=hi!, type=, validated=false]");
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
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
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder18 = courseTextBookBuilder16.yearPublished((int) (byte) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder20 = bookItemBuilder18.price((double) 100.0f);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNotNull(courseTextBookBuilder16);
        org.junit.Assert.assertNotNull(bookItemBuilder18);
        org.junit.Assert.assertNotNull(bookItemBuilder20);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.team4.model.user.Manager manager4 = new org.team4.model.user.Manager("Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "User [email=, password=, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}', email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', dateSubscribed=Sat Mar 30 20:32:00 EDT 2024, dateDue=Tue Apr 30 20:32:00 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder6.quantity((-1));
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder12 = courseTextBookBuilder6.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder14 = courseTextBookBuilder6.hasSoftCopy(false);
        org.team4.model.items.builder.BookBuilder bookBuilder16 = courseTextBookBuilder6.genre("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(courseTextBookBuilder12);
        org.junit.Assert.assertNotNull(bookBuilder14);
        org.junit.Assert.assertNotNull(bookBuilder16);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}");
        org.team4.model.items.DVD dVD5 = dVDBuilder2.build();
        java.util.ArrayList<java.lang.String> strList12 = null;
        org.team4.model.user.Faculty faculty13 = new org.team4.model.user.Faculty("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "", "ItemPurchased{title='', email='hi!', datePurchased=null}", (long) (short) -1, strList12);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase14 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 1, (org.team4.model.user.User) faculty13);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase15 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) dVD5, (org.team4.model.user.User) faculty13);
        org.team4.model.items.Newsletter newsletter16 = itemToPurchase15.getNewsletter();
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVD5);
        org.junit.Assert.assertNull(newsletter16);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("Credit Card", (int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter2.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter2.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter9 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date10 = null;
        subscribeNewsletter9.setDateSubscribed(date10);
        java.util.Date date12 = subscribeNewsletter9.getDateDue();
        subscribeNewsletter2.setDateDue(date12);
        java.util.Date date14 = subscribeNewsletter2.getDateSubscribed();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter17 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str18 = subscribeNewsletter17.getEmail();
        java.util.Date date19 = subscribeNewsletter17.getDateDue();
        subscribeNewsletter2.setDateSubscribed(date19);
        java.util.Date date21 = subscribeNewsletter2.getDateDue();
        java.lang.String str22 = subscribeNewsletter2.getEmail();
        java.lang.String str23 = subscribeNewsletter2.getTitle();
        subscribeNewsletter2.setTitle("hi!");
        subscribeNewsletter2.setTitle("");
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Tue Apr 30 20:32:07 EDT 2024");
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Sat Mar 30 20:32:07 EDT 2024");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Tue Apr 30 20:32:07 EDT 2024");
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Tue Apr 30 20:32:07 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str22, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PayPal" + "'", str23, "PayPal");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, type=PayPal, validated=true]", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", false);
        java.lang.String[] strArray33 = new java.lang.String[] { "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "PayPal", "ItemPurchased{title='', email='hi!', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemPurchased{title='', email='', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        org.team4.model.user.Faculty faculty36 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "", "ItemPurchased{title='', email='', datePurchased=null}", 0L, strList34);
        org.team4.model.user.Faculty faculty37 = new org.team4.model.user.Faculty("hi!", "", "Credit Card", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", (long) '#', strList34);
        org.team4.model.user.Faculty faculty38 = new org.team4.model.user.Faculty("hi!", "ItemPurchased{title='', email='hi!', datePurchased=null}", "Credit Card", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", (long) 10, strList34);
        faculty5.setCourses(strList34);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:59 EDT 2024, dateDue=Tue Apr 30 20:31:59 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}");
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "", "User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, type=PayPal, validated=true]", false);
        java.lang.String str6 = manager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str6, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.booktype("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder5.ISBN("PayPal");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder9 = bookRequestBuilder5.edition((int) (byte) 100);
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder11 = bookRequestBuilder5.author("Credit Card");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
        org.junit.Assert.assertNotNull(bookRequestBuilder9);
        org.junit.Assert.assertNotNull(bookRequestBuilder11);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
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
        java.lang.String str23 = courseTextBook8.toString();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(course22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}" + "'", str23, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        boolean boolean4 = creditCard3.notExpired();
        boolean boolean5 = creditCard3.isValid();
        boolean boolean6 = creditCard3.notExpired();
        boolean boolean7 = creditCard3.correctLength();
        boolean boolean8 = creditCard3.correctLength();
        boolean boolean9 = creditCard3.correctLength();
        boolean boolean10 = creditCard3.isValid();
        boolean boolean11 = creditCard3.correctLength();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        java.lang.String str2 = bookRequest1.getTitle();
        java.lang.String str3 = bookRequest1.getEmail();
        java.lang.String str4 = bookRequest1.getBookType();
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.yearPublished((int) (short) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder8 = magazineBuilder0.issueNumber(100);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder10 = magazineBuilder8.publisher("Debit Card");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder12 = magazineBuilder10.title("");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder14 = magazineBuilder10.issueNumber((int) (byte) -1);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineBuilder8);
        org.junit.Assert.assertNotNull(magazineBuilder10);
        org.junit.Assert.assertNotNull(magazineItemBuilder12);
        org.junit.Assert.assertNotNull(magazineBuilder14);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getEndDate();
        org.team4.model.user.Student student12 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str13 = student12.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase14 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student12);
        java.lang.String str15 = student12.toString();
        course5.enrollStudent(student12);
        org.team4.model.user.Student student17 = null;
        boolean boolean18 = course5.isEnrolled(student17);
        org.team4.model.items.builder.DVDBuilder dVDBuilder19 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD20 = dVDBuilder19.build();
        java.lang.String str21 = dVD20.getGenre();
        boolean boolean22 = dVD20.isPurchasable();
        double double23 = dVD20.getDuration();
        dVD20.setQuantity((int) (short) 1);
        dVD20.setQuantity((int) ' ');
        boolean boolean28 = dVD20.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator29 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD20);
        org.team4.model.items.Item item30 = rentableItemDecorator29.getItem();
        org.team4.model.items.Item item31 = new org.team4.model.items.Item(item30);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter40 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str41 = subscribeNewsletter40.getTitle();
        java.util.Date date42 = null;
        subscribeNewsletter40.setDateSubscribed(date42);
        java.util.Date date44 = subscribeNewsletter40.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter49 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str50 = subscribeNewsletter49.getEmail();
        java.util.Date date51 = subscribeNewsletter49.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter54 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str55 = subscribeNewsletter54.getEmail();
        java.util.Date date56 = subscribeNewsletter54.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter57 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date51, date56);
        org.team4.model.course.Course course60 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date44, date56, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.model.course.CourseTextBook courseTextBook62 = new org.team4.model.course.CourseTextBook(item31, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", (int) (short) 1, "hi!", "PayPal", 52, course60, false);
        java.lang.String str63 = course60.getCourseTextBookISBN();
        java.lang.String str64 = course60.getCourseName();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter67 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date68 = null;
        subscribeNewsletter67.setDateSubscribed(date68);
        java.lang.String str70 = subscribeNewsletter67.getTitle();
        java.util.Date date71 = subscribeNewsletter67.getDateDue();
        boolean boolean72 = course60.isStarted(date71);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean73 = course5.isStarted(date71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str15, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dVD20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(item30);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Tue Apr 30 20:32:07 EDT 2024");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(date51);
// flaky:         org.junit.Assert.assertEquals(date51.toString(), "Tue Apr 30 20:32:07 EDT 2024");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Tue Apr 30 20:32:07 EDT 2024");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str63, "ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str64, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(date71);
// flaky:         org.junit.Assert.assertEquals(date71.toString(), "Tue Apr 30 20:32:07 EDT 2024");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
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
        org.team4.model.items.DVD dVD23 = new org.team4.model.items.DVD((org.team4.model.items.Item) courseTextBook8, "ItemPurchased{title='', email='', datePurchased=null}", 0.0d);
        java.lang.String str24 = courseTextBook8.getGenre();
        org.team4.model.course.Course course25 = courseTextBook8.getCourse();
        org.team4.model.items.Book book33 = new org.team4.model.items.Book((org.team4.model.items.Item) courseTextBook8, "SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}', email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', dateSubscribed=Sat Mar 30 20:32:00 EDT 2024, dateDue=Tue Apr 30 20:32:00 EDT 2024}", 32, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:59 EDT 2024, dateDue=Tue Apr 30 20:31:59 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", (int) (byte) 10, true, false);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(course25);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Sat Mar 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}", "User [email=, password=, name=hi!, type=, validated=false]", "ProcessPayment{modes=null, itemToPurchase=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
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
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder18 = courseTextBookBuilder16.yearPublished((int) (byte) 1);
        org.team4.model.items.builder.BookBuilder bookBuilder20 = courseTextBookBuilder16.publisher("User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, type=PayPal, validated=true]");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNotNull(courseTextBookBuilder16);
        org.junit.Assert.assertNotNull(bookItemBuilder18);
        org.junit.Assert.assertNotNull(bookBuilder20);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "PayPal", (long) (short) -1);
        long long6 = manager5.getManagerID();
        manager5.setManagerID(1232147L);
        java.lang.String str9 = manager5.toString();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}, password=, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}, type=PayPal, validated=false]" + "'", str9, "User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}, password=, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}, type=PayPal, validated=false]");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("Credit Card", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:04 EDT 2024, dateDue=Tue Apr 30 20:32:04 EDT 2024}", (double) (short) 100);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}", "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:32:03 EDT 2024}", "Debit Card", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}", false);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.team4.model.user.User user4 = new org.team4.model.user.User("User [email=, password=, name=hi!, type=, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='Debit Card', email='hi!', dateSubscribed=Sat Mar 30 20:32:04 EDT 2024, dateDue=Tue Apr 30 20:32:04 EDT 2024}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook8 = courseTextBookBuilder6.build();
        java.lang.String str9 = courseTextBook8.getPublisher();
        courseTextBook8.setRentable(true);
        int int12 = courseTextBook8.getYearPublished();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.title("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.title("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder3.email("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder9 = bookRequestBuilder3.ISBN("ProcessPayment{modes=null, itemToPurchase=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}}");
        org.team4.model.items.BookRequest bookRequest10 = bookRequestBuilder9.build();
        java.lang.String str11 = bookRequest10.getEmail();
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
        org.junit.Assert.assertNotNull(bookRequestBuilder9);
        org.junit.Assert.assertNotNull(bookRequest10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}" + "'", str11, "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        boolean boolean4 = debitCard3.correctLength();
        boolean boolean5 = debitCard3.correctLength();
        org.team4.model.user.Student student11 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str12 = student11.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase13 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student11);
        org.team4.functionality.buy.ProcessPayment processPayment14 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) debitCard3, itemToPurchase13);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete15 = processPayment14.getPurchaseCompleted();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete16 = processPayment14.getPurchaseCompleted();
        java.lang.String str17 = processPayment14.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(purchaseComplete15);
        org.junit.Assert.assertNull(purchaseComplete16);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:31:55 EDT 2024, dateDue=Tue Apr 30 20:31:55 EDT 2024}", "User [email=hi!, password=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, name=User [email=, password=, name=hi!, type=, validated=false], type=, validated=false]", "Credit Card", "ItemPurchased{title='', email='', datePurchased=null}", 10L);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("", 32, (int) '4', (double) 3093246L, "", true, false);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}", "PayPal", "hi!", "ProcessPayment{modes=null, itemToPurchase=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}}");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "", "User [email=, password=, name=hi!, type=, validated=false]", "hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase((double) 0L, (org.team4.model.user.User) visitor5);
        java.lang.String str7 = itemToPurchase6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false], newsletter=null}" + "'", str7, "ItemToPurchase{item=null, user=User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false], newsletter=null}");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder0.author("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder12 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder14 = courseTextBookBuilder0.yearPublished((int) (byte) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder16 = courseTextBookBuilder0.ISBN("");
        org.team4.model.items.builder.BookBuilder bookBuilder18 = courseTextBookBuilder0.hasSoftCopy(false);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(courseTextBookBuilder12);
        org.junit.Assert.assertNotNull(bookItemBuilder14);
        org.junit.Assert.assertNotNull(bookItemBuilder16);
        org.junit.Assert.assertNotNull(bookBuilder18);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        boolean boolean10 = book9.hasHardCopy();
        java.lang.String str11 = book9.getISBN();
        org.team4.model.items.decorator.ItemDecorator itemDecorator12 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) book9);
        itemDecorator12.setPurchaseable(true);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 10);
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder2.genre("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDBuilder6.price((double) 100L);
        org.team4.model.items.builder.DVDBuilder dVDBuilder10 = dVDBuilder6.genre("PayPal{email='PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}'}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder12 = dVDBuilder6.quantity(97);
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
        org.junit.Assert.assertNotNull(dVDBuilder10);
        org.junit.Assert.assertNotNull(dVDItemBuilder12);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        boolean boolean8 = book7.hasHardCopy();
        boolean boolean9 = book7.hasSoftCopy();
        java.util.Date date16 = null;
        java.util.Date date17 = null;
        org.team4.model.course.Course course20 = new org.team4.model.course.Course("hi!", date16, date17, "", "hi!");
        java.util.Date date21 = course20.getEndDate();
        org.team4.model.course.CourseTextBook courseTextBook23 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) book7, "User [email=, password=, name=hi!, type=, validated=false]", 1, "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "", (-1), course20, true);
        java.util.Date date25 = null;
        java.util.Date date26 = null;
        org.team4.model.course.Course course29 = new org.team4.model.course.Course("hi!", date25, date26, "", "hi!");
        java.lang.String str30 = course29.getProfessorEmail();
        java.util.Date date31 = course29.getStartDate();
        org.team4.model.user.Student student36 = new org.team4.model.user.Student("", "", "hi!", "");
        student36.setEmail("");
        boolean boolean39 = course29.isEnrolled(student36);
        course20.enrollStudent(student36);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = course20.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.toString()\" because \"this.startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNull(date31);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "PayPal", "User [email=, password=, name=hi!, type=hi!, validated=false]", "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}", (long) 32);
        java.lang.String str6 = nonFaculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [email=, password=, name=hi!, type=hi!, validated=false]" + "'", str6, "User [email=, password=, name=hi!, type=hi!, validated=false]");
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        java.lang.String str4 = magazine3.getPublisher();
        org.team4.model.user.Manager manager10 = new org.team4.model.user.Manager("", "", "", "hi!", false);
        manager10.setValidated(false);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase13 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) magazine3, (org.team4.model.user.User) manager10);
        org.team4.model.paymentmodes.PayPal payPal15 = new org.team4.model.paymentmodes.PayPal("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        boolean boolean16 = payPal15.isValid();
        boolean boolean17 = payPal15.isValid();
        java.lang.String str18 = payPal15.getMode();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete19 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase13, (org.team4.model.paymentmodes.PaymentValidator) payPal15);
        boolean boolean20 = payPal15.isValid();
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Mobile Wallet" + "'", str18, "Mobile Wallet");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.lang.String str6 = course5.getProfessorEmail();
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
        org.team4.functionality.buy.ItemPurchased itemPurchased35 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", date30);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter42 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str43 = subscribeNewsletter42.getEmail();
        java.util.Date date44 = subscribeNewsletter42.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter47 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str48 = subscribeNewsletter47.getEmail();
        java.util.Date date49 = subscribeNewsletter47.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter50 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date44, date49);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter53 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter53.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter53.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter60 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date61 = null;
        subscribeNewsletter60.setDateSubscribed(date61);
        java.util.Date date63 = subscribeNewsletter60.getDateDue();
        subscribeNewsletter53.setDateDue(date63);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter65 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", date49, date63);
        org.team4.model.items.RentedItem rentedItem66 = new org.team4.model.items.RentedItem("User [email=, password=, name=hi!, type=, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date30, date63);
        java.lang.String str67 = rentedItem66.getISBN();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter70 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter70.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter70.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter77 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date78 = null;
        subscribeNewsletter77.setDateSubscribed(date78);
        java.util.Date date80 = subscribeNewsletter77.getDateDue();
        subscribeNewsletter70.setDateDue(date80);
        rentedItem66.setDueDate(date80);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter87 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str88 = subscribeNewsletter87.getEmail();
        java.util.Date date89 = subscribeNewsletter87.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter92 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str93 = subscribeNewsletter92.getTitle();
        java.util.Date date94 = null;
        subscribeNewsletter92.setDateSubscribed(date94);
        java.util.Date date96 = subscribeNewsletter92.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter97 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "", date89, date96);
        rentedItem66.setDueDate(date89);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean99 = course5.isEnded(date89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Tue Apr 30 20:32:07 EDT 2024");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Tue Apr 30 20:32:07 EDT 2024");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(date30);
// flaky:         org.junit.Assert.assertEquals(date30.toString(), "Tue Apr 30 20:32:07 EDT 2024");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Tue Apr 30 20:32:07 EDT 2024");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(date49);
// flaky:         org.junit.Assert.assertEquals(date49.toString(), "Tue Apr 30 20:32:07 EDT 2024");
        org.junit.Assert.assertNotNull(date63);
// flaky:         org.junit.Assert.assertEquals(date63.toString(), "Tue Apr 30 20:32:07 EDT 2024");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str67, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(date80);
// flaky:         org.junit.Assert.assertEquals(date80.toString(), "Tue Apr 30 20:32:07 EDT 2024");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!" + "'", str88, "hi!");
        org.junit.Assert.assertNotNull(date89);
// flaky:         org.junit.Assert.assertEquals(date89.toString(), "Tue Apr 30 20:32:07 EDT 2024");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "hi!" + "'", str93, "hi!");
        org.junit.Assert.assertNotNull(date96);
// flaky:         org.junit.Assert.assertEquals(date96.toString(), "Tue Apr 30 20:32:07 EDT 2024");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        book7.setPrice((double) 0L);
        boolean boolean11 = book7.hasHardCopy();
        book7.setQuantity((int) (byte) 0);
        boolean boolean14 = book7.isPurchasable();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}', email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', dateSubscribed=Sat Mar 30 20:32:00 EDT 2024, dateDue=Tue Apr 30 20:32:00 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:59 EDT 2024, dateDue=Tue Apr 30 20:31:59 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}', email='hi!', dateSubscribed=null, dateDue=Tue Apr 30 20:32:02 EDT 2024}", false);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
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
        boolean boolean13 = courseTextBook8.isRentable();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertNotNull(studentList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(studentList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("User [email=ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}, validated=false]", "", "ItemPurchased{title='', email='', datePurchased=null}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getEndDate();
        java.lang.String str7 = course5.getProfessorEmail();
        java.lang.String str8 = course5.getProfessorEmail();
        org.team4.model.user.Student student13 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean14 = course5.isEnrolled(student13);
        org.team4.model.user.Student student19 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean20 = student19.isValidated();
        boolean boolean21 = course5.isEnrolled(student19);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        boolean boolean1 = org.team4.utils.EmailValidator.validEmail("User [email=ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}, validated=false]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.team4.model.user.User user5 = new org.team4.model.user.User("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "hi!", false);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        int int2 = bookRequest1.getEdition();
        java.lang.String str3 = bookRequest1.getEmail();
        java.lang.String str4 = bookRequest1.getBookType();
        java.lang.String str5 = bookRequest1.getTitle();
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:05 EDT 2024, dateDue=Tue Apr 30 20:32:05 EDT 2024}", "User [email=, password=, name=hi!, type=, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "User [email=hi!, password=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, name=User [email=, password=, name=hi!, type=, validated=false], type=, validated=false]");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder3 = dVDBuilder0.genre("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder5 = dVDBuilder0.yearPublished((int) 'a');
        org.team4.model.items.builder.DVDBuilder dVDBuilder7 = dVDBuilder0.duration((double) 0.0f);
        org.team4.model.items.builder.DVDBuilder dVDBuilder9 = dVDBuilder7.genre("Debit Card");
        org.team4.model.items.builder.DVDBuilder dVDBuilder11 = dVDBuilder7.duration((double) 4091426L);
        org.team4.model.items.DVD dVD12 = dVDBuilder7.build();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNotNull(dVDBuilder3);
        org.junit.Assert.assertNotNull(dVDItemBuilder5);
        org.junit.Assert.assertNotNull(dVDBuilder7);
        org.junit.Assert.assertNotNull(dVDBuilder9);
        org.junit.Assert.assertNotNull(dVDBuilder11);
        org.junit.Assert.assertNotNull(dVD12);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.ISBN("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDItemBuilder4.ISBN("ProcessPayment{modes=null, itemToPurchase=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}}");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
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
        org.team4.functionality.buy.ItemPurchased itemPurchased28 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", date23);
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
        java.util.Date date86 = rentedItem59.getDueDate();
        java.lang.String str87 = rentedItem59.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Apr 30 20:32:08 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Tue Apr 30 20:32:08 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 20:32:08 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 20:32:08 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 20:32:08 EDT 2024");
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Tue Apr 30 20:32:08 EDT 2024");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str60, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(date73);
// flaky:         org.junit.Assert.assertEquals(date73.toString(), "Tue Apr 30 20:32:08 EDT 2024");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertNotNull(date83);
// flaky:         org.junit.Assert.assertEquals(date83.toString(), "Tue Apr 30 20:32:08 EDT 2024");
        org.junit.Assert.assertNotNull(date86);
// flaky:         org.junit.Assert.assertEquals(date86.toString(), "Tue Apr 30 20:32:08 EDT 2024");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str87, "User [email=, password=, name=hi!, type=, validated=false]");
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.team4.functionality.buy.ItemPurchased itemPurchased2 = new org.team4.functionality.buy.ItemPurchased("User [email=, password=, name=hi!, type=hi!, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        boolean boolean10 = book9.hasHardCopy();
        book9.setQuantity((int) '4');
        int int13 = book9.getEdition();
        org.team4.model.user.Student student18 = new org.team4.model.user.Student("", "", "hi!", "");
        java.util.ArrayList<java.lang.String> strList19 = student18.getCourses();
        java.lang.String str20 = student18.getEmail();
        boolean boolean21 = book9.equals((java.lang.Object) str20);
        java.lang.Object obj22 = null;
        boolean boolean23 = book9.equals(obj22);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(strList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "Credit Card", (int) '4', "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}");
        java.lang.String str7 = bookRequest6.getBookType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}" + "'", str7, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook8 = courseTextBookBuilder6.build();
        java.util.List<org.team4.model.user.Student> studentList9 = courseTextBook8.getStudentsWithCopies();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator10 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook8);
        boolean boolean11 = purchasableItemDecorator10.isPurchasable();
        int int12 = purchasableItemDecorator10.getYearPublished();
        java.lang.String str13 = purchasableItemDecorator10.getTitle();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertNotNull(studentList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.team4.model.user.User user1 = null;
        org.team4.functionality.buy.ItemToPurchase itemToPurchase2 = new org.team4.functionality.buy.ItemToPurchase((double) 5890207L, user1);
        org.team4.model.user.User user3 = itemToPurchase2.getUser();
        org.junit.Assert.assertNull(user3);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.team4.model.paymentmodes.PaymentValidator paymentValidator0 = null;
        org.team4.model.user.Student student6 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str7 = student6.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase8 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student6);
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("");
        java.lang.String str11 = mobileWallet10.getMode();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete12 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase8, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.functionality.buy.ProcessPayment processPayment13 = new org.team4.functionality.buy.ProcessPayment(paymentValidator0, itemToPurchase8);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PayPal" + "'", str11, "PayPal");
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        org.team4.model.user.Student student10 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str11 = student10.getType();
        course5.enrollStudent(student10);
        java.lang.String str13 = course5.getCourseName();
        java.util.Date date14 = course5.getStartDate();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, type=PayPal, validated=true]", 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 52");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.team4.model.items.Item item0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator1 = new org.team4.model.items.decorator.RentableItemDecorator(item0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"title\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("", (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder3 = dVDBuilder0.price((double) (-1));
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder5 = dVDBuilder0.title("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder7 = dVDBuilder0.ISBN("User [email=ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}, validated=false]");
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNotNull(dVDItemBuilder3);
        org.junit.Assert.assertNotNull(dVDItemBuilder5);
        org.junit.Assert.assertNotNull(dVDItemBuilder7);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("");
        org.team4.model.user.Student student7 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str8 = student7.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase9 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student7);
        org.team4.model.items.Newsletter newsletter10 = itemToPurchase9.getNewsletter();
        org.team4.functionality.buy.ProcessPayment processPayment11 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet1, itemToPurchase9);
        java.lang.String str12 = itemToPurchase9.toString();
        java.lang.String str13 = itemToPurchase9.toString();
        double double14 = itemToPurchase9.getAmount();
        java.lang.Class<?> wildcardClass15 = itemToPurchase9.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}" + "'", str12, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}" + "'", str13, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter4 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date5 = null;
        subscribeNewsletter4.setDateSubscribed(date5);
        java.util.Date date7 = subscribeNewsletter4.getDateDue();
        org.team4.functionality.buy.ItemPurchased itemPurchased8 = new org.team4.functionality.buy.ItemPurchased("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", date7);
        java.util.Date date9 = itemPurchased8.getDatePurchased();
        java.lang.String str10 = itemPurchased8.getTitle();
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Tue Apr 30 20:32:08 EDT 2024");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Tue Apr 30 20:32:08 EDT 2024");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}" + "'", str10, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        java.util.Date date2 = null;
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("", "", date2);
        java.util.Date date4 = itemPurchased3.getDatePurchased();
        java.lang.String str5 = itemPurchased3.getTitle();
        java.lang.String str6 = itemPurchased3.toString();
        java.lang.String str7 = itemPurchased3.getTitle();
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str6, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.user.User user12 = purchaseComplete11.getUser();
        org.team4.model.items.Item item13 = purchaseComplete11.getItem();
        double double14 = purchaseComplete11.getAmount();
        org.team4.model.user.User user15 = purchaseComplete11.getUser();
        java.lang.String str16 = user15.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder0.email("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.edition((int) (byte) 10);
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder6.email("Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder10 = bookRequestBuilder6.edition(52);
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
        org.junit.Assert.assertNotNull(bookRequestBuilder10);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, type=PayPal, validated=true]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}", "User [email=, password=, name=hi!, type=hi!, validated=false]", 3082528L);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("ItemPurchased{title='', email='hi!', datePurchased=null}", 52, 32);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 32");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "User [email=, password=, name=hi!, type=, validated=false]", "");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=hi!, validated=false]", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        faculty4.setName("Credit Card");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("ProcessPayment{modes=null, itemToPurchase=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}}", "User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, type=PayPal, validated=true]", "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}}", false);
        org.team4.model.user.Student student20 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str21 = student20.getType();
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        student20.setCourses(strList24);
        org.team4.model.user.Faculty faculty27 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", (long) (byte) -1, strList24);
        org.team4.model.user.Faculty faculty28 = new org.team4.model.user.Faculty("hi!", "Credit Card", "", "User [email=, password=, name=hi!, type=, validated=false]", (long) '#', strList24);
        java.util.Date date30 = null;
        java.util.Date date31 = null;
        org.team4.model.course.Course course34 = new org.team4.model.course.Course("hi!", date30, date31, "", "hi!");
        java.util.Date date35 = course34.getEndDate();
        java.lang.String str36 = course34.getProfessorEmail();
        java.lang.String str37 = course34.getProfessorEmail();
        org.team4.model.user.Student student43 = new org.team4.model.user.Student("", "", "hi!", "");
        student43.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase46 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student43);
        java.lang.String str47 = student43.getEmail();
        course34.enrollStudent(student43);
        java.lang.String[] strArray71 = new java.lang.String[] { "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "PayPal", "ItemPurchased{title='', email='hi!', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemPurchased{title='', email='', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" };
        java.util.ArrayList<java.lang.String> strList72 = new java.util.ArrayList<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList72, strArray71);
        org.team4.model.user.Faculty faculty74 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "", "ItemPurchased{title='', email='', datePurchased=null}", 0L, strList72);
        org.team4.model.user.Faculty faculty75 = new org.team4.model.user.Faculty("hi!", "", "Credit Card", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", (long) '#', strList72);
        student43.setCourses(strList72);
        faculty28.setCourses(strList72);
        faculty5.setCourses(strList72);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(date35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("", "", "", "hi!", false);
        manager5.setValidated(false);
        manager5.setName("hi!");
        manager5.setPassword("User [email=hi!, password=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, name=User [email=, password=, name=hi!, type=, validated=false], type=, validated=false]");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date3 = null;
        subscribeNewsletter2.setDateSubscribed(date3);
        java.util.Date date5 = subscribeNewsletter2.getDateDue();
        java.lang.String str6 = subscribeNewsletter2.getEmail();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Tue Apr 30 20:32:08 EDT 2024");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str6, "User [email=, password=, name=hi!, type=, validated=false]");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter2.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter2.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter9 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date10 = null;
        subscribeNewsletter9.setDateSubscribed(date10);
        java.util.Date date12 = subscribeNewsletter9.getDateDue();
        subscribeNewsletter2.setDateDue(date12);
        java.util.Date date14 = subscribeNewsletter2.getDateSubscribed();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter17 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str18 = subscribeNewsletter17.getEmail();
        java.util.Date date19 = subscribeNewsletter17.getDateDue();
        subscribeNewsletter2.setDateSubscribed(date19);
        java.util.Date date21 = subscribeNewsletter2.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter26 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str27 = subscribeNewsletter26.getEmail();
        java.util.Date date28 = subscribeNewsletter26.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter31 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str32 = subscribeNewsletter31.getEmail();
        java.util.Date date33 = subscribeNewsletter31.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter34 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date28, date33);
        subscribeNewsletter2.setDateDue(date28);
        java.lang.String str36 = subscribeNewsletter2.toString();
        java.lang.String str37 = subscribeNewsletter2.getTitle();
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Tue Apr 30 20:32:08 EDT 2024");
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Sat Mar 30 20:32:08 EDT 2024");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Tue Apr 30 20:32:08 EDT 2024");
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Tue Apr 30 20:32:08 EDT 2024");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Tue Apr 30 20:32:08 EDT 2024");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(date33);
// flaky:         org.junit.Assert.assertEquals(date33.toString(), "Tue Apr 30 20:32:08 EDT 2024");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:08 EDT 2024, dateDue=Tue Apr 30 20:32:08 EDT 2024}" + "'", str36, "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:08 EDT 2024, dateDue=Tue Apr 30 20:32:08 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "PayPal" + "'", str37, "PayPal");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}", "SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:05 EDT 2024, dateDue=Tue Apr 30 20:32:05 EDT 2024}", (double) (byte) 1);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.Magazine magazine5 = magazineBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder7 = magazineBuilder0.quantity((int) (byte) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder9 = magazineBuilder0.yearPublished((int) (byte) -1);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder11 = magazineBuilder0.issueNumber(100);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder13 = magazineBuilder0.issueNumber(1);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazine5);
        org.junit.Assert.assertNotNull(magazineItemBuilder7);
        org.junit.Assert.assertNotNull(magazineItemBuilder9);
        org.junit.Assert.assertNotNull(magazineBuilder11);
        org.junit.Assert.assertNotNull(magazineBuilder13);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder0.booktype("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.BookRequest bookRequest6 = bookRequestBuilder0.build();
        java.lang.String str7 = bookRequest6.getTitle();
        int int8 = bookRequest6.getEdition();
        java.lang.String str9 = bookRequest6.getISBN();
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequest6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder3 = courseTextBookBuilder0.yearPublished(10);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(bookItemBuilder3);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.title("hi!");
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder0.duration((double) 10L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDBuilder0.quantity((int) (byte) 10);
        org.team4.model.items.DVD dVD9 = dVDBuilder0.build();
        int int10 = dVD9.getQuantity();
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
        org.junit.Assert.assertNotNull(dVD9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:05 EDT 2024, dateDue=Tue Apr 30 20:32:05 EDT 2024}", "User [email=, password=, name=hi!, type=hi!, validated=false]", (long) (byte) -1);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "", "Credit Card", "");
        visitor4.setType("ItemPurchased{title='', email='hi!', datePurchased=null}");
        visitor4.setPassword("Credit Card");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date3 = null;
        subscribeNewsletter2.setDateSubscribed(date3);
        java.lang.String str5 = subscribeNewsletter2.getTitle();
        java.lang.String str6 = subscribeNewsletter2.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str6, "User [email=, password=, name=hi!, type=, validated=false]");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal", "Credit Card", "");
        java.lang.String str5 = student4.getEmail();
        boolean boolean6 = student4.isValidated();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str5, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook8 = courseTextBookBuilder6.build();
        java.lang.String str9 = courseTextBook8.getISBN();
        courseTextBook8.setRentable(true);
        java.lang.String str12 = courseTextBook8.getGenre();
        java.util.List<org.team4.model.user.Student> studentList13 = courseTextBook8.getStudentsWithCopies();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(studentList13);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.title("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.title("hi!");
        org.team4.model.items.BookRequest bookRequest6 = bookRequestBuilder5.build();
        java.lang.String str7 = bookRequest6.getAuthor();
        java.lang.String str8 = bookRequest6.getISBN();
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequest6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("", "ItemPurchased{title='', email='hi!', datePurchased=null}", "User [email=, password=, name=hi!, type=hi!, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:02 EDT 2024, dateDue=Tue Apr 30 20:32:02 EDT 2024}");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("ItemPurchased{title='', email='hi!', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}}", "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}", (long) 'a');
        long long6 = manager5.getManagerID();
        long long7 = manager5.getManagerID();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}", "SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}', email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', dateSubscribed=Sat Mar 30 20:32:00 EDT 2024, dateDue=Tue Apr 30 20:32:00 EDT 2024}", "User [email=, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=PayPal, validated=false]", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}", 52, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:59 EDT 2024, dateDue=Tue Apr 30 20:31:59 EDT 2024}");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}", "Mobile Wallet", "SubscribeNewsletter{title='Debit Card', email='hi!', dateSubscribed=Sat Mar 30 20:32:04 EDT 2024, dateDue=Tue Apr 30 20:32:04 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.ISBN("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder0.genre("");
        org.team4.model.items.builder.DVDBuilder dVDBuilder8 = dVDBuilder6.genre("ItemToPurchase{item=null, user=User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDBuilder8);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("Debit Card", "hi!");
        java.lang.String str3 = subscribeNewsletter2.getTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Debit Card" + "'", str3, "Debit Card");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        org.team4.model.user.Student student10 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str11 = student10.getType();
        course5.enrollStudent(student10);
        java.lang.String str13 = course5.getCourseName();
        org.team4.model.user.Student student14 = null;
        course5.enrollStudent(student14);
        java.lang.String str16 = course5.getCourseTextBookISBN();
        java.util.Date date17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = course5.isEnded(date17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.after(java.util.Date)\" because \"currentDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.yearPublished((int) (short) -1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineBuilder0.quantity((int) (byte) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder10 = magazineBuilder0.quantity(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder12 = magazineBuilder0.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder14 = magazineBuilder0.issueNumber((int) ' ');
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
        org.junit.Assert.assertNotNull(magazineItemBuilder10);
        org.junit.Assert.assertNotNull(magazineItemBuilder12);
        org.junit.Assert.assertNotNull(magazineBuilder14);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder4 = magazineItemBuilder2.ISBN("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineItemBuilder4.ISBN("Credit Card");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineItemBuilder6.ISBN("User [email=, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=PayPal, validated=false]");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder10 = magazineItemBuilder8.ISBN("");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineItemBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
        org.junit.Assert.assertNotNull(magazineItemBuilder10);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.title("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.title("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder3.email("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder9 = bookRequestBuilder3.author("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder11 = bookRequestBuilder9.edition((int) (short) 1);
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
        org.junit.Assert.assertNotNull(bookRequestBuilder9);
        org.junit.Assert.assertNotNull(bookRequestBuilder11);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.paymentmodes.DebitCard debitCard15 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete16 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) debitCard15);
        org.team4.model.items.Item item17 = itemToPurchase7.getItem();
        double double18 = itemToPurchase7.getAmount();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.Book book9 = courseTextBookBuilder0.build();
        java.lang.String str10 = book9.getTitle();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("Credit Card", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", false);
        java.util.ArrayList<java.lang.String> strList6 = faculty5.getCourses();
        long long7 = faculty5.getFacultyID();
        org.junit.Assert.assertNull(strList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator11 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator12 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) rentableItemDecorator11);
        boolean boolean13 = purchasableItemDecorator12.isPurchasable();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:02 EDT 2024, dateDue=Tue Apr 30 20:32:02 EDT 2024}", (double) 10);
        java.lang.String str4 = newsletter3.getTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}" + "'", str4, "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:04 EDT 2024, dateDue=Tue Apr 30 20:32:04 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}", true);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("User [email=, password=, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}", "User [email=, password=, name=hi!, type=hi!, validated=false]", "Credit Card");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.team4.model.user.UserFactory userFactory0 = new org.team4.model.user.UserFactory();
        org.team4.model.user.User user6 = userFactory0.getUser("ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "Credit Card", "", false);
        org.team4.model.user.User user12 = userFactory0.getUser("Credit Card", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, type=PayPal, validated=true]", "", true);
        org.team4.model.user.User user18 = userFactory0.getUser("hi!", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", false);
        org.team4.model.user.User user24 = userFactory0.getUser("ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:02 EDT 2024, dateDue=Tue Apr 30 20:32:02 EDT 2024}", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}", true);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(user24);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.Magazine magazine5 = magazineBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder7 = magazineBuilder0.quantity((int) (byte) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder9 = magazineBuilder0.yearPublished((int) (byte) -1);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder11 = magazineBuilder0.issueNumber(100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder13 = magazineBuilder0.yearPublished((int) (byte) 1);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazine5);
        org.junit.Assert.assertNotNull(magazineItemBuilder7);
        org.junit.Assert.assertNotNull(magazineItemBuilder9);
        org.junit.Assert.assertNotNull(magazineBuilder11);
        org.junit.Assert.assertNotNull(magazineItemBuilder13);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.team4.model.user.User user4 = new org.team4.model.user.User("hi!", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        boolean boolean5 = user4.isValidated();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:02 EDT 2024, dateDue=Tue Apr 30 20:32:02 EDT 2024}", (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.ISBN("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDItemBuilder4.ISBN("ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.title("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDItemBuilder4.price(0.0d);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDItemBuilder6.price((double) (short) 10);
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        org.team4.model.items.builder.BookBuilder bookBuilder11 = courseTextBookBuilder6.noOfPages((int) '4');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder13 = courseTextBookBuilder6.price((double) (byte) -1);
        java.util.Date date15 = null;
        java.util.Date date16 = null;
        org.team4.model.course.Course course19 = new org.team4.model.course.Course("hi!", date15, date16, "", "hi!");
        java.lang.String str20 = course19.getProfessorEmail();
        java.util.Date date21 = course19.getStartDate();
        java.lang.String str22 = course19.getProfessorEmail();
        java.util.Date date23 = course19.getStartDate();
        java.lang.String str24 = course19.getCourseName();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder25 = courseTextBookBuilder6.course(course19);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNotNull(bookBuilder11);
        org.junit.Assert.assertNotNull(bookItemBuilder13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(date23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(courseTextBookBuilder25);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        org.team4.model.items.decorator.ItemDecorator itemDecorator11 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) rentableItemDecorator10);
        java.lang.String str12 = rentableItemDecorator10.getISBN();
        org.team4.model.items.Book book20 = new org.team4.model.items.Book((org.team4.model.items.Item) rentableItemDecorator10, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", (int) (byte) 10, "User [email=, password=, name=hi!, type=hi!, validated=false]", "User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}, password=, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}, type=PayPal, validated=false]", (int) (short) 100, false, false);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.paymentmodes.CreditCard creditCard10 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) creditCard10);
        java.lang.String str12 = creditCard10.getMode();
        boolean boolean13 = creditCard10.notExpired();
        boolean boolean14 = creditCard10.isValid();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Credit Card" + "'", str12, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}", "User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=hi!, name=User [email=, password=, name=hi!, type=, validated=false], type=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, validated=false]", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "Debit Card");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
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
        double double21 = book9.getPrice();
        org.team4.model.items.Magazine magazine24 = new org.team4.model.items.Magazine((org.team4.model.items.Item) book9, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", (int) (byte) 1);
        int int25 = magazine24.getIssueNumber();
        int int26 = magazine24.getIssueNumber();
        int int27 = magazine24.getIssueNumber();
        java.lang.String str28 = magazine24.getPublisher();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}" + "'", str28, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
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
        double double21 = book9.getPrice();
        org.team4.model.items.Magazine magazine24 = new org.team4.model.items.Magazine((org.team4.model.items.Item) book9, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", (int) (byte) 1);
        boolean boolean25 = book9.isRentable();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.lang.String str6 = course5.getProfessorEmail();
        java.lang.String str7 = course5.getProfessorEmail();
        org.team4.model.items.builder.DVDBuilder dVDBuilder8 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD9 = dVDBuilder8.build();
        java.lang.String str10 = dVD9.getGenre();
        boolean boolean11 = dVD9.isPurchasable();
        double double12 = dVD9.getDuration();
        dVD9.setQuantity((int) (short) 1);
        dVD9.setQuantity((int) ' ');
        boolean boolean17 = dVD9.isPurchasable();
        java.util.Date date19 = null;
        java.util.Date date20 = null;
        org.team4.model.course.Course course23 = new org.team4.model.course.Course("hi!", date19, date20, "", "hi!");
        org.team4.model.user.Student student28 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str29 = student28.getType();
        course23.enrollStudent(student28);
        java.lang.String str31 = course23.getProfessorEmail();
        org.team4.model.user.Student student37 = new org.team4.model.user.Student("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "Mobile Wallet", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}", false);
        boolean boolean38 = course23.isEnrolled(student37);
        java.lang.String str39 = student37.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase40 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) dVD9, (org.team4.model.user.User) student37);
        boolean boolean41 = course5.isEnrolled(student37);
        java.util.ArrayList<java.lang.String> strList42 = student37.getCourses();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(dVD9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}" + "'", str39, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(strList42);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:05 EDT 2024, dateDue=Tue Apr 30 20:32:05 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:02 EDT 2024, dateDue=Tue Apr 30 20:32:02 EDT 2024}", "User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=hi!, name=User [email=, password=, name=hi!, type=, validated=false], type=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, validated=false]", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:05 EDT 2024, dateDue=Tue Apr 30 20:32:05 EDT 2024}");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str3 = subscribeNewsletter2.getTitle();
        java.lang.String str4 = subscribeNewsletter2.toString();
        java.util.Date date5 = null;
        subscribeNewsletter2.setDateSubscribed(date5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:08 EDT 2024, dateDue=Tue Apr 30 20:32:08 EDT 2024}" + "'", str4, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:08 EDT 2024, dateDue=Tue Apr 30 20:32:08 EDT 2024}");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
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
        java.lang.String str46 = courseTextBook9.getAuthor();
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
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.yearPublished((int) (short) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder8 = magazineBuilder0.issueNumber(100);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder10 = magazineBuilder8.publisher("Debit Card");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder12 = magazineBuilder10.title("ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:32:07 EDT 2024}");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineBuilder8);
        org.junit.Assert.assertNotNull(magazineBuilder10);
        org.junit.Assert.assertNotNull(magazineItemBuilder12);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
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
        double double13 = courseTextBook8.getPrice();
        java.lang.String str14 = courseTextBook8.getAuthor();
        java.lang.String str15 = courseTextBook8.getPublisher();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertNotNull(studentList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(studentList11);
        org.junit.Assert.assertNull(course12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.team4.model.items.Item item0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.items.DVD dVD3 = new org.team4.model.items.DVD(item0, "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:04 EDT 2024, dateDue=Tue Apr 30 20:32:04 EDT 2024}", (double) 5890207L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"title\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:32:07 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "", true);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}, password=, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}, type=PayPal, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemPurchased{title='', email='', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", true);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.price((double) (byte) 1);
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder6.edition(10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = courseTextBookBuilder6.price((double) (-1));
        org.team4.model.items.builder.BookBuilder bookBuilder14 = courseTextBookBuilder6.publisher("SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:08 EDT 2024, dateDue=Tue Apr 30 20:32:08 EDT 2024}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(bookItemBuilder12);
        org.junit.Assert.assertNotNull(bookBuilder14);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
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
        java.lang.String str41 = course40.getProfessorEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Tue Apr 30 20:32:08 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Tue Apr 30 20:32:08 EDT 2024");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(date27);
// flaky:         org.junit.Assert.assertEquals(date27.toString(), "Tue Apr 30 20:32:08 EDT 2024");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 20:32:08 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str41, "ItemPurchased{title='', email='', datePurchased=null}");
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.team4.model.user.User user4 = new org.team4.model.user.User("ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='', datePurchased=Sat Mar 30 20:32:07 EDT 2024}", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:05 EDT 2024, dateDue=Tue Apr 30 20:32:05 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}", "PayPal{email='PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}'}");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        boolean boolean8 = book7.hasHardCopy();
        boolean boolean9 = book7.hasSoftCopy();
        java.util.Date date16 = null;
        java.util.Date date17 = null;
        org.team4.model.course.Course course20 = new org.team4.model.course.Course("hi!", date16, date17, "", "hi!");
        java.util.Date date21 = course20.getEndDate();
        org.team4.model.course.CourseTextBook courseTextBook23 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) book7, "User [email=, password=, name=hi!, type=, validated=false]", 1, "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "", (-1), course20, true);
        java.lang.String str24 = courseTextBook23.getISBN();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.team4.model.user.Student student10 = new org.team4.model.user.Student("", "", "hi!", "");
        student10.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase13 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student10);
        java.lang.String str14 = student10.getEmail();
        org.team4.model.user.Student student29 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str30 = student29.getType();
        java.lang.String[] strArray32 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        student29.setCourses(strList33);
        org.team4.model.user.Faculty faculty36 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", (long) (byte) -1, strList33);
        java.lang.String str37 = faculty36.getName();
        faculty36.setFacultyID((long) (short) 1);
        java.util.Date date41 = null;
        java.util.Date date42 = null;
        org.team4.model.course.Course course45 = new org.team4.model.course.Course("hi!", date41, date42, "", "hi!");
        java.util.Date date46 = course45.getEndDate();
        java.lang.String str47 = course45.getProfessorEmail();
        java.lang.String str48 = course45.getProfessorEmail();
        org.team4.model.user.Student student54 = new org.team4.model.user.Student("", "", "hi!", "");
        student54.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase57 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student54);
        java.lang.String str58 = student54.getEmail();
        course45.enrollStudent(student54);
        org.team4.model.user.Faculty faculty65 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "hi!", "", "", false);
        faculty65.setFacultyID((long) (byte) 1);
        org.team4.model.user.Student student72 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str73 = student72.getType();
        java.lang.String[] strArray75 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList76 = new java.util.ArrayList<java.lang.String>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList76, strArray75);
        student72.setCourses(strList76);
        faculty65.setCourses(strList76);
        student54.setCourses(strList76);
        faculty36.setCourses(strList76);
        org.team4.model.user.Faculty faculty82 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "Credit Card", "User [email=, password=, name=hi!, type=, validated=false]", "", 0L, strList76);
        student10.setCourses(strList76);
        org.team4.model.user.Faculty faculty84 = new org.team4.model.user.Faculty("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:02 EDT 2024, dateDue=Tue Apr 30 20:32:02 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}", "Mobile Wallet", (long) (short) 10, strList76);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str37, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertNull(date46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.BookRequest bookRequest4 = bookRequestBuilder3.build();
        java.lang.String str5 = bookRequest4.getAuthor();
        int int6 = bookRequest4.getEdition();
        java.lang.String str7 = bookRequest4.getISBN();
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequest4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.user.User user12 = itemToPurchase7.getUser();
        org.team4.model.user.User user13 = itemToPurchase7.getUser();
        user13.setPassword("User [email=hi!, password=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, name=User [email=, password=, name=hi!, type=, validated=false], type=, validated=false]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(user13);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:32:07 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:02 EDT 2024, dateDue=Tue Apr 30 20:32:02 EDT 2024}", "Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}", "User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}, password=, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}, type=PayPal, validated=false]", (long) 52);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.yearPublished((int) (short) -1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineBuilder0.quantity((int) (byte) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder10 = magazineBuilder0.quantity(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder12 = magazineBuilder0.title("ProcessPayment{modes=null, itemToPurchase=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder14 = magazineBuilder0.price((double) 2407500L);
        org.team4.model.items.Magazine magazine15 = magazineBuilder0.build();
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
        org.junit.Assert.assertNotNull(magazineItemBuilder10);
        org.junit.Assert.assertNotNull(magazineItemBuilder12);
        org.junit.Assert.assertNotNull(magazineItemBuilder14);
        org.junit.Assert.assertNotNull(magazine15);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.email("");
        org.team4.model.items.BookRequest bookRequest5 = bookRequestBuilder4.build();
        java.lang.String str6 = bookRequest5.getBookType();
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequest5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}");
        boolean boolean2 = mobileWallet1.isValid();
        java.lang.String str3 = mobileWallet1.getMode();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PayPal" + "'", str3, "PayPal");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.yearPublished((int) (short) -1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineBuilder0.quantity((int) (byte) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder10 = magazineBuilder0.quantity(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder12 = magazineBuilder0.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder14 = magazineItemBuilder12.title("User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
        org.junit.Assert.assertNotNull(magazineItemBuilder10);
        org.junit.Assert.assertNotNull(magazineItemBuilder12);
        org.junit.Assert.assertNotNull(magazineItemBuilder14);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDBuilder2.quantity(10);
        org.team4.model.items.builder.DVDBuilder dVDBuilder8 = dVDBuilder2.genre("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.DVD dVD9 = dVDBuilder2.build();
        int int10 = dVD9.getQuantity();
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDBuilder8);
        org.junit.Assert.assertNotNull(dVD9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "Credit Card", false);
        java.lang.String str6 = faculty5.getPassword();
        faculty5.setValidated(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}" + "'", str6, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.quantity((int) (short) 100);
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder11 = courseTextBookBuilder0.quantity(1);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(courseTextBook9);
        org.junit.Assert.assertNotNull(bookItemBuilder11);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder0.price((double) 10);
        org.team4.model.course.CourseTextBook courseTextBook11 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder13 = courseTextBookBuilder0.hasHardCopy(false);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder15 = courseTextBookBuilder0.isVirtual(false);
        org.team4.model.items.builder.BookBuilder bookBuilder17 = courseTextBookBuilder15.edition((int) '4');
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(courseTextBook11);
        org.junit.Assert.assertNotNull(bookBuilder13);
        org.junit.Assert.assertNotNull(courseTextBookBuilder15);
        org.junit.Assert.assertNotNull(bookBuilder17);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        rentableItemDecorator10.setPurchaseable(false);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:05 EDT 2024, dateDue=Tue Apr 30 20:32:05 EDT 2024}", "SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}', email='hi!', dateSubscribed=null, dateDue=Tue Apr 30 20:32:02 EDT 2024}", "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:32:07 EDT 2024}");
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.user.User user12 = itemToPurchase7.getUser();
        org.team4.model.user.User user13 = itemToPurchase7.getUser();
        java.lang.String str14 = itemToPurchase7.toString();
        org.team4.model.items.Item item15 = itemToPurchase7.getItem();
        java.lang.String str16 = itemToPurchase7.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}" + "'", str14, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}" + "'", str16, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
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
        org.team4.functionality.buy.ItemPurchased itemPurchased28 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", date23);
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
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter90 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "", date82, date89);
        rentedItem59.setDueDate(date82);
        java.lang.String str92 = rentedItem59.getISBN();
        rentedItem59.setISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:59 EDT 2024, dateDue=Tue Apr 30 20:31:59 EDT 2024}");
        rentedItem59.setTitle("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:02 EDT 2024, dateDue=Tue Apr 30 20:32:02 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str60, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(date73);
// flaky:         org.junit.Assert.assertEquals(date73.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertNotNull(date82);
// flaky:         org.junit.Assert.assertEquals(date82.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertNotNull(date89);
// flaky:         org.junit.Assert.assertEquals(date89.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str92, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.user.User user12 = purchaseComplete11.getUser();
        org.team4.model.items.Item item13 = purchaseComplete11.getItem();
        org.team4.model.user.User user14 = purchaseComplete11.getUser();
        user14.setPassword("SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}', email='hi!', dateSubscribed=null, dateDue=Tue Apr 30 20:32:02 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(user14);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str3 = subscribeNewsletter2.getTitle();
        java.util.Date date4 = null;
        subscribeNewsletter2.setDateSubscribed(date4);
        subscribeNewsletter2.setEmail("User [email=hi!, password=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, name=User [email=, password=, name=hi!, type=, validated=false], type=, validated=false]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.builder.DVDBuilder dVDBuilder4 = dVDBuilder0.genre("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder4.duration(0.0d);
        org.team4.model.items.builder.DVDBuilder dVDBuilder8 = dVDBuilder4.genre("SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}', email='hi!', dateSubscribed=null, dateDue=Tue Apr 30 20:32:02 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder10 = dVDBuilder4.price((double) (short) 1);
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDBuilder8);
        org.junit.Assert.assertNotNull(dVDItemBuilder10);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.title("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.title("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder3.email("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder9 = bookRequestBuilder7.author("ProcessPayment{modes=null, itemToPurchase=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder11 = bookRequestBuilder9.email("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
        org.junit.Assert.assertNotNull(bookRequestBuilder9);
        org.junit.Assert.assertNotNull(bookRequestBuilder11);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
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
        org.team4.functionality.buy.ItemPurchased itemPurchased28 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", date23);
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
        rentedItem59.setTitle("ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}");
        rentedItem59.setTitle("SubscribeNewsletter{title='Debit Card', email='hi!', dateSubscribed=Sat Mar 30 20:32:04 EDT 2024, dateDue=Tue Apr 30 20:32:04 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str60, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(date73);
// flaky:         org.junit.Assert.assertEquals(date73.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertNotNull(date83);
// flaky:         org.junit.Assert.assertEquals(date83.toString(), "Tue Apr 30 20:32:09 EDT 2024");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.email("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.booktype("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder4.title("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.DVD dVD10 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Credit Card", 0.0d);
        int int11 = book7.getNoOfPages();
        boolean boolean12 = book7.hasHardCopy();
        org.team4.model.items.Item item13 = new org.team4.model.items.Item((org.team4.model.items.Item) book7);
        double double14 = item13.getPrice();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        boolean boolean2 = payPal1.isValid();
        boolean boolean3 = payPal1.isValid();
        java.lang.String str4 = payPal1.getMode();
        boolean boolean5 = payPal1.isValid();
        java.lang.String str6 = payPal1.getMode();
        java.lang.String str7 = payPal1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Mobile Wallet" + "'", str4, "Mobile Wallet");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Mobile Wallet" + "'", str6, "Mobile Wallet");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}" + "'", str7, "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:02 EDT 2024, dateDue=Tue Apr 30 20:32:02 EDT 2024}");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.DVD dVD3 = dVDBuilder0.build();
        double double4 = dVD3.getDuration();
        org.team4.model.course.Course course10 = null;
        org.team4.model.course.CourseTextBook courseTextBook12 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) dVD3, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", (int) '#', "", "ItemPurchased{title='', email='', datePurchased=null}", (int) (short) -1, course10, true);
        boolean boolean13 = courseTextBook12.hasSoftCopy();
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVD3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder3 = dVDBuilder0.genre("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder5 = dVDBuilder0.yearPublished((int) 'a');
        org.team4.model.items.DVD dVD6 = dVDBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDBuilder0.title("SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}', email='hi!', dateSubscribed=null, dateDue=Tue Apr 30 20:32:02 EDT 2024}");
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNotNull(dVDBuilder3);
        org.junit.Assert.assertNotNull(dVDItemBuilder5);
        org.junit.Assert.assertNotNull(dVD6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        boolean boolean1 = org.team4.utils.EmailValidator.validEmail("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}", "PayPal", (int) (short) 1, "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]");
        java.lang.String str7 = bookRequest6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str7, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        java.util.Date date2 = null;
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("", "hi!", date2);
        java.lang.String str4 = itemPurchased3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str4, "ItemPurchased{title='', email='hi!', datePurchased=null}");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        org.team4.model.user.Student student10 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str11 = student10.getType();
        course5.enrollStudent(student10);
        java.lang.String str13 = course5.getCourseName();
        java.lang.String str14 = course5.getCourseTextBookISBN();
        java.lang.String str15 = course5.getCourseName();
        java.util.Date date17 = null;
        java.util.Date date18 = null;
        org.team4.model.course.Course course21 = new org.team4.model.course.Course("hi!", date17, date18, "", "hi!");
        org.team4.model.user.Student student26 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str27 = student26.getType();
        course21.enrollStudent(student26);
        java.lang.String str29 = course21.getCourseName();
        java.lang.String str30 = course21.getCourseTextBookISBN();
        org.team4.model.user.Student student35 = new org.team4.model.user.Student("", "", "PayPal", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        boolean boolean36 = course21.isEnrolled(student35);
        course5.enrollStudent(student35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder10 = courseTextBookBuilder0.isVirtual(false);
        org.team4.model.items.Book book11 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder13 = courseTextBookBuilder0.isVirtual(false);
        org.team4.model.items.builder.BookBuilder bookBuilder15 = courseTextBookBuilder13.genre("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder17 = courseTextBookBuilder13.title("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder19 = bookItemBuilder17.title("User [email=, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=PayPal, validated=false]");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder21 = bookItemBuilder17.yearPublished(0);
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
        org.junit.Assert.assertNotNull(bookItemBuilder21);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("User [email=, password=, name=hi!, type=, validated=false]", (int) ' ', (int) (byte) 10);
        java.lang.String str4 = debitCard3.getMode();
        boolean boolean5 = debitCard3.isValid();
        boolean boolean6 = debitCard3.correctLength();
        boolean boolean7 = debitCard3.notExpired();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        java.lang.String str3 = subscribeNewsletter2.toString();
        org.team4.model.items.builder.DVDBuilder dVDBuilder4 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD5 = dVDBuilder4.build();
        java.lang.String str6 = dVD5.getGenre();
        boolean boolean7 = dVD5.isPurchasable();
        double double8 = dVD5.getDuration();
        dVD5.setQuantity((int) (short) 1);
        dVD5.setQuantity((int) ' ');
        boolean boolean13 = dVD5.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator14 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD5);
        org.team4.model.items.Item item15 = rentableItemDecorator14.getItem();
        org.team4.model.items.Item item16 = new org.team4.model.items.Item(item15);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter25 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str26 = subscribeNewsletter25.getTitle();
        java.util.Date date27 = null;
        subscribeNewsletter25.setDateSubscribed(date27);
        java.util.Date date29 = subscribeNewsletter25.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter34 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str35 = subscribeNewsletter34.getEmail();
        java.util.Date date36 = subscribeNewsletter34.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter39 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str40 = subscribeNewsletter39.getEmail();
        java.util.Date date41 = subscribeNewsletter39.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter42 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date36, date41);
        org.team4.model.course.Course course45 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date29, date41, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.model.course.CourseTextBook courseTextBook47 = new org.team4.model.course.CourseTextBook(item16, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", (int) (short) 1, "hi!", "PayPal", 52, course45, false);
        java.lang.String str48 = course45.getCourseTextBookISBN();
        java.lang.String str49 = course45.getCourseName();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter52 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date53 = null;
        subscribeNewsletter52.setDateSubscribed(date53);
        java.lang.String str55 = subscribeNewsletter52.getTitle();
        java.util.Date date56 = subscribeNewsletter52.getDateDue();
        boolean boolean57 = course45.isStarted(date56);
        subscribeNewsletter2.setDateDue(date56);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}', email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', dateSubscribed=Sat Mar 30 20:32:09 EDT 2024, dateDue=Tue Apr 30 20:32:09 EDT 2024}" + "'", str3, "SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}', email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', dateSubscribed=Sat Mar 30 20:32:09 EDT 2024, dateDue=Tue Apr 30 20:32:09 EDT 2024}");
        org.junit.Assert.assertNotNull(dVD5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(item15);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(date36);
// flaky:         org.junit.Assert.assertEquals(date36.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(date41);
// flaky:         org.junit.Assert.assertEquals(date41.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str48, "ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str49, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter3 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date4 = null;
        subscribeNewsletter3.setDateSubscribed(date4);
        java.util.Date date6 = subscribeNewsletter3.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter11 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str12 = subscribeNewsletter11.getEmail();
        java.util.Date date13 = subscribeNewsletter11.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter16 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str17 = subscribeNewsletter16.getTitle();
        java.util.Date date18 = null;
        subscribeNewsletter16.setDateSubscribed(date18);
        java.util.Date date20 = subscribeNewsletter16.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter21 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "", date13, date20);
        subscribeNewsletter3.setDateSubscribed(date20);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter25 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter25.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter25.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter32 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date33 = null;
        subscribeNewsletter32.setDateSubscribed(date33);
        java.util.Date date35 = subscribeNewsletter32.getDateDue();
        subscribeNewsletter25.setDateDue(date35);
        org.team4.model.course.Course course39 = new org.team4.model.course.Course("", date20, date35, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "");
        java.util.Date date40 = course39.getStartDate();
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertNotNull(date35);
// flaky:         org.junit.Assert.assertEquals(date35.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertNotNull(date40);
// flaky:         org.junit.Assert.assertEquals(date40.toString(), "Tue Apr 30 20:32:09 EDT 2024");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "Credit Card", (int) '4', "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}");
        int int7 = bookRequest6.getEdition();
        int int8 = bookRequest6.getEdition();
        java.lang.String str9 = bookRequest6.getAuthor();
        java.lang.String str10 = bookRequest6.getTitle();
        java.lang.String str11 = bookRequest6.getTitle();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str9, "ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str10, "ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str11, "ItemPurchased{title='', email='hi!', datePurchased=null}");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        boolean boolean1 = org.team4.utils.EmailValidator.validEmail("SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        org.team4.model.items.decorator.ItemDecorator itemDecorator11 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) rentableItemDecorator10);
        java.lang.String str12 = rentableItemDecorator10.getISBN();
        org.team4.model.user.User user17 = new org.team4.model.user.User("Credit Card", "User [email=, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=PayPal, validated=false]", "ItemPurchased{title='', email='', datePurchased=null}", "User [email=, password=, name=hi!, type=hi!, validated=false]");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase18 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) rentableItemDecorator10, user17);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("ItemPurchased{title='', email='hi!', datePurchased=null}", "Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}", "Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}", "Mobile Wallet");
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str3 = subscribeNewsletter2.getTitle();
        java.util.Date date4 = null;
        subscribeNewsletter2.setDateSubscribed(date4);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter8 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}");
        java.util.Date date9 = subscribeNewsletter8.getDateSubscribed();
        subscribeNewsletter2.setDateDue(date9);
        subscribeNewsletter2.setTitle("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        java.lang.String str13 = subscribeNewsletter2.getTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Sat Mar 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}" + "'", str13, "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDBuilder2.quantity(10);
        org.team4.model.items.builder.DVDBuilder dVDBuilder8 = dVDBuilder2.genre("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder10 = dVDBuilder2.genre("User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, type=PayPal, validated=true]");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDBuilder8);
        org.junit.Assert.assertNotNull(dVDBuilder10);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.team4.model.user.User user1 = null;
        org.team4.functionality.buy.ItemToPurchase itemToPurchase2 = new org.team4.functionality.buy.ItemToPurchase((double) 5890207L, user1);
        org.team4.model.items.Newsletter newsletter3 = itemToPurchase2.getNewsletter();
        org.junit.Assert.assertNull(newsletter3);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder0.price((double) 10);
        org.team4.model.course.CourseTextBook courseTextBook11 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder13 = courseTextBookBuilder0.hasHardCopy(false);
        org.team4.model.items.builder.BookBuilder bookBuilder15 = courseTextBookBuilder0.genre("User [email=hi!, password=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, name=User [email=, password=, name=hi!, type=, validated=false], type=, validated=false]");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(courseTextBook11);
        org.junit.Assert.assertNotNull(bookBuilder13);
        org.junit.Assert.assertNotNull(bookBuilder15);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
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
        org.team4.functionality.buy.ItemPurchased itemPurchased28 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", date23);
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
        java.util.Date date86 = rentedItem59.getDueDate();
        java.util.Date date87 = rentedItem59.getRentDate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str60, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(date73);
// flaky:         org.junit.Assert.assertEquals(date73.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertNotNull(date83);
// flaky:         org.junit.Assert.assertEquals(date83.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertNotNull(date86);
// flaky:         org.junit.Assert.assertEquals(date86.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertNotNull(date87);
// flaky:         org.junit.Assert.assertEquals(date87.toString(), "Tue Apr 30 20:32:09 EDT 2024");
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemPurchased{title='', email='', datePurchased=null}", "", "User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase((double) 1232147L, (org.team4.model.user.User) faculty5);
        faculty5.setType("User [email=, password=, name=hi!, type=hi!, validated=false]");
        boolean boolean9 = faculty5.isValidated();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
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
        org.team4.model.items.builder.DVDBuilder dVDBuilder21 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD22 = dVDBuilder21.build();
        java.lang.String str23 = dVD22.getGenre();
        boolean boolean24 = dVD22.isPurchasable();
        double double25 = dVD22.getDuration();
        dVD22.setQuantity((int) (short) 1);
        dVD22.setQuantity((int) ' ');
        boolean boolean30 = dVD22.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator31 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD22);
        org.team4.model.items.Item item32 = rentableItemDecorator31.getItem();
        org.team4.model.items.Item item33 = new org.team4.model.items.Item(item32);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter42 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str43 = subscribeNewsletter42.getTitle();
        java.util.Date date44 = null;
        subscribeNewsletter42.setDateSubscribed(date44);
        java.util.Date date46 = subscribeNewsletter42.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter51 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str52 = subscribeNewsletter51.getEmail();
        java.util.Date date53 = subscribeNewsletter51.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter56 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str57 = subscribeNewsletter56.getEmail();
        java.util.Date date58 = subscribeNewsletter56.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter59 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date53, date58);
        org.team4.model.course.Course course62 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date46, date58, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.model.course.CourseTextBook courseTextBook64 = new org.team4.model.course.CourseTextBook(item33, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", (int) (short) 1, "hi!", "PayPal", 52, course62, false);
        org.team4.model.user.Manager manager70 = new org.team4.model.user.Manager("", "", "", "hi!", false);
        manager70.setValidated(false);
        manager70.setName("hi!");
        boolean boolean75 = courseTextBook64.equals((java.lang.Object) manager70);
        java.lang.String str76 = manager70.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase77 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) rentableItemDecorator20, (org.team4.model.user.User) manager70);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dVD22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(date46);
// flaky:         org.junit.Assert.assertEquals(date46.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(date53);
// flaky:         org.junit.Assert.assertEquals(date53.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(date58);
// flaky:         org.junit.Assert.assertEquals(date58.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.team4.model.user.Manager manager4 = new org.team4.model.user.Manager("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}", "Mobile Wallet");
        manager4.setManagerID((long) 52);
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
        java.lang.String str9 = courseTextBook8.getPublisher();
        courseTextBook8.setRentable(true);
        double double12 = courseTextBook8.getPrice();
        java.lang.String str13 = courseTextBook8.getGenre();
        java.util.List<org.team4.model.user.Student> studentList14 = courseTextBook8.getStudentsWithCopies();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(studentList14);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.team4.model.user.User user5 = new org.team4.model.user.User("User [email=, password=, name=hi!, type=, validated=false]", "Credit Card", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "Credit Card", false);
        java.lang.String str6 = user5.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credit Card" + "'", str6, "Credit Card");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.booktype("Credit Card");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder3.ISBN("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder9 = bookRequestBuilder3.author("Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
        org.junit.Assert.assertNotNull(bookRequestBuilder9);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        boolean boolean8 = book7.hasHardCopy();
        boolean boolean9 = book7.hasSoftCopy();
        java.lang.String str10 = book7.toString();
        book7.setRentable(false);
        book7.setPrice((double) 4091426L);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}" + "'", str10, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder2 = magazineBuilder0.issueNumber(32);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.publisher("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder4.quantity(0);
        org.junit.Assert.assertNotNull(magazineBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.paymentmodes.MobileWallet mobileWallet9 = new org.team4.model.paymentmodes.MobileWallet("");
        java.lang.String str10 = mobileWallet9.getMode();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet9);
        double double12 = purchaseComplete11.getAmount();
        org.team4.model.items.Newsletter newsletter13 = purchaseComplete11.getNewsletter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PayPal" + "'", str10, "PayPal");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(newsletter13);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}', email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', dateSubscribed=Sat Mar 30 20:32:00 EDT 2024, dateDue=Tue Apr 30 20:32:00 EDT 2024}", "Debit Card", "SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}', email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', dateSubscribed=Sat Mar 30 20:32:00 EDT 2024, dateDue=Tue Apr 30 20:32:00 EDT 2024}", "SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Sat Mar 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 10);
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder2.genre("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDBuilder6.price((double) 100L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder10 = dVDBuilder6.title("SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:31:55 EDT 2024, dateDue=Tue Apr 30 20:31:55 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder12 = dVDItemBuilder10.yearPublished((int) ' ');
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
        org.junit.Assert.assertNotNull(dVDItemBuilder10);
        org.junit.Assert.assertNotNull(dVDItemBuilder12);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", 0.0d);
        org.team4.model.user.Manager manager9 = new org.team4.model.user.Manager("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "hi!", "User [email=, password=, name=hi!, type=, validated=false]", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", false);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase10 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) manager9);
        java.lang.String str11 = newsletter3.getTitle();
        double double12 = newsletter3.getPrice();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        java.util.Date date2 = null;
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("", "", date2);
        java.lang.String str4 = itemPurchased3.getTitle();
        java.util.Date date5 = itemPurchased3.getDatePurchased();
        java.lang.String str6 = itemPurchased3.getTitle();
        java.util.Date date7 = itemPurchased3.getDatePurchased();
        java.util.Date date8 = itemPurchased3.getDatePurchased();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str3 = subscribeNewsletter2.getEmail();
        java.lang.String str4 = subscribeNewsletter2.toString();
        java.lang.String str5 = subscribeNewsletter2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:09 EDT 2024, dateDue=Tue Apr 30 20:32:09 EDT 2024}" + "'", str4, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:09 EDT 2024, dateDue=Tue Apr 30 20:32:09 EDT 2024}");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:09 EDT 2024, dateDue=Tue Apr 30 20:32:09 EDT 2024}" + "'", str5, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:09 EDT 2024, dateDue=Tue Apr 30 20:32:09 EDT 2024}");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.booktype("Credit Card");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder3.ISBN("User [email=, password=, name=hi!, type=hi!, validated=false]");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder9 = bookRequestBuilder7.booktype("ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:32:07 EDT 2024}");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
        org.junit.Assert.assertNotNull(bookRequestBuilder9);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        org.team4.model.items.Item item11 = rentableItemDecorator10.getItem();
        java.lang.String str12 = rentableItemDecorator10.getISBN();
        int int13 = rentableItemDecorator10.getYearPublished();
        boolean boolean14 = rentableItemDecorator10.isPurchasable();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
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
        org.team4.model.items.DVD dVD14 = new org.team4.model.items.DVD((org.team4.model.items.Item) rentableItemDecorator10, "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}", (double) 3093246L);
        java.lang.String str15 = dVD14.getGenre();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}" + "'", str15, "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter4 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}");
        java.util.Date date5 = subscribeNewsletter4.getDateSubscribed();
        java.util.Date date6 = subscribeNewsletter4.getDateDue();
        subscribeNewsletter4.setTitle("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter11 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}");
        java.util.Date date12 = subscribeNewsletter11.getDateSubscribed();
        java.util.Date date13 = subscribeNewsletter11.getDateDue();
        subscribeNewsletter4.setDateSubscribed(date13);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter18 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str19 = subscribeNewsletter18.getTitle();
        java.util.Date date20 = null;
        subscribeNewsletter18.setDateSubscribed(date20);
        java.util.Date date22 = subscribeNewsletter18.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter26 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str27 = subscribeNewsletter26.getTitle();
        java.util.Date date28 = null;
        subscribeNewsletter26.setDateSubscribed(date28);
        java.util.Date date30 = subscribeNewsletter26.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter35 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str36 = subscribeNewsletter35.getEmail();
        java.util.Date date37 = subscribeNewsletter35.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter40 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str41 = subscribeNewsletter40.getEmail();
        java.util.Date date42 = subscribeNewsletter40.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter43 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date37, date42);
        org.team4.model.course.Course course46 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date30, date42, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.model.course.Course course49 = new org.team4.model.course.Course("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", date22, date30, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal");
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
        boolean boolean74 = course49.isEnded(date57);
        java.util.Date date75 = course49.getStartDate();
        org.team4.model.items.RentedItem rentedItem76 = new org.team4.model.items.RentedItem("ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}", "User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=hi!, name=User [email=, password=, name=hi!, type=, validated=false], type=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, validated=false]", date13, date75);
        java.util.Date date77 = rentedItem76.getRentDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Sat Mar 30 20:32:09 EDT 2024");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Sat Mar 30 20:32:09 EDT 2024");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(date30);
// flaky:         org.junit.Assert.assertEquals(date30.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertNotNull(date57);
// flaky:         org.junit.Assert.assertEquals(date57.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertNotNull(date64);
// flaky:         org.junit.Assert.assertEquals(date64.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertNotNull(date69);
// flaky:         org.junit.Assert.assertEquals(date69.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(date75);
// flaky:         org.junit.Assert.assertEquals(date75.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertNotNull(date77);
// flaky:         org.junit.Assert.assertEquals(date77.toString(), "Tue Apr 30 20:32:09 EDT 2024");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}', email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', dateSubscribed=Sat Mar 30 20:32:00 EDT 2024, dateDue=Tue Apr 30 20:32:00 EDT 2024}", "SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}', email='hi!', dateSubscribed=null, dateDue=Tue Apr 30 20:32:02 EDT 2024}", "Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:08 EDT 2024, dateDue=Tue Apr 30 20:32:08 EDT 2024}", false);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
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
        boolean boolean37 = student34.isValidated();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(date27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder0.ISBN("Credit Card");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("PayPal", "User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}, password=, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}, type=PayPal, validated=false]", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:08 EDT 2024, dateDue=Tue Apr 30 20:32:08 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
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
        org.team4.model.items.builder.BookBuilder bookBuilder59 = courseTextBookBuilder57.author("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder61 = bookBuilder59.price((double) (short) -1);
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
        org.junit.Assert.assertNotNull(bookItemBuilder61);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter2.setTitle("");
        java.lang.String str5 = subscribeNewsletter2.toString();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Sat Mar 30 20:32:09 EDT 2024, dateDue=Tue Apr 30 20:32:09 EDT 2024}" + "'", str5, "SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Sat Mar 30 20:32:09 EDT 2024, dateDue=Tue Apr 30 20:32:09 EDT 2024}");
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        java.util.Date date2 = null;
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("", "", date2);
        java.util.Date date4 = itemPurchased3.getDatePurchased();
        java.util.Date date5 = itemPurchased3.getDatePurchased();
        java.lang.String str6 = itemPurchased3.toString();
        java.util.Date date7 = itemPurchased3.getDatePurchased();
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str6, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.DVD dVD10 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Credit Card", 0.0d);
        int int11 = book7.getNoOfPages();
        book7.setPrice((double) (-1L));
        java.lang.String str14 = book7.getAuthor();
        double double15 = book7.getPrice();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator16 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) book7);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
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
        boolean boolean21 = book9.hasHardCopy();
        org.team4.model.items.builder.DVDBuilder dVDBuilder22 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder24 = dVDBuilder22.genre("PayPal");
        org.team4.model.items.builder.DVDBuilder dVDBuilder26 = dVDBuilder22.genre("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder28 = dVDBuilder22.price((double) (-1));
        boolean boolean29 = book9.equals((java.lang.Object) dVDBuilder22);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dVDBuilder24);
        org.junit.Assert.assertNotNull(dVDBuilder26);
        org.junit.Assert.assertNotNull(dVDItemBuilder28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
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
        org.team4.model.course.CourseTextBook courseTextBook68 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) book7, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}", (int) '#', "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "Debit Card", (int) 'a', course55, true);
        boolean boolean69 = courseTextBook68.hasSoftCopy();
        int int70 = courseTextBook68.getQuantity();
        java.lang.String str71 = courseTextBook68.getTitle();
        courseTextBook68.setPurchaseable(true);
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
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNull(str71);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.price((double) (short) 10);
        org.team4.model.items.Book book5 = courseTextBookBuilder0.build();
        boolean boolean6 = book5.hasHardCopy();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder7 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder9 = courseTextBookBuilder7.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder11 = courseTextBookBuilder7.ISBN("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder13 = courseTextBookBuilder7.quantity(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder15 = bookItemBuilder13.title("ItemPurchased{title='', email='hi!', datePurchased=null}");
        boolean boolean16 = book5.equals((java.lang.Object) "ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.team4.model.items.Magazine magazine19 = new org.team4.model.items.Magazine((org.team4.model.items.Item) book5, "", 10);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(bookBuilder9);
        org.junit.Assert.assertNotNull(bookItemBuilder11);
        org.junit.Assert.assertNotNull(bookItemBuilder13);
        org.junit.Assert.assertNotNull(bookItemBuilder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
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
        java.lang.String str29 = book9.getAuthor();
        org.team4.model.items.decorator.ItemDecorator itemDecorator30 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) book9);
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
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.genre("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.BookBuilder bookBuilder8 = bookBuilder6.publisher("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        org.team4.model.items.builder.BookBuilder bookBuilder10 = bookBuilder8.author("SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Sat Mar 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder0.yearPublished((int) (byte) 0);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder12 = courseTextBookBuilder0.isVirtual(false);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder14 = courseTextBookBuilder0.isVirtual(false);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(courseTextBookBuilder12);
        org.junit.Assert.assertNotNull(courseTextBookBuilder14);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
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
        double double30 = newsletter3.getPrice();
        java.lang.String str31 = newsletter3.getTitle();
        java.lang.String str32 = newsletter3.getLink();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(dVD6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str32, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder6 = magazineBuilder4.issueNumber(32);
        org.team4.model.items.Magazine magazine7 = magazineBuilder4.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder9 = magazineBuilder4.price(0.0d);
        org.team4.model.items.Magazine magazine10 = magazineBuilder4.build();
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineBuilder6);
        org.junit.Assert.assertNotNull(magazine7);
        org.junit.Assert.assertNotNull(magazineItemBuilder9);
        org.junit.Assert.assertNotNull(magazine10);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.title("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.edition((int) (byte) 1);
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder3.booktype("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:02 EDT 2024, dateDue=Tue Apr 30 20:32:02 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder9 = bookRequestBuilder3.title("SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:04 EDT 2024, dateDue=Tue Apr 30 20:32:04 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder11 = bookRequestBuilder3.edition((int) (byte) 10);
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
        org.junit.Assert.assertNotNull(bookRequestBuilder9);
        org.junit.Assert.assertNotNull(bookRequestBuilder11);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.DVDBuilder dVDBuilder7 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD8 = dVDBuilder7.build();
        java.lang.String str9 = dVD8.getGenre();
        boolean boolean10 = dVD8.isPurchasable();
        double double11 = dVD8.getDuration();
        dVD8.setQuantity((int) (short) 1);
        dVD8.setQuantity((int) ' ');
        boolean boolean16 = dVD8.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator17 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD8);
        org.team4.model.items.Item item18 = rentableItemDecorator17.getItem();
        org.team4.model.items.Item item19 = new org.team4.model.items.Item(item18);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter28 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str29 = subscribeNewsletter28.getTitle();
        java.util.Date date30 = null;
        subscribeNewsletter28.setDateSubscribed(date30);
        java.util.Date date32 = subscribeNewsletter28.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter37 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str38 = subscribeNewsletter37.getEmail();
        java.util.Date date39 = subscribeNewsletter37.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter42 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str43 = subscribeNewsletter42.getEmail();
        java.util.Date date44 = subscribeNewsletter42.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter45 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date39, date44);
        org.team4.model.course.Course course48 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date32, date44, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.model.course.CourseTextBook courseTextBook50 = new org.team4.model.course.CourseTextBook(item19, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", (int) (short) 1, "hi!", "PayPal", 52, course48, false);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder51 = courseTextBookBuilder0.course(course48);
        org.team4.model.items.builder.BookBuilder bookBuilder53 = courseTextBookBuilder0.publisher("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.team4.model.items.builder.BookBuilder bookBuilder55 = courseTextBookBuilder0.genre("ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:32:03 EDT 2024}");
        org.team4.model.items.builder.BookBuilder bookBuilder57 = courseTextBookBuilder0.hasSoftCopy(false);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(dVD8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(item18);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertNotNull(courseTextBookBuilder51);
        org.junit.Assert.assertNotNull(bookBuilder53);
        org.junit.Assert.assertNotNull(bookBuilder55);
        org.junit.Assert.assertNotNull(bookBuilder57);
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
        org.team4.functionality.buy.ItemPurchased itemPurchased28 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", date23);
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
        java.lang.String str86 = rentedItem59.getTitle();
        rentedItem59.setISBN("Debit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str60, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(date73);
// flaky:         org.junit.Assert.assertEquals(date73.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertNotNull(date83);
// flaky:         org.junit.Assert.assertEquals(date83.toString(), "Tue Apr 30 20:32:09 EDT 2024");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str86, "User [email=, password=, name=hi!, type=, validated=false]");
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        java.lang.String str4 = magazine3.getPublisher();
        java.lang.String str5 = magazine3.getPublisher();
        int int6 = magazine3.getIssueNumber();
        int int7 = magazine3.getIssueNumber();
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal{email='PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}'}", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:04 EDT 2024, dateDue=Tue Apr 30 20:32:04 EDT 2024}");
        java.lang.String str3 = subscribeNewsletter2.getTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PayPal{email='PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}'}" + "'", str3, "PayPal{email='PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}'}");
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
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator11 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        org.team4.model.items.DVD dVD14 = new org.team4.model.items.DVD((org.team4.model.items.Item) rentableItemDecorator11, "User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, type=PayPal, validated=true]", (double) ' ');
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getEndDate();
        java.util.Date date7 = course5.getStartDate();
        java.lang.String str8 = course5.getProfessorEmail();
        java.lang.String str9 = course5.getProfessorEmail();
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("User [email=, password=, name=hi!, type=, validated=false]", "User [email=, password=, name=hi!, type=, validated=false]", "PayPal", "PayPal", (long) (-1));
        boolean boolean6 = nonFaculty5.isValidated();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        java.lang.String str8 = student5.toString();
        student5.setPassword("");
        java.lang.String str11 = student5.getType();
        java.lang.String str12 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str8, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("User [email=hi!, password=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, name=User [email=, password=, name=hi!, type=, validated=false], type=, validated=false]", 100, 97);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 97");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.team4.model.items.Newsletter newsletter4 = new org.team4.model.items.Newsletter("", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", 0.0d);
        java.lang.String str5 = newsletter4.getTitle();
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD7 = dVDBuilder6.build();
        java.lang.String str8 = dVD7.getGenre();
        boolean boolean9 = dVD7.isPurchasable();
        double double10 = dVD7.getDuration();
        dVD7.setQuantity((int) (short) 1);
        dVD7.setQuantity((int) ' ');
        boolean boolean15 = dVD7.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator16 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD7);
        org.team4.model.items.Item item17 = rentableItemDecorator16.getItem();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator18 = new org.team4.model.items.decorator.PurchasableItemDecorator(item17);
        org.team4.model.user.Manager manager24 = new org.team4.model.user.Manager("", "", "", "hi!", false);
        manager24.setValidated(false);
        manager24.setName("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase29 = new org.team4.functionality.buy.ItemToPurchase(item17, (org.team4.model.user.User) manager24);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase30 = new org.team4.functionality.buy.ItemToPurchase(newsletter4, (org.team4.model.user.User) manager24);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase31 = new org.team4.functionality.buy.ItemToPurchase((double) 0.0f, (org.team4.model.user.User) manager24);
        double double32 = itemToPurchase31.getAmount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(dVD7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(item17);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator11 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        java.lang.String str12 = book9.getPublisher();
        org.team4.model.items.DVD dVD15 = new org.team4.model.items.DVD((org.team4.model.items.Item) book9, "SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}', email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', dateSubscribed=Sat Mar 30 20:32:00 EDT 2024, dateDue=Tue Apr 30 20:32:00 EDT 2024}", (double) (byte) -1);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.lang.String str6 = course5.getProfessorEmail();
        java.lang.String str7 = course5.getProfessorEmail();
        org.team4.model.items.builder.DVDBuilder dVDBuilder8 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD9 = dVDBuilder8.build();
        java.lang.String str10 = dVD9.getGenre();
        boolean boolean11 = dVD9.isPurchasable();
        double double12 = dVD9.getDuration();
        dVD9.setQuantity((int) (short) 1);
        dVD9.setQuantity((int) ' ');
        boolean boolean17 = dVD9.isPurchasable();
        java.util.Date date19 = null;
        java.util.Date date20 = null;
        org.team4.model.course.Course course23 = new org.team4.model.course.Course("hi!", date19, date20, "", "hi!");
        org.team4.model.user.Student student28 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str29 = student28.getType();
        course23.enrollStudent(student28);
        java.lang.String str31 = course23.getProfessorEmail();
        org.team4.model.user.Student student37 = new org.team4.model.user.Student("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "Mobile Wallet", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}", false);
        boolean boolean38 = course23.isEnrolled(student37);
        java.lang.String str39 = student37.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase40 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) dVD9, (org.team4.model.user.User) student37);
        boolean boolean41 = course5.isEnrolled(student37);
        java.lang.String str42 = course5.getProfessorEmail();
        java.util.Date date44 = null;
        java.util.Date date45 = null;
        org.team4.model.course.Course course48 = new org.team4.model.course.Course("hi!", date44, date45, "", "hi!");
        java.util.Date date49 = course48.getEndDate();
        java.lang.String str50 = course48.getProfessorEmail();
        java.lang.String[] strArray72 = new java.lang.String[] { "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "PayPal", "ItemPurchased{title='', email='hi!', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemPurchased{title='', email='', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" };
        java.util.ArrayList<java.lang.String> strList73 = new java.util.ArrayList<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList73, strArray72);
        org.team4.model.user.Faculty faculty75 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "", "ItemPurchased{title='', email='', datePurchased=null}", 0L, strList73);
        org.team4.model.user.Student student76 = new org.team4.model.user.Student("", "Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}", "Mobile Wallet", "Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}", strList73);
        boolean boolean77 = course48.isEnrolled(student76);
        java.util.Date date78 = course48.getEndDate();
        org.team4.model.user.Student student84 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str85 = student84.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase86 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student84);
        student84.setType("User [email=, password=, name=hi!, type=, validated=false]");
        boolean boolean89 = course48.isEnrolled(student84);
        student84.setType("Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}");
        java.util.ArrayList<java.lang.String> strList92 = student84.getCourses();
        boolean boolean93 = course5.isEnrolled(student84);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(dVD9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}" + "'", str39, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNull(date49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(date78);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNull(strList92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("User [email=, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=PayPal, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:02 EDT 2024, dateDue=Tue Apr 30 20:32:02 EDT 2024}");
        faculty4.setName("ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='', datePurchased=Sat Mar 30 20:32:07 EDT 2024}");
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.builder.DVDBuilder dVDBuilder4 = dVDBuilder0.genre("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDBuilder0.title("SubscribeNewsletter{title='Debit Card', email='hi!', dateSubscribed=Sat Mar 30 20:32:04 EDT 2024, dateDue=Tue Apr 30 20:32:04 EDT 2024}");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        org.team4.model.user.Student student10 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str11 = student10.getType();
        course5.enrollStudent(student10);
        java.lang.String str13 = course5.getProfessorEmail();
        java.lang.String str14 = course5.getProfessorEmail();
        java.lang.String str15 = course5.getCourseTextBookISBN();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = course5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.toString()\" because \"this.startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        org.team4.model.user.Student student10 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str11 = student10.getType();
        course5.enrollStudent(student10);
        java.lang.String str13 = course5.getProfessorEmail();
        java.util.Date date14 = course5.getEndDate();
        java.util.Date date15 = course5.getEndDate();
        java.lang.String str16 = course5.getCourseTextBookISBN();
        java.lang.String str17 = course5.getProfessorEmail();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder0.booktype("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.BookRequest bookRequest6 = bookRequestBuilder0.build();
        java.lang.String str7 = bookRequest6.getEmail();
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequest6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.yearPublished((int) (short) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder8 = magazineBuilder0.issueNumber(100);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder10 = magazineBuilder8.publisher("Debit Card");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder12 = magazineBuilder8.title("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder14 = magazineBuilder8.issueNumber(10);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder16 = magazineBuilder14.publisher("Mobile Wallet");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder18 = magazineBuilder16.publisher("");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineBuilder8);
        org.junit.Assert.assertNotNull(magazineBuilder10);
        org.junit.Assert.assertNotNull(magazineItemBuilder12);
        org.junit.Assert.assertNotNull(magazineBuilder14);
        org.junit.Assert.assertNotNull(magazineBuilder16);
        org.junit.Assert.assertNotNull(magazineBuilder18);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder0.email("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.edition((int) (byte) 10);
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder6.email("Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder10 = bookRequestBuilder8.booktype("SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:05 EDT 2024, dateDue=Tue Apr 30 20:32:05 EDT 2024}");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
        org.junit.Assert.assertNotNull(bookRequestBuilder10);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:08 EDT 2024, dateDue=Tue Apr 30 20:32:08 EDT 2024}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", true);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
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
        java.lang.String str19 = dVD1.getGenre();
        dVD1.setRentable(true);
        org.team4.model.items.decorator.ItemDecorator itemDecorator22 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) dVD1);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
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
        org.team4.functionality.buy.ItemPurchased itemPurchased28 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", date23);
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
        rentedItem59.setISBN("PayPal");
        java.lang.String str88 = rentedItem59.getISBN();
        rentedItem59.setTitle("SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}");
        java.lang.String str91 = rentedItem59.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Apr 30 20:32:10 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Tue Apr 30 20:32:10 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 20:32:10 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 20:32:10 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 20:32:10 EDT 2024");
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Tue Apr 30 20:32:10 EDT 2024");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str60, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(date73);
// flaky:         org.junit.Assert.assertEquals(date73.toString(), "Tue Apr 30 20:32:10 EDT 2024");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertNotNull(date83);
// flaky:         org.junit.Assert.assertEquals(date83.toString(), "Tue Apr 30 20:32:10 EDT 2024");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "PayPal" + "'", str88, "PayPal");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}" + "'", str91, "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:31:55 EDT 2024, dateDue=Tue Apr 30 20:31:55 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "User [email=, password=, name=hi!, type=, validated=false]", "User [email=, password=, name=hi!, type=hi!, validated=false]", (long) 32);
        boolean boolean6 = manager5.isValidated();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
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
        int int54 = courseTextBook45.getEdition();
        java.util.Date date61 = null;
        java.util.Date date62 = null;
        org.team4.model.course.Course course65 = new org.team4.model.course.Course("hi!", date61, date62, "", "hi!");
        java.util.Date date66 = course65.getEndDate();
        org.team4.model.user.Student student72 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str73 = student72.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase74 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student72);
        java.lang.String str75 = student72.toString();
        course65.enrollStudent(student72);
        org.team4.model.course.CourseTextBook courseTextBook78 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook45, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", 52, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}", "PayPal", (int) '4', course65, false);
        java.lang.String str79 = courseTextBook45.getISBN();
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
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 97 + "'", int54 == 97);
        org.junit.Assert.assertNull(date66);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str75, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.ISBN("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDBuilder0.quantity((int) ' ');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDBuilder0.ISBN("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder10 = dVDBuilder0.quantity((int) (byte) 10);
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
        org.junit.Assert.assertNotNull(dVDItemBuilder10);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", (double) (short) 0);
        double double4 = newsletter3.getPrice();
        double double5 = newsletter3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        java.util.Date date2 = null;
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("", "hi!", date2);
        java.lang.String str4 = itemPurchased3.getTitle();
        java.util.Date date5 = itemPurchased3.getDatePurchased();
        java.lang.String str6 = itemPurchased3.getTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
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
        org.team4.model.items.DVD dVD23 = new org.team4.model.items.DVD((org.team4.model.items.Item) courseTextBook8, "ItemPurchased{title='', email='', datePurchased=null}", 0.0d);
        java.lang.String str24 = courseTextBook8.getGenre();
        java.util.Date date26 = null;
        java.util.Date date27 = null;
        org.team4.model.course.Course course30 = new org.team4.model.course.Course("hi!", date26, date27, "", "hi!");
        org.team4.model.user.Student student35 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str36 = student35.getType();
        course30.enrollStudent(student35);
        java.lang.String str38 = course30.getCourseName();
        java.lang.String str39 = course30.getCourseTextBookISBN();
        org.team4.model.user.Student student44 = new org.team4.model.user.Student("", "", "PayPal", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        boolean boolean45 = course30.isEnrolled(student44);
        // The following exception was thrown during execution in test generation
        try {
            courseTextBook8.makeCopies(student44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.team4.model.course.Course.isEnrolled(org.team4.model.user.Student)\" because \"this.course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        boolean boolean2 = dVD1.isPurchasable();
        org.team4.model.items.Book book10 = new org.team4.model.items.Book((org.team4.model.items.Item) dVD1, "SubscribeNewsletter{title='Debit Card', email='hi!', dateSubscribed=Sat Mar 30 20:32:04 EDT 2024, dateDue=Tue Apr 30 20:32:04 EDT 2024}", 97, "User [email=, password=, name=hi!, type=, validated=false]", "ProcessPayment{modes=null, itemToPurchase=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}}", (int) (short) 0, false, false);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
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
        boolean boolean14 = rentableItemDecorator10.isRentable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator15 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) rentableItemDecorator10);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
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
        org.team4.functionality.buy.ItemPurchased itemPurchased28 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", date23);
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
        rentedItem59.setTitle("ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter90 = new org.team4.functionality.subscriptions.SubscribeNewsletter("User [email=, password=, name=hi!, type=, validated=false]", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter93 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str94 = subscribeNewsletter93.getTitle();
        java.util.Date date95 = subscribeNewsletter93.getDateDue();
        subscribeNewsletter90.setDateSubscribed(date95);
        rentedItem59.setDueDate(date95);
        java.lang.String str98 = rentedItem59.getISBN();
        java.util.Date date99 = rentedItem59.getRentDate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Apr 30 20:32:10 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Tue Apr 30 20:32:10 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 20:32:10 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 20:32:10 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 20:32:10 EDT 2024");
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Tue Apr 30 20:32:10 EDT 2024");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str60, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(date73);
// flaky:         org.junit.Assert.assertEquals(date73.toString(), "Tue Apr 30 20:32:10 EDT 2024");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertNotNull(date83);
// flaky:         org.junit.Assert.assertEquals(date83.toString(), "Tue Apr 30 20:32:10 EDT 2024");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "hi!" + "'", str94, "hi!");
        org.junit.Assert.assertNotNull(date95);
// flaky:         org.junit.Assert.assertEquals(date95.toString(), "Tue Apr 30 20:32:10 EDT 2024");
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str98, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(date99);
// flaky:         org.junit.Assert.assertEquals(date99.toString(), "Tue Apr 30 20:32:10 EDT 2024");
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.user.User user12 = itemToPurchase7.getUser();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder13 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder15 = courseTextBookBuilder13.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder17 = courseTextBookBuilder13.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder19 = courseTextBookBuilder13.isVirtual(true);
        org.team4.model.items.Book book20 = courseTextBookBuilder19.build();
        boolean boolean21 = book20.hasHardCopy();
        java.lang.String str22 = book20.getGenre();
        org.team4.model.user.Manager manager28 = new org.team4.model.user.Manager("", "", "", "hi!", false);
        manager28.setValidated(false);
        manager28.setName("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase33 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) book20, (org.team4.model.user.User) manager28);
        double double34 = itemToPurchase33.getAmount();
        org.team4.model.paymentmodes.DebitCard debitCard38 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete39 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase33, (org.team4.model.paymentmodes.PaymentValidator) debitCard38);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete40 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) debitCard38);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(bookBuilder15);
        org.junit.Assert.assertNotNull(bookItemBuilder17);
        org.junit.Assert.assertNotNull(courseTextBookBuilder19);
        org.junit.Assert.assertNotNull(book20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        boolean boolean4 = debitCard3.correctLength();
        boolean boolean5 = debitCard3.correctLength();
        org.team4.model.user.Student student11 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str12 = student11.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase13 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student11);
        org.team4.model.items.Newsletter newsletter14 = itemToPurchase13.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet16 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete17 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase13, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet16);
        org.team4.model.paymentmodes.DebitCard debitCard21 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete22 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase13, (org.team4.model.paymentmodes.PaymentValidator) debitCard21);
        org.team4.model.items.Item item23 = itemToPurchase13.getItem();
        org.team4.model.items.Item item24 = itemToPurchase13.getItem();
        org.team4.model.items.Item item25 = itemToPurchase13.getItem();
        org.team4.functionality.buy.ProcessPayment processPayment26 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) debitCard3, itemToPurchase13);
        java.lang.String str27 = processPayment26.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(newsletter14);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNull(item25);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.team4.model.user.Manager manager4 = new org.team4.model.user.Manager("ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:32:07 EDT 2024}", "", "ItemToPurchase{item=null, user=User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false], newsletter=null}", "PayPal{email='PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}'}");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.team4.model.user.User user1 = null;
        org.team4.functionality.buy.ItemToPurchase itemToPurchase2 = new org.team4.functionality.buy.ItemToPurchase((double) 5890207L, user1);
        org.team4.model.items.Item item3 = itemToPurchase2.getItem();
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder10 = courseTextBookBuilder0.isVirtual(false);
        org.team4.model.items.Book book11 = courseTextBookBuilder0.build();
        book11.setRentable(false);
        java.lang.String str14 = book11.getAuthor();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(courseTextBookBuilder10);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
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
        org.team4.functionality.buy.ItemPurchased itemPurchased28 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", date23);
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
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter90 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "", date82, date89);
        rentedItem59.setDueDate(date82);
        java.lang.String str92 = rentedItem59.getISBN();
        rentedItem59.setISBN("ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}");
        rentedItem59.setISBN("PayPal{email='PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Apr 30 20:32:10 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Tue Apr 30 20:32:10 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 20:32:10 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 20:32:10 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 20:32:10 EDT 2024");
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Tue Apr 30 20:32:10 EDT 2024");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str60, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(date73);
// flaky:         org.junit.Assert.assertEquals(date73.toString(), "Tue Apr 30 20:32:10 EDT 2024");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertNotNull(date82);
// flaky:         org.junit.Assert.assertEquals(date82.toString(), "Tue Apr 30 20:32:10 EDT 2024");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertNotNull(date89);
// flaky:         org.junit.Assert.assertEquals(date89.toString(), "Tue Apr 30 20:32:10 EDT 2024");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str92, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
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
        java.lang.String str33 = rentableItemDecorator11.getTitle();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}");
        org.team4.model.items.Book book5 = courseTextBookBuilder0.build();
        org.team4.model.course.CourseTextBook courseTextBook6 = courseTextBookBuilder0.build();
        boolean boolean7 = courseTextBook6.hasSoftCopy();
        org.team4.model.items.DVD dVD10 = new org.team4.model.items.DVD((org.team4.model.items.Item) courseTextBook6, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", (double) (-1));
        int int11 = dVD10.getQuantity();
        boolean boolean12 = dVD10.isRentable();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(courseTextBook6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder10 = courseTextBookBuilder0.isVirtual(false);
        org.team4.model.items.builder.BookBuilder bookBuilder12 = courseTextBookBuilder0.hasHardCopy(false);
        org.team4.model.course.CourseTextBook courseTextBook13 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder15 = courseTextBookBuilder0.edition((int) (short) 10);
        org.team4.model.items.builder.BookBuilder bookBuilder17 = courseTextBookBuilder0.hasSoftCopy(false);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder19 = courseTextBookBuilder0.title("SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(courseTextBookBuilder10);
        org.junit.Assert.assertNotNull(bookBuilder12);
        org.junit.Assert.assertNotNull(courseTextBook13);
        org.junit.Assert.assertNotNull(bookBuilder15);
        org.junit.Assert.assertNotNull(bookBuilder17);
        org.junit.Assert.assertNotNull(bookItemBuilder19);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:09 EDT 2024, dateDue=Tue Apr 30 20:32:09 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter3 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter3.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter3.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter10 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date11 = null;
        subscribeNewsletter10.setDateSubscribed(date11);
        java.util.Date date13 = subscribeNewsletter10.getDateDue();
        subscribeNewsletter3.setDateDue(date13);
        java.util.Date date15 = subscribeNewsletter3.getDateSubscribed();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter18 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str19 = subscribeNewsletter18.getEmail();
        java.util.Date date20 = subscribeNewsletter18.getDateDue();
        subscribeNewsletter3.setDateSubscribed(date20);
        java.util.Date date22 = subscribeNewsletter3.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter27 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str28 = subscribeNewsletter27.getEmail();
        java.util.Date date29 = subscribeNewsletter27.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter32 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str33 = subscribeNewsletter32.getEmail();
        java.util.Date date34 = subscribeNewsletter32.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter35 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date29, date34);
        subscribeNewsletter3.setDateDue(date29);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter39 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.util.Date date40 = subscribeNewsletter39.getDateSubscribed();
        org.team4.model.course.Course course43 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Sat Mar 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}", date29, date40, "SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:05 EDT 2024, dateDue=Tue Apr 30 20:32:05 EDT 2024}", "SubscribeNewsletter{title='Debit Card', email='hi!', dateSubscribed=Sat Mar 30 20:32:04 EDT 2024, dateDue=Tue Apr 30 20:32:04 EDT 2024}");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Tue Apr 30 20:32:10 EDT 2024");
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Sat Mar 30 20:32:10 EDT 2024");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Tue Apr 30 20:32:10 EDT 2024");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Tue Apr 30 20:32:10 EDT 2024");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Tue Apr 30 20:32:10 EDT 2024");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(date34);
// flaky:         org.junit.Assert.assertEquals(date34.toString(), "Tue Apr 30 20:32:10 EDT 2024");
        org.junit.Assert.assertNotNull(date40);
// flaky:         org.junit.Assert.assertEquals(date40.toString(), "Sat Mar 30 20:32:10 EDT 2024");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.author("");
        org.team4.model.items.BookRequest bookRequest4 = bookRequestBuilder0.build();
        java.lang.String str5 = bookRequest4.getISBN();
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequest4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
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
        java.lang.String str42 = courseTextBook41.getPublisher();
        java.lang.String str43 = courseTextBook41.getAuthor();
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
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Credit Card" + "'", str42, "Credit Card");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str43, "ItemPurchased{title='', email='', datePurchased=null}");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDBuilder2.quantity(10);
        org.team4.model.items.builder.DVDBuilder dVDBuilder8 = dVDBuilder2.genre("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder10 = dVDBuilder2.yearPublished(32);
        org.team4.model.items.builder.DVDBuilder dVDBuilder12 = dVDBuilder2.duration((double) 4978267L);
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDBuilder8);
        org.junit.Assert.assertNotNull(dVDItemBuilder10);
        org.junit.Assert.assertNotNull(dVDBuilder12);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.team4.model.user.Student student9 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str10 = student9.getType();
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        student9.setCourses(strList13);
        org.team4.model.user.Faculty faculty16 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", (long) (byte) -1, strList13);
        java.util.ArrayList<java.lang.String> strList17 = faculty16.getCourses();
        java.lang.String str18 = faculty16.toString();
        org.team4.model.user.Faculty faculty24 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "hi!", "", "", false);
        faculty24.setFacultyID((long) (byte) 1);
        org.team4.model.user.Student student31 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str32 = student31.getType();
        java.lang.String[] strArray34 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        student31.setCourses(strList35);
        faculty24.setCourses(strList35);
        long long39 = faculty24.getFacultyID();
        faculty24.setFacultyID((long) (byte) 1);
        faculty24.setFacultyID(3093246L);
        org.team4.model.user.Student student53 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str54 = student53.getType();
        java.lang.String[] strArray56 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        student53.setCourses(strList57);
        org.team4.model.user.Faculty faculty60 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", (long) (byte) -1, strList57);
        java.util.ArrayList<java.lang.String> strList61 = faculty60.getCourses();
        java.util.ArrayList<java.lang.String> strList62 = faculty60.getCourses();
        faculty24.setCourses(strList62);
        faculty16.setCourses(strList62);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User [email=, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=PayPal, validated=false]" + "'", str18, "User [email=, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=PayPal, validated=false]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertNotNull(strList62);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.team4.model.user.User user4 = new org.team4.model.user.User("User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, type=PayPal, validated=true]", "Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:02 EDT 2024, dateDue=Tue Apr 30 20:32:02 EDT 2024}", "User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=hi!, name=User [email=, password=, name=hi!, type=, validated=false], type=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, validated=false]");
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.builder.DVDBuilder dVDBuilder4 = dVDBuilder0.genre("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDBuilder4.price((double) '4');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDItemBuilder6.ISBN("Credit Card");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.title("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.edition(32);
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder3.title("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:08 EDT 2024, dateDue=Tue Apr 30 20:32:08 EDT 2024}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", false);
    }
}
