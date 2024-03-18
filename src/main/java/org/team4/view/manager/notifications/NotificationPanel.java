package org.team4.view.manager.notifications;

import java.awt.BorderLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.team4.maintaindb.MaintainDatabase;
import org.team4.maintaindb.MaintainNotifications;

public class NotificationPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private static JTable table;
	
	private MaintainNotifications notificationMaintainer = MaintainDatabase.getInstance().getNotificationDatabase();

	/**
	 * Create the panel.
	 */
	public NotificationPanel() {
		setBounds(100, 100, 988, 720);
		setLayout(new BorderLayout());
		setLayout(new BorderLayout());
		NotificationTableModel model = new NotificationTableModel();
		table = new JTable(model);
		table.setDefaultEditor(Object.class, null);
		for (int i = 0; i < table.getColumnCount(); i++) {
			if (i == 0) {
				table.getColumnModel().getColumn(i).setPreferredWidth(350);
			}
			else if (i == 2) {
				table.getColumnModel().getColumn(i).setMaxWidth(250);
			}
		}
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				int row = table.rowAtPoint(evt.getPoint());
				int col = table.columnAtPoint(evt.getPoint());
				if (col == 2) {
					displayWarning(row);
				}
			}
		});
		add(new JScrollPane(table), BorderLayout.CENTER);

	}
	
	public void displayWarning(int rowSelected) {
		int response = JOptionPane.showOptionDialog(this, "Are you sure you want to delete?", "Delete Notification", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, null, null);
		if (response == 0) {
			notificationMaintainer.getNotifications().remove(rowSelected);
			((NotificationTableModel) table.getModel()).removeRow(rowSelected);
			try {
				notificationMaintainer.update();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Failed to remove notification from database");
			}
			
		}
	}

}
