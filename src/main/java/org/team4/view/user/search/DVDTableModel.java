package org.team4.view.user.search;

import javax.swing.table.DefaultTableModel;
import org.team4.model.items.DVD;
import java.util.ArrayList;

public class DVDTableModel extends DefaultTableModel {

    private static final long serialVersionUID = 1L;
    private final String[] columnNames = {"Title", "Year Published", "Genre", "Duration", "Quantity","ISBN"};

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
                    dvd.getQuantity(),
                    dvd.getISBN()
            });
        }
    }
}
