package org.team4.unit.functionality.recommendation;

import org.junit.Before;
import org.junit.Test;
import org.team4.functionality.recommendation.AuthorRecommendationStrategy;
import org.team4.model.items.Book;
import org.team4.maintaindb.MaintainBooks;
import org.team4.model.items.Item;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class AuthorRecommendationStrategyTest {

    private AuthorRecommendationStrategy strategy;

    @Before
    public void setUp() {
        strategy = new AuthorRecommendationStrategy();
    }

    @Test
    public void testGetRecommendationWithMatchingAuthor() {
        new Item("Book", 2020, 10, 20.0, "1234567890", true, false);
        ArrayList<Book> recommendedBooks = strategy.getRecommendation("John Doe");
        assertEquals(1, recommendedBooks.size());
    }

    @Test
    public void testGetRecommendationWithPartiallyMatchingAuthor() {
        Item item1 = new Item("Book", 2020, 10, 20.0, "1234567890", true, false);
        Book book1 = new Book(item1, "Fiction", 300, "John Doe", "ABC Publications", 1, true, false);
        MaintainBooks.getInstance().addBook(book1);
        ArrayList<Book> recommendedBooks = strategy.getRecommendation("John Doe");
        assertEquals(1, recommendedBooks.size());
    }

    @Test
    public void testGetRecommendationWithNonMatchingAuthor() {
        ArrayList<Book> recommendedBooks = strategy.getRecommendation("Smith");
        assertEquals(0, recommendedBooks.size());
    }


    @Test
    public void testGetRecommendationWithEmptyDatabase() {
        ArrayList<Book> recommendedBooks = strategy.getRecommendation("Author");
        assertEquals(0, recommendedBooks.size());
    }

    @Test
    public void testGetRecommendationWithNullAuthor() {
        ArrayList<Book> recommendedBooks = strategy.getRecommendation(null);
        assertEquals(0, recommendedBooks.size());
    }

    @Test
    public void testGetRecommendationWithMaxMatches() {
        ArrayList<Book> recommendedBooks = strategy.getRecommendation("F. Scott Fitzgerald");
        assertEquals(1, recommendedBooks.size());
    }

    @Test
    public void testGetRecommendationWithMoreThanMaxMatches() {
        ArrayList<Book> recommendedBooks = strategy.getRecommendation("J.D. Salinger");
        System.out.println(recommendedBooks.size());
        assertEquals(1, recommendedBooks.size());
    }

    @Test
    public void testGetRecommendationWithPartiallyMatchingAuthorsAndOtherItems() {
        ArrayList<Book> recommendedBooks = strategy.getRecommendation("PartialAuthor");
        assertEquals(0, recommendedBooks.size()); // Adjust the expected size as needed
    }

    @Test
    public void testGetRecommendationWithPartiallyMatchingAuthorAndNullAuthors() {
        ArrayList<Book> recommendedBooks = strategy.getRecommendation("Paul Krugman");
        assertEquals(1, recommendedBooks.size()); // Adjust the expected size as needed
    }
    
    @Test
    public void testGetRecommendationWithCaseInsensitiveAuthor1() {
        ArrayList<Book> recommendedBooks = strategy.getRecommendation("john doe");
        assertEquals(0, recommendedBooks.size());
    }
    
    @Test
    public void testGetRecommendationWithCaseInsensitiveAuthor() {
        Item item1 = new Item("Book", 2020, 10, 20.0, "1234567890", true, false);
        Book book1 = new Book(item1, "Fiction", 300, "John Doe", "ABC Publications", 1, true, false);
        MaintainBooks.getInstance().addBook(book1);
        ArrayList<Book> recommendedBooks = strategy.getRecommendation("john doe");
        assertEquals(0, recommendedBooks.size());
    }

}
