package org.team4.unit.model.items.builder;

import org.junit.Test;
import org.team4.model.items.Book;
import org.team4.model.items.builder.BookBuilder;

import static org.junit.Assert.*;

public class BookBuilderTest {

    @Test
    public void testBuilderMethods() {
        Book book = ((BookBuilder) new BookBuilder()
                .title("The Great Gatsby")
                .yearPublished(1925)
                .quantity(100)
                .price(15.99)
                .ISBN("9780743273565"))
                .genre("Fiction")
                .noOfPages(180)
                .author("F. Scott Fitzgerald")
                .publisher("Scribner")
                .edition(1)
                .hasHardCopy(true)
                .hasSoftCopy(true)
                .build();

        assertEquals("The Great Gatsby", book.getTitle());
        assertEquals(1925, book.getYearPublished());
        assertEquals(100, book.getQuantity());
        assertEquals(15.99, book.getPrice(), 0);
        assertEquals("9780743273565", book.getISBN());
        assertEquals("Fiction", book.getGenre());
        assertEquals(180, book.getNoOfPages());
        assertEquals("F. Scott Fitzgerald", book.getAuthor());
        assertEquals("Scribner", book.getPublisher());
        assertEquals(1, book.getEdition());
        assertTrue(book.hasHardCopy());
        assertTrue(book.hasSoftCopy());
    }

    @Test
    public void testBuildMethod() {
        BookBuilder bookBuilder = new BookBuilder();
        Book book = ((BookBuilder) bookBuilder
                .title("To Kill a Mockingbird")
                .yearPublished(1960)
                .quantity(150)
                .price(12.50)
                .ISBN("9780061120084"))
                .genre("Classic")
                .noOfPages(281)
                .author("Harper Lee")
                .publisher("HarperCollins")
                .edition(2)
                .hasHardCopy(true)
                .hasSoftCopy(false)
                .build();

        assertNotNull(book);
        assertEquals("To Kill a Mockingbird", book.getTitle());
    }

    @Test
    public void testBuildMethodWithNullValues() {
        BookBuilder bookBuilder = new BookBuilder();
        Book book = bookBuilder.build();

        assertNotNull(book);
        assertNull(book.getTitle());
    }

    @Test
    public void testBuildMethodWithPartialValues() {
        Book book = new BookBuilder()
                .title("1984")
                .price(10.99)
                .ISBN("9780451524935")
                .build();

        assertNotNull(book);
        assertEquals("1984", book.getTitle());
        assertEquals(10.99, book.getPrice(), 0);
        assertEquals("9780451524935", book.getISBN());
    }

    // Additional tests for edge cases

    public void testBuildMethodWithMissingRequiredValues() {
        BookBuilder bookBuilder = new BookBuilder();
        
        assertNotNull(bookBuilder.build());
    }

    @Test
    public void testBuildMethodWithDefaultValues() {
        Book book = new BookBuilder()
                .title("The Hobbit")
                .yearPublished(1937)
                .quantity(200)
                .price(20.00)
                .ISBN("9780261102217")
                .build();

        assertNotNull(book);
        assertEquals("The Hobbit", book.getTitle());
        assertEquals(1937, book.getYearPublished());
        assertEquals(200, book.getQuantity());
        assertEquals(20.00, book.getPrice(), 0);
        assertEquals("9780261102217", book.getISBN());
        assertFalse(book.hasHardCopy()); // Default value should be false
        assertFalse(book.hasSoftCopy()); // Default value should be false
    }

    @Test
    public void testBuildMethodWithZeroValues() {
        Book book = new BookBuilder()
                .title("Zero")
                .yearPublished(0)
                .quantity(0)
                .price(0.00)
                .ISBN("0000000000")
                .build();

        assertNotNull(book);
        assertEquals("Zero", book.getTitle());
        assertEquals(0, book.getYearPublished());
        assertEquals(0, book.getQuantity());
        assertEquals(0.00, book.getPrice(), 0);
        assertEquals("0000000000", book.getISBN());
        assertFalse(book.hasHardCopy()); // Default value should be false
        assertFalse(book.hasSoftCopy()); // Default value should be false
    }
    
    @Test
    public void testBuildMethodWithNegativeValues() {
        Book book = new BookBuilder()
                .title("Negative Values")
                .yearPublished(-100)
                .quantity(-10)
                .price(-5.99)
                .ISBN("-1234567890")
                .build();

        assertNotNull(book);
        assertEquals("Negative Values", book.getTitle());
        assertEquals(-100, book.getYearPublished());
        assertEquals(-10, book.getQuantity());
        assertEquals(-5.99, book.getPrice(), 0);
        assertEquals("-1234567890", book.getISBN());
        assertFalse(book.hasHardCopy()); // Default value should be false
        assertFalse(book.hasSoftCopy()); // Default value should be false
    }

    @Test
    public void testBuildMethodWithMaxValues() {
        Book book = new BookBuilder()
                .title("Max Values")
                .yearPublished(Integer.MAX_VALUE)
                .quantity(Integer.MAX_VALUE)
                .price(Double.MAX_VALUE)
                .ISBN("9999999999999")
                .build();

        assertNotNull(book);
        assertEquals("Max Values", book.getTitle());
        assertEquals(Integer.MAX_VALUE, book.getYearPublished());
        assertEquals(Integer.MAX_VALUE, book.getQuantity());
        assertEquals(Double.MAX_VALUE, book.getPrice(), 0);
        assertEquals("9999999999999", book.getISBN());
        assertFalse(book.hasHardCopy()); // Default value should be false
        assertFalse(book.hasSoftCopy()); // Default value should be false
    }

    @Test
    public void testBuildMethodWithLongTitle() {
        String longTitle = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce ac odio sed urna vestibulum tristique.";
        Book book = new BookBuilder()
                .title(longTitle)
                .yearPublished(2022)
                .quantity(20)
                .price(29.99)
                .ISBN("1234567890123")
                .build();

        assertNotNull(book);
        assertEquals(longTitle, book.getTitle());
        assertEquals(2022, book.getYearPublished());
        assertEquals(20, book.getQuantity());
        assertEquals(29.99, book.getPrice(), 0);
        assertEquals("1234567890123", book.getISBN());
        assertFalse(book.hasHardCopy()); // Default value should be false
        assertFalse(book.hasSoftCopy()); // Default value should be false
    }
}
