package com.egen.model;

import javax.persistence.Id;
import java.time.ZonedDateTime;

public class Payment {
    @Id
    private String id;
    private Double confirmation_number;
    private Double order_payment_amount;
    private String order_payment_method;
    private ZonedDateTime order_payment_date;

    public Payment(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getConfirmation_number() {
        return confirmation_number;
    }

    public void setConfirmation_number(Double confirmation_number) {
        this.confirmation_number = confirmation_number;
    }

    public Double getOrder_payment_amount() {
        return order_payment_amount;
    }

    public void setOrder_payment_amount(Double order_payment_amount) {
        this.order_payment_amount = order_payment_amount;
    }

    public String getOrder_payment_method() {
        return order_payment_method;
    }

    public void setOrder_payment_method(String order_payment_method) {
        this.order_payment_method = order_payment_method;
    }

    public ZonedDateTime getOrder_payment_date() {
        return order_payment_date;
    }

    public void setOrder_payment_date(ZonedDateTime order_payment_date) {
        this.order_payment_date = order_payment_date;
    }
}
