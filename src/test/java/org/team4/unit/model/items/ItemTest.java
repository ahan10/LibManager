package org.team4.unit.model.items;

import org.junit.Test;
import org.team4.model.items.Item;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void testConstructorInitialization() {
        Item item = new Item("Book", 2020, 10, 20.0, "1234567890", true, false);
        
        assertEquals("Book", item.getTitle());
        assertEquals(2020, item.getYearPublished());
        assertEquals(10, item.getQuantity());
        assertEquals(20.0, item.getPrice(), 0.001);
        assertEquals("1234567890", item.getISBN());
        assertTrue(item.isPurchasable());
        assertFalse(item.isRentable());
    }
    
    @Test
    public void testConstructorInitializationWithItem() {
        Item item = new Item("Book", 2020, 10, 20.0, "1234567890", true, false);
        Item newItem = new Item(item);
        
        assertEquals("Book", newItem.getTitle());
        assertEquals(2020, newItem.getYearPublished());
        assertEquals(10, newItem.getQuantity());
        assertEquals(20.0, newItem.getPrice(), 0.001);
        assertEquals("1234567890", newItem.getISBN());
        assertTrue(newItem.isPurchasable());
        assertFalse(newItem.isRentable());
    }

    @Test
    public void testEqualsMethodForEquality() {
        Item item1 = new Item("Book", 2020, 10, 20.0, "1234567890", true, false);
        Item item2 = new Item("Book", 2020, 10, 20.0, "1234567890", true, false);
        
        assertTrue(item1.equals(item2));
    }

    @Test
    public void testEqualsMethodForInequality() {
        Item item1 = new Item("Book", 2020, 10, 20.0, "1234567890", true, false);
        Item item2 = new Item("Book", 2021, 5, 25.0, "0987654321", true, false);
        
        assertFalse(item1.equals(item2));
    }

    @Test
    public void testHashCodeConsistency() {
        Item item = new Item("Book", 2020, 10, 20.0, "1234567890", true, false);
        
        int hashCode1 = item.hashCode();
        int hashCode2 = item.hashCode();
        
        assertEquals(hashCode1, hashCode2);
    }

    @Test
    public void testHashCodeEquality() {
        Item item1 = new Item("Book", 2020, 10, 20.0, "1234567890", true, false);
        Item item2 = new Item("Book", 2020, 10, 20.0, "1234567890", true, false);
        
        assertEquals(item1.hashCode(), item2.hashCode());
    }

    @Test
    public void testSetQuantity() {
        Item item = new Item("Book", 2020, 10, 20.0, "1234567890", true, false);
        item.setQuantity(5);
        
        assertEquals(5, item.getQuantity());
    }

    @Test
    public void testSetPrice() {
        Item item = new Item("Book", 2020, 10, 20.0, "1234567890", true, false);
        item.setPrice(25.0);
        
        assertEquals(25.0, item.getPrice(), 0.001);
    }

    @Test
    public void testSetRentable() {
        Item item = new Item("Book", 2020, 10, 20.0, "1234567890", true, false);
        item.setRentable(true);
        
        assertTrue(item.isRentable());
    }

    @Test
    public void testSetPurchasable() {
        Item item = new Item("Book", 2020, 10, 20.0, "1234567890", true, false);
        item.setPurchaseable(false);
        
        assertFalse(item.isPurchasable());
    }

    @Test
    public void testGetISBN() {
        Item item = new Item("Book", 2020, 10, 20.0, "1234567890", true, false);
        
        assertEquals("1234567890", item.getISBN());
    }
    
    
}
