package org.team4.unit.maintaindb;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.junit.*;
import org.team4.functionality.buy.ItemPurchased;
import org.team4.maintaindb.MaintainPurchase;

public class MaintainPurchaseTest {
	
	MaintainPurchase purchaseMaintainer;
	SimpleDateFormat formatter;
	
	@Before
	public void setUp() {
		purchaseMaintainer = MaintainPurchase.getInstance();
		formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
	}
	
	@Test
	public void newPurchase() throws Exception {
		ItemPurchased item = new ItemPurchased("Test Purchase", "test@test.com", new Date());
		purchaseMaintainer.add(item);
		assertFalse(purchaseMaintainer.getAllItemsPurchased().isEmpty());
		purchaseMaintainer.getAllItemsPurchased().clear();
		purchaseMaintainer.update();
	}
	
	@Test
	public void newMultiplePurchase() throws Exception {
		ItemPurchased item = new ItemPurchased("Test Purchase", "test@test.com", new Date());
		ItemPurchased item2 = new ItemPurchased("Test Purchase2", "test@test.com", new Date());
		purchaseMaintainer.add(item);
		purchaseMaintainer.add(item2);
		assertEquals(2, purchaseMaintainer.getAllItemsPurchased().size());
		purchaseMaintainer.getAllItemsPurchased().clear();
		purchaseMaintainer.update();
	}
	
	@Test
	public void newMultiplePurchaseEmail() throws Exception {
		ItemPurchased item = new ItemPurchased("Test Purchase", "test@test.com", new Date());
		ItemPurchased item2 = new ItemPurchased("Test Purchase2", "test@test.com", new Date());
		purchaseMaintainer.add(item);
		purchaseMaintainer.add(item2);
		assertEquals("test@test.com", purchaseMaintainer.getAllItemsPurchased().get(1).getEmail());
		purchaseMaintainer.getAllItemsPurchased().clear();
		purchaseMaintainer.update();
	}
	
	@Test
	public void newMultiplePurchaseTitle() throws Exception {
		ItemPurchased item = new ItemPurchased("Test Purchase", "test@test.com", new Date());
		ItemPurchased item2 = new ItemPurchased("Test Purchase2", "test@test.com", new Date());
		purchaseMaintainer.add(item);
		purchaseMaintainer.add(item2);
		assertEquals("Test Purchase2", purchaseMaintainer.getAllItemsPurchased().get(1).getTitle());
		purchaseMaintainer.getAllItemsPurchased().clear();
		purchaseMaintainer.update();
	}
	
	@Test
	public void newMultiplePurchaseDate() throws Exception {
		ItemPurchased item = new ItemPurchased("Test Purchase", "test@test.com", new Date());
		ItemPurchased item2 = new ItemPurchased("Test Purchase2", "test@test.com", new Date());
		purchaseMaintainer.add(item);
		purchaseMaintainer.add(item2);
		assertEquals(0, purchaseMaintainer.getAllItemsPurchased().get(1).getDatePurchased().compareTo((purchaseMaintainer.getAllItemsPurchased().get(0).getDatePurchased())));
		purchaseMaintainer.getAllItemsPurchased().clear();
		purchaseMaintainer.update();
	}
	
	@Test
	public void newPurchaseEmail() throws Exception {
		ItemPurchased item = new ItemPurchased("Test Purchase", "test@test.com", new Date());
		purchaseMaintainer.add(item);
		assertEquals("test@test.com",purchaseMaintainer.getAllItemsPurchased().get(0).getEmail());
		purchaseMaintainer.getAllItemsPurchased().clear();
		purchaseMaintainer.update();
	}
	
	@Test
	public void newPurchaseTitle() throws Exception {
		ItemPurchased item = new ItemPurchased("Test Purchase", "test@test.com", new Date());
		purchaseMaintainer.add(item);
		assertEquals("Test Purchase",purchaseMaintainer.getAllItemsPurchased().get(0).getTitle());
		purchaseMaintainer.getAllItemsPurchased().clear();
		purchaseMaintainer.update();
	}
	
	@Test
	public void newPurchaseDate() throws Exception {
		Date date = new Date();
		ItemPurchased item = new ItemPurchased("Test Purchase", "test@test.com", date);
		purchaseMaintainer.add(item);
		assertEquals(formatter.format(date), formatter.format(purchaseMaintainer.getAllItemsPurchased().get(0).getDatePurchased()));
		purchaseMaintainer.getAllItemsPurchased().clear();
		purchaseMaintainer.update();
	}
	
	@Test
	public void testUpdate() throws Exception {
		ItemPurchased item = new ItemPurchased("Test Purchase", "test@test.com", new Date());
		purchaseMaintainer.add(item);
		purchaseMaintainer.update();
		purchaseMaintainer.getAllItemsPurchased().clear();
		purchaseMaintainer.update();
		assertTrue(purchaseMaintainer.getAllItemsPurchased().isEmpty());
	}
	
	@Test
	public void testLoad() throws Exception {
		ItemPurchased item = new ItemPurchased("Test Purchase", "test@test.com", new Date());
		purchaseMaintainer.add(item);
		purchaseMaintainer.update();
		purchaseMaintainer.getAllItemsPurchased().clear();
		purchaseMaintainer.load();
		assertFalse(purchaseMaintainer.getAllItemsPurchased().isEmpty());
		purchaseMaintainer.getAllItemsPurchased().clear();
		purchaseMaintainer.update();
	}

}