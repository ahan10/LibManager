package org.team4.maintaindb;

import java.io.FileWriter;
import java.util.ArrayList;

import org.team4.model.items.Book;
import org.team4.model.items.Item;
import org.team4.model.items.builder.BookBuilder;
import org.team4.model.items.decorator.PurchasableItemDecorator;
import org.team4.model.items.decorator.RentableItemDecorator;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class MaintainDVD {
	private static MaintainDVD instance;

	public ArrayList<Item> dvd;

	private static final String FILE_PATH = "database/dvd.csv";

	private MaintainDVD() {
		this.dvd = new ArrayList<Item>();
		try {
			// LOAD ONLY ONCE WHEN DATABASE CREATED
			this.load();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Failed to Initialize DVD Database");
		}

	}
	
	/**
	 * Get current running instance
	 * @return
	 */
	public static MaintainDVD getInstance() {
		if (instance == null) {
			// Extra check for Multi-threaded applications
			synchronized (MaintainDVD.class) {
				if (instance == null) {
					instance = new MaintainDVD();
				}
			}
		}
		
		return instance;
	}

	
	/**
	 * Load database into array. Called only once when instance created
	 * @throws Exception
	 */
	public void load() throws Exception {
		CsvReader reader = new CsvReader(FILE_PATH);
		reader.readHeaders();

		while (reader.readRecord()) {
			Item newBook = ((BookBuilder) new BookBuilder().title(reader.get("title"))
					.yearPublished(Integer.parseInt(reader.get("yearPublished")))
					.price(Double.parseDouble(reader.get("price"))).quantity(Integer.parseInt(reader.get("quantity"))))
					.noOfPages(Integer.parseInt(reader.get("noOfPages"))).author(reader.get("author"))
					.ISBN(reader.get("ISBN")).publisher(reader.get("publisherName"))
					.edition(Integer.parseInt(reader.get("edition"))).genre(reader.get("genre"))
					.hasHardCopy(Boolean.parseBoolean(reader.get("hardcopy")))
					.hasSoftCopy(Boolean.parseBoolean(reader.get("softcopy"))).build();
			if (Boolean.parseBoolean(reader.get("isPurchasable"))) {
				PurchasableItemDecorator purchasableDecorator = new PurchasableItemDecorator(newBook);
				newBook = purchasableDecorator.getItem();
			}
			if (Boolean.parseBoolean(reader.get("isRentable"))) {
				RentableItemDecorator rentableDecorator = new RentableItemDecorator(newBook);
				newBook = rentableDecorator.getItem();
			}

			dvd.add(newBook);
		}
	}
	
	/**
	 * Update database with dvds stored
	 * @throws Exception
	 */
	public void update() throws Exception{
		try {
			CsvWriter csvOutput = new CsvWriter(new FileWriter(FILE_PATH, false), ',');
			//email,password,name,type,validated

			//set header
			csvOutput.write("title");
			csvOutput.write("yearPublished");
			csvOutput.write("isRentable");
			csvOutput.write("isPurchasable");
			csvOutput.write("genre");
			csvOutput.write("noOfPages");
			csvOutput.write("author");
			csvOutput.write("ISBN");
			csvOutput.write("publisherName");
			csvOutput.write("edition");
			csvOutput.write("quantity");
			csvOutput.write("hardcopy");
			csvOutput.write("softcopy");
			csvOutput.write("price");
			csvOutput.endRecord();

			// write out records
			for(Item b: dvd){
				csvOutput.write(b.getTitle());
				csvOutput.write(String.valueOf(b.getYearPublished()));
				csvOutput.write(String.valueOf(b.isRentable()));
				csvOutput.write(String.valueOf(b.isPurchasable()));
				csvOutput.write(((Book) b).getGenre());
				csvOutput.write(String.valueOf(((Book) b).getNoOfPages()));
				csvOutput.write(((Book) b).getAuthor());
				csvOutput.write(((Book) b).getISBN());
				csvOutput.write(((Book) b).getPublisher());
				csvOutput.write(String.valueOf(((Book) b).getEdition()));
				csvOutput.write(String.valueOf(((Book) b).getQuantity()));
				csvOutput.write(String.valueOf(((Book) b).hasHardCopy()));
				csvOutput.write(String.valueOf(((Book) b).hasSoftCopy()));
				csvOutput.write(String.valueOf(((Book) b).getPrice()));
				csvOutput.endRecord();
			}
			csvOutput.close();

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Get list of dvds from storage
	 * @return
	 */
	public ArrayList<Item> getAllDVDs(){
    	return this.dvd;
    }
	
	
	
}