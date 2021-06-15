package com.egen.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Billing {

    @Id
    private String billing_id;

    private String order_billing_addressline1;
    private String order_billing_addressline2;
    private String order_billing_city;
    private String order_billing_state;
    private int order_billing_zip;

    public Billing(){
        this.billing_id = UUID.randomUUID().toString();
    }

    public String getBilling_id() {
        return billing_id;
    }

    public void setBilling_id(String billing_id) {
        this.billing_id = billing_id;
    }

    public String getOrder_billing_addressline1() {
        return order_billing_addressline1;
    }

    public void setOrder_billing_addressline1(String order_billing_addressline1) {
        this.order_billing_addressline1 = order_billing_addressline1;
    }

    public String getOrder_billing_addressline2() {
        return order_billing_addressline2;
    }

    public void setOrder_billing_addressline2(String order_billing_addressline2) {
        this.order_billing_addressline2 = order_billing_addressline2;
    }

    public String getOrder_billing_city() {
        return order_billing_city;
    }

    public void setOrder_billing_city(String order_billing_city) {
        this.order_billing_city = order_billing_city;
    }

    public String getOrder_billing_state() {
        return order_billing_state;
    }

    public void setOrder_billing_state(String order_billing_state) {
        this.order_billing_state = order_billing_state;
    }

    public int getOrder_billing_zip() {
        return order_billing_zip;
    }

    public void setOrder_billing_zip(int order_billing_zip) {
        this.order_billing_zip = order_billing_zip;
    }
}
