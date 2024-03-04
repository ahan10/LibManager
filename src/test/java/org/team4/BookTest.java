package org.team4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.team4.model.items.Book;
import org.team4.model.items.BookBuilder;
import org.team4.model.items.Item;

import java.util.Date;

class BookTest {

	Book actual;

	@BeforeEach
	void init(){
		 actual = ((BookBuilder) new BookBuilder()
				.title("Title")
				.yearPublished(new Date()))
				.genre("Fiction")
				.noOfPages(300)
				.author("John Doe")
				.ISBN(123456789L)
				.publisher("Book Publisher")
				 .edition("12")
				 .genre("genre")
				 .yearPublished(new Date())
				 .build();
	}
	
	@Test
	void test() {
		Item item = new Item("Title", new Date(), true, true);
		Book expected = new Book(item, "genre", 300, "John Doe", 123456789L, "Book Publisher", "12");
		assertNotEquals(actual, expected);
	}

}
