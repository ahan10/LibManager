package org.team4.view.manager.requests;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.team4.maintaindb.MaintainDatabase;
import org.team4.maintaindb.MaintainRequests;
import org.team4.model.items.BookRequest;

public class ViewRequestsPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private MaintainRequests maintainRequests = MaintainDatabase.getInstance().getRequestDatabase();
	
    private ArrayList<BookRequest> highPriority;
    private ArrayList<BookRequest> lowPriority;
    
    private RequestsTableModel requestsTableModel;
	
	/**
	 * Create the panel.
	 */
	public ViewRequestsPanel() {
		this.highPriority = new ArrayList<BookRequest>();
		this.lowPriority = new ArrayList<BookRequest>();
		
		try {
			this.highPriority = maintainRequests.getHighPriorityRequests();
			this.lowPriority = maintainRequests.getLowPriorityRequests();
		} catch (Exception e) {
			e.printStackTrace();
		}
		initValidate();
	}
	
	public void initValidate() {
		setBounds(100, 100, 988, 720);
		setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
	    panel.setLayout(null);
		
		add(panel, BorderLayout.CENTER);
		
		requestsTableModel = new RequestsTableModel(this.highPriority, this.lowPriority);
        JTable requestsTable = new JTable(requestsTableModel);

        JScrollPane requestsPane = new JScrollPane(requestsTable);
        requestsPane.setBounds(35, 63, 916, 593);
		panel.add(requestsPane);
		
		JLabel TitleLabel = new JLabel("Requests by Users");
		panel.add(TitleLabel);
		TitleLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		TitleLabel.setBounds(402, 25, 183, 26);
	}

}
