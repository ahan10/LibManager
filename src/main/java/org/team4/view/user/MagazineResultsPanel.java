package org.team4.view.user;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.ArrayList;
import org.team4.model.items.Book;
import org.team4.model.items.Magazine;
import org.team4.view.user.search.BookTableModel;
import org.team4.view.user.search.MagazineTableModel;


public class MagazineResultsPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    private static JTable table;

    public MagazineResultsPanel() {
        setBounds(100, 100, 788, 520);
        setLayout(null);

        JLabel label = new JLabel("Magazine Search Results ");
        label.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        label.setBounds(324, 5, 139, 26);
        add(label);

    }




    public MagazineResultsPanel(ArrayList<Magazine> results) {
        setLayout(new BorderLayout());
        MagazineTableModel model = new MagazineTableModel(results);
        table = new JTable(model);
        add(new JScrollPane(table), BorderLayout.CENTER);
    }
    public static JTable getTable() {
        return table;
    }
}
