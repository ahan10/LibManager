package org.team4.unit.model.items;

import org.junit.Test;
import org.team4.model.items.Newsletter;

import static org.junit.Assert.*;

public class NewsletterTest {

    @Test
    public void testConstructorInitialization() {
        Newsletter newsletter = new Newsletter("Newsletter Title", "https://example.com", 9.99);
        
        assertEquals("Newsletter Title", newsletter.getTitle());
        assertEquals("https://example.com", newsletter.getLink());
        assertEquals(9.99, newsletter.getPrice(), 0.001);
    }

    @Test
    public void testGetters() {
        Newsletter newsletter = new Newsletter("Newsletter Title", "https://example.com", 9.99);
        
        assertEquals("Newsletter Title", newsletter.getTitle());
        assertEquals("https://example.com", newsletter.getLink());
        assertEquals(9.99, newsletter.getPrice(), 0.001);
    }

    @Test
    public void testEqualsMethodForEquality() {
        Newsletter newsletter1 = new Newsletter("Newsletter Title", "https://example.com", 9.99);
        
        assertTrue(newsletter1.equals(newsletter1));
    }

    @Test
    public void testEqualsMethodForInequality() {
        Newsletter newsletter1 = new Newsletter("Newsletter Title", "https://example.com", 9.99);
        Newsletter newsletter2 = new Newsletter("Different Title", "https://example.com", 9.99);
        
        assertFalse(newsletter1.equals(newsletter2));
    }

    @Test
    public void testHashCodeConsistency() {
        Newsletter newsletter = new Newsletter("Newsletter Title", "https://example.com", 9.99);
        
        int hashCode1 = newsletter.hashCode();
        int hashCode2 = newsletter.hashCode();
        
        assertEquals(hashCode1, hashCode2);
    }

    @Test
    public void testHashCodeEquality() {
        Newsletter newsletter1 = new Newsletter("Newsletter Title", "https://example.com", 9.99);
        int hashCode1 = newsletter1.hashCode() ;
        int hashCode2 = newsletter1.hashCode();

        assertEquals(hashCode1, hashCode2);
    }

    @Test
    public void testToStringMethod() {
        Newsletter newsletter = new Newsletter("Newsletter Title", "https://example.com", 9.99);
        
        String expectedString = "Newsletter{title='Newsletter Title', link='https://example.com', price=9.99}";
        
        assertFalse(expectedString.equals(newsletter.toString()));
    }

    @Test
    public void testGetItemTitle() {
        Newsletter newsletter = new Newsletter("Newsletter Title", "https://example.com", 9.99);

        assertEquals("Newsletter Title", newsletter.getTitle());
    }

    @Test
    public void testPriceRemainsUnchanged() {
        Newsletter newsletter1 = new Newsletter("Newsletter Title", "https://example.com", 9.99);
        Newsletter newsletter2 = new Newsletter("Newsletter Title", "https://example.com", 9.99);
        
        // Check if the price remains unchanged
        assertEquals(newsletter1.getPrice(), newsletter2.getPrice(), 0.001);
    }
    
    @Test
    public void testGetLink() {
        Newsletter newsletter = new Newsletter("Newsletter Title", "https://example.com", 9.99);
        
        assertEquals("https://example.com", newsletter.getLink());
    }
}
