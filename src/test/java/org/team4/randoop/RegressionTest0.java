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
        org.team4.functionality.recommendation.GenreRecommendationStrategy genreRecommendationStrategy0 = new org.team4.functionality.recommendation.GenreRecommendationStrategy();
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
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
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.team4.functionality.recommendation.TitleRecommendationStrategy titleRecommendationStrategy0 = new org.team4.functionality.recommendation.TitleRecommendationStrategy();
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.util.ArrayList<java.lang.String> strList0 = org.team4.model.paymentmodes.PaymentModes.MODE;
        org.junit.Assert.assertNotNull(strList0);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase0 = null;
        org.team4.model.paymentmodes.PaymentValidator paymentValidator1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.team4.functionality.buy.PurchaseComplete purchaseComplete2 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase0, paymentValidator1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.team4.functionality.buy.ItemToPurchase.getUser()\" because \"itemToPurchase\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.team4.model.user.User user5 = new org.team4.model.user.User("hi!", "", "hi!", "", true);
        user5.setPassword("hi!");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.team4.model.items.Item item0 = null;
        org.team4.model.course.Course course6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.course.CourseTextBook courseTextBook8 = new org.team4.model.course.CourseTextBook(item0, "hi!", (int) (byte) 100, "hi!", "hi!", (int) (byte) 100, course6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"title\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        boolean boolean2 = courseTextBook1.isPurchasable();
        boolean boolean3 = courseTextBook1.hasHardCopy();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("", date1, date2, "hi!", "hi!");
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
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder2 = dVDBuilder0.price((double) (-1.0f));
        java.lang.Class<?> wildcardClass3 = dVDBuilder0.getClass();
        org.junit.Assert.assertNotNull(dVDItemBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getStartDate();
        org.team4.model.user.Student student12 = new org.team4.model.user.Student("hi!", "hi!", "", "", true);
        boolean boolean13 = course5.isEnrolled(student12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = course5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.toString()\" because \"this.startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("", date1, date2, "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = course5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.toString()\" because \"this.startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.team4.utils.EmailValidator emailValidator0 = new org.team4.utils.EmailValidator();
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.team4.functionality.recommendation.PublisherRecommendationStrategy publisherRecommendationStrategy0 = new org.team4.functionality.recommendation.PublisherRecommendationStrategy();
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.team4.functionality.recommendation.AuthorRecommendationStrategy authorRecommendationStrategy0 = new org.team4.functionality.recommendation.AuthorRecommendationStrategy();
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.util.Date date2 = null;
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", date2);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("", "", "hi!", "hi!", true);
        java.util.ArrayList<java.lang.String> strList6 = faculty5.getCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        faculty5.setCourses(strList9);
        long long12 = faculty5.getFacultyID();
        org.junit.Assert.assertNull(strList6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.quantity((int) (byte) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder4 = magazineBuilder0.ISBN("hi!");
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineItemBuilder4);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.hasHardCopy(true);
        java.util.Date date4 = null;
        java.util.Date date5 = null;
        org.team4.model.course.Course course8 = new org.team4.model.course.Course("", date4, date5, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder9 = courseTextBookBuilder0.course(course8);
        org.team4.functionality.buy.ItemPurchased itemPurchased12 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date13 = itemPurchased12.getDatePurchased();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = course8.isEnded(date13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(courseTextBookBuilder9);
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Fri Mar 29 00:41:52 EDT 2024");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("PayPal", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "PayPal");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        org.team4.model.items.Item item7 = purchasableItemDecorator6.getItem();
        boolean boolean8 = item7.isRentable();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(item7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.team4.model.user.User user5 = new org.team4.model.user.User("hi!", "", "hi!", "", true);
        user5.setName("hi!");
        user5.setName("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder3 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder5 = courseTextBookBuilder0.quantity((int) '#');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder7 = courseTextBookBuilder0.ISBN("PayPal{email='hi!'}");
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(bookBuilder3);
        org.junit.Assert.assertNotNull(bookItemBuilder5);
        org.junit.Assert.assertNotNull(bookItemBuilder7);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "PayPal{email='hi!'}", "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (long) (byte) 1);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        int int2 = courseTextBook1.getNoOfPages();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getStartDate();
        java.lang.String str7 = course5.getCourseTextBookISBN();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = course5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.toString()\" because \"this.startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        java.util.Date date8 = null;
        java.util.Date date9 = null;
        org.team4.model.course.Course course12 = new org.team4.model.course.Course("", date8, date9, "", "hi!");
        org.team4.model.course.CourseTextBook courseTextBook14 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", 10, "hi!", "", (int) (byte) -1, course12, false);
        java.lang.String str15 = courseTextBook1.getTitle();
        org.team4.model.course.Course course16 = courseTextBook1.getCourse();
        boolean boolean17 = courseTextBook1.hasHardCopy();
        org.team4.model.user.Student student22 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "hi!", "");
        java.util.ArrayList<java.lang.String> strList23 = student22.getCourses();
        // The following exception was thrown during execution in test generation
        try {
            courseTextBook1.makeCopies(student22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.team4.model.course.Course.isEnrolled(org.team4.model.user.Student)\" because \"this.course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(course16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(strList23);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) (short) -1);
        java.lang.String str4 = newsletter3.getLink();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str4, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
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
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder16 = courseTextBookBuilder14.quantity((int) (short) 10);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(bookBuilder3);
        org.junit.Assert.assertNotNull(courseTextBookBuilder5);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(courseTextBookBuilder14);
        org.junit.Assert.assertNotNull(bookItemBuilder16);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
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
        java.util.Date date14 = null;
        java.util.Date date15 = null;
        org.team4.model.course.Course course18 = new org.team4.model.course.Course("", date14, date15, "", "hi!");
        java.util.Date date19 = course18.getStartDate();
        org.team4.model.user.Student student25 = new org.team4.model.user.Student("hi!", "hi!", "", "", true);
        boolean boolean26 = course18.isEnrolled(student25);
        // The following exception was thrown during execution in test generation
        try {
            courseTextBook1.makeCopies(student25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.team4.model.course.Course.isEnrolled(org.team4.model.user.Student)\" because \"this.course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("hi!", 100, 100, (double) 10L, "PayPal", false, true);
        int int8 = item7.getYearPublished();
        org.team4.model.items.DVD dVD11 = new org.team4.model.items.DVD(item7, "", (double) 10);
        double double12 = dVD11.getDuration();
        java.lang.String str13 = dVD11.getGenre();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        boolean boolean1 = org.team4.utils.EmailValidator.validEmail("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder2 = courseTextBookBuilder0.price(1.0d);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = bookItemBuilder2.quantity(100);
        org.junit.Assert.assertNotNull(bookItemBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder7 = dVDItemBuilder4.quantity((int) (byte) -1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder9 = dVDItemBuilder7.quantity((int) '4');
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dVDItemBuilder7);
        org.junit.Assert.assertNotNull(dVDItemBuilder9);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "hi!", "", "hi!");
        long long5 = faculty4.getFacultyID();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("", (int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.Magazine magazine1 = magazineBuilder0.build();
        java.lang.Class<?> wildcardClass2 = magazine1.getClass();
        org.junit.Assert.assertNotNull(magazine1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        boolean boolean1 = org.team4.utils.EmailValidator.validEmail("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("hi!", "hi!", "hi!", "hi!");
        java.lang.String str5 = faculty4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.team4.model.user.Manager manager4 = new org.team4.model.user.Manager("PayPal{email='hi!'}", "PayPal", "PayPal", "");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.email("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.email("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", false);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.team4.functionality.buy.ItemPurchased itemPurchased2 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date3 = itemPurchased2.getDatePurchased();
        java.util.Date date4 = itemPurchased2.getDatePurchased();
        java.lang.String str5 = itemPurchased2.getEmail();
        java.lang.String str6 = itemPurchased2.toString();
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Fri Mar 29 00:41:54 EDT 2024");
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Fri Mar 29 00:41:54 EDT 2024");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}" + "'", str6, "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.team4.model.user.User user5 = new org.team4.model.user.User("hi!", "hi!", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", true);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("", "ProcessPayment{modes=null, itemToPurchase=null}", "hi!", "PayPal{email='hi!'}");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.util.Date date2 = null;
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "hi!", date2);
        java.util.Date date4 = itemPurchased3.getDatePurchased();
        org.junit.Assert.assertNull(date4);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("ProcessPayment{modes=null, itemToPurchase=null}", (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.team4.functionality.buy.ItemPurchased itemPurchased2 = new org.team4.functionality.buy.ItemPurchased("hi!", "");
        java.util.Date date3 = itemPurchased2.getDatePurchased();
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Fri Mar 29 00:41:54 EDT 2024");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished((int) (short) -1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder4 = magazineItemBuilder2.quantity((int) (byte) 100);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineItemBuilder4);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase0 = null;
        org.team4.model.paymentmodes.MobileWallet mobileWallet2 = new org.team4.model.paymentmodes.MobileWallet("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        java.lang.String str3 = mobileWallet2.getMode();
        boolean boolean4 = mobileWallet2.isValid();
        java.lang.String str5 = mobileWallet2.getMode();
        // The following exception was thrown during execution in test generation
        try {
            org.team4.functionality.buy.PurchaseComplete purchaseComplete6 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase0, (org.team4.model.paymentmodes.PaymentValidator) mobileWallet2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.team4.functionality.buy.ItemToPurchase.getUser()\" because \"itemToPurchase\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PayPal" + "'", str3, "PayPal");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PayPal" + "'", str5, "PayPal");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("hi!", "", "hi!", "PayPal{email='hi!'}");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.items.RentedItem rentedItem4 = new org.team4.model.items.RentedItem("", "hi!", date2, date3);
        rentedItem4.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem4.setTitle("hi!");
        java.util.Date date9 = rentedItem4.getRentDate();
        rentedItem4.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        rentedItem4.setTitle("hi!");
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished((int) (short) -1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder4 = magazineBuilder0.quantity(100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineItemBuilder4.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineItemBuilder4.price((double) '#');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder10 = magazineItemBuilder4.ISBN("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder12 = magazineItemBuilder4.yearPublished(100);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineItemBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
        org.junit.Assert.assertNotNull(magazineItemBuilder10);
        org.junit.Assert.assertNotNull(magazineItemBuilder12);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        java.lang.String str2 = mobileWallet1.getMode();
        boolean boolean3 = mobileWallet1.isValid();
        boolean boolean4 = mobileWallet1.isValid();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PayPal" + "'", str2, "PayPal");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        java.lang.String str2 = mobileWallet1.getMode();
        boolean boolean3 = mobileWallet1.isValid();
        java.lang.String str4 = mobileWallet1.getMode();
        java.lang.String str5 = mobileWallet1.getMode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PayPal" + "'", str2, "PayPal");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PayPal" + "'", str4, "PayPal");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PayPal" + "'", str5, "PayPal");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder4 = bookBuilder2.noOfPages((int) (short) -1);
        org.team4.model.items.builder.BookBuilder bookBuilder6 = bookBuilder4.noOfPages((int) '#');
        org.team4.model.items.builder.BookBuilder bookBuilder8 = bookBuilder4.genre("PayPal");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "Mobile Wallet", "hi!", (long) 100);
        long long6 = nonFaculty5.getUniversityID();
        long long7 = nonFaculty5.getUniversityID();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        java.lang.String str9 = courseTextBook1.getISBN();
        int int10 = courseTextBook1.getNoOfPages();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.team4.model.user.User user4 = new org.team4.model.user.User("PayPal", "PayPal", "", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished((int) (short) -1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder4 = magazineBuilder0.quantity(100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineItemBuilder4.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineItemBuilder4.ISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder10 = magazineItemBuilder4.quantity((int) 'a');
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineItemBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
        org.junit.Assert.assertNotNull(magazineItemBuilder10);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.team4.model.user.User user4 = new org.team4.model.user.User("", "hi!", "hi!", "");
        java.lang.String str5 = user4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", (long) '#');
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder4 = bookBuilder2.genre("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = bookBuilder4.genre("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder8 = bookBuilder6.publisher("PayPal");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getStartDate();
        org.team4.model.user.Student student12 = new org.team4.model.user.Student("hi!", "hi!", "", "", true);
        boolean boolean13 = course5.isEnrolled(student12);
        java.lang.String str14 = course5.getCourseTextBookISBN();
        java.lang.String str15 = course5.getCourseName();
        java.lang.String str16 = course5.getCourseName();
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (long) ' ');
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.team4.model.items.Item item0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.items.Book book8 = new org.team4.model.items.Book(item0, "hi!", (int) (byte) 1, "", "ProcessPayment{modes=null, itemToPurchase=null}", (int) (short) 1, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"title\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder2 = dVDBuilder0.price((double) 'a');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.yearPublished((int) '4');
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder0.genre("");
        org.team4.model.items.builder.DVDBuilder dVDBuilder8 = dVDBuilder0.genre("PayPal{email='hi!'}");
        org.junit.Assert.assertNotNull(dVDItemBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDBuilder8);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("PayPal", (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("hi!", "ProcessPayment{modes=null, itemToPurchase=null}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.team4.model.user.User user5 = new org.team4.model.user.User("", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}", false);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "Mobile Wallet", "hi!", (long) 100);
        long long6 = nonFaculty5.getUniversityID();
        nonFaculty5.setUniversityID(10L);
        nonFaculty5.setValidated(false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "", false);
        long long6 = faculty5.getFacultyID();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.Magazine magazine1 = magazineBuilder0.build();
        java.lang.String str2 = magazine1.getPublisher();
        magazine1.setPrice(100.0d);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator5 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) magazine1);
        java.lang.String str6 = magazine1.getPublisher();
        org.junit.Assert.assertNotNull(magazine1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", 0, (-1), (double) 0.0f, "ProcessPayment{modes=null, itemToPurchase=null}", true, false);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        boolean boolean1 = org.team4.utils.EmailValidator.validEmail("PayPal");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "Mobile Wallet", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished((int) (short) -1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder4 = magazineBuilder0.quantity(100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineItemBuilder4.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineItemBuilder4.price((double) '#');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder10 = magazineItemBuilder4.ISBN("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder12 = magazineItemBuilder10.quantity((int) ' ');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder14 = magazineItemBuilder10.yearPublished((int) ' ');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder16 = magazineItemBuilder10.quantity((int) (byte) -1);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineItemBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
        org.junit.Assert.assertNotNull(magazineItemBuilder10);
        org.junit.Assert.assertNotNull(magazineItemBuilder12);
        org.junit.Assert.assertNotNull(magazineItemBuilder14);
        org.junit.Assert.assertNotNull(magazineItemBuilder16);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator9 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        boolean boolean10 = courseTextBook1.isRentable();
        courseTextBook1.setQuantity((int) '4');
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        org.team4.model.user.Faculty faculty9 = new org.team4.model.user.Faculty("hi!", "hi!", "", "", (long) 1, strList7);
        java.util.ArrayList<java.lang.String> strList10 = faculty9.getCourses();
        java.util.ArrayList<java.lang.String> strList11 = faculty9.getCourses();
        java.lang.String str12 = faculty9.getEmail();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.Magazine magazine1 = magazineBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder3 = magazineBuilder0.quantity(0);
        org.junit.Assert.assertNotNull(magazine1);
        org.junit.Assert.assertNotNull(magazineItemBuilder3);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("", "", "", "", true);
        manager5.setName("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
        long long8 = manager5.getManagerID();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        java.lang.String str2 = courseTextBook1.getPublisher();
        org.team4.model.items.DVD dVD5 = new org.team4.model.items.DVD((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) 1L);
        java.util.Date date8 = null;
        org.team4.functionality.buy.ItemPurchased itemPurchased9 = new org.team4.functionality.buy.ItemPurchased("", "hi!", date8);
        boolean boolean10 = dVD5.equals((java.lang.Object) itemPurchased9);
        java.lang.String str11 = dVD5.getGenre();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str11, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.team4.model.paymentmodes.PaymentValidator paymentValidator0 = null;
        org.team4.functionality.buy.ItemToPurchase itemToPurchase1 = null;
        org.team4.functionality.buy.ProcessPayment processPayment2 = new org.team4.functionality.buy.ProcessPayment(paymentValidator0, itemToPurchase1);
        java.lang.String str3 = processPayment2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.team4.functionality.buy.PurchaseComplete purchaseComplete4 = processPayment2.getPurchaseCompleted();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.team4.model.paymentmodes.PaymentValidator.isValid()\" because \"this.modes\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ProcessPayment{modes=null, itemToPurchase=null}" + "'", str3, "ProcessPayment{modes=null, itemToPurchase=null}");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase2 = null;
        org.team4.functionality.buy.ProcessPayment processPayment3 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) payPal1, itemToPurchase2);
        java.lang.String str4 = payPal1.getMode();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Mobile Wallet" + "'", str4, "Mobile Wallet");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
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
        org.team4.model.user.Student student13 = null;
        // The following exception was thrown during execution in test generation
        try {
            courseTextBook1.makeCopies(student13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.team4.model.course.Course.isEnrolled(org.team4.model.user.Student)\" because \"this.course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("hi!", "hi!", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", false);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("PayPal{email='hi!'}", (int) (byte) 10, (int) (short) 1);
        boolean boolean4 = debitCard3.isValid();
        boolean boolean5 = debitCard3.notExpired();
        java.lang.String str6 = debitCard3.getMode();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Debit Card" + "'", str6, "Debit Card");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        boolean boolean3 = courseTextBook1.equals((java.lang.Object) (byte) 1);
        java.util.List<org.team4.model.user.Student> studentList4 = courseTextBook1.getStudentsWithCopies();
        courseTextBook1.setPurchaseable(true);
        java.lang.String str7 = courseTextBook1.getPublisher();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(studentList4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", (int) (short) -1, (int) (byte) 1, (double) (-1.0f), "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}", true, false);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        java.lang.String str2 = courseTextBook1.getPublisher();
        org.team4.model.items.DVD dVD5 = new org.team4.model.items.DVD((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) 1L);
        java.util.Date date8 = null;
        org.team4.functionality.buy.ItemPurchased itemPurchased9 = new org.team4.functionality.buy.ItemPurchased("", "hi!", date8);
        boolean boolean10 = dVD5.equals((java.lang.Object) itemPurchased9);
        double double11 = dVD5.getDuration();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.util.Date date2 = null;
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("", "hi!", date2);
        java.lang.String str4 = itemPurchased3.getEmail();
        java.lang.String str5 = itemPurchased3.getTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder2 = dVDBuilder0.price((double) 'a');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.yearPublished((int) (byte) 0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDItemBuilder4.ISBN("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDItemBuilder6.quantity(100);
        org.junit.Assert.assertNotNull(dVDItemBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("hi!", "hi!", "", "hi!", false);
        long long6 = nonFaculty5.getUniversityID();
        nonFaculty5.setUniversityID(100L);
        long long9 = nonFaculty5.getUniversityID();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
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
        int int19 = courseTextBook1.getYearPublished();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(course16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(course18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.team4.model.user.User user6 = new org.team4.model.user.User("hi!", "", "hi!", "", true);
        user6.setName("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase9 = new org.team4.functionality.buy.ItemToPurchase((double) (short) -1, user6);
        org.team4.model.paymentmodes.PayPal payPal11 = new org.team4.model.paymentmodes.PayPal("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase12 = null;
        org.team4.functionality.buy.ProcessPayment processPayment13 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) payPal11, itemToPurchase12);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete14 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase9, (org.team4.model.paymentmodes.PaymentValidator) payPal11);
        double double15 = itemToPurchase9.getAmount();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.team4.model.user.User user4 = new org.team4.model.user.User("", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "PayPal", "PayPal");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter4 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!", date2, date3);
        subscribeNewsletter4.setTitle("PayPal");
        subscribeNewsletter4.setEmail("PayPal{email='hi!'}");
        java.util.Date date9 = subscribeNewsletter4.getDateSubscribed();
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        java.lang.String str9 = courseTextBook1.getISBN();
        org.team4.model.items.decorator.ItemDecorator itemDecorator10 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook1);
        org.team4.model.items.Item item11 = new org.team4.model.items.Item((org.team4.model.items.Item) itemDecorator10);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder2 = dVDBuilder0.title("Mobile Wallet");
        org.junit.Assert.assertNotNull(dVDItemBuilder2);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        boolean boolean3 = courseTextBook1.equals((java.lang.Object) (byte) 1);
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        org.team4.model.course.Course course9 = new org.team4.model.course.Course("", date5, date6, "", "hi!");
        org.team4.model.user.Student student15 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "Mobile Wallet", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "", false);
        course9.enrollStudent(student15);
        // The following exception was thrown during execution in test generation
        try {
            courseTextBook1.removeCopies(student15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.team4.model.course.Course.isEnded(java.util.Date)\" because \"this.course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.Course course1 = null;
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder2 = courseTextBookBuilder0.course(course1);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder4 = courseTextBookBuilder2.isVirtual(false);
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder2.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = bookBuilder6.price((double) (short) 1);
        org.junit.Assert.assertNotNull(courseTextBookBuilder2);
        org.junit.Assert.assertNotNull(courseTextBookBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.items.RentedItem rentedItem4 = new org.team4.model.items.RentedItem("", "hi!", date2, date3);
        java.lang.String str5 = rentedItem4.getISBN();
        java.util.Date date6 = rentedItem4.getDueDate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = visitor5.getName();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        visitor5.setType("hi!");
        visitor5.setValidated(true);
        java.lang.String str12 = visitor5.getName();
        visitor5.setType("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder3 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder5 = courseTextBookBuilder0.isVirtual(false);
        org.team4.model.items.builder.BookBuilder bookBuilder7 = courseTextBookBuilder0.hasHardCopy(false);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder9 = bookBuilder7.quantity((int) (byte) 0);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(bookBuilder3);
        org.junit.Assert.assertNotNull(courseTextBookBuilder5);
        org.junit.Assert.assertNotNull(bookBuilder7);
        org.junit.Assert.assertNotNull(bookItemBuilder9);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("ProcessPayment{modes=null, itemToPurchase=null}", "ProcessPayment{modes=null, itemToPurchase=null}", "", "Debit Card", true);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("Mobile Wallet", (int) ' ', (int) (short) 0, 0.0d, "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", true, true);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder3 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder5 = courseTextBookBuilder0.genre("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder7 = bookBuilder5.quantity((int) (byte) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder9 = bookBuilder5.yearPublished((-1));
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(bookBuilder3);
        org.junit.Assert.assertNotNull(bookBuilder5);
        org.junit.Assert.assertNotNull(bookItemBuilder7);
        org.junit.Assert.assertNotNull(bookItemBuilder9);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("Mobile Wallet", "", "Mobile Wallet", "", 0, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        java.lang.String str7 = bookRequest6.getTitle();
        java.lang.String str8 = bookRequest6.getISBN();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = visitor5.getName();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.items.Item item8 = itemToPurchase7.getItem();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.user.Visitor visitor7 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str8 = visitor7.getName();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase9 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor7);
        org.team4.model.items.Newsletter newsletter10 = itemToPurchase9.getNewsletter();
        org.team4.model.items.Newsletter newsletter11 = itemToPurchase9.getNewsletter();
        org.team4.functionality.buy.ProcessPayment processPayment12 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet1, itemToPurchase9);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete13 = processPayment12.getPurchaseCompleted();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(purchaseComplete13);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder2 = dVDBuilder0.price((double) 'a');
        org.team4.model.items.builder.DVDBuilder dVDBuilder4 = dVDBuilder0.duration((double) (byte) 100);
        org.junit.Assert.assertNotNull(dVDItemBuilder2);
        org.junit.Assert.assertNotNull(dVDBuilder4);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.Course course1 = null;
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder2 = courseTextBookBuilder0.course(course1);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder4 = courseTextBookBuilder2.isVirtual(false);
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder2.hasHardCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder2.edition(0);
        org.team4.model.items.builder.BookBuilder bookBuilder10 = bookBuilder8.publisher("");
        org.junit.Assert.assertNotNull(courseTextBookBuilder2);
        org.junit.Assert.assertNotNull(courseTextBookBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(bookBuilder10);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) (short) -1);
        org.team4.model.user.NonFaculty nonFaculty9 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "PayPal{email='hi!'}", "Mobile Wallet", "PayPal{email='hi!'}", (long) (byte) 1);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase10 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) nonFaculty9);
        nonFaculty9.setUniversityID((long) (byte) 0);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("hi!", "hi!", "hi!", "hi!");
        faculty4.setFacultyID((long) 10);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.team4.functionality.buy.ItemPurchased itemPurchased2 = new org.team4.functionality.buy.ItemPurchased("PayPal", "PayPal");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.team4.functionality.buy.ItemPurchased itemPurchased2 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date3 = itemPurchased2.getDatePurchased();
        java.util.Date date4 = itemPurchased2.getDatePurchased();
        java.lang.String str5 = itemPurchased2.getEmail();
        java.lang.String str6 = itemPurchased2.getTitle();
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Fri Mar 29 00:41:56 EDT 2024");
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Fri Mar 29 00:41:56 EDT 2024");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", false);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", (int) (byte) 10, (int) (short) 0, (double) 0L, "PayPal", false, true);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.team4.model.user.User user4 = new org.team4.model.user.User("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "Mobile Wallet", "hi!");
        boolean boolean5 = user4.isValidated();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("PayPal{email='hi!'}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "", "PayPal", (int) (short) 0, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:56 EDT 2024, dateDue=Mon Apr 29 00:41:56 EDT 2024}");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("hi!");
        java.lang.String str2 = payPal1.toString();
        java.lang.String str3 = payPal1.getMode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PayPal{email='hi!'}" + "'", str2, "PayPal{email='hi!'}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Mobile Wallet" + "'", str3, "Mobile Wallet");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.team4.model.user.User user4 = new org.team4.model.user.User("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "Mobile Wallet", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}", "Mobile Wallet", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:56 EDT 2024, dateDue=Mon Apr 29 00:41:56 EDT 2024}", true);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
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
        org.team4.model.user.Faculty faculty26 = new org.team4.model.user.Faculty("", "", "hi!", "hi!", true);
        java.util.ArrayList<java.lang.String> strList27 = faculty26.getCourses();
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        faculty26.setCourses(strList30);
        org.team4.model.user.Student student33 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "", strList30);
        boolean boolean34 = course14.isEnrolled(student33);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(bookBuilder3);
        org.junit.Assert.assertNotNull(courseTextBookBuilder5);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(courseTextBookBuilder15);
        org.junit.Assert.assertNotNull(courseTextBookBuilder16);
        org.junit.Assert.assertNull(strList27);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
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
        boolean boolean21 = purchasableItemDecorator20.isPurchasable();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(course16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.email("PayPal{email='hi!'}");
        org.team4.model.items.BookRequest bookRequest7 = bookRequestBuilder6.build();
        org.team4.model.items.BookRequest bookRequest8 = bookRequestBuilder6.build();
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequest7);
        org.junit.Assert.assertNotNull(bookRequest8);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished((int) (short) -1);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.publisher("");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder6 = magazineBuilder0.publisher("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder8 = magazineBuilder0.publisher("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder10 = magazineBuilder0.issueNumber((int) ' ');
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineBuilder6);
        org.junit.Assert.assertNotNull(magazineBuilder8);
        org.junit.Assert.assertNotNull(magazineBuilder10);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.team4.model.user.UserFactory userFactory0 = new org.team4.model.user.UserFactory();
        org.team4.model.user.User user6 = userFactory0.getUser("", "hi!", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "hi!", true);
        org.team4.model.user.User user12 = userFactory0.getUser("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "Debit Card", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", true);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        org.team4.model.user.Faculty faculty18 = new org.team4.model.user.Faculty("hi!", "hi!", "", "", (long) 1, strList16);
        java.util.ArrayList<java.lang.String> strList19 = faculty18.getCourses();
        java.util.ArrayList<java.lang.String> strList20 = faculty18.getCourses();
        org.team4.model.user.Faculty faculty21 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "PayPal", "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (long) ' ', strList20);
        org.team4.model.user.Student student22 = new org.team4.model.user.Student("", "Mobile Wallet", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "Debit Card", strList20);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.Course course1 = null;
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder2 = courseTextBookBuilder0.course(course1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder2.title("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder6 = bookItemBuilder4.price((double) ' ');
        org.junit.Assert.assertNotNull(courseTextBookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookItemBuilder6);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished((int) (short) -1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder4 = magazineBuilder0.quantity(100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineItemBuilder4.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineItemBuilder4.price((double) '#');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder10 = magazineItemBuilder4.ISBN("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder12 = magazineItemBuilder10.price((double) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder14 = magazineItemBuilder10.quantity((int) (byte) -1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder16 = magazineItemBuilder14.yearPublished((int) (short) 1);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineItemBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
        org.junit.Assert.assertNotNull(magazineItemBuilder10);
        org.junit.Assert.assertNotNull(magazineItemBuilder12);
        org.junit.Assert.assertNotNull(magazineItemBuilder14);
        org.junit.Assert.assertNotNull(magazineItemBuilder16);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder0.email("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.booktype("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("Mobile Wallet", "", "Mobile Wallet", "", 0, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        java.lang.String str7 = bookRequest6.getAuthor();
        java.lang.String str8 = bookRequest6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Mobile Wallet" + "'", str7, "Mobile Wallet");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.items.RentedItem rentedItem4 = new org.team4.model.items.RentedItem("", "hi!", date2, date3);
        java.util.Date date5 = null;
        rentedItem4.setRentDate(date5);
        java.lang.String str7 = rentedItem4.getISBN();
        java.util.Date date8 = rentedItem4.getDueDate();
        java.util.Date date9 = rentedItem4.getRentDate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder3 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder5 = courseTextBookBuilder0.genre("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder7 = bookBuilder5.hasHardCopy(false);
        org.team4.model.items.builder.BookBuilder bookBuilder9 = bookBuilder7.edition(10);
        org.team4.model.items.Book book10 = bookBuilder9.build();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(bookBuilder3);
        org.junit.Assert.assertNotNull(bookBuilder5);
        org.junit.Assert.assertNotNull(bookBuilder7);
        org.junit.Assert.assertNotNull(bookBuilder9);
        org.junit.Assert.assertNotNull(book10);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "hi!", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", (long) 1);
        java.lang.String str6 = nonFaculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}" + "'", str6, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "PayPal", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", (int) (byte) 10, "");
        java.lang.String str7 = bookRequest6.getISBN();
        int int8 = bookRequest6.getEdition();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}" + "'", str7, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.email("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.title("PayPal");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder2.email("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("Debit Card");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        java.lang.String str2 = courseTextBook1.getPublisher();
        org.team4.model.items.DVD dVD5 = new org.team4.model.items.DVD((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) 1L);
        java.util.Date date8 = null;
        org.team4.functionality.buy.ItemPurchased itemPurchased9 = new org.team4.functionality.buy.ItemPurchased("", "hi!", date8);
        boolean boolean10 = dVD5.equals((java.lang.Object) itemPurchased9);
        java.util.Date date11 = itemPurchased9.getDatePurchased();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
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
        java.util.ArrayList<java.lang.String> strList42 = student39.getCourses();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookBuilder17);
        org.junit.Assert.assertNotNull(courseTextBookBuilder24);
        org.junit.Assert.assertNull(date33);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(strList42);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.hasHardCopy(true);
        java.util.Date date4 = null;
        java.util.Date date5 = null;
        org.team4.model.course.Course course8 = new org.team4.model.course.Course("", date4, date5, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder9 = courseTextBookBuilder0.course(course8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = course8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.toString()\" because \"this.startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(courseTextBookBuilder9);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
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
        boolean boolean21 = courseTextBook1.isPurchasable();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(course16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "");
        java.lang.String str3 = subscribeNewsletter2.toString();
        java.util.Date date4 = null;
        subscribeNewsletter2.setDateDue(date4);
        java.lang.String str6 = subscribeNewsletter2.getTitle();
        java.lang.String str7 = subscribeNewsletter2.getEmail();
        subscribeNewsletter2.setEmail("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}" + "'", str3, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "PayPal{email='hi!'}");
        subscribeNewsletter2.setEmail("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder2 = dVDBuilder0.price((double) 'a');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.yearPublished((int) '4');
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder0.duration((double) 0.0f);
        org.junit.Assert.assertNotNull(dVDItemBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
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
        java.lang.String str19 = purchasableItemDecorator18.getTitle();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(course16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = visitor5.getName();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        org.team4.model.items.Newsletter newsletter8 = itemToPurchase7.getNewsletter();
        org.team4.model.items.Item item9 = itemToPurchase7.getItem();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = visitor5.getName();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        visitor5.setPassword("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
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
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder22 = bookBuilder20.price((-1.0d));
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
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        org.team4.model.user.Faculty faculty14 = new org.team4.model.user.Faculty("hi!", "hi!", "", "", (long) 1, strList12);
        org.team4.model.user.Faculty faculty15 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "Mobile Wallet", "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (long) (byte) 100, strList12);
        faculty15.setName("PayPal{email='hi!'}");
        long long18 = faculty15.getFacultyID();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder3 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder5 = courseTextBookBuilder0.genre("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder7 = bookBuilder5.author("PayPal{email='hi!'}");
        org.team4.model.items.builder.BookBuilder bookBuilder9 = bookBuilder7.edition((int) (short) 1);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(bookBuilder3);
        org.junit.Assert.assertNotNull(bookBuilder5);
        org.junit.Assert.assertNotNull(bookBuilder7);
        org.junit.Assert.assertNotNull(bookBuilder9);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.booktype("Mobile Wallet");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder6.author("hi!");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder2 = dVDBuilder0.title("PayPal");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDItemBuilder2.price((double) (byte) 1);
        org.junit.Assert.assertNotNull(dVDItemBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.team4.functionality.buy.ItemPurchased itemPurchased2 = new org.team4.functionality.buy.ItemPurchased("hi!", "");
        java.lang.String str3 = itemPurchased2.getEmail();
        java.lang.String str4 = itemPurchased2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.team4.model.user.Manager manager4 = new org.team4.model.user.Manager("PayPal{email='hi!'}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter4 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!", date2, date3);
        subscribeNewsletter4.setEmail("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        subscribeNewsletter4.setEmail("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}");
        java.lang.String str9 = subscribeNewsletter4.getEmail();
        java.lang.String str10 = subscribeNewsletter4.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}" + "'", str9, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SubscribeNewsletter{title='hi!', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}', dateSubscribed=null, dateDue=null}" + "'", str10, "SubscribeNewsletter{title='hi!', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}', dateSubscribed=null, dateDue=null}");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        int int7 = courseTextBook1.getEdition();
        org.team4.model.items.decorator.ItemDecorator itemDecorator8 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPurchaseable(false);
        org.team4.model.items.Newsletter newsletter14 = new org.team4.model.items.Newsletter("PayPal{email='hi!'}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) '4');
        org.team4.model.user.Faculty faculty20 = new org.team4.model.user.Faculty("hi!", "hi!", "hi!", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", false);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase21 = new org.team4.functionality.buy.ItemToPurchase(newsletter14, (org.team4.model.user.User) faculty20);
        java.util.Date date23 = null;
        java.util.Date date24 = null;
        org.team4.model.course.Course course27 = new org.team4.model.course.Course("", date23, date24, "", "hi!");
        org.team4.model.user.Student student33 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "Mobile Wallet", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "", false);
        course27.enrollStudent(student33);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase35 = new org.team4.functionality.buy.ItemToPurchase(newsletter14, (org.team4.model.user.User) student33);
        // The following exception was thrown during execution in test generation
        try {
            courseTextBook1.removeCopies(student33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.team4.model.course.Course.isEnded(java.util.Date)\" because \"this.course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
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
        java.lang.String str24 = payPal12.getMode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Mobile Wallet" + "'", str22, "Mobile Wallet");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Mobile Wallet" + "'", str24, "Mobile Wallet");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.Magazine magazine1 = magazineBuilder0.build();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder3 = magazineBuilder0.publisher("PayPal");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder5 = magazineBuilder0.quantity((int) '4');
        org.junit.Assert.assertNotNull(magazine1);
        org.junit.Assert.assertNotNull(magazineBuilder3);
        org.junit.Assert.assertNotNull(magazineItemBuilder5);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.Course course1 = null;
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder2 = courseTextBookBuilder0.course(course1);
        org.team4.model.items.builder.BookBuilder bookBuilder4 = courseTextBookBuilder0.hasHardCopy(false);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder6 = courseTextBookBuilder0.price((double) (short) 0);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder10 = courseTextBookBuilder0.ISBN("Mobile Wallet");
        org.team4.model.items.builder.BookBuilder bookBuilder12 = courseTextBookBuilder0.edition((int) (short) 1);
        org.junit.Assert.assertNotNull(courseTextBookBuilder2);
        org.junit.Assert.assertNotNull(bookBuilder4);
        org.junit.Assert.assertNotNull(bookItemBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(bookItemBuilder10);
        org.junit.Assert.assertNotNull(bookBuilder12);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("PayPal{email='hi!'}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}", "Mobile Wallet");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.booktype("Mobile Wallet");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder6.email("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.email("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder0.edition((int) (short) 10);
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("PayPal{email='hi!'}", "Mobile Wallet", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        long long5 = faculty4.getFacultyID();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("hi!", "hi!", "", "hi!", false);
        nonFaculty5.setUniversityID(1L);
        nonFaculty5.setUniversityID((long) (short) 1);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished((int) (short) -1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder4 = magazineBuilder0.quantity(100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineItemBuilder4.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineItemBuilder4.price((double) '#');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder10 = magazineItemBuilder4.ISBN("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder12 = magazineItemBuilder10.quantity((int) ' ');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder14 = magazineItemBuilder10.yearPublished((int) ' ');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder16 = magazineItemBuilder10.price((double) 10.0f);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineItemBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
        org.junit.Assert.assertNotNull(magazineItemBuilder10);
        org.junit.Assert.assertNotNull(magazineItemBuilder12);
        org.junit.Assert.assertNotNull(magazineItemBuilder14);
        org.junit.Assert.assertNotNull(magazineItemBuilder16);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.team4.functionality.buy.ItemPurchased itemPurchased2 = new org.team4.functionality.buy.ItemPurchased("Mobile Wallet", "");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.team4.model.user.User user6 = new org.team4.model.user.User("hi!", "", "hi!", "", true);
        user6.setName("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase9 = new org.team4.functionality.buy.ItemToPurchase((double) (short) -1, user6);
        org.team4.model.paymentmodes.PayPal payPal11 = new org.team4.model.paymentmodes.PayPal("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase12 = null;
        org.team4.functionality.buy.ProcessPayment processPayment13 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) payPal11, itemToPurchase12);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete14 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase9, (org.team4.model.paymentmodes.PaymentValidator) payPal11);
        long long15 = purchaseComplete14.getPurchaseID();
        double double16 = purchaseComplete14.getAmount();
        org.team4.model.user.User user17 = purchaseComplete14.getUser();
        long long18 = purchaseComplete14.getPurchaseID();
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3281441L + "'", long15 == 3281441L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(user17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3281441L + "'", long18 == 3281441L);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("PayPal{email='hi!'}", "PayPal{email='hi!'}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "PayPal", 0L);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder2 = dVDBuilder0.price((double) (-1.0f));
        org.team4.model.items.builder.DVDBuilder dVDBuilder4 = dVDBuilder0.genre("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder4.duration((double) 10L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDBuilder4.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.junit.Assert.assertNotNull(dVDItemBuilder2);
        org.junit.Assert.assertNotNull(dVDBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}", true);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("hi!");
        java.lang.String str2 = payPal1.toString();
        java.lang.String str3 = payPal1.toString();
        boolean boolean4 = payPal1.isValid();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PayPal{email='hi!'}" + "'", str2, "PayPal{email='hi!'}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PayPal{email='hi!'}" + "'", str3, "PayPal{email='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.items.RentedItem rentedItem4 = new org.team4.model.items.RentedItem("", "hi!", date2, date3);
        rentedItem4.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        java.lang.String str7 = rentedItem4.getISBN();
        java.util.Date date8 = rentedItem4.getRentDate();
        java.lang.String str9 = rentedItem4.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str7, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("hi!", 100, 100, (double) 10L, "PayPal", false, true);
        int int8 = item7.getYearPublished();
        org.team4.model.items.DVD dVD11 = new org.team4.model.items.DVD(item7, "", (double) 10);
        int int12 = item7.getYearPublished();
        int int13 = item7.getQuantity();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("Debit Card", "", "PayPal", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", true);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.util.Date date4 = null;
        java.util.Date date5 = null;
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter6 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!", date4, date5);
        org.team4.functionality.buy.ItemPurchased itemPurchased13 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date14 = itemPurchased13.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased15 = new org.team4.functionality.buy.ItemPurchased("Mobile Wallet", "", date14);
        org.team4.functionality.buy.ItemPurchased itemPurchased19 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date20 = itemPurchased19.getDatePurchased();
        java.util.Date date21 = itemPurchased19.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased25 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date26 = itemPurchased25.getDatePurchased();
        java.util.Date date27 = itemPurchased25.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased30 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date31 = itemPurchased30.getDatePurchased();
        org.team4.model.course.Course course34 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date27, date31, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.course.Course course37 = new org.team4.model.course.Course("PayPal{email='hi!'}", date21, date27, "Mobile Wallet", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
        org.team4.model.items.RentedItem rentedItem38 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "PayPal", date14, date21);
        subscribeNewsletter6.setDateDue(date14);
        org.team4.functionality.buy.ItemPurchased itemPurchased42 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date43 = itemPurchased42.getDatePurchased();
        java.util.Date date44 = itemPurchased42.getDatePurchased();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter45 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}", date14, date44);
        org.team4.functionality.buy.ItemPurchased itemPurchased52 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date53 = itemPurchased52.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased54 = new org.team4.functionality.buy.ItemPurchased("Mobile Wallet", "", date53);
        org.team4.functionality.buy.ItemPurchased itemPurchased58 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date59 = itemPurchased58.getDatePurchased();
        java.util.Date date60 = itemPurchased58.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased64 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date65 = itemPurchased64.getDatePurchased();
        java.util.Date date66 = itemPurchased64.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased69 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date70 = itemPurchased69.getDatePurchased();
        org.team4.model.course.Course course73 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date66, date70, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.course.Course course76 = new org.team4.model.course.Course("PayPal{email='hi!'}", date60, date66, "Mobile Wallet", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
        org.team4.model.items.RentedItem rentedItem77 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "PayPal", date53, date60);
        subscribeNewsletter45.setDateDue(date53);
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Fri Mar 29 00:41:57 EDT 2024");
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Fri Mar 29 00:41:57 EDT 2024");
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Fri Mar 29 00:41:57 EDT 2024");
        org.junit.Assert.assertNotNull(date26);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Fri Mar 29 00:41:57 EDT 2024");
        org.junit.Assert.assertNotNull(date27);
// flaky:         org.junit.Assert.assertEquals(date27.toString(), "Fri Mar 29 00:41:57 EDT 2024");
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Fri Mar 29 00:41:57 EDT 2024");
        org.junit.Assert.assertNotNull(date43);
// flaky:         org.junit.Assert.assertEquals(date43.toString(), "Fri Mar 29 00:41:57 EDT 2024");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Fri Mar 29 00:41:57 EDT 2024");
        org.junit.Assert.assertNotNull(date53);
// flaky:         org.junit.Assert.assertEquals(date53.toString(), "Fri Mar 29 00:41:57 EDT 2024");
        org.junit.Assert.assertNotNull(date59);
// flaky:         org.junit.Assert.assertEquals(date59.toString(), "Fri Mar 29 00:41:57 EDT 2024");
        org.junit.Assert.assertNotNull(date60);
// flaky:         org.junit.Assert.assertEquals(date60.toString(), "Fri Mar 29 00:41:57 EDT 2024");
        org.junit.Assert.assertNotNull(date65);
// flaky:         org.junit.Assert.assertEquals(date65.toString(), "Fri Mar 29 00:41:57 EDT 2024");
        org.junit.Assert.assertNotNull(date66);
// flaky:         org.junit.Assert.assertEquals(date66.toString(), "Fri Mar 29 00:41:57 EDT 2024");
        org.junit.Assert.assertNotNull(date70);
// flaky:         org.junit.Assert.assertEquals(date70.toString(), "Fri Mar 29 00:41:57 EDT 2024");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}", (long) '4');
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        java.util.Date date8 = null;
        java.util.Date date9 = null;
        org.team4.model.course.Course course12 = new org.team4.model.course.Course("", date8, date9, "", "hi!");
        org.team4.model.course.CourseTextBook courseTextBook14 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", 10, "hi!", "", (int) (byte) -1, course12, false);
        java.lang.String str15 = courseTextBook1.getTitle();
        org.team4.model.course.Course course16 = courseTextBook1.getCourse();
        org.team4.model.user.Student student22 = new org.team4.model.user.Student("", "ProcessPayment{modes=null, itemToPurchase=null}", "ProcessPayment{modes=null, itemToPurchase=null}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", true);
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
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder2.booktype("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
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
        org.team4.model.items.builder.BookBuilder bookBuilder18 = courseTextBookBuilder16.author("PayPal");
        org.team4.model.items.builder.BookBuilder bookBuilder20 = courseTextBookBuilder16.hasSoftCopy(false);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(bookBuilder3);
        org.junit.Assert.assertNotNull(courseTextBookBuilder5);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(courseTextBookBuilder15);
        org.junit.Assert.assertNotNull(courseTextBookBuilder16);
        org.junit.Assert.assertNotNull(bookBuilder18);
        org.junit.Assert.assertNotNull(bookBuilder20);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        boolean boolean3 = courseTextBook1.equals((java.lang.Object) (byte) 1);
        java.lang.String str4 = courseTextBook1.getTitle();
        java.lang.String str5 = courseTextBook1.getPublisher();
        int int6 = courseTextBook1.getYearPublished();
        int int7 = courseTextBook1.getQuantity();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.team4.functionality.buy.ItemPurchased itemPurchased2 = new org.team4.functionality.buy.ItemPurchased("User [email=hi!, password=hi!, name=hi!, type=, validated=false]", "PayPal{email='hi!'}");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.Magazine magazine1 = magazineBuilder0.build();
        java.lang.String str2 = magazine1.getPublisher();
        java.lang.String str3 = magazine1.getPublisher();
        int int4 = magazine1.getIssueNumber();
        int int5 = magazine1.getIssueNumber();
        int int6 = magazine1.getIssueNumber();
        org.junit.Assert.assertNotNull(magazine1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:56 EDT 2024, dateDue=Mon Apr 29 00:41:56 EDT 2024}", "SubscribeNewsletter{title='hi!', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}', dateSubscribed=null, dateDue=null}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "Mobile Wallet", true);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.team4.model.user.UserFactory userFactory0 = new org.team4.model.user.UserFactory();
        org.team4.model.user.User user6 = userFactory0.getUser("", "hi!", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "hi!", true);
        org.team4.model.user.User user12 = userFactory0.getUser("", "hi!", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", true);
        org.team4.model.user.User user18 = userFactory0.getUser("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "hi!", false);
        org.team4.model.user.User user24 = userFactory0.getUser("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}", "PayPal", "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}", true);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(user24);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.ItemDecorator itemDecorator6 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook1);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.team4.model.user.User user5 = new org.team4.model.user.User("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}", "SubscribeNewsletter{title='hi!', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}', dateSubscribed=null, dateDue=null}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}", true);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = course11.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.toString()\" because \"this.startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(bookBuilder3);
        org.junit.Assert.assertNotNull(courseTextBookBuilder5);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(courseTextBookBuilder14);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.team4.model.user.Student student6 = new org.team4.model.user.Student("Mobile Wallet", "", "hi!", "Mobile Wallet", true);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (short) -1, (org.team4.model.user.User) student6);
        double double8 = itemToPurchase7.getAmount();
        org.team4.model.items.Newsletter newsletter9 = itemToPurchase7.getNewsletter();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNull(newsletter9);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("hi!", "hi!", "hi!", "hi!");
        faculty4.setFacultyID((long) (byte) -1);
        boolean boolean7 = faculty4.isValidated();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
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
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder21 = courseTextBookBuilder17.price((double) 1);
        org.junit.Assert.assertNotNull(bookItemBuilder2);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Fri Mar 29 00:41:58 EDT 2024");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Fri Mar 29 00:41:58 EDT 2024");
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Fri Mar 29 00:41:58 EDT 2024");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}" + "'", str16, "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.junit.Assert.assertNotNull(courseTextBookBuilder17);
        org.junit.Assert.assertNotNull(courseTextBookBuilder19);
        org.junit.Assert.assertNotNull(bookItemBuilder21);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
        java.util.Date date34 = null;
        java.util.Date date35 = null;
        org.team4.model.items.RentedItem rentedItem36 = new org.team4.model.items.RentedItem("", "hi!", date34, date35);
        java.lang.String str37 = rentedItem36.getISBN();
        java.util.Date date38 = null;
        rentedItem36.setDueDate(date38);
        rentedItem36.setISBN("PayPal");
        org.team4.functionality.buy.ItemPurchased itemPurchased45 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date46 = itemPurchased45.getDatePurchased();
        java.util.Date date47 = itemPurchased45.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased50 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date51 = itemPurchased50.getDatePurchased();
        org.team4.model.course.Course course54 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date47, date51, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem36.setDueDate(date47);
        org.team4.model.course.Course course58 = new org.team4.model.course.Course("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", date22, date47, "Mobile Wallet", "hi!");
        java.util.Date date59 = course58.getEndDate();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}" + "'", str4, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}");
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Fri Mar 29 00:41:58 EDT 2024");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Fri Mar 29 00:41:58 EDT 2024");
        org.junit.Assert.assertNotNull(date26);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Fri Mar 29 00:41:58 EDT 2024");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(date46);
// flaky:         org.junit.Assert.assertEquals(date46.toString(), "Fri Mar 29 00:41:58 EDT 2024");
        org.junit.Assert.assertNotNull(date47);
// flaky:         org.junit.Assert.assertEquals(date47.toString(), "Fri Mar 29 00:41:58 EDT 2024");
        org.junit.Assert.assertNotNull(date51);
// flaky:         org.junit.Assert.assertEquals(date51.toString(), "Fri Mar 29 00:41:58 EDT 2024");
        org.junit.Assert.assertNotNull(date59);
// flaky:         org.junit.Assert.assertEquals(date59.toString(), "Fri Mar 29 00:41:58 EDT 2024");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("PayPal{email='hi!'}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) '4');
        org.team4.model.user.Faculty faculty9 = new org.team4.model.user.Faculty("hi!", "hi!", "hi!", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", false);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase10 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) faculty9);
        org.team4.model.user.Faculty faculty20 = new org.team4.model.user.Faculty("", "", "hi!", "hi!", true);
        java.util.ArrayList<java.lang.String> strList21 = faculty20.getCourses();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        faculty20.setCourses(strList24);
        org.team4.model.user.Student student27 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "", strList24);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase28 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) student27);
        java.lang.String str29 = newsletter3.getTitle();
        org.junit.Assert.assertNull(strList21);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PayPal{email='hi!'}" + "'", str29, "PayPal{email='hi!'}");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = visitor5.getName();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        visitor5.setType("hi!");
        visitor5.setValidated(true);
        visitor5.setValidated(false);
        java.lang.Class<?> wildcardClass14 = visitor5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        java.lang.String str7 = courseTextBook1.getPublisher();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder2 = magazineBuilder0.issueNumber((int) ' ');
        org.junit.Assert.assertNotNull(magazineBuilder2);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("PayPal{email='hi!'}", (int) (byte) 10, (int) (short) 1);
        boolean boolean4 = debitCard3.isValid();
        boolean boolean5 = debitCard3.notExpired();
        boolean boolean6 = debitCard3.notExpired();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:56 EDT 2024, dateDue=Mon Apr 29 00:41:56 EDT 2024}");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.team4.functionality.buy.ItemPurchased itemPurchased2 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date3 = itemPurchased2.getDatePurchased();
        java.util.Date date4 = itemPurchased2.getDatePurchased();
        java.lang.String str5 = itemPurchased2.toString();
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Fri Mar 29 00:41:58 EDT 2024");
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Fri Mar 29 00:41:58 EDT 2024");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:58 EDT 2024}" + "'", str5, "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:58 EDT 2024}");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.booktype("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.ISBN("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:58 EDT 2024}");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.author("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder2.author("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}", "hi!", "SubscribeNewsletter{title='hi!', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}', dateSubscribed=null, dateDue=null}", "Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.Magazine magazine1 = magazineBuilder0.build();
        java.lang.String str2 = magazine1.getPublisher();
        magazine1.setPrice(100.0d);
        magazine1.setPurchaseable(false);
        org.junit.Assert.assertNotNull(magazine1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
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
        org.team4.model.items.builder.BookBuilder bookBuilder19 = courseTextBookBuilder17.author("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.junit.Assert.assertNotNull(bookItemBuilder2);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Fri Mar 29 00:41:58 EDT 2024");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Fri Mar 29 00:41:58 EDT 2024");
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Fri Mar 29 00:41:58 EDT 2024");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}" + "'", str16, "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.junit.Assert.assertNotNull(courseTextBookBuilder17);
        org.junit.Assert.assertNotNull(bookBuilder19);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "hi!", "");
        java.lang.String str5 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, name=hi!, type=, validated=false]" + "'", str5, "User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, name=hi!, type=, validated=false]");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.DVD dVD11 = new org.team4.model.items.DVD((org.team4.model.items.Item) courseTextBook1, "PayPal{email='hi!'}", (double) 100.0f);
        org.team4.model.user.UserFactory userFactory12 = new org.team4.model.user.UserFactory();
        org.team4.model.user.User user18 = userFactory12.getUser("", "hi!", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "hi!", true);
        org.team4.model.user.User user24 = userFactory12.getUser("", "hi!", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", true);
        boolean boolean25 = courseTextBook1.equals((java.lang.Object) userFactory12);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(user24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.email("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.title("PayPal");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.author("Debit Card");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder6.title("PayPal");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder10 = bookRequestBuilder8.email("Debit Card");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
        org.junit.Assert.assertNotNull(bookRequestBuilder10);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
        java.lang.String str13 = courseTextBook1.toString();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Book{genre='null', noOfPages=0, author='null', ISBN=null, publisher='null', edition='0'}" + "'", str13, "Book{genre='null', noOfPages=0, author='null', ISBN=null, publisher='null', edition='0'}");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]", "");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("PayPal{email='hi!'}", "PayPal", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:56 EDT 2024, dateDue=Mon Apr 29 00:41:56 EDT 2024}", "Debit Card");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.quantity((int) (byte) 10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder4 = magazineBuilder0.title("Mobile Wallet");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineBuilder0.title("ProcessPayment{modes=null, itemToPurchase=null}");
        org.team4.model.items.Magazine magazine7 = magazineBuilder0.build();
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineItemBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazine7);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        java.lang.String str2 = courseTextBook1.getPublisher();
        org.team4.model.items.DVD dVD5 = new org.team4.model.items.DVD((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) 1L);
        java.lang.String str6 = courseTextBook1.getGenre();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
        java.lang.String str33 = payPal1.getMode();
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Mobile Wallet" + "'", str33, "Mobile Wallet");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "");
        java.lang.String str3 = subscribeNewsletter2.toString();
        java.util.Date date4 = null;
        subscribeNewsletter2.setDateDue(date4);
        java.lang.String str6 = subscribeNewsletter2.getTitle();
        java.util.Date date7 = subscribeNewsletter2.getDateDue();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}" + "'", str3, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("hi!", "hi!", "hi!", "hi!");
        faculty4.setType("ProcessPayment{modes=null, itemToPurchase=null}");
        java.util.ArrayList<java.lang.String> strList7 = faculty4.getCourses();
        org.junit.Assert.assertNull(strList7);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.team4.model.paymentmodes.PaymentValidator paymentValidator0 = null;
        org.team4.functionality.buy.ItemToPurchase itemToPurchase1 = null;
        org.team4.functionality.buy.ProcessPayment processPayment2 = new org.team4.functionality.buy.ProcessPayment(paymentValidator0, itemToPurchase1);
        java.lang.String str3 = processPayment2.toString();
        java.lang.String str4 = processPayment2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.team4.functionality.buy.PurchaseComplete purchaseComplete5 = processPayment2.getPurchaseCompleted();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.team4.model.paymentmodes.PaymentValidator.isValid()\" because \"this.modes\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ProcessPayment{modes=null, itemToPurchase=null}" + "'", str3, "ProcessPayment{modes=null, itemToPurchase=null}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ProcessPayment{modes=null, itemToPurchase=null}" + "'", str4, "ProcessPayment{modes=null, itemToPurchase=null}");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
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
        org.team4.model.items.DVD dVD22 = new org.team4.model.items.DVD((org.team4.model.items.Item) purchasableItemDecorator18, "PayPal", (double) (-1));
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(course16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        int int7 = courseTextBook1.getEdition();
        org.team4.model.items.decorator.ItemDecorator itemDecorator8 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook1);
        org.team4.model.items.Item item9 = itemDecorator8.getItem();
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder15 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder17 = courseTextBookBuilder15.price(1.0d);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder19 = courseTextBookBuilder15.price((double) 0.0f);
        java.util.Date date21 = null;
        java.util.Date date22 = null;
        org.team4.model.course.Course course25 = new org.team4.model.course.Course("", date21, date22, "hi!", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder26 = courseTextBookBuilder15.course(course25);
        org.team4.model.course.CourseTextBook courseTextBook28 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) itemDecorator8, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:56 EDT 2024, dateDue=Mon Apr 29 00:41:56 EDT 2024}", 0, "Debit Card", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}", (int) (short) -1, course25, true);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(item9);
        org.junit.Assert.assertNotNull(bookItemBuilder17);
        org.junit.Assert.assertNotNull(bookItemBuilder19);
        org.junit.Assert.assertNotNull(courseTextBookBuilder26);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = visitor5.getName();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor5);
        visitor5.setType("hi!");
        visitor5.setValidated(true);
        visitor5.setPassword("PayPal{email='hi!'}");
        visitor5.setValidated(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder2 = dVDBuilder0.price((double) 'a');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.yearPublished((int) '4');
        org.team4.model.items.DVD dVD5 = dVDBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder7 = dVDBuilder0.genre("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder9 = dVDBuilder7.duration((double) (short) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder11 = dVDBuilder9.quantity((int) (short) -1);
        org.junit.Assert.assertNotNull(dVDItemBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVD5);
        org.junit.Assert.assertNotNull(dVDBuilder7);
        org.junit.Assert.assertNotNull(dVDBuilder9);
        org.junit.Assert.assertNotNull(dVDItemBuilder11);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        boolean boolean2 = courseTextBook1.isPurchasable();
        courseTextBook1.setPrice((double) (-1.0f));
        org.team4.model.user.Student student5 = null;
        // The following exception was thrown during execution in test generation
        try {
            courseTextBook1.makeCopies(student5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.team4.model.course.Course.isEnrolled(org.team4.model.user.Student)\" because \"this.course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        purchasableItemDecorator6.setPurchaseable(true);
        purchasableItemDecorator6.setPrice((-1.0d));
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.DVD dVD11 = new org.team4.model.items.DVD((org.team4.model.items.Item) courseTextBook1, "PayPal{email='hi!'}", (double) 100.0f);
        boolean boolean12 = dVD11.isPurchasable();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}", "Book{genre='null', noOfPages=0, author='null', ISBN=null, publisher='null', edition='0'}", false);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        boolean boolean3 = courseTextBook1.equals((java.lang.Object) (byte) 1);
        java.lang.String str4 = courseTextBook1.getTitle();
        org.team4.model.course.Course course5 = courseTextBook1.getCourse();
        boolean boolean7 = courseTextBook1.equals((java.lang.Object) 100);
        java.util.List<org.team4.model.user.Student> studentList8 = courseTextBook1.getStudentsWithCopies();
        int int9 = courseTextBook1.getYearPublished();
        java.util.List<org.team4.model.user.Student> studentList10 = courseTextBook1.getStudentsWithCopies();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(course5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(studentList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(studentList10);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.items.RentedItem rentedItem4 = new org.team4.model.items.RentedItem("", "hi!", date2, date3);
        java.lang.String str5 = rentedItem4.getISBN();
        java.util.Date date6 = null;
        rentedItem4.setDueDate(date6);
        java.util.Date date8 = rentedItem4.getDueDate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("hi!", "PayPal", (double) 0L);
        java.lang.String str4 = newsletter3.getTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("PayPal{email='hi!'}", (int) (byte) 10, (int) (short) 1);
        boolean boolean4 = debitCard3.isValid();
        boolean boolean5 = debitCard3.isValid();
        boolean boolean6 = debitCard3.isValid();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.email("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.title("PayPal");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.author("Debit Card");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder6.title("PayPal");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder10 = bookRequestBuilder6.email("PayPal");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder12 = bookRequestBuilder6.booktype("Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
        org.junit.Assert.assertNotNull(bookRequestBuilder10);
        org.junit.Assert.assertNotNull(bookRequestBuilder12);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        java.lang.String str7 = courseTextBook1.getAuthor();
        org.team4.model.items.Newsletter newsletter11 = new org.team4.model.items.Newsletter("PayPal{email='hi!'}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) '4');
        org.team4.model.user.Faculty faculty17 = new org.team4.model.user.Faculty("hi!", "hi!", "hi!", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", false);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase18 = new org.team4.functionality.buy.ItemToPurchase(newsletter11, (org.team4.model.user.User) faculty17);
        java.util.Date date20 = null;
        java.util.Date date21 = null;
        org.team4.model.course.Course course24 = new org.team4.model.course.Course("", date20, date21, "", "hi!");
        org.team4.model.user.Student student30 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "Mobile Wallet", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "", false);
        course24.enrollStudent(student30);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase32 = new org.team4.functionality.buy.ItemToPurchase(newsletter11, (org.team4.model.user.User) student30);
        // The following exception was thrown during execution in test generation
        try {
            courseTextBook1.removeCopies(student30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.team4.model.course.Course.isEnded(java.util.Date)\" because \"this.course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder2 = dVDBuilder0.price((double) 'a');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.yearPublished((int) '4');
        org.team4.model.items.DVD dVD5 = dVDBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder7 = dVDBuilder0.genre("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder9 = dVDBuilder0.genre("PayPal{email='hi!'}");
        org.junit.Assert.assertNotNull(dVDItemBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVD5);
        org.junit.Assert.assertNotNull(dVDBuilder7);
        org.junit.Assert.assertNotNull(dVDBuilder9);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.email("PayPal{email='hi!'}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder4.booktype("Mobile Wallet");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder10 = bookRequestBuilder4.email("");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder12 = bookRequestBuilder10.ISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
        org.junit.Assert.assertNotNull(bookRequestBuilder10);
        org.junit.Assert.assertNotNull(bookRequestBuilder12);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished((int) (short) -1);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.publisher("");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder6 = magazineBuilder0.publisher("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineBuilder6.price(0.0d);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished((int) (short) -1);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.publisher("");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder6 = magazineBuilder0.publisher("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder8 = magazineBuilder0.publisher("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder10 = magazineBuilder0.quantity((int) (short) 0);
        org.team4.model.items.Magazine magazine11 = magazineBuilder0.build();
        int int12 = magazine11.getIssueNumber();
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineBuilder6);
        org.junit.Assert.assertNotNull(magazineBuilder8);
        org.junit.Assert.assertNotNull(magazineItemBuilder10);
        org.junit.Assert.assertNotNull(magazine11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("hi!", "hi!", "hi!", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", false);
        java.lang.String str6 = faculty5.getEmail();
        long long7 = faculty5.getFacultyID();
        java.lang.String str8 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.team4.model.user.Faculty faculty9 = new org.team4.model.user.Faculty("", "", "hi!", "hi!", true);
        java.util.ArrayList<java.lang.String> strList10 = faculty9.getCourses();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        faculty9.setCourses(strList13);
        org.team4.model.user.Student student16 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "", strList13);
        java.util.ArrayList<java.lang.String> strList17 = student16.getCourses();
        java.lang.String str18 = student16.toString();
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, type=, validated=false]" + "'", str18, "User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, type=, validated=false]");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.team4.functionality.buy.ItemPurchased itemPurchased2 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.lang.String str3 = itemPurchased2.toString();
        java.lang.String str4 = itemPurchased2.getEmail();
        java.lang.String str5 = itemPurchased2.getTitle();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:58 EDT 2024}" + "'", str3, "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:58 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("", "", "", "", true);
        manager5.setName("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
        manager5.setManagerID(10L);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("hi!");
        boolean boolean2 = payPal1.isValid();
        java.lang.String str3 = payPal1.getMode();
        boolean boolean4 = payPal1.isValid();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Mobile Wallet" + "'", str3, "Mobile Wallet");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder3 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder5 = courseTextBookBuilder0.genre("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder7 = bookBuilder5.hasHardCopy(false);
        org.team4.model.items.builder.BookBuilder bookBuilder9 = bookBuilder7.edition(10);
        org.team4.model.items.builder.BookBuilder bookBuilder11 = bookBuilder7.noOfPages((int) (byte) 100);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(bookBuilder3);
        org.junit.Assert.assertNotNull(bookBuilder5);
        org.junit.Assert.assertNotNull(bookBuilder7);
        org.junit.Assert.assertNotNull(bookBuilder9);
        org.junit.Assert.assertNotNull(bookBuilder11);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("PayPal{email='hi!'}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) '4');
        org.team4.model.user.Faculty faculty9 = new org.team4.model.user.Faculty("hi!", "hi!", "hi!", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", false);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase10 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) faculty9);
        org.team4.model.user.Faculty faculty20 = new org.team4.model.user.Faculty("", "", "hi!", "hi!", true);
        java.util.ArrayList<java.lang.String> strList21 = faculty20.getCourses();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        faculty20.setCourses(strList24);
        org.team4.model.user.Student student27 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "", strList24);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase28 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) student27);
        org.team4.model.user.User user29 = itemToPurchase28.getUser();
        user29.setName("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}");
        org.junit.Assert.assertNull(strList21);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(user29);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.hasHardCopy(true);
        java.util.Date date4 = null;
        java.util.Date date5 = null;
        org.team4.model.course.Course course8 = new org.team4.model.course.Course("", date4, date5, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder9 = courseTextBookBuilder0.course(course8);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder11 = courseTextBookBuilder9.ISBN("");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder12 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder14 = courseTextBookBuilder12.hasHardCopy(true);
        java.util.Date date16 = null;
        java.util.Date date17 = null;
        org.team4.model.course.Course course20 = new org.team4.model.course.Course("", date16, date17, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder21 = courseTextBookBuilder12.course(course20);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder22 = courseTextBookBuilder9.course(course20);
        java.util.Date date25 = null;
        java.util.Date date26 = null;
        org.team4.model.items.RentedItem rentedItem27 = new org.team4.model.items.RentedItem("", "hi!", date25, date26);
        rentedItem27.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem27.setTitle("hi!");
        java.util.Date date32 = rentedItem27.getRentDate();
        org.team4.functionality.buy.ItemPurchased itemPurchased36 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date37 = itemPurchased36.getDatePurchased();
        java.util.Date date38 = itemPurchased36.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased41 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date42 = itemPurchased41.getDatePurchased();
        org.team4.model.course.Course course45 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date38, date42, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem27.setRentDate(date38);
        java.util.Date date47 = rentedItem27.getRentDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean48 = course20.isStarted(date47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(courseTextBookBuilder9);
        org.junit.Assert.assertNotNull(bookItemBuilder11);
        org.junit.Assert.assertNotNull(bookBuilder14);
        org.junit.Assert.assertNotNull(courseTextBookBuilder21);
        org.junit.Assert.assertNotNull(courseTextBookBuilder22);
        org.junit.Assert.assertNull(date32);
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Fri Mar 29 00:41:59 EDT 2024");
        org.junit.Assert.assertNotNull(date38);
// flaky:         org.junit.Assert.assertEquals(date38.toString(), "Fri Mar 29 00:41:59 EDT 2024");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Fri Mar 29 00:41:59 EDT 2024");
        org.junit.Assert.assertNotNull(date47);
// flaky:         org.junit.Assert.assertEquals(date47.toString(), "Fri Mar 29 00:41:59 EDT 2024");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
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
        java.lang.String str19 = debitCard3.getMode();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(newsletter15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Debit Card" + "'", str19, "Debit Card");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
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
        org.team4.model.user.Manager manager17 = new org.team4.model.user.Manager("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:58 EDT 2024}", (long) (-1));
        boolean boolean18 = purchasableItemDecorator11.equals((java.lang.Object) "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}");
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
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
        int int22 = courseTextBook1.getYearPublished();
        courseTextBook1.setQuantity((int) (short) -1);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(dVDItemBuilder18);
        org.junit.Assert.assertNotNull(dVDItemBuilder20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        org.team4.model.user.Faculty faculty9 = new org.team4.model.user.Faculty("hi!", "hi!", "", "", (long) 1, strList7);
        java.util.ArrayList<java.lang.String> strList10 = faculty9.getCourses();
        java.util.ArrayList<java.lang.String> strList11 = faculty9.getCourses();
        faculty9.setEmail("");
        faculty9.setEmail("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("", date1, date2, "hi!", "hi!");
        java.lang.String str6 = course5.getProfessorEmail();
        java.lang.String str7 = course5.getCourseTextBookISBN();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.team4.model.items.Item item0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.items.Magazine magazine3 = new org.team4.model.items.Magazine(item0, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"title\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder3 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder5 = courseTextBookBuilder0.genre("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder7 = bookBuilder5.hasHardCopy(false);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder9 = bookBuilder7.price((double) 3763455L);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(bookBuilder3);
        org.junit.Assert.assertNotNull(bookBuilder5);
        org.junit.Assert.assertNotNull(bookBuilder7);
        org.junit.Assert.assertNotNull(bookItemBuilder9);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.util.Date date2 = null;
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("", "hi!", date2);
        java.lang.String str4 = itemPurchased3.getEmail();
        java.lang.String str5 = itemPurchased3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=null}" + "'", str5, "ItemPurchased{title='', email='hi!', datePurchased=null}");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.email("PayPal{email='hi!'}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder4.author("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.author("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.edition((int) (short) 0);
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        java.lang.String str2 = courseTextBook1.getPublisher();
        org.team4.model.items.DVD dVD5 = new org.team4.model.items.DVD((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) 1L);
        boolean boolean6 = dVD5.isRentable();
        double double7 = dVD5.getDuration();
        int int8 = dVD5.getQuantity();
        java.lang.String str9 = dVD5.getISBN();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished((int) (short) -1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder4 = magazineBuilder0.quantity(100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineItemBuilder4.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineItemBuilder4.price((double) '#');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder10 = magazineItemBuilder4.ISBN("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder12 = magazineItemBuilder10.yearPublished((int) (byte) 100);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineItemBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
        org.junit.Assert.assertNotNull(magazineItemBuilder10);
        org.junit.Assert.assertNotNull(magazineItemBuilder12);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator9 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        boolean boolean10 = courseTextBook1.isRentable();
        org.team4.model.items.decorator.ItemDecorator itemDecorator11 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook1);
        java.lang.String str12 = courseTextBook1.getAuthor();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        java.util.Date date8 = null;
        java.util.Date date9 = null;
        org.team4.model.course.Course course12 = new org.team4.model.course.Course("", date8, date9, "", "hi!");
        org.team4.model.course.CourseTextBook courseTextBook14 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", 10, "hi!", "", (int) (byte) -1, course12, false);
        java.lang.String str15 = course12.getCourseTextBookISBN();
        java.util.Date date18 = null;
        java.util.Date date19 = null;
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter20 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!", date18, date19);
        subscribeNewsletter20.setTitle("PayPal");
        java.util.Date date25 = null;
        java.util.Date date26 = null;
        org.team4.model.items.RentedItem rentedItem27 = new org.team4.model.items.RentedItem("", "hi!", date25, date26);
        rentedItem27.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem27.setTitle("hi!");
        java.util.Date date32 = rentedItem27.getRentDate();
        rentedItem27.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.functionality.buy.ItemPurchased itemPurchased38 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date39 = itemPurchased38.getDatePurchased();
        java.util.Date date40 = itemPurchased38.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased43 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date44 = itemPurchased43.getDatePurchased();
        org.team4.model.course.Course course47 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date40, date44, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem27.setDueDate(date44);
        subscribeNewsletter20.setDateDue(date44);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean50 = course12.isStarted(date44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(date32);
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Fri Mar 29 00:41:59 EDT 2024");
        org.junit.Assert.assertNotNull(date40);
// flaky:         org.junit.Assert.assertEquals(date40.toString(), "Fri Mar 29 00:41:59 EDT 2024");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Fri Mar 29 00:41:59 EDT 2024");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("hi!", "", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase((double) (-1L), (org.team4.model.user.User) student5);
        org.team4.model.paymentmodes.PayPal payPal8 = new org.team4.model.paymentmodes.PayPal("hi!");
        boolean boolean9 = payPal8.isValid();
        java.lang.String str10 = payPal8.getMode();
        java.lang.String str11 = payPal8.toString();
        java.lang.String str12 = payPal8.getMode();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete13 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) payPal8);
        org.team4.model.paymentmodes.DebitCard debitCard17 = new org.team4.model.paymentmodes.DebitCard("PayPal{email='hi!'}", (int) (byte) 10, (int) (short) 1);
        boolean boolean18 = debitCard17.isValid();
        boolean boolean19 = debitCard17.notExpired();
        boolean boolean20 = debitCard17.correctLength();
        boolean boolean21 = debitCard17.isValid();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete22 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) debitCard17);
        java.lang.String str23 = debitCard17.getMode();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Mobile Wallet" + "'", str10, "Mobile Wallet");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PayPal{email='hi!'}" + "'", str11, "PayPal{email='hi!'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Mobile Wallet" + "'", str12, "Mobile Wallet");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Debit Card" + "'", str23, "Debit Card");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        org.team4.model.items.Item item12 = purchasableItemDecorator11.getItem();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertNotNull(item12);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
        int int14 = courseTextBook1.getYearPublished();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
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
        java.util.Date date53 = null;
        java.util.Date date54 = null;
        org.team4.model.items.RentedItem rentedItem55 = new org.team4.model.items.RentedItem("", "hi!", date53, date54);
        rentedItem55.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem55.setTitle("hi!");
        java.util.Date date60 = rentedItem55.getRentDate();
        org.team4.functionality.buy.ItemPurchased itemPurchased64 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date65 = itemPurchased64.getDatePurchased();
        java.util.Date date66 = itemPurchased64.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased69 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date70 = itemPurchased69.getDatePurchased();
        org.team4.model.course.Course course73 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date66, date70, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem55.setRentDate(date66);
        subscribeNewsletter2.setDateSubscribed(date66);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PayPal" + "'", str3, "PayPal");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Fri Mar 29 00:41:59 EDT 2024");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Fri Mar 29 00:41:59 EDT 2024");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Fri Mar 29 00:41:59 EDT 2024");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Fri Mar 29 00:41:59 EDT 2024");
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Fri Mar 29 00:41:59 EDT 2024");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Fri Mar 29 00:41:59 EDT 2024");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Fri Mar 29 00:41:59 EDT 2024");
        org.junit.Assert.assertNotNull(date38);
// flaky:         org.junit.Assert.assertEquals(date38.toString(), "Fri Mar 29 00:41:59 EDT 2024");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Fri Mar 29 00:41:59 EDT 2024");
        org.junit.Assert.assertNull(date60);
        org.junit.Assert.assertNotNull(date65);
// flaky:         org.junit.Assert.assertEquals(date65.toString(), "Fri Mar 29 00:41:59 EDT 2024");
        org.junit.Assert.assertNotNull(date66);
// flaky:         org.junit.Assert.assertEquals(date66.toString(), "Fri Mar 29 00:41:59 EDT 2024");
        org.junit.Assert.assertNotNull(date70);
// flaky:         org.junit.Assert.assertEquals(date70.toString(), "Fri Mar 29 00:41:59 EDT 2024");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
        boolean boolean12 = purchasableItemDecorator11.isPurchasable();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(item10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.email("PayPal{email='hi!'}");
        org.team4.model.items.BookRequest bookRequest7 = bookRequestBuilder6.build();
        java.lang.String str8 = bookRequest7.getISBN();
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequest7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator9 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        double double10 = courseTextBook1.getPrice();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("ItemPurchased{title='', email='hi!', datePurchased=null}", "User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, type=, validated=false]", "hi!", "Debit Card", false);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.team4.model.user.User user4 = new org.team4.model.user.User("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:56 EDT 2024, dateDue=Mon Apr 29 00:41:56 EDT 2024}", "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}", "hi!");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
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
        org.team4.model.items.Newsletter newsletter16 = purchaseComplete15.getNewsletter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PayPal" + "'", str12, "PayPal");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PayPal" + "'", str13, "PayPal");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(newsletter16);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
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
        java.util.Date date36 = course33.getStartDate();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(bookBuilder3);
        org.junit.Assert.assertNotNull(courseTextBookBuilder5);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(courseTextBookBuilder15);
        org.junit.Assert.assertNotNull(courseTextBookBuilder16);
        org.junit.Assert.assertNotNull(bookBuilder18);
        org.junit.Assert.assertNotNull(bookBuilder20);
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Fri Mar 29 00:41:59 EDT 2024");
        org.junit.Assert.assertNotNull(date26);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Fri Mar 29 00:41:59 EDT 2024");
        org.junit.Assert.assertNotNull(date30);
// flaky:         org.junit.Assert.assertEquals(date30.toString(), "Fri Mar 29 00:41:59 EDT 2024");
        org.junit.Assert.assertNotNull(courseTextBookBuilder34);
        org.junit.Assert.assertNotNull(date35);
// flaky:         org.junit.Assert.assertEquals(date35.toString(), "Fri Mar 29 00:41:59 EDT 2024");
        org.junit.Assert.assertNotNull(date36);
// flaky:         org.junit.Assert.assertEquals(date36.toString(), "Fri Mar 29 00:41:59 EDT 2024");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("PayPal{email='hi!'}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) '4');
        org.team4.model.user.User user4 = null;
        org.team4.functionality.buy.ItemToPurchase itemToPurchase5 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, user4);
        org.team4.model.user.User user6 = itemToPurchase5.getUser();
        double double7 = itemToPurchase5.getAmount();
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "");
        subscribeNewsletter2.setTitle("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        java.util.Date date5 = subscribeNewsletter2.getDateSubscribed();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 29 00:41:59 EDT 2024");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("hi!");
        boolean boolean2 = payPal1.isValid();
        java.lang.String str3 = payPal1.toString();
        boolean boolean4 = payPal1.isValid();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PayPal{email='hi!'}" + "'", str3, "PayPal{email='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("Mobile Wallet", "Mobile Wallet", "Mobile Wallet", "hi!", (long) (short) -1);
        long long6 = manager5.getManagerID();
        long long7 = manager5.getManagerID();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        boolean boolean3 = courseTextBook1.equals((java.lang.Object) (byte) 1);
        java.lang.String str4 = courseTextBook1.getTitle();
        org.team4.model.course.Course course5 = courseTextBook1.getCourse();
        boolean boolean7 = courseTextBook1.equals((java.lang.Object) 100);
        org.team4.model.user.Student student13 = new org.team4.model.user.Student("Mobile Wallet", "", "hi!", "Mobile Wallet", true);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase14 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) courseTextBook1, (org.team4.model.user.User) student13);
        int int15 = courseTextBook1.getQuantity();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(course5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("Debit Card", "ItemPurchased{title='', email='hi!', datePurchased=null}", "", "Mobile Wallet", (long) (byte) -1);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        org.team4.model.user.Faculty faculty18 = new org.team4.model.user.Faculty("hi!", "hi!", "", "", (long) 1, strList16);
        faculty18.setFacultyID(10L);
        java.util.ArrayList<java.lang.String> strList21 = faculty18.getCourses();
        org.team4.model.user.Student student22 = new org.team4.model.user.Student("PayPal", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}", strList21);
        org.team4.model.user.Faculty faculty23 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "PayPal{email='hi!'}", "Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}", 2097897L, strList21);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.team4.model.user.Manager manager4 = new org.team4.model.user.Manager("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}", "Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.team4.model.user.User user4 = new org.team4.model.user.User("Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]", "Debit Card", "User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, type=, validated=false]", "hi!");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getStartDate();
        java.lang.String str7 = course5.getCourseTextBookISBN();
        java.util.Date date8 = course5.getStartDate();
        java.lang.String str9 = course5.getProfessorEmail();
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.Course course1 = null;
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder2 = courseTextBookBuilder0.course(course1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder2.title("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder2.noOfPages((int) (byte) 10);
        org.junit.Assert.assertNotNull(courseTextBookBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.Magazine magazine1 = magazineBuilder0.build();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder3 = magazineBuilder0.publisher("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.model.items.Magazine magazine4 = magazineBuilder0.build();
        org.junit.Assert.assertNotNull(magazine1);
        org.junit.Assert.assertNotNull(magazineBuilder3);
        org.junit.Assert.assertNotNull(magazine4);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.util.Date date4 = null;
        java.util.Date date5 = null;
        org.team4.model.items.RentedItem rentedItem6 = new org.team4.model.items.RentedItem("", "hi!", date4, date5);
        java.lang.String str7 = rentedItem6.getISBN();
        java.util.Date date8 = null;
        rentedItem6.setDueDate(date8);
        rentedItem6.setISBN("PayPal");
        org.team4.functionality.buy.ItemPurchased itemPurchased15 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date16 = itemPurchased15.getDatePurchased();
        java.util.Date date17 = itemPurchased15.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased20 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date21 = itemPurchased20.getDatePurchased();
        org.team4.model.course.Course course24 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date17, date21, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem6.setDueDate(date17);
        org.team4.functionality.buy.ItemPurchased itemPurchased26 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "SubscribeNewsletter{title='hi!', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}', dateSubscribed=null, dateDue=null}", date17);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Fri Mar 29 00:41:59 EDT 2024");
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Fri Mar 29 00:41:59 EDT 2024");
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Fri Mar 29 00:41:59 EDT 2024");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        boolean boolean2 = courseTextBook1.isPurchasable();
        courseTextBook1.setPrice((double) (-1.0f));
        java.lang.String str5 = courseTextBook1.getPublisher();
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        org.team4.model.course.Course course11 = new org.team4.model.course.Course("", date7, date8, "", "hi!");
        java.util.Date date12 = course11.getStartDate();
        java.lang.String str13 = course11.getProfessorEmail();
        org.team4.model.user.Student student19 = new org.team4.model.user.Student("hi!", "hi!", "", "", true);
        course11.enrollStudent(student19);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        org.team4.model.user.Faculty faculty35 = new org.team4.model.user.Faculty("hi!", "hi!", "", "", (long) 1, strList33);
        org.team4.model.user.Faculty faculty36 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "Mobile Wallet", "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (long) (byte) 100, strList33);
        student19.setCourses(strList33);
        // The following exception was thrown during execution in test generation
        try {
            courseTextBook1.makeCopies(student19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.team4.model.course.Course.isEnrolled(org.team4.model.user.Student)\" because \"this.course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.items.RentedItem rentedItem4 = new org.team4.model.items.RentedItem("", "hi!", date2, date3);
        java.util.Date date5 = null;
        rentedItem4.setRentDate(date5);
        rentedItem4.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        java.util.Date date8 = null;
        java.util.Date date9 = null;
        org.team4.model.course.Course course12 = new org.team4.model.course.Course("", date8, date9, "", "hi!");
        org.team4.model.course.CourseTextBook courseTextBook14 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", 10, "hi!", "", (int) (byte) -1, course12, false);
        java.lang.String str15 = courseTextBook1.getTitle();
        org.team4.model.course.Course course16 = courseTextBook1.getCourse();
        int int17 = courseTextBook1.getNoOfPages();
        int int18 = courseTextBook1.getEdition();
        boolean boolean19 = courseTextBook1.hasSoftCopy();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(course16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.items.RentedItem rentedItem4 = new org.team4.model.items.RentedItem("", "hi!", date2, date3);
        rentedItem4.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem4.setTitle("hi!");
        rentedItem4.setISBN("Mobile Wallet");
        rentedItem4.setTitle("hi!");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "hi!");
        subscribeNewsletter2.setEmail("Mobile Wallet");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.team4.model.user.User user4 = new org.team4.model.user.User("", "hi!", "hi!", "");
        user4.setPassword("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.email("PayPal{email='hi!'}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder4.booktype("Mobile Wallet");
        org.team4.model.items.BookRequest bookRequest9 = bookRequestBuilder8.build();
        java.lang.String str10 = bookRequest9.getEmail();
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
        org.junit.Assert.assertNotNull(bookRequest9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PayPal{email='hi!'}" + "'", str10, "PayPal{email='hi!'}");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:56 EDT 2024, dateDue=Mon Apr 29 00:41:56 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}", "PayPal", "Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]", false);
        java.lang.String str6 = nonFaculty5.getPassword();
        nonFaculty5.setUniversityID(1015016L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}" + "'", str6, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("User [email=hi!, password=hi!, name=hi!, type=, validated=false]", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:56 EDT 2024, dateDue=Mon Apr 29 00:41:56 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}", true);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.course.Course course2 = courseTextBook1.getCourse();
        org.team4.model.course.Course course3 = courseTextBook1.getCourse();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(course2);
        org.junit.Assert.assertNull(course3);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        boolean boolean3 = courseTextBook1.equals((java.lang.Object) (byte) 1);
        java.lang.String str4 = courseTextBook1.getTitle();
        java.util.List<org.team4.model.user.Student> studentList5 = courseTextBook1.getStudentsWithCopies();
        boolean boolean6 = courseTextBook1.hasSoftCopy();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(studentList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished((int) (short) -1);
        org.team4.model.items.builder.MagazineBuilder magazineBuilder4 = magazineBuilder0.publisher("");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder6 = magazineBuilder0.publisher("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder8 = magazineBuilder0.publisher("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder10 = magazineBuilder0.quantity((int) (short) 0);
        org.team4.model.items.Magazine magazine11 = magazineBuilder0.build();
        org.team4.model.items.Magazine magazine12 = magazineBuilder0.build();
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineBuilder4);
        org.junit.Assert.assertNotNull(magazineBuilder6);
        org.junit.Assert.assertNotNull(magazineBuilder8);
        org.junit.Assert.assertNotNull(magazineItemBuilder10);
        org.junit.Assert.assertNotNull(magazine11);
        org.junit.Assert.assertNotNull(magazine12);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
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
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder21 = courseTextBookBuilder19.title("ProcessPayment{modes=null, itemToPurchase=null}");
        org.junit.Assert.assertNotNull(bookItemBuilder2);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Fri Mar 29 00:41:59 EDT 2024");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Fri Mar 29 00:41:59 EDT 2024");
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Fri Mar 29 00:41:59 EDT 2024");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}" + "'", str16, "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.junit.Assert.assertNotNull(courseTextBookBuilder17);
        org.junit.Assert.assertNotNull(courseTextBookBuilder19);
        org.junit.Assert.assertNotNull(bookItemBuilder21);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.MagazineBuilder magazineBuilder2 = magazineBuilder0.issueNumber((int) (byte) 0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder4 = magazineBuilder0.price((double) (short) -1);
        org.junit.Assert.assertNotNull(magazineBuilder2);
        org.junit.Assert.assertNotNull(magazineItemBuilder4);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("PayPal{email='hi!'}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) '4');
        org.team4.model.user.Faculty faculty8 = new org.team4.model.user.Faculty("hi!", "hi!", "hi!", "hi!");
        faculty8.setFacultyID((long) 0);
        java.lang.String[] strArray15 = new java.lang.String[] { "ProcessPayment{modes=null, itemToPurchase=null}", "ProcessPayment{modes=null, itemToPurchase=null}", "hi!", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        faculty8.setCourses(strList16);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase19 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) faculty8);
        org.team4.model.items.Item item20 = itemToPurchase19.getItem();
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(item20);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.hasHardCopy(true);
        java.util.Date date4 = null;
        java.util.Date date5 = null;
        org.team4.model.course.Course course8 = new org.team4.model.course.Course("", date4, date5, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder9 = courseTextBookBuilder0.course(course8);
        org.team4.model.course.CourseTextBook courseTextBook10 = courseTextBookBuilder0.build();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(courseTextBookBuilder9);
        org.junit.Assert.assertNotNull(courseTextBook10);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "PayPal", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", (int) (byte) 10, "");
        java.lang.String str7 = bookRequest6.getEmail();
        java.lang.String str8 = bookRequest6.getBookType();
        java.lang.String str9 = bookRequest6.getAuthor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}" + "'", str7, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}" + "'", str9, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.team4.model.user.User user5 = new org.team4.model.user.User("PayPal{email='hi!'}", "Debit Card", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}", true);
        java.lang.String str6 = user5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}" + "'", str6, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
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
        java.lang.String str36 = itemToPurchase35.toString();
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Fri Mar 29 00:41:59 EDT 2024");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Fri Mar 29 00:41:59 EDT 2024");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Fri Mar 29 00:41:59 EDT 2024");
        org.junit.Assert.assertNull(strList27);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.user.Visitor visitor7 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str8 = visitor7.getName();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase9 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor7);
        org.team4.model.items.Newsletter newsletter10 = itemToPurchase9.getNewsletter();
        org.team4.model.items.Newsletter newsletter11 = itemToPurchase9.getNewsletter();
        org.team4.functionality.buy.ProcessPayment processPayment12 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) mobileWallet1, itemToPurchase9);
        org.team4.model.items.Item item13 = itemToPurchase9.getItem();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(newsletter10);
        org.junit.Assert.assertNull(newsletter11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("Mobile Wallet", "", "Mobile Wallet", "", 0, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        java.lang.String str7 = bookRequest6.getISBN();
        java.lang.String str8 = bookRequest6.getISBN();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.team4.model.user.Student student4 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "PayPal{email='hi!'}", "Book{genre='null', noOfPages=0, author='null', ISBN=null, publisher='null', edition='0'}");
        java.util.ArrayList<java.lang.String> strList5 = null;
        student4.setCourses(strList5);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder2 = dVDBuilder0.price((double) (-1.0f));
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDItemBuilder2.ISBN("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDItemBuilder4.price((double) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDItemBuilder6.price((double) (-1L));
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder10 = dVDItemBuilder6.quantity((int) (short) 0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder12 = dVDItemBuilder10.yearPublished((int) (short) 10);
        org.junit.Assert.assertNotNull(dVDItemBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
        org.junit.Assert.assertNotNull(dVDItemBuilder10);
        org.junit.Assert.assertNotNull(dVDItemBuilder12);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.team4.model.user.User user4 = new org.team4.model.user.User("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "Mobile Wallet", "hi!");
        java.lang.String str5 = user4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}" + "'", str5, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        boolean boolean1 = org.team4.utils.EmailValidator.validEmail("Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
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
        org.team4.model.user.NonFaculty nonFaculty30 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "hi!", "hi!");
        boolean boolean31 = courseTextBook1.equals((java.lang.Object) "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(course16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(course18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.team4.model.user.User user5 = new org.team4.model.user.User("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:59 EDT 2024}", "SubscribeNewsletter{title='hi!', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}', dateSubscribed=null, dateDue=null}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:00 EDT 2024, dateDue=Mon Apr 29 00:42:00 EDT 2024}", true);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.util.Date date2 = null;
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "hi!", date2);
        java.lang.String str4 = itemPurchased3.getTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str4, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase2 = null;
        org.team4.functionality.buy.ProcessPayment processPayment3 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) payPal1, itemToPurchase2);
        java.lang.String str4 = payPal1.toString();
        boolean boolean5 = payPal1.isValid();
        boolean boolean6 = payPal1.isValid();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PayPal{email='hi!'}" + "'", str4, "PayPal{email='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "Mobile Wallet", "hi!", (long) 100);
        long long6 = nonFaculty5.getUniversityID();
        java.lang.String str7 = nonFaculty5.getPassword();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}" + "'", str7, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.team4.model.user.UserFactory userFactory0 = new org.team4.model.user.UserFactory();
        org.team4.model.user.User user6 = userFactory0.getUser("", "hi!", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "hi!", true);
        org.team4.model.user.User user12 = userFactory0.getUser("", "hi!", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", true);
        org.team4.model.user.User user18 = userFactory0.getUser("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}", "", "SubscribeNewsletter{title='hi!', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}', dateSubscribed=null, dateDue=null}", "Debit Card", false);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user18);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder2 = dVDBuilder0.price((double) (-1.0f));
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDItemBuilder2.ISBN("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDItemBuilder4.title("");
        org.junit.Assert.assertNotNull(dVDItemBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("", date1, date2, "hi!", "hi!");
        java.util.Date date8 = null;
        java.util.Date date9 = null;
        org.team4.model.items.RentedItem rentedItem10 = new org.team4.model.items.RentedItem("", "hi!", date8, date9);
        rentedItem10.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem10.setTitle("hi!");
        java.util.Date date15 = rentedItem10.getRentDate();
        rentedItem10.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.functionality.buy.ItemPurchased itemPurchased21 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date22 = itemPurchased21.getDatePurchased();
        java.util.Date date23 = itemPurchased21.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased26 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date27 = itemPurchased26.getDatePurchased();
        org.team4.model.course.Course course30 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date23, date27, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem10.setDueDate(date27);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = course5.isStarted(date27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Fri Mar 29 00:42:00 EDT 2024");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Fri Mar 29 00:42:00 EDT 2024");
        org.junit.Assert.assertNotNull(date27);
// flaky:         org.junit.Assert.assertEquals(date27.toString(), "Fri Mar 29 00:42:00 EDT 2024");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.team4.model.user.Manager manager4 = new org.team4.model.user.Manager("hi!", "hi!", "hi!", "");
        manager4.setType("");
        manager4.setManagerID(4601205L);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("Mobile Wallet", "PayPal");
        java.lang.String str3 = subscribeNewsletter2.getEmail();
        java.util.Date date4 = subscribeNewsletter2.getDateDue();
        java.lang.String str5 = subscribeNewsletter2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PayPal" + "'", str3, "PayPal");
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Mon Apr 29 00:42:00 EDT 2024");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PayPal" + "'", str5, "PayPal");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("PayPal{email='hi!'}", 0, (int) (short) 1);
        boolean boolean4 = debitCard3.correctLength();
        java.lang.String str5 = debitCard3.getMode();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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
        boolean boolean19 = debitCard3.correctLength();
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
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
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
        java.lang.String str15 = magazine1.getPublisher();
        org.team4.model.items.decorator.ItemDecorator itemDecorator16 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) magazine1);
        org.junit.Assert.assertNotNull(magazine1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.items.RentedItem rentedItem4 = new org.team4.model.items.RentedItem("", "hi!", date2, date3);
        java.lang.String str5 = rentedItem4.getISBN();
        java.util.Date date6 = null;
        rentedItem4.setRentDate(date6);
        java.lang.String str8 = rentedItem4.getISBN();
        java.lang.String str9 = rentedItem4.getISBN();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder2 = dVDBuilder0.price((double) (-1.0f));
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDItemBuilder2.ISBN("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDItemBuilder4.price((double) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDItemBuilder6.price((double) (-1L));
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder10 = dVDItemBuilder6.quantity((int) (short) 0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder12 = dVDItemBuilder10.price((double) (short) -1);
        org.junit.Assert.assertNotNull(dVDItemBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
        org.junit.Assert.assertNotNull(dVDItemBuilder10);
        org.junit.Assert.assertNotNull(dVDItemBuilder12);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.Course course1 = null;
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder2 = courseTextBookBuilder0.course(course1);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder4 = courseTextBookBuilder2.isVirtual(false);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder6 = courseTextBookBuilder2.quantity((int) '4');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = courseTextBookBuilder2.ISBN("PayPal");
        org.junit.Assert.assertNotNull(courseTextBookBuilder2);
        org.junit.Assert.assertNotNull(courseTextBookBuilder4);
        org.junit.Assert.assertNotNull(bookItemBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("PayPal{email='hi!'}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) '4');
        double double4 = newsletter3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase2 = null;
        org.team4.functionality.buy.ProcessPayment processPayment3 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) payPal1, itemToPurchase2);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete4 = processPayment3.getPurchaseCompleted();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete5 = processPayment3.getPurchaseCompleted();
        org.junit.Assert.assertNull(purchaseComplete4);
        org.junit.Assert.assertNull(purchaseComplete5);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder2 = dVDBuilder0.price((double) 'a');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.yearPublished((int) (byte) 0);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDItemBuilder4.ISBN("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDItemBuilder6.yearPublished((int) (byte) 1);
        org.junit.Assert.assertNotNull(dVDItemBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("Debit Card", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}", (int) (short) -1, "Mobile Wallet");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder4 = bookBuilder2.genre("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder6 = bookBuilder4.publisher("");
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(bookBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter4 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!", date2, date3);
        java.lang.String str5 = subscribeNewsletter4.getTitle();
        java.util.Date date6 = subscribeNewsletter4.getDateSubscribed();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("hi!", "", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase((double) (-1L), (org.team4.model.user.User) student5);
        org.team4.model.paymentmodes.PayPal payPal8 = new org.team4.model.paymentmodes.PayPal("hi!");
        boolean boolean9 = payPal8.isValid();
        java.lang.String str10 = payPal8.getMode();
        java.lang.String str11 = payPal8.toString();
        java.lang.String str12 = payPal8.getMode();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete13 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) payPal8);
        org.team4.model.paymentmodes.DebitCard debitCard17 = new org.team4.model.paymentmodes.DebitCard("PayPal{email='hi!'}", (int) (byte) 10, (int) (short) 1);
        boolean boolean18 = debitCard17.isValid();
        boolean boolean19 = debitCard17.notExpired();
        boolean boolean20 = debitCard17.correctLength();
        boolean boolean21 = debitCard17.isValid();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete22 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) debitCard17);
        double double23 = purchaseComplete22.getAmount();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Mobile Wallet" + "'", str10, "Mobile Wallet");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PayPal{email='hi!'}" + "'", str11, "PayPal{email='hi!'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Mobile Wallet" + "'", str12, "Mobile Wallet");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.items.RentedItem rentedItem4 = new org.team4.model.items.RentedItem("", "hi!", date2, date3);
        java.util.Date date5 = null;
        rentedItem4.setRentDate(date5);
        rentedItem4.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:00 EDT 2024, dateDue=Mon Apr 29 00:42:00 EDT 2024}");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder3 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder5 = courseTextBookBuilder0.genre("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder7 = bookBuilder5.hasHardCopy(false);
        org.team4.model.items.builder.BookBuilder bookBuilder9 = bookBuilder7.edition(10);
        org.team4.model.items.builder.BookBuilder bookBuilder11 = bookBuilder9.genre("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.model.items.builder.BookBuilder bookBuilder13 = bookBuilder9.hasHardCopy(false);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(bookBuilder3);
        org.junit.Assert.assertNotNull(bookBuilder5);
        org.junit.Assert.assertNotNull(bookBuilder7);
        org.junit.Assert.assertNotNull(bookBuilder9);
        org.junit.Assert.assertNotNull(bookBuilder11);
        org.junit.Assert.assertNotNull(bookBuilder13);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("PayPal", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:00 EDT 2024, dateDue=Mon Apr 29 00:42:00 EDT 2024}", "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}", (int) (byte) 10, "hi!");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.team4.model.user.Faculty faculty4 = new org.team4.model.user.Faculty("", "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
        long long5 = faculty4.getFacultyID();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("Mobile Wallet", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}", 0L);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("Mobile Wallet", "", "Mobile Wallet", "", 0, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        java.lang.String str7 = bookRequest6.getTitle();
        java.lang.String str8 = bookRequest6.getAuthor();
        java.lang.String str9 = bookRequest6.getBookType();
        java.lang.String str10 = bookRequest6.getBookType();
        java.lang.String str11 = bookRequest6.getAuthor();
        java.lang.String str12 = bookRequest6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Mobile Wallet" + "'", str8, "Mobile Wallet");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str9, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str10, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Mobile Wallet" + "'", str11, "Mobile Wallet");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str5 = visitor4.getName();
        visitor4.setType("PayPal");
        visitor4.setPassword("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.team4.functionality.buy.ItemPurchased itemPurchased2 = new org.team4.functionality.buy.ItemPurchased("Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.items.RentedItem rentedItem4 = new org.team4.model.items.RentedItem("", "hi!", date2, date3);
        rentedItem4.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem4.setTitle("hi!");
        java.util.Date date9 = rentedItem4.getRentDate();
        rentedItem4.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        rentedItem4.setISBN("Debit Card");
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.team4.model.paymentmodes.MobileWallet mobileWallet1 = new org.team4.model.paymentmodes.MobileWallet("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        java.lang.String str2 = mobileWallet1.getMode();
        java.lang.String str3 = mobileWallet1.getMode();
        boolean boolean4 = mobileWallet1.isValid();
        boolean boolean5 = mobileWallet1.isValid();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PayPal" + "'", str2, "PayPal");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PayPal" + "'", str3, "PayPal");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
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
        org.team4.model.items.builder.BookBuilder bookBuilder23 = bookBuilder21.noOfPages((-1));
        org.junit.Assert.assertNotNull(bookItemBuilder2);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Fri Mar 29 00:42:00 EDT 2024");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Fri Mar 29 00:42:00 EDT 2024");
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Fri Mar 29 00:42:00 EDT 2024");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}" + "'", str16, "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.junit.Assert.assertNotNull(courseTextBookBuilder17);
        org.junit.Assert.assertNotNull(courseTextBookBuilder19);
        org.junit.Assert.assertNotNull(bookBuilder21);
        org.junit.Assert.assertNotNull(bookBuilder23);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ProcessPayment{modes=null, itemToPurchase=null}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:58 EDT 2024}");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder2 = dVDBuilder0.price((double) 'a');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.yearPublished((int) '4');
        org.team4.model.items.DVD dVD5 = dVDBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder7 = dVDBuilder0.genre("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder9 = dVDBuilder7.duration((double) (short) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder11 = dVDBuilder7.yearPublished((int) (short) 0);
        org.team4.model.items.builder.DVDBuilder dVDBuilder13 = dVDBuilder7.duration((double) (byte) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder15 = dVDBuilder13.quantity((int) (short) 0);
        org.junit.Assert.assertNotNull(dVDItemBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVD5);
        org.junit.Assert.assertNotNull(dVDBuilder7);
        org.junit.Assert.assertNotNull(dVDBuilder9);
        org.junit.Assert.assertNotNull(dVDItemBuilder11);
        org.junit.Assert.assertNotNull(dVDBuilder13);
        org.junit.Assert.assertNotNull(dVDItemBuilder15);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) (short) -1);
        java.lang.String str4 = newsletter3.getTitle();
        org.team4.model.user.Visitor visitor9 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str10 = visitor9.getName();
        visitor9.setType("PayPal");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase13 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) visitor9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}" + "'", str4, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished((int) (short) -1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder4 = magazineItemBuilder2.yearPublished((int) (byte) 100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineItemBuilder4.ISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineItemBuilder4.price((double) (short) 10);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineItemBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getStartDate();
        java.util.Date date7 = course5.getEndDate();
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        org.team4.model.items.RentedItem rentedItem12 = new org.team4.model.items.RentedItem("", "hi!", date10, date11);
        java.lang.String str13 = rentedItem12.getISBN();
        java.util.Date date14 = null;
        rentedItem12.setDueDate(date14);
        rentedItem12.setISBN("PayPal");
        org.team4.functionality.buy.ItemPurchased itemPurchased21 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date22 = itemPurchased21.getDatePurchased();
        java.util.Date date23 = itemPurchased21.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased26 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date27 = itemPurchased26.getDatePurchased();
        org.team4.model.course.Course course30 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date23, date27, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem12.setDueDate(date23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = course5.isEnded(date23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Fri Mar 29 00:42:00 EDT 2024");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Fri Mar 29 00:42:00 EDT 2024");
        org.junit.Assert.assertNotNull(date27);
// flaky:         org.junit.Assert.assertEquals(date27.toString(), "Fri Mar 29 00:42:00 EDT 2024");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("hi!");
        org.team4.model.user.Visitor visitor7 = new org.team4.model.user.Visitor("hi!", "hi!", "hi!", "hi!");
        java.lang.String str8 = visitor7.getName();
        org.team4.functionality.buy.ItemToPurchase itemToPurchase9 = new org.team4.functionality.buy.ItemToPurchase(1.0d, (org.team4.model.user.User) visitor7);
        org.team4.functionality.buy.ProcessPayment processPayment10 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) payPal1, itemToPurchase9);
        java.lang.String str11 = processPayment10.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ProcessPayment{modes=PayPal{email='hi!'}, itemToPurchase=ItemToPurchase{item=null, user=User [email=hi!, password=hi!, name=hi!, type=hi!, validated=false], newsletter=null}}" + "'", str11, "ProcessPayment{modes=PayPal{email='hi!'}, itemToPurchase=ItemToPurchase{item=null, user=User [email=hi!, password=hi!, name=hi!, type=hi!, validated=false], newsletter=null}}");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter4 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!", date2, date3);
        java.util.Date date5 = subscribeNewsletter4.getDateSubscribed();
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("PayPal{email='hi!'}", "Debit Card", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}", true);
        visitor5.setName("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.hasHardCopy(true);
        java.util.Date date4 = null;
        java.util.Date date5 = null;
        org.team4.model.course.Course course8 = new org.team4.model.course.Course("", date4, date5, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder9 = courseTextBookBuilder0.course(course8);
        org.team4.model.course.CourseTextBook courseTextBook10 = courseTextBookBuilder9.build();
        org.team4.model.items.Item item11 = new org.team4.model.items.Item((org.team4.model.items.Item) courseTextBook10);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator12 = new org.team4.model.items.decorator.PurchasableItemDecorator(item11);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(courseTextBookBuilder9);
        org.junit.Assert.assertNotNull(courseTextBook10);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.team4.model.user.User user6 = new org.team4.model.user.User("hi!", "", "hi!", "", true);
        user6.setName("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase9 = new org.team4.functionality.buy.ItemToPurchase((double) (short) -1, user6);
        org.team4.model.paymentmodes.PayPal payPal11 = new org.team4.model.paymentmodes.PayPal("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase12 = null;
        org.team4.functionality.buy.ProcessPayment processPayment13 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) payPal11, itemToPurchase12);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete14 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase9, (org.team4.model.paymentmodes.PaymentValidator) payPal11);
        org.team4.model.items.Item item15 = purchaseComplete14.getItem();
        org.team4.model.items.Newsletter newsletter16 = purchaseComplete14.getNewsletter();
        long long17 = purchaseComplete14.getPurchaseID();
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(newsletter16);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3090830L + "'", long17 == 3090830L);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        org.team4.model.user.Student student20 = new org.team4.model.user.Student("", "", "", "ProcessPayment{modes=null, itemToPurchase=null}", false);
        course11.enrollStudent(student20);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(bookBuilder3);
        org.junit.Assert.assertNotNull(courseTextBookBuilder5);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(courseTextBookBuilder14);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("", "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:59 EDT 2024, dateDue=Mon Apr 29 00:41:59 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}", true);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        java.lang.String str2 = courseTextBook1.getPublisher();
        boolean boolean3 = courseTextBook1.hasSoftCopy();
        java.lang.String str4 = courseTextBook1.getPublisher();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.util.Date date4 = null;
        java.util.Date date5 = null;
        org.team4.model.items.RentedItem rentedItem6 = new org.team4.model.items.RentedItem("", "hi!", date4, date5);
        java.lang.String str7 = rentedItem6.getISBN();
        java.util.Date date8 = null;
        rentedItem6.setDueDate(date8);
        rentedItem6.setISBN("PayPal");
        java.util.Date date12 = rentedItem6.getRentDate();
        org.team4.functionality.buy.ItemPurchased itemPurchased19 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date20 = itemPurchased19.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased21 = new org.team4.functionality.buy.ItemPurchased("Mobile Wallet", "", date20);
        org.team4.functionality.buy.ItemPurchased itemPurchased25 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date26 = itemPurchased25.getDatePurchased();
        java.util.Date date27 = itemPurchased25.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased31 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date32 = itemPurchased31.getDatePurchased();
        java.util.Date date33 = itemPurchased31.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased36 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date37 = itemPurchased36.getDatePurchased();
        org.team4.model.course.Course course40 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date33, date37, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.course.Course course43 = new org.team4.model.course.Course("PayPal{email='hi!'}", date27, date33, "Mobile Wallet", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
        org.team4.model.items.RentedItem rentedItem44 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "PayPal", date20, date27);
        rentedItem6.setDueDate(date27);
        java.util.Date date50 = null;
        java.util.Date date51 = null;
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter52 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!", date50, date51);
        org.team4.functionality.buy.ItemPurchased itemPurchased59 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date60 = itemPurchased59.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased61 = new org.team4.functionality.buy.ItemPurchased("Mobile Wallet", "", date60);
        org.team4.functionality.buy.ItemPurchased itemPurchased65 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date66 = itemPurchased65.getDatePurchased();
        java.util.Date date67 = itemPurchased65.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased71 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date72 = itemPurchased71.getDatePurchased();
        java.util.Date date73 = itemPurchased71.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased76 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date77 = itemPurchased76.getDatePurchased();
        org.team4.model.course.Course course80 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date73, date77, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.course.Course course83 = new org.team4.model.course.Course("PayPal{email='hi!'}", date67, date73, "Mobile Wallet", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
        org.team4.model.items.RentedItem rentedItem84 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "PayPal", date60, date67);
        subscribeNewsletter52.setDateDue(date60);
        org.team4.functionality.buy.ItemPurchased itemPurchased88 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date89 = itemPurchased88.getDatePurchased();
        java.util.Date date90 = itemPurchased88.getDatePurchased();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter91 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}", date60, date90);
        rentedItem6.setDueDate(date90);
        org.team4.functionality.buy.ItemPurchased itemPurchased95 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date96 = itemPurchased95.getDatePurchased();
        org.team4.model.items.RentedItem rentedItem97 = new org.team4.model.items.RentedItem("", "PayPal", date90, date96);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Fri Mar 29 00:42:00 EDT 2024");
        org.junit.Assert.assertNotNull(date26);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Fri Mar 29 00:42:00 EDT 2024");
        org.junit.Assert.assertNotNull(date27);
// flaky:         org.junit.Assert.assertEquals(date27.toString(), "Fri Mar 29 00:42:00 EDT 2024");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Fri Mar 29 00:42:00 EDT 2024");
        org.junit.Assert.assertNotNull(date33);
// flaky:         org.junit.Assert.assertEquals(date33.toString(), "Fri Mar 29 00:42:00 EDT 2024");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Fri Mar 29 00:42:00 EDT 2024");
        org.junit.Assert.assertNotNull(date60);
// flaky:         org.junit.Assert.assertEquals(date60.toString(), "Fri Mar 29 00:42:00 EDT 2024");
        org.junit.Assert.assertNotNull(date66);
// flaky:         org.junit.Assert.assertEquals(date66.toString(), "Fri Mar 29 00:42:00 EDT 2024");
        org.junit.Assert.assertNotNull(date67);
// flaky:         org.junit.Assert.assertEquals(date67.toString(), "Fri Mar 29 00:42:00 EDT 2024");
        org.junit.Assert.assertNotNull(date72);
// flaky:         org.junit.Assert.assertEquals(date72.toString(), "Fri Mar 29 00:42:00 EDT 2024");
        org.junit.Assert.assertNotNull(date73);
// flaky:         org.junit.Assert.assertEquals(date73.toString(), "Fri Mar 29 00:42:00 EDT 2024");
        org.junit.Assert.assertNotNull(date77);
// flaky:         org.junit.Assert.assertEquals(date77.toString(), "Fri Mar 29 00:42:00 EDT 2024");
        org.junit.Assert.assertNotNull(date89);
// flaky:         org.junit.Assert.assertEquals(date89.toString(), "Fri Mar 29 00:42:00 EDT 2024");
        org.junit.Assert.assertNotNull(date90);
// flaky:         org.junit.Assert.assertEquals(date90.toString(), "Fri Mar 29 00:42:00 EDT 2024");
        org.junit.Assert.assertNotNull(date96);
// flaky:         org.junit.Assert.assertEquals(date96.toString(), "Fri Mar 29 00:42:00 EDT 2024");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder3 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder5 = bookBuilder3.hasHardCopy(true);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(bookBuilder3);
        org.junit.Assert.assertNotNull(bookBuilder5);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("", "", "", "", true);
        manager5.setManagerID(0L);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.Magazine magazine1 = magazineBuilder0.build();
        java.lang.String str2 = magazine1.getPublisher();
        int int3 = magazine1.getIssueNumber();
        int int4 = magazine1.getIssueNumber();
        java.lang.String str5 = magazine1.getISBN();
        java.lang.String str6 = magazine1.getPublisher();
        org.junit.Assert.assertNotNull(magazine1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.team4.model.user.Visitor visitor5 = new org.team4.model.user.Visitor("ProcessPayment{modes=null, itemToPurchase=null}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", false);
        visitor5.setName("User [email=hi!, password=hi!, name=hi!, type=, validated=false]");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("hi!", "", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase((double) (-1L), (org.team4.model.user.User) student5);
        java.lang.String str7 = itemToPurchase6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ItemToPurchase{item=null, user=User [email=hi!, password=, name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, type=ProcessPayment{modes=null, itemToPurchase=null}, validated=false], newsletter=null}" + "'", str7, "ItemToPurchase{item=null, user=User [email=hi!, password=, name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, type=ProcessPayment{modes=null, itemToPurchase=null}, validated=false], newsletter=null}");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        boolean boolean3 = courseTextBook1.equals((java.lang.Object) (byte) 1);
        java.lang.String str4 = courseTextBook1.getTitle();
        java.lang.String str5 = courseTextBook1.getTitle();
        boolean boolean6 = courseTextBook1.hasSoftCopy();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        org.team4.model.user.Faculty faculty9 = new org.team4.model.user.Faculty("hi!", "hi!", "", "", (long) 1, strList7);
        faculty9.setFacultyID(10L);
        faculty9.setFacultyID(1015016L);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, type=, validated=false]");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.team4.model.user.Student student9 = new org.team4.model.user.Student("hi!", "", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase10 = new org.team4.functionality.buy.ItemToPurchase((double) (-1L), (org.team4.model.user.User) student9);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        org.team4.model.user.Faculty faculty20 = new org.team4.model.user.Faculty("hi!", "hi!", "", "", (long) 1, strList18);
        java.util.ArrayList<java.lang.String> strList21 = faculty20.getCourses();
        java.util.ArrayList<java.lang.String> strList22 = faculty20.getCourses();
        student9.setCourses(strList22);
        org.team4.model.user.Student student24 = new org.team4.model.user.Student("PayPal{email='hi!'}", "PayPal{email='hi!'}", "", "Book{genre='null', noOfPages=0, author='null', ISBN=null, publisher='null', edition='0'}", strList22);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("PayPal{email='hi!'}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) '4');
        org.team4.model.user.Faculty faculty9 = new org.team4.model.user.Faculty("hi!", "hi!", "hi!", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", false);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase10 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) faculty9);
        org.team4.model.user.Faculty faculty20 = new org.team4.model.user.Faculty("", "", "hi!", "hi!", true);
        java.util.ArrayList<java.lang.String> strList21 = faculty20.getCourses();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        faculty20.setCourses(strList24);
        org.team4.model.user.Student student27 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "", strList24);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase28 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) student27);
        java.lang.String str29 = newsletter3.getLink();
        org.junit.Assert.assertNull(strList21);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str29, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:58 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:59 EDT 2024, dateDue=Mon Apr 29 00:41:59 EDT 2024}");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.hasHardCopy(true);
        java.util.Date date4 = null;
        java.util.Date date5 = null;
        org.team4.model.course.Course course8 = new org.team4.model.course.Course("", date4, date5, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder9 = courseTextBookBuilder0.course(course8);
        org.team4.model.course.CourseTextBook courseTextBook10 = courseTextBookBuilder9.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder12 = courseTextBookBuilder9.quantity((int) (byte) 1);
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(courseTextBookBuilder9);
        org.junit.Assert.assertNotNull(courseTextBook10);
        org.junit.Assert.assertNotNull(bookItemBuilder12);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
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
        java.lang.String str94 = course93.getCourseName();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:00 EDT 2024, dateDue=Mon Apr 29 00:42:00 EDT 2024}" + "'", str4, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:00 EDT 2024, dateDue=Mon Apr 29 00:42:00 EDT 2024}");
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Fri Mar 29 00:42:00 EDT 2024");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Fri Mar 29 00:42:00 EDT 2024");
        org.junit.Assert.assertNotNull(date26);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Fri Mar 29 00:42:00 EDT 2024");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:00 EDT 2024, dateDue=Mon Apr 29 00:42:00 EDT 2024}" + "'", str35, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:00 EDT 2024, dateDue=Mon Apr 29 00:42:00 EDT 2024}");
        org.junit.Assert.assertNull(date47);
        org.junit.Assert.assertNotNull(date52);
// flaky:         org.junit.Assert.assertEquals(date52.toString(), "Fri Mar 29 00:42:00 EDT 2024");
        org.junit.Assert.assertNotNull(date53);
// flaky:         org.junit.Assert.assertEquals(date53.toString(), "Fri Mar 29 00:42:00 EDT 2024");
        org.junit.Assert.assertNotNull(date57);
// flaky:         org.junit.Assert.assertEquals(date57.toString(), "Fri Mar 29 00:42:00 EDT 2024");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertNotNull(date80);
// flaky:         org.junit.Assert.assertEquals(date80.toString(), "Fri Mar 29 00:42:00 EDT 2024");
        org.junit.Assert.assertNotNull(date81);
// flaky:         org.junit.Assert.assertEquals(date81.toString(), "Fri Mar 29 00:42:00 EDT 2024");
        org.junit.Assert.assertNotNull(date85);
// flaky:         org.junit.Assert.assertEquals(date85.toString(), "Fri Mar 29 00:42:00 EDT 2024");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "Mobile Wallet" + "'", str94, "Mobile Wallet");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "PayPal", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", (int) (byte) 10, "");
        java.lang.String str7 = bookRequest6.getTitle();
        java.lang.String str8 = bookRequest6.getAuthor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PayPal" + "'", str7, "PayPal");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}" + "'", str8, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("hi!", "", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase((double) (-1L), (org.team4.model.user.User) student5);
        org.team4.model.paymentmodes.PayPal payPal8 = new org.team4.model.paymentmodes.PayPal("hi!");
        boolean boolean9 = payPal8.isValid();
        java.lang.String str10 = payPal8.getMode();
        java.lang.String str11 = payPal8.toString();
        java.lang.String str12 = payPal8.getMode();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete13 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) payPal8);
        org.team4.model.user.User user14 = itemToPurchase6.getUser();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Mobile Wallet" + "'", str10, "Mobile Wallet");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PayPal{email='hi!'}" + "'", str11, "PayPal{email='hi!'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Mobile Wallet" + "'", str12, "Mobile Wallet");
        org.junit.Assert.assertNotNull(user14);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.items.RentedItem rentedItem4 = new org.team4.model.items.RentedItem("", "hi!", date2, date3);
        rentedItem4.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        java.util.Date date7 = rentedItem4.getRentDate();
        java.util.Date date8 = rentedItem4.getRentDate();
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) (short) -1);
        double double4 = newsletter3.getPrice();
        org.team4.model.user.Manager manager9 = new org.team4.model.user.Manager("hi!", "hi!", "hi!", "");
        manager9.setType("");
        long long12 = manager9.getManagerID();
        manager9.setManagerID((long) (-1));
        org.team4.functionality.buy.ItemToPurchase itemToPurchase15 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) manager9);
        manager9.setManagerID((long) (short) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
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
        org.team4.model.items.Newsletter newsletter24 = purchaseComplete23.getNewsletter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(newsletter8);
        org.junit.Assert.assertNull(newsletter9);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Mobile Wallet" + "'", str22, "Mobile Wallet");
        org.junit.Assert.assertNull(newsletter24);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
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
        boolean boolean14 = rentableItemDecorator10.isRentable();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder2 = dVDBuilder0.price((double) (-1.0f));
        org.team4.model.items.builder.DVDBuilder dVDBuilder4 = dVDBuilder0.genre("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder4.duration((double) 10L);
        org.team4.model.items.builder.DVDBuilder dVDBuilder8 = dVDBuilder6.duration((double) 0.0f);
        org.team4.model.items.builder.DVDBuilder dVDBuilder10 = dVDBuilder8.duration((double) (-1.0f));
        org.junit.Assert.assertNotNull(dVDItemBuilder2);
        org.junit.Assert.assertNotNull(dVDBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDBuilder8);
        org.junit.Assert.assertNotNull(dVDBuilder10);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) (short) -1);
        double double4 = newsletter3.getPrice();
        org.team4.model.user.Manager manager9 = new org.team4.model.user.Manager("hi!", "hi!", "hi!", "");
        manager9.setType("");
        long long12 = manager9.getManagerID();
        manager9.setManagerID((long) (-1));
        org.team4.functionality.buy.ItemToPurchase itemToPurchase15 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) manager9);
        java.lang.String str16 = newsletter3.getLink();
        org.team4.model.user.Student student23 = new org.team4.model.user.Student("Mobile Wallet", "", "hi!", "Mobile Wallet", true);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase24 = new org.team4.functionality.buy.ItemToPurchase((double) (short) -1, (org.team4.model.user.User) student23);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase25 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) student23);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str16, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.team4.model.paymentmodes.PaymentValidator paymentValidator0 = null;
        org.team4.model.user.Student student6 = new org.team4.model.user.Student("hi!", "", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase7 = new org.team4.functionality.buy.ItemToPurchase((double) (-1L), (org.team4.model.user.User) student6);
        org.team4.functionality.buy.ProcessPayment processPayment8 = new org.team4.functionality.buy.ProcessPayment(paymentValidator0, itemToPurchase7);
        org.team4.model.user.User user9 = itemToPurchase7.getUser();
        org.junit.Assert.assertNotNull(user9);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        boolean boolean7 = courseTextBook1.hasSoftCopy();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
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
        org.team4.model.user.Student student23 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "PayPal{email='hi!'}", "Book{genre='null', noOfPages=0, author='null', ISBN=null, publisher='null', edition='0'}");
        // The following exception was thrown during execution in test generation
        try {
            courseTextBook1.makeCopies(student23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.team4.model.course.Course.isEnrolled(org.team4.model.user.Student)\" because \"this.course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(course16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(course18);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        boolean boolean3 = courseTextBook1.equals((java.lang.Object) (byte) 1);
        java.lang.String str4 = courseTextBook1.getTitle();
        org.team4.model.course.Course course5 = courseTextBook1.getCourse();
        boolean boolean7 = courseTextBook1.equals((java.lang.Object) 100);
        org.team4.model.user.Student student13 = new org.team4.model.user.Student("Mobile Wallet", "", "hi!", "Mobile Wallet", true);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase14 = new org.team4.functionality.buy.ItemToPurchase((org.team4.model.items.Item) courseTextBook1, (org.team4.model.user.User) student13);
        java.lang.String str15 = courseTextBook1.getGenre();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(course5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
        student24.setEmail("hi!");
        boolean boolean27 = student24.isValidated();
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder3 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder5 = courseTextBookBuilder0.genre("hi!");
        org.team4.model.items.builder.BookBuilder bookBuilder7 = bookBuilder5.hasHardCopy(false);
        org.team4.model.items.builder.BookBuilder bookBuilder9 = bookBuilder7.edition(10);
        org.team4.model.items.builder.BookBuilder bookBuilder11 = bookBuilder7.edition((int) '#');
        org.team4.model.items.builder.BookBuilder bookBuilder13 = bookBuilder11.publisher("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.team4.model.items.builder.BookBuilder bookBuilder15 = bookBuilder13.edition((int) (short) -1);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(bookBuilder3);
        org.junit.Assert.assertNotNull(bookBuilder5);
        org.junit.Assert.assertNotNull(bookBuilder7);
        org.junit.Assert.assertNotNull(bookBuilder9);
        org.junit.Assert.assertNotNull(bookBuilder11);
        org.junit.Assert.assertNotNull(bookBuilder13);
        org.junit.Assert.assertNotNull(bookBuilder15);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder2 = dVDBuilder0.price((double) (-1.0f));
        org.team4.model.items.builder.DVDBuilder dVDBuilder4 = dVDBuilder0.genre("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.model.items.DVD dVD5 = dVDBuilder0.build();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder7 = dVDBuilder0.ISBN("Book{genre='null', noOfPages=0, author='null', ISBN=null, publisher='null', edition='0'}");
        org.junit.Assert.assertNotNull(dVDItemBuilder2);
        org.junit.Assert.assertNotNull(dVDBuilder4);
        org.junit.Assert.assertNotNull(dVD5);
        org.junit.Assert.assertNotNull(dVDItemBuilder7);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("hi!", 100, 100, (double) 10L, "PayPal", false, true);
        int int8 = item7.getYearPublished();
        org.team4.model.items.DVD dVD11 = new org.team4.model.items.DVD(item7, "", (double) 10);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator12 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) dVD11);
        org.team4.model.items.Book book20 = new org.team4.model.items.Book((org.team4.model.items.Item) dVD11, "Mobile Wallet", 10, "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "Mobile Wallet", (int) (byte) 100, false, true);
        double double21 = dVD11.getDuration();
        dVD11.setPurchaseable(false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        boolean boolean1 = org.team4.utils.EmailValidator.validEmail("SubscribeNewsletter{title='', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}', dateSubscribed=Fri Mar 29 00:42:00 EDT 2024, dateDue=Mon Apr 29 00:42:00 EDT 2024}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("Mobile Wallet", "", "Mobile Wallet", "", 0, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        java.lang.String str7 = bookRequest6.getTitle();
        java.lang.String str8 = bookRequest6.getBookType();
        java.lang.String str9 = bookRequest6.getAuthor();
        java.lang.String str10 = bookRequest6.getBookType();
        java.lang.String str11 = bookRequest6.getAuthor();
        int int12 = bookRequest6.getEdition();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str8, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Mobile Wallet" + "'", str9, "Mobile Wallet");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str10, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Mobile Wallet" + "'", str11, "Mobile Wallet");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.items.RentedItem rentedItem4 = new org.team4.model.items.RentedItem("", "hi!", date2, date3);
        java.lang.String str5 = rentedItem4.getISBN();
        java.util.Date date6 = null;
        rentedItem4.setDueDate(date6);
        rentedItem4.setISBN("PayPal");
        java.lang.String str10 = rentedItem4.getISBN();
        java.util.Date date13 = null;
        java.util.Date date14 = null;
        org.team4.model.items.RentedItem rentedItem15 = new org.team4.model.items.RentedItem("", "hi!", date13, date14);
        rentedItem15.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem15.setTitle("hi!");
        java.util.Date date20 = rentedItem15.getRentDate();
        org.team4.functionality.buy.ItemPurchased itemPurchased24 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date25 = itemPurchased24.getDatePurchased();
        java.util.Date date26 = itemPurchased24.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased29 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date30 = itemPurchased29.getDatePurchased();
        org.team4.model.course.Course course33 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date26, date30, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem15.setRentDate(date26);
        java.lang.String str35 = rentedItem15.getISBN();
        java.util.Date date36 = rentedItem15.getRentDate();
        rentedItem4.setDueDate(date36);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PayPal" + "'", str10, "PayPal");
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date26);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date30);
// flaky:         org.junit.Assert.assertEquals(date30.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str35, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.junit.Assert.assertNotNull(date36);
// flaky:         org.junit.Assert.assertEquals(date36.toString(), "Fri Mar 29 00:42:01 EDT 2024");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        int int7 = courseTextBook1.getEdition();
        int int8 = courseTextBook1.getEdition();
        int int9 = courseTextBook1.getNoOfPages();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.team4.functionality.buy.ItemPurchased itemPurchased2 = new org.team4.functionality.buy.ItemPurchased("", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}");
        java.lang.String str3 = itemPurchased2.toString();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ItemPurchased{title='', email='ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}', datePurchased=Fri Mar 29 00:42:01 EDT 2024}" + "'", str3, "ItemPurchased{title='', email='ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}', datePurchased=Fri Mar 29 00:42:01 EDT 2024}");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.team4.model.user.User user6 = new org.team4.model.user.User("hi!", "", "hi!", "", true);
        user6.setName("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase9 = new org.team4.functionality.buy.ItemToPurchase((double) (short) -1, user6);
        org.team4.model.paymentmodes.PayPal payPal11 = new org.team4.model.paymentmodes.PayPal("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase12 = null;
        org.team4.functionality.buy.ProcessPayment processPayment13 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) payPal11, itemToPurchase12);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete14 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase9, (org.team4.model.paymentmodes.PaymentValidator) payPal11);
        org.team4.model.items.Item item15 = purchaseComplete14.getItem();
        double double16 = purchaseComplete14.getAmount();
        org.team4.model.items.Newsletter newsletter17 = purchaseComplete14.getNewsletter();
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNull(newsletter17);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("hi!", "", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase((double) (-1L), (org.team4.model.user.User) student5);
        org.team4.model.paymentmodes.PayPal payPal8 = new org.team4.model.paymentmodes.PayPal("hi!");
        boolean boolean9 = payPal8.isValid();
        java.lang.String str10 = payPal8.getMode();
        java.lang.String str11 = payPal8.toString();
        java.lang.String str12 = payPal8.getMode();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete13 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) payPal8);
        java.lang.String str14 = payPal8.getMode();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Mobile Wallet" + "'", str10, "Mobile Wallet");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PayPal{email='hi!'}" + "'", str11, "PayPal{email='hi!'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Mobile Wallet" + "'", str12, "Mobile Wallet");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Mobile Wallet" + "'", str14, "Mobile Wallet");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter8 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!", date6, date7);
        org.team4.functionality.buy.ItemPurchased itemPurchased15 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date16 = itemPurchased15.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased17 = new org.team4.functionality.buy.ItemPurchased("Mobile Wallet", "", date16);
        org.team4.functionality.buy.ItemPurchased itemPurchased21 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date22 = itemPurchased21.getDatePurchased();
        java.util.Date date23 = itemPurchased21.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased27 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date28 = itemPurchased27.getDatePurchased();
        java.util.Date date29 = itemPurchased27.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased32 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date33 = itemPurchased32.getDatePurchased();
        org.team4.model.course.Course course36 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date29, date33, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.course.Course course39 = new org.team4.model.course.Course("PayPal{email='hi!'}", date23, date29, "Mobile Wallet", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
        org.team4.model.items.RentedItem rentedItem40 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "PayPal", date16, date23);
        subscribeNewsletter8.setDateDue(date16);
        org.team4.functionality.buy.ItemPurchased itemPurchased44 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date45 = itemPurchased44.getDatePurchased();
        java.util.Date date46 = itemPurchased44.getDatePurchased();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter47 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}", date16, date46);
        org.team4.functionality.buy.ItemPurchased itemPurchased48 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "", date16);
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date33);
// flaky:         org.junit.Assert.assertEquals(date33.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date45);
// flaky:         org.junit.Assert.assertEquals(date45.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date46);
// flaky:         org.junit.Assert.assertEquals(date46.toString(), "Fri Mar 29 00:42:01 EDT 2024");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.DVD dVD11 = new org.team4.model.items.DVD((org.team4.model.items.Item) courseTextBook1, "PayPal{email='hi!'}", (double) 100.0f);
        java.lang.String str12 = dVD11.getGenre();
        java.lang.String str13 = dVD11.getGenre();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PayPal{email='hi!'}" + "'", str12, "PayPal{email='hi!'}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PayPal{email='hi!'}" + "'", str13, "PayPal{email='hi!'}");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.hasHardCopy(true);
        java.util.Date date4 = null;
        java.util.Date date5 = null;
        org.team4.model.course.Course course8 = new org.team4.model.course.Course("", date4, date5, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder9 = courseTextBookBuilder0.course(course8);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder11 = courseTextBookBuilder9.ISBN("");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder12 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder14 = courseTextBookBuilder12.hasHardCopy(true);
        java.util.Date date16 = null;
        java.util.Date date17 = null;
        org.team4.model.course.Course course20 = new org.team4.model.course.Course("", date16, date17, "", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder21 = courseTextBookBuilder12.course(course20);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder22 = courseTextBookBuilder9.course(course20);
        org.team4.model.course.CourseTextBook courseTextBook23 = courseTextBookBuilder9.build();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(courseTextBookBuilder9);
        org.junit.Assert.assertNotNull(bookItemBuilder11);
        org.junit.Assert.assertNotNull(bookBuilder14);
        org.junit.Assert.assertNotNull(courseTextBookBuilder21);
        org.junit.Assert.assertNotNull(courseTextBookBuilder22);
        org.junit.Assert.assertNotNull(courseTextBook23);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder0 = new org.team4.model.items.builder.BookRequestBuilder();
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder2 = bookRequestBuilder0.author("hi!");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder4 = bookRequestBuilder2.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder6 = bookRequestBuilder4.booktype("Mobile Wallet");
        org.team4.model.items.builder.BookRequestBuilder bookRequestBuilder8 = bookRequestBuilder4.edition(10);
        java.lang.Class<?> wildcardClass9 = bookRequestBuilder4.getClass();
        org.junit.Assert.assertNotNull(bookRequestBuilder2);
        org.junit.Assert.assertNotNull(bookRequestBuilder4);
        org.junit.Assert.assertNotNull(bookRequestBuilder6);
        org.junit.Assert.assertNotNull(bookRequestBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.team4.model.user.NonFaculty nonFaculty4 = new org.team4.model.user.NonFaculty("ItemPurchased{title='', email='ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}', datePurchased=Fri Mar 29 00:42:01 EDT 2024}", "Book{genre='null', noOfPages=0, author='null', ISBN=null, publisher='null', edition='0'}", "", "SubscribeNewsletter{title='', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}', dateSubscribed=Fri Mar 29 00:42:00 EDT 2024, dateDue=Mon Apr 29 00:42:00 EDT 2024}");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.team4.model.user.Faculty faculty13 = new org.team4.model.user.Faculty("", "", "hi!", "hi!", true);
        java.util.ArrayList<java.lang.String> strList14 = faculty13.getCourses();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        faculty13.setCourses(strList17);
        org.team4.model.user.Student student20 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "", strList17);
        java.util.ArrayList<java.lang.String> strList21 = student20.getCourses();
        org.team4.model.user.Student student22 = new org.team4.model.user.Student("", "Book{genre='null', noOfPages=0, author='null', ISBN=null, publisher='null', edition='0'}", "", "User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, type=, validated=false]", strList21);
        org.junit.Assert.assertNull(strList14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("PayPal{email='hi!'}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) '4');
        org.team4.model.user.User user4 = null;
        org.team4.functionality.buy.ItemToPurchase itemToPurchase5 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, user4);
        org.team4.model.user.User user6 = itemToPurchase5.getUser();
        org.team4.model.items.Item item7 = itemToPurchase5.getItem();
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.team4.model.items.Item item7 = new org.team4.model.items.Item("ItemToPurchase{item=null, user=User [email=hi!, password=, name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, type=ProcessPayment{modes=null, itemToPurchase=null}, validated=false], newsletter=null}", (int) (byte) 0, (int) '#', (double) 2097897L, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}", false, false);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("PayPal{email='hi!'}");
        java.lang.String str2 = payPal1.toString();
        boolean boolean3 = payPal1.isValid();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PayPal{email='PayPal{email='hi!'}'}" + "'", str2, "PayPal{email='PayPal{email='hi!'}'}");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.team4.model.user.Visitor visitor4 = new org.team4.model.user.Visitor("ProcessPayment{modes=null, itemToPurchase=null}", "hi!", "Mobile Wallet", "SubscribeNewsletter{title='', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}', dateSubscribed=Fri Mar 29 00:42:00 EDT 2024, dateDue=Mon Apr 29 00:42:00 EDT 2024}");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        // The following exception was thrown during execution in test generation
        try {
            org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:56 EDT 2024, dateDue=Mon Apr 29 00:41:56 EDT 2024}", (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.team4.model.user.User user4 = new org.team4.model.user.User("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:59 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "hi!", "ItemPurchased{title='', email='hi!', datePurchased=null}");
        java.lang.String str5 = user4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:59 EDT 2024}" + "'", str5, "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:59 EDT 2024}");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.team4.model.user.User user6 = new org.team4.model.user.User("hi!", "", "hi!", "", true);
        user6.setName("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase9 = new org.team4.functionality.buy.ItemToPurchase((double) (short) -1, user6);
        org.team4.model.paymentmodes.PayPal payPal11 = new org.team4.model.paymentmodes.PayPal("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase12 = null;
        org.team4.functionality.buy.ProcessPayment processPayment13 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) payPal11, itemToPurchase12);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete14 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase9, (org.team4.model.paymentmodes.PaymentValidator) payPal11);
        long long15 = purchaseComplete14.getPurchaseID();
        org.team4.model.items.Item item16 = purchaseComplete14.getItem();
        long long17 = purchaseComplete14.getPurchaseID();
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4531993L + "'", long15 == 4531993L);
        org.junit.Assert.assertNull(item16);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 4531993L + "'", long17 == 4531993L);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        boolean boolean1 = org.team4.utils.EmailValidator.validEmail("ItemPurchased{title='', email='ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}', datePurchased=Fri Mar 29 00:42:01 EDT 2024}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        java.util.Date date8 = null;
        java.util.Date date9 = null;
        org.team4.model.course.Course course12 = new org.team4.model.course.Course("", date8, date9, "", "hi!");
        org.team4.model.course.CourseTextBook courseTextBook14 = new org.team4.model.course.CourseTextBook((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", 10, "hi!", "", (int) (byte) -1, course12, false);
        java.lang.String str15 = courseTextBook1.getTitle();
        org.team4.model.course.Course course16 = courseTextBook1.getCourse();
        int int17 = courseTextBook1.getNoOfPages();
        courseTextBook1.setPurchaseable(false);
        java.util.List<org.team4.model.user.Student> studentList20 = courseTextBook1.getStudentsWithCopies();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(course16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(studentList20);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.team4.model.user.User user5 = new org.team4.model.user.User("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='hi!', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}', dateSubscribed=null, dateDue=null}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:59 EDT 2024, dateDue=Mon Apr 29 00:41:59 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}", true);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.team4.model.items.builder.MagazineBuilder magazineBuilder0 = new org.team4.model.items.builder.MagazineBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder2 = magazineBuilder0.yearPublished((int) (short) -1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder4 = magazineBuilder0.quantity(100);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder6 = magazineItemBuilder4.title("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Magazine> magazineItemBuilder8 = magazineItemBuilder6.yearPublished(0);
        org.junit.Assert.assertNotNull(magazineItemBuilder2);
        org.junit.Assert.assertNotNull(magazineItemBuilder4);
        org.junit.Assert.assertNotNull(magazineItemBuilder6);
        org.junit.Assert.assertNotNull(magazineItemBuilder8);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase2 = null;
        org.team4.functionality.buy.ProcessPayment processPayment3 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) payPal1, itemToPurchase2);
        java.lang.String str4 = payPal1.toString();
        boolean boolean5 = payPal1.isValid();
        java.lang.String str6 = payPal1.toString();
        boolean boolean7 = payPal1.isValid();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PayPal{email='hi!'}" + "'", str4, "PayPal{email='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PayPal{email='hi!'}" + "'", str6, "PayPal{email='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.items.RentedItem rentedItem4 = new org.team4.model.items.RentedItem("", "hi!", date2, date3);
        rentedItem4.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem4.setTitle("hi!");
        java.util.Date date9 = rentedItem4.getRentDate();
        java.util.Date date10 = rentedItem4.getDueDate();
        rentedItem4.setTitle("ItemPurchased{title='', email='hi!', datePurchased=null}");
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        org.team4.model.user.Faculty faculty13 = new org.team4.model.user.Faculty("hi!", "hi!", "", "", (long) 1, strList11);
        java.util.ArrayList<java.lang.String> strList14 = faculty13.getCourses();
        java.util.ArrayList<java.lang.String> strList15 = faculty13.getCourses();
        org.team4.model.user.Student student16 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:56 EDT 2024, dateDue=Mon Apr 29 00:41:56 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}", "hi!", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", strList15);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.team4.model.user.NonFaculty nonFaculty5 = new org.team4.model.user.NonFaculty("", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}", false);
        nonFaculty5.setType("hi!");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        org.team4.model.user.Faculty faculty9 = new org.team4.model.user.Faculty("hi!", "hi!", "", "", (long) 1, strList7);
        long long10 = faculty9.getFacultyID();
        faculty9.setFacultyID((long) (byte) 1);
        faculty9.setFacultyID((-1L));
        java.lang.String str15 = faculty9.getType();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.items.RentedItem rentedItem4 = new org.team4.model.items.RentedItem("", "hi!", date2, date3);
        rentedItem4.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem4.setTitle("hi!");
        rentedItem4.setISBN("Mobile Wallet");
        rentedItem4.setTitle("");
        java.util.Date date15 = null;
        java.util.Date date16 = null;
        org.team4.model.items.RentedItem rentedItem17 = new org.team4.model.items.RentedItem("", "hi!", date15, date16);
        java.lang.String str18 = rentedItem17.getISBN();
        java.util.Date date19 = null;
        rentedItem17.setDueDate(date19);
        rentedItem17.setISBN("PayPal");
        java.util.Date date23 = rentedItem17.getRentDate();
        org.team4.functionality.buy.ItemPurchased itemPurchased30 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date31 = itemPurchased30.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased32 = new org.team4.functionality.buy.ItemPurchased("Mobile Wallet", "", date31);
        org.team4.functionality.buy.ItemPurchased itemPurchased36 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date37 = itemPurchased36.getDatePurchased();
        java.util.Date date38 = itemPurchased36.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased42 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date43 = itemPurchased42.getDatePurchased();
        java.util.Date date44 = itemPurchased42.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased47 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date48 = itemPurchased47.getDatePurchased();
        org.team4.model.course.Course course51 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date44, date48, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.course.Course course54 = new org.team4.model.course.Course("PayPal{email='hi!'}", date38, date44, "Mobile Wallet", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
        org.team4.model.items.RentedItem rentedItem55 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "PayPal", date31, date38);
        rentedItem17.setDueDate(date38);
        rentedItem4.setRentDate(date38);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(date23);
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date38);
// flaky:         org.junit.Assert.assertEquals(date38.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date43);
// flaky:         org.junit.Assert.assertEquals(date43.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date48);
// flaky:         org.junit.Assert.assertEquals(date48.toString(), "Fri Mar 29 00:42:01 EDT 2024");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder22 = bookBuilder20.yearPublished((int) (byte) 100);
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
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setPrice((double) (byte) 100);
        org.team4.model.items.DVD dVD11 = new org.team4.model.items.DVD((org.team4.model.items.Item) courseTextBook1, "PayPal{email='hi!'}", (double) 100.0f);
        double double12 = dVD11.getDuration();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
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
        int int13 = courseTextBook1.getYearPublished();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "");
        subscribeNewsletter2.setEmail("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        java.util.Date date5 = subscribeNewsletter2.getDateDue();
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
        java.util.Date date35 = null;
        java.util.Date date36 = null;
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter37 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!", date35, date36);
        subscribeNewsletter37.setTitle("PayPal");
        java.util.Date date42 = null;
        java.util.Date date43 = null;
        org.team4.model.items.RentedItem rentedItem44 = new org.team4.model.items.RentedItem("", "hi!", date42, date43);
        rentedItem44.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem44.setTitle("hi!");
        java.util.Date date49 = rentedItem44.getRentDate();
        rentedItem44.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.functionality.buy.ItemPurchased itemPurchased55 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date56 = itemPurchased55.getDatePurchased();
        java.util.Date date57 = itemPurchased55.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased60 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date61 = itemPurchased60.getDatePurchased();
        org.team4.model.course.Course course64 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date57, date61, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem44.setDueDate(date61);
        subscribeNewsletter37.setDateDue(date61);
        org.team4.model.course.Course course69 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date28, date61, "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "hi!");
        subscribeNewsletter2.setDateSubscribed(date28);
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Apr 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date24);
// flaky:         org.junit.Assert.assertEquals(date24.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNull(date49);
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date57);
// flaky:         org.junit.Assert.assertEquals(date57.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date61);
// flaky:         org.junit.Assert.assertEquals(date61.toString(), "Fri Mar 29 00:42:01 EDT 2024");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("Mobile Wallet", "", "Mobile Wallet", "", 0, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        java.lang.String str7 = bookRequest6.getAuthor();
        java.lang.String str8 = bookRequest6.getISBN();
        java.lang.String str9 = bookRequest6.getTitle();
        int int10 = bookRequest6.getEdition();
        java.lang.String str11 = bookRequest6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Mobile Wallet" + "'", str7, "Mobile Wallet");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Mobile Wallet" + "'", str11, "Mobile Wallet");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
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
        org.team4.functionality.buy.ItemPurchased itemPurchased54 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date55 = itemPurchased54.getDatePurchased();
        java.util.Date date56 = itemPurchased54.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased60 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date61 = itemPurchased60.getDatePurchased();
        java.util.Date date62 = itemPurchased60.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased65 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date66 = itemPurchased65.getDatePurchased();
        org.team4.model.course.Course course69 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date62, date66, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.course.Course course72 = new org.team4.model.course.Course("PayPal{email='hi!'}", date56, date62, "Mobile Wallet", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
        subscribeNewsletter2.setDateDue(date62);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PayPal" + "'", str3, "PayPal");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date38);
// flaky:         org.junit.Assert.assertEquals(date38.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date55);
// flaky:         org.junit.Assert.assertEquals(date55.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date61);
// flaky:         org.junit.Assert.assertEquals(date61.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date62);
// flaky:         org.junit.Assert.assertEquals(date62.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date66);
// flaky:         org.junit.Assert.assertEquals(date66.toString(), "Fri Mar 29 00:42:01 EDT 2024");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.Course course1 = null;
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder2 = courseTextBookBuilder0.course(course1);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder4 = courseTextBookBuilder2.isVirtual(false);
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder2.noOfPages((int) (short) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder8 = bookBuilder6.title("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}");
        org.junit.Assert.assertNotNull(courseTextBookBuilder2);
        org.junit.Assert.assertNotNull(courseTextBookBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookItemBuilder8);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.team4.model.user.User user6 = new org.team4.model.user.User("hi!", "", "hi!", "", true);
        user6.setName("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase9 = new org.team4.functionality.buy.ItemToPurchase((double) (short) -1, user6);
        org.team4.model.paymentmodes.PayPal payPal11 = new org.team4.model.paymentmodes.PayPal("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase12 = null;
        org.team4.functionality.buy.ProcessPayment processPayment13 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) payPal11, itemToPurchase12);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete14 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase9, (org.team4.model.paymentmodes.PaymentValidator) payPal11);
        long long15 = purchaseComplete14.getPurchaseID();
        double double16 = purchaseComplete14.getAmount();
        double double17 = purchaseComplete14.getAmount();
        org.team4.model.user.User user18 = purchaseComplete14.getUser();
        org.team4.model.items.Item item19 = purchaseComplete14.getItem();
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 9261356L + "'", long15 == 9261356L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("PayPal{email='hi!'}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) '4');
        org.team4.model.user.Faculty faculty8 = new org.team4.model.user.Faculty("hi!", "hi!", "hi!", "hi!");
        faculty8.setFacultyID((long) 0);
        java.lang.String[] strArray15 = new java.lang.String[] { "ProcessPayment{modes=null, itemToPurchase=null}", "ProcessPayment{modes=null, itemToPurchase=null}", "hi!", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        faculty8.setCourses(strList16);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase19 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) faculty8);
        java.lang.String str20 = newsletter3.getLink();
        double double21 = newsletter3.getPrice();
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str20, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) (short) -1);
        double double4 = newsletter3.getPrice();
        org.team4.model.user.Manager manager9 = new org.team4.model.user.Manager("hi!", "hi!", "hi!", "");
        manager9.setType("");
        long long12 = manager9.getManagerID();
        manager9.setManagerID((long) (-1));
        org.team4.functionality.buy.ItemToPurchase itemToPurchase15 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) manager9);
        org.team4.model.user.Faculty faculty21 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "", false);
        org.team4.functionality.buy.ItemToPurchase itemToPurchase22 = new org.team4.functionality.buy.ItemToPurchase(newsletter3, (org.team4.model.user.User) faculty21);
        java.lang.String str23 = faculty21.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}" + "'", str23, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        org.team4.model.items.decorator.ItemDecorator itemDecorator17 = new org.team4.model.items.decorator.ItemDecorator((org.team4.model.items.Item) courseTextBook1);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
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
        org.team4.model.paymentmodes.CreditCard creditCard26 = new org.team4.model.paymentmodes.CreditCard("Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]", (int) (byte) 1, 10);
        boolean boolean27 = creditCard26.correctLength();
        boolean boolean28 = creditCard26.correctLength();
        boolean boolean29 = courseTextBook1.equals((java.lang.Object) boolean28);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.author("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}");
        org.junit.Assert.assertNotNull(bookBuilder2);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        boolean boolean3 = courseTextBook1.equals((java.lang.Object) (byte) 1);
        java.lang.String str4 = courseTextBook1.getTitle();
        org.team4.model.course.Course course5 = courseTextBook1.getCourse();
        java.util.List<org.team4.model.user.Student> studentList6 = courseTextBook1.getStudentsWithCopies();
        java.util.Date date8 = null;
        java.util.Date date9 = null;
        org.team4.model.course.Course course12 = new org.team4.model.course.Course("", date8, date9, "", "hi!");
        java.util.Date date13 = course12.getStartDate();
        java.lang.String str14 = course12.getProfessorEmail();
        org.team4.model.user.Student student20 = new org.team4.model.user.Student("hi!", "hi!", "", "", true);
        course12.enrollStudent(student20);
        org.team4.model.user.Student student27 = new org.team4.model.user.Student("hi!", "hi!", "", "", true);
        boolean boolean28 = course12.isEnrolled(student27);
        student27.setType("Mobile Wallet");
        // The following exception was thrown during execution in test generation
        try {
            courseTextBook1.removeCopies(student27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.team4.model.course.Course.isEnded(java.util.Date)\" because \"this.course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(course5);
        org.junit.Assert.assertNotNull(studentList6);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
        java.lang.String str2 = payPal1.getMode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Mobile Wallet" + "'", str2, "Mobile Wallet");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "");
        java.lang.String str3 = subscribeNewsletter2.toString();
        java.lang.String str4 = subscribeNewsletter2.toString();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:01 EDT 2024, dateDue=Mon Apr 29 00:42:01 EDT 2024}" + "'", str3, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:01 EDT 2024, dateDue=Mon Apr 29 00:42:01 EDT 2024}");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:01 EDT 2024, dateDue=Mon Apr 29 00:42:01 EDT 2024}" + "'", str4, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:01 EDT 2024, dateDue=Mon Apr 29 00:42:01 EDT 2024}");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("Mobile Wallet", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "Debit Card", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", 0L);
        long long6 = manager5.getManagerID();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter22 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "");
        java.lang.String str23 = subscribeNewsletter22.toString();
        java.util.Date date24 = null;
        subscribeNewsletter22.setDateDue(date24);
        java.util.Date date28 = null;
        java.util.Date date29 = null;
        org.team4.model.items.RentedItem rentedItem30 = new org.team4.model.items.RentedItem("", "hi!", date28, date29);
        rentedItem30.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem30.setTitle("hi!");
        java.util.Date date35 = rentedItem30.getRentDate();
        org.team4.functionality.buy.ItemPurchased itemPurchased39 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date40 = itemPurchased39.getDatePurchased();
        java.util.Date date41 = itemPurchased39.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased44 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date45 = itemPurchased44.getDatePurchased();
        org.team4.model.course.Course course48 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date41, date45, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem30.setRentDate(date41);
        subscribeNewsletter22.setDateSubscribed(date41);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter53 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "");
        java.lang.String str54 = subscribeNewsletter53.toString();
        java.util.Date date55 = null;
        subscribeNewsletter53.setDateDue(date55);
        java.util.Date date59 = null;
        java.util.Date date60 = null;
        org.team4.model.items.RentedItem rentedItem61 = new org.team4.model.items.RentedItem("", "hi!", date59, date60);
        rentedItem61.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem61.setTitle("hi!");
        java.util.Date date66 = rentedItem61.getRentDate();
        org.team4.functionality.buy.ItemPurchased itemPurchased70 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date71 = itemPurchased70.getDatePurchased();
        java.util.Date date72 = itemPurchased70.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased75 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date76 = itemPurchased75.getDatePurchased();
        org.team4.model.course.Course course79 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date72, date76, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem61.setRentDate(date72);
        subscribeNewsletter53.setDateSubscribed(date72);
        subscribeNewsletter22.setDateSubscribed(date72);
        rentedItem4.setRentDate(date72);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Fri Mar 29 00:42:01 EDT 2024");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:01 EDT 2024, dateDue=Mon Apr 29 00:42:01 EDT 2024}" + "'", str23, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:01 EDT 2024, dateDue=Mon Apr 29 00:42:01 EDT 2024}");
        org.junit.Assert.assertNull(date35);
        org.junit.Assert.assertNotNull(date40);
// flaky:         org.junit.Assert.assertEquals(date40.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date41);
// flaky:         org.junit.Assert.assertEquals(date41.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date45);
// flaky:         org.junit.Assert.assertEquals(date45.toString(), "Fri Mar 29 00:42:01 EDT 2024");
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:01 EDT 2024, dateDue=Mon Apr 29 00:42:01 EDT 2024}" + "'", str54, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:01 EDT 2024, dateDue=Mon Apr 29 00:42:01 EDT 2024}");
        org.junit.Assert.assertNull(date66);
        org.junit.Assert.assertNotNull(date71);
// flaky:         org.junit.Assert.assertEquals(date71.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date72);
// flaky:         org.junit.Assert.assertEquals(date72.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date76);
// flaky:         org.junit.Assert.assertEquals(date76.toString(), "Fri Mar 29 00:42:01 EDT 2024");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "");
        org.team4.functionality.buy.ItemPurchased itemPurchased6 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date7 = itemPurchased6.getDatePurchased();
        java.util.Date date8 = itemPurchased6.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased11 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date12 = itemPurchased11.getDatePurchased();
        org.team4.model.course.Course course15 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date8, date12, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        subscribeNewsletter2.setDateSubscribed(date8);
        java.util.Date date17 = subscribeNewsletter2.getDateDue();
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Mon Apr 29 00:42:01 EDT 2024");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        boolean boolean3 = courseTextBook1.equals((java.lang.Object) (byte) 1);
        java.lang.String str4 = courseTextBook1.getTitle();
        org.team4.model.course.Course course5 = courseTextBook1.getCourse();
        boolean boolean7 = courseTextBook1.equals((java.lang.Object) 100);
        java.util.List<org.team4.model.user.Student> studentList8 = courseTextBook1.getStudentsWithCopies();
        courseTextBook1.setRentable(false);
        org.team4.model.items.Book book18 = new org.team4.model.items.Book((org.team4.model.items.Item) courseTextBook1, "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", (int) (short) 100, "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "PayPal{email='hi!'}", (-1), true, true);
        int int19 = book18.getEdition();
        int int20 = book18.getEdition();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(course5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(studentList8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.team4.functionality.buy.ItemPurchased itemPurchased3 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date4 = itemPurchased3.getDatePurchased();
        java.util.Date date5 = itemPurchased3.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased8 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date9 = itemPurchased8.getDatePurchased();
        org.team4.model.course.Course course12 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date5, date9, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        java.lang.String str13 = course12.getCourseName();
        java.lang.String str14 = course12.getProfessorEmail();
        java.util.Date date15 = course12.getStartDate();
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}" + "'", str13, "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str14, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Fri Mar 29 00:42:01 EDT 2024");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        java.lang.String str2 = courseTextBook1.getPublisher();
        boolean boolean3 = courseTextBook1.hasSoftCopy();
        java.lang.String str4 = courseTextBook1.getGenre();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        boolean boolean3 = courseTextBook1.equals((java.lang.Object) (byte) 1);
        java.lang.String str4 = courseTextBook1.getTitle();
        java.lang.String str5 = courseTextBook1.getTitle();
        java.lang.String str6 = courseTextBook1.getTitle();
        double double7 = courseTextBook1.getPrice();
        org.team4.functionality.buy.ItemPurchased itemPurchased10 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date11 = itemPurchased10.getDatePurchased();
        java.util.Date date12 = itemPurchased10.getDatePurchased();
        java.lang.String str13 = itemPurchased10.getEmail();
        boolean boolean14 = courseTextBook1.equals((java.lang.Object) itemPurchased10);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Fri Mar 29 00:42:01 EDT 2024");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.team4.model.paymentmodes.PayPal payPal1 = new org.team4.model.paymentmodes.PayPal("Course [course name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:42:00 EDT 2024, end date=Fri Mar 29 00:42:00 EDT 2024, ISBN=, email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}]");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.team4.model.user.User user4 = new org.team4.model.user.User("Mobile Wallet", "SubscribeNewsletter{title='', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}', dateSubscribed=Fri Mar 29 00:42:00 EDT 2024, dateDue=Mon Apr 29 00:42:00 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:58 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
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
        java.lang.String str24 = courseTextBook1.getGenre();
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
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.team4.model.user.User user5 = new org.team4.model.user.User("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}", "User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, name=hi!, type=, validated=false]", "User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, type=, validated=false]", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:59 EDT 2024, dateDue=Mon Apr 29 00:41:59 EDT 2024}", false);
        user5.setPassword("Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
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
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator12 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) purchasableItemDecorator11);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(item10);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        org.team4.model.items.decorator.RentableItemDecorator rentableItemDecorator7 = new org.team4.model.items.decorator.RentableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        courseTextBook1.setRentable(true);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("Mobile Wallet", "", "Mobile Wallet", "", 0, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        java.lang.String str7 = bookRequest6.getTitle();
        java.lang.String str8 = bookRequest6.getAuthor();
        java.lang.String str9 = bookRequest6.getBookType();
        java.lang.String str10 = bookRequest6.getBookType();
        java.lang.String str11 = bookRequest6.getISBN();
        java.lang.String str12 = bookRequest6.getAuthor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Mobile Wallet" + "'", str8, "Mobile Wallet");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str9, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str10, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Mobile Wallet" + "'", str12, "Mobile Wallet");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        boolean boolean3 = courseTextBook1.equals((java.lang.Object) (byte) 1);
        java.lang.String str4 = courseTextBook1.getTitle();
        java.util.List<org.team4.model.user.Student> studentList5 = courseTextBook1.getStudentsWithCopies();
        boolean boolean6 = courseTextBook1.isPurchasable();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(studentList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder2 = courseTextBookBuilder0.price(1.0d);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder4 = courseTextBookBuilder0.price((double) 0.0f);
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        org.team4.model.course.Course course10 = new org.team4.model.course.Course("", date6, date7, "hi!", "hi!");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder11 = courseTextBookBuilder0.course(course10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder13 = courseTextBookBuilder11.yearPublished(10);
        org.junit.Assert.assertNotNull(bookItemBuilder2);
        org.junit.Assert.assertNotNull(bookItemBuilder4);
        org.junit.Assert.assertNotNull(courseTextBookBuilder11);
        org.junit.Assert.assertNotNull(bookItemBuilder13);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder2 = dVDBuilder0.price((double) 'a');
        org.team4.model.items.builder.DVDBuilder dVDBuilder4 = dVDBuilder0.genre("");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder6 = dVDBuilder0.quantity((int) (byte) 0);
        org.junit.Assert.assertNotNull(dVDItemBuilder2);
        org.junit.Assert.assertNotNull(dVDBuilder4);
        org.junit.Assert.assertNotNull(dVDItemBuilder6);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
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
        org.team4.model.items.builder.BookBuilder bookBuilder23 = courseTextBookBuilder16.genre("User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, name=hi!, type=, validated=false]");
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(bookBuilder3);
        org.junit.Assert.assertNotNull(courseTextBookBuilder5);
        org.junit.Assert.assertNotNull(bookBuilder8);
        org.junit.Assert.assertNotNull(courseTextBookBuilder15);
        org.junit.Assert.assertNotNull(courseTextBookBuilder16);
        org.junit.Assert.assertNotNull(bookBuilder18);
        org.junit.Assert.assertNotNull(bookBuilder20);
        org.junit.Assert.assertNotNull(courseTextBook21);
        org.junit.Assert.assertNotNull(bookBuilder23);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        boolean boolean3 = courseTextBook1.equals((java.lang.Object) (byte) 1);
        java.util.List<org.team4.model.user.Student> studentList4 = courseTextBook1.getStudentsWithCopies();
        courseTextBook1.setRentable(false);
        courseTextBook1.setRentable(true);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(studentList4);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder2 = dVDBuilder0.price((double) (-1.0f));
        org.team4.model.items.builder.DVDBuilder dVDBuilder4 = dVDBuilder0.genre("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder4.duration((double) 10L);
        org.team4.model.items.builder.DVDBuilder dVDBuilder8 = dVDBuilder6.duration((double) 0.0f);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder10 = dVDBuilder6.yearPublished(10);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder12 = dVDItemBuilder10.yearPublished((int) (short) 1);
        org.junit.Assert.assertNotNull(dVDItemBuilder2);
        org.junit.Assert.assertNotNull(dVDBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDBuilder8);
        org.junit.Assert.assertNotNull(dVDItemBuilder10);
        org.junit.Assert.assertNotNull(dVDItemBuilder12);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.model.items.RentedItem rentedItem4 = new org.team4.model.items.RentedItem("", "hi!", date2, date3);
        rentedItem4.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem4.setTitle("hi!");
        java.util.Date date9 = rentedItem4.getRentDate();
        java.lang.String str10 = rentedItem4.getISBN();
        java.util.Date date11 = rentedItem4.getDueDate();
        java.util.Date date12 = rentedItem4.getDueDate();
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str10, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("hi!", "", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase((double) (-1L), (org.team4.model.user.User) student5);
        org.team4.model.paymentmodes.PayPal payPal8 = new org.team4.model.paymentmodes.PayPal("hi!");
        boolean boolean9 = payPal8.isValid();
        java.lang.String str10 = payPal8.getMode();
        java.lang.String str11 = payPal8.toString();
        java.lang.String str12 = payPal8.getMode();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete13 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) payPal8);
        double double14 = purchaseComplete13.getAmount();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Mobile Wallet" + "'", str10, "Mobile Wallet");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PayPal{email='hi!'}" + "'", str11, "PayPal{email='hi!'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Mobile Wallet" + "'", str12, "Mobile Wallet");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("Mobile Wallet", "", "Mobile Wallet", "", 0, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        java.lang.String str7 = bookRequest6.getTitle();
        java.lang.String str8 = bookRequest6.getAuthor();
        java.lang.String str9 = bookRequest6.getBookType();
        int int10 = bookRequest6.getEdition();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Mobile Wallet" + "'", str8, "Mobile Wallet");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str9, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter4 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!", date2, date3);
        subscribeNewsletter4.setEmail("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        subscribeNewsletter4.setEmail("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}");
        java.lang.String str9 = subscribeNewsletter4.getEmail();
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
        subscribeNewsletter4.setDateDue(date24);
        java.util.Date date57 = subscribeNewsletter4.getDateSubscribed();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}" + "'", str9, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}");
        org.junit.Assert.assertNotNull(date24);
// flaky:         org.junit.Assert.assertEquals(date24.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date30);
// flaky:         org.junit.Assert.assertEquals(date30.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date36);
// flaky:         org.junit.Assert.assertEquals(date36.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date41);
// flaky:         org.junit.Assert.assertEquals(date41.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date53);
// flaky:         org.junit.Assert.assertEquals(date53.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date54);
// flaky:         org.junit.Assert.assertEquals(date54.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNull(date57);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
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
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter28 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "");
        java.lang.String str29 = subscribeNewsletter28.toString();
        java.util.Date date30 = null;
        subscribeNewsletter28.setDateDue(date30);
        java.util.Date date36 = null;
        java.util.Date date37 = null;
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter38 = new org.team4.functionality.subscriptions.SubscribeNewsletter("hi!", "hi!", date36, date37);
        org.team4.functionality.buy.ItemPurchased itemPurchased45 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date46 = itemPurchased45.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased47 = new org.team4.functionality.buy.ItemPurchased("Mobile Wallet", "", date46);
        org.team4.functionality.buy.ItemPurchased itemPurchased51 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date52 = itemPurchased51.getDatePurchased();
        java.util.Date date53 = itemPurchased51.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased57 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date58 = itemPurchased57.getDatePurchased();
        java.util.Date date59 = itemPurchased57.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased62 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date63 = itemPurchased62.getDatePurchased();
        org.team4.model.course.Course course66 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date59, date63, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.course.Course course69 = new org.team4.model.course.Course("PayPal{email='hi!'}", date53, date59, "Mobile Wallet", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
        org.team4.model.items.RentedItem rentedItem70 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "PayPal", date46, date53);
        subscribeNewsletter38.setDateDue(date46);
        org.team4.functionality.buy.ItemPurchased itemPurchased74 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date75 = itemPurchased74.getDatePurchased();
        java.util.Date date76 = itemPurchased74.getDatePurchased();
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter77 = new org.team4.functionality.subscriptions.SubscribeNewsletter("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}", date46, date76);
        subscribeNewsletter28.setDateSubscribed(date76);
        rentedItem4.setDueDate(date76);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Fri Mar 29 00:42:02 EDT 2024");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:02 EDT 2024, dateDue=Mon Apr 29 00:42:02 EDT 2024}" + "'", str29, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:02 EDT 2024, dateDue=Mon Apr 29 00:42:02 EDT 2024}");
        org.junit.Assert.assertNotNull(date46);
// flaky:         org.junit.Assert.assertEquals(date46.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date52);
// flaky:         org.junit.Assert.assertEquals(date52.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date53);
// flaky:         org.junit.Assert.assertEquals(date53.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date58);
// flaky:         org.junit.Assert.assertEquals(date58.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date59);
// flaky:         org.junit.Assert.assertEquals(date59.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date63);
// flaky:         org.junit.Assert.assertEquals(date63.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date75);
// flaky:         org.junit.Assert.assertEquals(date75.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date76);
// flaky:         org.junit.Assert.assertEquals(date76.toString(), "Fri Mar 29 00:42:02 EDT 2024");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.Course course1 = null;
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder2 = courseTextBookBuilder0.course(course1);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder4 = courseTextBookBuilder2.isVirtual(false);
        org.team4.model.items.builder.BookBuilder bookBuilder6 = courseTextBookBuilder2.noOfPages((int) (short) 1);
        org.team4.model.items.builder.BookBuilder bookBuilder8 = bookBuilder6.hasSoftCopy(false);
        org.junit.Assert.assertNotNull(courseTextBookBuilder2);
        org.junit.Assert.assertNotNull(courseTextBookBuilder4);
        org.junit.Assert.assertNotNull(bookBuilder6);
        org.junit.Assert.assertNotNull(bookBuilder8);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter5 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "");
        java.lang.String str6 = subscribeNewsletter5.toString();
        java.util.Date date7 = null;
        subscribeNewsletter5.setDateDue(date7);
        java.util.Date date11 = null;
        java.util.Date date12 = null;
        org.team4.model.items.RentedItem rentedItem13 = new org.team4.model.items.RentedItem("", "hi!", date11, date12);
        rentedItem13.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem13.setTitle("hi!");
        java.util.Date date18 = rentedItem13.getRentDate();
        org.team4.functionality.buy.ItemPurchased itemPurchased22 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date23 = itemPurchased22.getDatePurchased();
        java.util.Date date24 = itemPurchased22.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased27 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date28 = itemPurchased27.getDatePurchased();
        org.team4.model.course.Course course31 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date24, date28, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem13.setRentDate(date24);
        subscribeNewsletter5.setDateSubscribed(date24);
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter36 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "");
        java.lang.String str37 = subscribeNewsletter36.toString();
        java.util.Date date38 = null;
        subscribeNewsletter36.setDateDue(date38);
        java.util.Date date42 = null;
        java.util.Date date43 = null;
        org.team4.model.items.RentedItem rentedItem44 = new org.team4.model.items.RentedItem("", "hi!", date42, date43);
        rentedItem44.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem44.setTitle("hi!");
        java.util.Date date49 = rentedItem44.getRentDate();
        org.team4.functionality.buy.ItemPurchased itemPurchased53 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date54 = itemPurchased53.getDatePurchased();
        java.util.Date date55 = itemPurchased53.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased58 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date59 = itemPurchased58.getDatePurchased();
        org.team4.model.course.Course course62 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date55, date59, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem44.setRentDate(date55);
        subscribeNewsletter36.setDateSubscribed(date55);
        subscribeNewsletter5.setDateSubscribed(date55);
        java.util.Date date70 = null;
        java.util.Date date71 = null;
        org.team4.model.items.RentedItem rentedItem72 = new org.team4.model.items.RentedItem("", "hi!", date70, date71);
        java.lang.String str73 = rentedItem72.getISBN();
        java.util.Date date74 = null;
        rentedItem72.setDueDate(date74);
        rentedItem72.setISBN("PayPal");
        org.team4.functionality.buy.ItemPurchased itemPurchased81 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date82 = itemPurchased81.getDatePurchased();
        java.util.Date date83 = itemPurchased81.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased86 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date87 = itemPurchased86.getDatePurchased();
        org.team4.model.course.Course course90 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date83, date87, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem72.setDueDate(date83);
        org.team4.functionality.buy.ItemPurchased itemPurchased92 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date83);
        org.team4.model.course.Course course95 = new org.team4.model.course.Course("Mobile Wallet", date55, date83, "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}");
        org.team4.functionality.buy.ItemPurchased itemPurchased96 = new org.team4.functionality.buy.ItemPurchased("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:57 EDT 2024, dateDue=Mon Apr 29 00:41:57 EDT 2024}", "ItemToPurchase{item=null, user=User [email=hi!, password=, name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, type=ProcessPayment{modes=null, itemToPurchase=null}, validated=false], newsletter=null}", date55);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:02 EDT 2024, dateDue=Mon Apr 29 00:42:02 EDT 2024}" + "'", str6, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:02 EDT 2024, dateDue=Mon Apr 29 00:42:02 EDT 2024}");
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date24);
// flaky:         org.junit.Assert.assertEquals(date24.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Fri Mar 29 00:42:02 EDT 2024");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:02 EDT 2024, dateDue=Mon Apr 29 00:42:02 EDT 2024}" + "'", str37, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:02 EDT 2024, dateDue=Mon Apr 29 00:42:02 EDT 2024}");
        org.junit.Assert.assertNull(date49);
        org.junit.Assert.assertNotNull(date54);
// flaky:         org.junit.Assert.assertEquals(date54.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date55);
// flaky:         org.junit.Assert.assertEquals(date55.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date59);
// flaky:         org.junit.Assert.assertEquals(date59.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertNotNull(date82);
// flaky:         org.junit.Assert.assertEquals(date82.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date83);
// flaky:         org.junit.Assert.assertEquals(date83.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date87);
// flaky:         org.junit.Assert.assertEquals(date87.toString(), "Fri Mar 29 00:42:02 EDT 2024");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}", "Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]", "Book{genre='null', noOfPages=0, author='null', ISBN=null, publisher='null', edition='0'}", (long) (short) 1);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("hi!", "", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "ProcessPayment{modes=null, itemToPurchase=null}");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase6 = new org.team4.functionality.buy.ItemToPurchase((double) (-1L), (org.team4.model.user.User) student5);
        org.team4.model.paymentmodes.PayPal payPal8 = new org.team4.model.paymentmodes.PayPal("hi!");
        boolean boolean9 = payPal8.isValid();
        java.lang.String str10 = payPal8.getMode();
        java.lang.String str11 = payPal8.toString();
        java.lang.String str12 = payPal8.getMode();
        org.team4.functionality.buy.PurchaseComplete purchaseComplete13 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase6, (org.team4.model.paymentmodes.PaymentValidator) payPal8);
        double double14 = itemToPurchase6.getAmount();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Mobile Wallet" + "'", str10, "Mobile Wallet");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PayPal{email='hi!'}" + "'", str11, "PayPal{email='hi!'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Mobile Wallet" + "'", str12, "Mobile Wallet");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.team4.model.user.User user5 = new org.team4.model.user.User("Book{genre='null', noOfPages=0, author='null', ISBN=null, publisher='null', edition='0'}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:59 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:56 EDT 2024, dateDue=Mon Apr 29 00:41:56 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}", false);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:56 EDT 2024, dateDue=Mon Apr 29 00:41:56 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}", "PayPal", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", true);
        manager5.setManagerID(0L);
        manager5.setType("Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.team4.model.paymentmodes.CreditCard creditCard3 = new org.team4.model.paymentmodes.CreditCard("Course [course name=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:41:58 EDT 2024, end date=Fri Mar 29 00:41:58 EDT 2024, ISBN=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, email=hi!]", (int) (byte) 1, 10);
        boolean boolean4 = creditCard3.correctLength();
        boolean boolean5 = creditCard3.correctLength();
        boolean boolean6 = creditCard3.isValid();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='hi!', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:54 EDT 2024, dateDue=Mon Apr 29 00:41:54 EDT 2024}', dateSubscribed=null, dateDue=null}", "PayPal{email='hi!'}", "Book{genre='null', noOfPages=0, author='null', ISBN=null, publisher='null', edition='0'}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", false);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder2 = dVDBuilder0.price((double) (-1.0f));
        org.team4.model.items.builder.DVDBuilder dVDBuilder4 = dVDBuilder0.genre("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}");
        org.team4.model.items.builder.DVDBuilder dVDBuilder6 = dVDBuilder4.duration((double) 10L);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder8 = dVDBuilder4.ISBN("ProcessPayment{modes=PayPal{email='hi!'}, itemToPurchase=ItemToPurchase{item=null, user=User [email=hi!, password=hi!, name=hi!, type=hi!, validated=false], newsletter=null}}");
        org.junit.Assert.assertNotNull(dVDItemBuilder2);
        org.junit.Assert.assertNotNull(dVDBuilder4);
        org.junit.Assert.assertNotNull(dVDBuilder6);
        org.junit.Assert.assertNotNull(dVDItemBuilder8);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.team4.model.user.User user6 = new org.team4.model.user.User("hi!", "", "hi!", "", true);
        user6.setName("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase9 = new org.team4.functionality.buy.ItemToPurchase((double) (short) -1, user6);
        org.team4.model.paymentmodes.PayPal payPal11 = new org.team4.model.paymentmodes.PayPal("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase12 = null;
        org.team4.functionality.buy.ProcessPayment processPayment13 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) payPal11, itemToPurchase12);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete14 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase9, (org.team4.model.paymentmodes.PaymentValidator) payPal11);
        org.team4.model.items.Newsletter newsletter15 = purchaseComplete14.getNewsletter();
        org.junit.Assert.assertNull(newsletter15);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.team4.model.user.User user6 = new org.team4.model.user.User("hi!", "", "hi!", "", true);
        user6.setName("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase9 = new org.team4.functionality.buy.ItemToPurchase((double) (short) -1, user6);
        org.team4.model.paymentmodes.PayPal payPal11 = new org.team4.model.paymentmodes.PayPal("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase12 = null;
        org.team4.functionality.buy.ProcessPayment processPayment13 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) payPal11, itemToPurchase12);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete14 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase9, (org.team4.model.paymentmodes.PaymentValidator) payPal11);
        long long15 = purchaseComplete14.getPurchaseID();
        double double16 = purchaseComplete14.getAmount();
        double double17 = purchaseComplete14.getAmount();
        org.team4.model.user.User user18 = purchaseComplete14.getUser();
        org.team4.model.items.Newsletter newsletter19 = purchaseComplete14.getNewsletter();
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 7490577L + "'", long15 == 7490577L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNull(newsletter19);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.team4.model.items.BookRequest bookRequest6 = new org.team4.model.items.BookRequest("Mobile Wallet", "", "Mobile Wallet", "", 0, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        java.lang.String str7 = bookRequest6.getTitle();
        java.lang.String str8 = bookRequest6.getBookType();
        java.lang.String str9 = bookRequest6.getAuthor();
        java.lang.String str10 = bookRequest6.getBookType();
        java.lang.String str11 = bookRequest6.getISBN();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str8, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Mobile Wallet" + "'", str9, "Mobile Wallet");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str10, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.team4.model.user.Manager manager4 = new org.team4.model.user.Manager("hi!", "hi!", "hi!", "");
        manager4.setType("");
        long long7 = manager4.getManagerID();
        manager4.setManagerID((long) (-1));
        java.lang.String str10 = manager4.getEmail();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.Course course1 = null;
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder2 = courseTextBookBuilder0.course(course1);
        org.team4.model.items.builder.BookBuilder bookBuilder4 = courseTextBookBuilder0.hasHardCopy(false);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder6 = courseTextBookBuilder0.price((double) (short) 0);
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder8 = courseTextBookBuilder0.isVirtual(false);
        org.junit.Assert.assertNotNull(courseTextBookBuilder2);
        org.junit.Assert.assertNotNull(bookBuilder4);
        org.junit.Assert.assertNotNull(bookItemBuilder6);
        org.junit.Assert.assertNotNull(courseTextBookBuilder8);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", 100, (int) (short) 1);
        boolean boolean4 = debitCard3.correctLength();
        boolean boolean5 = debitCard3.correctLength();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter5 = new org.team4.functionality.subscriptions.SubscribeNewsletter("", "");
        java.lang.String str6 = subscribeNewsletter5.toString();
        java.util.Date date7 = null;
        subscribeNewsletter5.setDateDue(date7);
        java.util.Date date11 = null;
        java.util.Date date12 = null;
        org.team4.model.items.RentedItem rentedItem13 = new org.team4.model.items.RentedItem("", "hi!", date11, date12);
        rentedItem13.setISBN("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem13.setTitle("hi!");
        java.util.Date date18 = rentedItem13.getRentDate();
        org.team4.functionality.buy.ItemPurchased itemPurchased22 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date23 = itemPurchased22.getDatePurchased();
        java.util.Date date24 = itemPurchased22.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased27 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date28 = itemPurchased27.getDatePurchased();
        org.team4.model.course.Course course31 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date24, date28, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem13.setRentDate(date24);
        subscribeNewsletter5.setDateSubscribed(date24);
        java.util.Date date36 = null;
        java.util.Date date37 = null;
        org.team4.model.items.RentedItem rentedItem38 = new org.team4.model.items.RentedItem("", "hi!", date36, date37);
        java.lang.String str39 = rentedItem38.getISBN();
        java.util.Date date40 = null;
        rentedItem38.setDueDate(date40);
        rentedItem38.setISBN("PayPal");
        org.team4.functionality.buy.ItemPurchased itemPurchased47 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date48 = itemPurchased47.getDatePurchased();
        java.util.Date date49 = itemPurchased47.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased52 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date53 = itemPurchased52.getDatePurchased();
        org.team4.model.course.Course course56 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date49, date53, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        rentedItem38.setDueDate(date49);
        org.team4.model.course.Course course60 = new org.team4.model.course.Course("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", date24, date49, "Mobile Wallet", "hi!");
        org.team4.functionality.buy.ItemPurchased itemPurchased61 = new org.team4.functionality.buy.ItemPurchased("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}", date49);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:02 EDT 2024, dateDue=Mon Apr 29 00:42:02 EDT 2024}" + "'", str6, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:02 EDT 2024, dateDue=Mon Apr 29 00:42:02 EDT 2024}");
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date24);
// flaky:         org.junit.Assert.assertEquals(date24.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(date48);
// flaky:         org.junit.Assert.assertEquals(date48.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date49);
// flaky:         org.junit.Assert.assertEquals(date49.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date53);
// flaky:         org.junit.Assert.assertEquals(date53.toString(), "Fri Mar 29 00:42:02 EDT 2024");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.decorator.PurchasableItemDecorator purchasableItemDecorator6 = new org.team4.model.items.decorator.PurchasableItemDecorator((org.team4.model.items.Item) courseTextBook1);
        int int7 = courseTextBook1.getEdition();
        int int8 = courseTextBook1.getEdition();
        boolean boolean9 = courseTextBook1.isPurchasable();
        double double10 = courseTextBook1.getPrice();
        courseTextBook1.setRentable(true);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder2 = dVDBuilder0.price((double) 'a');
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder0.yearPublished((int) '4');
        org.team4.model.items.DVD dVD5 = dVDBuilder0.build();
        java.lang.String str6 = dVD5.getISBN();
        java.lang.String str7 = dVD5.getGenre();
        org.junit.Assert.assertNotNull(dVDItemBuilder2);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertNotNull(dVD5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.BookBuilder bookBuilder3 = courseTextBookBuilder0.hasSoftCopy(true);
        org.team4.model.items.builder.BookBuilder bookBuilder5 = courseTextBookBuilder0.genre("hi!");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder7 = bookBuilder5.quantity((int) (byte) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder9 = bookItemBuilder7.title("PayPal");
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder11 = bookItemBuilder9.price((double) 3281441L);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(bookBuilder3);
        org.junit.Assert.assertNotNull(bookBuilder5);
        org.junit.Assert.assertNotNull(bookItemBuilder7);
        org.junit.Assert.assertNotNull(bookItemBuilder9);
        org.junit.Assert.assertNotNull(bookItemBuilder11);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        org.team4.model.items.builder.DVDBuilder dVDBuilder2 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder4 = dVDBuilder2.price((double) 'a');
        boolean boolean5 = courseTextBook1.equals((java.lang.Object) dVDItemBuilder4);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder7 = dVDItemBuilder4.price((double) (byte) 1);
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder9 = dVDItemBuilder4.quantity(0);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dVDItemBuilder7);
        org.junit.Assert.assertNotNull(dVDItemBuilder9);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
        boolean boolean33 = courseTextBook12.hasHardCopy();
        courseTextBook12.setQuantity(0);
        org.team4.model.user.Student student41 = new org.team4.model.user.Student("hi!", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", false);
        // The following exception was thrown during execution in test generation
        try {
            courseTextBook12.removeCopies(student41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.team4.model.course.Course.isEnded(java.util.Date)\" because \"this.course\" is null");
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
        org.team4.functionality.buy.ItemPurchased itemPurchased31 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date32 = itemPurchased31.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased33 = new org.team4.functionality.buy.ItemPurchased("Mobile Wallet", "", date32);
        org.team4.functionality.buy.ItemPurchased itemPurchased37 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date38 = itemPurchased37.getDatePurchased();
        java.util.Date date39 = itemPurchased37.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased43 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date44 = itemPurchased43.getDatePurchased();
        java.util.Date date45 = itemPurchased43.getDatePurchased();
        org.team4.functionality.buy.ItemPurchased itemPurchased48 = new org.team4.functionality.buy.ItemPurchased("", "hi!");
        java.util.Date date49 = itemPurchased48.getDatePurchased();
        org.team4.model.course.Course course52 = new org.team4.model.course.Course("SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", date45, date49, "", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.team4.model.course.Course course55 = new org.team4.model.course.Course("PayPal{email='hi!'}", date39, date45, "Mobile Wallet", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:53 EDT 2024, dateDue=Mon Apr 29 00:41:53 EDT 2024}");
        org.team4.model.items.RentedItem rentedItem56 = new org.team4.model.items.RentedItem("ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "PayPal", date32, date39);
        rentedItem4.setDueDate(date32);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str24, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date38);
// flaky:         org.junit.Assert.assertEquals(date38.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date45);
// flaky:         org.junit.Assert.assertEquals(date45.toString(), "Fri Mar 29 00:42:02 EDT 2024");
        org.junit.Assert.assertNotNull(date49);
// flaky:         org.junit.Assert.assertEquals(date49.toString(), "Fri Mar 29 00:42:02 EDT 2024");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.team4.model.items.builder.DVDBuilder dVDBuilder0 = new org.team4.model.items.builder.DVDBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.DVD> dVDItemBuilder2 = dVDBuilder0.title("PayPal");
        org.team4.model.items.DVD dVD3 = dVDBuilder0.build();
        org.junit.Assert.assertNotNull(dVDItemBuilder2);
        org.junit.Assert.assertNotNull(dVD3);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.items.builder.BookBuilder bookBuilder2 = courseTextBookBuilder0.hasHardCopy(true);
        org.team4.model.items.Book book3 = courseTextBookBuilder0.build();
        java.lang.String str4 = book3.getAuthor();
        java.lang.String str5 = book3.getAuthor();
        org.junit.Assert.assertNotNull(bookBuilder2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.team4.model.items.builder.BookBuilder bookBuilder0 = new org.team4.model.items.builder.BookBuilder();
        org.team4.model.items.builder.ItemBuilder<org.team4.model.items.Book> bookItemBuilder2 = bookBuilder0.quantity((int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = bookItemBuilder2.getClass();
        org.junit.Assert.assertNotNull(bookItemBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("Course [course name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:42:00 EDT 2024, end date=Fri Mar 29 00:42:00 EDT 2024, ISBN=, email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}]", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:01 EDT 2024, dateDue=Mon Apr 29 00:42:01 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:58 EDT 2024}", "User [email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, password=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}, name=hi!, type=, validated=false]", false);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.team4.model.items.Newsletter newsletter3 = new org.team4.model.items.Newsletter("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) (short) -1);
        double double4 = newsletter3.getPrice();
        double double5 = newsletter3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.team4.model.user.Student student5 = new org.team4.model.user.Student("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", "Mobile Wallet", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:54 EDT 2024}", "", false);
        java.lang.String str6 = student5.getEmail();
        java.util.ArrayList<java.lang.String> strList7 = student5.getCourses();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}" + "'", str6, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}");
        org.junit.Assert.assertNull(strList7);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.team4.model.paymentmodes.DebitCard debitCard3 = new org.team4.model.paymentmodes.DebitCard("PayPal{email='hi!'}", 0, (int) (short) 1);
        boolean boolean4 = debitCard3.isValid();
        java.lang.String str5 = debitCard3.getMode();
        boolean boolean6 = debitCard3.correctLength();
        boolean boolean7 = debitCard3.correctLength();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card" + "'", str5, "Debit Card");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.team4.model.items.builder.CourseTextBookBuilder courseTextBookBuilder0 = new org.team4.model.items.builder.CourseTextBookBuilder();
        org.team4.model.course.CourseTextBook courseTextBook1 = courseTextBookBuilder0.build();
        java.lang.String str2 = courseTextBook1.getPublisher();
        org.team4.model.items.DVD dVD5 = new org.team4.model.items.DVD((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}", (double) 1L);
        java.lang.String str6 = courseTextBook1.getPublisher();
        org.team4.model.items.Book book14 = new org.team4.model.items.Book((org.team4.model.items.Item) courseTextBook1, "User [email=hi!, password=hi!, name=hi!, type=, validated=false]", 10, "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:59 EDT 2024}", (int) '#', false, false);
        org.team4.model.items.Book book22 = new org.team4.model.items.Book((org.team4.model.items.Item) courseTextBook1, "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:56 EDT 2024, dateDue=Mon Apr 29 00:41:56 EDT 2024}", (int) ' ', "SubscribeNewsletter{title='', email='SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}', dateSubscribed=Fri Mar 29 00:42:00 EDT 2024, dateDue=Mon Apr 29 00:42:00 EDT 2024}", "PayPal", (int) (byte) 100, false, false);
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
        boolean boolean12 = courseTextBook1.hasHardCopy();
        org.junit.Assert.assertNotNull(courseTextBook1);
        org.junit.Assert.assertNotNull(dVDItemBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.team4.model.user.Faculty faculty5 = new org.team4.model.user.Faculty("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:02 EDT 2024, dateDue=Mon Apr 29 00:42:02 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:42:01 EDT 2024, dateDue=Mon Apr 29 00:42:01 EDT 2024}", "SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}", "Course [course name=SubscribeNewsletter{title='', email='hi!', dateSubscribed=Fri Mar 29 00:41:52 EDT 2024, dateDue=Mon Apr 29 00:41:52 EDT 2024}, start date=Fri Mar 29 00:42:00 EDT 2024, end date=Fri Mar 29 00:42:00 EDT 2024, ISBN=, email=SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:51 EDT 2024, dateDue=Mon Apr 29 00:41:51 EDT 2024}]", true);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.team4.model.user.Manager manager5 = new org.team4.model.user.Manager("SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:56 EDT 2024, dateDue=Mon Apr 29 00:41:56 EDT 2024}", "SubscribeNewsletter{title='', email='', dateSubscribed=Fri Mar 29 00:41:58 EDT 2024, dateDue=Mon Apr 29 00:41:58 EDT 2024}", "ItemPurchased{title='', email='hi!', datePurchased=null}", "ItemPurchased{title='', email='ItemPurchased{title='', email='hi!', datePurchased=Fri Mar 29 00:41:57 EDT 2024}', datePurchased=Fri Mar 29 00:42:01 EDT 2024}", false);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.team4.functionality.subscriptions.SubscribeNewsletter subscribeNewsletter2 = new org.team4.functionality.subscriptions.SubscribeNewsletter("PayPal", "PayPal{email='hi!'}");
        subscribeNewsletter2.setTitle("hi!");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        org.team4.model.course.Course course5 = new org.team4.model.course.Course("", date1, date2, "", "hi!");
        java.util.Date date6 = course5.getStartDate();
        java.lang.String str7 = course5.getCourseTextBookISBN();
        java.util.Date date8 = course5.getStartDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = course5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.toString()\" because \"this.startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.team4.model.user.User user6 = new org.team4.model.user.User("hi!", "", "hi!", "", true);
        user6.setName("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase9 = new org.team4.functionality.buy.ItemToPurchase((double) (short) -1, user6);
        org.team4.model.paymentmodes.PayPal payPal11 = new org.team4.model.paymentmodes.PayPal("hi!");
        org.team4.functionality.buy.ItemToPurchase itemToPurchase12 = null;
        org.team4.functionality.buy.ProcessPayment processPayment13 = new org.team4.functionality.buy.ProcessPayment((org.team4.model.paymentmodes.PaymentValidator) payPal11, itemToPurchase12);
        org.team4.functionality.buy.PurchaseComplete purchaseComplete14 = new org.team4.functionality.buy.PurchaseComplete(itemToPurchase9, (org.team4.model.paymentmodes.PaymentValidator) payPal11);
        long long15 = purchaseComplete14.getPurchaseID();
        org.team4.model.items.Item item16 = purchaseComplete14.getItem();
        org.team4.model.items.Newsletter newsletter17 = purchaseComplete14.getNewsletter();
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1703602L + "'", long15 == 1703602L);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(newsletter17);
    }
}
