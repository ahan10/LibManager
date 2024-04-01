package org.team4.unit.model.items;

import static org.junit.Assert.*;

import org.junit.Test;
import org.team4.model.items.DVD;
import org.team4.model.items.Item;

public class DVDTest {

    @Test
    public void testConstructorInitialization() {
        Item item = new Item("DVD", 2020, 10, 20.0, "1234567890", true, false);
        DVD dvd = new DVD(item, "Action", 120.5);
        
        assertEquals("Action", dvd.getGenre());
        assertEquals(120.5, dvd.getDuration(), 0.001);
    }

    @Test
    public void testEqualsMethodForEquality() {
        Item item1 = new Item("DVD", 2020, 10, 20.0, "1234567890", true, false);
        Item item2 = new Item("DVD", 2020, 10, 20.0, "1234567890", true, false);
        DVD dvd1 = new DVD(item1, "Action", 120.5);
        DVD dvd2 = new DVD(item2, "Action", 120.5);
        
        assertTrue(dvd1.equals(dvd2));
    }

    @Test
    public void testEqualsMethodForInequality() {
        Item item1 = new Item("DVD", 2020, 10, 20.0, "1234567890", true, false);
        DVD dvd1 = new DVD(item1, "Action", 120.5);
        
        assertFalse(dvd1.equals(item1));
    }

    @Test
    public void testHashCodeConsistency() {
        Item item = new Item("DVD", 2020, 10, 20.0, "1234567890", true, false);
        DVD dvd = new DVD(item, "Action", 120.5);
        
        int hashCode1 = dvd.hashCode();
        int hashCode2 = dvd.hashCode();
        
        assertEquals(hashCode1, hashCode2);
    }

    @Test
    public void testHashCodeEquality() {
        Item item1 = new Item("DVD", 2020, 10, 20.0, "1234567890", true, false);
        Item item2 = new Item("DVD", 2020, 10, 20.0, "1234567890", true, false);
        DVD dvd1 = new DVD(item1, "Action", 120.5);
        DVD dvd2 = new DVD(item2, "Action", 120.5);
        
        assertEquals(dvd1.hashCode(), dvd2.hashCode());
    }

    @Test
    public void testToStringMethod() {
        Item item = new Item("DVD", 2020, 10, 20.0, "1234567890", true, false);
        DVD dvd = new DVD(item, "Action", 120.5);
        
        String expectedString = "DVD{genre='Action', duration=120.5}";
        
        assertFalse(expectedString.equals(dvd.toString()));
    }

    @Test
    public void testGetters() {
        Item item = new Item("DVD", 2020, 10, 20.0, "1234567890", true, false);
        DVD dvd = new DVD(item, "Action", 120.5);
        
        assertEquals("Action", dvd.getGenre());
        assertEquals(120.5, dvd.getDuration(), 0.001);
    }

  
    @Test
    public void testGetItemTitle() {
        Item item = new Item("DVD", 2020, 10, 20.0, "1234567890", true, false);
        DVD dvd = new DVD(item, "Action", 120.5);

        assertEquals("DVD", dvd.getTitle());
    }

    @Test
    public void testGetYearPublished() {
        Item item = new Item("DVD", 2020, 10, 20.0, "1234567890", true, false);
        DVD dvd = new DVD(item, "Action", 120.5);

        assertEquals(2020, dvd.getYearPublished());
    }
    
    @Test
    public void testDurationRemainsUnchanged() {
        Item item = new Item("DVD", 2020, 10, 20.0, "1234567890", true, false);
        DVD dvd = new DVD(item, "Action", 120.5);
        
        // Create a new DVD with the same parameters
        DVD newDVD = new DVD(item, "Action", 120.5);
        
        // Check if the duration remains unchanged
        assertEquals(dvd.getDuration(), newDVD.getDuration(), 0.001);
    }
}
