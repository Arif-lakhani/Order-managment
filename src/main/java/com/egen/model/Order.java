package com.egen.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
public class Order {

    @Id
    @Column(name = "order_id",columnDefinition = "VARCHAR(36)")
    private  String orderId;
    private Timestamp dateOrdered;
    private Timestamp shipDate;


    public Order(String id) {
        this.orderId = UUID.randomUUID().toString();
    }

    public Order() {
    }

    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="customer_id")
    private Customer customer;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="shipment_id")
    private ShipmentType shipmentType;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "payment_id")
    private List<Payment> payment;

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

    public ShipmentType getShipmentType() {
        return shipmentType;
    }

    public List<Payment> getPayment() {
        return payment;
    }

    public void setPayment(List<Payment> payment) {
        this.payment = payment;
    }

    public void setShipmentType(ShipmentType shipmentType) {
        this.shipmentType = shipmentType;
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
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", dateOrdered=" + dateOrdered +
                ", shipDate=" + shipDate +
                ", customer=" + customer +
                ", shipmentType=" + shipmentType +
                ", payment=" + payment +
                '}';
    }
}
