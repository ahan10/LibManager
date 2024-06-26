package org.team4.view.manager.manage.book;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import org.team4.model.items.Book;
import org.team4.model.items.Item;

public class BookViewTableModel extends DefaultTableModel{
	private static final long serialVersionUID = 1L;

	ArrayList<Item> books;
	
	private String[] columnNames = {
			"Title",
			"Genre",
			"Author",
			"Publisher",
			"Edition",
			"Quantity",
			"Rent"
	};
	
	public BookViewTableModel(ArrayList<Item> books) {
		this.books = books;
		
		for(String columnName: columnNames) {
			addColumn(columnName);
		}
		
		for(Item i: this.books) {
			Book b = (Book) i;
			addRow(new Object[] {
					b.getTitle(),
					b.getGenre(),
					b.getAuthor(),
					b.getPublisher(),
					b.getEdition(),
					b.getQuantity(),
					b.isRentable()
			});
		}
		
	}
	
	@Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 6) {
            return Boolean.class;
        }
        return super.getColumnClass(columnIndex);
    }

    // Override the isCellEditable method to make "validated" column editable
    @Override
    public boolean isCellEditable(int row, int column) {
        return column == 6;
    }

}

