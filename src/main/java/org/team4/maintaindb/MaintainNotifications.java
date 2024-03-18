package org.team4.maintaindb;

import java.io.FileWriter;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;

import org.team4.model.course.Course;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class MaintainNotifications {
private static MaintainNotifications instance;
	
	public ArrayList<String> notifications;

	private static final String FILE_PATH = "database/notifications.csv";

	private MaintainNotifications() {
		notifications = new ArrayList<String>();
		try {
			//LOAD ONLY ONCE WHEN DATABASE CREATED
			this.load();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed to Initialize Notifications Database");
		}
	}
	
	public static MaintainNotifications getInstance() {
		if (instance == null) {
			// Extra check for Multi-threaded applications
			synchronized (MaintainNotifications.class) {
				if (instance == null) {
					instance = new MaintainNotifications();
				}
			}
		}
		
		return instance;
	}
	
	public void load() throws Exception{
		//Since notifications have to be reread during runtime we must clear before loading
		notifications.clear();
		CsvReader reader = new CsvReader(FILE_PATH);
		reader.readHeaders();

		while (reader.readRecord()) {
			String message = reader.get("message");
			String username = reader.get("from");
			StringBuilder newNotification = new StringBuilder();
			newNotification.append(message + "@@@@").append(username);
			notifications.add(newNotification.toString());
		}
	}
		
	public void update() throws Exception{
		try {
			CsvWriter csvOutput = new CsvWriter(new FileWriter(FILE_PATH, false), ',');
			//email,password,name,type,validated

			//set header
			csvOutput.write("message");
			csvOutput.write("from");
			csvOutput.endRecord();

			// write out records
			for(String s: notifications){
				String[] str = s.split("@@@@");
				csvOutput.write(str[0]);
				csvOutput.write(str[1]);
				csvOutput.endRecord();
			}
			csvOutput.close();
			System.out.println("Notification Database Updated");

		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Notification Database Failed to Update");
		}
	}
	
	public ArrayList<String> getNotifications() {
		return notifications;
	}
	

}
