package com.egen.model;

import com.egen.model.enums.PaymentMethod;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.UUID;

@Entity
@Table(name = "Payment")
public class Payment {

    @Id
    @Column(name = "payment_id", columnDefinition = "VARCHAR(36)")
    private String order_payment_id;

//    @Column(name = "order_id")
//    private String order_id;

    @Column(name = "payment_method")
    @Enumerated(EnumType.STRING)
    private PaymentMethod order_payment_method;

    @Column(name = "payment_date")
    private ZonedDateTime order_payment_date;

    @Column(name = "payment_confirmation_number")
    private String order_payment_confirmation_number;

    @OneToOne
    private Billing order_billing_address;

    public Payment(){
        this.order_payment_id = UUID.randomUUID().toString();
    }

    public Payment(String order_payment_id, PaymentMethod order_payment_method, ZonedDateTime order_payment_date, String order_payment_confirmation_number, Billing order_billing_address) {
        this.order_payment_id = UUID.randomUUID().toString();
        this.order_payment_method = order_payment_method;
        this.order_payment_date = order_payment_date;
        this.order_payment_confirmation_number = order_payment_confirmation_number;
        this.order_billing_address = order_billing_address;
    }

    public String getOrder_payment_id() {
        return order_payment_id;
    }

    public void setOrder_payment_id(String order_payment_id) {
        this.order_payment_id = order_payment_id;
    }


    public PaymentMethod getOrder_payment_method() {
        return order_payment_method;
    }

    public void setOrder_payment_method(PaymentMethod order_payment_method) {
        this.order_payment_method = order_payment_method;
    }

    public ZonedDateTime getOrder_payment_date() {
        return order_payment_date;
    }

    public void setOrder_payment_date(ZonedDateTime order_payment_date) {
        this.order_payment_date = order_payment_date;
    }

    public String getOrder_payment_confirmation_number() {
        return order_payment_confirmation_number;
    }

    public void setOrder_payment_confirmation_number(String order_payment_confirmation_number) {
        this.order_payment_confirmation_number = order_payment_confirmation_number;
    }

    public Billing getOrder_billing_address() {
        return order_billing_address;
    }

    public void setOrder_billing_address(Billing order_billing_address) {
        this.order_billing_address = order_billing_address;
    }
}
