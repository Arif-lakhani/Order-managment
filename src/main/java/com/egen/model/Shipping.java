package com.egen.model;

import com.egen.model.enums.ShippingType;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Shipping {
    @Id
    private String shipping_id;

    private String order_shipping_addressline1;
    private String order_shipping_addressline2;
    private String order_shipping_city;
    private String order_shipping_state;
    private int order_shipping_zip;


    @Column(name="order_shipping_type")
    @Enumerated(EnumType.STRING)
    private ShippingType shippingType;

    public Shipping() {
        this.shipping_id = UUID.randomUUID().toString();
    }

    public String getShipping_id() {
        return shipping_id;
    }

    public void setShipping_id(String shipping_id) {
        this.shipping_id = shipping_id;
    }

    public String getOrder_shipping_addressline1() {
        return order_shipping_addressline1;
    }

    public void setOrder_shipping_addressline1(String order_shipping_addressline1) {
        this.order_shipping_addressline1 = order_shipping_addressline1;
    }

    public String getOrder_shipping_addressline2() {
        return order_shipping_addressline2;
    }

    public void setOrder_shipping_addressline2(String order_shipping_addressline2) {
        this.order_shipping_addressline2 = order_shipping_addressline2;
    }

    public String getOrder_shipping_city() {
        return order_shipping_city;
    }

    public void setOrder_shipping_city(String order_shipping_city) {
        this.order_shipping_city = order_shipping_city;
    }

    public String getOrder_shipping_state() {
        return order_shipping_state;
    }

    public void setOrder_shipping_state(String order_shipping_state) {
        this.order_shipping_state = order_shipping_state;
    }

    public int getOrder_shipping_zip() {
        return order_shipping_zip;
    }

    public void setOrder_shipping_zip(int order_shipping_zip) {
        this.order_shipping_zip = order_shipping_zip;
    }

    public ShippingType getShippingType() {
        return shippingType;
    }

    public void setShippingType(ShippingType shippingType) {
        this.shippingType = shippingType;
    }
}
