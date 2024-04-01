package org.team4.unit.model.items;

import org.junit.Test;
import org.team4.model.items.*;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void testConstructorInitialization() {
        Item item = new Item("Book", 2020, 10, 20.0, "1234567890", true, false);
        Book book = new Book(item, "Fiction", 300, "John Doe", "ABC Publications", 1, true, false);
        
        assertEquals("Fiction", book.getGenre());
        assertEquals(300, book.getNoOfPages());
        assertEquals("John Doe", book.getAuthor());
        assertEquals("ABC Publications", book.getPublisher());
        assertEquals(1, book.getEdition());
        assertTrue(book.hasHardCopy());
        assertFalse(book.hasSoftCopy());
    }

    @Test
    public void testEqualsMethodForEquality() {
        Item item1 = new Item("Book", 2020, 10, 20.0, "1234567890", true, false);
        Item item2 = new Item("Book", 2020, 10, 20.0, "1234567890", true, false);
        Book book1 = new Book(item1, "Fiction", 300, "John Doe", "ABC Publications", 1, true, false);
        Book book2 = new Book(item2, "Fiction", 300, "John Doe", "ABC Publications", 1, true, false);
        
        assertTrue(book1.equals(book2));
    }

    @Test
    public void testEqualsMethodForInequality() {
        Item item1 = new Item("Book", 2020, 10, 20.0, "1234567890", true, false);
        Item item2 = new Item("Book", 2020, 10, 20.0, "0987654321", true, false);
        Book book1 = new Book(item1, "Fiction", 300, "John Doe", "ABC Publications", 1, true, false);
        Book book2 = new Book(item2, "Fiction", 300, "John Doe", "ABC Publications", 1, true, false);
        
        assertFalse(book1.equals(book2));
    }

    @Test
    public void testHashCodeConsistency() {
        Item item = new Item("Book", 2020, 10, 20.0, "1234567890", true, false);
        Book book = new Book(item, "Fiction", 300, "John Doe", "ABC Publications", 1, true, false);
        
        int hashCode1 = book.hashCode();
        int hashCode2 = book.hashCode();
        
        assertEquals(hashCode1, hashCode2);
    }

    @Test
    public void testHashCodeEquality() {
        Item item1 = new Item("Book", 2020, 10, 20.0, "1234567890", true, false);
        Item item2 = new Item("Book", 2020, 10, 20.0, "1234567890", true, false);
        Book book1 = new Book(item1, "Fiction", 300, "John Doe", "ABC Publications", 1, true, false);
        Book book2 = new Book(item2, "Fiction", 300, "John Doe", "ABC Publications", 1, true, false);
        
        assertEquals(book1.hashCode(), book2.hashCode());
    }

    @Test
    public void testToStringMethod() {
        Item item = new Item("Book", 2020, 10, 20.0, "1234567890", true, false);
        Book book = new Book(item, "Fiction", 300, "John Doe", "ABC Publications", 1, true, false);
        
        String expectedString = "Book{genre='Fiction', noOfPages=300, author='John Doe', ISBN=1234567890, publisher='ABC Publications', edition='1'}";
        
        assertEquals(expectedString, book.toString());
    }

    @Test
    public void testHasHardCopy() {
        Item item = new Item("Book", 2020, 10, 20.0, "1234567890", true, false);
        Book book1 = new Book(item, "Fiction", 300, "John Doe", "ABC Publications", 1, true, false);
        Book book2 = new Book(item, "Fiction", 300, "John Doe", "ABC Publications", 1, false, false);
        
        assertTrue(book1.hasHardCopy());
        assertFalse(book2.hasHardCopy());
    }

    @Test
    public void testHasSoftCopy() {
        Item item = new Item("Book", 2020, 10, 20.0, "1234567890", true, false);
        Book book1 = new Book(item, "Fiction", 300, "John Doe", "ABC Publications", 1, true, false);
        Book book2 = new Book(item, "Fiction", 300, "John Doe", "ABC Publications", 1, true, true);
        
        assertFalse(book1.hasSoftCopy());
        assertTrue(book2.hasSoftCopy());
    }

    @Test
    public void testGetters() {
        Item item = new Item("Book", 2020, 10, 20.0, "1234567890", true, false);
        Book book = new Book(item, "Fiction", 300, "John Doe", "ABC Publications", 1, true, false);
        
        assertEquals("Fiction", book.getGenre());
        assertEquals(300, book.getNoOfPages());
        assertEquals("John Doe", book.getAuthor());
        assertEquals("ABC Publications", book.getPublisher());
        assertEquals(1, book.getEdition());
    }
    
    @Test
    public void testHashCodeWithDifferentEdition() {
        Item item1 = new Item("Book", 2020, 10, 20.0, "1234567890", true, false);
        Item item2 = new Item("Book", 2020, 10, 20.0, "1234567890", true, false);
        Book book1 = new Book(item1, "Fiction", 300, "John Doe", "ABC Publications", 1, true, false);
        Book book2 = new Book(item2, "Fiction", 300, "John Doe", "ABC Publications", 2, true, false);
        
        assertNotEquals(book1.hashCode(), book2.hashCode());
    }

    @Test
    public void testEqualsMethodForDifferentGenre() {
        Item item1 = new Item("Book", 2020, 10, 20.0, "1234567890", true, false);
        Item item2 = new Item("Book", 2020, 10, 20.0, "1234567890", true, false);
        Book book1 = new Book(item1, "Fiction", 300, "John Doe", "ABC Publications", 1, true, false);
        Book book2 = new Book(item2, "Science Fiction", 300, "John Doe", "ABC Publications", 1, true, false);
        
        assertFalse(book1.equals(book2));
    }
    
}
