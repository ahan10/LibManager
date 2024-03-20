package org.team4.view.manager.manage.dvd;

import org.team4.model.items.DVD;
import org.team4.model.items.Item;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class DVDViewTableModel extends DefaultTableModel {
    private static final long serialVersionUID = 1L;

    ArrayList<Item> dvd;

    private String[] columnNames = {
            "Title",
            "Genre",
            "Quantity",
            "Rent"
    };

    public DVDViewTableModel(ArrayList<Item> dvd) {
        this.dvd = dvd;

        for(String columnName: columnNames) {
            addColumn(columnName);
        }

        for(Item i: this.dvd) {
            DVD d = (DVD) i;
            addRow(new Object[] {
                    d.getTitle(),
                    d.getGenre(),
                    d.getQuantity(),
                    d.isRentable()
            });
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 3) {
            return Boolean.class;
        }
        return super.getColumnClass(columnIndex);
    }

    // Override the isCellEditable method to make "validated" column editable
    @Override
    public boolean isCellEditable(int row, int column) {
        return column == 3;
    }
}
