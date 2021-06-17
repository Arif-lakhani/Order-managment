package com.egen.model;

import com.egen.enums.PaymentMethod;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "amount_paid")
    private double amount;

    @Column(name = "payment_date")
    private Timestamp paymentDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "payment_mode")
    private PaymentMethod paymentMode;

    @OneToOne(cascade = {CascadeType.ALL})
    private Address billingAddress;

    @ManyToOne()
    @JoinColumn(name = "order_id")
    private Orders orders;

    public Payment() {
    }

    public Payment(double amount, Timestamp paymentDate, PaymentMethod paymentMode, Address billingAddress, Orders orders) {
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.paymentMode = paymentMode;
        this.billingAddress = billingAddress;
        this.orders = orders;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Timestamp getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Timestamp paymentDate) {
        this.paymentDate = paymentDate;
    }

    public PaymentMethod getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMethod paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

//    public Orders getOrders() {
//        return orders;
//    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", amount=" + amount +
                ", paymentDate=" + paymentDate +
                ", paymentMode=" + paymentMode +
                ", billingAddress=" + billingAddress +
                ", orders=" + orders +
                '}';
    }
}
