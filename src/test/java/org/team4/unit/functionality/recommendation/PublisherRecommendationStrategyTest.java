package org.team4.unit.functionality.recommendation;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.team4.functionality.recommendation.PublisherRecommendationStrategy;
import org.team4.model.items.Book;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

public class PublisherRecommendationStrategyTest {
    private PublisherRecommendationStrategy strategy ;
    
    @Before
    public void setUp() {
        strategy = new PublisherRecommendationStrategy();
    }

    
    @Test
    public void testGetRecommendationWithEmptyDatabase() {
        ArrayList<Book> recommendedBooks = strategy.getRecommendation("Publisher");
        assertEquals(0, recommendedBooks.size());
    }

    @Test
    public void testGetRecommendationWithNullPublisher() {
        ArrayList<Book> recommendedBooks = strategy.getRecommendation(null);
        assertEquals(0, recommendedBooks.size());
    }

    @Test
    public void testGetRecommendationWithMaxMatches() {
        ArrayList<Book> recommendedBooks = strategy.getRecommendation("Houghton Mifflin Harcourt");
        assertEquals(2, recommendedBooks.size());
    }

    @Test
    public void testGetRecommendationWithMoreThanMaxMatches() {
        ArrayList<Book> recommendedBooks = strategy.getRecommendation("Penguin Classics");
        assertEquals(3, recommendedBooks.size());
    }

    @Test
    public void testGetRecommendationWithPartiallyMatchingPublishersAndOtherItems() {
        ArrayList<Book> recommendedBooks = strategy.getRecommendation("Harper");
        assertEquals(1, recommendedBooks.size());
    }

    @Ignore
    @Test
    public void testGetRecommendationWithPartiallyMatchingPublisherAndNullPublishers() {
        ArrayList<Book> recommendedBooks = strategy.getRecommendation("ABC Publications");
        assertEquals(1, recommendedBooks.size());
    }
    
    @Test
    public void testGetRecommendationWithCaseInsensitivePublisher() {
        ArrayList<Book> recommendedBooks = strategy.getRecommendation("mCgrAw-hIll eduCation");
        assertEquals(0, recommendedBooks.size());
    }

    @Test
    public void testGetRecommendationWithNonexistentPublisher() {
        ArrayList<Book> recommendedBooks = strategy.getRecommendation("Nonexistent Publisher");
        assertEquals(0, recommendedBooks.size());
    }

    @Test
    public void testGetRecommendationWithMixedCasePublisher() {
        ArrayList<Book> recommendedBooks = strategy.getRecommendation("hoUghton MIfflin HARCOURT");
        assertEquals(0, recommendedBooks.size());
    }
    
    @Test
    public void testGetRecommendationWithMultipleMatches() {
        ArrayList<Book> recommendedBooks = strategy.getRecommendation("Pearson");
        assertEquals(3, recommendedBooks.size());
    }
}
