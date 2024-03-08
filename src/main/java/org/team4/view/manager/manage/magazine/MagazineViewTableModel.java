package org.team4.view.manager.manage.magazine;

import org.team4.model.items.DVD;
import org.team4.model.items.Item;
import org.team4.model.items.Magazine;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class MagazineViewTableModel extends DefaultTableModel {
    private static final long serialVersionUID = 1L;

    ArrayList<Item> dvd;

    private String[] columnNames = {
            "Title",
            "Publisher",
            "Quantity",
            "Rent"
    };

    public MagazineViewTableModel(ArrayList<Item> dvd) {
        this.dvd = dvd;

        for(String columnName: columnNames) {
            addColumn(columnName);
        }

        for(Item i: this.dvd) {
            Magazine m = (Magazine) i;
            addRow(new Object[] {
                    m.getTitle(),
                    m.getPublisher(),
                    m.getQuantity(),
                    m.isRentable()
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
