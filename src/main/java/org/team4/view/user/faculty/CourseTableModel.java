package org.team4.view.user.faculty;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import org.team4.maintaindb.MaintainBooks;
import org.team4.maintaindb.MaintainCourse;
import org.team4.maintaindb.MaintainDatabase;
import org.team4.maintaindb.MaintainUser;
import org.team4.model.course.Course;

public class CourseTableModel extends DefaultTableModel {
	
	private static final long serialVersionUID = 1L;
	private final String[] columnNames = {"Course", "Textbook", "Current Edition"};
	private MaintainCourse courseMaintainer = MaintainDatabase.getInstance().getCourseDatabase();
	private MaintainBooks bookMaintainer = MaintainDatabase.getInstance().getBookDatabase();
	private MaintainUser userMaintainer = MaintainDatabase.getInstance().getUserDatabase();

    public CourseTableModel(ArrayList<Course> courses) {
 
    	for(String columnName: columnNames) {
			addColumn(columnName);
		}
    	
    	for ( Course c: courses) {
            addRow(new Object[]{
                    c.getCourseName(),
                    bookMaintainer.searchExactBookByISBN(c.getCourseTextBookISBN()).getTitle(),
                    bookMaintainer.searchExactBookByISBN(c.getCourseTextBookISBN()).getEdition()
            });
      
        	  
        }
    }
}