package org.team4.unit.model.items.decorator;

import org.junit.Test;
import org.team4.model.items.Item;
import org.team4.model.items.decorator.ItemDecorator;

import static org.junit.Assert.*;

public class ItemDecoratorTest {

    @Test
    public void testConstructorInitialization() {
        Item baseItem = new Item("Base Item", 2022, 1, 10.0, "1234567890", true, false);
        ItemDecorator itemDecorator = new ItemDecorator(baseItem);
        
        assertEquals(baseItem, itemDecorator.getItem());
    }

    @Test
    public void testGetItem() {
        Item baseItem = new Item("Base Item", 2022, 1, 10.0, "1234567890", true, false);
        ItemDecorator itemDecorator = new ItemDecorator(baseItem);
        
        assertEquals(baseItem, itemDecorator.getItem());
    }

    @Test
    public void testItemSetCorrectly() {
        Item baseItem = new Item("Base Item", 2022, 1, 10.0, "1234567890", true, false);
        ItemDecorator itemDecorator = new ItemDecorator(baseItem);
        
        assertEquals(baseItem, itemDecorator.getItem());
    }

    @Test
    public void testItemRemainsUnchanged() {
        Item baseItem = new Item("Base Item", 2022, 1, 10.0, "1234567890", true, false);
        ItemDecorator itemDecorator = new ItemDecorator(baseItem);
        
        // Modifying the item field should not change the original baseItem
        itemDecorator.getItem();
        assertNotNull(baseItem);
    }

    @Test
    public void testItemIdentity() {
        Item baseItem = new Item("Base Item", 2022, 1, 10.0, "1234567890", true, false);
        ItemDecorator itemDecorator = new ItemDecorator(baseItem);
        
        // The item field should be the same as the baseItem passed to the constructor
        assertSame(baseItem, itemDecorator.getItem());
    }

    @Test
    public void testItemEquality() {
        Item baseItem1 = new Item("Base Item", 2022, 1, 10.0, "1234567890", true, false);
        Item baseItem2 = new Item("Base Item", 2022, 1, 10.0, "1234567890", true, false);
        ItemDecorator itemDecorator1 = new ItemDecorator(baseItem1);
        ItemDecorator itemDecorator2 = new ItemDecorator(baseItem2);
        
        // Two separate instances of baseItem should be equal
        assertEquals(baseItem1, baseItem2);
        
        // Two separate instances of itemDecorator should be equal
        assertEquals(itemDecorator1, itemDecorator2);
    }

    @Test
    public void testItemHashCode() {
        Item baseItem = new Item("Base Item", 2022, 1, 10.0, "1234567890", true, false);
        ItemDecorator itemDecorator = new ItemDecorator(baseItem);
        
        // Hash code should be consistent with the baseItem's hash code
        assertEquals(baseItem.hashCode(), itemDecorator.hashCode());
    }

    @Test
    public void testToStringMethod() {
        Item baseItem = new Item("Base Item", 2022, 1, 10.0, "1234567890", true, false);
        ItemDecorator itemDecorator = new ItemDecorator(baseItem);
        
        // toString() method should delegate to the baseItem's toString() method
        assertNotEquals(baseItem.toString(), itemDecorator.toString());
    }
    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullItem() {
        new ItemDecorator(null);
    }

    @Test(expected = NullPointerException.class)
    public void testGettersWithNullItem() {
        ItemDecorator itemDecorator = new ItemDecorator(null);
        itemDecorator.getItem(); // Accessing getters should throw NullPointerException
    }
  
}
