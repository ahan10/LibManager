package org.team4.unit.functionality.recommendation;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.team4.functionality.recommendation.TitleRecommendationStrategy;
import org.team4.model.items.Book;

public class TitleRecommendationStrategyTest {
	private TitleRecommendationStrategy strategy;

	@Before
	public void setUp() {
		strategy = new TitleRecommendationStrategy();
	}

	@Test
	public void testGetRecommendationWithTitleExactMatch() {
		ArrayList<Book> recommendedBooks = strategy.getRecommendation("Introduction to Java Programming");
		assertEquals(1, recommendedBooks.size());
	}

	@Test
	public void testGetRecommendationWithTitlePartialMatch() {
		ArrayList<Book> recommendedBooks = strategy.getRecommendation("Java Programming");
		assertEquals(1, recommendedBooks.size());
	}

	@Test
	public void testGetRecommendationWithTitleCaseInsensitive() {
		ArrayList<Book> recommendedBooks = strategy.getRecommendation("the great gatsby");
		assertEquals(1, recommendedBooks.size());
	}

	@Test
	public void testGetRecommendationWithTitleNoMatch() {
		ArrayList<Book> recommendedBooks = strategy.getRecommendation("Nonexistent Title");
		assertEquals(0, recommendedBooks.size());
	}

	@Ignore
	@Test
	public void testGetRecommendationWithTitleEmptyTitle() {
		ArrayList<Book> recommendedBooks = strategy.getRecommendation("");
		assertEquals(49, recommendedBooks.size());
	}

    @Test(expected = NullPointerException.class)
	public void testGetRecommendationWithTitleNullTitle() {
		ArrayList<Book> recommendedBooks = strategy.getRecommendation(null);
		assertEquals(0, recommendedBooks.size());
	}

	@Test
	public void testGetRecommendationWithTitleSubstringMatch() {
		ArrayList<Book> recommendedBooks = strategy.getRecommendation("Introduction to");
		assertEquals(7, recommendedBooks.size());
	}

	@Test
	public void testGetRecommendationWithTitleSubstringMatchIgnoreCase() {
		ArrayList<Book> recommendedBooks = strategy.getRecommendation("introduction");
		assertEquals(7, recommendedBooks.size());
	}

	@Test
	public void testGetRecommendationWithTitleLeadingWhitespace() {
		ArrayList<Book> recommendedBooks = strategy.getRecommendation(" The Great Gatsby");
		assertEquals(0, recommendedBooks.size());
	}

	@Test
	public void testGetRecommendationWithTitleTrailingWhitespace() {
		ArrayList<Book> recommendedBooks = strategy.getRecommendation("The Great Gatsby ");
		assertEquals(0, recommendedBooks.size());
	}

	@Test
	public void testGetRecommendationWithTitleWhitespaceAround() {
		ArrayList<Book> recommendedBooks = strategy.getRecommendation(" The Great Gatsby ");
		assertEquals(0, recommendedBooks.size());
	}

	@Test
	public void testGetRecommendationWithTitleSubstringWithMultipleMatches() {
		ArrayList<Book> recommendedBooks = strategy.getRecommendation("Introduction");
		assertEquals(7, recommendedBooks.size());
	}

	@Test
	public void testGetRecommendationWithTitleMultiplePartialMatches() {
		ArrayList<Book> recommendedBooks = strategy.getRecommendation("The");
		assertEquals(20, recommendedBooks.size());
	}

	@Test
	public void testGetRecommendationWithTitleMultipleExactMatches() {
		ArrayList<Book> recommendedBooks = strategy.getRecommendation("The Lord of the Rings");
		assertEquals(1, recommendedBooks.size());
	}

	@Test
	public void testGetRecommendationWithTitlePartialMatchWithDifferentCases() {
		ArrayList<Book> recommendedBooks = strategy.getRecommendation("tHE rOAD");
		assertEquals(1, recommendedBooks.size());
	}

	@Test
	public void testGetRecommendationWithTitleSpecialCharacters() {
		ArrayList<Book> recommendedBooks = strategy.getRecommendation("The Da Vinci Code");
		assertEquals(1, recommendedBooks.size());
	}


}