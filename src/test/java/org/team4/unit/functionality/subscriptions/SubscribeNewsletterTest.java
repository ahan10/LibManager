package org.team4.unit.functionality.subscriptions;

import org.junit.Before;
import org.junit.Test;
import org.team4.functionality.subscriptions.SubscribeNewsletter;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import static org.junit.Assert.*;

public class SubscribeNewsletterTest {
    SubscribeNewsletter subscribeNewsletter;

    @Before
    public void setup(){
        subscribeNewsletter = new SubscribeNewsletter(
                "The New York Times",
                "example@email.com"
        );
    }

    @Test
    public void test_getTitle(){
        assertEquals("The New York Times", subscribeNewsletter.getTitle());
    }

    @Test
    public void test_setTitle(){
        subscribeNewsletter.setTitle("The CTV");
        assertEquals("The CTV", subscribeNewsletter.getTitle());
    }

    @Test
    public void test_getEmail(){
        assertEquals("example@email.com", subscribeNewsletter.getEmail());
    }

    @Test
    public void test_setEmail(){
        subscribeNewsletter.setEmail("other@email.com");
        assertEquals("other@email.com", subscribeNewsletter.getEmail());
    }

    @Test
    public void test_getDateSubscribed(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        String expected = formatter.format(new Date());
        String actual = formatter.format(subscribeNewsletter.getDateSubscribed());
        assertEquals(expected, actual);
    }

    @Test
    public void test_setDateSubscribed(){
        subscribeNewsletter.setDateSubscribed(new Date(2000, Calendar.JUNE, 12));
        assertEquals(new Date(2000, Calendar.JUNE, 12), subscribeNewsletter.getDateSubscribed());
    }

    @Test
    public void test_getDateDue(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, 1);

        String expected = formatter.format(cal.getTime());
        String actual = formatter.format(subscribeNewsletter.getDateDue());

        assertEquals(expected, actual);
    }

    @Test
    public void test_setDateDue(){
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date(2000, 5, 12));
        cal.add(Calendar.MONTH, 1);
        subscribeNewsletter.setDateDue(cal.getTime());
        assertEquals(cal.getTime(), subscribeNewsletter.getDateDue());
    }

    @Test
    public void test_copy_constructor(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        String title = "A Newsletter";
        String email = "jane.doe@example.com";
        Date dateSub = new Date(2024, Calendar.AUGUST, 21);

        Calendar cal = Calendar.getInstance();
        cal.setTime(dateSub);
        cal.add(Calendar.MONTH, 1);

        Date dateDue = cal.getTime();

        SubscribeNewsletter s = new SubscribeNewsletter(
                title,
                email,
                dateSub,
                dateDue
        );

        assertEquals(email, s.getEmail());
        assertEquals(title, s.getTitle());
        assertEquals(formatter.format(dateSub), formatter.format(s.getDateSubscribed()));
        assertEquals(formatter.format(dateDue), formatter.format(s.getDateDue()));
    }

    @Test
    public void test_toString(){
        String title = "A Newsletter";
        String email = "jane.doe@example.com";
        Date dateSub = new Date(2024, Calendar.AUGUST, 21);

        Calendar cal = Calendar.getInstance();
        cal.setTime(dateSub);
        cal.add(Calendar.MONTH, 1);

        Date dateDue = cal.getTime();

        SubscribeNewsletter s = new SubscribeNewsletter(
                title,
                email,
                dateSub,
                dateDue
        );
        assertEquals("SubscribeNewsletter{title='A Newsletter', email='jane.doe@example.com', dateSubscribed=Thu Aug 21 00:00:00 EDT 3924, dateDue=Sun Sep 21 00:00:00 EDT 3924}", s.toString());
    }

}