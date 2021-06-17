package com.egen.model;

import com.egen.model.enums.ShipmentType;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "Shipping")
public class Shipping {

    @Id
    @Column(columnDefinition = "VARCHAR(36)")
    private String order_shipping_id;

    //private String order_id;

    @Enumerated(EnumType.STRING)
    private ShipmentType order_shipment_type;

    private String order_status;

    private String order_shipping_addressline1;

    private String order_shipping_addressline2;

    private String order_shipping_city;

    private String order_shipping_state;

    private String order_shipping_zip;

    public Shipping(){
        this.order_shipping_id = UUID.randomUUID().toString();
    }

    public Shipping(String order_shipping_id, ShipmentType order_shipment_type, String order_status, String order_shipping_addressline1, String order_shipping_addressline2, String order_shipping_city, String order_shipping_state, String order_shipping_zip) {
        this.order_shipping_id = UUID.randomUUID().toString();
        this.order_shipment_type = order_shipment_type;
        this.order_status = order_status;
        this.order_shipping_addressline1 = order_shipping_addressline1;
        this.order_shipping_addressline2 = order_shipping_addressline2;
        this.order_shipping_city = order_shipping_city;
        this.order_shipping_state = order_shipping_state;
        this.order_shipping_zip = order_shipping_zip;
    }

    public String getOrder_shipping_id() {
        return order_shipping_id;
    }

    public void setOrder_shipping_id(String order_shipping_id) {
        this.order_shipping_id = order_shipping_id;
    }

    public ShipmentType getOrder_shipment_type() {
        return order_shipment_type;
    }

    public void setOrder_shipment_type(ShipmentType order_shipment_type) {
        this.order_shipment_type = order_shipment_type;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
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

    public String getOrder_shipping_zip() {
        return order_shipping_zip;
    }

    public void setOrder_shipping_zip(String order_shipping_zip) {
        this.order_shipping_zip = order_shipping_zip;
    }
}
