package org.team4.view.manager.manage.dvd;

import org.team4.maintaindb.MaintainDVD;
import org.team4.maintaindb.MaintainDatabase;
import org.team4.model.items.Item;

import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.util.ArrayList;

public class ManageDVDPanel extends JPanel {

    private static final long serialVersionUID = 1L;
    private DVDViewTableModel dvdViewTableModel;
    private ArrayList<Item> allDVD = new ArrayList<>();
    private JPanel panel;
    private JButton updateButton;
    private MaintainDVD maintainDVD = MaintainDatabase.getInstance().getDVDDatabase();

    /**
     * Create the panel.
     */
    public ManageDVDPanel() {
        this.allDVD = maintainDVD.getAllDVDs();
        initComponents();
    }

    private void initComponents() {
        setBounds(100, 100, 976, 627);
        setLayout(new BorderLayout());

        panel = new JPanel();
        panel.setLayout(null);

        add(panel, BorderLayout.CENTER);

        JLabel titleLabel = new JLabel("Manage DVD's");
        titleLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        titleLabel.setBounds(422, 23, 132, 22);
        panel.add(titleLabel);

        addScrollPane();
    }

    private void addScrollPane() {
        dvdViewTableModel = new DVDViewTableModel(this.allDVD);
        JTable dvdTable = new JTable(dvdViewTableModel);

        TableColumn rentColumn = dvdTable.getColumnModel().getColumn(3);
        JComboBox<Boolean> comboBox = new JComboBox<>(new Boolean[]{true, false});
        rentColumn.setCellEditor(new DefaultCellEditor(comboBox));

        JScrollPane scrollPane = new JScrollPane(dvdTable);
        scrollPane.setBounds(30, 58, 917, 527);
        panel.add(scrollPane);

        updateButton = new JButton("Update");
        updateButton.setBounds(823, 592, 117, 29);
        panel.add(updateButton);
    }

    public JButton getUpdateButton() {
        return this.updateButton;
    }

    public void updateSelectedDVD() {
        int rowCount = dvdViewTableModel.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            Boolean rentableStatus = (Boolean) dvdViewTableModel.getValueAt(i, 3);
            Item book = allDVD.get(i);
            book.setRentable(rentableStatus);
        }

        // Now, update the CSV with changed fields
        try {
            maintainDVD.update();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
