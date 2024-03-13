package org.team4.funtionality.buy;

import org.team4.model.paymentmodes.PaymentValidator;

public class ProcessPayment {
    private PaymentValidator modes;
    private ItemToPurchase itemToPurchase;

    public ProcessPayment(PaymentValidator modes, ItemToPurchase itemToPurchase) {
        this.modes = modes;
        this.itemToPurchase = itemToPurchase;
    }

    public PurchaseComplete getPurchaseCompleted(){
        if(modes.isValid()){
            return new PurchaseComplete(itemToPurchase, modes);
        }else{
            return null;
        }
    }

    @Override
    public String toString() {
        return "ProcessPayment{" +
                "modes=" + modes +
                ", itemToPurchase=" + itemToPurchase +
                '}';
    }
}
