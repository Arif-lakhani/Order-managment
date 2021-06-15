package com.egen.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
public class Order {

    @Id
    @Column(columnDefinition = "VARCHAR(36)")
    private  String id;


    private Date creadtedDate = new Date();
    private Date modifiedDate = new Date();

    @ManyToOne
    private Address shippingAddress;

    @ManyToOne
    private Address billingAddress;

    @ManyToOne
    private Customer customer;

    @OneToMany
    private List<Payment> payment;

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Payment> getPayment() {
        return payment;
    }

    public void setPayment(List<Payment> payment) {
        this.payment = payment;
    }

    enum Status{
        COMPLETED, PENDING, SHIPPED, CANCELED
    }

    private Status status;

    private int subTotal;

    private int tax;

    private int shipping_Charges;

    private int total;


    public Order() {
        this.id = UUID.randomUUID().toString();
    }

    public Order(String id){
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreadtedDate() {
        return creadtedDate;
    }

    public void setCreadtedDate(Date creadtedDate) {
        this.creadtedDate = creadtedDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public int getShipping_Charges() {
        return shipping_Charges;
    }

    public void setShipping_Charges(int shipping_Charges) {
        this.shipping_Charges = shipping_Charges;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
