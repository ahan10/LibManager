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
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder3 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder5 = courseTextBookBuilder0.isVirtual(false);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder7 = courseTextBookBuilder0.ISBN("");
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(bookBuilder3);
        org.junit.Assert.assertNotNull(courseTextBookBuilder5);
        org.junit.Assert.assertNotNull(bookItemBuilder7);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        boolean boolean2 = courseTextBook1.isPurchasable();
        int int3 = courseTextBook1.getNoOfPages();
        java.lang.String str4 = courseTextBook1.getGenre();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "User [email=hi!, password=hi!, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:56 EDT 2024, dateDue=Mon Apr 29 00:41:56 EDT 2024}", false);
        manager5.setType("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        long long8 = manager5.getManagerID();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "Course [course name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:42:00 EDT 2024, end date=Fri Mar 29 00:42:00 EDT 2024, ISBN=, email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}]", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}", "Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]");
        long long5 = faculty4.getFacultyID();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        java.lang.String str18 = course15.getCourseName();
        org.junit.Assert.assertNotNull(bookItemBuilder2);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}" + "'", str16, "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.junit.Assert.assertNotNull(courseTextBookBuilder17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}" + "'", str18, "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("hi!");
        boolean boolean2 = payPal1.isValid();
        java.lang.String str3 = payPal1.getMode();
        java.lang.String str4 = payPal1.toString();
        java.lang.String str5 = payPal1.getMode();
        org.team4.model.user.Visitor visitor11 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str12 = visitor11.getName();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase13 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor11);
        org.team4.model.items.Newsletter newsletter14 = itemToPurchase13.getNewsletter();
        org.team4.model.items.Newsletter newsletter15 = itemToPurchase13.getNewsletter();
        org.team4.model.items.Item item16 = itemToPurchase13.getItem();
        org.team4.model.paymentmodes.PayPal payPal18 = new org.team4.model.paymentmodes.PayPal("hi!");
        org.team4.model.user.Visitor visitor24 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str25 = visitor24.getName();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase26 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor24);
        org.team4.functionality.buy.ProcessPayment processPayment27 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) payPal18, itemToPurchase26);
        java.lang.String str28 = payPal18.getMode();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete29 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase13, (org.team4.model.paymentmodes.PaymentValidator) payPal18);
        double double30 = itemToPurchase13.getAmount();
        double double31 = itemToPurchase13.getAmount();
        org.team4.functionality.buy.ProcessPayment processPayment32 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) payPal1, itemToPurchase13);
        java.lang.String str33 = processPayment32.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Mobile Wallet" + "'", str3, "Mobile Wallet");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PayPal{email='hi!'}" + "'", str4, "PayPal{email='hi!'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Mobile Wallet" + "'", str5, "Mobile Wallet");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(newsletter14);
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Mobile Wallet" + "'", str28, "Mobile Wallet");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ProcessPayment{modes=PayPal{email='hi!'}, itemToPurchase=ItemToPurchase{item=null, user=User [email=hi!, password=hi!, name=hi!, type=hi!, validated=false], newsletter=null}}" + "'", str33, "ProcessPayment{modes=PayPal{email='hi!'}, itemToPurchase=ItemToPurchase{item=null, user=User [email=hi!, password=hi!, name=hi!, type=hi!, validated=false], newsletter=null}}");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("ItemPurchased{title='', email='ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}', datePurchased=Fri Mar 29 00:42:01 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:05 EDT 2024, dateDue=Mon Apr 29 00:42:05 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:07 EDT 2024, dateDue=Mon Apr 29 00:42:07 EDT 2024}", "User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, name=hi!, type=, validated=false]");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "PayPal", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", (int) (byte) 10, "");
        java.lang.String str7 = bookRequest6.getEmail();
        java.lang.String str8 = bookRequest6.getBookType();
        java.lang.String str9 = bookRequest6.getEmail();
        java.lang.String str10 = bookRequest6.getISBN();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}" + "'", str7, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}" + "'", str9, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}" + "'", str10, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder2 = dVDBuilder0.price((double) 'a');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDItemBuilder2.ISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDItemBuilder2.quantity(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDItemBuilder6.yearPublished((int) (short) 100);
        org.junit.Assert.assertNotNull(dVDItemBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator9 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) purchasableItemDecorator9);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder11 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder13 = courseTextBookBuilder11.hasHardCopy(true);
        java.util.Date date15 = null;
        java.util.Date date16 = null;
        org.team4.model.course.Course course19 = new org.team4.model.course.Course("", date15, date16, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder20 = courseTextBookBuilder11.course(course19);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder22 = courseTextBookBuilder20.ISBN("");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder23 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder25 = courseTextBookBuilder23.hasHardCopy(true);
        java.util.Date date27 = null;
        java.util.Date date28 = null;
        org.team4.model.course.Course course31 = new org.team4.model.course.Course("", date27, date28, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder32 = courseTextBookBuilder23.course(course31);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder33 = courseTextBookBuilder20.course(course31);
        boolean boolean34 = rentableItemDecorator10.equals((java.lang.Object) courseTextBookBuilder33);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookBuilder13);
        org.junit.Assert.assertNotNull(courseTextBookBuilder20);
        org.junit.Assert.assertNotNull(bookItemBuilder22);
        org.junit.Assert.assertNotNull(bookBuilder25);
        org.junit.Assert.assertNotNull(courseTextBookBuilder32);
        org.junit.Assert.assertNotNull(courseTextBookBuilder33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) (short) -1);
        double double4 = newsletter3.getPrice();
        org.team4.model.user.Manager manager9 = new org.team4.model.user.Manager("hi!", "hi!", "hi!", "");
        manager9.setType("");
        long long12 = manager9.getManagerID();
        manager9.setManagerID((long) (-1));
        org.team4.functionality.buy.ItemToPurchase itemToPurchase15 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) manager9);
        java.lang.String str16 = newsletter3.getTitle();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}" + "'", str16, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished((int) (short) -1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder4 = magazineItemBuilder2.quantity(0);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineItemBuilder4);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.Course course1 = null;
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder2 = courseTextBookBuilder0.course(course1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder2.title("hi!");
        org.team4.model.course.CourseTextBook courseTextBook5 = courseTextBookBuilder2.build();
        double double6 = courseTextBook5.getPrice();
        java.lang.String str7 = courseTextBook5.getTitle();
        org.junit.Assert.assertNotNull(courseTextBookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBook5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = visitor5.getName();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.items.Newsletter newsletter9 = itemToPurchase7.getNewsletter();
        org.team4.model.user.User user10 = itemToPurchase7.getUser();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("PayPal{email='hi!'}", 0, (int) (short) 1);
        java.lang.String str4 = debitCard3.getMode();
        boolean boolean5 = debitCard3.notExpired();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemPurchased{title='', email='ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}', datePurchased=Fri Mar 29 00:42:01 EDT 2024}");
        subscribeNewsletter2.setEmail("");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter3 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "");
        java.lang.String str4 = subscribeNewsletter3.getTitle();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder5 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook6 = courseTextBookBuilder5.build();
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder5.hasSoftCopy(true);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder10 = courseTextBookBuilder5.isVirtual(false);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder11 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder13 = courseTextBookBuilder11.hasHardCopy(true);
        java.util.Date date15 = null;
        java.util.Date date16 = null;
        org.team4.model.course.Course course19 = new org.team4.model.course.Course("", date15, date16, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder20 = courseTextBookBuilder11.course(course19);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder21 = courseTextBookBuilder10.course(course19);
        org.team4.model.items.builder.BookBuilder bookBuilder23 = courseTextBookBuilder21.hasHardCopy(false);
        org.team4.model.items.builder.BookBuilder bookBuilder25 = courseTextBookBuilder21.genre("PayPal");
        org.team4.functionality.buy.ItemPurchased itemPurchased29 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date30 = itemPurchased29.getDatePurchased();
        java.util.Date date31 = itemPurchased29.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased34 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date35 = itemPurchased34.getDatePurchased();
        org.team4.model.course.Course course38 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date31, date35, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder39 = courseTextBookBuilder21.course(course38);
        java.util.Date date40 = course38.getStartDate();
        subscribeNewsletter3.setDateSubscribed(date40);
        java.util.Date date44 = null;
        java.util.Date date45 = null;
        org.team4.model.items.RentedItem rentedItem46 = new org.team4.model.items.RentedItem("", "hi!", date44, date45);
        rentedItem46.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        java.util.Date date49 = rentedItem46.getRentDate();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter52 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "");
        org.team4.functionality.buy.ItemPurchased itemPurchased56 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date57 = itemPurchased56.getDatePurchased();
        java.util.Date date58 = itemPurchased56.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased61 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date62 = itemPurchased61.getDatePurchased();
        org.team4.model.course.Course course65 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date58, date62, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        subscribeNewsletter52.setDateSubscribed(date58);
        rentedItem46.setRentDate(date58);
        org.team4.model.course.Course course70 = new org.team4.model.course.Course("User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, password=, name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}, type=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, validated=true]", date40, date58, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:02 EDT 2024, dateDue=Mon Apr 29 00:42:02 EDT 2024}", "Course [course name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:42:00 EDT 2024, end date=Fri Mar 29 00:42:00 EDT 2024, ISBN=, email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(courseTextBook6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(courseTextBookBuilder10);
        org.junit.Assert.assertNotNull(bookBuilder13);
        org.junit.Assert.assertNotNull(courseTextBookBuilder20);
        org.junit.Assert.assertNotNull(courseTextBookBuilder21);
        org.junit.Assert.assertNotNull(bookBuilder23);
        org.junit.Assert.assertNotNull(bookBuilder25);
        org.junit.Assert.assertNotNull(date30);
// flaky:         org.junit.Assert.assertEquals(date30.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date35);
// flaky:         org.junit.Assert.assertEquals(date35.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(courseTextBookBuilder39);
        org.junit.Assert.assertNotNull(date40);
// flaky:         org.junit.Assert.assertEquals(date40.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNull(date49);
        org.junit.Assert.assertNotNull(date57);
// flaky:         org.junit.Assert.assertEquals(date57.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date58);
// flaky:         org.junit.Assert.assertEquals(date58.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date62);
// flaky:         org.junit.Assert.assertEquals(date62.toString(), "Fri Mar 29 00:42:07 EDT 2024");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("hi!", "hi!", "", "", true);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        org.team4.model.user.Faculty faculty19 = new org.team4.model.user.Faculty("hi!", "hi!", "", "", (long) 1, strList17);
        faculty19.setFacultyID(10L);
        java.util.ArrayList<java.lang.String> strList22 = faculty19.getCourses();
        org.team4.model.user.Student student23 = new org.team4.model.user.Student("PayPal", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}", strList22);
        student5.setCourses(strList22);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
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
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder20 = bookBuilder18.ISBN("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder22 = bookBuilder18.ISBN("SubscribeNewsletter{title='hi!', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}', dateSubscribed=null, dateDue=Fri Mar 29 00:42:06 EDT 2024}");
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
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder0.email("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder0.author("PayPal");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder0.booktype("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder10 = bookRequestBuilder8.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.model.items.BookRequest bookRequest11 = bookRequestBuilder10.build();
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
        org.junit.Assert.assertNotNull(bookRequestBuilder10);
        org.junit.Assert.assertNotNull(bookRequest11);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("Mobile Wallet", "Mobile Wallet", "Mobile Wallet", "hi!", (long) (short) -1);
        manager5.setManagerID(6227221L);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter4 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "");
        java.lang.String str5 = subscribeNewsletter4.toString();
        java.util.Date date6 = null;
        subscribeNewsletter4.setDateDue(date6);
        java.util.Date date8 = subscribeNewsletter4.getDateDue();
        java.util.Date date10 = null;
        java.util.Date date13 = null;
        java.util.Date date14 = null;
        org.team4.model.items.RentedItem rentedItem15 = new org.team4.model.items.RentedItem("", "hi!", date13, date14);
        java.lang.String str16 = rentedItem15.getISBN();
        java.util.Date date17 = null;
        rentedItem15.setDueDate(date17);
        rentedItem15.setISBN("PayPal");
        org.team4.functionality.buy.ItemPurchased itemPurchased24 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date25 = itemPurchased24.getDatePurchased();
        java.util.Date date26 = itemPurchased24.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased29 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date30 = itemPurchased29.getDatePurchased();
        org.team4.model.course.Course course33 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date26, date30, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem15.setDueDate(date26);
        java.util.Date date35 = rentedItem15.getDueDate();
        org.team4.model.course.Course course38 = new org.team4.model.course.Course("hi!", date10, date35, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "");
        subscribeNewsletter4.setDateSubscribed(date35);
        org.team4.functionality.buy.ItemPurchased itemPurchased40 = new org.team4.functionality.buy.ItemPurchased("User [email=hi!, password=hi!, name=hi!, type=, validated=false]", "Mobile Wallet", date35);
        java.util.Date date41 = itemPurchased40.getDatePurchased();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:07 EDT 2024, dateDue=Mon Apr 29 00:42:07 EDT 2024}" + "'", str5, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:07 EDT 2024, dateDue=Mon Apr 29 00:42:07 EDT 2024}");
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date26);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date30);
// flaky:         org.junit.Assert.assertEquals(date30.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date35);
// flaky:         org.junit.Assert.assertEquals(date35.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date41);
// flaky:         org.junit.Assert.assertEquals(date41.toString(), "Fri Mar 29 00:42:07 EDT 2024");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
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
        java.util.Date date22 = course21.getEndDate();
        java.lang.String str23 = course21.toString();
        java.lang.String str24 = course21.getCourseTextBookISBN();
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Fri Mar 29 00:42:07 EDT 2024");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Course [course name=PayPal{email='hi!'}, start date=Fri Mar 29 00:42:07 EDT 2024, end date=Fri Mar 29 00:42:07 EDT 2024, ISBN=Mobile Wallet, email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}]" + "'", str23, "Course [course name=PayPal{email='hi!'}, start date=Fri Mar 29 00:42:07 EDT 2024, end date=Fri Mar 29 00:42:07 EDT 2024, ISBN=Mobile Wallet, email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Mobile Wallet" + "'", str24, "Mobile Wallet");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = visitor5.getName();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        visitor5.setType("hi!");
        visitor5.setValidated(true);
        visitor5.setValidated(false);
        visitor5.setPassword("User [email=Mobile Wallet, password=, name=hi!, type=Mobile Wallet, validated=true]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        boolean boolean3 = courseTextBook1.equals((java.lang.Object) (byte) 1);
        java.lang.String str4 = courseTextBook1.getTitle();
        org.team4.model.course.Course course5 = courseTextBook1.getCourse();
        boolean boolean7 = courseTextBook1.equals((java.lang.Object) 100);
        org.team4.model.user.Student student13 = new org.team4.model.user.Student("Mobile Wallet", "", "hi!", "Mobile Wallet", true);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase14 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) courseTextBook1, (org.team4.model.user.User) student13);
        java.util.Date date21 = null;
        java.util.Date date22 = null;
        org.team4.model.course.Course course25 = new org.team4.model.course.Course("", date21, date22, "hi!", "hi!");
        java.util.Date date26 = course25.getEndDate();
        org.team4.model.course.CourseTextBook courseTextBook28 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook1, "Credit Card", (int) (byte) 100, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "ItemPurchased{title='', email='ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}', datePurchased=Fri Mar 29 00:42:01 EDT 2024}", (-1), course25, false);
        java.util.Date date30 = null;
        java.util.Date date31 = null;
        org.team4.model.course.Course course34 = new org.team4.model.course.Course("", date30, date31, "", "hi!");
        org.team4.model.user.Student student40 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "Mobile Wallet", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "", false);
        course34.enrollStudent(student40);
        boolean boolean42 = course25.isEnrolled(student40);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(course5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(date26);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("Mobile Wallet", "", "Mobile Wallet", "", 0, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        java.lang.String str7 = bookRequest6.getTitle();
        java.lang.String str8 = bookRequest6.getAuthor();
        java.lang.String str9 = bookRequest6.getBookType();
        java.lang.String str10 = bookRequest6.getBookType();
        java.lang.String str11 = bookRequest6.getAuthor();
        java.lang.String str12 = bookRequest6.getAuthor();
        int int13 = bookRequest6.getEdition();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Mobile Wallet" + "'", str8, "Mobile Wallet");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str9, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str10, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Mobile Wallet" + "'", str11, "Mobile Wallet");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Mobile Wallet" + "'", str12, "Mobile Wallet");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.Course course1 = null;
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder2 = courseTextBookBuilder0.course(course1);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder4 = courseTextBookBuilder2.isVirtual(false);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder4.isVirtual(false);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.price(0.0d);
        org.junit.Assert.assertNotNull(courseTextBookBuilder2);
        org.junit.Assert.assertNotNull(courseTextBookBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]", (int) (byte) 1, 10);
        boolean boolean4 = creditCard3.correctLength();
        java.lang.String str5 = creditCard3.getMode();
        boolean boolean6 = creditCard3.isValid();
        boolean boolean7 = creditCard3.correctLength();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder2 = magazineBuilder0.issueNumber((int) '#');
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        org.junit.Assert.assertNotNull(magazineBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("Mobile Wallet", "", "Mobile Wallet", "", 0, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        java.lang.String str7 = bookRequest6.getTitle();
        java.lang.String str8 = bookRequest6.getTitle();
        java.lang.String str9 = bookRequest6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Mobile Wallet" + "'", str9, "Mobile Wallet");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
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
        java.util.Date date33 = null;
        java.util.Date date34 = null;
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter35 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!", date33, date34);
        subscribeNewsletter35.setTitle("PayPal");
        java.util.Date date40 = null;
        java.util.Date date41 = null;
        org.team4.model.items.RentedItem rentedItem42 = new org.team4.model.items.RentedItem("", "hi!", date40, date41);
        rentedItem42.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem42.setTitle("hi!");
        java.util.Date date47 = rentedItem42.getRentDate();
        rentedItem42.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.functionality.buy.ItemPurchased itemPurchased53 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date54 = itemPurchased53.getDatePurchased();
        java.util.Date date55 = itemPurchased53.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased58 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date59 = itemPurchased58.getDatePurchased();
        org.team4.model.course.Course course62 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date55, date59, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem42.setDueDate(date59);
        subscribeNewsletter35.setDateDue(date59);
        org.team4.model.course.Course course67 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date26, date59, "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "hi!");
        org.team4.functionality.buy.ItemPurchased itemPurchased68 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date59);
        java.util.Date date71 = null;
        java.util.Date date72 = null;
        org.team4.model.items.RentedItem rentedItem73 = new org.team4.model.items.RentedItem("", "hi!", date71, date72);
        rentedItem73.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem73.setTitle("hi!");
        java.util.Date date78 = rentedItem73.getRentDate();
        org.team4.functionality.buy.ItemPurchased itemPurchased82 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date83 = itemPurchased82.getDatePurchased();
        java.util.Date date84 = itemPurchased82.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased87 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date88 = itemPurchased87.getDatePurchased();
        org.team4.model.course.Course course91 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date84, date88, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem73.setRentDate(date84);
        java.util.Date date93 = rentedItem73.getRentDate();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter94 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ProcessPayment{modes=PayPal{email='hi!'}, itemToPurchase=null}", "User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, type=, validated=false]", date59, date93);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date26);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNull(date47);
        org.junit.Assert.assertNotNull(date54);
// flaky:         org.junit.Assert.assertEquals(date54.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date55);
// flaky:         org.junit.Assert.assertEquals(date55.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date59);
// flaky:         org.junit.Assert.assertEquals(date59.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNull(date78);
        org.junit.Assert.assertNotNull(date83);
// flaky:         org.junit.Assert.assertEquals(date83.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date84);
// flaky:         org.junit.Assert.assertEquals(date84.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date88);
// flaky:         org.junit.Assert.assertEquals(date88.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date93);
// flaky:         org.junit.Assert.assertEquals(date93.toString(), "Fri Mar 29 00:42:07 EDT 2024");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "hi!", "");
        java.util.ArrayList<java.lang.String> strList5 = student4.getCourses();
        org.team4.model.user.Faculty faculty16 = new org.team4.model.user.Faculty("", "", "hi!", "hi!", true);
        java.util.ArrayList<java.lang.String> strList17 = faculty16.getCourses();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        faculty16.setCourses(strList20);
        org.team4.model.user.Faculty faculty23 = new org.team4.model.user.Faculty("", "Debit Card", "Debit Card", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (long) (byte) 100, strList20);
        student4.setCourses(strList20);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(strList17);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        boolean boolean1 = org.team4.utils.EmailValidator.validEmail("SubscribeNewsletter{title='', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}', dateSubscribed=Fri Mar 29 00:42:04 EDT 2024, dateDue=Mon Apr 29 00:42:04 EDT 2024}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("SubscribeNewsletter{title='hi!', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}', dateSubscribed=null, dateDue=null}");
        boolean boolean2 = mobileWallet1.isValid();
        boolean boolean3 = mobileWallet1.isValid();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("Mobile Wallet", "PayPal");
        java.util.Date date3 = subscribeNewsletter2.getDateDue();
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Mon Apr 29 00:42:07 EDT 2024");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.Magazine magazine1 = magazineBuilder0.build();
        java.lang.String str2 = magazine1.getPublisher();
        magazine1.setRentable(false);
        org.team4.model.items.Item item5 = new org.team4.model.items.Item((org.team4.model.items.Item) magazine1);
        org.team4.model.items.Item item6 = new org.team4.model.items.Item((org.team4.model.items.Item) magazine1);
        boolean boolean7 = magazine1.isPurchasable();
        org.junit.Assert.assertNotNull(magazine1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished((int) (short) -1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder4 = magazineBuilder0.quantity(100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineItemBuilder4.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineItemBuilder4.price((double) '#');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder10 = magazineItemBuilder8.price((double) 10.0f);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder12 = magazineItemBuilder8.yearPublished((int) (short) 10);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineItemBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
        org.junit.Assert.assertNotNull(magazineItemBuilder10);
        org.junit.Assert.assertNotNull(magazineItemBuilder12);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.email("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.title("PayPal");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.author("Debit Card");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder6.title("PayPal");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder10 = bookRequestBuilder6.email("PayPal");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder12 = bookRequestBuilder10.author("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder14 = bookRequestBuilder10.booktype("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:07 EDT 2024, dateDue=Mon Apr 29 00:42:07 EDT 2024}");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
        org.junit.Assert.assertNotNull(bookRequestBuilder10);
        org.junit.Assert.assertNotNull(bookRequestBuilder12);
        org.junit.Assert.assertNotNull(bookRequestBuilder14);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = visitor5.getName();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        double double9 = itemToPurchase7.getAmount();
        org.team4.model.user.User user10 = itemToPurchase7.getUser();
        user10.setValidated(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator20 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        int int21 = courseTextBook1.getNoOfPages();
        double double22 = courseTextBook1.getPrice();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(course16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.items.RentedItem rentedItem4 = new org.team4.model.items.RentedItem("", "hi!", date2, date3);
        rentedItem4.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem4.setTitle("hi!");
        java.util.Date date9 = rentedItem4.getRentDate();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter12 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "hi!");
        java.lang.String str13 = subscribeNewsletter12.toString();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter17 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "");
        java.lang.String str18 = subscribeNewsletter17.toString();
        java.util.Date date19 = null;
        subscribeNewsletter17.setDateDue(date19);
        java.util.Date date23 = null;
        java.util.Date date24 = null;
        org.team4.model.items.RentedItem rentedItem25 = new org.team4.model.items.RentedItem("", "hi!", date23, date24);
        rentedItem25.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem25.setTitle("hi!");
        java.util.Date date30 = rentedItem25.getRentDate();
        org.team4.functionality.buy.ItemPurchased itemPurchased34 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date35 = itemPurchased34.getDatePurchased();
        java.util.Date date36 = itemPurchased34.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased39 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date40 = itemPurchased39.getDatePurchased();
        org.team4.model.course.Course course43 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date36, date40, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem25.setRentDate(date36);
        subscribeNewsletter17.setDateSubscribed(date36);
        java.util.Date date48 = null;
        java.util.Date date49 = null;
        org.team4.model.items.RentedItem rentedItem50 = new org.team4.model.items.RentedItem("", "hi!", date48, date49);
        java.lang.String str51 = rentedItem50.getISBN();
        java.util.Date date52 = null;
        rentedItem50.setDueDate(date52);
        rentedItem50.setISBN("PayPal");
        org.team4.functionality.buy.ItemPurchased itemPurchased59 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date60 = itemPurchased59.getDatePurchased();
        java.util.Date date61 = itemPurchased59.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased64 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date65 = itemPurchased64.getDatePurchased();
        org.team4.model.course.Course course68 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date61, date65, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem50.setDueDate(date61);
        org.team4.model.course.Course course72 = new org.team4.model.course.Course("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", date36, date61, "Mobile Wallet", "hi!");
        subscribeNewsletter12.setDateSubscribed(date61);
        rentedItem4.setRentDate(date61);
        java.lang.String str75 = rentedItem4.getISBN();
        org.junit.Assert.assertNull(date9);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:42:07 EDT 2024, dateDue=Mon Apr 29 00:42:07 EDT 2024}" + "'", str13, "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:42:07 EDT 2024, dateDue=Mon Apr 29 00:42:07 EDT 2024}");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:07 EDT 2024, dateDue=Mon Apr 29 00:42:07 EDT 2024}" + "'", str18, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:07 EDT 2024, dateDue=Mon Apr 29 00:42:07 EDT 2024}");
        org.junit.Assert.assertNull(date30);
        org.junit.Assert.assertNotNull(date35);
// flaky:         org.junit.Assert.assertEquals(date35.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date36);
// flaky:         org.junit.Assert.assertEquals(date36.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date40);
// flaky:         org.junit.Assert.assertEquals(date40.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(date60);
// flaky:         org.junit.Assert.assertEquals(date60.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date61);
// flaky:         org.junit.Assert.assertEquals(date61.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertNotNull(date65);
// flaky:         org.junit.Assert.assertEquals(date65.toString(), "Fri Mar 29 00:42:07 EDT 2024");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str75, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished((int) (short) -1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder4 = magazineItemBuilder2.yearPublished((int) (byte) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineItemBuilder4.ISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineItemBuilder6.ISBN("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder10 = magazineItemBuilder8.title("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:42:07 EDT 2024, dateDue=Mon Apr 29 00:42:07 EDT 2024}");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineItemBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
        org.junit.Assert.assertNotNull(magazineItemBuilder10);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.team4.model.user.Manager manager4 = new org.team4.model.user.Manager("User [email=, password=Mobile Wallet, name=PayPal, type=PayPal, validated=false]", "Course [course name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:42:00 EDT 2024, end date=Fri Mar 29 00:42:00 EDT 2024, ISBN=, email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}]", "User [email=Mobile Wallet, password=, name=hi!, type=Mobile Wallet, validated=true]", "PayPal{email='PayPal{email='hi!'}'}");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.Course course1 = null;
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder2 = courseTextBookBuilder0.course(course1);
        org.team4.model.items.builder.BookBuilder bookBuilder4 = courseTextBookBuilder0.hasHardCopy(false);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder6 = courseTextBookBuilder0.price((double) (short) 0);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder0.build();
        java.lang.String str10 = courseTextBook9.toString();
        org.junit.Assert.assertNotNull(courseTextBookBuilder2);
        org.junit.Assert.assertNotNull(bookBuilder4);
        org.junit.Assert.assertNotNull(bookItemBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(courseTextBook9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Book{genre='null', noOfPages=0, author='null', ISBN=null, publisher='null', edition='0'}" + "'", str10, "Book{genre='null', noOfPages=0, author='null', ISBN=null, publisher='null', edition='0'}");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("hi!", 100, 100, (double) 10L, "PayPal", false, true);
        int int8 = item7.getYearPublished();
        org.team4.model.items.DVD dVD11 = new org.team4.model.items.DVD(item7, "", (double) 10);
        double double12 = dVD11.getDuration();
        boolean boolean13 = dVD11.isRentable();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder14 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook15 = courseTextBookBuilder14.build();
        boolean boolean17 = courseTextBook15.equals((java.lang.Object) (byte) 1);
        java.util.List<org.team4.model.user.Student> studentList18 = courseTextBook15.getStudentsWithCopies();
        courseTextBook15.setPurchaseable(true);
        boolean boolean21 = dVD11.equals((java.lang.Object) true);
        double double22 = dVD11.getDuration();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(courseTextBook15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(studentList18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.Magazine magazine1 = magazineBuilder0.build();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder3 = magazineBuilder0.issueNumber((int) (short) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder5 = magazineBuilder0.yearPublished(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder7 = magazineItemBuilder5.price((double) 97);
        org.junit.Assert.assertNotNull(magazine1);
        org.junit.Assert.assertNotNull(magazineBuilder3);
        org.junit.Assert.assertNotNull(magazineItemBuilder5);
        org.junit.Assert.assertNotNull(magazineItemBuilder7);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("hi!", "hi!", "hi!", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", false);
        boolean boolean6 = faculty5.isValidated();
        faculty5.setType("Mobile Wallet");
        faculty5.setFacultyID(4601205L);
        faculty5.setFacultyID(3763455L);
        java.lang.String str13 = faculty5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }
}
