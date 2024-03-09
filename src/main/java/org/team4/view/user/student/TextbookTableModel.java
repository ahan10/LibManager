package org.team4.view.user.student;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import org.team4.model.course.Course;
import org.team4.model.course.CourseTextBook;

public class TextbookTableModel extends DefaultTableModel {
	
	private static final long serialVersionUID = 1L;
	private final String[] columnNames = {"Title", "Course", "Professor", "End Date"};

    public TextbookTableModel(ArrayList<Course> courses) {

    	for(String columnName: columnNames) {
			addColumn(columnName);
		}
    	
    	for ( Course c: courses) {
            addRow(new Object[]{
                    c.getCourseTextBook().getTitle(),
                    c.getCourseName(),
                    c.getProfessor().getName(),
                    c.getEndDate()
            });
      
        	  
        }
    }
}

