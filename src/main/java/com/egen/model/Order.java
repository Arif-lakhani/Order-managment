package com.egen.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="orders")
@NamedQueries({
        @NamedQuery(name="Order.getAllOrders", query = "SELECT order FROM Order order"),
        @NamedQuery(name="Order.getOrdersWithinInterval", query="SELECT order FROM Order order where order.dateCreated>:start and order.dateCreated<:end"),
        @NamedQuery(name="Order.getTop10OrdersWithHighestDollarAmountInZip", query="SELECT order FROM Order order where order.customer.billingZip=:zipCode order by order.payment.total DESC")
})
public class Order {
    public enum Stats {
        ORDERED,
        TRANSIT,
        DELIVERED
    }
    @Id
    @Column(columnDefinition = "VARCHAR(36)")
    private String orderID;

    @Enumerated(EnumType.STRING)
    private Stats orderStatus;

    private java.sql.Date dateCreated;
    private java.sql.Date dateModified;
    private String shippingMethod;

    @OneToMany
    private List<OrderItem> orderItem;


    @OneToOne
    private Payment payment;

    @OneToOne
    private Shipping shipping;


    @OneToOne
    private Customer customer;




    public Order(){

    }

    public Order(String id){
        this.orderID = id;
    }
    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public Stats getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Stats orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(java.sql.Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(java.sql.Date dateModified) {
        this.dateModified = dateModified;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }


    public Shipping getShipping() {
        return shipping;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    public List<OrderItem> getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(List<OrderItem> orderItem) {
        this.orderItem = orderItem;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
