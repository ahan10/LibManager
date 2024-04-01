package org.team4.unit.maintaindb;

import static org.junit.Assert.*;

import org.junit.*;
import org.team4.maintaindb.MaintainBooks;
import org.team4.model.items.Book;
import org.team4.model.items.Item;
import org.team4.model.items.builder.BookBuilder;


public class MaintainBooksTest {
	
	MaintainBooks bookMaintainer;
	
	@Before
	public void setUp() {
		bookMaintainer = MaintainBooks.getInstance();
	}
	
	@Test
	public void testFirstBook() {
		assertEquals("9781234567890", bookMaintainer.getAllBooks().get(0).getISBN());
	}
	
	@Test
	public void testDecreaseCopies() {
		Item itemToDecrease = bookMaintainer.getAllBooks().get(3);
		int newNumberOfCopies = itemToDecrease.getQuantity()-1;
		bookMaintainer.decreaseNumberOfCopies(itemToDecrease);
		assertEquals(newNumberOfCopies, bookMaintainer.getAllBooks().get(3).getQuantity());
	}
	
	@Test
	public void testIncreaseCopies() {
		Item itemToDecrease = bookMaintainer.getAllBooks().get(3);
		int newNumberOfCopies = itemToDecrease.getQuantity()+1;
		bookMaintainer.increaseNumberOfCopies(itemToDecrease);
		assertEquals(newNumberOfCopies, bookMaintainer.getAllBooks().get(3).getQuantity());
		
	}
	
	@Test
	public void testSearchExactBook() {
		assertTrue(bookMaintainer.searchExactBook("9781234567890"));
	}
	
	@Test
	public void testSearchExactBookByISBN() {
		String ISBNToSearch = "9780374533557";
		Book searchedBook = bookMaintainer.searchExactBookByISBN(ISBNToSearch);
		assertEquals(ISBNToSearch, searchedBook.getISBN());
	}
	
	@Test
	public void bookNotFountByISBN() {
		String ISBNToSearch = "9785374532558";
		Book searchedBook = bookMaintainer.searchExactBookByISBN(ISBNToSearch);
		assertNull(searchedBook);
	}
	
	@Test
	public void testSearchExactBookByTitle() {
		String titleToSearch = "Pride and Prejudice";
		Book searchedBook = bookMaintainer.searchExactBookByTitle(titleToSearch);
		assertEquals(titleToSearch, searchedBook.getTitle());
	}
	
	@Test
	public void bookNotFountByTitle() {
		String titleToSearch = "This Book Does Not Exist";
		Book searchedBook = bookMaintainer.searchExactBookByISBN(titleToSearch);
		assertNull(searchedBook);
	}
	
	@Test
	public void testAddBook() {
		Book newBook = ((BookBuilder) new BookBuilder()
                .title("This is a test book")
                .yearPublished(2077)
                .price(123.45)
                .ISBN("1234567890123")
                .quantity(20))
                .noOfPages(123)
                .author("Author")
                .publisher("Publisher")
                .edition(0)
                .genre("Genre")
                .hasHardCopy(false)
                .hasSoftCopy(false)
                .build();
		
		bookMaintainer.addBook(newBook);
		assertTrue(bookMaintainer.searchExactBook("1234567890123"));
	}
	
	@Test
	public void testAddDuplicateBook() {
		Book newBook = ((BookBuilder) new BookBuilder()
                .title("This is a test book")
                .yearPublished(2077)
                .price(123.45)
                .ISBN("1234567890123")
                .quantity(20))
                .noOfPages(123)
                .author("Author")
                .publisher("Publisher")
                .edition(0)
                .genre("Genre")
                .hasHardCopy(false)
                .hasSoftCopy(false)
                .build();
		
		bookMaintainer.addBook(newBook);
		assertTrue(bookMaintainer.searchExactBook("1234567890123"));
	}
	
	@Test
	public void removeTestBook() {
		int numberOfBooks = bookMaintainer.getAllBooks().size();
		bookMaintainer.getAllBooks().remove(numberOfBooks-1);
		assertEquals(numberOfBooks-1, bookMaintainer.getAllBooks().size());
	}
	
	@Test
	public void testUpdate() {
		try {
			bookMaintainer.update();
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertFalse(bookMaintainer.searchExactBook("1234567890123"));
	}

}