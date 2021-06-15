package com.egen.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PaymentMethod {
    @Id
    private String paymentid;
    private String mode_of_payment;

    public String getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(String paymentid) {
        this.paymentid = paymentid;
    }

    public String getMode_of_payment() {
        return mode_of_payment;
    }

    public void setMode_of_payment(String mode_of_payment) {
        this.mode_of_payment = mode_of_payment;
    }
}
