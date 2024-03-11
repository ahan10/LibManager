package org.team4.view.user;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Font;
import java.util.ArrayList;
import org.team4.model.items.Newsletter;
import org.team4.view.user.search.NewsletterTableModel;

public class NewsletterResultsPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    private static JTable table;

    public NewsletterResultsPanel() {
        setBounds(100, 100, 788, 520);
        setLayout(null);

        JLabel label = new JLabel("Newsletter Search Results");
        label.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        label.setBounds(324, 5, 250, 26);
        add(label);
    }

    public NewsletterResultsPanel(ArrayList<Newsletter> results) {
        setLayout(new BorderLayout());
        NewsletterTableModel model = new NewsletterTableModel(results);
        table = new JTable(model);
        add(new JScrollPane(table), BorderLayout.CENTER);
    }

    public static JTable getTable() {
        return table;
    }
}
