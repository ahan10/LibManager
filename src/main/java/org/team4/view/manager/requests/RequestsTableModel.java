package org.team4.view.manager.requests;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import org.team4.model.items.BookRequest;

public class RequestsTableModel extends DefaultTableModel{
	private static final long serialVersionUID = 1L;

    ArrayList<BookRequest> highPriority;
    ArrayList<BookRequest> lowPriority;

    private String[] columnNames = {
    		"Email",
    		"Title",
    		"Author",
    		"ISBN",
    		"Edition",
    		"Book Type"
    };

    public RequestsTableModel(ArrayList<BookRequest> highPriority, ArrayList<BookRequest> lowPriority) {
        this.highPriority = highPriority;
        this.lowPriority = lowPriority;
        
        this.highPriority.addAll(this.lowPriority);

        for(String columnName: columnNames) {
            addColumn(columnName);
        }

        for(BookRequest b: this.highPriority) {
            addRow(new Object[] {
                    b.getEmail(),
                    b.getTitle(),
                    b.getAuthor(),
                    b.getISBN(),
                    b.getEdition(),
                    b.getBookType()
            });
        }
    }
}
