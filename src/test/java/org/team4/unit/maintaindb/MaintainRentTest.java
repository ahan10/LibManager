package org.team4.unit.maintaindb;

import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.*;
import org.team4.maintaindb.MaintainRent;
import org.team4.model.items.RentedItem;

public class MaintainRentTest {
	
	MaintainRent rentMaintainer;
	
	@Before
	public void setUp() {
		rentMaintainer = MaintainRent.getInstance();
	}
	
	@Test
	public void getRenters() {
		assertTrue(rentMaintainer.getAllRenters().isEmpty());
	}
	
	@Test
	public void newRenter() {
		rentMaintainer.addNewRentedItem("test@test.com", "Test Rent", "1234567890123", new Date(0), new Date(100));
		assertFalse(rentMaintainer.getAllRenters().isEmpty());
		rentMaintainer.getAllRenters().clear();
	}
	
	@Test
	public void isRentedByUser() {
		RentedItem rentTest = new RentedItem("Test Rent", "1234567890123", new Date(0), new Date(100));
		rentMaintainer.addNewRentedItem("test@test.com", rentTest.getTitle(), rentTest.getISBN(), new Date(0), new Date(100));
		assertTrue(rentMaintainer.isAlreadyRentedByUser("test@test.com", rentTest));
		rentMaintainer.getAllRenters().clear();
	}
	
	@Test
	public void returnItem() {
		RentedItem rentTest = new RentedItem("Test Rent", "1234567890123", new Date(0), new Date(100));
		rentMaintainer.addNewRentedItem("test@test.com", rentTest.getTitle(), rentTest.getISBN(), new Date(0), new Date(100));
		assertTrue(rentMaintainer.returnRentedItem("test@test.com", "1234567890123"));
		rentMaintainer.getAllRenters().clear();
	}
	
	@Test
	public void numberOfItemsRented() {
		rentMaintainer.addNewRentedItem("test@test.com", "Test Rent 1", "1234567890123", new Date(0), new Date(100));
		rentMaintainer.addNewRentedItem("test2@test.com", "Test Rent 2", "1234567890123", new Date(0), new Date(100));
		rentMaintainer.addNewRentedItem("test@test.com", "Test Rent 3", "1234567890123", new Date(0), new Date(100));
		rentMaintainer.addNewRentedItem("test3@test.com", "Test Rent 4", "1234567890123", new Date(0), new Date(100));
		assertEquals(2, rentMaintainer.getNumberOfItemsRentedByUser("test@test.com"));
		rentMaintainer.getAllRenters().clear();
	}
	
	@Test
	public void countAfterReturn() {
		rentMaintainer.addNewRentedItem("test@test.com", "Test Rent 1", "1234567890123", new Date(0), new Date(100));
		rentMaintainer.addNewRentedItem("test@test.com", "Test Rent 2", "1234567890124", new Date(0), new Date(100));
		rentMaintainer.returnRentedItem("test@test.com", "1234567890123");
		assertEquals(1, rentMaintainer.getNumberOfItemsRentedByUser("test@test.com"));
		rentMaintainer.getAllRenters().clear();
	}
	
	@Test
	public void update() throws Exception {
		rentMaintainer.addNewRentedItem("test@test.com", "Test Rent 1", "1234567890123", new Date(0), new Date(100));
		rentMaintainer.addNewRentedItem("test2@test.com", "Test Rent 2", "1234567890123", new Date(0), new Date(100));
		rentMaintainer.update();
		rentMaintainer.getAllRenters().clear();
		rentMaintainer.update();
		assertTrue(rentMaintainer.getAllRenters().isEmpty());
		
	}
	
	@Test
	public void load() throws Exception {
		rentMaintainer.addNewRentedItem("test@test.com", "Test Rent 1", "1234567890123", new Date(0), new Date(100));
		rentMaintainer.addNewRentedItem("test2@test.com", "Test Rent 2", "1234567890123", new Date(0), new Date(100));
		rentMaintainer.update();
		rentMaintainer.getAllRenters().clear();
		rentMaintainer.load();
		assertEquals(1, rentMaintainer.getNumberOfItemsRentedByUser("test@test.com"));
		rentMaintainer.getAllRenters().clear();
		rentMaintainer.update();
	}
	
	@Test
	public void emptyNumberOfItems() {
		assertEquals(0, rentMaintainer.getNumberOfItemsRentedByUser("Test"));
	}
	
	@Test
	public void emptyAlreadyRented() {
		assertFalse(rentMaintainer.isAlreadyRentedByUser("Test", new RentedItem(null, null, null, null)));
	}
	
	@Test
	public void notRentedByUser() {
		rentMaintainer.addNewRentedItem("test@test.com", "Test Rent 1", "1234567890123", new Date(0), new Date(100));
		assertFalse(rentMaintainer.isAlreadyRentedByUser("test@test.com", new RentedItem(null, null, null, null)));
		rentMaintainer.getAllRenters().clear();
	}
	
	@Test
	public void returnItemNoUser() {
		assertFalse(rentMaintainer.returnRentedItem("Test", "219732193"));
	}
	
	@Test
	public void returnItemNotRented() {
		rentMaintainer.addNewRentedItem("test@test.com", "Test Rent 1", "1234567890123", new Date(0), new Date(100));
		assertFalse(rentMaintainer.returnRentedItem("test@test.com", "219737293078"));
		rentMaintainer.getAllRenters().clear();
	}

}