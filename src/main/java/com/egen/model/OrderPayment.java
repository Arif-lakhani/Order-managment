package com.egen.model;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.List;

@Entity
public class OrderPayment {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String payment_confirmation_number;
    private ZonedDateTime paymentDate;
    @OneToOne
    @JoinColumn(name = "payment_method_code")
    private PaymentMethod payment;

    public String getPayment_confirmation_number() {
        return payment_confirmation_number;
    }

    public void setPayment_confirmation_number(String payment_confirmation_number) {
        this.payment_confirmation_number = payment_confirmation_number;
    }

    public ZonedDateTime getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(ZonedDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }

    public PaymentMethod getPayment() {
        return payment;
    }

    public void setPayment(PaymentMethod payment) {
        this.payment = payment;
    }
}
