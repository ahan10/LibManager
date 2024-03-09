package org.team4.view.user.student;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.team4.model.course.Course;
import javax.swing.JLabel;

public class StudentPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private static JTable table;

	/**
	 * Create the panel.
	 */
	public StudentPanel() {
		setBounds(100, 100, 788, 520);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TESTING");
		lblNewLabel.setBounds(199, 188, 264, 185);
		add(lblNewLabel);

	}
	
	public StudentPanel(ArrayList<Course> results) {
        setLayout(new BorderLayout());
        TextbookTableModel model = new TextbookTableModel(results);
        table = new JTable(model);
        add(new JScrollPane(table), BorderLayout.CENTER);
    }
}
