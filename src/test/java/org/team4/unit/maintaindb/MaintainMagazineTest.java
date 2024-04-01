package org.team4.unit.maintaindb;

import static org.junit.Assert.*;

import org.junit.*;
import org.team4.maintaindb.MaintainMagazine;
import org.team4.model.items.Item;
import org.team4.model.items.Magazine;
import org.team4.model.items.builder.MagazineBuilder;


public class MaintainMagazineTest {
	
	MaintainMagazine magazineMaintainer;
	
	@Before
	public void setUp() {
		magazineMaintainer = MaintainMagazine.getInstance();
	}
	
	@Test
	public void testFirstMagazine() {
		assertEquals("7123456789012", magazineMaintainer.getAllMagazines().get(0).getISBN());
	}
	
	@Test
	public void testDecreaseCopies() {
		Item itemToDecrease = magazineMaintainer.getAllMagazines().get(3);
		int newNumberOfCopies = itemToDecrease.getQuantity()-1;
		magazineMaintainer.decreaseNumberOfCopies(itemToDecrease);
		assertEquals(newNumberOfCopies, magazineMaintainer.getAllMagazines().get(3).getQuantity());
	}
	
	@Test
	public void testIncreaseCopies() {
		Item itemToDecrease = magazineMaintainer.getAllMagazines().get(3);
		int newNumberOfCopies = itemToDecrease.getQuantity()+1;
		magazineMaintainer.increaseNumberOfCopies(itemToDecrease);
		assertEquals(newNumberOfCopies, magazineMaintainer.getAllMagazines().get(3).getQuantity());
		
	}
	
	@Test
	public void testSearchExactMagazineByISBN() {
		String ISBNToSearch = "7123456789020";
		Magazine searchedMagazine = magazineMaintainer.searchExactMagazineByISBN(ISBNToSearch);
		assertEquals(ISBNToSearch, searchedMagazine.getISBN());
	}
	
	@Test
	public void magazineNotFountByISBN() {
		String ISBNToSearch = "9785374532558";
		Magazine searchedMagazine = magazineMaintainer.searchExactMagazineByISBN(ISBNToSearch);
		assertNull(searchedMagazine);
	}
	
	@Test
	public void testSearchMagazine() {
		assertEquals("7123456789017", magazineMaintainer.searchMagazines("Business Insider").get(0).getISBN());
	}
	
	@Test
	public void testSearchNotFound() {
		assertEquals(0,magazineMaintainer.searchMagazines("This magazine does not exist").size());
	}
	
	@Test
	public void testAddMagazine() {
		Magazine newBook = ((MagazineBuilder) new MagazineBuilder()
				.title("This is a test magazine")
                .yearPublished(2077)
                .price(123.45)
                .ISBN("1234567890123")
                .quantity(20))
                .publisher("Publisher")
                .build();
		magazineMaintainer.addMagazine(newBook);
		assertEquals("This is a test magazine", magazineMaintainer.searchExactMagazineByISBN("1234567890123").getTitle());

		// Clean CSV
		magazineMaintainer.getAllMagazines().remove(newBook);
		try {
			magazineMaintainer.update();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testAddDuplicateMagazine() {
		Magazine newBook = ((MagazineBuilder) new MagazineBuilder()
				.title("This is a test magazine")
                .yearPublished(2077)
                .price(123.45)
                .ISBN("1234567890123")
                .quantity(20))
                .publisher("Publisher")
                .build();

		magazineMaintainer.addMagazine(newBook);
		magazineMaintainer.addMagazine(newBook);
		assertEquals("This is a test magazine", magazineMaintainer.searchExactMagazineByISBN("1234567890123").getTitle());

		// Clean CSV
		magazineMaintainer.getAllMagazines().remove(newBook);
		try {
			magazineMaintainer.update();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void removeTestMagazine() {
		Magazine newBook = ((MagazineBuilder) new MagazineBuilder()
				.title("This is a test magazine")
                .yearPublished(2077)
                .price(123.45)
                .ISBN("1234567890123")
                .quantity(20))
                .publisher("Publisher")
                .build();

		magazineMaintainer.addMagazine(newBook);
		int numberOfDVDs = magazineMaintainer.getAllMagazines().size();
		magazineMaintainer.getAllMagazines().remove(numberOfDVDs-1);
		assertEquals(numberOfDVDs-1, magazineMaintainer.getAllMagazines().size());

		// Clean CSV
		magazineMaintainer.getAllMagazines().remove(newBook);
		try {
			magazineMaintainer.update();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testUpdate() {
		try {
			magazineMaintainer.update();
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertNull(magazineMaintainer.searchExactMagazineByISBN("1234567890123"));
	}

}