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
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        int int2 = bookRequest1.getEdition();
        java.lang.String str3 = bookRequest1.getISBN();
        java.lang.String str4 = bookRequest1.getBookType();
        java.lang.String str5 = bookRequest1.getISBN();
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.team4.functionality.buy.ItemPurchased itemPurchased2 = new org.team4.functionality.buy.ItemPurchased("ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        java.lang.String str3 = itemPurchased2.toString();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ItemPurchased{title='ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}', email='Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}', datePurchased=Sat Mar 30 19:22:12 EDT 2024}" + "'", str3, "ItemPurchased{title='ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}', email='Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}', datePurchased=Sat Mar 30 19:22:12 EDT 2024}");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        org.team4.model.items.Newsletter newsletter19 = purchaseComplete16.getNewsletter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1553112L + "'", long17 == 1553112L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNull(newsletter19);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        java.lang.String str76 = rentedItem59.getTitle();
        rentedItem59.setISBN("");
        java.lang.String str79 = rentedItem59.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Apr 30 19:22:12 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Tue Apr 30 19:22:12 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 19:22:12 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 19:22:12 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 19:22:12 EDT 2024");
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Tue Apr 30 19:22:12 EDT 2024");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str60, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(date73);
// flaky:         org.junit.Assert.assertEquals(date73.toString(), "Tue Apr 30 19:22:12 EDT 2024");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str76, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str79, "User [email=, password=, name=hi!, type=, validated=false]");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter6 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str7 = subscribeNewsletter6.getEmail();
        java.util.Date date8 = subscribeNewsletter6.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter11 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str12 = subscribeNewsletter11.getEmail();
        java.util.Date date13 = subscribeNewsletter11.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter14 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date8, date13);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter23 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str24 = subscribeNewsletter23.getEmail();
        java.util.Date date25 = subscribeNewsletter23.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter28 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str29 = subscribeNewsletter28.getEmail();
        java.util.Date date30 = subscribeNewsletter28.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter31 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date25, date30);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter34 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter34.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter34.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter41 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date42 = null;
        subscribeNewsletter41.setDateSubscribed(date42);
        java.util.Date date44 = subscribeNewsletter41.getDateDue();
        subscribeNewsletter34.setDateDue(date44);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter46 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", date30, date44);
        java.util.Date date47 = subscribeNewsletter46.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter54 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str55 = subscribeNewsletter54.getEmail();
        java.util.Date date56 = subscribeNewsletter54.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter59 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str60 = subscribeNewsletter59.getEmail();
        java.util.Date date61 = subscribeNewsletter59.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter62 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date56, date61);
        org.team4.functionality.buy.ItemPurchased itemPurchased63 = new org.team4.functionality.buy.ItemPurchased("User [email=, password=, name=hi!, type=, validated=false]", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", date61);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter64 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}", "Mobile Wallet", date47, date61);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter65 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date8, date47);
        java.lang.String str66 = subscribeNewsletter65.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Tue Apr 30 19:22:12 EDT 2024");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Tue Apr 30 19:22:12 EDT 2024");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Tue Apr 30 19:22:12 EDT 2024");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(date30);
// flaky:         org.junit.Assert.assertEquals(date30.toString(), "Tue Apr 30 19:22:12 EDT 2024");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Tue Apr 30 19:22:12 EDT 2024");
        org.junit.Assert.assertNotNull(date47);
// flaky:         org.junit.Assert.assertEquals(date47.toString(), "Tue Apr 30 19:22:12 EDT 2024");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Tue Apr 30 19:22:12 EDT 2024");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(date61);
// flaky:         org.junit.Assert.assertEquals(date61.toString(), "Tue Apr 30 19:22:12 EDT 2024");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "PayPal" + "'", str66, "PayPal");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        dVD1.setQuantity((int) (short) 1);
        java.lang.String str7 = dVD1.getGenre();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder13 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder15 = courseTextBookBuilder13.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder17 = courseTextBookBuilder13.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder19 = courseTextBookBuilder13.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder21 = courseTextBookBuilder13.price((double) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder23 = courseTextBookBuilder13.price((double) 10);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder24 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder26 = courseTextBookBuilder24.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder28 = courseTextBookBuilder24.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder30 = courseTextBookBuilder24.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder32 = courseTextBookBuilder24.hasSoftCopy(true);
        org.team4.model.course.CourseTextBook courseTextBook33 = courseTextBookBuilder24.build();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder39 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder41 = courseTextBookBuilder39.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder43 = courseTextBookBuilder39.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder45 = courseTextBookBuilder39.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder47 = courseTextBookBuilder39.quantity((int) (short) 100);
        java.util.Date date49 = null;
        java.util.Date date50 = null;
        org.team4.model.course.Course course53 = new org.team4.model.course.Course("hi!", date49, date50, "", "hi!");
        java.util.Date date54 = course53.getEndDate();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder55 = courseTextBookBuilder39.course(course53);
        org.team4.model.user.Student student61 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str62 = student61.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase63 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student61);
        java.lang.String str64 = student61.toString();
        java.lang.String str65 = student61.getEmail();
        java.lang.String str66 = student61.toString();
        course53.enrollStudent(student61);
        org.team4.model.course.CourseTextBook courseTextBook69 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook33, "hi!", 52, "User [email=, password=, name=hi!, type=, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", (int) 'a', course53, false);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder70 = courseTextBookBuilder13.course(course53);
        java.lang.String str71 = course53.getCourseName();
        org.team4.model.course.CourseTextBook courseTextBook73 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) dVD1, "PayPal{email='PayPal'}", (int) ' ', "PayPal{email='Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}'}", "SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 19:22:10 EDT 2024, dateDue=Tue Apr 30 19:22:10 EDT 2024}", (-1), course53, false);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(bookBuilder15);
        org.junit.Assert.assertNotNull(bookItemBuilder17);
        org.junit.Assert.assertNotNull(bookBuilder19);
        org.junit.Assert.assertNotNull(bookItemBuilder21);
        org.junit.Assert.assertNotNull(bookItemBuilder23);
        org.junit.Assert.assertNotNull(bookBuilder26);
        org.junit.Assert.assertNotNull(bookItemBuilder28);
        org.junit.Assert.assertNotNull(courseTextBookBuilder30);
        org.junit.Assert.assertNotNull(bookBuilder32);
        org.junit.Assert.assertNotNull(courseTextBook33);
        org.junit.Assert.assertNotNull(bookBuilder41);
        org.junit.Assert.assertNotNull(bookItemBuilder43);
        org.junit.Assert.assertNotNull(bookBuilder45);
        org.junit.Assert.assertNotNull(bookItemBuilder47);
        org.junit.Assert.assertNull(date54);
        org.junit.Assert.assertNotNull(courseTextBookBuilder55);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str64, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str66, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertNotNull(courseTextBookBuilder70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("User [email=, password=User [email=, password=, name=hi!, type=hi!, validated=false], name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=null}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}, validated=false]", "ItemPurchased{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=null}', email='', datePurchased=Tue Apr 30 19:21:57 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:22:08 EDT 2024, dateDue=Tue Apr 30 19:22:08 EDT 2024}", "Credit Card", false);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter4 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str5 = subscribeNewsletter4.getEmail();
        java.util.Date date6 = subscribeNewsletter4.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter9 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str10 = subscribeNewsletter9.getEmail();
        subscribeNewsletter9.setTitle("hi!");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter15 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        java.util.Date date16 = subscribeNewsletter15.getDateSubscribed();
        subscribeNewsletter9.setDateDue(date16);
        subscribeNewsletter4.setDateSubscribed(date16);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter23 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        java.util.Date date24 = subscribeNewsletter23.getDateSubscribed();
        org.team4.functionality.buy.ItemPurchased itemPurchased27 = new org.team4.functionality.buy.ItemPurchased("ItemPurchased{title='', email='hi!', datePurchased=null}", "hi!");
        java.util.Date date28 = itemPurchased27.getDatePurchased();
        org.team4.model.items.RentedItem rentedItem29 = new org.team4.model.items.RentedItem("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", date24, date28);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter34 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        java.util.Date date35 = subscribeNewsletter34.getDateSubscribed();
        org.team4.functionality.buy.ItemPurchased itemPurchased38 = new org.team4.functionality.buy.ItemPurchased("ItemPurchased{title='', email='hi!', datePurchased=null}", "hi!");
        java.util.Date date39 = itemPurchased38.getDatePurchased();
        org.team4.model.items.RentedItem rentedItem40 = new org.team4.model.items.RentedItem("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", date35, date39);
        rentedItem40.setISBN("ItemPurchased{title='', email='hi!', datePurchased=null}");
        java.lang.String str43 = rentedItem40.getISBN();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter46 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.util.Date date47 = null;
        subscribeNewsletter46.setDateDue(date47);
        java.util.Date date49 = subscribeNewsletter46.getDateDue();
        java.util.Date date50 = subscribeNewsletter46.getDateSubscribed();
        rentedItem40.setRentDate(date50);
        java.util.Date date52 = rentedItem40.getDueDate();
        rentedItem29.setRentDate(date52);
        org.team4.model.items.RentedItem rentedItem54 = new org.team4.model.items.RentedItem("ItemPurchased{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', email='User [email=, password=, name=hi!, type=hi!, validated=false]', datePurchased=Tue Apr 30 19:22:09 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=null}", date16, date52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 30 19:22:12 EDT 2024");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Sat Mar 30 19:22:12 EDT 2024");
        org.junit.Assert.assertNotNull(date24);
// flaky:         org.junit.Assert.assertEquals(date24.toString(), "Sat Mar 30 19:22:12 EDT 2024");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Sat Mar 30 19:22:12 EDT 2024");
        org.junit.Assert.assertNotNull(date35);
// flaky:         org.junit.Assert.assertEquals(date35.toString(), "Sat Mar 30 19:22:12 EDT 2024");
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Sat Mar 30 19:22:12 EDT 2024");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str43, "ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.junit.Assert.assertNull(date49);
        org.junit.Assert.assertNotNull(date50);
// flaky:         org.junit.Assert.assertEquals(date50.toString(), "Sat Mar 30 19:22:12 EDT 2024");
        org.junit.Assert.assertNotNull(date52);
// flaky:         org.junit.Assert.assertEquals(date52.toString(), "Sat Mar 30 19:22:12 EDT 2024");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        org.team4.model.items.Magazine magazine13 = new org.team4.model.items.Magazine((org.team4.model.items.Item) book9, "User [email=hi!, password=hi!, name=hi!, type=, validated=false]", 10);
        java.lang.String str14 = magazine13.getPublisher();
        org.team4.model.user.Faculty faculty20 = new org.team4.model.user.Faculty("User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}, type=hi!, validated=false]", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", false);
        long long21 = faculty20.getFacultyID();
        faculty20.setType("User [email=, password=, name=hi!, type=, validated=false]");
        boolean boolean24 = magazine13.equals((java.lang.Object) "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User [email=hi!, password=hi!, name=hi!, type=, validated=false]" + "'", str14, "User [email=hi!, password=hi!, name=hi!, type=, validated=false]");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = bookItemBuilder8.title("ItemToPurchase{item=Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}, user=User [email=hi!, password=hi!, name=hi!, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.DVD dVD3 = dVDBuilder0.build();
        double double4 = dVD3.getDuration();
        org.team4.model.course.Course course10 = null;
        org.team4.model.course.CourseTextBook courseTextBook12 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) dVD3, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", (int) '#', "", "ItemPurchased{title='', email='', datePurchased=null}", (int) (short) -1, course10, true);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator13 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) dVD3);
        org.team4.model.items.Item item14 = purchasableItemDecorator13.getItem();
        org.team4.model.items.decorator.ItemDecorator itemDecorator15 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) purchasableItemDecorator13);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator16 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) purchasableItemDecorator13);
        boolean boolean17 = rentableItemDecorator16.isRentable();
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVD3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(item14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 19:22:10 EDT 2024, dateDue=Tue Apr 30 19:22:10 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", "User [email=, password=hi!, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=, validated=false]", "User [email=, password=, name=hi!, type=, validated=false]", true);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.team4.model.user.User user4 = new org.team4.model.user.User("ProcessPayment{modes=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, itemToPurchase=ItemToPurchase{item=Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}, user=User [email=, password=, name=hi!, type=hi!, validated=false], newsletter=null}}", "User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}, type=hi!, validated=false]", "", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:55 EDT 2024, dateDue=Tue Apr 30 19:21:55 EDT 2024}");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.BookBuilder bookBuilder4 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder6 = bookBuilder4.genre("ItemToPurchase{item=Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}, user=User [email=, password=, name=hi!, type=hi!, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookBuilder bookBuilder8 = bookBuilder6.hasSoftCopy(true);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.genre("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder10 = bookBuilder8.hasHardCopy(false);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.user.User user12 = purchaseComplete11.getUser();
        long long13 = purchaseComplete11.getPurchaseID();
        org.team4.model.items.Item item14 = purchaseComplete11.getItem();
        org.team4.model.items.Item item15 = purchaseComplete11.getItem();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNotNull(user12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2549084L + "'", long13 == 2549084L);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder0.publisher("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder12 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder14 = courseTextBookBuilder0.noOfPages((int) (short) 100);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(courseTextBookBuilder12);
        org.junit.Assert.assertNotNull(bookBuilder14);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        java.lang.String str3 = subscribeNewsletter2.toString();
        java.lang.String str4 = subscribeNewsletter2.getTitle();
        java.lang.String str5 = subscribeNewsletter2.getTitle();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:22:12 EDT 2024, dateDue=Tue Apr 30 19:22:12 EDT 2024}" + "'", str3, "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:22:12 EDT 2024, dateDue=Tue Apr 30 19:22:12 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str4, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str5, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDBuilder2.quantity(10);
        org.team4.model.items.builder.DVDBuilder dVDBuilder8 = dVDBuilder2.genre("PayPal{email='PayPal'}");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDBuilder8);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder10 = courseTextBookBuilder0.isVirtual(false);
        org.team4.model.items.builder.BookBuilder bookBuilder12 = courseTextBookBuilder10.genre("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        org.team4.model.items.builder.BookBuilder bookBuilder14 = courseTextBookBuilder10.genre("ItemPurchased{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', email='User [email=, password=, name=hi!, type=hi!, validated=false]', datePurchased=Tue Apr 30 19:22:09 EDT 2024}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(courseTextBookBuilder10);
        org.junit.Assert.assertNotNull(bookBuilder12);
        org.junit.Assert.assertNotNull(bookBuilder14);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("", "", "", "hi!", false);
        manager5.setName("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        manager5.setName("PayPal");
        boolean boolean10 = manager5.isValidated();
        java.lang.String str11 = manager5.toString();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [email=, password=, name=PayPal, type=hi!, validated=false]" + "'", str11, "User [email=, password=, name=PayPal, type=hi!, validated=false]");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("User [email=, password=, name=hi!, type=hi!, validated=false]", "ItemPurchased{title='', email='hi!', datePurchased=null}");
        java.lang.String str3 = subscribeNewsletter2.toString();
        subscribeNewsletter2.setTitle("SubscribeNewsletter{title='hi!', email='Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}', dateSubscribed=Tue Apr 30 19:22:08 EDT 2024, dateDue=Tue Apr 30 19:22:08 EDT 2024}");
        subscribeNewsletter2.setEmail("SubscribeNewsletter{title='hi!', email='Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}', dateSubscribed=Tue Apr 30 19:22:05 EDT 2024, dateDue=Tue Apr 30 19:22:05 EDT 2024}");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SubscribeNewsletter{title='User [email=, password=, name=hi!, type=hi!, validated=false]', email='ItemPurchased{title='', email='hi!', datePurchased=null}', dateSubscribed=Sat Mar 30 19:22:12 EDT 2024, dateDue=Tue Apr 30 19:22:12 EDT 2024}" + "'", str3, "SubscribeNewsletter{title='User [email=, password=, name=hi!, type=hi!, validated=false]', email='ItemPurchased{title='', email='hi!', datePurchased=null}', dateSubscribed=Sat Mar 30 19:22:12 EDT 2024, dateDue=Tue Apr 30 19:22:12 EDT 2024}");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("", (int) (byte) -1, 0, (double) 5930499L, "ItemPurchased{title='', email='', datePurchased=null}", false, true);
        boolean boolean8 = item7.isPurchasable();
        item7.setRentable(false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.builder.DVDBuilder dVDBuilder4 = dVDBuilder0.genre("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder0.duration((double) 4262496L);
        org.team4.model.items.builder.DVDBuilder dVDBuilder8 = dVDBuilder0.duration((double) 370272L);
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDBuilder8);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("ItemToPurchase{item=null, user=User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemPurchased{title='', email='', datePurchased=null}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, validated=false], newsletter=null}", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}", "ItemToPurchase{item=null, user=User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemPurchased{title='', email='', datePurchased=null}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, validated=false], newsletter=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", false);
        faculty5.setFacultyID(9382953L);
        faculty5.setType("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}, type=hi!, validated=false]", "Course [course name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, start date=Tue Apr 30 19:21:54 EDT 2024, end date=Tue Apr 30 19:21:54 EDT 2024, ISBN=ItemPurchased{title='', email='hi!', datePurchased=null}, email=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}]", (double) 1);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
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
        org.team4.model.items.DVD dVD14 = new org.team4.model.items.DVD((org.team4.model.items.Item) rentableItemDecorator10, "hi!", (double) 8233328L);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder0.email("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.edition((int) (byte) 10);
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder4.ISBN("ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder10 = bookRequestBuilder8.booktype("SubscribeNewsletter{title='hi!', email='User [email=, password=, name=hi!, type=hi!, validated=false]', dateSubscribed=Sat Mar 30 19:22:05 EDT 2024, dateDue=null}");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
        org.junit.Assert.assertNotNull(bookRequestBuilder10);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
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
        org.team4.model.items.decorator.ItemDecorator itemDecorator21 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) dVD20);
        int int22 = dVD20.getYearPublished();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("ItemPurchased{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', email='User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]', datePurchased=Tue Apr 30 19:22:08 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=null}", "User [email=User [email=, password=, name=hi!, type=, validated=false], password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=, validated=false]", 0, "ItemPurchased{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=null}', email='', datePurchased=Tue Apr 30 19:21:57 EDT 2024}");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
        boolean boolean96 = courseTextBook95.hasHardCopy();
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
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder21 = courseTextBookBuilder19.title("User [email=, password=User [email=, password=, name=hi!, type=hi!, validated=false], name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=null}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}, validated=false]");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder23 = courseTextBookBuilder19.isVirtual(true);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(courseTextBookBuilder19);
        org.junit.Assert.assertNotNull(bookItemBuilder21);
        org.junit.Assert.assertNotNull(courseTextBookBuilder23);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder35 = courseTextBookBuilder33.price((double) 100.0f);
        org.team4.model.course.Course course36 = null;
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder37 = courseTextBookBuilder33.course(course36);
        org.team4.model.items.builder.BookBuilder bookBuilder39 = courseTextBookBuilder37.edition((int) (short) -1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder41 = courseTextBookBuilder37.ISBN("SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', email='SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}', dateSubscribed=Tue Apr 30 19:22:01 EDT 2024, dateDue=Tue Apr 30 19:22:01 EDT 2024}");
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
        org.junit.Assert.assertNotNull(courseTextBookBuilder37);
        org.junit.Assert.assertNotNull(bookBuilder39);
        org.junit.Assert.assertNotNull(bookItemBuilder41);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter4 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.util.Date date5 = subscribeNewsletter4.getDateSubscribed();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter14 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str15 = subscribeNewsletter14.getEmail();
        java.util.Date date16 = subscribeNewsletter14.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter19 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str20 = subscribeNewsletter19.getEmail();
        java.util.Date date21 = subscribeNewsletter19.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter22 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date16, date21);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter25 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter25.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter25.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter32 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date33 = null;
        subscribeNewsletter32.setDateSubscribed(date33);
        java.util.Date date35 = subscribeNewsletter32.getDateDue();
        subscribeNewsletter25.setDateDue(date35);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter37 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", date21, date35);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter41 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str42 = subscribeNewsletter41.getTitle();
        java.util.Date date43 = null;
        subscribeNewsletter41.setDateSubscribed(date43);
        java.util.Date date45 = subscribeNewsletter41.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter48 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter48.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter54 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str55 = subscribeNewsletter54.getTitle();
        java.util.Date date56 = null;
        subscribeNewsletter54.setDateSubscribed(date56);
        java.util.Date date58 = subscribeNewsletter54.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter63 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str64 = subscribeNewsletter63.getEmail();
        java.util.Date date65 = subscribeNewsletter63.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter68 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str69 = subscribeNewsletter68.getEmail();
        java.util.Date date70 = subscribeNewsletter68.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter71 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date65, date70);
        org.team4.model.course.Course course74 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date58, date70, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        subscribeNewsletter48.setDateSubscribed(date58);
        org.team4.model.course.Course course78 = new org.team4.model.course.Course("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", date45, date58, "Credit Card", "ItemPurchased{title='', email='', datePurchased=null}");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter79 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}", date21, date45);
        org.team4.model.items.RentedItem rentedItem80 = new org.team4.model.items.RentedItem("SubscribeNewsletter{title='ItemPurchased{title='', email='', datePurchased=null}', email='', dateSubscribed=Tue Apr 30 19:21:58 EDT 2024, dateDue=Tue Apr 30 19:21:58 EDT 2024}", "", date5, date45);
        java.util.Date date81 = null;
        rentedItem80.setRentDate(date81);
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Sat Mar 30 19:22:12 EDT 2024");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Tue Apr 30 19:22:12 EDT 2024");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Tue Apr 30 19:22:12 EDT 2024");
        org.junit.Assert.assertNotNull(date35);
// flaky:         org.junit.Assert.assertEquals(date35.toString(), "Tue Apr 30 19:22:12 EDT 2024");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(date45);
// flaky:         org.junit.Assert.assertEquals(date45.toString(), "Tue Apr 30 19:22:12 EDT 2024");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNotNull(date58);
// flaky:         org.junit.Assert.assertEquals(date58.toString(), "Tue Apr 30 19:22:12 EDT 2024");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertNotNull(date65);
// flaky:         org.junit.Assert.assertEquals(date65.toString(), "Tue Apr 30 19:22:12 EDT 2024");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertNotNull(date70);
// flaky:         org.junit.Assert.assertEquals(date70.toString(), "Tue Apr 30 19:22:12 EDT 2024");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.title("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.edition(0);
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder3.title("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder9 = bookRequestBuilder3.ISBN("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder11 = bookRequestBuilder9.booktype("User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]");
        org.team4.model.items.BookRequest bookRequest12 = bookRequestBuilder9.build();
        java.lang.String str13 = bookRequest12.getISBN();
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
        org.junit.Assert.assertNotNull(bookRequestBuilder9);
        org.junit.Assert.assertNotNull(bookRequestBuilder11);
        org.junit.Assert.assertNotNull(bookRequest12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str13, "ItemPurchased{title='', email='hi!', datePurchased=null}");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.yearPublished((int) (short) -1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineBuilder0.quantity((int) (byte) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder10 = magazineBuilder0.quantity(0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder12 = magazineBuilder0.issueNumber((int) (short) 1);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder14 = magazineBuilder12.publisher("ProcessPayment{modes=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, itemToPurchase=ItemToPurchase{item=Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}, user=User [email=, password=, name=hi!, type=hi!, validated=false], newsletter=null}}");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
        org.junit.Assert.assertNotNull(magazineItemBuilder10);
        org.junit.Assert.assertNotNull(magazineBuilder12);
        org.junit.Assert.assertNotNull(magazineBuilder14);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
        org.team4.functionality.buy.PurchaseComplete purchaseComplete18 = processPayment14.getPurchaseCompleted();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete19 = processPayment14.getPurchaseCompleted();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(purchaseComplete18);
        org.junit.Assert.assertNull(purchaseComplete19);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator11 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator12 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) rentableItemDecorator11);
        org.team4.model.items.decorator.ItemDecorator itemDecorator13 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) purchasableItemDecorator12);
        java.lang.String str14 = itemDecorator13.getISBN();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "Course [course name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, start date=Tue Apr 30 19:22:01 EDT 2024, end date=Tue Apr 30 19:22:01 EDT 2024, ISBN=ItemPurchased{title='', email='hi!', datePurchased=null}, email=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:55 EDT 2024, dateDue=Tue Apr 30 19:21:55 EDT 2024}", "SubscribeNewsletter{title='Credit Card', email='hi!', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}", false);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.util.Date date3 = null;
        subscribeNewsletter2.setDateDue(date3);
        java.util.Date date5 = subscribeNewsletter2.getDateDue();
        java.util.Date date6 = subscribeNewsletter2.getDateDue();
        java.lang.String str7 = subscribeNewsletter2.toString();
        java.lang.String str8 = subscribeNewsletter2.toString();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:22:12 EDT 2024, dateDue=null}" + "'", str7, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:22:12 EDT 2024, dateDue=null}");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:22:12 EDT 2024, dateDue=null}" + "'", str8, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:22:12 EDT 2024, dateDue=null}");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.yearPublished((int) (short) -1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineBuilder0.quantity((int) (byte) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder10 = magazineBuilder0.quantity(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder12 = magazineBuilder0.ISBN("ItemPurchased{title='', email='', datePurchased=null}");
        org.team4.model.items.Magazine magazine13 = magazineBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder15 = magazineBuilder0.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:22:12 EDT 2024, dateDue=null}");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
        org.junit.Assert.assertNotNull(magazineItemBuilder10);
        org.junit.Assert.assertNotNull(magazineItemBuilder12);
        org.junit.Assert.assertNotNull(magazine13);
        org.junit.Assert.assertNotNull(magazineItemBuilder15);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:59 EDT 2024, dateDue=Tue Apr 30 19:21:59 EDT 2024}", "User [email=hi!, password=hi!, name=hi!, type=, validated=false]", "User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=User [email=, password=, name=hi!, type=, validated=false], name=hi!, type=PayPal, validated=true]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:22:12 EDT 2024, dateDue=null}", (int) 'a', "User [email=hi!, password=hi!, name=hi!, type=, validated=false]");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        java.lang.String[] strArray30 = new java.lang.String[] { "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "PayPal", "ItemPurchased{title='', email='hi!', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemPurchased{title='', email='', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        org.team4.model.user.Faculty faculty33 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "", "ItemPurchased{title='', email='', datePurchased=null}", 0L, strList31);
        org.team4.model.user.Student student34 = new org.team4.model.user.Student("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "Debit Card", "hi!", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", strList31);
        org.team4.model.user.Student student35 = new org.team4.model.user.Student("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "User [email=, password=, name=hi!, type=, validated=false]", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemPurchased{title='', email='hi!', datePurchased=null}", strList31);
        org.team4.model.user.Faculty faculty36 = new org.team4.model.user.Faculty("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "SubscribeNewsletter{title='hi!', email='Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}', dateSubscribed=Tue Apr 30 19:22:08 EDT 2024, dateDue=Tue Apr 30 19:22:08 EDT 2024}", "User [email=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], password=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}, validated=false]", "SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', email='SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}', dateSubscribed=Tue Apr 30 19:22:01 EDT 2024, dateDue=Tue Apr 30 19:22:01 EDT 2024}", 0L, strList31);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder0.email("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.edition((int) (byte) 10);
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder4.ISBN("ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder10 = bookRequestBuilder8.author("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
        org.junit.Assert.assertNotNull(bookRequestBuilder10);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("", date1, date2, "", "hi!");
        java.lang.String str6 = course5.getProfessorEmail();
        java.util.Date date7 = course5.getStartDate();
        org.team4.model.user.Student student12 = new org.team4.model.user.Student("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal", "Credit Card", "");
        java.lang.String str13 = student12.getEmail();
        boolean boolean14 = course5.isEnrolled(student12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str13, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.team4.model.user.Manager manager4 = new org.team4.model.user.Manager("ItemPurchased{title='ItemPurchased{title='', email='hi!', datePurchased=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', datePurchased=Tue Apr 30 19:22:07 EDT 2024}", "User [email=, password=, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='User [email=, password=, name=hi!, type=hi!, validated=false]', email='ItemPurchased{title='', email='hi!', datePurchased=null}', dateSubscribed=Sat Mar 30 19:22:11 EDT 2024, dateDue=Tue Apr 30 19:22:11 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder10 = courseTextBookBuilder0.isVirtual(false);
        org.team4.model.items.builder.BookBuilder bookBuilder12 = courseTextBookBuilder10.edition(10);
        org.team4.model.items.builder.BookBuilder bookBuilder14 = bookBuilder12.noOfPages((int) (short) 10);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(courseTextBookBuilder10);
        org.junit.Assert.assertNotNull(bookBuilder12);
        org.junit.Assert.assertNotNull(bookBuilder14);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        java.lang.String str22 = book9.getAuthor();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder23 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder25 = courseTextBookBuilder23.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder27 = courseTextBookBuilder23.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder29 = courseTextBookBuilder23.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder31 = courseTextBookBuilder23.hasSoftCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder33 = courseTextBookBuilder23.author("ItemPurchased{title='', email='hi!', datePurchased=null}");
        boolean boolean34 = book9.equals((java.lang.Object) bookBuilder33);
        org.team4.model.items.builder.BookBuilder bookBuilder36 = bookBuilder33.publisher("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder38 = bookBuilder36.quantity((int) '4');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder40 = bookBuilder36.quantity((int) (short) -1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder42 = bookItemBuilder40.price((double) 1403553L);
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
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(bookBuilder25);
        org.junit.Assert.assertNotNull(bookItemBuilder27);
        org.junit.Assert.assertNotNull(courseTextBookBuilder29);
        org.junit.Assert.assertNotNull(bookBuilder31);
        org.junit.Assert.assertNotNull(bookBuilder33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(bookBuilder36);
        org.junit.Assert.assertNotNull(bookItemBuilder38);
        org.junit.Assert.assertNotNull(bookItemBuilder40);
        org.junit.Assert.assertNotNull(bookItemBuilder42);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.Magazine magazine5 = magazineBuilder0.build();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder7 = magazineBuilder0.issueNumber((int) (short) 1);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder9 = magazineBuilder7.issueNumber((int) (short) -1);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder11 = magazineBuilder7.issueNumber(0);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazine5);
        org.junit.Assert.assertNotNull(magazineBuilder7);
        org.junit.Assert.assertNotNull(magazineBuilder9);
        org.junit.Assert.assertNotNull(magazineBuilder11);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 10);
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder2.genre("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDBuilder6.price((double) 100L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder10 = dVDItemBuilder8.price((double) 9763562L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder12 = dVDItemBuilder10.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
        org.junit.Assert.assertNotNull(dVDItemBuilder10);
        org.junit.Assert.assertNotNull(dVDItemBuilder12);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.Magazine magazine5 = magazineBuilder0.build();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder7 = magazineBuilder0.issueNumber((int) (short) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder9 = magazineBuilder0.quantity((int) (byte) 10);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder11 = magazineBuilder0.issueNumber((int) '4');
        org.team4.model.items.builder.MagazineBuilder magazineBuilder13 = magazineBuilder0.publisher("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:57 EDT 2024, dateDue=Tue Apr 30 19:21:57 EDT 2024}");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazine5);
        org.junit.Assert.assertNotNull(magazineBuilder7);
        org.junit.Assert.assertNotNull(magazineItemBuilder9);
        org.junit.Assert.assertNotNull(magazineBuilder11);
        org.junit.Assert.assertNotNull(magazineBuilder13);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.yearPublished((int) (short) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder8 = magazineBuilder0.issueNumber(100);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder10 = magazineBuilder8.publisher("Debit Card");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder12 = magazineBuilder8.price((double) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder14 = magazineBuilder8.yearPublished((int) ' ');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder16 = magazineBuilder8.title("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:57 EDT 2024, dateDue=Tue Apr 30 19:21:57 EDT 2024}");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineBuilder8);
        org.junit.Assert.assertNotNull(magazineBuilder10);
        org.junit.Assert.assertNotNull(magazineItemBuilder12);
        org.junit.Assert.assertNotNull(magazineItemBuilder14);
        org.junit.Assert.assertNotNull(magazineItemBuilder16);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("ItemToPurchase{item=Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}, user=User [email=, password=, name=hi!, type=hi!, validated=false], newsletter=null}");
        java.lang.String str2 = payPal1.getMode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Mobile Wallet" + "'", str2, "Mobile Wallet");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
        org.team4.model.user.Student student22 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str23 = student22.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase24 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student22);
        java.lang.String str25 = student22.toString();
        java.lang.String str26 = student22.getEmail();
        course5.enrollStudent(student22);
        java.lang.String str28 = course5.getCourseTextBookISBN();
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str25, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.team4.model.user.User user5 = new org.team4.model.user.User("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "Debit Card", "PayPal", true);
        java.lang.String str6 = user5.toString();
        java.lang.String str7 = user5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [email=Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}, password=PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}, name=Debit Card, type=PayPal, validated=true]" + "'", str6, "User [email=Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}, password=PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}, name=Debit Card, type=PayPal, validated=true]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}" + "'", str7, "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("User [email=, password=, name=hi!, type=, validated=false]", (int) ' ', (int) (byte) 10);
        java.lang.String str4 = debitCard3.getMode();
        boolean boolean5 = debitCard3.notExpired();
        java.lang.String str6 = debitCard3.getMode();
        boolean boolean7 = debitCard3.notExpired();
        boolean boolean8 = debitCard3.notExpired();
        boolean boolean9 = debitCard3.correctLength();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card" + "'", str4, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Debit Card" + "'", str6, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter4 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        java.util.Date date5 = subscribeNewsletter4.getDateSubscribed();
        org.team4.functionality.buy.ItemPurchased itemPurchased8 = new org.team4.functionality.buy.ItemPurchased("ItemPurchased{title='', email='hi!', datePurchased=null}", "hi!");
        java.util.Date date9 = itemPurchased8.getDatePurchased();
        org.team4.model.items.RentedItem rentedItem10 = new org.team4.model.items.RentedItem("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", date5, date9);
        rentedItem10.setISBN("ItemPurchased{title='', email='hi!', datePurchased=null}");
        java.lang.String str13 = rentedItem10.getISBN();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter16 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.util.Date date17 = null;
        subscribeNewsletter16.setDateDue(date17);
        java.util.Date date19 = subscribeNewsletter16.getDateDue();
        java.util.Date date20 = subscribeNewsletter16.getDateSubscribed();
        rentedItem10.setRentDate(date20);
        java.util.Date date22 = rentedItem10.getDueDate();
        java.util.Date date23 = rentedItem10.getRentDate();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Sat Mar 30 19:22:12 EDT 2024");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Sat Mar 30 19:22:12 EDT 2024");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str13, "ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Sat Mar 30 19:22:12 EDT 2024");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Sat Mar 30 19:22:12 EDT 2024");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Sat Mar 30 19:22:12 EDT 2024");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("ItemPurchased{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:59 EDT 2024, dateDue=Tue Apr 30 19:21:59 EDT 2024}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:59 EDT 2024, dateDue=Tue Apr 30 19:21:59 EDT 2024}', datePurchased=Sat Mar 30 19:22:08 EDT 2024}", "ItemToPurchase{item=Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}, user=User [email=, password=, name=hi!, type=hi!, validated=false], newsletter=null}", "SubscribeNewsletter{title='ItemPurchased{title='', email='', datePurchased=null}', email='', dateSubscribed=Tue Apr 30 19:21:58 EDT 2024, dateDue=Tue Apr 30 19:21:58 EDT 2024}", "User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=User [email=, password=, name=hi!, type=, validated=false], name=hi!, type=PayPal, validated=true]", false);
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
        dVD1.setQuantity((int) (short) 1);
        dVD1.setQuantity((int) ' ');
        boolean boolean9 = dVD1.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD1);
        org.team4.model.items.Item item11 = rentableItemDecorator10.getItem();
        org.team4.model.items.Item item12 = rentableItemDecorator10.getItem();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator13 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) rentableItemDecorator10);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator14 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) rentableItemDecorator10);
        rentableItemDecorator10.setQuantity(10);
        org.team4.model.items.Item item17 = rentableItemDecorator10.getItem();
        org.team4.model.items.decorator.ItemDecorator itemDecorator18 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) rentableItemDecorator10);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertNotNull(item12);
        org.junit.Assert.assertNotNull(item17);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.team4.functionality.buy.ItemPurchased itemPurchased2 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "SubscribeNewsletter{title='Credit Card', email='hi!', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}");
        java.lang.String str3 = itemPurchased2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SubscribeNewsletter{title='Credit Card', email='hi!', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}" + "'", str3, "SubscribeNewsletter{title='Credit Card', email='hi!', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
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
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter67 = new org.team4.functionality.subscriptions.SubscribeNewsletter("User [email=, password=, name=hi!, type=, validated=false]", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter70 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str71 = subscribeNewsletter70.getTitle();
        java.util.Date date72 = subscribeNewsletter70.getDateDue();
        subscribeNewsletter67.setDateSubscribed(date72);
        rentedItem59.setRentDate(date72);
        org.team4.functionality.buy.ItemPurchased itemPurchased77 = new org.team4.functionality.buy.ItemPurchased("ItemPurchased{title='', email='', datePurchased=null}", "ItemPurchased{title='', email='', datePurchased=null}");
        java.util.Date date78 = itemPurchased77.getDatePurchased();
        rentedItem59.setDueDate(date78);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Apr 30 19:22:12 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Tue Apr 30 19:22:12 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 19:22:12 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 19:22:12 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 19:22:12 EDT 2024");
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Tue Apr 30 19:22:12 EDT 2024");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}" + "'", str64, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertNotNull(date72);
// flaky:         org.junit.Assert.assertEquals(date72.toString(), "Tue Apr 30 19:22:12 EDT 2024");
        org.junit.Assert.assertNotNull(date78);
// flaky:         org.junit.Assert.assertEquals(date78.toString(), "Sat Mar 30 19:22:12 EDT 2024");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        java.util.Date date2 = null;
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("", "", date2);
        java.lang.String str4 = itemPurchased3.toString();
        java.lang.String str5 = itemPurchased3.getTitle();
        java.lang.String str6 = itemPurchased3.toString();
        java.lang.String str7 = itemPurchased3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str4, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str6, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder4.yearPublished((int) (byte) -1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineItemBuilder6.title("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("ItemToPurchase{item=Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}, user=User [email=, password=, name=hi!, type=hi!, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:22:08 EDT 2024, dateDue=null}", "ItemPurchased{title='', email='', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:22:08 EDT 2024, dateDue=null}", false);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("ItemToPurchase{item=null, user=User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemPurchased{title='', email='', datePurchased=null}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, validated=false], newsletter=null}", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}", "ItemToPurchase{item=null, user=User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemPurchased{title='', email='', datePurchased=null}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, validated=false], newsletter=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", false);
        faculty5.setFacultyID(9382953L);
        org.team4.model.user.Student student17 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str18 = student17.getType();
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        student17.setCourses(strList21);
        org.team4.model.user.Faculty faculty24 = new org.team4.model.user.Faculty("User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}, type=hi!, validated=false]", "Debit Card", "User [email=, password=, name=hi!, type=, validated=false]", "PayPal", 100L, strList21);
        faculty5.setCourses(strList21);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.quantity(10);
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder2.duration((double) 5204226L);
        org.team4.model.items.builder.DVDBuilder dVDBuilder8 = dVDBuilder2.duration((double) 180104L);
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDBuilder8);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        int int9 = book7.getQuantity();
        book7.setPrice((double) 100L);
        int int12 = book7.getYearPublished();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        java.lang.String str8 = itemToPurchase7.toString();
        double double9 = itemToPurchase7.getAmount();
        org.team4.model.user.User user10 = itemToPurchase7.getUser();
        org.team4.model.paymentmodes.CreditCard creditCard14 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        boolean boolean15 = creditCard14.notExpired();
        boolean boolean16 = creditCard14.isValid();
        boolean boolean17 = creditCard14.notExpired();
        boolean boolean18 = creditCard14.isValid();
        boolean boolean19 = creditCard14.correctLength();
        java.lang.String str20 = creditCard14.getMode();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete21 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) creditCard14);
        org.team4.model.user.NonFaculty nonFaculty27 = new org.team4.model.user.NonFaculty("hi!", "hi!", "hi!", "");
        nonFaculty27.setUniversityID((long) (short) 100);
        long long30 = nonFaculty27.getUniversityID();
        nonFaculty27.setUniversityID((long) (short) 100);
        nonFaculty27.setName("PayPal");
        long long35 = nonFaculty27.getUniversityID();
        java.lang.String str36 = nonFaculty27.getPassword();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase37 = new org.team4.functionality.buy.ItemToPurchase((double) 10L, (org.team4.model.user.User) nonFaculty27);
        org.team4.model.user.User user38 = itemToPurchase37.getUser();
        org.team4.functionality.buy.ProcessPayment processPayment39 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) creditCard14, itemToPurchase37);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}" + "'", str8, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Credit Card" + "'", str20, "Credit Card");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 100L + "'", long30 == 100L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 100L + "'", long35 == 100L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(user38);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("PayPal");
        java.lang.String str2 = payPal1.toString();
        boolean boolean3 = payPal1.isValid();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PayPal{email='PayPal'}" + "'", str2, "PayPal{email='PayPal'}");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("User [email=, password=hi!, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=, validated=false]", "Debit Card", "SubscribeNewsletter{title='User [email=, password=, name=hi!, type=, validated=false]', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Sat Mar 30 19:22:02 EDT 2024, dateDue=Tue Apr 30 19:22:02 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:57 EDT 2024, dateDue=Tue Apr 30 19:21:57 EDT 2024}");
        boolean boolean5 = nonFaculty4.isValidated();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.title("hi!");
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder0.genre("PayPal{email='Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}'}");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "ItemPurchased{title='', email='', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:55 EDT 2024, dateDue=Tue Apr 30 19:21:55 EDT 2024}", false);
        manager5.setManagerID(7527390L);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder6 = courseTextBookBuilder0.quantity(0);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.Book book9 = bookBuilder8.build();
        org.team4.model.items.builder.BookBuilder bookBuilder11 = bookBuilder8.edition(1);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookItemBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNotNull(bookBuilder11);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("ItemToPurchase{item=null, user=User [email=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemPurchased{title='', email='', datePurchased=null}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, validated=false], newsletter=null}", "", "User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}, type=hi!, validated=false]", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}", (int) (short) 0, "");
        java.lang.String str7 = bookRequest6.getISBN();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}" + "'", str7, "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=hi!, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=, validated=false]");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter7 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        java.util.Date date8 = subscribeNewsletter7.getDateSubscribed();
        org.team4.functionality.buy.ItemPurchased itemPurchased11 = new org.team4.functionality.buy.ItemPurchased("ItemPurchased{title='', email='hi!', datePurchased=null}", "hi!");
        java.util.Date date12 = itemPurchased11.getDatePurchased();
        org.team4.model.items.RentedItem rentedItem13 = new org.team4.model.items.RentedItem("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", date8, date12);
        rentedItem13.setISBN("ItemPurchased{title='', email='', datePurchased=null}");
        java.util.Date date16 = rentedItem13.getRentDate();
        subscribeNewsletter2.setDateDue(date16);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Sat Mar 30 19:22:12 EDT 2024");
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Sat Mar 30 19:22:12 EDT 2024");
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Sat Mar 30 19:22:12 EDT 2024");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        org.team4.model.items.DVD dVD12 = new org.team4.model.items.DVD((org.team4.model.items.Item) book9, "PayPal{email='PayPal'}", (double) (-1));
        org.team4.model.items.decorator.ItemDecorator itemDecorator13 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) book9);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
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
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder60 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder62 = courseTextBookBuilder60.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder64 = courseTextBookBuilder60.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder66 = courseTextBookBuilder60.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder68 = courseTextBookBuilder60.price((double) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder70 = courseTextBookBuilder60.price((double) 10);
        org.team4.model.course.CourseTextBook courseTextBook71 = courseTextBookBuilder60.build();
        java.util.Date date78 = null;
        java.util.Date date79 = null;
        org.team4.model.course.Course course82 = new org.team4.model.course.Course("hi!", date78, date79, "", "hi!");
        java.lang.String str83 = course82.getProfessorEmail();
        org.team4.model.user.Student student84 = null;
        boolean boolean85 = course82.isEnrolled(student84);
        org.team4.model.course.CourseTextBook courseTextBook87 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook71, "hi!", (int) (short) 1, "PayPal", "Credit Card", (int) (short) 10, course82, true);
        org.team4.model.course.CourseTextBook courseTextBook89 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook45, "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}", (int) (byte) 100, "User [email=, password=, name=hi!, type=hi!, validated=false]", "SubscribeNewsletter{title='Credit Card', email='hi!', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}", (int) (byte) 1, course82, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str90 = course82.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.toString()\" because \"this.startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(bookBuilder62);
        org.junit.Assert.assertNotNull(bookItemBuilder64);
        org.junit.Assert.assertNotNull(bookBuilder66);
        org.junit.Assert.assertNotNull(bookItemBuilder68);
        org.junit.Assert.assertNotNull(bookItemBuilder70);
        org.junit.Assert.assertNotNull(courseTextBook71);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        java.lang.String[] strArray25 = new java.lang.String[] { "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "PayPal", "ItemPurchased{title='', email='hi!', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemPurchased{title='', email='', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        org.team4.model.user.Faculty faculty28 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "", "ItemPurchased{title='', email='', datePurchased=null}", 0L, strList26);
        org.team4.model.user.Student student29 = new org.team4.model.user.Student("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "Debit Card", "hi!", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", strList26);
        org.team4.model.user.Student student30 = new org.team4.model.user.Student("Credit Card", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", strList26);
        java.lang.String str31 = student30.getName();
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]" + "'", str31, "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("SubscribeNewsletter{title='hi!', email='Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}', dateSubscribed=Tue Apr 30 19:22:05 EDT 2024, dateDue=Tue Apr 30 19:22:05 EDT 2024}", (int) 'a', 10, (double) 5853955L, "ItemPurchased{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=null}', email='', datePurchased=Tue Apr 30 19:21:57 EDT 2024}", true, true);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        java.util.ArrayList<java.lang.String> strList4 = null;
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("ItemToPurchase{item=null, user=User [email=, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=PayPal, validated=false], newsletter=null}", "Book{genre='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', noOfPages=1, author='hi!', ISBN=null, publisher='PayPal', edition='52'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:22:07 EDT 2024, dateDue=Tue Apr 30 19:22:07 EDT 2024}", "SubscribeNewsletter{title='ItemPurchased{title='', email='', datePurchased=null}', email='', dateSubscribed=Tue Apr 30 19:21:58 EDT 2024, dateDue=Tue Apr 30 19:21:58 EDT 2024}", strList4);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
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
        java.lang.String str41 = debitCard3.getMode();
        boolean boolean42 = debitCard3.notExpired();
        boolean boolean43 = debitCard3.notExpired();
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Debit Card" + "'", str41, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "hi!", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", false);
        java.lang.String str6 = faculty5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [email=, password=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, name=hi!, type=PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}, validated=false]" + "'", str6, "User [email=, password=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, name=hi!, type=PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}, validated=false]");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:55 EDT 2024, dateDue=Tue Apr 30 19:21:55 EDT 2024}", 52, 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=null}", "Book{genre='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', noOfPages=1, author='hi!', ISBN=null, publisher='PayPal', edition='52'}", (double) 4151587L);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder6.quantity((-1));
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = courseTextBookBuilder6.price((double) 100L);
        org.team4.model.items.builder.BookBuilder bookBuilder14 = courseTextBookBuilder6.hasHardCopy(false);
        org.team4.model.items.builder.BookBuilder bookBuilder16 = courseTextBookBuilder6.hasHardCopy(false);
        org.team4.model.items.builder.BookBuilder bookBuilder18 = courseTextBookBuilder6.genre("");
        org.team4.model.items.builder.BookBuilder bookBuilder20 = courseTextBookBuilder6.noOfPages(10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder22 = bookBuilder20.title("ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(bookItemBuilder12);
        org.junit.Assert.assertNotNull(bookBuilder14);
        org.junit.Assert.assertNotNull(bookBuilder16);
        org.junit.Assert.assertNotNull(bookBuilder18);
        org.junit.Assert.assertNotNull(bookBuilder20);
        org.junit.Assert.assertNotNull(bookItemBuilder22);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder20 = courseTextBookBuilder16.isVirtual(false);
        org.team4.model.course.CourseTextBook courseTextBook21 = courseTextBookBuilder16.build();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNotNull(courseTextBookBuilder16);
        org.junit.Assert.assertNotNull(bookItemBuilder18);
        org.junit.Assert.assertNotNull(courseTextBookBuilder20);
        org.junit.Assert.assertNotNull(courseTextBook21);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.paymentmodes.DebitCard debitCard15 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete16 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) debitCard15);
        java.lang.String str17 = itemToPurchase7.toString();
        org.team4.model.items.Item item18 = itemToPurchase7.getItem();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}" + "'", str17, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNull(item18);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
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
        org.team4.model.items.Book book34 = courseTextBookBuilder16.build();
        java.util.Date date37 = null;
        org.team4.functionality.buy.ItemPurchased itemPurchased38 = new org.team4.functionality.buy.ItemPurchased("", "", date37);
        java.lang.String str39 = itemPurchased38.getTitle();
        java.lang.String str40 = itemPurchased38.toString();
        boolean boolean41 = book34.equals((java.lang.Object) itemPurchased38);
        int int42 = book34.getEdition();
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
        org.junit.Assert.assertNotNull(book34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str40, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.course.Course course6 = new org.team4.model.course.Course("hi!", date2, date3, "", "hi!");
        java.util.Date date7 = course6.getEndDate();
        java.lang.String str8 = course6.getProfessorEmail();
        java.lang.String str9 = course6.getProfessorEmail();
        org.team4.model.user.Student student14 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean15 = course6.isEnrolled(student14);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase16 = new org.team4.functionality.buy.ItemToPurchase(100.0d, (org.team4.model.user.User) student14);
        org.team4.model.user.User user17 = itemToPurchase16.getUser();
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(user17);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder6 = magazineBuilder4.issueNumber(32);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineBuilder6.ISBN("User [email=, password=, name=hi!, type=hi!, validated=false]");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter3 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter3.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date6 = subscribeNewsletter3.getDateDue();
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
        java.lang.String str35 = itemPurchased34.getTitle();
        java.lang.String str36 = itemPurchased34.getTitle();
        java.lang.String str37 = itemPurchased34.getTitle();
        java.lang.String str38 = itemPurchased34.getTitle();
        java.util.Date date39 = itemPurchased34.getDatePurchased();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter46 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str47 = subscribeNewsletter46.getEmail();
        java.util.Date date48 = subscribeNewsletter46.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter51 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str52 = subscribeNewsletter51.getEmail();
        java.util.Date date53 = subscribeNewsletter51.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter54 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date48, date53);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter57 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter57.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter57.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter64 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date65 = null;
        subscribeNewsletter64.setDateSubscribed(date65);
        java.util.Date date67 = subscribeNewsletter64.getDateDue();
        subscribeNewsletter57.setDateDue(date67);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter69 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", date53, date67);
        org.team4.model.course.Course course72 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}", date39, date53, "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:59 EDT 2024, dateDue=Tue Apr 30 19:21:59 EDT 2024}");
        org.team4.model.course.Course course75 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date6, date53, "SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', email='SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}', dateSubscribed=Tue Apr 30 19:22:01 EDT 2024, dateDue=Tue Apr 30 19:22:01 EDT 2024}", "User [email=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], password=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}, validated=false]");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter78 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        java.util.Date date79 = subscribeNewsletter78.getDateSubscribed();
        java.util.Date date80 = subscribeNewsletter78.getDateDue();
        boolean boolean81 = course75.isStarted(date80);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 30 19:22:12 EDT 2024");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Tue Apr 30 19:22:12 EDT 2024");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(date24);
// flaky:         org.junit.Assert.assertEquals(date24.toString(), "Tue Apr 30 19:22:12 EDT 2024");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Tue Apr 30 19:22:12 EDT 2024");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}" + "'", str35, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}" + "'", str36, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}" + "'", str37, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}" + "'", str38, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Tue Apr 30 19:22:12 EDT 2024");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(date48);
// flaky:         org.junit.Assert.assertEquals(date48.toString(), "Tue Apr 30 19:22:12 EDT 2024");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(date53);
// flaky:         org.junit.Assert.assertEquals(date53.toString(), "Tue Apr 30 19:22:12 EDT 2024");
        org.junit.Assert.assertNotNull(date67);
// flaky:         org.junit.Assert.assertEquals(date67.toString(), "Tue Apr 30 19:22:12 EDT 2024");
        org.junit.Assert.assertNotNull(date79);
// flaky:         org.junit.Assert.assertEquals(date79.toString(), "Sat Mar 30 19:22:12 EDT 2024");
        org.junit.Assert.assertNotNull(date80);
// flaky:         org.junit.Assert.assertEquals(date80.toString(), "Tue Apr 30 19:22:12 EDT 2024");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        boolean boolean8 = book7.hasHardCopy();
        boolean boolean9 = book7.hasSoftCopy();
        java.lang.String str10 = book7.getGenre();
        org.team4.model.items.Item item11 = new org.team4.model.items.Item((org.team4.model.items.Item) book7);
        org.team4.model.items.Book book19 = new org.team4.model.items.Book(item11, "ItemPurchased{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}', email='', datePurchased=Sat Mar 30 19:22:11 EDT 2024}", (-1), "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=null}", "User [email=, password=, name=, type=, validated=false]", 100, false, true);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
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
        faculty17.setFacultyID(5033118L);
        boolean boolean36 = faculty17.isValidated();
        faculty17.setPassword("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.team4.model.user.Student student14 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str15 = student14.getType();
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        student14.setCourses(strList18);
        org.team4.model.user.Faculty faculty21 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", (long) (byte) -1, strList18);
        java.lang.String str22 = faculty21.getName();
        faculty21.setFacultyID((long) (short) 100);
        java.util.ArrayList<java.lang.String> strList25 = faculty21.getCourses();
        org.team4.model.user.Faculty faculty26 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", (long) (byte) 100, strList25);
        faculty26.setFacultyID((long) (byte) 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str22, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.yearPublished((int) (short) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder8 = magazineBuilder0.issueNumber(100);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder10 = magazineBuilder0.publisher("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:55 EDT 2024, dateDue=Tue Apr 30 19:21:55 EDT 2024}");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineBuilder8);
        org.junit.Assert.assertNotNull(magazineBuilder10);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
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
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.yearPublished((int) (short) -1);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder8 = magazineBuilder0.publisher("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        org.team4.model.items.Magazine magazine9 = magazineBuilder8.build();
        org.team4.model.items.Magazine magazine10 = magazineBuilder8.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder12 = magazineBuilder8.title("PayPal");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineBuilder8);
        org.junit.Assert.assertNotNull(magazine9);
        org.junit.Assert.assertNotNull(magazine10);
        org.junit.Assert.assertNotNull(magazineItemBuilder12);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        org.team4.model.course.Course course9 = new org.team4.model.course.Course("hi!", date5, date6, "", "hi!");
        java.util.Date date10 = course9.getEndDate();
        java.lang.String str11 = course9.getProfessorEmail();
        java.lang.String str12 = course9.getProfessorEmail();
        org.team4.model.user.Student student17 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean18 = course9.isEnrolled(student17);
        student17.setEmail("Credit Card");
        org.team4.model.user.Faculty faculty26 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "hi!", "", "", false);
        faculty26.setFacultyID((long) (byte) 1);
        org.team4.model.user.Student student33 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str34 = student33.getType();
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        student33.setCourses(strList37);
        faculty26.setCourses(strList37);
        student17.setCourses(strList37);
        org.team4.model.user.Student student42 = new org.team4.model.user.Student("hi!", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=Tue Apr 30 19:21:52 EDT 2024}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "ItemPurchased{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}', email='', datePurchased=Sat Mar 30 19:22:11 EDT 2024}", strList37);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        boolean boolean4 = creditCard3.notExpired();
        java.lang.String str5 = creditCard3.getMode();
        java.lang.String str6 = creditCard3.getMode();
        java.lang.String str7 = creditCard3.getMode();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credit Card" + "'", str6, "Credit Card");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credit Card" + "'", str7, "Credit Card");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder0.author("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder5.edition((int) ' ');
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("ItemPurchased{title='', email='', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", (double) 100);
        java.lang.String str4 = newsletter3.getLink();
        double double5 = newsletter3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}" + "'", str4, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
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
        org.team4.model.course.Course course35 = courseTextBook34.getCourse();
        java.lang.String str36 = course35.getCourseName();
        java.util.Date date37 = course35.getEndDate();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Tue Apr 30 19:22:13 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 19:22:13 EDT 2024");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Tue Apr 30 19:22:13 EDT 2024");
        org.junit.Assert.assertNotNull(courseTextBookBuilder33);
        org.junit.Assert.assertNotNull(courseTextBook34);
        org.junit.Assert.assertNotNull(course35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str36, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 19:22:13 EDT 2024");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
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
        int int13 = courseTextBook8.getYearPublished();
        org.team4.model.items.decorator.ItemDecorator itemDecorator14 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook8);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertNotNull(studentList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(studentList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("SubscribeNewsletter{title='hi!', email='User [email=, password=, name=hi!, type=hi!, validated=false]', dateSubscribed=Sat Mar 30 19:22:05 EDT 2024, dateDue=null}", "SubscribeNewsletter{title='hi!', email='Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}', dateSubscribed=Sat Mar 30 19:22:06 EDT 2024, dateDue=Tue Apr 30 19:22:06 EDT 2024}", (double) 4148924L);
        double double4 = newsletter3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4148924.0d + "'", double4 == 4148924.0d);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        org.team4.model.items.Book book5 = courseTextBookBuilder0.build();
        book5.setQuantity((int) (short) 0);
        org.team4.model.items.DVD dVD10 = new org.team4.model.items.DVD((org.team4.model.items.Item) book5, "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", (double) (-1L));
        org.team4.model.user.User user16 = new org.team4.model.user.User("", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "Credit Card", true);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase17 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) book5, user16);
        org.team4.model.items.Item item18 = itemToPurchase17.getItem();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(item18);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
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
        java.lang.String str21 = book7.toString();
        org.team4.model.items.Newsletter newsletter25 = new org.team4.model.items.Newsletter("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", (double) 52);
        java.lang.String str26 = newsletter25.getTitle();
        boolean boolean27 = book7.equals((java.lang.Object) str26);
        org.team4.model.items.DVD dVD30 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Mobile Wallet", (double) 2403102L);
        java.lang.String str31 = dVD30.getGenre();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}" + "'", str21, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Mobile Wallet" + "'", str31, "Mobile Wallet");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
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
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator15 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) rentableItemDecorator10);
        int int16 = rentableItemDecorator15.getYearPublished();
        rentableItemDecorator15.setPrice((double) 4728328L);
        org.team4.model.items.Item item19 = rentableItemDecorator15.getItem();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertNotNull(item12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(item19);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("Book{genre='hi!', noOfPages=52, author='User [email=, password=, name=hi!, type=, validated=false]', ISBN=hi!, publisher='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', edition='97'}", "SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', email='User [email=, password=hi!, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=, validated=false]', dateSubscribed=Sat Mar 30 19:22:09 EDT 2024, dateDue=Tue Apr 30 19:22:09 EDT 2024}", "Mobile Wallet", "User [email=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], password=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}, type=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}, validated=false]", false);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.team4.model.user.Student student14 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str15 = student14.getType();
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        student14.setCourses(strList18);
        org.team4.model.user.Faculty faculty21 = new org.team4.model.user.Faculty("User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}, type=hi!, validated=false]", "Debit Card", "User [email=, password=, name=hi!, type=, validated=false]", "PayPal", 100L, strList18);
        java.util.ArrayList<java.lang.String> strList22 = faculty21.getCourses();
        org.team4.model.user.Faculty faculty23 = new org.team4.model.user.Faculty("", "", "ItemPurchased{title='', email='hi!', datePurchased=null}", "SubscribeNewsletter{title='Credit Card', email='hi!', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}", 5231169L, strList22);
        org.team4.model.user.Student student28 = new org.team4.model.user.Student("User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=User [email=, password=, name=hi!, type=, validated=false], name=hi!, type=PayPal, validated=true]", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "hi!", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=Tue Apr 30 19:21:52 EDT 2024}");
        org.team4.model.user.Student student38 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str39 = student38.getType();
        java.lang.String[] strArray41 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        student38.setCourses(strList42);
        org.team4.model.user.Faculty faculty45 = new org.team4.model.user.Faculty("User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}, type=hi!, validated=false]", "Debit Card", "User [email=, password=, name=hi!, type=, validated=false]", "PayPal", 100L, strList42);
        java.util.ArrayList<java.lang.String> strList46 = faculty45.getCourses();
        student28.setCourses(strList46);
        faculty23.setCourses(strList46);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strList46);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=null}", "User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}, type=hi!, validated=false]", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=Tue Apr 30 19:21:52 EDT 2024}", "SubscribeNewsletter{title='ItemPurchased{title='', email='', datePurchased=null}', email='', dateSubscribed=Tue Apr 30 19:21:58 EDT 2024, dateDue=Tue Apr 30 19:21:58 EDT 2024}");
        java.lang.String str5 = visitor4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}, type=hi!, validated=false]" + "'", str5, "User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}, type=hi!, validated=false]");
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", 0.0d);
        java.lang.String str4 = newsletter3.getTitle();
        double double5 = newsletter3.getPrice();
        java.lang.String str6 = newsletter3.getLink();
        java.util.Date date8 = null;
        java.util.Date date9 = null;
        org.team4.model.course.Course course12 = new org.team4.model.course.Course("hi!", date8, date9, "", "hi!");
        java.util.Date date13 = course12.getEndDate();
        java.lang.String str14 = course12.getProfessorEmail();
        java.lang.String str15 = course12.getProfessorEmail();
        org.team4.model.user.Student student20 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean21 = course12.isEnrolled(student20);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase22 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) student20);
        double double23 = newsletter3.getPrice();
        java.lang.String str24 = newsletter3.getLink();
        org.team4.model.user.User user29 = new org.team4.model.user.User("SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', email='User [email=, password=hi!, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=, validated=false]', dateSubscribed=Sat Mar 30 19:22:09 EDT 2024, dateDue=Tue Apr 30 19:22:09 EDT 2024}", "User [email=, password=, name=, type=, validated=false]", "", "ItemPurchased{title='', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}', datePurchased=Sat Mar 30 19:22:07 EDT 2024}");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase30 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, user29);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str6, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str24, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
    }
}
