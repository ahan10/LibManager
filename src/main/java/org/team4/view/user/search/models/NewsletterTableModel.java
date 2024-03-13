package org.team4.view.user.search.models;

import javax.swing.table.DefaultTableModel;
import org.team4.model.items.Newsletter;
import java.util.ArrayList;

public class NewsletterTableModel extends DefaultTableModel {

    private static final long serialVersionUID = 1L;
    private final String[] columnNames = {"Title", "Link", "Price"};

    public NewsletterTableModel(ArrayList<Newsletter> newsletters) {

        for(String columnName: columnNames) {
            addColumn(columnName);
        }
        for (Newsletter newsletter : newsletters) {
            addRow(new Object[]{
                    newsletter.getTitle(),
                    newsletter.getLink(),
                    newsletter.getPrice()
            });
        }
    }
    @Override
    public boolean isCellEditable(int row, int column) {

        return false;
    }
}
