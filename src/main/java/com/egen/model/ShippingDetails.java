package com.egen.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "shipping_details")
public class ShippingDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shipping_details_id")
    private String shippingDetailsId;
    @Column(name = "shipping_method")
    private String shippingMethod;
    @Column(name = "address_line_1")
    private String addressLine1;
    @Column(name = "address_line_2")
    private String addressLine2;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "zipcode")
    private String zipcode;

    public ShippingDetails(){
        this.shippingDetailsId = UUID.randomUUID().toString();
    }

    public ShippingDetails(String shippingDetailsId, String shippingMethod, String addressLine1,
                           String addressLine2, String city, String state, String zipcode) {
        this.shippingDetailsId = shippingDetailsId;
        this.shippingMethod = shippingMethod;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getShippingDetailsId() {
        return shippingDetailsId;
    }

    public void setShippingDetailsId(String shippingDetailsId) {
        this.shippingDetailsId = shippingDetailsId;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
