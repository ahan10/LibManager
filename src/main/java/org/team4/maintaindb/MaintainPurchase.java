package org.team4.maintaindb;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import org.team4.functionality.buy.ItemPurchased;

import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class MaintainPurchase {

    private static MaintainPurchase instance;
    public ArrayList<ItemPurchased> items;
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    private static final String FILE_PATH = "database/purchase.csv";

    private MaintainPurchase(){
        this.items = new ArrayList<ItemPurchased>();
        try {
            //LOAD ONLY ONCE WHEN DATABASE CREATED
            this.load();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to Initialize Book Database");
        }
    }

    public static MaintainPurchase getInstance() {
        if (instance == null) {
            // Extra check for Multi-threaded applications
            synchronized (MaintainPurchase.class) {
                if (instance == null) {
                    instance = new MaintainPurchase();
                }
            }
        }
        return instance;
    }

    public void load() throws Exception{
        CsvReader reader = new CsvReader(FILE_PATH);
        reader.readHeaders();

        while (reader.readRecord()) {
            String email = reader.get("email");
            String title = reader.get("title");
            String dateString = reader.get("date");

            Date date = formatter.parse(dateString);
            ItemPurchased newItem = new ItemPurchased(title, email, date);

            items.add(newItem);
        }
    }

    public void update() throws Exception{
        try {
            CsvWriter csvOutput = new CsvWriter(new FileWriter(FILE_PATH, false), ',');
            //email,title,date

            //set header
            csvOutput.write("email");
            csvOutput.write("title");
            csvOutput.write("date");

            csvOutput.endRecord();

            // write out records
            for(ItemPurchased p: items){
                csvOutput.write(p.getEmail());
                csvOutput.write(p.getTitle());
                csvOutput.write(formatter.format(p.getDatePurchased()));
                csvOutput.endRecord();
            }
            csvOutput.close();

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void add(ItemPurchased itemPurchased){
        this.items.add(itemPurchased);
        try {
            update();
        } catch (Exception e) {
            System.out.println("Failed to update purchase db");
            throw new RuntimeException(e);
        }
    }

    public ArrayList<ItemPurchased> getAllItemsPurchased(){
        return this.items;
    }

}
