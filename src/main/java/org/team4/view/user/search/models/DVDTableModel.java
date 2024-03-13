package org.team4.view.user.search.models;

import javax.swing.table.DefaultTableModel;
import org.team4.model.items.DVD;
import java.util.ArrayList;

public class DVDTableModel extends DefaultTableModel {

    private static final long serialVersionUID = 1L;
    private final String[] columnNames = {"Title", "Year Published", "Genre", "Duration","ISBN", "Quantity"};

    public DVDTableModel(ArrayList<DVD> dvds) {

        for(String columnName: columnNames) {
            addColumn(columnName);
        }
        for (DVD dvd : dvds) {
            addRow(new Object[]{
                    dvd.getTitle(),
                    dvd.getYearPublished(),
                    dvd.getGenre(),
                    dvd.getDuration(),
                    dvd.getISBN(),
                    dvd.getQuantity()
            });
        }
    }
    @Override
    public boolean isCellEditable(int row, int column) {

        return false;
    }
}
