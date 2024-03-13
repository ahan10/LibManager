package org.team4.model.paymentmodes;

import org.team4.utils.EmailValidator;

public class PayPal implements PaymentValidator, PaymentModes {

    String email;

    public PayPal(String email) {
        this.email = email;
        System.out.println("Email in paypal: ");
        System.out.println(this.email);
    }

    public boolean isValid(){
        return EmailValidator.validEmail(this.email);
    }

    @Override
    public String getMode() {
        return MODE.get(2);
    }

    @Override
    public String toString() {
        return "PayPal{" +
                "email='" + email + '\'' +
                '}';
    }
}
