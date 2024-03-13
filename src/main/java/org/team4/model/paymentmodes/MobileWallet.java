package org.team4.model.paymentmodes;

public class MobileWallet implements PaymentValidator, PaymentModes {
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
