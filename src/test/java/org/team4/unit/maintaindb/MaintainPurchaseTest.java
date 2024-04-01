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
	public void newPurchase() {
		ItemPurchased item = new ItemPurchased("Test Purchase", "test@test.com", new Date());
		purchaseMaintainer.add(item);
		assertFalse(purchaseMaintainer.getAllItemsPurchased().isEmpty());
		purchaseMaintainer.getAllItemsPurchased().remove(item);
	}
	
	@Test
	public void newPurchaseEmail() {
		ItemPurchased item = new ItemPurchased("Test Purchase", "test@test.com", new Date());
		purchaseMaintainer.add(item);
		assertEquals("test@test.com",purchaseMaintainer.getAllItemsPurchased().get(0).getEmail());
		purchaseMaintainer.getAllItemsPurchased().remove(item);
	}
	
	@Test
	public void newPurchaseTitle() {
		ItemPurchased item = new ItemPurchased("Test Purchase", "test@test.com", new Date());
		purchaseMaintainer.add(item);
		assertEquals("Test Purchase",purchaseMaintainer.getAllItemsPurchased().get(0).getTitle());
		purchaseMaintainer.getAllItemsPurchased().remove(item);
	}
	
	@Test
	public void newPurchaseDate() {
		Date date = new Date();
		ItemPurchased item = new ItemPurchased("Test Purchase", "test@test.com", date);
		purchaseMaintainer.add(item);
		assertEquals(formatter.format(date), formatter.format(purchaseMaintainer.getAllItemsPurchased().get(0).getDatePurchased()));
		purchaseMaintainer.getAllItemsPurchased().remove(item);
	}
	
	@Test
	public void testUpdate() throws Exception {
		ItemPurchased item = new ItemPurchased("Test Purchase", "test@test.com", new Date());
		purchaseMaintainer.add(item);
		purchaseMaintainer.update();
		purchaseMaintainer.getAllItemsPurchased().remove(item);
		purchaseMaintainer.update();
		assertTrue(purchaseMaintainer.getAllItemsPurchased().isEmpty());
	}
	
	@Test
	public void testLoad() throws Exception {
		ItemPurchased item = new ItemPurchased("Test Purchase", "test@test.com", new Date());
		purchaseMaintainer.add(item);
		purchaseMaintainer.update();
		purchaseMaintainer.getAllItemsPurchased().remove(item);
		purchaseMaintainer.load();
		assertFalse(purchaseMaintainer.getAllItemsPurchased().isEmpty());
		purchaseMaintainer.getAllItemsPurchased().remove(0);
		purchaseMaintainer.update();
	}

}