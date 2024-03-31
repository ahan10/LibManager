package org.team4.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        java.lang.String str4 = magazine3.getPublisher();
        int int5 = magazine3.getIssueNumber();
        boolean boolean6 = magazine3.isPurchasable();
        magazine3.setRentable(false);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.ISBN("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder0.genre("");
        org.team4.model.items.builder.DVDBuilder dVDBuilder8 = dVDBuilder0.duration((double) (-1.0f));
        org.team4.model.items.builder.DVDBuilder dVDBuilder10 = dVDBuilder0.genre("User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, type=PayPal, validated=true]");
        org.team4.model.items.DVD dVD11 = dVDBuilder10.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder13 = dVDBuilder10.duration((double) 1L);
        org.team4.model.items.builder.DVDBuilder dVDBuilder15 = dVDBuilder10.duration((double) 5890207L);
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDBuilder8);
        org.junit.Assert.assertNotNull(dVDBuilder10);
        org.junit.Assert.assertNotNull(dVD11);
        org.junit.Assert.assertNotNull(dVDBuilder13);
        org.junit.Assert.assertNotNull(dVDBuilder15);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.team4.model.user.User user4 = new org.team4.model.user.User("", "hi!", "PayPal", "");
        user4.setEmail("SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}', email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', dateSubscribed=Sat Mar 30 20:32:00 EDT 2024, dateDue=Tue Apr 30 20:32:00 EDT 2024}");
        user4.setType("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:19 EDT 2024, dateDue=Tue Apr 30 20:32:19 EDT 2024}");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", (double) 9216180L);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        java.lang.String str29 = book9.getISBN();
        org.team4.model.items.Book book37 = new org.team4.model.items.Book((org.team4.model.items.Item) book9, "SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:02 EDT 2024, dateDue=Tue Apr 30 20:32:02 EDT 2024}', email='User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}, password=, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}, type=PayPal, validated=false]', dateSubscribed=Tue Apr 30 20:32:18 EDT 2024, dateDue=null}", (int) (short) 0, "SubscribeNewsletter{title='Debit Card', email='hi!', dateSubscribed=Sat Mar 30 20:32:04 EDT 2024, dateDue=Tue Apr 30 20:32:04 EDT 2024}", "SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Sat Mar 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}", (int) '4', false, false);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder38 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder40 = courseTextBookBuilder38.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder42 = courseTextBookBuilder38.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder44 = courseTextBookBuilder38.isVirtual(true);
        org.team4.model.items.Book book45 = courseTextBookBuilder44.build();
        int int46 = book45.getNoOfPages();
        int int47 = book45.getQuantity();
        boolean boolean48 = book37.equals((java.lang.Object) book45);
        org.team4.model.items.DVD dVD51 = new org.team4.model.items.DVD((org.team4.model.items.Item) book45, "User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}, password=, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}, type=PayPal, validated=false]", (double) (short) 10);
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(bookBuilder40);
        org.junit.Assert.assertNotNull(bookItemBuilder42);
        org.junit.Assert.assertNotNull(courseTextBookBuilder44);
        org.junit.Assert.assertNotNull(book45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.title("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.title("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder3.email("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder9 = bookRequestBuilder7.booktype("SubscribeNewsletter{title='PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:15 EDT 2024, dateDue=Tue Apr 30 20:32:15 EDT 2024}");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
        org.junit.Assert.assertNotNull(bookRequestBuilder9);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
        java.util.Date date27 = null;
        java.util.Date date28 = null;
        org.team4.model.course.Course course31 = new org.team4.model.course.Course("", date27, date28, "", "hi!");
        java.lang.String str32 = course31.getProfessorEmail();
        org.team4.model.course.CourseTextBook courseTextBook34 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) dVD1, "hi!", 1, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", (int) (byte) 100, course31, true);
        double double35 = dVD1.getDuration();
        dVD1.setPurchaseable(true);
        int int38 = dVD1.getYearPublished();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        java.util.List<org.team4.model.user.Student> studentList32 = courseTextBook8.getStudentsWithCopies();
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
        org.junit.Assert.assertNotNull(studentList32);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("Credit Card", "PayPal", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "User [email=, password=, name=hi!, type=, validated=false]", true);
        long long6 = faculty5.getFacultyID();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        boolean boolean2 = payPal1.isValid();
        boolean boolean3 = payPal1.isValid();
        java.lang.String str4 = payPal1.getMode();
        boolean boolean5 = payPal1.isValid();
        java.lang.String str6 = payPal1.getMode();
        boolean boolean7 = payPal1.isValid();
        java.lang.String str8 = payPal1.toString();
        java.lang.String str9 = payPal1.getMode();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Mobile Wallet" + "'", str4, "Mobile Wallet");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Mobile Wallet" + "'", str6, "Mobile Wallet");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}" + "'", str8, "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Mobile Wallet" + "'", str9, "Mobile Wallet");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("SubscribeNewsletter{title='User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]', email='hi!', dateSubscribed=Sat Mar 30 20:32:20 EDT 2024, dateDue=Tue Apr 30 20:32:20 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:08 EDT 2024, dateDue=Tue Apr 30 20:32:08 EDT 2024}", "Debit Card", "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:32:05 EDT 2024}", 0, "ItemPurchased{title='User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}', datePurchased=Tue Apr 30 20:32:11 EDT 2024}");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.DVD dVD10 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Credit Card", 0.0d);
        int int11 = book7.getNoOfPages();
        boolean boolean12 = book7.hasHardCopy();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator13 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) book7);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator14 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) book7);
        boolean boolean15 = book7.hasHardCopy();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        org.team4.model.items.builder.BookBuilder bookBuilder19 = courseTextBookBuilder13.genre("SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Sat Mar 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder21 = courseTextBookBuilder13.isVirtual(true);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder23 = courseTextBookBuilder21.isVirtual(false);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(courseTextBookBuilder10);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(courseTextBookBuilder13);
        org.junit.Assert.assertNotNull(bookBuilder15);
        org.junit.Assert.assertNotNull(bookItemBuilder17);
        org.junit.Assert.assertNotNull(bookBuilder19);
        org.junit.Assert.assertNotNull(courseTextBookBuilder21);
        org.junit.Assert.assertNotNull(courseTextBookBuilder23);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        int int69 = book7.getNoOfPages();
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
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
        java.util.Date date61 = null;
        rentedItem59.setRentDate(date61);
        rentedItem59.setISBN("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        java.util.Date date65 = null;
        rentedItem59.setRentDate(date65);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Apr 30 20:32:20 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Tue Apr 30 20:32:20 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 20:32:20 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 20:32:20 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 20:32:20 EDT 2024");
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Tue Apr 30 20:32:20 EDT 2024");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str60, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.title("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.title("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder3.email("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder9 = bookRequestBuilder3.ISBN("ProcessPayment{modes=null, itemToPurchase=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}}");
        org.team4.model.items.BookRequest bookRequest10 = bookRequestBuilder9.build();
        java.lang.String str11 = bookRequest10.getISBN();
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
        org.junit.Assert.assertNotNull(bookRequestBuilder9);
        org.junit.Assert.assertNotNull(bookRequest10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ProcessPayment{modes=null, itemToPurchase=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}}" + "'", str11, "ProcessPayment{modes=null, itemToPurchase=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}}");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.yearPublished((int) (short) 0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineBuilder0.quantity((int) (short) 1);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder10 = magazineBuilder0.publisher("User [email=, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=PayPal, validated=false]");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder12 = magazineBuilder0.title("PayPal{email='SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:31:55 EDT 2024, dateDue=Tue Apr 30 20:31:55 EDT 2024}'}");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder14 = magazineBuilder0.publisher("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:15 EDT 2024, dateDue=Tue Apr 30 20:32:15 EDT 2024}");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
        org.junit.Assert.assertNotNull(magazineBuilder10);
        org.junit.Assert.assertNotNull(magazineItemBuilder12);
        org.junit.Assert.assertNotNull(magazineBuilder14);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
        rentedItem59.setISBN("Credit Card");
        rentedItem59.setISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}");
        rentedItem59.setTitle("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Apr 30 20:32:20 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Tue Apr 30 20:32:20 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 20:32:20 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 20:32:20 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 20:32:20 EDT 2024");
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Tue Apr 30 20:32:20 EDT 2024");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str60, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("User [email=User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=hi!, name=User [email=, password=, name=hi!, type=, validated=false], type=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, validated=false], password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:09 EDT 2024, dateDue=Tue Apr 30 20:32:09 EDT 2024}, name=ItemToPurchase{item=null, user=User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false], newsletter=null}, type=ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}, validated=true]", "Credit Card", "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}", "User [email=hi!, password=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, name=User [email=, password=, name=hi!, type=, validated=false], type=, validated=false]", false);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("Mobile Wallet", 1, 1);
        java.lang.String str4 = debitCard3.getMode();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        org.team4.model.items.builder.BookBuilder bookBuilder61 = bookBuilder59.genre("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        org.team4.model.items.builder.BookBuilder bookBuilder63 = bookBuilder59.edition((int) (byte) 0);
        org.team4.model.items.builder.BookBuilder bookBuilder65 = bookBuilder63.publisher("SubscribeNewsletter{title='User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]', email='hi!', dateSubscribed=Sat Mar 30 20:32:20 EDT 2024, dateDue=Tue Apr 30 20:32:20 EDT 2024}");
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
        org.junit.Assert.assertNotNull(bookBuilder61);
        org.junit.Assert.assertNotNull(bookBuilder63);
        org.junit.Assert.assertNotNull(bookBuilder65);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator14 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) courseTextBook8);
        java.util.Date date21 = null;
        java.util.Date date22 = null;
        org.team4.model.course.Course course25 = new org.team4.model.course.Course("hi!", date21, date22, "", "hi!");
        java.util.Date date26 = course25.getEndDate();
        java.util.Date date27 = course25.getStartDate();
        java.lang.String str28 = course25.getProfessorEmail();
        java.util.Date date29 = course25.getEndDate();
        org.team4.model.user.Student student35 = new org.team4.model.user.Student("hi!", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "Mobile Wallet", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}", true);
        course25.enrollStudent(student35);
        java.util.Date date37 = course25.getEndDate();
        org.team4.model.course.CourseTextBook courseTextBook39 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) rentableItemDecorator14, "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:04 EDT 2024, dateDue=Tue Apr 30 20:32:04 EDT 2024}", 1, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "User [email=, password=SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}, name=PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}, type=ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:32:03 EDT 2024}, validated=false]", 0, course25, false);
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
        org.junit.Assert.assertNull(date26);
        org.junit.Assert.assertNull(date27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNull(date29);
        org.junit.Assert.assertNull(date37);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.quantity((int) (short) 100);
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder11 = courseTextBookBuilder0.author("Debit Card");
        java.util.Date date13 = null;
        java.util.Date date14 = null;
        org.team4.model.course.Course course17 = new org.team4.model.course.Course("hi!", date13, date14, "", "hi!");
        org.team4.model.user.Student student22 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str23 = student22.getType();
        course17.enrollStudent(student22);
        java.lang.String str25 = course17.getCourseName();
        java.lang.String str26 = course17.getCourseTextBookISBN();
        org.team4.model.user.Student student31 = new org.team4.model.user.Student("", "", "PayPal", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        boolean boolean32 = course17.isEnrolled(student31);
        java.util.Date date34 = null;
        java.util.Date date35 = null;
        org.team4.model.course.Course course38 = new org.team4.model.course.Course("hi!", date34, date35, "", "hi!");
        java.util.Date date39 = course38.getEndDate();
        java.lang.String str40 = course38.getProfessorEmail();
        java.lang.String str41 = course38.getProfessorEmail();
        org.team4.model.user.Student student46 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean47 = course38.isEnrolled(student46);
        course17.enrollStudent(student46);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder49 = courseTextBookBuilder0.course(course17);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder51 = courseTextBookBuilder49.yearPublished(52);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder53 = bookItemBuilder51.price((double) 4483964L);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(courseTextBook9);
        org.junit.Assert.assertNotNull(bookBuilder11);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(date39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(courseTextBookBuilder49);
        org.junit.Assert.assertNotNull(bookItemBuilder51);
        org.junit.Assert.assertNotNull(bookItemBuilder53);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.author("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder0.title("Mobile Wallet");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder5.ISBN("PayPal{email='SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:31:55 EDT 2024, dateDue=Tue Apr 30 20:31:55 EDT 2024}'}");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        java.lang.String str4 = magazine3.getPublisher();
        int int5 = magazine3.getYearPublished();
        int int6 = magazine3.getIssueNumber();
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder10 = courseTextBookBuilder0.isVirtual(false);
        org.team4.model.items.builder.BookBuilder bookBuilder12 = courseTextBookBuilder0.hasHardCopy(false);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder14 = bookBuilder12.quantity((int) (byte) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder16 = bookBuilder12.price((double) 97);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(courseTextBookBuilder10);
        org.junit.Assert.assertNotNull(bookBuilder12);
        org.junit.Assert.assertNotNull(bookItemBuilder14);
        org.junit.Assert.assertNotNull(bookItemBuilder16);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
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
        java.lang.String str86 = rentedItem59.getISBN();
        java.lang.String str87 = rentedItem59.getISBN();
        rentedItem59.setTitle("Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
        java.util.Date date90 = rentedItem59.getRentDate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Apr 30 20:32:20 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Tue Apr 30 20:32:20 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 20:32:20 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 20:32:20 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 20:32:20 EDT 2024");
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Tue Apr 30 20:32:20 EDT 2024");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str60, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(date73);
// flaky:         org.junit.Assert.assertEquals(date73.toString(), "Tue Apr 30 20:32:20 EDT 2024");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertNotNull(date83);
// flaky:         org.junit.Assert.assertEquals(date83.toString(), "Tue Apr 30 20:32:20 EDT 2024");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str86, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str87, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(date90);
// flaky:         org.junit.Assert.assertEquals(date90.toString(), "Tue Apr 30 20:32:20 EDT 2024");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter3 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter3.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter9 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str10 = subscribeNewsletter9.getTitle();
        java.util.Date date11 = null;
        subscribeNewsletter9.setDateSubscribed(date11);
        java.util.Date date13 = subscribeNewsletter9.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter18 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str19 = subscribeNewsletter18.getEmail();
        java.util.Date date20 = subscribeNewsletter18.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter23 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str24 = subscribeNewsletter23.getEmail();
        java.util.Date date25 = subscribeNewsletter23.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter26 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date20, date25);
        org.team4.model.course.Course course29 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date13, date25, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        subscribeNewsletter3.setDateSubscribed(date13);
        java.util.Date date31 = subscribeNewsletter3.getDateDue();
        java.util.Date date32 = null;
        org.team4.model.course.Course course35 = new org.team4.model.course.Course("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:08 EDT 2024, dateDue=Tue Apr 30 20:32:08 EDT 2024}", date31, date32, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}");
        java.util.Date date36 = course35.getStartDate();
        org.team4.model.items.Newsletter newsletter40 = new org.team4.model.items.Newsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:08 EDT 2024, dateDue=Tue Apr 30 20:32:08 EDT 2024}", "SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Sat Mar 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}", 997429.0d);
        org.team4.model.user.Student student46 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str47 = student46.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase48 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student46);
        java.lang.String str49 = student46.toString();
        java.lang.String str50 = student46.getEmail();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase51 = new org.team4.functionality.buy.ItemToPurchase(newsletter40, (org.team4.model.user.User) student46);
        boolean boolean52 = course35.isEnrolled(student46);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Tue Apr 30 20:32:20 EDT 2024");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Tue Apr 30 20:32:20 EDT 2024");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Tue Apr 30 20:32:20 EDT 2024");
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Tue Apr 30 20:32:20 EDT 2024");
        org.junit.Assert.assertNotNull(date36);
// flaky:         org.junit.Assert.assertEquals(date36.toString(), "Tue Apr 30 20:32:20 EDT 2024");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str49, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.team4.model.user.Manager manager4 = new org.team4.model.user.Manager("ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:32:07 EDT 2024}", "SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}', email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', dateSubscribed=Sat Mar 30 20:32:00 EDT 2024, dateDue=Tue Apr 30 20:32:00 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}}", "ItemToPurchase{item=Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}, user=User [email=, password=, name=hi!, type=hi!, validated=false], newsletter=null}");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
        org.team4.model.items.builder.BookBuilder bookBuilder21 = courseTextBookBuilder19.hasHardCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder23 = bookBuilder21.noOfPages((int) (short) 100);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(courseTextBookBuilder19);
        org.junit.Assert.assertNotNull(bookBuilder21);
        org.junit.Assert.assertNotNull(bookBuilder23);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
        org.team4.model.items.builder.BookBuilder bookBuilder19 = courseTextBookBuilder13.genre("SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Sat Mar 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder21 = courseTextBookBuilder13.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder23 = courseTextBookBuilder21.price((double) 8997383L);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(courseTextBookBuilder10);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(courseTextBookBuilder13);
        org.junit.Assert.assertNotNull(bookBuilder15);
        org.junit.Assert.assertNotNull(bookItemBuilder17);
        org.junit.Assert.assertNotNull(bookBuilder19);
        org.junit.Assert.assertNotNull(courseTextBookBuilder21);
        org.junit.Assert.assertNotNull(bookItemBuilder23);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.yearPublished((int) (short) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder8 = magazineBuilder0.issueNumber(100);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder10 = magazineBuilder8.publisher("Debit Card");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder12 = magazineBuilder8.title("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder14 = magazineBuilder8.issueNumber(10);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder16 = magazineBuilder8.issueNumber((int) (byte) 1);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineBuilder8);
        org.junit.Assert.assertNotNull(magazineBuilder10);
        org.junit.Assert.assertNotNull(magazineItemBuilder12);
        org.junit.Assert.assertNotNull(magazineBuilder14);
        org.junit.Assert.assertNotNull(magazineBuilder16);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.DVD dVD10 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Credit Card", 0.0d);
        book7.setPurchaseable(false);
        java.lang.String str13 = book7.getISBN();
        org.team4.model.items.DVD dVD16 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:08 EDT 2024, dateDue=Tue Apr 30 20:32:08 EDT 2024}", (double) (byte) 1);
        book7.setPrice((double) 657285L);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Sat Mar 30 20:32:11 EDT 2024, dateDue=Tue Apr 30 20:32:11 EDT 2024}", "SubscribeNewsletter{title='PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:14 EDT 2024, dateDue=Tue Apr 30 20:32:14 EDT 2024}", "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='', datePurchased=Sat Mar 30 20:32:07 EDT 2024}", "User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, type=PayPal, validated=true]");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.team4.model.user.Faculty faculty15 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "hi!", "", "", false);
        faculty15.setFacultyID((long) (byte) 1);
        org.team4.model.user.Student student22 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str23 = student22.getType();
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        student22.setCourses(strList26);
        faculty15.setCourses(strList26);
        org.team4.model.user.Faculty faculty30 = new org.team4.model.user.Faculty("ItemPurchased{title='', email='', datePurchased=null}", "", "ItemPurchased{title='', email='', datePurchased=null}", "Credit Card", 3082528L, strList26);
        org.team4.model.user.Faculty faculty31 = new org.team4.model.user.Faculty("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}", "Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", (long) 97, strList26);
        faculty31.setFacultyID(10L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
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
        java.lang.String str21 = course5.getCourseTextBookISBN();
        java.lang.String str22 = course5.getCourseTextBookISBN();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.team4.functionality.buy.ItemPurchased itemPurchased2 = new org.team4.functionality.buy.ItemPurchased("ItemPurchased{title='', email='hi!', datePurchased=null}", "hi!");
        java.lang.String str3 = itemPurchased2.toString();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ItemPurchased{title='ItemPurchased{title='', email='hi!', datePurchased=null}', email='hi!', datePurchased=Sat Mar 30 20:32:21 EDT 2024}" + "'", str3, "ItemPurchased{title='ItemPurchased{title='', email='hi!', datePurchased=null}', email='hi!', datePurchased=Sat Mar 30 20:32:21 EDT 2024}");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.team4.model.user.User user5 = new org.team4.model.user.User("PayPal", "", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ProcessPayment{modes=null, itemToPurchase=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}}", false);
        user5.setPassword("Debit Card");
        user5.setPassword("ItemPurchased{title='', email='hi!', datePurchased=null}");
        java.lang.String str10 = user5.getEmail();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PayPal" + "'", str10, "PayPal");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("Credit Card", "SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}', email='hi!', dateSubscribed=null, dateDue=Tue Apr 30 20:32:02 EDT 2024}", "User [email=, password=, name=hi!, type=, validated=false]", "Debit Card", false);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        int int2 = dVD1.getYearPublished();
        double double3 = dVD1.getDuration();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator4 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) dVD1);
        org.team4.model.items.Item item5 = purchasableItemDecorator4.getItem();
        org.team4.model.items.Item item6 = purchasableItemDecorator4.getItem();
        org.team4.model.items.DVD dVD9 = new org.team4.model.items.DVD((org.team4.model.items.Item) purchasableItemDecorator4, "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", (double) '#');
        org.team4.model.items.decorator.ItemDecorator itemDecorator10 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) purchasableItemDecorator4);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(item5);
        org.junit.Assert.assertNotNull(item6);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        java.util.Date date2 = null;
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("", "", date2);
        java.lang.String str4 = itemPurchased3.getTitle();
        java.util.Date date5 = itemPurchased3.getDatePurchased();
        java.lang.String str6 = itemPurchased3.getTitle();
        java.lang.String str7 = itemPurchased3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.price((double) (byte) 1);
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
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder33 = courseTextBookBuilder6.course(course32);
        org.team4.model.course.CourseTextBook courseTextBook34 = courseTextBookBuilder6.build();
        java.lang.String str35 = courseTextBook34.getAuthor();
        org.team4.model.user.Student student44 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str45 = student44.getType();
        org.team4.model.user.Student student50 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str51 = student50.getType();
        java.lang.String[] strArray53 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        student50.setCourses(strList54);
        student44.setCourses(strList54);
        org.team4.model.user.Student student58 = new org.team4.model.user.Student("User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, type=PayPal, validated=true]", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}", strList54);
        courseTextBook34.makeCopies(student58);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertNotNull(courseTextBookBuilder33);
        org.junit.Assert.assertNotNull(courseTextBook34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='', datePurchased=Sat Mar 30 20:32:07 EDT 2024}", (int) (short) 0, (int) ' ', 10.0d, "PayPal{email='SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}'}", false, true);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("ProcessPayment{modes=null, itemToPurchase=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}}", "User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, type=PayPal, validated=true]", "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}}", false);
        org.team4.model.user.Student student10 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str11 = student10.getType();
        org.team4.model.user.Student student16 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str17 = student16.getType();
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        student16.setCourses(strList20);
        student10.setCourses(strList20);
        org.team4.model.user.Student student43 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str44 = student43.getType();
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        student43.setCourses(strList47);
        org.team4.model.user.Faculty faculty50 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", (long) (byte) -1, strList47);
        org.team4.model.user.Faculty faculty51 = new org.team4.model.user.Faculty("hi!", "Credit Card", "", "User [email=, password=, name=hi!, type=, validated=false]", (long) '#', strList47);
        org.team4.model.user.Faculty faculty52 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, type=PayPal, validated=true]", "PayPal", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", (long) (-1), strList47);
        student10.setCourses(strList47);
        faculty5.setCourses(strList47);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.booktype("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder5.ISBN("PayPal");
        org.team4.model.items.BookRequest bookRequest8 = bookRequestBuilder7.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder10 = bookRequestBuilder7.title("Mobile Wallet");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder12 = bookRequestBuilder10.email("ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:32:05 EDT 2024}");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
        org.junit.Assert.assertNotNull(bookRequest8);
        org.junit.Assert.assertNotNull(bookRequestBuilder10);
        org.junit.Assert.assertNotNull(bookRequestBuilder12);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.edition((int) (byte) 0);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = bookBuilder6.publisher("PayPal");
        org.team4.model.items.builder.BookBuilder bookBuilder10 = bookBuilder6.publisher("SubscribeNewsletter{title='User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]', email='hi!', dateSubscribed=Sat Mar 30 20:32:20 EDT 2024, dateDue=Tue Apr 30 20:32:20 EDT 2024}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        java.lang.String str2 = mobileWallet1.getMode();
        java.lang.String str3 = mobileWallet1.getMode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PayPal" + "'", str2, "PayPal");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PayPal" + "'", str3, "PayPal");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.ISBN("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder0.genre("");
        org.team4.model.items.builder.DVDBuilder dVDBuilder8 = dVDBuilder0.duration((double) (-1.0f));
        org.team4.model.items.builder.DVDBuilder dVDBuilder10 = dVDBuilder8.genre("Debit Card");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder12 = dVDBuilder8.title("Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder14 = dVDBuilder8.genre("ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:32:05 EDT 2024}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder16 = dVDBuilder8.duration((double) (-1.0f));
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDBuilder8);
        org.junit.Assert.assertNotNull(dVDBuilder10);
        org.junit.Assert.assertNotNull(dVDItemBuilder12);
        org.junit.Assert.assertNotNull(dVDBuilder14);
        org.junit.Assert.assertNotNull(dVDBuilder16);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
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
        java.lang.String str13 = item12.getTitle();
        int int14 = item12.getYearPublished();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("User [email=, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=PayPal, validated=false]", (int) '#', (int) (short) 10);
        org.team4.model.user.Student student9 = new org.team4.model.user.Student("", "", "hi!", "");
        student9.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase12 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student9);
        org.team4.functionality.buy.ProcessPayment processPayment13 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) debitCard3, itemToPurchase12);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:05 EDT 2024, dateDue=Tue Apr 30 20:32:05 EDT 2024}");
        java.lang.String str2 = payPal1.toString();
        boolean boolean3 = payPal1.isValid();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PayPal{email='SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:05 EDT 2024, dateDue=Tue Apr 30 20:32:05 EDT 2024}'}" + "'", str2, "PayPal{email='SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:05 EDT 2024, dateDue=Tue Apr 30 20:32:05 EDT 2024}'}");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "User [email=, password=, name=hi!, type=, validated=false]", "ItemPurchased{title='', email='', datePurchased=null}", "");
        nonFaculty4.setValidated(false);
        java.lang.String str7 = nonFaculty4.getType();
        boolean boolean8 = nonFaculty4.isValidated();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder3 = dVDBuilder0.genre("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder5 = dVDBuilder0.yearPublished((int) 'a');
        org.team4.model.items.builder.DVDBuilder dVDBuilder7 = dVDBuilder0.duration((double) 0.0f);
        org.team4.model.items.builder.DVDBuilder dVDBuilder9 = dVDBuilder7.genre("Debit Card");
        org.team4.model.items.builder.DVDBuilder dVDBuilder11 = dVDBuilder7.genre("SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Sat Mar 30 20:32:09 EDT 2024, dateDue=Tue Apr 30 20:32:09 EDT 2024}");
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNotNull(dVDBuilder3);
        org.junit.Assert.assertNotNull(dVDItemBuilder5);
        org.junit.Assert.assertNotNull(dVDBuilder7);
        org.junit.Assert.assertNotNull(dVDBuilder9);
        org.junit.Assert.assertNotNull(dVDBuilder11);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.team4.model.user.Manager manager4 = new org.team4.model.user.Manager("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:59 EDT 2024, dateDue=Tue Apr 30 20:31:59 EDT 2024}", "User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}, password=, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}, type=PayPal, validated=false]", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:05 EDT 2024, dateDue=Tue Apr 30 20:32:05 EDT 2024}");
        manager4.setManagerID(4625844L);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder6.author("Credit Card");
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder6.edition((int) ' ');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = bookBuilder10.ISBN("SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder14 = bookBuilder10.title("");
        org.team4.model.items.builder.BookBuilder bookBuilder16 = bookBuilder10.edition((int) (short) -1);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(bookItemBuilder12);
        org.junit.Assert.assertNotNull(bookItemBuilder14);
        org.junit.Assert.assertNotNull(bookBuilder16);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        java.lang.String str2 = bookRequest1.getTitle();
        int int3 = bookRequest1.getEdition();
        java.lang.String str4 = bookRequest1.getEmail();
        java.lang.String str5 = bookRequest1.getISBN();
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter2.setEmail("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        subscribeNewsletter2.setTitle("hi!");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter9 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date10 = null;
        subscribeNewsletter9.setDateSubscribed(date10);
        java.lang.String str12 = subscribeNewsletter9.getTitle();
        java.util.Date date13 = subscribeNewsletter9.getDateDue();
        java.util.Date date14 = subscribeNewsletter9.getDateSubscribed();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter19 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date20 = null;
        subscribeNewsletter19.setDateSubscribed(date20);
        java.util.Date date22 = subscribeNewsletter19.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter27 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str28 = subscribeNewsletter27.getEmail();
        java.util.Date date29 = subscribeNewsletter27.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter32 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str33 = subscribeNewsletter32.getTitle();
        java.util.Date date34 = null;
        subscribeNewsletter32.setDateSubscribed(date34);
        java.util.Date date36 = subscribeNewsletter32.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter37 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "", date29, date36);
        subscribeNewsletter19.setDateSubscribed(date36);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter41 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter41.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter41.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter48 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date49 = null;
        subscribeNewsletter48.setDateSubscribed(date49);
        java.util.Date date51 = subscribeNewsletter48.getDateDue();
        subscribeNewsletter41.setDateDue(date51);
        org.team4.model.course.Course course55 = new org.team4.model.course.Course("", date36, date51, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "");
        java.util.Date date56 = null;
        org.team4.model.course.Course course59 = new org.team4.model.course.Course("Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date51, date56, "SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}', email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', dateSubscribed=Sat Mar 30 20:32:00 EDT 2024, dateDue=Tue Apr 30 20:32:00 EDT 2024}", "PayPal");
        subscribeNewsletter9.setDateSubscribed(date51);
        subscribeNewsletter2.setDateDue(date51);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(date36);
// flaky:         org.junit.Assert.assertEquals(date36.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertNotNull(date51);
// flaky:         org.junit.Assert.assertEquals(date51.toString(), "Tue Apr 30 20:32:21 EDT 2024");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook8 = courseTextBookBuilder6.build();
        java.util.List<org.team4.model.user.Student> studentList9 = courseTextBook8.getStudentsWithCopies();
        int int10 = courseTextBook8.getNoOfPages();
        org.team4.model.items.decorator.ItemDecorator itemDecorator11 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook8);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertNotNull(studentList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        java.util.Date date27 = null;
        java.util.Date date28 = null;
        org.team4.model.course.Course course31 = new org.team4.model.course.Course("", date27, date28, "", "hi!");
        java.lang.String str32 = course31.getProfessorEmail();
        org.team4.model.course.CourseTextBook courseTextBook34 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) dVD1, "hi!", 1, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", (int) (byte) 100, course31, true);
        double double35 = dVD1.getDuration();
        dVD1.setPurchaseable(true);
        org.team4.model.items.Item item38 = new org.team4.model.items.Item((org.team4.model.items.Item) dVD1);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        java.util.ArrayList<java.lang.String> strList5 = org.team4.model.paymentmodes.PaymentModes.MODE;
        org.team4.model.user.Faculty faculty6 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "ItemPurchased{title='', email='', datePurchased=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", 1232147L, strList5);
        faculty6.setFacultyID((long) (short) 10);
        java.lang.String str9 = faculty6.getName();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str9, "ItemPurchased{title='', email='', datePurchased=null}");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("Mobile Wallet", 0, (int) (short) 0, 10.0d, "SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Sat Mar 30 20:32:09 EDT 2024, dateDue=Tue Apr 30 20:32:09 EDT 2024}", true, true);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        java.util.ArrayList<java.lang.String> strList4 = null;
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "User [email=hi!, password=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, name=User [email=, password=, name=hi!, type=, validated=false], type=, validated=false]", "PayPal{email='SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:05 EDT 2024, dateDue=Tue Apr 30 20:32:05 EDT 2024}'}", "User [email=hi!, password=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, name=User [email=, password=, name=hi!, type=, validated=false], type=, validated=false]", strList4);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.paymentmodes.DebitCard debitCard15 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete16 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) debitCard15);
        boolean boolean17 = debitCard15.notExpired();
        boolean boolean18 = debitCard15.notExpired();
        java.lang.String str19 = debitCard15.getMode();
        boolean boolean20 = debitCard15.notExpired();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Debit Card" + "'", str19, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        long long30 = manager23.getManagerID();
        java.lang.String str31 = manager23.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(dVD6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "User [email=, password=, name=hi!, type=hi!, validated=false]" + "'", str31, "User [email=, password=, name=hi!, type=hi!, validated=false]");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "Debit Card", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}", "User [email=, password=, name=hi!, type=, validated=false]", 52, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        java.lang.String str7 = bookRequest6.getTitle();
        java.lang.String str8 = bookRequest6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Debit Card" + "'", str7, "Debit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:08 EDT 2024, dateDue=Tue Apr 30 20:32:08 EDT 2024}", (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:08 EDT 2024, dateDue=Tue Apr 30 20:32:08 EDT 2024}", "User [email=ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}, validated=false]", (double) (-1.0f));
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
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
        boolean boolean27 = creditCard10.isValid();
        boolean boolean28 = creditCard10.notExpired();
        java.lang.String str29 = creditCard10.getMode();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Credit Card" + "'", str12, "Credit Card");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(newsletter21);
        org.junit.Assert.assertNotNull(user25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Credit Card" + "'", str29, "Credit Card");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        boolean boolean8 = book7.hasHardCopy();
        boolean boolean9 = book7.hasSoftCopy();
        java.lang.String str10 = book7.toString();
        book7.setRentable(false);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator13 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book7);
        org.team4.model.items.Newsletter newsletter17 = new org.team4.model.items.Newsletter("", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", 0.0d);
        org.team4.model.user.Manager manager23 = new org.team4.model.user.Manager("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "hi!", "User [email=, password=, name=hi!, type=, validated=false]", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", false);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase24 = new org.team4.functionality.buy.ItemToPurchase(newsletter17, (org.team4.model.user.User) manager23);
        java.lang.String str25 = manager23.getPassword();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase26 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) book7, (org.team4.model.user.User) manager23);
        java.lang.String str27 = itemToPurchase26.toString();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}" + "'", str10, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ItemToPurchase{item=Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}, user=User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=hi!, name=User [email=, password=, name=hi!, type=, validated=false], type=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, validated=false], newsletter=null}" + "'", str27, "ItemToPurchase{item=Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}, user=User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=hi!, name=User [email=, password=, name=hi!, type=, validated=false], type=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, validated=false], newsletter=null}");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
        org.team4.model.course.CourseTextBook courseTextBook58 = courseTextBookBuilder57.build();
        org.team4.model.items.builder.BookBuilder bookBuilder60 = courseTextBookBuilder57.hasSoftCopy(false);
        org.team4.model.items.builder.BookBuilder bookBuilder62 = bookBuilder60.edition((int) ' ');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder64 = bookBuilder60.price((double) 7079260L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder66 = bookItemBuilder64.title("SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:05 EDT 2024, dateDue=Tue Apr 30 20:32:05 EDT 2024}");
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
        org.junit.Assert.assertNotNull(courseTextBook58);
        org.junit.Assert.assertNotNull(bookBuilder60);
        org.junit.Assert.assertNotNull(bookBuilder62);
        org.junit.Assert.assertNotNull(bookItemBuilder64);
        org.junit.Assert.assertNotNull(bookItemBuilder66);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}");
        org.team4.model.items.Book book5 = courseTextBookBuilder0.build();
        org.team4.model.course.CourseTextBook courseTextBook6 = courseTextBookBuilder0.build();
        org.team4.model.course.CourseTextBook courseTextBook7 = courseTextBookBuilder0.build();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(courseTextBook6);
        org.junit.Assert.assertNotNull(courseTextBook7);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.booktype("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder5.ISBN("PayPal");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder9 = bookRequestBuilder5.edition((int) (byte) 100);
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder11 = bookRequestBuilder9.ISBN("SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:15 EDT 2024, dateDue=Tue Apr 30 20:32:15 EDT 2024}");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
        org.junit.Assert.assertNotNull(bookRequestBuilder9);
        org.junit.Assert.assertNotNull(bookRequestBuilder11);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:19 EDT 2024, dateDue=Tue Apr 30 20:32:19 EDT 2024}", "SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:05 EDT 2024, dateDue=Tue Apr 30 20:32:05 EDT 2024}", (double) 9216180L);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.team4.model.user.Manager manager6 = new org.team4.model.user.Manager("", "", "", "hi!", false);
        manager6.setName("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        manager6.setName("User [email=, password=, name=hi!, type=, validated=false]");
        long long11 = manager6.getManagerID();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase12 = new org.team4.functionality.buy.ItemToPurchase((double) 1L, (org.team4.model.user.User) manager6);
        org.team4.model.items.Item item13 = itemToPurchase12.getItem();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
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
        org.team4.model.course.Course course19 = null;
        org.team4.model.course.CourseTextBook courseTextBook21 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) purchasableItemDecorator13, "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='', datePurchased=Sat Mar 30 20:32:07 EDT 2024}", (int) (short) 10, "PayPal{email='SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:05 EDT 2024, dateDue=Tue Apr 30 20:32:05 EDT 2024}'}", "User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=hi!, name=User [email=, password=, name=hi!, type=, validated=false], type=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, validated=false]", 0, course19, false);
        int int22 = courseTextBook21.getEdition();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertNotNull(item12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.user.User user12 = itemToPurchase7.getUser();
        org.team4.model.user.User user13 = itemToPurchase7.getUser();
        org.team4.model.user.User user14 = itemToPurchase7.getUser();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user14);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder6 = magazineBuilder4.issueNumber(32);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineBuilder6.title("ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder10 = magazineItemBuilder8.ISBN("User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
        org.junit.Assert.assertNotNull(magazineItemBuilder10);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
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
        java.util.Date date40 = subscribeNewsletter2.getDateSubscribed();
        subscribeNewsletter2.setTitle("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        java.lang.String str43 = subscribeNewsletter2.toString();
        java.util.Date date44 = subscribeNewsletter2.getDateDue();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertNotNull(date36);
// flaky:         org.junit.Assert.assertEquals(date36.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertNotNull(date40);
// flaky:         org.junit.Assert.assertEquals(date40.toString(), "Tue Apr 30 20:32:21 EDT 2024");
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "SubscribeNewsletter{title='PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:21 EDT 2024, dateDue=Tue Apr 30 20:32:21 EDT 2024}" + "'", str43, "SubscribeNewsletter{title='PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:21 EDT 2024, dateDue=Tue Apr 30 20:32:21 EDT 2024}");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Tue Apr 30 20:32:21 EDT 2024");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("User [email=, password=, name=hi!, type=, validated=false]");
        java.lang.String str2 = payPal1.toString();
        java.lang.String str3 = payPal1.getMode();
        java.lang.String str4 = payPal1.toString();
        java.lang.String str5 = payPal1.toString();
        java.lang.String str6 = payPal1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str2, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Mobile Wallet" + "'", str3, "Mobile Wallet");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str4, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str5, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str6, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:32:05 EDT 2024}", "SubscribeNewsletter{title='PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:21 EDT 2024, dateDue=Tue Apr 30 20:32:21 EDT 2024}", "SubscribeNewsletter{title='PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:14 EDT 2024, dateDue=Tue Apr 30 20:32:14 EDT 2024}", "Debit Card", false);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.team4.model.user.UserFactory userFactory0 = new org.team4.model.user.UserFactory();
        org.team4.model.user.User user6 = userFactory0.getUser("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", false);
        org.team4.model.user.User user12 = userFactory0.getUser("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal", true);
        org.team4.model.user.User user18 = userFactory0.getUser("SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:59 EDT 2024, dateDue=Tue Apr 30 20:31:59 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}", "ProcessPayment{modes=null, itemToPurchase=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}}", false);
        org.team4.model.user.User user24 = userFactory0.getUser("PayPal", "User [email=ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}, validated=false]", "", "Debit Card", false);
        org.team4.model.user.User user30 = userFactory0.getUser("PayPal{email='SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:05 EDT 2024, dateDue=Tue Apr 30 20:32:05 EDT 2024}'}", "SubscribeNewsletter{title='Debit Card', email='hi!', dateSubscribed=Sat Mar 30 20:32:14 EDT 2024, dateDue=Tue Apr 30 20:32:14 EDT 2024}", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:31:55 EDT 2024, dateDue=Tue Apr 30 20:31:55 EDT 2024}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", false);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(user24);
        org.junit.Assert.assertNull(user30);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
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
        java.util.Date date86 = null;
        rentedItem59.setRentDate(date86);
        java.util.Date date88 = rentedItem59.getDueDate();
        java.lang.String str89 = rentedItem59.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str60, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(date73);
// flaky:         org.junit.Assert.assertEquals(date73.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertNotNull(date83);
// flaky:         org.junit.Assert.assertEquals(date83.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertNotNull(date88);
// flaky:         org.junit.Assert.assertEquals(date88.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str89, "User [email=, password=, name=hi!, type=, validated=false]");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
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
        org.team4.model.user.Student student22 = new org.team4.model.user.Student("Credit Card", "Credit Card", "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemPurchased{title='', email='', datePurchased=null}", true);
        boolean boolean23 = course14.isEnrolled(student22);
        org.team4.model.user.Student student29 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str30 = student29.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase31 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student29);
        boolean boolean32 = course14.isEnrolled(student29);
        java.lang.String str33 = course14.getCourseTextBookISBN();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNotNull(courseTextBookBuilder16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
        boolean boolean32 = courseTextBook8.isRentable();
        boolean boolean33 = courseTextBook8.hasSoftCopy();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.yearPublished((int) (short) 0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineBuilder0.quantity((int) (short) 1);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder10 = magazineBuilder0.publisher("Debit Card");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder12 = magazineBuilder10.title("");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
        org.junit.Assert.assertNotNull(magazineBuilder10);
        org.junit.Assert.assertNotNull(magazineItemBuilder12);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", 0.0d);
        org.team4.model.user.Manager manager9 = new org.team4.model.user.Manager("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "hi!", "User [email=, password=, name=hi!, type=, validated=false]", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", false);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase10 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) manager9);
        double double11 = newsletter3.getPrice();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        org.team4.model.items.Item item11 = rentableItemDecorator10.getItem();
        java.lang.String str12 = rentableItemDecorator10.getISBN();
        rentableItemDecorator10.setRentable(true);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter9 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str10 = subscribeNewsletter9.getTitle();
        java.util.Date date11 = null;
        subscribeNewsletter9.setDateSubscribed(date11);
        java.util.Date date13 = subscribeNewsletter9.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter18 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str19 = subscribeNewsletter18.getEmail();
        java.util.Date date20 = subscribeNewsletter18.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter23 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str24 = subscribeNewsletter23.getEmail();
        java.util.Date date25 = subscribeNewsletter23.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter26 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date20, date25);
        org.team4.model.course.Course course29 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date13, date25, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.functionality.buy.ItemPurchased itemPurchased30 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", date25);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter37 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str38 = subscribeNewsletter37.getEmail();
        java.util.Date date39 = subscribeNewsletter37.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter42 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str43 = subscribeNewsletter42.getEmail();
        java.util.Date date44 = subscribeNewsletter42.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter45 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date39, date44);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter48 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter48.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter48.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter55 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date56 = null;
        subscribeNewsletter55.setDateSubscribed(date56);
        java.util.Date date58 = subscribeNewsletter55.getDateDue();
        subscribeNewsletter48.setDateDue(date58);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter60 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", date44, date58);
        org.team4.model.items.RentedItem rentedItem61 = new org.team4.model.items.RentedItem("User [email=, password=, name=hi!, type=, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date25, date58);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter64 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter64.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter64.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter71 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date72 = null;
        subscribeNewsletter71.setDateSubscribed(date72);
        java.util.Date date74 = subscribeNewsletter71.getDateDue();
        subscribeNewsletter64.setDateDue(date74);
        java.util.Date date76 = subscribeNewsletter64.getDateSubscribed();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter79 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str80 = subscribeNewsletter79.getEmail();
        java.util.Date date81 = subscribeNewsletter79.getDateDue();
        subscribeNewsletter64.setDateSubscribed(date81);
        java.util.Date date83 = subscribeNewsletter64.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter88 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str89 = subscribeNewsletter88.getEmail();
        java.util.Date date90 = subscribeNewsletter88.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter93 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str94 = subscribeNewsletter93.getEmail();
        java.util.Date date95 = subscribeNewsletter93.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter96 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date90, date95);
        subscribeNewsletter64.setDateDue(date90);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter98 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:17 EDT 2024, dateDue=Tue Apr 30 20:32:17 EDT 2024}", "SubscribeNewsletter{title='PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:21 EDT 2024, dateDue=Tue Apr 30 20:32:21 EDT 2024}", date58, date90);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertNotNull(date58);
// flaky:         org.junit.Assert.assertEquals(date58.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertNotNull(date74);
// flaky:         org.junit.Assert.assertEquals(date74.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertNotNull(date76);
// flaky:         org.junit.Assert.assertEquals(date76.toString(), "Sat Mar 30 20:32:21 EDT 2024");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertNotNull(date81);
// flaky:         org.junit.Assert.assertEquals(date81.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertNotNull(date83);
// flaky:         org.junit.Assert.assertEquals(date83.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "hi!" + "'", str89, "hi!");
        org.junit.Assert.assertNotNull(date90);
// flaky:         org.junit.Assert.assertEquals(date90.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "hi!" + "'", str94, "hi!");
        org.junit.Assert.assertNotNull(date95);
// flaky:         org.junit.Assert.assertEquals(date95.toString(), "Tue Apr 30 20:32:21 EDT 2024");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
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
        java.lang.String str65 = course62.getCourseTextBookISBN();
        java.lang.String str66 = course62.getCourseName();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter69 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date70 = null;
        subscribeNewsletter69.setDateSubscribed(date70);
        java.lang.String str72 = subscribeNewsletter69.getTitle();
        java.util.Date date73 = subscribeNewsletter69.getDateDue();
        boolean boolean74 = course62.isStarted(date73);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean75 = course15.isStarted(date73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"date\" is null");
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
        org.junit.Assert.assertNotNull(dVD22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(item32);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(date46);
// flaky:         org.junit.Assert.assertEquals(date46.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(date53);
// flaky:         org.junit.Assert.assertEquals(date53.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(date58);
// flaky:         org.junit.Assert.assertEquals(date58.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str65, "ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str66, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(date73);
// flaky:         org.junit.Assert.assertEquals(date73.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("User [email=, password=, name=hi!, type=, validated=false]", (int) ' ', (int) (byte) 10);
        java.lang.String str4 = debitCard3.getMode();
        boolean boolean5 = debitCard3.notExpired();
        boolean boolean6 = debitCard3.correctLength();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("User [email=, password=, name=hi!, type=hi!, validated=false]", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:02 EDT 2024, dateDue=Tue Apr 30 20:32:02 EDT 2024}", "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:32:05 EDT 2024}", true);
        nonFaculty5.setUniversityID(8224804L);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
        double double21 = dVD1.getDuration();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator22 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) dVD1);
        dVD1.setRentable(false);
        org.team4.model.items.DVD dVD27 = new org.team4.model.items.DVD((org.team4.model.items.Item) dVD1, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:02 EDT 2024, dateDue=Tue Apr 30 20:32:02 EDT 2024}", (double) 1402492L);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
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
        java.util.Date date92 = rentedItem59.getDueDate();
        rentedItem59.setTitle("User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str60, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(date73);
// flaky:         org.junit.Assert.assertEquals(date73.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertNotNull(date82);
// flaky:         org.junit.Assert.assertEquals(date82.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertNotNull(date89);
// flaky:         org.junit.Assert.assertEquals(date89.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertNotNull(date92);
// flaky:         org.junit.Assert.assertEquals(date92.toString(), "Tue Apr 30 20:32:21 EDT 2024");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.email("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.author("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.title("Credit Card");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder6.edition((int) '#');
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("ItemPurchased{title='', email='', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", (double) 0);
        java.lang.String str4 = newsletter3.getTitle();
        double double5 = newsletter3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str4, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getEndDate();
        org.team4.model.user.Student student12 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str13 = student12.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase14 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student12);
        java.lang.String str15 = student12.toString();
        course5.enrollStudent(student12);
        java.util.Date date17 = course5.getEndDate();
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str15, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        int int9 = book7.getQuantity();
        book7.setPrice((double) 100L);
        java.lang.String str12 = book7.getISBN();
        java.lang.String str13 = book7.getGenre();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator14 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) book7);
        org.team4.model.items.decorator.ItemDecorator itemDecorator15 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) book7);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("SubscribeNewsletter{title='Debit Card', email='hi!', dateSubscribed=Sat Mar 30 20:32:14 EDT 2024, dateDue=Tue Apr 30 20:32:14 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:59 EDT 2024, dateDue=Tue Apr 30 20:31:59 EDT 2024}", "User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, type=PayPal, validated=true]", "PayPal{email='SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}'}", false);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.DVD dVD10 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Credit Card", 0.0d);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator11 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD10);
        boolean boolean12 = dVD10.isPurchasable();
        java.lang.String str13 = dVD10.getGenre();
        java.lang.String str14 = dVD10.getGenre();
        int int15 = dVD10.getYearPublished();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Credit Card" + "'", str13, "Credit Card");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Credit Card" + "'", str14, "Credit Card");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        java.lang.String str8 = itemToPurchase7.toString();
        double double9 = itemToPurchase7.getAmount();
        org.team4.model.items.Newsletter newsletter10 = itemToPurchase7.getNewsletter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}" + "'", str8, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNull(newsletter10);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.team4.model.user.Student student9 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str10 = student9.getType();
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        student9.setCourses(strList13);
        org.team4.model.user.Faculty faculty16 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", (long) (byte) -1, strList13);
        java.lang.String str17 = faculty16.getName();
        faculty16.setFacultyID((long) (short) 1);
        java.lang.String[] strArray41 = new java.lang.String[] { "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "PayPal", "ItemPurchased{title='', email='hi!', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemPurchased{title='', email='', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        org.team4.model.user.Faculty faculty44 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "", "ItemPurchased{title='', email='', datePurchased=null}", 0L, strList42);
        org.team4.model.user.Student student45 = new org.team4.model.user.Student("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "Mobile Wallet", "Mobile Wallet", "Debit Card", strList42);
        faculty16.setCourses(strList42);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str17, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "User [email=, password=, name=hi!, type=, validated=false]", (int) (short) 10, "ItemPurchased{title='', email='', datePurchased=null}");
        java.lang.String str7 = bookRequest6.getBookType();
        java.lang.String str8 = bookRequest6.getEmail();
        java.lang.String str9 = bookRequest6.getAuthor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str7, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}" + "'", str8, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}" + "'", str9, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getEndDate();
        java.lang.String str7 = course5.getProfessorEmail();
        java.lang.String str8 = course5.getProfessorEmail();
        org.team4.model.user.Student student13 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean14 = course5.isEnrolled(student13);
        java.lang.String str15 = course5.getCourseTextBookISBN();
        java.lang.String str16 = course5.getCourseTextBookISBN();
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        int int2 = dVD1.getQuantity();
        dVD1.setRentable(true);
        double double5 = dVD1.getDuration();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder5 = magazineBuilder0.ISBN("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder7 = magazineItemBuilder5.yearPublished(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder9 = magazineItemBuilder5.price((double) 1994269L);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertNotNull(magazineItemBuilder5);
        org.junit.Assert.assertNotNull(magazineItemBuilder7);
        org.junit.Assert.assertNotNull(magazineItemBuilder9);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        boolean boolean2 = payPal1.isValid();
        boolean boolean3 = payPal1.isValid();
        java.lang.String str4 = payPal1.getMode();
        boolean boolean5 = payPal1.isValid();
        java.lang.String str6 = payPal1.getMode();
        boolean boolean7 = payPal1.isValid();
        org.team4.model.user.Visitor visitor13 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase14 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor13);
        org.team4.model.paymentmodes.CreditCard creditCard18 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete19 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase14, (org.team4.model.paymentmodes.PaymentValidator) creditCard18);
        org.team4.model.user.User user20 = itemToPurchase14.getUser();
        double double21 = itemToPurchase14.getAmount();
        java.lang.String str22 = itemToPurchase14.toString();
        org.team4.model.user.Student student28 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str29 = student28.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase30 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student28);
        org.team4.model.items.Newsletter newsletter31 = itemToPurchase30.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet33 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete34 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase30, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet33);
        org.team4.model.paymentmodes.DebitCard debitCard38 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete39 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase30, (org.team4.model.paymentmodes.PaymentValidator) debitCard38);
        boolean boolean40 = debitCard38.notExpired();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete41 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase14, (org.team4.model.paymentmodes.PaymentValidator) debitCard38);
        double double42 = itemToPurchase14.getAmount();
        org.team4.functionality.buy.ProcessPayment processPayment43 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) payPal1, itemToPurchase14);
        java.lang.String str44 = itemToPurchase14.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Mobile Wallet" + "'", str4, "Mobile Wallet");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Mobile Wallet" + "'", str6, "Mobile Wallet");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(user20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str22, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(newsletter31);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 1.0d + "'", double42 == 1.0d);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str44, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
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
        int int57 = item56.getQuantity();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 20:32:21 EDT 2024");
        org.junit.Assert.assertNotNull(bookBuilder46);
        org.junit.Assert.assertNotNull(bookItemBuilder48);
        org.junit.Assert.assertNotNull(bookBuilder50);
        org.junit.Assert.assertNotNull(bookItemBuilder52);
        org.junit.Assert.assertNotNull(bookItemBuilder54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 32 + "'", int57 == 32);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.user.User user12 = purchaseComplete11.getUser();
        org.team4.model.items.Item item13 = purchaseComplete11.getItem();
        double double14 = purchaseComplete11.getAmount();
        org.team4.model.items.Item item15 = purchaseComplete11.getItem();
        org.team4.model.user.User user16 = purchaseComplete11.getUser();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(user16);
    }
}
