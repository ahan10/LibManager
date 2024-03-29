package org.team4.maintaindb;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import org.team4.functionality.subscriptions.SubscribeNewsletter;

import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class MaintainSubscriptions {

    private static MaintainSubscriptions instance;
    public ArrayList<SubscribeNewsletter> newsletters;
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    private static final String FILE_PATH = "database/subscribed.csv";

    private MaintainSubscriptions(){
        this.newsletters = new ArrayList<>();
        try {
            //LOAD ONLY ONCE WHEN DATABASE CREATED
            this.load();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to Initialize Book Database");
        }
    }

    public static MaintainSubscriptions getInstance() {
        if (instance == null) {
            // Extra check for Multi-threaded applications
            synchronized (MaintainSubscriptions.class) {
                if (instance == null) {
                    instance = new MaintainSubscriptions();
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
            String subscribedDateString = reader.get("subscribedOn");
            String dueDateString = reader.get("dueDate");

            Date dateSubscribe = formatter.parse(subscribedDateString);
            Date dueDate = formatter.parse(dueDateString);

            SubscribeNewsletter subscribeNewsletter = new SubscribeNewsletter(title, email, dateSubscribe, dueDate);

            if(dueDate.after(new Date())){
                newsletters.add(subscribeNewsletter);
            }
        }
    }

    public void update() throws Exception{
        try {
            CsvWriter csvOutput = new CsvWriter(new FileWriter(FILE_PATH, false), ',');
            //email,title,date subscribe, date due

            //set header
            csvOutput.write("email");
            csvOutput.write("title");
            csvOutput.write("subscribedOn");
            csvOutput.write("dueDate");

            csvOutput.endRecord();

            // write out records
            for(SubscribeNewsletter s: newsletters){
                csvOutput.write(s.getEmail());
                csvOutput.write(s.getTitle());
                csvOutput.write(formatter.format(s.getDateSubscribed()));
                csvOutput.write(formatter.format(s.getDateDue()));
                csvOutput.endRecord();
            }
            csvOutput.close();

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void add(SubscribeNewsletter subscribeNewsletter){
        this.newsletters.add(subscribeNewsletter);
        try {
            update();
        } catch (Exception e) {
            System.out.println("Failed to update purchase db");
            throw new RuntimeException(e);
        }
    }

    public ArrayList<String> getAllSubscribedNewslettersTitlesByEmail(String email){
        ArrayList<String> newsletterArrayList = new ArrayList<>();

        for(SubscribeNewsletter s: this.newsletters){
            if(s.getEmail().equals(email)){
                newsletterArrayList.add(s.getTitle());
            }
        }

        return newsletterArrayList;
    }

    public void removeNewsletter(SubscribeNewsletter newsletter){
        if (this.newsletters.contains(newsletter)){
            this.newsletters.remove(newsletter);
        }

        try {
            update();
        } catch (Exception e) {
            System.out.println("Couldn't remove the newsletter");
            throw new RuntimeException(e);
        }
    }

    public SubscribeNewsletter getSubscribedNewsletterIfExists(String email, String title){
        for (SubscribeNewsletter s: this.newsletters){
            if (s.getEmail().equals(email) && s.getTitle().equals(title)){
                return s;
            }
        }
        return null;
    }

}
