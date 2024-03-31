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
        org.team4.model.user.User user4 = new org.team4.model.user.User("hi!", "hi!", "", "");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
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
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.team4.utils.EmailValidator emailValidator0 = new org.team4.utils.EmailValidator();
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.team4.model.user.User user5 = new org.team4.model.user.User("", "hi!", "hi!", "hi!", false);
        user5.setType("");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("");
        org.team4.model.user.Student student7 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str8 = student7.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase9 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student7);
        org.team4.model.items.Newsletter newsletter10 = itemToPurchase9.getNewsletter();
        org.team4.functionality.buy.ProcessPayment processPayment11 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet1, itemToPurchase9);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete12 = processPayment11.getPurchaseCompleted();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(purchaseComplete12);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 52");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("", "", "User [email=, password=, name=hi!, type=, validated=false]", "hi!");
        java.lang.String str5 = visitor4.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
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
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.util.Date date3 = null;
        subscribeNewsletter2.setDateDue(date3);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("hi!", "hi!", "hi!", "");
        nonFaculty4.setUniversityID((-1L));
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("User [email=, password=, name=hi!, type=, validated=false]");
        boolean boolean2 = payPal1.isValid();
        java.lang.String str3 = payPal1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str3, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder0.author("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase2 = null;
        org.team4.functionality.buy.ProcessPayment processPayment3 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet1, itemToPurchase2);
        java.lang.Class<?> wildcardClass4 = mobileWallet1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.course.Course course6 = new org.team4.model.course.Course("hi!", date2, date3, "", "hi!");
        java.util.Date date7 = course6.getEndDate();
        java.lang.String str8 = course6.getProfessorEmail();
        java.lang.String str9 = course6.getProfessorEmail();
        org.team4.model.user.Student student14 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean15 = course6.isEnrolled(student14);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase16 = new org.team4.functionality.buy.ItemToPurchase(100.0d, (org.team4.model.user.User) student14);
        student14.setValidated(true);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("ItemPurchased{title='', email='', datePurchased=null}", (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 32");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.team4.functionality.recommendation.AuthorRecommendationStrategy authorRecommendationStrategy0 = new org.team4.functionality.recommendation.AuthorRecommendationStrategy();
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("User [email=, password=, name=hi!, type=, validated=false]", "User [email=, password=, name=hi!, type=, validated=false]", "PayPal", "PayPal", (long) (-1));
        nonFaculty5.setUniversityID((long) (short) 0);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
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
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("ItemPurchased{title='', email='', datePurchased=null}", 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("", "", "User [email=, password=, name=hi!, type=, validated=false]", "hi!");
        java.lang.String str5 = visitor4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
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
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
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
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.team4.functionality.recommendation.GenreRecommendationStrategy genreRecommendationStrategy0 = new org.team4.functionality.recommendation.GenreRecommendationStrategy();
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
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
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.title("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDItemBuilder4.title("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str5 = student4.getType();
        org.team4.model.user.Student student10 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str11 = student10.getType();
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        student10.setCourses(strList14);
        student4.setCourses(strList14);
        java.lang.String str18 = student4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemPurchased{title='', email='', datePurchased=null}", "ItemPurchased{title='', email='', datePurchased=null}", "User [email=, password=, name=hi!, type=, validated=false]", (int) (short) 0, "PayPal");
        java.lang.String str7 = bookRequest6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str7, "ItemPurchased{title='', email='', datePurchased=null}");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
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
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder0.price((double) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = courseTextBookBuilder0.quantity((int) '#');
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(bookItemBuilder12);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.booktype("Credit Card");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder5.title("User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.email("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder0.booktype("");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("hi!", "ItemPurchased{title='', email='', datePurchased=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", (long) '4');
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "PayPal", "PayPal", true);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("Credit Card", (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase2 = null;
        org.team4.functionality.buy.ProcessPayment processPayment3 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet1, itemToPurchase2);
        java.lang.String str4 = mobileWallet1.getMode();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PayPal" + "'", str4, "PayPal");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemPurchased{title='', email='', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str3 = subscribeNewsletter2.getTitle();
        subscribeNewsletter2.setEmail("Credit Card");
        subscribeNewsletter2.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("", "hi!", "", "");
        visitor4.setName("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        java.lang.String str7 = visitor4.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "hi!", "", "", false);
        faculty5.setFacultyID((long) (byte) 1);
        java.util.ArrayList<java.lang.String> strList8 = faculty5.getCourses();
        org.junit.Assert.assertNull(strList8);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        boolean boolean1 = org.team4.utils.EmailValidator.validEmail("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean5 = student4.isValidated();
        java.lang.String str6 = student4.getPassword();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.team4.model.items.Newsletter newsletter0 = null;
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("Credit Card", "ItemPurchased{title='', email='', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase(newsletter0, (org.team4.model.user.User) manager5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.team4.model.items.Newsletter.getPrice()\" because \"newsletter\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        int int2 = bookRequest1.getEdition();
        java.lang.String str3 = bookRequest1.getISBN();
        int int4 = bookRequest1.getEdition();
        java.lang.String str5 = bookRequest1.getISBN();
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
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
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.team4.model.user.User user5 = new org.team4.model.user.User("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "", "Credit Card", true);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.team4.model.user.User user4 = new org.team4.model.user.User("", "hi!", "PayPal", "");
        java.lang.String str5 = user4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PayPal" + "'", str5, "PayPal");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
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
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
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
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "Credit Card", "hi!", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", false);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
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
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.util.Date date2 = null;
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("", "hi!", date2);
        java.lang.String str4 = itemPurchased3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "Credit Card", "ItemPurchased{title='', email='hi!', datePurchased=null}", false);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date3 = null;
        subscribeNewsletter2.setDateSubscribed(date3);
        java.util.Date date5 = subscribeNewsletter2.getDateDue();
        java.util.Date date6 = subscribeNewsletter2.getDateSubscribed();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Tue Apr 30 20:31:50 EDT 2024");
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("User [email=, password=, name=hi!, type=, validated=false]", (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        java.lang.String str8 = itemToPurchase7.toString();
        org.team4.model.user.User user9 = itemToPurchase7.getUser();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}" + "'", str8, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(user9);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
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
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
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
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "hi!", "Credit Card", false);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder6 = magazineBuilder4.issueNumber(32);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineBuilder4.price((double) 10);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("Credit Card", "hi!", "PayPal", "", 8997383L);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "hi!", "Credit Card", "ItemPurchased{title='', email='hi!', datePurchased=null}", true);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
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
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Tue Apr 30 20:31:51 EDT 2024");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(date26);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Tue Apr 30 20:31:51 EDT 2024");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
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
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemPurchased{title='', email='', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.DVD dVD10 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Credit Card", 0.0d);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator11 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD10);
        rentableItemDecorator11.setPrice((double) (byte) 1);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
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
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
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
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.DVD dVD10 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Credit Card", 0.0d);
        java.lang.String str11 = book7.getGenre();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        boolean boolean4 = creditCard3.notExpired();
        boolean boolean5 = creditCard3.correctLength();
        java.lang.String str6 = creditCard3.getMode();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credit Card" + "'", str6, "Credit Card");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
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
// flaky:         org.junit.Assert.assertEquals(date27.toString(), "Tue Apr 30 20:31:51 EDT 2024");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(date34);
// flaky:         org.junit.Assert.assertEquals(date34.toString(), "Tue Apr 30 20:31:51 EDT 2024");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Tue Apr 30 20:31:51 EDT 2024");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "hi!", "", "", false);
        faculty5.setFacultyID((long) (byte) 1);
        long long8 = faculty5.getFacultyID();
        faculty5.setFacultyID((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
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
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "hi!", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", false);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("hi!", "ItemPurchased{title='', email='', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", (long) 32);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("User [email=, password=, name=hi!, type=, validated=false]");
        boolean boolean2 = payPal1.isValid();
        boolean boolean3 = payPal1.isValid();
        boolean boolean4 = payPal1.isValid();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("ItemPurchased{title='', email='hi!', datePurchased=null}", "", "User [email=, password=, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("", "", "hi!", "");
        java.util.ArrayList<java.lang.String> strList5 = student4.getCourses();
        java.lang.String str6 = student4.getPassword();
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.team4.model.user.User user5 = new org.team4.model.user.User("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "PayPal", true);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.team4.model.user.User user4 = new org.team4.model.user.User("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "", "User [email=, password=, name=hi!, type=, validated=false]", "PayPal");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
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
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("hi!", "hi!", "hi!", "");
        nonFaculty4.setUniversityID((long) (short) 100);
        long long7 = nonFaculty4.getUniversityID();
        nonFaculty4.setUniversityID((long) (short) 100);
        nonFaculty4.setUniversityID(3082528L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getISBN();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str5 = student4.getType();
        java.lang.String str6 = student4.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("hi!", "hi!", "hi!", "");
        long long5 = nonFaculty4.getUniversityID();
        long long6 = nonFaculty4.getUniversityID();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.email("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder0.edition(10);
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", 100, 32);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 32");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter2.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter2.setTitle("PayPal");
        subscribeNewsletter2.setEmail("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("", "", "PayPal", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        java.lang.String str5 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]" + "'", str5, "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "Credit Card", (int) '4', "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}");
        int int7 = bookRequest6.getEdition();
        java.lang.String str8 = bookRequest6.getISBN();
        java.lang.String str9 = bookRequest6.getAuthor();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card" + "'", str8, "Credit Card");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str9, "ItemPurchased{title='', email='hi!', datePurchased=null}");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("hi!", "hi!", "hi!", "");
        nonFaculty4.setUniversityID((long) (short) 100);
        long long7 = nonFaculty4.getUniversityID();
        nonFaculty4.setUniversityID((long) (short) 100);
        nonFaculty4.setName("PayPal");
        long long12 = nonFaculty4.getUniversityID();
        java.lang.String str13 = nonFaculty4.getPassword();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "Credit Card", "PayPal", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", true);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        java.lang.String str7 = visitor5.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "User [email=, password=, name=hi!, type=, validated=false]", (int) (short) 10, "ItemPurchased{title='', email='', datePurchased=null}");
        java.lang.String str7 = bookRequest6.getBookType();
        java.lang.String str8 = bookRequest6.getISBN();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str7, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str8, "User [email=, password=, name=hi!, type=, validated=false]");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.quantity((int) (short) 100);
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder0.build();
        java.lang.String str10 = courseTextBook9.getAuthor();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(courseTextBook9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.lang.String[] strArray21 = new java.lang.String[] { "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "PayPal", "ItemPurchased{title='', email='hi!', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemPurchased{title='', email='', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        org.team4.model.user.Faculty faculty24 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "", "ItemPurchased{title='', email='', datePurchased=null}", 0L, strList22);
        org.team4.model.user.Student student25 = new org.team4.model.user.Student("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "Debit Card", "hi!", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", strList22);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook8 = courseTextBookBuilder6.build();
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder6.genre("ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertNotNull(bookBuilder10);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
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
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
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
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        subscribeNewsletter2.setEmail("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        boolean boolean4 = debitCard3.correctLength();
        boolean boolean5 = debitCard3.notExpired();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("ItemPurchased{title='', email='', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", (double) 100);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
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
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Tue Apr 30 20:31:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 20:31:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 20:31:53 EDT 2024");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
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
        java.util.List<org.team4.model.user.Student> studentList54 = courseTextBook45.getStudentsWithCopies();
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
        org.junit.Assert.assertNotNull(studentList54);
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
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
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
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter48 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "", date40, date47);
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
// flaky:         org.junit.Assert.assertEquals(date40.toString(), "Tue Apr 30 20:31:53 EDT 2024");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(date47);
// flaky:         org.junit.Assert.assertEquals(date47.toString(), "Tue Apr 30 20:31:53 EDT 2024");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("User [email=, password=, name=hi!, type=, validated=false]", (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 97");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
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
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getEndDate();
        java.lang.String str7 = course5.getCourseName();
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        subscribeNewsletter2.setEmail("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.paymentmodes.CreditCard creditCard10 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) creditCard10);
        long long12 = purchaseComplete11.getPurchaseID();
        org.team4.model.user.User user13 = purchaseComplete11.getUser();
        java.lang.String str14 = user13.getEmail();
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5890207L + "'", long12 == 5890207L);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        int int2 = dVD1.getYearPublished();
        dVD1.setPurchaseable(true);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "");
        java.lang.String str5 = visitor4.getName();
        visitor4.setName("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str5, "ItemPurchased{title='', email='hi!', datePurchased=null}");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.ISBN("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDBuilder0.title("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("ItemPurchased{title='', email='', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", (-1L));
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
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
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
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
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("ItemPurchased{title='', email='', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", false);
        faculty5.setFacultyID((long) (byte) 10);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "ItemPurchased{title='', email='', datePurchased=null}");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("Debit Card", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.course.Course course6 = new org.team4.model.course.Course("hi!", date2, date3, "", "hi!");
        java.util.Date date7 = course6.getEndDate();
        java.lang.String str8 = course6.getProfessorEmail();
        java.lang.String str9 = course6.getProfessorEmail();
        org.team4.model.user.Student student14 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean15 = course6.isEnrolled(student14);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase16 = new org.team4.functionality.buy.ItemToPurchase(100.0d, (org.team4.model.user.User) student14);
        double double17 = itemToPurchase16.getAmount();
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.lang.String str6 = course5.getProfessorEmail();
        java.util.Date date7 = course5.getStartDate();
        org.team4.model.user.Student student12 = new org.team4.model.user.Student("", "", "hi!", "");
        student12.setEmail("");
        boolean boolean15 = course5.isEnrolled(student12);
        java.util.Date date16 = course5.getEndDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("User [email=, password=, name=hi!, type=, validated=false]", "Credit Card", "Debit Card", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", true);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", (double) '#');
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.team4.model.user.User user5 = new org.team4.model.user.User("", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "", true);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("", "", "", "", 0L);
        java.lang.String str6 = manager5.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        java.lang.String str4 = magazine3.getPublisher();
        int int5 = magazine3.getIssueNumber();
        int int6 = magazine3.getIssueNumber();
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder3 = dVDBuilder0.title("hi!");
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNotNull(dVDItemBuilder3);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
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
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter30 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "", date22, date29);
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
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Tue Apr 30 20:31:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Tue Apr 30 20:31:54 EDT 2024");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.DVD dVD10 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Credit Card", 0.0d);
        boolean boolean11 = book7.hasSoftCopy();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
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
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Tue Apr 30 20:31:54 EDT 2024");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("", "", "", "hi!", false);
        manager5.setName("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        java.lang.String str8 = manager5.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "PayPal", (long) (short) -1);
        long long6 = manager5.getManagerID();
        java.lang.String str7 = manager5.getPassword();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
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
        java.util.Date date35 = null;
        java.util.Date date36 = null;
        org.team4.model.course.Course course39 = new org.team4.model.course.Course("hi!", date35, date36, "", "hi!");
        org.team4.model.user.Student student44 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str45 = student44.getType();
        course39.enrollStudent(student44);
        java.lang.String str47 = course39.getCourseName();
        java.lang.String str48 = course39.getCourseTextBookISBN();
        org.team4.model.user.Student student53 = new org.team4.model.user.Student("", "", "PayPal", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        boolean boolean54 = course39.isEnrolled(student53);
        course32.enrollStudent(student53);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Tue Apr 30 20:31:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 20:31:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Tue Apr 30 20:31:54 EDT 2024");
        org.junit.Assert.assertNotNull(courseTextBookBuilder33);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.ISBN("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder0.genre("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDBuilder6.quantity((int) (byte) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder10 = dVDItemBuilder8.quantity(0);
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
        org.junit.Assert.assertNotNull(dVDItemBuilder10);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "Credit Card", (int) '4', "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}");
        int int7 = bookRequest6.getEdition();
        int int8 = bookRequest6.getEdition();
        java.lang.String str9 = bookRequest6.getBookType();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}" + "'", str9, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.lang.String str6 = course5.getProfessorEmail();
        java.util.Date date7 = course5.getStartDate();
        org.team4.model.user.Student student12 = new org.team4.model.user.Student("", "", "hi!", "");
        student12.setEmail("");
        boolean boolean15 = course5.isEnrolled(student12);
        java.lang.String str16 = course5.getCourseTextBookISBN();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "Credit Card", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "hi!", false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.team4.model.items.Item item0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.items.Magazine magazine3 = new org.team4.model.items.Magazine(item0, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"title\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
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
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
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
        boolean boolean27 = creditCard10.correctLength();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Credit Card" + "'", str12, "Credit Card");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(newsletter21);
        org.junit.Assert.assertNotNull(user25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
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
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
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
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        org.team4.model.items.Item item11 = rentableItemDecorator10.getItem();
        int int12 = item11.getQuantity();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        boolean boolean2 = payPal1.isValid();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        boolean boolean4 = debitCard3.notExpired();
        boolean boolean5 = debitCard3.correctLength();
        boolean boolean6 = debitCard3.correctLength();
        java.lang.String str7 = debitCard3.getMode();
        java.lang.String str8 = debitCard3.getMode();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Debit Card" + "'", str7, "Debit Card");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Debit Card" + "'", str8, "Debit Card");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("User [email=, password=, name=hi!, type=, validated=false]", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        java.lang.String str3 = subscribeNewsletter2.getTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str3, "User [email=, password=, name=hi!, type=, validated=false]");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.team4.model.user.Manager manager4 = new org.team4.model.user.Manager("Credit Card", "ItemPurchased{title='', email='', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}");
        manager4.setManagerID((-1L));
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "hi!", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "Debit Card");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("");
        org.team4.model.user.Student student7 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str8 = student7.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase9 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student7);
        org.team4.model.items.Newsletter newsletter10 = itemToPurchase9.getNewsletter();
        org.team4.functionality.buy.ProcessPayment processPayment11 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet1, itemToPurchase9);
        java.lang.String str12 = processPayment11.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(newsletter10);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDItemBuilder4.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDItemBuilder6.quantity((int) (short) 10);
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("", "Mobile Wallet", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", false);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.team4.model.user.UserFactory userFactory0 = new org.team4.model.user.UserFactory();
        org.team4.model.user.User user6 = userFactory0.getUser("User [email=, password=, name=hi!, type=, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", false);
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("Credit Card", (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDItemBuilder4.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDItemBuilder6.price((double) (byte) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder10 = dVDItemBuilder6.yearPublished((int) (byte) 10);
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
        org.junit.Assert.assertNotNull(dVDItemBuilder10);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder6.quantity((-1));
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = courseTextBookBuilder6.price((double) 100L);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder14 = courseTextBookBuilder6.isVirtual(false);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(bookItemBuilder12);
        org.junit.Assert.assertNotNull(courseTextBookBuilder14);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder6 = courseTextBookBuilder0.quantity(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = bookItemBuilder6.title("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = bookItemBuilder8.title("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookItemBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.paymentmodes.CreditCard creditCard10 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) creditCard10);
        java.lang.String str12 = creditCard10.getMode();
        java.lang.String str13 = creditCard10.getMode();
        boolean boolean14 = creditCard10.correctLength();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Credit Card" + "'", str12, "Credit Card");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Credit Card" + "'", str13, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.util.Date date2 = null;
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("", "hi!", date2);
        java.lang.String str4 = itemPurchased3.getTitle();
        java.lang.String str5 = itemPurchased3.getTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getEndDate();
        java.lang.String str7 = course5.getProfessorEmail();
        java.lang.String str8 = course5.getProfessorEmail();
        org.team4.model.user.Student student13 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean14 = course5.isEnrolled(student13);
        java.lang.String str15 = course5.getCourseTextBookISBN();
        org.team4.functionality.buy.ItemPurchased itemPurchased18 = new org.team4.functionality.buy.ItemPurchased("ItemPurchased{title='', email='hi!', datePurchased=null}", "hi!");
        java.util.Date date19 = itemPurchased18.getDatePurchased();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = course5.isStarted(date19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Sat Mar 30 20:31:55 EDT 2024");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.quantity((int) (short) 100);
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder0.build();
        int int10 = courseTextBook9.getYearPublished();
        boolean boolean11 = courseTextBook9.isRentable();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(courseTextBook9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "Credit Card", (int) '4', "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}");
        int int7 = bookRequest6.getEdition();
        int int8 = bookRequest6.getEdition();
        java.lang.String str9 = bookRequest6.getEmail();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}" + "'", str9, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("", "Credit Card", "", "ItemPurchased{title='', email='hi!', datePurchased=null}", (int) (byte) -1, "User [email=, password=, name=hi!, type=, validated=false]");
        java.lang.String str7 = bookRequest6.getEmail();
        java.lang.String str8 = bookRequest6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "User [email=, password=, name=hi!, type=, validated=false]", "hi!", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", false);
        manager5.setManagerID((long) (short) -1);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
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
        java.lang.String str20 = creditCard14.getMode();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Credit Card" + "'", str20, "Credit Card");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.edition((int) (byte) 0);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = bookBuilder6.publisher("PayPal");
        org.team4.model.items.Book book9 = bookBuilder6.build();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(book9);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}", "hi!", "Mobile Wallet", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", false);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.user.User user12 = purchaseComplete11.getUser();
        org.team4.model.items.Newsletter newsletter13 = purchaseComplete11.getNewsletter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNull(newsletter13);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        java.lang.String str8 = student5.toString();
        java.lang.String str9 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str8, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        java.lang.String str8 = student5.toString();
        java.lang.String str9 = student5.getEmail();
        java.lang.String str10 = student5.toString();
        student5.setName("User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str8, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str10, "User [email=, password=, name=hi!, type=, validated=false]");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("", "", "", "", 0L);
        long long6 = manager5.getManagerID();
        manager5.setManagerID(10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.lang.String str6 = course5.getProfessorEmail();
        java.util.Date date7 = course5.getStartDate();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter12 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str13 = subscribeNewsletter12.getEmail();
        java.util.Date date14 = subscribeNewsletter12.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter17 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str18 = subscribeNewsletter17.getEmail();
        java.util.Date date19 = subscribeNewsletter17.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter20 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date14, date19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = course5.isStarted(date19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Tue Apr 30 20:31:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Tue Apr 30 20:31:56 EDT 2024");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.team4.model.user.User user5 = new org.team4.model.user.User("PayPal", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:31:55 EDT 2024, dateDue=Tue Apr 30 20:31:55 EDT 2024}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "ItemPurchased{title='', email='', datePurchased=null}", true);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:31:55 EDT 2024, dateDue=Tue Apr 30 20:31:55 EDT 2024}", "hi!", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "hi!", (int) (byte) 0, "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "Credit Card", "ItemPurchased{title='', email='hi!', datePurchased=null}", true);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.title("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder0.email("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder5.title("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
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
        org.team4.model.items.builder.BookBuilder bookBuilder61 = courseTextBookBuilder57.noOfPages((int) (byte) 1);
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
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("User [email=, password=, name=hi!, type=, validated=false]", "User [email=, password=, name=hi!, type=, validated=false]", "PayPal", "PayPal", (long) (-1));
        long long6 = nonFaculty5.getUniversityID();
        long long7 = nonFaculty5.getUniversityID();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.yearPublished((int) (short) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder8 = magazineBuilder0.issueNumber(100);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder10 = magazineBuilder8.publisher("Debit Card");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder12 = magazineBuilder8.ISBN("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder14 = magazineBuilder8.ISBN("");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineBuilder8);
        org.junit.Assert.assertNotNull(magazineBuilder10);
        org.junit.Assert.assertNotNull(magazineItemBuilder12);
        org.junit.Assert.assertNotNull(magazineItemBuilder14);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder0.publisher("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = bookBuilder10.yearPublished((int) (byte) 1);
        org.team4.model.items.builder.BookBuilder bookBuilder14 = bookBuilder10.hasSoftCopy(false);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(bookItemBuilder12);
        org.junit.Assert.assertNotNull(bookBuilder14);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.team4.model.user.User user5 = new org.team4.model.user.User("", "hi!", "PayPal", "");
        java.lang.String str6 = user5.getPassword();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) 10.0f, user5);
        java.lang.String str8 = itemToPurchase7.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}" + "'", str8, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]");
        java.lang.String str2 = payPal1.getMode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Mobile Wallet" + "'", str2, "Mobile Wallet");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
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
        boolean boolean15 = purchasableItemDecorator12.isPurchasable();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
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
        java.lang.String str27 = manager18.toString();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "User [email=, password=, name=hi!, type=hi!, validated=false]" + "'", str27, "User [email=, password=, name=hi!, type=hi!, validated=false]");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        student5.setType("User [email=, password=, name=hi!, type=, validated=false]");
        java.util.ArrayList<java.lang.String> strList10 = student5.getCourses();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(strList10);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.team4.model.user.User user5 = new org.team4.model.user.User("Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "Credit Card", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", true);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter3 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str4 = subscribeNewsletter3.getTitle();
        java.util.Date date5 = null;
        subscribeNewsletter3.setDateSubscribed(date5);
        java.util.Date date7 = subscribeNewsletter3.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter12 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str13 = subscribeNewsletter12.getEmail();
        java.util.Date date14 = subscribeNewsletter12.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter17 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str18 = subscribeNewsletter17.getEmail();
        java.util.Date date19 = subscribeNewsletter17.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter20 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date14, date19);
        org.team4.model.course.Course course23 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date7, date19, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter26 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter26.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter26.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter33 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date34 = null;
        subscribeNewsletter33.setDateSubscribed(date34);
        java.util.Date date36 = subscribeNewsletter33.getDateDue();
        subscribeNewsletter26.setDateDue(date36);
        java.util.Date date38 = subscribeNewsletter26.getDateSubscribed();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter41 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str42 = subscribeNewsletter41.getEmail();
        java.util.Date date43 = subscribeNewsletter41.getDateDue();
        subscribeNewsletter26.setDateSubscribed(date43);
        boolean boolean45 = course23.isStarted(date43);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Tue Apr 30 20:31:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Tue Apr 30 20:31:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Tue Apr 30 20:31:56 EDT 2024");
        org.junit.Assert.assertNotNull(date36);
// flaky:         org.junit.Assert.assertEquals(date36.toString(), "Tue Apr 30 20:31:56 EDT 2024");
        org.junit.Assert.assertNotNull(date38);
// flaky:         org.junit.Assert.assertEquals(date38.toString(), "Sat Mar 30 20:31:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(date43);
// flaky:         org.junit.Assert.assertEquals(date43.toString(), "Tue Apr 30 20:31:56 EDT 2024");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "Credit Card", (int) '4', "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}");
        int int7 = bookRequest6.getEdition();
        int int8 = bookRequest6.getEdition();
        java.lang.String str9 = bookRequest6.getISBN();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Credit Card" + "'", str9, "Credit Card");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator11 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        org.team4.model.items.Magazine magazine14 = new org.team4.model.items.Magazine((org.team4.model.items.Item) rentableItemDecorator11, "", 52);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:31:55 EDT 2024, dateDue=Tue Apr 30 20:31:55 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}", "", false);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        org.team4.model.user.Student student10 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str11 = student10.getType();
        course5.enrollStudent(student10);
        java.lang.String str13 = course5.getProfessorEmail();
        java.util.Date date14 = course5.getEndDate();
        java.util.Date date15 = course5.getEndDate();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter18 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str19 = subscribeNewsletter18.getTitle();
        java.util.Date date20 = null;
        subscribeNewsletter18.setDateSubscribed(date20);
        java.util.Date date22 = subscribeNewsletter18.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter27 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str28 = subscribeNewsletter27.getEmail();
        java.util.Date date29 = subscribeNewsletter27.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter32 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str33 = subscribeNewsletter32.getTitle();
        java.util.Date date34 = null;
        subscribeNewsletter32.setDateSubscribed(date34);
        java.util.Date date36 = subscribeNewsletter32.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter37 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "", date29, date36);
        subscribeNewsletter18.setDateDue(date36);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = course5.isStarted(date36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Tue Apr 30 20:31:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Tue Apr 30 20:31:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(date36);
// flaky:         org.junit.Assert.assertEquals(date36.toString(), "Tue Apr 30 20:31:56 EDT 2024");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "PayPal", true);
        java.lang.String str6 = faculty5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, type=PayPal, validated=true]" + "'", str6, "User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, type=PayPal, validated=true]");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.team4.model.items.Newsletter newsletter0 = null;
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
        java.lang.String str26 = manager19.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.team4.functionality.buy.ItemToPurchase itemToPurchase27 = new org.team4.functionality.buy.ItemToPurchase(newsletter0, (org.team4.model.user.User) manager19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.team4.model.items.Newsletter.getPrice()\" because \"newsletter\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dVD2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(item12);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDBuilder2.ISBN("");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "User [email=, password=, name=hi!, type=, validated=false]", (int) (short) 10, "ItemPurchased{title='', email='', datePurchased=null}");
        java.lang.String str7 = bookRequest6.getBookType();
        java.lang.String str8 = bookRequest6.getEmail();
        int int9 = bookRequest6.getEdition();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str7, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}" + "'", str8, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("User [email=, password=, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:31:55 EDT 2024, dateDue=Tue Apr 30 20:31:55 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", (long) ' ');
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.DVD dVD3 = dVDBuilder0.build();
        double double4 = dVD3.getDuration();
        org.team4.model.course.Course course10 = null;
        org.team4.model.course.CourseTextBook courseTextBook12 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) dVD3, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", (int) '#', "", "ItemPurchased{title='', email='', datePurchased=null}", (int) (short) -1, course10, true);
        org.team4.model.course.Course course13 = courseTextBook12.getCourse();
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVD3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(course13);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("ItemPurchased{title='', email='', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", false);
        java.lang.String str6 = faculty5.getPassword();
        java.util.ArrayList<java.lang.String> strList7 = faculty5.getCourses();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str6, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNull(strList7);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}", (int) (short) 1, (int) (short) 100, (double) 0, "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:31:55 EDT 2024, dateDue=Tue Apr 30 20:31:55 EDT 2024}", true, false);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        boolean boolean1 = org.team4.utils.EmailValidator.validEmail("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str3 = subscribeNewsletter2.getTitle();
        java.util.Date date4 = null;
        subscribeNewsletter2.setDateSubscribed(date4);
        java.util.Date date6 = subscribeNewsletter2.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter9 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter9.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter9.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter16 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date17 = null;
        subscribeNewsletter16.setDateSubscribed(date17);
        java.util.Date date19 = subscribeNewsletter16.getDateDue();
        subscribeNewsletter9.setDateDue(date19);
        subscribeNewsletter2.setDateDue(date19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 30 20:31:57 EDT 2024");
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Tue Apr 30 20:31:57 EDT 2024");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase2 = null;
        org.team4.functionality.buy.ProcessPayment processPayment3 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet1, itemToPurchase2);
        boolean boolean4 = mobileWallet1.isValid();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
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
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
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
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str3 = subscribeNewsletter2.getTitle();
        java.util.Date date4 = subscribeNewsletter2.getDateDue();
        java.lang.String str5 = subscribeNewsletter2.getEmail();
        subscribeNewsletter2.setTitle("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Tue Apr 30 20:31:57 EDT 2024");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
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
        boolean boolean33 = rentableItemDecorator11.isRentable();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder53 = courseTextBookBuilder51.quantity((int) (short) -1);
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
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 20:31:57 EDT 2024");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Tue Apr 30 20:31:57 EDT 2024");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Tue Apr 30 20:31:57 EDT 2024");
        org.junit.Assert.assertNotNull(courseTextBookBuilder51);
        org.junit.Assert.assertNotNull(bookItemBuilder53);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.paymentmodes.MobileWallet mobileWallet9 = new org.team4.model.paymentmodes.MobileWallet("");
        java.lang.String str10 = mobileWallet9.getMode();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet9);
        org.team4.model.items.Item item12 = purchaseComplete11.getItem();
        double double13 = purchaseComplete11.getAmount();
        double double14 = purchaseComplete11.getAmount();
        org.team4.model.items.Newsletter newsletter15 = purchaseComplete11.getNewsletter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PayPal" + "'", str10, "PayPal");
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNull(newsletter15);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.team4.model.user.User user5 = new org.team4.model.user.User("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}", "Mobile Wallet", false);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.team4.functionality.buy.ItemPurchased itemPurchased2 = new org.team4.functionality.buy.ItemPurchased("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.title("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.title("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder5.title("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder9 = bookRequestBuilder5.edition((int) (byte) 1);
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder11 = bookRequestBuilder9.author("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
        org.junit.Assert.assertNotNull(bookRequestBuilder9);
        org.junit.Assert.assertNotNull(bookRequestBuilder11);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
        org.team4.model.items.decorator.ItemDecorator itemDecorator56 = new org.team4.model.items.decorator.ItemDecorator(item12);
        item12.setPurchaseable(false);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Tue Apr 30 20:31:57 EDT 2024");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 20:31:57 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 20:31:57 EDT 2024");
        org.junit.Assert.assertNotNull(bookBuilder46);
        org.junit.Assert.assertNotNull(bookItemBuilder48);
        org.junit.Assert.assertNotNull(bookBuilder50);
        org.junit.Assert.assertNotNull(bookItemBuilder52);
        org.junit.Assert.assertNotNull(bookItemBuilder54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("ItemPurchased{title='', email='hi!', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "", "ItemPurchased{title='', email='', datePurchased=null}", 0, "User [email=, password=, name=hi!, type=, validated=false]");
        java.lang.String str7 = bookRequest6.getBookType();
        java.lang.String str8 = bookRequest6.getAuthor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str7, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder4 = magazineItemBuilder2.ISBN("Credit Card");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineItemBuilder4.quantity((int) ' ');
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineItemBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
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
        org.team4.model.paymentmodes.CreditCard creditCard14 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        boolean boolean15 = creditCard14.notExpired();
        boolean boolean16 = creditCard14.isValid();
        boolean boolean17 = creditCard14.isValid();
        boolean boolean18 = book9.equals((java.lang.Object) creditCard14);
        int int19 = book9.getYearPublished();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str3 = subscribeNewsletter2.getEmail();
        java.util.Date date4 = subscribeNewsletter2.getDateDue();
        java.lang.String str5 = subscribeNewsletter2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Tue Apr 30 20:31:57 EDT 2024");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        boolean boolean1 = org.team4.utils.EmailValidator.validEmail("Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}", (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
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
        dVD1.setPrice((double) (short) 0);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        boolean boolean11 = book9.hasSoftCopy();
        java.lang.String str12 = book9.getPublisher();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "Credit Card", "Mobile Wallet");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter24 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str25 = subscribeNewsletter24.getTitle();
        java.util.Date date26 = null;
        subscribeNewsletter24.setDateSubscribed(date26);
        java.util.Date date28 = subscribeNewsletter24.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter32 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str33 = subscribeNewsletter32.getTitle();
        java.util.Date date34 = null;
        subscribeNewsletter32.setDateSubscribed(date34);
        java.util.Date date36 = subscribeNewsletter32.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter41 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str42 = subscribeNewsletter41.getEmail();
        java.util.Date date43 = subscribeNewsletter41.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter46 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str47 = subscribeNewsletter46.getEmail();
        java.util.Date date48 = subscribeNewsletter46.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter49 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date43, date48);
        org.team4.model.course.Course course52 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date36, date48, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.model.course.Course course55 = new org.team4.model.course.Course("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", date28, date36, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean56 = course5.isStarted(date36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Tue Apr 30 20:31:57 EDT 2024");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(date36);
// flaky:         org.junit.Assert.assertEquals(date36.toString(), "Tue Apr 30 20:31:57 EDT 2024");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(date43);
// flaky:         org.junit.Assert.assertEquals(date43.toString(), "Tue Apr 30 20:31:57 EDT 2024");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(date48);
// flaky:         org.junit.Assert.assertEquals(date48.toString(), "Tue Apr 30 20:31:57 EDT 2024");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.builder.DVDBuilder dVDBuilder4 = dVDBuilder0.duration(10.0d);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDBuilder4.quantity(52);
        org.team4.model.items.DVD dVD7 = dVDBuilder4.build();
        dVD7.setRentable(true);
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVD7);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
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
        org.team4.model.items.builder.BookBuilder bookBuilder21 = bookBuilder18.publisher("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}");
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
        org.junit.Assert.assertNotNull(bookBuilder21);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}", "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}", 8997383L);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.team4.model.user.User user5 = new org.team4.model.user.User("User [email=, password=, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:31:55 EDT 2024, dateDue=Tue Apr 30 20:31:55 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", false);
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
        org.team4.model.items.DVD dVD20 = new org.team4.model.items.DVD((org.team4.model.items.Item) dVD1, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", (double) '#');
        java.lang.String str21 = dVD1.getGenre();
        boolean boolean22 = dVD1.isPurchasable();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
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
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
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
        java.lang.String str55 = courseTextBook45.getAuthor();
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
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str55, "User [email=, password=, name=hi!, type=, validated=false]");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDBuilder2.quantity(10);
        org.team4.model.items.builder.DVDBuilder dVDBuilder8 = dVDBuilder2.genre("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder10 = dVDBuilder2.genre("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder12 = dVDBuilder2.quantity(1);
        java.lang.Class<?> wildcardClass13 = dVDItemBuilder12.getClass();
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDBuilder8);
        org.junit.Assert.assertNotNull(dVDBuilder10);
        org.junit.Assert.assertNotNull(dVDItemBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}");
        org.team4.model.items.Book book5 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder7 = courseTextBookBuilder0.edition((-1));
        org.team4.model.items.builder.BookBuilder bookBuilder9 = bookBuilder7.edition((int) (short) 100);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(bookBuilder7);
        org.junit.Assert.assertNotNull(bookBuilder9);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", 0.0d);
        java.lang.String str4 = newsletter3.getTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}" + "'", str4, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter2.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter2.setTitle("PayPal");
        java.lang.String str7 = subscribeNewsletter2.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PayPal" + "'", str7, "PayPal");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "Mobile Wallet", "Debit Card", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("User [email=, password=, name=hi!, type=, validated=false]", 52, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 97");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
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
        java.lang.String str47 = courseTextBook9.getGenre();
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
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder5 = magazineBuilder0.ISBN("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder7 = magazineItemBuilder5.title("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder9 = magazineItemBuilder7.price((double) 1L);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertNotNull(magazineItemBuilder5);
        org.junit.Assert.assertNotNull(magazineItemBuilder7);
        org.junit.Assert.assertNotNull(magazineItemBuilder9);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.title("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDBuilder2.price((double) '4');
        org.team4.model.items.builder.DVDBuilder dVDBuilder8 = dVDBuilder2.genre("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDBuilder8);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
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
        org.team4.model.items.builder.BookBuilder bookBuilder61 = courseTextBookBuilder57.hasSoftCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder63 = bookBuilder61.price((double) 100L);
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
        org.junit.Assert.assertNotNull(bookItemBuilder63);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder0.author("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.edition((int) (byte) 100);
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("Debit Card", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "hi!");
        org.team4.model.user.Student student19 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str20 = student19.getType();
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        student19.setCourses(strList23);
        org.team4.model.user.Faculty faculty26 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", (long) (byte) -1, strList23);
        org.team4.model.user.Faculty faculty27 = new org.team4.model.user.Faculty("", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", "ItemPurchased{title='', email='hi!', datePurchased=null}", (long) (byte) 0, strList23);
        student4.setCourses(strList23);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
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
        book9.setQuantity(52);
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
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        java.lang.String str8 = student5.toString();
        java.lang.String str9 = student5.getEmail();
        java.lang.String str10 = student5.toString();
        java.util.ArrayList<java.lang.String> strList11 = student5.getCourses();
        java.util.ArrayList<java.lang.String> strList12 = student5.getCourses();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str8, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str10, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertNull(strList11);
        org.junit.Assert.assertNull(strList12);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        student5.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase8 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student5);
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase8, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        long long12 = purchaseComplete11.getPurchaseID();
        long long13 = purchaseComplete11.getPurchaseID();
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9515565L + "'", long12 == 9515565L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9515565L + "'", long13 == 9515565L);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("User [email=, password=, name=hi!, type=, validated=false]", "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "User [email=, password=, name=hi!, type=, validated=false]", false);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.booktype("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder3.booktype("PayPal");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder9 = bookRequestBuilder7.title("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
        org.junit.Assert.assertNotNull(bookRequestBuilder9);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", 5102514L);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDItemBuilder4.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDItemBuilder6.price((double) (byte) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder10 = dVDItemBuilder8.price((double) 100.0f);
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
        org.junit.Assert.assertNotNull(dVDItemBuilder10);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "User [email=, password=, name=hi!, type=, validated=false]", "hi!", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", false);
        manager5.setEmail("SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:31:55 EDT 2024, dateDue=Tue Apr 30 20:31:55 EDT 2024}");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.util.ArrayList<java.lang.String> strList5 = org.team4.model.paymentmodes.PaymentModes.MODE;
        org.team4.model.user.Faculty faculty6 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "ItemPurchased{title='', email='', datePurchased=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", 1232147L, strList5);
        faculty6.setEmail("Credit Card");
        org.team4.model.user.Student student23 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str24 = student23.getType();
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        student23.setCourses(strList27);
        org.team4.model.user.Faculty faculty30 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", (long) (byte) -1, strList27);
        java.util.ArrayList<java.lang.String> strList31 = faculty30.getCourses();
        java.util.ArrayList<java.lang.String> strList32 = faculty30.getCourses();
        org.team4.model.user.Faculty faculty33 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", (long) '4', strList32);
        faculty6.setCourses(strList32);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(strList32);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        org.team4.model.user.Student student10 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str11 = student10.getType();
        course5.enrollStudent(student10);
        java.lang.String str13 = course5.getProfessorEmail();
        java.lang.String str14 = course5.getProfessorEmail();
        java.lang.String str15 = course5.getCourseTextBookISBN();
        org.team4.model.user.Student student21 = new org.team4.model.user.Student("Credit Card", "Credit Card", "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemPurchased{title='', email='', datePurchased=null}", true);
        course5.enrollStudent(student21);
        java.lang.String str23 = course5.getProfessorEmail();
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
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter62 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str63 = subscribeNewsletter62.getTitle();
        java.util.Date date64 = null;
        subscribeNewsletter62.setDateSubscribed(date64);
        java.util.Date date66 = subscribeNewsletter62.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter71 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str72 = subscribeNewsletter71.getEmail();
        java.util.Date date73 = subscribeNewsletter71.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter76 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str77 = subscribeNewsletter76.getEmail();
        java.util.Date date78 = subscribeNewsletter76.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter79 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date73, date78);
        org.team4.model.course.Course course82 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date66, date78, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        boolean boolean83 = course58.isEnded(date66);
        java.util.Date date84 = course58.getStartDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean85 = course5.isStarted(date84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Tue Apr 30 20:31:58 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Tue Apr 30 20:31:58 EDT 2024");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(date46);
// flaky:         org.junit.Assert.assertEquals(date46.toString(), "Tue Apr 30 20:31:58 EDT 2024");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(date51);
// flaky:         org.junit.Assert.assertEquals(date51.toString(), "Tue Apr 30 20:31:58 EDT 2024");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertNotNull(date66);
// flaky:         org.junit.Assert.assertEquals(date66.toString(), "Tue Apr 30 20:31:58 EDT 2024");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertNotNull(date73);
// flaky:         org.junit.Assert.assertEquals(date73.toString(), "Tue Apr 30 20:31:58 EDT 2024");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertNotNull(date78);
// flaky:         org.junit.Assert.assertEquals(date78.toString(), "Tue Apr 30 20:31:58 EDT 2024");
// flaky:         org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(date84);
// flaky:         org.junit.Assert.assertEquals(date84.toString(), "Tue Apr 30 20:31:58 EDT 2024");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.BookBuilder bookBuilder4 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.publisher("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        org.team4.model.items.Book book7 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder9 = courseTextBookBuilder0.yearPublished(0);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(bookItemBuilder9);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
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
        java.util.Date date46 = course45.getEndDate();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Tue Apr 30 20:31:58 EDT 2024");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 20:31:58 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 20:31:58 EDT 2024");
        org.junit.Assert.assertNotNull(course44);
        org.junit.Assert.assertNotNull(course45);
        org.junit.Assert.assertNotNull(date46);
// flaky:         org.junit.Assert.assertEquals(date46.toString(), "Tue Apr 30 20:31:58 EDT 2024");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        org.team4.model.items.Item item11 = rentableItemDecorator10.getItem();
        java.lang.String str12 = item11.getTitle();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.quantity((int) (short) 100);
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder11 = courseTextBookBuilder0.author("Debit Card");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder13 = bookBuilder11.ISBN("Mobile Wallet");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder15 = bookItemBuilder13.title("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(courseTextBook9);
        org.junit.Assert.assertNotNull(bookBuilder11);
        org.junit.Assert.assertNotNull(bookItemBuilder13);
        org.junit.Assert.assertNotNull(bookItemBuilder15);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.ISBN("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDBuilder0.title("Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", (int) (byte) 1, 10);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, type=PayPal, validated=true]");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
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
        rentedItem59.setTitle("Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Apr 30 20:31:58 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Tue Apr 30 20:31:58 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 20:31:58 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 20:31:58 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 20:31:58 EDT 2024");
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Tue Apr 30 20:31:58 EDT 2024");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str60, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(date73);
// flaky:         org.junit.Assert.assertEquals(date73.toString(), "Tue Apr 30 20:31:58 EDT 2024");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertNotNull(date83);
// flaky:         org.junit.Assert.assertEquals(date83.toString(), "Tue Apr 30 20:31:58 EDT 2024");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("", (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
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
        org.team4.model.course.Course course34 = new org.team4.model.course.Course("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", date7, date15, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal");
        java.lang.String str35 = course34.getCourseName();
        java.lang.String str36 = course34.getProfessorEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Tue Apr 30 20:31:59 EDT 2024");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Tue Apr 30 20:31:59 EDT 2024");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Tue Apr 30 20:31:59 EDT 2024");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(date27);
// flaky:         org.junit.Assert.assertEquals(date27.toString(), "Tue Apr 30 20:31:59 EDT 2024");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}" + "'", str35, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PayPal" + "'", str36, "PayPal");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}", (int) (short) 1, (int) ' ', (double) (-1), "ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}", true, false);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("", "User [email=, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=PayPal, validated=false]", "Credit Card", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("Debit Card", "ProcessPayment{modes=null, itemToPurchase=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}}", "User [email=, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=PayPal, validated=false]", "", true);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
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
        org.team4.model.user.Student student58 = new org.team4.model.user.Student("", "", "PayPal", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        // The following exception was thrown during execution in test generation
        try {
            courseTextBook45.removeCopies(student58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"date\" is null");
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
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.util.Date date2 = null;
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("", "", date2);
        java.lang.String str4 = itemPurchased3.getTitle();
        java.util.Date date5 = itemPurchased3.getDatePurchased();
        java.lang.String str6 = itemPurchased3.getTitle();
        java.lang.String str7 = itemPurchased3.getTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "hi!", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", true);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        java.lang.String str4 = magazine3.getPublisher();
        double double5 = magazine3.getPrice();
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.team4.model.user.User user4 = new org.team4.model.user.User("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "Credit Card", "Mobile Wallet", "");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.paymentmodes.CreditCard creditCard10 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) creditCard10);
        long long12 = purchaseComplete11.getPurchaseID();
        long long13 = purchaseComplete11.getPurchaseID();
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 423120L + "'", long12 == 423120L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 423120L + "'", long13 == 423120L);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
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
        org.team4.model.items.Book book37 = new org.team4.model.items.Book((org.team4.model.items.Item) book29, "PayPal", 52, "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", 52, true, true);
        double double38 = book37.getPrice();
        java.lang.String str39 = book37.getPublisher();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}" + "'", str39, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "User [email=, password=, name=hi!, type=, validated=false]", "ItemPurchased{title='', email='', datePurchased=null}", "");
        nonFaculty5.setValidated(false);
        nonFaculty5.setUniversityID((long) '#');
        org.team4.functionality.buy.ItemToPurchase itemToPurchase10 = new org.team4.functionality.buy.ItemToPurchase((double) (byte) 1, (org.team4.model.user.User) nonFaculty5);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder0.price((double) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = bookItemBuilder10.quantity((int) '4');
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(bookItemBuilder12);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "ProcessPayment{modes=null, itemToPurchase=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}}");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
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
        java.lang.String str44 = courseTextBook43.getPublisher();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Tue Apr 30 20:31:59 EDT 2024");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 20:31:59 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 20:31:59 EDT 2024");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "PayPal" + "'", str44, "PayPal");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}", "Credit Card", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", false);
        manager5.setManagerID(0L);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.price((double) (byte) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = bookItemBuilder8.price(0.0d);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = bookItemBuilder10.yearPublished((int) (short) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder14 = bookItemBuilder10.yearPublished((int) '4');
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(bookItemBuilder12);
        org.junit.Assert.assertNotNull(bookItemBuilder14);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder6 = magazineBuilder4.issueNumber(32);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineBuilder6.yearPublished((-1));
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder10 = magazineItemBuilder8.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder12 = magazineItemBuilder8.quantity((int) (short) 1);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
        org.junit.Assert.assertNotNull(magazineItemBuilder10);
        org.junit.Assert.assertNotNull(magazineItemBuilder12);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
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
        double double15 = rentableItemDecorator10.getPrice();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertNotNull(item12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("Debit Card", "PayPal", "hi!", "hi!", false);
        faculty5.setValidated(true);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
        java.lang.String str21 = course5.getCourseName();
        java.lang.String str22 = course5.getCourseTextBookISBN();
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("ItemPurchased{title='', email='', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", (double) 0);
        java.lang.String str4 = newsletter3.getTitle();
        java.lang.String str5 = newsletter3.getLink();
        java.lang.String str6 = newsletter3.getLink();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str4, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}" + "'", str5, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}" + "'", str6, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.paymentmodes.MobileWallet mobileWallet9 = new org.team4.model.paymentmodes.MobileWallet("");
        java.lang.String str10 = mobileWallet9.getMode();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet9);
        org.team4.model.items.Item item12 = purchaseComplete11.getItem();
        double double13 = purchaseComplete11.getAmount();
        double double14 = purchaseComplete11.getAmount();
        double double15 = purchaseComplete11.getAmount();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PayPal" + "'", str10, "PayPal");
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
        java.lang.String str46 = courseTextBook43.getAuthor();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Tue Apr 30 20:31:59 EDT 2024");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 20:31:59 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 20:31:59 EDT 2024");
        org.junit.Assert.assertNotNull(course44);
        org.junit.Assert.assertNotNull(course45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.team4.model.items.builder.BookBuilder bookBuilder0 = new org.team4.model.items.builder.BookBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder2 = bookBuilder0.yearPublished((int) (short) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = bookBuilder0.price((double) (byte) -1);
        org.junit.Assert.assertNotNull(bookItemBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        java.lang.String str2 = bookRequest1.getISBN();
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
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
        java.lang.String str23 = itemDecorator22.getTitle();
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
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        int int9 = book7.getQuantity();
        boolean boolean10 = book7.hasHardCopy();
        int int11 = book7.getEdition();
        book7.setQuantity(52);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        boolean boolean4 = creditCard3.notExpired();
        java.lang.String str5 = creditCard3.getMode();
        boolean boolean6 = creditCard3.notExpired();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Credit Card" + "'", str5, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.team4.model.user.User user5 = new org.team4.model.user.User("", "hi!", "hi!", "hi!", false);
        user5.setValidated(false);
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
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator11 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD10);
        dVD10.setPurchaseable(true);
        double double14 = dVD10.getDuration();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("", (int) (byte) -1, 0, (double) 0, "User [email=, password=, name=hi!, type=, validated=false]", false, true);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.team4.model.user.Student student14 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str15 = student14.getType();
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        student14.setCourses(strList18);
        org.team4.model.user.Faculty faculty21 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", (long) (byte) -1, strList18);
        java.lang.String str22 = faculty21.getName();
        faculty21.setFacultyID((long) (short) 100);
        java.util.ArrayList<java.lang.String> strList25 = faculty21.getCourses();
        org.team4.model.user.Student student40 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str41 = student40.getType();
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        student40.setCourses(strList44);
        org.team4.model.user.Faculty faculty47 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", (long) (byte) -1, strList44);
        java.util.ArrayList<java.lang.String> strList48 = faculty47.getCourses();
        java.util.ArrayList<java.lang.String> strList49 = faculty47.getCourses();
        org.team4.model.user.Faculty faculty50 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", (long) '4', strList49);
        faculty21.setCourses(strList49);
        org.team4.model.user.Faculty faculty52 = new org.team4.model.user.Faculty("", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", (-1L), strList49);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str22, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strList49);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "ProcessPayment{modes=null, itemToPurchase=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "User [email=, password=, name=hi!, type=, validated=false]", false);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder55 = bookBuilder53.quantity((int) (short) 100);
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
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 20:31:59 EDT 2024");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Tue Apr 30 20:31:59 EDT 2024");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Tue Apr 30 20:31:59 EDT 2024");
        org.junit.Assert.assertNotNull(courseTextBookBuilder51);
        org.junit.Assert.assertNotNull(bookBuilder53);
        org.junit.Assert.assertNotNull(bookItemBuilder55);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.lang.String[] strArray28 = new java.lang.String[] { "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemPurchased{title='', email='', datePurchased=null}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "Mobile Wallet", "ItemPurchased{title='', email='', datePurchased=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}", "User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, type=PayPal, validated=true]", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}", "Mobile Wallet", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", "ProcessPayment{modes=null, itemToPurchase=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}}", "", "Debit Card", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:31:55 EDT 2024, dateDue=Tue Apr 30 20:31:55 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        org.team4.model.user.Student student31 = new org.team4.model.user.Student("PayPal", "User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, type=PayPal, validated=true]", "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", strList29);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.paymentmodes.CreditCard creditCard10 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) creditCard10);
        java.lang.String str12 = creditCard10.getMode();
        boolean boolean13 = creditCard10.notExpired();
        boolean boolean14 = creditCard10.correctLength();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Credit Card" + "'", str12, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        boolean boolean10 = book9.hasHardCopy();
        book9.setQuantity((int) '4');
        boolean boolean13 = book9.isPurchasable();
        book9.setQuantity((int) (short) 100);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("User [email=, password=, name=hi!, type=, validated=false]", "User [email=, password=, name=hi!, type=, validated=false]", "PayPal", "PayPal", (long) (-1));
        java.lang.String str6 = nonFaculty5.getName();
        nonFaculty5.setUniversityID((long) (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PayPal" + "'", str6, "PayPal");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.team4.model.user.User user5 = new org.team4.model.user.User("SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:31:55 EDT 2024, dateDue=Tue Apr 30 20:31:55 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", true);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getEndDate();
        java.lang.String str7 = course5.getProfessorEmail();
        java.lang.String str8 = course5.getProfessorEmail();
        org.team4.model.user.Student student13 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean14 = course5.isEnrolled(student13);
        java.lang.String str15 = course5.getProfessorEmail();
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
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
        java.lang.String str42 = book7.getAuthor();
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
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
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
        int int14 = courseTextBook8.getEdition();
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
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        int int8 = book7.getNoOfPages();
        int int9 = book7.getQuantity();
        boolean boolean10 = book7.isPurchasable();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
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
        org.team4.functionality.buy.PurchaseComplete purchaseComplete22 = processPayment21.getPurchaseCompleted();
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(purchaseComplete22);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDBuilder2.quantity(10);
        org.team4.model.items.builder.DVDBuilder dVDBuilder8 = dVDBuilder2.genre("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder10 = dVDBuilder2.genre("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder12 = dVDBuilder2.quantity(1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder14 = dVDItemBuilder12.yearPublished((int) ' ');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder16 = dVDItemBuilder14.yearPublished((int) (short) 1);
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDBuilder8);
        org.junit.Assert.assertNotNull(dVDBuilder10);
        org.junit.Assert.assertNotNull(dVDItemBuilder12);
        org.junit.Assert.assertNotNull(dVDItemBuilder14);
        org.junit.Assert.assertNotNull(dVDItemBuilder16);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
        org.team4.functionality.buy.PurchaseComplete purchaseComplete27 = processPayment26.getPurchaseCompleted();
        java.lang.String str28 = processPayment26.toString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Credit Card" + "'", str12, "Credit Card");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(newsletter21);
        org.junit.Assert.assertNotNull(user25);
        org.junit.Assert.assertNull(purchaseComplete27);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
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
        java.lang.String str24 = course20.getCourseName();
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
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
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
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder19 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest20 = bookRequestBuilder19.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder22 = bookRequestBuilder19.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder24 = bookRequestBuilder22.booktype("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder26 = bookRequestBuilder24.ISBN("PayPal");
        org.team4.model.items.BookRequest bookRequest27 = bookRequestBuilder26.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder29 = bookRequestBuilder26.title("Mobile Wallet");
        boolean boolean30 = book9.equals((java.lang.Object) "Mobile Wallet");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookRequest20);
        org.junit.Assert.assertNotNull(bookRequestBuilder22);
        org.junit.Assert.assertNotNull(bookRequestBuilder24);
        org.junit.Assert.assertNotNull(bookRequestBuilder26);
        org.junit.Assert.assertNotNull(bookRequest27);
        org.junit.Assert.assertNotNull(bookRequestBuilder29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.yearPublished((int) (short) -1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineBuilder0.quantity((int) (byte) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder10 = magazineBuilder0.quantity(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder12 = magazineItemBuilder10.price((double) (byte) -1);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
        org.junit.Assert.assertNotNull(magazineItemBuilder10);
        org.junit.Assert.assertNotNull(magazineItemBuilder12);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:31:55 EDT 2024, dateDue=Tue Apr 30 20:31:55 EDT 2024}", (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        boolean boolean1 = org.team4.utils.EmailValidator.validEmail("Credit Card");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        java.lang.String str2 = bookRequest1.getTitle();
        java.lang.String str3 = bookRequest1.getEmail();
        java.lang.String str4 = bookRequest1.getAuthor();
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.yearPublished((int) (short) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder8 = magazineBuilder0.issueNumber(100);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder10 = magazineBuilder8.publisher("Debit Card");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder12 = magazineBuilder8.ISBN("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder14 = magazineItemBuilder12.quantity((int) '#');
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineBuilder8);
        org.junit.Assert.assertNotNull(magazineBuilder10);
        org.junit.Assert.assertNotNull(magazineItemBuilder12);
        org.junit.Assert.assertNotNull(magazineItemBuilder14);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.DVD dVD10 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Credit Card", 0.0d);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator11 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD10);
        dVD10.setPurchaseable(true);
        java.lang.String str14 = dVD10.getGenre();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Credit Card" + "'", str14, "Credit Card");
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
        dVD1.setQuantity((int) (short) 1);
        dVD1.setQuantity((int) ' ');
        boolean boolean9 = dVD1.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD1);
        org.team4.model.items.Item item11 = rentableItemDecorator10.getItem();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator12 = new org.team4.model.items.decorator.PurchasableItemDecorator(item11);
        boolean boolean13 = purchasableItemDecorator12.isPurchasable();
        boolean boolean14 = purchasableItemDecorator12.isPurchasable();
        purchasableItemDecorator12.setPurchaseable(false);
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
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        org.team4.model.user.Student student10 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str11 = student10.getType();
        course5.enrollStudent(student10);
        java.lang.String str13 = student10.getEmail();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "User [email=, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=PayPal, validated=false]", "PayPal", "PayPal", false);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("", "Credit Card", "", "ItemPurchased{title='', email='hi!', datePurchased=null}", (int) (byte) -1, "User [email=, password=, name=hi!, type=, validated=false]");
        java.lang.String str7 = bookRequest6.getAuthor();
        int int8 = bookRequest6.getEdition();
        java.lang.String str9 = bookRequest6.getAuthor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}", (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 32");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", (int) (short) 100, 32);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 32");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        int int2 = dVD1.getYearPublished();
        java.lang.String str3 = dVD1.getGenre();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
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
        org.team4.model.user.User user52 = new org.team4.model.user.User("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemPurchased{title='', email='', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", true);
        boolean boolean53 = courseTextBook9.equals((java.lang.Object) true);
        java.util.Date date55 = null;
        java.util.Date date56 = null;
        org.team4.model.course.Course course59 = new org.team4.model.course.Course("hi!", date55, date56, "", "hi!");
        org.team4.model.user.Student student64 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str65 = student64.getType();
        course59.enrollStudent(student64);
        java.lang.String str67 = course59.getCourseName();
        java.lang.String str68 = course59.getCourseTextBookISBN();
        org.team4.model.user.Student student73 = new org.team4.model.user.Student("", "", "PayPal", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        boolean boolean74 = course59.isEnrolled(student73);
        // The following exception was thrown during execution in test generation
        try {
            courseTextBook9.removeCopies(student73);
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
        org.junit.Assert.assertNull(course46);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.quantity((int) (short) 100);
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder11 = courseTextBookBuilder0.author("Debit Card");
        org.team4.model.course.CourseTextBook courseTextBook12 = courseTextBookBuilder0.build();
        java.util.List<org.team4.model.user.Student> studentList13 = courseTextBook12.getStudentsWithCopies();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(courseTextBook9);
        org.junit.Assert.assertNotNull(bookBuilder11);
        org.junit.Assert.assertNotNull(courseTextBook12);
        org.junit.Assert.assertNotNull(studentList13);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("User [email=, password=, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "", (long) 0);
        long long6 = manager5.getManagerID();
        long long7 = manager5.getManagerID();
        manager5.setManagerID((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.booktype("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder5.ISBN("PayPal");
        org.team4.model.items.BookRequest bookRequest8 = bookRequestBuilder7.build();
        java.lang.String str9 = bookRequest8.getAuthor();
        java.lang.String str10 = bookRequest8.getAuthor();
        java.lang.String str11 = bookRequest8.getTitle();
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
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        boolean boolean10 = book9.hasHardCopy();
        java.lang.String str11 = book9.getTitle();
        org.team4.model.items.Item item12 = new org.team4.model.items.Item((org.team4.model.items.Item) book9);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:59 EDT 2024, dateDue=Tue Apr 30 20:31:59 EDT 2024}", true);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.team4.model.items.Item item0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.items.DVD dVD3 = new org.team4.model.items.DVD(item0, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:59 EDT 2024, dateDue=Tue Apr 30 20:31:59 EDT 2024}", (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"title\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
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
        org.team4.model.user.User user52 = new org.team4.model.user.User("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemPurchased{title='', email='', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", true);
        boolean boolean53 = courseTextBook9.equals((java.lang.Object) true);
        org.team4.model.user.Student student59 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str60 = student59.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase61 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student59);
        java.lang.String str62 = student59.toString();
        java.util.ArrayList<java.lang.String> strList63 = student59.getCourses();
        // The following exception was thrown during execution in test generation
        try {
            courseTextBook9.removeCopies(student59);
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
        org.junit.Assert.assertNull(course46);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str62, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertNull(strList63);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("");
        org.team4.model.user.Student student7 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str8 = student7.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase9 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student7);
        org.team4.model.items.Newsletter newsletter10 = itemToPurchase9.getNewsletter();
        org.team4.functionality.buy.ProcessPayment processPayment11 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet1, itemToPurchase9);
        boolean boolean12 = mobileWallet1.isValid();
        java.lang.Class<?> wildcardClass13 = mobileWallet1.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        boolean boolean10 = book9.hasHardCopy();
        book9.setQuantity((int) '4');
        boolean boolean13 = book9.isRentable();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.builder.DVDBuilder dVDBuilder4 = dVDBuilder0.genre("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder4.duration((double) (byte) 1);
        org.team4.model.items.DVD dVD7 = dVDBuilder4.build();
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVD7);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
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
        org.team4.model.items.Magazine magazine16 = new org.team4.model.items.Magazine((org.team4.model.items.Item) purchasableItemDecorator12, "Credit Card", 0);
        org.team4.model.items.Item item17 = purchasableItemDecorator12.getItem();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(item17);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}", "", "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}", "", (long) 100);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder9 = courseTextBookBuilder6.quantity((int) (short) 0);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(bookItemBuilder9);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        org.team4.model.user.Student student10 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str11 = student10.getType();
        course5.enrollStudent(student10);
        java.lang.String str13 = course5.getProfessorEmail();
        org.team4.model.user.Student student19 = new org.team4.model.user.Student("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "Mobile Wallet", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}", false);
        boolean boolean20 = course5.isEnrolled(student19);
        java.lang.String str21 = student19.getType();
        boolean boolean22 = student19.isValidated();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}" + "'", str21, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("ItemPurchased{title='', email='', datePurchased=null}", "ItemPurchased{title='', email='', datePurchased=null}", "", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", false);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str46 = course29.toString();
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
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}");
        subscribeNewsletter2.setTitle("User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, type=PayPal, validated=true]");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.title("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.title("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder5.author("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder9 = bookRequestBuilder5.author("");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
        org.junit.Assert.assertNotNull(bookRequestBuilder9);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "User [email=, password=, name=hi!, type=, validated=false]", "hi!", "PayPal", 8997383L);
        nonFaculty5.setUniversityID((long) '4');
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder6.quantity((-1));
        org.team4.model.items.builder.BookBuilder bookBuilder12 = courseTextBookBuilder6.author("SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}', email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', dateSubscribed=Sat Mar 30 20:32:00 EDT 2024, dateDue=Tue Apr 30 20:32:00 EDT 2024}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(bookBuilder12);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.team4.model.user.Student student14 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str15 = student14.getType();
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        student14.setCourses(strList18);
        org.team4.model.user.Faculty faculty21 = new org.team4.model.user.Faculty("", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "PayPal", (long) (byte) -1, strList18);
        java.lang.String str22 = faculty21.getName();
        faculty21.setFacultyID((long) (short) 1);
        java.util.Date date26 = null;
        java.util.Date date27 = null;
        org.team4.model.course.Course course30 = new org.team4.model.course.Course("hi!", date26, date27, "", "hi!");
        java.util.Date date31 = course30.getEndDate();
        java.lang.String str32 = course30.getProfessorEmail();
        java.lang.String str33 = course30.getProfessorEmail();
        org.team4.model.user.Student student39 = new org.team4.model.user.Student("", "", "hi!", "");
        student39.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase42 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student39);
        java.lang.String str43 = student39.getEmail();
        course30.enrollStudent(student39);
        org.team4.model.user.Faculty faculty50 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "hi!", "", "", false);
        faculty50.setFacultyID((long) (byte) 1);
        org.team4.model.user.Student student57 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str58 = student57.getType();
        java.lang.String[] strArray60 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        student57.setCourses(strList61);
        faculty50.setCourses(strList61);
        student39.setCourses(strList61);
        faculty21.setCourses(strList61);
        org.team4.model.user.Faculty faculty76 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "hi!", "", "", false);
        faculty76.setFacultyID((long) (byte) 1);
        org.team4.model.user.Student student83 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str84 = student83.getType();
        java.lang.String[] strArray86 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList87 = new java.util.ArrayList<java.lang.String>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList87, strArray86);
        student83.setCourses(strList87);
        faculty76.setCourses(strList87);
        long long91 = faculty76.getFacultyID();
        java.util.ArrayList<java.lang.String> strList92 = faculty76.getCourses();
        org.team4.model.user.Student student93 = new org.team4.model.user.Student("User [email=, password=, name=hi!, type=, validated=false]", "", "ItemPurchased{title='', email='', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", strList92);
        faculty21.setCourses(strList92);
        org.team4.model.user.Faculty faculty95 = new org.team4.model.user.Faculty("User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "User [email=, password=, name=hi!, type=, validated=false]", "Mobile Wallet", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", (long) (short) 100, strList92);
        long long96 = faculty95.getFacultyID();
        faculty95.setName("ProcessPayment{modes=null, itemToPurchase=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str22, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertNull(date31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 1L + "'", long91 == 1L);
        org.junit.Assert.assertNotNull(strList92);
        org.junit.Assert.assertTrue("'" + long96 + "' != '" + 100L + "'", long96 == 100L);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        boolean boolean4 = debitCard3.notExpired();
        boolean boolean5 = debitCard3.correctLength();
        boolean boolean6 = debitCard3.correctLength();
        boolean boolean7 = debitCard3.isValid();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
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
        java.lang.String str89 = rentedItem59.getISBN();
        java.lang.String str90 = rentedItem59.getTitle();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter93 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str94 = subscribeNewsletter93.getTitle();
        java.util.Date date95 = null;
        subscribeNewsletter93.setDateSubscribed(date95);
        java.util.Date date97 = subscribeNewsletter93.getDateDue();
        rentedItem59.setRentDate(date97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Apr 30 20:32:00 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Tue Apr 30 20:32:00 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 20:32:00 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 20:32:00 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 20:32:00 EDT 2024");
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Tue Apr 30 20:32:00 EDT 2024");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str60, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(date73);
// flaky:         org.junit.Assert.assertEquals(date73.toString(), "Tue Apr 30 20:32:00 EDT 2024");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertNotNull(date83);
// flaky:         org.junit.Assert.assertEquals(date83.toString(), "Tue Apr 30 20:32:00 EDT 2024");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "PayPal" + "'", str88, "PayPal");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "PayPal" + "'", str89, "PayPal");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str90, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "hi!" + "'", str94, "hi!");
        org.junit.Assert.assertNotNull(date97);
// flaky:         org.junit.Assert.assertEquals(date97.toString(), "Tue Apr 30 20:32:00 EDT 2024");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder5 = magazineBuilder0.ISBN("hi!");
        org.team4.model.items.Magazine magazine6 = magazineBuilder0.build();
        java.lang.String str7 = magazine6.getPublisher();
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertNotNull(magazineItemBuilder5);
        org.junit.Assert.assertNotNull(magazine6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.team4.model.user.User user4 = new org.team4.model.user.User("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:31:55 EDT 2024, dateDue=Tue Apr 30 20:31:55 EDT 2024}", "ItemPurchased{title='', email='', datePurchased=null}", "Credit Card");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder0.author("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.BookRequest bookRequest5 = bookRequestBuilder4.build();
        java.lang.String str6 = bookRequest5.getAuthor();
        java.lang.String str7 = bookRequest5.getTitle();
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str6, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getEndDate();
        java.lang.String str7 = course5.getProfessorEmail();
        java.lang.String[] strArray29 = new java.lang.String[] { "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "PayPal", "ItemPurchased{title='', email='hi!', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemPurchased{title='', email='', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        org.team4.model.user.Faculty faculty32 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "", "ItemPurchased{title='', email='', datePurchased=null}", 0L, strList30);
        org.team4.model.user.Student student33 = new org.team4.model.user.Student("", "Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}", "Mobile Wallet", "Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}", strList30);
        boolean boolean34 = course5.isEnrolled(student33);
        java.util.Date date35 = course5.getEndDate();
        org.team4.model.user.Student student41 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str42 = student41.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase43 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student41);
        student41.setType("User [email=, password=, name=hi!, type=, validated=false]");
        boolean boolean46 = course5.isEnrolled(student41);
        student41.setPassword("Debit Card");
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(date35);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.price((double) (byte) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder6.ISBN("PayPal");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = bookItemBuilder10.ISBN("Credit Card");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(bookItemBuilder12);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder6.author("Credit Card");
        org.team4.model.items.builder.BookBuilder bookBuilder10 = bookBuilder8.hasHardCopy(false);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.Book book9 = courseTextBookBuilder6.build();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator10 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) book9);
        boolean boolean11 = book9.hasSoftCopy();
        int int12 = book9.getEdition();
        java.lang.String str13 = book9.toString();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}" + "'", str13, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.lang.String str3 = subscribeNewsletter2.getEmail();
        java.lang.String str4 = subscribeNewsletter2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str3, "User [email=, password=, name=hi!, type=, validated=false]");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Sat Mar 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}" + "'", str4, "SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Sat Mar 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.util.Date date3 = subscribeNewsletter2.getDateSubscribed();
        subscribeNewsletter2.setEmail("");
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Sat Mar 30 20:32:01 EDT 2024");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder6 = courseTextBookBuilder0.quantity(0);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder10 = bookBuilder8.author("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookBuilder bookBuilder12 = bookBuilder10.hasSoftCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder14 = bookBuilder12.publisher("PayPal");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookItemBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(bookBuilder12);
        org.junit.Assert.assertNotNull(bookBuilder14);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("", "Credit Card", "", "ItemPurchased{title='', email='hi!', datePurchased=null}", (int) (byte) -1, "User [email=, password=, name=hi!, type=, validated=false]");
        java.lang.String str7 = bookRequest6.getBookType();
        java.lang.String str8 = bookRequest6.getAuthor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str7, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.yearPublished((int) (short) -1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineBuilder0.quantity((int) (byte) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder10 = magazineBuilder0.ISBN("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder12 = magazineBuilder0.price((double) 52);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
        org.junit.Assert.assertNotNull(magazineItemBuilder10);
        org.junit.Assert.assertNotNull(magazineItemBuilder12);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder35 = courseTextBookBuilder6.title("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder37 = bookItemBuilder35.ISBN("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Tue Apr 30 20:32:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 20:32:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Tue Apr 30 20:32:01 EDT 2024");
        org.junit.Assert.assertNotNull(courseTextBookBuilder33);
        org.junit.Assert.assertNotNull(bookItemBuilder35);
        org.junit.Assert.assertNotNull(bookItemBuilder37);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        java.lang.String str34 = course32.getProfessorEmail();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Tue Apr 30 20:32:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 20:32:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Tue Apr 30 20:32:01 EDT 2024");
        org.junit.Assert.assertNotNull(courseTextBookBuilder33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str34, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.title("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.title("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder3.email("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder9 = bookRequestBuilder3.author("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder11 = bookRequestBuilder9.author("PayPal");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
        org.junit.Assert.assertNotNull(bookRequestBuilder9);
        org.junit.Assert.assertNotNull(bookRequestBuilder11);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        java.lang.String str4 = magazine3.getPublisher();
        int int5 = magazine3.getIssueNumber();
        java.lang.String str6 = magazine3.getPublisher();
        java.lang.String str7 = magazine3.getPublisher();
        int int8 = magazine3.getIssueNumber();
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder4 = magazineItemBuilder2.ISBN("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineItemBuilder4.ISBN("Credit Card");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineItemBuilder6.ISBN("Credit Card");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineItemBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        java.lang.String str2 = payPal1.getMode();
        java.lang.String str3 = payPal1.toString();
        java.lang.String str4 = payPal1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Mobile Wallet" + "'", str2, "Mobile Wallet");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PayPal{email='PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}'}" + "'", str3, "PayPal{email='PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PayPal{email='PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}'}" + "'", str4, "PayPal{email='PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}'}");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", (double) (short) 0);
        double double4 = newsletter3.getPrice();
        java.lang.String str5 = newsletter3.getTitle();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str5, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
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
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter82 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str83 = subscribeNewsletter82.getEmail();
        java.util.Date date84 = subscribeNewsletter82.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter87 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str88 = subscribeNewsletter87.getTitle();
        java.util.Date date89 = null;
        subscribeNewsletter87.setDateSubscribed(date89);
        java.util.Date date91 = subscribeNewsletter87.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter92 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "", date84, date91);
        rentedItem61.setDueDate(date84);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter96 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.util.Date date97 = subscribeNewsletter96.getDateSubscribed();
        org.team4.model.items.RentedItem rentedItem98 = new org.team4.model.items.RentedItem("Debit Card", "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", date84, date97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Tue Apr 30 20:32:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Tue Apr 30 20:32:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Tue Apr 30 20:32:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Tue Apr 30 20:32:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Tue Apr 30 20:32:01 EDT 2024");
        org.junit.Assert.assertNotNull(date58);
// flaky:         org.junit.Assert.assertEquals(date58.toString(), "Tue Apr 30 20:32:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str62, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(date75);
// flaky:         org.junit.Assert.assertEquals(date75.toString(), "Tue Apr 30 20:32:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertNotNull(date84);
// flaky:         org.junit.Assert.assertEquals(date84.toString(), "Tue Apr 30 20:32:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!" + "'", str88, "hi!");
        org.junit.Assert.assertNotNull(date91);
// flaky:         org.junit.Assert.assertEquals(date91.toString(), "Tue Apr 30 20:32:01 EDT 2024");
        org.junit.Assert.assertNotNull(date97);
// flaky:         org.junit.Assert.assertEquals(date97.toString(), "Sat Mar 30 20:32:01 EDT 2024");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.team4.model.items.Item item0 = null;
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        org.team4.model.course.Course course11 = new org.team4.model.course.Course("hi!", date7, date8, "", "hi!");
        java.util.Date date12 = course11.getEndDate();
        java.lang.String str13 = course11.getProfessorEmail();
        java.lang.String[] strArray35 = new java.lang.String[] { "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "PayPal", "ItemPurchased{title='', email='hi!', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemPurchased{title='', email='', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        org.team4.model.user.Faculty faculty38 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "", "ItemPurchased{title='', email='', datePurchased=null}", 0L, strList36);
        org.team4.model.user.Student student39 = new org.team4.model.user.Student("", "Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}", "Mobile Wallet", "Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}", strList36);
        boolean boolean40 = course11.isEnrolled(student39);
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.course.CourseTextBook courseTextBook42 = new org.team4.model.course.CourseTextBook(item0, "PayPal", 52, "Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}", (int) (byte) 10, course11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"title\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("", "Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}", "Credit Card", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = bookItemBuilder8.quantity((int) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = bookItemBuilder10.ISBN("PayPal");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(bookItemBuilder12);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.ISBN("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder0.genre("");
        org.team4.model.items.builder.DVDBuilder dVDBuilder8 = dVDBuilder0.genre("Debit Card");
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDBuilder8);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
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
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
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
        java.lang.String str27 = processPayment26.toString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Credit Card" + "'", str12, "Credit Card");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(newsletter21);
        org.junit.Assert.assertNotNull(user25);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.lang.String str6 = course5.getProfessorEmail();
        java.util.Date date7 = course5.getStartDate();
        org.team4.functionality.buy.ItemPurchased itemPurchased10 = new org.team4.functionality.buy.ItemPurchased("ItemPurchased{title='', email='hi!', datePurchased=null}", "hi!");
        java.util.Date date11 = itemPurchased10.getDatePurchased();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = course5.isEnded(date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Sat Mar 30 20:32:01 EDT 2024");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.paymentmodes.CreditCard creditCard10 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) creditCard10);
        boolean boolean12 = creditCard10.notExpired();
        boolean boolean13 = creditCard10.isValid();
        java.lang.String str14 = creditCard10.getMode();
        java.lang.String str15 = creditCard10.getMode();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Credit Card" + "'", str14, "Credit Card");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Credit Card" + "'", str15, "Credit Card");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.duration((double) 1L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDItemBuilder4.ISBN("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDItemBuilder6.price((double) (byte) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder10 = dVDItemBuilder8.quantity((int) 'a');
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
        org.junit.Assert.assertNotNull(dVDItemBuilder10);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("User [email=, password=, name=hi!, type=, validated=false]", "User [email=, password=, name=hi!, type=, validated=false]", "PayPal", "PayPal", (long) (-1));
        long long6 = nonFaculty5.getUniversityID();
        boolean boolean7 = nonFaculty5.isValidated();
        java.lang.String str8 = nonFaculty5.getPassword();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str8, "User [email=, password=, name=hi!, type=, validated=false]");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook8 = courseTextBookBuilder6.build();
        java.lang.String str9 = courseTextBook8.getISBN();
        courseTextBook8.setRentable(true);
        java.lang.String str12 = courseTextBook8.getGenre();
        boolean boolean13 = courseTextBook8.hasSoftCopy();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:31:55 EDT 2024, dateDue=Tue Apr 30 20:31:55 EDT 2024}", "User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, type=PayPal, validated=true]", false);
        long long6 = faculty5.getFacultyID();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.team4.model.user.User user4 = new org.team4.model.user.User("", "hi!", "PayPal", "");
        java.lang.String str5 = user4.getPassword();
        java.lang.String str6 = user4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
        java.util.Date date71 = null;
        java.util.Date date72 = null;
        org.team4.model.course.Course course75 = new org.team4.model.course.Course("hi!", date71, date72, "", "hi!");
        org.team4.model.user.Student student80 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str81 = student80.getType();
        course75.enrollStudent(student80);
        courseTextBook68.makeCopies(student80);
        java.lang.String str84 = courseTextBook68.getPublisher();
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
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "Debit Card" + "'", str84, "Debit Card");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("Credit Card", "User [email=, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=PayPal, validated=false]", "User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, type=PayPal, validated=true]", "hi!", (int) '#', "");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder6 = magazineBuilder0.issueNumber((int) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder8 = magazineBuilder6.publisher("SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:31:55 EDT 2024, dateDue=Tue Apr 30 20:31:55 EDT 2024}");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineBuilder6);
        org.junit.Assert.assertNotNull(magazineBuilder8);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getEndDate();
        org.team4.model.user.Student student12 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str13 = student12.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase14 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student12);
        java.lang.String str15 = student12.toString();
        course5.enrollStudent(student12);
        org.team4.model.user.Student student22 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str23 = student22.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase24 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student22);
        java.lang.String str25 = student22.toString();
        java.util.ArrayList<java.lang.String> strList26 = student22.getCourses();
        boolean boolean27 = course5.isEnrolled(student22);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter32 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter32.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter32.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter39 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date40 = null;
        subscribeNewsletter39.setDateSubscribed(date40);
        java.util.Date date42 = subscribeNewsletter39.getDateDue();
        subscribeNewsletter32.setDateDue(date42);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter47 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str48 = subscribeNewsletter47.getTitle();
        java.util.Date date49 = null;
        subscribeNewsletter47.setDateSubscribed(date49);
        java.util.Date date51 = subscribeNewsletter47.getDateDue();
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
        org.team4.model.course.Course course78 = new org.team4.model.course.Course("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", date51, date59, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter79 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=null}", date42, date59);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean80 = course5.isStarted(date59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str15, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str25, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertNull(strList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 20:32:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(date51);
// flaky:         org.junit.Assert.assertEquals(date51.toString(), "Tue Apr 30 20:32:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(date59);
// flaky:         org.junit.Assert.assertEquals(date59.toString(), "Tue Apr 30 20:32:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertNotNull(date66);
// flaky:         org.junit.Assert.assertEquals(date66.toString(), "Tue Apr 30 20:32:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertNotNull(date71);
// flaky:         org.junit.Assert.assertEquals(date71.toString(), "Tue Apr 30 20:32:01 EDT 2024");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("ProcessPayment{modes=null, itemToPurchase=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}}", (int) '4', (int) (byte) 1, (double) 10, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", true, false);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "Debit Card");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.paymentmodes.DebitCard debitCard15 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete16 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) debitCard15);
        boolean boolean17 = debitCard15.notExpired();
        java.lang.String str18 = debitCard15.getMode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Debit Card" + "'", str18, "Debit Card");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD1 = dVDBuilder0.build();
        java.lang.String str2 = dVD1.getGenre();
        boolean boolean3 = dVD1.isPurchasable();
        double double4 = dVD1.getDuration();
        dVD1.setQuantity((int) (short) 1);
        dVD1.setQuantity((int) ' ');
        boolean boolean9 = dVD1.isPurchasable();
        java.lang.String str10 = dVD1.getGenre();
        org.team4.model.items.Newsletter newsletter14 = new org.team4.model.items.Newsletter("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", (double) (short) 0);
        boolean boolean15 = dVD1.equals((java.lang.Object) "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        java.lang.String str16 = dVD1.getGenre();
        org.team4.model.items.Magazine magazine19 = new org.team4.model.items.Magazine((org.team4.model.items.Item) dVD1, "", (int) (byte) 0);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.BookBuilder bookBuilder4 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.publisher("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = bookBuilder6.yearPublished(0);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder0.build();
        java.util.Date date11 = null;
        java.util.Date date12 = null;
        org.team4.model.course.Course course15 = new org.team4.model.course.Course("hi!", date11, date12, "", "hi!");
        java.util.Date date16 = course15.getEndDate();
        java.lang.String str17 = course15.getProfessorEmail();
        java.lang.String str18 = course15.getProfessorEmail();
        org.team4.model.user.Student student24 = new org.team4.model.user.Student("", "", "hi!", "");
        student24.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase27 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student24);
        java.lang.String str28 = student24.getEmail();
        course15.enrollStudent(student24);
        java.util.Date date30 = course15.getEndDate();
        boolean boolean31 = courseTextBook9.equals((java.lang.Object) course15);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(courseTextBook9);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(date30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook8 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook9 = courseTextBookBuilder6.build();
        int int10 = courseTextBook9.getNoOfPages();
        org.team4.model.course.Course course11 = courseTextBook9.getCourse();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertNotNull(courseTextBook9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(course11);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        boolean boolean4 = debitCard3.notExpired();
        boolean boolean5 = debitCard3.correctLength();
        boolean boolean6 = debitCard3.correctLength();
        boolean boolean7 = debitCard3.notExpired();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getEndDate();
        java.lang.String str7 = course5.getProfessorEmail();
        java.lang.String str8 = course5.getProfessorEmail();
        org.team4.model.user.Student student13 = new org.team4.model.user.Student("", "", "hi!", "");
        boolean boolean14 = course5.isEnrolled(student13);
        student13.setType("Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}");
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.util.Date date2 = null;
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("", "", date2);
        java.lang.String str4 = itemPurchased3.toString();
        java.lang.String str5 = itemPurchased3.getTitle();
        java.lang.String str6 = itemPurchased3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str4, "ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str6, "ItemPurchased{title='', email='', datePurchased=null}");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (-1L));
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder10 = courseTextBookBuilder0.isVirtual(false);
        org.team4.model.items.Book book11 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder13 = courseTextBookBuilder0.isVirtual(false);
        org.team4.model.items.builder.BookBuilder bookBuilder15 = courseTextBookBuilder0.author("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookBuilder bookBuilder17 = courseTextBookBuilder0.hasSoftCopy(false);
        org.team4.model.items.builder.BookBuilder bookBuilder19 = bookBuilder17.author("ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(courseTextBookBuilder10);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(courseTextBookBuilder13);
        org.junit.Assert.assertNotNull(bookBuilder15);
        org.junit.Assert.assertNotNull(bookBuilder17);
        org.junit.Assert.assertNotNull(bookBuilder19);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
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
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:31:55 EDT 2024, dateDue=Tue Apr 30 20:31:55 EDT 2024}", 97, (int) (byte) 100, 0.0d, "ItemPurchased{title='', email='hi!', datePurchased=null}", true, false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.title("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.title("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder5.author("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder9 = bookRequestBuilder5.title("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
        org.junit.Assert.assertNotNull(bookRequestBuilder9);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("PayPal", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:31:55 EDT 2024, dateDue=Tue Apr 30 20:31:55 EDT 2024}", 2135605L);
        boolean boolean6 = nonFaculty5.isValidated();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
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
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder53 = bookBuilder51.ISBN("ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}");
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
        org.junit.Assert.assertNotNull(bookItemBuilder53);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("PayPal{email='PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}'}", "PayPal", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
        long long26 = manager18.getManagerID();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.paymentmodes.DebitCard debitCard15 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete16 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) debitCard15);
        org.team4.model.items.Item item17 = purchaseComplete16.getItem();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
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
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter34 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter34.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter34.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter41 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date42 = null;
        subscribeNewsletter41.setDateSubscribed(date42);
        java.util.Date date44 = subscribeNewsletter41.getDateDue();
        subscribeNewsletter34.setDateDue(date44);
        java.util.Date date46 = subscribeNewsletter34.getDateSubscribed();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter49 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str50 = subscribeNewsletter49.getEmail();
        java.util.Date date51 = subscribeNewsletter49.getDateDue();
        subscribeNewsletter34.setDateSubscribed(date51);
        java.util.Date date53 = subscribeNewsletter34.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter58 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str59 = subscribeNewsletter58.getEmail();
        java.util.Date date60 = subscribeNewsletter58.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter63 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str64 = subscribeNewsletter63.getEmail();
        java.util.Date date65 = subscribeNewsletter63.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter66 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date60, date65);
        subscribeNewsletter34.setDateDue(date60);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean68 = course20.isEnded(date60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Tue Apr 30 20:32:01 EDT 2024");
        org.junit.Assert.assertNotNull(date46);
// flaky:         org.junit.Assert.assertEquals(date46.toString(), "Sat Mar 30 20:32:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(date51);
// flaky:         org.junit.Assert.assertEquals(date51.toString(), "Tue Apr 30 20:32:01 EDT 2024");
        org.junit.Assert.assertNotNull(date53);
// flaky:         org.junit.Assert.assertEquals(date53.toString(), "Tue Apr 30 20:32:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(date60);
// flaky:         org.junit.Assert.assertEquals(date60.toString(), "Tue Apr 30 20:32:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertNotNull(date65);
// flaky:         org.junit.Assert.assertEquals(date65.toString(), "Tue Apr 30 20:32:01 EDT 2024");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.team4.model.user.User user5 = new org.team4.model.user.User("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "ProcessPayment{modes=null, itemToPurchase=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}}", "SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Sat Mar 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}", "", true);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.yearPublished((int) (short) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder8 = magazineBuilder0.issueNumber(100);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder10 = magazineBuilder8.publisher("Debit Card");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder12 = magazineBuilder8.ISBN("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder14 = magazineItemBuilder12.ISBN("Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineBuilder8);
        org.junit.Assert.assertNotNull(magazineBuilder10);
        org.junit.Assert.assertNotNull(magazineItemBuilder12);
        org.junit.Assert.assertNotNull(magazineItemBuilder14);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
        org.team4.model.user.User user30 = itemToPurchase29.getUser();
        java.lang.String str31 = user30.toString();
        java.lang.String str32 = user30.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(dVD6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(item16);
        org.junit.Assert.assertNotNull(user30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "User [email=, password=, name=hi!, type=hi!, validated=false]" + "'", str31, "User [email=, password=, name=hi!, type=hi!, validated=false]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "User [email=, password=, name=hi!, type=hi!, validated=false]" + "'", str32, "User [email=, password=, name=hi!, type=hi!, validated=false]");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
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
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator47 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) purchasableItemDecorator45);
        boolean boolean48 = purchasableItemDecorator45.isPurchasable();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Tue Apr 30 20:32:02 EDT 2024");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 30 20:32:02 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 20:32:02 EDT 2024");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
        org.team4.model.user.User user17 = new org.team4.model.user.User("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase18 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) courseTextBook8, user17);
        org.team4.model.items.Newsletter newsletter19 = itemToPurchase18.getNewsletter();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertNotNull(studentList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(studentList11);
        org.junit.Assert.assertNull(course12);
        org.junit.Assert.assertNull(newsletter19);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder6.yearPublished((int) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder6.quantity((-1));
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = courseTextBookBuilder6.price((double) 100L);
        org.team4.model.items.builder.BookBuilder bookBuilder14 = courseTextBookBuilder6.hasHardCopy(false);
        org.team4.model.items.builder.BookBuilder bookBuilder16 = bookBuilder14.publisher("SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}");
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
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("Mobile Wallet", "ItemPurchased{title='', email='hi!', datePurchased=null}", "Debit Card", "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}", (long) ' ');
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "Credit Card", (int) '4', "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}");
        int int7 = bookRequest6.getEdition();
        int int8 = bookRequest6.getEdition();
        java.lang.String str9 = bookRequest6.getAuthor();
        java.lang.String str10 = bookRequest6.getAuthor();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str9, "ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str10, "ItemPurchased{title='', email='hi!', datePurchased=null}");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
        java.lang.String str99 = rentedItem59.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Apr 30 20:32:02 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Tue Apr 30 20:32:02 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 20:32:02 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Apr 30 20:32:02 EDT 2024");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 20:32:02 EDT 2024");
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Tue Apr 30 20:32:02 EDT 2024");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str60, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertNotNull(date73);
// flaky:         org.junit.Assert.assertEquals(date73.toString(), "Tue Apr 30 20:32:02 EDT 2024");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertNotNull(date83);
// flaky:         org.junit.Assert.assertEquals(date83.toString(), "Tue Apr 30 20:32:02 EDT 2024");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "hi!" + "'", str94, "hi!");
        org.junit.Assert.assertNotNull(date95);
// flaky:         org.junit.Assert.assertEquals(date95.toString(), "Tue Apr 30 20:32:02 EDT 2024");
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" + "'", str98, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}" + "'", str99, "ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
        java.lang.String str35 = courseTextBook34.getTitle();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Tue Apr 30 20:32:02 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 20:32:02 EDT 2024");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Tue Apr 30 20:32:02 EDT 2024");
        org.junit.Assert.assertNotNull(courseTextBookBuilder33);
        org.junit.Assert.assertNotNull(courseTextBook34);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemPurchased{title='', email='', datePurchased=null}", "", "User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase((double) 1232147L, (org.team4.model.user.User) faculty5);
        long long7 = faculty5.getFacultyID();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", (int) (short) 10, 32);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 32");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.team4.model.user.Manager manager6 = new org.team4.model.user.Manager("", "", "", "", 0L);
        long long7 = manager6.getManagerID();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase8 = new org.team4.functionality.buy.ItemToPurchase((double) 32, (org.team4.model.user.User) manager6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder6 = courseTextBookBuilder0.quantity(0);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder10 = bookBuilder8.hasSoftCopy(false);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = bookBuilder8.quantity((int) (short) 100);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookItemBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(bookItemBuilder12);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.yearPublished((int) (short) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder8 = magazineBuilder0.issueNumber(100);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder10 = magazineBuilder8.publisher("Debit Card");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder12 = magazineBuilder8.publisher("");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineBuilder8);
        org.junit.Assert.assertNotNull(magazineBuilder10);
        org.junit.Assert.assertNotNull(magazineBuilder12);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", 52, 100);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.paymentmodes.CreditCard creditCard10 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) creditCard10);
        long long12 = purchaseComplete11.getPurchaseID();
        org.team4.model.user.User user13 = purchaseComplete11.getUser();
        long long14 = purchaseComplete11.getPurchaseID();
        long long15 = purchaseComplete11.getPurchaseID();
        org.team4.model.items.Item item16 = purchaseComplete11.getItem();
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1402492L + "'", long12 == 1402492L);
        org.junit.Assert.assertNotNull(user13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1402492L + "'", long14 == 1402492L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1402492L + "'", long15 == 1402492L);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.booktype("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder5.ISBN("PayPal");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder9 = bookRequestBuilder7.author("User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
        org.junit.Assert.assertNotNull(bookRequestBuilder9);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        boolean boolean8 = book7.isRentable();
        int int9 = book7.getNoOfPages();
        boolean boolean10 = book7.hasHardCopy();
        book7.setQuantity((int) (short) 10);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder3 = bookRequestBuilder0.ISBN("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder5 = bookRequestBuilder3.booktype("Credit Card");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder7 = bookRequestBuilder3.ISBN("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder9 = bookRequestBuilder7.edition((int) (short) 10);
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder11 = bookRequestBuilder9.booktype("Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}");
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestBuilder3);
        org.junit.Assert.assertNotNull(bookRequestBuilder5);
        org.junit.Assert.assertNotNull(bookRequestBuilder7);
        org.junit.Assert.assertNotNull(bookRequestBuilder9);
        org.junit.Assert.assertNotNull(bookRequestBuilder11);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.lang.String[] strArray32 = new java.lang.String[] { "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "PayPal", "ItemPurchased{title='', email='hi!', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemPurchased{title='', email='', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        org.team4.model.user.Faculty faculty35 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "", "ItemPurchased{title='', email='', datePurchased=null}", 0L, strList33);
        org.team4.model.user.Faculty faculty36 = new org.team4.model.user.Faculty("hi!", "", "Credit Card", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", (long) '#', strList33);
        org.team4.model.user.Faculty faculty37 = new org.team4.model.user.Faculty("hi!", "ItemPurchased{title='', email='hi!', datePurchased=null}", "Credit Card", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", (long) 10, strList33);
        org.team4.model.user.Faculty faculty38 = new org.team4.model.user.Faculty("", "User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, type=PayPal, validated=true]", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}", 5890207L, strList33);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
        boolean boolean20 = book9.isRentable();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        boolean boolean4 = creditCard3.notExpired();
        boolean boolean5 = creditCard3.isValid();
        java.lang.String str6 = creditCard3.getMode();
        boolean boolean7 = creditCard3.correctLength();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credit Card" + "'", str6, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
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
        org.team4.model.paymentmodes.CreditCard creditCard14 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        boolean boolean15 = creditCard14.notExpired();
        boolean boolean16 = creditCard14.isValid();
        boolean boolean17 = creditCard14.isValid();
        boolean boolean18 = book9.equals((java.lang.Object) creditCard14);
        org.team4.model.user.Student student24 = new org.team4.model.user.Student("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "Mobile Wallet", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}", false);
        java.util.Date date26 = null;
        java.util.Date date27 = null;
        org.team4.model.course.Course course30 = new org.team4.model.course.Course("hi!", date26, date27, "", "hi!");
        java.util.Date date31 = course30.getEndDate();
        java.lang.String str32 = course30.getProfessorEmail();
        java.lang.String str33 = course30.getProfessorEmail();
        org.team4.model.user.Student student39 = new org.team4.model.user.Student("", "", "hi!", "");
        student39.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase42 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student39);
        java.lang.String str43 = student39.getEmail();
        course30.enrollStudent(student39);
        org.team4.model.user.Faculty faculty50 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "hi!", "", "", false);
        faculty50.setFacultyID((long) (byte) 1);
        org.team4.model.user.Student student57 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str58 = student57.getType();
        java.lang.String[] strArray60 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        student57.setCourses(strList61);
        faculty50.setCourses(strList61);
        student39.setCourses(strList61);
        student24.setCourses(strList61);
        boolean boolean67 = book9.equals((java.lang.Object) student24);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(date31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
        boolean boolean41 = debitCard3.notExpired();
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.BookRequest bookRequest1 = bookRequestBuilder0.build();
        java.lang.String str2 = bookRequest1.getTitle();
        java.lang.String str3 = bookRequest1.getAuthor();
        org.junit.Assert.assertNotNull(bookRequest1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator21 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) dVD20);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.team4.model.user.User user4 = new org.team4.model.user.User("Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}", "User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, type=PayPal, validated=true]", "", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.quantity((int) (short) 100);
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder0.hasSoftCopy(false);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}", "User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, type=PayPal, validated=true]", "PayPal{email='PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}'}", 97, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.team4.model.user.User user5 = new org.team4.model.user.User("", "Debit Card", "SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}', email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', dateSubscribed=Sat Mar 30 20:32:00 EDT 2024, dateDue=Tue Apr 30 20:32:00 EDT 2024}", "PayPal{email='PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}'}", true);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.paymentmodes.CreditCard creditCard10 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) creditCard10);
        org.team4.model.items.Item item12 = purchaseComplete11.getItem();
        org.team4.model.user.User user13 = purchaseComplete11.getUser();
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(user13);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter4 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date5 = null;
        subscribeNewsletter4.setDateSubscribed(date5);
        java.util.Date date7 = subscribeNewsletter4.getDateDue();
        org.team4.functionality.buy.ItemPurchased itemPurchased8 = new org.team4.functionality.buy.ItemPurchased("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", date7);
        java.lang.String str9 = itemPurchased8.getTitle();
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Tue Apr 30 20:32:02 EDT 2024");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}" + "'", str9, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
        org.team4.model.user.Student student22 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str23 = student22.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase24 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student22);
        java.lang.String str25 = student22.toString();
        java.lang.String str26 = student22.getEmail();
        java.lang.String str27 = student22.toString();
        course14.enrollStudent(student22);
        student22.setType("User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, type=PayPal, validated=true]");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNotNull(courseTextBookBuilder16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str25, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str27, "User [email=, password=, name=hi!, type=, validated=false]");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}");
        org.team4.model.items.BookRequest bookRequest3 = bookRequestBuilder0.build();
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequest3);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("", (int) (byte) 100, 1);
        boolean boolean4 = creditCard3.notExpired();
        boolean boolean5 = creditCard3.isValid();
        boolean boolean6 = creditCard3.notExpired();
        boolean boolean7 = creditCard3.correctLength();
        boolean boolean8 = creditCard3.correctLength();
        boolean boolean9 = creditCard3.correctLength();
        java.lang.String str10 = creditCard3.getMode();
        boolean boolean11 = creditCard3.correctLength();
        boolean boolean12 = creditCard3.correctLength();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Credit Card" + "'", str10, "Credit Card");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("User [email=, password=, name=hi!, type=, validated=false]", "User [email=, password=, name=hi!, type=, validated=false]", "PayPal", "PayPal", (long) (-1));
        nonFaculty5.setName("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:59 EDT 2024, dateDue=Tue Apr 30 20:31:59 EDT 2024}");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "ItemPurchased{title='ItemPurchased{title='', email='', datePurchased=null}', email='ItemPurchased{title='', email='', datePurchased=null}', datePurchased=Sat Mar 30 20:31:55 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}", (long) (short) -1);
        java.lang.Class<?> wildcardClass6 = nonFaculty5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str3 = subscribeNewsletter2.getTitle();
        java.util.Date date4 = null;
        subscribeNewsletter2.setDateSubscribed(date4);
        java.lang.String str6 = subscribeNewsletter2.getTitle();
        java.lang.String str7 = subscribeNewsletter2.getTitle();
        subscribeNewsletter2.setTitle("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}");
        java.lang.String str10 = subscribeNewsletter2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}', email='hi!', dateSubscribed=null, dateDue=Tue Apr 30 20:32:02 EDT 2024}" + "'", str10, "SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}', email='hi!', dateSubscribed=null, dateDue=Tue Apr 30 20:32:02 EDT 2024}");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
        java.lang.String str21 = dVD20.getGenre();
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}" + "'", str21, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.team4.model.user.User user4 = new org.team4.model.user.User("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "", "ItemPurchased{title='', email='hi!', datePurchased=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}");
        user4.setPassword("Credit Card");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", 0.0d);
        java.lang.String str4 = newsletter3.getLink();
        java.lang.String str5 = newsletter3.getTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}" + "'", str4, "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.DVD dVD10 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Credit Card", 0.0d);
        int int11 = book7.getNoOfPages();
        java.lang.String str12 = book7.getAuthor();
        int int13 = book7.getYearPublished();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.course.CourseTextBook courseTextBook8 = courseTextBookBuilder6.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder6.ISBN("Credit Card");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = dVDBuilder0.genre("PayPal");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.ISBN("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder0.genre("");
        org.team4.model.items.builder.DVDBuilder dVDBuilder8 = dVDBuilder0.duration((double) (-1.0f));
        org.team4.model.items.builder.DVDBuilder dVDBuilder10 = dVDBuilder0.genre("User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, type=PayPal, validated=true]");
        org.team4.model.items.DVD dVD11 = dVDBuilder10.build();
        java.lang.String str12 = dVD11.getGenre();
        org.junit.Assert.assertNotNull(dVDBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDBuilder8);
        org.junit.Assert.assertNotNull(dVDBuilder10);
        org.junit.Assert.assertNotNull(dVD11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, type=PayPal, validated=true]" + "'", str12, "User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, type=PayPal, validated=true]");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.DVD dVD10 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Credit Card", 0.0d);
        book7.setPurchaseable(false);
        java.lang.String str13 = book7.getGenre();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("User [email=PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}, password=ItemPurchased{title='', email='hi!', datePurchased=null}, name=ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}, type=PayPal, validated=true]", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:31:55 EDT 2024, dateDue=Tue Apr 30 20:31:55 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=PayPal, type=, validated=false], newsletter=null}", 0L);
        java.lang.String str6 = nonFaculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]" + "'", str6, "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
        student12.setPassword("User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]");
        java.lang.String str20 = student12.getPassword();
        java.lang.String str21 = student12.getName();
        student12.setPassword("Debit Card");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str16, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertNull(strList17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]" + "'", str20, "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("", 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}", "User [email=, password=, name=PayPal, type=ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "Debit Card", true);
        student5.setName("Mobile Wallet");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str3 = subscribeNewsletter2.getEmail();
        java.lang.String str4 = subscribeNewsletter2.toString();
        subscribeNewsletter2.setEmail("Credit Card");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter11 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str12 = subscribeNewsletter11.getEmail();
        java.util.Date date13 = subscribeNewsletter11.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter16 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str17 = subscribeNewsletter16.getEmail();
        java.util.Date date18 = subscribeNewsletter16.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter19 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date13, date18);
        subscribeNewsletter2.setDateSubscribed(date18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:02 EDT 2024, dateDue=Tue Apr 30 20:32:02 EDT 2024}" + "'", str4, "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:02 EDT 2024, dateDue=Tue Apr 30 20:32:02 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Tue Apr 30 20:32:02 EDT 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Tue Apr 30 20:32:02 EDT 2024");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("hi!", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getEndDate();
        java.lang.String str7 = course5.getProfessorEmail();
        java.lang.String[] strArray29 = new java.lang.String[] { "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "PayPal", "ItemPurchased{title='', email='hi!', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "ItemPurchased{title='', email='', datePurchased=null}", "", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        org.team4.model.user.Faculty faculty32 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:49 EDT 2024, dateDue=Tue Apr 30 20:31:49 EDT 2024}", "", "ItemPurchased{title='', email='', datePurchased=null}", 0L, strList30);
        org.team4.model.user.Student student33 = new org.team4.model.user.Student("", "Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}", "Mobile Wallet", "Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}", strList30);
        boolean boolean34 = course5.isEnrolled(student33);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter37 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter37.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter37.setTitle("PayPal");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter44 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        java.util.Date date45 = null;
        subscribeNewsletter44.setDateSubscribed(date45);
        java.util.Date date47 = subscribeNewsletter44.getDateDue();
        subscribeNewsletter37.setDateDue(date47);
        java.util.Date date49 = subscribeNewsletter37.getDateDue();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean50 = course5.isStarted(date49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(date47);
// flaky:         org.junit.Assert.assertEquals(date47.toString(), "Tue Apr 30 20:32:02 EDT 2024");
        org.junit.Assert.assertNotNull(date49);
// flaky:         org.junit.Assert.assertEquals(date49.toString(), "Tue Apr 30 20:32:02 EDT 2024");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        boolean boolean14 = book7.isRentable();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        boolean boolean2 = payPal1.isValid();
        java.lang.String str3 = payPal1.toString();
        boolean boolean4 = payPal1.isValid();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}" + "'", str3, "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
        java.lang.String str85 = subscribeNewsletter84.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Tue Apr 30 20:32:02 EDT 2024");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Tue Apr 30 20:32:02 EDT 2024");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Tue Apr 30 20:32:02 EDT 2024");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(date34);
// flaky:         org.junit.Assert.assertEquals(date34.toString(), "Tue Apr 30 20:32:02 EDT 2024");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(date50);
// flaky:         org.junit.Assert.assertEquals(date50.toString(), "Tue Apr 30 20:32:02 EDT 2024");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(date63);
// flaky:         org.junit.Assert.assertEquals(date63.toString(), "Tue Apr 30 20:32:02 EDT 2024");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertNotNull(date70);
// flaky:         org.junit.Assert.assertEquals(date70.toString(), "Tue Apr 30 20:32:02 EDT 2024");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertNotNull(date75);
// flaky:         org.junit.Assert.assertEquals(date75.toString(), "Tue Apr 30 20:32:02 EDT 2024");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "ItemPurchased{title='', email='', datePurchased=null}" + "'", str85, "ItemPurchased{title='', email='', datePurchased=null}");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("", "hi!", "", "");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        double double7 = itemToPurchase6.getAmount();
        org.team4.model.items.Item item8 = itemToPurchase6.getItem();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.team4.model.user.User user5 = new org.team4.model.user.User("SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:02 EDT 2024, dateDue=Tue Apr 30 20:32:02 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:32:02 EDT 2024, dateDue=Tue Apr 30 20:32:02 EDT 2024}", "SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Sat Mar 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}", false);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder6 = courseTextBookBuilder0.quantity(0);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.DVDBuilder dVDBuilder9 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.DVD dVD10 = dVDBuilder9.build();
        java.lang.String str11 = dVD10.getGenre();
        boolean boolean12 = dVD10.isPurchasable();
        double double13 = dVD10.getDuration();
        dVD10.setQuantity((int) (short) 1);
        dVD10.setQuantity((int) ' ');
        boolean boolean18 = dVD10.isPurchasable();
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator19 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) dVD10);
        org.team4.model.items.Item item20 = rentableItemDecorator19.getItem();
        org.team4.model.items.Item item21 = new org.team4.model.items.Item(item20);
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
        org.team4.model.course.CourseTextBook courseTextBook52 = new org.team4.model.course.CourseTextBook(item21, "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", (int) (short) 1, "hi!", "PayPal", 52, course50, false);
        org.team4.model.course.Course course53 = courseTextBook52.getCourse();
        org.team4.model.course.Course course54 = courseTextBook52.getCourse();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder55 = courseTextBookBuilder0.course(course54);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder57 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder59 = courseTextBookBuilder0.title("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookItemBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(dVD10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(item20);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(date34);
// flaky:         org.junit.Assert.assertEquals(date34.toString(), "Tue Apr 30 20:32:02 EDT 2024");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(date41);
// flaky:         org.junit.Assert.assertEquals(date41.toString(), "Tue Apr 30 20:32:02 EDT 2024");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(date46);
// flaky:         org.junit.Assert.assertEquals(date46.toString(), "Tue Apr 30 20:32:02 EDT 2024");
        org.junit.Assert.assertNotNull(course53);
        org.junit.Assert.assertNotNull(course54);
        org.junit.Assert.assertNotNull(courseTextBookBuilder55);
        org.junit.Assert.assertNotNull(courseTextBookBuilder57);
        org.junit.Assert.assertNotNull(bookItemBuilder59);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("User [email=, password=, name=hi!, type=, validated=false]", (int) 'a', (int) (short) -1, (double) (short) -1, "PayPal", true, false);
        java.lang.String str8 = item7.getISBN();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PayPal" + "'", str8, "PayPal");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}");
        java.lang.String str2 = mobileWallet1.getMode();
        boolean boolean3 = mobileWallet1.isValid();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PayPal" + "'", str2, "PayPal");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str6 = student5.getType();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) 10, (org.team4.model.user.User) student5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.paymentmodes.MobileWallet mobileWallet10 = new org.team4.model.paymentmodes.MobileWallet("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.buy.PurchaseComplete purchaseComplete11 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase7, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet10);
        org.team4.model.user.User user12 = purchaseComplete11.getUser();
        org.team4.model.items.Item item13 = purchaseComplete11.getItem();
        long long14 = purchaseComplete11.getPurchaseID();
        org.team4.model.user.User user15 = purchaseComplete11.getUser();
        long long16 = purchaseComplete11.getPurchaseID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNull(item13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 657285L + "'", long14 == 657285L);
        org.junit.Assert.assertNotNull(user15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 657285L + "'", long16 == 657285L);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
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
        item11.setQuantity((int) (byte) -1);
        boolean boolean14 = item11.isPurchasable();
        item11.setQuantity((int) (short) 10);
        org.junit.Assert.assertNotNull(dVD1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(item11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.Book book7 = courseTextBookBuilder6.build();
        org.team4.model.items.DVD dVD10 = new org.team4.model.items.DVD((org.team4.model.items.Item) book7, "Credit Card", 0.0d);
        int int11 = book7.getNoOfPages();
        boolean boolean12 = book7.hasHardCopy();
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator13 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) book7);
        java.lang.String str14 = book7.getISBN();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
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
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", "User [email=, password=, name=hi!, type=, validated=false]", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:54 EDT 2024, dateDue=Tue Apr 30 20:31:54 EDT 2024}", "ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", true);
        long long6 = nonFaculty5.getUniversityID();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("Debit Card");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
        java.util.Date date37 = null;
        java.util.Date date38 = null;
        org.team4.model.course.Course course41 = new org.team4.model.course.Course("hi!", date37, date38, "", "hi!");
        org.team4.model.user.Student student46 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str47 = student46.getType();
        course41.enrollStudent(student46);
        java.lang.String str49 = course41.getCourseName();
        java.lang.String str50 = course41.getCourseTextBookISBN();
        java.lang.String str51 = course41.getCourseName();
        java.util.Date date53 = null;
        java.util.Date date54 = null;
        org.team4.model.course.Course course57 = new org.team4.model.course.Course("hi!", date53, date54, "", "hi!");
        org.team4.model.user.Student student62 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str63 = student62.getType();
        course57.enrollStudent(student62);
        java.lang.String str65 = course57.getProfessorEmail();
        java.lang.String str66 = course57.getProfessorEmail();
        java.lang.String str67 = course57.getCourseTextBookISBN();
        org.team4.model.user.Student student73 = new org.team4.model.user.Student("Credit Card", "Credit Card", "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemPurchased{title='', email='', datePurchased=null}", true);
        course57.enrollStudent(student73);
        course41.enrollStudent(student73);
        courseTextBook34.makeCopies(student73);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Tue Apr 30 20:32:03 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 30 20:32:03 EDT 2024");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Tue Apr 30 20:32:03 EDT 2024");
        org.junit.Assert.assertNotNull(courseTextBookBuilder33);
        org.junit.Assert.assertNotNull(courseTextBook34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder0.price((double) (short) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder0.price((double) 10);
        org.team4.model.course.CourseTextBook courseTextBook11 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder13 = courseTextBookBuilder0.genre("User [email=, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=PayPal, validated=false]");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(courseTextBook11);
        org.junit.Assert.assertNotNull(bookBuilder13);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("ItemPurchased{title='', email='', datePurchased=null}", "PayPal{email='PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}'}", "SubscribeNewsletter{title='PayPal', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:31:55 EDT 2024, dateDue=Tue Apr 30 20:31:55 EDT 2024}", "SubscribeNewsletter{title='SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}', email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}', dateSubscribed=Sat Mar 30 20:32:00 EDT 2024, dateDue=Tue Apr 30 20:32:00 EDT 2024}", true);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("Credit Card");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", 0.0d);
        org.team4.model.user.Manager manager9 = new org.team4.model.user.Manager("ItemToPurchase{item=null, user=User [email=, password=, name=hi!, type=, validated=false], newsletter=null}", "hi!", "User [email=, password=, name=hi!, type=, validated=false]", "PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}", false);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase10 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) manager9);
        java.util.Date date12 = null;
        java.util.Date date13 = null;
        org.team4.model.course.Course course16 = new org.team4.model.course.Course("hi!", date12, date13, "", "hi!");
        java.util.Date date17 = course16.getEndDate();
        java.lang.String str18 = course16.getProfessorEmail();
        java.lang.String str19 = course16.getProfessorEmail();
        org.team4.model.user.Student student25 = new org.team4.model.user.Student("", "", "hi!", "");
        student25.setEmail("");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase28 = new org.team4.functionality.buy.ItemToPurchase((double) 0, (org.team4.model.user.User) student25);
        java.lang.String str29 = student25.getEmail();
        course16.enrollStudent(student25);
        org.team4.model.user.Faculty faculty36 = new org.team4.model.user.Faculty("User [email=, password=, name=hi!, type=, validated=false]", "hi!", "", "", false);
        faculty36.setFacultyID((long) (byte) 1);
        org.team4.model.user.Student student43 = new org.team4.model.user.Student("", "", "hi!", "");
        java.lang.String str44 = student43.getType();
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        student43.setCourses(strList47);
        faculty36.setCourses(strList47);
        student25.setCourses(strList47);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase52 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) student25);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.ISBN("hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder6 = courseTextBookBuilder0.isVirtual(true);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder6.author("Credit Card");
        org.team4.model.items.builder.BookBuilder bookBuilder10 = courseTextBookBuilder6.edition((int) ' ');
        org.team4.model.items.builder.BookBuilder bookBuilder12 = bookBuilder10.author("ItemPurchased{title='', email='', datePurchased=null}");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
        org.junit.Assert.assertNotNull(bookBuilder12);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        java.lang.String str23 = debitCard3.getMode();
        java.lang.String str24 = debitCard3.getMode();
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Debit Card" + "'", str23, "Debit Card");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Debit Card" + "'", str24, "Debit Card");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Sat Mar 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}", "SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Sat Mar 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}", "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}", "", false);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.Magazine magazine3 = magazineBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder5 = magazineBuilder0.ISBN("hi!");
        org.team4.model.items.Magazine magazine6 = magazineBuilder0.build();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder8 = magazineBuilder0.issueNumber(32);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazine3);
        org.junit.Assert.assertNotNull(magazineItemBuilder5);
        org.junit.Assert.assertNotNull(magazine6);
        org.junit.Assert.assertNotNull(magazineBuilder8);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter4 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "User [email=, password=, name=hi!, type=, validated=false]");
        subscribeNewsletter4.setTitle("User [email=, password=, name=hi!, type=, validated=false]");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter10 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str11 = subscribeNewsletter10.getTitle();
        java.util.Date date12 = null;
        subscribeNewsletter10.setDateSubscribed(date12);
        java.util.Date date14 = subscribeNewsletter10.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter19 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str20 = subscribeNewsletter19.getEmail();
        java.util.Date date21 = subscribeNewsletter19.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter24 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!");
        java.lang.String str25 = subscribeNewsletter24.getEmail();
        java.util.Date date26 = subscribeNewsletter24.getDateDue();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter27 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "hi!", date21, date26);
        org.team4.model.course.Course course30 = new org.team4.model.course.Course("ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}", date14, date26, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}");
        subscribeNewsletter4.setDateSubscribed(date14);
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
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter56 = new org.team4.functionality.subscriptions.SubscribeNewsletter("Book{genre='null', noOfPages=0, author='null', ISBN=hi!, publisher='', edition='0'}", "SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}", date14, date39);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Tue Apr 30 20:32:03 EDT 2024");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Tue Apr 30 20:32:03 EDT 2024");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(date26);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Tue Apr 30 20:32:03 EDT 2024");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Tue Apr 30 20:32:03 EDT 2024");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(date46);
// flaky:         org.junit.Assert.assertEquals(date46.toString(), "Tue Apr 30 20:32:03 EDT 2024");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(date51);
// flaky:         org.junit.Assert.assertEquals(date51.toString(), "Tue Apr 30 20:32:03 EDT 2024");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("User [email=, password=, name=hi!, type=hi!, validated=false]", "PayPal{email='User [email=, password=, name=hi!, type=, validated=false]'}", "User [email=, password=SubscribeNewsletter{title='hi!', email='hi!', dateSubscribed=Sat Mar 30 20:31:48 EDT 2024, dateDue=Tue Apr 30 20:31:48 EDT 2024}, name=ItemPurchased{title='', email='', datePurchased=null}, type=PayPal, validated=false]", "");
        long long5 = nonFaculty4.getUniversityID();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("ItemPurchased{title='', email='', datePurchased=null}", (int) (short) -1, 0, (double) 'a', "Book{genre='hi!', noOfPages=32, author='', ISBN=null, publisher='ItemPurchased{title='', email='', datePurchased=null}', edition='1'}", true, false);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
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
        java.lang.String str42 = course5.getCourseTextBookISBN();
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
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("", "User [email=, password=, name=hi!, type=, validated=false]", "", "Credit Card", 1, "Book{genre='PayPal', noOfPages=32, author='ItemPurchased{title='', email='', datePurchased=null}', ISBN=hi!, publisher='Credit Card', edition='100'}");
        java.lang.String str7 = bookRequest6.getAuthor();
        java.lang.String str8 = bookRequest6.getEmail();
        java.lang.String str9 = bookRequest6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
        int int24 = dVD23.getYearPublished();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(courseTextBook8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.price((double) (byte) 0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.issueNumber(0);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder6 = magazineBuilder4.issueNumber(32);
        org.team4.model.items.Magazine magazine7 = magazineBuilder4.build();
        java.lang.String str8 = magazine7.getPublisher();
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineBuilder6);
        org.junit.Assert.assertNotNull(magazine7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
        java.lang.String str23 = subscribeNewsletter2.getEmail();
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Tue Apr 30 20:32:03 EDT 2024");
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Sat Mar 30 20:32:03 EDT 2024");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Tue Apr 30 20:32:03 EDT 2024");
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Tue Apr 30 20:32:03 EDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str22, "User [email=, password=, name=hi!, type=, validated=false]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "User [email=, password=, name=hi!, type=, validated=false]" + "'", str23, "User [email=, password=, name=hi!, type=, validated=false]");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder61 = bookBuilder59.ISBN("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder63 = bookItemBuilder61.title("SubscribeNewsletter{title='', email='User [email=, password=, name=hi!, type=, validated=false]', dateSubscribed=Tue Apr 30 20:32:01 EDT 2024, dateDue=Tue Apr 30 20:32:01 EDT 2024}");
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
        org.junit.Assert.assertNotNull(bookItemBuilder63);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("hi!", (int) (short) 1, 1);
        boolean boolean4 = debitCard3.correctLength();
        boolean boolean5 = debitCard3.isValid();
        boolean boolean6 = debitCard3.notExpired();
        boolean boolean7 = debitCard3.isValid();
        boolean boolean8 = debitCard3.correctLength();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.publisher("");
        org.team4.model.items.builder.BookBuilder bookBuilder4 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder0.publisher("PayPal{email='ItemToPurchase{item=null, user=User [email=, password=hi!, name=, type=, validated=false], newsletter=null}'}");
        org.team4.model.items.Book book7 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder9 = courseTextBookBuilder0.hasHardCopy(true);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(bookBuilder9);
    }
}
