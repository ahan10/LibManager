package org.team4.unit.functionality.recommendation;

import org.junit.Before;
import org.junit.Test;
import org.team4.functionality.recommendation.GenreRecommendationStrategy;
import org.team4.model.items.Book;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

public class GenreRecommendationStrategyTest {
    private GenreRecommendationStrategy strategy;
    
    @Before
    public void setUp() {
        strategy = new GenreRecommendationStrategy();
    }

    @Test
    public void testGetRecommendationWithValidGenre() {
        ArrayList<Book> recommendedBooks = strategy.getRecommendation("Fiction");
        assertEquals(3, recommendedBooks.size());
    }

    @Test
    public void testGetRecommendationWithNullGenre() {
        ArrayList<Book> recommendedBooks = strategy.getRecommendation(null);
        assertEquals(0, recommendedBooks.size());
    }

    @Test
    public void testGetRecommendationWithEmptyGenre() {
        ArrayList<Book> recommendedBooks = strategy.getRecommendation("");
        assertEquals(0, recommendedBooks.size());
    }

    @Test
    public void testGetRecommendationWithInvalidGenre() {
        ArrayList<Book> recommendedBooks = strategy.getRecommendation("invalid");
        assertEquals(0, recommendedBooks.size());
    }

    @Test
    public void testGetRecommendationWithGenreNotInDatabase() {
        ArrayList<Book> recommendedBooks = strategy.getRecommendation("Science Fiction");
        assertEquals(0, recommendedBooks.size());
    }

    @Test
    public void testGetRecommendationWithGenreMatchingSingleBook() {
        ArrayList<Book> recommendedBooks = strategy.getRecommendation("Mystery");
        assertEquals(1, recommendedBooks.size());
    }

    @Test
    public void testGetRecommendationWithGenreMatchingMultipleBooks() {
        ArrayList<Book> recommendedBooks = strategy.getRecommendation("Fantasy");
        assertEquals(3, recommendedBooks.size());
    }

    @Test
    public void testGetRecommendationWithGenreMatchingNoBooks() {
        ArrayList<Book> recommendedBooks = strategy.getRecommendation("Romantic Comedy");
        assertEquals(0, recommendedBooks.size());
    }

    @Test
    public void testGetRecommendationWithGenreContainingSpecialCharacters() {
        ArrayList<Book> recommendedBooks = strategy.getRecommendation("Non-fiction");
        assertEquals(3, recommendedBooks.size());
    }
    
    @Test
    public void testGetRecommendationWithGenreMatchingMoreThanAvailableBooks() {
        ArrayList<Book> recommendedBooks = strategy.getRecommendation("Adventure");
        assertEquals(3, recommendedBooks.size());
    }
}
