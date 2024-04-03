package org.team4.unit.maintaindb;

import static org.junit.Assert.*;

import org.junit.*;
import org.team4.maintaindb.MaintainNotifications;

public class MaintainNotificationsTest {
	
	MaintainNotifications notificationMaintainer;
	
	@Before
	public void setUp() {
		notificationMaintainer = MaintainNotifications.getInstance();
	}
	
	@Test
	public void newNotification() {
		String testNotif = "This is a test.@@@@test1@test.com";
		notificationMaintainer.getNotifications().add(testNotif);
		assertEquals(1,notificationMaintainer.getNotifications().size());
		notificationMaintainer.getNotifications().clear();
	}
	
	@Test
	public void updateNotification() throws Exception {
		String testNotif = "This is a test.@@@@test1@test.com";
		notificationMaintainer.getNotifications().add(testNotif);
		notificationMaintainer.update();
		assertEquals(1,notificationMaintainer.getNotifications().size());
		notificationMaintainer.getNotifications().clear();
		notificationMaintainer.update();
	}
	
	@Test
	public void updateMultipleNotification() throws Exception {
		String testNotif = "This is a test.@@@@test1@test.com";
		String testNotif2 = "This is a test.@@@@test2@test.com";
		notificationMaintainer.getNotifications().add(testNotif);
		notificationMaintainer.getNotifications().add(testNotif2);
		notificationMaintainer.update();
		assertEquals(2,notificationMaintainer.getNotifications().size());
		notificationMaintainer.getNotifications().clear();
		notificationMaintainer.update();
	}
	
	@Test
	public void loadNotification() throws Exception {
		String testNotif = "This is a test.@@@@test1@test.com";
		notificationMaintainer.getNotifications().add(testNotif);
		notificationMaintainer.update();
		notificationMaintainer.getNotifications().clear();
		notificationMaintainer.load();
		assertEquals(1,notificationMaintainer.getNotifications().size());
		notificationMaintainer.getNotifications().clear();
		notificationMaintainer.update();
	}
	
	@Test
	public void loadMultipleNotification() throws Exception {
		String testNotif = "This is a test.@@@@test1@test.com";
		String testNotif2 = "This is a test.@@@@test1@test.com";
		notificationMaintainer.getNotifications().add(testNotif);
		notificationMaintainer.getNotifications().add(testNotif2);
		notificationMaintainer.update();
		notificationMaintainer.getNotifications().clear();
		notificationMaintainer.load();
		assertEquals(2,notificationMaintainer.getNotifications().size());
		notificationMaintainer.getNotifications().remove(testNotif);
		notificationMaintainer.getNotifications().remove(testNotif2);
		notificationMaintainer.update();
	}
	
	@Test
	public void readNotificationMessage() {
		String testNotif = "This is a test.@@@@test1@test.com";
		notificationMaintainer.getNotifications().add(testNotif);
		String[] displayString = notificationMaintainer.getNotifications().get(0).split("@@@@");
		notificationMaintainer.getNotifications().remove(testNotif);
		assertEquals("This is a test.", displayString[0]);
	}
	
	@Test
	public void readNotificationSubmitter() {
		String testNotif = "This is a test.@@@@test1@test.com";
		notificationMaintainer.getNotifications().add(testNotif);
		String[] displayString = notificationMaintainer.getNotifications().get(0).split("@@@@");
		notificationMaintainer.getNotifications().remove(testNotif);
		assertEquals("test1@test.com", displayString[1]);
	}
	
	@Test
	public void addMultipleNotifs() {
		String testNotif = "This is a test.@@@@test1@test.com";
		String testNotif2 = "This is a test.@@@@test2@test.com";
		notificationMaintainer.getNotifications().add(testNotif);
		notificationMaintainer.getNotifications().add(testNotif2);
		String[] displayString = notificationMaintainer.getNotifications().get(0).split("@@@@");
		String[] displayString2 = notificationMaintainer.getNotifications().get(1).split("@@@@");
		notificationMaintainer.getNotifications().remove(testNotif);
		notificationMaintainer.getNotifications().remove(testNotif2);
		assertEquals(displayString2[0], displayString[0]);
	}
	
	@Test
	public void readNotificationMessage2() {
		String testNotif = "This is another test.@@@@test2@test.com";
		notificationMaintainer.getNotifications().add(testNotif);
		String[] displayString = notificationMaintainer.getNotifications().get(0).split("@@@@");
		notificationMaintainer.getNotifications().remove(testNotif);
		assertEquals("This is another test.", displayString[0]);
	}
	
	@Test
	public void readNotificationSubmitter2() {
		String testNotif = "This is another test.@@@@test2@test.com";
		notificationMaintainer.getNotifications().add(testNotif);
		String[] displayString = notificationMaintainer.getNotifications().get(0).split("@@@@");
		notificationMaintainer.getNotifications().remove(testNotif);
		assertEquals("test2@test.com", displayString[1]);
	}

}