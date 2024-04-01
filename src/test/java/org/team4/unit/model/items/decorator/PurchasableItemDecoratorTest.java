package org.team4.unit.model.items.decorator;

import org.junit.Test;
import org.team4.model.items.Item;
import org.team4.model.items.decorator.PurchasableItemDecorator;

import static org.junit.Assert.*;

public class PurchasableItemDecoratorTest {

    @Test
    public void testConstructorInitialization() {
        Item baseItem = new Item("Base Item", 2022, 1, 10.0, "1234567890", false, false);
        PurchasableItemDecorator decorator = new PurchasableItemDecorator(baseItem);
        
        assertTrue(decorator.isPurchasable());
    }

    @Test
    public void testIsPurchasableMethod() {
        Item baseItem1 = new Item("Base Item", 2022, 1, 10.0, "1234567890", false, false);
        PurchasableItemDecorator decorator1 = new PurchasableItemDecorator(baseItem1);
        
        assertTrue(decorator1.isPurchasable());
        
        Item baseItem2 = new Item("Base Item", 2022, 1, 10.0, "1234567890", true, false);
        PurchasableItemDecorator decorator2 = new PurchasableItemDecorator(baseItem2);
        
        assertTrue(decorator2.isPurchasable());
    }

    @Test
    public void testIsPurchasableMethodWithInheritedItem() {
        Item baseItem = new Item("Base Item", 2022, 1, 10.0, "1234567890", true, false);
        PurchasableItemDecorator decorator = new PurchasableItemDecorator(baseItem);
        
        assertTrue(decorator.isPurchasable());
    }

    @Test
    public void testIsPurchasableMethodWithMultipleDecorators() {
        Item baseItem = new Item("Base Item", 2022, 1, 10.0, "1234567890", false, false);
        PurchasableItemDecorator decorator1 = new PurchasableItemDecorator(baseItem);
        PurchasableItemDecorator decorator2 = new PurchasableItemDecorator(decorator1);
        
        assertTrue(decorator2.isPurchasable());
    }

    @Test(expected = NullPointerException.class)
    public void testIsPurchasableMethodWithNullItem() {
        PurchasableItemDecorator decorator = new PurchasableItemDecorator(null);
        
        assertFalse(decorator.isPurchasable());
    }

    // Additional tests for edge cases

    @Test(expected = NullPointerException.class)
    public void testIsPurchasableMethodWithInheritedItemAndDecorator() {
        PurchasableItemDecorator decorator1 = new PurchasableItemDecorator(null);
        Item baseItem = new Item("Base Item", 2022, 1, 10.0, "1234567890", true, false);
        PurchasableItemDecorator decorator2 = new PurchasableItemDecorator(baseItem);

        assertTrue(decorator1.isPurchasable());
        assertTrue(decorator2.isPurchasable());
    }

    @Test(expected = NullPointerException.class)
    public void testIsPurchasableMethodWithInheritedItemAndDecoratorReversed() {
        PurchasableItemDecorator decorator1 = new PurchasableItemDecorator(null);
        Item baseItem = new Item("Base Item", 2022, 1, 10.0, "1234567890", true, false);
        PurchasableItemDecorator decorator2 = new PurchasableItemDecorator(baseItem);
        
        assertTrue(decorator1.isPurchasable());
        assertFalse(decorator2.isPurchasable());
    }

    @Test(expected = NullPointerException.class)
    public void testIsPurchasableMethodWithMultipleNullDecorators() {
        PurchasableItemDecorator decorator1 = new PurchasableItemDecorator(null);
        PurchasableItemDecorator decorator2 = new PurchasableItemDecorator(null);
        
        assertFalse(decorator1.isPurchasable());
        assertFalse(decorator2.isPurchasable());
    }
    
    @Test(expected = NullPointerException.class)
    public void testIsPurchasableMethodWithItemSetAfterConstructor() {
        new Item("Base Item", 2022, 1, 10.0, "1234567890", false, false);
        PurchasableItemDecorator decorator = new PurchasableItemDecorator(null);

        assertTrue(decorator.isPurchasable());
    }

    @Test
    public void testIsPurchasableMethodWithItemSetToNullAfterConstructor() {
        Item baseItem = new Item("Base Item", 2022, 1, 10.0, "1234567890", true, false);
        PurchasableItemDecorator decorator = new PurchasableItemDecorator(baseItem);

        assertTrue(decorator.isPurchasable());
    }
}
