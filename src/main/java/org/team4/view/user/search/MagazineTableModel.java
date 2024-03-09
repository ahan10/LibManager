package org.team4.view.user.search;

import javax.swing.table.DefaultTableModel;

import org.team4.model.items.Magazine;

import java.util.ArrayList;

public class MagazineTableModel extends DefaultTableModel {

    private static final long serialVersionUID = 1L;
    private final String[] columnNames = {"Title", "Year Published", "Publisher", "Issue Number", "ISBN"};

    public MagazineTableModel(ArrayList<Magazine> magazines) {

        for(String columnName: columnNames) {
            addColumn(columnName);
        }
        for (Magazine magazine : magazines) {
            addRow(new Object[]{
                    magazine.getTitle(),
                    magazine.getYearPublished(),
                    magazine.getPublisher(),
                    magazine.getIssueNumber(),
                    magazine.getISBN()
            });
        }
    }
}


