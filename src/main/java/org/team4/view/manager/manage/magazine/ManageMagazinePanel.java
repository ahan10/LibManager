package org.team4.view.manager.manage.magazine;

import org.team4.maintaindb.MaintainDVD;
import org.team4.maintaindb.MaintainDatabase;
import org.team4.maintaindb.MaintainMagazine;
import org.team4.model.items.Item;
import org.team4.model.items.Magazine;
import org.team4.view.manager.manage.dvd.DVDViewTableModel;

import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.util.ArrayList;


public class ManageMagazinePanel extends JPanel {

    private static final long serialVersionUID = 1L;
    private MagazineViewTableModel magazineViewTableModel;
    private ArrayList<Item> allMagazine = new ArrayList<>();
    private JPanel panel;
    private JButton updateButton;
    private MaintainMagazine maintainMagazine = MaintainDatabase.getInstance().getMagazineDatabase();

    /**
     * Create the panel.
     */
    public ManageMagazinePanel() {
        this.allMagazine = maintainMagazine.getAllMagazines();
        initComponents();
    }

    private void initComponents() {
        setBounds(100, 100, 976, 627);
        setLayout(new BorderLayout());

        panel = new JPanel();
        panel.setLayout(null);

        add(panel, BorderLayout.CENTER);

        JLabel titleLabel = new JLabel("Manage Magazines");
        titleLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        titleLabel.setBounds(422, 23, 132, 22);
        panel.add(titleLabel);

        addScrollPane();
    }

    private void addScrollPane() {
        magazineViewTableModel = new MagazineViewTableModel(this.allMagazine);
        JTable dvdTable = new JTable(magazineViewTableModel);

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

    public void updateSelectedMagazine() {
        int rowCount = magazineViewTableModel.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            Boolean rentableStatus = (Boolean) magazineViewTableModel.getValueAt(i, 3);
            Item book = allMagazine.get(i);
            book.setRentable(rentableStatus);
        }

        // Now, update the CSV with changed fields
        try {
            maintainMagazine.update();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
