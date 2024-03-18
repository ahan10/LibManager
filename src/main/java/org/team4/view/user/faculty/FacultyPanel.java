package org.team4.view.user.faculty;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.team4.maintaindb.MaintainBooks;
import org.team4.maintaindb.MaintainCourse;
import org.team4.maintaindb.MaintainDatabase;
import org.team4.maintaindb.MaintainNotifications;
import org.team4.model.course.Course;
import org.team4.model.items.Book;
import org.team4.model.items.Item;
import org.team4.model.user.User;

public class FacultyPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private static JTable table;
	private MaintainCourse courseMaintainer = MaintainDatabase.getInstance().getCourseDatabase();
	private MaintainBooks bookMaintainer = MaintainDatabase.getInstance().getBookDatabase();
	private MaintainNotifications notificationMaintainer = MaintainDatabase.getInstance().getNotificationDatabase();
	private ArrayList<Course> courses;
	private User currentUser;

	/**
	 * Create the panel.
	 */
	public FacultyPanel() {
		setBounds(100, 100, 788, 520);
		setLayout(null);
	}

	public FacultyPanel(User faculty) {
		currentUser = faculty;
		setLayout(new BorderLayout());
		courses = courseMaintainer.findCourseByProfessor(faculty.getEmail());
		CourseTableModel model = new CourseTableModel(courses);
		table = new JTable(model);
		table.setDefaultEditor(Object.class, null);
		add(new JScrollPane(table), BorderLayout.CENTER);
		checkForNewerEditions(courses);
		checkForAvailability(courses);
	}

	private void checkForNewerEditions(ArrayList<Course> coursesToCheck) {
		EventQueue.invokeLater(() -> {
			ArrayList<Item> newerEditions = new ArrayList<Item>();
			StringBuilder notifications = new StringBuilder();

			// Build List of textbooks that have a newer version in our database
			if (!coursesToCheck.isEmpty()) {
				for (Course c : coursesToCheck) {
					Book textBook = bookMaintainer.searchExactBookByISBN(c.getCourseTextBookISBN());
					for (Item b : bookMaintainer.getAllBooks()) {
						if (b.getTitle().equals(textBook.getTitle())
								&& ((Book) b).getEdition() > textBook.getEdition()) {
							newerEditions.add(b);
						}
					}
				}
			}
			// Create Notification if newer books were found
			if (!newerEditions.isEmpty()) {
				for (Item b : newerEditions) {
					notifications.append(b.getTitle() + " has a newer version!\n");
					notifications.append("Version " + ((Book) b).getEdition() + " is now available\n");
				}
			}
			if (!notifications.isEmpty()) {
				JOptionPane.showMessageDialog(this, notifications.toString(), "New Editions Found", JOptionPane.WARNING_MESSAGE);
			}
		});
	}

	private void checkForAvailability(ArrayList<Course> coursesToCheck) {
		EventQueue.invokeLater(() -> {
			ArrayList<Item> unavailableBooks = new ArrayList<Item>();
			StringBuilder notifications = new StringBuilder();

			// Build List of textbooks that are unavailable in our database
			if (!coursesToCheck.isEmpty()) {
				for (Course c : coursesToCheck) {
					for (Item b : bookMaintainer.getAllBooks()) {
						if (b.getISBN().equals(c.getCourseTextBookISBN()) && b.getQuantity() <= 0) {
							unavailableBooks.add(b);
						}
					}
				}
			}
			// Create Notification if books were found that aren't available
			if (!unavailableBooks.isEmpty()) {
				for (Item b : unavailableBooks) {
					notifications.append(b.getTitle() + " is currently unavailable!\n");
				}
				notifications.append("Would you like to notify management?");
			}
			if (!notifications.isEmpty()) {
				int response = JOptionPane.showOptionDialog(this, notifications.toString(), "Textbooks Unavailable", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
				if (response == 0) {
					//TODO Notify Management
					System.out.println("Yes");
					StringBuilder str = new StringBuilder();
					str.append("The textbook ");
					for (Item b : unavailableBooks) {
						//append book title
						str.append("\"");
						str.append(b.getTitle());
						str.append("\", ");
					}
					str.delete(str.length()-2, str.length());
					str.append(" is not available.");
					str.append("@@@@").append(currentUser.getEmail());
					notificationMaintainer.getNotifications().add(str.toString());
					System.out.println(str.toString());
					try {
						notificationMaintainer.update();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						System.out.println("Failed to update notification database when faculty requested to notify management");
					}
					
					JOptionPane.showMessageDialog(this, "Someone from the library management team will contact you as soon as possible");
					
				} else {
					System.out.println("No");
				}
			}
		});
	}

}
