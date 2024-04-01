package org.team4.unit.model.items.builder;

import org.junit.Test;
import org.team4.model.items.DVD;
import org.team4.model.items.builder.DVDBuilder;

import static org.junit.Assert.*;

public class DVDBuilderTest {

    @Test
    public void testBuildWithAllFieldsSet() {
        DVD dvd = ((DVDBuilder) new DVDBuilder()
                .title("Interstellar")
                .yearPublished(2014)
                .quantity(10)
                .price(19.99)
                .ISBN("978009956043"))
                .genre("Science Fiction")
                .duration(169.0)
                .build();

        assertNotNull(dvd);
        assertEquals("Interstellar", dvd.getTitle());
        assertEquals(2014, dvd.getYearPublished());
        assertEquals(10, dvd.getQuantity());
        assertEquals(19.99, dvd.getPrice(), 0);
        assertEquals("978009956043", dvd.getISBN());
        assertEquals("Science Fiction", dvd.getGenre());
        assertEquals(169.0, dvd.getDuration(), 0);
    }

    @Test
    public void testBuildWithNullFields() {
        DVD dvd = ((DVDBuilder) new DVDBuilder()
                .title(null)
                .yearPublished(0)
                .quantity(0)
                .price(0)
                .ISBN(null))
                .genre(null)
                .duration(0)
                .build();

        assertNotNull(dvd);
        assertNull(dvd.getTitle());
        assertEquals(0, dvd.getYearPublished());
        assertEquals(0, dvd.getQuantity());
        assertEquals(0, dvd.getPrice(), 0);
        assertNull(dvd.getISBN());
        assertNull(dvd.getGenre());
        assertEquals(0, dvd.getDuration(), 0);
    }

    @Test
    public void testBuildWithNegativeValues() {
        DVD dvd = ((DVDBuilder) new DVDBuilder()
                .title("Inception")
                .yearPublished(-2010)
                .quantity(-5)
                .price(-15.99)
                .ISBN("9780486480489"))
                .genre("Thriller")
                .duration(-148.0)
                .build();

        assertNotNull(dvd);
        assertEquals("Inception", dvd.getTitle());
        assertEquals(-2010, dvd.getYearPublished());
        assertEquals(-5, dvd.getQuantity());
        assertEquals(-15.99, dvd.getPrice(), 0);
        assertEquals("9780486480489", dvd.getISBN());
        assertEquals("Thriller", dvd.getGenre());
        assertEquals(-148.0, dvd.getDuration(), 0);
    }

    @Test
    public void testBuildWithMaxValues() {
        DVD dvd = ((DVDBuilder) new DVDBuilder()
                .title("Avatar")
                .yearPublished(Integer.MAX_VALUE)
                .quantity(Integer.MAX_VALUE)
                .price(Double.MAX_VALUE)
                .ISBN("9780802141328"))
                .genre("Action")
                .duration(Double.MAX_VALUE)
                .build();

        assertNotNull(dvd);
        assertEquals("Avatar", dvd.getTitle());
        assertEquals(Integer.MAX_VALUE, dvd.getYearPublished());
        assertEquals(Integer.MAX_VALUE, dvd.getQuantity());
        assertEquals(Double.MAX_VALUE, dvd.getPrice(), 0);
        assertEquals("9780802141328", dvd.getISBN());
        assertEquals("Action", dvd.getGenre());
        assertEquals(Double.MAX_VALUE, dvd.getDuration(), 0);
    }

    @Test
    public void testBuildWithNullGenreAndDuration() {
        DVD dvd = ((DVDBuilder) new DVDBuilder()
                .title("The Dark Knight")
                .yearPublished(2008)
                .quantity(5)
                .price(14.99)
                .ISBN("9781848563651"))
                .genre(null)
                .duration(0)
                .build();

        assertNotNull(dvd);
        assertEquals("The Dark Knight", dvd.getTitle());
        assertEquals(2008, dvd.getYearPublished());
        assertEquals(5, dvd.getQuantity());
        assertEquals(14.99, dvd.getPrice(), 0);
        assertEquals("9781848563651", dvd.getISBN());
        assertNull(dvd.getGenre());
        assertEquals(0, dvd.getDuration(), 0);
    }

    @Test
    public void testBuildWithNullISBN() {
        DVD dvd = ((DVDBuilder) new DVDBuilder()
                .title("The Matrix")
                .yearPublished(1999)
                .quantity(15)
                .price(9.99)
                .ISBN(null))
                .genre("Sci-Fi")
                .duration(136.0)
                .build();

        assertNotNull(dvd);
        assertEquals("The Matrix", dvd.getTitle());
        assertEquals(1999, dvd.getYearPublished());
        assertEquals(15, dvd.getQuantity());
        assertEquals(9.99, dvd.getPrice(), 0);
        assertNull(dvd.getISBN());
        assertEquals("Sci-Fi", dvd.getGenre());
        assertEquals(136.0, dvd.getDuration(), 0);
    }

    @Test
    public void testBuildWithNullTitle() {
        DVD dvd = ((DVDBuilder) new DVDBuilder()
                .title(null)
                .yearPublished(0)
                .quantity(0)
                .price(0)
                .ISBN("9780802141328"))
                .genre("Action")
                .duration(124.0)
                .build();

        assertNotNull(dvd);
        assertNull(dvd.getTitle());
        assertEquals(0, dvd.getYearPublished());
        assertEquals(0, dvd.getQuantity());
        assertEquals(0, dvd.getPrice(), 0);
        assertEquals("9780802141328", dvd.getISBN());
        assertEquals("Action", dvd.getGenre());
        assertEquals(124.0, dvd.getDuration(), 0);
    }

    @Test
    public void testBuildWithEmptyTitle() {
        DVD dvd = ((DVDBuilder) new DVDBuilder()
                .title("")
                .yearPublished(2000)
                .quantity(10)
                .price(19.99)
                .ISBN("9780802141328"))
                .genre("Action")
                .duration(146.0)
                .build();

        assertNotNull(dvd);
        assertEquals("", dvd.getTitle());
        assertEquals(2000, dvd.getYearPublished());
        assertEquals(10, dvd.getQuantity());
        assertEquals(19.99, dvd.getPrice(), 0);
        assertEquals("9780802141328", dvd.getISBN());
        assertEquals("Action", dvd.getGenre());
        assertEquals(146.0, dvd.getDuration(), 0);
    }

    @Test
    public void testBuildWithZeroDuration() {
        DVD dvd = ((DVDBuilder) new DVDBuilder()
                .title("Pulp Fiction")
                .yearPublished(1994)
                .quantity(20)
                .price(12.99)
                .ISBN("9780802141328"))
                .genre("Crime")
                .duration(0)
                .build();

        assertNotNull(dvd);
        assertEquals("Pulp Fiction", dvd.getTitle());
        assertEquals(1994, dvd.getYearPublished());
        assertEquals(20, dvd.getQuantity());
        assertEquals(12.99, dvd.getPrice(), 0);
        assertEquals("9780802141328", dvd.getISBN());
        assertEquals("Crime", dvd.getGenre());
        assertEquals(0, dvd.getDuration(), 0);
    }
    
    @Test
    public void testBuildWithNegativeDuration() {
        DVD dvd = ((DVDBuilder) new DVDBuilder()
                .title("The Godfather")
                .yearPublished(1972)
                .quantity(5)
                .price(9.99)
                .ISBN("9780802141328"))
                .genre("Crime")
                .duration(-175.0)
                .build();

        assertNotNull(dvd);
        assertEquals("The Godfather", dvd.getTitle());
        assertEquals(1972, dvd.getYearPublished());
        assertEquals(5, dvd.getQuantity());
        assertEquals(9.99, dvd.getPrice(), 0);
        assertEquals("9780802141328", dvd.getISBN());
        assertEquals("Crime", dvd.getGenre());
        assertEquals(-175.0, dvd.getDuration(), 0);
    }
}
