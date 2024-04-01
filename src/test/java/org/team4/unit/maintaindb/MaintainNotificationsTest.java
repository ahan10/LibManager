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
		notificationMaintainer.getNotifications().remove(testNotif);
	}
	
	@Test
	public void updateNotification() {
		String testNotif = "This is a test.@@@@test1@test.com";
		notificationMaintainer.getNotifications().add(testNotif);
		try {
			notificationMaintainer.update();
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(1,notificationMaintainer.getNotifications().size());
		notificationMaintainer.getNotifications().remove(testNotif);
		try {
			notificationMaintainer.update();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void loadNotification() {
		String testNotif = "This is a test.@@@@test1@test.com";
		notificationMaintainer.getNotifications().add(testNotif);
		try {
			notificationMaintainer.update();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			notificationMaintainer.load();
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(1,notificationMaintainer.getNotifications().size());
		notificationMaintainer.getNotifications().remove(testNotif);
		try {
			notificationMaintainer.update();
		} catch (Exception e) {
			e.printStackTrace();
		}
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

}