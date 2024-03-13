package org.team4.view.user.search.models;

import javax.swing.table.DefaultTableModel;
import org.team4.model.items.RentedItem;
import java.util.ArrayList;

public class RentedItemTableModel extends DefaultTableModel {
    private static final long serialVersionUID = 1L;
    private final String[] columnNames = { "Title","ISBN", "Rented On", "Due By"};

    public RentedItemTableModel(ArrayList<RentedItem> rentedItems) {
        for (String columnName : columnNames) {
            addColumn(columnName);
        }
        for (RentedItem item : rentedItems) {
            addRow(new Object[]{
                    item.getTitle(),
                    item.getISBN(),
                    item.getRentDate(),
                    item.getDueDate()
            });
        }
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
}
