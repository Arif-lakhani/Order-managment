package com.egen.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Shipping {
    @Id
    @Column(columnDefinition="VARCHAR(36)")
    private String id;
    private String address1;
    private String address2;
    private String city;
    private String shippingState;
    private String shippingZip;

    public Shipping(){
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String shippingId) {
        this.id = shippingId;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String shippingAddress1) {
        this.address1 = shippingAddress1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String shippingAddress2) {
        this.address2 = shippingAddress2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String shippingCity) {
        this.city = shippingCity;
    }

    public String getShippingState() {
        return shippingState;
    }

    public void setShippingState(String shippingState) {
        this.shippingState = shippingState;
    }

    public String getShippingZip() {
        return shippingZip;
    }

    public void setShippingZip(String shippingZip) {
        this.shippingZip = shippingZip;
    }

}

