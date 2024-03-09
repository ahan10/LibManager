package org.team4.maintaindb;

import java.io.FileWriter;
import java.sql.Date;
import java.util.ArrayList;

import org.team4.model.course.Course;
import org.team4.model.user.Faculty;
import org.team4.model.user.Student;
import org.team4.model.user.User;
import org.team4.model.user.UserFactory;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class MaintainCourse {
private static MaintainCourse instance;
	
	public ArrayList<Course> courses;

	private static final String FILE_PATH = "database/courses.csv";

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
		UserFactory uFactory = new UserFactory();

		while (reader.readRecord()) {
			Student s = (Student) uFactory.getUser(reader.get("email"), null, null, "STUDENT");
			for (String string : reader.getValues()) {
				System.out.println(string);
			}
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
		
		MaintainCourse courseMaintainer = MaintainCourse.getInstance();
		MaintainBooks bookMaintainer = MaintainBooks.getInstance();
		MaintainUser userMaintainer = MaintainUser.getInstance();
		courseMaintainer.getCourses().add(new Course("course1", new Date(0), new Date(1000), bookMaintainer.getAllBooks().get(1), (Faculty) userMaintainer.getAllUsers().get(1)));
		courseMaintainer.getCourses().add(new Course("course2", new Date(0), new Date(1000), bookMaintainer.getAllBooks().get(2), (Faculty) userMaintainer.getAllUsers().get(3)));
		courseMaintainer.getCourses().add(new Course("course3", new Date(0), new Date(1000), bookMaintainer.getAllBooks().get(3), (Faculty) userMaintainer.getAllUsers().get(3)));
		courseMaintainer.getCourses().add(new Course("course4", new Date(0), new Date(1000), bookMaintainer.getAllBooks().get(4), (Faculty) userMaintainer.getAllUsers().get(1)));
		courseMaintainer.getCourses().add(new Course("course5", new Date(0), new Date(1000), bookMaintainer.getAllBooks().get(5), (Faculty) userMaintainer.getAllUsers().get(3)));
		courseMaintainer.getCourses().add(new Course("course6", new Date(0), new Date(1000), bookMaintainer.getAllBooks().get(6), (Faculty) userMaintainer.getAllUsers().get(1)));
		courseMaintainer.getCourses().add(new Course("course7", new Date(0), new Date(1000), bookMaintainer.getAllBooks().get(7), (Faculty) userMaintainer.getAllUsers().get(3)));
		courseMaintainer.getCourses().add(new Course("course8", new Date(0), new Date(1000), bookMaintainer.getAllBooks().get(8), (Faculty) userMaintainer.getAllUsers().get(1)));
		courseMaintainer.getCourses().add(new Course("course9", new Date(0), new Date(1000), bookMaintainer.getAllBooks().get(9), (Faculty) userMaintainer.getAllUsers().get(3)));
		try {
			courseMaintainer.update();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

