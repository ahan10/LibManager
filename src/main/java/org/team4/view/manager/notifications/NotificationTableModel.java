package org.team4.view.manager.notifications;

import javax.swing.table.DefaultTableModel;

import org.team4.maintaindb.MaintainDatabase;
import org.team4.maintaindb.MaintainNotifications;
import org.team4.maintaindb.MaintainUser;

public class NotificationTableModel extends DefaultTableModel{
	
	private static final long serialVersionUID = 1L;
	private final String[] columnNames = {"Message", "From", "Delete?"};
	private MaintainNotifications notificationMaintainer = MaintainDatabase.getInstance().getNotificationDatabase();
	private MaintainUser userMaintainer = MaintainDatabase.getInstance().getUserDatabase();
	
	public NotificationTableModel() {
		//Load new notifications
		try {
			notificationMaintainer.load();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	for(String columnName: columnNames) {
			addColumn(columnName);
		}
    	
    	for ( String s: notificationMaintainer.getNotifications()) {
    		String[] str = s.split("@@@@");
            addRow(new Object[]{
                    str[0],
                    userMaintainer.findUserByEmail(str[1]).getName() + " (" + userMaintainer.findUserByEmail(str[1]).getType().toLowerCase() + ")"
            });
      
        	  
        }
    }

}
