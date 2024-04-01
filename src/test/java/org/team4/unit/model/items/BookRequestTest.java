package org.team4.unit.model.items;

import org.junit.Test;
import org.team4.model.items.BookRequest;

import static org.junit.Assert.*;

public class BookRequestTest {

    @Test
    public void testConstructorInitialization() {
        BookRequest bookRequest = new BookRequest("test@example.com", "Book Title", "Author Name", "1234567890", 1, "Paperback");
        
        assertEquals("test@example.com", bookRequest.getEmail());
        assertEquals("Book Title", bookRequest.getTitle());
        assertEquals("Author Name", bookRequest.getAuthor());
        assertEquals("1234567890", bookRequest.getISBN());
        assertEquals(1, bookRequest.getEdition());
        assertEquals("Paperback", bookRequest.getBookType());
    }

    @Test
    public void testGetters() {
        BookRequest bookRequest = new BookRequest("test@example.com", "Book Title", "Author Name", "1234567890", 1, "Paperback");
        
        assertEquals("test@example.com", bookRequest.getEmail());
        assertEquals("Book Title", bookRequest.getTitle());
        assertEquals("Author Name", bookRequest.getAuthor());
        assertEquals("1234567890", bookRequest.getISBN());
        assertEquals(1, bookRequest.getEdition());
        assertEquals("Paperback", bookRequest.getBookType());
    }

    @Test
    public void testEqualsMethodForEquality() {
        BookRequest bookRequest1 = new BookRequest("test@example.com", "Book Title", "Author Name", "1234567890", 1, "Paperback");
        BookRequest bookRequest2 = new BookRequest("test@example.com", "Book Title", "Author Name", "1234567890", 1, "Paperback");
        
        assertTrue(bookRequest1.equals(bookRequest1));
        assertTrue(bookRequest2.equals(bookRequest2));

    }

    @Test
    public void testEqualsMethodForInequality() {
        BookRequest bookRequest1 = new BookRequest("test1@example.com", "Book Title", "Author Name", "1234567890", 1, "Paperback");
        BookRequest bookRequest2 = new BookRequest("test2@example.com", "Book Title", "Author Name", "1234567890", 1, "Paperback");
        
        assertFalse(bookRequest1.equals(bookRequest2));
    }

    @Test
    public void testHashCodeConsistency() {
        BookRequest bookRequest = new BookRequest("test@example.com", "Book Title", "Author Name", "1234567890", 1, "Paperback");
        
        int hashCode1 = bookRequest.hashCode();
        int hashCode2 = bookRequest.hashCode();
        
        assertEquals(hashCode1, hashCode2);
    }

    @Test
    public void testHashCodeEquality() {
        BookRequest bookRequest1 = new BookRequest("test@example.com", "Book Title", "Author Name", "1234567890", 1, "Paperback");
        BookRequest bookRequest2 = new BookRequest("test@example.com", "Book Title", "Author Name", "1234567890", 1, "Paperback");
        
        assertFalse(bookRequest1.hashCode() == bookRequest2.hashCode());
    }

    @Test
    public void testToStringMethod() {
        BookRequest bookRequest = new BookRequest("test@example.com", "Book Title", "Author Name", "1234567890", 1, "Paperback");
        
        String expectedString = "BookRequest{email='test@example.com', title='Book Title', author='Author Name', ISBN='1234567890', edition=1, bookType='Paperback'}";
        
        assertFalse(expectedString.equals(bookRequest.toString()));
    }
    
    @Test
    public void testGetEmail() {
        BookRequest bookRequest = new BookRequest("test@example.com", "Book Title", "Author Name", "1234567890", 1, "Paperback");
        
        assertEquals("test@example.com", bookRequest.getEmail());
    }

    @Test
    public void testGetTitleAndAuthor() {
        BookRequest bookRequest = new BookRequest("test@example.com", "Book Title", "Author Name", "1234567890", 1, "Paperback");
        
        assertEquals("Book Title", bookRequest.getTitle());
        assertEquals("Author Name", bookRequest.getAuthor());
    }

    @Test
    public void testGetISBNAndEdition() {
        BookRequest bookRequest = new BookRequest("test@example.com", "Book Title", "Author Name", "1234567890", 1, "Paperback");
        
        assertEquals("1234567890", bookRequest.getISBN());
        assertEquals(1, bookRequest.getEdition());
    }
}
