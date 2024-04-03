package org.team4.unit.maintaindb;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.*;
import org.team4.maintaindb.MaintainCourse;

public class MaintainCourseTest {
	
	MaintainCourse courseMaintainer;
	
	@Before
	public void setUp() {
		courseMaintainer = MaintainCourse.getInstance();
	}
	
	@Test
	public void testFirstCourse() {
		assertEquals("course1", courseMaintainer.getCourses().get(0).getCourseName());
	}
	
	@Test
	public void testLastCourse() {
		assertEquals("test course 2", courseMaintainer.getCourses().get(courseMaintainer.getCourses().size()-1).getCourseName());
	}
	
	@Test
	public void testFindCourse() {
		assertEquals("user2@example.com",courseMaintainer.findCourse("course8").getProfessorEmail());
	}
	
	@Test
	public void testCourseNotFoundByName() {
		assertNull(courseMaintainer.findCourse("This course doesn't exist"));
	}
	
	@Test
	public void testFindCourseByProfessor() {
		assertEquals("course2",courseMaintainer.findCourseByProfessor("user4@example.com").get(0).getCourseName());
	}
	
	@Test
	public void testProfessorNotTeaching() {
		assertEquals(0, courseMaintainer.findCourseByProfessor("This Professor doesn't exist").size());
	}
	
	@Test
	public void numberOfCourseByProfessor() {
		assertEquals(5 ,courseMaintainer.findCourseByProfessor("user4@example.com").size());
	}
	
	@Test
	public void coursePastDate() {
		assertTrue(courseMaintainer.findCourse("course2").isEnded(new Date()));
	}
	
	@Test
	public void courseNotPastDate() {
		assertFalse(courseMaintainer.findCourse("course1").isEnded(new Date()));
	}
	
	@Test
	public void testUpdate() {
		try {
			courseMaintainer.update();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}