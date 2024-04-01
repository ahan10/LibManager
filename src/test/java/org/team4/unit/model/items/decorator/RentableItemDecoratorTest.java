package org.team4.unit.model.items.decorator;

import org.junit.Test;
import org.team4.model.items.Item;
import org.team4.model.items.decorator.RentableItemDecorator;

import static org.junit.Assert.*;

public class RentableItemDecoratorTest {

    @Test
    public void testConstructorInitialization() {
        Item baseItem = new Item("Base Item", 2022, 1, 10.0, "1234567890", false, false);
        RentableItemDecorator decorator = new RentableItemDecorator(baseItem);
        
        assertTrue(decorator.isRentable());
    }

    @Test
    public void testIsRentableMethod() {
        Item baseItem1 = new Item("Base Item", 2022, 1, 10.0, "1234567890", false, false);
        RentableItemDecorator decorator1 = new RentableItemDecorator(baseItem1);
        
        assertTrue(decorator1.isRentable());
        
        Item baseItem2 = new Item("Base Item", 2022, 1, 10.0, "1234567890", false, true);
        RentableItemDecorator decorator2 = new RentableItemDecorator(baseItem2);
        
        assertTrue(decorator2.isRentable());
    }

    @Test
    public void testIsRentableMethodWithInheritedItem() {
        Item baseItem = new Item("Base Item", 2022, 1, 10.0, "1234567890", false, true);
        RentableItemDecorator decorator = new RentableItemDecorator(baseItem);
        
        assertTrue(decorator.isRentable());
    }

    @Test
    public void testIsRentableMethodWithMultipleDecorators() {
        Item baseItem = new Item("Base Item", 2022, 1, 10.0, "1234567890", false, false);
        RentableItemDecorator decorator1 = new RentableItemDecorator(baseItem);
        RentableItemDecorator decorator2 = new RentableItemDecorator(decorator1);
        
        assertTrue(decorator2.isRentable());
    }

    @Test(expected = NullPointerException.class)
    public void testIsRentableMethodWithNullItem() {
        RentableItemDecorator decorator = new RentableItemDecorator(null);
        
        assertFalse(decorator.isRentable());
    }

    // Additional tests for edge cases

    @Test(expected = NullPointerException.class)
    public void testIsRentableMethodWithInheritedItemAndDecorator() {
        RentableItemDecorator decorator1 = new RentableItemDecorator(null);
        Item baseItem = new Item("Base Item", 2022, 1, 10.0, "1234567890", false, true);
        RentableItemDecorator decorator2 = new RentableItemDecorator(baseItem);

        assertTrue(decorator1.isRentable());
        assertTrue(decorator2.isRentable());
    }

    @Test(expected = NullPointerException.class)
    public void testIsRentableMethodWithInheritedItemAndDecoratorReversed() {
        RentableItemDecorator decorator1 = new RentableItemDecorator(null);
        Item baseItem = new Item("Base Item", 2022, 1, 10.0, "1234567890", false, true);
        RentableItemDecorator decorator2 = new RentableItemDecorator(baseItem);
        
        assertTrue(decorator1.isRentable());
        assertFalse(decorator2.isRentable());
    }

    @Test(expected = NullPointerException.class)
    public void testIsRentableMethodWithMultipleNullDecorators() {
        RentableItemDecorator decorator1 = new RentableItemDecorator(null);
        RentableItemDecorator decorator2 = new RentableItemDecorator(null);
        
        assertFalse(decorator1.isRentable());
        assertFalse(decorator2.isRentable());
    }
    
    @Test(expected = NullPointerException.class)
    public void testIsRentableMethodWithItemSetAfterConstructor() {
        new Item("Base Item", 2022, 1, 10.0, "1234567890", false, false);
        RentableItemDecorator decorator = new RentableItemDecorator(null);

        assertTrue(decorator.isRentable());
    }

    @Test
    public void testIsRentableMethodWithItemSetToNullAfterConstructor() {
        Item baseItem = new Item("Base Item", 2022, 1, 10.0, "1234567890", false, true);
        RentableItemDecorator decorator = new RentableItemDecorator(baseItem);

        assertTrue(decorator.isRentable());
    }
}
