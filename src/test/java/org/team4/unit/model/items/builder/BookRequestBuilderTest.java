package org.team4.unit.model.items.builder;

import org.junit.Test;
import org.team4.model.items.BookRequest;
import org.team4.model.items.builder.BookRequestBuilder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BookRequestBuilderTest {

    @Test
    public void testBuildWithAllFields() {
        BookRequest bookRequest = new BookRequestBuilder()
                .email("user@example.com")
                .title("Sample Book")
                .author("John Doe")
                .ISBN("1234567890")
                .edition(1)
                .booktype("Hardcover")
                .build();

        assertNotNull(bookRequest);
        assertEquals("user@example.com", bookRequest.getEmail());
        assertEquals("Sample Book", bookRequest.getTitle());
        assertEquals("John Doe", bookRequest.getAuthor());
        assertEquals("1234567890", bookRequest.getISBN());
        assertEquals(1, bookRequest.getEdition());
        assertEquals("Hardcover", bookRequest.getBookType());
    }

    @Test
    public void testBuildWithNullFields() {
        BookRequest bookRequest = new BookRequestBuilder().build();

        assertNotNull(bookRequest);
        assertEquals(null, bookRequest.getEmail());
        assertEquals(null, bookRequest.getTitle());
        assertEquals(null, bookRequest.getAuthor());
        assertEquals(null, bookRequest.getISBN());
        assertEquals(0, bookRequest.getEdition());
        assertEquals(null, bookRequest.getBookType());
    }

    @Test
    public void testBuildWithPartialFields() {
        BookRequest bookRequest = new BookRequestBuilder()
                .email("user@example.com")
                .title("Sample Book")
                .ISBN("1234567890")
                .build();

        assertNotNull(bookRequest);
        assertEquals("user@example.com", bookRequest.getEmail());
        assertEquals("Sample Book", bookRequest.getTitle());
        assertEquals(null, bookRequest.getAuthor());
        assertEquals("1234567890", bookRequest.getISBN());
        assertEquals(0, bookRequest.getEdition());
        assertEquals(null, bookRequest.getBookType());
    }

    // Additional tests for edge cases

    @Test
    public void testBuildWithEmptyStrings() {
        BookRequest bookRequest = new BookRequestBuilder()
                .email("")
                .title("")
                .author("")
                .ISBN("")
                .booktype("")
                .build();

        assertNotNull(bookRequest);
        assertEquals("", bookRequest.getEmail());
        assertEquals("", bookRequest.getTitle());
        assertEquals("", bookRequest.getAuthor());
        assertEquals("", bookRequest.getISBN());
        assertEquals(0, bookRequest.getEdition());
        assertEquals("", bookRequest.getBookType());
    }

    @Test
    public void testBuildWithNegativeEdition() {
        BookRequest bookRequest = new BookRequestBuilder()
                .edition(-1)
                .build();

        assertNotNull(bookRequest);
        assertEquals(null, bookRequest.getEmail());
        assertEquals(null, bookRequest.getTitle());
        assertEquals(null, bookRequest.getAuthor());
        assertEquals(null, bookRequest.getISBN());
        assertEquals(-1, bookRequest.getEdition());
        assertEquals(null, bookRequest.getBookType());
    }

    @Test
    public void testBuildWithLongISBN() {
        BookRequest bookRequest = new BookRequestBuilder()
                .ISBN("12345678901234")
                .build();

        assertNotNull(bookRequest);
        assertEquals(null, bookRequest.getEmail());
        assertEquals(null, bookRequest.getTitle());
        assertEquals(null, bookRequest.getAuthor());
        assertEquals("12345678901234", bookRequest.getISBN());
        assertEquals(0, bookRequest.getEdition());
        assertEquals(null, bookRequest.getBookType());
    }
    
    @Test
    public void testBuildWithMaxEdition() {
        BookRequest bookRequest = new BookRequestBuilder()
                .edition(Integer.MAX_VALUE)
                .build();

        assertNotNull(bookRequest);
        assertEquals(null, bookRequest.getEmail());
        assertEquals(null, bookRequest.getTitle());
        assertEquals(null, bookRequest.getAuthor());
        assertEquals(null, bookRequest.getISBN());
        assertEquals(Integer.MAX_VALUE, bookRequest.getEdition());
        assertEquals(null, bookRequest.getBookType());
    }

    @Test
    public void testBuildWithZeroEdition() {
        BookRequest bookRequest = new BookRequestBuilder()
                .edition(0)
                .build();

        assertNotNull(bookRequest);
        assertEquals(null, bookRequest.getEmail());
        assertEquals(null, bookRequest.getTitle());
        assertEquals(null, bookRequest.getAuthor());
        assertEquals(null, bookRequest.getISBN());
        assertEquals(0, bookRequest.getEdition());
        assertEquals(null, bookRequest.getBookType());
    }

    @Test
    public void testBuildWithLongAuthorName() {
        String longAuthorName = "John William Smith Jr. the Third";
        BookRequest bookRequest = new BookRequestBuilder()
                .author(longAuthorName)
                .build();

        assertNotNull(bookRequest);
        assertEquals(null, bookRequest.getEmail());
        assertEquals(null, bookRequest.getTitle());
        assertEquals(longAuthorName, bookRequest.getAuthor());
        assertEquals(null, bookRequest.getISBN());
        assertEquals(0, bookRequest.getEdition());
        assertEquals(null, bookRequest.getBookType());
    }

    @Test
    public void testBuildWithNullAuthorAndISBN() {
        BookRequest bookRequest = new BookRequestBuilder()
                .author(null)
                .ISBN(null)
                .build();

        assertNotNull(bookRequest);
        assertEquals(null, bookRequest.getEmail());
        assertEquals(null, bookRequest.getTitle());
        assertEquals(null, bookRequest.getAuthor());
        assertEquals(null, bookRequest.getISBN());
        assertEquals(0, bookRequest.getEdition());
        assertEquals(null, bookRequest.getBookType());
    }
}
