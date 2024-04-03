package org.team4.unit.maintaindb;

import static org.junit.Assert.*;

import org.junit.*;
import org.team4.maintaindb.MaintainNewsletter;
import org.team4.model.items.Newsletter;


public class MaintainNewsletterTest {
	
	MaintainNewsletter newsletterMaintainer;
	
	@Before
	public void setUp() {
		newsletterMaintainer = MaintainNewsletter.getInstance();
	}
	
	@Test
	public void testFirstNewsletter() {
		assertEquals("SHRM", newsletterMaintainer.getAllNewsletters().get(0).getTitle());
	}
	
	@Test
	public void testLastNewsletter() {
		assertEquals("CBC", newsletterMaintainer.getAllNewsletters().get(newsletterMaintainer.getAllNewsletters().size()-1).getTitle());
	}
	
	
	@Test
	public void testSearchExactNewsletterByTitle() {
		String titleToSearch = "Morning Brew";
		Newsletter searchedMagazine = newsletterMaintainer.searchNewslettersbyTitle(titleToSearch);
		assertEquals(titleToSearch, searchedMagazine.getTitle());
	}
	
	@Test
	public void newsletterNotFountByTitle() {
		String titleToSearch = "9785374532558";
		Newsletter searchedMagazine = newsletterMaintainer.searchNewslettersbyTitle(titleToSearch);
		assertNull(searchedMagazine);
	}
	
	@Test
	public void testSearchNewsletter() {
		assertEquals("Creator Science", newsletterMaintainer.searchNewsletters("Creator Science").get(0).getTitle());
	}
	
	@Test
	public void testSearchNotFound() {
		assertEquals(0,newsletterMaintainer.searchNewsletters("This newsletter does not exist").size());
	}
	
	@Test
	public void testAddNewsletter() throws Exception {
		Newsletter newNewsletter = new Newsletter("Test newsletter", "Test URL", 10.10);
		newsletterMaintainer.addNewsletter(newNewsletter);
		assertEquals("Test newsletter", newsletterMaintainer.searchNewslettersbyTitle("Test newsletter").getTitle());

		// Clean CSV
		newsletterMaintainer.getAllNewsletters().remove(newNewsletter);
		newsletterMaintainer.update();
	}

	@Test
	public void testAddDuplicateNewsletter() throws Exception {
		Newsletter newNewsletter = new Newsletter("Test newsletter", "Test URL", 10.10);
		newsletterMaintainer.addNewsletter(newNewsletter);
		newsletterMaintainer.addNewsletter(newNewsletter);
		assertEquals("Test newsletter", newsletterMaintainer.searchNewslettersbyTitle("Test newsletter").getTitle());

		// Clean CSV
		newsletterMaintainer.getAllNewsletters().remove(newNewsletter);
		newsletterMaintainer.update();
	}

	@Test
	public void removeTestNewsletter() throws Exception {
		Newsletter newNewsletter = new Newsletter("Test newsletter", "Test URL", 10.10);
		newsletterMaintainer.addNewsletter(newNewsletter);
		int numberOfDVDs = newsletterMaintainer.getAllNewsletters().size();
		newsletterMaintainer.getAllNewsletters().remove(numberOfDVDs-1);
		assertEquals(numberOfDVDs-1, newsletterMaintainer.getAllNewsletters().size());

		// Clean CSV
		newsletterMaintainer.getAllNewsletters().remove(newNewsletter);
		newsletterMaintainer.update();
	}

	@Test
	public void testUpdate() throws Exception {
		newsletterMaintainer.update();
		assertNull(newsletterMaintainer.searchNewslettersbyTitle("Test newsletter"));
	}

}