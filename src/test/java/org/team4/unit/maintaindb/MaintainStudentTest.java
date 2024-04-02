package org.team4.unit.maintaindb;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.*;
import org.team4.maintaindb.MaintainStudent;
import org.team4.model.user.Student;

public class MaintainStudentTest {
	
	MaintainStudent studentMaintainer;
	
	@Before
	public void setUp() {
		studentMaintainer = MaintainStudent.getInstance();
	}
	
	@Test
	public void getStudents() {
		assertFalse(studentMaintainer.getStudents().isEmpty());
	}
	
	@Test
	public void coursesToStringNoStudent() {
		Student testStudent = new Student("test", "test", "test", "test");
		testStudent.setCourses(new ArrayList<String>());
		assertEquals("", studentMaintainer.coursesToString(testStudent));
	}
	
	@Test
	public void coursesToStringExistingStudent() {
		assertEquals("course1,course2,course3,course4", studentMaintainer.coursesToString(studentMaintainer.getStudents().get(0)));
	}
	
	@Test
	public void findStudentNoExist() {
		assertNull(studentMaintainer.findStudent("testing"));
	}
	
	@Test
	public void findStudent() {
		assertEquals(studentMaintainer.getStudents().get(0), studentMaintainer.findStudent("user1@example.com"));
	}
	
	@Test
	public void update() throws Exception {
		studentMaintainer.update();
	}

}