package org.team4.view.user;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Font;
import java.util.ArrayList;
import org.team4.model.items.DVD;
import org.team4.view.user.search.DVDTableModel;

public class DVDResultsPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    private static JTable table;

    public DVDResultsPanel() {
        setBounds(100, 100, 788, 520);
        setLayout(null);

        JLabel label = new JLabel("DVD Search Results");
        label.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        label.setBounds(324, 5, 200, 26);
        add(label);
    }

    public DVDResultsPanel(ArrayList<DVD> results) {
        setLayout(new BorderLayout());
        DVDTableModel model = new DVDTableModel(results);
        table = new JTable(model);
        add(new JScrollPane(table), BorderLayout.CENTER);
    }

    public static JTable getTable() {
        return table;
    }
}
