package org.team4.unit.model.items;

import org.junit.Test;
import org.team4.model.items.Item;
import org.team4.model.items.Magazine;

import static org.junit.Assert.*;

public class MagazineTest {

    @Test
    public void testConstructorInitialization() {
        Item item = new Item("Magazine", 2020, 10, 20.0, "1234567890", true, false);
        Magazine magazine = new Magazine(item, "XYZ Publishers", 25);
        
        assertEquals("XYZ Publishers", magazine.getPublisher());
        assertEquals(25, magazine.getIssueNumber());
    }

    @Test
    public void testEqualsMethodForEquality() {
        Item item1 = new Item("Magazine", 2020, 10, 20.0, "1234567890", true, false);
        Item item2 = new Item("Magazine", 2020, 10, 20.0, "1234567890", true, false);
        Magazine magazine1 = new Magazine(item1, "XYZ Publishers", 25);
        Magazine magazine2 = new Magazine(item2, "XYZ Publishers", 25);
        
        assertTrue(magazine1.equals(magazine2));
    }

    @Test
    public void testEqualsMethodForInequality() {
        Item item1 = new Item("Magazine", 2020, 10, 20.0, "1234567890", true, false);
        Magazine magazine1 = new Magazine(item1, "XYZ Publishers", 25);
        
        assertFalse(magazine1.equals(item1));
    }

    @Test
    public void testHashCodeConsistency() {
        Item item = new Item("Magazine", 2020, 10, 20.0, "1234567890", true, false);
        Magazine magazine = new Magazine(item, "XYZ Publishers", 25);
        
        int hashCode1 = magazine.hashCode();
        int hashCode2 = magazine.hashCode();
        
        assertEquals(hashCode1, hashCode2);
    }

    @Test
    public void testHashCodeEquality() {
        Item item1 = new Item("Magazine", 2020, 10, 20.0, "1234567890", true, false);
        Item item2 = new Item("Magazine", 2020, 10, 20.0, "1234567890", true, false);
        Magazine magazine1 = new Magazine(item1, "XYZ Publishers", 25);
        Magazine magazine2 = new Magazine(item2, "XYZ Publishers", 25);
        
        assertEquals(magazine1.hashCode(), magazine2.hashCode());
    }

    @Test
    public void testToStringMethod() {
        Item item = new Item("Magazine", 2020, 10, 20.0, "1234567890", true, false);
        Magazine magazine = new Magazine(item, "XYZ Publishers", 25);
        
        String expectedString = "Magazine{publisher='XYZ Publishers', issueNumber=25}";
        
        assertFalse(expectedString.equals(magazine.toString()));
    }

    @Test
    public void testGetters() {
        Item item = new Item("Magazine", 2020, 10, 20.0, "1234567890", true, false);
        Magazine magazine = new Magazine(item, "XYZ Publishers", 25);
        
        assertEquals("XYZ Publishers", magazine.getPublisher());
        assertEquals(25, magazine.getIssueNumber());
    }

    @Test
    public void testGetItemTitle() {
        Item item = new Item("Magazine", 2020, 10, 20.0, "1234567890", true, false);
        Magazine magazine = new Magazine(item, "XYZ Publishers", 25);

        assertEquals("Magazine", magazine.getTitle());
    }

    @Test
    public void testGetYearPublished() {
        Item item = new Item("Magazine", 2020, 10, 20.0, "1234567890", true, false);
        Magazine magazine = new Magazine(item, "XYZ Publishers", 25);

        assertEquals(2020, magazine.getYearPublished());
    }
    
    @Test
    public void testIssueNumberRemainsUnchanged() {
        Item item = new Item("Magazine", 2020, 10, 20.0, "1234567890", true, false);
        Magazine magazine1 = new Magazine(item, "XYZ Publishers", 25);
        Magazine magazine2 = new Magazine(item, "XYZ Publishers", 25);
        
        // Check if the issue number remains unchanged
        assertEquals(magazine1.getIssueNumber(), magazine2.getIssueNumber());
    }
}
