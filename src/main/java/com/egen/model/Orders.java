package com.egen.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
public class Orders {

    @Id
    @Column(name = "order_id",nullable = false)
    private  String orderId;
    private String id;
    private Timestamp dateOrdered;
    private Timestamp shipDate;

    @ManyToOne(cascade= {CascadeType.ALL})
    @JoinColumn(name="order_id",insertable = false,updatable = false)
    private Customer customer;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name="order_id")
    private Shipment shipment;


    public Orders() { this.orderId = UUID.randomUUID().toString();}

    public Orders(String id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Shipment getShipmentId() {
        return shipment;
    }

    public void setShipmentId(Shipment shipmentId) {
        this.shipment = shipmentId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Timestamp getDateOrdered() {
        return dateOrdered;
    }

    public void setDateOrdered(Timestamp dateOrdered) {
        this.dateOrdered = dateOrdered;
    }

    public Timestamp getShipDate() {
        return shipDate;
    }

    public void setShipDate(Timestamp shipDate) {
        this.shipDate = shipDate;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderId='" + orderId + '\'' +
                ", id='" + id + '\'' +
                ", dateOrdered=" + dateOrdered +
                ", shipDate=" + shipDate +
                ", customer=" + customer +
                ", shipmentId=" + shipment +
                '}';
    }
}
