package org.team4.maintaindb;

import java.io.FileWriter;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.team4.model.items.RentedItem;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class MaintainRent {
	private static MaintainRent instance;

	public Map<String, ArrayList<RentedItem>> renters;

	private static final String FILE_PATH = "database/rentinformation.csv";

	private MaintainRent() {
		this.renters = new HashMap<String, ArrayList<RentedItem>>();
		try {
			// LOAD ONLY ONCE WHEN DATABASE CREATED
			this.load();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed to Initialize Renter Database");
		}

	}
	
	/**
	 * Get current running instance
	 * @return
	 */
	public static MaintainRent getInstance() {
		if (instance == null) {
			// Extra check for Multi-threaded applications
			synchronized (MaintainRent.class) {
				if (instance == null) {
					instance = new MaintainRent();
				}
			}
		}
		
		return instance;
	}

	
	/**
	 * Load database into map. Called only once when instance created
	 * @throws Exception
	 */
	public void load() throws Exception {
		CsvReader reader = new CsvReader(FILE_PATH);
		reader.readHeaders();

		while (reader.readRecord()) {
			String email = reader.get("email");
			String title = reader.get("title");
			String ISBN = reader.get("ISBN");
			Date rentDate = Date.valueOf(reader.get("rentDate"));
			Date dueDate = Date.valueOf(reader.get("dueDate"));

			if (!this.renters.containsKey(email)) {
				this.renters.put(email, new ArrayList<>());
			}

			this.renters.get(email).add(new RentedItem(title,ISBN,rentDate,dueDate));
		}
	}
	
	/**
	 * Update database with magazines stored
	 * @throws Exception
	 */
	public void update() throws Exception{
		try {
			CsvWriter csvOutput = new CsvWriter(new FileWriter(FILE_PATH, false), ',');


			//set header
			csvOutput.write("email");
			csvOutput.write("title");
			csvOutput.write("ISBN");
			csvOutput.write("rentDate");
			csvOutput.write("dueDate");
			csvOutput.endRecord();

			// write out records
			for(String email: this.renters.keySet()){
				for (RentedItem item: this.renters.get(email)) {
					csvOutput.write(email);
					csvOutput.write(item.getTitle());
					csvOutput.write(item.getISBN());
					csvOutput.write(String.valueOf(item.getRentDate()));
					csvOutput.write(String.valueOf(item.getDueDate()));
					csvOutput.endRecord();
				}
			}
			csvOutput.close();

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Get list of magazines from storage
	 * @return
	 */
	public Map<String,ArrayList<RentedItem>> getAllRenters(){
    	return this.renters;
    }
	
	public int getNumberOfItemsRentedByUser(String email) {
		if (this.renters.get(email) == null) {
			return 0;
		}
		return this.renters.get(email).size();
	}
	
	public void addNewRentedItem(String email, String title,String ISBN, Date date, Date dueDate) {
		if (!this.renters.containsKey(email)) {
			this.renters.put(email, new ArrayList<RentedItem>());
		}
		this.renters.get(email).add(new RentedItem(title,ISBN, date,dueDate));
	}
	
	public boolean isAlreadyRentedByUser(String email, RentedItem rentedItem) {
		if (!this.renters.containsKey(email)) {
			return false;
		}
		for (RentedItem rI : this.renters.get(email)) {
			if (rI.getISBN().equals(rentedItem.getISBN())) {
				return true;
			}
		}
		return false;
	}
	
	
	/**
	 * Returns true if rented item was successfully returned
	 * @param email
	 * @param ISBN
	 * @return
	 */
	public boolean returnRentedItem(String email, String ISBN) {
		if (!this.renters.containsKey(email)) {
			return false;
		}
		for (RentedItem rI : this.renters.get(email)) {
			if (rI.getISBN().equals(ISBN)) {
				return this.renters.get(email).remove(rI);
			}
		}
		return false;
	}
	
	
}
