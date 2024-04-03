package org.team4.model.paymentmodes;

import org.team4.utils.EmailValidator;

public class PayPal implements PaymentValidator, PaymentModes {

    String email;

    public PayPal(String email) {
        this.email = email;
    }

    public boolean isValid(){
        return EmailValidator.validEmail(this.email);
    }

    @Override
    public String getMode() {
        return MODE.get(3);
    }

    @Override
    public String toString() {
        return "PayPal{" +
                "email='" + email + '\'' +
                '}';
    }
}
