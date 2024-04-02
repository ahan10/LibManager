package org.team4.unit.functionality.recommendation;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.team4.functionality.recommendation.CompareYearRecommendationStrategy;
import org.team4.model.items.Book;
import java.util.ArrayList;

public class CompareYearRecommendationStrategyTest {

    private CompareYearRecommendationStrategy strategy;

    @Before
    public void setUp() {
        strategy = new CompareYearRecommendationStrategy();
    }

    @Test
    public void testGetRecommendationWithExactYearMatch() {
        ArrayList<Book> recommendedBooks = strategy.getRecommendation("2020");
        assertEquals(3, recommendedBooks.size());
    }

    @Test
    public void testGetRecommendationWithYearRangeWithinThreeYears() {
        ArrayList<Book> recommendedBooks = strategy.getRecommendation("2019");
        assertEquals(3, recommendedBooks.size());
    }

    @Test
    public void testGetRecommendationWithNoBooksWithinThreeYears() {
        ArrayList<Book> recommendedBooks = strategy.getRecommendation("1980");
        assertEquals(0, recommendedBooks.size());
    }

    @Test
    public void testGetRecommendationWithYearOutOfRange() {
        ArrayList<Book> recommendedBooks = strategy.getRecommendation("1950");
        assertEquals(2, recommendedBooks.size());
    }

    @Test(expected = NumberFormatException.class)
    public void testGetRecommendationWithEmptyYear() {
        ArrayList<Book> recommendedBooks = strategy.getRecommendation("");
        assertEquals(0, recommendedBooks.size());
    }

    @Test(expected = NumberFormatException.class)
    public void testGetRecommendationWithNullYear() {
        ArrayList<Book> recommendedBooks = strategy.getRecommendation(null);
        assertEquals(0, recommendedBooks.size());
    }

    @Test(expected = NumberFormatException.class)
    public void testGetRecommendationWithNonIntegerYear() {
        ArrayList<Book> recommendedBooks = strategy.getRecommendation("Year");
        assertEquals(0, recommendedBooks.size());
    }

    @Test
    public void testGetRecommendationWithNegativeYear() {
        ArrayList<Book> recommendedBooks = strategy.getRecommendation("-2020");
        assertEquals(0, recommendedBooks.size());
    }

    @Test
    public void testGetRecommendationWithFutureYear() {
        ArrayList<Book> recommendedBooks = strategy.getRecommendation("2050");
        assertEquals(0, recommendedBooks.size());
    }

    @Test
    public void testGetRecommendationWithEdgeYear() {
        ArrayList<Book> recommendedBooks = strategy.getRecommendation("1918");
        assertEquals(1, recommendedBooks.size());
    }
}
