package org.team4.maintaindb;

import java.io.FileWriter;
import java.util.ArrayList;

import org.team4.model.items.Newsletter;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class MaintainNewsletter {
    private static MaintainNewsletter instance;

    private ArrayList<Newsletter> newsletters;

    private static final String FILE_PATH = "database/newsletter.csv";

    private MaintainNewsletter() {
        newsletters = new ArrayList<>();
        try {
            load();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to Initialize Newsletter Database");
        }
    }

    public static MaintainNewsletter getInstance() {
        if (instance == null) {
            synchronized (MaintainNewsletter.class) {
                if (instance == null) {
                    instance = new MaintainNewsletter();
                }
            }
        }
        return instance;
    }

    public void load() throws Exception {
        CsvReader reader = new CsvReader(FILE_PATH);
        reader.readHeaders();

        while (reader.readRecord()) {
            String title = reader.get("title");
            String link = reader.get("link");
            double price = Double.parseDouble(reader.get("price"));

            Newsletter newsletter = new Newsletter(title, link, price);
            newsletters.add(newsletter);
        }
        reader.close();
    }

    public void update() throws Exception {
        try {
            CsvWriter csvOutput = new CsvWriter(new FileWriter(FILE_PATH, false), ',');

            csvOutput.write("title");
            csvOutput.write("link");
            csvOutput.write("price");
            csvOutput.endRecord();


            for (Newsletter newsletter : newsletters) {
                csvOutput.write(newsletter.getTitle());
                csvOutput.write(newsletter.getLink());
                csvOutput.write(String.valueOf(newsletter.getPrice()));
                csvOutput.endRecord();
            }
            csvOutput.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Newsletter> getAllNewsletters() {
        return newsletters;
    }

    public void addNewsletter(Newsletter newsletter) {

        for (Newsletter n : newsletters) {
            if (n.getTitle().equalsIgnoreCase(newsletter.getTitle())) {
                System.out.println("Newsletter already exists: " + newsletter.getTitle());
                return;
            }
        }


        newsletters.add(newsletter);
        System.out.println("New newsletter added: " + newsletter.getTitle());


        try {
            update();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to update the newsletter database.");
        }
    }

    public ArrayList<Newsletter> searchNewsletters(String query) {
        ArrayList<Newsletter> searchedNewsletters = new ArrayList<>();

        for (Newsletter newsletter : newsletters) {
            if (newsletter.getTitle().toLowerCase().contains(query.toLowerCase())) {
                searchedNewsletters.add(newsletter);
            }
        }

        return searchedNewsletters;
    }
    public Newsletter searchNewslettersbyTitle(String query) {
        Newsletter searchedNewsletter = null;

        for (Newsletter newsletter : newsletters) {
            if (newsletter.getTitle().toLowerCase().equals(query.toLowerCase())) {
                searchedNewsletter = newsletter;
            }
        }

        return searchedNewsletter;
    }
}
