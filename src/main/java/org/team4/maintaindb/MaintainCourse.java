package org.team4.maintaindb;

import java.io.FileWriter;
import java.sql.Date;
import java.util.ArrayList;

import org.team4.model.course.Course;
import org.team4.model.items.Item;
import org.team4.model.user.Faculty;
import org.team4.model.user.User;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class MaintainCourse {
private static MaintainCourse instance;
	
	public ArrayList<Course> courses;

	private static final String FILE_PATH = "database/courses.csv";
	
	private MaintainUser userMaintainer = MaintainDatabase.getInstance().getUserDatabase();
	private MaintainBooks bookMaintainer = MaintainDatabase.getInstance().getBookDatabase();

	private MaintainCourse() {
		courses = new ArrayList<Course>();
		try {
			//LOAD ONLY ONCE WHEN DATABASE CREATED
			this.load();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed to Initialize User Database");
		}
	}
	
	public static MaintainCourse getInstance() {
		if (instance == null) {
			// Extra check for Multi-threaded applications
			synchronized (MaintainCourse.class) {
				if (instance == null) {
					instance = new MaintainCourse();
				}
			}
		}
		
		return instance;
	}
	
	public void load() throws Exception{
		CsvReader reader = new CsvReader(FILE_PATH);
		reader.readHeaders();

		while (reader.readRecord()) {
			String courseName = reader.get("courseName");
			Date startDate = Date.valueOf(reader.get("startDate"));
			Date endDate = Date.valueOf(reader.get("endDate"));
			String courseTextBookISBN = reader.get("courseTextBookISBN");
			String professorEmail = reader.get("professorEmail");
			Item textbook = null;
			User professor = null;
			
			for (Item b: bookMaintainer.getAllBooks()) {
				if (b.getISBN().equals(courseTextBookISBN)) {
					textbook = b;
					break;
				}
			}
			
			for (User u: userMaintainer.getAllUsers()) {
				if (u.getEmail().equals(professorEmail)) {
					professor = u;
					break;
				}
			}
			
			Course newCourse = new Course(courseName, startDate, endDate, textbook, (Faculty) professor);
			courses.add(newCourse);
		}
	}
		
	public void update() throws Exception{
		try {
			CsvWriter csvOutput = new CsvWriter(new FileWriter(FILE_PATH, false), ',');
			//email,password,name,type,validated

			//set header
			csvOutput.write("courseName");
			csvOutput.write("startDate");
			csvOutput.write("endDate");
			csvOutput.write("courseTextBookISBN");
			csvOutput.write("professorEmail");
			csvOutput.endRecord();

			// write out records
			for(Course c: courses){
				csvOutput.write(c.getCourseName());
				csvOutput.write(String.valueOf(c.getStartDate()));
				csvOutput.write(String.valueOf(c.getEndDate()));
				csvOutput.write(c.getCourseTextBook().getISBN());
				csvOutput.write(c.getProfessor().getEmail());
				csvOutput.endRecord();
			}
			csvOutput.close();
			System.out.println("Course Database Updated");

		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Course Database Failed to Update");
		}
	}
	
	public ArrayList<Course> getCourses() {
		return this.courses;
	}
	
	public static void main(String [] args) {
		
	}

}

