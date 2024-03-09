package org.team4.funtionality.buy.modes;

import org.team4.funtionality.buy.Modes;
import org.team4.funtionality.buy.Payment;

public class MobileWallet implements Modes, Payment {
    String phoneNumber;

    public MobileWallet(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isValid(){
        return (this.phoneNumber.length() == 10);
    }

    @Override
    public String getMode() {
        return MODE.get(3);
    }

}
