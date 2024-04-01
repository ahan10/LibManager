package org.team4.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.paymentmodes.CreditCard creditCard10 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) creditCard10);
        boolean boolean12 = creditCard10.correctLength();
        boolean boolean13 = creditCard10.notExpired();
        org.team4.model.user.Student student20 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str21 = student20.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase22 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student20);
        java.lang.String str23 = student20.toString();
        student20.setPassword("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase26 = new org.team4.functionality.buy.ItemToPurchase((double) (-1L), (org.team4.model.user.User) student20);
        org.team4.functionality.buy.ProcessPayment processPayment27 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) creditCard10, itemToPurchase26);
        java.lang.String str28 = creditCard10.getMode();
        boolean boolean29 = creditCard10.correctLength();
        org.team4.model.items.Newsletter newsletter33 = new org.team4.model.items.Newsletter("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", (double) 10L);
        java.lang.String str34 = newsletter33.getTitle();
        java.lang.String str35 = newsletter33.getTitle();
        java.lang.String str36 = newsletter33.getTitle();
        org.team4.model.items.builder.DVDBuilder dVDBuilder37 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD38 = dVDBuilder37.build();
        java.lang.String str39 = dVD38.getGenre();
        boolean boolean40 = dVD38.isPurchasable();
        double double41 = dVD38.getDuration();
        org.team4.model.paymentmodes.MobileWallet mobileWallet43 = new org.team4.model.paymentmodes.MobileWallet("");
        org.team4.model.user.Student student49 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str50 = student49.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase51 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student49);
        org.team4.model.items.Newsletter newsletter52 = itemToPurchase51.getNewsletter();
        org.team4.functionality.buy.ProcessPayment processPayment53 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet43, itemToPurchase51);
        boolean boolean54 = dVD38.equals((java.lang.Object) processPayment53);
        java.util.Date date61 = null;
        java.util.Date date62 = null;
        org.team4.model.course.Course course65 = new org.team4.model.course.Course("hi!", date61, date62, "", "hi!");
        java.util.Date date66 = course65.getEndDate();
        java.lang.String str67 = course65.getProfessorEmail();
        java.lang.String str68 = course65.getProfessorEmail();
        org.team4.model.course.CourseTextBook courseTextBook70 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) dVD38, "", 0, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "hi!", (-1), course65, false);
        org.team4.model.course.Course course71 = courseTextBook70.getCourse();
        org.team4.model.items.decorator.ItemDecorator itemDecorator72 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook70);
        org.team4.model.course.Course course73 = courseTextBook70.getCourse();
        org.team4.model.course.Course course74 = courseTextBook70.getCourse();
        java.util.Date date76 = null;
        java.util.Date date77 = null;
        org.team4.model.course.Course course80 = new org.team4.model.course.Course("hi!", date76, date77, "", "hi!");
        java.util.Date date81 = course80.getEndDate();
        java.lang.String str82 = course80.getProfessorEmail();
        java.lang.String str83 = course80.getProfessorEmail();
        org.team4.model.user.Student student89 = new org.team4.model.user.Student("", "", "hi!", "");
        student89.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase92 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student89);
        java.lang.String str93 = student89.getEmail();
        course80.enrollStudent(student89);
        course74.enrollStudent(student89);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase96 = new org.team4.functionality.buy.ItemToPurchase(newsletter33, (org.team4.model.user.User) student89);
        org.team4.functionality.buy.ProcessPayment processPayment97 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) creditCard10, itemToPurchase96);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str23, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Credit Card" + "'", str28, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str34, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str35, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str36, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertNotNull(dVD38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNull(newsletter52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(date66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertNotNull(course71);
        org.junit.Assert.assertNotNull(course73);
        org.junit.Assert.assertNotNull(course74);
        org.junit.Assert.assertNull(date81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter6 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str7 = subscribeNewsletter6.getEmail();
        java.util.Date date8 = subscribeNewsletter6.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter11 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str12 = subscribeNewsletter11.getEmail();
        java.util.Date date13 = subscribeNewsletter11.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter14 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date8, date13);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter19 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str20 = subscribeNewsletter19.getEmail();
        java.util.Date date21 = subscribeNewsletter19.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter24 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str25 = subscribeNewsletter24.getEmail();
        java.util.Date date26 = subscribeNewsletter24.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter27 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date21, date26);
        org.team4.model.items.RentedItem rentedItem28 = new org.team4.model.items.RentedItem("Credit Card", "ItemPurchased{title='', email='', datePurchased=null}", date13, date21);
        java.util.Date date29 = null;
        rentedItem28.setDueDate(date29);
        java.util.Date date31 = rentedItem28.getDueDate();
        java.lang.String str32 = rentedItem28.getISBN();
        java.lang.String str33 = rentedItem28.getISBN();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(date26);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertNull(date31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str32, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str33, "ItemPurchased{title='', email='', datePurchased=null}");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        java.util.Date date2 = null;
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("", "hi!", date2);
        java.lang.String str4 = itemPurchased3.getTitle();
        java.lang.String str5 = itemPurchased3.getTitle();
        java.lang.String str6 = itemPurchased3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str6, "ItemPurchased{title='', email='hi!', datePurchased=null}");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        boolean boolean9 = book7.hasHardCopy();
        boolean boolean10 = book7.hasHardCopy();
        org.team4.model.items.DVD dVD13 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Mobile Wallet", (double) 7241236L);
        java.lang.String str14 = book7.toString();
        java.lang.String str15 = book7.toString();
        double double16 = book7.getPrice();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}" + "'", str14, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}" + "'", str15, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("ItemPurchased{title='', email='hi!', datePurchased=null}", "Credit Card", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:43 EDT 2024, dateDue=Wed May 01 18:27:43 EDT 2024}", "User [email=, password=, name=hi!, type=, validated=true]");
        nonFaculty4.setUniversityID((long) (byte) 0);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter2.setEmail("User [email=, password=, name=hi!, type=, validated=true]");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("User [email=, password=, name=hi!, type=, validated=false]", 0, 1);
        boolean boolean4 = debitCard3.notExpired();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.title("hi!");
        org.team4.model.items.DVD dVD5 = dVDBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder7 = dVDBuilder0.genre("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:51 EDT 2024, dateDue=null}");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVD5);
        org.junit.Assert.assertNotNull(dVDBuilder7);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        boolean boolean9 = book7.hasHardCopy();
        boolean boolean10 = book7.hasHardCopy();
        org.team4.model.items.DVD dVD13 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Mobile Wallet", (double) 7241236L);
        java.lang.String str14 = book7.toString();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator15 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) book7);
        org.team4.model.items.Item item16 = purchasableItemDecorator15.getItem();
        boolean boolean17 = purchasableItemDecorator15.isPurchasable();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}" + "'", str14, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        book7.setPrice((double) 0L);
        java.lang.String str11 = book7.getISBN();
        int int12 = book7.getYearPublished();
        boolean boolean13 = book7.hasSoftCopy();
        org.team4.model.items.DVD dVD16 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "ItemPurchased{title='', email='', datePurchased=null}", (double) 5199463L);
        boolean boolean17 = book7.hasSoftCopy();
        int int18 = book7.getQuantity();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.title("hi!");
        org.team4.model.items.DVD dVD5 = dVDBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder7 = dVDBuilder0.title("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.DVDBuilder dVDBuilder9 = dVDBuilder0.genre("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder11 = dVDBuilder0.yearPublished(0);
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVD5);
        org.junit.Assert.assertNotNull(dVDItemBuilder7);
        org.junit.Assert.assertNotNull(dVDBuilder9);
        org.junit.Assert.assertNotNull(dVDItemBuilder11);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        int int2 = bookRequest1.getEdition();
        java.lang.String str3 = bookRequest1.getISBN();
        java.lang.String str4 = bookRequest1.getISBN();
        java.lang.String str5 = bookRequest1.getTitle();
        java.lang.String str6 = bookRequest1.getTitle();
        java.lang.String str7 = bookRequest1.getEmail();
        java.lang.String str8 = bookRequest1.getEmail();
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.paymentmodes.DebitCard debitCard15 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete16 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) debitCard15);
        double double17 = purchaseComplete16.getAmount();
        org.team4.model.items.Newsletter newsletter18 = purchaseComplete16.getNewsletter();
        org.team4.model.items.Item item19 = purchaseComplete16.getItem();
        org.team4.model.items.Item item20 = purchaseComplete16.getItem();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNull(newsletter18);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item20);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder2 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder2.issueNumber((int) '4');
        org.team4.model.items.Magazine magazine5 = magazineBuilder2.build();
        org.team4.model.items.DVD dVD8 = new org.team4.model.items.DVD((org.team4.model.items.Item) magazine5, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:51 EDT 2024, dateDue=null}", (double) 10);
        org.junit.Assert.assertNotNull(magazineBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazine5);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter6 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str7 = subscribeNewsletter6.getEmail();
        java.util.Date date8 = subscribeNewsletter6.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter11 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str12 = subscribeNewsletter11.getEmail();
        java.util.Date date13 = subscribeNewsletter11.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter14 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date8, date13);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter19 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str20 = subscribeNewsletter19.getEmail();
        java.util.Date date21 = subscribeNewsletter19.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter24 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str25 = subscribeNewsletter24.getEmail();
        java.util.Date date26 = subscribeNewsletter24.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter27 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date21, date26);
        org.team4.model.items.RentedItem rentedItem28 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=null}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date8, date21);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter35 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str36 = subscribeNewsletter35.getEmail();
        java.util.Date date37 = subscribeNewsletter35.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter40 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str41 = subscribeNewsletter40.getEmail();
        java.util.Date date42 = subscribeNewsletter40.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter43 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date37, date42);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter48 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str49 = subscribeNewsletter48.getEmail();
        java.util.Date date50 = subscribeNewsletter48.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter53 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str54 = subscribeNewsletter53.getEmail();
        java.util.Date date55 = subscribeNewsletter53.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter56 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date50, date55);
        org.team4.model.items.RentedItem rentedItem57 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=null}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date37, date50);
        rentedItem28.setDueDate(date50);
        java.lang.String str59 = rentedItem28.getTitle();
        java.lang.String str60 = rentedItem28.getTitle();
        java.lang.String str61 = rentedItem28.getTitle();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter64 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str65 = subscribeNewsletter64.getTitle();
        java.lang.String str66 = subscribeNewsletter64.getTitle();
        java.util.Date date67 = subscribeNewsletter64.getDateDue();
        rentedItem28.setDueDate(date67);
        java.lang.String str69 = rentedItem28.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(date26);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(date50);
// flaky:         org.junit.Assert.assertEquals(date50.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertNotNull(date55);
// flaky:         org.junit.Assert.assertEquals(date55.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str59, "ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str60, "ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str61, "ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertNotNull(date67);
// flaky:         org.junit.Assert.assertEquals(date67.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str69, "ItemPurchased{title='', email='hi!', datePurchased=null}");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.title("hi!");
        org.team4.model.items.DVD dVD5 = dVDBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder7 = dVDBuilder0.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=Wed May 01 18:27:45 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder9 = dVDItemBuilder7.yearPublished((int) (byte) 0);
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVD5);
        org.junit.Assert.assertNotNull(dVDItemBuilder7);
        org.junit.Assert.assertNotNull(dVDItemBuilder9);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder0.author("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.team4.model.items.BookRequest bookRequest6 = bookRequestBuilder5.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder5.edition(1);
        org.team4.model.items.BookRequest bookRequest9 = bookRequestBuilder5.build();
        java.lang.String str10 = bookRequest9.getEmail();
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequest6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
        org.junit.Assert.assertNotNull(bookRequest9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        boolean boolean9 = book7.hasHardCopy();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator10 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) book7);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator11 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) purchasableItemDecorator10);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter8 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str9 = subscribeNewsletter8.getEmail();
        java.util.Date date10 = subscribeNewsletter8.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter13 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str14 = subscribeNewsletter13.getEmail();
        java.util.Date date15 = subscribeNewsletter13.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter16 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date10, date15);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter21 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str22 = subscribeNewsletter21.getEmail();
        java.util.Date date23 = subscribeNewsletter21.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter26 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str27 = subscribeNewsletter26.getEmail();
        java.util.Date date28 = subscribeNewsletter26.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter29 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date23, date28);
        org.team4.model.items.RentedItem rentedItem30 = new org.team4.model.items.RentedItem("Credit Card", "ItemPurchased{title='', email='', datePurchased=null}", date15, date23);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter37 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str38 = subscribeNewsletter37.getEmail();
        java.util.Date date39 = subscribeNewsletter37.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter42 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str43 = subscribeNewsletter42.getEmail();
        java.util.Date date44 = subscribeNewsletter42.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter45 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date39, date44);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter50 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str51 = subscribeNewsletter50.getEmail();
        java.util.Date date52 = subscribeNewsletter50.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter55 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str56 = subscribeNewsletter55.getEmail();
        java.util.Date date57 = subscribeNewsletter55.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter58 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date52, date57);
        org.team4.model.items.RentedItem rentedItem59 = new org.team4.model.items.RentedItem("Credit Card", "ItemPurchased{title='', email='', datePurchased=null}", date44, date52);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter60 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemPurchased{title='', email='', datePurchased=null}", "hi!", date15, date52);
        java.util.Date date61 = subscribeNewsletter60.getDateSubscribed();
        java.lang.String str62 = subscribeNewsletter60.getEmail();
        subscribeNewsletter60.setTitle("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}");
        subscribeNewsletter60.setTitle("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:48 EDT 2024, dateDue=null}");
        subscribeNewsletter60.setTitle("User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:45 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=Wed May 01 18:27:45 EDT 2024}, validated=false]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(date52);
// flaky:         org.junit.Assert.assertEquals(date52.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(date57);
// flaky:         org.junit.Assert.assertEquals(date57.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertNotNull(date61);
// flaky:         org.junit.Assert.assertEquals(date61.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.team4.model.user.Student student22 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str23 = student22.getType();
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        student22.setCourses(strList26);
        org.team4.model.user.Faculty faculty29 = new org.team4.model.user.Faculty("ItemPurchased{title='', email='hi!', datePurchased=null}", "Credit Card", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", (long) (byte) 0, strList26);
        org.team4.model.user.Faculty faculty30 = new org.team4.model.user.Faculty("User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "ItemPurchased{title='', email='', datePurchased=null}", 7241236L, strList26);
        org.team4.model.user.Student student31 = new org.team4.model.user.Student("", "User [email=, password=, name=hi!, type=, validated=true]", "ItemPurchased{title='', email='', datePurchased=null}", "ItemPurchased{title='Credit Card', email='Debit Card', datePurchased=Mon Apr 01 18:27:47 EDT 2024}", strList26);
        org.team4.model.user.Student student32 = new org.team4.model.user.Student("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:48 EDT 2024, dateDue=null}", "SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:48 EDT 2024, dateDue=null}', email='hi!', dateSubscribed=Mon Apr 01 18:27:51 EDT 2024, dateDue=Wed May 01 18:27:51 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:43 EDT 2024, dateDue=Wed May 01 18:27:43 EDT 2024}", strList26);
        java.util.ArrayList<java.lang.String> strList33 = student32.getCourses();
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strList33);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder0.publisher("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.Book book11 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder13 = courseTextBookBuilder0.hasHardCopy(false);
        org.team4.model.items.Book book14 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder16 = courseTextBookBuilder0.title("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder18 = courseTextBookBuilder0.price((double) 10.0f);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(bookBuilder13);
        org.junit.Assert.assertNotNull(book14);
        org.junit.Assert.assertNotNull(bookItemBuilder16);
        org.junit.Assert.assertNotNull(bookItemBuilder18);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder0.publisher("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.Book book11 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder13 = courseTextBookBuilder0.hasHardCopy(false);
        org.team4.model.items.Book book14 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder16 = courseTextBookBuilder0.isVirtual(false);
        org.team4.model.course.CourseTextBook courseTextBook17 = courseTextBookBuilder0.build();
        org.team4.model.items.Book book25 = new org.team4.model.items.Book((org.team4.model.items.Item) courseTextBook17, "ItemPurchased{title='', email='hi!', datePurchased=null}", (-1), "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=Wed May 01 18:27:45 EDT 2024}", "", 1, true, false);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(bookBuilder13);
        org.junit.Assert.assertNotNull(book14);
        org.junit.Assert.assertNotNull(courseTextBookBuilder16);
        org.junit.Assert.assertNotNull(courseTextBook17);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.paymentmodes.DebitCard debitCard15 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete16 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) debitCard15);
        long long17 = purchaseComplete16.getPurchaseID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 7021422L + "'", long17 == 7021422L);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.course.CourseTextBook courseTextBook7 = courseTextBookBuilder6.build();
        java.lang.String str8 = courseTextBook7.getGenre();
        int int9 = courseTextBook7.getYearPublished();
        courseTextBook7.setPrice((double) (byte) 10);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(courseTextBook7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.course.Course course6 = new org.team4.model.course.Course("hi!", date2, date3, "", "hi!");
        java.lang.String str7 = course6.getProfessorEmail();
        java.util.Date date8 = course6.getStartDate();
        java.util.Date date11 = null;
        java.util.Date date12 = null;
        org.team4.model.course.Course course15 = new org.team4.model.course.Course("hi!", date11, date12, "", "hi!");
        java.util.Date date16 = course15.getEndDate();
        java.lang.String str17 = course15.getProfessorEmail();
        java.lang.String str18 = course15.getProfessorEmail();
        org.team4.model.user.Student student23 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean24 = course15.isEnrolled(student23);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase25 = new org.team4.functionality.buy.ItemToPurchase(100.0d, (org.team4.model.user.User) student23);
        student23.setValidated(true);
        boolean boolean28 = course6.isEnrolled(student23);
        boolean boolean29 = student23.isValidated();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase30 = new org.team4.functionality.buy.ItemToPurchase(100.0d, (org.team4.model.user.User) student23);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder31 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder33 = courseTextBookBuilder31.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder35 = courseTextBookBuilder31.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder37 = courseTextBookBuilder31.isVirtual(true);
        org.team4.model.items.Book book38 = courseTextBookBuilder37.build();
        int int39 = book38.getNoOfPages();
        boolean boolean40 = book38.hasHardCopy();
        boolean boolean41 = book38.hasHardCopy();
        boolean boolean43 = book38.equals((java.lang.Object) 100L);
        boolean boolean44 = book38.hasSoftCopy();
        java.util.ArrayList<java.lang.String> strList45 = org.team4.model.paymentmodes.PaymentModes.MODE;
        boolean boolean46 = book38.equals((java.lang.Object) strList45);
        student23.setCourses(strList45);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(bookBuilder33);
        org.junit.Assert.assertNotNull(bookItemBuilder35);
        org.junit.Assert.assertNotNull(courseTextBookBuilder37);
        org.junit.Assert.assertNotNull(book38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:47 EDT 2024, dateDue=Wed May 01 18:27:47 EDT 2024}", "hi!", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "Credit Card", 2844661L);
        long long6 = nonFaculty5.getUniversityID();
        java.lang.String str7 = nonFaculty5.getName();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2844661L + "'", long6 == 2844661L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str7, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter8 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str9 = subscribeNewsletter8.getEmail();
        java.util.Date date10 = subscribeNewsletter8.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter13 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str14 = subscribeNewsletter13.getEmail();
        java.util.Date date15 = subscribeNewsletter13.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter16 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date10, date15);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter21 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str22 = subscribeNewsletter21.getEmail();
        java.util.Date date23 = subscribeNewsletter21.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter26 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str27 = subscribeNewsletter26.getEmail();
        java.util.Date date28 = subscribeNewsletter26.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter29 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date23, date28);
        org.team4.model.items.RentedItem rentedItem30 = new org.team4.model.items.RentedItem("Credit Card", "ItemPurchased{title='', email='', datePurchased=null}", date15, date23);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter37 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str38 = subscribeNewsletter37.getEmail();
        java.util.Date date39 = subscribeNewsletter37.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter42 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str43 = subscribeNewsletter42.getEmail();
        java.util.Date date44 = subscribeNewsletter42.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter45 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date39, date44);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter50 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str51 = subscribeNewsletter50.getEmail();
        java.util.Date date52 = subscribeNewsletter50.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter55 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str56 = subscribeNewsletter55.getEmail();
        java.util.Date date57 = subscribeNewsletter55.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter58 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date52, date57);
        org.team4.model.items.RentedItem rentedItem59 = new org.team4.model.items.RentedItem("Credit Card", "ItemPurchased{title='', email='', datePurchased=null}", date44, date52);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter60 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemPurchased{title='', email='', datePurchased=null}", "hi!", date15, date52);
        java.util.Date date61 = subscribeNewsletter60.getDateSubscribed();
        java.lang.String str62 = subscribeNewsletter60.getEmail();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter65 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter65.setTitle("");
        java.util.Date date68 = subscribeNewsletter65.getDateSubscribed();
        subscribeNewsletter60.setDateDue(date68);
        java.lang.String str70 = subscribeNewsletter60.getTitle();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(date52);
// flaky:         org.junit.Assert.assertEquals(date52.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(date57);
// flaky:         org.junit.Assert.assertEquals(date57.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertNotNull(date61);
// flaky:         org.junit.Assert.assertEquals(date61.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertNotNull(date68);
// flaky:         org.junit.Assert.assertEquals(date68.toString(), "Mon Apr 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str70, "ItemPurchased{title='', email='', datePurchased=null}");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.paymentmodes.DebitCard debitCard15 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete16 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) debitCard15);
        org.team4.model.items.Item item17 = itemToPurchase7.getItem();
        org.team4.model.user.User user18 = itemToPurchase7.getUser();
        org.team4.model.paymentmodes.PayPal payPal20 = new org.team4.model.paymentmodes.PayPal("User [email=, password=, name=hi!, type=, validated=false]");
        boolean boolean21 = payPal20.isValid();
        java.lang.String str22 = payPal20.toString();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete23 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) payPal20);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str22, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        boolean boolean4 = debitCard3.correctLength();
        boolean boolean5 = debitCard3.correctLength();
        boolean boolean6 = debitCard3.isValid();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("", (int) (short) 10, 10);
        boolean boolean4 = creditCard3.notExpired();
        org.team4.model.items.Newsletter newsletter8 = new org.team4.model.items.Newsletter("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", (double) 10L);
        java.lang.String str9 = newsletter8.getTitle();
        java.lang.String str10 = newsletter8.getTitle();
        java.lang.String str11 = newsletter8.getLink();
        java.lang.String[] strArray19 = new java.lang.String[] { "ItemPurchased{title='', email='', datePurchased=null}", "SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        org.team4.model.user.Faculty faculty22 = new org.team4.model.user.Faculty("Mobile Wallet", "hi!", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "Credit Card", 1L, strList20);
        long long23 = faculty22.getFacultyID();
        faculty22.setFacultyID((long) 10);
        java.util.ArrayList<java.lang.String> strList26 = faculty22.getCourses();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase27 = new org.team4.functionality.buy.ItemToPurchase(newsletter8, (org.team4.model.user.User) faculty22);
        org.team4.functionality.buy.ProcessPayment processPayment28 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) creditCard3, itemToPurchase27);
        double double29 = itemToPurchase27.getAmount();
        org.team4.model.user.User user30 = itemToPurchase27.getUser();
        org.team4.model.user.User user31 = itemToPurchase27.getUser();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str9, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str10, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str11, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertNotNull(user30);
        org.junit.Assert.assertNotNull(user31);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("", "", "User [email=, password=, name=hi!, type=, validated=false]", "hi!");
        java.lang.String str5 = visitor4.getType();
        visitor4.setName("Mobile Wallet");
        visitor4.setName("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:43 EDT 2024, dateDue=Wed May 01 18:27:43 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.DVD dVD3 = dVDBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder5 = dVDBuilder0.genre("User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVD3);
        org.junit.Assert.assertNotNull(dVDBuilder5);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("PayPal", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:56 EDT 2024, dateDue=Wed May 01 18:27:56 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:50 EDT 2024, dateDue=Wed May 01 18:27:50 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", true);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        dVD1.setQuantity((int) (short) 1);
        int int7 = dVD1.getQuantity();
        double double8 = dVD1.getDuration();
        double double9 = dVD1.getPrice();
        java.lang.String str10 = dVD1.getGenre();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder11 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder13 = bookRequestBuilder11.email("ItemPurchased{title='', email='', datePurchased=null}");
        boolean boolean14 = dVD1.equals((java.lang.Object) "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(bookRequestBuilder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "", "ItemPurchased{title='Credit Card', email='Debit Card', datePurchased=Mon Apr 01 18:27:47 EDT 2024}", "User [email=, password=, name=hi!, type=, validated=false]", (long) (short) 1);
        manager5.setType("User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:45 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=Wed May 01 18:27:45 EDT 2024}, validated=false]");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.course.CourseTextBook courseTextBook7 = courseTextBookBuilder6.build();
        boolean boolean8 = courseTextBook7.isPurchasable();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(courseTextBook7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str3 = subscribeNewsletter2.getTitle();
        java.lang.String str4 = subscribeNewsletter2.toString();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter11 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str12 = subscribeNewsletter11.getEmail();
        java.util.Date date13 = subscribeNewsletter11.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter16 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str17 = subscribeNewsletter16.getEmail();
        java.util.Date date18 = subscribeNewsletter16.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter19 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date13, date18);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter24 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str25 = subscribeNewsletter24.getEmail();
        java.util.Date date26 = subscribeNewsletter24.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter29 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str30 = subscribeNewsletter29.getEmail();
        java.util.Date date31 = subscribeNewsletter29.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter32 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date26, date31);
        org.team4.model.items.RentedItem rentedItem33 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=null}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date13, date26);
        subscribeNewsletter2.setDateDue(date26);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter39 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str40 = subscribeNewsletter39.getEmail();
        java.util.Date date41 = subscribeNewsletter39.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter44 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str45 = subscribeNewsletter44.getEmail();
        java.util.Date date46 = subscribeNewsletter44.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter47 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date41, date46);
        subscribeNewsletter2.setDateDue(date41);
        subscribeNewsletter2.setTitle("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=null}");
        java.lang.String str51 = subscribeNewsletter2.getTitle();
        subscribeNewsletter2.setEmail("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:51 EDT 2024, dateDue=null}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:56 EDT 2024, dateDue=Wed May 01 18:27:56 EDT 2024}" + "'", str4, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:56 EDT 2024, dateDue=Wed May 01 18:27:56 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(date26);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(date41);
// flaky:         org.junit.Assert.assertEquals(date41.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(date46);
// flaky:         org.junit.Assert.assertEquals(date46.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=null}" + "'", str51, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=null}");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter4 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter4.setTitle("");
        java.util.Date date7 = subscribeNewsletter4.getDateSubscribed();
        org.team4.functionality.buy.ItemPurchased itemPurchased8 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:54 EDT 2024, dateDue=Wed May 01 18:27:54 EDT 2024}", "User [email=SubscribeNewsletter{title='ItemPurchased{title='', email='', datePurchased=null}', email='hi!', dateSubscribed=Wed May 01 18:27:52 EDT 2024, dateDue=Wed May 01 18:27:52 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}, name=, type=hi!, validated=false]", date7);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Apr 01 18:27:56 EDT 2024");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("SubscribeNewsletter{title='hi!', email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', dateSubscribed=Mon Apr 01 18:27:54 EDT 2024, dateDue=Wed May 01 18:27:54 EDT 2024}", "SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:47 EDT 2024, dateDue=Wed May 01 18:27:47 EDT 2024}");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.team4.functionality.buy.ItemPurchased itemPurchased2 = new org.team4.functionality.buy.ItemPurchased("Credit Card", "Debit Card");
        java.util.Date date3 = itemPurchased2.getDatePurchased();
        java.lang.String str4 = itemPurchased2.getTitle();
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Mon Apr 01 18:27:57 EDT 2024");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credit Card" + "'", str4, "Credit Card");
    }
}
