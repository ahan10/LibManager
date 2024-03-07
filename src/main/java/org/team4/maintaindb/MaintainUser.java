package org.team4.maintaindb;

import java.io.FileWriter;
import java.util.ArrayList;

import org.team4.model.user.User;
import org.team4.model.user.UserFactory;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class MaintainUser {
	private static MaintainUser instance;
	
	public ArrayList<User> users;

	private static final String FILE_PATH = "database/users.csv";

	private MaintainUser() {
		users = new ArrayList<User>();
		try {
			//LOAD ONLY ONCE WHEN DATABASE CREATED
			this.load();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed to Initialize User Database");
		}
	}
	
	public static MaintainUser getInstance() {
		if (instance == null) {
			// Extra check for Multi-threaded applications
			synchronized (MaintainUser.class) {
				if (instance == null) {
					instance = new MaintainUser();
				}
			}
		}
		
		return instance;
	}

	public void load() throws Exception{
		CsvReader reader = new CsvReader(FILE_PATH);
		reader.readHeaders();
		UserFactory uFactory = new UserFactory();

		while (reader.readRecord()) {
			User user = uFactory.getUser(reader.get("email"), reader.get("password"), reader.get("name"), reader.get("type"), Boolean.parseBoolean(reader.get("validated")));
			users.add(user);
		}
	}

	public ArrayList<User> getAllUsers() {
		return this.users;
	}

	/**
	 * Call whenever a new user should be added to the database
	 * @param user
	 */
	public void addUser(User user) {
		boolean flag = false;
		for (User u: users) {
			if (u.getEmail().equals(user.getEmail())) {
				System.out.println(user.toString() + " already exists");
				flag = true;
				break;
			}
		}
		if (flag == false) {
			users.add(user);
			System.out.println("new user " + user.toString() + " added");
		}
	}

	/**
	 * Call whenever the database should be updated with new data
	 * @throws Exception
	 */
	public void update() throws Exception{
		try {
			CsvWriter csvOutput = new CsvWriter(new FileWriter(FILE_PATH, false), ',');
			//email,password,name,type,validated

			//set header
			csvOutput.write("email");
			csvOutput.write("password");
			csvOutput.write("name");
			csvOutput.write("type");
			csvOutput.write("validated");
			csvOutput.endRecord();

			// write out records
			for(User u: users){
				csvOutput.write(u.getEmail());
				csvOutput.write(u.getPassword());
				csvOutput.write(u.getName());
				csvOutput.write(u.getType());
				csvOutput.write(String.valueOf(u.isValidated()));
				csvOutput.endRecord();
			}
			csvOutput.close();
			System.out.println("User Database Updated");

		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("User Database Failed to Update");
		}
	}

	/**
	 * This Function is not needed. All Database updates should be done by calling the above update()
	 * @param updatedUsers
	 * @throws Exception
	 */
	public void updateChangedFields(ArrayList<User> updatedUsers) throws Exception {
		try {
			CsvReader reader = new CsvReader(FILE_PATH);
			reader.readHeaders();
			ArrayList<User> existingUsers = new ArrayList<User>();
			UserFactory userFactory = new UserFactory();

			while (reader.readRecord()) {
				User user = userFactory.getUser(reader.get("email"), reader.get("password"), reader.get("name"), reader.get("type"), Boolean.parseBoolean(reader.get("validated")));
				existingUsers.add(user);
			}
			reader.close();

			CsvWriter csvOutput = new CsvWriter(new FileWriter(FILE_PATH, false), ',');

			// Set header
			csvOutput.write("email");
			csvOutput.write("password");
			csvOutput.write("name");
			csvOutput.write("type");
			csvOutput.write("validated");
			csvOutput.endRecord();

			// Write out records
			for (User existingUser : existingUsers) {
				for (User updatedUser : updatedUsers) {
					if (existingUser.getEmail().equals(updatedUser.getEmail())) {
						// Update only if validated status has changed
						if (existingUser.isValidated() != updatedUser.isValidated()) {
							csvOutput.write(updatedUser.getEmail());
							csvOutput.write(updatedUser.getPassword());
							csvOutput.write(updatedUser.getName());
							csvOutput.write(updatedUser.getType());
							csvOutput.write(String.valueOf(updatedUser.isValidated()));
							csvOutput.endRecord();
						} else {
							// Keep the existing user details
							csvOutput.write(existingUser.getEmail());
							csvOutput.write(existingUser.getPassword());
							csvOutput.write(existingUser.getName());
							csvOutput.write(existingUser.getType());
							csvOutput.write(String.valueOf(existingUser.isValidated()));
							csvOutput.endRecord();
						}
						break;
					}
				}
			}

			csvOutput.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
