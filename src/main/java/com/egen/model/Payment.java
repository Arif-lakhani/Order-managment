package com.egen.model;

public class Payment {
    private String paymentId;
    private String paymentMethod;
    private String confirmation_number;
    private Address billingAddress;
    public String getPaymentId() {
        return paymentId;
    }
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
    public String getPaymentMethod() {
        return paymentMethod;
    }
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getConfirmation_number() {
        return confirmation_number;
    }
    public void setConfirmation_number(String confirmation_number) {
        this.confirmation_number = confirmation_number;
    }
    public Address getBillingAddress() {
        return billingAddress;
    }
    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }
}
