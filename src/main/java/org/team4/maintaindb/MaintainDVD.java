package org.team4.maintaindb;

import java.io.FileWriter;
import java.util.ArrayList;

import org.team4.model.items.DVD;
import org.team4.model.items.Item;
import org.team4.model.items.builder.DVDBuilder;
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
			Item newDVD = ((DVDBuilder) new DVDBuilder()
					.title(reader.get("title"))
					.yearPublished(Integer.parseInt(reader.get("yearPublished")))
					.ISBN(reader.get("ISBN")))
					.genre(reader.get("genre"))
					.duration(Double.parseDouble(reader.get("duration")))
					.price(Double.parseDouble(reader.get("price")))
					.quantity(Integer.parseInt(reader.get("quantity")))
					.build();
			if(Boolean.parseBoolean(reader.get("isPurchasable"))) {
                PurchasableItemDecorator purchasableDecorator = new PurchasableItemDecorator(newDVD);
                newDVD = purchasableDecorator.getItem();
            }
			if(Boolean.parseBoolean(reader.get("isRentable"))) {
                RentableItemDecorator rentableDecorator = new RentableItemDecorator(newDVD);
                newDVD = rentableDecorator.getItem();
            }
			
			
			dvd.add(newDVD);
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
			csvOutput.write("duration");
			csvOutput.write("price");
			csvOutput.write("quantity");
			csvOutput.write("ISBN");
			csvOutput.endRecord();

			// write out records
			for(Item d: dvd){
				csvOutput.write(d.getTitle());
				csvOutput.write(String.valueOf(d.getYearPublished()));
				csvOutput.write(String.valueOf(d.isRentable()));
				csvOutput.write(String.valueOf(d.isPurchasable()));
				csvOutput.write(((DVD) d).getGenre());
				csvOutput.write(String.valueOf(((DVD) d).getDuration()));
				csvOutput.write(String.valueOf(d.getPrice()));
				csvOutput.write(String.valueOf(d.getQuantity()));
				csvOutput.write(d.getISBN());
				csvOutput.endRecord();
			}
			csvOutput.close();

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Get list of DVDs from storage
	 * @return
	 */
	public ArrayList<Item> getAllDVDs(){
    	return this.dvd;
    }
	
	/**
	 * Adds DVD to storage if it doesn't already exist
	 * @param dvd
	 */
	public void addDVD(DVD dvd) {
		boolean flag = false;
		for (Item d: this.dvd) {
			if (d.getTitle().equals(dvd.getTitle())) {
				System.out.println(dvd.toString() + " already exists");
				flag = true;
				break;
			}
		}
		if (flag == false) {
			this.dvd.add(dvd);
			System.out.println("new dvd " + dvd.toString() + " added");
		}
		
		try {
			update();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public ArrayList<DVD> searchDVDs(String query) {
		ArrayList<DVD> searchedDVDs = new ArrayList<>();

		for (Item item : dvd) {
			DVD dvd = (DVD) item;
			if (dvd.getTitle().toLowerCase().contains(query.toLowerCase())) {
				searchedDVDs.add(dvd);
			}
		}

		return searchedDVDs;
	}

	public void decreaseNumberOfCopies(Item item) {
		for (Item i: this.dvd) {
			if (i.equals(item)) {
				i.setQuantity(i.getQuantity()-1);
			}
		}
		try {
			update();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed to decrease quantity");
		}

	}
	public void increaseNumberOfCopies(Item item) {
		for (Item i : this.dvd) {
			if (i.equals(item)) {
				i.setQuantity(i.getQuantity() + 1);
				break;
			}
		}
		try {
			update();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed to increase quantity");
		}
	}

	public DVD searchExactDVDByISBN(String isbn) {
		for (Item item : dvd) {
			if (item instanceof DVD && item.getISBN().equals(isbn)) {
				return (DVD) item;
			}
		}
		return null;
	}



}