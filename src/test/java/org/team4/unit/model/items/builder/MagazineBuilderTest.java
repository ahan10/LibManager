package org.team4.unit.model.items.builder;

import org.junit.Test;
import org.team4.model.items.Magazine;
import org.team4.model.items.builder.MagazineBuilder;

import static org.junit.Assert.*;

public class MagazineBuilderTest {

    @Test
    public void testBuildWithAllFieldsSet() {
        Magazine magazine = ((MagazineBuilder) new MagazineBuilder()
                .title("Tech Weekly")
                .yearPublished(2022)
                .quantity(100)
                .price(5.99)
                .ISBN("9781234567890"))
                .publisher("Tech Publications")
                .issueNumber(1)
                .build();

        assertNotNull(magazine);
        assertEquals("Tech Weekly", magazine.getTitle());
        assertEquals(2022, magazine.getYearPublished());
        assertEquals(100, magazine.getQuantity());
        assertEquals(5.99, magazine.getPrice(), 0);
        assertEquals("9781234567890", magazine.getISBN());
        assertEquals("Tech Publications", magazine.getPublisher());
        assertEquals(1, magazine.getIssueNumber());
    }

    @Test
    public void testBuildWithNullFields() {
        Magazine magazine = ((MagazineBuilder) new MagazineBuilder()
                .title(null)
                .yearPublished(0)
                .quantity(0)
                .price(0)
                .ISBN(null))
                .publisher(null)
                .issueNumber(0)
                .build();

        assertNotNull(magazine);
        assertNull(magazine.getTitle());
        assertEquals(0, magazine.getYearPublished());
        assertEquals(0, magazine.getQuantity());
        assertEquals(0, magazine.getPrice(), 0);
        assertNull(magazine.getISBN());
        assertNull(magazine.getPublisher());
        assertEquals(0, magazine.getIssueNumber());
    }

    @Test
    public void testBuildWithNegativeValues() {
        Magazine magazine = ((MagazineBuilder) new MagazineBuilder()
                .title("Negative Values Magazine")
                .yearPublished(-2023)
                .quantity(-50)
                .price(-3.99)
                .ISBN("-1234567890"))
                .publisher("Negative Publishers")
                .issueNumber(-1)
                .build();

        assertNotNull(magazine);
        assertEquals("Negative Values Magazine", magazine.getTitle());
        assertEquals(-2023, magazine.getYearPublished());
        assertEquals(-50, magazine.getQuantity());
        assertEquals(-3.99, magazine.getPrice(), 0);
        assertEquals("-1234567890", magazine.getISBN());
        assertEquals("Negative Publishers", magazine.getPublisher());
        assertEquals(-1, magazine.getIssueNumber());
    }

    @Test
    public void testBuildWithMaxValues() {
        Magazine magazine = ((MagazineBuilder) new MagazineBuilder()
                .title("Max Values Magazine")
                .yearPublished(Integer.MAX_VALUE)
                .quantity(Integer.MAX_VALUE)
                .price(Double.MAX_VALUE)
                .ISBN("9999999999"))
                .publisher("Max Publishers")
                .issueNumber(Integer.MAX_VALUE)
                .build();

        assertNotNull(magazine);
        assertEquals("Max Values Magazine", magazine.getTitle());
        assertEquals(Integer.MAX_VALUE, magazine.getYearPublished());
        assertEquals(Integer.MAX_VALUE, magazine.getQuantity());
        assertEquals(Double.MAX_VALUE, magazine.getPrice(), 0);
        assertEquals("9999999999", magazine.getISBN());
        assertEquals("Max Publishers", magazine.getPublisher());
        assertEquals(Integer.MAX_VALUE, magazine.getIssueNumber());
    }

    @Test
    public void testBuildWithNullPublisher() {
        Magazine magazine = ((MagazineBuilder) new MagazineBuilder()
                .title("No Publisher Magazine")
                .yearPublished(2024)
                .quantity(10)
                .price(2.99)
                .ISBN("9876543210"))
                .publisher(null)
                .issueNumber(5)
                .build();

        assertNotNull(magazine);
        assertEquals("No Publisher Magazine", magazine.getTitle());
        assertEquals(2024, magazine.getYearPublished());
        assertEquals(10, magazine.getQuantity());
        assertEquals(2.99, magazine.getPrice(), 0);
        assertEquals("9876543210", magazine.getISBN());
        assertNull(magazine.getPublisher());
        assertEquals(5, magazine.getIssueNumber());
    }

    @Test
    public void testBuildWithZeroIssueNumber() {
        Magazine magazine = ((MagazineBuilder) new MagazineBuilder()
                .title("No Issue Number Magazine")
                .yearPublished(2025)
                .quantity(20)
                .price(1.99)
                .ISBN("9876543210"))
                .publisher("No Issue Number Publishers")
                .issueNumber(0)
                .build();

        assertNotNull(magazine);
        assertEquals("No Issue Number Magazine", magazine.getTitle());
        assertEquals(2025, magazine.getYearPublished());
        assertEquals(20, magazine.getQuantity());
        assertEquals(1.99, magazine.getPrice(), 0);
        assertEquals("9876543210", magazine.getISBN());
        assertEquals("No Issue Number Publishers", magazine.getPublisher());
        assertEquals(0, magazine.getIssueNumber());
    }

    @Test
    public void testBuildWithEmptyTitle() {
        Magazine magazine = ((MagazineBuilder) new MagazineBuilder()
                .title("")
                .yearPublished(2026)
                .quantity(15)
                .price(3.49)
                .ISBN("1234567890"))
                .publisher("Empty Title Publishers")
                .issueNumber(3)
                .build();

        assertNotNull(magazine);
        assertEquals("", magazine.getTitle());
        assertEquals(2026, magazine.getYearPublished());
        assertEquals(15, magazine.getQuantity());
        assertEquals(3.49, magazine.getPrice(), 0);
        assertEquals("1234567890", magazine.getISBN());
        assertEquals("Empty Title Publishers", magazine.getPublisher());
        assertEquals(3, magazine.getIssueNumber());
    }

    @Test
    public void testBuildWithNullTitle() {
        Magazine magazine = ((MagazineBuilder) new MagazineBuilder()
                .title(null)
                .yearPublished(2027)
                .quantity(25)
                .price(4.99)
                .ISBN("9876543210"))
                .publisher("Null Title Publishers")
                .issueNumber(7)
                .build();

        assertNotNull(magazine);
        assertNull(magazine.getTitle());
        assertEquals(2027, magazine.getYearPublished());
        assertEquals(25, magazine.getQuantity());
        assertEquals(4.99, magazine.getPrice(), 0);
        assertEquals("9876543210", magazine.getISBN());
        assertEquals("Null Title Publishers", magazine.getPublisher());
        assertEquals(7, magazine.getIssueNumber());
    }

    @Test
    public void testBuildWithNegativeIssueNumber() {
        Magazine magazine = ((MagazineBuilder) new MagazineBuilder()
                .title("Negative Issue Number Magazine")
                .yearPublished(2028)
                .quantity(30)
                .price(6.99)
                .ISBN("1234567890"))
                .publisher("Negative Issue Number Publishers")
                .issueNumber(-2)
                .build();

        assertNotNull(magazine);
        assertEquals("Negative Issue Number Magazine", magazine.getTitle());
        assertEquals(2028, magazine.getYearPublished());
        assertEquals(30, magazine.getQuantity());
        assertEquals(6.99, magazine.getPrice(), 0);
        assertEquals("1234567890", magazine.getISBN());
        assertEquals("Negative Issue Number Publishers", magazine.getPublisher());
        assertEquals(-2, magazine.getIssueNumber());
    }

    @Test
    public void testBuildWithNullISBN() {
        Magazine magazine = ((MagazineBuilder) new MagazineBuilder()
                .title("No ISBN Magazine")
                .yearPublished(2029)
                .quantity(35)
                .price(7.99)
                .ISBN(null))
                .publisher("No ISBN Publishers")
                .issueNumber(4)
                .build();

        assertNotNull(magazine);
        assertEquals("No ISBN Magazine", magazine.getTitle());
        assertEquals(2029, magazine.getYearPublished());
        assertEquals(35, magazine.getQuantity());
        assertEquals(7.99, magazine.getPrice(), 0);
        assertNull(magazine.getISBN());
        assertEquals("No ISBN Publishers", magazine.getPublisher());
        assertEquals(4, magazine.getIssueNumber());
    }
}
