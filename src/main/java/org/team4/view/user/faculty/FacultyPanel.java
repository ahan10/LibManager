package org.team4.view.user.faculty;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.team4.maintaindb.MaintainCourse;
import org.team4.maintaindb.MaintainDatabase;
import org.team4.model.user.User;

public class FacultyPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private static JTable table;
	private MaintainCourse courseMaintainer = MaintainDatabase.getInstance().getCourseDatabase();

	/**
	 * Create the panel.
	 */
	public FacultyPanel() {
		setBounds(100, 100, 788, 520);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TESTING");
		lblNewLabel.setBounds(199, 188, 264, 185);
		add(lblNewLabel);

	}
	
	public FacultyPanel(User faculty) {
        setLayout(new BorderLayout());
        CourseTableModel model = new CourseTableModel(courseMaintainer.findCourseByProfessor(faculty.getEmail()));
        table = new JTable(model);
        add(new JScrollPane(table), BorderLayout.CENTER);
    }
	
}
