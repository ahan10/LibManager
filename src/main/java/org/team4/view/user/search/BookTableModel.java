package org.team4.view.user.search;

import javax.swing.table.DefaultTableModel;

import org.team4.model.items.Book;

import java.util.ArrayList;

public class BookTableModel extends DefaultTableModel {

    
	private static final long serialVersionUID = 1L;
	private final String[] columnNames = {"Title", "Author", "Genre", "Publisher", "Year", "ISBN", "Edition"};

    public BookTableModel(ArrayList<Book> books) {

    	for(String columnName: columnNames) {
			addColumn(columnName);
		}
    	for ( Book book: books) {
            addRow(new Object[]{
                    book.getTitle(),
                    book.getAuthor(),
                    book.getGenre(),
                    book.getPublisher(),
                    book.getYearPublished(),
                    book.getISBN(),
                    book.getEdition()
            });
      
        	  
        }
    }
}

  

