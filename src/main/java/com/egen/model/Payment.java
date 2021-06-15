package com.egen.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;
import java.util.UUID;

@Entity
public class Payment {

    @Id
    private String id;

    private Date creadtedDate = new Date();

    private int amount;

    private Method paymentMethod;

    @ManyToOne
    private Order order;

    enum Method {
        CASH, CREDIT_CARD, DEBIT_CARD, DIGITAL
    }

    public Payment() {
        this.id = UUID.randomUUID().toString();
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Method getMethod() {
        return paymentMethod;
    }

    public void setMethod(Method paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
