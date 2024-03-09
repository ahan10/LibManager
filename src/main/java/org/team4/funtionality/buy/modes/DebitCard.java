package org.team4.funtionality.buy.modes;

import org.team4.funtionality.buy.Modes;
import org.team4.funtionality.buy.Payment;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Date;

public class DebitCard implements Modes, Payment {
    String ccNumber;
    YearMonth ym;
    LocalDate expiry;
    LocalDate today;

    public DebitCard(String ccNumber, int year, int month){
        this.ccNumber = ccNumber;

        this.ym = YearMonth.of(year, month);
        this.expiry = ym.atDay(1);

        this.today = LocalDate.now();
        System.out.println(this.expiry);
    }

    public boolean notExpired(){
        return this.expiry.isAfter(this.today);
    }

    public boolean correctLength(){
        return (this.ccNumber.length() == 16);
    }

    public String getMode(){
        return MODE.get(1);
    }

    @Override
    public boolean isValid() {
        return this.notExpired() && this.correctLength();
    }
}