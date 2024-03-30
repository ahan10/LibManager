package org.team4.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = course5.isEnded(date6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.after(java.util.Date)\" because \"currentDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.team4.functionality.recommendation.PublisherRecommendationStrategy publisherRecommendationStrategy0 = new org.team4.functionality.recommendation.PublisherRecommendationStrategy();
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.team4.model.items.Item item0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.items.DVD dVD3 = new org.team4.model.items.DVD(item0, "", (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"title\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.team4.model.user.User user4 = new org.team4.model.user.User("hi!", "", "hi!", "");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase0 = null;
        org.team4.model.paymentmodes.MobileWallet mobileWallet2 = new org.team4.model.paymentmodes.MobileWallet("");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.functionality.buy.PurchaseComplete purchaseComplete3 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase0, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.team4.functionality.buy.ItemToPurchase.getUser()\" because \"itemToPurchase\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.team4.functionality.recommendation.TitleRecommendationStrategy titleRecommendationStrategy0 = new org.team4.functionality.recommendation.TitleRecommendationStrategy();
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.team4.functionality.recommendation.CompareYearRecommendationStrategy compareYearRecommendationStrategy0 = new org.team4.functionality.recommendation.CompareYearRecommendationStrategy();
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.team4.model.items.Item item0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.items.decorator.ItemDecorator itemDecorator1 = new org.team4.model.items.decorator.ItemDecorator(item0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"title\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.team4.model.items.Item item0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator1 = new org.team4.model.items.decorator.PurchasableItemDecorator(item0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"title\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.team4.utils.EmailValidator emailValidator0 = new org.team4.utils.EmailValidator();
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.team4.model.user.User user5 = new org.team4.model.user.User("", "hi!", "hi!", "hi!", false);
        user5.setType("");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 52");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("", "", "User [email=, password=, name=hi!, type=, validated=false]", "hi!");
        java.lang.String str5 = visitor4.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getEndDate();
        java.lang.String str7 = course5.getProfessorEmail();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = course5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.toString()\" because \"this.startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase2 = null;
        org.team4.functionality.buy.ProcessPayment processPayment3 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet1, itemToPurchase2);
        java.lang.Class<?> wildcardClass4 = mobileWallet1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("ItemPurchased{title='', email='', datePurchased=null}", (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 32");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.team4.functionality.recommendation.AuthorRecommendationStrategy authorRecommendationStrategy0 = new org.team4.functionality.recommendation.AuthorRecommendationStrategy();
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
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
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("ItemPurchased{title='', email='', datePurchased=null}", 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("User [email=, password=, name=hi!, type=, validated=false]", "User [email=, password=, name=hi!, type=, validated=false]", "PayPal", "PayPal", (long) (-1));
        nonFaculty5.setUniversityID((long) '#');
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("", "", "User [email=, password=, name=hi!, type=, validated=false]", "hi!");
        java.lang.String str5 = visitor4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        book7.setPrice((double) 0L);
        java.lang.String str11 = book7.getISBN();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.paymentmodes.DebitCard debitCard15 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete16 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) debitCard15);
        java.lang.Class<?> wildcardClass17 = purchaseComplete16.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.team4.functionality.recommendation.GenreRecommendationStrategy genreRecommendationStrategy0 = new org.team4.functionality.recommendation.GenreRecommendationStrategy();
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        org.team4.model.user.Student student10 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str11 = student10.getType();
        course5.enrollStudent(student10);
        java.lang.String str13 = course5.getProfessorEmail();
        java.lang.String str14 = course5.getProfessorEmail();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = course5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.toString()\" because \"this.startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemPurchased{title='', email='', datePurchased=null}", "ItemPurchased{title='', email='', datePurchased=null}", "User [email=, password=, name=hi!, type=, validated=false]", (int) (short) 0, "PayPal");
        java.lang.String str7 = bookRequest6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str7, "ItemPurchased{title='', email='', datePurchased=null}");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.email("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.author("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getEndDate();
        java.lang.String str7 = course5.getProfessorEmail();
        java.lang.String str8 = course5.getProfessorEmail();
        org.team4.model.user.Student student13 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean14 = course5.isEnrolled(student13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = course5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.toString()\" because \"this.startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("hi!", "ItemPurchased{title='', email='', datePurchased=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", (long) '4');
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("Credit Card", (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase2 = null;
        org.team4.functionality.buy.ProcessPayment processPayment3 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet1, itemToPurchase2);
        java.lang.String str4 = mobileWallet1.getMode();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PayPal" + "'", str4, "PayPal");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str3 = subscribeNewsletter2.getTitle();
        subscribeNewsletter2.setEmail("Credit Card");
        subscribeNewsletter2.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "", "User [email=, password=, name=hi!, type=, validated=false]", "hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase((double) 0L, (org.team4.model.user.User) visitor5);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "hi!", "", "", false);
        faculty5.setFacultyID((long) (byte) 1);
        java.util.ArrayList<java.lang.String> strList8 = faculty5.getCourses();
        org.junit.Assert.assertNull(strList8);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        boolean boolean1 = org.team4.utils.EmailValidator.validEmail("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        org.team4.model.user.Student student10 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str11 = student10.getType();
        course5.enrollStudent(student10);
        java.lang.String str13 = course5.getCourseName();
        java.lang.String str14 = course5.getCourseTextBookISBN();
        java.lang.String str15 = course5.getCourseName();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.team4.model.items.Newsletter newsletter0 = null;
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("Credit Card", "ItemPurchased{title='', email='', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase(newsletter0, (org.team4.model.user.User) manager5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.team4.model.items.Newsletter.getPrice()\" because \"newsletter\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "");
        visitor4.setEmail("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook8 = courseTextBookBuilder6.build();
        java.lang.String str9 = courseTextBook8.getPublisher();
        java.util.List<org.team4.model.user.Student> studentList10 = courseTextBook8.getStudentsWithCopies();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(studentList10);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.team4.model.user.User user5 = new org.team4.model.user.User("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "", "Credit Card", true);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.team4.model.user.User user4 = new org.team4.model.user.User("", "hi!", "PayPal", "");
        java.lang.String str5 = user4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PayPal" + "'", str5, "PayPal");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.team4.model.user.User user5 = new org.team4.model.user.User("", "hi!", "hi!", "hi!", false);
        user5.setType("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook8 = courseTextBookBuilder6.build();
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        org.team4.model.course.Course course14 = new org.team4.model.course.Course("hi!", date10, date11, "", "hi!");
        org.team4.model.user.Student student19 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str20 = student19.getType();
        course14.enrollStudent(student19);
        // The following exception was thrown during execution in test generation
        try {
            courseTextBook8.removeCopies(student19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.team4.model.course.Course.isEnded(java.util.Date)\" because \"this.course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder0.publisher("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = bookBuilder10.yearPublished((int) (byte) 1);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(bookItemBuilder12);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        java.lang.String str12 = mobileWallet10.getMode();
        java.lang.String str13 = mobileWallet10.getMode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PayPal" + "'", str12, "PayPal");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PayPal" + "'", str13, "PayPal");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder0.price((double) 10);
        org.team4.model.course.CourseTextBook courseTextBook11 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder13 = courseTextBookBuilder0.noOfPages(52);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(courseTextBook11);
        org.junit.Assert.assertNotNull(bookBuilder13);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.booktype("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder3.booktype("PayPal");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
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
        boolean boolean14 = purchasableItemDecorator12.isPurchasable();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.util.Date date2 = null;
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("", "hi!", date2);
        java.lang.String str4 = itemPurchased3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "Credit Card", "ItemPurchased{title='', email='hi!', datePurchased=null}", false);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "User [email=, password=, name=hi!, type=, validated=false]", "ItemPurchased{title='', email='', datePurchased=null}", "");
        long long5 = nonFaculty4.getUniversityID();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("User [email=, password=, name=hi!, type=, validated=false]", (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        org.team4.model.user.Student student10 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str11 = student10.getType();
        course5.enrollStudent(student10);
        java.lang.String str13 = course5.getCourseName();
        java.lang.String str14 = course5.getCourseTextBookISBN();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = course5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.toString()\" because \"this.startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.lang.String str6 = course5.getProfessorEmail();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = course5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.toString()\" because \"this.startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("Credit Card", "hi!", "PayPal", "", 2890906L);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "hi!", "Credit Card", "ItemPurchased{title='', email='hi!', datePurchased=null}", true);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        org.team4.model.user.Student student10 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str11 = student10.getType();
        course5.enrollStudent(student10);
        java.lang.String str13 = course5.getCourseName();
        java.lang.String str14 = course5.getCourseTextBookISBN();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter19 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str20 = subscribeNewsletter19.getEmail();
        java.util.Date date21 = subscribeNewsletter19.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter24 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str25 = subscribeNewsletter24.getEmail();
        java.util.Date date26 = subscribeNewsletter24.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter27 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date21, date26);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = course5.isStarted(date21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Tue Apr 30 19:21:42 EDT 2024");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(date26);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Tue Apr 30 19:21:42 EDT 2024");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.team4.model.items.Newsletter newsletter0 = null;
        org.team4.model.user.Manager manager6 = new org.team4.model.user.Manager("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "User [email=, password=, name=hi!, type=, validated=false]", "User [email=, password=, name=hi!, type=, validated=false]", (long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase(newsletter0, (org.team4.model.user.User) manager6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.team4.model.items.Newsletter.getPrice()\" because \"newsletter\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "User [email=, password=, name=hi!, type=, validated=false]", "hi!", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", false);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.DVD dVD10 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Credit Card", 0.0d);
        int int11 = book7.getNoOfPages();
        boolean boolean12 = book7.hasHardCopy();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.team4.model.user.User user4 = new org.team4.model.user.User("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("", date1, date2, "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = course5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.toString()\" because \"this.startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("hi!", "hi!", "hi!", "");
        nonFaculty4.setUniversityID((long) (short) 100);
        long long7 = nonFaculty4.getUniversityID();
        nonFaculty4.setUniversityID((long) (short) 100);
        nonFaculty4.setName("PayPal");
        boolean boolean12 = nonFaculty4.isValidated();
        nonFaculty4.setValidated(false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
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
        boolean boolean14 = purchasableItemDecorator12.isPurchasable();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        boolean boolean4 = creditCard3.notExpired();
        boolean boolean5 = creditCard3.correctLength();
        java.lang.String str6 = creditCard3.getMode();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credit Card" + "'", str6, "Credit Card");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str16, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertNull(strList17);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
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
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter23 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str24 = subscribeNewsletter23.getTitle();
        java.util.Date date25 = null;
        subscribeNewsletter23.setDateSubscribed(date25);
        java.util.Date date27 = subscribeNewsletter23.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter32 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str33 = subscribeNewsletter32.getEmail();
        java.util.Date date34 = subscribeNewsletter32.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter37 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str38 = subscribeNewsletter37.getEmail();
        java.util.Date date39 = subscribeNewsletter37.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter40 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date34, date39);
        org.team4.model.course.Course course43 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date27, date39, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = course5.isStarted(date27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(date27);
// flaky:         org.junit.Assert.assertEquals(date27.toString(), "Tue Apr 30 19:21:43 EDT 2024");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(date34);
// flaky:         org.junit.Assert.assertEquals(date34.toString(), "Tue Apr 30 19:21:43 EDT 2024");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Tue Apr 30 19:21:43 EDT 2024");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 10);
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder2.genre("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDBuilder6.price((double) 100L);
        org.team4.model.items.builder.DVDBuilder dVDBuilder10 = dVDBuilder6.genre("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
        org.junit.Assert.assertNotNull(dVDBuilder10);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("Credit Card", "Credit Card", "PayPal", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", true);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.DVD dVD10 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Credit Card", 0.0d);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator11 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD10);
        rentableItemDecorator11.setRentable(true);
        boolean boolean14 = rentableItemDecorator11.isRentable();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("hi!", "ItemPurchased{title='', email='', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", (long) 32);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("User [email=, password=, name=hi!, type=, validated=false]");
        boolean boolean2 = payPal1.isValid();
        boolean boolean3 = payPal1.isValid();
        boolean boolean4 = payPal1.isValid();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
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
        boolean boolean19 = creditCard14.isValid();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.team4.model.user.User user5 = new org.team4.model.user.User("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "PayPal", true);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.team4.model.user.User user4 = new org.team4.model.user.User("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "", "User [email=, password=, name=hi!, type=, validated=false]", "PayPal");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.lang.String[] strArray22 = new java.lang.String[] { "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "PayPal", "ItemPurchased{title='', email='hi!', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemPurchased{title='', email='', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        org.team4.model.user.Faculty faculty25 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "", "ItemPurchased{title='', email='', datePurchased=null}", 0L, strList23);
        org.team4.model.user.Faculty faculty26 = new org.team4.model.user.Faculty("hi!", "", "Credit Card", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", (long) '#', strList23);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
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
        item11.setPurchaseable(true);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
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
        org.team4.model.user.Faculty faculty32 = new org.team4.model.user.Faculty("hi!", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "User [email=, password=, name=hi!, type=, validated=false]", "", (long) 32, strList30);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.items.Newsletter newsletter12 = purchaseComplete11.getNewsletter();
        org.team4.model.items.Newsletter newsletter13 = purchaseComplete11.getNewsletter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter12);
        org.junit.Assert.assertNull(newsletter13);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.DVD dVD10 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Credit Card", 0.0d);
        java.lang.String str11 = dVD10.getGenre();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Credit Card" + "'", str11, "Credit Card");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "Credit Card", false);
        java.lang.String str6 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}" + "'", str6, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "User [email=, password=, name=hi!, type=, validated=false]", "hi!", "PayPal", 2890906L);
        nonFaculty5.setUniversityID((-1L));
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", 100, 32);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 32");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.title("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDBuilder2.price((double) '4');
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "PayPal", (long) (short) -1);
        long long6 = manager5.getManagerID();
        manager5.setManagerID(2031860L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("", "", "PayPal", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        java.lang.String str5 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]" + "'", str5, "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.title("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.title("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder5.title("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder9 = bookRequestBuilder7.author("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
        org.junit.Assert.assertNotNull(bookRequestBuilder9);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getEndDate();
        java.util.Date date7 = course5.getStartDate();
        java.lang.String str8 = course5.getCourseName();
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.DVD dVD10 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Credit Card", 0.0d);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator11 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD10);
        boolean boolean12 = dVD10.isPurchasable();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.team4.model.items.Item item0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.items.Book book8 = new org.team4.model.items.Book(item0, "hi!", (int) ' ', "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", (int) (short) 10, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"title\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.team4.model.user.Manager manager4 = new org.team4.model.user.Manager("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "User [email=, password=, name=hi!, type=, validated=false]");
        manager4.setPassword("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.team4.model.user.User user4 = new org.team4.model.user.User("", "hi!", "PayPal", "");
        java.lang.String str5 = user4.getPassword();
        user4.setName("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
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
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.price((double) (short) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder6 = bookItemBuilder4.title("PayPal");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookItemBuilder6);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDBuilder2.quantity(10);
        org.team4.model.items.builder.DVDBuilder dVDBuilder8 = dVDBuilder2.genre("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder10 = dVDBuilder2.yearPublished(32);
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDBuilder8);
        org.junit.Assert.assertNotNull(dVDItemBuilder10);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        int int2 = bookRequest1.getEdition();
        java.lang.String str3 = bookRequest1.getEmail();
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
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
        org.team4.model.user.Manager manager49 = new org.team4.model.user.Manager("", "", "", "hi!", false);
        manager49.setValidated(false);
        manager49.setName("hi!");
        boolean boolean54 = courseTextBook43.equals((java.lang.Object) manager49);
        manager49.setManagerID((long) (byte) 10);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Tue Apr 30 19:21:44 EDT 2024");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 19:21:44 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 19:21:44 EDT 2024");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        boolean boolean10 = book9.hasHardCopy();
        java.lang.String str11 = book9.getTitle();
        java.lang.String str12 = book9.getAuthor();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
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
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter38 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str39 = subscribeNewsletter38.getEmail();
        java.util.Date date40 = subscribeNewsletter38.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter43 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str44 = subscribeNewsletter43.getTitle();
        java.util.Date date45 = null;
        subscribeNewsletter43.setDateSubscribed(date45);
        java.util.Date date47 = subscribeNewsletter43.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter48 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "", date40, date47);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = course22.isEnded(date47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(date40);
// flaky:         org.junit.Assert.assertEquals(date40.toString(), "Tue Apr 30 19:21:44 EDT 2024");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(date47);
// flaky:         org.junit.Assert.assertEquals(date47.toString(), "Tue Apr 30 19:21:44 EDT 2024");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("User [email=, password=, name=hi!, type=, validated=false]", (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 97");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        dVD1.setQuantity((int) (short) 1);
        dVD1.setQuantity((int) ' ');
        dVD1.setRentable(true);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getEndDate();
        java.lang.String str7 = course5.getCourseName();
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("hi!", "hi!", "hi!", "");
        nonFaculty4.setUniversityID((long) (short) 100);
        long long7 = nonFaculty4.getUniversityID();
        nonFaculty4.setUniversityID((long) (short) 100);
        boolean boolean10 = nonFaculty4.isValidated();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "User [email=, password=, name=hi!, type=, validated=false]", "ItemPurchased{title='', email='', datePurchased=null}", "");
        nonFaculty4.setValidated(false);
        nonFaculty4.setUniversityID((long) '#');
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.paymentmodes.CreditCard creditCard10 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) creditCard10);
        long long12 = purchaseComplete11.getPurchaseID();
        org.team4.model.user.User user13 = purchaseComplete11.getUser();
        java.lang.String str14 = user13.getEmail();
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 4451361L + "'", long12 == 4451361L);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "");
        java.lang.String str5 = visitor4.getName();
        visitor4.setName("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str5, "ItemPurchased{title='', email='hi!', datePurchased=null}");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.DVD dVD10 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Credit Card", 0.0d);
        book7.setPurchaseable(false);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.DVD dVD10 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Credit Card", 0.0d);
        int int11 = book7.getNoOfPages();
        java.lang.String str12 = book7.getAuthor();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "", "Credit Card", "");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.course.Course course6 = new org.team4.model.course.Course("hi!", date2, date3, "", "hi!");
        java.util.Date date7 = course6.getEndDate();
        java.lang.String str8 = course6.getProfessorEmail();
        java.lang.String str9 = course6.getProfessorEmail();
        org.team4.model.user.Student student14 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean15 = course6.isEnrolled(student14);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase16 = new org.team4.functionality.buy.ItemToPurchase(100.0d, (org.team4.model.user.User) student14);
        org.team4.model.items.Newsletter newsletter17 = itemToPurchase16.getNewsletter();
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(newsletter17);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "ItemPurchased{title='', email='', datePurchased=null}");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
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
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("Debit Card", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", (long) '#');
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.paymentmodes.CreditCard creditCard10 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) creditCard10);
        java.lang.String str12 = creditCard10.getMode();
        boolean boolean13 = creditCard10.isValid();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Credit Card" + "'", str12, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder0.price((double) 10);
        org.team4.model.course.CourseTextBook courseTextBook11 = courseTextBookBuilder0.build();
        java.util.List<org.team4.model.user.Student> studentList12 = courseTextBook11.getStudentsWithCopies();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(courseTextBook11);
        org.junit.Assert.assertNotNull(studentList12);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("User [email=, password=, name=hi!, type=, validated=false]", "User [email=, password=, name=hi!, type=, validated=false]", "PayPal", "PayPal", (long) (-1));
        java.lang.String str6 = nonFaculty5.getName();
        java.lang.String str7 = nonFaculty5.getType();
        boolean boolean8 = nonFaculty5.isValidated();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PayPal" + "'", str6, "PayPal");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PayPal" + "'", str7, "PayPal");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
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
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        java.lang.String str8 = student5.toString();
        student5.setPassword("");
        student5.setName("Credit Card");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str8, "User [email=, password=, name=hi!, type=, validated=false]");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(dVD6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("User [email=, password=, name=hi!, type=, validated=false]", "User [email=, password=, name=hi!, type=, validated=false]", "PayPal", "PayPal", (long) (-1));
        long long6 = nonFaculty5.getUniversityID();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.team4.model.user.User user5 = new org.team4.model.user.User("", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "", true);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder3 = dVDBuilder0.title("hi!");
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNotNull(dVDItemBuilder3);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "User [email=, password=, name=hi!, type=, validated=false]", "Credit Card", (long) 'a');
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        org.team4.model.course.Course course10 = new org.team4.model.course.Course("hi!", date6, date7, "", "hi!");
        java.util.Date date11 = course10.getEndDate();
        java.lang.String str12 = course10.getProfessorEmail();
        java.lang.String str13 = course10.getProfessorEmail();
        org.team4.model.user.Student student18 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean19 = course10.isEnrolled(student18);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase20 = new org.team4.functionality.buy.ItemToPurchase(100.0d, (org.team4.model.user.User) student18);
        org.team4.functionality.buy.ProcessPayment processPayment21 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) debitCard3, itemToPurchase20);
        boolean boolean22 = debitCard3.notExpired();
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        org.team4.model.user.Student student10 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str11 = student10.getType();
        course5.enrollStudent(student10);
        java.lang.String str13 = course5.getProfessorEmail();
        java.util.Date date14 = course5.getEndDate();
        java.util.Date date15 = course5.getEndDate();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter20 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str21 = subscribeNewsletter20.getEmail();
        java.util.Date date22 = subscribeNewsletter20.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter25 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str26 = subscribeNewsletter25.getTitle();
        java.util.Date date27 = null;
        subscribeNewsletter25.setDateSubscribed(date27);
        java.util.Date date29 = subscribeNewsletter25.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter30 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "", date22, date29);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = course5.isStarted(date22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Tue Apr 30 19:21:46 EDT 2024");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Tue Apr 30 19:21:46 EDT 2024");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder0.booktype("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.BookRequest bookRequest6 = bookRequestBuilder0.build();
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequest6);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        java.lang.String str7 = itemToPurchase6.toString();
        java.lang.String str8 = itemToPurchase6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str7, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str8, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", 0.0d);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        org.team4.model.user.Student student10 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str11 = student10.getType();
        course5.enrollStudent(student10);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter15 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str16 = subscribeNewsletter15.getEmail();
        java.util.Date date17 = subscribeNewsletter15.getDateDue();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = course5.isEnded(date17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Tue Apr 30 19:21:46 EDT 2024");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("", "", "", "hi!", false);
        manager5.setName("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        java.lang.String str8 = manager5.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        student5.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase8 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student5);
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase8, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        java.lang.String str12 = mobileWallet10.getMode();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PayPal" + "'", str12, "PayPal");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str3 = subscribeNewsletter2.getEmail();
        java.lang.String str4 = subscribeNewsletter2.toString();
        subscribeNewsletter2.setEmail("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}" + "'", str4, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder4 = magazineItemBuilder2.ISBN("User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineItemBuilder4);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("");
        org.team4.model.user.Student student7 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str8 = student7.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase9 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student7);
        org.team4.model.items.Newsletter newsletter10 = itemToPurchase9.getNewsletter();
        org.team4.functionality.buy.ProcessPayment processPayment11 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet1, itemToPurchase9);
        java.lang.String str12 = mobileWallet1.getMode();
        boolean boolean13 = mobileWallet1.isValid();
        java.lang.String str14 = mobileWallet1.getMode();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PayPal" + "'", str12, "PayPal");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PayPal" + "'", str14, "PayPal");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("ItemPurchased{title='', email='', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.team4.model.items.Item item0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.items.Magazine magazine3 = new org.team4.model.items.Magazine(item0, "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"title\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.util.Date date2 = null;
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("", "hi!", date2);
        java.lang.String str4 = itemPurchased3.getTitle();
        java.lang.String str5 = itemPurchased3.toString();
        java.lang.String str6 = itemPurchased3.getTitle();
        java.lang.String str7 = itemPurchased3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str5, "ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str7, "ItemPurchased{title='', email='hi!', datePurchased=null}");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.ISBN("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder0.genre("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDBuilder0.price((double) (-1));
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        java.lang.String str4 = magazine3.getPublisher();
        int int5 = magazine3.getIssueNumber();
        java.lang.String str6 = magazine3.getPublisher();
        int int7 = magazine3.getIssueNumber();
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str64 = course30.toString();
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
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        boolean boolean10 = book9.hasHardCopy();
        java.lang.String str11 = book9.getTitle();
        double double12 = book9.getPrice();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
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
        manager18.setManagerID(0L);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.util.ArrayList<java.lang.String> strList5 = null;
        org.team4.model.user.Faculty faculty6 = new org.team4.model.user.Faculty("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "", "ItemPurchased{title='', email='hi!', datePurchased=null}", (long) (short) -1, strList5);
        boolean boolean7 = faculty6.isValidated();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
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
        java.lang.String str14 = courseTextBook8.getPublisher();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        java.lang.String str4 = magazine3.getPublisher();
        int int5 = magazine3.getIssueNumber();
        int int6 = magazine3.getYearPublished();
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.booktype("Credit Card");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder3.ISBN("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder9 = bookRequestBuilder7.edition((int) (short) 10);
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder11 = bookRequestBuilder7.ISBN("User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
        org.junit.Assert.assertNotNull(bookRequestBuilder9);
        org.junit.Assert.assertNotNull(bookRequestBuilder11);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "Credit Card");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("PayPal", (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("Credit Card", "PayPal", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "Credit Card");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.user.User user12 = purchaseComplete11.getUser();
        org.team4.model.items.Item item13 = purchaseComplete11.getItem();
        double double14 = purchaseComplete11.getAmount();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder5 = magazineBuilder0.ISBN("hi!");
        org.team4.model.items.Magazine magazine6 = magazineBuilder0.build();
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertNotNull(magazineItemBuilder5);
        org.junit.Assert.assertNotNull(magazine6);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("ItemPurchased{title='', email='', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "Credit Card", false);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("Credit Card", (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        int int2 = dVD1.getYearPublished();
        java.lang.String str3 = dVD1.getGenre();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDItemBuilder4.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDItemBuilder6.price((double) (byte) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder10 = dVDItemBuilder6.yearPublished((int) (byte) 10);
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
        org.junit.Assert.assertNotNull(dVDItemBuilder10);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.user.User user12 = purchaseComplete11.getUser();
        org.team4.model.items.Item item13 = purchaseComplete11.getItem();
        org.team4.model.user.User user14 = purchaseComplete11.getUser();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(user14);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "PayPal", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase((double) 0L, (org.team4.model.user.User) student5);
        java.lang.String str7 = itemToPurchase6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}" + "'", str7, "ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}", "User [email=, password=, name=hi!, type=, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}", "hi!", (int) (short) 1, "User [email=, password=, name=hi!, type=, validated=false]");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.paymentmodes.MobileWallet mobileWallet9 = new org.team4.model.paymentmodes.MobileWallet("");
        java.lang.String str10 = mobileWallet9.getMode();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet9);
        org.team4.model.items.Item item12 = purchaseComplete11.getItem();
        double double13 = purchaseComplete11.getAmount();
        double double14 = purchaseComplete11.getAmount();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PayPal" + "'", str10, "PayPal");
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        book7.setPrice((double) 0L);
        boolean boolean11 = book7.isRentable();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.quantity((int) (short) 100);
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder0.build();
        java.lang.String str10 = courseTextBook9.getAuthor();
        int int11 = courseTextBook9.getEdition();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(courseTextBook9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.util.Date date2 = null;
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("", "", date2);
        java.lang.String str4 = itemPurchased3.getTitle();
        java.util.Date date5 = itemPurchased3.getDatePurchased();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.yearPublished((int) (short) 0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineBuilder0.quantity((int) (short) 1);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder10 = magazineBuilder0.publisher("Debit Card");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
        org.junit.Assert.assertNotNull(magazineBuilder10);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("", "", "hi!", "");
        java.util.ArrayList<java.lang.String> strList5 = student4.getCourses();
        java.lang.String str6 = student4.getPassword();
        student4.setName("");
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.booktype("Credit Card");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder3.ISBN("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.BookRequest bookRequest8 = bookRequestBuilder3.build();
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
        org.junit.Assert.assertNotNull(bookRequest8);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.team4.model.user.Manager manager4 = new org.team4.model.user.Manager("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "User [email=, password=, name=hi!, type=, validated=false]");
        manager4.setManagerID(10L);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        org.team4.model.user.Student student10 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str11 = student10.getType();
        course5.enrollStudent(student10);
        java.lang.String str13 = course5.getProfessorEmail();
        java.lang.String str14 = course5.getProfessorEmail();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter17 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter17.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter17.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter24 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date25 = null;
        subscribeNewsletter24.setDateSubscribed(date25);
        java.util.Date date27 = subscribeNewsletter24.getDateDue();
        subscribeNewsletter17.setDateDue(date27);
        java.util.Date date29 = subscribeNewsletter17.getDateSubscribed();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = course5.isStarted(date29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(date27);
// flaky:         org.junit.Assert.assertEquals(date27.toString(), "Tue Apr 30 19:21:47 EDT 2024");
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Sat Mar 30 19:21:47 EDT 2024");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getEndDate();
        java.lang.String str7 = course5.getProfessorEmail();
        java.util.Date date8 = course5.getEndDate();
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        boolean boolean1 = org.team4.utils.EmailValidator.validEmail("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 10);
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder2.genre("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDBuilder6.price((double) 100L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder10 = dVDBuilder6.title("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
        org.junit.Assert.assertNotNull(dVDItemBuilder10);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.lang.String[] strArray26 = new java.lang.String[] { "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "PayPal", "ItemPurchased{title='', email='hi!', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemPurchased{title='', email='', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        org.team4.model.user.Faculty faculty29 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "", "ItemPurchased{title='', email='', datePurchased=null}", 0L, strList27);
        org.team4.model.user.Student student30 = new org.team4.model.user.Student("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "Debit Card", "hi!", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", strList27);
        org.team4.model.user.Faculty faculty31 = new org.team4.model.user.Faculty("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", "Credit Card", (long) (short) 100, strList27);
        boolean boolean32 = faculty31.isValidated();
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "Credit Card", "ItemPurchased{title='', email='hi!', datePurchased=null}", true);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder0.build();
        boolean boolean10 = courseTextBook9.hasSoftCopy();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(courseTextBook9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}", "", false);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder6 = magazineBuilder4.issueNumber(32);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineBuilder4.ISBN("");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.quantity((int) (short) 100);
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder11 = courseTextBookBuilder0.author("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}");
        org.team4.model.items.builder.BookBuilder bookBuilder13 = bookBuilder11.noOfPages(32);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(courseTextBook9);
        org.junit.Assert.assertNotNull(bookBuilder11);
        org.junit.Assert.assertNotNull(bookBuilder13);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        boolean boolean10 = book9.hasHardCopy();
        java.lang.String str11 = book9.getTitle();
        int int12 = book9.getYearPublished();
        book9.setRentable(false);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.BookBuilder bookBuilder4 = bookBuilder2.hasSoftCopy(false);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookBuilder4);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.util.ArrayList<java.lang.String> strList10 = org.team4.model.paymentmodes.PaymentModes.MODE;
        org.team4.model.user.Faculty faculty11 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "ItemPurchased{title='', email='', datePurchased=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", 2031860L, strList10);
        org.team4.model.user.Faculty faculty12 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}", "ItemPurchased{title='', email='', datePurchased=null}", "ItemPurchased{title='', email='', datePurchased=null}", 100L, strList10);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        book7.setPrice((double) 0L);
        java.lang.String str11 = book7.getPublisher();
        java.lang.String str12 = book7.getISBN();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
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
        org.team4.model.items.Item item41 = itemToPurchase39.getItem();
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
        org.junit.Assert.assertNotNull(item41);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.team4.model.user.Faculty faculty6 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "hi!", "", "", false);
        faculty6.setFacultyID((long) (byte) 1);
        org.team4.model.user.Student student13 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str14 = student13.getType();
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        student13.setCourses(strList17);
        faculty6.setCourses(strList17);
        long long21 = faculty6.getFacultyID();
        java.util.ArrayList<java.lang.String> strList22 = faculty6.getCourses();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase23 = new org.team4.functionality.buy.ItemToPurchase((double) 0.0f, (org.team4.model.user.User) faculty6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder5 = magazineBuilder0.ISBN("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder7 = magazineItemBuilder5.yearPublished(0);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertNotNull(magazineItemBuilder5);
        org.junit.Assert.assertNotNull(magazineItemBuilder7);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("", "ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}", "", "", false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
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
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter29 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str30 = subscribeNewsletter29.getTitle();
        java.util.Date date31 = null;
        subscribeNewsletter29.setDateSubscribed(date31);
        java.util.Date date33 = subscribeNewsletter29.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter38 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str39 = subscribeNewsletter38.getEmail();
        java.util.Date date40 = subscribeNewsletter38.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter43 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str44 = subscribeNewsletter43.getTitle();
        java.util.Date date45 = null;
        subscribeNewsletter43.setDateSubscribed(date45);
        java.util.Date date47 = subscribeNewsletter43.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter48 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "", date40, date47);
        subscribeNewsletter29.setDateDue(date47);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean50 = course14.isStarted(date47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookItemBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(courseTextBookBuilder26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(date33);
// flaky:         org.junit.Assert.assertEquals(date33.toString(), "Tue Apr 30 19:21:48 EDT 2024");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(date40);
// flaky:         org.junit.Assert.assertEquals(date40.toString(), "Tue Apr 30 19:21:48 EDT 2024");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(date47);
// flaky:         org.junit.Assert.assertEquals(date47.toString(), "Tue Apr 30 19:21:48 EDT 2024");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
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
        java.lang.String str41 = processPayment40.toString();
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
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
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
        boolean boolean12 = rentableItemDecorator10.isRentable();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
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
        int int13 = item12.getYearPublished();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.paymentmodes.CreditCard creditCard10 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) creditCard10);
        org.team4.model.user.User user12 = itemToPurchase6.getUser();
        boolean boolean13 = user12.isValidated();
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.team4.model.items.Newsletter newsletter0 = null;
        org.team4.model.user.Faculty faculty6 = new org.team4.model.user.Faculty("ItemPurchased{title='', email='', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", false);
        java.lang.String str7 = faculty6.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            org.team4.functionality.buy.ItemToPurchase itemToPurchase8 = new org.team4.functionality.buy.ItemToPurchase(newsletter0, (org.team4.model.user.User) faculty6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.team4.model.items.Newsletter.getPrice()\" because \"newsletter\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str7, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("Mobile Wallet", "ItemPurchased{title='', email='', datePurchased=null}", "", "User [email=hi!, password=hi!, name=hi!, type=, validated=false]", false);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder3 = dVDBuilder0.price((double) (-1));
        org.team4.model.items.builder.DVDBuilder dVDBuilder5 = dVDBuilder0.genre("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNotNull(dVDItemBuilder3);
        org.junit.Assert.assertNotNull(dVDBuilder5);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.util.Date date3 = null;
        subscribeNewsletter2.setDateDue(date3);
        subscribeNewsletter2.setTitle("Credit Card");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        int int3 = dVD1.getQuantity();
        java.lang.String str4 = dVD1.getGenre();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder0.price((double) 10);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder12 = courseTextBookBuilder0.isVirtual(true);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(courseTextBookBuilder12);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        int int2 = dVD1.getYearPublished();
        dVD1.setPurchaseable(true);
        java.lang.String str5 = dVD1.getISBN();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("Mobile Wallet", "Credit Card");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.title("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.edition((int) (byte) 1);
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
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
        faculty5.setFacultyID((long) (byte) 1);
        java.util.ArrayList<java.lang.String> strList23 = faculty5.getCourses();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        boolean boolean1 = org.team4.utils.EmailValidator.validEmail("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.DVD dVD3 = dVDBuilder0.build();
        double double4 = dVD3.getDuration();
        boolean boolean5 = dVD3.isRentable();
        dVD3.setPurchaseable(true);
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVD3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.Magazine magazine5 = magazineBuilder0.build();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder7 = magazineBuilder0.issueNumber((int) (short) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder9 = magazineBuilder7.quantity((int) (short) 10);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazine5);
        org.junit.Assert.assertNotNull(magazineBuilder7);
        org.junit.Assert.assertNotNull(magazineItemBuilder9);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        org.team4.model.user.Student student10 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str11 = student10.getType();
        course5.enrollStudent(student10);
        java.lang.String str13 = course5.getCourseName();
        org.team4.model.user.Student student14 = null;
        course5.enrollStudent(student14);
        org.team4.model.user.Student student16 = null;
        boolean boolean17 = course5.isEnrolled(student16);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter4 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str5 = subscribeNewsletter4.getEmail();
        java.util.Date date6 = subscribeNewsletter4.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter9 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str10 = subscribeNewsletter9.getEmail();
        java.util.Date date11 = subscribeNewsletter9.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter12 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date6, date11);
        subscribeNewsletter12.setTitle("ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 30 19:21:48 EDT 2024");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Apr 30 19:21:48 EDT 2024");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = bookItemBuilder8.quantity((int) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = bookItemBuilder10.quantity((int) (short) -1);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(bookItemBuilder12);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder0.price((double) 10);
        org.team4.model.course.CourseTextBook courseTextBook11 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder13 = courseTextBookBuilder0.hasHardCopy(false);
        org.team4.model.items.builder.BookBuilder bookBuilder15 = courseTextBookBuilder0.hasSoftCopy(true);
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
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder0.price((double) 10);
        org.team4.model.course.CourseTextBook courseTextBook11 = courseTextBookBuilder0.build();
        java.lang.String str12 = courseTextBook11.getAuthor();
        boolean boolean13 = courseTextBook11.hasHardCopy();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(courseTextBook11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "User [email=, password=hi!, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=, validated=false]", 0L);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.team4.model.user.UserFactory userFactory0 = new org.team4.model.user.UserFactory();
        org.team4.model.user.User user6 = userFactory0.getUser("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", false);
        org.team4.model.user.User user12 = userFactory0.getUser("ItemPurchased{title='', email='', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "Mobile Wallet", "", true);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        boolean boolean1 = org.team4.utils.EmailValidator.validEmail("Mobile Wallet");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("", (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDItemBuilder4.price(10.0d);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDItemBuilder4.price((double) (-1));
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
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
        boolean boolean35 = courseTextBook34.hasHardCopy();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Tue Apr 30 19:21:49 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 19:21:49 EDT 2024");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Tue Apr 30 19:21:49 EDT 2024");
        org.junit.Assert.assertNotNull(courseTextBookBuilder33);
        org.junit.Assert.assertNotNull(courseTextBook34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("", "Mobile Wallet", "PayPal", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", false);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
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
        org.team4.functionality.buy.ItemPurchased itemPurchased30 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", date25);
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
        java.lang.String str62 = rentedItem61.getISBN();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter65 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter65.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter65.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter72 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date73 = null;
        subscribeNewsletter72.setDateSubscribed(date73);
        java.util.Date date75 = subscribeNewsletter72.getDateDue();
        subscribeNewsletter65.setDateDue(date75);
        rentedItem61.setDueDate(date75);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter80 = new org.team4.functionality.subscriptions.SubscribeNewsletter("User [email=, password=, name=hi!, type=, validated=false]", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter83 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str84 = subscribeNewsletter83.getTitle();
        java.util.Date date85 = subscribeNewsletter83.getDateDue();
        subscribeNewsletter80.setDateSubscribed(date85);
        rentedItem61.setDueDate(date85);
        rentedItem61.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date90 = rentedItem61.getRentDate();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter93 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date94 = null;
        subscribeNewsletter93.setDateSubscribed(date94);
        java.util.Date date96 = subscribeNewsletter93.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter97 = new org.team4.functionality.subscriptions.SubscribeNewsletter("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", date90, date96);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Tue Apr 30 19:21:49 EDT 2024");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Tue Apr 30 19:21:49 EDT 2024");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Tue Apr 30 19:21:49 EDT 2024");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Tue Apr 30 19:21:49 EDT 2024");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Tue Apr 30 19:21:49 EDT 2024");
        org.junit.Assert.assertNotNull(date58);
// flaky:         org.junit.Assert.assertEquals(date58.toString(), "Tue Apr 30 19:21:49 EDT 2024");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str62, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(date75);
// flaky:         org.junit.Assert.assertEquals(date75.toString(), "Tue Apr 30 19:21:49 EDT 2024");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
        org.junit.Assert.assertNotNull(date85);
// flaky:         org.junit.Assert.assertEquals(date85.toString(), "Tue Apr 30 19:21:49 EDT 2024");
        org.junit.Assert.assertNotNull(date90);
// flaky:         org.junit.Assert.assertEquals(date90.toString(), "Tue Apr 30 19:21:49 EDT 2024");
        org.junit.Assert.assertNotNull(date96);
// flaky:         org.junit.Assert.assertEquals(date96.toString(), "Tue Apr 30 19:21:49 EDT 2024");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
        org.team4.model.user.User user22 = itemToPurchase21.getUser();
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
        org.junit.Assert.assertNull(user22);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        int int2 = dVD1.getYearPublished();
        double double3 = dVD1.getDuration();
        dVD1.setRentable(true);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder6.quantity((-1));
        org.team4.model.items.builder.BookBuilder bookBuilder12 = courseTextBookBuilder6.hasSoftCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder14 = bookBuilder12.publisher("Mobile Wallet");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(bookBuilder12);
        org.junit.Assert.assertNotNull(bookBuilder14);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
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
        double double21 = dVD1.getDuration();
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
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator11 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        book9.setPrice((double) (byte) 1);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", (long) (short) 0);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        org.team4.model.course.Course course10 = new org.team4.model.course.Course("hi!", date6, date7, "", "hi!");
        java.util.Date date11 = course10.getEndDate();
        java.lang.String str12 = course10.getProfessorEmail();
        java.lang.String str13 = course10.getProfessorEmail();
        org.team4.model.user.Student student18 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean19 = course10.isEnrolled(student18);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase20 = new org.team4.functionality.buy.ItemToPurchase(100.0d, (org.team4.model.user.User) student18);
        org.team4.functionality.buy.ProcessPayment processPayment21 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) debitCard3, itemToPurchase20);
        double double22 = itemToPurchase20.getAmount();
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "User [email=, password=, name=hi!, type=, validated=false]", false);
        nonFaculty5.setType("ItemPurchased{title='', email='', datePurchased=null}");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        boolean boolean8 = book7.hasHardCopy();
        boolean boolean9 = book7.hasSoftCopy();
        java.lang.String str10 = book7.getGenre();
        boolean boolean11 = book7.isPurchasable();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
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
        org.team4.model.items.builder.BookBuilder bookBuilder20 = courseTextBookBuilder0.noOfPages((int) ' ');
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNotNull(courseTextBookBuilder16);
        org.junit.Assert.assertNotNull(bookBuilder18);
        org.junit.Assert.assertNotNull(bookBuilder20);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.paymentmodes.CreditCard creditCard10 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) creditCard10);
        boolean boolean12 = creditCard10.notExpired();
        boolean boolean13 = creditCard10.isValid();
        boolean boolean14 = creditCard10.isValid();
        java.lang.String str15 = creditCard10.getMode();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Credit Card" + "'", str15, "Credit Card");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
        java.lang.Class<?> wildcardClass42 = book7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "User [email=hi!, password=hi!, name=hi!, type=, validated=false]", false);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("ItemPurchased{title='', email='', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", (double) 0);
        double double4 = newsletter3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        java.lang.String str2 = payPal1.getMode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Mobile Wallet" + "'", str2, "Mobile Wallet");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        boolean boolean4 = creditCard3.notExpired();
        boolean boolean5 = creditCard3.isValid();
        boolean boolean6 = creditCard3.notExpired();
        boolean boolean7 = creditCard3.correctLength();
        boolean boolean8 = creditCard3.notExpired();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
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
        org.team4.model.items.Book book29 = new org.team4.model.items.Book((org.team4.model.items.Item) dVD1, "hi!", 32, "", "ItemPurchased{title='', email='', datePurchased=null}", (int) (byte) 1, true, true);
        org.team4.model.items.Book book37 = new org.team4.model.items.Book((org.team4.model.items.Item) book29, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", 52, "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}", 52, true, true);
        org.team4.model.items.DVD dVD40 = new org.team4.model.items.DVD((org.team4.model.items.Item) book37, "ItemPurchased{title='', email='', datePurchased=null}", (double) 100);
        dVD40.setRentable(false);
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
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "Debit Card", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", (long) (short) 10);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator11 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        int int12 = rentableItemDecorator11.getQuantity();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("ItemPurchased{title='', email='hi!', datePurchased=null}", 52, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 97");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.DVD dVD10 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Credit Card", 0.0d);
        int int11 = book7.getNoOfPages();
        book7.setPrice((double) (-1L));
        java.lang.String str14 = book7.getAuthor();
        int int15 = book7.getEdition();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        org.team4.model.items.Book book5 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder7 = courseTextBookBuilder0.edition((-1));
        org.team4.model.items.builder.BookBuilder bookBuilder9 = bookBuilder7.edition((int) (short) 100);
        org.team4.model.items.builder.BookBuilder bookBuilder11 = bookBuilder9.hasSoftCopy(true);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(bookBuilder7);
        org.junit.Assert.assertNotNull(bookBuilder9);
        org.junit.Assert.assertNotNull(bookBuilder11);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.paymentmodes.MobileWallet mobileWallet9 = new org.team4.model.paymentmodes.MobileWallet("");
        java.lang.String str10 = mobileWallet9.getMode();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet9);
        double double12 = purchaseComplete11.getAmount();
        long long13 = purchaseComplete11.getPurchaseID();
        double double14 = purchaseComplete11.getAmount();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PayPal" + "'", str10, "PayPal");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1197917L + "'", long13 == 1197917L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder0.build();
        boolean boolean10 = courseTextBook9.isRentable();
        java.lang.String str11 = courseTextBook9.getGenre();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(courseTextBook9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.team4.model.user.User user4 = new org.team4.model.user.User("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}", "", "ItemPurchased{title='', email='', datePurchased=null}", "User [email=, password=, name=hi!, type=, validated=false]");
        user4.setPassword("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
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
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
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
        java.lang.String str30 = book7.getGenre();
        java.lang.String str31 = book7.getISBN();
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
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        book7.setQuantity((int) 'a');
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        student5.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase8 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student5);
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase8, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        double double12 = purchaseComplete11.getAmount();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.paymentmodes.CreditCard creditCard10 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) creditCard10);
        org.team4.model.user.Visitor visitor17 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase18 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor17);
        org.team4.model.paymentmodes.CreditCard creditCard22 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete23 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase18, (org.team4.model.paymentmodes.PaymentValidator) creditCard22);
        boolean boolean24 = creditCard22.notExpired();
        boolean boolean25 = creditCard22.isValid();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete26 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) creditCard22);
        boolean boolean27 = creditCard22.correctLength();
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 7628776L + "'", long18 == 7628776L);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "Debit Card", false);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
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
        org.team4.model.user.Student student25 = new org.team4.model.user.Student("", "", "hi!", "");
        student25.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase28 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student25);
        java.lang.String str29 = student25.getEmail();
        boolean boolean30 = course5.isEnrolled(student25);
        java.lang.String str31 = course5.getCourseName();
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("User [email=hi!, password=hi!, name=hi!, type=, validated=false]", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "PayPal", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}", 0L);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
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
        org.team4.functionality.buy.ItemPurchased itemPurchased94 = new org.team4.functionality.buy.ItemPurchased("ItemPurchased{title='', email='hi!', datePurchased=null}", "hi!");
        java.util.Date date95 = itemPurchased94.getDatePurchased();
        rentedItem59.setDueDate(date95);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Apr 30 19:21:49 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Tue Apr 30 19:21:49 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 19:21:49 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 19:21:49 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 19:21:49 EDT 2024");
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Tue Apr 30 19:21:49 EDT 2024");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str60, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(date73);
// flaky:         org.junit.Assert.assertEquals(date73.toString(), "Tue Apr 30 19:21:49 EDT 2024");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertNotNull(date82);
// flaky:         org.junit.Assert.assertEquals(date82.toString(), "Tue Apr 30 19:21:49 EDT 2024");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertNotNull(date89);
// flaky:         org.junit.Assert.assertEquals(date89.toString(), "Tue Apr 30 19:21:49 EDT 2024");
        org.junit.Assert.assertNotNull(date95);
// flaky:         org.junit.Assert.assertEquals(date95.toString(), "Sat Mar 30 19:21:49 EDT 2024");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
        double double53 = courseTextBook45.getPrice();
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
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("", "", "hi!", "");
        java.util.ArrayList<java.lang.String> strList5 = student4.getCourses();
        java.lang.String str6 = student4.getEmail();
        student4.setEmail("User [email=hi!, password=hi!, name=hi!, type=, validated=false]");
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder0.price((double) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = courseTextBookBuilder0.quantity((int) '#');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder14 = bookItemBuilder12.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(bookItemBuilder12);
        org.junit.Assert.assertNotNull(bookItemBuilder14);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder6.quantity((-1));
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = courseTextBookBuilder6.price((double) 100L);
        org.team4.model.course.CourseTextBook courseTextBook13 = courseTextBookBuilder6.build();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(bookItemBuilder12);
        org.junit.Assert.assertNotNull(courseTextBook13);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        java.lang.String str8 = student5.toString();
        student5.setPassword("");
        java.lang.String str11 = student5.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str8, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        org.team4.model.user.Student student10 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str11 = student10.getType();
        course5.enrollStudent(student10);
        java.lang.String str13 = course5.getProfessorEmail();
        java.lang.String str14 = course5.getProfessorEmail();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter19 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        java.util.Date date20 = subscribeNewsletter19.getDateSubscribed();
        org.team4.functionality.buy.ItemPurchased itemPurchased23 = new org.team4.functionality.buy.ItemPurchased("ItemPurchased{title='', email='hi!', datePurchased=null}", "hi!");
        java.util.Date date24 = itemPurchased23.getDatePurchased();
        org.team4.model.items.RentedItem rentedItem25 = new org.team4.model.items.RentedItem("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", date20, date24);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = course5.isStarted(date24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Sat Mar 30 19:21:50 EDT 2024");
        org.junit.Assert.assertNotNull(date24);
// flaky:         org.junit.Assert.assertEquals(date24.toString(), "Sat Mar 30 19:21:50 EDT 2024");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("", "", "", "hi!", false);
        manager5.setValidated(false);
        manager5.setName("hi!");
        java.lang.String str10 = manager5.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [email=, password=, name=hi!, type=hi!, validated=false]" + "'", str10, "User [email=, password=, name=hi!, type=hi!, validated=false]");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
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
        java.lang.String str75 = student73.toString();
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
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str75, "User [email=, password=, name=hi!, type=, validated=false]");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        student5.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase8 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student5);
        double double9 = itemToPurchase8.getAmount();
        java.lang.String str10 = itemToPurchase8.toString();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}" + "'", str10, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.team4.model.user.User user5 = new org.team4.model.user.User("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "Mobile Wallet", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", false);
        java.lang.String str6 = user5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Mobile Wallet" + "'", str6, "Mobile Wallet");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        java.lang.String str55 = courseTextBook45.getTitle();
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
        org.junit.Assert.assertNull(str55);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.yearPublished((int) (short) -1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineBuilder0.quantity((int) (byte) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder10 = magazineBuilder0.quantity(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder12 = magazineItemBuilder10.quantity((int) ' ');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder14 = magazineItemBuilder12.price((double) (short) 100);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
        org.junit.Assert.assertNotNull(magazineItemBuilder10);
        org.junit.Assert.assertNotNull(magazineItemBuilder12);
        org.junit.Assert.assertNotNull(magazineItemBuilder14);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.title("hi!");
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder0.duration((double) 10L);
        org.team4.model.items.builder.DVDBuilder dVDBuilder8 = dVDBuilder0.genre("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder10 = dVDBuilder0.title("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDBuilder8);
        org.junit.Assert.assertNotNull(dVDItemBuilder10);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.team4.model.user.User user4 = new org.team4.model.user.User("User [email=, password=, name=hi!, type=hi!, validated=false]", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.DVD dVD3 = dVDBuilder0.build();
        double double4 = dVD3.getDuration();
        org.team4.model.course.Course course10 = null;
        org.team4.model.course.CourseTextBook courseTextBook12 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) dVD3, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", (int) '#', "", "ItemPurchased{title='', email='', datePurchased=null}", (int) (short) -1, course10, true);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator13 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) dVD3);
        boolean boolean14 = purchasableItemDecorator13.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator15 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) purchasableItemDecorator13);
        org.team4.model.items.decorator.ItemDecorator itemDecorator16 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) rentableItemDecorator15);
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVD3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("", (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
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
        java.lang.String str23 = itemToPurchase22.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str6, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("", "hi!", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("User [email=, password=hi!, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=, validated=false]", "", "Credit Card", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", true);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}", "PayPal", "PayPal", true);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.team4.model.user.User user4 = new org.team4.model.user.User("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter9 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str10 = subscribeNewsletter9.getEmail();
        java.util.Date date11 = subscribeNewsletter9.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter14 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str15 = subscribeNewsletter14.getEmail();
        java.util.Date date16 = subscribeNewsletter14.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter17 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date11, date16);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter20 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter20.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter20.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter27 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date28 = null;
        subscribeNewsletter27.setDateSubscribed(date28);
        java.util.Date date30 = subscribeNewsletter27.getDateDue();
        subscribeNewsletter20.setDateDue(date30);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter32 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", date16, date30);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter36 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str37 = subscribeNewsletter36.getTitle();
        java.util.Date date38 = null;
        subscribeNewsletter36.setDateSubscribed(date38);
        java.util.Date date40 = subscribeNewsletter36.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter43 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter43.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter49 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str50 = subscribeNewsletter49.getTitle();
        java.util.Date date51 = null;
        subscribeNewsletter49.setDateSubscribed(date51);
        java.util.Date date53 = subscribeNewsletter49.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter58 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str59 = subscribeNewsletter58.getEmail();
        java.util.Date date60 = subscribeNewsletter58.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter63 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str64 = subscribeNewsletter63.getEmail();
        java.util.Date date65 = subscribeNewsletter63.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter66 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date60, date65);
        org.team4.model.course.Course course69 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date53, date65, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        subscribeNewsletter43.setDateSubscribed(date53);
        org.team4.model.course.Course course73 = new org.team4.model.course.Course("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", date40, date53, "Credit Card", "ItemPurchased{title='', email='', datePurchased=null}");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter74 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}", date16, date40);
        java.util.Date date75 = null;
        org.team4.model.course.Course course78 = new org.team4.model.course.Course("User [email=, password=hi!, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=, validated=false]", date16, date75, "PayPal", "Mobile Wallet");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Apr 30 19:21:50 EDT 2024");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Tue Apr 30 19:21:50 EDT 2024");
        org.junit.Assert.assertNotNull(date30);
// flaky:         org.junit.Assert.assertEquals(date30.toString(), "Tue Apr 30 19:21:50 EDT 2024");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(date40);
// flaky:         org.junit.Assert.assertEquals(date40.toString(), "Tue Apr 30 19:21:50 EDT 2024");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(date53);
// flaky:         org.junit.Assert.assertEquals(date53.toString(), "Tue Apr 30 19:21:50 EDT 2024");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(date60);
// flaky:         org.junit.Assert.assertEquals(date60.toString(), "Tue Apr 30 19:21:50 EDT 2024");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertNotNull(date65);
// flaky:         org.junit.Assert.assertEquals(date65.toString(), "Tue Apr 30 19:21:50 EDT 2024");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
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
        java.lang.String str32 = book9.getPublisher();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5033118L + "'", long25 == 5033118L);
        org.junit.Assert.assertNotNull(user26);
        org.junit.Assert.assertNull(newsletter27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.booktype("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.BookRequest bookRequest6 = bookRequestBuilder5.build();
        java.lang.String str7 = bookRequest6.getISBN();
        java.lang.String str8 = bookRequest6.getBookType();
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequest6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}" + "'", str8, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.team4.model.user.User user5 = new org.team4.model.user.User("Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "", "", "ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}", false);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("User [email=, password=, name=hi!, type=hi!, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "User [email=hi!, password=hi!, name=hi!, type=, validated=false]", true);
        java.lang.String str6 = visitor5.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [email=hi!, password=hi!, name=hi!, type=, validated=false]" + "'", str6, "User [email=hi!, password=hi!, name=hi!, type=, validated=false]");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.team4.model.items.builder.BookBuilder bookBuilder0 = new org.team4.model.items.builder.BookBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder2 = bookBuilder0.yearPublished((int) (short) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = bookBuilder0.yearPublished((int) '4');
        org.junit.Assert.assertNotNull(bookItemBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
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
        java.lang.String str75 = student73.getName();
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
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.lang.String str6 = course5.getProfessorEmail();
        java.util.Date date7 = course5.getStartDate();
        org.team4.model.user.Student student12 = new org.team4.model.user.Student("", "", "hi!", "");
        student12.setEmail("");
        boolean boolean15 = course5.isEnrolled(student12);
        java.util.Date date16 = course5.getEndDate();
        java.lang.String str17 = course5.getCourseTextBookISBN();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.email("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder0.ISBN("User [email=, password=, name=hi!, type=hi!, validated=false]");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        java.lang.String str2 = bookRequest1.getISBN();
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter4 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        java.util.Date date5 = subscribeNewsletter4.getDateSubscribed();
        org.team4.functionality.buy.ItemPurchased itemPurchased8 = new org.team4.functionality.buy.ItemPurchased("ItemPurchased{title='', email='hi!', datePurchased=null}", "hi!");
        java.util.Date date9 = itemPurchased8.getDatePurchased();
        org.team4.model.items.RentedItem rentedItem10 = new org.team4.model.items.RentedItem("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", date5, date9);
        java.lang.String str11 = rentedItem10.getISBN();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter17 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str18 = subscribeNewsletter17.getTitle();
        java.util.Date date19 = null;
        subscribeNewsletter17.setDateSubscribed(date19);
        java.util.Date date21 = subscribeNewsletter17.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter24 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter24.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter30 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str31 = subscribeNewsletter30.getTitle();
        java.util.Date date32 = null;
        subscribeNewsletter30.setDateSubscribed(date32);
        java.util.Date date34 = subscribeNewsletter30.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter39 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str40 = subscribeNewsletter39.getEmail();
        java.util.Date date41 = subscribeNewsletter39.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter44 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str45 = subscribeNewsletter44.getEmail();
        java.util.Date date46 = subscribeNewsletter44.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter47 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date41, date46);
        org.team4.model.course.Course course50 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date34, date46, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        subscribeNewsletter24.setDateSubscribed(date34);
        org.team4.model.course.Course course54 = new org.team4.model.course.Course("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", date21, date34, "Credit Card", "ItemPurchased{title='', email='', datePurchased=null}");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter58 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str59 = subscribeNewsletter58.getTitle();
        java.util.Date date60 = null;
        subscribeNewsletter58.setDateSubscribed(date60);
        java.util.Date date62 = subscribeNewsletter58.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter65 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter65.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter71 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str72 = subscribeNewsletter71.getTitle();
        java.util.Date date73 = null;
        subscribeNewsletter71.setDateSubscribed(date73);
        java.util.Date date75 = subscribeNewsletter71.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter80 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str81 = subscribeNewsletter80.getEmail();
        java.util.Date date82 = subscribeNewsletter80.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter85 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str86 = subscribeNewsletter85.getEmail();
        java.util.Date date87 = subscribeNewsletter85.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter88 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date82, date87);
        org.team4.model.course.Course course91 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date75, date87, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        subscribeNewsletter65.setDateSubscribed(date75);
        org.team4.model.course.Course course95 = new org.team4.model.course.Course("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", date62, date75, "Credit Card", "ItemPurchased{title='', email='', datePurchased=null}");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter96 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemPurchased{title='', email='', datePurchased=null}", "PayPal", date34, date75);
        rentedItem10.setRentDate(date34);
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Sat Mar 30 19:21:50 EDT 2024");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Sat Mar 30 19:21:50 EDT 2024");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}" + "'", str11, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Tue Apr 30 19:21:50 EDT 2024");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(date34);
// flaky:         org.junit.Assert.assertEquals(date34.toString(), "Tue Apr 30 19:21:50 EDT 2024");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(date41);
// flaky:         org.junit.Assert.assertEquals(date41.toString(), "Tue Apr 30 19:21:50 EDT 2024");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(date46);
// flaky:         org.junit.Assert.assertEquals(date46.toString(), "Tue Apr 30 19:21:50 EDT 2024");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(date62);
// flaky:         org.junit.Assert.assertEquals(date62.toString(), "Tue Apr 30 19:21:50 EDT 2024");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertNotNull(date75);
// flaky:         org.junit.Assert.assertEquals(date75.toString(), "Tue Apr 30 19:21:50 EDT 2024");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertNotNull(date82);
// flaky:         org.junit.Assert.assertEquals(date82.toString(), "Tue Apr 30 19:21:50 EDT 2024");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertNotNull(date87);
// flaky:         org.junit.Assert.assertEquals(date87.toString(), "Tue Apr 30 19:21:50 EDT 2024");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        boolean boolean4 = creditCard3.notExpired();
        boolean boolean5 = creditCard3.isValid();
        boolean boolean6 = creditCard3.notExpired();
        boolean boolean7 = creditCard3.correctLength();
        boolean boolean8 = creditCard3.correctLength();
        boolean boolean9 = creditCard3.correctLength();
        boolean boolean10 = creditCard3.notExpired();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
        org.team4.model.user.Student student59 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str60 = student59.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase61 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student59);
        org.team4.model.items.Newsletter newsletter62 = itemToPurchase61.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet64 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete65 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase61, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet64);
        org.team4.model.paymentmodes.DebitCard debitCard69 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete70 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase61, (org.team4.model.paymentmodes.PaymentValidator) debitCard69);
        boolean boolean71 = courseTextBook45.equals((java.lang.Object) debitCard69);
        java.lang.String str72 = courseTextBook45.getAuthor();
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
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNull(newsletter62);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str72, "User [email=, password=, name=hi!, type=, validated=false]");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder3 = dVDBuilder0.genre("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder5 = dVDBuilder0.duration((double) 2890906L);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNotNull(dVDBuilder3);
        org.junit.Assert.assertNotNull(dVDBuilder5);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder6 = magazineBuilder4.issueNumber(32);
        org.team4.model.items.Magazine magazine7 = magazineBuilder4.build();
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineBuilder6);
        org.junit.Assert.assertNotNull(magazine7);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.user.User user12 = purchaseComplete11.getUser();
        user12.setValidated(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNotNull(user12);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemPurchased{title='', email='', datePurchased=null}", "", "User [email=, password=, name=hi!, type=, validated=false]");
        java.lang.String str5 = faculty4.getPassword();
        long long6 = faculty4.getFacultyID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str5, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = bookItemBuilder8.quantity((int) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = bookItemBuilder10.quantity((int) (short) 100);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(bookItemBuilder12);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "User [email=, password=, name=hi!, type=, validated=false]", (int) (short) 10, "ItemPurchased{title='', email='', datePurchased=null}");
        java.lang.String str7 = bookRequest6.getBookType();
        java.lang.String str8 = bookRequest6.getBookType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str7, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str8, "ItemPurchased{title='', email='', datePurchased=null}");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.DVD dVD3 = dVDBuilder0.build();
        double double4 = dVD3.getDuration();
        boolean boolean5 = dVD3.isRentable();
        double double6 = dVD3.getDuration();
        boolean boolean7 = dVD3.isPurchasable();
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVD3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        java.lang.String str86 = rentedItem59.getISBN();
        rentedItem59.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date89 = rentedItem59.getDueDate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Apr 30 19:21:51 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Tue Apr 30 19:21:51 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 19:21:51 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 19:21:51 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 19:21:51 EDT 2024");
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Tue Apr 30 19:21:51 EDT 2024");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str60, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(date73);
// flaky:         org.junit.Assert.assertEquals(date73.toString(), "Tue Apr 30 19:21:51 EDT 2024");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertNotNull(date83);
// flaky:         org.junit.Assert.assertEquals(date83.toString(), "Tue Apr 30 19:21:51 EDT 2024");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str86, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(date89);
// flaky:         org.junit.Assert.assertEquals(date89.toString(), "Tue Apr 30 19:21:51 EDT 2024");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.user.User user12 = purchaseComplete11.getUser();
        org.team4.model.items.Newsletter newsletter13 = purchaseComplete11.getNewsletter();
        org.team4.model.items.Newsletter newsletter14 = purchaseComplete11.getNewsletter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNull(newsletter14);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.DVD dVD10 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Credit Card", 0.0d);
        int int11 = book7.getNoOfPages();
        book7.setPrice((double) (-1L));
        java.lang.String str14 = book7.getGenre();
        int int15 = book7.getEdition();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "User [email=, password=, name=hi!, type=, validated=false]", (int) (short) 10, "ItemPurchased{title='', email='', datePurchased=null}");
        java.lang.String str7 = bookRequest6.getBookType();
        java.lang.String str8 = bookRequest6.getEmail();
        java.lang.String str9 = bookRequest6.getAuthor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str7, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}" + "'", str8, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}" + "'", str9, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str3 = subscribeNewsletter2.getEmail();
        java.lang.String str4 = subscribeNewsletter2.getTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
        java.util.List<org.team4.model.user.Student> studentList55 = courseTextBook45.getStudentsWithCopies();
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
        org.junit.Assert.assertNotNull(studentList55);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.team4.model.user.User user5 = new org.team4.model.user.User("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", true);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("", "", "", "hi!", false);
        manager5.setName("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        manager5.setName("PayPal");
        manager5.setManagerID(5930499L);
        long long12 = manager5.getManagerID();
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5930499L + "'", long12 == 5930499L);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
        java.lang.String str36 = course35.getProfessorEmail();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Tue Apr 30 19:21:51 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 19:21:51 EDT 2024");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Tue Apr 30 19:21:51 EDT 2024");
        org.junit.Assert.assertNotNull(courseTextBookBuilder33);
        org.junit.Assert.assertNotNull(courseTextBook34);
        org.junit.Assert.assertNotNull(course35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str36, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        org.team4.model.course.Course course9 = new org.team4.model.course.Course("hi!", date5, date6, "", "hi!");
        java.util.Date date10 = course9.getEndDate();
        java.lang.String str11 = course9.getProfessorEmail();
        java.lang.String str12 = course9.getProfessorEmail();
        org.team4.model.user.Student student18 = new org.team4.model.user.Student("", "", "hi!", "");
        student18.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase21 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student18);
        java.lang.String str22 = student18.getEmail();
        course9.enrollStudent(student18);
        org.team4.model.user.Faculty faculty29 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "hi!", "", "", false);
        faculty29.setFacultyID((long) (byte) 1);
        org.team4.model.user.Student student36 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str37 = student36.getType();
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        student36.setCourses(strList40);
        faculty29.setCourses(strList40);
        student18.setCourses(strList40);
        org.team4.model.user.Student student45 = new org.team4.model.user.Student("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "", strList40);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.ISBN("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDBuilder0.quantity((int) ' ');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDItemBuilder6.yearPublished((-1));
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter6 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str7 = subscribeNewsletter6.getEmail();
        java.util.Date date8 = subscribeNewsletter6.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter11 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str12 = subscribeNewsletter11.getEmail();
        java.util.Date date13 = subscribeNewsletter11.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter14 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date8, date13);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter17 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter17.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter17.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter24 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date25 = null;
        subscribeNewsletter24.setDateSubscribed(date25);
        java.util.Date date27 = subscribeNewsletter24.getDateDue();
        subscribeNewsletter17.setDateDue(date27);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter29 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", date13, date27);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter33 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str34 = subscribeNewsletter33.getTitle();
        java.util.Date date35 = null;
        subscribeNewsletter33.setDateSubscribed(date35);
        java.util.Date date37 = subscribeNewsletter33.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter40 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter40.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter46 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str47 = subscribeNewsletter46.getTitle();
        java.util.Date date48 = null;
        subscribeNewsletter46.setDateSubscribed(date48);
        java.util.Date date50 = subscribeNewsletter46.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter55 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str56 = subscribeNewsletter55.getEmail();
        java.util.Date date57 = subscribeNewsletter55.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter60 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str61 = subscribeNewsletter60.getEmail();
        java.util.Date date62 = subscribeNewsletter60.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter63 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date57, date62);
        org.team4.model.course.Course course66 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date50, date62, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        subscribeNewsletter40.setDateSubscribed(date50);
        org.team4.model.course.Course course70 = new org.team4.model.course.Course("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", date37, date50, "Credit Card", "ItemPurchased{title='', email='', datePurchased=null}");
        subscribeNewsletter29.setDateSubscribed(date50);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Tue Apr 30 19:21:51 EDT 2024");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Tue Apr 30 19:21:51 EDT 2024");
        org.junit.Assert.assertNotNull(date27);
// flaky:         org.junit.Assert.assertEquals(date27.toString(), "Tue Apr 30 19:21:51 EDT 2024");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 19:21:51 EDT 2024");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(date50);
// flaky:         org.junit.Assert.assertEquals(date50.toString(), "Tue Apr 30 19:21:51 EDT 2024");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(date57);
// flaky:         org.junit.Assert.assertEquals(date57.toString(), "Tue Apr 30 19:21:51 EDT 2024");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNotNull(date62);
// flaky:         org.junit.Assert.assertEquals(date62.toString(), "Tue Apr 30 19:21:51 EDT 2024");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("User [email=, password=, name=hi!, type=, validated=false]");
        java.lang.String str2 = payPal1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str2, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.team4.model.user.Student student19 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str20 = student19.getType();
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        student19.setCourses(strList23);
        org.team4.model.user.Faculty faculty26 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", (long) (byte) -1, strList23);
        java.lang.String str27 = faculty26.getName();
        faculty26.setFacultyID((long) (short) 100);
        java.util.ArrayList<java.lang.String> strList30 = faculty26.getCourses();
        org.team4.model.user.Faculty faculty31 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", (long) (byte) 100, strList30);
        org.team4.model.user.Faculty faculty32 = new org.team4.model.user.Faculty("hi!", "ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}", "ItemPurchased{title='', email='', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", 0L, strList30);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str27, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.yearPublished((int) (short) 0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineItemBuilder6.price((double) (byte) 1);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.util.Date date2 = null;
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("", "", date2);
        java.util.Date date4 = itemPurchased3.getDatePurchased();
        java.util.Date date5 = itemPurchased3.getDatePurchased();
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
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
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str3 = subscribeNewsletter2.getTitle();
        java.util.Date date4 = null;
        subscribeNewsletter2.setDateSubscribed(date4);
        java.lang.String str6 = subscribeNewsletter2.getTitle();
        java.lang.String str7 = subscribeNewsletter2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.team4.model.items.builder.BookBuilder bookBuilder0 = new org.team4.model.items.builder.BookBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder2 = bookBuilder0.quantity((int) '4');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = bookBuilder0.title("Debit Card");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder6 = bookItemBuilder4.title("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}");
        org.junit.Assert.assertNotNull(bookItemBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookItemBuilder6);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.course.CourseTextBook courseTextBook3 = courseTextBookBuilder0.build();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(courseTextBook3);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        boolean boolean4 = creditCard3.notExpired();
        boolean boolean5 = creditCard3.isValid();
        boolean boolean6 = creditCard3.notExpired();
        boolean boolean7 = creditCard3.correctLength();
        boolean boolean8 = creditCard3.correctLength();
        boolean boolean9 = creditCard3.correctLength();
        boolean boolean10 = creditCard3.correctLength();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.yearPublished((int) (short) 0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineItemBuilder6.ISBN("Credit Card");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder10 = magazineItemBuilder8.quantity((int) (byte) 100);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
        org.junit.Assert.assertNotNull(magazineItemBuilder10);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
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
        java.lang.String str21 = dVD1.getGenre();
        java.lang.String str22 = dVD1.getGenre();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
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
        book7.setPurchaseable(true);
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
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.team4.model.user.Manager manager4 = new org.team4.model.user.Manager("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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
        dVD1.setQuantity((int) '4');
        dVD1.setPurchaseable(true);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        java.lang.String str7 = visitor5.getPassword();
        java.lang.String str8 = visitor5.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}", (long) 32);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("", "User [email=, password=, name=hi!, type=, validated=false]", "", "Credit Card", 1, "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        java.lang.String str7 = bookRequest6.getAuthor();
        java.lang.String str8 = bookRequest6.getEmail();
        java.lang.String str9 = bookRequest6.getAuthor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
        org.team4.model.user.Faculty faculty26 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "hi!", "", "", false);
        faculty26.setFacultyID((long) (byte) 1);
        org.team4.model.user.Student student33 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str34 = student33.getType();
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        student33.setCourses(strList37);
        faculty26.setCourses(strList37);
        student19.setCourses(strList37);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.util.Date date2 = null;
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("", "hi!", date2);
        java.lang.String str4 = itemPurchased3.getTitle();
        java.lang.String str5 = itemPurchased3.toString();
        java.lang.String str6 = itemPurchased3.toString();
        java.util.Date date7 = itemPurchased3.getDatePurchased();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str5, "ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str6, "ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        int int2 = dVD1.getYearPublished();
        dVD1.setPrice((double) 10L);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        boolean boolean19 = book9.hasSoftCopy();
        int int20 = book9.getEdition();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.ISBN("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder0.genre("");
        org.team4.model.items.builder.DVDBuilder dVDBuilder8 = dVDBuilder0.duration((double) (-1.0f));
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder10 = dVDBuilder0.price((double) 7699521L);
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDBuilder8);
        org.junit.Assert.assertNotNull(dVDItemBuilder10);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.DVD dVD3 = dVDBuilder0.build();
        double double4 = dVD3.getDuration();
        boolean boolean5 = dVD3.isRentable();
        double double6 = dVD3.getDuration();
        java.lang.String str7 = dVD3.getGenre();
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVD3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PayPal" + "'", str7, "PayPal");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
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
        java.lang.String str51 = student50.getType();
        java.lang.String str52 = student50.getType();
        // The following exception was thrown during execution in test generation
        try {
            courseTextBook9.removeCopies(student50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.team4.model.course.Course.isEnded(java.util.Date)\" because \"this.course\" is null");
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
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
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
        java.lang.String str46 = courseTextBook45.getISBN();
        java.lang.String str47 = courseTextBook45.getGenre();
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
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("Mobile Wallet", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
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
        java.util.List<org.team4.model.user.Student> studentList14 = courseTextBook8.getStudentsWithCopies();
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
        org.junit.Assert.assertNotNull(studentList14);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", 0.0d);
        org.team4.model.user.Manager manager9 = new org.team4.model.user.Manager("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", "Credit Card", false);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase10 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) manager9);
        long long11 = manager9.getManagerID();
        manager9.setManagerID((long) 52);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.util.Date date3 = subscribeNewsletter2.getDateSubscribed();
        subscribeNewsletter2.setTitle("Credit Card");
        java.lang.String str6 = subscribeNewsletter2.toString();
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Sat Mar 30 19:21:51 EDT 2024");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SubscribeNewsletter{title='Credit Card', email='hi!', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}" + "'", str6, "SubscribeNewsletter{title='Credit Card', email='hi!', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder3 = dVDBuilder0.genre("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder5 = dVDBuilder3.duration((double) 100.0f);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNotNull(dVDBuilder3);
        org.junit.Assert.assertNotNull(dVDBuilder5);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("ItemPurchased{title='', email='hi!', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "", "ItemPurchased{title='', email='', datePurchased=null}", 0, "User [email=, password=, name=hi!, type=, validated=false]");
        java.lang.String str7 = bookRequest6.getAuthor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.team4.model.user.Manager manager4 = new org.team4.model.user.Manager("Credit Card", "ItemPurchased{title='', email='', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        long long5 = manager4.getManagerID();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.team4.model.items.Item item0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.items.DVD dVD3 = new org.team4.model.items.DVD(item0, "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"title\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook8 = courseTextBookBuilder6.build();
        java.util.List<org.team4.model.user.Student> studentList9 = courseTextBook8.getStudentsWithCopies();
        int int10 = courseTextBook8.getNoOfPages();
        java.util.List<org.team4.model.user.Student> studentList11 = courseTextBook8.getStudentsWithCopies();
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
        student31.setPassword("");
        // The following exception was thrown during execution in test generation
        try {
            courseTextBook8.removeCopies(student31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.team4.model.course.Course.isEnded(java.util.Date)\" because \"this.course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertNotNull(studentList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(studentList11);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
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
        java.lang.Class<?> wildcardClass19 = courseTextBookBuilder16.getClass();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNotNull(courseTextBookBuilder16);
        org.junit.Assert.assertNotNull(bookItemBuilder18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        boolean boolean10 = book9.hasHardCopy();
        boolean boolean11 = book9.isRentable();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        org.team4.model.items.Item item11 = rentableItemDecorator10.getItem();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder12 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder14 = courseTextBookBuilder12.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder16 = courseTextBookBuilder12.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        org.team4.model.items.Book book17 = courseTextBookBuilder12.build();
        org.team4.model.items.builder.BookBuilder bookBuilder19 = courseTextBookBuilder12.edition((-1));
        boolean boolean20 = item11.equals((java.lang.Object) (-1));
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertNotNull(bookBuilder14);
        org.junit.Assert.assertNotNull(bookItemBuilder16);
        org.junit.Assert.assertNotNull(book17);
        org.junit.Assert.assertNotNull(bookBuilder19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "PayPal", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase((double) 0L, (org.team4.model.user.User) student5);
        student5.setName("ItemPurchased{title='', email='hi!', datePurchased=null}");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        boolean boolean11 = rentableItemDecorator10.isPurchasable();
        double double12 = rentableItemDecorator10.getPrice();
        double double13 = rentableItemDecorator10.getPrice();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "", "SubscribeNewsletter{title='Credit Card', email='hi!', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}", "", 2166056L);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.team4.model.user.Student student9 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str10 = student9.getType();
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        student9.setCourses(strList13);
        org.team4.model.user.Faculty faculty16 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", (long) (byte) -1, strList13);
        java.lang.String str17 = faculty16.getName();
        faculty16.setFacultyID((long) (short) 100);
        java.util.ArrayList<java.lang.String> strList20 = faculty16.getCourses();
        faculty16.setFacultyID((long) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str17, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "hi!", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.team4.model.user.Student student14 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str15 = student14.getType();
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        student14.setCourses(strList18);
        org.team4.model.user.Faculty faculty21 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", (long) (byte) -1, strList18);
        org.team4.model.user.Faculty faculty22 = new org.team4.model.user.Faculty("User [email=hi!, password=hi!, name=hi!, type=, validated=false]", "hi!", "Credit Card", "PayPal", (-1L), strList18);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.paymentmodes.CreditCard creditCard10 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) creditCard10);
        boolean boolean12 = creditCard10.notExpired();
        boolean boolean13 = creditCard10.isValid();
        java.lang.String str14 = creditCard10.getMode();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Credit Card" + "'", str14, "Credit Card");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.builder.DVDBuilder dVDBuilder4 = dVDBuilder0.duration(10.0d);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDBuilder4.quantity(52);
        org.team4.model.items.DVD dVD7 = dVDBuilder4.build();
        java.lang.String str8 = dVD7.getGenre();
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVD7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PayPal" + "'", str8, "PayPal");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        org.team4.model.items.Book book27 = courseTextBookBuilder0.build();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookItemBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(courseTextBookBuilder26);
        org.junit.Assert.assertNotNull(book27);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("Credit Card", "Credit Card", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}");
        java.util.ArrayList<java.lang.String> strList5 = faculty4.getCourses();
        long long6 = faculty4.getFacultyID();
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
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
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder57 = courseTextBookBuilder44.quantity((-1));
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Tue Apr 30 19:21:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 19:21:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 19:21:52 EDT 2024");
        org.junit.Assert.assertNotNull(bookBuilder46);
        org.junit.Assert.assertNotNull(bookItemBuilder48);
        org.junit.Assert.assertNotNull(bookBuilder50);
        org.junit.Assert.assertNotNull(bookItemBuilder52);
        org.junit.Assert.assertNotNull(bookItemBuilder54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(bookItemBuilder57);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("", "ItemPurchased{title='', email='', datePurchased=null}", "", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}", true);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
        org.team4.model.items.Newsletter newsletter25 = itemToPurchase22.getNewsletter();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertNull(newsletter25);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
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
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter52 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str53 = subscribeNewsletter52.getEmail();
        subscribeNewsletter52.setTitle("hi!");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter58 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        java.util.Date date59 = subscribeNewsletter58.getDateSubscribed();
        subscribeNewsletter52.setDateDue(date59);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter61 = new org.team4.functionality.subscriptions.SubscribeNewsletter("User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}", date49, date59);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean62 = course5.isEnded(date59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(date27);
// flaky:         org.junit.Assert.assertEquals(date27.toString(), "Tue Apr 30 19:21:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 19:21:52 EDT 2024");
        org.junit.Assert.assertNotNull(date46);
// flaky:         org.junit.Assert.assertEquals(date46.toString(), "Tue Apr 30 19:21:52 EDT 2024");
        org.junit.Assert.assertNotNull(date49);
// flaky:         org.junit.Assert.assertEquals(date49.toString(), "Tue Apr 30 19:21:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(date59);
// flaky:         org.junit.Assert.assertEquals(date59.toString(), "Sat Mar 30 19:21:52 EDT 2024");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "Mobile Wallet");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("Credit Card", "", "Debit Card", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", false);
        nonFaculty5.setUniversityID(7628776L);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.team4.model.user.Student student13 = new org.team4.model.user.Student("", "Credit Card", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", false);
        org.team4.model.user.Student student23 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str24 = student23.getType();
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        student23.setCourses(strList27);
        org.team4.model.user.Faculty faculty30 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", (long) (byte) -1, strList27);
        java.lang.String str31 = faculty30.getName();
        faculty30.setFacultyID((long) (short) 1);
        java.util.Date date35 = null;
        java.util.Date date36 = null;
        org.team4.model.course.Course course39 = new org.team4.model.course.Course("hi!", date35, date36, "", "hi!");
        java.util.Date date40 = course39.getEndDate();
        java.lang.String str41 = course39.getProfessorEmail();
        java.lang.String str42 = course39.getProfessorEmail();
        org.team4.model.user.Student student48 = new org.team4.model.user.Student("", "", "hi!", "");
        student48.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase51 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student48);
        java.lang.String str52 = student48.getEmail();
        course39.enrollStudent(student48);
        org.team4.model.user.Faculty faculty59 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "hi!", "", "", false);
        faculty59.setFacultyID((long) (byte) 1);
        org.team4.model.user.Student student66 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str67 = student66.getType();
        java.lang.String[] strArray69 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList70 = new java.util.ArrayList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        student66.setCourses(strList70);
        faculty59.setCourses(strList70);
        student48.setCourses(strList70);
        faculty30.setCourses(strList70);
        student13.setCourses(strList70);
        org.team4.model.user.Student student77 = new org.team4.model.user.Student("Credit Card", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", strList70);
        org.team4.model.user.Student student78 = new org.team4.model.user.Student("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", strList70);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str31, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertNull(date40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.DVD dVD3 = dVDBuilder0.build();
        double double4 = dVD3.getDuration();
        org.team4.model.course.Course course10 = null;
        org.team4.model.course.CourseTextBook courseTextBook12 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) dVD3, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", (int) '#', "", "ItemPurchased{title='', email='', datePurchased=null}", (int) (short) -1, course10, true);
        java.util.Date date14 = null;
        java.util.Date date15 = null;
        org.team4.model.course.Course course18 = new org.team4.model.course.Course("hi!", date14, date15, "", "hi!");
        org.team4.model.user.Student student23 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str24 = student23.getType();
        course18.enrollStudent(student23);
        java.lang.String str26 = course18.getCourseName();
        java.lang.String str27 = course18.getCourseTextBookISBN();
        org.team4.model.user.Student student32 = new org.team4.model.user.Student("", "", "PayPal", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        boolean boolean33 = course18.isEnrolled(student32);
        student32.setPassword("");
        boolean boolean36 = courseTextBook12.equals((java.lang.Object) "");
        boolean boolean37 = courseTextBook12.hasHardCopy();
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVD3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder0.price((double) 10);
        org.team4.model.course.CourseTextBook courseTextBook11 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder13 = courseTextBookBuilder0.hasHardCopy(false);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder15 = courseTextBookBuilder0.title("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(courseTextBook11);
        org.junit.Assert.assertNotNull(bookBuilder13);
        org.junit.Assert.assertNotNull(bookItemBuilder15);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.team4.model.user.Student student13 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str14 = student13.getType();
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        student13.setCourses(strList17);
        org.team4.model.user.Faculty faculty20 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", (long) (byte) -1, strList17);
        java.lang.String str21 = faculty20.getName();
        faculty20.setFacultyID((long) (short) 1);
        java.util.Date date25 = null;
        java.util.Date date26 = null;
        org.team4.model.course.Course course29 = new org.team4.model.course.Course("hi!", date25, date26, "", "hi!");
        java.util.Date date30 = course29.getEndDate();
        java.lang.String str31 = course29.getProfessorEmail();
        java.lang.String str32 = course29.getProfessorEmail();
        org.team4.model.user.Student student38 = new org.team4.model.user.Student("", "", "hi!", "");
        student38.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase41 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student38);
        java.lang.String str42 = student38.getEmail();
        course29.enrollStudent(student38);
        org.team4.model.user.Faculty faculty49 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "hi!", "", "", false);
        faculty49.setFacultyID((long) (byte) 1);
        org.team4.model.user.Student student56 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str57 = student56.getType();
        java.lang.String[] strArray59 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        student56.setCourses(strList60);
        faculty49.setCourses(strList60);
        student38.setCourses(strList60);
        faculty20.setCourses(strList60);
        org.team4.model.user.Student student66 = new org.team4.model.user.Student("Mobile Wallet", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", strList60);
        java.util.ArrayList<java.lang.String> strList67 = student66.getCourses();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str21, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertNull(date30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(strList67);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
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
        org.team4.model.items.builder.BookBuilder bookBuilder35 = courseTextBookBuilder33.author("User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}, type=hi!, validated=false]");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Tue Apr 30 19:21:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 19:21:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Tue Apr 30 19:21:52 EDT 2024");
        org.junit.Assert.assertNotNull(courseTextBookBuilder33);
        org.junit.Assert.assertNotNull(bookBuilder35);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
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
        java.lang.String str21 = dVD1.getISBN();
        java.lang.String str22 = dVD1.getGenre();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "PayPal", (long) (short) -1);
        long long6 = manager5.getManagerID();
        manager5.setManagerID(0L);
        manager5.setName("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder0.build();
        java.lang.Class<?> wildcardClass10 = courseTextBook9.getClass();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(courseTextBook9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", "Debit Card", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", true);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
        java.lang.String str64 = course30.getCourseName();
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
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        java.lang.String str21 = manager15.toString();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "User [email=, password=, name=hi!, type=hi!, validated=false]" + "'", str21, "User [email=, password=, name=hi!, type=hi!, validated=false]");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        java.lang.String str4 = magazine3.getPublisher();
        int int5 = magazine3.getIssueNumber();
        int int6 = magazine3.getIssueNumber();
        int int7 = magazine3.getIssueNumber();
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
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
        java.util.Date date20 = course5.getEndDate();
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
        org.team4.functionality.buy.ItemPurchased itemPurchased49 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", date44);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter56 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str57 = subscribeNewsletter56.getEmail();
        java.util.Date date58 = subscribeNewsletter56.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter61 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str62 = subscribeNewsletter61.getEmail();
        java.util.Date date63 = subscribeNewsletter61.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter64 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date58, date63);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter67 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter67.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter67.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter74 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date75 = null;
        subscribeNewsletter74.setDateSubscribed(date75);
        java.util.Date date77 = subscribeNewsletter74.getDateDue();
        subscribeNewsletter67.setDateDue(date77);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter79 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", date63, date77);
        org.team4.model.items.RentedItem rentedItem80 = new org.team4.model.items.RentedItem("User [email=, password=, name=hi!, type=, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date44, date77);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean81 = course5.isEnded(date44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 19:21:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Tue Apr 30 19:21:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Tue Apr 30 19:21:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(date58);
// flaky:         org.junit.Assert.assertEquals(date58.toString(), "Tue Apr 30 19:21:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertNotNull(date63);
// flaky:         org.junit.Assert.assertEquals(date63.toString(), "Tue Apr 30 19:21:52 EDT 2024");
        org.junit.Assert.assertNotNull(date77);
// flaky:         org.junit.Assert.assertEquals(date77.toString(), "Tue Apr 30 19:21:52 EDT 2024");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
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
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter68 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        java.util.Date date69 = subscribeNewsletter68.getDateSubscribed();
        org.team4.functionality.buy.ItemPurchased itemPurchased72 = new org.team4.functionality.buy.ItemPurchased("ItemPurchased{title='', email='hi!', datePurchased=null}", "hi!");
        java.util.Date date73 = itemPurchased72.getDatePurchased();
        org.team4.model.items.RentedItem rentedItem74 = new org.team4.model.items.RentedItem("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", date69, date73);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter77 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str78 = subscribeNewsletter77.getEmail();
        subscribeNewsletter77.setTitle("hi!");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter83 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        java.util.Date date84 = subscribeNewsletter83.getDateSubscribed();
        subscribeNewsletter77.setDateDue(date84);
        rentedItem74.setRentDate(date84);
        rentedItem59.setRentDate(date84);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Apr 30 19:21:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Tue Apr 30 19:21:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 19:21:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 19:21:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 19:21:52 EDT 2024");
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Tue Apr 30 19:21:52 EDT 2024");
        org.junit.Assert.assertNotNull(date69);
// flaky:         org.junit.Assert.assertEquals(date69.toString(), "Sat Mar 30 19:21:52 EDT 2024");
        org.junit.Assert.assertNotNull(date73);
// flaky:         org.junit.Assert.assertEquals(date73.toString(), "Sat Mar 30 19:21:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertNotNull(date84);
// flaky:         org.junit.Assert.assertEquals(date84.toString(), "Sat Mar 30 19:21:52 EDT 2024");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.team4.model.user.User user4 = new org.team4.model.user.User("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "Credit Card");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder6.quantity((-1));
        org.team4.model.items.builder.BookBuilder bookBuilder12 = courseTextBookBuilder6.hasHardCopy(false);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(bookBuilder12);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.paymentmodes.DebitCard debitCard15 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete16 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) debitCard15);
        boolean boolean17 = debitCard15.correctLength();
        boolean boolean18 = debitCard15.correctLength();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("hi!", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "User [email=, password=, name=hi!, type=, validated=false]", true);
        java.lang.String str6 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        boolean boolean4 = debitCard3.correctLength();
        boolean boolean5 = debitCard3.correctLength();
        boolean boolean6 = debitCard3.isValid();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (short) 100);
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder0.noOfPages((int) (byte) 0);
        org.team4.model.items.builder.BookBuilder bookBuilder12 = bookBuilder10.publisher("hi!");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(bookBuilder12);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        java.lang.String str2 = bookRequest1.getTitle();
        java.lang.String str3 = bookRequest1.getEmail();
        java.lang.String str4 = bookRequest1.getAuthor();
        java.lang.String str5 = bookRequest1.getAuthor();
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
        java.lang.String str21 = book9.getPublisher();
        org.team4.model.items.Item item22 = new org.team4.model.items.Item((org.team4.model.items.Item) book9);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("User [email=, password=hi!, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=null}", "hi!");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.DVD dVD10 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Credit Card", 0.0d);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator11 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD10);
        org.team4.model.items.Item item12 = rentableItemDecorator11.getItem();
        org.team4.model.items.Magazine magazine15 = new org.team4.model.items.Magazine((org.team4.model.items.Item) rentableItemDecorator11, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", (int) (byte) -1);
        int int16 = magazine15.getIssueNumber();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(item12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
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
        org.team4.model.items.builder.BookBuilder bookBuilder35 = courseTextBookBuilder16.author("Credit Card");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder37 = courseTextBookBuilder16.yearPublished((int) (short) 1);
        org.team4.model.items.builder.BookBuilder bookBuilder39 = courseTextBookBuilder16.genre("PayPal");
        org.team4.model.items.builder.BookBuilder bookBuilder41 = courseTextBookBuilder16.edition((int) 'a');
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
        org.junit.Assert.assertNotNull(bookBuilder35);
        org.junit.Assert.assertNotNull(bookItemBuilder37);
        org.junit.Assert.assertNotNull(bookBuilder39);
        org.junit.Assert.assertNotNull(bookBuilder41);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase2 = null;
        org.team4.functionality.buy.ProcessPayment processPayment3 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet1, itemToPurchase2);
        boolean boolean4 = mobileWallet1.isValid();
        java.lang.String str5 = mobileWallet1.getMode();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PayPal" + "'", str5, "PayPal");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("Credit Card", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}, type=hi!, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}", false);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        org.team4.model.items.builder.BookBuilder bookBuilder11 = courseTextBookBuilder6.noOfPages((int) '4');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder13 = bookBuilder11.ISBN("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNotNull(bookBuilder11);
        org.junit.Assert.assertNotNull(bookItemBuilder13);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}", "SubscribeNewsletter{title='Credit Card', email='hi!', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "Debit Card");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        org.team4.model.user.Student student10 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str11 = student10.getType();
        course5.enrollStudent(student10);
        java.lang.String str13 = course5.getProfessorEmail();
        java.lang.String str14 = course5.getProfessorEmail();
        java.util.Date date15 = course5.getStartDate();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
        java.lang.String str25 = processPayment24.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder0.email("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.edition((int) (byte) 10);
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder6.email("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.lang.String str6 = course5.getProfessorEmail();
        java.util.Date date7 = course5.getStartDate();
        org.team4.model.user.Student student12 = new org.team4.model.user.Student("", "", "hi!", "");
        student12.setEmail("");
        boolean boolean15 = course5.isEnrolled(student12);
        java.util.Date date16 = course5.getEndDate();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter20 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str21 = subscribeNewsletter20.getTitle();
        java.util.Date date22 = null;
        subscribeNewsletter20.setDateSubscribed(date22);
        java.util.Date date24 = subscribeNewsletter20.getDateDue();
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
        org.team4.model.course.Course course51 = new org.team4.model.course.Course("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", date24, date32, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal");
        org.team4.model.user.Student student57 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str58 = student57.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase59 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student57);
        student57.setType("User [email=, password=, name=hi!, type=, validated=false]");
        boolean boolean62 = course51.isEnrolled(student57);
        boolean boolean63 = course5.isEnrolled(student57);
        org.team4.functionality.buy.ItemPurchased itemPurchased66 = new org.team4.functionality.buy.ItemPurchased("ItemPurchased{title='', email='', datePurchased=null}", "ItemPurchased{title='', email='', datePurchased=null}");
        java.util.Date date67 = itemPurchased66.getDatePurchased();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean68 = course5.isEnded(date67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(date24);
// flaky:         org.junit.Assert.assertEquals(date24.toString(), "Tue Apr 30 19:21:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 19:21:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Tue Apr 30 19:21:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Tue Apr 30 19:21:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(date67);
// flaky:         org.junit.Assert.assertEquals(date67.toString(), "Sat Mar 30 19:21:52 EDT 2024");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.paymentmodes.CreditCard creditCard10 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) creditCard10);
        boolean boolean12 = creditCard10.notExpired();
        boolean boolean13 = creditCard10.isValid();
        boolean boolean14 = creditCard10.isValid();
        org.team4.model.user.Student student20 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str21 = student20.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase22 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student20);
        org.team4.model.items.Newsletter newsletter23 = itemToPurchase22.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet25 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete26 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase22, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet25);
        org.team4.model.paymentmodes.DebitCard debitCard30 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete31 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase22, (org.team4.model.paymentmodes.PaymentValidator) debitCard30);
        org.team4.model.items.Item item32 = itemToPurchase22.getItem();
        org.team4.functionality.buy.ProcessPayment processPayment33 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) creditCard10, itemToPurchase22);
        java.lang.String str34 = creditCard10.getMode();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(newsletter23);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Credit Card" + "'", str34, "Credit Card");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.DVD dVD10 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Credit Card", 0.0d);
        int int11 = book7.getNoOfPages();
        book7.setPrice((double) (-1L));
        boolean boolean14 = book7.hasSoftCopy();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
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
        long long90 = faculty16.getFacultyID();
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
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 1L + "'", long90 == 1L);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        org.team4.model.items.Book book5 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder7 = courseTextBookBuilder0.edition((-1));
        org.team4.model.items.builder.BookBuilder bookBuilder9 = bookBuilder7.edition((int) (short) 100);
        org.team4.model.items.builder.BookBuilder bookBuilder11 = bookBuilder7.hasHardCopy(false);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(bookBuilder7);
        org.junit.Assert.assertNotNull(bookBuilder9);
        org.junit.Assert.assertNotNull(bookBuilder11);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
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
        java.lang.String str28 = courseTextBook27.getPublisher();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(courseTextBook11);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Credit Card" + "'", str28, "Credit Card");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("PayPal", "ItemPurchased{title='', email='', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", "PayPal");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase((double) 1197917L, (org.team4.model.user.User) manager5);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("SubscribeNewsletter{title='Credit Card', email='hi!', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=Tue Apr 30 19:21:52 EDT 2024}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", false);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
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
        org.team4.model.items.Item item33 = rentableItemDecorator11.getItem();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(item33);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter58 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str59 = subscribeNewsletter58.getEmail();
        java.util.Date date60 = subscribeNewsletter58.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter63 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str64 = subscribeNewsletter63.getEmail();
        java.util.Date date65 = subscribeNewsletter63.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter66 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date60, date65);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter69 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter69.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter69.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter76 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date77 = null;
        subscribeNewsletter76.setDateSubscribed(date77);
        java.util.Date date79 = subscribeNewsletter76.getDateDue();
        subscribeNewsletter69.setDateDue(date79);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter81 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", date65, date79);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter84 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        java.util.Date date85 = subscribeNewsletter84.getDateSubscribed();
        java.util.Date date86 = subscribeNewsletter84.getDateDue();
        subscribeNewsletter81.setDateSubscribed(date86);
        boolean boolean88 = course48.isStarted(date86);
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
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 19:21:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Tue Apr 30 19:21:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Tue Apr 30 19:21:52 EDT 2024");
        org.junit.Assert.assertNotNull(courseTextBookBuilder51);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(date60);
// flaky:         org.junit.Assert.assertEquals(date60.toString(), "Tue Apr 30 19:21:52 EDT 2024");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertNotNull(date65);
// flaky:         org.junit.Assert.assertEquals(date65.toString(), "Tue Apr 30 19:21:52 EDT 2024");
        org.junit.Assert.assertNotNull(date79);
// flaky:         org.junit.Assert.assertEquals(date79.toString(), "Tue Apr 30 19:21:52 EDT 2024");
        org.junit.Assert.assertNotNull(date85);
// flaky:         org.junit.Assert.assertEquals(date85.toString(), "Sat Mar 30 19:21:52 EDT 2024");
        org.junit.Assert.assertNotNull(date86);
// flaky:         org.junit.Assert.assertEquals(date86.toString(), "Tue Apr 30 19:21:52 EDT 2024");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("ItemPurchased{title='', email='', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", false);
        faculty5.setFacultyID(1197917L);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("ItemPurchased{title='', email='', datePurchased=null}", 1, (int) (short) 100, (double) 10.0f, "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=Tue Apr 30 19:21:52 EDT 2024}", true, false);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.DVD dVD10 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Credit Card", 0.0d);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator11 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD10);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator12 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD10);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.lang.String str6 = course5.getProfessorEmail();
        java.util.Date date7 = course5.getStartDate();
        org.team4.model.user.Student student12 = new org.team4.model.user.Student("", "", "hi!", "");
        student12.setEmail("");
        boolean boolean15 = course5.isEnrolled(student12);
        java.util.Date date16 = course5.getEndDate();
        org.team4.model.user.Student student21 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean22 = student21.isValidated();
        boolean boolean23 = course5.isEnrolled(student21);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.DVD dVD3 = dVDBuilder0.build();
        double double4 = dVD3.getDuration();
        org.team4.model.items.Magazine magazine7 = new org.team4.model.items.Magazine((org.team4.model.items.Item) dVD3, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", (int) (short) -1);
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVD3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("User [email=, password=hi!, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=, validated=false]", "User [email=, password=, name=hi!, type=, validated=false]", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", true);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
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
        org.team4.model.course.Course course54 = courseTextBook45.getCourse();
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
        org.junit.Assert.assertNotNull(course54);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.DVD dVD3 = dVDBuilder0.build();
        double double4 = dVD3.getDuration();
        org.team4.model.course.Course course10 = null;
        org.team4.model.course.CourseTextBook courseTextBook12 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) dVD3, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", (int) '#', "", "ItemPurchased{title='', email='', datePurchased=null}", (int) (short) -1, course10, true);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator13 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) dVD3);
        org.team4.model.items.Item item14 = purchasableItemDecorator13.getItem();
        int int15 = purchasableItemDecorator13.getYearPublished();
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVD3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(item14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.paymentmodes.CreditCard creditCard10 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) creditCard10);
        long long12 = purchaseComplete11.getPurchaseID();
        double double13 = purchaseComplete11.getAmount();
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9382953L + "'", long12 == 9382953L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.quantity((int) (short) 100);
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder11 = courseTextBookBuilder0.author("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(courseTextBook9);
        org.junit.Assert.assertNotNull(bookBuilder11);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "User [email=, password=, name=hi!, type=hi!, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", false);
        long long6 = nonFaculty5.getUniversityID();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.author("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder0.title("ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str3 = subscribeNewsletter2.getEmail();
        subscribeNewsletter2.setTitle("hi!");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter8 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        java.util.Date date9 = subscribeNewsletter8.getDateSubscribed();
        subscribeNewsletter2.setDateDue(date9);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter13 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter13.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter13.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter20 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date21 = null;
        subscribeNewsletter20.setDateSubscribed(date21);
        java.util.Date date23 = subscribeNewsletter20.getDateDue();
        subscribeNewsletter13.setDateDue(date23);
        subscribeNewsletter2.setDateDue(date23);
        java.lang.String str26 = subscribeNewsletter2.getTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Sat Mar 30 19:21:53 EDT 2024");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 19:21:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.DVD dVD3 = dVDBuilder0.build();
        double double4 = dVD3.getDuration();
        org.team4.model.course.Course course10 = null;
        org.team4.model.course.CourseTextBook courseTextBook12 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) dVD3, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", (int) '#', "", "ItemPurchased{title='', email='', datePurchased=null}", (int) (short) -1, course10, true);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator13 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) dVD3);
        int int14 = dVD3.getQuantity();
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVD3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.team4.model.items.builder.BookBuilder bookBuilder0 = new org.team4.model.items.builder.BookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = bookBuilder0.noOfPages((int) 'a');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = bookBuilder2.ISBN("Credit Card");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder6 = bookItemBuilder4.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookItemBuilder6);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter19 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str20 = subscribeNewsletter19.getEmail();
        subscribeNewsletter19.setTitle("hi!");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter25 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        java.util.Date date26 = subscribeNewsletter25.getDateSubscribed();
        subscribeNewsletter19.setDateDue(date26);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = course5.isEnded(date26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(date26);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Sat Mar 30 19:21:53 EDT 2024");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.team4.model.user.Manager manager4 = new org.team4.model.user.Manager("Credit Card", "ItemPurchased{title='', email='', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        manager4.setManagerID((-1L));
        java.lang.String str7 = manager4.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}" + "'", str7, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.Magazine magazine5 = magazineBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder7 = magazineBuilder0.quantity((int) (byte) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder9 = magazineBuilder0.yearPublished((int) (byte) -1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder11 = magazineItemBuilder9.ISBN("");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazine5);
        org.junit.Assert.assertNotNull(magazineItemBuilder7);
        org.junit.Assert.assertNotNull(magazineItemBuilder9);
        org.junit.Assert.assertNotNull(magazineItemBuilder11);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter30 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str31 = subscribeNewsletter30.getTitle();
        java.util.Date date32 = null;
        subscribeNewsletter30.setDateSubscribed(date32);
        java.util.Date date34 = subscribeNewsletter30.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter38 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str39 = subscribeNewsletter38.getTitle();
        java.util.Date date40 = null;
        subscribeNewsletter38.setDateSubscribed(date40);
        java.util.Date date42 = subscribeNewsletter38.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter47 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str48 = subscribeNewsletter47.getEmail();
        java.util.Date date49 = subscribeNewsletter47.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter52 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str53 = subscribeNewsletter52.getEmail();
        java.util.Date date54 = subscribeNewsletter52.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter55 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date49, date54);
        org.team4.model.course.Course course58 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date42, date54, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.model.course.Course course61 = new org.team4.model.course.Course("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", date34, date42, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal");
        org.team4.model.user.Student student67 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str68 = student67.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase69 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student67);
        student67.setType("User [email=, password=, name=hi!, type=, validated=false]");
        boolean boolean72 = course61.isEnrolled(student67);
        java.util.Date date73 = course61.getStartDate();
        org.team4.model.course.CourseTextBook courseTextBook75 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) book9, "Mobile Wallet", 52, "SubscribeNewsletter{title='Credit Card', email='hi!', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", 0, course61, false);
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(date34);
// flaky:         org.junit.Assert.assertEquals(date34.toString(), "Tue Apr 30 19:21:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 19:21:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(date49);
// flaky:         org.junit.Assert.assertEquals(date49.toString(), "Tue Apr 30 19:21:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(date54);
// flaky:         org.junit.Assert.assertEquals(date54.toString(), "Tue Apr 30 19:21:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(date73);
// flaky:         org.junit.Assert.assertEquals(date73.toString(), "Tue Apr 30 19:21:53 EDT 2024");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.util.Date date2 = null;
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("", "", date2);
        java.lang.String str4 = itemPurchased3.toString();
        java.lang.String str5 = itemPurchased3.getTitle();
        java.lang.String str6 = itemPurchased3.toString();
        java.util.Date date7 = itemPurchased3.getDatePurchased();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str4, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str6, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.paymentmodes.MobileWallet mobileWallet9 = new org.team4.model.paymentmodes.MobileWallet("");
        java.lang.String str10 = mobileWallet9.getMode();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet9);
        org.team4.model.items.Item item12 = purchaseComplete11.getItem();
        org.team4.model.items.Newsletter newsletter13 = purchaseComplete11.getNewsletter();
        org.team4.model.user.User user14 = purchaseComplete11.getUser();
        java.lang.String str15 = user14.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PayPal" + "'", str10, "PayPal");
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str15, "User [email=, password=, name=hi!, type=, validated=false]");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=Tue Apr 30 19:21:52 EDT 2024}", "");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("PayPal", "ItemPurchased{title='', email='hi!', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", true);
        visitor5.setType("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        visitor5.setValidated(false);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "PayPal", (long) (short) -1);
        long long6 = manager5.getManagerID();
        long long7 = manager5.getManagerID();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
        java.util.ArrayList<java.lang.String> strList64 = student61.getCourses();
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
        org.junit.Assert.assertNull(strList64);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        org.team4.model.course.Course course46 = courseTextBook9.getCourse();
        boolean boolean47 = courseTextBook9.isRentable();
        courseTextBook9.setPrice((double) 9396435L);
        java.util.Date date51 = null;
        java.util.Date date52 = null;
        org.team4.model.course.Course course55 = new org.team4.model.course.Course("hi!", date51, date52, "", "hi!");
        org.team4.model.user.Student student60 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str61 = student60.getType();
        course55.enrollStudent(student60);
        java.lang.String str63 = course55.getCourseName();
        java.lang.String str64 = course55.getCourseTextBookISBN();
        org.team4.model.user.Student student69 = new org.team4.model.user.Student("", "", "PayPal", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        boolean boolean70 = course55.isEnrolled(student69);
        student69.setPassword("");
        // The following exception was thrown during execution in test generation
        try {
            courseTextBook9.makeCopies(student69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.team4.model.course.Course.isEnrolled(org.team4.model.user.Student)\" because \"this.course\" is null");
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
        org.junit.Assert.assertNull(course46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        java.lang.String str11 = book9.toString();
        book9.setPrice(0.0d);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}" + "'", str11, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", true);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", 10, 100);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.title("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.edition(0);
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder3.title("hi!");
        org.team4.model.items.BookRequest bookRequest8 = bookRequestBuilder7.build();
        java.lang.String str9 = bookRequest8.getBookType();
        java.lang.String str10 = bookRequest8.getISBN();
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
        org.junit.Assert.assertNotNull(bookRequest8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.paymentmodes.DebitCard debitCard15 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete16 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) debitCard15);
        java.lang.String str17 = debitCard15.getMode();
        boolean boolean18 = debitCard15.notExpired();
        boolean boolean19 = debitCard15.isValid();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Debit Card" + "'", str17, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", 10, 52);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 52");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.author("User [email=hi!, password=hi!, name=hi!, type=, validated=false]");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.team4.model.user.Faculty faculty14 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "hi!", "", "", false);
        faculty14.setFacultyID((long) (byte) 1);
        org.team4.model.user.Student student21 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str22 = student21.getType();
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        student21.setCourses(strList25);
        faculty14.setCourses(strList25);
        org.team4.model.user.Faculty faculty29 = new org.team4.model.user.Faculty("ItemPurchased{title='', email='', datePurchased=null}", "", "ItemPurchased{title='', email='', datePurchased=null}", "Credit Card", 7699521L, strList25);
        org.team4.model.user.Student student30 = new org.team4.model.user.Student("User [email=, password=, name=hi!, type=hi!, validated=false]", "Credit Card", "User [email=, password=hi!, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=, validated=false]", "User [email=, password=, name=hi!, type=, validated=false]", strList25);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.team4.model.user.User user5 = new org.team4.model.user.User("User [email=, password=hi!, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=, validated=false]", "ItemPurchased{title='', email='', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "User [email=hi!, password=hi!, name=hi!, type=, validated=false]", false);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder0.build();
        double double10 = courseTextBook9.getPrice();
        java.util.List<org.team4.model.user.Student> studentList11 = courseTextBook9.getStudentsWithCopies();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(courseTextBook9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(studentList11);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("ItemPurchased{title='', email='', datePurchased=null}");
        java.lang.String str2 = mobileWallet1.getMode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PayPal" + "'", str2, "PayPal");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.team4.model.user.Faculty faculty10 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "hi!", "", "", false);
        faculty10.setFacultyID((long) (byte) 1);
        org.team4.model.user.Student student17 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str18 = student17.getType();
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        student17.setCourses(strList21);
        faculty10.setCourses(strList21);
        org.team4.model.user.Faculty faculty25 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}, type=hi!, validated=false]", (long) 32, strList21);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.DVD dVD3 = dVDBuilder0.build();
        double double4 = dVD3.getDuration();
        org.team4.model.course.Course course10 = null;
        org.team4.model.course.CourseTextBook courseTextBook12 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) dVD3, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", (int) '#', "", "ItemPurchased{title='', email='', datePurchased=null}", (int) (short) -1, course10, true);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator13 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) dVD3);
        boolean boolean14 = purchasableItemDecorator13.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator15 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) purchasableItemDecorator13);
        int int16 = rentableItemDecorator15.getQuantity();
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVD3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", 0.0d);
        org.team4.model.user.Manager manager9 = new org.team4.model.user.Manager("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", "Credit Card", false);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase10 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) manager9);
        java.lang.String str11 = newsletter3.getTitle();
        java.lang.String str12 = newsletter3.getLink();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str12, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        boolean boolean22 = book9.isRentable();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.paymentmodes.CreditCard creditCard10 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) creditCard10);
        java.lang.String str12 = creditCard10.getMode();
        java.lang.String str13 = creditCard10.getMode();
        java.lang.String str14 = creditCard10.getMode();
        boolean boolean15 = creditCard10.isValid();
        boolean boolean16 = creditCard10.correctLength();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Credit Card" + "'", str12, "Credit Card");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Credit Card" + "'", str13, "Credit Card");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Credit Card" + "'", str14, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        java.lang.String str2 = bookRequest1.getTitle();
        java.lang.String str3 = bookRequest1.getEmail();
        java.lang.String str4 = bookRequest1.getTitle();
        java.lang.String str5 = bookRequest1.getAuthor();
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter4 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        java.util.Date date5 = subscribeNewsletter4.getDateSubscribed();
        org.team4.functionality.buy.ItemPurchased itemPurchased8 = new org.team4.functionality.buy.ItemPurchased("ItemPurchased{title='', email='hi!', datePurchased=null}", "hi!");
        java.util.Date date9 = itemPurchased8.getDatePurchased();
        org.team4.model.items.RentedItem rentedItem10 = new org.team4.model.items.RentedItem("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", date5, date9);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter13 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str14 = subscribeNewsletter13.getEmail();
        subscribeNewsletter13.setTitle("hi!");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter19 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        java.util.Date date20 = subscribeNewsletter19.getDateSubscribed();
        subscribeNewsletter13.setDateDue(date20);
        rentedItem10.setRentDate(date20);
        java.lang.String str23 = rentedItem10.getTitle();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Sat Mar 30 19:21:53 EDT 2024");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Sat Mar 30 19:21:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Sat Mar 30 19:21:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}" + "'", str23, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("", "Debit Card", "PayPal", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}", 7699521L);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
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
        org.team4.model.items.Item item55 = new org.team4.model.items.Item((org.team4.model.items.Item) courseTextBook45);
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
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.team4.model.user.User user4 = new org.team4.model.user.User("Debit Card", "User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}, type=hi!, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "PayPal");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
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
        org.team4.model.items.builder.BookBuilder bookBuilder38 = bookBuilder36.hasSoftCopy(false);
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
        org.junit.Assert.assertNotNull(bookBuilder38);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.booktype("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.BookRequest bookRequest6 = bookRequestBuilder5.build();
        java.lang.String str7 = bookRequest6.getISBN();
        java.lang.String str8 = bookRequest6.getTitle();
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequest6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.paymentmodes.DebitCard debitCard15 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete16 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) debitCard15);
        long long17 = purchaseComplete16.getPurchaseID();
        org.team4.model.items.Item item18 = purchaseComplete16.getItem();
        org.team4.model.user.User user19 = purchaseComplete16.getUser();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 8667796L + "'", long17 == 8667796L);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(user19);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "Credit Card", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", false);
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
        student5.setType("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
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
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.booktype("Credit Card");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder5.title("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.BookRequest bookRequest8 = bookRequestBuilder5.build();
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
        org.junit.Assert.assertNotNull(bookRequest8);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}", "PayPal", "PayPal", false);
        manager5.setName("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.paymentmodes.DebitCard debitCard15 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete16 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) debitCard15);
        org.team4.model.items.Newsletter newsletter17 = purchaseComplete16.getNewsletter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = newsletter17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter17);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder0.build();
        double double10 = courseTextBook9.getPrice();
        java.lang.String str11 = courseTextBook9.getGenre();
        int int12 = courseTextBook9.getEdition();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(courseTextBook9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder0.author("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.team4.model.items.builder.BookBuilder bookBuilder12 = courseTextBookBuilder0.hasHardCopy(false);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(bookBuilder12);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
        org.team4.model.items.builder.BookBuilder bookBuilder57 = courseTextBookBuilder44.hasSoftCopy(true);
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
        org.junit.Assert.assertNotNull(bookBuilder46);
        org.junit.Assert.assertNotNull(bookItemBuilder48);
        org.junit.Assert.assertNotNull(bookBuilder50);
        org.junit.Assert.assertNotNull(bookItemBuilder52);
        org.junit.Assert.assertNotNull(bookItemBuilder54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(bookBuilder57);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
        int int12 = rentableItemDecorator10.getYearPublished();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("ItemPurchased{title='', email='hi!', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "", "ItemPurchased{title='', email='', datePurchased=null}", 0, "User [email=, password=, name=hi!, type=, validated=false]");
        java.lang.String str7 = bookRequest6.getBookType();
        java.lang.String str8 = bookRequest6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str7, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}" + "'", str8, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        org.team4.model.items.builder.BookBuilder bookBuilder11 = courseTextBookBuilder6.noOfPages((int) '4');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder13 = courseTextBookBuilder6.price((double) (byte) -1);
        org.team4.model.items.builder.BookBuilder bookBuilder15 = courseTextBookBuilder6.genre("User [email=, password=, name=hi!, type=, validated=false]");
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
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("User [email=hi!, password=hi!, name=hi!, type=, validated=false]", (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 52");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("User [email=, password=, name=hi!, type=hi!, validated=false]", "User [email=, password=hi!, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=, validated=false]", "PayPal", "User [email=, password=, name=hi!, type=, validated=false]", 5930499L);
        long long6 = manager5.getManagerID();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5930499L + "'", long6 == 5930499L);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("Debit Card", "PayPal", "hi!", "hi!", false);
        faculty5.setName("PayPal");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter3 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str4 = subscribeNewsletter3.getTitle();
        java.util.Date date5 = null;
        subscribeNewsletter3.setDateSubscribed(date5);
        java.util.Date date7 = subscribeNewsletter3.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter11 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str12 = subscribeNewsletter11.getTitle();
        java.util.Date date13 = null;
        subscribeNewsletter11.setDateSubscribed(date13);
        java.util.Date date15 = subscribeNewsletter11.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter20 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str21 = subscribeNewsletter20.getEmail();
        java.util.Date date22 = subscribeNewsletter20.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter25 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str26 = subscribeNewsletter25.getEmail();
        java.util.Date date27 = subscribeNewsletter25.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter28 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date22, date27);
        org.team4.model.course.Course course31 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date15, date27, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.model.course.Course course34 = new org.team4.model.course.Course("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", date7, date15, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal");
        java.lang.String str35 = course34.getCourseName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Tue Apr 30 19:21:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Tue Apr 30 19:21:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Tue Apr 30 19:21:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(date27);
// flaky:         org.junit.Assert.assertEquals(date27.toString(), "Tue Apr 30 19:21:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}" + "'", str35, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter3 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str4 = subscribeNewsletter3.getTitle();
        java.util.Date date5 = null;
        subscribeNewsletter3.setDateSubscribed(date5);
        java.util.Date date7 = subscribeNewsletter3.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter11 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str12 = subscribeNewsletter11.getTitle();
        java.util.Date date13 = null;
        subscribeNewsletter11.setDateSubscribed(date13);
        java.util.Date date15 = subscribeNewsletter11.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter20 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str21 = subscribeNewsletter20.getEmail();
        java.util.Date date22 = subscribeNewsletter20.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter25 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str26 = subscribeNewsletter25.getEmail();
        java.util.Date date27 = subscribeNewsletter25.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter28 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date22, date27);
        org.team4.model.course.Course course31 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date15, date27, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.model.course.Course course34 = new org.team4.model.course.Course("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", date7, date15, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal");
        java.util.Date date35 = course34.getEndDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Tue Apr 30 19:21:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Tue Apr 30 19:21:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Tue Apr 30 19:21:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(date27);
// flaky:         org.junit.Assert.assertEquals(date27.toString(), "Tue Apr 30 19:21:54 EDT 2024");
        org.junit.Assert.assertNotNull(date35);
// flaky:         org.junit.Assert.assertEquals(date35.toString(), "Tue Apr 30 19:21:54 EDT 2024");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("", date1, date2, "", "hi!");
        java.lang.String str6 = course5.getProfessorEmail();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter10 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str11 = subscribeNewsletter10.getTitle();
        java.util.Date date12 = null;
        subscribeNewsletter10.setDateSubscribed(date12);
        java.util.Date date14 = subscribeNewsletter10.getDateDue();
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
        org.team4.model.course.Course course41 = new org.team4.model.course.Course("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", date14, date22, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = course5.isStarted(date14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Tue Apr 30 19:21:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Tue Apr 30 19:21:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Tue Apr 30 19:21:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(date34);
// flaky:         org.junit.Assert.assertEquals(date34.toString(), "Tue Apr 30 19:21:54 EDT 2024");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
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
        boolean boolean32 = book9.isRentable();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 6290755L + "'", long25 == 6290755L);
        org.junit.Assert.assertNotNull(user26);
        org.junit.Assert.assertNull(newsletter27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder0.email("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder0.ISBN("hi!");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", (double) (short) 0);
        java.lang.String str4 = newsletter3.getTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str4, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter39 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str40 = subscribeNewsletter39.getEmail();
        java.util.Date date41 = subscribeNewsletter39.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter44 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str45 = subscribeNewsletter44.getEmail();
        java.util.Date date46 = subscribeNewsletter44.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter47 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date41, date46);
        org.team4.functionality.buy.ItemPurchased itemPurchased48 = new org.team4.functionality.buy.ItemPurchased("User [email=, password=, name=hi!, type=, validated=false]", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", date46);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter49 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}", "Mobile Wallet", date32, date46);
        java.lang.String str50 = subscribeNewsletter49.getTitle();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Tue Apr 30 19:21:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Tue Apr 30 19:21:54 EDT 2024");
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Tue Apr 30 19:21:54 EDT 2024");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 19:21:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(date41);
// flaky:         org.junit.Assert.assertEquals(date41.toString(), "Tue Apr 30 19:21:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(date46);
// flaky:         org.junit.Assert.assertEquals(date46.toString(), "Tue Apr 30 19:21:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}" + "'", str50, "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder0.title("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        boolean boolean10 = book9.hasHardCopy();
        java.lang.String str11 = book9.getTitle();
        boolean boolean12 = book9.isRentable();
        java.lang.String str13 = book9.getISBN();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]");
        boolean boolean2 = mobileWallet1.isValid();
        boolean boolean3 = mobileWallet1.isValid();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.user.User user12 = purchaseComplete11.getUser();
        org.team4.model.items.Newsletter newsletter13 = purchaseComplete11.getNewsletter();
        long long14 = purchaseComplete11.getPurchaseID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNull(newsletter13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 4262496L + "'", long14 == 4262496L);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter21 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date22 = null;
        subscribeNewsletter21.setDateSubscribed(date22);
        java.util.Date date24 = subscribeNewsletter21.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter31 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str32 = subscribeNewsletter31.getEmail();
        java.util.Date date33 = subscribeNewsletter31.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter36 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str37 = subscribeNewsletter36.getEmail();
        java.util.Date date38 = subscribeNewsletter36.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter39 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date33, date38);
        org.team4.functionality.buy.ItemPurchased itemPurchased40 = new org.team4.functionality.buy.ItemPurchased("User [email=, password=, name=hi!, type=, validated=false]", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", date38);
        org.team4.model.items.RentedItem rentedItem41 = new org.team4.model.items.RentedItem("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}", "User [email=, password=, name=hi!, type=hi!, validated=false]", date24, date38);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = course5.isStarted(date24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(date24);
// flaky:         org.junit.Assert.assertEquals(date24.toString(), "Tue Apr 30 19:21:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(date33);
// flaky:         org.junit.Assert.assertEquals(date33.toString(), "Tue Apr 30 19:21:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(date38);
// flaky:         org.junit.Assert.assertEquals(date38.toString(), "Tue Apr 30 19:21:54 EDT 2024");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.DVDBuilder dVDBuilder4 = dVDBuilder0.duration((double) 4451361L);
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDBuilder4);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
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
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.util.ArrayList<java.lang.String> strList14 = org.team4.model.paymentmodes.PaymentModes.MODE;
        org.team4.model.user.Faculty faculty15 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "ItemPurchased{title='', email='', datePurchased=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", 2031860L, strList14);
        org.team4.model.user.Student student16 = new org.team4.model.user.Student("PayPal", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "User [email=, password=, name=hi!, type=, validated=false]", strList14);
        org.team4.model.user.Faculty faculty17 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='Credit Card', email='hi!', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}", "Credit Card", "User [email=, password=, name=hi!, type=, validated=false]", "hi!", 9396435L, strList14);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.team4.model.user.Student student9 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str10 = student9.getType();
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        student9.setCourses(strList13);
        org.team4.model.user.Faculty faculty16 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", (long) (byte) -1, strList13);
        java.lang.String str17 = faculty16.getName();
        boolean boolean18 = faculty16.isValidated();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str17, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder6 = courseTextBookBuilder0.quantity(0);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder10 = bookBuilder8.hasSoftCopy(false);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = bookBuilder8.quantity(100);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookItemBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(bookItemBuilder12);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("ItemToPurchase{item=null, user=User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=null}", "User [email=, password=, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:45 EDT 2024, dateDue=Tue Apr 30 19:21:45 EDT 2024}", true);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("User [email=, password=, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:52 EDT 2024, dateDue=Tue Apr 30 19:21:52 EDT 2024}", "SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:47 EDT 2024, dateDue=Tue Apr 30 19:21:47 EDT 2024}", "PayPal", true);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getEndDate();
        java.util.Date date7 = course5.getStartDate();
        java.lang.String str8 = course5.getProfessorEmail();
        java.util.Date date9 = course5.getEndDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = course5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.toString()\" because \"this.startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "User [email=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:39 EDT 2024, dateDue=Tue Apr 30 19:21:39 EDT 2024}, name=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:46 EDT 2024, dateDue=Tue Apr 30 19:21:46 EDT 2024}, type=hi!, validated=false]", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", false);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.paymentmodes.CreditCard creditCard10 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) creditCard10);
        org.team4.model.user.User user12 = itemToPurchase6.getUser();
        org.team4.model.items.Newsletter newsletter13 = itemToPurchase6.getNewsletter();
        org.team4.model.user.User user14 = itemToPurchase6.getUser();
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNull(newsletter13);
        org.junit.Assert.assertNotNull(user14);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook8 = courseTextBookBuilder6.build();
        java.lang.String str9 = courseTextBook8.getISBN();
        org.team4.model.course.Course course10 = courseTextBook8.getCourse();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(course10);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "ItemPurchased{title='', email='hi!', datePurchased=null}", "User [email=, password=, name=hi!, type=, validated=false]", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", false);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.team4.model.items.Newsletter newsletter0 = null;
        org.team4.model.user.Student student6 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str7 = student6.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase8 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student6);
        java.lang.String str9 = student6.toString();
        java.util.ArrayList<java.lang.String> strList10 = student6.getCourses();
        // The following exception was thrown during execution in test generation
        try {
            org.team4.functionality.buy.ItemToPurchase itemToPurchase11 = new org.team4.functionality.buy.ItemToPurchase(newsletter0, (org.team4.model.user.User) student6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.team4.model.items.Newsletter.getPrice()\" because \"newsletter\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str9, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertNull(strList10);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("SubscribeNewsletter{title='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', email='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 19:21:40 EDT 2024, dateDue=Tue Apr 30 19:21:40 EDT 2024}', dateSubscribed=Sat Mar 30 19:21:51 EDT 2024, dateDue=Tue Apr 30 19:21:51 EDT 2024}", (int) (byte) 1, (int) (short) 100, (double) 32, "User [email=, password=hi!, name=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, type=, validated=false]", true, true);
    }
}
