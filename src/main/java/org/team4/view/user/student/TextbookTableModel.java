package org.team4.view.user.student;

import java.util.Date;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import org.team4.maintaindb.MaintainBooks;
import org.team4.maintaindb.MaintainCourse;
import org.team4.maintaindb.MaintainDatabase;
import org.team4.maintaindb.MaintainUser;
import org.team4.model.course.Course;

public class TextbookTableModel extends DefaultTableModel {
	
	private static final long serialVersionUID = 1L;
	private final String[] columnNames = {"Title", "Course", "Professor", "End Date"};
	private MaintainCourse courseMaintainer = MaintainDatabase.getInstance().getCourseDatabase();
	private MaintainBooks bookMaintainer = MaintainDatabase.getInstance().getBookDatabase();
	private MaintainUser userMaintainer = MaintainDatabase.getInstance().getUserDatabase();
	private ArrayList<Course> courses;

    public TextbookTableModel(ArrayList<String> courseNames) {
    	
    	courses = new ArrayList<Course>();
    	
    	for (String str: courseNames) {
    		Course c = courseMaintainer.findCourse(str);
    		if (c.getEndDate().before(new Date())) {
    			continue;
    		}
    		courses.add(c);
    	}

    	for(String columnName: columnNames) {
			addColumn(columnName);
		}
    	
    	for ( Course c: courses) {
            addRow(new Object[]{
            		bookMaintainer.searchExactBookByISBN(c.getCourseTextBookISBN()).getTitle(),
                    c.getCourseName(),
                    userMaintainer.findUserByEmail(c.getProfessorEmail()).getName(),
                    c.getEndDate()
            });
      
        	  
        }
    }
}

