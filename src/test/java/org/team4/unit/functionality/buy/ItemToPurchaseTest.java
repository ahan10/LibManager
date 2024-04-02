package org.team4.unit.functionality.buy;

import org.junit.Before;
import org.junit.Test;
import org.team4.functionality.buy.ItemToPurchase;
import org.team4.model.items.Book;
import org.team4.model.items.Item;
import org.team4.model.items.Newsletter;
import org.team4.model.user.Faculty;
import org.team4.model.user.Student;
import org.team4.model.user.User;

import static org.junit.Assert.*;

public class ItemToPurchaseTest {
    Item item, i1;
    User user1, user2, user3;
    Newsletter newsletter;
    ItemToPurchase itemToPurchase1, itemToPurchase2, itemToPurchase3;

    @Before
    public void setup(){
        i1 = new Item("Python Crash Course",
                2001,
                12,
                129.99,
                "1234512345",
                true,
                true);

        item = new Book(i1,
                "Textbook",
                300,
                "John Doe",
                "Pearson",
                12,
                true,
                false);

        newsletter = new Newsletter("New York Time",
                "www.somelink.com",
                7.99);

        user1 = new Student("jane.doe@gmail.com",
                "password1",
                "Jane Doe",
                "STUDENT",
                true);

        user2 = new Faculty("joe.doe@gmail.com",
                "password1",
                "Joe Doe",
                "FACULTY",
                true);

        user3 = new Student("may.doe@gmail.com",
                "password1",
                "May Doe",
                "STUDENT",
                true);

        itemToPurchase1 = new ItemToPurchase(item, user1);
        itemToPurchase2 = new ItemToPurchase(newsletter, user2);
        itemToPurchase3 = new ItemToPurchase(15.99, user3);
    }

    @Test
    public void test_constructor1(){
        assertEquals(item, itemToPurchase1.getItem());
        assertEquals(user1, itemToPurchase1.getUser());
    }

    @Test
    public void test_constructor2(){
        assertEquals(newsletter, itemToPurchase2.getNewsletter());
        assertEquals(user2, itemToPurchase2.getUser());
    }

    @Test
    public void test_constructor3(){
        assertEquals(user3, itemToPurchase3.getUser());
    }

    @Test
    public void test_toString_1(){
        assertEquals("ItemToPurchase{item=Book{genre='Textbook', noOfPages=300, author='John Doe', ISBN=1234512345, publisher='Pearson', edition='12'}, user=User [email=jane.doe@gmail.com, password=password1, name=Jane Doe, type=STUDENT, validated=true], newsletter=null}", itemToPurchase1.toString());
    }

    @Test
    public void test_toString_3(){
        assertEquals("ItemToPurchase{item=null, user=User [email=may.doe@gmail.com, password=password1, name=May Doe, type=STUDENT, validated=true], newsletter=null}", itemToPurchase3.toString());
    }

    @Test
    public void itemNotSet(){
        assertNull(itemToPurchase2.getItem());
    }

    @Test
    public void newsletterNotSet(){
        assertNull(itemToPurchase1.getNewsletter());
    }

    @Test
    public void bothNotSet(){
        assertNull(itemToPurchase3.getNewsletter());
        assertNull(itemToPurchase3.getItem());
    }

    @Test
    public void price(){
        assertEquals(item.getPrice(), itemToPurchase1.getAmount(), 0.0001);
        assertEquals(newsletter.getPrice(), itemToPurchase2.getAmount(), 0.0001);
        assertEquals(15.99, itemToPurchase3.getAmount(), 0.0001);
    }

}