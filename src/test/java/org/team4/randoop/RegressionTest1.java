package org.team4.randoop;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
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
        book7.setPurchaseable(true);
        boolean boolean10 = book7.hasSoftCopy();
        int int11 = book7.getEdition();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        dVD1.setQuantity((int) (short) 1);
        int int7 = dVD1.getQuantity();
        double double8 = dVD1.getDuration();
        double double9 = dVD1.getPrice();
        org.team4.model.items.Book book17 = new org.team4.model.items.Book((org.team4.model.items.Item) dVD1, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}", 1, "User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]", "User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]", 1, true, true);
        book17.setQuantity((int) (byte) -1);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
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
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder0.build();
        org.team4.functionality.recommendation.AuthorRecommendationStrategy authorRecommendationStrategy10 = new org.team4.functionality.recommendation.AuthorRecommendationStrategy();
        boolean boolean11 = courseTextBook9.equals((java.lang.Object) authorRecommendationStrategy10);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(courseTextBook9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder0.author("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder5.edition((int) (short) -1);
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder9 = bookRequestBuilder7.author("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=null}");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
        org.junit.Assert.assertNotNull(bookRequestBuilder9);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished(10);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder5 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder7 = magazineBuilder5.quantity((int) (short) -1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder9 = magazineItemBuilder7.quantity((int) (short) 0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder11 = magazineItemBuilder9.title("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=null}");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertNotNull(magazineBuilder5);
        org.junit.Assert.assertNotNull(magazineItemBuilder7);
        org.junit.Assert.assertNotNull(magazineItemBuilder9);
        org.junit.Assert.assertNotNull(magazineItemBuilder11);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}", "Mobile Wallet", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:43 EDT 2024, dateDue=Wed May 01 18:27:43 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=null}", false);
        long long6 = manager5.getManagerID();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getEndDate();
        java.lang.String str7 = course5.getProfessorEmail();
        java.lang.String str8 = course5.getProfessorEmail();
        org.team4.model.items.builder.DVDBuilder dVDBuilder9 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD10 = dVDBuilder9.build();
        java.lang.String str11 = dVD10.getGenre();
        boolean boolean12 = dVD10.isPurchasable();
        double double13 = dVD10.getDuration();
        org.team4.model.paymentmodes.MobileWallet mobileWallet15 = new org.team4.model.paymentmodes.MobileWallet("");
        org.team4.model.user.Student student21 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str22 = student21.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase23 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student21);
        org.team4.model.items.Newsletter newsletter24 = itemToPurchase23.getNewsletter();
        org.team4.functionality.buy.ProcessPayment processPayment25 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet15, itemToPurchase23);
        boolean boolean26 = dVD10.equals((java.lang.Object) processPayment25);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder27 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder29 = courseTextBookBuilder27.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder31 = courseTextBookBuilder27.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder33 = courseTextBookBuilder27.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder35 = courseTextBookBuilder33.yearPublished((int) (short) 100);
        boolean boolean36 = dVD10.equals((java.lang.Object) courseTextBookBuilder33);
        org.team4.model.user.Student student42 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str43 = student42.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase44 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student42);
        student42.setType("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase47 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) dVD10, (org.team4.model.user.User) student42);
        java.util.ArrayList<java.lang.String> strList48 = student42.getCourses();
        course5.enrollStudent(student42);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(dVD10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(newsletter24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(bookBuilder29);
        org.junit.Assert.assertNotNull(bookItemBuilder31);
        org.junit.Assert.assertNotNull(courseTextBookBuilder33);
        org.junit.Assert.assertNotNull(bookItemBuilder35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNull(strList48);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
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
        org.team4.model.items.RentedItem rentedItem30 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=null}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date10, date23);
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
        org.team4.model.items.RentedItem rentedItem59 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=null}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date39, date52);
        rentedItem30.setDueDate(date52);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter67 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str68 = subscribeNewsletter67.getEmail();
        java.util.Date date69 = subscribeNewsletter67.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter72 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str73 = subscribeNewsletter72.getEmail();
        java.util.Date date74 = subscribeNewsletter72.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter75 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date69, date74);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter80 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str81 = subscribeNewsletter80.getEmail();
        java.util.Date date82 = subscribeNewsletter80.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter85 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str86 = subscribeNewsletter85.getEmail();
        java.util.Date date87 = subscribeNewsletter85.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter88 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date82, date87);
        org.team4.model.items.RentedItem rentedItem89 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=null}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date69, date82);
        org.team4.model.items.RentedItem rentedItem90 = new org.team4.model.items.RentedItem("", "hi!", date52, date69);
        java.lang.String str91 = rentedItem90.getISBN();
        java.lang.String str92 = rentedItem90.getTitle();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Wed May 01 18:27:51 EDT 2024");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Wed May 01 18:27:51 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Wed May 01 18:27:51 EDT 2024");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Wed May 01 18:27:51 EDT 2024");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Wed May 01 18:27:51 EDT 2024");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Wed May 01 18:27:51 EDT 2024");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(date52);
// flaky:         org.junit.Assert.assertEquals(date52.toString(), "Wed May 01 18:27:51 EDT 2024");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(date57);
// flaky:         org.junit.Assert.assertEquals(date57.toString(), "Wed May 01 18:27:51 EDT 2024");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertNotNull(date69);
// flaky:         org.junit.Assert.assertEquals(date69.toString(), "Wed May 01 18:27:51 EDT 2024");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertNotNull(date74);
// flaky:         org.junit.Assert.assertEquals(date74.toString(), "Wed May 01 18:27:51 EDT 2024");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertNotNull(date82);
// flaky:         org.junit.Assert.assertEquals(date82.toString(), "Wed May 01 18:27:51 EDT 2024");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertNotNull(date87);
// flaky:         org.junit.Assert.assertEquals(date87.toString(), "Wed May 01 18:27:51 EDT 2024");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "hi!" + "'", str91, "hi!");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        dVD1.setQuantity((int) (short) 1);
        java.lang.String str7 = dVD1.getISBN();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
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
        java.util.Date date24 = null;
        java.util.Date date25 = null;
        org.team4.model.course.Course course28 = new org.team4.model.course.Course("hi!", date24, date25, "", "hi!");
        java.util.Date date29 = course28.getEndDate();
        java.lang.String str30 = course28.getProfessorEmail();
        java.lang.String str31 = course28.getProfessorEmail();
        org.team4.model.course.CourseTextBook courseTextBook33 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) dVD1, "", 0, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "hi!", (-1), course28, false);
        org.team4.model.course.Course course34 = courseTextBook33.getCourse();
        java.lang.String str35 = course34.getCourseName();
        java.lang.String str36 = course34.getProfessorEmail();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(date29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(course34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
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
        org.team4.model.items.Magazine magazine17 = new org.team4.model.items.Magazine((org.team4.model.items.Item) book7, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:45 EDT 2024}", 1);
        java.lang.String str18 = book7.getAuthor();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}" + "'", str14, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        java.util.Date date18 = null;
        java.util.Date date19 = null;
        org.team4.model.course.Course course22 = new org.team4.model.course.Course("hi!", date18, date19, "", "hi!");
        java.util.Date date23 = course22.getEndDate();
        java.lang.String str24 = course22.getProfessorEmail();
        java.lang.String str25 = course22.getProfessorEmail();
        org.team4.model.user.Student student31 = new org.team4.model.user.Student("", "", "hi!", "");
        student31.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase34 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student31);
        java.lang.String str35 = student31.getEmail();
        course22.enrollStudent(student31);
        org.team4.model.user.Student student41 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str42 = student41.getType();
        java.lang.String[] strArray44 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        student41.setCourses(strList45);
        student31.setCourses(strList45);
        org.team4.model.user.Faculty faculty49 = new org.team4.model.user.Faculty("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "User [email=, password=, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}", (long) (short) 100, strList45);
        org.team4.model.user.Student student50 = new org.team4.model.user.Student("User [email=, password=, name=hi!, type=, validated=true]", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "", "ItemPurchased{title='', email='hi!', datePurchased=null}", strList45);
        org.team4.model.user.Student student51 = new org.team4.model.user.Student("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}", "SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", strList45);
        org.team4.model.user.Student student52 = new org.team4.model.user.Student("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:45 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", strList45);
        org.junit.Assert.assertNull(date23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
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
        boolean boolean19 = dVD1.isRentable();
        dVD1.setRentable(true);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator22 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) dVD1);
        java.lang.String str23 = dVD1.getGenre();
        boolean boolean24 = dVD1.isPurchasable();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.quantity(100);
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder0.duration((double) (byte) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDBuilder0.price(32.0d);
        org.team4.model.items.DVD dVD9 = dVDBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder11 = dVDBuilder0.yearPublished(52);
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
        org.junit.Assert.assertNotNull(dVD9);
        org.junit.Assert.assertNotNull(dVDItemBuilder11);
    }

    @Ignore
    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        java.lang.String str12 = mobileWallet10.getMode();
        org.team4.model.user.Manager manager19 = new org.team4.model.user.Manager("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:45 EDT 2024}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]", false);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase20 = new org.team4.functionality.buy.ItemToPurchase((double) '4', (org.team4.model.user.User) manager19);
        org.team4.functionality.buy.ProcessPayment processPayment21 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet10, itemToPurchase20);
        java.lang.String str22 = processPayment21.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PayPal" + "'", str12, "PayPal");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter2.setTitle("");
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
        subscribeNewsletter2.setDateSubscribed(date26);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Wed May 01 18:27:51 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Wed May 01 18:27:51 EDT 2024");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(date26);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Wed May 01 18:27:51 EDT 2024");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Wed May 01 18:27:51 EDT 2024");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.paymentmodes.DebitCard debitCard15 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete16 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) debitCard15);
        org.team4.model.items.Newsletter newsletter17 = purchaseComplete16.getNewsletter();
        long long18 = purchaseComplete16.getPurchaseID();
        long long19 = purchaseComplete16.getPurchaseID();
        long long20 = purchaseComplete16.getPurchaseID();
        double double21 = purchaseComplete16.getAmount();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 4212389L + "'", long18 == 4212389L);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 4212389L + "'", long19 == 4212389L);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 4212389L + "'", long20 == 4212389L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder2 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder2.issueNumber((int) '4');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder2.quantity(10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineItemBuilder6.price((double) 213331L);
        org.junit.Assert.assertNotNull(magazineBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        java.util.Date date2 = null;
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("", "", date2);
        java.util.Date date4 = itemPurchased3.getDatePurchased();
        java.util.Date date5 = itemPurchased3.getDatePurchased();
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        java.lang.String str12 = itemToPurchase7.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}" + "'", str12, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.lang.String str3 = subscribeNewsletter2.getTitle();
        java.lang.String str4 = subscribeNewsletter2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str4, "User [email=, password=, name=hi!, type=, validated=false]");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("PayPal");
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
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
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder18 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder20 = courseTextBookBuilder18.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder22 = courseTextBookBuilder18.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder24 = courseTextBookBuilder18.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder26 = courseTextBookBuilder24.yearPublished((int) (short) 100);
        boolean boolean27 = dVD1.equals((java.lang.Object) courseTextBookBuilder24);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder29 = courseTextBookBuilder24.quantity(100);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder31 = courseTextBookBuilder24.isVirtual(true);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookBuilder20);
        org.junit.Assert.assertNotNull(bookItemBuilder22);
        org.junit.Assert.assertNotNull(courseTextBookBuilder24);
        org.junit.Assert.assertNotNull(bookItemBuilder26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookItemBuilder29);
        org.junit.Assert.assertNotNull(courseTextBookBuilder31);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder0.author("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.team4.model.items.BookRequest bookRequest6 = bookRequestBuilder5.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder5.edition(1);
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder10 = bookRequestBuilder5.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:47 EDT 2024, dateDue=Wed May 01 18:27:47 EDT 2024}");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequest6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
        org.junit.Assert.assertNotNull(bookRequestBuilder10);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        java.lang.String str9 = book7.getAuthor();
        java.lang.String str10 = book7.getPublisher();
        java.lang.String str11 = book7.getPublisher();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("", "", "User [email=, password=, name=hi!, type=, validated=false]", "hi!");
        java.lang.String str5 = visitor4.getPassword();
        java.lang.String str6 = visitor4.toString();
        visitor4.setEmail("User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:45 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=Wed May 01 18:27:45 EDT 2024}, validated=false]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]" + "'", str6, "User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        book7.setPrice((double) 0L);
        java.lang.String str11 = book7.getISBN();
        org.team4.model.items.Item item12 = new org.team4.model.items.Item((org.team4.model.items.Item) book7);
        org.team4.model.user.NonFaculty nonFaculty17 = new org.team4.model.user.NonFaculty("hi!", "hi!", "hi!", "");
        nonFaculty17.setUniversityID((long) (short) 100);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase20 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) book7, (org.team4.model.user.User) nonFaculty17);
        org.team4.model.items.Item item21 = itemToPurchase20.getItem();
        org.team4.model.items.Magazine magazine24 = new org.team4.model.items.Magazine(item21, "PayPal", (-1));
        org.team4.model.items.Magazine magazine27 = new org.team4.model.items.Magazine(item21, "User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]", (int) (short) 100);
        int int28 = magazine27.getIssueNumber();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.BookBuilder bookBuilder4 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder6 = bookBuilder4.publisher("Mobile Wallet");
        org.team4.model.items.builder.BookBuilder bookBuilder8 = bookBuilder6.edition((int) (byte) -1);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
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
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder19 = courseTextBookBuilder0.isVirtual(true);
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
        org.junit.Assert.assertNotNull(courseTextBookBuilder19);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        dVD1.setQuantity((int) (short) 1);
        int int7 = dVD1.getQuantity();
        double double8 = dVD1.getDuration();
        org.team4.model.user.Visitor visitor13 = new org.team4.model.user.Visitor("", "", "User [email=, password=, name=hi!, type=, validated=false]", "hi!");
        java.lang.String str14 = visitor13.getPassword();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase15 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) dVD1, (org.team4.model.user.User) visitor13);
        org.team4.model.items.DVD dVD18 = new org.team4.model.items.DVD((org.team4.model.items.Item) dVD1, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}", (double) 100);
        dVD18.setQuantity(0);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        boolean boolean1 = org.team4.utils.EmailValidator.validEmail("ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook8 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder6.build();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertNotNull(courseTextBook9);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", (int) (short) 0, 10);
        org.team4.model.user.User user10 = new org.team4.model.user.User("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "User [email=, password=, name=hi!, type=, validated=false]", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", true);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase11 = new org.team4.functionality.buy.ItemToPurchase((double) 100.0f, user10);
        org.team4.functionality.buy.ProcessPayment processPayment12 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) debitCard3, itemToPurchase11);
        boolean boolean13 = debitCard3.isValid();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished(10);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder5 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder7 = magazineBuilder0.title("User [email=, password=, name=hi!, type=, validated=true]");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder9 = magazineBuilder0.ISBN("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder11 = magazineBuilder0.yearPublished((-1));
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder13 = magazineItemBuilder11.quantity((int) (byte) 100);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertNotNull(magazineBuilder5);
        org.junit.Assert.assertNotNull(magazineItemBuilder7);
        org.junit.Assert.assertNotNull(magazineItemBuilder9);
        org.junit.Assert.assertNotNull(magazineItemBuilder11);
        org.junit.Assert.assertNotNull(magazineItemBuilder13);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        int int2 = dVD1.getYearPublished();
        java.lang.String str3 = dVD1.getGenre();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        int int2 = dVD1.getYearPublished();
        double double3 = dVD1.getDuration();
        dVD1.setPurchaseable(true);
        dVD1.setPurchaseable(false);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.team4.model.user.Manager manager4 = new org.team4.model.user.Manager("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:48 EDT 2024, dateDue=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:47 EDT 2024, dateDue=Wed May 01 18:27:47 EDT 2024}", "Debit Card");
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        java.lang.String str4 = dVD1.getGenre();
        dVD1.setRentable(true);
        dVD1.setPurchaseable(true);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.team4.model.user.User user5 = new org.team4.model.user.User("", "hi!", "hi!", "hi!", false);
        java.lang.String str6 = user5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("User [email=, password=, name=hi!, type=, validated=true]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:50 EDT 2024, dateDue=Wed May 01 18:27:50 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:48 EDT 2024, dateDue=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}", false);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=null}", 10L);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        int int2 = bookRequest1.getEdition();
        java.lang.String str3 = bookRequest1.getISBN();
        java.lang.String str4 = bookRequest1.getISBN();
        int int5 = bookRequest1.getEdition();
        java.lang.String str6 = bookRequest1.getAuthor();
        java.lang.String str7 = bookRequest1.getAuthor();
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.team4.model.user.Student student18 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str19 = student18.getType();
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        student18.setCourses(strList22);
        org.team4.model.user.Faculty faculty25 = new org.team4.model.user.Faculty("ItemPurchased{title='', email='hi!', datePurchased=null}", "Credit Card", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", (long) (byte) 0, strList22);
        org.team4.model.user.Faculty faculty26 = new org.team4.model.user.Faculty("User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "ItemPurchased{title='', email='', datePurchased=null}", 7241236L, strList22);
        org.team4.model.user.Student student27 = new org.team4.model.user.Student("", "User [email=, password=, name=hi!, type=, validated=true]", "ItemPurchased{title='', email='', datePurchased=null}", "ItemPurchased{title='Credit Card', email='Debit Card', datePurchased=Mon Apr 01 18:27:47 EDT 2024}", strList22);
        org.team4.model.user.Student student52 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str53 = student52.getType();
        java.lang.String[] strArray55 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        student52.setCourses(strList56);
        org.team4.model.user.Faculty faculty59 = new org.team4.model.user.Faculty("ItemPurchased{title='', email='hi!', datePurchased=null}", "Credit Card", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", (long) (byte) 0, strList56);
        org.team4.model.user.Faculty faculty60 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}", "User [email=, password=, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:43 EDT 2024, dateDue=Wed May 01 18:27:43 EDT 2024}", "", (long) (short) 10, strList56);
        org.team4.model.user.Faculty faculty61 = new org.team4.model.user.Faculty("hi!", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:43 EDT 2024, dateDue=Wed May 01 18:27:43 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", (long) 1, strList56);
        org.team4.model.user.Student student66 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str67 = student66.getType();
        java.lang.String[] strArray69 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList70 = new java.util.ArrayList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        student66.setCourses(strList70);
        faculty61.setCourses(strList70);
        org.team4.model.user.Faculty faculty74 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}", "", "User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]", "User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]", (long) (byte) 10, strList70);
        student27.setCourses(strList70);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.email("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder0.ISBN("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.BookRequest bookRequest5 = bookRequestBuilder0.build();
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequest5);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:50 EDT 2024, dateDue=Wed May 01 18:27:50 EDT 2024}", (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
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
        org.team4.model.items.Item item17 = new org.team4.model.items.Item(item16);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}" + "'", str14, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
        org.junit.Assert.assertNotNull(item16);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        java.lang.String str8 = book7.toString();
        int int9 = book7.getEdition();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}" + "'", str8, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.DVD dVD3 = dVDBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder5 = dVDBuilder0.genre("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder7 = dVDBuilder0.price(10.0d);
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVD3);
        org.junit.Assert.assertNotNull(dVDBuilder5);
        org.junit.Assert.assertNotNull(dVDItemBuilder7);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.paymentmodes.DebitCard debitCard15 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete16 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) debitCard15);
        double double17 = purchaseComplete16.getAmount();
        org.team4.model.items.Item item18 = purchaseComplete16.getItem();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNull(item18);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        boolean boolean9 = book7.hasHardCopy();
        boolean boolean10 = book7.hasHardCopy();
        boolean boolean12 = book7.equals((java.lang.Object) 100L);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator13 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book7);
        book7.setPrice(0.0d);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator16 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) book7);
        java.lang.String str17 = book7.getGenre();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str3 = subscribeNewsletter2.getTitle();
        java.lang.String str4 = subscribeNewsletter2.getTitle();
        subscribeNewsletter2.setTitle("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:48 EDT 2024, dateDue=null}");
        java.lang.String str7 = subscribeNewsletter2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:48 EDT 2024, dateDue=null}', email='hi!', dateSubscribed=Mon Apr 01 18:27:51 EDT 2024, dateDue=Wed May 01 18:27:51 EDT 2024}" + "'", str7, "SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:48 EDT 2024, dateDue=null}', email='hi!', dateSubscribed=Mon Apr 01 18:27:51 EDT 2024, dateDue=Wed May 01 18:27:51 EDT 2024}");
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("User [email=, password=, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}", "Credit Card", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}");
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", false);
        long long6 = manager5.getManagerID();
        manager5.setManagerID(100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
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
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder18 = courseTextBookBuilder16.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder20 = courseTextBookBuilder18.quantity((int) (byte) 10);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder22 = courseTextBookBuilder18.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder24 = courseTextBookBuilder22.publisher("");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(bookBuilder13);
        org.junit.Assert.assertNotNull(book14);
        org.junit.Assert.assertNotNull(courseTextBookBuilder16);
        org.junit.Assert.assertNotNull(courseTextBookBuilder18);
        org.junit.Assert.assertNotNull(bookItemBuilder20);
        org.junit.Assert.assertNotNull(courseTextBookBuilder22);
        org.junit.Assert.assertNotNull(bookBuilder24);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str3 = subscribeNewsletter2.getTitle();
        java.util.Date date4 = null;
        subscribeNewsletter2.setDateSubscribed(date4);
        java.lang.String str6 = subscribeNewsletter2.toString();
        java.lang.String str7 = subscribeNewsletter2.getTitle();
        java.lang.String str8 = subscribeNewsletter2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:51 EDT 2024}" + "'", str6, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:51 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:51 EDT 2024}" + "'", str8, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:51 EDT 2024}");
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.title("hi!");
        org.team4.model.items.DVD dVD5 = dVDBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder7 = dVDBuilder0.duration((double) 186077L);
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVD5);
        org.junit.Assert.assertNotNull(dVDBuilder7);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder0.publisher("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = courseTextBookBuilder0.price((double) 1.0f);
        org.team4.model.items.builder.BookBuilder bookBuilder14 = courseTextBookBuilder0.publisher("User [email=, password=, name=hi!, type=, validated=true]");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder16 = bookBuilder14.title("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=null}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(bookItemBuilder12);
        org.junit.Assert.assertNotNull(bookBuilder14);
        org.junit.Assert.assertNotNull(bookItemBuilder16);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.booktype("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder3.edition((int) ' ');
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder9 = bookRequestBuilder3.author("User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:45 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=Wed May 01 18:27:45 EDT 2024}, validated=false]");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
        org.junit.Assert.assertNotNull(bookRequestBuilder9);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "Credit Card", "User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]", 10, "PayPal");
        java.lang.String str7 = bookRequest6.getAuthor();
        java.lang.String str8 = bookRequest6.getBookType();
        java.lang.String str9 = bookRequest6.getAuthor();
        java.lang.String str10 = bookRequest6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credit Card" + "'", str7, "Credit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PayPal" + "'", str8, "PayPal");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Credit Card" + "'", str9, "Credit Card");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str10, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.title("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDBuilder0.price(1.0d);
        org.team4.model.items.builder.DVDBuilder dVDBuilder8 = dVDBuilder0.duration((double) (short) 10);
        org.team4.model.items.DVD dVD9 = dVDBuilder8.build();
        org.team4.model.items.Item item10 = new org.team4.model.items.Item((org.team4.model.items.Item) dVD9);
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDBuilder8);
        org.junit.Assert.assertNotNull(dVD9);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.team4.model.items.Item item0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.items.DVD dVD3 = new org.team4.model.items.DVD(item0, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=Wed May 01 18:27:45 EDT 2024}", (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"title\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.course.CourseTextBook courseTextBook7 = courseTextBookBuilder6.build();
        java.lang.String str8 = courseTextBook7.getGenre();
        java.util.List<org.team4.model.user.Student> studentList9 = courseTextBook7.getStudentsWithCopies();
        java.lang.String str10 = courseTextBook7.getGenre();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter18 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str19 = subscribeNewsletter18.getEmail();
        java.util.Date date20 = subscribeNewsletter18.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter23 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str24 = subscribeNewsletter23.getEmail();
        java.util.Date date25 = subscribeNewsletter23.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter26 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date20, date25);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter31 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str32 = subscribeNewsletter31.getEmail();
        java.util.Date date33 = subscribeNewsletter31.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter36 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str37 = subscribeNewsletter36.getEmail();
        java.util.Date date38 = subscribeNewsletter36.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter39 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date33, date38);
        org.team4.model.items.RentedItem rentedItem40 = new org.team4.model.items.RentedItem("Credit Card", "ItemPurchased{title='', email='', datePurchased=null}", date25, date33);
        java.util.Date date41 = null;
        rentedItem40.setDueDate(date41);
        java.util.Date date43 = rentedItem40.getRentDate();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter50 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str51 = subscribeNewsletter50.getEmail();
        java.util.Date date52 = subscribeNewsletter50.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter55 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str56 = subscribeNewsletter55.getEmail();
        java.util.Date date57 = subscribeNewsletter55.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter58 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date52, date57);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter63 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str64 = subscribeNewsletter63.getEmail();
        java.util.Date date65 = subscribeNewsletter63.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter68 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str69 = subscribeNewsletter68.getEmail();
        java.util.Date date70 = subscribeNewsletter68.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter71 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date65, date70);
        org.team4.model.items.RentedItem rentedItem72 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=null}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date52, date65);
        org.team4.model.course.Course course75 = new org.team4.model.course.Course("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", date43, date52, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.user.Student student81 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str82 = student81.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase83 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student81);
        student81.setType("User [email=, password=, name=hi!, type=, validated=false]");
        boolean boolean86 = student81.isValidated();
        java.lang.String str87 = student81.getEmail();
        course75.enrollStudent(student81);
        // The following exception was thrown during execution in test generation
        try {
            courseTextBook7.removeCopies(student81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.team4.model.course.Course.isEnded(java.util.Date)\" because \"this.course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(courseTextBook7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(studentList9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(date33);
// flaky:         org.junit.Assert.assertEquals(date33.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(date38);
// flaky:         org.junit.Assert.assertEquals(date38.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertNotNull(date43);
// flaky:         org.junit.Assert.assertEquals(date43.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(date52);
// flaky:         org.junit.Assert.assertEquals(date52.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(date57);
// flaky:         org.junit.Assert.assertEquals(date57.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertNotNull(date65);
// flaky:         org.junit.Assert.assertEquals(date65.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertNotNull(date70);
// flaky:         org.junit.Assert.assertEquals(date70.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.team4.functionality.buy.ItemPurchased itemPurchased2 = new org.team4.functionality.buy.ItemPurchased("ItemPurchased{title='', email='hi!', datePurchased=null}", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date3 = itemPurchased2.getDatePurchased();
        java.lang.Class<?> wildcardClass4 = itemPurchased2.getClass();
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Mon Apr 01 18:27:52 EDT 2024");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "User [email=, password=, name=hi!, type=, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", (long) (byte) 1);
        java.lang.String str6 = manager5.toString();
        java.lang.String str7 = manager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=User [email=, password=, name=hi!, type=, validated=false], type=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, validated=false]" + "'", str6, "User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=User [email=, password=, name=hi!, type=, validated=false], type=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, validated=false]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str7, "ItemPurchased{title='', email='hi!', datePurchased=null}");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.DVD dVD3 = dVDBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder5 = dVDBuilder0.genre("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.team4.model.items.DVD dVD6 = dVDBuilder0.build();
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVD3);
        org.junit.Assert.assertNotNull(dVDBuilder5);
        org.junit.Assert.assertNotNull(dVD6);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}", "", "User [email=, password=, name=hi!, type=, validated=false]", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", true);
        visitor5.setName("Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
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
        boolean boolean19 = dVD1.isRentable();
        dVD1.setRentable(true);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator22 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) dVD1);
        double double23 = dVD1.getPrice();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:51 EDT 2024}", "", (long) (-1));
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder0.quantity((int) (short) 100);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        java.lang.String[] strArray12 = new java.lang.String[] { "ItemPurchased{title='', email='', datePurchased=null}", "SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        org.team4.model.user.Faculty faculty15 = new org.team4.model.user.Faculty("Mobile Wallet", "hi!", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "Credit Card", 1L, strList13);
        org.team4.model.user.Faculty faculty16 = new org.team4.model.user.Faculty("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "hi!", "Credit Card", "PayPal", (long) 'a', strList13);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.team4.model.user.Student student9 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str10 = student9.getType();
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        student9.setCourses(strList13);
        org.team4.model.user.Faculty faculty16 = new org.team4.model.user.Faculty("Mobile Wallet", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}", (long) '4', strList13);
        java.lang.String str17 = faculty16.getPassword();
        long long18 = faculty16.getFacultyID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}" + "'", str17, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 52L + "'", long18 == 52L);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
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
        java.util.Date date26 = null;
        java.util.Date date27 = null;
        org.team4.model.course.Course course30 = new org.team4.model.course.Course("hi!", date26, date27, "", "hi!");
        org.team4.model.user.Student student35 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str36 = student35.getType();
        course30.enrollStudent(student35);
        java.lang.String str38 = course30.getProfessorEmail();
        org.team4.model.course.CourseTextBook courseTextBook40 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) dVD1, "PayPal", 0, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:43 EDT 2024, dateDue=Wed May 01 18:27:43 EDT 2024}", (int) (short) 1, course30, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = course30.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.toString()\" because \"this.startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Ignore
    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("");
        java.lang.String str2 = mobileWallet1.getMode();
        java.lang.String str3 = mobileWallet1.getMode();
        java.lang.String str4 = mobileWallet1.getMode();
        org.team4.model.user.Student student10 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str11 = student10.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase12 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student10);
        org.team4.model.items.Newsletter newsletter13 = itemToPurchase12.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet15 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete16 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase12, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet15);
        org.team4.model.paymentmodes.DebitCard debitCard20 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete21 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase12, (org.team4.model.paymentmodes.PaymentValidator) debitCard20);
        org.team4.functionality.buy.ProcessPayment processPayment22 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet1, itemToPurchase12);
        org.team4.model.items.Newsletter newsletter23 = itemToPurchase12.getNewsletter();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PayPal" + "'", str2, "PayPal");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PayPal" + "'", str3, "PayPal");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PayPal" + "'", str4, "PayPal");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(newsletter23);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        org.team4.model.user.Student student10 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str11 = student10.getType();
        course5.enrollStudent(student10);
        java.lang.String str13 = course5.getCourseName();
        java.lang.String str14 = course5.getCourseName();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("", "Mobile Wallet", "User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=User [email=, password=, name=hi!, type=, validated=false], type=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, validated=false]", "User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:45 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=Wed May 01 18:27:45 EDT 2024}, validated=false]");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("ItemPurchased{title='', email='hi!', datePurchased=null}", "Credit Card", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:43 EDT 2024, dateDue=Wed May 01 18:27:43 EDT 2024}", "User [email=, password=, name=hi!, type=, validated=true]");
        nonFaculty4.setUniversityID((long) (byte) -1);
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
        boolean boolean9 = book7.hasHardCopy();
        java.lang.String str10 = book7.toString();
        org.team4.model.items.Item item11 = new org.team4.model.items.Item((org.team4.model.items.Item) book7);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}" + "'", str10, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
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
        java.util.Date date24 = null;
        java.util.Date date25 = null;
        org.team4.model.course.Course course28 = new org.team4.model.course.Course("hi!", date24, date25, "", "hi!");
        java.util.Date date29 = course28.getEndDate();
        java.lang.String str30 = course28.getProfessorEmail();
        java.lang.String str31 = course28.getProfessorEmail();
        org.team4.model.course.CourseTextBook courseTextBook33 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) dVD1, "", 0, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "hi!", (-1), course28, false);
        org.team4.model.user.Student student47 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str48 = student47.getType();
        java.lang.String[] strArray50 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        student47.setCourses(strList51);
        org.team4.model.user.Faculty faculty54 = new org.team4.model.user.Faculty("Mobile Wallet", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}", (long) '4', strList51);
        org.team4.model.user.Student student55 = new org.team4.model.user.Student("Credit Card", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "Credit Card", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", strList51);
        courseTextBook33.makeCopies(student55);
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder57 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest58 = bookRequestBuilder57.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder60 = bookRequestBuilder57.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder62 = bookRequestBuilder57.author("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.team4.model.items.BookRequest bookRequest63 = bookRequestBuilder62.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder65 = bookRequestBuilder62.ISBN("SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}");
        org.team4.model.items.BookRequest bookRequest66 = bookRequestBuilder62.build();
        boolean boolean67 = courseTextBook33.equals((java.lang.Object) bookRequest66);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(date29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(bookRequest58);
        org.junit.Assert.assertNotNull(bookRequestBuilder60);
        org.junit.Assert.assertNotNull(bookRequestBuilder62);
        org.junit.Assert.assertNotNull(bookRequest63);
        org.junit.Assert.assertNotNull(bookRequestBuilder65);
        org.junit.Assert.assertNotNull(bookRequest66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder0.publisher("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder12 = courseTextBookBuilder0.noOfPages(1);
        java.util.Date date14 = null;
        java.util.Date date15 = null;
        org.team4.model.course.Course course18 = new org.team4.model.course.Course("hi!", date14, date15, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder19 = courseTextBookBuilder0.course(course18);
        java.util.Date date20 = course18.getEndDate();
        org.team4.model.user.Student student25 = new org.team4.model.user.Student("", "", "hi!", "");
        student25.setEmail("");
        course18.enrollStudent(student25);
        java.util.ArrayList<java.lang.String> strList29 = student25.getCourses();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(bookBuilder12);
        org.junit.Assert.assertNotNull(courseTextBookBuilder19);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNull(strList29);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        boolean boolean4 = creditCard3.notExpired();
        boolean boolean5 = creditCard3.isValid();
        boolean boolean6 = creditCard3.isValid();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        java.lang.String str4 = dVD1.getGenre();
        org.team4.model.items.Book book12 = new org.team4.model.items.Book((org.team4.model.items.Item) dVD1, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}", (int) (short) 100, "SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}", 0, true, false);
        org.team4.model.items.Item item13 = new org.team4.model.items.Item((org.team4.model.items.Item) book12);
        int int14 = book12.getEdition();
        int int15 = book12.getNoOfPages();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
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
        boolean boolean20 = dVD1.isRentable();
        org.team4.model.items.Magazine magazine23 = new org.team4.model.items.Magazine((org.team4.model.items.Item) dVD1, "Credit Card", 0);
        java.lang.String str24 = dVD1.getGenre();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.lang.String str6 = course5.getProfessorEmail();
        java.util.Date date7 = course5.getStartDate();
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        org.team4.model.course.Course course14 = new org.team4.model.course.Course("hi!", date10, date11, "", "hi!");
        java.util.Date date15 = course14.getEndDate();
        java.lang.String str16 = course14.getProfessorEmail();
        java.lang.String str17 = course14.getProfessorEmail();
        org.team4.model.user.Student student22 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean23 = course14.isEnrolled(student22);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase24 = new org.team4.functionality.buy.ItemToPurchase(100.0d, (org.team4.model.user.User) student22);
        student22.setValidated(true);
        boolean boolean27 = course5.isEnrolled(student22);
        java.lang.String str28 = student22.toString();
        student22.setName("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "User [email=, password=, name=hi!, type=, validated=true]" + "'", str28, "User [email=, password=, name=hi!, type=, validated=true]");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        double double10 = book9.getPrice();
        boolean boolean11 = book9.hasSoftCopy();
        java.lang.String str12 = book9.getGenre();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.team4.model.user.User user4 = new org.team4.model.user.User("SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:45 EDT 2024}", "PayPal", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=null}");
        java.lang.Class<?> wildcardClass5 = user4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        org.team4.model.course.Course course11 = new org.team4.model.course.Course("hi!", date7, date8, "", "hi!");
        java.util.Date date12 = course11.getEndDate();
        java.lang.String str13 = course11.getProfessorEmail();
        java.lang.String str14 = course11.getProfessorEmail();
        org.team4.model.user.Student student19 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean20 = course11.isEnrolled(student19);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase21 = new org.team4.functionality.buy.ItemToPurchase(100.0d, (org.team4.model.user.User) student19);
        org.team4.model.user.Faculty faculty27 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "hi!", "", "", false);
        faculty27.setFacultyID((long) (byte) 1);
        org.team4.model.user.Student student34 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str35 = student34.getType();
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        student34.setCourses(strList38);
        faculty27.setCourses(strList38);
        student19.setCourses(strList38);
        org.team4.model.user.Faculty faculty43 = new org.team4.model.user.Faculty("Mobile Wallet", "User [email=, password=, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}", 213331L, strList38);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        boolean boolean4 = debitCard3.notExpired();
        boolean boolean5 = debitCard3.isValid();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
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
        java.lang.String str20 = book7.getAuthor();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator21 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) book7);
        boolean boolean22 = book7.hasSoftCopy();
        boolean boolean23 = book7.isPurchasable();
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
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        int int2 = bookRequest1.getEdition();
        java.lang.String str3 = bookRequest1.getAuthor();
        java.lang.String str4 = bookRequest1.getAuthor();
        java.lang.String str5 = bookRequest1.getAuthor();
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("", "", "", "", 0L);
        java.lang.String str6 = manager5.getName();
        long long7 = manager5.getManagerID();
        manager5.setType("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}");
        manager5.setManagerID((long) (byte) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        java.lang.String str9 = book7.getAuthor();
        boolean boolean10 = book7.hasHardCopy();
        org.team4.model.items.Item item11 = new org.team4.model.items.Item((org.team4.model.items.Item) book7);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished(10);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        java.lang.String str4 = magazine3.getPublisher();
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("User [email=User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=User [email=, password=, name=hi!, type=, validated=false], type=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, validated=false], password=PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:48 EDT 2024}, validated=false]");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.title("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.booktype("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder3.ISBN("ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.team4.model.user.User user4 = new org.team4.model.user.User("SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:51 EDT 2024, dateDue=null}", "Debit Card", "User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
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
        java.util.Date date51 = subscribeNewsletter2.getDateDue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:52 EDT 2024, dateDue=Wed May 01 18:27:52 EDT 2024}" + "'", str4, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:52 EDT 2024, dateDue=Wed May 01 18:27:52 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(date26);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(date41);
// flaky:         org.junit.Assert.assertEquals(date41.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(date46);
// flaky:         org.junit.Assert.assertEquals(date46.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertNotNull(date51);
// flaky:         org.junit.Assert.assertEquals(date51.toString(), "Wed May 01 18:27:52 EDT 2024");
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.user.User user12 = purchaseComplete11.getUser();
        org.team4.model.items.Item item13 = purchaseComplete11.getItem();
        double double14 = purchaseComplete11.getAmount();
        long long15 = purchaseComplete11.getPurchaseID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 7861930L + "'", long15 == 7861930L);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "hi!", "", "", false);
        faculty5.setFacultyID((long) (byte) 1);
        org.team4.model.user.Student student12 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str13 = student12.getType();
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        student12.setCourses(strList16);
        faculty5.setCourses(strList16);
        faculty5.setFacultyID((long) (short) 100);
        faculty5.setPassword("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemPurchased{title='', email='', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "PayPal", (int) '#', "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        java.lang.String str7 = bookRequest6.getISBN();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PayPal" + "'", str7, "PayPal");
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder0.publisher("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookBuilder bookBuilder12 = courseTextBookBuilder0.author("Credit Card");
        org.team4.model.items.builder.BookBuilder bookBuilder14 = bookBuilder12.hasHardCopy(false);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(bookBuilder12);
        org.junit.Assert.assertNotNull(bookBuilder14);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        java.lang.String str2 = courseTextBook1.toString();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Book{genre='null', noOfPages=0, author='null', ISBN=null, publisher='null', edition='0'}" + "'", str2, "Book{genre='null', noOfPages=0, author='null', ISBN=null, publisher='null', edition='0'}");
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter2.setTitle("");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter13 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str14 = subscribeNewsletter13.getEmail();
        java.util.Date date15 = subscribeNewsletter13.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter18 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str19 = subscribeNewsletter18.getEmail();
        java.util.Date date20 = subscribeNewsletter18.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter21 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date15, date20);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter26 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str27 = subscribeNewsletter26.getEmail();
        java.util.Date date28 = subscribeNewsletter26.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter31 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str32 = subscribeNewsletter31.getEmail();
        java.util.Date date33 = subscribeNewsletter31.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter34 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date28, date33);
        org.team4.model.items.RentedItem rentedItem35 = new org.team4.model.items.RentedItem("Credit Card", "ItemPurchased{title='', email='', datePurchased=null}", date20, date28);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter42 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str43 = subscribeNewsletter42.getEmail();
        java.util.Date date44 = subscribeNewsletter42.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter47 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str48 = subscribeNewsletter47.getEmail();
        java.util.Date date49 = subscribeNewsletter47.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter50 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date44, date49);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter55 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str56 = subscribeNewsletter55.getEmail();
        java.util.Date date57 = subscribeNewsletter55.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter60 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str61 = subscribeNewsletter60.getEmail();
        java.util.Date date62 = subscribeNewsletter60.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter63 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date57, date62);
        org.team4.model.items.RentedItem rentedItem64 = new org.team4.model.items.RentedItem("Credit Card", "ItemPurchased{title='', email='', datePurchased=null}", date49, date57);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter65 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemPurchased{title='', email='', datePurchased=null}", "hi!", date20, date57);
        java.util.Date date66 = subscribeNewsletter65.getDateSubscribed();
        subscribeNewsletter2.setDateSubscribed(date66);
        java.lang.String str68 = subscribeNewsletter2.getTitle();
        java.lang.String str69 = subscribeNewsletter2.toString();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(date33);
// flaky:         org.junit.Assert.assertEquals(date33.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(date49);
// flaky:         org.junit.Assert.assertEquals(date49.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(date57);
// flaky:         org.junit.Assert.assertEquals(date57.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNotNull(date62);
// flaky:         org.junit.Assert.assertEquals(date62.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertNotNull(date66);
// flaky:         org.junit.Assert.assertEquals(date66.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
// flaky:         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Wed May 01 18:27:52 EDT 2024, dateDue=Wed May 01 18:27:52 EDT 2024}" + "'", str69, "SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Wed May 01 18:27:52 EDT 2024, dateDue=Wed May 01 18:27:52 EDT 2024}");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.util.Date date3 = null;
        subscribeNewsletter2.setDateDue(date3);
        java.lang.String str5 = subscribeNewsletter2.toString();
        java.lang.String str6 = subscribeNewsletter2.getTitle();
        java.lang.String str7 = subscribeNewsletter2.toString();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:52 EDT 2024, dateDue=null}" + "'", str5, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:52 EDT 2024, dateDue=null}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:52 EDT 2024, dateDue=null}" + "'", str7, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:52 EDT 2024, dateDue=null}");
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.util.Date date3 = null;
        subscribeNewsletter2.setDateDue(date3);
        java.lang.String str5 = subscribeNewsletter2.toString();
        subscribeNewsletter2.setEmail("");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:52 EDT 2024, dateDue=null}" + "'", str5, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:52 EDT 2024, dateDue=null}");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder6.quantity((-1));
        org.team4.model.items.builder.BookBuilder bookBuilder12 = courseTextBookBuilder6.edition((int) (short) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder14 = courseTextBookBuilder6.ISBN("Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
        org.team4.model.items.builder.BookBuilder bookBuilder16 = courseTextBookBuilder6.publisher("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(bookBuilder12);
        org.junit.Assert.assertNotNull(bookItemBuilder14);
        org.junit.Assert.assertNotNull(bookBuilder16);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        boolean boolean4 = debitCard3.notExpired();
        boolean boolean5 = debitCard3.correctLength();
        java.lang.String str6 = debitCard3.getMode();
        boolean boolean7 = debitCard3.notExpired();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Debit Card" + "'", str6, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        org.team4.model.user.Student student10 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str11 = student10.getType();
        course5.enrollStudent(student10);
        java.lang.String str13 = course5.getProfessorEmail();
        org.team4.model.user.Student student18 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str19 = student18.getType();
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        student18.setCourses(strList22);
        boolean boolean25 = course5.isEnrolled(student18);
        org.team4.model.user.Student student48 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str49 = student48.getType();
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        student48.setCourses(strList52);
        org.team4.model.user.Faculty faculty55 = new org.team4.model.user.Faculty("Mobile Wallet", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}", (long) '4', strList52);
        org.team4.model.user.Student student56 = new org.team4.model.user.Student("Credit Card", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "Credit Card", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", strList52);
        java.util.ArrayList<java.lang.String> strList57 = student56.getCourses();
        org.team4.model.user.Student student58 = new org.team4.model.user.Student("Credit Card", "hi!", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:48 EDT 2024, dateDue=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:45 EDT 2024}", strList57);
        org.team4.model.user.Faculty faculty59 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:50 EDT 2024, dateDue=Wed May 01 18:27:50 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:48 EDT 2024, dateDue=null}", 0L, strList57);
        student18.setCourses(strList57);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strList57);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder0.publisher("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.Book book11 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder13 = courseTextBookBuilder0.hasHardCopy(false);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder15 = bookBuilder13.ISBN("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder17 = bookBuilder13.title("Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(bookBuilder13);
        org.junit.Assert.assertNotNull(bookItemBuilder15);
        org.junit.Assert.assertNotNull(bookItemBuilder17);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter7 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str8 = subscribeNewsletter7.getEmail();
        java.util.Date date9 = subscribeNewsletter7.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter12 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str13 = subscribeNewsletter12.getEmail();
        java.util.Date date14 = subscribeNewsletter12.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter15 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date9, date14);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter20 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str21 = subscribeNewsletter20.getEmail();
        java.util.Date date22 = subscribeNewsletter20.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter25 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str26 = subscribeNewsletter25.getEmail();
        java.util.Date date27 = subscribeNewsletter25.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter28 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date22, date27);
        org.team4.model.items.RentedItem rentedItem29 = new org.team4.model.items.RentedItem("Credit Card", "ItemPurchased{title='', email='', datePurchased=null}", date14, date22);
        java.util.Date date30 = null;
        rentedItem29.setDueDate(date30);
        java.util.Date date32 = rentedItem29.getRentDate();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter39 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str40 = subscribeNewsletter39.getEmail();
        java.util.Date date41 = subscribeNewsletter39.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter44 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str45 = subscribeNewsletter44.getEmail();
        java.util.Date date46 = subscribeNewsletter44.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter47 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date41, date46);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter52 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str53 = subscribeNewsletter52.getEmail();
        java.util.Date date54 = subscribeNewsletter52.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter57 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str58 = subscribeNewsletter57.getEmail();
        java.util.Date date59 = subscribeNewsletter57.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter60 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date54, date59);
        org.team4.model.items.RentedItem rentedItem61 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=null}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date41, date54);
        org.team4.model.course.Course course64 = new org.team4.model.course.Course("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", date32, date41, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        java.lang.String str65 = course64.getProfessorEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(date27);
// flaky:         org.junit.Assert.assertEquals(date27.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(date41);
// flaky:         org.junit.Assert.assertEquals(date41.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(date46);
// flaky:         org.junit.Assert.assertEquals(date46.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(date54);
// flaky:         org.junit.Assert.assertEquals(date54.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertNotNull(date59);
// flaky:         org.junit.Assert.assertEquals(date59.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str65, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("User [email=, password=, name=hi!, type=, validated=true]", "ItemPurchased{title='', email='hi!', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:45 EDT 2024}", "User [email=, password=, name=hi!, type=, validated=true]");
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.lang.String str6 = course5.getProfessorEmail();
        java.util.Date date7 = course5.getStartDate();
        java.lang.String str8 = course5.getProfessorEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.email("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder0.ISBN("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.author("User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:45 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=Wed May 01 18:27:45 EDT 2024}, validated=false]");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(user15);
    }

    @Ignore
    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        book7.setPrice((double) 0L);
        java.lang.String str11 = book7.getISBN();
        org.team4.model.items.Item item12 = new org.team4.model.items.Item((org.team4.model.items.Item) book7);
        org.team4.model.user.NonFaculty nonFaculty17 = new org.team4.model.user.NonFaculty("hi!", "hi!", "hi!", "");
        nonFaculty17.setUniversityID((long) (short) 100);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase20 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) book7, (org.team4.model.user.User) nonFaculty17);
        double double21 = itemToPurchase20.getAmount();
        org.team4.model.paymentmodes.MobileWallet mobileWallet23 = new org.team4.model.paymentmodes.MobileWallet("");
        java.lang.String str24 = mobileWallet23.getMode();
        java.lang.String str25 = mobileWallet23.getMode();
        java.lang.String str26 = mobileWallet23.getMode();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete27 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase20, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet23);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PayPal" + "'", str24, "PayPal");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PayPal" + "'", str25, "PayPal");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PayPal" + "'", str26, "PayPal");
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.booktype("Credit Card");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.author("User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
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
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder18 = courseTextBookBuilder16.isVirtual(true);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder20 = courseTextBookBuilder18.isVirtual(false);
        org.team4.model.items.builder.BookBuilder bookBuilder22 = courseTextBookBuilder18.author("ItemPurchased{title='Credit Card', email='Debit Card', datePurchased=Mon Apr 01 18:27:47 EDT 2024}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(bookBuilder13);
        org.junit.Assert.assertNotNull(book14);
        org.junit.Assert.assertNotNull(courseTextBookBuilder16);
        org.junit.Assert.assertNotNull(courseTextBookBuilder18);
        org.junit.Assert.assertNotNull(courseTextBookBuilder20);
        org.junit.Assert.assertNotNull(bookBuilder22);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.Book book5 = courseTextBookBuilder0.build();
        org.team4.model.course.CourseTextBook courseTextBook6 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder0.author("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:52 EDT 2024, dateDue=null}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(courseTextBook6);
        org.junit.Assert.assertNotNull(bookBuilder8);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        java.lang.String str5 = dVD1.getGenre();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
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
        org.team4.model.items.builder.BookBuilder bookBuilder19 = courseTextBookBuilder0.edition((int) (short) 100);
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
        org.junit.Assert.assertNotNull(bookBuilder19);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.team4.model.items.Item item0 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        org.team4.model.course.Course course11 = new org.team4.model.course.Course("hi!", date7, date8, "", "hi!");
        org.team4.model.user.Student student16 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str17 = student16.getType();
        course11.enrollStudent(student16);
        java.lang.String str19 = course11.getProfessorEmail();
        java.lang.String str20 = course11.getProfessorEmail();
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.course.CourseTextBook courseTextBook22 = new org.team4.model.course.CourseTextBook(item0, "ItemPurchased{title='Credit Card', email='Debit Card', datePurchased=Mon Apr 01 18:27:47 EDT 2024}", (int) (short) -1, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Wed May 01 18:27:52 EDT 2024, dateDue=Wed May 01 18:27:52 EDT 2024}", (int) (short) -1, course11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"title\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", 100, (int) (short) 1);
        java.lang.String str4 = creditCard3.getMode();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Credit Card" + "'", str4, "Credit Card");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Wed May 01 18:27:52 EDT 2024, dateDue=Wed May 01 18:27:52 EDT 2024}", "Mobile Wallet", "User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder0.publisher("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = bookBuilder10.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:51 EDT 2024, dateDue=null}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(bookItemBuilder12);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
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
        java.lang.String str62 = subscribeNewsletter60.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(date52);
// flaky:         org.junit.Assert.assertEquals(date52.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(date57);
// flaky:         org.junit.Assert.assertEquals(date57.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertNotNull(date61);
// flaky:         org.junit.Assert.assertEquals(date61.toString(), "Wed May 01 18:27:52 EDT 2024");
// flaky:         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "SubscribeNewsletter{title='ItemPurchased{title='', email='', datePurchased=null}', email='hi!', dateSubscribed=Wed May 01 18:27:52 EDT 2024, dateDue=Wed May 01 18:27:52 EDT 2024}" + "'", str62, "SubscribeNewsletter{title='ItemPurchased{title='', email='', datePurchased=null}', email='hi!', dateSubscribed=Wed May 01 18:27:52 EDT 2024, dateDue=Wed May 01 18:27:52 EDT 2024}");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter6 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str7 = subscribeNewsletter6.getEmail();
        java.util.Date date8 = subscribeNewsletter6.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter11 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str12 = subscribeNewsletter11.getEmail();
        java.util.Date date13 = subscribeNewsletter11.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter14 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date8, date13);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter21 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str22 = subscribeNewsletter21.getEmail();
        java.util.Date date23 = subscribeNewsletter21.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter26 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str27 = subscribeNewsletter26.getEmail();
        java.util.Date date28 = subscribeNewsletter26.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter29 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date23, date28);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter34 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str35 = subscribeNewsletter34.getEmail();
        java.util.Date date36 = subscribeNewsletter34.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter39 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str40 = subscribeNewsletter39.getEmail();
        java.util.Date date41 = subscribeNewsletter39.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter42 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date36, date41);
        org.team4.model.items.RentedItem rentedItem43 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=null}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date23, date36);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter44 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemPurchased{title='', email='hi!', datePurchased=null}", "User [email=, password=, name=hi!, type=, validated=false]", date8, date36);
        java.lang.String str45 = subscribeNewsletter44.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(date36);
// flaky:         org.junit.Assert.assertEquals(date36.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(date41);
// flaky:         org.junit.Assert.assertEquals(date41.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str45, "ItemPurchased{title='', email='hi!', datePurchased=null}");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", (double) 10L);
        java.lang.String str4 = newsletter3.getTitle();
        java.lang.String str5 = newsletter3.getLink();
        org.team4.model.user.User user6 = null;
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, user6);
        double double8 = newsletter3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str4, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str5, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getEndDate();
        java.util.Date date7 = course5.getStartDate();
        org.team4.model.user.Student student13 = new org.team4.model.user.Student("", "", "hi!", "");
        student13.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase16 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student13);
        boolean boolean17 = course5.isEnrolled(student13);
        java.util.Date date20 = null;
        java.util.Date date21 = null;
        org.team4.model.course.Course course24 = new org.team4.model.course.Course("hi!", date20, date21, "", "hi!");
        java.util.Date date25 = course24.getEndDate();
        java.lang.String str26 = course24.getProfessorEmail();
        java.lang.String str27 = course24.getProfessorEmail();
        org.team4.model.user.Student student32 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean33 = course24.isEnrolled(student32);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase34 = new org.team4.functionality.buy.ItemToPurchase(100.0d, (org.team4.model.user.User) student32);
        boolean boolean35 = course5.isEnrolled(student32);
        java.lang.String str36 = course5.getProfessorEmail();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter39 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str40 = subscribeNewsletter39.getTitle();
        java.lang.String str41 = subscribeNewsletter39.getTitle();
        java.util.Date date42 = subscribeNewsletter39.getDateDue();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = course5.isEnded(date42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(date25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Wed May 01 18:27:52 EDT 2024");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.paymentmodes.CreditCard creditCard10 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) creditCard10);
        boolean boolean12 = creditCard10.correctLength();
        org.team4.model.user.Student student18 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str19 = student18.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase20 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student18);
        org.team4.model.items.Newsletter newsletter21 = itemToPurchase20.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet23 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete24 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase20, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet23);
        org.team4.model.paymentmodes.DebitCard debitCard28 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete29 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase20, (org.team4.model.paymentmodes.PaymentValidator) debitCard28);
        org.team4.model.items.Newsletter newsletter30 = itemToPurchase20.getNewsletter();
        org.team4.functionality.buy.ProcessPayment processPayment31 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) creditCard10, itemToPurchase20);
        boolean boolean32 = creditCard10.correctLength();
        java.lang.String str33 = creditCard10.getMode();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(newsletter21);
        org.junit.Assert.assertNull(newsletter30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Credit Card" + "'", str33, "Credit Card");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.title("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDItemBuilder4.quantity(1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDItemBuilder6.yearPublished((int) (short) 0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder10 = dVDItemBuilder8.title("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder12 = dVDItemBuilder10.quantity((int) ' ');
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
        org.junit.Assert.assertNotNull(dVDItemBuilder10);
        org.junit.Assert.assertNotNull(dVDItemBuilder12);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str5 = student4.getType();
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        student4.setCourses(strList8);
        java.lang.String str11 = student4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        java.lang.String str4 = dVD1.getGenre();
        org.team4.model.items.Book book12 = new org.team4.model.items.Book((org.team4.model.items.Item) dVD1, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}", (int) (short) 100, "SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}", 0, true, false);
        boolean boolean13 = book12.isRentable();
        boolean boolean14 = book12.hasSoftCopy();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.team4.model.user.Student student22 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str23 = student22.getType();
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        student22.setCourses(strList26);
        org.team4.model.user.Faculty faculty29 = new org.team4.model.user.Faculty("Mobile Wallet", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}", (long) '4', strList26);
        org.team4.model.user.Student student30 = new org.team4.model.user.Student("Credit Card", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "Credit Card", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", strList26);
        java.util.ArrayList<java.lang.String> strList31 = student30.getCourses();
        org.team4.model.user.Student student32 = new org.team4.model.user.Student("Credit Card", "hi!", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:48 EDT 2024, dateDue=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:45 EDT 2024}", strList31);
        org.team4.model.user.Faculty faculty33 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:50 EDT 2024, dateDue=Wed May 01 18:27:50 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:48 EDT 2024, dateDue=null}", 0L, strList31);
        long long34 = faculty33.getFacultyID();
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.lang.String str6 = course5.getProfessorEmail();
        java.util.Date date7 = course5.getStartDate();
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        org.team4.model.course.Course course14 = new org.team4.model.course.Course("hi!", date10, date11, "", "hi!");
        java.util.Date date15 = course14.getEndDate();
        java.lang.String str16 = course14.getProfessorEmail();
        java.lang.String str17 = course14.getProfessorEmail();
        org.team4.model.user.Student student22 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean23 = course14.isEnrolled(student22);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase24 = new org.team4.functionality.buy.ItemToPurchase(100.0d, (org.team4.model.user.User) student22);
        student22.setValidated(true);
        boolean boolean27 = course5.isEnrolled(student22);
        boolean boolean28 = student22.isValidated();
        java.lang.String str29 = student22.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder0.publisher("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder12 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder14 = courseTextBookBuilder0.hasHardCopy(false);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(courseTextBookBuilder12);
        org.junit.Assert.assertNotNull(bookBuilder14);
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
        java.util.Date date24 = null;
        java.util.Date date25 = null;
        org.team4.model.course.Course course28 = new org.team4.model.course.Course("hi!", date24, date25, "", "hi!");
        java.util.Date date29 = course28.getEndDate();
        java.lang.String str30 = course28.getProfessorEmail();
        java.lang.String str31 = course28.getProfessorEmail();
        org.team4.model.course.CourseTextBook courseTextBook33 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) dVD1, "", 0, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "hi!", (-1), course28, false);
        org.team4.model.course.Course course34 = courseTextBook33.getCourse();
        org.team4.model.items.decorator.ItemDecorator itemDecorator35 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook33);
        org.team4.model.course.Course course36 = courseTextBook33.getCourse();
        org.team4.model.course.Course course37 = courseTextBook33.getCourse();
        org.team4.model.user.Student student43 = new org.team4.model.user.Student("", "", "hi!", "");
        student43.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase46 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student43);
        java.lang.String str47 = student43.getEmail();
        student43.setValidated(true);
        courseTextBook33.makeCopies(student43);
        java.lang.String str51 = courseTextBook33.getPublisher();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(date29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(course34);
        org.junit.Assert.assertNotNull(course36);
        org.junit.Assert.assertNotNull(course37);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.course.CourseTextBook courseTextBook7 = courseTextBookBuilder6.build();
        org.team4.model.items.builder.BookBuilder bookBuilder9 = courseTextBookBuilder6.author("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:51 EDT 2024, dateDue=null}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(courseTextBook7);
        org.junit.Assert.assertNotNull(bookBuilder9);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.booktype("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder3.title("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("PayPal{email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=Wed May 01 18:27:45 EDT 2024}", "PayPal", "SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Wed May 01 18:27:52 EDT 2024, dateDue=Wed May 01 18:27:52 EDT 2024}", (int) (byte) 100, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished(10);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder5 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder7 = magazineBuilder5.issueNumber((-1));
        org.team4.model.items.builder.MagazineBuilder magazineBuilder9 = magazineBuilder7.issueNumber((int) '#');
        org.team4.model.items.builder.MagazineBuilder magazineBuilder11 = magazineBuilder9.publisher("User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertNotNull(magazineBuilder5);
        org.junit.Assert.assertNotNull(magazineBuilder7);
        org.junit.Assert.assertNotNull(magazineBuilder9);
        org.junit.Assert.assertNotNull(magazineBuilder11);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.team4.model.user.User user5 = new org.team4.model.user.User("SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}", "PayPal", true);
        java.lang.String str6 = user5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}" + "'", str6, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        java.lang.String str9 = book7.getAuthor();
        java.lang.String str10 = book7.getISBN();
        boolean boolean11 = book7.hasHardCopy();
        boolean boolean12 = book7.hasSoftCopy();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.team4.model.user.Student student6 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str7 = student6.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase8 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student6);
        student6.setType("User [email=, password=, name=hi!, type=, validated=false]");
        boolean boolean11 = student6.isValidated();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase12 = new org.team4.functionality.buy.ItemToPurchase((double) 100L, (org.team4.model.user.User) student6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        student5.setType("User [email=, password=, name=hi!, type=, validated=false]");
        boolean boolean10 = student5.isValidated();
        java.lang.String str11 = student5.getEmail();
        java.lang.String str12 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator9 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book7);
        int int10 = rentableItemDecorator9.getYearPublished();
        boolean boolean11 = rentableItemDecorator9.isRentable();
        boolean boolean12 = rentableItemDecorator9.isPurchasable();
        org.team4.model.items.Item item13 = rentableItemDecorator9.getItem();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(item13);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.lang.String str6 = course5.getProfessorEmail();
        java.util.Date date7 = course5.getStartDate();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter14 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str15 = subscribeNewsletter14.getEmail();
        java.util.Date date16 = subscribeNewsletter14.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter19 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str20 = subscribeNewsletter19.getEmail();
        java.util.Date date21 = subscribeNewsletter19.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter22 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date16, date21);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter29 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str30 = subscribeNewsletter29.getEmail();
        java.util.Date date31 = subscribeNewsletter29.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter34 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str35 = subscribeNewsletter34.getEmail();
        java.util.Date date36 = subscribeNewsletter34.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter37 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date31, date36);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter42 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str43 = subscribeNewsletter42.getEmail();
        java.util.Date date44 = subscribeNewsletter42.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter47 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str48 = subscribeNewsletter47.getEmail();
        java.util.Date date49 = subscribeNewsletter47.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter50 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date44, date49);
        org.team4.model.items.RentedItem rentedItem51 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=null}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date31, date44);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter52 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemPurchased{title='', email='hi!', datePurchased=null}", "User [email=, password=, name=hi!, type=, validated=false]", date16, date44);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean53 = course5.isStarted(date44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(date36);
// flaky:         org.junit.Assert.assertEquals(date36.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Wed May 01 18:27:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(date49);
// flaky:         org.junit.Assert.assertEquals(date49.toString(), "Wed May 01 18:27:52 EDT 2024");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("", 100, (int) (byte) -1, (double) (byte) 0, "Debit Card", true, false);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
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
        java.lang.String str20 = book7.getAuthor();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator21 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) book7);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator22 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book7);
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
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter7 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str8 = subscribeNewsletter7.getEmail();
        java.util.Date date9 = subscribeNewsletter7.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter12 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str13 = subscribeNewsletter12.getEmail();
        java.util.Date date14 = subscribeNewsletter12.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter15 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date9, date14);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter20 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str21 = subscribeNewsletter20.getEmail();
        java.util.Date date22 = subscribeNewsletter20.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter25 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str26 = subscribeNewsletter25.getEmail();
        java.util.Date date27 = subscribeNewsletter25.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter28 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date22, date27);
        org.team4.model.items.RentedItem rentedItem29 = new org.team4.model.items.RentedItem("Credit Card", "ItemPurchased{title='', email='', datePurchased=null}", date14, date22);
        java.util.Date date30 = null;
        rentedItem29.setDueDate(date30);
        java.util.Date date32 = rentedItem29.getRentDate();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter39 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str40 = subscribeNewsletter39.getEmail();
        java.util.Date date41 = subscribeNewsletter39.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter44 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str45 = subscribeNewsletter44.getEmail();
        java.util.Date date46 = subscribeNewsletter44.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter47 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date41, date46);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter52 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str53 = subscribeNewsletter52.getEmail();
        java.util.Date date54 = subscribeNewsletter52.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter57 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str58 = subscribeNewsletter57.getEmail();
        java.util.Date date59 = subscribeNewsletter57.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter60 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date54, date59);
        org.team4.model.items.RentedItem rentedItem61 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=null}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date41, date54);
        org.team4.model.course.Course course64 = new org.team4.model.course.Course("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", date32, date41, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.user.Student student70 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str71 = student70.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase72 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student70);
        student70.setType("User [email=, password=, name=hi!, type=, validated=false]");
        boolean boolean75 = student70.isValidated();
        java.lang.String str76 = student70.getEmail();
        course64.enrollStudent(student70);
        org.team4.model.user.Student student82 = new org.team4.model.user.Student("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal", "Credit Card", "");
        java.util.ArrayList<java.lang.String> strList83 = student82.getCourses();
        boolean boolean84 = course64.isEnrolled(student82);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(date27);
// flaky:         org.junit.Assert.assertEquals(date27.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(date41);
// flaky:         org.junit.Assert.assertEquals(date41.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(date46);
// flaky:         org.junit.Assert.assertEquals(date46.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(date54);
// flaky:         org.junit.Assert.assertEquals(date54.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertNotNull(date59);
// flaky:         org.junit.Assert.assertEquals(date59.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNull(strList83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
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
        boolean boolean19 = dVD1.isRentable();
        dVD1.setRentable(true);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator22 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) dVD1);
        org.team4.model.items.Magazine magazine25 = new org.team4.model.items.Magazine((org.team4.model.items.Item) purchasableItemDecorator22, "Mobile Wallet", (int) (byte) 0);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("ItemPurchased{title='Credit Card', email='Debit Card', datePurchased=Mon Apr 01 18:27:47 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal{email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}'}", "SubscribeNewsletter{title='ItemPurchased{title='', email='', datePurchased=null}', email='hi!', dateSubscribed=Wed May 01 18:27:52 EDT 2024, dateDue=Wed May 01 18:27:52 EDT 2024}", true);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.BookBuilder bookBuilder4 = bookBuilder2.author("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder6 = bookBuilder2.price((double) 1.0f);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = bookItemBuilder6.yearPublished((int) ' ');
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookBuilder4);
        org.junit.Assert.assertNotNull(bookItemBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
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
        java.util.Date date24 = null;
        java.util.Date date25 = null;
        org.team4.model.course.Course course28 = new org.team4.model.course.Course("hi!", date24, date25, "", "hi!");
        java.util.Date date29 = course28.getEndDate();
        java.lang.String str30 = course28.getProfessorEmail();
        java.lang.String str31 = course28.getProfessorEmail();
        org.team4.model.course.CourseTextBook courseTextBook33 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) dVD1, "", 0, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "hi!", (-1), course28, false);
        org.team4.model.course.Course course34 = courseTextBook33.getCourse();
        org.team4.model.items.decorator.ItemDecorator itemDecorator35 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook33);
        org.team4.model.user.Student student41 = new org.team4.model.user.Student("SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:48 EDT 2024, dateDue=null}', email='hi!', dateSubscribed=Mon Apr 01 18:27:51 EDT 2024, dateDue=Wed May 01 18:27:51 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}", "User [email=, password=, name=hi!, type=, validated=true]", "ItemPurchased{title='', email='hi!', datePurchased=null}", true);
        courseTextBook33.makeCopies(student41);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(date29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(course34);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished(10);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        int int4 = magazine3.getIssueNumber();
        int int5 = magazine3.getIssueNumber();
        int int6 = magazine3.getIssueNumber();
        magazine3.setPrice((double) 6987313L);
        double double9 = magazine3.getPrice();
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 6987313.0d + "'", double9 == 6987313.0d);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.quantity((int) (short) 100);
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder0.build();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator10 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook9);
        boolean boolean11 = purchasableItemDecorator10.isPurchasable();
        boolean boolean12 = purchasableItemDecorator10.isPurchasable();
        int int13 = purchasableItemDecorator10.getYearPublished();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(courseTextBook9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.quantity(100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDBuilder0.ISBN("PayPal{email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}'}");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter7 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str8 = subscribeNewsletter7.getEmail();
        java.util.Date date9 = subscribeNewsletter7.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter12 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str13 = subscribeNewsletter12.getEmail();
        java.util.Date date14 = subscribeNewsletter12.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter15 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date9, date14);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter20 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str21 = subscribeNewsletter20.getEmail();
        java.util.Date date22 = subscribeNewsletter20.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter25 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str26 = subscribeNewsletter25.getEmail();
        java.util.Date date27 = subscribeNewsletter25.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter28 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date22, date27);
        org.team4.model.items.RentedItem rentedItem29 = new org.team4.model.items.RentedItem("Credit Card", "ItemPurchased{title='', email='', datePurchased=null}", date14, date22);
        java.util.Date date30 = null;
        rentedItem29.setDueDate(date30);
        java.util.Date date32 = rentedItem29.getRentDate();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter39 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str40 = subscribeNewsletter39.getEmail();
        java.util.Date date41 = subscribeNewsletter39.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter44 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str45 = subscribeNewsletter44.getEmail();
        java.util.Date date46 = subscribeNewsletter44.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter47 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date41, date46);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter52 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str53 = subscribeNewsletter52.getEmail();
        java.util.Date date54 = subscribeNewsletter52.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter57 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str58 = subscribeNewsletter57.getEmail();
        java.util.Date date59 = subscribeNewsletter57.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter60 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date54, date59);
        org.team4.model.items.RentedItem rentedItem61 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=null}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date41, date54);
        org.team4.model.course.Course course64 = new org.team4.model.course.Course("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", date32, date41, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.user.Student student70 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str71 = student70.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase72 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student70);
        student70.setType("User [email=, password=, name=hi!, type=, validated=false]");
        boolean boolean75 = student70.isValidated();
        java.lang.String str76 = student70.getEmail();
        course64.enrollStudent(student70);
        student70.setType("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(date27);
// flaky:         org.junit.Assert.assertEquals(date27.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(date41);
// flaky:         org.junit.Assert.assertEquals(date41.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(date46);
// flaky:         org.junit.Assert.assertEquals(date46.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(date54);
// flaky:         org.junit.Assert.assertEquals(date54.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertNotNull(date59);
// flaky:         org.junit.Assert.assertEquals(date59.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        java.util.Date date2 = null;
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("", "", date2);
        java.lang.String str4 = itemPurchased3.toString();
        java.lang.String str5 = itemPurchased3.getTitle();
        java.lang.String str6 = itemPurchased3.getTitle();
        java.util.Date date7 = itemPurchased3.getDatePurchased();
        java.lang.String str8 = itemPurchased3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str4, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str8, "ItemPurchased{title='', email='', datePurchased=null}");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        org.team4.model.items.builder.BookBuilder bookBuilder11 = courseTextBookBuilder6.hasHardCopy(false);
        org.team4.model.items.builder.BookBuilder bookBuilder13 = courseTextBookBuilder6.edition((int) ' ');
        org.team4.model.course.CourseTextBook courseTextBook14 = courseTextBookBuilder6.build();
        org.team4.model.items.builder.BookBuilder bookBuilder16 = courseTextBookBuilder6.author("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:51 EDT 2024, dateDue=null}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNotNull(bookBuilder11);
        org.junit.Assert.assertNotNull(bookBuilder13);
        org.junit.Assert.assertNotNull(courseTextBook14);
        org.junit.Assert.assertNotNull(bookBuilder16);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.team4.model.user.Manager manager4 = new org.team4.model.user.Manager("Mobile Wallet", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:48 EDT 2024, dateDue=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished(10);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder5 = magazineBuilder0.issueNumber((int) (short) 0);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertNotNull(magazineBuilder5);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("Credit Card", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=null}", "hi!", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:47 EDT 2024, dateDue=Wed May 01 18:27:47 EDT 2024}", (long) (short) -1);
        long long6 = nonFaculty5.getUniversityID();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", (int) ' ', (int) '#', (double) 2844661L, "ItemPurchased{title='', email='hi!', datePurchased=null}", true, false);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder0.author("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.team4.model.items.BookRequest bookRequest6 = bookRequestBuilder5.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder5.ISBN("SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder10 = bookRequestBuilder5.title("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequest6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
        org.junit.Assert.assertNotNull(bookRequestBuilder10);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", (int) '4', 1);
        boolean boolean4 = creditCard3.isValid();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:43 EDT 2024, dateDue=Wed May 01 18:27:43 EDT 2024}", false);
        long long6 = nonFaculty5.getUniversityID();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        boolean boolean9 = book7.hasHardCopy();
        java.lang.String str10 = book7.toString();
        boolean boolean11 = book7.isPurchasable();
        org.team4.model.items.Magazine magazine14 = new org.team4.model.items.Magazine((org.team4.model.items.Item) book7, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:45 EDT 2024}", (int) (byte) 10);
        int int15 = book7.getQuantity();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}" + "'", str10, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder0.publisher("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.Book book11 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder13 = courseTextBookBuilder0.hasHardCopy(false);
        org.team4.model.items.Book book14 = courseTextBookBuilder0.build();
        org.team4.model.items.Item item15 = new org.team4.model.items.Item((org.team4.model.items.Item) book14);
        java.lang.String str16 = book14.getGenre();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(bookBuilder13);
        org.junit.Assert.assertNotNull(book14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.quantity((int) (short) 100);
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder0.build();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator10 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook9);
        org.team4.model.items.Item item11 = purchasableItemDecorator10.getItem();
        org.team4.model.items.Item item12 = purchasableItemDecorator10.getItem();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(courseTextBook9);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertNotNull(item12);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", (double) 10L);
        java.lang.String str4 = newsletter3.getTitle();
        java.lang.String str5 = newsletter3.getTitle();
        java.lang.String str6 = newsletter3.getLink();
        java.lang.String[] strArray14 = new java.lang.String[] { "ItemPurchased{title='', email='', datePurchased=null}", "SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        org.team4.model.user.Faculty faculty17 = new org.team4.model.user.Faculty("Mobile Wallet", "hi!", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "Credit Card", 1L, strList15);
        long long18 = faculty17.getFacultyID();
        faculty17.setFacultyID((long) 10);
        java.util.ArrayList<java.lang.String> strList21 = faculty17.getCourses();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase22 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) faculty17);
        boolean boolean23 = faculty17.isValidated();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str4, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str5, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str6, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        org.team4.model.user.Student student10 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str11 = student10.getType();
        course5.enrollStudent(student10);
        java.lang.String str13 = course5.getProfessorEmail();
        java.lang.String str14 = course5.getProfessorEmail();
        java.lang.String str15 = course5.getProfessorEmail();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
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
        book7.setPrice((double) 0L);
        java.lang.String str11 = book7.getISBN();
        org.team4.model.items.Item item12 = new org.team4.model.items.Item((org.team4.model.items.Item) book7);
        org.team4.model.user.NonFaculty nonFaculty17 = new org.team4.model.user.NonFaculty("hi!", "hi!", "hi!", "");
        nonFaculty17.setUniversityID((long) (short) 100);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase20 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) book7, (org.team4.model.user.User) nonFaculty17);
        org.team4.model.items.Item item21 = itemToPurchase20.getItem();
        java.lang.String str22 = item21.getISBN();
        item21.setQuantity((int) (short) 1);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
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
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder21 = bookBuilder18.ISBN("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder23 = bookBuilder18.quantity((int) '4');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder25 = bookItemBuilder23.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:43 EDT 2024, dateDue=Wed May 01 18:27:43 EDT 2024}");
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
        org.junit.Assert.assertNotNull(bookItemBuilder21);
        org.junit.Assert.assertNotNull(bookItemBuilder23);
        org.junit.Assert.assertNotNull(bookItemBuilder25);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:45 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=Wed May 01 18:27:45 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}", true);
        long long6 = manager5.getManagerID();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        java.lang.String str7 = itemToPurchase6.toString();
        double double8 = itemToPurchase6.getAmount();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        boolean boolean11 = mobileWallet10.isValid();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete12 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.items.Item item13 = purchaseComplete12.getItem();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str7, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished(10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder4 = magazineBuilder0.title("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.yearPublished((int) '#');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineItemBuilder6.title("Credit Card");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder10 = magazineItemBuilder8.quantity(100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder12 = magazineItemBuilder10.yearPublished((int) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder14 = magazineItemBuilder12.price((double) 9931409L);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineItemBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
        org.junit.Assert.assertNotNull(magazineItemBuilder10);
        org.junit.Assert.assertNotNull(magazineItemBuilder12);
        org.junit.Assert.assertNotNull(magazineItemBuilder14);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getEndDate();
        java.lang.String str7 = course5.getProfessorEmail();
        java.lang.String str8 = course5.getProfessorEmail();
        org.team4.model.user.Student student14 = new org.team4.model.user.Student("", "", "hi!", "");
        student14.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase17 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student14);
        java.lang.String str18 = student14.getEmail();
        course5.enrollStudent(student14);
        java.lang.String str20 = course5.getCourseName();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter25 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str26 = subscribeNewsletter25.getEmail();
        java.util.Date date27 = subscribeNewsletter25.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter34 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str35 = subscribeNewsletter34.getEmail();
        java.util.Date date36 = subscribeNewsletter34.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter39 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str40 = subscribeNewsletter39.getEmail();
        java.util.Date date41 = subscribeNewsletter39.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter42 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date36, date41);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter47 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str48 = subscribeNewsletter47.getEmail();
        java.util.Date date49 = subscribeNewsletter47.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter52 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str53 = subscribeNewsletter52.getEmail();
        java.util.Date date54 = subscribeNewsletter52.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter55 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date49, date54);
        org.team4.model.items.RentedItem rentedItem56 = new org.team4.model.items.RentedItem("Credit Card", "ItemPurchased{title='', email='', datePurchased=null}", date41, date49);
        org.team4.model.items.RentedItem rentedItem57 = new org.team4.model.items.RentedItem("hi!", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date27, date41);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean58 = course5.isEnded(date27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(date27);
// flaky:         org.junit.Assert.assertEquals(date27.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(date36);
// flaky:         org.junit.Assert.assertEquals(date36.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(date41);
// flaky:         org.junit.Assert.assertEquals(date41.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(date49);
// flaky:         org.junit.Assert.assertEquals(date49.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(date54);
// flaky:         org.junit.Assert.assertEquals(date54.toString(), "Wed May 01 18:27:53 EDT 2024");
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.team4.model.user.User user4 = new org.team4.model.user.User("", "hi!", "PayPal", "");
        user4.setPassword("");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getEndDate();
        java.lang.String str7 = course5.getProfessorEmail();
        java.lang.String str8 = course5.getProfessorEmail();
        org.team4.model.user.Student student13 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean14 = course5.isEnrolled(student13);
        student13.setEmail("");
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
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
        boolean boolean19 = dVD1.isRentable();
        dVD1.setRentable(true);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator22 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) dVD1);
        org.team4.model.items.DVD dVD25 = new org.team4.model.items.DVD((org.team4.model.items.Item) dVD1, "hi!", (double) (byte) 0);
        java.util.Date date32 = null;
        java.util.Date date33 = null;
        org.team4.model.course.Course course36 = new org.team4.model.course.Course("hi!", date32, date33, "", "hi!");
        java.util.Date date37 = course36.getEndDate();
        java.lang.String str38 = course36.getProfessorEmail();
        java.lang.String str39 = course36.getProfessorEmail();
        org.team4.model.user.Student student45 = new org.team4.model.user.Student("", "", "hi!", "");
        student45.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase48 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student45);
        java.lang.String str49 = student45.getEmail();
        course36.enrollStudent(student45);
        java.lang.String str51 = course36.getCourseName();
        java.util.Date date52 = course36.getEndDate();
        org.team4.model.user.Student student58 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str59 = student58.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase60 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student58);
        student58.setType("User [email=, password=, name=hi!, type=, validated=false]");
        boolean boolean63 = student58.isValidated();
        java.lang.String str64 = student58.getEmail();
        student58.setPassword("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:43 EDT 2024, dateDue=Wed May 01 18:27:43 EDT 2024}");
        course36.enrollStudent(student58);
        org.team4.model.course.CourseTextBook courseTextBook69 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) dVD1, "SubscribeNewsletter{title='ItemPurchased{title='', email='', datePurchased=null}', email='hi!', dateSubscribed=Wed May 01 18:27:52 EDT 2024, dateDue=Wed May 01 18:27:52 EDT 2024}", (int) ' ', "SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Wed May 01 18:27:52 EDT 2024, dateDue=Wed May 01 18:27:52 EDT 2024}", "User [email=User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=User [email=, password=, name=hi!, type=, validated=false], type=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, validated=false], password=PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:48 EDT 2024}, validated=false]", (int) (short) 100, course36, true);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(date37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNull(date52);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder2 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder2.issueNumber((int) '4');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder2.quantity(10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineBuilder2.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:51 EDT 2024, dateDue=null}");
        org.junit.Assert.assertNotNull(magazineBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        book7.setPrice((double) 0L);
        java.lang.String str11 = book7.getISBN();
        org.team4.model.items.Item item12 = new org.team4.model.items.Item((org.team4.model.items.Item) book7);
        org.team4.model.user.NonFaculty nonFaculty17 = new org.team4.model.user.NonFaculty("hi!", "hi!", "hi!", "");
        nonFaculty17.setUniversityID((long) (short) 100);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase20 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) book7, (org.team4.model.user.User) nonFaculty17);
        org.team4.model.items.Item item21 = itemToPurchase20.getItem();
        item21.setQuantity((int) 'a');
        item21.setRentable(false);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(item21);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        book7.setPrice((double) 0L);
        java.lang.String str11 = book7.getISBN();
        org.team4.model.items.Item item12 = new org.team4.model.items.Item((org.team4.model.items.Item) book7);
        org.team4.model.user.NonFaculty nonFaculty17 = new org.team4.model.user.NonFaculty("hi!", "hi!", "hi!", "");
        nonFaculty17.setUniversityID((long) (short) 100);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase20 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) book7, (org.team4.model.user.User) nonFaculty17);
        org.team4.model.items.Item item21 = itemToPurchase20.getItem();
        org.team4.model.items.Magazine magazine24 = new org.team4.model.items.Magazine(item21, "PayPal", (-1));
        magazine24.setRentable(true);
        int int27 = magazine24.getIssueNumber();
        int int28 = magazine24.getIssueNumber();
        int int29 = magazine24.getIssueNumber();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(item21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        java.util.Date date2 = null;
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("", "hi!", date2);
        java.lang.String str4 = itemPurchased3.getTitle();
        java.lang.String str5 = itemPurchased3.toString();
        java.util.Date date6 = itemPurchased3.getDatePurchased();
        java.lang.String str7 = itemPurchased3.toString();
        java.lang.String str8 = itemPurchased3.toString();
        java.util.Date date9 = itemPurchased3.getDatePurchased();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str5, "ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str7, "ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str8, "ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.junit.Assert.assertNull(date9);
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
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder0.publisher("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.Book book11 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder13 = courseTextBookBuilder0.yearPublished(10);
        org.team4.model.items.builder.BookBuilder bookBuilder15 = courseTextBookBuilder0.edition((int) (short) -1);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(bookItemBuilder13);
        org.junit.Assert.assertNotNull(bookBuilder15);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.paymentmodes.CreditCard creditCard10 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) creditCard10);
        org.team4.model.items.Item item12 = purchaseComplete11.getItem();
        org.team4.model.items.Newsletter newsletter13 = purchaseComplete11.getNewsletter();
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(newsletter13);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:48 EDT 2024, dateDue=null}', email='hi!', dateSubscribed=Mon Apr 01 18:27:51 EDT 2024, dateDue=Wed May 01 18:27:51 EDT 2024}", "User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=User [email=, password=, name=hi!, type=, validated=false], type=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, validated=false]", "");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        boolean boolean9 = book7.hasHardCopy();
        boolean boolean10 = book7.hasHardCopy();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder11 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder13 = courseTextBookBuilder11.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder15 = courseTextBookBuilder11.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder17 = courseTextBookBuilder11.isVirtual(true);
        org.team4.model.items.Book book18 = courseTextBookBuilder17.build();
        int int19 = book18.getNoOfPages();
        boolean boolean20 = book18.hasHardCopy();
        boolean boolean21 = book18.hasHardCopy();
        org.team4.model.items.DVD dVD24 = new org.team4.model.items.DVD((org.team4.model.items.Item) book18, "Mobile Wallet", (double) 7241236L);
        java.lang.String str25 = book18.toString();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator26 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) book18);
        boolean boolean27 = purchasableItemDecorator26.isPurchasable();
        boolean boolean28 = book7.equals((java.lang.Object) purchasableItemDecorator26);
        boolean boolean29 = purchasableItemDecorator26.isPurchasable();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookBuilder13);
        org.junit.Assert.assertNotNull(bookItemBuilder15);
        org.junit.Assert.assertNotNull(courseTextBookBuilder17);
        org.junit.Assert.assertNotNull(book18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}" + "'", str25, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.items.Newsletter newsletter12 = itemToPurchase7.getNewsletter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter12);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter3 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str4 = subscribeNewsletter3.getTitle();
        java.lang.String str5 = subscribeNewsletter3.getTitle();
        java.util.Date date6 = subscribeNewsletter3.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter13 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str14 = subscribeNewsletter13.getEmail();
        java.util.Date date15 = subscribeNewsletter13.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter18 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str19 = subscribeNewsletter18.getEmail();
        java.util.Date date20 = subscribeNewsletter18.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter21 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date15, date20);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter26 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str27 = subscribeNewsletter26.getEmail();
        java.util.Date date28 = subscribeNewsletter26.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter31 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str32 = subscribeNewsletter31.getEmail();
        java.util.Date date33 = subscribeNewsletter31.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter34 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date28, date33);
        org.team4.model.items.RentedItem rentedItem35 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=null}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date15, date28);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter42 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str43 = subscribeNewsletter42.getEmail();
        java.util.Date date44 = subscribeNewsletter42.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter47 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str48 = subscribeNewsletter47.getEmail();
        java.util.Date date49 = subscribeNewsletter47.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter50 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date44, date49);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter55 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str56 = subscribeNewsletter55.getEmail();
        java.util.Date date57 = subscribeNewsletter55.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter60 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str61 = subscribeNewsletter60.getEmail();
        java.util.Date date62 = subscribeNewsletter60.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter63 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date57, date62);
        org.team4.model.items.RentedItem rentedItem64 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=null}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date44, date57);
        rentedItem35.setDueDate(date57);
        java.lang.String str66 = rentedItem35.getTitle();
        java.util.Date date67 = rentedItem35.getDueDate();
        org.team4.model.course.Course course70 = new org.team4.model.course.Course("ItemPurchased{title='', email='', datePurchased=null}", date6, date67, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(date33);
// flaky:         org.junit.Assert.assertEquals(date33.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(date49);
// flaky:         org.junit.Assert.assertEquals(date49.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(date57);
// flaky:         org.junit.Assert.assertEquals(date57.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNotNull(date62);
// flaky:         org.junit.Assert.assertEquals(date62.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str66, "ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.junit.Assert.assertNotNull(date67);
// flaky:         org.junit.Assert.assertEquals(date67.toString(), "Wed May 01 18:27:53 EDT 2024");
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.BookBuilder bookBuilder4 = bookBuilder2.hasHardCopy(false);
        org.team4.model.items.builder.BookBuilder bookBuilder6 = bookBuilder4.noOfPages((int) (short) -1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = bookBuilder4.price((double) 0L);
        org.team4.model.items.builder.BookBuilder bookBuilder10 = bookBuilder4.edition((-1));
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = bookBuilder10.yearPublished((int) (short) 1);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(bookItemBuilder12);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.title("hi!");
        org.team4.model.items.DVD dVD5 = dVDBuilder0.build();
        org.team4.model.user.Student student11 = new org.team4.model.user.Student("", "", "hi!", "");
        student11.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase14 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student11);
        java.lang.String str15 = student11.getEmail();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase16 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) dVD5, (org.team4.model.user.User) student11);
        student11.setValidated(false);
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVD5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder4 = magazineBuilder0.quantity(0);
        org.team4.model.items.Magazine magazine5 = magazineBuilder0.build();
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineItemBuilder4);
        org.junit.Assert.assertNotNull(magazine5);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.team4.model.user.Manager manager4 = new org.team4.model.user.Manager("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=Wed May 01 18:27:45 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:45 EDT 2024}");
        long long5 = manager4.getManagerID();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        java.util.Date date14 = null;
        java.util.Date date15 = null;
        org.team4.model.course.Course course18 = new org.team4.model.course.Course("hi!", date14, date15, "", "hi!");
        java.util.Date date19 = course18.getEndDate();
        java.lang.String str20 = course18.getProfessorEmail();
        java.lang.String str21 = course18.getProfessorEmail();
        org.team4.model.user.Student student27 = new org.team4.model.user.Student("", "", "hi!", "");
        student27.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase30 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student27);
        java.lang.String str31 = student27.getEmail();
        course18.enrollStudent(student27);
        org.team4.model.user.Student student37 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str38 = student37.getType();
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        student37.setCourses(strList41);
        student27.setCourses(strList41);
        org.team4.model.user.Faculty faculty45 = new org.team4.model.user.Faculty("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "User [email=, password=, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}", (long) (short) 100, strList41);
        org.team4.model.user.Student student46 = new org.team4.model.user.Student("User [email=, password=, name=hi!, type=, validated=true]", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "", "ItemPurchased{title='', email='hi!', datePurchased=null}", strList41);
        org.team4.model.user.Student student47 = new org.team4.model.user.Student("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}", "SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", strList41);
        java.util.ArrayList<java.lang.String> strList48 = student47.getCourses();
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strList48);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
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
        java.util.Date date31 = rentedItem28.getRentDate();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter38 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str39 = subscribeNewsletter38.getEmail();
        java.util.Date date40 = subscribeNewsletter38.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter43 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str44 = subscribeNewsletter43.getEmail();
        java.util.Date date45 = subscribeNewsletter43.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter46 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date40, date45);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter51 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str52 = subscribeNewsletter51.getEmail();
        java.util.Date date53 = subscribeNewsletter51.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter56 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str57 = subscribeNewsletter56.getEmail();
        java.util.Date date58 = subscribeNewsletter56.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter59 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date53, date58);
        org.team4.model.items.RentedItem rentedItem60 = new org.team4.model.items.RentedItem("Credit Card", "ItemPurchased{title='', email='', datePurchased=null}", date45, date53);
        rentedItem28.setDueDate(date45);
        rentedItem28.setISBN("User [email=User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=User [email=, password=, name=hi!, type=, validated=false], type=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, validated=false], password=PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:48 EDT 2024}, validated=false]");
        rentedItem28.setTitle("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}");
        java.lang.String str66 = rentedItem28.getISBN();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(date26);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(date40);
// flaky:         org.junit.Assert.assertEquals(date40.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(date45);
// flaky:         org.junit.Assert.assertEquals(date45.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(date53);
// flaky:         org.junit.Assert.assertEquals(date53.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(date58);
// flaky:         org.junit.Assert.assertEquals(date58.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "User [email=User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=User [email=, password=, name=hi!, type=, validated=false], type=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, validated=false], password=PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:48 EDT 2024}, validated=false]" + "'", str66, "User [email=User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=User [email=, password=, name=hi!, type=, validated=false], type=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, validated=false], password=PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:48 EDT 2024}, validated=false]");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
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
        java.util.Date date24 = null;
        java.util.Date date25 = null;
        org.team4.model.course.Course course28 = new org.team4.model.course.Course("hi!", date24, date25, "", "hi!");
        java.util.Date date29 = course28.getEndDate();
        java.lang.String str30 = course28.getProfessorEmail();
        java.lang.String str31 = course28.getProfessorEmail();
        org.team4.model.course.CourseTextBook courseTextBook33 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) dVD1, "", 0, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "hi!", (-1), course28, false);
        org.team4.model.course.Course course34 = courseTextBook33.getCourse();
        java.lang.String str35 = courseTextBook33.getPublisher();
        java.util.List<org.team4.model.user.Student> studentList36 = courseTextBook33.getStudentsWithCopies();
        org.team4.model.course.Course course37 = courseTextBook33.getCourse();
        java.util.Date date39 = null;
        java.util.Date date40 = null;
        org.team4.model.course.Course course43 = new org.team4.model.course.Course("", date39, date40, "", "hi!");
        java.util.Date date45 = null;
        java.util.Date date46 = null;
        org.team4.model.course.Course course49 = new org.team4.model.course.Course("hi!", date45, date46, "", "hi!");
        java.util.Date date50 = course49.getEndDate();
        java.lang.String str51 = course49.getProfessorEmail();
        java.lang.String str52 = course49.getProfessorEmail();
        org.team4.model.user.Student student58 = new org.team4.model.user.Student("", "", "hi!", "");
        student58.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase61 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student58);
        java.lang.String str62 = student58.getEmail();
        course49.enrollStudent(student58);
        boolean boolean64 = course43.isEnrolled(student58);
        courseTextBook33.makeCopies(student58);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(date29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(course34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(studentList36);
        org.junit.Assert.assertNotNull(course37);
        org.junit.Assert.assertNull(date50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
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
        dVD1.setPrice((double) (byte) 0);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("PayPal{email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}'}", "Debit Card", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}", true);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        java.lang.String str4 = dVD1.getGenre();
        org.team4.model.items.Book book12 = new org.team4.model.items.Book((org.team4.model.items.Item) dVD1, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}", (int) (short) 100, "SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}", 0, true, false);
        java.lang.String str13 = book12.getTitle();
        java.lang.String str14 = book12.getAuthor();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}" + "'", str14, "SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}", (double) (short) 0);
        double double4 = newsletter3.getPrice();
        org.team4.model.user.User user11 = new org.team4.model.user.User("", "hi!", "hi!", "hi!", false);
        user11.setType("");
        user11.setName("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase16 = new org.team4.functionality.buy.ItemToPurchase(1.0d, user11);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase17 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, user11);
        double double18 = newsletter3.getPrice();
        java.lang.String str19 = newsletter3.getTitle();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str19, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.team4.functionality.buy.ItemPurchased itemPurchased2 = new org.team4.functionality.buy.ItemPurchased("PayPal", "ItemPurchased{title='', email='', datePurchased=null}");
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("Credit Card", "User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:45 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=Wed May 01 18:27:45 EDT 2024}, validated=false]", "SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}", "PayPal{email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}'}");
        long long5 = faculty4.getFacultyID();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:48 EDT 2024}", (int) (byte) 100, (int) (byte) 1);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.team4.model.user.Manager manager6 = new org.team4.model.user.Manager("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:45 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=Wed May 01 18:27:45 EDT 2024}", false);
        java.lang.String str7 = manager6.toString();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase8 = new org.team4.functionality.buy.ItemToPurchase((double) (short) -1, (org.team4.model.user.User) manager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:45 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=Wed May 01 18:27:45 EDT 2024}, validated=false]" + "'", str7, "User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:45 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=Wed May 01 18:27:45 EDT 2024}, validated=false]");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.Book book5 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder7 = courseTextBookBuilder0.quantity(0);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(bookItemBuilder7);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        java.lang.String[] strArray7 = new java.lang.String[] { "ItemPurchased{title='', email='', datePurchased=null}", "SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        org.team4.model.user.Faculty faculty10 = new org.team4.model.user.Faculty("Mobile Wallet", "hi!", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "Credit Card", 1L, strList8);
        long long11 = faculty10.getFacultyID();
        faculty10.setFacultyID((long) 10);
        java.util.ArrayList<java.lang.String> strList14 = faculty10.getCourses();
        long long15 = faculty10.getFacultyID();
        java.util.ArrayList<java.lang.String> strList16 = faculty10.getCourses();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder4 = magazineBuilder0.price((double) 4751120L);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder6 = magazineBuilder0.publisher("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=Wed May 01 18:27:45 EDT 2024}");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineItemBuilder4);
        org.junit.Assert.assertNotNull(magazineBuilder6);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
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
        java.lang.String str29 = processPayment28.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str9, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str10, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str11, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("PayPal", 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.user.User user12 = purchaseComplete11.getUser();
        long long13 = purchaseComplete11.getPurchaseID();
        double double14 = purchaseComplete11.getAmount();
        org.team4.model.items.Item item15 = purchaseComplete11.getItem();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNotNull(user12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 664591L + "'", long13 == 664591L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNull(item15);
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
        int int8 = book7.getNoOfPages();
        boolean boolean9 = book7.hasHardCopy();
        boolean boolean10 = book7.hasHardCopy();
        org.team4.model.items.DVD dVD13 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Mobile Wallet", (double) 7241236L);
        java.util.Date date16 = null;
        java.util.Date date17 = null;
        org.team4.model.course.Course course20 = new org.team4.model.course.Course("hi!", date16, date17, "", "hi!");
        java.util.Date date21 = course20.getEndDate();
        java.lang.String str22 = course20.getProfessorEmail();
        java.lang.String str23 = course20.getProfessorEmail();
        org.team4.model.user.Student student28 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean29 = course20.isEnrolled(student28);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase30 = new org.team4.functionality.buy.ItemToPurchase(100.0d, (org.team4.model.user.User) student28);
        student28.setValidated(true);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase33 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) dVD13, (org.team4.model.user.User) student28);
        java.lang.String str34 = itemToPurchase33.toString();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder0.author("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.team4.model.items.BookRequest bookRequest6 = bookRequestBuilder5.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder5.ISBN("SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}");
        org.team4.model.items.BookRequest bookRequest9 = bookRequestBuilder5.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder11 = bookRequestBuilder5.title("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:47 EDT 2024, dateDue=Wed May 01 18:27:47 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder13 = bookRequestBuilder5.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:47 EDT 2024, dateDue=Wed May 01 18:27:47 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder15 = bookRequestBuilder13.author("User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequest6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
        org.junit.Assert.assertNotNull(bookRequest9);
        org.junit.Assert.assertNotNull(bookRequestBuilder11);
        org.junit.Assert.assertNotNull(bookRequestBuilder13);
        org.junit.Assert.assertNotNull(bookRequestBuilder15);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.team4.model.user.Student student8 = new org.team4.model.user.Student("", "", "hi!", "");
        java.util.ArrayList<java.lang.String> strList9 = student8.getCourses();
        org.team4.model.user.Student student24 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str25 = student24.getType();
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        student24.setCourses(strList28);
        org.team4.model.user.Faculty faculty31 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", (long) (byte) -1, strList28);
        org.team4.model.user.Faculty faculty32 = new org.team4.model.user.Faculty("Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "Debit Card", "Credit Card", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:43 EDT 2024, dateDue=Wed May 01 18:27:43 EDT 2024}", (long) '4', strList28);
        student8.setCourses(strList28);
        org.team4.model.user.Student student34 = new org.team4.model.user.Student("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=Wed May 01 18:27:45 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:47 EDT 2024, dateDue=Wed May 01 18:27:47 EDT 2024}", "User [email=, password=, name=hi!, type=, validated=true]", "SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Wed May 01 18:27:52 EDT 2024, dateDue=Wed May 01 18:27:52 EDT 2024}", strList28);
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}", 0, (int) (byte) 1);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
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
        org.team4.model.items.RentedItem rentedItem30 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=null}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date10, date23);
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
        org.team4.model.items.RentedItem rentedItem59 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=null}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date39, date52);
        rentedItem30.setDueDate(date52);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter67 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str68 = subscribeNewsletter67.getEmail();
        java.util.Date date69 = subscribeNewsletter67.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter72 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str73 = subscribeNewsletter72.getEmail();
        java.util.Date date74 = subscribeNewsletter72.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter75 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date69, date74);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter80 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str81 = subscribeNewsletter80.getEmail();
        java.util.Date date82 = subscribeNewsletter80.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter85 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str86 = subscribeNewsletter85.getEmail();
        java.util.Date date87 = subscribeNewsletter85.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter88 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date82, date87);
        org.team4.model.items.RentedItem rentedItem89 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=null}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date69, date82);
        org.team4.model.items.RentedItem rentedItem90 = new org.team4.model.items.RentedItem("", "hi!", date52, date69);
        rentedItem90.setISBN("Credit Card");
        rentedItem90.setISBN("");
        java.lang.String str95 = rentedItem90.getTitle();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(date52);
// flaky:         org.junit.Assert.assertEquals(date52.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(date57);
// flaky:         org.junit.Assert.assertEquals(date57.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertNotNull(date69);
// flaky:         org.junit.Assert.assertEquals(date69.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertNotNull(date74);
// flaky:         org.junit.Assert.assertEquals(date74.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertNotNull(date82);
// flaky:         org.junit.Assert.assertEquals(date82.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertNotNull(date87);
// flaky:         org.junit.Assert.assertEquals(date87.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder6.quantity((-1));
        org.team4.model.items.builder.BookBuilder bookBuilder12 = courseTextBookBuilder6.hasHardCopy(false);
        org.team4.model.items.builder.BookBuilder bookBuilder14 = courseTextBookBuilder6.genre("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(bookBuilder12);
        org.junit.Assert.assertNotNull(bookBuilder14);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder0.publisher("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder12 = courseTextBookBuilder0.noOfPages(1);
        java.util.Date date14 = null;
        java.util.Date date15 = null;
        org.team4.model.course.Course course18 = new org.team4.model.course.Course("hi!", date14, date15, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder19 = courseTextBookBuilder0.course(course18);
        java.util.Date date20 = course18.getEndDate();
        org.team4.model.user.Student student25 = new org.team4.model.user.Student("", "", "hi!", "");
        student25.setEmail("");
        course18.enrollStudent(student25);
        java.lang.String str29 = course18.getCourseName();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(bookBuilder12);
        org.junit.Assert.assertNotNull(courseTextBookBuilder19);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("Debit Card", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=Wed May 01 18:27:45 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:47 EDT 2024, dateDue=Wed May 01 18:27:47 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:48 EDT 2024}", false);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
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
        java.util.Date date24 = null;
        java.util.Date date25 = null;
        org.team4.model.course.Course course28 = new org.team4.model.course.Course("hi!", date24, date25, "", "hi!");
        java.util.Date date29 = course28.getEndDate();
        java.lang.String str30 = course28.getProfessorEmail();
        java.lang.String str31 = course28.getProfessorEmail();
        org.team4.model.course.CourseTextBook courseTextBook33 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) dVD1, "", 0, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "hi!", (-1), course28, false);
        org.team4.model.course.Course course34 = courseTextBook33.getCourse();
        java.lang.String str35 = course34.getCourseName();
        java.util.Date date36 = course34.getEndDate();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter43 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str44 = subscribeNewsletter43.getEmail();
        java.util.Date date45 = subscribeNewsletter43.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter48 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str49 = subscribeNewsletter48.getEmail();
        java.util.Date date50 = subscribeNewsletter48.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter51 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date45, date50);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter56 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str57 = subscribeNewsletter56.getEmail();
        java.util.Date date58 = subscribeNewsletter56.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter61 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str62 = subscribeNewsletter61.getEmail();
        java.util.Date date63 = subscribeNewsletter61.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter64 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date58, date63);
        org.team4.model.items.RentedItem rentedItem65 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=null}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date45, date58);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter72 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str73 = subscribeNewsletter72.getEmail();
        java.util.Date date74 = subscribeNewsletter72.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter77 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str78 = subscribeNewsletter77.getEmail();
        java.util.Date date79 = subscribeNewsletter77.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter80 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date74, date79);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter85 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str86 = subscribeNewsletter85.getEmail();
        java.util.Date date87 = subscribeNewsletter85.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter90 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str91 = subscribeNewsletter90.getEmail();
        java.util.Date date92 = subscribeNewsletter90.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter93 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date87, date92);
        org.team4.model.items.RentedItem rentedItem94 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=null}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date74, date87);
        rentedItem65.setDueDate(date87);
        java.util.Date date96 = rentedItem65.getDueDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean97 = course34.isStarted(date96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(date29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(course34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNull(date36);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(date45);
// flaky:         org.junit.Assert.assertEquals(date45.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(date50);
// flaky:         org.junit.Assert.assertEquals(date50.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(date58);
// flaky:         org.junit.Assert.assertEquals(date58.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertNotNull(date63);
// flaky:         org.junit.Assert.assertEquals(date63.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertNotNull(date74);
// flaky:         org.junit.Assert.assertEquals(date74.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertNotNull(date79);
// flaky:         org.junit.Assert.assertEquals(date79.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertNotNull(date87);
// flaky:         org.junit.Assert.assertEquals(date87.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "hi!" + "'", str91, "hi!");
        org.junit.Assert.assertNotNull(date92);
// flaky:         org.junit.Assert.assertEquals(date92.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertNotNull(date96);
// flaky:         org.junit.Assert.assertEquals(date96.toString(), "Wed May 01 18:27:53 EDT 2024");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished(10);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder5 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder7 = magazineBuilder5.issueNumber((-1));
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder9 = magazineBuilder7.ISBN("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder11 = magazineItemBuilder9.quantity((int) (short) 100);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertNotNull(magazineBuilder5);
        org.junit.Assert.assertNotNull(magazineBuilder7);
        org.junit.Assert.assertNotNull(magazineItemBuilder9);
        org.junit.Assert.assertNotNull(magazineItemBuilder11);
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
        org.team4.model.items.builder.BookBuilder bookBuilder9 = courseTextBookBuilder6.author("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookBuilder bookBuilder11 = bookBuilder9.author("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:43 EDT 2024, dateDue=Wed May 01 18:27:43 EDT 2024}");
        org.team4.model.items.builder.BookBuilder bookBuilder13 = bookBuilder11.genre("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(bookBuilder9);
        org.junit.Assert.assertNotNull(bookBuilder11);
        org.junit.Assert.assertNotNull(bookBuilder13);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter4 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.util.Date date5 = null;
        subscribeNewsletter4.setDateDue(date5);
        java.lang.String str7 = subscribeNewsletter4.toString();
        java.lang.String str8 = subscribeNewsletter4.getTitle();
        java.util.Date date9 = subscribeNewsletter4.getDateSubscribed();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter18 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str19 = subscribeNewsletter18.getEmail();
        java.util.Date date20 = subscribeNewsletter18.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter23 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str24 = subscribeNewsletter23.getEmail();
        java.util.Date date25 = subscribeNewsletter23.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter26 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date20, date25);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter31 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str32 = subscribeNewsletter31.getEmail();
        java.util.Date date33 = subscribeNewsletter31.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter36 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str37 = subscribeNewsletter36.getEmail();
        java.util.Date date38 = subscribeNewsletter36.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter39 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date33, date38);
        org.team4.model.items.RentedItem rentedItem40 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=null}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date20, date33);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter47 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str48 = subscribeNewsletter47.getEmail();
        java.util.Date date49 = subscribeNewsletter47.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter52 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str53 = subscribeNewsletter52.getEmail();
        java.util.Date date54 = subscribeNewsletter52.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter55 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date49, date54);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter60 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str61 = subscribeNewsletter60.getEmail();
        java.util.Date date62 = subscribeNewsletter60.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter65 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str66 = subscribeNewsletter65.getEmail();
        java.util.Date date67 = subscribeNewsletter65.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter68 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date62, date67);
        org.team4.model.items.RentedItem rentedItem69 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=null}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date49, date62);
        rentedItem40.setDueDate(date62);
        java.util.Date date71 = rentedItem40.getDueDate();
        org.team4.functionality.buy.ItemPurchased itemPurchased72 = new org.team4.functionality.buy.ItemPurchased("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "", date71);
        org.team4.model.items.RentedItem rentedItem73 = new org.team4.model.items.RentedItem("SubscribeNewsletter{title='ItemPurchased{title='', email='', datePurchased=null}', email='hi!', dateSubscribed=Wed May 01 18:27:52 EDT 2024, dateDue=Wed May 01 18:27:52 EDT 2024}", "User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=User [email=, password=, name=hi!, type=, validated=false], type=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, validated=false]", date9, date71);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:53 EDT 2024, dateDue=null}" + "'", str7, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:53 EDT 2024, dateDue=null}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Apr 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(date33);
// flaky:         org.junit.Assert.assertEquals(date33.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(date38);
// flaky:         org.junit.Assert.assertEquals(date38.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(date49);
// flaky:         org.junit.Assert.assertEquals(date49.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(date54);
// flaky:         org.junit.Assert.assertEquals(date54.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNotNull(date62);
// flaky:         org.junit.Assert.assertEquals(date62.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertNotNull(date67);
// flaky:         org.junit.Assert.assertEquals(date67.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertNotNull(date71);
// flaky:         org.junit.Assert.assertEquals(date71.toString(), "Wed May 01 18:27:53 EDT 2024");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        java.util.Date date19 = null;
        java.util.Date date20 = null;
        org.team4.model.course.Course course23 = new org.team4.model.course.Course("hi!", date19, date20, "", "hi!");
        java.util.Date date24 = course23.getEndDate();
        java.lang.String str25 = course23.getProfessorEmail();
        java.lang.String str26 = course23.getProfessorEmail();
        org.team4.model.user.Student student32 = new org.team4.model.user.Student("", "", "hi!", "");
        student32.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase35 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student32);
        java.lang.String str36 = student32.getEmail();
        course23.enrollStudent(student32);
        org.team4.model.user.Student student42 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str43 = student42.getType();
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        student42.setCourses(strList46);
        student32.setCourses(strList46);
        org.team4.model.user.Faculty faculty50 = new org.team4.model.user.Faculty("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "User [email=, password=, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}", (long) (short) 100, strList46);
        org.team4.model.user.Student student51 = new org.team4.model.user.Student("User [email=, password=, name=hi!, type=, validated=true]", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "", "ItemPurchased{title='', email='hi!', datePurchased=null}", strList46);
        org.team4.model.user.Student student52 = new org.team4.model.user.Student("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}", "SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", strList46);
        org.team4.model.user.Faculty faculty53 = new org.team4.model.user.Faculty("User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='ItemPurchased{title='', email='', datePurchased=null}', email='hi!', dateSubscribed=Wed May 01 18:27:52 EDT 2024, dateDue=Wed May 01 18:27:52 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}", (long) (-1), strList46);
        org.junit.Assert.assertNull(date24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:45 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=Wed May 01 18:27:45 EDT 2024}, validated=false]", (int) (short) 100, 10, (double) (byte) 0, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:52 EDT 2024, dateDue=Wed May 01 18:27:52 EDT 2024}", true, false);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", (double) 10L);
        java.lang.String str4 = newsletter3.getTitle();
        java.lang.String str5 = newsletter3.getTitle();
        java.lang.String str6 = newsletter3.getTitle();
        java.lang.String str7 = newsletter3.getLink();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str4, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str5, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str6, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str7, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
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
        java.util.Date date24 = null;
        java.util.Date date25 = null;
        org.team4.model.course.Course course28 = new org.team4.model.course.Course("hi!", date24, date25, "", "hi!");
        java.util.Date date29 = course28.getEndDate();
        java.lang.String str30 = course28.getProfessorEmail();
        java.lang.String str31 = course28.getProfessorEmail();
        org.team4.model.course.CourseTextBook courseTextBook33 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) dVD1, "", 0, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "hi!", (-1), course28, false);
        org.team4.model.course.Course course34 = courseTextBook33.getCourse();
        org.team4.model.items.decorator.ItemDecorator itemDecorator35 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook33);
        boolean boolean36 = courseTextBook33.isRentable();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(date29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(course34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("", (int) (short) 10, 10);
        boolean boolean4 = creditCard3.isValid();
        boolean boolean5 = creditCard3.correctLength();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.title("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder0.author("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder0.title("User [email=, password=, name=hi!, type=, validated=true]");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder9 = bookRequestBuilder7.author("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder11 = bookRequestBuilder7.edition(0);
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
        org.junit.Assert.assertNotNull(bookRequestBuilder9);
        org.junit.Assert.assertNotNull(bookRequestBuilder11);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished(10);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        int int4 = magazine3.getIssueNumber();
        int int5 = magazine3.getIssueNumber();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator6 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) magazine3);
        org.team4.model.items.Item item7 = rentableItemDecorator6.getItem();
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(item7);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
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
        java.lang.String str31 = rentedItem28.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(date26);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Wed May 01 18:27:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Credit Card" + "'", str31, "Credit Card");
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.team4.model.user.User user4 = new org.team4.model.user.User("Debit Card", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:47 EDT 2024, dateDue=Wed May 01 18:27:47 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.BookBuilder bookBuilder4 = bookBuilder2.hasHardCopy(false);
        org.team4.model.items.builder.BookBuilder bookBuilder6 = bookBuilder4.genre("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}");
        org.team4.model.items.Book book7 = bookBuilder6.build();
        org.team4.model.items.builder.BookBuilder bookBuilder9 = bookBuilder6.hasSoftCopy(false);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(bookBuilder9);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:48 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}", 52, "ItemPurchased{title='', email='', datePurchased=null}");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.team4.model.user.User user5 = new org.team4.model.user.User("User [email=hi!, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=User [email=, password=, name=hi!, type=, validated=true], type=ItemPurchased{title='', email='', datePurchased=null}, validated=false]", "SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:48 EDT 2024, dateDue=null}', email='hi!', dateSubscribed=Mon Apr 01 18:27:51 EDT 2024, dateDue=Wed May 01 18:27:51 EDT 2024}", "SubscribeNewsletter{title='ItemPurchased{title='', email='', datePurchased=null}', email='hi!', dateSubscribed=Wed May 01 18:27:52 EDT 2024, dateDue=Wed May 01 18:27:52 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:47 EDT 2024, dateDue=Wed May 01 18:27:47 EDT 2024}", true);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.paymentmodes.DebitCard debitCard15 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete16 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) debitCard15);
        org.team4.model.items.Newsletter newsletter17 = purchaseComplete16.getNewsletter();
        double double18 = purchaseComplete16.getAmount();
        org.team4.model.items.Newsletter newsletter19 = purchaseComplete16.getNewsletter();
        org.team4.model.items.Item item20 = purchaseComplete16.getItem();
        double double21 = purchaseComplete16.getAmount();
        org.team4.model.user.User user22 = purchaseComplete16.getUser();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNull(newsletter19);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(user22);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.DVD dVD3 = dVDBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder5 = dVDBuilder0.price((double) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder7 = dVDItemBuilder5.quantity((int) (byte) 1);
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVD3);
        org.junit.Assert.assertNotNull(dVDItemBuilder5);
        org.junit.Assert.assertNotNull(dVDItemBuilder7);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        java.util.Date date2 = null;
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("", "", date2);
        java.lang.String str4 = itemPurchased3.toString();
        java.lang.String str5 = itemPurchased3.getTitle();
        java.lang.String str6 = itemPurchased3.toString();
        java.lang.String str7 = itemPurchased3.getTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str4, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str6, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished(10);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder5 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder7 = magazineBuilder0.title("User [email=, password=, name=hi!, type=, validated=true]");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder9 = magazineBuilder0.ISBN("Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertNotNull(magazineBuilder5);
        org.junit.Assert.assertNotNull(magazineItemBuilder7);
        org.junit.Assert.assertNotNull(magazineItemBuilder9);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        student5.setType("User [email=, password=, name=hi!, type=, validated=false]");
        java.util.ArrayList<java.lang.String> strList10 = student5.getCourses();
        student5.setType("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:50 EDT 2024, dateDue=Wed May 01 18:27:50 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(strList10);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("User [email=, password=, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:47 EDT 2024, dateDue=Wed May 01 18:27:47 EDT 2024}", "SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}", "User [email=, password=, name=hi!, type=, validated=true]");
        visitor4.setName("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:48 EDT 2024}");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
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
        java.lang.String str30 = creditCard10.getMode();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str23, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Credit Card" + "'", str28, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Credit Card" + "'", str30, "Credit Card");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished(10);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder5 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder7 = magazineBuilder0.yearPublished((int) '#');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder9 = magazineItemBuilder7.yearPublished((int) (byte) 10);
        java.lang.Class<?> wildcardClass10 = magazineItemBuilder9.getClass();
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertNotNull(magazineBuilder5);
        org.junit.Assert.assertNotNull(magazineItemBuilder7);
        org.junit.Assert.assertNotNull(magazineItemBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:53 EDT 2024, dateDue=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:51 EDT 2024}", "User [email=hi!, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=User [email=, password=, name=hi!, type=, validated=true], type=ItemPurchased{title='', email='', datePurchased=null}, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:50 EDT 2024, dateDue=Wed May 01 18:27:50 EDT 2024}", true);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder0.author("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.team4.model.items.BookRequest bookRequest6 = bookRequestBuilder5.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder5.edition(1);
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder10 = bookRequestBuilder5.title("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=null}");
        org.team4.model.items.BookRequest bookRequest11 = bookRequestBuilder5.build();
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequest6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
        org.junit.Assert.assertNotNull(bookRequestBuilder10);
        org.junit.Assert.assertNotNull(bookRequest11);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str3 = subscribeNewsletter2.getTitle();
        java.lang.String str4 = subscribeNewsletter2.getTitle();
        subscribeNewsletter2.setEmail("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        java.lang.String str7 = subscribeNewsletter2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SubscribeNewsletter{title='hi!', email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', dateSubscribed=Mon Apr 01 18:27:54 EDT 2024, dateDue=Wed May 01 18:27:54 EDT 2024}" + "'", str7, "SubscribeNewsletter{title='hi!', email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', dateSubscribed=Mon Apr 01 18:27:54 EDT 2024, dateDue=Wed May 01 18:27:54 EDT 2024}");
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished(10);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        int int4 = magazine3.getIssueNumber();
        java.lang.String str5 = magazine3.getPublisher();
        int int6 = magazine3.getIssueNumber();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator7 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) magazine3);
        boolean boolean8 = rentableItemDecorator7.isRentable();
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder0.publisher("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder12 = courseTextBookBuilder0.noOfPages(1);
        org.team4.model.items.builder.BookBuilder bookBuilder14 = bookBuilder12.author("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookBuilder bookBuilder16 = bookBuilder12.genre("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=Wed May 01 18:27:45 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder18 = bookBuilder16.price((double) (short) 100);
        org.team4.model.items.builder.BookBuilder bookBuilder20 = bookBuilder16.author("User [email=User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=User [email=, password=, name=hi!, type=, validated=false], type=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, validated=false], password=PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:48 EDT 2024}, validated=false]");
        org.team4.model.items.builder.BookBuilder bookBuilder22 = bookBuilder16.hasHardCopy(false);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(bookBuilder12);
        org.junit.Assert.assertNotNull(bookBuilder14);
        org.junit.Assert.assertNotNull(bookBuilder16);
        org.junit.Assert.assertNotNull(bookItemBuilder18);
        org.junit.Assert.assertNotNull(bookBuilder20);
        org.junit.Assert.assertNotNull(bookBuilder22);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.title("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDBuilder0.price(1.0d);
        org.team4.model.items.builder.DVDBuilder dVDBuilder8 = dVDBuilder0.duration((double) (short) 10);
        org.team4.model.items.DVD dVD9 = dVDBuilder8.build();
        java.lang.String str10 = dVD9.getGenre();
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDBuilder8);
        org.junit.Assert.assertNotNull(dVD9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("Debit Card", "Credit Card", "", "User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=User [email=, password=, name=hi!, type=, validated=false], type=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, validated=false]", true);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        org.team4.model.course.Course course11 = new org.team4.model.course.Course("hi!", date7, date8, "", "hi!");
        java.util.Date date12 = course11.getEndDate();
        java.lang.String str13 = course11.getProfessorEmail();
        java.lang.String str14 = course11.getProfessorEmail();
        org.team4.model.user.Student student19 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean20 = course11.isEnrolled(student19);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase21 = new org.team4.functionality.buy.ItemToPurchase(100.0d, (org.team4.model.user.User) student19);
        org.team4.model.user.Faculty faculty27 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "hi!", "", "", false);
        faculty27.setFacultyID((long) (byte) 1);
        org.team4.model.user.Student student34 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str35 = student34.getType();
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        student34.setCourses(strList38);
        faculty27.setCourses(strList38);
        student19.setCourses(strList38);
        org.team4.model.user.Faculty faculty43 = new org.team4.model.user.Faculty("hi!", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}", "", (long) (short) 1, strList38);
        long long44 = faculty43.getFacultyID();
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        org.team4.model.items.builder.BookBuilder bookBuilder11 = courseTextBookBuilder6.hasHardCopy(false);
        org.team4.model.items.builder.BookBuilder bookBuilder13 = courseTextBookBuilder6.edition((int) ' ');
        org.team4.model.course.CourseTextBook courseTextBook14 = courseTextBookBuilder6.build();
        org.team4.model.items.builder.BookBuilder bookBuilder16 = courseTextBookBuilder6.hasSoftCopy(true);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNotNull(bookBuilder11);
        org.junit.Assert.assertNotNull(bookBuilder13);
        org.junit.Assert.assertNotNull(courseTextBook14);
        org.junit.Assert.assertNotNull(bookBuilder16);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        java.lang.String str4 = dVD1.getGenre();
        dVD1.setPrice((double) '#');
        org.team4.model.items.Item item7 = new org.team4.model.items.Item((org.team4.model.items.Item) dVD1);
        boolean boolean8 = dVD1.isRentable();
        java.lang.String str9 = dVD1.getGenre();
        java.lang.String str10 = dVD1.getGenre();
        int int11 = dVD1.getYearPublished();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder0.publisher("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder12 = courseTextBookBuilder0.noOfPages(1);
        org.team4.model.items.builder.BookBuilder bookBuilder14 = bookBuilder12.author("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookBuilder bookBuilder16 = bookBuilder12.genre("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=Wed May 01 18:27:45 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder18 = bookBuilder16.price((double) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder20 = bookBuilder16.price((double) 10.0f);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder22 = bookItemBuilder20.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:51 EDT 2024, dateDue=null}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(bookBuilder12);
        org.junit.Assert.assertNotNull(bookBuilder14);
        org.junit.Assert.assertNotNull(bookBuilder16);
        org.junit.Assert.assertNotNull(bookItemBuilder18);
        org.junit.Assert.assertNotNull(bookItemBuilder20);
        org.junit.Assert.assertNotNull(bookItemBuilder22);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str3 = subscribeNewsletter2.getTitle();
        java.util.Date date4 = null;
        subscribeNewsletter2.setDateSubscribed(date4);
        java.lang.String str6 = subscribeNewsletter2.toString();
        java.lang.String str7 = subscribeNewsletter2.getTitle();
        subscribeNewsletter2.setEmail("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:54 EDT 2024}" + "'", str6, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:54 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "Credit Card", "User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]", 10, "PayPal");
        java.lang.String str7 = bookRequest6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str7, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
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
        java.util.Date date24 = null;
        java.util.Date date25 = null;
        org.team4.model.course.Course course28 = new org.team4.model.course.Course("hi!", date24, date25, "", "hi!");
        java.util.Date date29 = course28.getEndDate();
        java.lang.String str30 = course28.getProfessorEmail();
        java.lang.String str31 = course28.getProfessorEmail();
        org.team4.model.course.CourseTextBook courseTextBook33 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) dVD1, "", 0, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "hi!", (-1), course28, false);
        org.team4.model.course.Course course34 = courseTextBook33.getCourse();
        org.team4.model.items.decorator.ItemDecorator itemDecorator35 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook33);
        org.team4.model.course.Course course36 = courseTextBook33.getCourse();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = course36.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.toString()\" because \"this.startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(date29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(course34);
        org.junit.Assert.assertNotNull(course36);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished(10);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder5 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder7 = magazineBuilder5.issueNumber((-1));
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder9 = magazineBuilder7.quantity((int) (byte) -1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder11 = magazineBuilder7.yearPublished((int) ' ');
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertNotNull(magazineBuilder5);
        org.junit.Assert.assertNotNull(magazineBuilder7);
        org.junit.Assert.assertNotNull(magazineItemBuilder9);
        org.junit.Assert.assertNotNull(magazineItemBuilder11);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.team4.functionality.buy.ItemPurchased itemPurchased2 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:52 EDT 2024, dateDue=Wed May 01 18:27:52 EDT 2024}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("User [email=, password=, name=hi!, type=, validated=true]", "SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", false);
        visitor5.setPassword("Debit Card");
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.team4.model.user.Student student14 = new org.team4.model.user.Student("", "", "hi!", "");
        java.util.ArrayList<java.lang.String> strList15 = student14.getCourses();
        org.team4.model.user.Student student30 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str31 = student30.getType();
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        student30.setCourses(strList34);
        org.team4.model.user.Faculty faculty37 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", (long) (byte) -1, strList34);
        org.team4.model.user.Faculty faculty38 = new org.team4.model.user.Faculty("Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "Debit Card", "Credit Card", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:43 EDT 2024, dateDue=Wed May 01 18:27:43 EDT 2024}", (long) '4', strList34);
        student14.setCourses(strList34);
        org.team4.model.user.Faculty faculty40 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}", 7241021L, strList34);
        org.team4.model.user.Faculty faculty41 = new org.team4.model.user.Faculty("User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:45 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=Wed May 01 18:27:45 EDT 2024}, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:51 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:52 EDT 2024, dateDue=null}", "Book{genre='null', noOfPages=0, author='null', ISBN=null, publisher='null', edition='0'}", 2800760L, strList34);
        org.junit.Assert.assertNull(strList15);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.course.Course course6 = new org.team4.model.course.Course("hi!", date2, date3, "", "hi!");
        java.util.Date date7 = course6.getEndDate();
        java.lang.String str8 = course6.getProfessorEmail();
        java.lang.String str9 = course6.getProfessorEmail();
        org.team4.model.user.Student student14 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean15 = course6.isEnrolled(student14);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase16 = new org.team4.functionality.buy.ItemToPurchase(100.0d, (org.team4.model.user.User) student14);
        org.team4.model.user.Faculty faculty22 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "hi!", "", "", false);
        faculty22.setFacultyID((long) (byte) 1);
        org.team4.model.user.Student student29 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str30 = student29.getType();
        java.lang.String[] strArray32 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        student29.setCourses(strList33);
        faculty22.setCourses(strList33);
        student14.setCourses(strList33);
        java.lang.String str38 = student14.getPassword();
        student14.setName("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:45 EDT 2024}");
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getEndDate();
        java.util.Date date8 = null;
        java.util.Date date9 = null;
        org.team4.model.course.Course course12 = new org.team4.model.course.Course("hi!", date8, date9, "", "hi!");
        java.util.Date date13 = course12.getEndDate();
        java.lang.String str14 = course12.getProfessorEmail();
        java.lang.String str15 = course12.getProfessorEmail();
        org.team4.model.user.Student student21 = new org.team4.model.user.Student("", "", "hi!", "");
        student21.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase24 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student21);
        java.lang.String str25 = student21.getEmail();
        course12.enrollStudent(student21);
        course5.enrollStudent(student21);
        java.util.Date date28 = course5.getEndDate();
        java.util.Date date29 = course5.getEndDate();
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(date28);
        org.junit.Assert.assertNull(date29);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder6 = courseTextBookBuilder0.title("User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=User [email=, password=, name=hi!, type=, validated=false], type=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, validated=false]");
        org.team4.model.course.CourseTextBook courseTextBook7 = courseTextBookBuilder0.build();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookItemBuilder6);
        org.junit.Assert.assertNotNull(courseTextBook7);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getEndDate();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter9 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.util.Date date10 = null;
        subscribeNewsletter9.setDateDue(date10);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter14 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter14.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter24 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str25 = subscribeNewsletter24.getEmail();
        java.util.Date date26 = subscribeNewsletter24.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter29 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str30 = subscribeNewsletter29.getEmail();
        java.util.Date date31 = subscribeNewsletter29.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter32 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date26, date31);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter37 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str38 = subscribeNewsletter37.getEmail();
        java.util.Date date39 = subscribeNewsletter37.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter42 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str43 = subscribeNewsletter42.getEmail();
        java.util.Date date44 = subscribeNewsletter42.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter45 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date39, date44);
        org.team4.model.items.RentedItem rentedItem46 = new org.team4.model.items.RentedItem("Credit Card", "ItemPurchased{title='', email='', datePurchased=null}", date31, date39);
        java.util.Date date47 = null;
        rentedItem46.setDueDate(date47);
        java.util.Date date49 = rentedItem46.getRentDate();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter56 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str57 = subscribeNewsletter56.getEmail();
        java.util.Date date58 = subscribeNewsletter56.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter61 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str62 = subscribeNewsletter61.getEmail();
        java.util.Date date63 = subscribeNewsletter61.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter64 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date58, date63);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter69 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str70 = subscribeNewsletter69.getEmail();
        java.util.Date date71 = subscribeNewsletter69.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter74 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str75 = subscribeNewsletter74.getEmail();
        java.util.Date date76 = subscribeNewsletter74.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter77 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date71, date76);
        org.team4.model.items.RentedItem rentedItem78 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=null}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date58, date71);
        org.team4.model.course.Course course81 = new org.team4.model.course.Course("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", date49, date58, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        subscribeNewsletter14.setDateDue(date49);
        subscribeNewsletter9.setDateDue(date49);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean84 = course5.isStarted(date49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(date26);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Wed May 01 18:27:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Wed May 01 18:27:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Wed May 01 18:27:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Wed May 01 18:27:54 EDT 2024");
        org.junit.Assert.assertNotNull(date49);
// flaky:         org.junit.Assert.assertEquals(date49.toString(), "Wed May 01 18:27:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(date58);
// flaky:         org.junit.Assert.assertEquals(date58.toString(), "Wed May 01 18:27:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertNotNull(date63);
// flaky:         org.junit.Assert.assertEquals(date63.toString(), "Wed May 01 18:27:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertNotNull(date71);
// flaky:         org.junit.Assert.assertEquals(date71.toString(), "Wed May 01 18:27:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertNotNull(date76);
// flaky:         org.junit.Assert.assertEquals(date76.toString(), "Wed May 01 18:27:54 EDT 2024");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
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
        boolean boolean19 = dVD1.isRentable();
        dVD1.setRentable(true);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator22 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) dVD1);
        org.team4.model.items.Book book30 = new org.team4.model.items.Book((org.team4.model.items.Item) purchasableItemDecorator22, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", 10, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:45 EDT 2024}", "User [email=, password=, name=hi!, type=, validated=false]", 0, false, false);
        purchasableItemDecorator22.setPurchaseable(false);
        org.team4.model.items.DVD dVD35 = new org.team4.model.items.DVD((org.team4.model.items.Item) purchasableItemDecorator22, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}", 0.0d);
        boolean boolean36 = purchasableItemDecorator22.isRentable();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder0.author("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.team4.model.items.BookRequest bookRequest6 = bookRequestBuilder5.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder5.ISBN("SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}");
        org.team4.model.items.BookRequest bookRequest9 = bookRequestBuilder5.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder11 = bookRequestBuilder5.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:48 EDT 2024, dateDue=null}");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequest6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
        org.junit.Assert.assertNotNull(bookRequest9);
        org.junit.Assert.assertNotNull(bookRequestBuilder11);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "Credit Card", "User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]", 10, "PayPal");
        int int7 = bookRequest6.getEdition();
        java.lang.String str8 = bookRequest6.getISBN();
        java.lang.String str9 = bookRequest6.getEmail();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]" + "'", str8, "User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]" + "'", str9, "User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.team4.model.user.User user1 = null;
        org.team4.functionality.buy.ItemToPurchase itemToPurchase2 = new org.team4.functionality.buy.ItemToPurchase((double) (-1L), user1);
        org.team4.model.items.Item item3 = itemToPurchase2.getItem();
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.booktype("Credit Card");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder0.title("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:48 EDT 2024}");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", (int) (short) 0, (int) (short) 1);
        boolean boolean4 = debitCard3.correctLength();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        boolean boolean1 = org.team4.utils.EmailValidator.validEmail("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:54 EDT 2024}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.course.CourseTextBook courseTextBook7 = courseTextBookBuilder6.build();
        java.lang.String str8 = courseTextBook7.getGenre();
        java.util.List<org.team4.model.user.Student> studentList9 = courseTextBook7.getStudentsWithCopies();
        java.lang.String str10 = courseTextBook7.getGenre();
        org.team4.model.course.Course course11 = courseTextBook7.getCourse();
        java.lang.String str12 = courseTextBook7.getPublisher();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(courseTextBook7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(studentList9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(course11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.team4.model.user.User user5 = new org.team4.model.user.User("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:47 EDT 2024, dateDue=Wed May 01 18:27:47 EDT 2024}", "PayPal{email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}'}", "User [email=, password=, name=hi!, type=, validated=true]", "User [email=User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=User [email=, password=, name=hi!, type=, validated=false], type=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, validated=false], password=PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:48 EDT 2024}, validated=false]", false);
    }

    @Ignore
    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        java.lang.String str2 = mobileWallet1.getMode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PayPal" + "'", str2, "PayPal");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.course.CourseTextBook courseTextBook7 = courseTextBookBuilder6.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder9 = courseTextBookBuilder6.title("User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(courseTextBook7);
        org.junit.Assert.assertNotNull(bookItemBuilder9);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
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
        java.lang.String str20 = dVD1.getISBN();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Ignore
    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase2 = null;
        org.team4.functionality.buy.ProcessPayment processPayment3 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet1, itemToPurchase2);
        java.lang.String str4 = mobileWallet1.getMode();
        boolean boolean5 = mobileWallet1.isValid();
        boolean boolean6 = mobileWallet1.isValid();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PayPal" + "'", str4, "PayPal");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.paymentmodes.DebitCard debitCard15 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete16 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) debitCard15);
        double double17 = purchaseComplete16.getAmount();
        org.team4.model.user.User user18 = purchaseComplete16.getUser();
        long long19 = purchaseComplete16.getPurchaseID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(user18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1180780L + "'", long19 == 1180780L);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
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
        java.util.Date date24 = null;
        java.util.Date date25 = null;
        org.team4.model.course.Course course28 = new org.team4.model.course.Course("hi!", date24, date25, "", "hi!");
        java.util.Date date29 = course28.getEndDate();
        java.lang.String str30 = course28.getProfessorEmail();
        java.lang.String str31 = course28.getProfessorEmail();
        org.team4.model.course.CourseTextBook courseTextBook33 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) dVD1, "", 0, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "hi!", (-1), course28, false);
        org.team4.model.course.Course course34 = courseTextBook33.getCourse();
        org.team4.model.items.decorator.ItemDecorator itemDecorator35 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook33);
        org.team4.model.course.Course course36 = courseTextBook33.getCourse();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter45 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str46 = subscribeNewsletter45.getEmail();
        java.util.Date date47 = subscribeNewsletter45.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter50 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str51 = subscribeNewsletter50.getEmail();
        java.util.Date date52 = subscribeNewsletter50.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter53 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date47, date52);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter58 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str59 = subscribeNewsletter58.getEmail();
        java.util.Date date60 = subscribeNewsletter58.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter63 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str64 = subscribeNewsletter63.getEmail();
        java.util.Date date65 = subscribeNewsletter63.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter66 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date60, date65);
        org.team4.model.items.RentedItem rentedItem67 = new org.team4.model.items.RentedItem("Credit Card", "ItemPurchased{title='', email='', datePurchased=null}", date52, date60);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter74 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str75 = subscribeNewsletter74.getEmail();
        java.util.Date date76 = subscribeNewsletter74.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter79 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str80 = subscribeNewsletter79.getEmail();
        java.util.Date date81 = subscribeNewsletter79.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter82 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date76, date81);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter87 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str88 = subscribeNewsletter87.getEmail();
        java.util.Date date89 = subscribeNewsletter87.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter92 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str93 = subscribeNewsletter92.getEmail();
        java.util.Date date94 = subscribeNewsletter92.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter95 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date89, date94);
        org.team4.model.items.RentedItem rentedItem96 = new org.team4.model.items.RentedItem("Credit Card", "ItemPurchased{title='', email='', datePurchased=null}", date81, date89);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter97 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemPurchased{title='', email='', datePurchased=null}", "hi!", date52, date89);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean98 = course36.isStarted(date52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(date29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(course34);
        org.junit.Assert.assertNotNull(course36);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(date47);
// flaky:         org.junit.Assert.assertEquals(date47.toString(), "Wed May 01 18:27:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(date52);
// flaky:         org.junit.Assert.assertEquals(date52.toString(), "Wed May 01 18:27:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(date60);
// flaky:         org.junit.Assert.assertEquals(date60.toString(), "Wed May 01 18:27:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertNotNull(date65);
// flaky:         org.junit.Assert.assertEquals(date65.toString(), "Wed May 01 18:27:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertNotNull(date76);
// flaky:         org.junit.Assert.assertEquals(date76.toString(), "Wed May 01 18:27:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertNotNull(date81);
// flaky:         org.junit.Assert.assertEquals(date81.toString(), "Wed May 01 18:27:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!" + "'", str88, "hi!");
        org.junit.Assert.assertNotNull(date89);
// flaky:         org.junit.Assert.assertEquals(date89.toString(), "Wed May 01 18:27:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "hi!" + "'", str93, "hi!");
        org.junit.Assert.assertNotNull(date94);
// flaky:         org.junit.Assert.assertEquals(date94.toString(), "Wed May 01 18:27:54 EDT 2024");
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter4 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str5 = subscribeNewsletter4.getTitle();
        java.lang.String str6 = subscribeNewsletter4.toString();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter13 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str14 = subscribeNewsletter13.getEmail();
        java.util.Date date15 = subscribeNewsletter13.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter18 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str19 = subscribeNewsletter18.getEmail();
        java.util.Date date20 = subscribeNewsletter18.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter21 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date15, date20);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter26 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str27 = subscribeNewsletter26.getEmail();
        java.util.Date date28 = subscribeNewsletter26.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter31 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str32 = subscribeNewsletter31.getEmail();
        java.util.Date date33 = subscribeNewsletter31.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter34 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date28, date33);
        org.team4.model.items.RentedItem rentedItem35 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=null}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date15, date28);
        subscribeNewsletter4.setDateDue(date28);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter41 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str42 = subscribeNewsletter41.getEmail();
        java.util.Date date43 = subscribeNewsletter41.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter46 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str47 = subscribeNewsletter46.getEmail();
        java.util.Date date48 = subscribeNewsletter46.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter49 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date43, date48);
        subscribeNewsletter4.setDateDue(date43);
        org.team4.functionality.buy.ItemPurchased itemPurchased51 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:50 EDT 2024, dateDue=Wed May 01 18:27:50 EDT 2024}", "", date43);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:54 EDT 2024, dateDue=Wed May 01 18:27:54 EDT 2024}" + "'", str6, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:54 EDT 2024, dateDue=Wed May 01 18:27:54 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Wed May 01 18:27:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Wed May 01 18:27:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Wed May 01 18:27:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(date33);
// flaky:         org.junit.Assert.assertEquals(date33.toString(), "Wed May 01 18:27:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(date43);
// flaky:         org.junit.Assert.assertEquals(date43.toString(), "Wed May 01 18:27:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(date48);
// flaky:         org.junit.Assert.assertEquals(date48.toString(), "Wed May 01 18:27:54 EDT 2024");
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 10);
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder2.genre("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDBuilder2.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:47 EDT 2024, dateDue=Wed May 01 18:27:47 EDT 2024}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder10 = dVDBuilder2.duration((double) (byte) -1);
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
        org.junit.Assert.assertNotNull(dVDBuilder10);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.items.Item item12 = purchaseComplete11.getItem();
        long long13 = purchaseComplete11.getPurchaseID();
        org.team4.model.items.Newsletter newsletter14 = purchaseComplete11.getNewsletter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(item12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5884661L + "'", long13 == 5884661L);
        org.junit.Assert.assertNull(newsletter14);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
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
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        java.util.Date date19 = null;
        java.util.Date date20 = null;
        org.team4.model.course.Course course23 = new org.team4.model.course.Course("hi!", date19, date20, "", "hi!");
        java.util.Date date24 = course23.getEndDate();
        java.lang.String str25 = course23.getProfessorEmail();
        java.lang.String str26 = course23.getProfessorEmail();
        org.team4.model.user.Student student32 = new org.team4.model.user.Student("", "", "hi!", "");
        student32.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase35 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student32);
        java.lang.String str36 = student32.getEmail();
        course23.enrollStudent(student32);
        org.team4.model.user.Student student42 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str43 = student42.getType();
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        student42.setCourses(strList46);
        student32.setCourses(strList46);
        org.team4.model.user.Faculty faculty50 = new org.team4.model.user.Faculty("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "User [email=, password=, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}", (long) (short) 100, strList46);
        org.team4.model.user.Student student51 = new org.team4.model.user.Student("User [email=, password=, name=hi!, type=, validated=true]", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "", "ItemPurchased{title='', email='hi!', datePurchased=null}", strList46);
        org.team4.model.user.Student student52 = new org.team4.model.user.Student("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}", "SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", strList46);
        org.team4.model.user.Faculty faculty53 = new org.team4.model.user.Faculty("ItemPurchased{title='Credit Card', email='Debit Card', datePurchased=Mon Apr 01 18:27:47 EDT 2024}", "Book{genre='null', noOfPages=0, author='null', ISBN=null, publisher='null', edition='0'}", "User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=Wed May 01 18:27:45 EDT 2024}", 9931409L, strList46);
        org.junit.Assert.assertNull(date24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("", "", "", "", 0L);
        long long6 = manager5.getManagerID();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.builder.BookBuilder bookBuilder9 = courseTextBookBuilder6.author("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookBuilder bookBuilder11 = courseTextBookBuilder6.hasHardCopy(false);
        org.team4.model.items.builder.BookBuilder bookBuilder13 = bookBuilder11.genre("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:52 EDT 2024, dateDue=Wed May 01 18:27:52 EDT 2024}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(bookBuilder9);
        org.junit.Assert.assertNotNull(bookBuilder11);
        org.junit.Assert.assertNotNull(bookBuilder13);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("User [email=, password=, name=hi!, type=, validated=true]", "User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=User [email=, password=, name=hi!, type=, validated=false], type=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, validated=false]", "hi!", "ItemPurchased{title='', email='hi!', datePurchased=null}", true);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", (double) 10L);
        java.lang.String str4 = newsletter3.getTitle();
        java.lang.String str5 = newsletter3.getTitle();
        java.lang.String str6 = newsletter3.getLink();
        java.lang.String[] strArray14 = new java.lang.String[] { "ItemPurchased{title='', email='', datePurchased=null}", "SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        org.team4.model.user.Faculty faculty17 = new org.team4.model.user.Faculty("Mobile Wallet", "hi!", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "Credit Card", 1L, strList15);
        long long18 = faculty17.getFacultyID();
        faculty17.setFacultyID((long) 10);
        java.util.ArrayList<java.lang.String> strList21 = faculty17.getCourses();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase22 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) faculty17);
        org.team4.model.user.NonFaculty nonFaculty28 = new org.team4.model.user.NonFaculty("ItemPurchased{title='', email='hi!', datePurchased=null}", "User [email=, password=, name=hi!, type=, validated=false]", "User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]", "User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]", false);
        long long29 = nonFaculty28.getUniversityID();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase30 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) nonFaculty28);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str4, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str5, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str6, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.BookBuilder bookBuilder4 = bookBuilder2.author("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder6 = bookBuilder2.price((double) 1.0f);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = bookBuilder2.author("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:51 EDT 2024, dateDue=null}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookBuilder4);
        org.junit.Assert.assertNotNull(bookItemBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
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
        dVD1.setQuantity((int) (short) -1);
        int int20 = dVD1.getYearPublished();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder0.publisher("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder12 = courseTextBookBuilder0.noOfPages(1);
        java.util.Date date14 = null;
        java.util.Date date15 = null;
        org.team4.model.course.Course course18 = new org.team4.model.course.Course("hi!", date14, date15, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder19 = courseTextBookBuilder0.course(course18);
        java.util.Date date20 = course18.getEndDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = course18.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.toString()\" because \"this.startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(bookBuilder12);
        org.junit.Assert.assertNotNull(courseTextBookBuilder19);
        org.junit.Assert.assertNull(date20);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("hi!", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:51 EDT 2024}", "User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=User [email=, password=, name=hi!, type=, validated=false], type=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, validated=false]", "Book{genre='null', noOfPages=0, author='null', ISBN=null, publisher='null', edition='0'}", false);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.team4.model.user.Manager manager6 = new org.team4.model.user.Manager("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:45 EDT 2024}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]", false);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) '4', (org.team4.model.user.User) manager6);
        org.team4.model.user.User user8 = itemToPurchase7.getUser();
        org.junit.Assert.assertNotNull(user8);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook8 = courseTextBookBuilder6.build();
        org.team4.model.course.Course course9 = courseTextBook8.getCourse();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertNull(course9);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber((int) '4');
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.team4.model.user.User user5 = new org.team4.model.user.User("", "hi!", "hi!", "hi!", false);
        user5.setType("");
        user5.setType("SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:52 EDT 2024, dateDue=Wed May 01 18:27:52 EDT 2024}", "", "SubscribeNewsletter{title='ItemPurchased{title='', email='', datePurchased=null}', email='hi!', dateSubscribed=Wed May 01 18:27:52 EDT 2024, dateDue=Wed May 01 18:27:52 EDT 2024}", "SubscribeNewsletter{title='ItemPurchased{title='', email='', datePurchased=null}', email='hi!', dateSubscribed=Wed May 01 18:27:52 EDT 2024, dateDue=Wed May 01 18:27:52 EDT 2024}", false);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.team4.model.items.Newsletter newsletter0 = null;
        org.team4.model.user.User user6 = new org.team4.model.user.User("User [email=, password=, name=hi!, type=, validated=true]", "", "PayPal", "User [email=, password=, name=hi!, type=, validated=false]", false);
        // The following exception was thrown during execution in test generation
        try {
            org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase(newsletter0, user6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.team4.model.items.Newsletter.getPrice()\" because \"newsletter\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("Mobile Wallet", (int) (byte) 1, (int) 'a', (double) 0.0f, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}", true, true);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.quantity((int) (short) 100);
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder0.build();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator10 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook9);
        org.team4.model.course.Course course11 = courseTextBook9.getCourse();
        java.util.List<org.team4.model.user.Student> studentList12 = courseTextBook9.getStudentsWithCopies();
        org.team4.model.items.builder.DVDBuilder dVDBuilder13 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD14 = dVDBuilder13.build();
        boolean boolean15 = courseTextBook9.equals((java.lang.Object) dVDBuilder13);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(courseTextBook9);
        org.junit.Assert.assertNull(course11);
        org.junit.Assert.assertNotNull(studentList12);
        org.junit.Assert.assertNotNull(dVD14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getEndDate();
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        book7.setPrice((double) 0L);
        java.lang.String str11 = book7.getGenre();
        int int12 = book7.getNoOfPages();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished(10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder4 = magazineBuilder0.yearPublished((int) '4');
        org.team4.model.items.Magazine magazine5 = magazineBuilder0.build();
        boolean boolean6 = magazine5.isRentable();
        java.util.Date date13 = null;
        java.util.Date date14 = null;
        org.team4.model.course.Course course17 = new org.team4.model.course.Course("hi!", date13, date14, "", "hi!");
        java.util.Date date18 = course17.getEndDate();
        java.util.Date date20 = null;
        java.util.Date date21 = null;
        org.team4.model.course.Course course24 = new org.team4.model.course.Course("hi!", date20, date21, "", "hi!");
        java.util.Date date25 = course24.getEndDate();
        java.lang.String str26 = course24.getProfessorEmail();
        java.lang.String str27 = course24.getProfessorEmail();
        org.team4.model.user.Student student33 = new org.team4.model.user.Student("", "", "hi!", "");
        student33.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase36 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student33);
        java.lang.String str37 = student33.getEmail();
        course24.enrollStudent(student33);
        course17.enrollStudent(student33);
        java.util.Date date40 = course17.getEndDate();
        org.team4.model.course.CourseTextBook courseTextBook42 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) magazine5, "User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]", (int) ' ', "SubscribeNewsletter{title='hi!', email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', dateSubscribed=Mon Apr 01 18:27:54 EDT 2024, dateDue=Wed May 01 18:27:54 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:53 EDT 2024, dateDue=null}", (int) (byte) 100, course17, false);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineItemBuilder4);
        org.junit.Assert.assertNotNull(magazine5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNull(date25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(date40);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemPurchased{title='Credit Card', email='Debit Card', datePurchased=Mon Apr 01 18:27:47 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}");
        java.lang.String str3 = subscribeNewsletter2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}" + "'", str3, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished(10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder4 = magazineBuilder0.yearPublished((int) '4');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.title("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineItemBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
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
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder18 = courseTextBookBuilder16.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder20 = courseTextBookBuilder18.quantity((int) (byte) 10);
        org.team4.model.items.builder.BookBuilder bookBuilder22 = courseTextBookBuilder18.author("");
        org.team4.model.items.builder.BookBuilder bookBuilder24 = bookBuilder22.noOfPages((int) (short) 0);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(bookBuilder13);
        org.junit.Assert.assertNotNull(book14);
        org.junit.Assert.assertNotNull(courseTextBookBuilder16);
        org.junit.Assert.assertNotNull(courseTextBookBuilder18);
        org.junit.Assert.assertNotNull(bookItemBuilder20);
        org.junit.Assert.assertNotNull(bookBuilder22);
        org.junit.Assert.assertNotNull(bookBuilder24);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.quantity((int) (short) 100);
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder11 = courseTextBookBuilder0.ISBN("User [email=User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=User [email=, password=, name=hi!, type=, validated=false], type=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, validated=false], password=PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:48 EDT 2024}, validated=false]");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder13 = bookItemBuilder11.title("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:48 EDT 2024, dateDue=null}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(courseTextBook9);
        org.junit.Assert.assertNotNull(bookItemBuilder11);
        org.junit.Assert.assertNotNull(bookItemBuilder13);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", (double) 10L);
        java.lang.String str4 = newsletter3.getTitle();
        java.lang.String str5 = newsletter3.getTitle();
        java.lang.String str6 = newsletter3.getLink();
        java.lang.String str7 = newsletter3.getLink();
        double double8 = newsletter3.getPrice();
        org.team4.model.user.Visitor visitor13 = new org.team4.model.user.Visitor("User [email=, password=, name=hi!, type=, validated=false]", "hi!", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=Wed May 01 18:27:45 EDT 2024}");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase14 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) visitor13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str4, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str5, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str6, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str7, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.DVD dVD3 = dVDBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder5 = dVDBuilder0.price((double) 100);
        org.team4.model.items.DVD dVD6 = dVDBuilder0.build();
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVD3);
        org.junit.Assert.assertNotNull(dVDItemBuilder5);
        org.junit.Assert.assertNotNull(dVD6);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
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
        java.util.Date date24 = null;
        java.util.Date date25 = null;
        org.team4.model.course.Course course28 = new org.team4.model.course.Course("hi!", date24, date25, "", "hi!");
        java.util.Date date29 = course28.getEndDate();
        java.lang.String str30 = course28.getProfessorEmail();
        java.lang.String str31 = course28.getProfessorEmail();
        org.team4.model.course.CourseTextBook courseTextBook33 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) dVD1, "", 0, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "hi!", (-1), course28, false);
        org.team4.model.course.Course course34 = courseTextBook33.getCourse();
        org.team4.model.items.decorator.ItemDecorator itemDecorator35 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook33);
        org.team4.model.items.Newsletter newsletter39 = new org.team4.model.items.Newsletter("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", (double) 10L);
        java.lang.String str40 = newsletter39.getTitle();
        java.lang.String str41 = newsletter39.getTitle();
        java.lang.String str42 = newsletter39.getLink();
        java.lang.String str43 = newsletter39.getLink();
        org.team4.model.user.Student student49 = new org.team4.model.user.Student("PayPal", "ItemPurchased{title='', email='hi!', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}", "Mobile Wallet", false);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase50 = new org.team4.functionality.buy.ItemToPurchase(newsletter39, (org.team4.model.user.User) student49);
        // The following exception was thrown during execution in test generation
        try {
            courseTextBook33.removeCopies(student49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(date29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(course34);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str40, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str41, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str42, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str43, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:51 EDT 2024}", "User [email=User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=User [email=, password=, name=hi!, type=, validated=false], type=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, validated=false], password=PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:48 EDT 2024}, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:53 EDT 2024, dateDue=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=Wed May 01 18:27:45 EDT 2024}");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
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
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder18 = courseTextBookBuilder16.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder20 = courseTextBookBuilder16.hasHardCopy(false);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(bookBuilder13);
        org.junit.Assert.assertNotNull(book14);
        org.junit.Assert.assertNotNull(courseTextBookBuilder16);
        org.junit.Assert.assertNotNull(courseTextBookBuilder18);
        org.junit.Assert.assertNotNull(bookBuilder20);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:52 EDT 2024, dateDue=Wed May 01 18:27:52 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:53 EDT 2024, dateDue=null}", (double) 10L);
    }

    @Ignore
    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("");
        org.team4.model.user.Student student7 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str8 = student7.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase9 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student7);
        org.team4.model.items.Newsletter newsletter10 = itemToPurchase9.getNewsletter();
        org.team4.functionality.buy.ProcessPayment processPayment11 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet1, itemToPurchase9);
        java.lang.String str12 = mobileWallet1.getMode();
        java.lang.String str13 = mobileWallet1.getMode();
        java.lang.String str14 = mobileWallet1.getMode();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PayPal" + "'", str12, "PayPal");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PayPal" + "'", str13, "PayPal");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PayPal" + "'", str14, "PayPal");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("User [email=, password=, name=hi!, type=, validated=false]", 0, 1);
        boolean boolean4 = debitCard3.correctLength();
        boolean boolean5 = debitCard3.notExpired();
        boolean boolean6 = debitCard3.notExpired();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:48 EDT 2024, dateDue=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}", "SubscribeNewsletter{title='ItemPurchased{title='', email='', datePurchased=null}', email='hi!', dateSubscribed=Wed May 01 18:27:52 EDT 2024, dateDue=Wed May 01 18:27:52 EDT 2024}", "User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:45 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=Wed May 01 18:27:45 EDT 2024}, validated=false]", true);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        java.util.Date date2 = null;
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("", "hi!", date2);
        java.lang.String str4 = itemPurchased3.getTitle();
        java.util.Date date5 = itemPurchased3.getDatePurchased();
        java.util.Date date6 = itemPurchased3.getDatePurchased();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.builder.BookBuilder bookBuilder9 = courseTextBookBuilder6.author("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookBuilder bookBuilder11 = bookBuilder9.author("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:43 EDT 2024, dateDue=Wed May 01 18:27:43 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder13 = bookBuilder11.quantity((int) (byte) 100);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(bookBuilder9);
        org.junit.Assert.assertNotNull(bookBuilder11);
        org.junit.Assert.assertNotNull(bookItemBuilder13);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.quantity(100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDItemBuilder4.price((double) 100.0f);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDItemBuilder4.ISBN("Debit Card");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.course.CourseTextBook courseTextBook7 = courseTextBookBuilder6.build();
        java.lang.String str8 = courseTextBook7.getGenre();
        java.util.List<org.team4.model.user.Student> studentList9 = courseTextBook7.getStudentsWithCopies();
        java.lang.String str10 = courseTextBook7.getGenre();
        org.team4.model.course.Course course11 = courseTextBook7.getCourse();
        org.team4.model.items.Item item12 = new org.team4.model.items.Item((org.team4.model.items.Item) courseTextBook7);
        org.team4.model.user.Student student13 = null;
        // The following exception was thrown during execution in test generation
        try {
            courseTextBook7.removeCopies(student13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.team4.model.course.Course.isEnded(java.util.Date)\" because \"this.course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(courseTextBook7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(studentList9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(course11);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("Debit Card", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        subscribeNewsletter2.setEmail("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:43 EDT 2024, dateDue=Wed May 01 18:27:43 EDT 2024}");
        java.util.Date date5 = null;
        subscribeNewsletter2.setDateDue(date5);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
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
        boolean boolean19 = dVD1.isRentable();
        dVD1.setRentable(true);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator22 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) dVD1);
        org.team4.model.items.Item item23 = purchasableItemDecorator22.getItem();
        purchasableItemDecorator22.setRentable(false);
        boolean boolean26 = purchasableItemDecorator22.isPurchasable();
        java.lang.String str27 = purchasableItemDecorator22.getTitle();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(item23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "hi!", "", "", false);
        faculty5.setFacultyID((long) (byte) 1);
        org.team4.model.user.Student student12 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str13 = student12.getType();
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        student12.setCourses(strList16);
        faculty5.setCourses(strList16);
        faculty5.setEmail("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("ItemPurchased{title='Credit Card', email='Debit Card', datePurchased=Mon Apr 01 18:27:47 EDT 2024}");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.team4.model.user.Manager manager4 = new org.team4.model.user.Manager("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}");
        manager4.setManagerID(7241236L);
        manager4.setManagerID(0L);
        long long9 = manager4.getManagerID();
        manager4.setEmail("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:50 EDT 2024, dateDue=Wed May 01 18:27:50 EDT 2024}");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=User [email=, password=, name=hi!, type=, validated=false], type=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, validated=false]", "PayPal{email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:52 EDT 2024, dateDue=null}", "PayPal{email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}'}", false);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.title("hi!");
        org.team4.model.items.DVD dVD5 = dVDBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder7 = dVDBuilder0.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=Wed May 01 18:27:45 EDT 2024}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder9 = dVDBuilder0.genre("User [email=hi!, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=User [email=, password=, name=hi!, type=, validated=true], type=ItemPurchased{title='', email='', datePurchased=null}, validated=false]");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVD5);
        org.junit.Assert.assertNotNull(dVDItemBuilder7);
        org.junit.Assert.assertNotNull(dVDBuilder9);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
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
        java.lang.String str20 = book7.getAuthor();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator21 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) book7);
        boolean boolean22 = book7.hasSoftCopy();
        int int23 = book7.getQuantity();
        org.team4.model.items.Item item24 = new org.team4.model.items.Item((org.team4.model.items.Item) book7);
        book7.setQuantity((int) (byte) -1);
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
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.quantity((int) (short) 100);
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder0.build();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator10 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook9);
        org.team4.model.course.Course course11 = courseTextBook9.getCourse();
        courseTextBook9.setPrice((double) (short) 1);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(courseTextBook9);
        org.junit.Assert.assertNull(course11);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("User [email=, password=, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:47 EDT 2024, dateDue=Wed May 01 18:27:47 EDT 2024}", "SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}", "User [email=, password=, name=hi!, type=, validated=true]");
        boolean boolean5 = visitor4.isValidated();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }


    @Ignore
    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}");
        boolean boolean2 = payPal1.isValid();
        boolean boolean3 = payPal1.isValid();
        java.lang.String str4 = payPal1.getMode();
        java.lang.String str5 = payPal1.toString();
        java.lang.String str6 = payPal1.getMode();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Mobile Wallet" + "'", str4, "Mobile Wallet");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PayPal{email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}'}" + "'", str5, "PayPal{email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Mobile Wallet" + "'", str6, "Mobile Wallet");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.email("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder0.title("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}");
        org.team4.model.items.BookRequest bookRequest5 = bookRequestBuilder0.build();
        java.lang.String str6 = bookRequest5.getEmail();
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("hi!", "ItemPurchased{title='', email='hi!', datePurchased=null}", "User [email=, password=, name=hi!, type=, validated=true]", "ItemPurchased{title='', email='', datePurchased=null}", false);
        java.lang.String str6 = faculty5.toString();
        faculty5.setFacultyID(213331L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [email=hi!, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=User [email=, password=, name=hi!, type=, validated=true], type=ItemPurchased{title='', email='', datePurchased=null}, validated=false]" + "'", str6, "User [email=hi!, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=User [email=, password=, name=hi!, type=, validated=true], type=ItemPurchased{title='', email='', datePurchased=null}, validated=false]");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
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
        java.util.Date date24 = null;
        java.util.Date date25 = null;
        org.team4.model.course.Course course28 = new org.team4.model.course.Course("hi!", date24, date25, "", "hi!");
        java.util.Date date29 = course28.getEndDate();
        java.lang.String str30 = course28.getProfessorEmail();
        java.lang.String str31 = course28.getProfessorEmail();
        org.team4.model.course.CourseTextBook courseTextBook33 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) dVD1, "", 0, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "hi!", (-1), course28, false);
        org.team4.model.course.Course course34 = courseTextBook33.getCourse();
        org.team4.model.items.decorator.ItemDecorator itemDecorator35 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook33);
        org.team4.model.course.Course course36 = courseTextBook33.getCourse();
        org.team4.model.course.Course course37 = courseTextBook33.getCourse();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = course37.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.toString()\" because \"this.startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(date29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(course34);
        org.junit.Assert.assertNotNull(course36);
        org.junit.Assert.assertNotNull(course37);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
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
        rentedItem28.setDueDate(date52);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter63 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str64 = subscribeNewsletter63.getTitle();
        java.lang.String str65 = subscribeNewsletter63.getTitle();
        java.util.Date date66 = subscribeNewsletter63.getDateDue();
        java.util.Date date67 = subscribeNewsletter63.getDateDue();
        rentedItem28.setDueDate(date67);
        java.lang.String str69 = rentedItem28.getTitle();
        java.lang.String str70 = rentedItem28.getISBN();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Wed May 01 18:27:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Wed May 01 18:27:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Wed May 01 18:27:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(date26);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Wed May 01 18:27:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Wed May 01 18:27:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Wed May 01 18:27:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(date52);
// flaky:         org.junit.Assert.assertEquals(date52.toString(), "Wed May 01 18:27:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(date57);
// flaky:         org.junit.Assert.assertEquals(date57.toString(), "Wed May 01 18:27:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertNotNull(date66);
// flaky:         org.junit.Assert.assertEquals(date66.toString(), "Wed May 01 18:27:54 EDT 2024");
        org.junit.Assert.assertNotNull(date67);
// flaky:         org.junit.Assert.assertEquals(date67.toString(), "Wed May 01 18:27:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Credit Card" + "'", str69, "Credit Card");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str70, "ItemPurchased{title='', email='', datePurchased=null}");
    }

    @Ignore
    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:48 EDT 2024, dateDue=null}");
        java.lang.String str2 = payPal1.getMode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Mobile Wallet" + "'", str2, "Mobile Wallet");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getEndDate();
        java.util.Date date8 = null;
        java.util.Date date9 = null;
        org.team4.model.course.Course course12 = new org.team4.model.course.Course("hi!", date8, date9, "", "hi!");
        java.util.Date date13 = course12.getEndDate();
        java.lang.String str14 = course12.getProfessorEmail();
        java.lang.String str15 = course12.getProfessorEmail();
        org.team4.model.user.Student student21 = new org.team4.model.user.Student("", "", "hi!", "");
        student21.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase24 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student21);
        java.lang.String str25 = student21.getEmail();
        course12.enrollStudent(student21);
        course5.enrollStudent(student21);
        java.util.Date date28 = course5.getStartDate();
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(date28);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder0.author("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.team4.model.items.BookRequest bookRequest6 = bookRequestBuilder5.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder5.edition(1);
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder10 = bookRequestBuilder8.booktype("Debit Card");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder12 = bookRequestBuilder10.booktype("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:43 EDT 2024, dateDue=Wed May 01 18:27:43 EDT 2024}");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequest6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
        org.junit.Assert.assertNotNull(bookRequestBuilder10);
        org.junit.Assert.assertNotNull(bookRequestBuilder12);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
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
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder18 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder20 = courseTextBookBuilder18.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder22 = courseTextBookBuilder18.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder24 = courseTextBookBuilder18.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder26 = courseTextBookBuilder24.yearPublished((int) (short) 100);
        boolean boolean27 = dVD1.equals((java.lang.Object) courseTextBookBuilder24);
        int int28 = dVD1.getYearPublished();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookBuilder20);
        org.junit.Assert.assertNotNull(bookItemBuilder22);
        org.junit.Assert.assertNotNull(courseTextBookBuilder24);
        org.junit.Assert.assertNotNull(bookItemBuilder26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.BookBuilder bookBuilder4 = bookBuilder2.hasHardCopy(false);
        org.team4.model.items.builder.BookBuilder bookBuilder6 = bookBuilder4.noOfPages((int) (short) -1);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = bookBuilder4.author("SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}");
        org.team4.model.items.Book book9 = bookBuilder8.build();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(book9);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.quantity((int) (byte) 1);
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:43 EDT 2024, dateDue=Wed May 01 18:27:43 EDT 2024}", "User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        java.lang.String str5 = faculty4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]" + "'", str5, "User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", (double) 10L);
        java.lang.String str4 = newsletter3.getTitle();
        double double5 = newsletter3.getPrice();
        double double6 = newsletter3.getPrice();
        double double7 = newsletter3.getPrice();
        double double8 = newsletter3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str4, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder0.publisher("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = courseTextBookBuilder0.ISBN("");
        org.team4.model.items.builder.BookBuilder bookBuilder14 = courseTextBookBuilder0.hasHardCopy(false);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(bookItemBuilder12);
        org.junit.Assert.assertNotNull(bookBuilder14);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "Credit Card", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:48 EDT 2024, dateDue=null}', email='hi!', dateSubscribed=Mon Apr 01 18:27:51 EDT 2024, dateDue=Wed May 01 18:27:51 EDT 2024}", true);
        org.team4.model.user.Student student15 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str16 = student15.getType();
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        student15.setCourses(strList19);
        org.team4.model.user.Faculty faculty22 = new org.team4.model.user.Faculty("ItemPurchased{title='', email='hi!', datePurchased=null}", "Credit Card", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", (long) (byte) 0, strList19);
        java.util.ArrayList<java.lang.String> strList23 = faculty22.getCourses();
        faculty5.setCourses(strList23);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDBuilder2.ISBN("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDItemBuilder6.title("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:52 EDT 2024, dateDue=Wed May 01 18:27:52 EDT 2024}");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder4 = magazineBuilder0.quantity(0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder6 = magazineBuilder0.issueNumber((int) 'a');
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineItemBuilder4);
        org.junit.Assert.assertNotNull(magazineBuilder6);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished(10);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder5 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder7 = magazineBuilder0.yearPublished((int) '#');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder9 = magazineItemBuilder7.title("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:45 EDT 2024}");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertNotNull(magazineBuilder5);
        org.junit.Assert.assertNotNull(magazineItemBuilder7);
        org.junit.Assert.assertNotNull(magazineItemBuilder9);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.team4.model.user.Student student14 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str15 = student14.getType();
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        student14.setCourses(strList18);
        org.team4.model.user.Faculty faculty21 = new org.team4.model.user.Faculty("ItemPurchased{title='', email='hi!', datePurchased=null}", "Credit Card", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", (long) (byte) 0, strList18);
        org.team4.model.user.Faculty faculty22 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}", "User [email=, password=, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:43 EDT 2024, dateDue=Wed May 01 18:27:43 EDT 2024}", "", (long) (short) 10, strList18);
        java.util.ArrayList<java.lang.String> strList23 = faculty22.getCourses();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = bookItemBuilder8.yearPublished(10);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        boolean boolean9 = book7.hasSoftCopy();
        int int10 = book7.getEdition();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str3 = subscribeNewsletter2.getTitle();
        java.lang.String str4 = subscribeNewsletter2.getTitle();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter7 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter7.setTitle("");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter18 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str19 = subscribeNewsletter18.getEmail();
        java.util.Date date20 = subscribeNewsletter18.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter23 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str24 = subscribeNewsletter23.getEmail();
        java.util.Date date25 = subscribeNewsletter23.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter26 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date20, date25);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter31 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str32 = subscribeNewsletter31.getEmail();
        java.util.Date date33 = subscribeNewsletter31.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter36 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str37 = subscribeNewsletter36.getEmail();
        java.util.Date date38 = subscribeNewsletter36.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter39 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date33, date38);
        org.team4.model.items.RentedItem rentedItem40 = new org.team4.model.items.RentedItem("Credit Card", "ItemPurchased{title='', email='', datePurchased=null}", date25, date33);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter47 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str48 = subscribeNewsletter47.getEmail();
        java.util.Date date49 = subscribeNewsletter47.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter52 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str53 = subscribeNewsletter52.getEmail();
        java.util.Date date54 = subscribeNewsletter52.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter55 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date49, date54);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter60 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str61 = subscribeNewsletter60.getEmail();
        java.util.Date date62 = subscribeNewsletter60.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter65 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str66 = subscribeNewsletter65.getEmail();
        java.util.Date date67 = subscribeNewsletter65.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter68 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date62, date67);
        org.team4.model.items.RentedItem rentedItem69 = new org.team4.model.items.RentedItem("Credit Card", "ItemPurchased{title='', email='', datePurchased=null}", date54, date62);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter70 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemPurchased{title='', email='', datePurchased=null}", "hi!", date25, date62);
        java.util.Date date71 = subscribeNewsletter70.getDateSubscribed();
        subscribeNewsletter7.setDateSubscribed(date71);
        subscribeNewsletter2.setDateSubscribed(date71);
        java.lang.String str74 = subscribeNewsletter2.getEmail();
        java.util.Date date75 = subscribeNewsletter2.getDateDue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(date33);
// flaky:         org.junit.Assert.assertEquals(date33.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(date38);
// flaky:         org.junit.Assert.assertEquals(date38.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(date49);
// flaky:         org.junit.Assert.assertEquals(date49.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(date54);
// flaky:         org.junit.Assert.assertEquals(date54.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNotNull(date62);
// flaky:         org.junit.Assert.assertEquals(date62.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertNotNull(date67);
// flaky:         org.junit.Assert.assertEquals(date67.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertNotNull(date71);
// flaky:         org.junit.Assert.assertEquals(date71.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertNotNull(date75);
// flaky:         org.junit.Assert.assertEquals(date75.toString(), "Wed May 01 18:27:55 EDT 2024");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder0.author("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.team4.model.items.BookRequest bookRequest6 = bookRequestBuilder5.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder5.edition(1);
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder10 = bookRequestBuilder5.title("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder12 = bookRequestBuilder5.edition(100);
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequest6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
        org.junit.Assert.assertNotNull(bookRequestBuilder10);
        org.junit.Assert.assertNotNull(bookRequestBuilder12);
    }

    @Ignore
    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("");
        java.lang.String str2 = mobileWallet1.getMode();
        java.lang.String str3 = mobileWallet1.getMode();
        java.lang.String str4 = mobileWallet1.getMode();
        java.lang.String str5 = mobileWallet1.getMode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PayPal" + "'", str2, "PayPal");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PayPal" + "'", str3, "PayPal");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PayPal" + "'", str4, "PayPal");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PayPal" + "'", str5, "PayPal");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.team4.model.user.User user5 = new org.team4.model.user.User("", "SubscribeNewsletter{title='hi!', email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', dateSubscribed=Mon Apr 01 18:27:54 EDT 2024, dateDue=Wed May 01 18:27:54 EDT 2024}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:48 EDT 2024, dateDue=null}', email='hi!', dateSubscribed=Mon Apr 01 18:27:51 EDT 2024, dateDue=Wed May 01 18:27:51 EDT 2024}", true);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
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
        java.util.Date date26 = null;
        java.util.Date date27 = null;
        org.team4.model.course.Course course30 = new org.team4.model.course.Course("hi!", date26, date27, "", "hi!");
        org.team4.model.user.Student student35 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str36 = student35.getType();
        course30.enrollStudent(student35);
        java.lang.String str38 = course30.getProfessorEmail();
        org.team4.model.course.CourseTextBook courseTextBook40 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) dVD1, "PayPal", 0, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:43 EDT 2024, dateDue=Wed May 01 18:27:43 EDT 2024}", (int) (short) 1, course30, true);
        java.lang.String str41 = courseTextBook40.getAuthor();
        java.util.Date date43 = null;
        java.util.Date date44 = null;
        org.team4.model.course.Course course47 = new org.team4.model.course.Course("hi!", date43, date44, "", "hi!");
        java.lang.String str48 = course47.getProfessorEmail();
        java.util.Date date49 = course47.getStartDate();
        java.util.Date date52 = null;
        java.util.Date date53 = null;
        org.team4.model.course.Course course56 = new org.team4.model.course.Course("hi!", date52, date53, "", "hi!");
        java.util.Date date57 = course56.getEndDate();
        java.lang.String str58 = course56.getProfessorEmail();
        java.lang.String str59 = course56.getProfessorEmail();
        org.team4.model.user.Student student64 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean65 = course56.isEnrolled(student64);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase66 = new org.team4.functionality.buy.ItemToPurchase(100.0d, (org.team4.model.user.User) student64);
        student64.setValidated(true);
        boolean boolean69 = course47.isEnrolled(student64);
        // The following exception was thrown during execution in test generation
        try {
            courseTextBook40.removeCopies(student64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}" + "'", str41, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNull(date49);
        org.junit.Assert.assertNull(date57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        java.lang.String str7 = itemToPurchase6.toString();
        double double8 = itemToPurchase6.getAmount();
        double double9 = itemToPurchase6.getAmount();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str7, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.team4.model.user.Student student6 = new org.team4.model.user.Student("SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:48 EDT 2024, dateDue=null}', email='hi!', dateSubscribed=Mon Apr 01 18:27:51 EDT 2024, dateDue=Wed May 01 18:27:51 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}", "User [email=, password=, name=hi!, type=, validated=true]", "ItemPurchased{title='', email='hi!', datePurchased=null}", true);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (byte) 100, (org.team4.model.user.User) student6);
        org.team4.model.user.User user8 = itemToPurchase7.getUser();
        org.junit.Assert.assertNotNull(user8);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("User [email=, password=, name=hi!, type=, validated=true]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=Wed May 01 18:27:45 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=null}");
        nonFaculty4.setUniversityID((long) 100);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        java.util.Date date2 = null;
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("", "hi!", date2);
        java.lang.String str4 = itemPurchased3.getTitle();
        java.util.Date date5 = itemPurchased3.getDatePurchased();
        java.lang.String str6 = itemPurchased3.getTitle();
        java.util.Date date7 = itemPurchased3.getDatePurchased();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("PayPal", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=Wed May 01 18:27:45 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=null}");
        org.team4.model.user.Student student23 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str24 = student23.getType();
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        student23.setCourses(strList27);
        org.team4.model.user.Faculty faculty30 = new org.team4.model.user.Faculty("ItemPurchased{title='', email='hi!', datePurchased=null}", "Credit Card", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", (long) (byte) 0, strList27);
        org.team4.model.user.Faculty faculty31 = new org.team4.model.user.Faculty("User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "ItemPurchased{title='', email='', datePurchased=null}", 7241236L, strList27);
        org.team4.model.user.Student student32 = new org.team4.model.user.Student("", "User [email=, password=, name=hi!, type=, validated=true]", "ItemPurchased{title='', email='', datePurchased=null}", "ItemPurchased{title='Credit Card', email='Debit Card', datePurchased=Mon Apr 01 18:27:47 EDT 2024}", strList27);
        student4.setCourses(strList27);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='ItemPurchased{title='', email='', datePurchased=null}', email='hi!', dateSubscribed=Wed May 01 18:27:52 EDT 2024, dateDue=Wed May 01 18:27:52 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}", "", "hi!");
        java.util.ArrayList<java.lang.String> strList5 = faculty4.getCourses();
        org.junit.Assert.assertNull(strList5);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
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
        boolean boolean19 = dVD1.isRentable();
        dVD1.setPrice((double) 664591L);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
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
        int int8 = book7.getNoOfPages();
        boolean boolean9 = book7.hasHardCopy();
        java.lang.String str10 = book7.toString();
        boolean boolean11 = book7.isPurchasable();
        java.lang.String str12 = book7.getAuthor();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator13 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) book7);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}" + "'", str10, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
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
        java.lang.String str33 = student32.getPassword();
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:48 EDT 2024, dateDue=null}', email='hi!', dateSubscribed=Mon Apr 01 18:27:51 EDT 2024, dateDue=Wed May 01 18:27:51 EDT 2024}" + "'", str33, "SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:48 EDT 2024, dateDue=null}', email='hi!', dateSubscribed=Mon Apr 01 18:27:51 EDT 2024, dateDue=Wed May 01 18:27:51 EDT 2024}");
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        dVD1.setQuantity((int) (short) 1);
        dVD1.setQuantity((int) ' ');
        java.lang.String str9 = dVD1.getISBN();
        java.lang.String[] strArray17 = new java.lang.String[] { "ItemPurchased{title='', email='', datePurchased=null}", "SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        org.team4.model.user.Faculty faculty20 = new org.team4.model.user.Faculty("Mobile Wallet", "hi!", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "Credit Card", 1L, strList18);
        long long21 = faculty20.getFacultyID();
        faculty20.setFacultyID((long) 10);
        java.util.ArrayList<java.lang.String> strList24 = faculty20.getCourses();
        long long25 = faculty20.getFacultyID();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase26 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) dVD1, (org.team4.model.user.User) faculty20);
        java.lang.String str27 = itemToPurchase26.toString();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.quantity((int) (short) 100);
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder0.build();
        java.util.List<org.team4.model.user.Student> studentList10 = courseTextBook9.getStudentsWithCopies();
        java.util.List<org.team4.model.user.Student> studentList11 = courseTextBook9.getStudentsWithCopies();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(courseTextBook9);
        org.junit.Assert.assertNotNull(studentList10);
        org.junit.Assert.assertNotNull(studentList11);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
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
        org.team4.model.items.Magazine magazine17 = new org.team4.model.items.Magazine((org.team4.model.items.Item) book7, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:45 EDT 2024}", 1);
        int int18 = magazine17.getIssueNumber();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}" + "'", str14, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder2 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        org.team4.model.course.Course course14 = new org.team4.model.course.Course("hi!", date10, date11, "", "hi!");
        org.team4.model.user.Student student19 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str20 = student19.getType();
        course14.enrollStudent(student19);
        java.lang.String str22 = course14.getProfessorEmail();
        java.lang.String str23 = course14.getProfessorEmail();
        java.lang.String str24 = course14.getCourseTextBookISBN();
        org.team4.model.course.CourseTextBook courseTextBook26 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) magazine3, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:48 EDT 2024, dateDue=null}", (int) (short) 100, "Book{genre='null', noOfPages=0, author='null', ISBN=null, publisher='null', edition='0'}", "PayPal", (int) (byte) 1, course14, true);
        java.util.Date date27 = course14.getEndDate();
        org.junit.Assert.assertNotNull(magazineBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(date27);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
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
        boolean boolean19 = dVD1.isRentable();
        dVD1.setRentable(true);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator22 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) dVD1);
        org.team4.model.items.Book book30 = new org.team4.model.items.Book((org.team4.model.items.Item) purchasableItemDecorator22, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", 10, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:45 EDT 2024}", "User [email=, password=, name=hi!, type=, validated=false]", 0, false, false);
        org.team4.model.items.Magazine magazine33 = new org.team4.model.items.Magazine((org.team4.model.items.Item) purchasableItemDecorator22, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", (int) 'a');
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        java.util.Date date19 = null;
        java.util.Date date20 = null;
        org.team4.model.course.Course course23 = new org.team4.model.course.Course("hi!", date19, date20, "", "hi!");
        java.util.Date date24 = course23.getEndDate();
        java.lang.String str25 = course23.getProfessorEmail();
        java.lang.String str26 = course23.getProfessorEmail();
        org.team4.model.user.Student student32 = new org.team4.model.user.Student("", "", "hi!", "");
        student32.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase35 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student32);
        java.lang.String str36 = student32.getEmail();
        course23.enrollStudent(student32);
        org.team4.model.user.Student student42 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str43 = student42.getType();
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        student42.setCourses(strList46);
        student32.setCourses(strList46);
        org.team4.model.user.Faculty faculty50 = new org.team4.model.user.Faculty("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "User [email=, password=, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}", (long) (short) 100, strList46);
        org.team4.model.user.Student student51 = new org.team4.model.user.Student("User [email=, password=, name=hi!, type=, validated=true]", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "", "ItemPurchased{title='', email='hi!', datePurchased=null}", strList46);
        org.team4.model.user.Faculty faculty52 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:48 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}", "ItemPurchased{title='Credit Card', email='Debit Card', datePurchased=Mon Apr 01 18:27:47 EDT 2024}", 1L, strList46);
        org.team4.model.user.Student student53 = new org.team4.model.user.Student("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:50 EDT 2024, dateDue=Wed May 01 18:27:50 EDT 2024}", "Credit Card", "User [email=, password=, name=hi!, type=, validated=false]", strList46);
        org.junit.Assert.assertNull(date24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        boolean boolean2 = payPal1.isValid();
        boolean boolean3 = payPal1.isValid();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 10);
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder2.genre("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder8 = dVDBuilder2.genre("User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder10 = dVDBuilder8.quantity((int) (short) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder12 = dVDItemBuilder10.title("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder14 = dVDItemBuilder12.price((double) 52);
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDBuilder8);
        org.junit.Assert.assertNotNull(dVDItemBuilder10);
        org.junit.Assert.assertNotNull(dVDItemBuilder12);
        org.junit.Assert.assertNotNull(dVDItemBuilder14);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("User [email=, password=, name=hi!, type=, validated=false]", "User [email=hi!, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=User [email=, password=, name=hi!, type=, validated=true], type=ItemPurchased{title='', email='', datePurchased=null}, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}", "Debit Card");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Wed May 01 18:27:52 EDT 2024, dateDue=Wed May 01 18:27:52 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:48 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:52 EDT 2024, dateDue=null}", (long) (-1));
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder0.publisher("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.Book book11 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder13 = courseTextBookBuilder0.hasHardCopy(false);
        org.team4.model.items.Book book14 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder15 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder17 = dVDBuilder15.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder19 = dVDBuilder17.price((double) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder21 = dVDBuilder17.ISBN("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder23 = dVDBuilder17.quantity((int) (byte) -1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder25 = dVDItemBuilder23.quantity((int) (byte) 100);
        boolean boolean26 = book14.equals((java.lang.Object) dVDItemBuilder23);
        org.team4.model.items.Magazine magazine29 = new org.team4.model.items.Magazine((org.team4.model.items.Item) book14, "", 100);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(bookBuilder13);
        org.junit.Assert.assertNotNull(book14);
        org.junit.Assert.assertNotNull(dVDBuilder17);
        org.junit.Assert.assertNotNull(dVDItemBuilder19);
        org.junit.Assert.assertNotNull(dVDItemBuilder21);
        org.junit.Assert.assertNotNull(dVDItemBuilder23);
        org.junit.Assert.assertNotNull(dVDItemBuilder25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.builder.BookBuilder bookBuilder9 = courseTextBookBuilder6.author("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookBuilder bookBuilder11 = bookBuilder9.author("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:43 EDT 2024, dateDue=Wed May 01 18:27:43 EDT 2024}");
        org.team4.model.items.builder.BookBuilder bookBuilder13 = bookBuilder9.hasSoftCopy(false);
        org.team4.model.items.builder.BookBuilder bookBuilder15 = bookBuilder9.noOfPages((int) ' ');
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(bookBuilder9);
        org.junit.Assert.assertNotNull(bookBuilder11);
        org.junit.Assert.assertNotNull(bookBuilder13);
        org.junit.Assert.assertNotNull(bookBuilder15);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("", "", "", "hi!", false);
        java.lang.String str6 = manager5.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str3 = subscribeNewsletter2.getEmail();
        java.lang.String str4 = subscribeNewsletter2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
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
        boolean boolean18 = dVD1.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator19 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD1);
        boolean boolean20 = rentableItemDecorator19.isRentable();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator21 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) rentableItemDecorator19);
        org.team4.model.items.Item item22 = rentableItemDecorator19.getItem();
        org.team4.model.items.decorator.ItemDecorator itemDecorator23 = new org.team4.model.items.decorator.ItemDecorator(item22);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(item22);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.team4.model.paymentmodes.PaymentValidator paymentValidator0 = null;
        org.team4.model.user.Student student6 = new org.team4.model.user.Student("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal", "Credit Card", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) 0.0f, (org.team4.model.user.User) student6);
        org.team4.functionality.buy.ProcessPayment processPayment8 = new org.team4.functionality.buy.ProcessPayment(paymentValidator0, itemToPurchase7);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.team4.model.user.User user5 = new org.team4.model.user.User("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=Wed May 01 18:27:45 EDT 2024}", "User [email=User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=User [email=, password=, name=hi!, type=, validated=false], type=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, validated=false], password=PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:48 EDT 2024}, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:53 EDT 2024, dateDue=null}", false);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
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
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder18 = courseTextBookBuilder16.isVirtual(true);
        org.team4.model.items.Book book19 = courseTextBookBuilder18.build();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(bookBuilder13);
        org.junit.Assert.assertNotNull(book14);
        org.junit.Assert.assertNotNull(courseTextBookBuilder16);
        org.junit.Assert.assertNotNull(courseTextBookBuilder18);
        org.junit.Assert.assertNotNull(book19);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.email("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder0.title("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}");
        org.team4.model.items.BookRequest bookRequest5 = bookRequestBuilder0.build();
        int int6 = bookRequest5.getEdition();
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequest5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder0.publisher("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.Book book11 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder13 = courseTextBookBuilder0.hasHardCopy(false);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder15 = bookBuilder13.ISBN("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder17 = bookItemBuilder15.price((double) (byte) 10);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(bookBuilder13);
        org.junit.Assert.assertNotNull(bookItemBuilder15);
        org.junit.Assert.assertNotNull(bookItemBuilder17);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        java.util.Date date2 = null;
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("", "hi!", date2);
        java.lang.String str4 = itemPurchased3.getTitle();
        java.util.Date date5 = itemPurchased3.getDatePurchased();
        java.lang.String str6 = itemPurchased3.getEmail();
        java.util.Date date7 = itemPurchased3.getDatePurchased();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.team4.model.user.User user5 = new org.team4.model.user.User("", "", "User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=User [email=, password=, name=hi!, type=, validated=false], type=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, validated=false]", "User [email=, password=, name=hi!, type=, validated=false]", true);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "hi!", "", "", false);
        java.lang.String str6 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str6, "User [email=, password=, name=hi!, type=, validated=false]");
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
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
        java.util.Date date24 = null;
        java.util.Date date25 = null;
        org.team4.model.course.Course course28 = new org.team4.model.course.Course("hi!", date24, date25, "", "hi!");
        java.util.Date date29 = course28.getEndDate();
        java.lang.String str30 = course28.getProfessorEmail();
        java.lang.String str31 = course28.getProfessorEmail();
        org.team4.model.course.CourseTextBook courseTextBook33 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) dVD1, "", 0, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "hi!", (-1), course28, false);
        org.team4.model.course.Course course34 = courseTextBook33.getCourse();
        java.lang.String str35 = courseTextBook33.getPublisher();
        java.lang.String str36 = courseTextBook33.getISBN();
        courseTextBook33.setPrice((double) 4751120L);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(date29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(course34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder6.quantity((-1));
        org.team4.model.items.Book book11 = courseTextBookBuilder6.build();
        java.lang.Object obj12 = null;
        boolean boolean13 = book11.equals(obj12);
        double double14 = book11.getPrice();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
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
        boolean boolean18 = dVD1.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator19 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD1);
        org.team4.model.items.decorator.ItemDecorator itemDecorator20 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) dVD1);
        org.team4.model.user.Student student25 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str26 = student25.getType();
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        student25.setCourses(strList29);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase32 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) itemDecorator20, (org.team4.model.user.User) student25);
        double double33 = itemToPurchase32.getAmount();
        org.team4.model.paymentmodes.PayPal payPal35 = new org.team4.model.paymentmodes.PayPal("User [email=, password=, name=hi!, type=, validated=false]");
        boolean boolean36 = payPal35.isValid();
        java.lang.String str37 = payPal35.toString();
        java.lang.String str38 = payPal35.toString();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete39 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase32, (org.team4.model.paymentmodes.PaymentValidator) payPal35);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str37, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str38, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter2.setTitle("");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter13 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str14 = subscribeNewsletter13.getEmail();
        java.util.Date date15 = subscribeNewsletter13.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter18 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str19 = subscribeNewsletter18.getEmail();
        java.util.Date date20 = subscribeNewsletter18.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter21 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date15, date20);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter26 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str27 = subscribeNewsletter26.getEmail();
        java.util.Date date28 = subscribeNewsletter26.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter31 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str32 = subscribeNewsletter31.getEmail();
        java.util.Date date33 = subscribeNewsletter31.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter34 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date28, date33);
        org.team4.model.items.RentedItem rentedItem35 = new org.team4.model.items.RentedItem("Credit Card", "ItemPurchased{title='', email='', datePurchased=null}", date20, date28);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter42 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str43 = subscribeNewsletter42.getEmail();
        java.util.Date date44 = subscribeNewsletter42.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter47 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str48 = subscribeNewsletter47.getEmail();
        java.util.Date date49 = subscribeNewsletter47.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter50 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date44, date49);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter55 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str56 = subscribeNewsletter55.getEmail();
        java.util.Date date57 = subscribeNewsletter55.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter60 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str61 = subscribeNewsletter60.getEmail();
        java.util.Date date62 = subscribeNewsletter60.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter63 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date57, date62);
        org.team4.model.items.RentedItem rentedItem64 = new org.team4.model.items.RentedItem("Credit Card", "ItemPurchased{title='', email='', datePurchased=null}", date49, date57);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter65 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemPurchased{title='', email='', datePurchased=null}", "hi!", date20, date57);
        java.util.Date date66 = subscribeNewsletter65.getDateSubscribed();
        subscribeNewsletter2.setDateSubscribed(date66);
        java.util.Date date68 = subscribeNewsletter2.getDateDue();
        java.lang.String str69 = subscribeNewsletter2.getTitle();
        java.lang.String str70 = subscribeNewsletter2.toString();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(date33);
// flaky:         org.junit.Assert.assertEquals(date33.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(date49);
// flaky:         org.junit.Assert.assertEquals(date49.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(date57);
// flaky:         org.junit.Assert.assertEquals(date57.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNotNull(date62);
// flaky:         org.junit.Assert.assertEquals(date62.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertNotNull(date66);
// flaky:         org.junit.Assert.assertEquals(date66.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertNotNull(date68);
// flaky:         org.junit.Assert.assertEquals(date68.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Wed May 01 18:27:55 EDT 2024, dateDue=Wed May 01 18:27:55 EDT 2024}" + "'", str70, "SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Wed May 01 18:27:55 EDT 2024, dateDue=Wed May 01 18:27:55 EDT 2024}");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getEndDate();
        java.util.Date date7 = course5.getStartDate();
        org.team4.model.user.Student student13 = new org.team4.model.user.Student("", "", "hi!", "");
        student13.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase16 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student13);
        boolean boolean17 = course5.isEnrolled(student13);
        java.util.Date date20 = null;
        java.util.Date date21 = null;
        org.team4.model.course.Course course24 = new org.team4.model.course.Course("hi!", date20, date21, "", "hi!");
        java.util.Date date25 = course24.getEndDate();
        java.lang.String str26 = course24.getProfessorEmail();
        java.lang.String str27 = course24.getProfessorEmail();
        org.team4.model.user.Student student32 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean33 = course24.isEnrolled(student32);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase34 = new org.team4.functionality.buy.ItemToPurchase(100.0d, (org.team4.model.user.User) student32);
        boolean boolean35 = course5.isEnrolled(student32);
        java.lang.String str36 = course5.getProfessorEmail();
        java.util.Date date38 = null;
        java.util.Date date39 = null;
        org.team4.model.course.Course course42 = new org.team4.model.course.Course("hi!", date38, date39, "", "hi!");
        org.team4.model.user.Student student47 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str48 = student47.getType();
        course42.enrollStudent(student47);
        java.util.ArrayList<java.lang.String> strList50 = student47.getCourses();
        student47.setPassword("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:43 EDT 2024, dateDue=Wed May 01 18:27:43 EDT 2024}");
        course5.enrollStudent(student47);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter60 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str61 = subscribeNewsletter60.getEmail();
        java.util.Date date62 = subscribeNewsletter60.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter65 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str66 = subscribeNewsletter65.getEmail();
        java.util.Date date67 = subscribeNewsletter65.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter68 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date62, date67);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter73 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str74 = subscribeNewsletter73.getEmail();
        java.util.Date date75 = subscribeNewsletter73.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter78 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str79 = subscribeNewsletter78.getEmail();
        java.util.Date date80 = subscribeNewsletter78.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter81 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date75, date80);
        org.team4.model.items.RentedItem rentedItem82 = new org.team4.model.items.RentedItem("Credit Card", "ItemPurchased{title='', email='', datePurchased=null}", date67, date75);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean83 = course5.isStarted(date75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(date25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNull(strList50);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNotNull(date62);
// flaky:         org.junit.Assert.assertEquals(date62.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertNotNull(date67);
// flaky:         org.junit.Assert.assertEquals(date67.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertNotNull(date75);
// flaky:         org.junit.Assert.assertEquals(date75.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertNotNull(date80);
// flaky:         org.junit.Assert.assertEquals(date80.toString(), "Wed May 01 18:27:55 EDT 2024");
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
        int int8 = book7.getNoOfPages();
        boolean boolean9 = book7.hasHardCopy();
        java.lang.String str10 = book7.toString();
        java.lang.String str11 = book7.getAuthor();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}" + "'", str10, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}", (double) (short) 0);
        double double4 = newsletter3.getPrice();
        org.team4.model.user.User user11 = new org.team4.model.user.User("", "hi!", "hi!", "hi!", false);
        user11.setType("");
        user11.setName("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase16 = new org.team4.functionality.buy.ItemToPurchase(1.0d, user11);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase17 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, user11);
        user11.setEmail("User [email=, password=, name=hi!, type=, validated=true]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter2.setTitle("");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter13 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str14 = subscribeNewsletter13.getEmail();
        java.util.Date date15 = subscribeNewsletter13.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter18 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str19 = subscribeNewsletter18.getEmail();
        java.util.Date date20 = subscribeNewsletter18.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter21 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date15, date20);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter26 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str27 = subscribeNewsletter26.getEmail();
        java.util.Date date28 = subscribeNewsletter26.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter31 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str32 = subscribeNewsletter31.getEmail();
        java.util.Date date33 = subscribeNewsletter31.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter34 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date28, date33);
        org.team4.model.items.RentedItem rentedItem35 = new org.team4.model.items.RentedItem("Credit Card", "ItemPurchased{title='', email='', datePurchased=null}", date20, date28);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter42 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str43 = subscribeNewsletter42.getEmail();
        java.util.Date date44 = subscribeNewsletter42.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter47 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str48 = subscribeNewsletter47.getEmail();
        java.util.Date date49 = subscribeNewsletter47.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter50 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date44, date49);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter55 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str56 = subscribeNewsletter55.getEmail();
        java.util.Date date57 = subscribeNewsletter55.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter60 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str61 = subscribeNewsletter60.getEmail();
        java.util.Date date62 = subscribeNewsletter60.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter63 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date57, date62);
        org.team4.model.items.RentedItem rentedItem64 = new org.team4.model.items.RentedItem("Credit Card", "ItemPurchased{title='', email='', datePurchased=null}", date49, date57);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter65 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemPurchased{title='', email='', datePurchased=null}", "hi!", date20, date57);
        java.util.Date date66 = subscribeNewsletter65.getDateSubscribed();
        subscribeNewsletter2.setDateSubscribed(date66);
        java.util.Date date68 = subscribeNewsletter2.getDateDue();
        java.lang.String str69 = subscribeNewsletter2.getTitle();
        subscribeNewsletter2.setEmail("User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(date33);
// flaky:         org.junit.Assert.assertEquals(date33.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(date49);
// flaky:         org.junit.Assert.assertEquals(date49.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(date57);
// flaky:         org.junit.Assert.assertEquals(date57.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNotNull(date62);
// flaky:         org.junit.Assert.assertEquals(date62.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertNotNull(date66);
// flaky:         org.junit.Assert.assertEquals(date66.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertNotNull(date68);
// flaky:         org.junit.Assert.assertEquals(date68.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.team4.model.user.UserFactory userFactory0 = new org.team4.model.user.UserFactory();
        org.team4.model.user.User user6 = userFactory0.getUser("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}", "Debit Card", "PayPal", true);
        org.team4.model.user.User user12 = userFactory0.getUser("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}", "User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:51 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:51 EDT 2024}", true);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder2 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder5 = magazineBuilder0.publisher("User [email=, password=, name=hi!, type=, validated=true]");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder7 = magazineBuilder0.yearPublished((int) '#');
        org.junit.Assert.assertNotNull(magazineBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertNotNull(magazineBuilder5);
        org.junit.Assert.assertNotNull(magazineItemBuilder7);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.paymentmodes.DebitCard debitCard15 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete16 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) debitCard15);
        org.team4.model.items.Newsletter newsletter17 = purchaseComplete16.getNewsletter();
        org.team4.model.items.Newsletter newsletter18 = purchaseComplete16.getNewsletter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNull(newsletter18);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", (double) 10L);
        java.lang.String str4 = newsletter3.getTitle();
        double double5 = newsletter3.getPrice();
        double double6 = newsletter3.getPrice();
        double double7 = newsletter3.getPrice();
        org.team4.model.user.Faculty faculty13 = new org.team4.model.user.Faculty("Credit Card", "hi!", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=null}", false);
        faculty13.setName("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:45 EDT 2024}");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase16 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) faculty13);
        double double17 = newsletter3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str4, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Wed May 01 18:27:55 EDT 2024, dateDue=Wed May 01 18:27:55 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:48 EDT 2024, dateDue=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "SubscribeNewsletter{title='ItemPurchased{title='', email='', datePurchased=null}', email='hi!', dateSubscribed=Wed May 01 18:27:52 EDT 2024, dateDue=Wed May 01 18:27:52 EDT 2024}");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemPurchased{title='', email='', datePurchased=null}", false);
        faculty5.setFacultyID(52L);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("", "Mobile Wallet", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "", false);
        nonFaculty5.setUniversityID(32L);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("Credit Card", 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        boolean boolean9 = book7.hasHardCopy();
        int int10 = book7.getEdition();
        int int11 = book7.getNoOfPages();
        boolean boolean12 = book7.hasSoftCopy();
        java.lang.String str13 = book7.getGenre();
        java.util.Date date20 = null;
        java.util.Date date21 = null;
        org.team4.model.course.Course course24 = new org.team4.model.course.Course("hi!", date20, date21, "", "hi!");
        org.team4.model.user.Student student29 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str30 = student29.getType();
        course24.enrollStudent(student29);
        java.lang.String str32 = course24.getProfessorEmail();
        java.lang.String str33 = course24.getCourseTextBookISBN();
        org.team4.model.course.CourseTextBook courseTextBook35 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) book7, "SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Wed May 01 18:27:55 EDT 2024, dateDue=Wed May 01 18:27:55 EDT 2024}", 0, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:52 EDT 2024, dateDue=null}", 10, course24, true);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished(10);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        int int4 = magazine3.getIssueNumber();
        java.lang.String str5 = magazine3.getPublisher();
        int int6 = magazine3.getIssueNumber();
        org.team4.model.items.DVD dVD9 = new org.team4.model.items.DVD((org.team4.model.items.Item) magazine3, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:48 EDT 2024}", (double) 213331L);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:43 EDT 2024, dateDue=Wed May 01 18:27:43 EDT 2024}", "User [email=, password=, name=hi!, type=, validated=false]", (double) 52);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:54 EDT 2024}", "User [email=User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=User [email=, password=, name=hi!, type=, validated=false], type=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, validated=false], password=PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:48 EDT 2024}, validated=false]", "SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Wed May 01 18:27:55 EDT 2024, dateDue=Wed May 01 18:27:55 EDT 2024}", "PayPal{email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}'}", (long) (-1));
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        boolean boolean9 = book7.hasHardCopy();
        boolean boolean10 = book7.hasHardCopy();
        boolean boolean12 = book7.equals((java.lang.Object) 100L);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator13 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book7);
        book7.setPrice(0.0d);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator16 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) book7);
        org.team4.model.items.Magazine magazine19 = new org.team4.model.items.Magazine((org.team4.model.items.Item) book7, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:52 EDT 2024, dateDue=null}", (int) 'a');
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.quantity((int) (short) 100);
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder0.build();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator10 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook9);
        boolean boolean11 = courseTextBook9.hasSoftCopy();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(courseTextBook9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("User [email=, password=, name=hi!, type=, validated=true]", "User [email=User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=User [email=, password=, name=hi!, type=, validated=false], type=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, validated=false], password=PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:48 EDT 2024}, validated=false]", "User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:45 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=Wed May 01 18:27:45 EDT 2024}, validated=false]", "hi!");
    }

    @Ignore
    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("ItemPurchased{title='', email='', datePurchased=null}");
        java.lang.String str2 = mobileWallet1.getMode();
        java.lang.String str3 = mobileWallet1.getMode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PayPal" + "'", str2, "PayPal");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PayPal" + "'", str3, "PayPal");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
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
        boolean boolean18 = dVD1.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator19 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD1);
        boolean boolean20 = rentableItemDecorator19.isRentable();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator21 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) rentableItemDecorator19);
        org.team4.model.items.Item item22 = rentableItemDecorator19.getItem();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator23 = new org.team4.model.items.decorator.RentableItemDecorator(item22);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(item22);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getEndDate();
        java.lang.String str7 = course5.getCourseName();
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder11 = courseTextBookBuilder6.price((double) 100.0f);
        org.team4.model.course.CourseTextBook courseTextBook12 = courseTextBookBuilder6.build();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNotNull(bookItemBuilder11);
        org.junit.Assert.assertNotNull(courseTextBook12);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder0.publisher("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder12 = courseTextBookBuilder0.noOfPages(1);
        org.team4.model.items.builder.BookBuilder bookBuilder14 = bookBuilder12.hasHardCopy(true);
        org.team4.model.items.Book book15 = bookBuilder12.build();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(bookBuilder12);
        org.junit.Assert.assertNotNull(bookBuilder14);
        org.junit.Assert.assertNotNull(book15);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
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
        java.util.Date date24 = null;
        java.util.Date date25 = null;
        org.team4.model.course.Course course28 = new org.team4.model.course.Course("hi!", date24, date25, "", "hi!");
        java.util.Date date29 = course28.getEndDate();
        java.lang.String str30 = course28.getProfessorEmail();
        java.lang.String str31 = course28.getProfessorEmail();
        org.team4.model.course.CourseTextBook courseTextBook33 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) dVD1, "", 0, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "hi!", (-1), course28, false);
        org.team4.model.course.Course course34 = courseTextBook33.getCourse();
        java.lang.String str35 = course34.getCourseName();
        java.util.Date date37 = null;
        java.util.Date date38 = null;
        org.team4.model.course.Course course41 = new org.team4.model.course.Course("hi!", date37, date38, "", "hi!");
        java.util.Date date42 = course41.getEndDate();
        java.util.Date date44 = null;
        java.util.Date date45 = null;
        org.team4.model.course.Course course48 = new org.team4.model.course.Course("hi!", date44, date45, "", "hi!");
        java.util.Date date49 = course48.getEndDate();
        java.lang.String str50 = course48.getProfessorEmail();
        java.lang.String str51 = course48.getProfessorEmail();
        org.team4.model.user.Student student57 = new org.team4.model.user.Student("", "", "hi!", "");
        student57.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase60 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student57);
        java.lang.String str61 = student57.getEmail();
        course48.enrollStudent(student57);
        course41.enrollStudent(student57);
        boolean boolean64 = course34.isEnrolled(student57);
        student57.setPassword("SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:48 EDT 2024, dateDue=null}', email='hi!', dateSubscribed=Mon Apr 01 18:27:51 EDT 2024, dateDue=Wed May 01 18:27:51 EDT 2024}");
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(date29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(course34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNull(date42);
        org.junit.Assert.assertNull(date49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
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
        java.util.Date date61 = subscribeNewsletter60.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter68 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str69 = subscribeNewsletter68.getEmail();
        java.util.Date date70 = subscribeNewsletter68.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter73 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str74 = subscribeNewsletter73.getEmail();
        java.util.Date date75 = subscribeNewsletter73.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter76 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date70, date75);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter81 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str82 = subscribeNewsletter81.getEmail();
        java.util.Date date83 = subscribeNewsletter81.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter86 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str87 = subscribeNewsletter86.getEmail();
        java.util.Date date88 = subscribeNewsletter86.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter89 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date83, date88);
        org.team4.model.items.RentedItem rentedItem90 = new org.team4.model.items.RentedItem("Credit Card", "ItemPurchased{title='', email='', datePurchased=null}", date75, date83);
        java.util.Date date91 = null;
        rentedItem90.setDueDate(date91);
        java.util.Date date93 = rentedItem90.getRentDate();
        java.util.Date date94 = rentedItem90.getRentDate();
        subscribeNewsletter60.setDateSubscribed(date94);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(date52);
// flaky:         org.junit.Assert.assertEquals(date52.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(date57);
// flaky:         org.junit.Assert.assertEquals(date57.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertNotNull(date61);
// flaky:         org.junit.Assert.assertEquals(date61.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertNotNull(date70);
// flaky:         org.junit.Assert.assertEquals(date70.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertNotNull(date75);
// flaky:         org.junit.Assert.assertEquals(date75.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertNotNull(date83);
// flaky:         org.junit.Assert.assertEquals(date83.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!" + "'", str87, "hi!");
        org.junit.Assert.assertNotNull(date88);
// flaky:         org.junit.Assert.assertEquals(date88.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertNotNull(date93);
// flaky:         org.junit.Assert.assertEquals(date93.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertNotNull(date94);
// flaky:         org.junit.Assert.assertEquals(date94.toString(), "Wed May 01 18:27:55 EDT 2024");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", (int) (short) 0, 10);
        org.team4.model.user.User user10 = new org.team4.model.user.User("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "User [email=, password=, name=hi!, type=, validated=false]", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", true);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase11 = new org.team4.functionality.buy.ItemToPurchase((double) 100.0f, user10);
        org.team4.functionality.buy.ProcessPayment processPayment12 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) debitCard3, itemToPurchase11);
        org.team4.model.paymentmodes.CreditCard creditCard16 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        boolean boolean17 = creditCard16.notExpired();
        java.lang.String str18 = creditCard16.getMode();
        boolean boolean19 = creditCard16.correctLength();
        boolean boolean20 = creditCard16.notExpired();
        boolean boolean21 = creditCard16.isValid();
        boolean boolean22 = creditCard16.notExpired();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete23 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase11, (org.team4.model.paymentmodes.PaymentValidator) creditCard16);
        org.team4.model.items.Newsletter newsletter24 = purchaseComplete23.getNewsletter();
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card" + "'", str18, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(newsletter24);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder0.publisher("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.Book book11 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder13 = courseTextBookBuilder0.hasHardCopy(false);
        org.team4.model.items.Book book14 = courseTextBookBuilder0.build();
        org.team4.model.items.Item item15 = new org.team4.model.items.Item((org.team4.model.items.Item) book14);
        org.team4.model.user.Student student21 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str22 = student21.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase23 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student21);
        org.team4.model.items.Newsletter newsletter24 = itemToPurchase23.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet26 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete27 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase23, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet26);
        org.team4.model.user.User user28 = purchaseComplete27.getUser();
        long long29 = purchaseComplete27.getPurchaseID();
        org.team4.model.user.User user30 = purchaseComplete27.getUser();
        org.team4.model.items.Newsletter newsletter31 = purchaseComplete27.getNewsletter();
        boolean boolean32 = book14.equals((java.lang.Object) purchaseComplete27);
        java.lang.String str33 = book14.getGenre();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(bookBuilder13);
        org.junit.Assert.assertNotNull(book14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(newsletter24);
        org.junit.Assert.assertNotNull(user28);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 548264L + "'", long29 == 548264L);
        org.junit.Assert.assertNotNull(user30);
        org.junit.Assert.assertNull(newsletter31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
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
        org.team4.model.paymentmodes.MobileWallet mobileWallet6 = new org.team4.model.paymentmodes.MobileWallet("");
        org.team4.model.user.Student student12 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str13 = student12.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase14 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student12);
        org.team4.model.items.Newsletter newsletter15 = itemToPurchase14.getNewsletter();
        org.team4.functionality.buy.ProcessPayment processPayment16 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet6, itemToPurchase14);
        boolean boolean17 = dVD1.equals((java.lang.Object) processPayment16);
        java.util.Date date24 = null;
        java.util.Date date25 = null;
        org.team4.model.course.Course course28 = new org.team4.model.course.Course("hi!", date24, date25, "", "hi!");
        java.util.Date date29 = course28.getEndDate();
        java.lang.String str30 = course28.getProfessorEmail();
        java.lang.String str31 = course28.getProfessorEmail();
        org.team4.model.course.CourseTextBook courseTextBook33 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) dVD1, "", 0, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "hi!", (-1), course28, false);
        org.team4.model.course.Course course34 = courseTextBook33.getCourse();
        java.lang.String str35 = course34.getCourseName();
        java.util.Date date37 = null;
        java.util.Date date38 = null;
        org.team4.model.course.Course course41 = new org.team4.model.course.Course("hi!", date37, date38, "", "hi!");
        java.util.Date date42 = course41.getEndDate();
        java.util.Date date44 = null;
        java.util.Date date45 = null;
        org.team4.model.course.Course course48 = new org.team4.model.course.Course("hi!", date44, date45, "", "hi!");
        java.util.Date date49 = course48.getEndDate();
        java.lang.String str50 = course48.getProfessorEmail();
        java.lang.String str51 = course48.getProfessorEmail();
        org.team4.model.user.Student student57 = new org.team4.model.user.Student("", "", "hi!", "");
        student57.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase60 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student57);
        java.lang.String str61 = student57.getEmail();
        course48.enrollStudent(student57);
        course41.enrollStudent(student57);
        boolean boolean64 = course34.isEnrolled(student57);
        java.util.Date date65 = course34.getEndDate();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(date29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(course34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNull(date42);
        org.junit.Assert.assertNull(date49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(date65);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder0.publisher("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder12 = courseTextBookBuilder0.noOfPages(1);
        org.team4.model.items.builder.BookBuilder bookBuilder14 = bookBuilder12.author("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookBuilder bookBuilder16 = bookBuilder12.genre("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=Wed May 01 18:27:45 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder18 = bookBuilder16.quantity((int) (short) 0);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(bookBuilder12);
        org.junit.Assert.assertNotNull(bookBuilder14);
        org.junit.Assert.assertNotNull(bookBuilder16);
        org.junit.Assert.assertNotNull(bookItemBuilder18);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("SubscribeNewsletter{title='hi!', email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', dateSubscribed=Mon Apr 01 18:27:54 EDT 2024, dateDue=Wed May 01 18:27:54 EDT 2024}");
        boolean boolean2 = mobileWallet1.isValid();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase2 = null;
        org.team4.functionality.buy.ProcessPayment processPayment3 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet1, itemToPurchase2);
        java.lang.String str4 = processPayment3.toString();
        java.lang.String str5 = processPayment3.toString();
        java.lang.String str6 = processPayment3.toString();
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
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
        rentedItem28.setDueDate(date52);
        rentedItem28.setTitle("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:50 EDT 2024, dateDue=Wed May 01 18:27:50 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(date26);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(date52);
// flaky:         org.junit.Assert.assertEquals(date52.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(date57);
// flaky:         org.junit.Assert.assertEquals(date57.toString(), "Wed May 01 18:27:55 EDT 2024");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.quantity((int) (short) 100);
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder0.build();
        org.team4.model.course.Course course10 = courseTextBook9.getCourse();
        boolean boolean11 = courseTextBook9.hasSoftCopy();
        org.team4.model.course.Course course12 = courseTextBook9.getCourse();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(courseTextBook9);
        org.junit.Assert.assertNull(course10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(course12);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        double double9 = itemToPurchase7.getAmount();
        org.team4.model.paymentmodes.PayPal payPal11 = new org.team4.model.paymentmodes.PayPal("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:48 EDT 2024, dateDue=null}");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete12 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) payPal11);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.team4.model.user.User user5 = new org.team4.model.user.User("User [email=, password=, name=hi!, type=, validated=false]", "Book{genre='null', noOfPages=0, author='null', ISBN=null, publisher='null', edition='0'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}", "", false);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
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
        java.util.Date date59 = rentedItem28.getDueDate();
        java.lang.String str60 = rentedItem28.getISBN();
        rentedItem28.setTitle("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter65 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter65.setTitle("");
        java.util.Date date68 = subscribeNewsletter65.getDateSubscribed();
        rentedItem28.setRentDate(date68);
        java.util.Date date70 = rentedItem28.getDueDate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(date26);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(date50);
// flaky:         org.junit.Assert.assertEquals(date50.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertNotNull(date55);
// flaky:         org.junit.Assert.assertEquals(date55.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertNotNull(date59);
// flaky:         org.junit.Assert.assertEquals(date59.toString(), "Wed May 01 18:27:55 EDT 2024");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}" + "'", str60, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
        org.junit.Assert.assertNotNull(date68);
// flaky:         org.junit.Assert.assertEquals(date68.toString(), "Mon Apr 01 18:27:55 EDT 2024");
        org.junit.Assert.assertNotNull(date70);
// flaky:         org.junit.Assert.assertEquals(date70.toString(), "Wed May 01 18:27:55 EDT 2024");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished(10);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder5 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder7 = magazineBuilder0.yearPublished((int) '#');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder9 = magazineItemBuilder7.yearPublished((int) (byte) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder11 = magazineItemBuilder7.title("User [email=hi!, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=User [email=, password=, name=hi!, type=, validated=true], type=ItemPurchased{title='', email='', datePurchased=null}, validated=false]");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertNotNull(magazineBuilder5);
        org.junit.Assert.assertNotNull(magazineItemBuilder7);
        org.junit.Assert.assertNotNull(magazineItemBuilder9);
        org.junit.Assert.assertNotNull(magazineItemBuilder11);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        dVD1.setRentable(true);
        dVD1.setQuantity((int) '4');
        java.lang.String str7 = dVD1.getGenre();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", (double) 10L);
        java.lang.String str4 = newsletter3.getTitle();
        java.lang.String str5 = newsletter3.getTitle();
        java.lang.String str6 = newsletter3.getLink();
        java.lang.String str7 = newsletter3.getLink();
        double double8 = newsletter3.getPrice();
        java.lang.String str9 = newsletter3.getTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str4, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str5, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str6, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str7, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str9, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
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
        boolean boolean18 = dVD1.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator19 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD1);
        org.team4.model.items.Item item20 = rentableItemDecorator19.getItem();
        org.team4.model.user.User user25 = new org.team4.model.user.User("", "hi!", "PayPal", "");
        java.lang.String str26 = user25.getPassword();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase27 = new org.team4.functionality.buy.ItemToPurchase(item20, user25);
        double double28 = itemToPurchase27.getAmount();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(item20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:51 EDT 2024, dateDue=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:53 EDT 2024, dateDue=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", 52L);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("Mobile Wallet", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:48 EDT 2024, dateDue=null}", (double) 10);
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
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        java.lang.String str9 = book7.getAuthor();
        java.lang.String str10 = book7.getISBN();
        boolean boolean11 = book7.hasHardCopy();
        java.lang.String str12 = book7.getGenre();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.course.CourseTextBook courseTextBook7 = courseTextBookBuilder6.build();
        java.lang.String str8 = courseTextBook7.getGenre();
        java.util.List<org.team4.model.user.Student> studentList9 = courseTextBook7.getStudentsWithCopies();
        java.lang.String str10 = courseTextBook7.getGenre();
        org.team4.model.course.Course course11 = courseTextBook7.getCourse();
        org.team4.model.items.Item item12 = new org.team4.model.items.Item((org.team4.model.items.Item) courseTextBook7);
        int int13 = courseTextBook7.getNoOfPages();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(courseTextBook7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(studentList9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(course11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.lang.String str3 = subscribeNewsletter2.getEmail();
        java.util.Date date4 = subscribeNewsletter2.getDateSubscribed();
        java.lang.String str5 = subscribeNewsletter2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str3, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Mon Apr 01 18:27:55 EDT 2024");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:55 EDT 2024, dateDue=Wed May 01 18:27:55 EDT 2024}" + "'", str5, "SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:55 EDT 2024, dateDue=Wed May 01 18:27:55 EDT 2024}");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        boolean boolean4 = debitCard3.correctLength();
        java.lang.String str5 = debitCard3.getMode();
        boolean boolean6 = debitCard3.isValid();
        boolean boolean7 = debitCard3.isValid();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:51 EDT 2024}", "User [email=hi!, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=User [email=, password=, name=hi!, type=, validated=true], type=ItemPurchased{title='', email='', datePurchased=null}, validated=false]");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:45 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=Wed May 01 18:27:45 EDT 2024}, validated=false]");
        java.lang.String str2 = payPal1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PayPal{email='User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:45 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=Wed May 01 18:27:45 EDT 2024}, validated=false]'}" + "'", str2, "PayPal{email='User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:45 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=Wed May 01 18:27:45 EDT 2024}, validated=false]'}");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        boolean boolean9 = book7.hasHardCopy();
        java.lang.String str10 = book7.toString();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder11 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder13 = courseTextBookBuilder11.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder15 = courseTextBookBuilder11.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder17 = courseTextBookBuilder11.isVirtual(true);
        org.team4.model.items.Book book18 = courseTextBookBuilder17.build();
        int int19 = book18.getNoOfPages();
        book18.setPrice((double) 0L);
        java.lang.String str22 = book18.getISBN();
        org.team4.model.items.Item item23 = new org.team4.model.items.Item((org.team4.model.items.Item) book18);
        org.team4.model.user.NonFaculty nonFaculty28 = new org.team4.model.user.NonFaculty("hi!", "hi!", "hi!", "");
        nonFaculty28.setUniversityID((long) (short) 100);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase31 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) book18, (org.team4.model.user.User) nonFaculty28);
        double double32 = itemToPurchase31.getAmount();
        boolean boolean33 = book7.equals((java.lang.Object) double32);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator34 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) book7);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}" + "'", str10, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
        org.junit.Assert.assertNotNull(bookBuilder13);
        org.junit.Assert.assertNotNull(bookItemBuilder15);
        org.junit.Assert.assertNotNull(courseTextBookBuilder17);
        org.junit.Assert.assertNotNull(book18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemPurchased{title='Credit Card', email='Debit Card', datePurchased=Mon Apr 01 18:27:47 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}");
        java.util.Date date3 = subscribeNewsletter2.getDateSubscribed();
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Mon Apr 01 18:27:55 EDT 2024");
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:53 EDT 2024, dateDue=null}", "Credit Card", "Mobile Wallet", "SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:48 EDT 2024, dateDue=null}', email='hi!', dateSubscribed=Mon Apr 01 18:27:51 EDT 2024, dateDue=Wed May 01 18:27:51 EDT 2024}", (long) (byte) 1);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        book7.setPrice((double) 0L);
        java.lang.String str11 = book7.getISBN();
        int int12 = book7.getYearPublished();
        java.util.Date date19 = null;
        java.util.Date date20 = null;
        org.team4.model.course.Course course23 = new org.team4.model.course.Course("hi!", date19, date20, "", "hi!");
        org.team4.model.user.Student student28 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str29 = student28.getType();
        course23.enrollStudent(student28);
        java.lang.String str31 = course23.getProfessorEmail();
        org.team4.model.user.Student student36 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str37 = student36.getType();
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        student36.setCourses(strList40);
        boolean boolean43 = course23.isEnrolled(student36);
        java.lang.String str44 = course23.getCourseTextBookISBN();
        org.team4.model.course.CourseTextBook courseTextBook46 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) book7, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:52 EDT 2024, dateDue=Wed May 01 18:27:52 EDT 2024}", (int) (short) 1, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:54 EDT 2024, dateDue=Wed May 01 18:27:54 EDT 2024}", (int) '4', course23, true);
        java.lang.String str47 = book7.getAuthor();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:43 EDT 2024, dateDue=Wed May 01 18:27:43 EDT 2024}", "Debit Card", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:51 EDT 2024}", "", true);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        boolean boolean9 = book7.hasHardCopy();
        boolean boolean10 = book7.hasHardCopy();
        org.team4.model.items.DVD dVD13 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Mobile Wallet", (double) 7241236L);
        java.util.Date date16 = null;
        java.util.Date date17 = null;
        org.team4.model.course.Course course20 = new org.team4.model.course.Course("hi!", date16, date17, "", "hi!");
        java.util.Date date21 = course20.getEndDate();
        java.lang.String str22 = course20.getProfessorEmail();
        java.lang.String str23 = course20.getProfessorEmail();
        org.team4.model.user.Student student28 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean29 = course20.isEnrolled(student28);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase30 = new org.team4.functionality.buy.ItemToPurchase(100.0d, (org.team4.model.user.User) student28);
        student28.setValidated(true);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase33 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) dVD13, (org.team4.model.user.User) student28);
        double double34 = itemToPurchase33.getAmount();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
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
        org.team4.model.items.RentedItem rentedItem30 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=null}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date10, date23);
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
        org.team4.model.items.RentedItem rentedItem59 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=null}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date39, date52);
        rentedItem30.setDueDate(date52);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter67 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str68 = subscribeNewsletter67.getEmail();
        java.util.Date date69 = subscribeNewsletter67.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter72 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str73 = subscribeNewsletter72.getEmail();
        java.util.Date date74 = subscribeNewsletter72.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter75 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date69, date74);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter80 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str81 = subscribeNewsletter80.getEmail();
        java.util.Date date82 = subscribeNewsletter80.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter85 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str86 = subscribeNewsletter85.getEmail();
        java.util.Date date87 = subscribeNewsletter85.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter88 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date82, date87);
        org.team4.model.items.RentedItem rentedItem89 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=null}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date69, date82);
        org.team4.model.items.RentedItem rentedItem90 = new org.team4.model.items.RentedItem("", "hi!", date52, date69);
        rentedItem90.setISBN("Credit Card");
        rentedItem90.setISBN("ItemPurchased{title='', email='', datePurchased=null}");
        java.lang.String str95 = rentedItem90.getTitle();
        java.util.Date date96 = rentedItem90.getRentDate();
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
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertNotNull(date69);
// flaky:         org.junit.Assert.assertEquals(date69.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertNotNull(date74);
// flaky:         org.junit.Assert.assertEquals(date74.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertNotNull(date82);
// flaky:         org.junit.Assert.assertEquals(date82.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertNotNull(date87);
// flaky:         org.junit.Assert.assertEquals(date87.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
        org.junit.Assert.assertNotNull(date96);
// flaky:         org.junit.Assert.assertEquals(date96.toString(), "Wed May 01 18:27:56 EDT 2024");
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished(10);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        int int4 = magazine3.getIssueNumber();
        org.team4.model.items.decorator.ItemDecorator itemDecorator5 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) magazine3);
        magazine3.setPrice((double) 4011383L);
        java.lang.String str8 = magazine3.getPublisher();
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=null}", "SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}", "PayPal", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}", 0L);
        manager5.setName("SubscribeNewsletter{title='ItemPurchased{title='', email='', datePurchased=null}', email='hi!', dateSubscribed=Wed May 01 18:27:52 EDT 2024, dateDue=Wed May 01 18:27:52 EDT 2024}");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter9 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str10 = subscribeNewsletter9.getEmail();
        java.util.Date date11 = subscribeNewsletter9.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter14 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str15 = subscribeNewsletter14.getEmail();
        java.util.Date date16 = subscribeNewsletter14.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter17 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date11, date16);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter22 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str23 = subscribeNewsletter22.getEmail();
        java.util.Date date24 = subscribeNewsletter22.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter27 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str28 = subscribeNewsletter27.getEmail();
        java.util.Date date29 = subscribeNewsletter27.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter30 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date24, date29);
        org.team4.model.items.RentedItem rentedItem31 = new org.team4.model.items.RentedItem("Credit Card", "ItemPurchased{title='', email='', datePurchased=null}", date16, date24);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter38 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str39 = subscribeNewsletter38.getEmail();
        java.util.Date date40 = subscribeNewsletter38.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter43 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str44 = subscribeNewsletter43.getEmail();
        java.util.Date date45 = subscribeNewsletter43.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter46 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date40, date45);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter51 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str52 = subscribeNewsletter51.getEmail();
        java.util.Date date53 = subscribeNewsletter51.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter56 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str57 = subscribeNewsletter56.getEmail();
        java.util.Date date58 = subscribeNewsletter56.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter59 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date53, date58);
        org.team4.model.items.RentedItem rentedItem60 = new org.team4.model.items.RentedItem("Credit Card", "ItemPurchased{title='', email='', datePurchased=null}", date45, date53);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter61 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemPurchased{title='', email='', datePurchased=null}", "hi!", date16, date53);
        java.util.Date date62 = subscribeNewsletter61.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter65 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter65.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date68 = subscribeNewsletter65.getDateDue();
        org.team4.model.course.Course course71 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Wed May 01 18:27:55 EDT 2024, dateDue=Wed May 01 18:27:55 EDT 2024}", date62, date68, "SubscribeNewsletter{title='hi!', email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', dateSubscribed=Mon Apr 01 18:27:54 EDT 2024, dateDue=Wed May 01 18:27:54 EDT 2024}", "User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=User [email=, password=, name=hi!, type=, validated=false], type=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, validated=false]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(date24);
// flaky:         org.junit.Assert.assertEquals(date24.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(date40);
// flaky:         org.junit.Assert.assertEquals(date40.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(date45);
// flaky:         org.junit.Assert.assertEquals(date45.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(date53);
// flaky:         org.junit.Assert.assertEquals(date53.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(date58);
// flaky:         org.junit.Assert.assertEquals(date58.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertNotNull(date62);
// flaky:         org.junit.Assert.assertEquals(date62.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertNotNull(date68);
// flaky:         org.junit.Assert.assertEquals(date68.toString(), "Wed May 01 18:27:56 EDT 2024");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter4 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str5 = subscribeNewsletter4.getTitle();
        java.lang.String str6 = subscribeNewsletter4.toString();
        java.lang.String str7 = subscribeNewsletter4.getTitle();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter14 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str15 = subscribeNewsletter14.getEmail();
        java.util.Date date16 = subscribeNewsletter14.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter19 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str20 = subscribeNewsletter19.getEmail();
        java.util.Date date21 = subscribeNewsletter19.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter22 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date16, date21);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter27 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str28 = subscribeNewsletter27.getEmail();
        java.util.Date date29 = subscribeNewsletter27.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter32 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str33 = subscribeNewsletter32.getEmail();
        java.util.Date date34 = subscribeNewsletter32.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter35 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date29, date34);
        org.team4.model.items.RentedItem rentedItem36 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=null}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date16, date29);
        subscribeNewsletter4.setDateDue(date29);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter43 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str44 = subscribeNewsletter43.getEmail();
        java.util.Date date45 = subscribeNewsletter43.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter48 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str49 = subscribeNewsletter48.getEmail();
        java.util.Date date50 = subscribeNewsletter48.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter51 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date45, date50);
        java.util.Date date52 = null;
        org.team4.model.course.Course course55 = new org.team4.model.course.Course("ItemPurchased{title='Credit Card', email='Debit Card', datePurchased=Mon Apr 01 18:27:47 EDT 2024}", date50, date52, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=Wed May 01 18:27:45 EDT 2024}");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter56 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:52 EDT 2024, dateDue=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:53 EDT 2024, dateDue=null}", date29, date50);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:56 EDT 2024, dateDue=Wed May 01 18:27:56 EDT 2024}" + "'", str6, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:56 EDT 2024, dateDue=Wed May 01 18:27:56 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(date34);
// flaky:         org.junit.Assert.assertEquals(date34.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(date45);
// flaky:         org.junit.Assert.assertEquals(date45.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(date50);
// flaky:         org.junit.Assert.assertEquals(date50.toString(), "Wed May 01 18:27:56 EDT 2024");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("User [email=, password=, name=hi!, type=, validated=true]", (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 52");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.team4.model.user.Student student14 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str15 = student14.getType();
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        student14.setCourses(strList18);
        org.team4.model.user.Faculty faculty21 = new org.team4.model.user.Faculty("ItemPurchased{title='', email='hi!', datePurchased=null}", "Credit Card", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", (long) (byte) 0, strList18);
        org.team4.model.user.Faculty faculty22 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}", "User [email=, password=, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:43 EDT 2024, dateDue=Wed May 01 18:27:43 EDT 2024}", "", (long) (short) 10, strList18);
        faculty22.setEmail("User [email=, password=, name=hi!, type=, validated=true]");
        java.util.ArrayList<java.lang.String> strList25 = faculty22.getCourses();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.DVD dVD3 = dVDBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder5 = dVDBuilder0.genre("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder7 = dVDBuilder0.title("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:40 EDT 2024, dateDue=Wed May 01 18:27:40 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder9 = dVDItemBuilder7.price(0.0d);
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVD3);
        org.junit.Assert.assertNotNull(dVDBuilder5);
        org.junit.Assert.assertNotNull(dVDItemBuilder7);
        org.junit.Assert.assertNotNull(dVDItemBuilder9);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
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
        org.team4.model.items.RentedItem rentedItem30 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=null}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date10, date23);
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
        org.team4.model.items.RentedItem rentedItem59 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=null}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date39, date52);
        rentedItem30.setDueDate(date52);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter67 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str68 = subscribeNewsletter67.getEmail();
        java.util.Date date69 = subscribeNewsletter67.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter72 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str73 = subscribeNewsletter72.getEmail();
        java.util.Date date74 = subscribeNewsletter72.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter75 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date69, date74);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter80 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str81 = subscribeNewsletter80.getEmail();
        java.util.Date date82 = subscribeNewsletter80.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter85 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str86 = subscribeNewsletter85.getEmail();
        java.util.Date date87 = subscribeNewsletter85.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter88 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date82, date87);
        org.team4.model.items.RentedItem rentedItem89 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=null}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date69, date82);
        org.team4.model.items.RentedItem rentedItem90 = new org.team4.model.items.RentedItem("", "hi!", date52, date69);
        rentedItem90.setISBN("Credit Card");
        java.util.Date date93 = null;
        rentedItem90.setRentDate(date93);
        java.util.Date date95 = rentedItem90.getRentDate();
        rentedItem90.setISBN("User [email=hi!, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=User [email=, password=, name=hi!, type=, validated=true], type=ItemPurchased{title='', email='', datePurchased=null}, validated=false]");
        rentedItem90.setTitle("SubscribeNewsletter{title='ItemPurchased{title='', email='', datePurchased=null}', email='hi!', dateSubscribed=Wed May 01 18:27:52 EDT 2024, dateDue=Wed May 01 18:27:52 EDT 2024}");
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
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertNotNull(date69);
// flaky:         org.junit.Assert.assertEquals(date69.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertNotNull(date74);
// flaky:         org.junit.Assert.assertEquals(date74.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertNotNull(date82);
// flaky:         org.junit.Assert.assertEquals(date82.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertNotNull(date87);
// flaky:         org.junit.Assert.assertEquals(date87.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertNull(date95);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        boolean boolean9 = book7.hasHardCopy();
        boolean boolean10 = book7.hasHardCopy();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder11 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder13 = courseTextBookBuilder11.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder15 = courseTextBookBuilder11.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder17 = courseTextBookBuilder11.isVirtual(true);
        org.team4.model.items.Book book18 = courseTextBookBuilder17.build();
        int int19 = book18.getNoOfPages();
        boolean boolean20 = book18.hasHardCopy();
        boolean boolean21 = book18.hasHardCopy();
        org.team4.model.items.DVD dVD24 = new org.team4.model.items.DVD((org.team4.model.items.Item) book18, "Mobile Wallet", (double) 7241236L);
        java.lang.String str25 = book18.toString();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator26 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) book18);
        boolean boolean27 = purchasableItemDecorator26.isPurchasable();
        boolean boolean28 = book7.equals((java.lang.Object) purchasableItemDecorator26);
        java.lang.String str29 = book7.toString();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookBuilder13);
        org.junit.Assert.assertNotNull(bookItemBuilder15);
        org.junit.Assert.assertNotNull(courseTextBookBuilder17);
        org.junit.Assert.assertNotNull(book18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}" + "'", str25, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}" + "'", str29, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder2 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder4 = magazineBuilder0.quantity((-1));
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.quantity((int) (short) 0);
        org.junit.Assert.assertNotNull(magazineBuilder2);
        org.junit.Assert.assertNotNull(magazineItemBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='ItemPurchased{title='', email='', datePurchased=null}', email='hi!', dateSubscribed=Wed May 01 18:27:52 EDT 2024, dateDue=Wed May 01 18:27:52 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}", "", "hi!");
        java.lang.String str5 = faculty4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [email=SubscribeNewsletter{title='ItemPurchased{title='', email='', datePurchased=null}', email='hi!', dateSubscribed=Wed May 01 18:27:52 EDT 2024, dateDue=Wed May 01 18:27:52 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}, name=, type=hi!, validated=false]" + "'", str5, "User [email=SubscribeNewsletter{title='ItemPurchased{title='', email='', datePurchased=null}', email='hi!', dateSubscribed=Wed May 01 18:27:52 EDT 2024, dateDue=Wed May 01 18:27:52 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:47 EDT 2024}, name=, type=hi!, validated=false]");
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
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
        org.team4.model.items.RentedItem rentedItem30 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=null}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date10, date23);
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
        org.team4.model.items.RentedItem rentedItem59 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=null}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date39, date52);
        rentedItem30.setDueDate(date52);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter67 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str68 = subscribeNewsletter67.getEmail();
        java.util.Date date69 = subscribeNewsletter67.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter72 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str73 = subscribeNewsletter72.getEmail();
        java.util.Date date74 = subscribeNewsletter72.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter75 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date69, date74);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter80 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str81 = subscribeNewsletter80.getEmail();
        java.util.Date date82 = subscribeNewsletter80.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter85 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str86 = subscribeNewsletter85.getEmail();
        java.util.Date date87 = subscribeNewsletter85.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter88 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date82, date87);
        org.team4.model.items.RentedItem rentedItem89 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=null}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date69, date82);
        org.team4.model.items.RentedItem rentedItem90 = new org.team4.model.items.RentedItem("", "hi!", date52, date69);
        rentedItem90.setISBN("Credit Card");
        java.util.Date date93 = null;
        rentedItem90.setRentDate(date93);
        java.util.Date date95 = rentedItem90.getDueDate();
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
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertNotNull(date69);
// flaky:         org.junit.Assert.assertEquals(date69.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertNotNull(date74);
// flaky:         org.junit.Assert.assertEquals(date74.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertNotNull(date82);
// flaky:         org.junit.Assert.assertEquals(date82.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertNotNull(date87);
// flaky:         org.junit.Assert.assertEquals(date87.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertNotNull(date95);
// flaky:         org.junit.Assert.assertEquals(date95.toString(), "Wed May 01 18:27:56 EDT 2024");
    }

    @Ignore
    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("");
        java.lang.String str2 = mobileWallet1.getMode();
        java.lang.String str3 = mobileWallet1.getMode();
        java.lang.String str4 = mobileWallet1.getMode();
        boolean boolean5 = mobileWallet1.isValid();
        java.lang.String str6 = mobileWallet1.getMode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PayPal" + "'", str2, "PayPal");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PayPal" + "'", str3, "PayPal");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PayPal" + "'", str4, "PayPal");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PayPal" + "'", str6, "PayPal");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        dVD1.setQuantity((int) (short) 1);
        int int7 = dVD1.getQuantity();
        double double8 = dVD1.getDuration();
        double double9 = dVD1.getPrice();
        org.team4.model.items.Book book17 = new org.team4.model.items.Book((org.team4.model.items.Item) dVD1, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}", 1, "User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]", "User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]", 1, true, true);
        org.team4.model.items.decorator.ItemDecorator itemDecorator18 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) dVD1);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.team4.functionality.buy.ItemPurchased itemPurchased2 = new org.team4.functionality.buy.ItemPurchased("PayPal{email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=Wed May 01 18:27:45 EDT 2024}");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
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
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder18 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder20 = courseTextBookBuilder18.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder22 = courseTextBookBuilder18.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder24 = courseTextBookBuilder18.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder26 = courseTextBookBuilder24.yearPublished((int) (short) 100);
        boolean boolean27 = dVD1.equals((java.lang.Object) courseTextBookBuilder24);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder29 = courseTextBookBuilder24.quantity(100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder31 = courseTextBookBuilder24.yearPublished((int) (byte) -1);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookBuilder20);
        org.junit.Assert.assertNotNull(bookItemBuilder22);
        org.junit.Assert.assertNotNull(courseTextBookBuilder24);
        org.junit.Assert.assertNotNull(bookItemBuilder26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookItemBuilder29);
        org.junit.Assert.assertNotNull(bookItemBuilder31);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", (double) 10L);
        java.lang.String str4 = newsletter3.getTitle();
        double double5 = newsletter3.getPrice();
        double double6 = newsletter3.getPrice();
        double double7 = newsletter3.getPrice();
        java.lang.String str8 = newsletter3.getLink();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str4, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str8, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter4 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str5 = subscribeNewsletter4.getEmail();
        java.util.Date date6 = subscribeNewsletter4.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter9 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str10 = subscribeNewsletter9.getEmail();
        java.util.Date date11 = subscribeNewsletter9.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter12 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date6, date11);
        java.lang.String str13 = subscribeNewsletter12.getTitle();
        java.lang.String str14 = subscribeNewsletter12.getTitle();
        java.lang.String str15 = subscribeNewsletter12.getEmail();
        subscribeNewsletter12.setEmail("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PayPal" + "'", str13, "PayPal");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PayPal" + "'", str14, "PayPal");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("User [email=, password=, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", 0L);
        nonFaculty5.setUniversityID((long) (byte) 10);
        long long8 = nonFaculty5.getUniversityID();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter6 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str7 = subscribeNewsletter6.getEmail();
        java.util.Date date8 = subscribeNewsletter6.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter15 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str16 = subscribeNewsletter15.getEmail();
        java.util.Date date17 = subscribeNewsletter15.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter20 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str21 = subscribeNewsletter20.getEmail();
        java.util.Date date22 = subscribeNewsletter20.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter23 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date17, date22);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter28 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str29 = subscribeNewsletter28.getEmail();
        java.util.Date date30 = subscribeNewsletter28.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter33 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str34 = subscribeNewsletter33.getEmail();
        java.util.Date date35 = subscribeNewsletter33.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter36 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date30, date35);
        org.team4.model.items.RentedItem rentedItem37 = new org.team4.model.items.RentedItem("Credit Card", "ItemPurchased{title='', email='', datePurchased=null}", date22, date30);
        org.team4.model.items.RentedItem rentedItem38 = new org.team4.model.items.RentedItem("hi!", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date8, date22);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter41 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter41.setTitle("");
        java.util.Date date44 = subscribeNewsletter41.getDateSubscribed();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter45 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "User [email=hi!, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=User [email=, password=, name=hi!, type=, validated=true], type=ItemPurchased{title='', email='', datePurchased=null}, validated=false]", date8, date44);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(date30);
// flaky:         org.junit.Assert.assertEquals(date30.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(date35);
// flaky:         org.junit.Assert.assertEquals(date35.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Mon Apr 01 18:27:56 EDT 2024");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:45 EDT 2024, dateDue=Wed May 01 18:27:45 EDT 2024}", "SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:48 EDT 2024, dateDue=null}', email='hi!', dateSubscribed=Mon Apr 01 18:27:51 EDT 2024, dateDue=Wed May 01 18:27:51 EDT 2024}", (double) 4212389L);
        double double4 = newsletter3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4212389.0d + "'", double4 == 4212389.0d);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder0.publisher("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.Book book11 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder13 = courseTextBookBuilder0.hasHardCopy(false);
        org.team4.model.items.Book book14 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder15 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder17 = dVDBuilder15.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder19 = dVDBuilder17.price((double) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder21 = dVDBuilder17.ISBN("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder23 = dVDBuilder17.quantity((int) (byte) -1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder25 = dVDItemBuilder23.quantity((int) (byte) 100);
        boolean boolean26 = book14.equals((java.lang.Object) dVDItemBuilder23);
        int int27 = book14.getQuantity();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(bookBuilder13);
        org.junit.Assert.assertNotNull(book14);
        org.junit.Assert.assertNotNull(dVDBuilder17);
        org.junit.Assert.assertNotNull(dVDItemBuilder19);
        org.junit.Assert.assertNotNull(dVDItemBuilder21);
        org.junit.Assert.assertNotNull(dVDItemBuilder23);
        org.junit.Assert.assertNotNull(dVDItemBuilder25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("SubscribeNewsletter{title='hi!', email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', dateSubscribed=Mon Apr 01 18:27:54 EDT 2024, dateDue=Wed May 01 18:27:54 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "hi!", true);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.team4.model.user.Manager manager4 = new org.team4.model.user.Manager("SubscribeNewsletter{title='ItemPurchased{title='', email='', datePurchased=null}', email='hi!', dateSubscribed=Wed May 01 18:27:52 EDT 2024, dateDue=Wed May 01 18:27:52 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:56 EDT 2024, dateDue=Wed May 01 18:27:56 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:54 EDT 2024, dateDue=Wed May 01 18:27:54 EDT 2024}");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder0.publisher("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder12 = courseTextBookBuilder0.noOfPages(1);
        java.util.Date date14 = null;
        java.util.Date date15 = null;
        org.team4.model.course.Course course18 = new org.team4.model.course.Course("hi!", date14, date15, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder19 = courseTextBookBuilder0.course(course18);
        java.util.Date date20 = course18.getEndDate();
        java.util.Date date21 = course18.getStartDate();
        org.team4.model.user.Student student27 = new org.team4.model.user.Student("", "", "hi!", "");
        student27.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase30 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student27);
        boolean boolean31 = course18.isEnrolled(student27);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(bookBuilder12);
        org.junit.Assert.assertNotNull(courseTextBookBuilder19);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDBuilder2.price((double) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDBuilder2.price((double) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder10 = dVDBuilder2.title("ItemPurchased{title='Credit Card', email='Debit Card', datePurchased=Mon Apr 01 18:27:47 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder12 = dVDBuilder2.ISBN("Book{genre='null', noOfPages=0, author='null', ISBN=null, publisher='null', edition='0'}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder14 = dVDItemBuilder12.quantity((int) (byte) -1);
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
        org.junit.Assert.assertNotNull(dVDItemBuilder10);
        org.junit.Assert.assertNotNull(dVDItemBuilder12);
        org.junit.Assert.assertNotNull(dVDItemBuilder14);
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
        int int8 = book7.getNoOfPages();
        boolean boolean9 = book7.hasHardCopy();
        java.lang.String str10 = book7.toString();
        boolean boolean11 = book7.isPurchasable();
        org.team4.model.items.Magazine magazine14 = new org.team4.model.items.Magazine((org.team4.model.items.Item) book7, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:45 EDT 2024}", (int) (byte) 10);
        boolean boolean15 = book7.hasHardCopy();
        boolean boolean16 = book7.hasSoftCopy();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}" + "'", str10, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:45 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}", "SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}", false);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.team4.model.user.UserFactory userFactory0 = new org.team4.model.user.UserFactory();
        org.team4.model.user.User user6 = userFactory0.getUser("ItemPurchased{title='', email='hi!', datePurchased=null}", "User [email=User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=User [email=, password=, name=hi!, type=, validated=false], type=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, validated=false], password=PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:48 EDT 2024}, validated=false]", "User [email=, password=, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:51 EDT 2024}", false);
        org.team4.model.user.User user12 = userFactory0.getUser("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}", "Book{genre='null', noOfPages=0, author='null', ISBN=null, publisher='null', edition='0'}", "", "Debit Card", true);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator9 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book7);
        boolean boolean10 = rentableItemDecorator9.isRentable();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:45 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:51 EDT 2024}", "SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}");
        long long5 = nonFaculty4.getUniversityID();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        int int2 = dVD1.getYearPublished();
        double double3 = dVD1.getDuration();
        dVD1.setPurchaseable(true);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) dVD1);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter6 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str7 = subscribeNewsletter6.getEmail();
        java.util.Date date8 = subscribeNewsletter6.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter15 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str16 = subscribeNewsletter15.getEmail();
        java.util.Date date17 = subscribeNewsletter15.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter20 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str21 = subscribeNewsletter20.getEmail();
        java.util.Date date22 = subscribeNewsletter20.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter23 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date17, date22);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter28 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str29 = subscribeNewsletter28.getEmail();
        java.util.Date date30 = subscribeNewsletter28.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter33 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str34 = subscribeNewsletter33.getEmail();
        java.util.Date date35 = subscribeNewsletter33.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter36 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date30, date35);
        org.team4.model.items.RentedItem rentedItem37 = new org.team4.model.items.RentedItem("Credit Card", "ItemPurchased{title='', email='', datePurchased=null}", date22, date30);
        org.team4.model.items.RentedItem rentedItem38 = new org.team4.model.items.RentedItem("hi!", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date8, date22);
        org.team4.functionality.buy.ItemPurchased itemPurchased39 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:54 EDT 2024, dateDue=Wed May 01 18:27:54 EDT 2024}", "User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=User [email=, password=, name=hi!, type=, validated=false], type=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, validated=false]", date22);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(date30);
// flaky:         org.junit.Assert.assertEquals(date30.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(date35);
// flaky:         org.junit.Assert.assertEquals(date35.toString(), "Wed May 01 18:27:56 EDT 2024");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter4 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str5 = subscribeNewsletter4.getEmail();
        java.util.Date date6 = subscribeNewsletter4.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter9 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str10 = subscribeNewsletter9.getEmail();
        java.util.Date date11 = subscribeNewsletter9.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter12 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date6, date11);
        java.lang.String str13 = subscribeNewsletter12.getTitle();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter22 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str23 = subscribeNewsletter22.getEmail();
        java.util.Date date24 = subscribeNewsletter22.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter27 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str28 = subscribeNewsletter27.getEmail();
        java.util.Date date29 = subscribeNewsletter27.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter30 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date24, date29);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter35 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str36 = subscribeNewsletter35.getEmail();
        java.util.Date date37 = subscribeNewsletter35.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter40 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str41 = subscribeNewsletter40.getEmail();
        java.util.Date date42 = subscribeNewsletter40.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter43 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date37, date42);
        org.team4.model.items.RentedItem rentedItem44 = new org.team4.model.items.RentedItem("Credit Card", "ItemPurchased{title='', email='', datePurchased=null}", date29, date37);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter51 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str52 = subscribeNewsletter51.getEmail();
        java.util.Date date53 = subscribeNewsletter51.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter56 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str57 = subscribeNewsletter56.getEmail();
        java.util.Date date58 = subscribeNewsletter56.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter59 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date53, date58);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter64 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str65 = subscribeNewsletter64.getEmail();
        java.util.Date date66 = subscribeNewsletter64.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter69 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str70 = subscribeNewsletter69.getEmail();
        java.util.Date date71 = subscribeNewsletter69.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter72 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date66, date71);
        org.team4.model.items.RentedItem rentedItem73 = new org.team4.model.items.RentedItem("Credit Card", "ItemPurchased{title='', email='', datePurchased=null}", date58, date66);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter74 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemPurchased{title='', email='', datePurchased=null}", "hi!", date29, date66);
        subscribeNewsletter12.setDateSubscribed(date66);
        subscribeNewsletter12.setEmail("User [email=, password=, name=hi!, type=, validated=true]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PayPal" + "'", str13, "PayPal");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(date24);
// flaky:         org.junit.Assert.assertEquals(date24.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(date53);
// flaky:         org.junit.Assert.assertEquals(date53.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(date58);
// flaky:         org.junit.Assert.assertEquals(date58.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertNotNull(date66);
// flaky:         org.junit.Assert.assertEquals(date66.toString(), "Wed May 01 18:27:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertNotNull(date71);
// flaky:         org.junit.Assert.assertEquals(date71.toString(), "Wed May 01 18:27:56 EDT 2024");
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
        org.team4.model.items.builder.BookBuilder bookBuilder11 = courseTextBookBuilder6.hasHardCopy(false);
        org.team4.model.items.builder.BookBuilder bookBuilder13 = courseTextBookBuilder6.edition((int) ' ');
        org.team4.model.items.builder.BookBuilder bookBuilder15 = bookBuilder13.noOfPages((int) 'a');
        org.team4.model.items.builder.BookBuilder bookBuilder17 = bookBuilder15.genre("ItemPurchased{title='Credit Card', email='Debit Card', datePurchased=Mon Apr 01 18:27:47 EDT 2024}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNotNull(bookBuilder11);
        org.junit.Assert.assertNotNull(bookBuilder13);
        org.junit.Assert.assertNotNull(bookBuilder15);
        org.junit.Assert.assertNotNull(bookBuilder17);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.team4.model.user.User user1 = null;
        org.team4.functionality.buy.ItemToPurchase itemToPurchase2 = new org.team4.functionality.buy.ItemToPurchase((double) (-1L), user1);
        org.team4.model.paymentmodes.DebitCard debitCard6 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        boolean boolean7 = debitCard6.correctLength();
        org.team4.model.user.Visitor visitor13 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase14 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor13);
        java.lang.String str15 = itemToPurchase14.toString();
        org.team4.functionality.buy.ProcessPayment processPayment16 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) debitCard6, itemToPurchase14);
        boolean boolean17 = debitCard6.correctLength();
        boolean boolean18 = debitCard6.correctLength();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete19 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase2, (org.team4.model.paymentmodes.PaymentValidator) debitCard6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str15, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        book7.setPrice((double) 0L);
        java.lang.String str11 = book7.getISBN();
        int int12 = book7.getYearPublished();
        java.util.Date date19 = null;
        java.util.Date date20 = null;
        org.team4.model.course.Course course23 = new org.team4.model.course.Course("hi!", date19, date20, "", "hi!");
        org.team4.model.user.Student student28 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str29 = student28.getType();
        course23.enrollStudent(student28);
        java.lang.String str31 = course23.getProfessorEmail();
        org.team4.model.user.Student student36 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str37 = student36.getType();
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        student36.setCourses(strList40);
        boolean boolean43 = course23.isEnrolled(student36);
        java.lang.String str44 = course23.getCourseTextBookISBN();
        org.team4.model.course.CourseTextBook courseTextBook46 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) book7, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:52 EDT 2024, dateDue=Wed May 01 18:27:52 EDT 2024}", (int) (short) 1, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:54 EDT 2024, dateDue=Wed May 01 18:27:54 EDT 2024}", (int) '4', course23, true);
        org.team4.model.user.NonFaculty nonFaculty52 = new org.team4.model.user.NonFaculty("ItemPurchased{title='', email='hi!', datePurchased=null}", "User [email=, password=, name=hi!, type=, validated=false]", "User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]", "User [email=, password=, name=User [email=, password=, name=hi!, type=, validated=false], type=hi!, validated=false]", false);
        long long53 = nonFaculty52.getUniversityID();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase54 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) courseTextBook46, (org.team4.model.user.User) nonFaculty52);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        boolean boolean4 = debitCard3.notExpired();
        boolean boolean5 = debitCard3.correctLength();
        java.lang.String str6 = debitCard3.getMode();
        java.lang.String str7 = debitCard3.getMode();
        java.lang.String str8 = debitCard3.getMode();
        boolean boolean9 = debitCard3.isValid();
        java.lang.String str10 = debitCard3.getMode();
        boolean boolean11 = debitCard3.isValid();
        boolean boolean12 = debitCard3.notExpired();
        boolean boolean13 = debitCard3.isValid();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Debit Card" + "'", str6, "Debit Card");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Debit Card" + "'", str7, "Debit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Debit Card" + "'", str10, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.paymentmodes.DebitCard debitCard15 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete16 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) debitCard15);
        org.team4.model.items.Newsletter newsletter17 = purchaseComplete16.getNewsletter();
        org.team4.model.user.User user18 = purchaseComplete16.getUser();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter17);
        org.junit.Assert.assertNotNull(user18);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
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
        boolean boolean18 = dVD1.isPurchasable();
        dVD1.setQuantity((int) 'a');
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("", "SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Wed May 01 18:27:55 EDT 2024, dateDue=Wed May 01 18:27:55 EDT 2024}", "User [email=User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=User [email=, password=, name=hi!, type=, validated=false], type=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, validated=false], password=PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:42 EDT 2024, dateDue=Wed May 01 18:27:42 EDT 2024}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=null, dateDue=Wed May 01 18:27:48 EDT 2024}, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:48 EDT 2024, dateDue=null}", 52L);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemPurchased{title='', email='', datePurchased=null}", "ItemPurchased{title='', email='', datePurchased=null}", "User [email=, password=, name=hi!, type=, validated=false]", (int) (short) 0, "PayPal");
        java.lang.String str7 = bookRequest6.getEmail();
        java.lang.String str8 = bookRequest6.getISBN();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str7, "ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str8, "User [email=, password=, name=hi!, type=, validated=false]");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        dVD1.setQuantity((int) (short) 1);
        dVD1.setQuantity((int) ' ');
        java.lang.String str9 = dVD1.getISBN();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD1);
        dVD1.setPrice((double) 1180780L);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("Debit Card", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "Mobile Wallet", "PayPal");
        java.lang.String str5 = faculty4.getType();
        faculty4.setFacultyID((long) (short) 0);
        java.util.ArrayList<java.lang.String> strList8 = faculty4.getCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PayPal" + "'", str5, "PayPal");
        org.junit.Assert.assertNull(strList8);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
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
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder18 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder20 = courseTextBookBuilder18.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder22 = courseTextBookBuilder18.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder24 = courseTextBookBuilder18.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder26 = courseTextBookBuilder24.yearPublished((int) (short) 100);
        boolean boolean27 = dVD1.equals((java.lang.Object) courseTextBookBuilder24);
        org.team4.model.user.Student student33 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str34 = student33.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase35 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student33);
        student33.setType("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase38 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) dVD1, (org.team4.model.user.User) student33);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator39 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) dVD1);
        double double40 = dVD1.getDuration();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookBuilder20);
        org.junit.Assert.assertNotNull(bookItemBuilder22);
        org.junit.Assert.assertNotNull(courseTextBookBuilder24);
        org.junit.Assert.assertNotNull(bookItemBuilder26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Mon Apr 01 18:27:56 EDT 2024, dateDue=Wed May 01 18:27:56 EDT 2024}", 52, (int) (byte) 1);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder2 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder2.issueNumber((int) '4');
        org.team4.model.items.builder.MagazineBuilder magazineBuilder6 = magazineBuilder4.issueNumber((int) (short) 10);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder8 = magazineBuilder6.publisher("Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
        org.junit.Assert.assertNotNull(magazineBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineBuilder6);
        org.junit.Assert.assertNotNull(magazineBuilder8);
    }
}
