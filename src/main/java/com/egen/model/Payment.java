package com.egen.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
public class Payment {

    @Id
    @Column(name = "payment_id")
    private String paymentConfirmationId;
    private double amount;
    private Timestamp paymentDate;
    private String billingAddressLine1;
    private String billingAddrressLine2;
    private String city;
    private String state;
    private String country;
    private String zipCode;

    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="customer_id")
    private Customer customer;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="order_id")
    private Order order;

    public Payment() {
        this.paymentConfirmationId = UUID.randomUUID().toString();
    }

    public String getPaymentConfirmationId() {
        return paymentConfirmationId;
    }

    public void setPaymentConfirmationId(String paymentConfirmationId) {
        this.paymentConfirmationId = paymentConfirmationId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Timestamp getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Timestamp paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getBillingAddressLine1() {
        return billingAddressLine1;
    }

    public void setBillingAddressLine1(String billingAddressLine1) {
        this.billingAddressLine1 = billingAddressLine1;
    }

    public String getBillingAddrressLine2() {
        return billingAddrressLine2;
    }

    public void setBillingAddrressLine2(String billingAddrressLine2) {
        this.billingAddrressLine2 = billingAddrressLine2;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentConfirmationId='" + paymentConfirmationId + '\'' +
                ", amount=" + amount +
                ", paymentDate=" + paymentDate +
                ", billingAddressLine1='" + billingAddressLine1 + '\'' +
                ", billingAddrressLine2='" + billingAddrressLine2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", customer=" + customer +
                ", order=" + order +
                '}';
    }
}
