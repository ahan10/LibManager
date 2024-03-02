package org.team4.view.Manager;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

import org.team4.maintaindb.MaintainUser;
import org.team4.model.user.User;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class ValidateUserPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private ArrayList<User> nonValidatedUsers;
	private MaintainUser maintainUser = new MaintainUser();
	
	private NonValidatedUsersTableModel nonValidatedUsersTableModel;

	private JScrollPane usersPane;
	private JTable nonValidatedUsersTable;

	/**
	 * Create the panel.
	 */
	public ValidateUserPanel() {
		nonValidatedUsers = new ArrayList<User>();
		try {
			this.nonValidatedUsers = maintainUser.getAllUsers();
		} catch (Exception e) {
			e.printStackTrace();
		}
		initValidate();
	}
	
	public void initValidate() {
		setBounds(100, 100, 788, 520);
		setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
	    panel.setLayout(null);
		
		JLabel TitleLabel = new JLabel("Validate User");
		TitleLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		TitleLabel.setBounds(328, 28, 132, 16);
		add(TitleLabel);
		
		add(panel, BorderLayout.CENTER);
		
		nonValidatedUsersTableModel = new NonValidatedUsersTableModel(this.nonValidatedUsers);
		nonValidatedUsersTable = new JTable(nonValidatedUsersTableModel);
		
		TableColumn validatedColumn = nonValidatedUsersTable.getColumnModel().getColumn(4);
        JComboBox<Boolean> comboBox = new JComboBox<>(new Boolean[]{true, false});
        validatedColumn.setCellEditor(new DefaultCellEditor(comboBox));
        
		usersPane = new JScrollPane(nonValidatedUsersTable);
		usersPane.setBounds(35, 63, 718, 404);
		panel.add(usersPane);
		
		JButton updateButton = new JButton("Update Users");
		updateButton.setBounds(635, 479, 117, 29);
		
		updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateSelectedUsers();
            }
        });
		
		panel.add(updateButton);	
	}
	
	private void updateSelectedUsers() {
        int rowCount = nonValidatedUsersTableModel.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            Boolean validatedStatus = (Boolean) nonValidatedUsersTableModel.getValueAt(i, 4);
            User user = nonValidatedUsers.get(i);
            user.setValidated(validatedStatus);
        }

        // Now, update the CSV with changed fields
        try {
            maintainUser.updateChangedFields(nonValidatedUsers);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
	
}


