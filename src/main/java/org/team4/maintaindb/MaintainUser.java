package org.team4.maintaindb;

import java.io.FileWriter;
import java.util.ArrayList;

import org.team4.model.user.User;
import org.team4.model.user.UserFactory;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class MaintainUser {
	public ArrayList<User> users = new ArrayList<User>();
	public String path;
	
	public void load(String path) throws Exception{
		CsvReader reader = new CsvReader(path); 
		reader.readHeaders();
		UserFactory uFactory = new UserFactory();
		
		while(reader.readRecord()){ 
			User user = uFactory.getUser(reader.get("email"), reader.get("password"), reader.get("name"), reader.get("type"));
			users.add(user);
		}
	}
	
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
	
	public void update(String path) throws Exception{
		try {		
				CsvWriter csvOutput = new CsvWriter(new FileWriter(path, false), ',');
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
			
			}catch (Exception e) {
				e.printStackTrace();
			}
	}
	/**
	 * Example of how to access database and write users to database
	 * 
	 */
	public static void main(String [] args) throws Exception{
		String path = "database\\users.csv";
		MaintainUser userMaintainer = new MaintainUser();
	
		userMaintainer.load(path);
		for(User u: userMaintainer.users){
			System.out.println(u.toString());
		}
		
		User newUser = new User("user1@example.com", "password1", "John Doe", "STUDENT");
		userMaintainer.addUser(newUser);
		
		userMaintainer.update(path);
	}
	
	/**/
}

