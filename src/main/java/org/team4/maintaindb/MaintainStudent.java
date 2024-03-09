package org.team4.maintaindb;

import java.io.FileWriter;
import java.util.ArrayList;

import org.team4.model.course.Course;
import org.team4.model.user.Student;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class MaintainStudent {
	private static MaintainStudent instance;

	public ArrayList<Student> students;

	private static final String FILE_PATH = "database/students.csv";

	private MaintainCourse courseMaintainer = MaintainDatabase.getInstance().getCourseDatabase();

	private MaintainStudent() {
		students = new ArrayList<Student>();
		try {
			// LOAD ONLY ONCE WHEN DATABASE CREATED
			this.load();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed to Initialize Student Database");
		}
	}

	public static MaintainStudent getInstance() {
		if (instance == null) {
			// Extra check for Multi-threaded applications
			synchronized (MaintainStudent.class) {
				if (instance == null) {
					instance = new MaintainStudent();
				}
			}
		}

		return instance;
	}

	public void load() throws Exception {
		CsvReader reader = new CsvReader(FILE_PATH);
		reader.readHeaders();

		while (reader.readRecord()) {
			Student s = new Student(reader.get("email"), null, null, "STUDENT", new ArrayList<Course>());
			String[] values = reader.getValues();
			for (int i = 1; i < values.length - 1; i++) {
				for (Course c : courseMaintainer.getCourses()) {
					if (values[i].equals(c.getCourseName())) {
						s.getCourses().add(c);

					}
				}
			}
		}
	}

	public String coursesToString(Student student) {
		String result = "";

		if (student.getCourses().size() > 0) {
			StringBuilder sb = new StringBuilder();

			for (Course c : student.getCourses()) {
				sb.append(c.getCourseName()).append(",");
			}

			result = sb.deleteCharAt(sb.length() - 1).toString();
		}

		return result;
	}

	public void update() throws Exception {
		try {
			CsvWriter csvOutput = new CsvWriter(new FileWriter(FILE_PATH, false), ',');
			// email,password,name,type,validated

			// set header
			csvOutput.write("email");
			csvOutput.write("courses");
			csvOutput.endRecord();

			// write out records
			for (Student s : students) {
				csvOutput.write(s.getEmail());
				csvOutput.write(coursesToString(s));
				csvOutput.endRecord();
			}
			csvOutput.close();
			System.out.println("User Database Updated");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("User Database Failed to Update");
		}
	}

	public ArrayList<Student> getStudents() {
		return this.students;
	}

	public static void main(String[] args) {

		MaintainStudent studentMaintainer = MaintainDatabase.getInstance().getStudentDatabase();

	}

}
