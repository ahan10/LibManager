package org.team4.model.paymentmodes;

import java.time.LocalDate;
import java.time.YearMonth;

public class CreditCard implements PaymentValidator, PaymentModes {
    String ccNumber;
    YearMonth ym;
    LocalDate expiry;
    LocalDate today;

    public CreditCard(String ccNumber, int year, int month){
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
        return MODE.get(0);
    }

    @Override
    public boolean isValid() {
        return this.notExpired() && this.correctLength();
    }
}
