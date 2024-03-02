package org.team4.view.Manager;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import org.team4.model.user.User;

public class NonValidatedUsersTableModel extends DefaultTableModel{
	private static final long serialVersionUID = 1L;

	ArrayList<User> nonValidateUserList;
	
	private String[] columnNames = {
			"email",
			"password",
			"name",
			"type",
			"validated"
	};
	
	public NonValidatedUsersTableModel(ArrayList<User> nonValidateUserList) {
		this.nonValidateUserList = nonValidateUserList;
		
		for(String columnName: columnNames) {
			addColumn(columnName);
		}
		
		for(User u: nonValidateUserList) {
			addRow(new Object[] {
					u.getEmail(),
					u.getPassword(),
					u.getName(),
					u.getType(),
					u.isValidated()
			});
		}
		
	}
	
	@Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 4) {
            return Boolean.class;
        }
        return super.getColumnClass(columnIndex);
    }

    // Override the isCellEditable method to make "validated" column editable
    @Override
    public boolean isCellEditable(int row, int column) {
        return column == 4;
    }

}

