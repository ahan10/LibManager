package org.team4.unit.maintaindb;

import static org.junit.Assert.*;

import org.junit.*;
import org.team4.maintaindb.MaintainDVD;
import org.team4.model.items.DVD;
import org.team4.model.items.Item;
import org.team4.model.items.builder.DVDBuilder;


public class MaintainDVDTest {
	
	MaintainDVD dvdMaintainer;
	
	@Before
	public void setUp() {
		dvdMaintainer = MaintainDVD.getInstance();
	}
	
	@Test
	public void testFirstDVD() {
		assertEquals("8492012345678", dvdMaintainer.getAllDVDs().get(0).getISBN());
	}
	
	@Test
	public void testDecreaseCopies() {
		Item itemToDecrease = dvdMaintainer.getAllDVDs().get(3);
		int newNumberOfCopies = itemToDecrease.getQuantity()-1;
		dvdMaintainer.decreaseNumberOfCopies(itemToDecrease);
		assertEquals(newNumberOfCopies, dvdMaintainer.getAllDVDs().get(3).getQuantity());
	}
	
	@Test
	public void testIncreaseCopies() {
		Item itemToDecrease = dvdMaintainer.getAllDVDs().get(3);
		int newNumberOfCopies = itemToDecrease.getQuantity()+1;
		dvdMaintainer.increaseNumberOfCopies(itemToDecrease);
		assertEquals(newNumberOfCopies, dvdMaintainer.getAllDVDs().get(3).getQuantity());
		
	}
	
	@Test
	public void testSearchExactDVDByISBN() {
		String ISBNToSearch = "8492012345679";
		DVD searchedDVD = dvdMaintainer.searchExactDVDByISBN(ISBNToSearch);
		assertEquals(ISBNToSearch, searchedDVD.getISBN());
	}
	
	@Test
	public void dvdNotFountByISBN() {
		String ISBNToSearch = "9785374532558";
		DVD searchedDVD = dvdMaintainer.searchExactDVDByISBN(ISBNToSearch);
		assertNull(searchedDVD);
	}
	
	@Test
	public void testSearchDVD() {
		assertEquals("8492012345684", dvdMaintainer.searchDVDs("Fight Club").get(0).getISBN());
	}
	
	@Test
	public void testSearchNotFound() {
		assertEquals(0,dvdMaintainer.searchDVDs("This book does not exist").size());
	}
	
	@Test
	public void testAddDVD() throws Exception {
		DVD newBook = ((DVDBuilder) new DVDBuilder()
                .title("This is a test dvd")
                .yearPublished(2077)
                .price(123.45)
                .ISBN("1234567890123")
                .quantity(20))
                .genre("Genre")
                .build();
		
		dvdMaintainer.addDVD(newBook);
		assertEquals("This is a test dvd", dvdMaintainer.searchExactDVDByISBN("1234567890123").getTitle());

		// Clean CSV
		dvdMaintainer.getAllDVDs().remove(newBook);
		dvdMaintainer.update();
	}

	@Test
	public void testAddDuplicateDVD() throws Exception {
		DVD newBook = ((DVDBuilder) new DVDBuilder()
                .title("This is a test dvd")
                .yearPublished(2077)
                .price(123.45)
                .ISBN("1234567890123")
                .quantity(20))
                .genre("Genre")
                .build();

		dvdMaintainer.addDVD(newBook);
		dvdMaintainer.addDVD(newBook);
		assertEquals("This is a test dvd", dvdMaintainer.searchExactDVDByISBN("1234567890123").getTitle());

		// Clean CSV
		dvdMaintainer.getAllDVDs().remove(newBook);
		dvdMaintainer.update();
	}

	@Test
	public void removeTestDVD() throws Exception {
		DVD newBook = ((DVDBuilder) new DVDBuilder()
                .title("This is a test dvd")
                .yearPublished(2077)
                .price(123.45)
                .ISBN("1234567890123")
                .quantity(20))
                .genre("Genre")
                .build();

		dvdMaintainer.addDVD(newBook);
		int numberOfDVDs = dvdMaintainer.getAllDVDs().size();
		dvdMaintainer.getAllDVDs().remove(numberOfDVDs-1);
		assertEquals(numberOfDVDs-1, dvdMaintainer.getAllDVDs().size());

		// Clean CSV
		dvdMaintainer.getAllDVDs().remove(newBook);
		dvdMaintainer.update();
	}

	@Test
	public void testUpdate() throws Exception {
		dvdMaintainer.update();
		assertNull(dvdMaintainer.searchExactDVDByISBN("1234567890123"));
	}

}