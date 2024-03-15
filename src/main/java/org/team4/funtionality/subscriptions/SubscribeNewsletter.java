package org.team4.funtionality.subscriptions;

import java.util.Calendar;
import java.util.Date;

public class SubscribeNewsletter {
    private String title;
    private String email;
    private Date dateSubscribed;
    private Date dateDue;

    public SubscribeNewsletter(String title, String email, Date dateSubscribed, Date dateDue) {
        this.title = title;
        this.email = email;
        this.dateSubscribed = dateSubscribed;
        this.dateDue = dateDue;
    }

    public SubscribeNewsletter(String title, String email) {
        this.title = title;
        this.email = email;
        this.dateSubscribed = new Date();
        this.dateDue = this.calculateDueDate();
    }

    private Date calculateDueDate(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());

        calendar.add(Calendar.MONTH, 1);

        return calendar.getTime();
    }

    public String getTitle() {
        return title;
    }

    public String getEmail() {
        return email;
    }

    public Date getDateSubscribed() {
        return dateSubscribed;
    }

    public Date getDateDue() {
        return dateDue;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateSubscribed(Date dateSubscribed) {
        this.dateSubscribed = dateSubscribed;
    }

    public void setDateDue(Date dateDue) {
        this.dateDue = dateDue;
    }

    @Override
    public String toString() {
        return "SubscribeNewsletter{" +
                "title='" + title + '\'' +
                ", email='" + email + '\'' +
                ", dateSubscribed=" + dateSubscribed +
                ", dateDue=" + dateDue +
                '}';
    }
}
