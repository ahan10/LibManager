package org.team4.unit.maintaindb;

import static org.junit.Assert.*;

import org.junit.*;
import org.team4.functionality.subscriptions.SubscribeNewsletter;
import org.team4.maintaindb.MaintainSubscriptions;

public class MaintainSubscriptionsTest {

	
	MaintainSubscriptions subMaintainer;
	
	@Before
	public void setUp() {
		subMaintainer = MaintainSubscriptions.getInstance();
	}
	
	@Test
	public void numberOfSubscriptions() {
		assertEquals(6,subMaintainer.newsletters.size());
	}
	
	@Test
	public void add() throws Exception {
		SubscribeNewsletter testLetter = new SubscribeNewsletter("Test newsletter", "Test email");
		subMaintainer.add(testLetter);
		assertEquals(7,subMaintainer.newsletters.size());
		subMaintainer.newsletters.remove(subMaintainer.newsletters.size()-1);
		subMaintainer.update();
	}
	
	@Test
	public void remove() {
		SubscribeNewsletter testLetter = new SubscribeNewsletter("Test newsletter", "Test email");
		subMaintainer.add(testLetter);
		subMaintainer.removeNewsletter(testLetter);
		assertEquals(6,subMaintainer.newsletters.size());
	}
	
	@Test
	public void getSubListNoUser() {
		assertEquals(0,subMaintainer.getAllSubscribedNewslettersTitlesByEmail("test").size());
	}
	
	@Test
	public void getSubList() {
		assertEquals(6,subMaintainer.getAllSubscribedNewslettersTitlesByEmail("1").size());
	}
	
	@Test
	public void getSubNoUserExist() {
		assertNull(subMaintainer.getSubscribedNewsletterIfExists("2", "Test"));
	}
	
	@Test
	public void getSubNoNewsExist() {
		assertNull(subMaintainer.getSubscribedNewsletterIfExists("1", "Test"));
	}
	
	@Test
	public void getSub() {
		assertEquals(subMaintainer.newsletters.get(1),subMaintainer.getSubscribedNewsletterIfExists("1", "The Hustle"));
	}
}