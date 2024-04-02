package org.team4.unit.maintaindb;

import static org.junit.Assert.*;

import org.junit.*;
import org.team4.maintaindb.MaintainBooks;
import org.team4.maintaindb.MaintainCourse;
import org.team4.maintaindb.MaintainDVD;
import org.team4.maintaindb.MaintainDatabase;
import org.team4.maintaindb.MaintainMagazine;
import org.team4.maintaindb.MaintainNewsletter;
import org.team4.maintaindb.MaintainNotifications;
import org.team4.maintaindb.MaintainPurchase;
import org.team4.maintaindb.MaintainRent;
import org.team4.maintaindb.MaintainRequests;
import org.team4.maintaindb.MaintainStudent;
import org.team4.maintaindb.MaintainSubscriptions;
import org.team4.maintaindb.MaintainUser;

public class MaintainDatabaseTest {
	
	MaintainDatabase dbMain;
	MaintainUser userMain;
	MaintainBooks bookMain;
	MaintainDVD dvdMain;
	MaintainMagazine magMain;
	MaintainRent rentMain;
	MaintainStudent studentMain;
	MaintainCourse courseMain;
	MaintainPurchase purchaseMain;
	MaintainSubscriptions subMain;
	MaintainNotifications notifMain;
	MaintainRequests requestMain;
	MaintainNewsletter newsMain;
	
	@Before
	public void setUp() {
		dbMain = MaintainDatabase.getInstance();
		userMain = MaintainUser.getInstance();
		bookMain = MaintainBooks.getInstance();
		dvdMain = MaintainDVD.getInstance();
		magMain = MaintainMagazine.getInstance();
		rentMain = MaintainRent.getInstance();
		studentMain = MaintainStudent.getInstance();
		courseMain = MaintainCourse.getInstance();
		purchaseMain = MaintainPurchase.getInstance();
		subMain = MaintainSubscriptions.getInstance();
		notifMain = MaintainNotifications.getInstance();
		requestMain = MaintainRequests.getInstance();
		newsMain = MaintainNewsletter.getInstance();
	}
	
	@Test
	public void singletonUsers() {
		assertEquals(userMain, dbMain.getUserDatabase());
	}
	
	@Test
	public void singletonBooks() {
		assertEquals(bookMain, dbMain.getBookDatabase());
	}
	
	@Test
	public void singletonDVDs() {
		assertEquals(dvdMain, dbMain.getDVDDatabase());
	}
	
	@Test
	public void singletonMagazines() {
		assertEquals(magMain, dbMain.getMagazineDatabase());
	}
	
	@Test
	public void singletonRent() {
		assertEquals(rentMain, dbMain.getrenterDatabase());
	}
	
	@Test
	public void singletonStudent() {
		assertEquals(studentMain, dbMain.getStudentDatabase());
	}
	
	@Test
	public void singletonCourse() {
		assertEquals(courseMain, dbMain.getCourseDatabase());
	}
	
	@Test
	public void singletonPurchase() {
		assertEquals(purchaseMain, dbMain.getPurchaseDatabase());
	}
	
	@Test
	public void singletonSub() {
		assertEquals(subMain, dbMain.getSubscriptionDatabase());
	}
	
	@Test
	public void singletonNotif() {
		assertEquals(notifMain, dbMain.getNotificationDatabase());
	}
	
	@Test
	public void singletonRequest() {
		assertEquals(requestMain, dbMain.getRequestDatabase());
	}
	
	@Test
	public void singletonNews() {
		assertEquals(newsMain, dbMain.getNewsletterDatabase());
	}
	
	@Test
	public void update() throws Exception {
		dbMain.update();
	}

}